package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {

    /* renamed from: ɩ */
    private static AppsFlyerProperties f6820 = new AppsFlyerProperties();

    /* renamed from: ı */
    private boolean f6821;

    /* renamed from: ǃ */
    private String f6822;

    /* renamed from: Ι */
    private Map<String, Object> f6823 = new HashMap();

    /* renamed from: ι */
    private boolean f6824;

    /* renamed from: і */
    private boolean f6825 = false;

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled() {
        this.f6824 = true;
    }

    /* access modifiers changed from: protected */
    public void setOnReceiveCalled() {
        this.f6821 = true;
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        

        /* renamed from: ɩ */
        private final int f6827;

        public final int getValue() {
            return this.f6827;
        }

        private EmailsCryptType(int i) {
            this.f6827 = i;
        }
    }

    public static AppsFlyerProperties getInstance() {
        return f6820;
    }

    /* renamed from: Ι */
    private boolean m8833() {
        return this.f6825;
    }

    /* access modifiers changed from: protected */
    public boolean isFirstLaunchCalled() {
        return this.f6824;
    }

    /* access modifiers changed from: protected */
    public boolean isOnReceiveCalled() {
        return this.f6821;
    }

    public boolean isEnableLog() {
        return getBoolean("shouldLog", true);
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean("disableLogs", false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean("disableOtherSdk", false);
    }

    private AppsFlyerProperties() {
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled(boolean z) {
        this.f6824 = z;
    }

    /* access modifiers changed from: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.f6822 = str;
    }

    public synchronized Object getObject(String str) {
        return this.f6823.get(str);
    }

    public synchronized String getString(String str) {
        return (String) this.f6823.get(str);
    }

    public synchronized void remove(String str) {
        this.f6823.remove(str);
    }

    public synchronized void setCustomData(String str) {
        this.f6823.put("additionalCustomData", str);
    }

    public synchronized void setUserEmails(String str) {
        this.f6823.put("userEmails", str);
    }

    public synchronized void saveProperties(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString("savedProperties", new JSONObject(this.f6823).toString()).apply();
    }

    public String getReferrer(Context context) {
        String str = this.f6822;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return AppsFlyerLibCore.getSharedPreferences(context).getString("referrer", null);
    }

    public synchronized void loadProperties(Context context) {
        if (!m8833()) {
            String string = AppsFlyerLibCore.getSharedPreferences(context).getString("savedProperties", null);
            if (string != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (this.f6823.get(next) == null) {
                            this.f6823.put(next, jSONObject.getString(next));
                        }
                    }
                    this.f6825 = true;
                } catch (JSONException e) {
                    AFLogger.afErrorLog("Failed loading properties", e);
                }
                StringBuilder sb = new StringBuilder("Done loading properties: ");
                sb.append(this.f6825);
                AFLogger.afDebugLog(sb.toString());
            }
        }
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return Long.valueOf(string).longValue();
    }

    public synchronized void set(String str, int i) {
        this.f6823.put(str, Integer.toString(i));
    }

    public synchronized void set(String str, long j) {
        this.f6823.put(str, Long.toString(j));
    }

    public synchronized void set(String str, String str2) {
        this.f6823.put(str, str2);
    }

    public synchronized void set(String str, boolean z) {
        this.f6823.put(str, Boolean.toString(z));
    }

    public synchronized void set(String str, String[] strArr) {
        this.f6823.put(str, strArr);
    }
}
