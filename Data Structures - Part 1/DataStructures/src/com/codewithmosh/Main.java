package com.codewithmosh;

import java.util.*;


public class Main {
    public static void main(String[] args) {
//        Array2 numbers = new Array2(3);
//        numbers.insert(10);
//        numbers.insert(70);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        numbers.removeAt(0);
//        //numbers.removeAt(7);
//        numbers.print();
//        System.out.println(numbers.indexOf(70));
//        System.out.println((numbers.max()));

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.remove(0);
//        System.out.println(list.indexOf(20));
//        System.out.println(list);

//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(40);
//
//        System.out.println(list.contains(20));
//        System.out.println(list.indexOf(30));
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        Stack <Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack);
//        var top = stack.pop();
//        System.out.println(top);
//        System.out.println(stack);
//        top = stack.peek();
//        System.out.println(top);
//        System.out.println(stack);
//        String str = "((<] = <2>))[a]";
//        StringReverser2 reverser = new StringReverser2();
//        var result = reverser.reverse(str);
//        System.out.println(result);

//        String str = "()((2 + 3))<<>>{}()(";
//        BalanceExpression balance = new BalanceExpression(str);
//        var result = balance.isBalance();
//        System.out.println(result);
//        TwoStacks twoStacks = new TwoStacks(5);
//        twoStacks.push1(10);
//        twoStacks.push1(20);
//        twoStacks.push1(30);
//        twoStacks.push1(40);
//        twoStacks.push2(20);
//        twoStacks.pop1();
//        twoStacks.push2(30);
//
//        twoStacks.pop1();
//        System.out.println(twoStacks);
//
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        System.out.println(queue);
//        reverse(queue);
//        System.out.println(queue);
//    }
//
//    public static void reverse (Queue<Integer> queue){
//        Stack<Integer> stack = new Stack<>();
//
//        while (!queue.isEmpty())
//            stack.push(queue.remove());
//        while(!stack.isEmpty())
//            queue.add(stack.pop());


        // Key: Employee number (Integer)
        // Value: name (String)

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Hector");
//        map.put(2, "John");
//        map.put(3, "Mary");
//        map.put(3, "Marianne");
//        map.put(null, null);
//        map.remove(null);
//        var value = map.get(1);
//
//        System.out.println(value);
//        System.out.println(map);
//
//        for (var item : map.entrySet())
//            System.out.println(item);

//        var ch = findFirstNonRepeatingChar("a green apple");
//        System.out.println(ch);
//
//        Set<Integer> set = new HashSet<>();
//        int[] numbers = {1,2,3,4,3,4,5,3,2};
//
//        for (int number : numbers)
//            set.add(number);
//
//        System.out.println(set);

//        var ch = findFirstRepeatedCharacter("a green apple");
//        System.out.println(ch);

        String str = "orange";
        System.out.println(str.hashCode());

//        Map<String, String> map = new HashMap<>();
//        map.put("123456-A", "mosh");
//        System.out.println(hash("123456-A"));

        }
    public static int hash (String key){
        int hash = 0;
        for (var ch : key.toCharArray())
            hash += ch;
        return hash % 100;
    }

    public static char findFirstNonRepeatingChar(String sentence) {
        char [] sentenceArray = sentence.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char character : sentenceArray) {
            var count = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, count + 1);
        }

        for (var ch : sentenceArray) {
            if (map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }

    public static char findFirstRepeatedCharacter (String sentence){
        char [] sentenceArray = sentence.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char character : sentenceArray) {
            if (set.contains(character)){
                return character;
            }
            set.add(character);
        }
        return Character.MIN_VALUE;
    }
}