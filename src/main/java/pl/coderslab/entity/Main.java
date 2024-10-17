package pl.coderslab.entity;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // Create user
        User user = new User();
        user.setUserName("garek");
        user.setEmail("garek@coderslab.pl");
        user.setPassword("Sapporo2022");
        userDao.create(user);

        // Read user
        User readUser = userDao.read(user.getId());
        System.out.println(readUser);
//
//        // Update user
//        user.setUserName("Arkadiusz");
//        user.setEmail("arek.update@coderslab.pl");
//        user.setPassword("newpassword");
//        userDao.update(user);
//
//        // Delete user
//        userDao.delete(user.getId());
//    }

    }
}

