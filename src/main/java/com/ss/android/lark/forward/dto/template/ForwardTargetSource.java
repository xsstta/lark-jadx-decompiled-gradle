package com.ss.android.lark.forward.dto.template;

import android.os.Parcel;
import android.os.Parcelable;

public class ForwardTargetSource implements Parcelable {
    public static final Parcelable.Creator<ForwardTargetSource> CREATOR = new Parcelable.Creator<ForwardTargetSource>() {
        /* class com.ss.android.lark.forward.dto.template.ForwardTargetSource.C384011 */

        /* renamed from: a */
        public ForwardTargetSource[] newArray(int i) {
            return new ForwardTargetSource[i];
        }

        /* renamed from: a */
        public ForwardTargetSource createFromParcel(Parcel parcel) {
            return new ForwardTargetSource(parcel);
        }
    };

    /* renamed from: a */
    private boolean f98741a;

    /* renamed from: b */
    private boolean f98742b;

    /* renamed from: c */
    private boolean f98743c;

    public int describeContents() {
        return 0;
    }

    private ForwardTargetSource() {
    }

    /* renamed from: a */
    public boolean mo140854a() {
        return this.f98741a;
    }

    /* renamed from: b */
    public boolean mo140856b() {
        return this.f98742b;
    }

    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardTargetSource$a */
    public static class C38402a {

        /* renamed from: a */
        private boolean f98744a = true;

        /* renamed from: b */
        private boolean f98745b = true;

        /* renamed from: c */
        private boolean f98746c = true;

        /* renamed from: a */
        public static ForwardTargetSource m151436a() {
            return new C38402a().mo140866b();
        }

        /* renamed from: b */
        public ForwardTargetSource mo140866b() {
            ForwardTargetSource forwardTargetSource = new ForwardTargetSource();
            forwardTargetSource.mo140855b(this.f98745b);
            forwardTargetSource.mo140853a(this.f98744a);
            forwardTargetSource.mo140857c(this.f98746c);
            return forwardTargetSource;
        }

        /* renamed from: a */
        public C38402a mo140864a(boolean z) {
            this.f98744a = z;
            return this;
        }

        /* renamed from: b */
        public C38402a mo140865b(boolean z) {
            this.f98745b = z;
            return this;
        }
    }

    /* renamed from: a */
    public void mo140853a(boolean z) {
        this.f98741a = z;
    }

    /* renamed from: b */
    public void mo140855b(boolean z) {
        this.f98742b = z;
    }

    /* renamed from: c */
    public void mo140857c(boolean z) {
        this.f98743c = z;
    }

    protected ForwardTargetSource(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f98741a = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f98742b = z2;
        this.f98743c = parcel.readByte() == 0 ? false : z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f98741a ? (byte) 1 : 0);
        parcel.writeByte(this.f98742b ? (byte) 1 : 0);
        parcel.writeByte(this.f98743c ? (byte) 1 : 0);
    }
}
