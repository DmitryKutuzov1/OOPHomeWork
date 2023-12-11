import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        if (o1.getStream().size() > o2.getStream().size())
            return 1;
        if (o1.getStream().size() < o2.getStream().size())
            return -1;
        return 0;
    }
}