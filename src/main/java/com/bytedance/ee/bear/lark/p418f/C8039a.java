package com.bytedance.ee.bear.lark.p418f;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ee.bear.lark.C8012c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.lark.f.a */
public class C8039a {

    /* renamed from: a */
    private ViewGroup f21532a;

    /* renamed from: com.bytedance.ee.bear.lark.f.a$a */
    private static class C8041a {

        /* renamed from: a */
        public static final C8039a f21533a = new C8039a();
    }

    private C8039a() {
    }

    /* renamed from: a */
    public static C8039a m32112a() {
        return C8041a.f21533a;
    }

    /* renamed from: b */
    public ViewGroup mo31078b() {
        return this.f21532a;
    }

    /* renamed from: a */
    public void mo31077a(Context context) {
        C13479a.m54764b("SpaceUIPreloader_firstTab", "preload ui start");
        this.f21532a = C8012c.m31983a().mo31024a(context, false);
        C13479a.m54764b("SpaceUIPreloader_firstTab", "preload ui end");
    }
}
