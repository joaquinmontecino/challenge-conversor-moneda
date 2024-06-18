package request;

import models.Request;
import util.Printer;

import java.util.Scanner;

public class RequestLogic {
    Scanner scanner = new Scanner(System.in);
    Printer printer = new Printer();


    public Request convertRequest(){
        int option;
        do {
            this.printer.printInitialConversorMenu();
            this.printer.printInstruction();
            if(this.scanner.hasNextInt()){
                option = this.scanner.nextInt();
                switch (option){
                    case 1: //USD
                        return convertUSD();
                    case 2: //EUR
                        return convertEUR();
                    case 3: //CLP
                        return convertCLP();
                    case 4: //ARS
                        return convertARS();
                    case 5: //BRL
                        return convertBRL();
                    default:
                        this.printer.printWrongInputError();
                        break;
                }
            } else {
                printer.printWrongInputError();
                scanner.next();
            }
        }while(true);
    }

    public Request convertUSD(){
        int option;
        String baseCode = "USD";
        do {
            this.printer.printConversorForUSD();
            this.printer.printInstruction();
            if(this.scanner.hasNextInt()){
                option = this.scanner.nextInt();
                switch (option){
                    case 1: //EUR
                        return sendRequest(baseCode, "EUR");
                    case 2: //CLP
                        return sendRequest(baseCode, "CLP");
                    case 3: //ARS
                        return sendRequest(baseCode, "ARS");
                    case 4: //BRL
                        return sendRequest(baseCode, "BRL");
                    default:
                        this.printer.printWrongInputError();
                        break;
                }
            } else {
                this.printer.printWrongInputError();
                this.scanner.next();
            }
        }while(true);
    }

    public Request convertEUR(){
        int option;
        String baseCode = "EUR";
        do {
            this.printer.printConversorForEUR();
            this.printer.printInstruction();
            if(this.scanner.hasNextInt()){
                option = this.scanner.nextInt();
                switch (option){
                    case 1: //USD
                        return sendRequest(baseCode, "USD");
                    case 2: //CLP
                        return sendRequest(baseCode, "CLP");
                    case 3: //ARS
                        return sendRequest(baseCode, "ARS");
                    case 4: //BRL
                        return sendRequest(baseCode, "BRL");
                    default:
                        this.printer.printWrongInputError();
                        break;
                }
            } else {
                this.printer.printWrongInputError();
                this.scanner.next();
            }
        }while(true);
    }

    public Request convertCLP(){
        int option;
        String baseCode = "CLP";
        do {
            this.printer.printConversorForCLP();
            this.printer.printInstruction();
            if(this.scanner.hasNextInt()){
                option = this.scanner.nextInt();
                switch (option){
                    case 1: //USD
                        return sendRequest(baseCode, "USD");
                    case 2: //EUR
                        return sendRequest(baseCode, "EUR");
                    case 3: //ARS
                        return sendRequest(baseCode, "ARS");
                    case 4: //BRL
                        return sendRequest(baseCode, "BRL");
                    default:
                        this.printer.printWrongInputError();
                        break;
                }
            } else {
                this.printer.printWrongInputError();
                this.scanner.next();
            }
        }while(true);
    }

    public Request convertARS(){
        int option;
        String baseCode = "ARS";
        do {
            this.printer.printConversorForARS();
            this.printer.printInstruction();
            if(this.scanner.hasNextInt()){
                option = this.scanner.nextInt();
                switch (option){
                    case 1: //USD
                        return sendRequest(baseCode, "USD");
                    case 2: //EUR
                        return sendRequest(baseCode, "EUR");
                    case 3: //CLP
                        return sendRequest(baseCode, "CLP");
                    case 4: //BRL
                        return sendRequest(baseCode, "BRL");
                    default:
                        this.printer.printWrongInputError();
                        break;
                }
            } else {
                this.printer.printWrongInputError();
                this.scanner.next();
            }
        }while(true);
    }

    public Request convertBRL(){
        int option;
        String baseCode = "BRL";
        do {
            this.printer.printConversorForBRL();
            this.printer.printInstruction();
            if(this.scanner.hasNextInt()){
                option = this.scanner.nextInt();
                switch (option){
                    case 1: //USD
                        return sendRequest(baseCode, "USD");
                    case 2: //EUR
                        return sendRequest(baseCode, "EUR");
                    case 3: //CLP
                        return sendRequest(baseCode, "CLP");
                    case 4: //ARS
                        return sendRequest(baseCode, "ARS");
                    default:
                        this.printer.printWrongInputError();
                        break;
                }
            } else {
                this.printer.printWrongInputError();
                this.scanner.next();
            }
        }while(true);
    }

    public Request sendRequest(String baseCode, String targetCode){
        double amount;
        RequestAPI requestAPI = new RequestAPI();
        do {
            System.out.println("Ingrese el monto a convertir: ");
            while(!this.scanner.hasNextDouble()){
                System.out.println("Entrada no valida. Ingrese un monto valido.");
                scanner.next();
            }
            amount = scanner.nextDouble();
            if (amount <= 0){
                System.out.println("El monto debe ser mayor a cero. Intente nuevamente");
            }
        }while (amount <= 0);

        return requestAPI.convertCurrencies(baseCode, targetCode, amount);
    }
}
