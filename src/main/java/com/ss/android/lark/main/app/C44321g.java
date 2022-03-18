package com.ss.android.lark.main.app;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.main.app.g */
public class C44321g {

    /* renamed from: a */
    private ViewGroup f112397a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.g$a */
    public static class C44323a {

        /* renamed from: a */
        static C44321g f112399a = new C44321g();
    }

    /* renamed from: a */
    public static C44321g m175828a() {
        return C44323a.f112399a;
    }

    /* renamed from: b */
    public void mo157435b() {
        synchronized (this) {
            this.f112397a = null;
        }
    }

    /* renamed from: a */
    private GLSurfaceView m175827a(Activity activity) {
        GLSurfaceView gLSurfaceView = new GLSurfaceView(activity);
        gLSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        gLSurfaceView.setVisibility(8);
        return gLSurfaceView;
    }

    /* renamed from: a */
    public View mo157434a(Activity activity, boolean z) {
        ViewGroup viewGroup;
        boolean z2 = !C26326z.m95344h();
        synchronized (this) {
            ViewGroup viewGroup2 = this.f112397a;
            if (viewGroup2 == null || viewGroup2.getContext() != activity) {
                LayoutInflater from = LayoutInflater.from(activity);
                if (!DesktopUtil.m144301a((Context) activity)) {
                    this.f112397a = (ViewGroup) from.inflate(R.layout.main_fragment_layout, (ViewGroup) null);
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) from.inflate(R.layout.desktop_fragment_layout, (ViewGroup) null);
                    this.f112397a = viewGroup3;
                    viewGroup3.setOnKeyListener(new View.OnKeyListener() {
                        /* class com.ss.android.lark.main.app.C44321g.View$OnKeyListenerC443221 */

                        public boolean onKey(View view, int i, KeyEvent keyEvent) {
                            Log.m165379d("test", "event " + keyEvent.toString());
                            return false;
                        }
                    });
                }
                if (z2) {
                    this.f112397a.addView(m175827a(activity));
                }
            }
            viewGroup = this.f112397a;
            if (z) {
                this.f112397a = null;
            }
        }
        return viewGroup;
    }
}
