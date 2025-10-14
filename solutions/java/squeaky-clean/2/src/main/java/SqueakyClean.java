import java.lang.Character;

class SqueakyClean {
    
    static String clean(String identifier) {
        for (int i = 0; i < identifier.length(); i += 1) {
            if (Character.isWhitespace(identifier.charAt(i))) {
                identifier = identifier.replace(" ", "_");
            }
            if (identifier.charAt(i) == '-') {
                identifier = identifier.replace(String.valueOf(identifier.charAt(i + 1)), String.valueOf(identifier.charAt(i + 1)).toUpperCase());
                identifier = identifier.replace("-", "");
            }
            if (Character.isDigit(identifier.charAt(i))) {
                if (identifier.charAt(i) == '4') {
                    identifier = identifier.replace(String.valueOf(identifier.charAt(i)), "a");
                }
                if (identifier.charAt(i) == '3') {
                    identifier = identifier.replace(String.valueOf(identifier.charAt(i)), "e");
                }
                if (identifier.charAt(i) == '0') {
                    identifier = identifier.replace(String.valueOf(identifier.charAt(i)), "o");
                }
                if (identifier.charAt(i) == '1') {
                    identifier = identifier.replace(String.valueOf(identifier.charAt(i)), "l");
                }
                if (identifier.charAt(i) == '7') {
                    identifier = identifier.replace(String.valueOf(identifier.charAt(i)), "t");
                }
            }
        }
        return identifier.replace("!", "").replace("¡", "").replace(".", "").replace("#", "").replace("$", "");
    }
    
}
