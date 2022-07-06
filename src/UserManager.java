public class UserManager{

    public boolean login(User user, Admin admin) {

        if (user.getName().equals(admin.getUserName()) && user.getPassword().equals(admin.getPassword())){
            return true;
        }
        else {
            return false;
        }
    }

    public String save(User user){
        return user.getName() + " isimli user kaydedildi.";
    }
}
