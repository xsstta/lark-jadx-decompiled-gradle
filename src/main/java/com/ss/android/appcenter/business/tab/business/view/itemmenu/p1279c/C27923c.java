package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28036c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.c.c */
public class C27923c implements AbstractC27922b {
    @SerializedName("key")

    /* renamed from: a */
    public String f69818a;
    @SerializedName("name")

    /* renamed from: b */
    public JsonObject f69819b;
    @SerializedName("iconUrl")

    /* renamed from: c */
    public String f69820c;
    @SerializedName("schema")

    /* renamed from: d */
    public String f69821d;

    /* renamed from: e */
    public boolean f69822e;

    /* renamed from: f */
    public View.OnClickListener f69823f;

    /* renamed from: g */
    private String f69824g;

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: a */
    public boolean mo99546a() {
        return false;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: b */
    public View.OnClickListener mo99547b() {
        return this.f69823f;
    }

    /* renamed from: c */
    public JSONObject mo99552c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f69818a);
            jSONObject.put("iconUrl", this.f69820c);
            jSONObject.put("name", this.f69819b.toString());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return String.format("MenuItem{key='%s', nameJson=%s, nameString='%s', iconUrl='%s', schema='%s', internalMenu=%s}", this.f69818a, this.f69819b, this.f69824g, this.f69820c, this.f69821d, Boolean.valueOf(this.f69822e));
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: a */
    public void mo99545a(LKUIRoundedImageView2 lKUIRoundedImageView2) {
        lKUIRoundedImageView2.setImageTintList(UDColorUtils.getColorStateList(lKUIRoundedImageView2.getContext(), R.color.fill_img_mask));
        lKUIRoundedImageView2.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        C27688a.m101213a(this.f69820c, lKUIRoundedImageView2);
    }

    /* renamed from: b */
    public boolean mo99551b(Context context) {
        if (TextUtils.isEmpty(this.f69820c) || TextUtils.isEmpty(mo99548c(context)) || TextUtils.isEmpty(this.f69818a)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: c */
    public String mo99548c(Context context) {
        if (TextUtils.isEmpty(this.f69824g)) {
            this.f69824g = C28036c.m102461a(this.f69819b);
        }
        return this.f69824g;
    }

    /* renamed from: a */
    public void mo99549a(C27923c cVar) {
        JsonObject jsonObject = cVar.f69819b;
        if (jsonObject != null) {
            this.f69819b = jsonObject;
            this.f69824g = null;
        }
        if (!TextUtils.isEmpty(cVar.f69820c)) {
            this.f69820c = cVar.f69820c;
        }
    }

    /* renamed from: a */
    public boolean mo99550a(Context context) {
        if (TextUtils.isEmpty(this.f69820c) || TextUtils.isEmpty(mo99548c(context)) || TextUtils.isEmpty(this.f69821d)) {
            return false;
        }
        return true;
    }
}
