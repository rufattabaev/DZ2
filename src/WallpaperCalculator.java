public class WallpaperCalculator {
    static double calculateNumberOfRolls(double roomLength, double roomWidth, double wallpaperWidth, double lengthOfRoll, double roomHeight){
        return ((roomLength + roomWidth) * 2) / wallpaperWidth / (lengthOfRoll / roomHeight);
    }
}
