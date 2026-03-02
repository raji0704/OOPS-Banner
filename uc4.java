public class UC4 {

    public static void main(String[] args) {

        displayBanner();

    }

    // Method to display banner using Array & Loop
    public static void displayBanner() {

        // Banner lines stored in String Array
        String[] bannerLines = {

                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "W", "E", "L", "C", "O", "M", "E", " ", "*"),
                String.join("", "*", " ", "T", "O", " ", "O", "O", "P", "S", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")

        };

        // Enhanced for-loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }

    }
}