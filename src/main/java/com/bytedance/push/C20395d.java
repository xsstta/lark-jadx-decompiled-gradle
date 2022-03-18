package com.bytedance.push;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bytepoet.push.BytePoetConfig;
import com.bytedance.push.utils.C20552c;
import com.ss.android.push.Triple;
import com.ss.android.pushmanager.AbstractC59965c;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.d */
public final class C20395d implements AbstractC59965c {

    /* renamed from: a */
    public final String f49849a;

    /* renamed from: b */
    private final boolean f49850b;

    @Override // com.ss.android.pushmanager.AbstractC59965c
    /* renamed from: d */
    public Triple<String, String, String> mo68792d() {
        return new Triple<String, String, String>() {
            /* class com.bytedance.push.C20395d.C203961 */

            @Override // com.ss.android.push.Triple
            public String getLeft() {
                return Key.UMENG_APP_KEY;
            }

            @Override // com.ss.android.push.Triple
            public String getMiddle() {
                return Key.UMENG_MESSAGE_SECRET;
            }

            @Override // com.ss.android.push.Triple
            public String getRight() {
                return C20395d.this.f49849a;
            }
        };
    }

    /* renamed from: e */
    private boolean m74303e() {
        try {
            Class.forName("com.bytedance.bytepoet.push.BytePoetConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.ss.android.pushmanager.AbstractC59965c
    /* renamed from: a */
    public Pair<String, String> mo68788a() {
        return new Pair<>(Key.MI_PUSH_APP_ID, Key.MI_PUSH_APP_KEY);
    }

    @Override // com.ss.android.pushmanager.AbstractC59965c
    /* renamed from: b */
    public Pair<String, String> mo68790b() {
        return new Pair<>(Key.MZ_PUSH_APP_ID, Key.MZ_PUSH_APP_KEY);
    }

    @Override // com.ss.android.pushmanager.AbstractC59965c
    /* renamed from: c */
    public Pair<String, String> mo68791c() {
        return new Pair<>(Key.OPPO_PUSH_APP_KEY, Key.OPPO_PUSH_APP_SECRET);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68789a(Application application) {
        String packageName = application.getPackageName();
        if (this.f49850b && !m74303e()) {
            C20552c.m74845a("init", "i18n version，configuration not exist。ignore!");
        } else if (!TextUtils.equals(packageName, BytePoetConfig.PACKAGE_NAME)) {
            throw new IllegalArgumentException("packageName is different between configuration");
        } else if (BytePoetConfig.SUPPORT_SDK_VERSION < 1) {
            throw new IllegalArgumentException("configuration version mismatch，please go to [https://appcloud.bytedance.net/client-sdk/config] and generate new configuration again");
        }
    }

    C20395d(boolean z, String str) {
        this.f49850b = z;
        this.f49849a = str;
    }
}
