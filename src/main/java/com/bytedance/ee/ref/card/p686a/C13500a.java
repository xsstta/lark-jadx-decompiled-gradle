package com.bytedance.ee.ref.card.p686a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.C13494a;
import com.bytedance.ee.ref.card.C13518b;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.bytedance.ee.ref.card.p686a.AbstractC13508d;
import com.bytedance.ee.ref.card.p687b.C13523c;
import com.tt.miniapphost.p3362a.p3367e.C67459e;
import com.tt.refer.common.meta.AbstractC67788b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ee.ref.card.a.a */
public class C13500a extends AbstractC13508d {

    /* renamed from: e */
    private static AtomicInteger f35567e = new AtomicInteger(0);

    /* renamed from: a */
    public C13494a f35568a = new C13494a(this.f35569f);

    /* renamed from: f */
    private IAppContext f35569f;

    /* renamed from: g */
    private Activity f35570g;

    /* renamed from: h */
    private String f35571h;

    @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d
    /* renamed from: c */
    public void mo50229c() {
        super.mo50229c();
        this.f35570g = null;
        IAppContext iAppContext = this.f35569f;
        if (iAppContext != null) {
            iAppContext.destroy();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d
    /* renamed from: b */
    public String mo50228b() {
        CardAppInfo cardAppInfo;
        if (this.f35595c == null || (cardAppInfo = this.f35595c.getCardAppInfo()) == null) {
            return "";
        }
        return cardAppInfo.getIdentifier();
    }

    /* renamed from: a */
    public void mo50223a() {
        if (TextUtils.isEmpty(this.f35571h)) {
            AppBrandLogger.m52829e("card_app_launch", "card url is empty! please invoke renderTemplate!");
        } else if (this.f35595c == null) {
            AppBrandLogger.m52829e("card_app_launch", "card view is null,please invoke renderTemplate!");
        } else {
            final C13523c.C13524a a = C13523c.m54933a(this.f35571h);
            if (a == null) {
                AppBrandLogger.m52829e("card_app_launch", "card url is not card schema!");
                return;
            }
            this.f35568a.mo50204a(this.f35570g, a, new AbstractC67788b.AbstractC67792b<CardAppInfo>() {
                /* class com.bytedance.ee.ref.card.p686a.C13500a.C135011 */

                /* renamed from: a */
                public void onRequestAppMetaSuccess(int i, CardAppInfo cardAppInfo) {
                    CardAppInfo cardAppInfo2 = C13500a.this.f35595c.getCardAppInfo();
                    if (cardAppInfo2 == null) {
                        return;
                    }
                    if (!TextUtils.equals(cardAppInfo2.getAppVersion(), cardAppInfo.getAppVersion()) || !TextUtils.equals(cardAppInfo2.mo50323d(), cardAppInfo.mo50323d())) {
                        C13500a.this.mo50225a(a);
                        return;
                    }
                    AppBrandLogger.m52830i("card_app_launch", "has no new version:", a.getIdentifier());
                }

                @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
                public void onRequestAppMetaFail(int i, String str, String str2) {
                    AppBrandLogger.m52829e("card_app_launch", "onRequestAppMetaFail by updateCard-->code:", str, "errorMsg:", str2);
                }

                /* renamed from: a */
                public void onAppMetaInvalid(int i, CardAppInfo cardAppInfo, int i2) {
                    if (C13500a.this.f35568a.mo50201a() != null) {
                        AbstractC13508d.AbstractC13509a a = C13500a.this.f35568a.mo50201a();
                        a.mo50260a("app meta invalid:" + i2, new Object[0]);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo50224a(AbstractC13508d.AbstractC13509a aVar) {
        this.f35568a.mo50208a(aVar);
    }

    @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d
    /* renamed from: a */
    public void mo50227a(String str) {
        this.f35571h = str;
        C13523c.C13524a a = C13523c.m54933a(str);
        if (a != null) {
            mo50225a(a);
        } else {
            super.mo50227a(str);
        }
    }

    /* renamed from: a */
    public void mo50225a(final C13523c.C13524a aVar) {
        this.f35569f.setAppId(aVar.getIdentifier());
        this.f35569f.setAppIdentify(aVar.getIdentifier());
        this.f35568a.mo50203a(this.f35570g, aVar, new C13494a.AbstractC13499a() {
            /* class com.bytedance.ee.ref.card.p686a.C13500a.C135022 */

            @Override // com.bytedance.ee.ref.card.C13494a.AbstractC13499a
            /* renamed from: a */
            public void mo50221a(final CardAppInfo cardAppInfo) {
                C13518b.f35606a.post(new Runnable() {
                    /* class com.bytedance.ee.ref.card.p686a.C13500a.C135022.RunnableC135042 */

                    public void run() {
                        C13500a.this.mo50226a(cardAppInfo);
                    }
                });
            }

            @Override // com.bytedance.ee.ref.card.C13494a.AbstractC13499a
            /* renamed from: a */
            public void mo50222a(final byte[] bArr) {
                C13518b.f35606a.post(new Runnable() {
                    /* class com.bytedance.ee.ref.card.p686a.C13500a.C135022.RunnableC135031 */

                    public void run() {
                        if (C13500a.this.f35595c == null) {
                            AppBrandLogger.m52829e("card_app_launch", "onTemplateReady but mCardView is null");
                        } else if (aVar == null || TextUtils.isEmpty(aVar.mo50279a())) {
                            C13500a.this.f35595c.mo50239a(bArr);
                        } else {
                            C13500a.this.f35595c.mo50240a(bArr, aVar.mo50279a());
                        }
                    }
                });
            }
        });
    }

    public C13500a(Activity activity) {
        this.f35570g = activity;
        C67459e eVar = new C67459e(activity.getApplicationContext());
        this.f35569f = eVar;
        eVar.setCurrentActivity(activity);
        AppBrandLogger.m52830i("card_app_launch", "CardContainer->mAppContext:", this.f35569f);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d
    /* renamed from: a */
    public void mo50226a(CardAppInfo cardAppInfo) {
        if (this.f35595c != null) {
            this.f35595c.mo50236a(cardAppInfo);
            return;
        }
        C13507c cVar = new C13507c();
        cVar.mo50249a(cardAppInfo);
        this.f35595c = cVar.mo50248a(this.f35570g, this.f35569f);
        for (AbstractC13508d.AbstractC13510b bVar : this.f35596d) {
            if (bVar != null) {
                this.f35595c.mo50235a(bVar);
            }
        }
        Objects.requireNonNull(this.f35594b, "mRootView is Null!");
        this.f35594b.addView(this.f35595c, new ViewGroup.MarginLayoutParams(-1, -1));
    }
}
