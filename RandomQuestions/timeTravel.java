
public class timeTravel {

    static int countTime(int[] years) {
        int counter = 0;
        for (int i = 0; i <= years.length - 2; i++) {
            if (years[i] == years[i + 1]) {
                counter += 0;
            } else if (years[i] > years[i + 1]) {
                counter += 2;
            } else if (years[i] < years[i + 1]) {
                counter += 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] years = new int[] { 2021, 2021, 2005 };
        System.out.println(countTime(years));
    }
}
