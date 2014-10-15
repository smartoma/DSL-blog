package domain;

@SuppressWarnings("LocalCanBeFinal")
public class VisualField {
    private String fieldName;

    private boolean isLastElement;

    private boolean isReadOnly;

    private int maxLength;

    private int labelSpanValue;

    private int inputSpanValue;

    private int commentSpanValue;

    private Position labelPosition;

    private Position commentPosition;

    public VisualField() {
    }

    public VisualField(String fieldName, boolean isLastElement, int maxLength,
                       int labelSpanValue, Position labelPosition, int inputSpanValue,
                       int commentSpanValue, Position commentPosition, boolean isReadOnly) {
        this.fieldName = fieldName;
        this.isLastElement = isLastElement;
        this.maxLength = maxLength;
        this.labelSpanValue = labelSpanValue;
        this.labelPosition = labelPosition;
        this.inputSpanValue = inputSpanValue;
        this.commentSpanValue = commentSpanValue;
        this.commentPosition = commentPosition;
        this.isReadOnly = isReadOnly;
    }

    public enum Position {
        RIGHT,
        LEFT,
        OVER,
        UNDER
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public boolean isLastElement() {
        return isLastElement;
    }

    public void setLastElement(boolean isLastElement) {
        this.isLastElement = isLastElement;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public void setReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getLabelSpanValue() {
        return labelSpanValue;
    }

    public void setLabelSpanValue(int labelSpanValue) {
        this.labelSpanValue = labelSpanValue;
    }

    public int getInputSpanValue() {
        return inputSpanValue;
    }

    public void setInputSpanValue(int inputSpanValue) {
        this.inputSpanValue = inputSpanValue;
    }

    public int getCommentSpanValue() {
        return commentSpanValue;
    }

    public void setCommentSpanValue(int commentSpanValue) {
        this.commentSpanValue = commentSpanValue;
    }

    public Position getLabelPosition() {
        return labelPosition;
    }

    public void setLabelPosition(Position labelPosition) {
        this.labelPosition = labelPosition;
    }

    public Position getCommentPosition() {
        return commentPosition;
    }

    public void setCommentPosition(Position commentPosition) {
        this.commentPosition = commentPosition;
    }
}
