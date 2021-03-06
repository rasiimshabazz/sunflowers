package document;

import java.util.Locale;

class Note {

    private String text;

    Note(String text) {
        if (text == null) text = "";
        this.text = text.toLowerCase(Locale.ROOT);
    }

    boolean isFormableFrom(String document) {
        if ((text.isEmpty())) return true;
        if (document == null) document = "";
        document = document.toLowerCase(Locale.ROOT);

        return documentContainsMyText(document);
    }

    private boolean documentContainsMyText(String document) {
        for (int i = 0; i < this.text.length(); i++) {
            char character = this.text.charAt(i);
            if (documentExcludesCharacter(document, character)) {
                return false;
            }
            document = removeCharacterFromDocument(character, document);
        }
        return true;
    }

    private String removeCharacterFromDocument(char character, String document) {
        String text = String.valueOf(document.charAt(document.indexOf(character)));
        String empty = String.valueOf(Character.MIN_VALUE);
        return document.replaceFirst(text, empty);
    }

    private boolean documentExcludesCharacter(String document, char character) {
        return document.indexOf(character) < 0;
    }
}
