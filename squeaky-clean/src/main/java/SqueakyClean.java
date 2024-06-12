import java.util.List;

class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return identifier;
        }
        char[] charArray = identifier.toCharArray();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == ' ') {
                newString.append("_");
            } else if (charArray[i] == '-') {
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
            } else if (charArray[i] == '4') {
                newString.append("a");
            } else if (charArray[i] == '3') {
                newString.append("e");
            } else if (charArray[i] == '0') {
                newString.append("o");
            } else if (charArray[i] == '1') {
                newString.append("l");
            } else if (charArray[i] == '7') {
                newString.append("t");
            } else if (Character.isAlphabetic(charArray[i])) {
                newString.append(charArray[i]);
            }

        }

        return newString.toString().trim();
    }
}
