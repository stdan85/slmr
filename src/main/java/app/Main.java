package app;


import com.google.gson.Gson;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;




public class Main {

    public static void main(String[] args) throws IOException {

        String str = "name=Ivan;surname=Petrov;age=18";

        Properties prop = new Properties();

        prop.load(new StringReader(str.replaceAll(";","\n")));

        System.out.println(new Gson().toJson(prop));

    }
}

