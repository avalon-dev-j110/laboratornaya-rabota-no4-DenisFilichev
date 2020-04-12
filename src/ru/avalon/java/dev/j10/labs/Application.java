package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        Random rand = new Random();
        String[] names = new String[20];
            names[0]="Willis";
            names[1]="Gilbert";
            names[2]="Hall";
            names[3]="Phelps";
            names[4]="Hawkins";
            names[5]="Daniel";
            names[6]="Jordan";
            names[7]="Michael";
            names[8]="Anthony";
            names[9]="Domenic";
            names[10]="McCormick";
            names[11]="Turner";
            names[12]="Malone";
            names[13]="Watkins";
            names[14]="McLaughlin";
            names[15]="Lynch";
            names[16]="Gaines";
            names[17]="Richards";
            names[18]="Berry";
            names[19]="Campbell";
            
            //Инициализируем массив String[]
	    String[] strings = new String[20];
            for (int i=0; i<strings.length; i++){strings[i]=names[rand.nextInt(20)];}

            // Инициализируем массив persons 20-ю экземплярами класса PersonImpl()
	    Person[] persons = new PersonImpl[20];
            for (int i=0; i<persons.length; i++){
                persons[i]=new PersonImpl(names[rand.nextInt(20)] , (new Date(rand.nextInt(30)+80, rand.nextInt(12), rand.nextInt(32))));
            }

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new SortImpl();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new ComparatorImpl();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        System.out.println("-----------Comparable-------------");
        sort.sort(persons);
        for (Object obj : persons) {System.out.println(obj);}

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        System.out.println("-----------String-------------");
        sort.sort((Object[])strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        System.out.println("-----------Comparator-------------");
        sort.sort(strings, comparator);
        for (Object obj : strings) {System.out.println(obj);}
    }
}
