package com.ss.android.vc.lark.rvc;

import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.net.service.VCSettingsService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/vc/lark/rvc/RvcJSProtocol;", "", "()V", "BIZ_BIND", "", "getBIZ_BIND", "()Ljava/lang/String;", "BIZ_CLOSE_RVC", "getBIZ_CLOSE_RVC", "BIZ_COPY", "getBIZ_COPY", "BIZ_LOG", "getBIZ_LOG", "BIZ_RVC_BASE", "getBIZ_RVC_BASE", "BIZ_SHARE", "getBIZ_SHARE", "PREFIX_URL_RVC_HOST", "getPREFIX_URL_RVC_HOST", "PREFIX_URL_RVC_PATH", "getPREFIX_URL_RVC_PATH", "TAG", "getRvcFeatureInjector", "Lcom/larksuite/component/webview/container/dto/FeatureInjector;", "getRvcJsHandlers", "Ljava/util/ArrayList;", "Lcom/larksuite/component/webview/container/impl/jsapi/InjectJSApiWrapper;", "Lkotlin/collections/ArrayList;", "isRvcUrl", "", "url", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.rvc.a */
public final class RvcJSProtocol {

    /* renamed from: a */
    public static final RvcJSProtocol f153231a = new RvcJSProtocol();

    /* renamed from: b */
    private static final String f153232b = f153232b;

    /* renamed from: c */
    private static final String f153233c = f153233c;

    /* renamed from: d */
    private static final String f153234d = f153234d;

    /* renamed from: e */
    private static final String f153235e = (f153234d + "close");

    /* renamed from: f */
    private static final String f153236f = (f153234d + "shareMeeting");

    /* renamed from: g */
    private static final String f153237g = (f153234d + "hasBind");

    /* renamed from: h */
    private static final String f153238h = (f153234d + "copyText");

    /* renamed from: i */
    private static final String f153239i = (f153234d + "log");

    private RvcJSProtocol() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final C25830a m237941b() {
        C25830a aVar = new C25830a(false);
        aVar.mo91893a(m237939a());
        aVar.mo91890a(new RvcInjectWebViewDelegate());
        return aVar;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ArrayList<InjectJSApiWrapper> m237939a() {
        ArrayList<InjectJSApiWrapper> arrayList = new ArrayList<>();
        arrayList.add(new InjectJSApiWrapper(f153235e, new CloseRvcHandler()));
        arrayList.add(new InjectJSApiWrapper(f153236f, new ShareMeetingHandler()));
        arrayList.add(new InjectJSApiWrapper(f153238h, new CopyTextHandler()));
        arrayList.add(new InjectJSApiWrapper(f153237g, new HasBindHandler()));
        arrayList.add(new InjectJSApiWrapper(f153239i, new LogHandler()));
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m237940a(String str) {
        boolean z;
        String path;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String settings = VCSettingsService.getSettings("rvc_url_config");
        String str2 = settings;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            JSONArray optJSONArray = new JSONObject(settings).optJSONArray("urls");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList<String> arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = optJSONArray.getString(i);
                    Intrinsics.checkExpressionValueIsNotNull(string, "items.getString(i)");
                    if (string.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        String string2 = optJSONArray.getString(i);
                        Intrinsics.checkExpressionValueIsNotNull(string2, "items.getString(i)");
                        arrayList.add(string2);
                    }
                }
                C60700b.m235851b("RvcManager", "isRvcUrl", "remote white urls = " + arrayList);
                for (String str3 : arrayList) {
                    StringBuilder sb = new StringBuilder();
                    Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
                    String host = parse.getHost();
                    String str4 = "null";
                    if (host == null) {
                        host = str4;
                    }
                    sb.append(host);
                    String path2 = parse.getPath();
                    if (path2 != null) {
                        str4 = path2;
                    }
                    sb.append(str4);
                    if (StringsKt.startsWith$default(str3, sb.toString(), false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
        } else {
            C60700b.m235851b("RvcManager", "isRvcUrl2", "RVC_URL_CONFIG setting is null");
        }
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        String host2 = parse.getHost();
        if (host2 == null || !StringsKt.startsWith$default(host2, f153233c, false, 2, (Object) null) || (path = parse.getPath()) == null || !StringsKt.startsWith$default(path, f153232b, false, 2, (Object) null)) {
            return false;
        }
        return true;
    }
}
