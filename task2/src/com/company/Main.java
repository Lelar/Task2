package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.print("Введите количество сотрудников : ");
        byte amount = in.nextByte();
        Cf arrBase[]  = new Cf[amount] ;
        int number = 0;
        while(number != 6) {

            menuBase();
            System.out.print("Введите номер действия : ");
            number = in.nextInt();
            
            if (number == 1) //Заполнение
                for (int i = 0; i < amount; i++)
                    fillBase(in, arrBase, i);

            if (number == 2)//Вывод
                for (int i = 0; i < amount; i++)
                    conclusionBase(arrBase[i],i);

            if (number == 3){//Поиск
                System.out.print("Введите должность искомых людей : ");
                String search = in.next();

                for (int i = 0;i < amount; i++)
                    if (arrBase[i].getPos().compareTo(search) == 0 )
                        conclusionBase(arrBase[i],i);
            }

            if (number == 4) {//Сортировка по фамилии
                sortAtSurname(amount, arrBase);
            }

            if (number == 5) {//Сортировка по зарплате
                sortAtPay(amount, arrBase);
            }
        }
    }

    private static void sortAtPay(byte j, Cf[] n) {
        for (int h = 0;h < j-1;h++)
            for (int i = h + 1; i < j; i++)
                if (n[h].getPay() < n[i].getPay()) {
                    double changeDouble = n[h].getPay();
                    n[h].setPay(n[i].getPay());
                    n[i].setPay(changeDouble);
                    String changeStr = n[h].getSurname();
                    n[h].setSurname(n[i].getSurname());
                    n[i].setSurname(changeStr);
                    changeStr = n[h].getName();
                    n[h].setName(n[i].getName());
                    n[i].setName(changeStr);
                    changeStr = n[h].getPos();
                    n[h].setPos(n[i].getPos());
                    n[i].setPos(changeStr);
                }
    }
    private static void sortAtSurname(byte j, Cf[] n) {
        for (int h = 0;h < j-1;h++)
            for (int i = h + 1; i < j; i++)
                if (n[i].getSurname().compareTo(n[h].getSurname()) < 0) {
                    String changeStr = n[h].getSurname();
                    n[h].setSurname(n[i].getSurname());
                    n[i].setSurname(changeStr);
                    changeStr = n[h].getName();
                    n[h].setName(n[i].getName());
                    n[i].setName(changeStr);
                    changeStr = n[h].getPos();
                    n[h].setPos(n[i].getPos());
                    n[i].setPos(changeStr);
                    double changeDouble = n[h].getPay();
                    n[h].setPay(n[i].getPay());
                    n[i].setPay(changeDouble);
                }
    }
    private static void fillBase(Scanner in, Cf[] n, int i) {
        System.out.print("Введите имя " + (i + 1) + "-го сотрудника : ");
        String name = in.next();
        System.out.print("Введите фамилию " + (i + 1) + "-го сотрудника : ");
        String surname = in.next();
        System.out.print("Введите должность " + (i + 1) + "-го сотрудника : ");
        String pos = in.next();
        System.out.print("Введите зарплату " + (i + 1) + "-го сотрудника : ");
        Double pay = in.nextDouble();
        n[i] = new Cf(name,surname,pos,pay);
    }
    private static void conclusionBase(Cf n,int i) {
        System.out.println(i + 1 + ". | " + n.getName() + " \t| " + n.getSurname() + " \t| " + n.getPos() + " \t| " + n.getPay() + " |");
    }
    private static void menuBase(){
        System.out.println("1.Заполнение\n2.Вывод\n3.Поиск по должности\n4.Сортировка по фамилии\n5.Сортировка по зарплате\n6.Выход");
    }
}