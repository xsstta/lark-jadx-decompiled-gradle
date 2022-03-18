package com.ss.android.lark.mail.impl.settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.settings.a */
public class C43391a {
    @SerializedName("visible")
    @Expose

    /* renamed from: a */
    private boolean f110275a;
    @SerializedName("open")
    @Expose

    /* renamed from: b */
    private boolean f110276b;

    /* renamed from: a */
    public boolean mo155170a() {
        return this.f110275a;
    }

    /* renamed from: b */
    public boolean mo155172b() {
        return this.f110276b;
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.a$a */
    public static class C43393a {

        /* renamed from: a */
        private boolean f110277a;

        /* renamed from: b */
        private boolean f110278b;

        /* renamed from: a */
        public C43391a mo155176a() {
            return new C43391a(this.f110277a, this.f110278b);
        }
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f110275a), Boolean.valueOf(this.f110276b));
    }

    public String toString() {
        return "EmailSmartInbox{userOpen=" + this.f110276b + '}';
    }

    /* renamed from: a */
    public void mo155169a(boolean z) {
        this.f110275a = z;
    }

    /* renamed from: b */
    public void mo155171b(boolean z) {
        this.f110276b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C43391a aVar = (C43391a) obj;
        if (this.f110275a == aVar.f110275a && this.f110276b == aVar.f110276b) {
            return true;
        }
        return false;
    }

    private C43391a(boolean z, boolean z2) {
        this.f110275a = z;
        this.f110276b = z2;
    }
}
