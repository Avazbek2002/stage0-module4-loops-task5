package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < length; j++) {
                    System.out.print(8);
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < length; j++) {
                    if (j == 0 || j == length - 1)
                        System.out.print(8);
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
