package com.ss.android.lark.widget.linked_emojicon.base.emoji;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Emojicon implements Parcelable {
    public static final Parcelable.Creator<Emojicon> CREATOR = new Parcelable.Creator<Emojicon>() {
        /* class com.ss.android.lark.widget.linked_emojicon.base.emoji.Emojicon.C585051 */

        /* renamed from: a */
        public Emojicon[] newArray(int i) {
            return new Emojicon[i];
        }

        /* renamed from: a */
        public Emojicon createFromParcel(Parcel parcel) {
            return new Emojicon(parcel);
        }
    };

    /* renamed from: a */
    private int f144363a;

    /* renamed from: b */
    private char f144364b;

    /* renamed from: c */
    private String f144365c;

    public @interface Alignment {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public int describeContents() {
        return 0;
    }

    private Emojicon() {
    }

    /* renamed from: a */
    public String mo198302a() {
        return this.f144365c;
    }

    public int hashCode() {
        return this.f144365c.hashCode();
    }

    /* renamed from: a */
    public static Emojicon m226971a(String str) {
        Emojicon emojicon = new Emojicon();
        emojicon.f144365c = str;
        return emojicon;
    }

    public Emojicon(Parcel parcel) {
        this.f144363a = parcel.readInt();
        this.f144364b = (char) parcel.readInt();
        this.f144365c = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Emojicon) || !this.f144365c.equals(((Emojicon) obj).f144365c)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f144363a);
        parcel.writeInt(this.f144364b);
        parcel.writeString(this.f144365c);
    }
}
