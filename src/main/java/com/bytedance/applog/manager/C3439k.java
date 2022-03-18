package com.bytedance.applog.manager;

import android.content.Context;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.k */
public class C3439k extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10939e;

    C3439k(Context context) {
        super(true, true);
        this.f10939e = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        C3436h.m14500a(jSONObject, "language", this.f10939e.getResources().getConfiguration().locale.getLanguage());
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            rawOffset = 12;
        }
        jSONObject.put("timezone", rawOffset);
        C3436h.m14500a(jSONObject, "region", Locale.getDefault().getCountry());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        C3436h.m14500a(jSONObject, "tz_name", timeZone.getID());
        jSONObject.put("tz_offset", timeZone.getOffset(System.currentTimeMillis()) / 1000);
        return true;
    }
}
