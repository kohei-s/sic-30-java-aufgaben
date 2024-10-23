public class ZahlenreiheAusgeben {

    public void numbers (int number) {
        int i = 1;
        while (number > 0) {
            System.out.print(i + " ");
            i++;
            number--;
        }
        System.out.println();
    }
}
