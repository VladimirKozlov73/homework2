public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println( );
        //Задача 2
        dog = dog+ 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println( );
        //Задача 3:
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println( );
        //Задача 4:
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        System.out.println();
        //Задача 5:
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        System.out.println();
        //Задача 6:
        //Не знаю как взять модуль или использовать if для нахождения большего веса
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Задача 6");
        System.out.println("Общая масса бойцов " + totalWeight + " кг.");
        var diffWeight = weightBoxer1 - weightBoxer2;
        System.out.println("Разница между массами бойцов " + diffWeight + " кг.");
        System.out.println();
        //Задача 7:
        diffWeight = weightBoxer2 % weightBoxer1;
        System.out.println("Задача 7");
        System.out.println("Остаток от деления между двумя весами = " + diffWeight);
        System.out.println();
        //Задача 8:
        System.out.println("Задача 8");
        var workers = 640 / 8;
        System.out.println("Всего работников в компании - " + workers + " человек.");
        workers = workers + 94;
        var time = workers  * 8;
        System.out.println("Если в компании работает " + workers + " человек; то всего " + time +
                " часов работы может быть поделено между сотрудниками.");
    }
}