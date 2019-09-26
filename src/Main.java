import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите длину комнаты");
        double roomLength = scanner.nextDouble();
        System.out.println("Укажите ширину комнаты");
        double roomWidth = scanner.nextDouble();
        System.out.println("Укажите ширину обоев");
        double wallpaperWidth = scanner.nextDouble();
        System.out.println("Укажите длину обоев");
        double lengthOfRoll = scanner.nextDouble();
        System.out.println("Укажите высоту комнаты");
        double roomHeight = scanner.nextDouble();
        System.out.println("Нужно приобрести " + (int) Math.ceil(WallpaperCalculator.calculateNumberOfRolls(roomLength, roomWidth, wallpaperWidth, lengthOfRoll, roomHeight)) + " рулона(-ов) обоев");

    }
}
