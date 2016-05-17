public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
            i++;
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 1;
        while (i <= amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        int b = size - 1;
        while (i <= size) {
            printWhitespaces(b);
            printStars(i);
            i++;
            b--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int starsMax = height * 2 - 1;
        int whitespace = height - 1;
        int i = 1;
        
        while (i <= starsMax){
            printWhitespaces(whitespace);
            printStars(i);
            whitespace--;
            i += 2;
        }
        int treeWhite = Math.abs(height - 2);
        printWhitespaces(treeWhite);
        printStars(3);
        printWhitespaces(treeWhite);
        printStars(3);
        
        
            
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        
        
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
