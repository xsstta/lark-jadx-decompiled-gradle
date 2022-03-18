package com.bytedance.apm.p143i.p145b.p146a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2750c;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p150l.C3023c;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.b.a.a */
public final class C2955a {
    /* renamed from: a */
    private static void m12438a(View view) {
        if (view.getBackground() != null) {
            try {
                view.getBackground().setCallback(null);
                view.setBackgroundDrawable(null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12437a(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (activity != null && activity.getWindow() != null && activity.getWindow().peekDecorView() != null) {
            try {
                if (Build.VERSION.SDK_INT > 16 && !activity.isDestroyed()) {
                    return;
                }
                if (activity.getWindow().getContext() == activity) {
                    View rootView = activity.getWindow().peekDecorView().getRootView();
                    ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
                    if (viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getContext() == activity) {
                        m12439a(rootView, activity);
                    }
                }
            } catch (Throwable th) {
                if (C2785b.m11769j()) {
                    C2925e.m12373b("ActivityLeakFixer", "caught unexpected exception when unbind drawables.", th.getMessage());
                }
            }
        } else if (C2785b.m11769j()) {
            C2925e.m12374c("ActivityLeakFixer", "unbindDrawables, ui or ui's window is null, skip rest works.");
        }
        if (C2785b.m11769j()) {
            C2925e.m12374c("ActivityLeakFixer", "unbindDrawables done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
        }
    }

    /* renamed from: a */
    private static void m12441a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setCallback(null);
            }
            imageView.setImageDrawable(null);
        }
    }

    /* renamed from: a */
    private static void m12442a(TextView textView) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setCallback(null);
            }
        }
        textView.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: a */
    public static void m12443a(String str) {
        boolean b = C3023c.m12694b("activity_leak_event");
        if (C2785b.m11769j()) {
            C2925e.m12374c("ActivityLeakFixer", "activity_leak_event : " + b);
        }
        if (b && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, 1);
                C2741a.m11630c().mo11785a(new C2750c("activity_leak_event", 0, null, jSONObject, null, null));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m12439a(View view, Activity activity) {
        if (view != null && view.getContext() != null) {
            if (view.getContext() == activity) {
                m12438a(view);
                if (view instanceof ImageView) {
                    m12441a((ImageView) view);
                }
                if (view instanceof TextView) {
                    m12442a((TextView) view);
                }
            }
            if (view instanceof ViewGroup) {
                m12440a((ViewGroup) view, activity);
            }
        }
    }

    /* renamed from: a */
    private static void m12440a(ViewGroup viewGroup, Activity activity) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m12439a(viewGroup.getChildAt(i), activity);
        }
    }
}
