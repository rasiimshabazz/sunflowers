package document;

class Note {

    private String text;

    public Note(String text) {
        if (text == null) text = "";
        this.text = text;
    }

    boolean isFormableGiven(String document) {
        if ((text.isEmpty()) && (document.isEmpty() || document == null)) return true;
        if ((text.isEmpty()) || (document.isEmpty() || document == null)) return false;

        return true;
    }

}
