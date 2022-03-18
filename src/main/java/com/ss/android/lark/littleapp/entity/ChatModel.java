package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class ChatModel implements Parcelable {
    public static final Parcelable.Creator<ChatModel> CREATOR = new Parcelable.Creator<ChatModel>() {
        /* class com.ss.android.lark.littleapp.entity.ChatModel.C413271 */

        /* renamed from: a */
        public ChatModel[] newArray(int i) {
            return new ChatModel[i];
        }

        /* renamed from: a */
        public ChatModel createFromParcel(Parcel parcel) {
            return new ChatModel(parcel);
        }
    };

    /* renamed from: a */
    String f105117a;

    /* renamed from: b */
    String f105118b;

    /* renamed from: c */
    String f105119c;

    public int describeContents() {
        return 0;
    }

    public ChatModel() {
    }

    /* renamed from: a */
    public String mo148774a() {
        return this.f105117a;
    }

    /* renamed from: b */
    public String mo148775b() {
        return this.f105118b;
    }

    /* renamed from: c */
    public String mo148776c() {
        return this.f105119c;
    }

    public String toString() {
        return "ChatModel{" + "chatId='" + this.f105117a + '\'' + ", chatName='" + this.f105118b + '\'' + ", chatAvatar='" + '}';
    }

    protected ChatModel(Parcel parcel) {
        this.f105117a = parcel.readString();
        this.f105118b = parcel.readString();
        this.f105119c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105117a);
        parcel.writeString(this.f105118b);
        parcel.writeSerializable(this.f105119c);
    }

    public ChatModel(String str, String str2, String str3) {
        this.f105117a = str;
        this.f105118b = str2;
        this.f105119c = str3;
    }
}
