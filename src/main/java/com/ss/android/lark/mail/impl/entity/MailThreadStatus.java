package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MailThreadStatus implements Parcelable {
    public static final Parcelable.Creator<MailThreadStatus> CREATOR = new Parcelable.Creator<MailThreadStatus>() {
        /* class com.ss.android.lark.mail.impl.entity.MailThreadStatus.C420811 */

        /* renamed from: a */
        public MailThreadStatus[] newArray(int i) {
            return new MailThreadStatus[i];
        }

        /* renamed from: a */
        public MailThreadStatus createFromParcel(Parcel parcel) {
            return new MailThreadStatus(parcel);
        }
    };

    /* renamed from: a */
    private int f106988a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    public int describeContents() {
        return 0;
    }

    public MailThreadStatus() {
    }

    /* renamed from: a */
    public boolean mo151738a() {
        if ((this.f106988a & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo151739b() {
        if ((this.f106988a & 64) == 64) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo151740c() {
        if ((this.f106988a & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo151741d() {
        if ((this.f106988a & 16) == 16) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo151743e() {
        if ((this.f106988a & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo151744f() {
        if ((this.f106988a & DynamicModule.f58006b) == 256) {
            return true;
        }
        return false;
    }

    public MailThreadStatus(Parcel parcel) {
        this.f106988a = parcel.readInt();
    }

    /* renamed from: a */
    public void mo151737a(int i) {
        int i2 = this.f106988a | i;
        this.f106988a = i2;
        if (i == 2) {
            this.f106988a = i2 & -5;
        } else if (i == 4) {
            this.f106988a = i2 & -3;
        } else if (i == 8) {
            this.f106988a = i2 & -17;
        } else if (i == 16) {
            this.f106988a = i2 & -9;
        } else if (i == 32) {
            this.f106988a = i2 & -65;
        } else if (i == 64) {
            this.f106988a = i2 & -33;
        } else if (i == 128) {
            this.f106988a = i2 & -257;
        } else if (i == 256) {
            this.f106988a = i2 & -129;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f106988a);
    }
}
