package com.bytedance.ee.bear.share.p542a;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.service.C10917c;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.share.a.d */
public class C10989d {
    /* renamed from: a */
    public static Disposable m45671a(String str, String str2, C10917c cVar) {
        return cVar.mo41508c(ak.class).mo238020d(new Function(str, str2) {
            /* class com.bytedance.ee.bear.share.p542a.$$Lambda$d$QB7UGxQdCRlOkWdupZcBTmCE3S0 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((ak) obj).shareTextPlain(this.f$0, this.f$1, true);
            }
        }).mo238001b($$Lambda$d$m1mAeIfbnIyCBx5JGaA4pVty_Y.INSTANCE, $$Lambda$d$jS8iHmGcZcpDc_glvtvIUmXUc.INSTANCE);
    }

    /* renamed from: a */
    public static Disposable m45672a(String str, String str2, String str3, C10917c cVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return cVar.mo41508c(ak.class).mo238020d(new Function(String.format("https://ee.bytedance.net/malaita/?miniPath=pages/publish/root?content=%1$s\n%2$s%3$s", str3, str2, str)) {
            /* class com.bytedance.ee.bear.share.p542a.$$Lambda$d$vMQfBJyjB8sOqZOy3vrr5tDKRnE */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((ak) obj).openExternalUrl(this.f$0, null);
            }
        }).mo238001b($$Lambda$d$vx4VsFJIc31wSE7yDfF5TafIvg.INSTANCE, $$Lambda$d$mwVfTqCDoV26xnJPCURQwnk1Sxs.INSTANCE);
    }
}
