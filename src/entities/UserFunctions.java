package entities;

import java.util.ArrayList;
import java.util.List;

public class UserFunctions {
    private static List<User> list = new ArrayList<>();

    public UserFunctions() {
    }

    // criar usuarios
    public static void createUser(User user) {
        list.add(user);
        System.out.println();
        System.out.println("Lista dos usuários: \n");
        for (User lista : list) {
            System.out.println(lista);
            System.out.println();
        }
    }

    // procurar por um usuário específico
    public static User searchUser(String name) {
        for (User user : list) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> getAll() {
        return list;
    }

    // atualizar dados de um usuário
    public static void updateUser(String name, String name1, String email, String adress, Long number) {
        User user = searchUser(name);
        if (user != null) {
            user.setName(name1);
            user.setEmail(email);
            user.setAdress(adress);
            user.setNumber(number);
            System.out.println("Usuário atualizado: \n" + user);
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    // remover usuário
    public static void delUser(String name) {
        User user = searchUser(name);
        if (user != null) {
            list.remove(user);
            System.out.println("Usuário deletado: " + user);
        } else {
            System.out.println("Usuário não encontrardo!");
        }
    }

    // verificar informações de um usuário específico
    public static void verifyUser(String name) {
        User user = searchUser(name);
        if (user != null) {
            System.out.println("Informações do usuário:");
            System.out.println(user);
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

}