package com.tt.miniapp.uniquechannel;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class Message implements Parcelable {
    public static final Parcelable.Creator<Message> CREATOR = new Parcelable.Creator<Message>() {
        /* class com.tt.miniapp.uniquechannel.Message.C670071 */

        /* renamed from: a */
        public Message[] newArray(int i) {
            return new Message[i];
        }

        /* renamed from: a */
        public Message createFromParcel(Parcel parcel) {
            return new Message(parcel);
        }
    };

    /* renamed from: a */
    private String f168960a;

    /* renamed from: b */
    private Bundle f168961b;

    /* renamed from: c */
    private String f168962c;

    /* renamed from: d */
    private ArrayList<String> f168963d;

    public int describeContents() {
        return 0;
    }

    public Message() {
    }

    /* renamed from: a */
    public String mo233083a() {
        return this.f168962c;
    }

    /* renamed from: b */
    public ArrayList<String> mo233084b() {
        return this.f168963d;
    }

    public Message(Parcel parcel) {
        this.f168960a = parcel.readString();
        this.f168961b = parcel.readBundle(Message.class.getClassLoader());
        this.f168962c = parcel.readString();
        this.f168963d = parcel.readArrayList(String.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f168960a);
        parcel.writeBundle(this.f168961b);
        parcel.writeString(this.f168962c);
        parcel.writeList(this.f168963d);
    }
}
