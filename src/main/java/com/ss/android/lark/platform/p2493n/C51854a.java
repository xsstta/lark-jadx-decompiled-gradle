package com.ss.android.lark.platform.p2493n;

import android.content.Context;
import com.larksuite.framework.http.response.C26014a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29582d;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.C38825c;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.image.p1959b.AbstractC38820a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.network.C51864e;
import com.ss.android.lark.platform.p2482c.C51790a;
import com.ss.android.lark.platform.p2498r.C51947a;
import com.ss.android.lark.platform.statistics.p2502b.C51970d;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.n.a */
public class C51854a {

    /* renamed from: com.ss.android.lark.platform.n.a$a */
    public static class C51856a {

        /* renamed from: a */
        public static final AbstractC38820a f128868a = C51854a.m201095a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C38792a m201094a() {
        return new C38792a(C51856a.f128868a);
    }

    /* renamed from: b */
    public static void m201097b() {
        m201094a();
        boolean b = C38792a.m153106a().mo142263b("lark_hook_glide_url_loader");
        Log.m165389i("ImageModuleProvider", "preLoad, isEnableHookGlide:" + b);
        m201094a();
        C38792a.m153110a(LarkContext.getApplication(), b);
    }

    /* renamed from: a */
    public static AbstractC38820a m201095a(final Context context) {
        return new AbstractC38820a() {
            /* class com.ss.android.lark.platform.p2493n.C51854a.C518551 */

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: a */
            public Context mo142254a() {
                return context;
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: b */
            public long mo142262b() {
                return C51790a.m200787a();
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: c */
            public long mo142264c() {
                return C51790a.m200789b();
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: b */
            public boolean mo142263b(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            /* renamed from: a */
            private float m201098a(Context context) {
                if (DesktopUtil.m144301a(context)) {
                    return 2.0f;
                }
                return UIHelper.getResources().getDisplayMetrics().density;
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: a */
            public Resource mo142255a(C38824b bVar) {
                String str;
                AbstractC29582d a = C51947a.m201491a().mo181472a();
                if (bVar.mo142319b()) {
                    str = null;
                } else {
                    str = C57881t.m224610I(context);
                }
                return a.mo105863a(str, bVar.mo142313a(), bVar.mo142320c(), bVar.mo142321d());
            }

            /* renamed from: a */
            private List<C26014a> m201099a(List<Cookie> list) {
                ArrayList arrayList = new ArrayList();
                for (Cookie cookie : list) {
                    C26014a.C26015a aVar = new C26014a.C26015a();
                    aVar.mo92513a(cookie.name()).mo92515b(cookie.value()).mo92512a(cookie.expiresAt()).mo92517c(cookie.domain()).mo92518d(cookie.path());
                    if (cookie.secure()) {
                        aVar.mo92511a();
                    }
                    if (cookie.httpOnly()) {
                        aVar.mo92514b();
                    }
                    if (cookie.hostOnly()) {
                        aVar.mo92514b();
                    }
                    if (cookie.persistent()) {
                        aVar.mo92516c();
                    }
                    arrayList.add(aVar.mo92519d());
                }
                return arrayList;
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: a */
            public String mo142256a(PassThroughImage passThroughImage) {
                return C51947a.m201491a().mo181472a().mo105868a(C57881t.m224610I(context), passThroughImage.getImageKey(), passThroughImage.getFsUnit(), passThroughImage.getCrypto());
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: a */
            public String mo142257a(C38825c cVar) {
                return C51947a.m201491a().mo181472a().mo105865a(C57881t.m224610I(context), cVar.mo142325a());
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: a */
            public List<C26014a> mo142258a(String str) {
                if (!C36083a.m141486a().getOpenPlatformDependency().mo133026a(context)) {
                    return C51864e.m201147a().mo92414a(str);
                }
                OkHttpClient a = C36083a.m141486a().getOpenPlatformDependency().mo133007a();
                return m201099a(a.cookieJar().loadForRequest(HttpUrl.parse(str)));
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: a */
            public byte[] mo142261a(AvatarImage avatarImage) {
                return C51947a.m201491a().mo181472a().mo105877a(avatarImage.getEntityId(), avatarImage.getKey(), UIHelper.px2dp((float) Math.max(avatarImage.getWidth(), avatarImage.getHeight())), m201098a(context), "webp");
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: a */
            public void mo142260a(String str, JSONObject jSONObject) {
                Statistics.sendEvent(str, jSONObject);
            }

            @Override // com.ss.android.lark.image.p1959b.AbstractC38820a
            /* renamed from: a */
            public void mo142259a(String str, Map<String, Float> map, Map<String, String> map2, Map<String, String> map3, boolean z) {
                C51970d.m201580a(str, map, map2, map3, z);
            }
        };
    }

    /* renamed from: a */
    public static void m201096a(boolean z) {
        m201094a();
        C38792a.m153110a(LarkContext.getApplication(), z);
    }
}
