public class StudentGroup {
    private int groupID;

    public StudentGroup(int groupID) {
        this.groupID = groupID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "StudentGroup [groupID=" + groupID + "]";
    }
}
