package com.bytedance.ies.bullet.service.schema.param.core;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0016H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/UIParamTypes;", "", "()V", "COLOR", "Lcom/bytedance/ies/bullet/service/schema/param/core/IParamType;", "Lcom/bytedance/ies/bullet/service/schema/param/core/UIColor;", "getCOLOR", "()Lcom/bytedance/ies/bullet/service/schema/param/core/IParamType;", "NAV_BTN_TYPE", "Lcom/bytedance/ies/bullet/service/schema/param/core/NavBtnType;", "getNAV_BTN_TYPE", "OUT_ANIMATION_TYPE", "Lcom/bytedance/ies/bullet/service/schema/param/core/OutAnimationType;", "getOUT_ANIMATION_TYPE", "STATUS_FONT_MODE", "Lcom/bytedance/ies/bullet/service/schema/param/core/StatusFontMode;", "getSTATUS_FONT_MODE", "TOP_BAR_TYPE", "Lcom/bytedance/ies/bullet/service/schema/param/core/TopBarType;", "getTOP_BAR_TYPE", "colorPreset", "", "", "fillRgb", "rgbColor", "parseColor", "color", "registerBundleHandlers", "", "registerMapHandlers", "registerUriHandlers", "rgbaToArgb", "rgbaColor", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.schema.param.core.d */
public final class UIParamTypes {

    /* renamed from: a */
    public static final UIParamTypes f37973a;

    /* renamed from: b */
    private static final IParamType<UIColor> f37974b = new ParamType(UIColor.class);

    /* renamed from: c */
    private static final IParamType<TopBarType> f37975c = new ParamType(TopBarType.class);

    /* renamed from: d */
    private static final IParamType<NavBtnType> f37976d = new ParamType(NavBtnType.class);

    /* renamed from: e */
    private static final IParamType<StatusFontMode> f37977e = new ParamType(StatusFontMode.class);

    /* renamed from: f */
    private static final IParamType<OutAnimationType> f37978f = new ParamType(OutAnimationType.class);

    /* renamed from: g */
    private static final Map<String, String> f37979g;

    private UIParamTypes() {
    }

    static {
        UIParamTypes dVar = new UIParamTypes();
        f37973a = dVar;
        dVar.m58196a();
        dVar.m58198b();
        dVar.m58200c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("white", "#FFFFFFFF");
        linkedHashMap.put("black", "#FF000000");
        linkedHashMap.put("transparent", "#00000000");
        f37979g = linkedHashMap;
    }

    /* renamed from: a */
    private final void m58196a() {
        IParamType<UIColor> aVar = f37974b;
        aVar.mo52851a(Uri.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$1());
        aVar.mo52852a(Uri.Builder.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$2());
        IParamType<TopBarType> aVar2 = f37975c;
        aVar2.mo52851a(Uri.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$3());
        aVar2.mo52852a(Uri.Builder.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$4());
        IParamType<NavBtnType> aVar3 = f37976d;
        aVar3.mo52851a(Uri.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$5());
        aVar3.mo52852a(Uri.Builder.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$6());
        IParamType<StatusFontMode> aVar4 = f37977e;
        aVar4.mo52851a(Uri.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$7());
        aVar4.mo52852a(Uri.Builder.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$8());
        IParamType<OutAnimationType> aVar5 = f37978f;
        aVar5.mo52851a(Uri.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$9());
        aVar5.mo52852a(Uri.Builder.class, new UIParamTypes$registerUriHandlers$$inlined$registerUriQueryHandler$10());
    }

    /* renamed from: b */
    private final void m58198b() {
        IParamType<UIColor> aVar = f37974b;
        aVar.mo52851a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$1());
        aVar.mo52852a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$2());
        IParamType<TopBarType> aVar2 = f37975c;
        aVar2.mo52851a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$3());
        aVar2.mo52852a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$4());
        IParamType<NavBtnType> aVar3 = f37976d;
        aVar3.mo52851a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$5());
        aVar3.mo52852a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$6());
        IParamType<StatusFontMode> aVar4 = f37977e;
        aVar4.mo52851a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$7());
        aVar4.mo52852a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$8());
        IParamType<OutAnimationType> aVar5 = f37978f;
        aVar5.mo52851a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$9());
        aVar5.mo52852a(Bundle.class, new UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$10());
    }

    /* renamed from: c */
    private final void m58200c() {
        IParamType<UIColor> aVar = f37974b;
        aVar.mo52851a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$1());
        aVar.mo52852a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$2());
        IParamType<TopBarType> aVar2 = f37975c;
        aVar2.mo52851a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$3());
        aVar2.mo52852a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$4());
        IParamType<NavBtnType> aVar3 = f37976d;
        aVar3.mo52851a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$5());
        aVar3.mo52852a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$6());
        IParamType<StatusFontMode> aVar4 = f37977e;
        aVar4.mo52851a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$7());
        aVar4.mo52852a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$8());
        IParamType<OutAnimationType> aVar5 = f37978f;
        aVar5.mo52851a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$9());
        aVar5.mo52852a(Map.class, new UIParamTypes$registerMapHandlers$$inlined$registerMapHandler$10());
    }

    /* renamed from: c */
    private final String m58199c(String str) {
        if (str.length() != 8) {
            return str;
        }
        return StringsKt.takeLast(str, 2) + StringsKt.dropLast(str, 2);
    }

    /* renamed from: b */
    private final String m58197b(String str) {
        if (str.length() != 3) {
            return str;
        }
        return "FF" + str.charAt(0) + str.charAt(0) + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2);
    }

    /* renamed from: a */
    public final UIColor mo52859a(String str) {
        UIColor cVar = new UIColor(-2);
        try {
            Map<String, String> map = f37979g;
            if (map.keySet().contains(str)) {
                return new UIColor(Color.parseColor(map.get(str)));
            }
            if (StringsKt.startsWith$default(str, "#", false, 2, (Object) null)) {
                str = StringsKt.drop(str, 1);
            }
            int length = str.length();
            if (length == 3) {
                String b = m58197b(str);
                return new UIColor(Color.parseColor('#' + b));
            } else if (length == 6) {
                return new UIColor(Color.parseColor("#FF" + str));
            } else if (length != 8) {
                return cVar;
            } else {
                String c = m58199c(str);
                return new UIColor(Color.parseColor('#' + c));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
