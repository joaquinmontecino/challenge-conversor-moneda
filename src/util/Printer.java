package util;

import models.Request;

import java.util.List;

public class Printer {
    public void printMainMenu(){
        System.out.println("=====================================================================================");
        System.out.println("\tBienvenido a mi Conversor de Moneda ☺\n");
        System.out.println("\t\t 1) Convertir monedas");
        System.out.println("\t\t 2) Revisar historial de conversiones");
        System.out.println("\t\t 0) Salir del conversor");
        System.out.println("=====================================================================================");
    }

    public void printInstruction(){
        System.out.println("Ingrese el número de la opción que desee seleccionar");
    }

    public void printWrongInputError(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Opción invalida. \nIngrese el número de la opción que desee seleccionar.");
    }

    public void printInitialConversorMenu(){
        System.out.println("===========================================");
        System.out.println("¿Qué moneda desea convertir?: ");
        System.out.println("\t 1) Dolar Estadounidense (USD)");
        System.out.println("\t 2) Euro (EUR)");
        System.out.println("\t 3) Peso Chileno (CLP)");
        System.out.println("\t 4) Peso Argentino (ARS)");
        System.out.println("\t 5) Real Brasileño (BRL) ");
        System.out.println("===========================================");
    }

    public void printRequest(Request request){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(request);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }

    public void printRequestLog(List<Request> requestLog){
        System.out.println("*****************************************************");
        System.out.println("***************HISTORIAL DE CONVERSIONES*************");
        for (Request req : requestLog){
            System.out.println("*****************************************************");
            System.out.println(req);
        }
    }

    /*Los siguientes prints se podrían haber generado manteniendo las monedas en una lista
        pero me dio pereza implementar esa logica ☺☺☺
     */


    public void printConversorForUSD(){
        System.out.println("===========================================");
        System.out.println("Seleccionaste USD.");
        System.out.println("¿A qué moneda desea convertir?: ");
        System.out.println("\t 1) Euro (EUR)");
        System.out.println("\t 2) Peso Chileno (CLP)");
        System.out.println("\t 3) Peso Argentino (ARS)");
        System.out.println("\t 4) Real Brasileño (BRL) ");
        System.out.println("===========================================");
    }

    public void printConversorForEUR(){
        System.out.println("===========================================");
        System.out.println("Seleccionaste EUR.");
        System.out.println("¿A qué moneda desea convertir?: ");
        System.out.println("\t 1) Dolar Estadounidense (USD)");
        System.out.println("\t 2) Peso Chileno (CLP)");
        System.out.println("\t 3) Peso Argentino (ARS)");
        System.out.println("\t 4) Real Brasileño (BRL) ");
        System.out.println("===========================================");
    }

    public void printConversorForCLP(){
        System.out.println("===========================================");
        System.out.println("Seleccionaste CLP.");
        System.out.println("¿A qué moneda desea convertir?: ");
        System.out.println("\t 1) Dolar Estadounidense (USD)");
        System.out.println("\t 2) Euro (EUR)");
        System.out.println("\t 3) Peso Argentino (ARS)");
        System.out.println("\t 4) Real Brasileño (BRL) ");
        System.out.println("===========================================");
    }

    public void printConversorForARS(){
        System.out.println("===========================================");
        System.out.println("Seleccionaste ARS.");
        System.out.println("¿A qué moneda desea convertir?: ");
        System.out.println("\t 1) Dolar Estadounidense (USD)");
        System.out.println("\t 2) Euro (EUR)");
        System.out.println("\t 3) Peso Chileno (CLP)");
        System.out.println("\t 4) Real Brasileño (BRL) ");
        System.out.println("===========================================");
    }

    public void printConversorForBRL(){
        System.out.println("===========================================");
        System.out.println("Seleccionaste BRL.");
        System.out.println("¿A qué moneda desea convertir?: ");
        System.out.println("\t 1) Dolar Estadounidense (USD)");
        System.out.println("\t 2) Euro (EUR)");
        System.out.println("\t 3) Peso Chileno (CLP)");
        System.out.println("\t 4) Peso Argentino (ARS) ");
        System.out.println("===========================================");
    }

    public void printEmptyLog() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Todavía no has hecho ninguna conversión!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
