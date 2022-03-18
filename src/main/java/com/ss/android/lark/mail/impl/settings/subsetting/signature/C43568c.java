package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mail.impl.entity.C42095h;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.c */
public class C43568c implements AbstractC43577f.AbstractC43578a {

    /* renamed from: a */
    String f110596a;

    /* renamed from: b */
    C1177w<Boolean> f110597b = new C1177w<>();

    /* renamed from: c */
    C1177w<C42095h> f110598c = new C1177w<>();

    /* renamed from: d */
    C1177w<EntSignatureUsage> f110599d = new C1177w<>();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43578a
    /* renamed from: a */
    public String mo155558a() {
        return this.f110596a;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43578a
    /* renamed from: b */
    public C1177w<Boolean> mo155560b() {
        return this.f110597b;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43578a
    /* renamed from: c */
    public C1177w<C42095h> mo155561c() {
        return this.f110598c;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43578a
    /* renamed from: d */
    public C1177w<EntSignatureUsage> mo155562d() {
        return this.f110599d;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C43362e.m172201a().mo155083a(true, this.f110596a, (IGetDataCallback<C42095h>) new IGetDataCallback<C42095h>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43568c.C435702 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C43568c.this.f110597b.mo5926a((Boolean) false);
            }

            /* renamed from: a */
            public void onSuccess(C42095h hVar) {
                C43568c.this.f110597b.mo5926a((Boolean) true);
                C43568c.this.f110598c.mo5926a(hVar);
            }
        });
    }

    public C43568c(String str) {
        this.f110596a = str;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43578a
    /* renamed from: a */
    public void mo155559a(EntSignatureUsage entSignatureUsage) {
        C42095h b = this.f110598c.mo5927b();
        if (b != null) {
            final EntSignatureUsage entSignatureUsage2 = null;
            List<EntSignatureUsage> b2 = b.mo151941b();
            if (CollectionUtils.isNotEmpty(b2)) {
                int i = 0;
                while (true) {
                    if (i >= b2.size()) {
                        break;
                    } else if (entSignatureUsage.getAddress().equals(b2.get(i).getAddress())) {
                        EntSignatureUsage entSignatureUsage3 = b2.get(i);
                        entSignatureUsage2 = new EntSignatureUsage(entSignatureUsage3.getAddress(), entSignatureUsage3.getNewMailSignatureId(), entSignatureUsage3.getReplyMailSignatureId());
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.f110599d.mo5929b(entSignatureUsage);
            C43362e.m172201a().mo155082a(this.f110596a, entSignatureUsage, new IGetDataCallback<EntSignatureUsage>() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43568c.C435691 */

                /* renamed from: a */
                public void onSuccess(EntSignatureUsage entSignatureUsage) {
                    C43362e.m172201a().mo155100o();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (entSignatureUsage2 != null) {
                        C43568c.this.f110599d.mo5926a(entSignatureUsage2);
                    }
                }
            });
        }
    }
}
