package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;

import java.util.Map;

/**
 * An UI component that displays information of a {@code Client}.
 */
public class PreferenceRow extends UiPart<Region> {

    private static final String FXML = "PreferenceRow.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Map.Entry<String, String> preference;

    @FXML
    private Label key;
    @FXML
    private Label value;

    /**
     * Creates a {@code ClientCode} with the given {@code Client} and index to display.
     */
    public PreferenceRow(Map.Entry<String, String> preference) {
        super(FXML);
        this.preference = preference;
        key.setText(preference.getKey());
        value.setText(preference.getValue());
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof PreferenceRow)) {
            return false;
        }

        // state check
        PreferenceRow card = (PreferenceRow) other;
        return preference.equals(card.preference);
    }
}
