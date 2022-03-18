package com.bytedance.push.p886g;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.push.C20386c;
import com.bytedance.push.utils.C20554e;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.setting.C59971b;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.bytedance.push.g.a */
public class C20433a {

    /* renamed from: a */
    private final C20386c f49931a;

    /* renamed from: b */
    private String m74412b() {
        String country = Resources.getSystem().getConfiguration().locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            return country.toUpperCase();
        }
        return "";
    }

    /* renamed from: a */
    public Map<String, String> mo68893a() {
        Map<String, String> a;
        HashMap hashMap = new HashMap();
        C59971b.m232728b().mo204206b(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("push_sdk_version", String.valueOf(30406));
        hashMap2.put("push_sdk_version_name", "3.4.6-lark");
        String str = (String) hashMap.get("install_id");
        if (!StringUtils.isEmpty(str)) {
            hashMap2.put("iid", str);
        }
        String str2 = (String) hashMap.get("device_id");
        if (!StringUtils.isEmpty(str2)) {
            hashMap2.put("device_id", str2);
        }
        String str3 = (String) hashMap.get("device_login_id");
        if (!StringUtils.isEmpty(str3)) {
            hashMap2.put("device_login_id", str3);
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(this.f49931a.f49779a);
        if (!StringUtils.isEmpty(networkAccessType)) {
            hashMap2.put("ac", networkAccessType);
        }
        String str4 = this.f49931a.f49786h;
        if (str4 != null) {
            hashMap2.put("channel", str4);
        }
        hashMap2.put("aid", String.valueOf(this.f49931a.f49780b));
        String str5 = this.f49931a.f49788j;
        if (str5 != null) {
            hashMap2.put("app_name", str5);
        }
        hashMap2.put("version_code", String.valueOf(this.f49931a.f49781c));
        hashMap2.put("version_name", this.f49931a.f49783e);
        hashMap2.put("update_version_code", String.valueOf(this.f49931a.f49782d));
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("device_manufacturer", Build.MANUFACTURER);
        hashMap2.put("language", Locale.getDefault().getLanguage());
        hashMap2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str6 = Build.VERSION.RELEASE;
            if (str6 != null && str6.length() > 10) {
                str6 = str6.substring(0, 10);
            }
            hashMap2.put("os_version", str6);
        } catch (Exception unused) {
        }
        int dpi = UIUtils.getDpi(this.f49931a.f49779a);
        if (dpi > 0) {
            hashMap2.put("dpi", String.valueOf(dpi));
        }
        hashMap2.put("rom", C59436a.m230741f());
        String str7 = "android";
        hashMap2.put("os", str7);
        hashMap2.put("package", this.f49931a.f49779a.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
            hashMap2.put("tz_name", timeZone.getID());
        }
        String language = Locale.getDefault().getLanguage();
        if (!StringUtils.isEmpty(language)) {
            hashMap2.put("language", language);
        }
        String country = Locale.getDefault().getCountry();
        if (!StringUtils.isEmpty(country)) {
            hashMap2.put("region", country.toLowerCase());
        }
        try {
            hashMap2.put("country", m74412b());
            if (!(this.f49931a.f49797s == null || (a = this.f49931a.f49797s.mo68911a()) == null)) {
                hashMap2.putAll(a);
            }
            hashMap2.put("rom_version", C20554e.m74855a());
        } catch (Exception unused2) {
        }
        if (C20554e.m74859d()) {
            str7 = "harmony";
        }
        hashMap2.put("os_detail_type", str7);
        String e = C20554e.m74860e();
        if (!TextUtils.isEmpty(e)) {
            hashMap2.put("extra_rom_version", e);
        }
        return hashMap2;
    }

    public C20433a(C20386c cVar) {
        this.f49931a = cVar;
    }
}
