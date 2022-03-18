package com.bytedance.ee.bear.drivesdk.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;

public class ShowErrorPageAction implements PreviewAction {
    public static final Parcelable.Creator<ShowErrorPageAction> CREATOR = new Parcelable.Creator<ShowErrorPageAction>() {
        /* class com.bytedance.ee.bear.drivesdk.action.ShowErrorPageAction.C75741 */

        /* renamed from: a */
        public ShowErrorPageAction[] newArray(int i) {
            return new ShowErrorPageAction[i];
        }

        /* renamed from: a */
        public ShowErrorPageAction createFromParcel(Parcel parcel) {
            return new ShowErrorPageAction(parcel);
        }
    };

    /* renamed from: a */
    private String f20567a;

    /* renamed from: b */
    private int f20568b;

    /* renamed from: c */
    private boolean f20569c;

    /* renamed from: d */
    private boolean f20570d;

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public int mo29725b() {
        return this.f20568b;
    }

    /* renamed from: c */
    public String mo29726c() {
        return this.f20567a;
    }

    /* renamed from: d */
    public boolean mo29727d() {
        return this.f20569c;
    }

    public ShowErrorPageAction() {
        this("", 0);
    }

    /* renamed from: a */
    public boolean mo29724a() {
        return this.f20570d;
    }

    /* renamed from: a */
    public void mo29723a(boolean z) {
        this.f20570d = z;
    }

    protected ShowErrorPageAction(Parcel parcel) {
        boolean z;
        this.f20567a = parcel.readString();
        this.f20568b = parcel.readInt();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20569c = z;
        this.f20570d = parcel.readByte() == 0 ? false : z2;
    }

    public ShowErrorPageAction(String str, int i) {
        this.f20567a = str;
        this.f20568b = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20567a);
        parcel.writeInt(this.f20568b);
        parcel.writeByte(this.f20569c ? (byte) 1 : 0);
        parcel.writeByte(this.f20570d ? (byte) 1 : 0);
    }

    public ShowErrorPageAction(String str, boolean z) {
        this.f20567a = str;
        this.f20569c = z;
    }

    public ShowErrorPageAction(String str, int i, boolean z) {
        this.f20567a = str;
        this.f20568b = i;
        this.f20569c = z;
    }
}
