package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.email.client.v1.EmailClientConfig;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class MailClientConfig implements Parcelable {
    public static final Parcelable.Creator<MailClientConfig> CREATOR = new Parcelable.Creator<MailClientConfig>() {
        /* class com.ss.android.lark.mail.impl.entity.MailClientConfig.C420661 */

        /* renamed from: a */
        public MailClientConfig[] newArray(int i) {
            return new MailClientConfig[i];
        }

        /* renamed from: a */
        public MailClientConfig createFromParcel(Parcel parcel) {
            return new MailClientConfig(parcel);
        }
    };
    @SerializedName("enabled")
    @Expose

    /* renamed from: a */
    private boolean f106813a;

    /* renamed from: b */
    private String f106814b;
    @SerializedName("configStatus")
    @Expose

    /* renamed from: c */
    private EmailClientConfig.ConfigStatus f106815c;

    public int describeContents() {
        return 0;
    }

    public MailClientConfig() {
    }

    /* renamed from: b */
    public String mo151296b() {
        return this.f106814b;
    }

    /* renamed from: c */
    public EmailClientConfig.ConfigStatus mo151297c() {
        return this.f106815c;
    }

    /* renamed from: a */
    public boolean mo151295a() {
        return this.f106813a;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo151295a()), mo151296b(), mo151297c());
    }

    /* renamed from: a */
    public void mo151292a(EmailClientConfig.ConfigStatus configStatus) {
        this.f106815c = configStatus;
    }

    /* renamed from: a */
    public void mo151293a(String str) {
        this.f106814b = str;
    }

    /* renamed from: a */
    public void mo151294a(boolean z) {
        this.f106813a = z;
    }

    protected MailClientConfig(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f106813a = z;
        this.f106814b = parcel.readString();
        this.f106815c = EmailClientConfig.ConfigStatus.fromValue(parcel.readInt());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MailClientConfig mailClientConfig = (MailClientConfig) obj;
        if (mo151295a() == mailClientConfig.mo151295a() && Objects.equals(mo151296b(), mailClientConfig.mo151296b()) && mo151297c() == mailClientConfig.mo151297c()) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f106813a ? (byte) 1 : 0);
        parcel.writeString(this.f106814b);
        parcel.writeInt(this.f106815c.getValue());
    }
}
