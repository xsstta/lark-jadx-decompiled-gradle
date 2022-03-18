package com.ss.android.lark.image.entity;

import com.bumptech.glide.load.AbstractC2265c;
import com.bytedance.lark.pb.basic.v1.Trace;
import com.larksuite.framework.callback.Entity.ErrorResult;
import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.ss.android.lark.image.entity.b */
public class C38824b implements AbstractC2265c {

    /* renamed from: b */
    private String f99772b;

    /* renamed from: c */
    private boolean f99773c;

    /* renamed from: d */
    private volatile byte[] f99774d;

    /* renamed from: e */
    private String f99775e;

    /* renamed from: f */
    private boolean f99776f;

    /* renamed from: g */
    private Trace f99777g;

    /* renamed from: h */
    private ErrorResult f99778h;

    /* renamed from: a */
    public String mo142313a() {
        return this.f99772b;
    }

    /* renamed from: c */
    public String mo142320c() {
        return this.f99775e;
    }

    /* renamed from: d */
    public boolean mo142321d() {
        return this.f99776f;
    }

    /* renamed from: e */
    public Trace mo142322e() {
        return this.f99777g;
    }

    /* renamed from: f */
    public ErrorResult mo142323f() {
        return this.f99778h;
    }

    /* renamed from: b */
    public boolean mo142319b() {
        return this.f99773c;
    }

    /* renamed from: g */
    private byte[] m153226g() {
        if (this.f99774d == null) {
            this.f99774d = this.f99772b.getBytes(f7599a);
        }
        return this.f99774d;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return Objects.hash(this.f99772b, Boolean.valueOf(this.f99773c));
    }

    public String toString() {
        return "EncryptImage#key is:" + this.f99772b;
    }

    /* renamed from: b */
    public void mo142318b(boolean z) {
        this.f99776f = z;
    }

    public C38824b(String str) {
        this.f99772b = str;
    }

    /* renamed from: a */
    public void mo142314a(Trace trace) {
        this.f99777g = trace;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m153226g());
    }

    /* renamed from: a */
    public void mo142315a(ErrorResult errorResult) {
        this.f99778h = errorResult;
    }

    /* renamed from: a */
    public void mo142316a(String str) {
        this.f99775e = str;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38824b)) {
            return false;
        }
        C38824b bVar = (C38824b) obj;
        if (this.f99773c != bVar.f99773c || !this.f99772b.equals(bVar.f99772b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo142317a(boolean z) {
        this.f99773c = z;
    }
}
