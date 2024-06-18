package main;

import models.Request;
import request.RequestLogic;
import util.Printer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        RequestLogic requestLogic = new RequestLogic();
        List<Request> requestLog = new ArrayList<>();
        int option;

        do{
            printer.printMainMenu();
            printer.printInstruction();
            if(scanner.hasNextInt()){
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        Request request= requestLogic.convertRequest();
                        printer.printRequest(request);
                        requestLog.add(request);
                        break;
                    case 2:
                        if (!requestLog.isEmpty()){
                            printer.printRequestLog(requestLog);
                        } else {
                            printer.printEmptyLog();
                        }
                        break;
                    case 0:
                        System.out.println("Gracias por utilizar mi conversor!");
                }
            } else {
                printer.printWrongInputError();
                scanner.next();
                option = -1;
            }
        }while(option != 0 );
    }
}
