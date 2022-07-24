import business.concretes.UserManager;
import core.GoogleService;
import core.JGoogleManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        UserManager userService = new UserManager((UserDao) new HibernateUserDao(), (GoogleService) new JGoogleManagerAdapter());
        User user = new User("Berk","Benkel","brkbnkl@gmail.com","354333");
        userService.add(user);
        userService.login(user);

    }
}
