package com.bytedance.ee.bear.drivesdk.plugin.model.menu;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class SaveToSpaceMenu extends BaseMoreMenuAction {
    public static final Parcelable.Creator<SaveToSpaceMenu> CREATOR = new Parcelable.Creator<SaveToSpaceMenu>() {
        /* class com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToSpaceMenu.C75821 */

        /* renamed from: a */
        public SaveToSpaceMenu[] newArray(int i) {
            return new SaveToSpaceMenu[i];
        }

        /* renamed from: a */
        public SaveToSpaceMenu createFromParcel(Parcel parcel) {
            return new SaveToSpaceMenu(parcel);
        }
    };

    /* renamed from: e */
    private boolean f20576e;

    /* renamed from: f */
    private BinderSaveToSpaceCallback f20577f;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo29771j() {
        return this.f20576e;
    }

    public SaveToSpaceMenu() {
        super((int) R.string.Drive_Drive_SaveToSpace);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: c */
    public void mo20440c() {
        if (mo20448i()) {
            ((AbstractC7583a) KoinJavaComponent.m268610a(AbstractC7583a.class)).mo27995a(this.f14888d, "save_to_drive", "none");
            BinderSaveToSpaceCallback binderSaveToSpaceCallback = this.f20577f;
            if (binderSaveToSpaceCallback != null) {
                binderSaveToSpaceCallback.onClick(mo29771j());
            }
        }
    }

    /* renamed from: a */
    public void mo29769a(BinderSaveToSpaceCallback binderSaveToSpaceCallback) {
        this.f20577f = binderSaveToSpaceCallback;
    }

    /* renamed from: d */
    public void mo29770d(boolean z) {
        this.f20576e = z;
        if (z) {
            this.f14886b = R.string.Drive_Sdk_ViewInSpace;
        } else {
            this.f14886b = R.string.Drive_Drive_SaveToSpace;
        }
    }

    protected SaveToSpaceMenu(Parcel parcel) {
        super(parcel);
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20576e = z;
        try {
            this.f20577f = BinderSaveToSpaceCallback.Stub.asInterface(parcel.readStrongBinder());
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#AbsMoreMenuAction", "SaveToSpaceMenu#writeToParcel() error=", th);
        }
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f20576e ? (byte) 1 : 0);
        try {
            BinderSaveToSpaceCallback binderSaveToSpaceCallback = this.f20577f;
            if (binderSaveToSpaceCallback == null) {
                iBinder = null;
            } else {
                iBinder = binderSaveToSpaceCallback.asBinder();
            }
            parcel.writeStrongBinder(iBinder);
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#AbsMoreMenuAction", "SaveToSpaceMenu#writeToParcel() error=", th);
        }
    }
}
