package com.bytedance.ee.bear.drive.p325b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.contract.route.parcelable.DriveRouteBean;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.tuple.Triple;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.b.b */
public class C6320b extends AbstractC10737b {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return null;
    }

    public C6320b(C10917c cVar, AbstractC10738c... cVarArr) {
        super(cVar, cVarArr);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!TextUtils.equals(bearUrl.f17446a, C8275a.f22375h.mo32553a())) {
            return false;
        }
        C13479a.m54764b("FileleInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        if (mo40642c(bearUrl, routeBean)) {
            return true;
        }
        mo25415b(bearUrl, routeBean);
        return true;
    }

    /* renamed from: b */
    public void mo25415b(BearUrl bearUrl, RouteBean routeBean) {
        Bundle bundle;
        List<Document> list;
        Map<String, String> map;
        String str;
        String str2;
        String str3;
        String str4 = "";
        Bundle bundle2 = null;
        if (routeBean != null) {
            str3 = routeBean.mo40635u();
            str2 = routeBean.mo40629o();
            str = routeBean.mo40632r();
            map = routeBean.mo40633s();
            if (routeBean instanceof DriveRouteBean) {
                list = ((DriveRouteBean) routeBean).mo20996a();
            } else {
                list = null;
            }
            bundle = routeBean.mo40628n();
        } else {
            str3 = str4;
            str2 = str3;
            str = str2;
            map = null;
            list = null;
            bundle = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = bearUrl.f17453h;
        }
        if (bearUrl.f17449d != null) {
            str4 = bearUrl.f17449d.get("docId");
        }
        Context b = ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17294b();
        if (b == null) {
            b = C13615c.f35773a;
        }
        Triple<ArrayList<BaseOpenEntity>, SpaceFileOpenEntity, Integer> a = C6321c.m25398a(list, bearUrl.f17447b);
        SpaceFileOpenEntity middle = a.getMiddle();
        if (middle != null) {
            middle.setFileName(str2);
            middle.setUrl(bearUrl.f17450e);
            middle.setOriginUrl(str3);
            middle.setExtra(map);
            middle.setFeedId(str4);
            middle.setReminderBinder(bundle);
            if (routeBean != null) {
                bundle2 = routeBean.mo40634t();
            }
            middle.setExtras(bundle2);
            middle.setPreviewFrom(str);
        }
        ((AbstractC5239d) KoinJavaComponent.m268610a(AbstractC5239d.class)).mo21093a(b, a.getLeft(), a.getRight().intValue());
    }
}
