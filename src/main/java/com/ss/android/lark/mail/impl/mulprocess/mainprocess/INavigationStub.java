package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.NavigationImp;
import java.util.ArrayList;

public final class INavigationStub extends Binder implements IInterface, INavigation {
    public final NavigationImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public boolean viewFileByDrive(String str) {
        return this.base.viewFileByDrive(str);
    }

    public INavigationStub(Context context) {
        this.base = new NavigationImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void gotoFileReaderActivity(MailAttachment mailAttachment, String str) {
        this.base.gotoFileReaderActivity(mailAttachment, str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void gotoLabelMoveToView(ArrayList<String> arrayList, String str) {
        this.base.gotoLabelMoveToView(arrayList, str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void gotoReplyAddress(String str, String str2) {
        this.base.gotoReplyAddress(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public boolean viewMultiImagesByDrive(MailImage mailImage, ArrayList<MailImage> arrayList) {
        return this.base.viewMultiImagesByDrive(mailImage, arrayList);
    }

    public static INavigationProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof INavigationProxy)) {
            return new INavigationProxy(context, iBinder);
        }
        return (INavigationProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void gotoCalendar(String str, String str2, long j) {
        this.base.gotoCalendar(str, str2, j);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void sendToChat(String str, ArrayList<String> arrayList, String str2) {
        this.base.sendToChat(str, arrayList, str2);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1598968902) {
            MailImage mailImage = null;
            MailAttachment mailAttachment = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
                    gotoLabelMoveToView(parcel.readArrayList(getClass().getClassLoader()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
                    gotoCalendar(parcel.readString(), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
                    sendToChat(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
                    if (parcel.readInt() != 0) {
                        mailImage = MailImage.CREATOR.createFromParcel(parcel);
                    }
                    boolean viewMultiImagesByDrive = viewMultiImagesByDrive(mailImage, parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeInt(viewMultiImagesByDrive ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
                    boolean viewFileByDrive = viewFileByDrive(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(viewFileByDrive ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
                    if (parcel.readInt() != 0) {
                        mailAttachment = MailAttachment.CREATOR.createFromParcel(parcel);
                    }
                    gotoFileReaderActivity(mailAttachment, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
                    gotoReplyAddress(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation");
            return true;
        }
    }
}
