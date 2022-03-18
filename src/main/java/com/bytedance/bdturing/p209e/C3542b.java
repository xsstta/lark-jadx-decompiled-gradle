package com.bytedance.bdturing.p209e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.bdturing.EventReport;
import com.bytedance.bdturing.LogUtil;
import com.bytedance.common.utility.NetworkUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\u001a\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u001a$\u0010\u0013\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u001a\"\u0010\u0016\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\r\u001a$\u0010\u0016\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¨\u0006\u0017"}, d2 = {"appendUrlParams", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "url", "", "params", "Lorg/json/JSONObject;", "convertJson2Form", "findActivity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "getCurrentOrientation", "", "activity", "getDensity", "", "getManifestVersionCode", "getResolution", "appendFirstParam", "key", "value", "appendParams", "BdTuringSdk_i18nRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.e.b */
public final class C3542b {
    /* renamed from: a */
    public static final Activity m14901a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        while (true) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper instanceof Activity) {
                return (Activity) contextWrapper;
            }
            context = contextWrapper.getBaseContext();
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static final String m14907b(Activity activity) {
        if (activity == null) {
            return null;
        }
        Resources resources = activity.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "activity.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('*');
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public static final int m14900a(Activity activity) {
        if (activity == null) {
            return 0;
        }
        WindowManager windowManager = activity.getWindowManager();
        Intrinsics.checkExpressionValueIsNotNull(windowManager, "activity.windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "activity.windowManager.defaultDisplay");
        int rotation = defaultDisplay.getRotation();
        LogUtil.m14895a("AbstractRequest", "rotation current " + rotation);
        int i = 2;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        return 0;
                    }
                }
            }
            i = 1;
        }
        EventReport.m14813b(i);
        return i;
    }

    /* renamed from: b */
    public static final float m14906b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            Method declaredMethod = DisplayMetrics.class.getDeclaredMethod("getDeviceDensity", null);
            Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke != null) {
                return ((float) ((Integer) invoke).intValue()) / 160.0f;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception unused) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
            Resources resources = applicationContext.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.applicationContext.resources");
            return resources.getDisplayMetrics().density;
        }
    }

    /* renamed from: a */
    public static final StringBuilder m14905a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "params");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str = null;
            try {
                str = jSONObject.getString(next);
            } catch (Exception e) {
                e.printStackTrace();
            }
            arrayList.add(new Pair(next, str));
        }
        sb.append(NetworkUtils.format(arrayList, "UTF-8"));
        return sb;
    }

    /* renamed from: a */
    public static final StringBuilder m14902a(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(jSONObject, "params");
        StringBuilder sb = new StringBuilder(str);
        if (StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null) < 0) {
            sb.append("?");
        } else {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            try {
                str2 = jSONObject.getString(next);
            } catch (Exception e) {
                e.printStackTrace();
            }
            arrayList.add(new Pair(next, str2));
        }
        sb.append(NetworkUtils.format(arrayList, "UTF-8"));
        return sb;
    }

    /* renamed from: a */
    public static final StringBuilder m14903a(StringBuilder sb, String str, int i) {
        Intrinsics.checkParameterIsNotNull(sb, "$this$appendParams");
        Intrinsics.checkParameterIsNotNull(str, "key");
        return m14904a(sb, str, String.valueOf(i));
    }

    /* renamed from: b */
    public static final StringBuilder m14908b(StringBuilder sb, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(sb, "$this$appendFirstParam");
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (str2 == null) {
            return sb;
        }
        try {
            sb.append(str);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            LogUtil.m14894a(e);
        }
        return sb;
    }

    /* renamed from: a */
    public static final StringBuilder m14904a(StringBuilder sb, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(sb, "$this$appendParams");
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (str2 == null) {
            return sb;
        }
        try {
            sb.append(ContainerUtils.FIELD_DELIMITER);
            sb.append(str);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            LogUtil.m14894a(e);
        }
        return sb;
    }
}
