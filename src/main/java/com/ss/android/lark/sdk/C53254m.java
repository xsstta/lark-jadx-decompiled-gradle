package com.ss.android.lark.sdk;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.sdk.m */
public class C53254m {

    /* renamed from: a */
    private static Context f131607a;

    /* renamed from: b */
    private static AbstractC53239f f131608b = new AbstractC53239f() {
        /* class com.ss.android.lark.sdk.C53254m.C532551 */

        @Override // com.ss.android.lark.sdk.AbstractC53239f
        /* renamed from: a */
        public void mo103037a(String str, String str2) {
            Log.m165383e(str, str2);
        }

        @Override // com.ss.android.lark.sdk.AbstractC53239f
        /* renamed from: b */
        public void mo103039b(String str, String str2) {
            Log.m165389i(str, str2);
        }

        @Override // com.ss.android.lark.sdk.AbstractC53239f
        /* renamed from: c */
        public void mo103040c(String str, String str2) {
            Log.m165379d(str, str2);
        }

        @Override // com.ss.android.lark.sdk.AbstractC53239f
        /* renamed from: d */
        public void mo103041d(String str, String str2) {
            Log.m165397w(str, str2);
        }

        @Override // com.ss.android.lark.sdk.AbstractC53239f
        /* renamed from: a */
        public void mo103038a(String str, String str2, String str3) {
            Log.m165379d(str2, str3);
        }
    };

    /* renamed from: c */
    private static AbstractC53240g f131609c = new AbstractC53240g() {
        /* class com.ss.android.lark.sdk.C53254m.C532562 */

        @Override // com.ss.android.lark.sdk.AbstractC53240g
        /* renamed from: a */
        public void mo181688a(String str) {
        }
    };

    /* renamed from: d */
    private static AbstractC53238e f131610d;

    /* renamed from: e */
    private static volatile AbstractC53235b f131611e;

    /* renamed from: f */
    private static AbstractC53236c f131612f;

    /* renamed from: g */
    private static AbstractC53237d f131613g = new AbstractC53237d() {
        /* class com.ss.android.lark.sdk.C53254m.C532573 */

        @Override // com.ss.android.lark.sdk.AbstractC53237d
        /* renamed from: a */
        public void mo178036a(Command command) {
        }
    };

    /* renamed from: a */
    public static Context m205919a() {
        return f131607a;
    }

    /* renamed from: b */
    public static AbstractC53239f m205926b() {
        return f131608b;
    }

    /* renamed from: c */
    public static AbstractC53240g m205927c() {
        return f131609c;
    }

    /* renamed from: d */
    public static AbstractC53238e m205928d() {
        return f131610d;
    }

    /* renamed from: e */
    public static AbstractC53235b m205929e() {
        return f131611e;
    }

    /* renamed from: f */
    public static AbstractC53236c m205930f() {
        return f131612f;
    }

    /* renamed from: g */
    public static AbstractC53237d m205931g() {
        return f131613g;
    }

    /* renamed from: a */
    public static void m205920a(Context context) {
        f131607a = context;
    }

    /* renamed from: a */
    public static void m205921a(AbstractC53235b bVar) {
        f131611e = bVar;
    }

    /* renamed from: a */
    public static void m205922a(AbstractC53236c cVar) {
        f131612f = cVar;
    }

    /* renamed from: a */
    public static void m205923a(AbstractC53237d dVar) {
        f131613g = dVar;
    }

    /* renamed from: a */
    public static void m205924a(AbstractC53238e eVar) {
        f131610d = eVar;
    }

    /* renamed from: a */
    public static void m205925a(AbstractC53239f fVar) {
        f131608b = fVar;
    }
}
