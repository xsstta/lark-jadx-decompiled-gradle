package com.larksuite.component.dybrid.h5core.p1077e;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.dybrid.h5api.p1071b.C24177d;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.larksuite.component.dybrid.offlineresource.C24256d;
import com.larksuite.component.dybrid.offlineresource.bean.DynamicUrlSettingsBean;
import com.larksuite.component.dybrid.router.p1084a.AbstractC24260b;
import com.larksuite.component.dybrid.router.p1084a.AbstractC24262d;
import com.larksuite.component.dybrid.router.p1085b.C24269c;
import com.larksuite.component.dybrid.router.p1088e.C24274a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.larksuite.component.dybrid.h5core.e.b */
public class C24216b extends AbstractC24260b {
    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24263e
    /* renamed from: a */
    public boolean mo86850a(String str) {
        return true;
    }

    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24263e
    public boolean ab_() {
        return false;
    }

    public C24216b() {
        this.f59922a = "";
    }

    /* renamed from: a */
    public String mo86852a(String str, String str2) {
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        Uri.Builder buildUpon = parse2.buildUpon();
        if (parse2.isOpaque() || parse.isOpaque()) {
            Log.m165383e("UrlMapperHandler", "newUri or originUri is isOpaque ");
            return str2;
        }
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Set<String> queryParameterNames2 = parse2.getQueryParameterNames();
        for (String str3 : queryParameterNames) {
            if (!queryParameterNames2.contains(str3)) {
                buildUpon.appendQueryParameter(str3, C24177d.m88307a(parse, str3));
            }
        }
        return buildUpon.build().toString();
    }

    /* renamed from: b */
    public boolean mo86855b(String str, String str2) {
        Uri parse;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (parse = Uri.parse(str)) == null || parse.isOpaque()) {
            return false;
        }
        String replace = str.replace("?" + parse.getQuery(), "");
        if (TextUtils.isEmpty(replace) || !replace.matches(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo86853a(C24269c cVar, JSONObject jSONObject) {
        Set<String> keySet;
        boolean z;
        boolean z2;
        if (!(cVar == null || jSONObject == null || TextUtils.isEmpty(cVar.mo86903a()) || (keySet = jSONObject.keySet()) == null || keySet.size() == 0)) {
            for (String str : keySet) {
                String obj = jSONObject.get(str).toString();
                Uri parse = Uri.parse(cVar.mo86903a());
                if (!TextUtils.isEmpty(obj)) {
                    if (obj.equals("" + cVar.mo86904b().get(str))) {
                        z = true;
                        if (!TextUtils.isEmpty(obj) || !obj.equals(parse.getQueryParameter(str))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z && !z2) {
                            return false;
                        }
                    }
                }
                z = false;
                if (!TextUtils.isEmpty(obj)) {
                }
                z2 = false;
                if (z) {
                }
            }
        }
        return true;
    }

    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24263e
    /* renamed from: a */
    public C24269c mo86848a(Context context, C24269c cVar, AbstractC24262d dVar) {
        String str;
        boolean z;
        if (("into urlMapper => origin Url: " + cVar) == null) {
            str = "empty";
        } else {
            str = C24274a.m88628a(cVar.mo86903a());
        }
        Log.m165389i("UrlMapperHandler", str);
        DynamicUrlSettingsBean c = C24256d.m88585a().mo86889c();
        if (!(cVar == null || c == null || c.list == null)) {
            for (DynamicUrlSettingsBean.DynamicMapperBean dynamicMapperBean : c.list) {
                if (!(dynamicMapperBean == null || dynamicMapperBean.getUrlBean() == null)) {
                    if (C24212a.m88458b() == null || !C24212a.m88458b().mo86745a()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((z || dynamicMapperBean.getUrlBean().forceApply) && !TextUtils.isEmpty(cVar.mo86903a()) && mo86855b(cVar.mo86903a(), dynamicMapperBean.getPath()) && mo86853a(cVar, dynamicMapperBean.getParams())) {
                        return mo86851a(dynamicMapperBean.getPath(), cVar, dynamicMapperBean.getUrlBean());
                    }
                }
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public C24269c mo86851a(String str, C24269c cVar, DynamicUrlSettingsBean.DynamicUrlBean dynamicUrlBean) {
        if (!TextUtils.isEmpty(str) && cVar != null && dynamicUrlBean != null && !TextUtils.isEmpty(dynamicUrlBean.newUrl)) {
            Uri parse = Uri.parse(dynamicUrlBean.newUrl);
            if ("yes".equals(C24177d.m88307a(parse, "dynamic_ds"))) {
                if (TextUtils.isEmpty(C24256d.m88585a().mo86884a(C24177d.m88307a(parse, "dynamic_bn")))) {
                    return cVar;
                }
            }
            Matcher matcher = Pattern.compile(str).matcher(cVar.mo86903a());
            matcher.find();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < matcher.toMatchResult().groupCount()) {
                try {
                    i++;
                    arrayList.add(matcher.group(i));
                } catch (Exception e) {
                    Log.m165383e("UrlMapperHandler", "mappter group error " + e.getMessage());
                }
            }
            String a = mo86852a(cVar.mo86903a(), C24177d.m88308a("{", "}", dynamicUrlBean.newUrl, arrayList));
            Log.m165389i("UrlMapperHandler", " urlMapper => from: " + C24274a.m88628a(cVar.mo86903a()) + " to: " + C24274a.m88628a(a));
            cVar.mo86902a(a);
        }
        return cVar;
    }
}
