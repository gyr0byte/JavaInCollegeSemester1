public class MyFriends {
    public static void main(String[] args) {
        String[] friends = { "Jharna", "Rebecca", "Praful", "Girish", "Pramesh"};
        System.out.println("My friends are:");
        friends[2] = "Babin";
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}