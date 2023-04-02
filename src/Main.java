public class Main {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Kiểm tra độ dài của số điện thoại
        if (phoneNumber.length() != 16) {
            return false;
        }

        // Kiểm tra ký tự đầu tiên và ký tự thứ hai
        if (phoneNumber.charAt(0) != '(' || !Character.isDigit(phoneNumber.charAt(1))) {
            return false;
        }

        // Kiểm tra ký tự thứ ba
        if (phoneNumber.charAt(2) != ')' || phoneNumber.charAt(3) != '-') {
            return false;
        }

        // Kiểm tra 10 ký tự số sau
        for (int i = 4; i < 14; i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                return false;
            }
        }

        // Kiểm tra ký tự cuối cùng
        char lastChar = phoneNumber.charAt(15);
        if (lastChar != '0' && lastChar != '1' && lastChar != '2' && lastChar != '3' && lastChar != '4'
                && lastChar != '5' && lastChar != '6' && lastChar != '7' && lastChar != '8' && lastChar != '9') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(1234567890)"};

        for (String phoneNumber : phoneNumbers) {
            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println(phoneNumber + " is valid");
            } else {
                System.out.println(phoneNumber + " is invalid");
            }
        }
    }
}
