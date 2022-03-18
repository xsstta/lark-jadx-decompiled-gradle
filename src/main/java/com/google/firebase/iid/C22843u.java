package com.google.firebase.iid;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.u */
public final class C22843u implements InstanceIdResult {

    /* renamed from: a */
    private final String f56473a;

    /* renamed from: b */
    private final String f56474b;

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getId() {
        return this.f56473a;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getToken() {
        return this.f56474b;
    }

    C22843u(String str, String str2) {
        this.f56473a = str;
        this.f56474b = str2;
    }
}
