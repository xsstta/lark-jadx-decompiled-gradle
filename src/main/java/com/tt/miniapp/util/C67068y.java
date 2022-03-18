package com.tt.miniapp.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.util.y */
public class C67068y {

    /* renamed from: com.tt.miniapp.util.y$a */
    public interface AbstractC67069a {
        /* renamed from: w */
        View mo232134w();
    }

    /* renamed from: a */
    public static void m261381a(AbstractC67069a aVar) {
        ContextSingletonInstance.getInstance().mWeakActivityInfo = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public static JSONObject m261379a(IAppContext iAppContext) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View view;
        JSONObject jSONObject = new JSONObject();
        try {
            WeakReference<AbstractC67069a> weakReference = ContextSingletonInstance.getInstance().mWeakActivityInfo;
            if (!TextUtils.equals(C67052p.m261322a(iAppContext), "custom") || weakReference == null || weakReference.get() == null || weakReference.get().mo232134w() == null) {
                i = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                View w = weakReference.get().mo232134w();
                View findViewById = w.findViewById(R.id.microapp_m_loading_title_bar);
                if (findViewById == null) {
                    view = w.findViewById(R.id.fl_title_bar_capsule_right);
                } else {
                    view = findViewById.findViewById(R.id.fl_title_bar_capsule_right);
                }
                float e = C67043j.m261281e(iAppContext.getApplicationContext());
                i5 = (int) Math.ceil((double) (((float) view.getTop()) / e));
                i4 = (int) Math.ceil((double) (((float) view.getLeft()) / e));
                i3 = (int) Math.ceil((double) (((float) view.getBottom()) / e));
                i2 = i4 + 0;
                i = (int) Math.ceil((double) (((float) view.getHeight()) / e));
            }
            jSONObject.put("left", 0);
            jSONObject.put("right", i4);
            jSONObject.put("top", i5);
            jSONObject.put("bottom", i3);
            jSONObject.put("width", i2);
            jSONObject.put("height", i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        AppBrandLogger.m52828d("tma_SystemInfoUtil", " , NavigationBarSafeArea = " + jSONObject.toString());
        return jSONObject;
    }

    /* renamed from: a */
    private static void m261380a(Context context, int[] iArr, IAppContext iAppContext) {
        int i;
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        if (appInfo != null && appInfo.isGame()) {
            int i2 = context.getResources().getConfiguration().orientation;
            if (appInfo.isLandScape) {
                i = 2;
            } else {
                i = 1;
            }
            if (i2 != i) {
                int i3 = iArr[0];
                iArr[0] = iArr[1];
                iArr[1] = i3;
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m261377a(Context context, int i, int i2) {
        DisplayCutout displayCutout;
        int i3;
        int i4;
        int i5;
        int i6;
        WindowInsets rootWindowInsets;
        JSONObject jSONObject = new JSONObject();
        try {
            WeakReference<AbstractC67069a> weakReference = ContextSingletonInstance.getInstance().mWeakActivityInfo;
            if (weakReference == null || weakReference.get() == null || weakReference.get().mo232134w() == null || Build.VERSION.SDK_INT < 28 || (rootWindowInsets = weakReference.get().mo232134w().getRootWindowInsets()) == null) {
                displayCutout = null;
            } else {
                displayCutout = rootWindowInsets.getDisplayCutout();
            }
            if (displayCutout == null || Build.VERSION.SDK_INT < 28) {
                i6 = i;
                i3 = i2;
                i5 = 0;
                i4 = 0;
            } else {
                i5 = (int) Math.ceil((double) (((float) displayCutout.getSafeInsetLeft()) / C67043j.m261281e(context)));
                i -= (int) Math.ceil((double) (((float) displayCutout.getSafeInsetRight()) / C67043j.m261281e(context)));
                i4 = (int) Math.ceil((double) (((float) displayCutout.getSafeInsetTop()) / C67043j.m261281e(context)));
                i2 -= (int) Math.ceil((double) (((float) displayCutout.getSafeInsetBottom()) / C67043j.m261281e(context)));
                i3 = i2 - i4;
                i6 = i - i5;
            }
            jSONObject.put("left", i5);
            jSONObject.put("right", i);
            jSONObject.put("top", i4);
            jSONObject.put("bottom", i2);
            jSONObject.put("width", i6);
            jSONObject.put("height", i3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AppBrandLogger.m52828d("tma_SystemInfoUtil", " , safeArea = " + jSONObject.toString());
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c7, code lost:
        if (r9 != 0) goto L_0x00d6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m261378a(android.content.Context r8, boolean r9, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r10) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.C67068y.m261378a(android.content.Context, boolean, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):org.json.JSONObject");
    }
}
