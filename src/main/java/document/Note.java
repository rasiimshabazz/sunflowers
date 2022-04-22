package document;

class Note {

    boolean isFormable(String text, String document) {
        if ((text.isEmpty() || text == null) && (document.isEmpty() || document == null)) return true;
        if ((text.isEmpty() || text == null) || (document.isEmpty() || document == null)) return false;

        return true;
    }

}
