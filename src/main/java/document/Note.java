package document;

class Note {

    private String text;

    Note(String text) {
        if (text == null) text = "";
        this.text = text;
    }

    boolean isFormableFrom(String document) {
        if ((text.isEmpty()) && (document.isEmpty() || document == null)) return true;
        if ((text.isEmpty()) || (document.isEmpty() || document == null)) return false;
        for (int i = 0; i < this.text.length(); i++) {
            char character = this.text.charAt(i);
            if (documentContainsCharacter(document, character)) {
                document = removeCharacterFromDocument(document, character);
            }
            else {
                System.out.println(document);
                return false;
            }
        }
        return true;
    }

    private String removeCharacterFromDocument(String document, char character) {
        document = document.replaceFirst("" + document.charAt(document.indexOf(character)), "" + Character.MIN_VALUE);
        return document;
    }

    private boolean documentContainsCharacter(String document, char character) {
        return document.indexOf(character) >= 0;
    }

}
