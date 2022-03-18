package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.site.C23738a;

public class Word implements Parcelable {
    public static final Parcelable.Creator<Word> CREATOR = new Parcelable.Creator<Word>() {
        /* class com.huawei.hms.site.api.model.Word.C237471 */

        @Override // android.os.Parcelable.Creator
        public Word createFromParcel(Parcel parcel) {
            return new Word(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Word[] newArray(int i) {
            return new Word[i];
        }
    };
    public int offset;
    public String value;

    public Word(int i, String str) {
        this.offset = i;
        this.value = str;
    }

    public Word(Parcel parcel) {
        this.offset = parcel.readInt();
        this.value = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public int getOffset() {
        return this.offset;
    }

    public String getValue() {
        return this.value;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder a = C23738a.m86922a("Word{offset=");
        a.append(this.offset);
        a.append(", value=");
        a.append(this.value);
        a.append('}');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.offset);
        parcel.writeString(this.value);
    }
}
