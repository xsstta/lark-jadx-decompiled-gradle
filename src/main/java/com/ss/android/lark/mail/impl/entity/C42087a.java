package com.ss.android.lark.mail.impl.entity;

import com.bytedance.lark.pb.email.client.v1.EmailClientConfig;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.entity.a */
public class C42087a {

    /* renamed from: a */
    public String f107024a;

    /* renamed from: b */
    public String f107025b;

    /* renamed from: c */
    public String f107026c;

    /* renamed from: d */
    public String f107027d;

    /* renamed from: e */
    public boolean f107028e;

    /* renamed from: f */
    public boolean f107029f;

    /* renamed from: g */
    public int f107030g;

    /* renamed from: h */
    private UserType f107031h;

    /* renamed from: a */
    public String mo151808a() {
        return this.f107024a;
    }

    /* renamed from: b */
    public String mo151810b() {
        return this.f107025b;
    }

    /* renamed from: c */
    public String mo151811c() {
        return this.f107026c;
    }

    /* renamed from: d */
    public String mo151812d() {
        return this.f107027d;
    }

    /* renamed from: e */
    public boolean mo151813e() {
        return this.f107029f;
    }

    /* renamed from: f */
    public UserType mo151815f() {
        UserType userType = this.f107031h;
        if (userType == null) {
            return UserType.LARK_SERVER;
        }
        return userType;
    }

    public String toString() {
        return "Account{mailAccountId='" + this.f107024a + '\'' + '}';
    }

    public int hashCode() {
        return Objects.hash(this.f107024a, this.f107025b, this.f107026c, this.f107027d, Boolean.valueOf(this.f107029f), Integer.valueOf(this.f107030g), this.f107031h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C42087a aVar = (C42087a) obj;
        if (this.f107029f != aVar.f107029f || this.f107030g != aVar.f107030g || !Objects.equals(this.f107024a, aVar.f107024a) || !Objects.equals(this.f107025b, aVar.f107025b) || !Objects.equals(this.f107026c, aVar.f107026c) || !Objects.equals(this.f107027d, aVar.f107027d) || !Objects.equals(this.f107031h, aVar.f107031h)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo151809a(UserType userType, MailClientConfig mailClientConfig, boolean z) {
        if (userType == null) {
            userType = UserType.LARK_SERVER;
        }
        this.f107031h = userType;
        if (userType == UserType.NO_PRIMARY_ADDRESS_USER) {
            this.f107030g = 3;
        } else if (this.f107031h == UserType.GMAIL_API_CLIENT || this.f107031h == UserType.EXCHANGE_API_CLIENT) {
            if (z) {
                this.f107030g = 2;
            } else {
                this.f107030g = 0;
            }
        } else if (this.f107031h == UserType.LARK_SERVER || this.f107031h == UserType.EXCHANGE_CLIENT) {
            this.f107030g = 0;
        } else if (this.f107031h == UserType.GMAIL_NEW_USER || this.f107031h == UserType.EXCHANGE_NEW_USER) {
            this.f107030g = 2;
        } else if (mailClientConfig == null) {
            this.f107030g = 0;
        } else if (mailClientConfig.mo151297c() == EmailClientConfig.ConfigStatus.EXPIRED) {
            this.f107030g = 1;
        } else if (mailClientConfig.mo151297c() == EmailClientConfig.ConfigStatus.DELETED) {
            this.f107030g = 3;
        } else {
            this.f107030g = 0;
        }
    }
}
