package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.n */
public class C22907n {

    /* renamed from: a */
    private final Bundle f56615a;

    /* renamed from: j */
    public String mo79522j() {
        return mo79506a("gcm.n.android_channel_id");
    }

    /* renamed from: d */
    public Uri mo79512d() {
        String a = mo79506a("gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = mo79506a("gcm.n.link");
        }
        if (!TextUtils.isEmpty(a)) {
            return Uri.parse(a);
        }
        return null;
    }

    /* renamed from: e */
    public String mo79514e() {
        String a = mo79506a("gcm.n.sound2");
        if (TextUtils.isEmpty(a)) {
            return mo79506a("gcm.n.sound");
        }
        return a;
    }

    /* renamed from: h */
    public Bundle mo79520h() {
        Bundle bundle = new Bundle(this.f56615a);
        for (String str : this.f56615a.keySet()) {
            if (m83218k(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: i */
    public Bundle mo79521i() {
        Bundle bundle = new Bundle(this.f56615a);
        for (String str : this.f56615a.keySet()) {
            if (!m83217j(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo79504a() {
        Integer c = mo79511c("gcm.n.notification_count");
        if (c == null) {
            return null;
        }
        if (c.intValue() >= 0) {
            return c;
        }
        String valueOf = String.valueOf(c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
        sb.append("notificationCount is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationCount.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Integer mo79507b() {
        Integer c = mo79511c("gcm.n.notification_priority");
        if (c == null) {
            return null;
        }
        if (c.intValue() >= -2 && c.intValue() <= 2) {
            return c;
        }
        String valueOf = String.valueOf(c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationPriority.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Integer mo79510c() {
        Integer c = mo79511c("gcm.n.visibility");
        if (c == null) {
            return null;
        }
        if (c.intValue() >= -1 && c.intValue() <= 1) {
            return c;
        }
        String valueOf = String.valueOf(c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb.toString());
        return null;
    }

    /* renamed from: f */
    public long[] mo79516f() {
        JSONArray g = mo79518g("gcm.n.vibrate_timings");
        if (g == null) {
            return null;
        }
        try {
            if (g.length() > 1) {
                int length = g.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = g.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int[] mo79519g() {
        JSONArray g = mo79518g("gcm.n.light_settings");
        if (g == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (g.length() == 3) {
                iArr[0] = m83219l(g.optString(0));
                iArr[1] = g.optInt(1);
                iArr[2] = g.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String valueOf = String.valueOf(g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append("LightSettings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(g);
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf2);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public C22907n(Bundle bundle) {
        Objects.requireNonNull(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f56615a = new Bundle(bundle);
    }

    /* renamed from: i */
    private static String m83216i(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: m */
    private static String m83220m(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: a */
    public String mo79506a(String str) {
        return this.f56615a.getString(m83215h(str));
    }

    /* renamed from: h */
    private String m83215h(String str) {
        if (!this.f56615a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m = m83220m(str);
            if (this.f56615a.containsKey(m)) {
                return m;
            }
        }
        return str;
    }

    /* renamed from: j */
    private static boolean m83217j(String str) {
        if (str.startsWith("google.c.a.") || str.equals("from")) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m83218k(String str) {
        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private static int m83219l(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: b */
    public boolean mo79509b(String str) {
        String a = mo79506a(str);
        if ("1".equals(a) || Boolean.parseBoolean(a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m83214a(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m83220m("gcm.n.e")))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public String mo79515e(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if ("_loc_key".length() != 0) {
            str2 = valueOf.concat("_loc_key");
        } else {
            str2 = new String(valueOf);
        }
        return mo79506a(str2);
    }

    /* renamed from: f */
    public Object[] mo79517f(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if ("_loc_args".length() != 0) {
            str2 = valueOf.concat("_loc_args");
        } else {
            str2 = new String(valueOf);
        }
        JSONArray g = mo79518g(str2);
        if (g == null) {
            return null;
        }
        int length = g.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = g.optString(i);
        }
        return strArr;
    }

    /* renamed from: d */
    public Long mo79513d(String str) {
        String a = mo79506a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(a));
        } catch (NumberFormatException unused) {
            String i = m83216i(str);
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 38 + String.valueOf(a).length());
            sb.append("Couldn't parse value of ");
            sb.append(i);
            sb.append("(");
            sb.append(a);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: g */
    public JSONArray mo79518g(String str) {
        String a = mo79506a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return new JSONArray(a);
        } catch (JSONException unused) {
            String i = m83216i(str);
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50 + String.valueOf(a).length());
            sb.append("Malformed JSON for key ");
            sb.append(i);
            sb.append(": ");
            sb.append(a);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public Integer mo79511c(String str) {
        String a = mo79506a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException unused) {
            String i = m83216i(str);
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 38 + String.valueOf(a).length());
            sb.append("Couldn't parse value of ");
            sb.append(i);
            sb.append("(");
            sb.append(a);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    public String mo79508b(Resources resources, String str, String str2) {
        String a = mo79506a(str2);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return mo79505a(resources, str, str2);
    }

    /* renamed from: a */
    public String mo79505a(Resources resources, String str, String str2) {
        String str3;
        String e = mo79515e(str2);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        int identifier = resources.getIdentifier(e, "string", str);
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            if ("_loc_key".length() != 0) {
                str3 = valueOf.concat("_loc_key");
            } else {
                str3 = new String(valueOf);
            }
            String i = m83216i(str3);
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 49 + String.valueOf(str2).length());
            sb.append(i);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] f = mo79517f(str2);
        if (f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f);
        } catch (MissingFormatArgumentException e2) {
            String i2 = m83216i(str2);
            String arrays = Arrays.toString(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(i2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e2);
            return null;
        }
    }
}
