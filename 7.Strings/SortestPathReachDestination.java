
import java.util.*;

public class SortestPathReachDestination {

    public static double printSortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // east
            if (dir == 'E') {
                x++;

            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;

            } else {
                y--;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return Math.sqrt(x2 + y2);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        double a = printSortestPath(path);
        System.out.println(a);

    }

}
