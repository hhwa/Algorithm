package basic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		String[] info = {"java backend junior pizza 150"
				,"python frontend senior chicken 210"
				,"python frontend senior chicken 150"
				,"cpp backend senior pizza 260"
				,"java backend junior chicken 80"
				,"python backend senior chicken 50"};
		
		List<String> infoList = Arrays.asList(info);
		
		List<String[]> infoListStream = 
	            infoList.stream().map(list -> list.split(" ")).collect(Collectors.toList());

		String[] name1 = {"Sehoon", "Songwoo", "Chan", "Youngsuk", "Dajung"};
		List<String> name2 = Arrays.asList(name1);
		
		Stream<String> stream1= Stream.of("Sehoon", "Songwoo", "Chan", "Youngsuk", "Dajung");
		Stream<String> stream2 = Stream.of(name1);
		Stream<String> stream3 = name2.stream();

		stream1.forEach(System.out::print); System.out.println();
		stream2.forEach(System.out::print); System.out.println();
        stream3.map(name -> name.toUpperCase())
    		.forEach(name -> System.out.println(name));
        
        System.out.println();
        
        name2.stream()
        .filter(name -> name.length() >= 5)
        .map(name -> name.toUpperCase())       
        .forEach(System.out::println);
		
        int[] number1 = {1,2,3,4,5};
        List<Integer> number2 = Arrays.asList(Arrays.stream(number1).boxed().toArray(Integer[]::new));
        Stream<Integer> stream4 = Stream.of(1,2,3,4,5);
        
        System.out.println();
        stream4.filter(i -> i>=3 && i % 2 == 0)
        //.filter(i -> i % 2 == 0)
        .forEach(System.out::print); System.out.println();

        int sum = number2.stream()
        		.filter(i -> i>=3)
        		.reduce(0, (a,b) -> a + b);
        
        int count = number2.stream()
        		.filter(i -> i>=3)
        		.reduce(0, (a,b) -> a + 1);
        
        System.out.println("count:"+count);
        
        System.out.println("sum:"+sum);
        
        int max = number2.stream()
        		.filter(i -> i>=3)
        		//.reduce(Integer.MIN_VALUE, (a,b)-> a > b ? a : b);
        		.reduce(Integer.MIN_VALUE, (a,b)-> a > b ? a : b);
        
        System.out.println("max:"+max);
        
        int min = number2.stream()
        		.filter(i -> i>=3)
        		.reduce(Integer.MAX_VALUE, (a,b)-> a < b ? a : b);
        
        System.out.println("min:"+min);
        
        int[] scores = {1,2,3,3,5};
        int[] array = IntStream.of(scores).distinct().toArray();
        
        IntStream intStream = IntStream.range(1, 5);
        Stream<Integer> istream = intStream.boxed();
        Integer[] result = istream.toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(result);
        
        IntStream intStream2 = IntStream.range(1, 5);
        Stream<Integer> istream2 = intStream2.boxed();
        List<Integer> list2 = istream2.collect(Collectors.toList());
        
        IntStream intStream3 = IntStream.of(scores);
        System.out.println(IntStream.range(1, 5).findFirst().getAsInt());
        
        System.out.println(number2.stream().findFirst().get());
        
        System.out.println(IntStream.of(scores).distinct().count());
        System.out.println();
        
        IntStream.of(scores).distinct().boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
		
	}

}
