package com.bytedance.ee.lark.infra.cookie;

import android.content.Context;
import android.webkit.CookieManager;
import com.bytedance.ee.lark.infra.cookie.p616a.AbstractC12754a;
import com.bytedance.ee.lark.infra.cookie.p616a.C12756c;
import com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a;
import com.bytedance.ee.lark.infra.cookie.persistence.C12772c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0016J0\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001f2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\n\u0010&\u001a\u00060'j\u0002`(H\u0016J\u0018\u0010)\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aH\u0016J\u0018\u0010*\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006,"}, d2 = {"Lcom/bytedance/ee/lark/infra/cookie/CommonCookiePersistentWrapper;", "Lcom/bytedance/ee/lark/infra/cookie/persistence/CookiePersistent;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cookieCache", "Lcom/bytedance/ee/lark/infra/cookie/cache/CookieCache;", "cookiePersistent", "(Landroid/content/Context;Lcom/bytedance/ee/lark/infra/cookie/cache/CookieCache;Lcom/bytedance/ee/lark/infra/cookie/persistence/CookiePersistent;)V", "getContext", "()Landroid/content/Context;", "setContext", "getCookieCache", "()Lcom/bytedance/ee/lark/infra/cookie/cache/CookieCache;", "setCookieCache", "(Lcom/bytedance/ee/lark/infra/cookie/cache/CookieCache;)V", "getCookiePersistent", "()Lcom/bytedance/ee/lark/infra/cookie/persistence/CookiePersistent;", "setCookiePersistent", "(Lcom/bytedance/ee/lark/infra/cookie/persistence/CookiePersistent;)V", "clear", "", "filterPersistentCookies", "", "Lokhttp3/Cookie;", "cookies", "", "isCookieExpired", "", ConvertOfficeToSpaceService.f88309g, "loadAll", "", "loadForRequest", "url", "Lokhttp3/HttpUrl;", "excludeCookies", "", "", "debugInfo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "removeAll", "saveAll", "Companion", "ECOInfra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.lark.infra.cookie.c */
public class CommonCookiePersistentWrapper implements AbstractC12770a {

    /* renamed from: a */
    public static final Companion f34138a = new Companion(null);

    /* renamed from: b */
    private AbstractC12754a f34139b;

    /* renamed from: c */
    private AbstractC12770a f34140c;

    /* renamed from: d */
    private Context f34141d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/lark/infra/cookie/CommonCookiePersistentWrapper$Companion;", "", "()V", "TAG", "", "ECOInfra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.lark.infra.cookie.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Context mo48281c() {
        return this.f34141d;
    }

    @Override // com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a
    /* renamed from: a */
    public List<Cookie> mo48275a() {
        AppBrandLogger.m52830i("CookiePersistent", "load all persistent ....");
        List<Cookie> a = this.f34140c.mo48275a();
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        List<Cookie> list = a;
        if (true ^ list.isEmpty()) {
            this.f34139b.mo48266a(list);
        }
        return a;
    }

    @Override // com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a
    /* renamed from: b */
    public void mo48280b(Collection<Cookie> collection) {
        this.f34140c.mo48280b(collection);
    }

    /* renamed from: a */
    private final boolean m52773a(Cookie cookie) {
        if (cookie.expiresAt() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public CommonCookiePersistentWrapper(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f34139b = new C12756c();
        this.f34140c = new C12772c(context);
        this.f34141d = context;
    }

    @Override // com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a
    /* renamed from: a */
    public void mo48278a(Collection<Cookie> collection) {
        this.f34139b.mo48266a(collection);
        this.f34140c.mo48278a(mo48282c(collection));
    }

    /* renamed from: c */
    public final List<Cookie> mo48282c(Collection<Cookie> collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (collection != null) {
            for (T t : collection) {
                if (t.persistent()) {
                    arrayList.add(t);
                } else {
                    arrayList2.add(t.name());
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            AppBrandLogger.m52830i("CookiePersistent", "no persistent cookie:" + Arrays.toString(arrayList2.toArray()));
        }
        return arrayList;
    }

    public CommonCookiePersistentWrapper(Context context, AbstractC12754a aVar, AbstractC12770a aVar2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "cookieCache");
        Intrinsics.checkParameterIsNotNull(aVar2, "cookiePersistent");
        this.f34139b = aVar;
        this.f34140c = aVar2;
        this.f34141d = context;
    }

    /* renamed from: a */
    public List<Cookie> mo48276a(HttpUrl httpUrl, Set<String> set, StringBuilder sb) {
        Intrinsics.checkParameterIsNotNull(httpUrl, "url");
        Intrinsics.checkParameterIsNotNull(set, "excludeCookies");
        Intrinsics.checkParameterIsNotNull(sb, "debugInfo");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f34139b.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            Intrinsics.checkExpressionValueIsNotNull(cookie, "currentCookie");
            if (m52773a(cookie)) {
                arrayList.add(cookie);
                it.remove();
            } else if (cookie.matches(httpUrl)) {
                AppBrandLogger.m52828d("CookiePersistent", "loadForRequest currentCookie:" + cookie);
                AppBrandLogger.m52828d("CookiePersistent", "loadForRequest getCookie:" + CookieManager.getInstance().getCookie(httpUrl.toString()));
                sb.append(cookie.name());
                sb.append(" from cache;");
                String name = cookie.name();
                Intrinsics.checkExpressionValueIsNotNull(name, "currentCookie.name()");
                if (name == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                } else if (set.contains(StringsKt.trim((CharSequence) name).toString())) {
                    sb.append(cookie.name());
                    sb.append(" in exclude,so not load it;");
                } else {
                    arrayList2.add(cookie);
                }
            } else {
                continue;
            }
        }
        this.f34140c.mo48280b(arrayList);
        return arrayList2;
    }
}
