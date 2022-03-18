package com.ss.android.appcenter.engine.p1300b;

import com.google.gson.annotations.SerializedName;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.appcenter.engine.model.NodeParams;

/* renamed from: com.ss.android.appcenter.engine.b.c */
public class C28243c implements Cloneable {

    /* renamed from: a */
    public static final NodeParams f70879a = new NodeParams();

    /* renamed from: b */
    public String f70880b;

    /* renamed from: c */
    private int f70881c;
    @SerializedName(UpdateKey.STATUS)

    /* renamed from: d */
    private int f70882d;
    @SerializedName("nodeParams")

    /* renamed from: e */
    private NodeParams f70883e;

    /* renamed from: a */
    public NodeParams mo100623a() {
        return this.f70883e;
    }

    /* renamed from: b */
    public int mo100625b() {
        return this.f70882d;
    }

    /* renamed from: c */
    public boolean mo100626c() {
        if (this.f70882d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo100630f() {
        if (this.f70881c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo100628d() {
        if (this.f70882d == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo100629e() {
        if (this.f70881c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo100631g() {
        if (this.f70882d == -2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public C28243c clone() {
        return new C28243c(this.f70883e, this.f70882d, this.f70881c);
    }

    /* renamed from: a */
    public void mo100624a(int i) {
        this.f70881c = i;
    }

    public C28243c(NodeParams nodeParams, int i) {
        this.f70882d = i;
        this.f70883e = nodeParams;
    }

    public C28243c(NodeParams nodeParams, int i, int i2) {
        if (nodeParams == null) {
            this.f70883e = f70879a;
        } else {
            this.f70883e = nodeParams;
        }
        this.f70882d = i;
        this.f70881c = i2;
    }
}
