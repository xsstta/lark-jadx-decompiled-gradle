package com.bytedance.applog.manager;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.j */
public class C3438j extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10938e;

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x0038 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v12, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: java.lang.reflect.Method */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* renamed from: a */
    public int[] mo13879a() {
        int i;
        int i2;
        NoSuchMethodException e;
        int i3;
        IllegalArgumentException e2;
        int i4;
        IllegalAccessException e3;
        int i5;
        InvocationTargetException e4;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) this.f10938e.getSystemService("window")).getDefaultDisplay();
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
                i2 = displayMetrics.widthPixels;
                try {
                    i = displayMetrics.heightPixels;
                } catch (NoSuchMethodException e5) {
                    e = e5;
                }
                return new int[]{i2, i};
            }
            Method method = Display.class.getMethod("getRawHeight", new Class[0]);
            Method method2 = Display.class.getMethod("getRawWidth", new Class[0]);
            try {
                int intValue = ((Integer) method2.invoke(defaultDisplay, new Object[0])).intValue();
                try {
                    i = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                    i2 = intValue;
                } catch (IllegalArgumentException e6) {
                    e2 = e6;
                    i3 = intValue;
                    e2.printStackTrace();
                    i5 = i3;
                    i2 = i5 == 1 ? 1 : 0;
                    i = 0;
                    return new int[]{i2, i};
                } catch (IllegalAccessException e7) {
                    e3 = e7;
                    i4 = intValue;
                    e3.printStackTrace();
                    i5 = i4;
                    i2 = i5 == 1 ? 1 : 0;
                    i = 0;
                    return new int[]{i2, i};
                } catch (InvocationTargetException e8) {
                    e4 = e8;
                    method2 = intValue;
                    try {
                        e4.printStackTrace();
                        i5 = method2;
                        i2 = i5 == 1 ? 1 : 0;
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        i2 = method2 == true ? 1 : 0;
                        e.printStackTrace();
                        i = 0;
                        return new int[]{i2, i};
                    }
                    i = 0;
                    return new int[]{i2, i};
                }
            } catch (IllegalArgumentException e10) {
                e2 = e10;
                i3 = 0;
                e2.printStackTrace();
                i5 = i3;
                i2 = i5 == 1 ? 1 : 0;
                i = 0;
                return new int[]{i2, i};
            } catch (IllegalAccessException e11) {
                e3 = e11;
                i4 = 0;
                e3.printStackTrace();
                i5 = i4;
                i2 = i5 == 1 ? 1 : 0;
                i = 0;
                return new int[]{i2, i};
            } catch (InvocationTargetException e12) {
                e4 = e12;
                method2 = 0;
                e4.printStackTrace();
                i5 = method2;
                i2 = i5 == 1 ? 1 : 0;
                i = 0;
                return new int[]{i2, i};
            }
            return new int[]{i2, i};
        } catch (NoSuchMethodException e13) {
            e = e13;
            i2 = 0;
            e.printStackTrace();
            i = 0;
            return new int[]{i2, i};
        }
    }

    C3438j(Context context) {
        super(true, false);
        this.f10938e = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        String str;
        int i = this.f10938e.getResources().getDisplayMetrics().densityDpi;
        switch (i) {
            case SmEvents.EVENT_NW /*{ENCODED_INT: 120}*/:
                str = "ldpi";
                break;
            case 240:
                str = "hdpi";
                break;
            case 260:
            case 280:
            case LocationRequest.PRIORITY_INDOOR /*{ENCODED_INT: 300}*/:
            case 320:
                str = "xhdpi";
                break;
            case 340:
            case 360:
            case MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL /*{ENCODED_INT: 400}*/:
            case 420:
            case 440:
            case 480:
                str = "xxhdpi";
                break;
            case 560:
            case 640:
                str = "xxxhdpi";
                break;
            default:
                str = "mdpi";
                break;
        }
        jSONObject.put("density_dpi", i);
        jSONObject.put("display_density", str);
        int[] a = mo13879a();
        jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, a[1] + "x" + a[0]);
        return true;
    }
}
