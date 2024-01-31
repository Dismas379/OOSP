package com.company;

import com.company.Entities.Group;
import com.company.Entities.Kid;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleApplication {

    private Kindergarten kindergarten = new Kindergarten();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        StartMessage();
        while (true) {
            String choice = sc.nextLine();
            switch (choice.toLowerCase()) {
                case "0" -> {
                    System.out.println("Введите название группы: ");
                    String name = sc.nextLine();
                    kindergarten.gc.createGroup(name);
                    System.out.println("Группа была успешно создана");
                }
                case "1" -> {
                    System.out.println("Введите имя нового ребенка: ");
                    String name = sc.nextLine();
                    System.out.println("Введите возраст нового ребенка: ");
                    int age = Integer.valueOf(sc.nextLine());
                    System.out.println("Введите пол нового ребенка: ");
                    String gender = sc.nextLine();
                    System.out.println("Введите номер группы: ");
                    int group = Integer.valueOf(sc.nextLine());
                    int check = 0;
                    for (Group group1 : kindergarten.gc.getAllGroups()){
                        if (group1.id == group){
                            kindergarten.kc.addKid(name, age, gender, group);
                            System.out.println("Ребенок был успешно занесен в список");
                            check++;
                        }
                    }
                    if (check == 0){
                        System.out.println("Не существует группы с таким номером. попробуйте еще раз");
                    }
                }
                case "2" -> {
                    System.out.println("Введите номер ребенка: ");
                    int id = Integer.valueOf(sc.nextLine());
                    System.out.println("Введите новое имя ребенка: ");
                    String name = sc.nextLine();
                    System.out.println("Введите возраст ребенка: ");
                    int age = Integer.valueOf(sc.nextLine());
                    System.out.println("Введите пол ребенка: ");
                    String gender = sc.nextLine();
                    System.out.println("Введите номер группы: ");
                    int group = Integer.valueOf(sc.nextLine());
                    int check = 0;
                    for (Group group1 : kindergarten.gc.getAllGroups()){
                        if (group1.id == group){
                            kindergarten.kc.changeKidInformation(name, age, gender, group, id);
                            System.out.println("Информация о ребенке успешно изменена");
                            check++;
                        }
                    }
                    if (check == 0){
                        System.out.println("Не существует группы с таким номером. попробуйте еще раз");
                    }
                }
                case "3" -> {
                    System.out.println("Введите номер ребенка: ");
                    int id = Integer.valueOf(sc.nextLine());
                    kindergarten.kc.removeKid(id);
                    System.out.println("Ребенок был успешно удален из списка");
                }
                case "4" -> {
                    for (Kid kid : kindergarten.kc.getAllKids()) {
                        System.out.println("Имя ребенка - " + kid.name + "  Возраст ребенка - " + kid.age + "  Пол ребенка - " + kid.gender + "  Группа ребенка - " +kindergarten.gc.getGroup(kid.groupId).name + "  номер ребенка в списке" +kid.id);
                    }
                }
                case "5" -> {
                    System.out.println("Введите номер группы: ");
                    int id = Integer.valueOf(sc.nextLine());
                    ArrayList<Kid> kids = kindergarten.kc.getAllKidsInGroup(id);
                    if (kids.get(0) != null){
                        System.out.println("Перед удалением группы, перенесите из нее детей");
                    }else{
                        kindergarten.gc.deleteGroup(id);
                        System.out.println("Группа была успешно удалена");
                    }
                }
                case "6" -> {
                    System.out.println("Введите номер группы: ");
                    int id = Integer.valueOf(sc.nextLine());
                    System.out.println("Введите новое название группы: ");
                    String name = sc.nextLine();
                    kindergarten.gc.changeGroupName(name, id);
                    System.out.println("Группа была успешно переименована");
                }
                case "7" -> {
                    if (kindergarten.gc.getAllGroups().size() == 0){
                        System.out.println("В детском саду пока что нет групп");
                    }else {
                        for (Group group : kindergarten.gc.getAllGroups()) {
                            System.out.println("Название группы - " + group.name + "  Номер группы - " + group.id);
                        }
                    }
                }
                case "8" -> {
                    System.out.println("Введите номер группы: ");
                    int id = Integer.valueOf(sc.nextLine());
                    ArrayList<Kid> kids = kindergarten.kc.getAllKidsInGroup(id);
                    for (Kid kid : kids) {
                        System.out.println("Имя ребенка - " + kid.name + "  Возраст ребенка - " + kid.age + "  Пол ребенка - " + kid.gender + "  Группа ребенка - " +kindergarten.gc.getGroup(kid.groupId).name + "  номер ребенка в списке" +kid.id);
                    }
                }
                case "9" -> {
                    System.out.println("Введите id ребенка: ");
                    int id = Integer.valueOf(sc.nextLine());
                    kindergarten.kc.getInformationAboutKid(id);
                }
                case "10" -> System.out.println("В детском саду сейчас: " + kindergarten.kc.getNumberOfKids() + " детей");
                case "11" -> StartMessage();
            }
        }
    }

    public void StartMessage() {
        System.out.println("Приветствую вас в консольном приложении детского сада!");
        System.out.println("______________________________________________________");
        System.out.println("Список команд:");
        System.out.println("0. Добавить группу");
        System.out.println("1. Добавить ребенка");
        System.out.println("2. Редактировать информацию о ребенке");
        System.out.println("3. Удалить ребенка");
        System.out.println("4. Получить список всех детей");
        System.out.println("5. Удалить группу");
        System.out.println("6. Редактировать группу");
        System.out.println("7. Получить список всех групп");
        System.out.println("8. Получить список всех детей в группе");
        System.out.println("9. Получить информацию о ребенке");
        System.out.println("10. Получить информацию о количестве детей в детском саду");
        System.out.println("11. Вывести список команд еще раз");
    }


}
