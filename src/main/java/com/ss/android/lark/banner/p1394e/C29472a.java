package com.ss.android.lark.banner.p1394e;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.banner.entity.C29477c;
import com.ss.android.lark.banner.entity.p1395a.C29475c;
import com.ss.android.lark.banner.export.AbstractC29483d;
import com.ss.android.lark.banner.export.AbstractC29484e;
import com.ss.android.lark.banner.export.AbstractC29491f;
import com.ss.android.lark.banner.export.entity.C29489b;
import com.ss.android.lark.banner.p1391b.C29464c;
import com.ss.android.lark.banner.p1398g.AbstractC29499a;
import com.ss.android.lark.banner.statistics.BannerHitPoint;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: com.ss.android.lark.banner.e.a */
public class C29472a extends AbstractC29491f<C29477c> implements AbstractC29484e {
    /* renamed from: b */
    public AbstractC29483d mo104369b() {
        if (this.f73675c != null) {
            return this.f73675c.mo104353b(mo104447d());
        }
        return null;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public Observable<Boolean> mo104366a() {
        return Observable.create(new ObservableOnSubscribe() {
            /* class com.ss.android.lark.banner.p1394e.$$Lambda$a$cgTfNF8EhfNH3KMWpbxtJkY5X3s */

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C29472a.this.m108460a((C29472a) observableEmitter);
            }
        });
    }

    /* renamed from: a */
    private void m108461a(String str) {
        AbstractC29499a.CC.m108592a().mo104455a(new C29475c(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m108460a(ObservableEmitter observableEmitter) throws Exception {
        AbstractC29483d b = mo104369b();
        if (b != null) {
            observableEmitter.onNext(Boolean.valueOf(b.mo16928a()));
        } else {
            observableEmitter.onNext(true);
        }
        observableEmitter.onComplete();
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public View mo104364a(Context context) {
        if (this.f73674b != null) {
            return C29464c.m108429a(context, ((C29477c) this.f73674b).mo104438a(), ((C29477c) this.f73674b).mo104439b(), this);
        }
        return null;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29484e
    /* renamed from: b */
    public void mo104371b(View view) {
        BannerHitPoint.f73691a.mo104470b(mo104449f(), mo104447d());
        AbstractC29483d b = mo104369b();
        if (b == null || !b.mo16929a(view)) {
            mo104448e();
            m108461a(mo104447d());
        }
    }

    /* renamed from: a */
    public C29477c mo104370b(C29489b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar.mo104446d() instanceof C29477c) {
            return (C29477c) bVar.mo104446d();
        }
        return C29477c.m108543a(bVar.mo104446d());
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29484e
    /* renamed from: a */
    public void mo104367a(View view) {
        BannerHitPoint.f73691a.mo104469a(mo104449f(), mo104447d());
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29484e
    /* renamed from: a */
    public void mo104368a(View view, String str) {
        BannerHitPoint.f73691a.mo104471c(mo104449f(), mo104447d());
        AbstractC29483d b = mo104369b();
        if (b == null || !b.mo16930a(view, str)) {
            C29473b.m108470a(str);
        }
    }
}
