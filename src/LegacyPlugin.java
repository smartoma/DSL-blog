import domain.VisualField;

import java.util.ArrayList;
import java.util.List;

import static domain.VisualField.Position;
import static domain.VisualField.Position.LEFT;
import static domain.VisualField.Position.OVER;
import static domain.VisualField.Position.RIGHT;
import static java.lang.Boolean.FALSE;

public class LegacyPlugin {

    public List<VisualField> getVisualFieldsForPage() {
        List<VisualField> visualFields = new ArrayList<>();

        int maxlength = 30;
        int labelspanvalueDefault = 5;
        int inputspanvalueDefault = 8;
        int labelspanvalue = labelspanvalueDefault;
        int inputspanvalue = inputspanvalueDefault;
        int commentspanvalue = 1;
        boolean notReadOnly = FALSE;
        Position labelposition = LEFT;
        Position commentposition = RIGHT;

        String fieldname = "duedate";
        visualFields.add(
            new VisualField(
                fieldname, true, maxlength, labelspanvalue, labelposition,
                inputspanvalue, commentspanvalue, commentposition, notReadOnly));

        fieldname = "bankclearingnumber";
        maxlength = 4;
        inputspanvalue = 3;
        commentposition = OVER;
        visualFields.add(
            new VisualField(
                fieldname, false, maxlength, labelspanvalue, labelposition,
                inputspanvalue, commentspanvalue, commentposition, notReadOnly));

        fieldname = "bankaccountnumber";
        maxlength = 10;
        inputspanvalue = 5;
        commentposition = OVER;
        labelspanvalue = 0;
        visualFields.add(
            new VisualField(
                fieldname, true, maxlength, labelspanvalue, labelposition,
                inputspanvalue, commentspanvalue, commentposition, notReadOnly));

        maxlength = 30;
        fieldname = "acceptelectronicards";
        labelspanvalue = 5;
        inputspanvalue = 9;
        visualFields.add(
            new VisualField(
                fieldname, true, maxlength, labelspanvalue, labelposition,
                inputspanvalue, commentspanvalue, commentposition, notReadOnly));

        return visualFields;
    }

}
