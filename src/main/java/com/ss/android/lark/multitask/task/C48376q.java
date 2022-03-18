package com.ss.android.lark.multitask.task;

import android.os.Bundle;
import com.ss.android.lark.multitask.task.Task;

/* renamed from: com.ss.android.lark.multitask.task.q */
public class C48376q {

    /* renamed from: a */
    private long f121820a;

    /* renamed from: b */
    private String f121821b;

    /* renamed from: c */
    private String f121822c;

    /* renamed from: d */
    private CharSequence f121823d = "";

    /* renamed from: e */
    private Task.IconFactory f121824e;

    /* renamed from: f */
    private AbstractC48375n f121825f;

    /* renamed from: g */
    private AbstractC48378t f121826g;

    /* renamed from: h */
    private Bundle f121827h;

    /* renamed from: a */
    public long mo169234a() {
        return this.f121820a;
    }

    /* renamed from: b */
    public CharSequence mo169239b() {
        return this.f121823d;
    }

    /* renamed from: c */
    public String mo169241c() {
        return this.f121821b;
    }

    /* renamed from: d */
    public String mo169242d() {
        return this.f121822c;
    }

    /* renamed from: e */
    public Task.IconFactory mo169243e() {
        return this.f121824e;
    }

    /* renamed from: f */
    public AbstractC48378t mo169245f() {
        return this.f121826g;
    }

    /* renamed from: g */
    public Bundle mo169246g() {
        return this.f121827h;
    }

    C48376q() {
    }

    public int hashCode() {
        return this.f121821b.hashCode();
    }

    public String toString() {
        return "TaskSnapshot{id=" + this.f121820a + ", title=" + ((Object) this.f121823d) + ", drawable=" + this.f121824e + ", container=" + this.f121825f + ", starter=" + this.f121826g + ", savedState=" + this.f121827h + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo169235a(long j) {
        this.f121820a = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo169240b(String str) {
        this.f121822c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo169236a(Bundle bundle) {
        this.f121827h = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo169237a(Task.IconFactory iconFactory) {
        this.f121824e = iconFactory;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48376q)) {
            return false;
        }
        return this.f121821b.equals(((C48376q) obj).f121821b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo169178a(AbstractC48375n nVar) {
        this.f121825f = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo169179a(AbstractC48378t tVar) {
        this.f121826g = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo169180a(CharSequence charSequence) {
        this.f121823d = charSequence;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo169238a(String str) {
        this.f121821b = str;
    }

    public C48376q(long j, String str, String str2, CharSequence charSequence, Task.IconFactory iconFactory, AbstractC48375n nVar, AbstractC48378t tVar, Bundle bundle) {
        this.f121820a = j;
        this.f121821b = str;
        this.f121822c = str2;
        this.f121823d = charSequence;
        this.f121824e = iconFactory;
        this.f121825f = nVar;
        this.f121826g = tVar;
        this.f121827h = bundle;
    }
}
