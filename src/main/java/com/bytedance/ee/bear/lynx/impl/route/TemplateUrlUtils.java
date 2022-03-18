package com.bytedance.ee.bear.lynx.impl.route;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.lynx.impl.utli.LynxResourceConstant;
import com.bytedance.ee.util.p701d.C13616d;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J!\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/route/TemplateUrlUtils;", "", "()V", "FIRST_NO_WAIT_FOR_GECKO", "", "FIRST_WAIT_FOR_GECKO", "ONLY_LOCAL_GECKO", "ONLY_REMOTE_GECKO", "templateUrlBundlePathMap", "", "", "templateUrlDynamicMap", "templateUrlPageBundlePathMap", "templateUrlPageDynamicMap", "getBundlePath", "viewOrPageType", "isPage", "", "getCdnUrl", "getResourceLoadDynamic", "(IZ)Ljava/lang/Integer;", "getTemplateUrl", "hostIsLocalIpAddr", "host", "isCCMValidLynxTemplateUrl", "uri", "Landroid/net/Uri;", "url", "isDebugTemplateUrl", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.b.e */
public final class TemplateUrlUtils {

    /* renamed from: a */
    public static final TemplateUrlUtils f23758a = new TemplateUrlUtils();

    /* renamed from: b */
    private static final Map<Integer, String> f23759b = MapsKt.mapOf(TuplesKt.to(1000, "pages/banner/template.js"));

    /* renamed from: c */
    private static final Map<Integer, Integer> f23760c = MapsKt.mapOf(TuplesKt.to(1000, 1));

    /* renamed from: d */
    private static final Map<Integer, String> f23761d = MapsKt.mapOf(TuplesKt.to(1000, "pages/banner/template.js"));

    /* renamed from: e */
    private static final Map<Integer, Integer> f23762e = MapsKt.mapOf(TuplesKt.to(1000, 3));

    private TemplateUrlUtils() {
    }

    /* renamed from: a */
    public final boolean mo33909a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(url)");
        return mo33908a(parse);
    }

    /* renamed from: a */
    public final boolean mo33908a(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        if (!uri.isHierarchical() || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getHost()) || !Intrinsics.areEqual("ccm-lynx", uri.getScheme()) || !Intrinsics.areEqual("lynxview", uri.getHost())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m37008b(String str) {
        if (str.length() <= 5) {
            return false;
        }
        if (str != null) {
            String substring = str.substring(0, 3);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (!Intrinsics.areEqual(substring, "10.")) {
                if (str != null) {
                    String substring2 = str.substring(0, 4);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (!Intrinsics.areEqual(substring2, "172.")) {
                        if (str != null) {
                            String substring3 = str.substring(0, 4);
                            Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            if (Intrinsics.areEqual(substring3, "192.")) {
                                return true;
                            }
                            return false;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    public final boolean mo33910b(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        if (C13616d.m55261a() && uri.isHierarchical() && !TextUtils.isEmpty(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
            String host = uri.getHost();
            if (host == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(host, "uri.host!!");
            if (!m37008b(host) || (!Intrinsics.areEqual("https", uri.getScheme()) && !Intrinsics.areEqual("http", uri.getScheme()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final String m37009c(int i, boolean z) {
        Map<Integer, String> map;
        if (z) {
            map = f23761d;
        } else {
            map = f23759b;
        }
        return map.get(Integer.valueOf(i));
    }

    /* renamed from: d */
    private final Integer m37010d(int i, boolean z) {
        Map<Integer, Integer> map;
        if (z) {
            map = f23762e;
        } else {
            map = f23760c;
        }
        return map.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    private final String m37007b(int i, boolean z) {
        String c = m37009c(i, z);
        if (c == null) {
            c = "";
        }
        return LynxResourceConstant.f23773a.mo33924a() + "/" + c;
    }

    /* renamed from: a */
    public final String mo33907a(int i, boolean z) {
        int i2;
        Integer d = m37010d(i, z);
        if (d != null) {
            i2 = d.intValue();
        } else {
            i2 = 1;
        }
        return "ccm-lynx://lynxview/?" + ("surl=" + URLEncoder.encode(m37007b(i, z), "UTF-8") + "&prefix=" + URLEncoder.encode(LynxResourceConstant.f23773a.mo33925b(), "UTF-8") + "&dynamic=" + i2);
    }

    /* renamed from: a */
    public static /* synthetic */ String m37006a(TemplateUrlUtils eVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return eVar.mo33907a(i, z);
    }
}
