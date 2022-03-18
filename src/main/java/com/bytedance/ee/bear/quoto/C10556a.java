package com.bytedance.ee.bear.quoto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.quoto.BusinessInfoRequester;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.bytedance.ee.bear.quoto.a */
public class C10556a {
    /* renamed from: b */
    public static void m43751b() {
        C57744a.m224104a().putString("key_business_info", "");
    }

    /* renamed from: a */
    public static BusinessInfoRequester.BusinessInfoResult m43749a() {
        return (BusinessInfoRequester.BusinessInfoResult) JSON.parseObject(C57744a.m224104a().getString("key_business_info", ""), new TypeReference<BusinessInfoRequester.BusinessInfoResult>() {
            /* class com.bytedance.ee.bear.quoto.C10556a.C105571 */
        }, new Feature[0]);
    }

    /* renamed from: a */
    public static void m43750a(BusinessInfoRequester.BusinessInfoResult businessInfoResult) {
        C57744a.m224104a().putString("key_business_info", JSON.toJSONString(businessInfoResult));
    }
}
