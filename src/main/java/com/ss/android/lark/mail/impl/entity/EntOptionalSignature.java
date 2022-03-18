package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class EntOptionalSignature implements Parcelable {
    public static final Parcelable.Creator<EntOptionalSignature> CREATOR = new Parcelable.Creator<EntOptionalSignature>() {
        /* class com.ss.android.lark.mail.impl.entity.EntOptionalSignature.C420601 */

        /* renamed from: a */
        public EntOptionalSignature[] newArray(int i) {
            return new EntOptionalSignature[i];
        }

        /* renamed from: a */
        public EntOptionalSignature createFromParcel(Parcel parcel) {
            return new EntOptionalSignature(parcel);
        }
    };

    /* renamed from: a */
    private List<String> f106761a;

    /* renamed from: b */
    private boolean f106762b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public List<String> mo151160a() {
        return this.f106761a;
    }

    /* renamed from: b */
    public boolean mo151163b() {
        return this.f106762b;
    }

    public EntOptionalSignature() {
        this.f106761a = new ArrayList();
    }

    /* renamed from: a */
    public void mo151161a(List<String> list) {
        this.f106761a = list;
    }

    /* renamed from: a */
    public void mo151162a(boolean z) {
        this.f106762b = z;
    }

    protected EntOptionalSignature(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f106761a = arrayList;
        arrayList.clear();
        parcel.readStringList(this.f106761a);
        this.f106762b = parcel.readInt() != 1 ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f106761a);
        parcel.writeInt(this.f106762b ? 1 : 0);
    }
}
