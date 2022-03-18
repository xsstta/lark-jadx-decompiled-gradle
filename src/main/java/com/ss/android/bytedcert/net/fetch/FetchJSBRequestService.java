package com.ss.android.bytedcert.net.fetch;

import com.ss.android.bytedcert.config.INetWork;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.net.C28421a;
import com.ss.android.bytedcert.net.C28428b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J(\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J2\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0013j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007JD\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001aH\u0002JD\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001aH\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/bytedcert/net/fetch/FetchJSBRequestService;", "Lcom/ss/android/bytedcert/net/fetch/RequestService;", "Lcom/ss/android/bytedcert/net/fetch/FetchJSBRequest;", "Lcom/ss/android/bytedcert/net/fetch/FetchJSBResponse;", "Lcom/ss/android/bytedcert/net/fetch/KeyGenerator;", "()V", "METHOD_GET", "", "METHOD_POST", "REQUEST_TYPE_JSON", "REQUEST_TYPE_RAW", "TAG", "directRequest", "", "request", "callback", "Lcom/ss/android/bytedcert/net/fetch/CallBack;", "generate", "getHeaderMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headerMap", "getHeaders", "", "Lcom/ss/android/bytedcert/net/BCHeader;", "getParams", "", "paramStr", "innerGet", "network", "Lcom/ss/android/bytedcert/config/INetWork;", "extraInfo", "", "innerPost", "Lcom/ss/android/bytedcert/net/fetch/RequestService$Callback;", "byted_cert_core_release"}, mo238835k = 1, mv = {1, 1, 13})
/* renamed from: com.ss.android.bytedcert.net.a.e */
public final class FetchJSBRequestService {

    /* renamed from: a */
    public static final FetchJSBRequestService f71499a = new FetchJSBRequestService();

    private FetchJSBRequestService() {
    }

    /* renamed from: b */
    private final List<C28421a> m104166b(String str) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new C28421a(next, jSONObject.optString(next)));
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: c */
    private final HashMap<String, String> m104168c(String str) {
        boolean z;
        HashMap<String, String> hashMap = new HashMap<>();
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next == null) {
                    next = "";
                }
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (JSONException unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public final Map<String, String> mo101218a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next == null) {
                    next = "";
                }
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public String mo101217a(FetchJSBRequest dVar) {
        String str;
        List list;
        String str2;
        int hashCode;
        Intrinsics.checkParameterIsNotNull(dVar, "request");
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("baseUrl:");
        sb.append(dVar.mo101207b());
        sb.append(",path:");
        sb.append(dVar.mo101208c());
        sb.append(",method:");
        String e = dVar.mo101210e();
        Object obj = null;
        String str3 = null;
        obj = null;
        obj = null;
        obj = null;
        if (e != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (e != null) {
                str = e.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",needAddCommonParams:");
        sb.append(dVar.mo101215j());
        sb.append(",header:");
        FetchJSBRequestService eVar = f71499a;
        List<C28421a> b = eVar.m104166b(dVar.mo101212g());
        if (!(!b.isEmpty())) {
            b = null;
        }
        if (b != null) {
            list = CollectionsKt.sortedWith(b, C28426a.f71500a);
        } else {
            list = null;
        }
        sb.append(list);
        sb.append(",data:");
        String e2 = dVar.mo101210e();
        if (e2 != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.getDefault()");
            if (e2 != null) {
                str2 = e2.toLowerCase(locale2);
                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode2 = str2.hashCode();
            if (hashCode2 != 102230) {
                if (hashCode2 == 3446944 && str2.equals("post")) {
                    String f = dVar.mo101211f();
                    if (f != null) {
                        Locale locale3 = Locale.getDefault();
                        Intrinsics.checkExpressionValueIsNotNull(locale3, "Locale.getDefault()");
                        if (f != null) {
                            str3 = f.toLowerCase(locale3);
                            Intrinsics.checkExpressionValueIsNotNull(str3, "(this as java.lang.String).toLowerCase(locale)");
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    obj = (str3 != null && ((hashCode = str3.hashCode()) == 112680 ? str3.equals("raw") : !(hashCode != 3271912 || !str3.equals("json")))) ? dVar.mo101214i() : MapsKt.toSortedMap(eVar.mo101218a(dVar.mo101214i()));
                }
            } else if (str2.equals("get")) {
                obj = MapsKt.toSortedMap(eVar.mo101218a(dVar.mo101213h()));
            }
        }
        sb.append(obj);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "request.run {\n        St…        .toString()\n    }");
        return sb2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/bytedcert/net/BCHeader;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.bytedcert.net.a.e$a */
    public static final class C28426a<T> implements Comparator<C28421a> {

        /* renamed from: a */
        public static final C28426a f71500a = new C28426a();

        C28426a() {
        }

        /* renamed from: a */
        public final int compare(C28421a aVar, C28421a aVar2) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, "o1");
            String a = aVar.mo101199a();
            Intrinsics.checkExpressionValueIsNotNull(a, "o1.name");
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "o2");
            String a2 = aVar2.mo101199a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "o2.name");
            return StringsKt.compareTo(a, a2, true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.ss.android.bytedcert.net.a.e */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.ss.android.bytedcert.net.a.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e A[Catch:{ all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d A[Catch:{ all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e A[Catch:{ all -> 0x00ea }] */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104165a(com.ss.android.bytedcert.net.fetch.FetchJSBRequest r10, com.ss.android.bytedcert.net.p1316a.AbstractC28424c<com.ss.android.bytedcert.net.fetch.FetchJSBRequest, com.ss.android.bytedcert.net.fetch.FetchJSBResponse> r11) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.bytedcert.net.fetch.FetchJSBRequestService.m104165a(com.ss.android.bytedcert.net.a.d, com.ss.android.bytedcert.net.a.c):void");
    }

    /* renamed from: a */
    private final void m104164a(FetchJSBRequest dVar, INetWork iNetWork, AbstractC28424c<FetchJSBRequest, FetchJSBResponse> cVar, Map<String, ? extends Object> map) throws Exception {
        BDResponse bDResponse;
        boolean z;
        boolean z2;
        if (dVar.mo101209d()) {
            Boolean j = dVar.mo101215j();
            if (j != null) {
                z2 = j.booleanValue();
            } else {
                z2 = false;
            }
            bDResponse = C28428b.m104193d(z2, dVar.mo101203a(), m104168c(dVar.mo101212g()), mo101218a(dVar.mo101213h()), map);
        } else {
            Boolean j2 = dVar.mo101215j();
            if (j2 != null) {
                z = j2.booleanValue();
            } else {
                z = false;
            }
            bDResponse = C28428b.m104192c(z, dVar.mo101208c(), m104168c(dVar.mo101212g()), mo101218a(dVar.mo101213h()), map);
        }
        if (bDResponse == null || !bDResponse.success) {
            Intrinsics.checkExpressionValueIsNotNull(bDResponse, "response");
            cVar.mo101020a(dVar, new FetchJSBResponse(bDResponse, "network error"));
            return;
        }
        cVar.mo101021a(dVar, new FetchJSBResponse(bDResponse, "success"), false);
    }

    /* renamed from: b */
    private final void m104167b(FetchJSBRequest dVar, INetWork iNetWork, AbstractC28424c<FetchJSBRequest, FetchJSBResponse> cVar, Map<String, ? extends Object> map) throws Exception {
        String str;
        BDResponse bDResponse;
        boolean z;
        boolean z2;
        int hashCode;
        boolean z3;
        boolean z4;
        String f = dVar.mo101211f();
        if (f != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (f != null) {
                str = f.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str = null;
        }
        if (str != null && ((hashCode = str.hashCode()) == 112680 ? str.equals("raw") : !(hashCode != 3271912 || !str.equals("json")))) {
            String str2 = "";
            if (dVar.mo101209d()) {
                HashMap<String, String> c = m104168c(dVar.mo101212g());
                String f2 = dVar.mo101211f();
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.getDefault()");
                if (f2 != null) {
                    String lowerCase = f2.toLowerCase(locale2);
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (Intrinsics.areEqual(lowerCase, "json")) {
                        c.put("Content-Type", "application/json");
                    }
                    Boolean j = dVar.mo101215j();
                    if (j != null) {
                        z4 = j.booleanValue();
                    } else {
                        z4 = false;
                    }
                    String a = dVar.mo101203a();
                    HashMap<String, String> hashMap = c;
                    String i = dVar.mo101214i();
                    if (i != null) {
                        str2 = i;
                    }
                    bDResponse = C28428b.m104188b(z4, a, hashMap, str2, map);
                    Intrinsics.checkExpressionValueIsNotNull(bDResponse, "BCNetworkUtils.fetchPost…nfo\n                    )");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                Boolean j2 = dVar.mo101215j();
                if (j2 != null) {
                    z3 = j2.booleanValue();
                } else {
                    z3 = false;
                }
                String c2 = dVar.mo101208c();
                HashMap<String, String> c3 = m104168c(dVar.mo101212g());
                String i2 = dVar.mo101214i();
                if (i2 != null) {
                    str2 = i2;
                }
                bDResponse = C28428b.m104182a(z3, c2, c3, str2, map);
                Intrinsics.checkExpressionValueIsNotNull(bDResponse, "BCNetworkUtils.fetchPost…nfo\n                    )");
            }
        } else if (dVar.mo101209d()) {
            Boolean j3 = dVar.mo101215j();
            if (j3 != null) {
                z2 = j3.booleanValue();
            } else {
                z2 = false;
            }
            bDResponse = C28428b.m104189b(z2, dVar.mo101203a(), m104168c(dVar.mo101212g()), mo101218a(dVar.mo101214i()), map);
            Intrinsics.checkExpressionValueIsNotNull(bDResponse, "BCNetworkUtils.fetchPost…nfo\n                    )");
        } else {
            Boolean j4 = dVar.mo101215j();
            if (j4 != null) {
                z = j4.booleanValue();
            } else {
                z = false;
            }
            bDResponse = C28428b.m104183a(z, dVar.mo101208c(), m104168c(dVar.mo101212g()), mo101218a(dVar.mo101214i()), map);
            Intrinsics.checkExpressionValueIsNotNull(bDResponse, "BCNetworkUtils.fetchPost…nfo\n                    )");
        }
        if (bDResponse == null || !bDResponse.success) {
            cVar.mo101020a(dVar, new FetchJSBResponse(bDResponse, "network error"));
        } else {
            cVar.mo101021a(dVar, new FetchJSBResponse(bDResponse, "success"), false);
        }
    }
}
