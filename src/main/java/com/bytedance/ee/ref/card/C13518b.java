package com.bytedance.ee.ref.card;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.bytedance.ee.ref.card.p687b.C13521a;
import com.bytedance.ee.ref.card.p687b.C13523c;
import com.bytedance.lark.lynxlib.AbstractC14596e;
import com.bytedance.lark.lynxlib.C14583c;
import com.larksuite.component.openplatform.core.block.C24416f;
import com.larksuite.suite.R;
import com.lynx.tasm.C26596b;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.p1220b.C26603c;
import com.lynx.tasm.provider.AbstractC26942i;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapphost.p3362a.p3365c.C67452b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.card.b */
public class C13518b {

    /* renamed from: a */
    public static Handler f35606a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static AtomicBoolean f35607b = new AtomicBoolean(false);

    /* renamed from: com.bytedance.ee.ref.card.b$a */
    public interface AbstractC13520a {
        /* renamed from: a */
        void mo50274a(List<CardAppInfo> list);
    }

    /* renamed from: a */
    public static void m54918a(Context context) {
        if (!f35607b.get()) {
            f35607b.compareAndSet(false, true);
            C67452b.m262375a(new C13526c());
            C67452b.m262375a(new C24416f());
            C13521a.m54928a(new C13528d(context));
            C26596b.m96400a();
            C14583c.m59058a(new AbstractC14596e() {
                /* class com.bytedance.ee.ref.card.C13518b.C135191 */

                @Override // com.bytedance.lark.lynxlib.AbstractC14596e
                /* renamed from: b */
                public int mo50270b() {
                    return R.string.lark_brand_cancel;
                }

                @Override // com.bytedance.lark.lynxlib.AbstractC14596e
                /* renamed from: c */
                public int mo50271c() {
                    return R.string.lark_brand_confirm;
                }

                @Override // com.bytedance.lark.lynxlib.AbstractC14596e
                /* renamed from: e */
                public OkHttpClient mo50273e() {
                    return C66517e.m259917a();
                }

                @Override // com.bytedance.lark.lynxlib.AbstractC14596e
                /* renamed from: a */
                public Application mo50268a() {
                    return C13521a.m54927a().mo50288c();
                }

                @Override // com.bytedance.lark.lynxlib.AbstractC14596e
                /* renamed from: d */
                public boolean mo50272d() {
                    return C13521a.m54927a().mo50287b();
                }

                @Override // com.bytedance.lark.lynxlib.AbstractC14596e
                /* renamed from: a */
                public void mo50269a(String str, JSONObject jSONObject) {
                    C13521a.m54927a().mo50286a(str, jSONObject);
                }
            });
            AbstractC26942i h = LynxEnv.m96123e().mo94101h();
            if (h != null) {
                LynxEnv.m96123e().mo94087a(new C13540f(h));
            }
            C26603c.AbstractC26606a a = C26603c.m96407a();
            if (a != null) {
                C26603c.m96408a(new C13531e(a));
            }
            AppBrandLogger.m52830i("card_app_", "Card init success!");
        }
    }

    /* renamed from: a */
    public static void m54919a(Context context, List<String> list, AbstractC13520a aVar) {
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52830i("card_app_", "preInstallCard multi cards,but entities is empty!");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                C13523c.C13524a a = C13523c.m54933a(str);
                if (a == null) {
                    AppBrandLogger.m52830i("card_app_", "preInstallCard multi cards,schema is invalid schema is :", str);
                } else {
                    arrayList.add(a);
                }
            }
        }
        new C13494a(null).mo50207a(context, arrayList, aVar);
    }
}
