import java.util.*;

public class PathCrossing {

    //https://leetcode.com/problems/path-crossing/description/
    public boolean isPathCrossing(String path) {
        Map<Character, List<Integer>> map = new HashMap<>();
        map.put('N', Arrays.asList(0,1));
        map.put('S', Arrays.asList(0,-1));
        map.put('E', Arrays.asList(1,0));
        map.put('W', Arrays.asList(-1,0));

        Set<List<Integer>> visited = new HashSet<>();
        visited.add(Arrays.asList(0,0));
        int x=0,y =0;
        for (Character c : path.toCharArray()) {
            int dx = map.get(c).get(0);
            int dy = map.get(c).get(1);
            x += dx;
            y += dy;

            if (visited.contains(Arrays.asList(x,y))) {
                return true;
            }
            visited.add(Arrays.asList(x,y));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println((new PathCrossing()).isPathCrossing("WNSN"));
    }
}
