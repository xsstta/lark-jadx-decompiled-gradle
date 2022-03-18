package com.ss.android.lark.inv.export.util;

import android.net.Uri;
import android.os.Bundle;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;

/* renamed from: com.ss.android.lark.inv.export.util.r */
public class C40132r {
    /* renamed from: b */
    public static void m159120b() {
        m159118a("https://www.feishu.cn/hc/articles/360049067837");
    }

    /* renamed from: d */
    public static void m159122d() {
        m159118a("https://www.feishu.cn/hc/zh-CN/articles/360049067724");
    }

    /* renamed from: a */
    public static void m159117a() {
        String str;
        if (C40147z.m159160a().isLarkEnv()) {
            str = "https://www.larksuite.com/hc/articles/360043763493";
        } else {
            str = "https://www.feishu.cn/hc/articles/360043505973";
        }
        m159118a(str);
    }

    /* renamed from: c */
    public static void m159121c() {
        String str;
        if (C40147z.m159160a().isLarkEnv()) {
            str = "https://www.larksuite.com/hc/zh-CN/articles/360040931394";
        } else {
            str = "https://www.feishu.cn/hc/zh-CN/articles/360040931334";
        }
        m159118a(str);
    }

    /* renamed from: a */
    public static void m159118a(String str) {
        m159119a(str, null);
    }

    /* renamed from: a */
    public static void m159119a(String str, Map<String, String> map) {
        if (C40110i.m159021a(str, 2000)) {
            C24162e eVar = new C24162e(C40147z.m159160a().getContext());
            Bundle bundle = new Bundle();
            if (map == null || map.isEmpty()) {
                bundle.putString("u", str);
            } else {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                bundle.putString("u", buildUpon.toString());
            }
            bundle.putInt("lkp_launch_type", 2);
            ((AbstractC24152a) ApiUtils.getApi(AbstractC24152a.class)).startH5Page(eVar, new C24160c(bundle));
        }
    }
}
