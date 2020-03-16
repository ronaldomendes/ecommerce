package br.com.rd.ecommerce;

import br.com.rd.ecommerce.model.entity.User;

public class Teste {

    public static void main(String[] args) {
        User user = new User(1L, "Godofredo", "Silva", 28);
        user.getFirstName();
        System.out.println(user);
    }
}
