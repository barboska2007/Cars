package geekbrains.lesson_2;

public class Main {

    public static void main(String[] args) {
        class Cars {
            int distance = 0;

            public int drive(int howlong) {
                distance = howlong * 60;
                System.out.println("Я проехал" + distance);
                return distance;
            }

            public void start() {
                System.out.println("Врррннн, поехали!");
            }

            public void stop() {
                System.out.println("Стооооп!");
            }


        }
    }
}
