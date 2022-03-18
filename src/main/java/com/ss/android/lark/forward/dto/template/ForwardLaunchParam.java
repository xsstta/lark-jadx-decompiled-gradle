package com.ss.android.lark.forward.dto.template;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ForwardLaunchParam implements Parcelable {
    public static final Parcelable.Creator<ForwardLaunchParam> CREATOR = new Parcelable.Creator<ForwardLaunchParam>() {
        /* class com.ss.android.lark.forward.dto.template.ForwardLaunchParam.C383951 */

        /* renamed from: a */
        public ForwardLaunchParam[] newArray(int i) {
            return new ForwardLaunchParam[i];
        }

        /* renamed from: a */
        public ForwardLaunchParam createFromParcel(Parcel parcel) {
            return new ForwardLaunchParam(parcel);
        }
    };

    /* renamed from: a */
    private int f98719a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {
    }

    public int describeContents() {
        return 0;
    }

    private ForwardLaunchParam() {
    }

    /* renamed from: a */
    public int mo140805a() {
        return this.f98719a;
    }

    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardLaunchParam$a */
    public static class C38396a {

        /* renamed from: a */
        private int f98720a;

        /* renamed from: a */
        public static ForwardLaunchParam m151394a() {
            return new C38396a().mo140814b();
        }

        /* renamed from: b */
        public ForwardLaunchParam mo140814b() {
            ForwardLaunchParam forwardLaunchParam = new ForwardLaunchParam();
            forwardLaunchParam.mo140806a(this.f98720a);
            return forwardLaunchParam;
        }

        /* renamed from: a */
        public C38396a mo140813a(int i) {
            this.f98720a = i;
            return this;
        }
    }

    /* renamed from: a */
    public void mo140806a(int i) {
        this.f98719a = i;
    }

    protected ForwardLaunchParam(Parcel parcel) {
        this.f98719a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f98719a);
    }
}
