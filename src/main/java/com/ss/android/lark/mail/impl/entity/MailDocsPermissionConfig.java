package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;

public class MailDocsPermissionConfig implements Parcelable {
    public static final Parcelable.Creator<MailDocsPermissionConfig> CREATOR = new Parcelable.Creator<MailDocsPermissionConfig>() {
        /* class com.ss.android.lark.mail.impl.entity.MailDocsPermissionConfig.C420671 */

        /* renamed from: a */
        public MailDocsPermissionConfig[] newArray(int i) {
            return new MailDocsPermissionConfig[i];
        }

        /* renamed from: a */
        public MailDocsPermissionConfig createFromParcel(Parcel parcel) {
            return new MailDocsPermissionConfig(parcel);
        }
    };

    /* renamed from: a */
    private String f106816a;

    /* renamed from: b */
    private DocsPermissionConfig.Action f106817b;

    public int describeContents() {
        return 0;
    }

    public MailDocsPermissionConfig() {
    }

    /* renamed from: a */
    public String mo151306a() {
        return this.f106816a;
    }

    /* renamed from: b */
    public DocsPermissionConfig.Action mo151309b() {
        return this.f106817b;
    }

    /* renamed from: a */
    public void mo151307a(DocsPermissionConfig.Action action) {
        this.f106817b = action;
    }

    /* renamed from: a */
    public void mo151308a(String str) {
        this.f106816a = str;
    }

    public MailDocsPermissionConfig(Parcel parcel) {
        this.f106816a = parcel.readString();
        this.f106817b = DocsPermissionConfig.Action.fromValue(parcel.readInt());
    }

    public MailDocsPermissionConfig(String str, DocsPermissionConfig.Action action) {
        this.f106816a = str;
        this.f106817b = action;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106816a);
        parcel.writeInt(this.f106817b.getValue());
    }
}
