package com.bytedance.push.p890k;

import com.bytedance.push.interfaze.AbstractC20439b;
import com.ss.android.ug.bus.C60442b;
import com.ss.android.ug.bus.C60443c;
import com.ss.android.ug.bus.p3039a.AbstractC60437a;
import com.ss.android.ug.bus.p3039a.p3040a.C60439a;
import com.ss.android.ug.bus.p3039a.p3040a.C60440b;
import com.ss.android.ug.bus.p3039a.p3040a.C60441c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.bytedance.push.k.a */
public class C20466a implements AbstractC20439b {
    @Override // com.bytedance.push.interfaze.AbstractC20439b
    /* renamed from: a */
    public String mo68906a() {
        AbstractC60437a aVar = (AbstractC60437a) C60442b.m234863a(AbstractC60437a.class);
        if (aVar == null) {
            return null;
        }
        return aVar.mo206931a();
    }

    @Override // com.bytedance.push.interfaze.AbstractC20439b
    /* renamed from: b */
    public List<String> mo68908b() {
        AbstractC60437a aVar = (AbstractC60437a) C60442b.m234863a(AbstractC60437a.class);
        if (aVar == null) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        aVar.mo206932a(new AbstractC60437a.AbstractC60438a() {
            /* class com.bytedance.push.p890k.C20466a.C204671 */
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20439b
    /* renamed from: a */
    public void mo68907a(C60443c.AbstractC60445a<C60439a> aVar) {
        C60443c.m234866a(aVar);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20439b
    /* renamed from: b */
    public void mo68909b(C60443c.AbstractC60445a<C60440b> aVar) {
        C60443c.m234866a(aVar);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20439b
    /* renamed from: c */
    public void mo68910c(C60443c.AbstractC60445a<C60441c> aVar) {
        C60443c.m234866a(aVar);
    }
}
