package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import com.ss.android.lark.mail.impl.entity.C42101o;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IUndoMulProcess.class)
public class IUndoSendMulService implements IUndoMulProcess {
    private Context mContext;

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public boolean isScheduleSendCancelEnable() {
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public boolean isUndoSendEnable() {
        C42101o b = C43350d.m172098a().mo155050p().mo5927b();
        if (b == null || !b.mo152005a()) {
            return false;
        }
        return true;
    }

    public IUndoSendMulService(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showDeleteUndo(DeleteUndoProcess deleteUndoProcess) {
        C43383h.m172311a().mo155143a(deleteUndoProcess);
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showScheduleCancel(ScheduleSendCancelProcess scheduleSendCancelProcess) {
        C43383h.m172311a().mo155143a(scheduleSendCancelProcess);
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showSendUndo(SendUndoProcess sendUndoProcess) {
        C43383h.m172311a().mo155143a(sendUndoProcess);
    }
}
