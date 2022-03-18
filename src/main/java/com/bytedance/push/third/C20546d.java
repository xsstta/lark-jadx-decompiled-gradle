package com.bytedance.push.third;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.push.third.p891a.C20541b;
import com.bytedance.push.utils.AbstractC20557g;
import com.bytedance.push.utils.C20552c;

/* renamed from: com.bytedance.push.third.d */
public class C20546d extends AbstractC20557g<AbstractC20544b> implements AbstractC20544b {

    /* renamed from: a */
    private int f50106a;

    /* renamed from: b */
    private String f50107b;

    /* renamed from: c */
    private boolean f50108c;

    /* renamed from: d */
    private boolean f50109d;

    /* renamed from: e */
    private IPushAdapter f50110e;

    /* renamed from: f */
    private String f50111f;

    /* renamed from: g */
    private C20541b f50112g;

    @Override // com.bytedance.push.third.AbstractC20544b
    /* renamed from: b */
    public IPushAdapter mo69175b() {
        return this.f50110e;
    }

    @Override // com.bytedance.push.third.AbstractC20544b
    /* renamed from: c */
    public String mo69176c() {
        return this.f50107b;
    }

    @Override // com.bytedance.push.third.AbstractC20544b
    /* renamed from: d */
    public String mo69177d() {
        return this.f50111f;
    }

    @Override // com.bytedance.push.third.AbstractC20544b
    /* renamed from: a */
    public boolean mo69174a() {
        if (!this.f50109d) {
            this.f50108c = this.f50112g.mo69173a(this.f50110e, this.f50106a);
            this.f50109d = true;
        }
        return this.f50108c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC20544b mo68870b(Object... objArr) {
        if (StringUtils.isEmpty(this.f50107b)) {
            return this;
        }
        try {
            Object newInstance = Class.forName(this.f50107b).newInstance();
            if (newInstance instanceof IPushAdapter) {
                this.f50110e = (IPushAdapter) newInstance;
            }
            C20552c.m74845a("PushManager", "load PushManagerImpl success: " + this.f50107b);
        } catch (Throwable th) {
            C20552c.m74850b("PushManager", "load PushManagerImpl exception: " + this.f50107b + " exception is:" + th);
        }
        return this;
    }

    public C20546d(int i, String str, String str2, C20541b bVar) {
        this.f50106a = i;
        this.f50107b = str;
        this.f50111f = str2;
        this.f50112g = bVar;
    }
}
