import domain.VisualField;

import java.util.List;

import static domain.VisualField.Position.LEFT;
import static domain.VisualField.Position.OVER;
import static domain.VisualField.Position.RIGHT;
import static dsl.Placed.comment;
import static dsl.Placed.label;
import static dsl.Spanning.commentSpan;
import static dsl.Spanning.inputSpan;
import static dsl.Spanning.labelSpan;
import static dsl.VisualFieldDSL.field;
import static java.util.Arrays.asList;

public class DslPlugin {

    public List<VisualField> getVisualFieldsForPage() {
        return asList(
            field("duedate").
                place(label(LEFT), comment(RIGHT)).
                with(commentSpan(1), labelSpan(5), inputSpan(8)).
                withMaxLength(30).
                asLastAndWriteable(),

            field("bankclearingnumber").
                place(label(LEFT), comment(OVER)).
                with(commentSpan(1), labelSpan(5), inputSpan(3)).
                withMaxLength(4).
                asWriteable(),

            field("bankaccountnumber").
                place(label(LEFT), comment(OVER)).
                spanComment(1).spanInput(5).
                withMaxLength(10).
                asLastAndWriteable(),

            field("acceptelectronicards").
                place(label(LEFT), comment(OVER)).
                with(commentSpan(1), labelSpan(5), inputSpan(9)).
                asLastAndReadOnly()
        );
    }
}
