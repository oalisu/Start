public class Variables {

    public static void main(String[] args) {
        int passangers = 6;
        System.err.println(passangers);

        passangers += 9;
        System.err.println(passangers);

        passangers -= 15;
        System.err.println(passangers);

        // maneira feia de fazer //

        passangers = 6;
        System.err.println(passangers);

        passangers = passangers + 9;
        System.err.println(passangers);

        passangers = passangers - 15;
        System.err.println(passangers);

        int busTickets = passangers;
        System.err.println(busTickets);
    }
    
}
