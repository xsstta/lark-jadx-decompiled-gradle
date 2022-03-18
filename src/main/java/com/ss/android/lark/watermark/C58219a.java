package com.ss.android.lark.watermark;

import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.lark.watermark.a */
public class C58219a {
    /* renamed from: a */
    public static boolean m225864a() {
        if (Build.VERSION.SDK_INT <= 29 || !RomUtils.m94944c() || !m225865b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static boolean m225865b() {
        String a = C58220a.m225867a("ro.miui.ui.version.name");
        if (a != null && "V125".compareTo(a) <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.watermark.a$a */
    public static class C58220a {
        /* renamed from: a */
        public static String m225867a(String str) {
            try {
                return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            } catch (Exception e) {
                Log.m165384e("WatermarkModule", "get error() ", e);
                return "";
            }
        }
    }

    /* renamed from: a */
    public void mo197246a(Activity activity) {
        try {
            FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView();
            Window window = activity.getWindow();
            Field a = C26254af.m95001a(frameLayout.getClass(), "mDecorCaptionView");
            a.setAccessible(true);
            if (((ViewGroup) a.get(frameLayout)) == null) {
                Method a2 = C26254af.m95003a(frameLayout.getClass(), "inflateDecorCaptionView", LayoutInflater.class);
                a2.setAccessible(true);
                ViewGroup viewGroup = (ViewGroup) a2.invoke(frameLayout, LayoutInflater.from(activity));
                Method a3 = C26254af.m95003a(viewGroup.getClass(), "setPhoneWindow", Class.forName("com.android.internal.policy.PhoneWindow"), Boolean.TYPE);
                a3.setAccessible(true);
                a3.invoke(viewGroup, window, false);
                a.set(frameLayout, viewGroup);
                Method a4 = C26254af.m95003a(frameLayout.getClass(), "enableCaption", Boolean.TYPE);
                a4.setAccessible(true);
                a4.invoke(frameLayout, true);
                Field a5 = C26254af.m95001a(frameLayout.getClass(), "mContentRoot");
                a5.setAccessible(true);
                ViewGroup viewGroup2 = (ViewGroup) a5.get(frameLayout);
                if (viewGroup.getParent() == null) {
                    frameLayout.addView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
                }
                if (viewGroup2 != null && viewGroup2.getParent() == frameLayout) {
                    frameLayout.removeView(viewGroup2);
                    viewGroup.addView(viewGroup2, new ViewGroup.MarginLayoutParams(-1, -1));
                }
            }
        } catch (Exception e) {
            Log.m165386e("WatermarkModule", e);
        }
    }
}
