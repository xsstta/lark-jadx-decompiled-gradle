package com.larksuite.component.dybrid.h5core.p1082h;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.tt.frontendapiinterface.ApiHandler;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.h.a */
public class C24246a {
    /* renamed from: a */
    public static String m88558a(String str) {
        try {
            URL url = new URL(str);
            String host = url.getHost();
            C24174b.m88296a("H5Utils", "url:" + url + "host:" + host);
            return host;
        } catch (MalformedURLException e) {
            Log.e("H5Utils", e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m88559a(JSONObject jSONObject, String str) {
        return m88560a(jSONObject, str, "");
    }

    /* renamed from: a */
    public static String m88560a(JSONObject jSONObject, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return (String) m88553a(jSONObject, str, (Object) str2);
    }

    /* renamed from: a */
    public static boolean m88564a(JSONObject jSONObject, String str, boolean z) {
        return ((Boolean) m88553a(jSONObject, str, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: a */
    public static JSONObject m88562a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return (JSONObject) m88553a(jSONObject, str, (Object) jSONObject2);
    }

    /* renamed from: a */
    public static JSONArray m88561a(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        return (JSONArray) m88553a(jSONObject, str, (Object) jSONArray);
    }

    /* renamed from: a */
    public static void m88563a(Runnable runnable) {
        if (runnable != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    /* renamed from: a */
    public static String m88557a(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName == null ? obj.getClass().getName() : canonicalName;
    }

    /* renamed from: b */
    public static Class<?> m88565b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            C24174b.m88299b("H5Utils", "cls not found!! classPath:" + str);
            return null;
        }
    }

    /* renamed from: c */
    public static final JSONObject m88567c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C24174b.m88295a("H5Utils", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m88555a(Bundle bundle, String str) {
        return m88556a(bundle, str, "");
    }

    /* renamed from: b */
    public static boolean m88566b(Bundle bundle, String str) {
        if (bundle == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return bundle.containsKey(str);
    }

    /* renamed from: a */
    public static Bundle m88551a(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!(jSONObject == null || jSONObject.length() == 0)) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putDouble(next, new BigDecimal(Float.toString(((Float) obj).floatValue())).doubleValue());
                    } else if (obj instanceof JSONObject) {
                        bundle.putString(next, ((JSONObject) obj).toString());
                    }
                } catch (Exception e) {
                    C24174b.m88297a("H5Utils", "toBundle exception", e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public static String m88554a(int i, Context context) {
        Throwable th;
        Exception e;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = context.getResources().openRawResource(i);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str = new String(bArr);
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
                return str;
            } catch (Exception e2) {
                e = e2;
                try {
                    C24174b.m88297a("H5Utils", "read raw file exception.", e);
                    try {
                        inputStream.close();
                        return null;
                    } catch (Exception unused2) {
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    try {
                        inputStream2.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            C24174b.m88297a("H5Utils", "read raw file exception.", e);
            inputStream.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static double m88548a(Bundle bundle, String str, double d) {
        return ((Double) m88552a(bundle, str, Double.valueOf(d))).doubleValue();
    }

    /* renamed from: a */
    public static int m88549a(Bundle bundle, String str, int i) {
        return ((Integer) m88552a(bundle, str, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static int m88550a(JSONObject jSONObject, String str, int i) {
        return ((Integer) m88553a(jSONObject, str, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static <T> T m88552a(Bundle bundle, String str, T t) {
        if (bundle == null || TextUtils.isEmpty(str) || !bundle.containsKey(str)) {
            return t;
        }
        T t2 = (T) bundle.get(str);
        if (t2 != null && t.getClass().isAssignableFrom(t2.getClass())) {
            return t2;
        }
        C24174b.m88296a("H5Utils", "[key] " + str + " [value] " + ((Object) t2));
        return t;
    }

    /* renamed from: a */
    public static <T> T m88553a(JSONObject jSONObject, String str, T t) {
        if (jSONObject == null || jSONObject.length() == 0 || t == null || jSONObject.isNull(str)) {
            return t;
        }
        try {
            T t2 = (T) jSONObject.get(str);
            if (t2 != null && t.getClass().isAssignableFrom(t2.getClass())) {
                return t2;
            }
            C24174b.m88299b("H5Utils", "[key] " + str + " [value] " + ((Object) t2));
            return t;
        } catch (JSONException e) {
            C24174b.m88297a("H5Utils", ApiHandler.API_CALLBACK_EXCEPTION, e);
            return t;
        }
    }

    /* renamed from: a */
    public static String m88556a(Bundle bundle, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return (String) m88552a(bundle, str, (Object) str2);
    }
}
