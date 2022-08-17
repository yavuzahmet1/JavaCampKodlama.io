public class UserManager {
    public void add(User user){
        System.out.println(user.getId()+" numaralı kullanıcı eklenmiştir.");
    }
    public void addMultiple(User[] users){
        for (User user:users){
            add(user);
        }
    }
}
