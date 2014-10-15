package dsl;

import domain.VisualField;

import static domain.VisualField.Position;

public class VisualFieldDSL {

    private VisualField visualField = new VisualField();

    private VisualFieldDSL(String name) {
        this.visualField.setFieldName(name);
    }

    public static VisualFieldDSL field(String name) {
        return new VisualFieldDSL(name);
    }

    public Placed place(Position label, Position comment) {
        visualField.setLabelPosition(label);
        visualField.setCommentPosition(comment);
        return new Placed(visualField);
    }
}
