package com.bytedance.ee.webapp.v2;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.webapp.p721b.C13763a;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.webapp.v2.h */
public class C13848h {

    /* renamed from: a */
    boolean f36203a;

    /* renamed from: b */
    private String f36204b;

    /* renamed from: c */
    private String f36205c;

    /* renamed from: d */
    private int f36206d;

    /* renamed from: e */
    private boolean f36207e;

    /* renamed from: f */
    private String f36208f;

    /* renamed from: e */
    private void m56144e() {
    }

    /* renamed from: a */
    public void mo51076a() {
        m56144e();
    }

    /* renamed from: b */
    public void mo51080b() {
        m56144e();
    }

    /* renamed from: c */
    public String mo51081c() {
        return this.f36204b;
    }

    /* renamed from: d */
    public int mo51082d() {
        return this.f36206d;
    }

    /* renamed from: a */
    public void mo51079a(boolean z) {
        this.f36207e = z;
    }

    /* renamed from: a */
    public static boolean m56143a(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("key_is_tab_mode", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo51077a(Bundle bundle, Fragment fragment) {
        this.f36206d = bundle.getInt("key_scene", -1);
        this.f36204b = bundle.getString("key_appid", "");
        this.f36205c = bundle.getString("key_appname", "");
        this.f36208f = bundle.getString("url", "");
        Log.m165389i("WebAppTabViewHolder", "WebAppTabViewHolder onCreate appid:" + this.f36204b + " scene:" + this.f36206d + " name:" + this.f36205c);
        C13763a.m55779a().mo50751a(true);
    }

    /* renamed from: a */
    public void mo51078a(View view, FrameLayout frameLayout, int i, View.OnClickListener onClickListener) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = i;
        Log.m165389i("WebAppTabViewHolder", "onCreateView init topMargin:" + layoutParams.topMargin);
        frameLayout.setLayoutParams(layoutParams);
    }
}
