package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IUndoMulProcessProxy implements IInterface, IUndoMulProcess {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public boolean isScheduleSendCancelEnable() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IUndoMulProcessProxy", "call method isScheduleSendCancelEnable throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public boolean isUndoSendEnable() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IUndoMulProcessProxy", "call method isUndoSendEnable throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showDeleteUndo(DeleteUndoProcess deleteUndoProcess) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
            if (deleteUndoProcess != null) {
                obtain.writeInt(1);
                deleteUndoProcess.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IUndoMulProcessProxy", "call method showDeleteUndo throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showScheduleCancel(ScheduleSendCancelProcess scheduleSendCancelProcess) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
            if (scheduleSendCancelProcess != null) {
                obtain.writeInt(1);
                scheduleSendCancelProcess.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IUndoMulProcessProxy", "call method showScheduleCancel throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess
    public void showSendUndo(SendUndoProcess sendUndoProcess) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess");
            if (sendUndoProcess != null) {
                obtain.writeInt(1);
                sendUndoProcess.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IUndoMulProcessProxy", "call method showSendUndo throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IUndoMulProcessProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}
