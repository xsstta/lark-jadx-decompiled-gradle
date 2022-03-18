package com.ss.android.lark.mail.impl.message.pageroute.intantinfo;

import android.os.Parcel;
import android.os.Parcelable;

public class ForwardToChatMessageListIntentInfo extends MessageListIntenInfo {
    public static final Parcelable.Creator<ForwardToChatMessageListIntentInfo> CREATOR = new Parcelable.Creator<ForwardToChatMessageListIntentInfo>() {
        /* class com.ss.android.lark.mail.impl.message.pageroute.intantinfo.ForwardToChatMessageListIntentInfo.C429511 */

        /* renamed from: a */
        public ForwardToChatMessageListIntentInfo[] newArray(int i) {
            return new ForwardToChatMessageListIntentInfo[0];
        }

        /* renamed from: a */
        public ForwardToChatMessageListIntentInfo createFromParcel(Parcel parcel) {
            return new ForwardToChatMessageListIntentInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f109377a;

    /* renamed from: b */
    private String f109378b;

    /* renamed from: a */
    public String mo154041a() {
        return this.f109377a;
    }

    /* renamed from: b */
    public String mo154042b() {
        return this.f109378b;
    }

    public ForwardToChatMessageListIntentInfo(Parcel parcel) {
        super(parcel);
        this.f109377a = parcel.readString();
        this.f109378b = parcel.readString();
    }

    @Override // com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f109377a);
        parcel.writeString(this.f109378b);
    }

    public ForwardToChatMessageListIntentInfo(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        super(str, str2, str3, i, str6);
        this.f109377a = str4;
        this.f109378b = str5;
    }
}
