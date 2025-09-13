import java.util.*;

public class Main {
    static Map<String, List<List<String>>> recipes = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = Integer.parseInt(sc.nextLine().trim());

            for (int i = 0; i < n; i++) {
                String line = sc.nextLine().trim();
                String[] parts = line.split("=");
                String potion = parts[0].trim();
                String[] ingArr = parts[1].split("\\+");

                List<String> ingredients = new ArrayList<>();
                for (String ing : ingArr) {
                    ingredients.add(ing.trim());
                }
                recipes.computeIfAbsent(potion, k -> new ArrayList<>()).add(ingredients);
            }
            String target = sc.nextLine().trim();
            System.out.println(minOrbs(target));
        }
    }
    static int minOrbs(String potion) {
        if (!recipes.containsKey(potion)) {
            return 0;
        }
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }

        int best = Integer.MAX_VALUE;

        for (List<String> ingList : recipes.get(potion)) {
            int cost = ingList.size() - 1; // base orb cost
            for (String ing : ingList) {
                cost += minOrbs(ing);
            }
            best = Math.min(best, cost);
        }
        memo.put(potion, best);
        return best;
    }
}

