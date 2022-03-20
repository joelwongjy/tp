package seedu.address.logic.commands.policy;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.EditCommand;

/**
 * Edits a client identified using it's displayed index from the address book.
 */
public class EditPolicyCommand extends EditCommand {

    public static final String COMMAND_WORD = "editPolicy";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Edits the policy identified by the client index number used in the displayed client list and "
            + "policy index number used in the displayed client card.\n"
            + "Parameters: ci/CLIENT_INDEX pi/POLICY_INDEX\n"
            + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_EDIT_POLICY_SUCCESS = "Edited Policy: %s from %s's policy list";

    public EditPolicyCommand(Index index, EditClientDescriptor editClientDescriptor) {
        super(index, editClientDescriptor, false);
    }
}
