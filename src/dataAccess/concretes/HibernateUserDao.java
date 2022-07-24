package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı eklendi: " + user.getFirsName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı Silindi: " + user.getLastName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı Güncellendi: " + user.getFirsName());
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
