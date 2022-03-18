package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MailMessageDeliveryState implements Parcelable {
    public static final Parcelable.Creator<MailMessageDeliveryState> CREATOR = new Parcelable.Creator<MailMessageDeliveryState>() {
        /* class com.ss.android.lark.mail.impl.entity.MailMessageDeliveryState.C420771 */

        /* renamed from: a */
        public MailMessageDeliveryState[] newArray(int i) {
            return new MailMessageDeliveryState[i];
        }

        /* renamed from: a */
        public MailMessageDeliveryState createFromParcel(Parcel parcel) {
            return new MailMessageDeliveryState(parcel);
        }
    };

    /* renamed from: a */
    private int f106946a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    public int describeContents() {
        return 0;
    }

    public MailMessageDeliveryState() {
    }

    /* renamed from: a */
    public int mo151632a() {
        return this.f106946a;
    }

    /* renamed from: a */
    public void mo151633a(int i) {
        this.f106946a = i;
    }

    public MailMessageDeliveryState(Parcel parcel) {
        this.f106946a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f106946a);
    }
}
