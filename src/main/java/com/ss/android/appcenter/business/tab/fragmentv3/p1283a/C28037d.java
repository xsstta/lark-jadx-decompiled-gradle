package com.ss.android.appcenter.business.tab.fragmentv3.p1283a;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.business.tab.business.p1273a.C27799j;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27923c;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.model.NodeParams;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a.d */
public class C28037d extends C28036c {
    /* renamed from: a */
    public static String m102472a(NodeParams nodeParams) {
        return m102462a("title", nodeParams.getProperties());
    }

    /* renamed from: b */
    public static String m102473b(NodeParams nodeParams) {
        return m102465b("titleIconUrl", nodeParams.getProperties());
    }

    /* renamed from: c */
    public static String m102474c(NodeParams nodeParams) {
        return m102465b("schema", nodeParams.getProperties());
    }

    /* renamed from: d */
    public static boolean m102475d(NodeParams nodeParams) {
        return m102471d(nodeParams.getComponentName(), "isTitleInside", nodeParams.getProperties());
    }

    /* renamed from: e */
    public static boolean m102476e(NodeParams nodeParams) {
        return m102471d(nodeParams.getComponentName(), "showHeader", nodeParams.getProperties());
    }

    /* renamed from: f */
    public static String m102477f(NodeParams nodeParams) {
        return m102465b("blockId", nodeParams.getProperties());
    }

    /* renamed from: g */
    public static String m102478g(NodeParams nodeParams) {
        return m102465b("itemId", nodeParams.getProperties());
    }

    /* renamed from: h */
    public static boolean m102479h(NodeParams nodeParams) {
        return m102471d(nodeParams.getComponentName(), "showBackground", nodeParams.getProperties());
    }

    /* renamed from: i */
    public static boolean m102480i(NodeParams nodeParams) {
        return m102471d(nodeParams.getComponentName(), "showImage", nodeParams.getProperties());
    }

    /* renamed from: j */
    public static boolean m102481j(NodeParams nodeParams) {
        return m102471d(nodeParams.getComponentName(), "showTitle", nodeParams.getProperties());
    }

    /* renamed from: k */
    public static boolean m102482k(NodeParams nodeParams) {
        return m102471d(nodeParams.getComponentName(), "forceUpdate", nodeParams.getProperties());
    }

    /* renamed from: m */
    public static String m102484m(NodeParams nodeParams) {
        return m102466b(nodeParams.getComponentName(), "tabSize", nodeParams.getProperties());
    }

    /* renamed from: o */
    public static int m102486o(NodeParams nodeParams) {
        return m102469c(nodeParams.getComponentName(), "titleMaxline", nodeParams.getProperties());
    }

    /* renamed from: p */
    public static int m102487p(NodeParams nodeParams) {
        return m102469c(nodeParams.getComponentName(), "descMaxline", nodeParams.getProperties());
    }

    /* renamed from: q */
    public static int m102488q(NodeParams nodeParams) {
        return m102469c(nodeParams.getComponentName(), "dateMaxline", nodeParams.getProperties());
    }

    /* renamed from: r */
    public static int m102489r(NodeParams nodeParams) {
        return m102469c(nodeParams.getComponentName(), "interval", nodeParams.getProperties());
    }

    /* renamed from: s */
    public static int m102490s(NodeParams nodeParams) {
        return m102469c(nodeParams.getComponentName(), "maxListLength", nodeParams.getProperties());
    }

    /* renamed from: t */
    public static int m102491t(NodeParams nodeParams) {
        return C28209p.m103293a(m102459a(), (float) m102469c(nodeParams.getComponentName(), "imageHeight", nodeParams.getProperties()));
    }

    /* renamed from: u */
    public static int m102492u(NodeParams nodeParams) {
        return C28209p.m103293a(m102459a(), (float) m102469c(nodeParams.getComponentName(), "imageWidth", nodeParams.getProperties()));
    }

    /* renamed from: l */
    public static List<C27799j> m102483l(NodeParams nodeParams) {
        if (nodeParams.getProperties() == null) {
            return null;
        }
        C28184h.m103250d("PropertyParser", "getTitleMenuList>>> start");
        JsonElement jsonElement = nodeParams.getProperties().get("iconItems");
        if (jsonElement == null) {
            return null;
        }
        List<C27799j> list = (List) C27579g.f68797a.fromJson(jsonElement, new TypeToken<List<C27799j>>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d.C280381 */
        }.getType());
        C28184h.m103250d("PropertyParser", "getTitleMenuList>>> end.");
        return list;
    }

    /* renamed from: n */
    public static JsonObject m102485n(NodeParams nodeParams) {
        if (nodeParams.getProperties() == null) {
            return null;
        }
        C28184h.m103250d("PropertyParser", "getTemplateConfig>>> start");
        JsonElement jsonElement = nodeParams.getProperties().get("templateConfig");
        if (jsonElement == null || !(jsonElement instanceof JsonObject)) {
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        C28184h.m103250d("PropertyParser", "getTemplateConfig>>> end");
        return asJsonObject;
    }

    /* renamed from: v */
    public static List<C27923c> m102493v(NodeParams nodeParams) {
        if (nodeParams.getProperties() == null) {
            return null;
        }
        C28184h.m103250d("PropertyParser", "getMenuItems>>> start");
        JsonElement jsonElement = nodeParams.getProperties().get("menuItems");
        if (jsonElement == null) {
            return null;
        }
        List<C27923c> list = (List) C27579g.f68797a.fromJson(jsonElement, new TypeToken<List<C27923c>>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d.C280392 */
        }.getType());
        C28184h.m103250d("PropertyParser", "getMenuItems>>> end.");
        return list;
    }
}
