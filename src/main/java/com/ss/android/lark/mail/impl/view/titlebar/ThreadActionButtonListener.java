package com.ss.android.lark.mail.impl.view.titlebar;

import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ArchiveButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.CancelScheduleSendButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ChangeLabelButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.DeleteForeverButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.FlagButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ForwardButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToFolderButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToImportantButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToInboxButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToLabelButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToOtherButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.NotSpamButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ReadButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ReadMailSearchButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ReplyButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.SpamButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.TrashButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.UnreadButton;

public abstract class ThreadActionButtonListener {
    @AbsButton.ButtonType(action = "ARCHIVE", clz = ArchiveButton.class)
    public void onArchiveClick() {
    }

    @AbsButton.ButtonType(action = "CANCEL_SCHEDULE_SEND", clz = CancelScheduleSendButton.class)
    public void onCancelScheduleSendClick() {
    }

    @AbsButton.ButtonType(action = "CHANGE_LABEL", clz = ChangeLabelButton.class)
    public void onChangeLabelClick() {
    }

    @AbsButton.ButtonType(action = "MOVE_TO_TRASH", clz = TrashButton.class)
    public void onDeleteClick() {
    }

    @AbsButton.ButtonType(action = "DELETE_PERMANENTLY", clz = DeleteForeverButton.class)
    public void onDeleteForeverClick() {
    }

    @AbsButton.ButtonType(action = "FLAG", clz = FlagButton.class)
    public void onFlagClick() {
    }

    @AbsButton.ButtonType(action = "FORWARD", clz = ForwardButton.class)
    public void onForwardClick() {
    }

    @AbsButton.ButtonType(action = "MOVE_TO_FOLDER", clz = MoveToFolderButton.class)
    public void onMoveToFolderClick() {
    }

    @AbsButton.ButtonType(action = "MOVE_TO_IMPORTANT", clz = MoveToImportantButton.class)
    public void onMoveToImportantClick() {
    }

    @AbsButton.ButtonType(action = "MOVE_TO_INBOX", clz = MoveToInboxButton.class)
    public void onMoveToInboxClick() {
    }

    @AbsButton.ButtonType(action = "MOVE_TO_LABEL", clz = MoveToLabelButton.class)
    public void onMoveToLabelClick() {
    }

    @AbsButton.ButtonType(action = "MOVE_TO_OTHER", clz = MoveToOtherButton.class)
    public void onMoveToOtherClick() {
    }

    @AbsButton.ButtonType(action = "MARK_AS_NOT_SPAM", clz = NotSpamButton.class)
    public void onNotSpamClick() {
    }

    @AbsButton.ButtonType(action = "MARK_AS_READ", clz = ReadButton.class)
    public void onReadClick() {
    }

    @AbsButton.ButtonType(action = "READMAIL_SEARCH", clz = ReadMailSearchButton.class)
    public void onReadMailSearchClick() {
    }

    @AbsButton.ButtonType(action = "REPLY", clz = ReplyButton.class)
    public void onReplyClick() {
    }

    @AbsButton.ButtonType(action = "MARK_AS_SPAM", clz = SpamButton.class)
    public void onSpamClick() {
    }

    @AbsButton.ButtonType(action = "MARK_AS_UNREAD", clz = UnreadButton.class)
    public void onUnreadClick() {
    }
}
