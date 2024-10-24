public class InitialenEinesNamens {
    public void initialLetter(String name) {
        int index = name.indexOf(" ");
        String firstNameInitial = name.substring(0, 1).toUpperCase();
        String lastName = name.substring(index + 1, index + 2).toUpperCase();
        System.out.println(firstNameInitial + lastName);
    }
}
