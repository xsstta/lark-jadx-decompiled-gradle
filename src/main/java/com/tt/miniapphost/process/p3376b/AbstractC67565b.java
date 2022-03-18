package com.tt.miniapphost.process.p3376b;

import com.tt.miniapphost.C67545g;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

/* renamed from: com.tt.miniapphost.process.b.b */
public abstract class AbstractC67565b {

    /* renamed from: a */
    private String f170378a;

    /* renamed from: b */
    private final int f170379b = C67545g.m262705a();

    /* renamed from: c */
    private int f170380c = 1;

    /* renamed from: a */
    public void mo48979a() {
    }

    /* renamed from: a */
    public abstract void mo48980a(CrossProcessDataEntity crossProcessDataEntity);

    /* renamed from: b */
    public int mo234709b() {
        return this.f170379b;
    }

    /* renamed from: c */
    public String mo234710c() {
        return this.f170378a;
    }

    public AbstractC67565b() {
    }

    /* renamed from: d */
    public void mo234711d() {
        C67566c.m262973a().mo232254a(this.f170379b);
    }

    /* renamed from: e */
    public boolean mo234712e() {
        if ((this.f170380c & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo234708a(String str) {
        this.f170378a = str;
    }

    public AbstractC67565b(String str) {
        this.f170378a = str;
    }

    public AbstractC67565b(boolean z) {
        if (z) {
            this.f170380c = 1 | 1;
        } else {
            this.f170380c = 1 & -2;
        }
    }
}
