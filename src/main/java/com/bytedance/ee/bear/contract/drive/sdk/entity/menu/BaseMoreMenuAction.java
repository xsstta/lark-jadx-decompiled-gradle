package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.log.C13479a;

public class BaseMoreMenuAction implements Parcelable {
    public static final Parcelable.Creator<BaseMoreMenuAction> CREATOR = new Parcelable.Creator<BaseMoreMenuAction>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction.C51421 */

        /* renamed from: a */
        public BaseMoreMenuAction[] newArray(int i) {
            return new BaseMoreMenuAction[i];
        }

        /* renamed from: a */
        public BaseMoreMenuAction createFromParcel(Parcel parcel) {
            return new BaseMoreMenuAction(parcel);
        }
    };

    /* renamed from: a */
    protected BinderMenuAction f14885a;

    /* renamed from: b */
    protected int f14886b;

    /* renamed from: c */
    protected Bundle f14887c;

    /* renamed from: d */
    protected BaseOpenEntity f14888d;

    /* renamed from: e */
    private String f14889e;

    /* renamed from: f */
    private boolean f14890f;

    /* renamed from: g */
    private int f14891g;

    /* renamed from: h */
    private boolean f14892h;

    /* renamed from: i */
    private boolean f14893i;

    /* renamed from: com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction$a */
    interface AbstractC5143a {
        void action(Bundle bundle);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo20433a() {
        return this.f14886b;
    }

    /* renamed from: b */
    public BinderMenuAction mo20438b() {
        return this.f14885a;
    }

    /* renamed from: e */
    public boolean mo20444e() {
        return this.f14890f;
    }

    /* renamed from: f */
    public int mo20445f() {
        return this.f14891g;
    }

    /* renamed from: g */
    public boolean mo20446g() {
        return this.f14892h;
    }

    /* renamed from: h */
    public boolean mo20447h() {
        return this.f14893i;
    }

    /* renamed from: c */
    public void mo20440c() {
        C13479a.m54764b("DriveSdk#AbsMoreMenuAction", "execute() ");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo20442d() {
        return this.f14888d instanceof LocalOpenEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo20448i() {
        BinderMenuAction binderMenuAction = this.f14885a;
        if (binderMenuAction == null) {
            return false;
        }
        try {
            binderMenuAction.action(this.f14887c);
            C13479a.m54764b("DriveSdk#AbsMoreMenuAction", "handleProxyAction() exec proxy action done.");
            return true;
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#AbsMoreMenuAction", "executeProxy() error=", th);
            return true;
        }
    }

    /* renamed from: c */
    public void mo20441c(boolean z) {
        this.f14893i = z;
    }

    /* renamed from: a */
    public void mo20434a(int i) {
        this.f14891g = i;
    }

    /* renamed from: b */
    public void mo20439b(boolean z) {
        this.f14892h = z;
    }

    /* renamed from: a */
    public void mo20435a(BinderMenuAction binderMenuAction) {
        this.f14885a = binderMenuAction;
    }

    protected BaseMoreMenuAction(int i) {
        this.f14889e = "";
        this.f14890f = true;
        this.f14891g = -1;
        this.f14892h = true;
        this.f14893i = true;
        this.f14886b = i;
    }

    /* renamed from: a */
    public void mo20436a(BaseOpenEntity baseOpenEntity) {
        this.f14888d = baseOpenEntity;
    }

    /* renamed from: a */
    public void mo20437a(boolean z) {
        this.f14890f = z;
    }

    protected BaseMoreMenuAction(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f14889e = "";
        boolean z3 = true;
        this.f14890f = true;
        this.f14891g = -1;
        this.f14892h = true;
        this.f14893i = true;
        try {
            this.f14885a = BinderMenuAction.Stub.asInterface(parcel.readStrongBinder());
            this.f14886b = parcel.readInt();
            this.f14887c = parcel.readBundle();
            this.f14889e = parcel.readString();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f14890f = z;
            this.f14891g = parcel.readInt();
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f14892h = z2;
            if (parcel.readByte() == 0) {
                z3 = false;
            }
            this.f14893i = z3;
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#AbsMoreMenuAction", "AbsMoreMenuAction#writeToAbsMoreMenuAction(Parcel) error=", th);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int i2;
        byte b;
        try {
            BinderMenuAction binderMenuAction = this.f14885a;
            if (binderMenuAction == null) {
                iBinder = null;
            } else {
                iBinder = binderMenuAction.asBinder();
            }
            parcel.writeStrongBinder(iBinder);
            parcel.writeInt(this.f14886b);
            parcel.writeBundle(this.f14887c);
            parcel.writeString(this.f14889e);
            byte b2 = 1;
            if (this.f14890f) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeInt(this.f14891g);
            if (this.f14892h) {
                b = 1;
            } else {
                b = 0;
            }
            parcel.writeByte(b);
            if (!this.f14893i) {
                b2 = 0;
            }
            parcel.writeByte(b2);
        } catch (Throwable th) {
            C13479a.m54759a("DriveSdk#AbsMoreMenuAction", "AbsMoreMenuAction#writeToParcel() error=", th);
        }
    }
}
