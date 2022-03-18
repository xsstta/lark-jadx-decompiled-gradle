package com.bytedance.ee.bear.drivesdk.plugin.model.menu;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveCallback;
import com.bytedance.ee.log.C13479a;

public class SaveToLocalMenu extends BaseMoreMenuAction {
    public static final Parcelable.Creator<SaveToLocalMenu> CREATOR = new Parcelable.Creator<SaveToLocalMenu>() {
        /* class com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenu.C75801 */

        /* renamed from: a */
        public SaveToLocalMenu[] newArray(int i) {
            return new SaveToLocalMenu[i];
        }

        /* renamed from: a */
        public SaveToLocalMenu createFromParcel(Parcel parcel) {
            return new SaveToLocalMenu(parcel);
        }
    };

    /* renamed from: e */
    private String f20573e;

    /* renamed from: f */
    private boolean f20574f;

    /* renamed from: g */
    private BinderSaveCallback f20575g;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo29759j() {
        return this.f20574f;
    }

    /* renamed from: k */
    public BinderSaveCallback mo29760k() {
        return this.f20575g;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: c */
    public void mo20440c() {
        super.mo20440c();
        if (mo20448i()) {
            C13479a.m54758a("SaveToLocalMenu", "SaveToLocalMenu#execute() execute proxy action done");
        }
    }

    public SaveToLocalMenu(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo29757a(BinderSaveCallback binderSaveCallback) {
        this.f20575g = binderSaveCallback;
    }

    /* renamed from: d */
    public void mo29758d(boolean z) {
        this.f20574f = z;
    }

    protected SaveToLocalMenu(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f20573e = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20574f = z;
        this.f20575g = BinderSaveCallback.Stub.asInterface(parcel.readStrongBinder());
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f20573e);
        parcel.writeByte(this.f20574f ? (byte) 1 : 0);
        BinderSaveCallback binderSaveCallback = this.f20575g;
        if (binderSaveCallback == null) {
            iBinder = null;
        } else {
            iBinder = binderSaveCallback.asBinder();
        }
        parcel.writeStrongBinder(iBinder);
    }
}
