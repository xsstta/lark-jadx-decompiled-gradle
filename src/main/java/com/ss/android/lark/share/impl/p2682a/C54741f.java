package com.ss.android.lark.share.impl.p2682a;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.share.C54713a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.share.impl.a.f */
public class C54741f {

    /* renamed from: a */
    public Map<String, Integer> f135181a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.share.impl.a.f$a */
    public static final class C54743a {

        /* renamed from: a */
        public static final C54741f f135182a = new C54741f();
    }

    /* renamed from: a */
    public static C54741f m212395a() {
        return C54743a.f135182a;
    }

    /* renamed from: b */
    public void mo186877b() {
        this.f135181a.clear();
    }

    private C54741f() {
        this.f135181a = new HashMap();
    }

    /* renamed from: a */
    public int mo186875a(String str) {
        return m212398c(str, -100);
    }

    /* renamed from: b */
    public void mo186878b(String str) {
        this.f135181a.remove(str);
    }

    /* renamed from: a */
    public void mo186876a(String str, int i) {
        this.f135181a.put(str, Integer.valueOf(i));
    }

    /* renamed from: c */
    private int m212398c(String str, int i) {
        Integer num = this.f135181a.get(str);
        if (num != null || this.f135181a.containsKey(str)) {
            return num.intValue();
        }
        return i;
    }

    /* renamed from: b */
    private static void m212397b(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.intent.lark.EXTRA_BASEREQ_ERROR_CODE", i);
        try {
            Intent intent = new Intent(str + ".larkshare.LarkShareActivity");
            intent.setFlags(268435456);
            intent.putExtras(bundle);
            C54713a.m212321a().mo178386a().startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m212396a(CommonShareData commonShareData, boolean z) {
        if (commonShareData != null) {
            if (z) {
                m212397b(commonShareData.getPackageName(), -2);
                return;
            }
            int a = m212395a().mo186875a(commonShareData.getHashKey());
            if (a == -100) {
                m212397b(commonShareData.getPackageName(), 0);
                return;
            }
            m212395a().mo186878b(commonShareData.getHashKey());
            if (a == 0) {
                m212397b(commonShareData.getPackageName(), 0);
            } else if (a == -3) {
                m212397b(commonShareData.getPackageName(), -3);
            }
        }
    }
}
