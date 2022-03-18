package com.ss.android.lark.mail.impl.message.pageroute.intantinfo;

import android.os.Parcel;
import android.os.Parcelable;

public class SearchMessageListIntentInfo extends MessageListIntenInfo {
    public static final Parcelable.Creator<SearchMessageListIntentInfo> CREATOR = new Parcelable.Creator<SearchMessageListIntentInfo>() {
        /* class com.ss.android.lark.mail.impl.message.pageroute.intantinfo.SearchMessageListIntentInfo.C429531 */

        /* renamed from: a */
        public SearchMessageListIntentInfo[] newArray(int i) {
            return new SearchMessageListIntentInfo[0];
        }

        /* renamed from: a */
        public SearchMessageListIntentInfo createFromParcel(Parcel parcel) {
            return new SearchMessageListIntentInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f109388a;

    /* renamed from: a */
    public String mo154064a() {
        return this.f109388a;
    }

    public SearchMessageListIntentInfo(Parcel parcel) {
        super(parcel);
        this.f109388a = parcel.readString();
    }

    @Override // com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f109388a);
    }

    public SearchMessageListIntentInfo(String str, String str2, String str3, int i, String str4, String str5) {
        super(str, str2, str3, i, str5);
        this.f109388a = str4;
    }
}
