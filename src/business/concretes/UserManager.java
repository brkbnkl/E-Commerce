package business.concretes;

import business.abstracts.UserService;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.Scanner;

public class UserManager implements UserService {

    private UserDao userdao;
    private GoogleService googleService;

    public UserManager(UserDao userDao,GoogleService googleService) {
        super();
        this.userdao = userDao;
        this.googleService = googleService;
    }

    public void add(User user) {
        if (UserValidator.EmailValidator(user.geteMail()) && UserValidator.NameValidator(user.getFirsName(), user.getLastName()) && UserValidator.PasswordValidator(user.getPassword())) {
            System.out.println("Üye başarı ile kaydoldu: " + user.geteMail());
            System.out.println(user.geteMail() + " adresine doğrulama maili gönderildi");
        }
        else {
            System.out.println("Lütfen bilgileri doğru giriniz !!");
        }

        this.userdao.add(user);
        this.googleService.google("Kullanıcı google hesabı ile oturum açtı " + user.geteMail());

    }

    @Override
    public void login(User user) {
        System.out.println("Lütfen email ve parolanızı girin");
        System.out.println(user.geteMail() + " " + user.getPassword() + " ile sisteme girildi");
    }
}
