public interface UserControler<T extends User> {
    void create(String firstName, String secondName, String lastName);
    void sendOnConsole();
}