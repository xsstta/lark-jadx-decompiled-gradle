package com.ss.android.lark.oncall.ui;

import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.oncall.entity.OnCall;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.oncall.ui.c */
public abstract class AbstractC48739c {

    /* renamed from: a */
    protected int f122487a = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: b */
    protected CallbackManager f122488b;

    /* renamed from: c */
    protected int f122489c;

    /* renamed from: d */
    protected boolean f122490d = true;

    /* renamed from: e */
    protected AbstractC48741a f122491e;

    /* renamed from: f */
    private List<OnCall> f122492f = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.oncall.ui.c$a */
    public interface AbstractC48741a {
        /* renamed from: a */
        void mo170025a(AbstractC48739c cVar, boolean z);

        /* renamed from: b */
        void mo170026b(AbstractC48739c cVar, boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo170013a(int i, int i2, IGetDataCallback<List<OnCall>> iGetDataCallback);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo170023h();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<OnCall> mo170012a() {
        return this.f122492f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo170018c() {
        return this.f122490d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public CallbackManager mo170022g() {
        return this.f122488b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo170015b() {
        boolean z = true;
        this.f122490d = true;
        AbstractC48741a aVar = this.f122491e;
        if (this.f122489c != 0) {
            z = false;
        }
        aVar.mo170026b(this, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo170019d() {
        this.f122489c = 0;
        this.f122490d = true;
        mo170021f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo170020e() {
        if (this.f122490d) {
            this.f122490d = false;
            mo170021f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo170021f() {
        mo170013a(this.f122489c, this.f122487a, new IGetDataCallback<List<OnCall>>() {
            /* class com.ss.android.lark.oncall.ui.AbstractC48739c.C487401 */

            /* renamed from: a */
            public void onSuccess(List<OnCall> list) {
                AbstractC48739c.this.mo170017c(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC48739c.this.mo170015b();
            }
        });
    }

    /* renamed from: a */
    public void mo170014a(List<OnCall> list) {
        this.f122492f.addAll(list);
    }

    AbstractC48739c(AbstractC48741a aVar) {
        this.f122491e = aVar;
        this.f122488b = new CallbackManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo170016b(List<OnCall> list) {
        this.f122492f.clear();
        this.f122492f.addAll(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo170017c(List<OnCall> list) {
        boolean z;
        if (this.f122489c == 0) {
            mo170016b(list);
        } else {
            mo170014a(list);
        }
        AbstractC48741a aVar = this.f122491e;
        if (this.f122489c == 0) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo170025a(this, z);
        this.f122489c += list.size();
    }
}
