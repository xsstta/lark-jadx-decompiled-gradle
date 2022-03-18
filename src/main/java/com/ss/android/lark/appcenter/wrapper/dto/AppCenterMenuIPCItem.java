package com.ss.android.lark.appcenter.wrapper.dto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.appcenter.p1262a.p1264b.C27552a;

public class AppCenterMenuIPCItem implements Parcelable {
    public static final Parcelable.Creator<AppCenterMenuIPCItem> CREATOR = new Parcelable.Creator<AppCenterMenuIPCItem>() {
        /* class com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem.C291401 */

        /* renamed from: a */
        public AppCenterMenuIPCItem[] newArray(int i) {
            return new AppCenterMenuIPCItem[i];
        }

        /* renamed from: a */
        public AppCenterMenuIPCItem createFromParcel(Parcel parcel) {
            return new AppCenterMenuIPCItem(parcel);
        }
    };

    /* renamed from: a */
    private int f72954a;

    /* renamed from: b */
    private String f72955b;

    /* renamed from: c */
    private boolean f72956c;

    /* renamed from: d */
    private String f72957d;

    /* renamed from: e */
    private String f72958e;

    /* renamed from: f */
    private String f72959f;

    /* renamed from: g */
    private String f72960g;

    /* renamed from: h */
    private AbstractC29143b f72961h;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo103397a() {
        return this.f72954a;
    }

    /* renamed from: b */
    public String mo103398b() {
        return this.f72955b;
    }

    /* renamed from: c */
    public boolean mo103399c() {
        return this.f72956c;
    }

    /* renamed from: d */
    public String mo103400d() {
        return this.f72957d;
    }

    /* renamed from: e */
    public String mo103402e() {
        return this.f72958e;
    }

    /* renamed from: f */
    public String mo103403f() {
        return this.f72959f;
    }

    /* renamed from: g */
    public String mo103404g() {
        return this.f72960g;
    }

    /* renamed from: h */
    public AbstractC29143b mo103405h() {
        return this.f72961h;
    }

    protected AppCenterMenuIPCItem(Parcel parcel) {
        boolean z;
        this.f72954a = parcel.readInt();
        this.f72955b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f72956c = z;
        this.f72957d = parcel.readString();
        this.f72958e = parcel.readString();
        this.f72959f = parcel.readString();
        this.f72960g = parcel.readString();
        this.f72961h = ManisOnClickListenerStub.asInterface(parcel.readStrongBinder());
    }

    public AppCenterMenuIPCItem(final C27552a aVar) {
        this.f72955b = aVar.f68761a;
        this.f72954a = aVar.f68762b;
        this.f72956c = aVar.f68763c;
        this.f72957d = aVar.f68765e;
        this.f72958e = aVar.f68766f;
        this.f72959f = aVar.f68767g;
        this.f72960g = aVar.f68764d;
        this.f72961h = new AbstractC29143b() {
            /* class com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem.C291412 */

            @Override // com.ss.android.lark.appcenter.wrapper.dto.AbstractC29143b
            public void onClick(Bundle bundle) {
                if (aVar.f68768h != null) {
                    aVar.f68768h.onClick(bundle);
                }
            }
        };
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f72954a);
        parcel.writeString(this.f72955b);
        parcel.writeByte(this.f72956c ? (byte) 1 : 0);
        parcel.writeString(this.f72957d);
        parcel.writeString(this.f72958e);
        parcel.writeString(this.f72959f);
        parcel.writeString(this.f72960g);
        parcel.writeStrongBinder(new ManisOnClickListenerStub(this.f72961h));
    }
}
