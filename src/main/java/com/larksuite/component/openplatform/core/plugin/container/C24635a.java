package com.larksuite.component.openplatform.core.plugin.container;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.a */
public class C24635a extends AbstractC66715a {

    /* renamed from: b */
    private Paint f60670b;

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "measureText";
    }

    public C24635a() {
    }

    /* renamed from: c */
    private Paint m89708c() {
        if (this.f60670b == null) {
            this.f60670b = new Paint();
        }
        return this.f60670b;
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f168426a);
            int optInt = jSONObject.optInt("fontSize");
            JSONArray optJSONArray = jSONObject.optJSONArray("font");
            String[] strArr = new String[0];
            if (optJSONArray != null && optJSONArray.length() > 0) {
                strArr = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    strArr[i] = optJSONArray.optString(i);
                }
            }
            float a = m89705a(jSONObject.optString("text"), (float) optInt, strArr);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", (double) a);
            jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject3);
            return jSONObject2.toString();
        } catch (JSONException e) {
            AppBrandLogger.m52829e("SyncMsgCtrl", e);
            return CharacterUtils.empty();
        }
    }

    public C24635a(String str) {
        super(str);
    }

    /* renamed from: b */
    private float m89707b(String str, float f, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return m89706a(str, f, strArr, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    private float m89705a(String str, float f, String[] strArr) {
        boolean isEmpty = TextUtils.isEmpty(str);
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (isEmpty) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        for (String str2 : str.split("\n")) {
            float b = m89707b(str2, f, strArr);
            if (b > f2) {
                f2 = b;
            }
        }
        return f2;
    }

    /* renamed from: a */
    private float m89706a(String str, float f, String[] strArr, float f2) {
        Paint c = m89708c();
        c.setTextSize(f);
        c.setLinearText(true);
        c.setTypeface(Typeface.DEFAULT);
        for (String str2 : strArr) {
            String lowerCase = str2.toLowerCase();
            lowerCase.hashCode();
            char c2 = 65535;
            switch (lowerCase.hashCode()) {
                case -1536685117:
                    if (lowerCase.equals("sans-serif")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1431958525:
                    if (lowerCase.equals("monospace")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 109326717:
                    if (lowerCase.equals("serif")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    c.setTypeface(Typeface.SANS_SERIF);
                    break;
                case 1:
                    c.setTypeface(Typeface.MONOSPACE);
                    break;
                case 2:
                    c.setTypeface(Typeface.SERIF);
                    break;
            }
        }
        c.getTextBounds(str, 0, str.length(), new Rect());
        int length = str.length();
        float[] fArr = new float[length];
        this.f60670b.getTextWidths(str, fArr);
        float f3 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < length; i++) {
            f3 += fArr[i];
        }
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            return f3;
        }
        return f3 * f2;
    }
}
