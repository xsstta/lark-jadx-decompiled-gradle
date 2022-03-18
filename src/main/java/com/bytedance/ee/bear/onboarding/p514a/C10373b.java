package com.bytedance.ee.bear.onboarding.p514a;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.onboarding.C10370a;
import com.bytedance.ee.bear.onboarding.export.AbstractC10386a;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.AbstractC10399c;
import com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.bear.onboarding.p514a.C10373b;
import com.bytedance.ee.bear.onboarding.p515b.C10380a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.onboarding.a.b */
public class C10373b implements AbstractC10398b {

    /* renamed from: com.bytedance.ee.bear.onboarding.a.b$a */
    private static final class C10374a {

        /* renamed from: a */
        static AbstractC10399c f27908a = new AbstractC10399c() {
            /* class com.bytedance.ee.bear.onboarding.p514a.C10373b.C10374a.C103751 */

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: b */
            public void mo39518b() {
                C10370a.m43121d();
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: a */
            public Map<String, Boolean> mo39512a() {
                return C10370a.m43120c();
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10399c
            /* renamed from: c */
            public AbstractC68307f<AbstractC10386a> mo39520c() {
                return AbstractC68307f.m265080a(new AbstractC68324h() {
                    /* class com.bytedance.ee.bear.onboarding.p514a.$$Lambda$b$a$1$Pe5TIBBx0RbJ31MqE8goukaFvKo */

                    @Override // io.reactivex.AbstractC68324h
                    public final void subscribe(AbstractC68323g gVar) {
                        C10373b.C10374a.C103751.lambda$Pe5TIBBx0RbJ31MqE8goukaFvKo(C10373b.C10374a.C103751.this, gVar);
                    }
                }, BackpressureStrategy.BUFFER).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e());
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: a */
            public void mo39513a(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C10370a.m43104a(dVar);
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: b */
            public void mo39519b(String str) {
                C10370a.m43115b(str);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m43144a(final AbstractC68323g gVar) throws Exception {
                C10370a.m43103a(new C10370a.AbstractC10371a() {
                    /* class com.bytedance.ee.bear.onboarding.p514a.C10373b.C10374a.C103751.C103761 */

                    @Override // com.bytedance.ee.bear.onboarding.C10370a.AbstractC10371a
                    /* renamed from: a */
                    public void mo39506a() {
                        C10370a.m43112b(this);
                        if (!gVar.isCancelled()) {
                            gVar.onNext(C10374a.f27908a);
                            gVar.onComplete();
                        }
                    }
                });
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: a */
            public void mo39516a(List<String> list) {
                C10370a.m43108a(list);
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: a */
            public boolean mo39517a(String str) {
                return C10370a.m43110a(str);
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: a */
            public String mo39511a(Context context, String str) {
                return C10380a.m43174b(context, str);
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: a */
            public void mo39514a(AbstractC10397d<C10403a> dVar, FragmentActivity fragmentActivity) {
                C10370a.m43105a(dVar, fragmentActivity);
            }

            @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10386a
            /* renamed from: a */
            public <UI extends AbstractC10405c> void mo39515a(AbstractC10397d<UI> dVar, UI ui) {
                C10370a.m43106a(dVar, ui);
            }
        };
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10398b
    /* renamed from: a */
    public AbstractC10399c mo39507a() {
        return C10374a.f27908a;
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10398b
    /* renamed from: b */
    public void mo39510b() {
        C10370a.m43111b();
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10398b
    /* renamed from: a */
    public void mo39509a(String str, String str2) {
        C10370a.m43107a(str, str2);
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10398b
    /* renamed from: a */
    public void mo39508a(Context context, C10917c cVar, Map<String, OnBoardingColorStyle> map) {
        C10370a.m43102a(context, cVar, map);
    }
}
