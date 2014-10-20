package dsl;

import domain.VisualField;

public class Spanning extends DSLTerminator {

    private static final int MAX_ALLOWED_LENGTH = 100;

    public Spanning(VisualField visualField) {
        super(visualField);
    }

    public static int commentSpan(int spanning) {
        return spanning;
    }

    public static int labelSpan(int spanning) {
        return spanning;
    }

    public static int inputSpan(int spanning) {
        return spanning;
    }

    public DSLTerminator withMaxLength(int length) {
        if (length > MAX_ALLOWED_LENGTH) {
            throw new IllegalArgumentException("Maxlength value too big.");
        }
        visualField.setMaxLength(length);
        return new DSLTerminator(visualField);
    }

}
