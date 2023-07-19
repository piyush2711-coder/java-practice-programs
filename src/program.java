public class program {
        public static void main(String[] args)
        {
            int number = 44;
            String size;

            switch (number) {

                case 29:
                    size = "Small";
                    break;

                case 30:
                    size = "Medium";
                    break;

                case 31:
                    size = "Large";
                    break;

                case 32:
                    size = "Extra Large";
                    break;

                default:
                    size = "Unknown";
                    break;

            }
            System.out.println("Size: " + size);
        }
}