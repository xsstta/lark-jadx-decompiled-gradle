package com.bytedance.ee.ref.card.p686a;

import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.ref.card.a.d */
public abstract class AbstractC13508d {

    /* renamed from: b */
    protected ViewGroup f35594b;

    /* renamed from: c */
    public C13505b f35595c;

    /* renamed from: d */
    protected List<AbstractC13510b> f35596d = new ArrayList();

    /* renamed from: com.bytedance.ee.ref.card.a.d$a */
    public interface AbstractC13509a {
        /* renamed from: a */
        void mo50258a(CardAppInfo cardAppInfo);

        /* renamed from: a */
        void mo50259a(String str);

        /* renamed from: a */
        void mo50260a(String str, Object... objArr);
    }

    /* renamed from: com.bytedance.ee.ref.card.a.d$b */
    public interface AbstractC13510b {
        /* renamed from: a */
        void mo50261a();

        /* renamed from: a */
        void mo50262a(String str);

        /* renamed from: b */
        void mo50263b(String str);

        /* renamed from: c */
        void mo50264c(String str);
    }

    /* renamed from: com.bytedance.ee.ref.card.a.d$c */
    public interface AbstractC13511c {
        /* renamed from: a */
        void mo50265a(int i, int i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50226a(CardAppInfo cardAppInfo);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo50228b();

    /* renamed from: c */
    public void mo50229c() {
        C13505b bVar = this.f35595c;
        if (bVar != null) {
            bVar.mo50234a();
        }
    }

    /* renamed from: a */
    public void mo50253a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f35594b = viewGroup;
        }
    }

    /* renamed from: a */
    public void mo50254a(AbstractC13510b bVar) {
        if (bVar != null) {
            this.f35596d.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo50255a(AbstractC13511c cVar) {
        C13505b bVar;
        if (cVar != null && (bVar = this.f35595c) != null) {
            bVar.setCardViewSizeChangeListener(cVar);
        }
    }

    /* renamed from: a */
    public void mo50227a(String str) {
        if (this.f35595c == null) {
            mo50226a((CardAppInfo) null);
        }
        this.f35595c.mo50237a(str);
    }

    /* renamed from: b */
    public final void mo50257b(String str) {
        if (this.f35595c != null) {
            AppBrandLogger.m52830i("card_app_launch", "update card Data by json->and card id is:", mo50228b());
            this.f35595c.mo50241b(str);
            return;
        }
        AppBrandLogger.m52830i("card_app_launch", "update json Data failed ,card view is null!");
    }

    /* renamed from: a */
    public void mo50256a(byte[] bArr) {
        if (this.f35595c == null) {
            mo50226a((CardAppInfo) null);
        }
        this.f35595c.mo50239a(bArr);
    }
}
