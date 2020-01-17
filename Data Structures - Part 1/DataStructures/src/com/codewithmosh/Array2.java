package com.codewithmosh;

public class Array2 {
    private int[] items;
    private int count;

            public Array2(int length){
                items = new int[length];
            }

            public void insert (int item) {
                reSizeIfRequired();

                items[count++]=item;

            }

            private void reSizeIfRequired (){
                if(items.length==count){
                    int[] newItems = new int [count * 2];

                    for(int i =0; i<count; i++){
                        newItems[i] = items[i];
                    }

                    items=newItems;

                }
            }

            public void print(){
                for(int i =0; i<count; i++){
                    System.out.println(items[i]);
                }
            }

            public void removeAt (int index){
                if (index<0 || index> count)
                    throw new IllegalArgumentException();

                for(int i=index;i<count;i++)
                    items[i]=items[i+1];

                count--;
            }

            public int indexOf(int item ){
                for(int i=0; i<count;i++) {
                    if (items[i] == item)
                        return i;
                }
                return -1;

            }

            public int max() {
                int value  = items[0];
                for (int i=1; i<count; i++) {
                    if (items[i] > value)
                        value = items[i];
                }

                return value;
            }

}
