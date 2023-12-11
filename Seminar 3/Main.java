import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup(1);
        StudentGroup group2 = new StudentGroup(2);
        StudentGroup group3 = new StudentGroup(3);
        StudentGroup group4 = new StudentGroup(4);
        StudentGroup group5 = new StudentGroup(5);
        StudentGroup group6 = new StudentGroup(6);
        StudentGroup group7 = new StudentGroup(7);

        Stream stream1 = new Stream(1);
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream(2);
        stream2.addGroup(group3);
        stream2.addGroup(group4);
        stream2.addGroup(group5);
        stream2.addGroup(group6);

        Stream stream3 = new Stream(3);
        stream3.addGroup(group7);

        Stream stream4 = new Stream(4);
        stream4.addGroup(group1);
        stream4.addGroup(group2);
        stream4.addGroup(group3);

        List<Stream> streams = List.of(stream1, stream2, stream3, stream4);
        StreamService sorter = new StreamService();

        System.out.println("Список потоков");
        System.out.println(streams);

        List<Stream> streamsSorted;
        streamsSorted = sorter.sortStreams(streams);
        System.out.println("Отсортированный список потоков");
        System.out.println(streamsSorted);
    }
}