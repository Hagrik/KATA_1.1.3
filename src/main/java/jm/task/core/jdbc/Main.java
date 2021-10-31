package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        User user = new User("Hren", "Izosimov", (byte) 33);
        User user1 = new User("Alsou", "Shayheeva", (byte) 30);
        User user2 = new User("Anton", "Izosimov", (byte) 30);
        User user3 = new User("Boostik", "Jopov", (byte) 7);

        userService.createUsersTable();

        userService.saveUser(user.getName(), user.getLastName(), user.getAge());
        System.out.println("Пользователь с именем: " + user.getName() + " добавлен в базу данных");
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("Пользователь с именем: " + user1.getName() + " добавлен в базу данных");
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("Пользователь с именем: " + user2.getName() + " добавлен в базу данных");
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("Пользователь с именем: " + user3.getName() + " добавлен в базу данных");

        List<User> users = userService.getAllUsers();
        users.forEach(System.out::println);
        userService.removeUserById(2);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
