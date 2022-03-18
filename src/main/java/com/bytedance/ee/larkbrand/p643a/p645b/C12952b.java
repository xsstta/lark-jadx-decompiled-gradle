package com.bytedance.ee.larkbrand.p643a.p645b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.settings.v2.handler.C66804v;
import com.tt.miniapp.util.C67028b;
import com.tt.miniapphost.AppbrandContext;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.bytedance.ee.larkbrand.a.b.b */
public class C12952b {

    /* renamed from: a */
    public static ArrayList<C12951a> f34505a = new ArrayList<>();

    /* renamed from: a */
    private static ArrayList<C12951a> m53345a() {
        if (f34505a.size() > 0) {
            return f34505a;
        }
        if (AppbrandContext.getInst().getApplicationContext() != null) {
            ArrayList<C12951a> b = m53346b(C66804v.m260682a().mo232712b());
            f34505a = b;
            if (b.size() == 0) {
                f34505a = m53346b(C67028b.m261243a(AppbrandContext.getInst().getApplicationContext(), "lark_link_config"));
            }
        }
        return f34505a;
    }

    /* renamed from: a */
    public static String m53344a(String str) {
        Iterator<C12951a> it = m53345a().iterator();
        while (it.hasNext()) {
            C12951a next = it.next();
            if (next.mo48849a(str)) {
                AppBrandLogger.m52830i("LarkLinkToMiniUtils", next.f34500a);
                return next.f34500a;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static ArrayList<C12951a> m53346b(String str) {
        ArrayList<C12951a> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(new C12951a(jSONArray.optJSONObject(i)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
