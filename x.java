public class x {

        public static String compressString(String str) {
            if (str == null || str.length() == 0) {
                return str;
            }

            StringBuilder compressed = new StringBuilder();
            int count = 1;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    compressed.append(str.charAt(i - 1)).append(count);
                    count = 1;
                }
            }

            // Append the last character and its count
            compressed.append(str.charAt(str.length() - 1)).append(count);

            // Return the original string if the compressed string is not shorter
            return compressed.length() < str.length() ? compressed.toString() : str;
        }

        public static void main(String[] args) {
            String str = "aabbbcccc";
            String compressedStr = compressString(str);
            System.out.println("Original String: " + str);
            System.out.println("Compressed String: " + compressedStr);
        }
    }
