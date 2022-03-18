package com.tt.miniapp.launchaction.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class MessageTriggerInfo implements Parcelable {
    public static final Parcelable.Creator<MessageTriggerInfo> CREATOR = new Parcelable.Creator<MessageTriggerInfo>() {
        /* class com.tt.miniapp.launchaction.bean.MessageTriggerInfo.C663011 */

        /* renamed from: a */
        public MessageTriggerInfo[] newArray(int i) {
            return new MessageTriggerInfo[i];
        }

        /* renamed from: a */
        public MessageTriggerInfo createFromParcel(Parcel parcel) {
            return new MessageTriggerInfo(parcel);
        }
    };

    /* renamed from: a */
    private boolean f167323a;

    /* renamed from: b */
    private long f167324b;

    /* renamed from: c */
    private List<String> f167325c;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo231731a() {
        return this.f167323a;
    }

    /* renamed from: b */
    public long mo231732b() {
        return this.f167324b;
    }

    /* renamed from: c */
    public List<String> mo231733c() {
        return this.f167325c;
    }

    protected MessageTriggerInfo(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f167323a = z;
        this.f167324b = parcel.readLong();
        this.f167325c = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f167323a ? (byte) 1 : 0);
        parcel.writeLong(this.f167324b);
        parcel.writeStringList(this.f167325c);
    }

    public MessageTriggerInfo(boolean z, long j, List<String> list) {
        this.f167323a = z;
        this.f167324b = j;
        this.f167325c = list;
    }
}
