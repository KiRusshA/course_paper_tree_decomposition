import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static ArrayList<Integer>[] createGraph() {
        int size = 8;
        ArrayList<Integer>[] graph = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        graph[0].add(2);
        graph[0].add(4);
        graph[0].add(6);
        graph[0].add(7);
        graph[1].add(4);
        graph[1].add(7);
        graph[2].add(0);
        graph[2].add(4);
        graph[3].add(5);
        graph[4].add(0);
        graph[4].add(1);
        graph[4].add(2);
        graph[4].add(5);
        graph[4].add(6);
        graph[5].add(3);
        graph[5].add(4);
        graph[5].add(6);
        graph[6].add(0);
        graph[6].add(4);
        graph[6].add(5);
        graph[6].add(7);
        graph[7].add(0);
        graph[7].add(1);
        graph[7].add(6);
        return graph;
    }

    private static ArrayList<int[]> createBags() {
        int size = 22;
        ArrayList<int[]> bags = new ArrayList<int[]>();
        int[] bag0 = {6};
        int[] bag1 = {5, 6};
        int[] bag2 = {5, 6};
        int[] bag3 = {5, 6};
        int[] bag4 = {4, 5, 6};
        int[] bag5 = {5};
        int[] bag6 = {4, 6};
        int[] bag7 = {3, 5};
        int[] bag8 = {0, 4, 6};
        int[] bag9 = {5};
        int[] bag10 = {0, 4, 6};
        int[] bag11 = {0, 4, 6};
        int[] bag12 = {0, 4, 6, 7};
        int[] bag13 = {0, 4};
        int[] bag14 = {4, 6, 7};
        int[] bag15 = {0, 2, 4};
        int[] bag16 = {4, 7};
        int[] bag17 = {2, 4};
        int[] bag18 = {1, 4, 7};
        int[] bag19 = {4};
        int[] bag20 = {4, 7};
        int[] bag21 = {7};
        bags.add(bag0);
        bags.add(bag1);
        bags.add(bag2);
        bags.add(bag3);
        bags.add(bag4);
        bags.add(bag5);
        bags.add(bag6);
        bags.add(bag7);
        bags.add(bag8);
        bags.add(bag9);
        bags.add(bag10);
        bags.add(bag11);
        bags.add(bag12);
        bags.add(bag13);
        bags.add(bag14);
        bags.add(bag15);
        bags.add(bag16);
        bags.add(bag17);
        bags.add(bag18);
        bags.add(bag19);
        bags.add(bag20);
        bags.add(bag21);
        return bags;
    }

    private static void nodeValue() {
        int acquiring = 1; //приобретающий
        int connecting = 2;//соединяющий
        int losing = 3; //теряющий
        int sheet = 4; //лист
    }

    private static ArrayList<int[][]> algorithm_1(ArrayList<Integer>[] graph, int[] fatherArray, ArrayList<int[]> bags) {
        int countVertex = graph.length + 1;
        ArrayList<int[][]> resultArrayLocalMatrix = new ArrayList<>();
        int index[] = new int[countVertex];
        int Ntop[] = new int[countVertex];
        ArrayList<ArrayList<Integer>> L = new ArrayList<>();
        for (int i = 1; i < countVertex; i++) {
            index[i] = 0;
            Ntop[i] = 0;
        } //1
        for (int j = 1; j < countVertex; j++) {

        }
        return resultArrayLocalMatrix;
    }

    public static void main(String[] args) {
        ArrayList<Integer>[] graph = createGraph();
        ArrayList<int[][]> tree_dec = new ArrayList<int[][]>();
        int[] fatherArray = {-1, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20};
        int[] nodeValue = {3, 2, 3, 1, 1, 3, 3, 1, 2, 4, 3, 1, 1, 3, 1, 1, 3, 1, 1, 4, 1, 4};
        ArrayList<int[]> bags = createBags();
        tree_dec = algorithm_1(graph, fatherArray, bags);
    }
}
