package OOP.UsersInterface.View;

import java.util.*;

import OOP.UsersInterface.Model.Data.DataBase;
import OOP.UsersInterface.Model.Data.DataBase.*;

public class UserInterface {
    void addUser(){
        Scanner scanner = new Scanner(System.in);

        boolean noExit = true;

        String command;
        String firstName;
        String lastName;
        String discipline;
        String group;
        String specialization;
        Calendar.Builder birthDay;
        String[] temp;

        DataBase dataBase = new DataBase();


        while (noExit){
            System.out.print("Создание: \n [1] Student\n[2] Teacher\n[0] Exit\nExecute: ");
            command = scanner.nextLine();

            if(command.equals("0")){noExit = false;}

            if(command.equals("2")){
                System.out.println(" ==== Creating teacher ====");
                System.out.print("Enter name: ");
                firstName = scanner.nextLine();
                System.out.print("Enter lastname: ");
                lastName = scanner.nextLine();
                System.out.print("Enter date birth (DAY.MONTH.YEAR): ");
                temp = scanner.nextLine().split("\\.");
                birthDay = new Calendar.Builder().setDate(
                        Integer.getInteger(temp[2]),
                        Integer.getInteger(temp[1]),
                        Integer.getInteger(temp[0]));
                System.out.print("Enter discipline: ");
                discipline = scanner.nextLine();
                dataBase.addTeacher(firstName, lastName, birthDay.build(), discipline);

            }
            //################################################
            if(command.equals("1")){
                System.out.println(" ==== Creating student ====");
                System.out.print("Enter name: ");
                firstName = scanner.nextLine();
                System.out.print("Enter lastname: ");
                lastName = scanner.nextLine();
                System.out.print("Enter date birth (DAY.MONTH.YEAR): ");
                temp = scanner.nextLine().split("\\.");
                birthDay = new Calendar.Builder().setDate(
                        Integer.getInteger(temp[2]),
                        Integer.getInteger(temp[1]),
                        Integer.getInteger(temp[0]));
                System.out.print("Enter group: ");
                group = scanner.nextLine();
                System.out.println("Enter specialization: ");
                specialization = scanner.nextLine();
                dataBase.addStudent(firstName, lastName, birthDay.build(), group, specialization);
            }
        }
    }



    void addStudent(){

    }
    void addTeacher(){

    }
}
