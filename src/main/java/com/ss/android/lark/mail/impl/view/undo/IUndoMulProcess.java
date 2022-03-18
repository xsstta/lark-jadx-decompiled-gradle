package com.ss.android.lark.mail.impl.view.undo;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IUndoMulProcess extends IHookInterface {
    boolean isScheduleSendCancelEnable();

    boolean isUndoSendEnable();

    void showDeleteUndo(DeleteUndoProcess deleteUndoProcess);

    void showScheduleCancel(ScheduleSendCancelProcess scheduleSendCancelProcess);

    void showSendUndo(SendUndoProcess sendUndoProcess);
}
