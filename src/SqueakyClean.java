public class SqueakyClean {

    static String clean(String identifier) {
        identifier = identifier.replaceAll("\uD83D\uDE00", "");
        identifier = identifier.replaceAll(" ", "_");
        identifier = identifier.replaceAll("\0", "CTRL");
        if (identifier.contains("-")) {
            Character ch = identifier.charAt(identifier.indexOf("-") + 1);
            Character uppercase = Character.toUpperCase(ch);
            String target = "-" + ch;
            identifier = identifier.replaceAll(target, String.valueOf(uppercase));
        }
        identifier = identifier.replaceAll("[α-ω]+", "");
        identifier = identifier.replaceAll("[0-9]", "");
        return identifier;
    }
}
