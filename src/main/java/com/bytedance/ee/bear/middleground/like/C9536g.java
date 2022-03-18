package com.bytedance.ee.bear.middleground.like;

import android.text.TextUtils;
import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.like.C9536g;
import com.bytedance.ee.bear.middleground.like.p460a.AbstractC9501a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.like.g */
public final class C9536g {

    /* renamed from: a */
    private static final AbstractC9501a f25599a = new AbstractC9501a() {
        /* class com.bytedance.ee.bear.middleground.like.C9536g.C95371 */

        /* renamed from: a */
        final C10917c f25600a = new C10917c(new C10929e());

        @Override // com.bytedance.ee.bear.middleground.like.p460a.AbstractC9501a
        /* renamed from: a */
        public String mo36377a() {
            return C4484g.m18494b().mo17252c();
        }

        @Override // com.bytedance.ee.bear.middleground.like.p460a.AbstractC9501a
        /* renamed from: b */
        public boolean mo36383b() {
            return C5084ad.m20847d().mo20038b().mo20041b();
        }

        @Override // com.bytedance.ee.bear.middleground.like.p460a.AbstractC9501a
        /* renamed from: b */
        public void mo36382b(String str) {
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(str);
        }

        @Override // com.bytedance.ee.bear.middleground.like.p460a.AbstractC9501a
        /* renamed from: a */
        public boolean mo36381a(String str) {
            AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
            if (f == null || TextUtils.equals(str, f.f14592i) || f.mo19681c()) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.ee.bear.middleground.like.p460a.AbstractC9501a
        /* renamed from: a */
        public void mo36380a(String str, Map map) {
            C5234y.m21391b().mo21079a(str, map);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m39376a(String str, DocMetaInfo docMetaInfo) throws Exception {
            C13479a.m54764b("LikeModule", "fetchDocMetaInfo()... onSuccess");
            ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, docMetaInfo.getTitle());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m39377a(String str, Throwable th) throws Exception {
            C13479a.m54773d("LikeModule", "fetchDocMetaInfo()... onFailure", th);
            ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, (CharSequence) null);
        }

        @Override // com.bytedance.ee.bear.middleground.like.p460a.AbstractC9501a
        /* renamed from: a */
        public void mo36378a(String str, int i, String str2) {
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/doc/like/activity").mo17314a(LikeListActivity.f25518a, str).mo17308a(LikeListActivity.f25519b, i).mo17314a(LikeListActivity.f25520c, str2).mo17317a();
        }

        @Override // com.bytedance.ee.bear.middleground.like.p460a.AbstractC9501a
        /* renamed from: a */
        public void mo36379a(String str, C8275a aVar, String str2) {
            ((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20313a(str2, aVar.mo32555b()).mo238001b(new Consumer(str) {
                /* class com.bytedance.ee.bear.middleground.like.$$Lambda$g$1$Y9kIshFYapoQR5NZMQtU0et0_FU */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9536g.C95371.m39376a(this.f$0, (DocMetaInfo) obj);
                }
            }, new Consumer(str) {
                /* class com.bytedance.ee.bear.middleground.like.$$Lambda$g$1$BVhMR3sXbV3V_gfHMKrcLy758zQ */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9536g.C95371.m39377a(this.f$0, (Throwable) obj);
                }
            });
        }
    };

    /* renamed from: a */
    public static AbstractC9501a m39375a() {
        return f25599a;
    }
}
