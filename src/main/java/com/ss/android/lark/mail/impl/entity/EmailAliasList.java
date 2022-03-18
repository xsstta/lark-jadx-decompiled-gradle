package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.mail.impl.C41816b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EmailAliasList implements Parcelable {
    public static final Parcelable.Creator<EmailAliasList> CREATOR = new Parcelable.Creator<EmailAliasList>() {
        /* class com.ss.android.lark.mail.impl.entity.EmailAliasList.C420571 */

        /* renamed from: a */
        public EmailAliasList[] newArray(int i) {
            return new EmailAliasList[i];
        }

        /* renamed from: a */
        public EmailAliasList createFromParcel(Parcel parcel) {
            return new EmailAliasList(parcel);
        }
    };
    @SerializedName("enable")
    @Expose

    /* renamed from: a */
    private boolean f106738a = true;
    @SerializedName("default")
    @Expose

    /* renamed from: b */
    private MailAddress f106739b;
    @SerializedName("primary")
    @Expose

    /* renamed from: c */
    private MailAddress f106740c;
    @SerializedName("accounts")
    @Expose

    /* renamed from: d */
    private List<MailAddress> f106741d = new ArrayList();

    /* renamed from: e */
    private Map<String, MailAddress> f106742e = new HashMap();

    public int describeContents() {
        return 0;
    }

    /* renamed from: d */
    public List<MailAddress> mo151122d() {
        return this.f106741d;
    }

    /* renamed from: a */
    public boolean mo151116a() {
        return this.f106738a;
    }

    public EmailAliasList() {
    }

    /* renamed from: b */
    public MailAddress mo151118b() {
        if (this.f106739b != null || this.f106741d.isEmpty()) {
            return this.f106739b;
        }
        return this.f106741d.get(0);
    }

    /* renamed from: c */
    public MailAddress mo151120c() {
        if (this.f106740c != null || this.f106741d.isEmpty()) {
            return this.f106740c;
        }
        return this.f106741d.get(0);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f106738a), this.f106739b, this.f106740c, this.f106741d);
    }

    public String toString() {
        if (!C41816b.m166115a().mo150143j()) {
            return super.toString();
        }
        return "EmailAliasList{enable=" + this.f106738a + ", defaultAddress=" + this.f106739b + ", primaryAddress=" + this.f106740c + ", mailAccounts=" + this.f106741d + '}';
    }

    /* renamed from: a */
    public void mo151113a(MailAddress mailAddress) {
        this.f106739b = mailAddress;
    }

    /* renamed from: b */
    public void mo151119b(MailAddress mailAddress) {
        this.f106740c = mailAddress;
    }

    /* renamed from: a */
    public void mo151115a(boolean z) {
        this.f106738a = z;
    }

    /* renamed from: c */
    public MailAddress mo151121c(MailAddress mailAddress) {
        List<MailAddress> list;
        MailAddress mailAddress2 = this.f106739b;
        if (mailAddress == null || (list = this.f106741d) == null || list.isEmpty()) {
            return mailAddress2;
        }
        for (MailAddress mailAddress3 : this.f106741d) {
            if (TextUtils.equals(mailAddress.mo151182e(), mailAddress3.mo151182e())) {
                return mailAddress3;
            }
        }
        return mailAddress2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailAliasList emailAliasList = (EmailAliasList) obj;
        if (this.f106738a != emailAliasList.f106738a || !m167280a(this.f106739b, emailAliasList.f106739b) || !m167280a(this.f106740c, emailAliasList.f106740c) || !m167281a(this.f106741d, emailAliasList.f106741d)) {
            return false;
        }
        return true;
    }

    public EmailAliasList(Parcel parcel) {
        boolean z = true;
        this.f106738a = parcel.readInt() != 1 ? false : z;
        this.f106739b = (MailAddress) parcel.readParcelable(MailAddress.class.getClassLoader());
        this.f106740c = (MailAddress) parcel.readParcelable(MailAddress.class.getClassLoader());
        parcel.readTypedList(this.f106741d, MailAddress.CREATOR);
    }

    /* renamed from: a */
    public void mo151114a(List<MailAddress> list) {
        if (list != null) {
            this.f106741d.clear();
            this.f106741d.addAll(list);
            this.f106742e.clear();
            for (MailAddress mailAddress : list) {
                if (!TextUtils.isEmpty(mailAddress.mo151182e())) {
                    this.f106742e.put(mailAddress.mo151182e(), mailAddress);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo151117a(String str) {
        if (TextUtils.isEmpty(str) || this.f106742e.get(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m167280a(MailAddress mailAddress, MailAddress mailAddress2) {
        if (mailAddress == mailAddress2) {
            return true;
        }
        if (mailAddress == null || mailAddress2 == null) {
            return false;
        }
        return TextUtils.equals(mailAddress.mo151197r(), mailAddress2.mo151197r());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f106738a ? 1 : 0);
        parcel.writeParcelable(this.f106739b, i);
        parcel.writeParcelable(this.f106740c, i);
        parcel.writeTypedList(this.f106741d);
    }

    /* renamed from: a */
    private boolean m167281a(List<MailAddress> list, List<MailAddress> list2) {
        if (list == list2) {
            return true;
        }
        if (!(list == null || list2 == null)) {
            if (list.isEmpty()) {
                return list2.isEmpty();
            }
            int size = list.size();
            if (size == list2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!m167280a(list.get(i), list2.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
