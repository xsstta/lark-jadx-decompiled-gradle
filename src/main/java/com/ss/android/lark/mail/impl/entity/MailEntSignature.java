package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class MailEntSignature implements Parcelable {
    public static final Parcelable.Creator<MailEntSignature> CREATOR = new Parcelable.Creator<MailEntSignature>() {
        /* class com.ss.android.lark.mail.impl.entity.MailEntSignature.C420691 */

        /* renamed from: a */
        public MailEntSignature[] newArray(int i) {
            return new MailEntSignature[i];
        }

        /* renamed from: a */
        public MailEntSignature createFromParcel(Parcel parcel) {
            return new MailEntSignature(parcel);
        }
    };

    /* renamed from: a */
    private String f106840a;

    /* renamed from: b */
    private String f106841b;

    /* renamed from: c */
    private String f106842c;

    /* renamed from: d */
    private String f106843d;

    /* renamed from: e */
    private List<MailImage> f106844e;

    /* renamed from: f */
    private SignatureType f106845f;

    /* renamed from: g */
    private SignatureDevice f106846g;

    /* renamed from: h */
    private boolean f106847h;

    public int describeContents() {
        return 0;
    }

    public MailEntSignature() {
    }

    /* renamed from: a */
    public String mo151380a() {
        return this.f106840a;
    }

    /* renamed from: b */
    public String mo151386b() {
        return this.f106841b;
    }

    /* renamed from: c */
    public String mo151388c() {
        return this.f106842c;
    }

    /* renamed from: d */
    public String mo151390d() {
        return this.f106843d;
    }

    /* renamed from: e */
    public List<MailImage> mo151393e() {
        return this.f106844e;
    }

    /* renamed from: f */
    public SignatureType mo151394f() {
        return this.f106845f;
    }

    /* renamed from: g */
    public boolean mo151395g() {
        return this.f106847h;
    }

    /* renamed from: a */
    public void mo151381a(SignatureDevice signatureDevice) {
        this.f106846g = signatureDevice;
    }

    /* renamed from: b */
    public void mo151387b(String str) {
        this.f106841b = str;
    }

    /* renamed from: c */
    public void mo151389c(String str) {
        this.f106842c = str;
    }

    /* renamed from: d */
    public void mo151391d(String str) {
        this.f106843d = str;
    }

    /* renamed from: a */
    public void mo151382a(SignatureType signatureType) {
        this.f106845f = signatureType;
    }

    /* renamed from: a */
    public void mo151383a(String str) {
        this.f106840a = str;
    }

    /* renamed from: a */
    public void mo151384a(List<MailImage> list) {
        this.f106844e = list;
    }

    protected MailEntSignature(Parcel parcel) {
        this.f106840a = parcel.readString();
        this.f106841b = parcel.readString();
        this.f106842c = parcel.readString();
        this.f106843d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f106844e = arrayList;
        parcel.readTypedList(arrayList, MailImage.CREATOR);
        this.f106845f = (SignatureType) parcel.readParcelable(SignatureType.class.getClassLoader());
        this.f106846g = (SignatureDevice) parcel.readParcelable(SignatureDevice.class.getClassLoader());
        this.f106847h = parcel.readInt() != 1 ? false : true;
    }

    /* renamed from: a */
    public void mo151385a(boolean z) {
        this.f106847h = z;
    }

    public enum SignatureDevice implements Parcelable {
        PC,
        MOBILE;
        
        public static final Parcelable.Creator<SignatureDevice> CREATOR = new Parcelable.Creator<SignatureDevice>() {
            /* class com.ss.android.lark.mail.impl.entity.MailEntSignature.SignatureDevice.C420701 */

            /* renamed from: a */
            public SignatureDevice[] newArray(int i) {
                return new SignatureDevice[i];
            }

            /* renamed from: a */
            public SignatureDevice createFromParcel(Parcel parcel) {
                return SignatureDevice.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum SignatureType implements Parcelable {
        PERSONAL,
        CORPORATE;
        
        public static final Parcelable.Creator<SignatureType> CREATOR = new Parcelable.Creator<SignatureType>() {
            /* class com.ss.android.lark.mail.impl.entity.MailEntSignature.SignatureType.C420711 */

            /* renamed from: a */
            public SignatureType[] newArray(int i) {
                return new SignatureType[i];
            }

            /* renamed from: a */
            public SignatureType createFromParcel(Parcel parcel) {
                return SignatureType.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public MailEntSignature(String str, String str2) {
        this.f106840a = str;
        this.f106841b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106840a);
        parcel.writeString(this.f106841b);
        parcel.writeString(this.f106842c);
        parcel.writeString(this.f106843d);
        parcel.writeTypedList(this.f106844e);
        parcel.writeParcelable(this.f106845f, i);
        parcel.writeParcelable(this.f106846g, i);
        parcel.writeInt(this.f106847h ? 1 : 0);
    }
}
