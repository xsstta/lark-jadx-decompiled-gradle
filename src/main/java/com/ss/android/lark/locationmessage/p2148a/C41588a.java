package com.ss.android.lark.locationmessage.p2148a;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.lark.biz.im.api.AbstractC29622o;
import com.ss.android.lark.location.dto.POIInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.locationmessage.a.a */
public class C41588a {

    /* renamed from: a */
    public static Map<String, C41588a> f105675a = new HashMap();

    /* renamed from: b */
    private String f105676b;

    /* renamed from: c */
    private AbstractC29622o f105677c;

    /* renamed from: a */
    public void mo149705a(AbstractC29622o oVar) {
        this.f105677c = oVar;
    }

    public C41588a(String str) {
        this.f105676b = str;
    }

    /* renamed from: a */
    public static void m165047a(String str) {
        if (!TextUtils.isEmpty(str) && f105675a.containsKey(str)) {
            f105675a.remove(str);
        }
    }

    /* renamed from: b */
    public static C41588a m165048b(String str) {
        if (f105675a.containsKey(str)) {
            return f105675a.get(str);
        }
        C41588a aVar = new C41588a(str);
        f105675a.put(str, aVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo149704a(Activity activity, POIInfo pOIInfo) {
        AbstractC29622o oVar = this.f105677c;
        if (oVar != null && pOIInfo != null) {
            oVar.handleResult(activity, pOIInfo);
        }
    }
}
