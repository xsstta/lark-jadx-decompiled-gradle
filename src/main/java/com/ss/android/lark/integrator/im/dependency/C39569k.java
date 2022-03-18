package com.ss.android.lark.integrator.im.dependency;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.vc.api.IVCApi;

/* renamed from: com.ss.android.lark.integrator.im.dependency.k */
public class C39569k implements AbstractC38037a.AbstractC38039aa {

    /* renamed from: a */
    final IVCApi f101044a = ((IVCApi) ApiUtils.getApi(IVCApi.class));

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m156733a(Boolean bool) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m156735b(Boolean bool) {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m156737c(Boolean bool) {
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38039aa
    /* renamed from: a */
    public boolean mo139214a() {
        return this.f101044a.needShowPlusIconLocalShare();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38039aa
    /* renamed from: b */
    public boolean mo139216b() {
        return this.f101044a.needShowPlusIconJoin();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38039aa
    /* renamed from: c */
    public boolean mo139217c() {
        return this.f101044a.needShowPlusIconCreate();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m156734b(Activity activity) {
        this.f101044a.openCreateMeetingPage(activity);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean m156736c(Context context) {
        this.f101044a.openJoinMeetingPage(context);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Boolean m156738d(Context context) {
        this.f101044a.openLocalSharePage(context);
        return true;
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38039aa
    /* renamed from: a */
    public void mo139212a(Activity activity) {
        C57865c.m224574a(new C57865c.AbstractC57873d(activity) {
            /* class com.ss.android.lark.integrator.im.dependency.$$Lambda$k$pKoq9Ixb99GFhHBNQadu8Si5rBc */
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C39569k.this.m156734b(this.f$1);
            }
        }, $$Lambda$k$vmsN02gndSMXEB0tr3FTswHmhio.INSTANCE);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38039aa
    /* renamed from: a */
    public void mo139213a(Context context) {
        C57865c.m224574a(new C57865c.AbstractC57873d(context) {
            /* class com.ss.android.lark.integrator.im.dependency.$$Lambda$k$180pMYuLg8DUB2dhhmzTAm4LW5s */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C39569k.this.m156738d(this.f$1);
            }
        }, $$Lambda$k$3cwGFBKqXoBXfbi1Wa8NSDjdQ.INSTANCE);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38039aa
    /* renamed from: b */
    public void mo139215b(Context context) {
        C57865c.m224574a(new C57865c.AbstractC57873d(context) {
            /* class com.ss.android.lark.integrator.im.dependency.$$Lambda$k$jpW63u0ohTydyk4OpwS58wUACc */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C39569k.this.m156736c(this.f$1);
            }
        }, $$Lambda$k$EOmhHtcc2YvVlcIVEJmfEasuTI.INSTANCE);
    }
}
