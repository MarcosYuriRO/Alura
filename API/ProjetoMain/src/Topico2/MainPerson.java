package Topico2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainPerson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        Person person = new Person("Joao", 40, "Pingamonhandapio");
        String json = gson.toJson(person);
        Person a = gson.fromJson(json, Person.class);

        //Json:
        System.out.println(json);

        //Gson:
        System.out.println(person);
    }
}