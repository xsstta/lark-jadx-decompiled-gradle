package com.ss.android.lark.audit.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.lark.audit.p1377a.C29283a;

public class TransactionalPermData implements Parcelable {
    public static final Parcelable.Creator<TransactionalPermData> CREATOR = new Parcelable.Creator<TransactionalPermData>() {
        /* class com.ss.android.lark.audit.auth.TransactionalPermData.C292921 */

        /* renamed from: a */
        public TransactionalPermData[] newArray(int i) {
            return new TransactionalPermData[i];
        }

        /* renamed from: a */
        public TransactionalPermData createFromParcel(Parcel parcel) {
            return new TransactionalPermData(parcel);
        }
    };

    /* renamed from: a */
    public String f73318a;

    /* renamed from: b */
    public String f73319b;

    /* renamed from: c */
    public byte[] f73320c;

    /* renamed from: d */
    public byte[] f73321d;

    public int describeContents() {
        return 0;
    }

    protected TransactionalPermData(Parcel parcel) {
        this.f73318a = parcel.readString();
        this.f73319b = parcel.readString();
        this.f73320c = parcel.createByteArray();
        this.f73321d = parcel.createByteArray();
    }

    /* renamed from: a */
    public static boolean m107668a(TransactionalPermData transactionalPermData) {
        if (transactionalPermData != null && !TextUtils.isEmpty(transactionalPermData.f73318a) && !C29283a.m107641a(transactionalPermData.f73320c) && !C29283a.m107641a(transactionalPermData.f73321d)) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f73318a);
        parcel.writeString(this.f73319b);
        parcel.writeByteArray(this.f73320c);
        parcel.writeByteArray(this.f73321d);
    }

    public TransactionalPermData(String str, String str2, byte[] bArr, byte[] bArr2) {
        this.f73318a = str;
        this.f73319b = str2;
        this.f73320c = bArr;
        this.f73321d = bArr2;
    }
}
