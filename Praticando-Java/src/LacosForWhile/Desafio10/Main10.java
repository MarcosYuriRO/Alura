package LacosForWhile.Desafio10;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guestList = new ArrayList<>();

        String userResponse = "";
        boolean nameExists = false;

        while(!userResponse.equalsIgnoreCase("sair")){
            System.out.println("\nDigite o nome do convidado (ou 'ver' para visualizar a lista, " +
                    "'sair' para terminar): ");
            userResponse = scanner.nextLine();

            if (userResponse.equalsIgnoreCase("ver")){
                for (String guest : guestList){
                    System.out.println(guest);
                }
            } else if (!userResponse.equalsIgnoreCase("sair")) {
                for(String name : guestList){
                    if (name.equalsIgnoreCase(userResponse)){
                        System.out.println("O nome '" + userResponse + "' já esta na lista de convidados");
                        nameExists = true;
                    }
                }

                if (!nameExists){
                    guestList.add(userResponse);
                    System.out.println("O nome '" + userResponse + "' foi adicionado à lista de convidados.");
                }
            }
        }

    }
}
