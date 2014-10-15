package dsl;

import domain.VisualField;

import static domain.VisualField.Position;

public class Placed extends Spanning {

    public Placed(VisualField visualField) {
        super(visualField);
    }

    public static Position comment(Position position) {
        return position;
    }

    public static Position label(Position position) {
        return position;
    }

    public Placed spanInput(int spanning) {
        this.visualField.setInputSpanValue(spanning);
        return new Placed(this.visualField);
    }

    public Placed spanComment(int spanning) {
        this.visualField.setCommentSpanValue(spanning);
        return new Placed(this.visualField);
    }

    public Placed spanLabel(int spanning) {
        this.visualField.setLabelSpanValue(spanning);
        return new Placed(this.visualField);
    }

    public Spanning with(int commentSpan, int labelSpan, int inputSpan) {
        this.visualField.setCommentSpanValue(commentSpan);
        this.visualField.setLabelSpanValue(labelSpan);
        this.visualField.setInputSpanValue(inputSpan);
        return new Spanning(this.visualField);
    }

    public Spanning withMinimumSpan() {
        this.visualField.setCommentSpanValue(5);
        this.visualField.setLabelSpanValue(5);
        this.visualField.setInputSpanValue(5);
        return new Spanning(this.visualField);
    }

}
