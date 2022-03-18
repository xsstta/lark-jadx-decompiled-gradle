package com.ss.android.lark.mail.impl.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.entity.e */
public class C42093e {
    @SerializedName("isSelected")
    @Expose

    /* renamed from: a */
    boolean f107044a;
    @SerializedName("emailSetting")
    @Expose

    /* renamed from: b */
    C42094f f107045b;
    @SerializedName("sharedAccount")
    @Expose

    /* renamed from: c */
    List<C42093e> f107046c;
    @SerializedName("uid")
    @Expose

    /* renamed from: d */
    private String f107047d;
    @SerializedName("id")
    @Expose

    /* renamed from: e */
    private String f107048e;

    /* renamed from: f */
    private String f107049f;
    @SerializedName("name")
    @Expose

    /* renamed from: g */
    private String f107050g;
    @SerializedName("address")
    @Expose

    /* renamed from: h */
    private String f107051h;

    /* renamed from: i */
    private boolean f107052i;

    /* renamed from: a */
    public String mo151843a() {
        return this.f107047d;
    }

    /* renamed from: b */
    public String mo151848b() {
        return this.f107048e;
    }

    /* renamed from: c */
    public String mo151851c() {
        return this.f107049f;
    }

    /* renamed from: d */
    public String mo151853d() {
        return this.f107050g;
    }

    /* renamed from: e */
    public String mo151855e() {
        return this.f107051h;
    }

    /* renamed from: f */
    public boolean mo151858f() {
        return this.f107052i;
    }

    /* renamed from: g */
    public boolean mo151859g() {
        return this.f107044a;
    }

    /* renamed from: h */
    public C42094f mo151860h() {
        return this.f107045b;
    }

    /* renamed from: i */
    public List<C42093e> mo151862i() {
        return this.f107046c;
    }

    public int hashCode() {
        return Objects.hash(this.f107047d, this.f107048e, this.f107049f, this.f107050g, this.f107051h, Boolean.valueOf(this.f107052i), Boolean.valueOf(this.f107044a), this.f107045b, this.f107046c);
    }

    public String toString() {
        return "EmailAccount{, mailAccountId='" + this.f107048e + this.f107046c.size() + '}';
    }

    /* renamed from: a */
    public void mo151844a(C42094f fVar) {
        this.f107045b = fVar;
    }

    /* renamed from: b */
    public void mo151849b(String str) {
        this.f107048e = str;
    }

    /* renamed from: c */
    public void mo151852c(String str) {
        this.f107049f = str;
    }

    /* renamed from: d */
    public void mo151854d(String str) {
        this.f107050g = str;
    }

    /* renamed from: e */
    public void mo151856e(String str) {
        this.f107051h = str;
    }

    /* renamed from: a */
    public void mo151845a(String str) {
        this.f107047d = str;
    }

    /* renamed from: b */
    public void mo151850b(boolean z) {
        this.f107044a = z;
    }

    /* renamed from: a */
    public void mo151846a(List<C42093e> list) {
        this.f107046c = list;
    }

    /* renamed from: a */
    public void mo151847a(boolean z) {
        this.f107052i = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C42093e eVar = (C42093e) obj;
        if (!Objects.equals(this.f107047d, eVar.f107047d) || !Objects.equals(this.f107048e, eVar.f107048e) || !Objects.equals(this.f107049f, eVar.f107049f) || !Objects.equals(this.f107050g, eVar.f107050g) || !Objects.equals(this.f107051h, eVar.f107051h) || !Objects.equals(Boolean.valueOf(this.f107052i), Boolean.valueOf(eVar.f107052i)) || !Objects.equals(Boolean.valueOf(this.f107044a), Boolean.valueOf(eVar.f107044a)) || !Objects.equals(this.f107045b, eVar.f107045b) || !Objects.equals(this.f107046c, eVar.f107046c)) {
            return false;
        }
        return true;
    }
}
