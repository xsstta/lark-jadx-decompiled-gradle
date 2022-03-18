package com.tt.miniapp.falcon.snapshot;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;

/* renamed from: com.tt.miniapp.falcon.snapshot.a */
public class C66070a {

    /* renamed from: a */
    private final SnapshotType f166783a;

    /* renamed from: b */
    private final AbstractC66075c f166784b;

    /* renamed from: c */
    private final C66082h f166785c;

    /* renamed from: a */
    public SnapshotType mo231214a() {
        return this.f166783a;
    }

    /* renamed from: b */
    public C66082h mo231215b() {
        return this.f166785c;
    }

    /* renamed from: c */
    public AbstractC66075c mo231216c() {
        return this.f166784b;
    }

    /* renamed from: d */
    public boolean mo231217d() {
        if (!this.f166784b.mo231225a() || !this.f166785c.mo231237d()) {
            return false;
        }
        return true;
    }

    public C66070a(IAppContext iAppContext, String str, SnapshotType snapshotType) {
        this.f166783a = snapshotType;
        C66082h hVar = new C66082h(iAppContext, str, snapshotType);
        this.f166785c = hVar;
        this.f166784b = new C66084j(iAppContext, iAppContext.getAppId(), str, hVar.mo231234a());
    }

    public C66070a(IAppContext iAppContext, String str, SnapshotType snapshotType, AbstractC66075c cVar) {
        this.f166783a = snapshotType;
        this.f166785c = new C66082h(iAppContext, str, snapshotType);
        this.f166784b = cVar;
    }
}
