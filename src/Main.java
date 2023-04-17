public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        float dog = 8.0f;
        float cat = 3.6f;
        int paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2(){
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend +=2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend);

    }
    public static void task3() {
        System.out.println("Задача 5");
        float frog = 3.5f;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }
    public static void task4(){
        System.out.println("Задача 6");
        float box1 = 78.2f;
        float box2 = 82.7f;
        var boxSum = box1 + box2;
        var boxDifference = box1 - box2;
        System.out.println("общий вес двух бойцов" + boxSum + "кг!");
        System.out.println("Разница веса между бойцами" + boxDifference + "кг!");
        System.out.println("Задача 7");
        var boxDifference1 = box2 - box1;
        var boxDifference2 = box2 % box1;
        System.out.println("Разница веса между бойцами" + boxDifference1 + "кг!");
        System.out.println("Разница веса между бойцами" + boxDifference2 + "кг!");
    }
    public static void task5(){
    System.out.println("Задача 8");
    var worker = 640/8;
    System.out.println("Всего работников в компании - " + worker + " человек");
    worker += 94;
    System.out.println("Если в компании работает " + worker + " человек, то всего " + worker * 8 + " часов работы может быть поделено между сотрудниками");
    }
}