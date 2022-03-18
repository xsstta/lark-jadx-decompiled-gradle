package com.ss.android.lark.guide.p1912b.p1913a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.onboarding.v1.PushProductGuide;
import com.ss.android.lark.guide.engine.GuideKeys;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.util.share_preference.C57744a;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.guide.b.a.a */
public class C38557a {

    /* renamed from: a */
    private volatile boolean f99075a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.b.a.a$a */
    public static class C38559a {

        /* renamed from: a */
        public static final C38557a f99077a = new C38557a();
    }

    /* renamed from: a */
    public static final C38557a m152072a() {
        return C38559a.f99077a;
    }

    /* renamed from: c */
    private void m152073c() {
        C53248k.m205912a().mo181697a(Command.PUSH_PRODUCT_GUIDE, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.guide.p1912b.p1913a.C38557a.C385581 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C38557a.this.mo141280a(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo141281b() {
        if (!this.f99075a) {
            synchronized (this) {
                if (!this.f99075a) {
                    m152073c();
                    this.f99075a = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo141280a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            List<String> a = GuideKeys.f99073a.mo141279a();
            for (Map.Entry<String, Boolean> entry : PushProductGuide.ADAPTER.decode(bArr).guides.entrySet()) {
                if (a.contains(entry.getKey())) {
                    Log.m165389i("modify before", "key : " + entry.getKey() + " original value : " + C57744a.m224104a().getBoolean(entry.getKey()));
                    C57744a.m224104a().putBoolean(entry.getKey(), entry.getValue().booleanValue());
                    Log.m165389i("push value ", "key : " + entry.getKey() + " push value : " + entry.getValue());
                    Log.m165389i("modify after", "key : " + entry.getKey() + " original value : " + C57744a.m224104a().getBoolean(entry.getKey()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
