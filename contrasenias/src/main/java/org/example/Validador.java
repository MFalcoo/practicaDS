package org.example;

import java.util.List;

public class Validador{

    private static final List<String> peoresPasswords = Utils.getStringList("peoresPasswords.txt");

    private Validador(){}

    public static boolean validarPasswordCorrecta(String password) {
        return  !esPasswordPorDefecto(password) &&
                !esPasswordDebil(password) &&
                passwordAplicaPoliticas(password);
    }

    private static boolean esPasswordPorDefecto(String password){
        //deberiamos recibir el tipo de usuario y chequear solo si es admin?
        //return tipoUsuario.equals("admin")? (password.equals("admin") | | password.equals("password")): false)
        return password.equals("admin") || password.equals("password");
    }

    private static boolean esPasswordDebil(String password){
        return peoresPasswords.contains(password);
    }

    private static boolean passwordAplicaPoliticas(String password){
        return password.length() >= 8;
    }
}
