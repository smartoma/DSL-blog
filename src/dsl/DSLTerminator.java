package dsl;

import domain.VisualField;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class DSLTerminator {

    protected VisualField visualField;

    public DSLTerminator(VisualField visualField) {
        this.visualField = visualField;
    }

    public VisualField asLast() {
        visualField.setLastElement(TRUE);
        return visualField;
    }

    public VisualField asReadOnly() {
        visualField.setReadOnly(TRUE);
        return visualField;
    }

    public VisualField asLastAndReadOnly() {
        visualField.setLastElement(TRUE);
        visualField.setReadOnly(TRUE);
        return visualField;
    }

    public VisualField asWriteable() {
        return visualField;
    }

    public VisualField asLastAndWriteable() {
        visualField.setLastElement(TRUE);
        visualField.setReadOnly(FALSE);
        return visualField;
    }
}