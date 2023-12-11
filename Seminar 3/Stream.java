import java.util.ArrayList;
import java.util.List;

public class Stream implements Comparable<Stream> {
    private int streamID;
    private List<StudentGroup> stream;

    public Stream(int streamID) {
        this.streamID = streamID;
        this.stream = new ArrayList<StudentGroup>();
    }

    public int getStreamID() {
        return streamID;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStreamId(int streamID) {
        this.streamID = streamID;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Stream [streamID=" + streamID +
                ", stream=" + stream + "]";
    }

    @Override
    public int compareTo(Stream s) {
        if (this.getStreamID() > s.getStreamID())
            return 1;
        if (this.getStreamID() < s.getStreamID())
            return -1;
        return 0;
    }

    public void addGroup(StudentGroup group) {
        this.stream.add(group);
    }
}
