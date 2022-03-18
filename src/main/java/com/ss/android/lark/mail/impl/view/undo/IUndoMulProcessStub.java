package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IUndoMulProcessStub extends Binder implements IInterface, IUndoMulProcess {
    public final IUndoSendMulService base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public boolean isScheduleSendCancelEnable() {
        return this.base.isScheduleSendCancelEnable();
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public boolean isUndoSendEnable() {
        return this.base.isUndoSendEnable();
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showDeleteUndo(DeleteUndoProcess deleteUndoProcess) {
        this.base.showDeleteUndo(deleteUndoProcess);
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showScheduleCancel(ScheduleSendCancelProcess scheduleSendCancelProcess) {
        this.base.showScheduleCancel(scheduleSendCancelProcess);
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showSendUndo(SendUndoProcess sendUndoProcess) {
        this.base.showSendUndo(sendUndoProcess);
    }

    public IUndoMulProcessStub(Context context) {
        this.base = new IUndoSendMulService(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
    }

    public static IUndoMulProcessProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IUndoMulProcessProxy)) {
            return new IUndoMulProcessProxy(context, iBinder);
        }
        return (IUndoMulProcessProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
            boolean isUndoSendEnable = isUndoSendEnable();
            parcel2.writeNoException();
            parcel2.writeInt(isUndoSendEnable ? 1 : 0);
            return true;
        } else if (i != 2) {
            SendUndoProcess sendUndoProcess = null;
            ScheduleSendCancelProcess scheduleSendCancelProcess = null;
            DeleteUndoProcess deleteUndoProcess = null;
            if (i == 3) {
                parcel.enforceInterface("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
                if (parcel.readInt() != 0) {
                    sendUndoProcess = SendUndoProcess.CREATOR.createFromParcel(parcel);
                }
                showSendUndo(sendUndoProcess);
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
                if (parcel.readInt() != 0) {
                    deleteUndoProcess = DeleteUndoProcess.CREATOR.createFromParcel(parcel);
                }
                showDeleteUndo(deleteUndoProcess);
                parcel2.writeNoException();
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
                if (parcel.readInt() != 0) {
                    scheduleSendCancelProcess = ScheduleSendCancelProcess.CREATOR.createFromParcel(parcel);
                }
                showScheduleCancel(scheduleSendCancelProcess);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
                return true;
            }
        } else {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
            boolean isScheduleSendCancelEnable = isScheduleSendCancelEnable();
            parcel2.writeNoException();
            parcel2.writeInt(isScheduleSendCancelEnable ? 1 : 0);
            return true;
        }
    }
}
