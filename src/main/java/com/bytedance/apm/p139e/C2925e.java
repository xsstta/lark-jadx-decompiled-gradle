package com.bytedance.apm.p139e;

import android.util.Log;
import com.ss.ttm.player.MediaPlayer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.e.e */
public class C2925e {

    /* renamed from: a */
    private static AbstractC2924d f9437a;

    /* renamed from: b */
    private static AbstractC2924d f9438b;

    static {
        C29261 r0 = new AbstractC2924d() {
            /* class com.bytedance.apm.p139e.C2925e.C29261 */

            @Override // com.bytedance.apm.p139e.AbstractC2924d
            /* renamed from: a */
            public void mo12629a(String str, String... strArr) {
                Log.i(str, C2925e.m12370a(strArr));
            }

            @Override // com.bytedance.apm.p139e.AbstractC2924d
            /* renamed from: b */
            public void mo12630b(String str, String... strArr) {
                Log.w(str, C2925e.m12370a(strArr));
            }

            @Override // com.bytedance.apm.p139e.AbstractC2924d
            /* renamed from: c */
            public void mo12631c(String str, String... strArr) {
                Log.d(str, C2925e.m12370a(strArr));
            }

            @Override // com.bytedance.apm.p139e.AbstractC2924d
            /* renamed from: d */
            public void mo12632d(String str, String... strArr) {
                Log.e(str, C2925e.m12370a(strArr));
            }
        };
        f9437a = r0;
        f9438b = r0;
    }

    /* renamed from: a */
    public static String m12370a(String... strArr) {
        StringBuilder sb = new StringBuilder((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m12372a(String str, String... strArr) {
        AbstractC2924d dVar = f9438b;
        if (dVar != null) {
            dVar.mo12632d(str, strArr);
        }
    }

    /* renamed from: b */
    public static void m12373b(String str, String... strArr) {
        AbstractC2924d dVar = f9438b;
        if (dVar != null) {
            dVar.mo12630b(str, strArr);
        }
    }

    /* renamed from: c */
    public static void m12374c(String str, String... strArr) {
        AbstractC2924d dVar = f9438b;
        if (dVar != null) {
            dVar.mo12629a(str, strArr);
        }
    }

    /* renamed from: d */
    public static void m12375d(String str, String... strArr) {
        AbstractC2924d dVar = f9438b;
        if (dVar != null) {
            dVar.mo12631c(str, strArr);
        }
    }

    /* renamed from: a */
    public static void m12371a(String str, Object... objArr) {
        if (f9438b != null) {
            JSONObject jSONObject = new JSONObject();
            int length = objArr.length;
            if (length % 2 == 0) {
                for (int i = 0; i < length; i += 2) {
                    try {
                        jSONObject.put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                f9438b.mo12629a(str, jSONObject.toString());
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
