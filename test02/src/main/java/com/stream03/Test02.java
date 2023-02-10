package com.stream03;

import java.io.FileNotFoundException;

/**
 * @author wangdequan
 * @date 2023-02-03 09:46
 */
public class Test02 {
    public static void main(String[] args) throws FileNotFoundException {
//		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);
////		stream1.forEach(System.out::println);
//		Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 2).limit(6);
////		stream2.forEach(System.out::println);
//		Stream<Double> stream3 = Stream.generate(Math::random).limit(2);
//		stream3.forEach(System.out::println);
        //读取内容，转成流
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\stream_test.txt"));
//		Stream<String> lines = bufferedReader.lines();
//		lines.forEach(System.out::println);
        //将字符串分割成流
//		Pattern compile = Pattern.compile(",");
//		Stream<String> stringStream = compile.splitAsStream("a,b,c,d,e,f,g");
//		stringStream.forEach(System.out::println);

//		Stream<Integer> stream = Stream.of(6, 4, 6, 7, 3, 9, 8, 10, 12, 14, 14);
//		Stream<Integer> stream1 = stream.filter(s -> s > 5)//6, 6, 7, 9, 8, 10, 12, 14, 14
//				.distinct()
//				.skip(2)
//				.limit(2);
//		stream1.forEach(System.out::println);

//		List<String> list = Arrays.asList("a,b,c", "1,2,3");
//		Stream<String> stream = list.stream()
//				.map(m -> m.replaceAll(",", ""));
//		stream.forEach(System.out::println);

//		Stream<String> stringStream = list.stream().flatMap(f -> {
//			//将每个元素转换成一个stream
//			String[] split = f.split(",");
//			Stream<String> stream = Arrays.stream(split);
//			return stream;
//		});
//		stringStream.forEach(System.out::println);

//		List<String> list = Arrays.asList("aa", "ff", "dd");
//		list.stream().sorted().forEach(System.out::println);


    }

}
