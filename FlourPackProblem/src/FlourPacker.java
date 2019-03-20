public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // bigCount = 5kg, smallCount = 1kg
        for (int big = 0; big < bigCount; big++) {
            if (goal > 4) {
                goal -= 5;
                if (goal == 0) {
                    return true;
                }
            }
        }
        for (int small = 0; small < smallCount; small++) {
            goal -= 1;
            if (goal == 0) {
                return true;
            }
        }
        return false;
    }
}
