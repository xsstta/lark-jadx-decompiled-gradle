package com.ss.android.lark.image.impl.p1967g;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.larksuite.framework.utils.C26266d;
import com.ss.android.lark.image.api.AbstractC38809a;
import com.ss.android.lark.log.Log;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.g.c */
public abstract class AbstractC38898c<Model> implements AbstractC38809a<InputStream> {

    /* renamed from: a */
    protected Model f99940a;

    /* renamed from: b */
    private InputStream f99941b;

    /* renamed from: c */
    private volatile boolean f99942c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InputStream mo142336a(Model model) throws FileNotFoundException;

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: b */
    public void mo142218b() {
        this.f99942c = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo142337e();

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: c */
    public Class<InputStream> mo142219c() {
        return InputStream.class;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: d */
    public DataSource mo142220d() {
        return DataSource.REMOTE;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: a */
    public void mo142216a() {
        C26266d.m95082a(this.f99941b);
    }

    public AbstractC38898c(Model model) {
        this.f99940a = model;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: a */
    public void mo142217a(Priority priority, AbstractC38809a.AbstractC38810a<? super InputStream> aVar) {
        m153517a(priority, aVar, 0);
    }

    /* renamed from: a */
    private void m153517a(Priority priority, AbstractC38809a.AbstractC38810a<? super InputStream> aVar, int i) {
        String e = mo142337e();
        Log.m165389i(e, "loading image：" + ((Object) this.f99940a));
        try {
            if (this.f99942c) {
                aVar.mo142221a(new Exception("Request has been canceled：" + ((Object) this.f99940a)));
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f99941b = mo142336a(this.f99940a);
            long currentTimeMillis2 = System.currentTimeMillis();
            String e2 = mo142337e();
            Log.m165389i(e2, "loading image :" + ((Object) this.f99940a) + " rust time cost:" + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f99941b == null) {
                String e3 = mo142337e();
                Log.m165383e(e3, "load image failed:" + ((Object) this.f99940a));
                m153518a(priority, aVar, new Exception("load image failed:" + ((Object) this.f99940a)), i);
                return;
            }
            String e4 = mo142337e();
            Log.m165389i(e4, "load image succeed：" + ((Object) this.f99940a));
            aVar.mo142222a(this.f99941b);
        } catch (Exception e5) {
            m153518a(priority, aVar, e5, i);
        }
    }

    /* renamed from: a */
    private void m153518a(Priority priority, AbstractC38809a.AbstractC38810a<? super InputStream> aVar, Exception exc, int i) {
        if (i < 1) {
            m153517a(priority, aVar, i + 1);
        } else {
            aVar.mo142221a(exc);
        }
    }
}
