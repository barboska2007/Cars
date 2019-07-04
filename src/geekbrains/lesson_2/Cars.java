package geekbrains.lesson_2;

public class Cars {
    int distance = 0;

    public int drive(int howlong) {
        distance = howlong * 60;
        System.out.println("Я проехал " + distance + " км");
        return distance;
    }

    public void start() {
        System.out.println("Врррннн, поехали!");
    }

    public void stop() {
        System.out.println("Стооооп!");
    }


}

