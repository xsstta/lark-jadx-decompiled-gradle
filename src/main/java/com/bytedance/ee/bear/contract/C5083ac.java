package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.util.p701d.C13615c;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.diskmanage.p1807a.AbstractC36802f;
import com.ss.android.lark.diskmanage.p1807a.C36804g;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: com.bytedance.ee.bear.contract.ac */
public class C5083ac implements AbstractC5082ab {

    /* renamed from: a */
    private Application f14797a = C13615c.f35773a;

    /* renamed from: b */
    private volatile AbstractC36802f f14798b;

    /* renamed from: d */
    private synchronized void m20839d() throws IOException {
        m20837c().mo135520a();
        this.f14798b = null;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5082ab
    /* renamed from: a */
    public AbstractC68307f<Long> mo20176a() {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.contract.$$Lambda$ac$sGBGLajAsYqm6U2fP2Dx5f8ZbE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5083ac.this.m20838c((String) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$ac$jj4lRJSs9Gj8beKLGfzzTp04GAA.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5082ab
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo20179b() {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.contract.$$Lambda$ac$H_OulGD51TpZq2GRrOXzHRiUx8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5083ac.this.m20835b((String) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$ac$qwjC1yhmLoArTFFt7vyVSCgg_ho.INSTANCE);
    }

    /* renamed from: c */
    private synchronized AbstractC36802f m20837c() throws IOException {
        if (this.f14798b == null) {
            this.f14798b = new C36804g(new File(CCMStorage.m21714b(this.f14797a, Biz.DOCS), "LRU").getPath(), 1, 104857600).mo135555a();
        }
        return this.f14798b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m20835b(String str) throws Exception {
        m20839d();
        return Boolean.TRUE;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Long m20838c(String str) throws Exception {
        return Long.valueOf(m20837c().mo135523c());
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5082ab
    /* renamed from: a */
    public <T extends Serializable> T mo20177a(String str) throws IOException {
        try {
            return (T) m20837c().mo135525d(str);
        } catch (DecryptException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5082ab
    /* renamed from: a */
    public void mo20178a(String str, Serializable serializable) {
        try {
            mo20180b(str, serializable);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo20180b(String str, Serializable serializable) throws IOException {
        m20837c().mo135518a(str, serializable);
    }
}
