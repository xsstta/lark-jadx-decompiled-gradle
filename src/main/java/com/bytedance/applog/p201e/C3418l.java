package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.applog.util.C3469r;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.l */
public class C3418l extends AbstractC3402b {

    /* renamed from: j */
    long f10838j;

    /* renamed from: k */
    long f10839k;

    /* renamed from: l */
    String f10840l;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public List<String> mo13659a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: d */
    public String mo13668d() {
        return "terminate";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: h */
    public String mo13672h() {
        return String.valueOf(this.f10838j);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public JSONObject mo13665b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.f10780b);
        jSONObject.put("tea_event_index", this.f10781c);
        jSONObject.put("session_id", this.f10782d);
        jSONObject.put("stop_timestamp", this.f10839k / 1000);
        jSONObject.put("duration", this.f10838j / 1000);
        jSONObject.put("datetime", this.f10787i);
        if (this.f10783e > 0) {
            jSONObject.put("user_id", this.f10783e);
        }
        if (!TextUtils.isEmpty(this.f10784f)) {
            jSONObject.put("user_unique_id", this.f10784f);
        }
        if (!TextUtils.isEmpty(this.f10785g)) {
            jSONObject.put("ab_sdk_version", this.f10785g);
        }
        if (!TextUtils.isEmpty(this.f10840l)) {
            jSONObject.put("uuid_changed", true);
            if (!TextUtils.equals(this.f10840l, this.f10782d)) {
                jSONObject.put("original_session_id", this.f10840l);
            }
        }
        return jSONObject;
    }

    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public int mo13658a(Cursor cursor) {
        C3469r.m14667a((Throwable) null);
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public AbstractC3402b mo13664b(JSONObject jSONObject) {
        C3469r.m14667a((Throwable) null);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13661a(ContentValues contentValues) {
        C3469r.m14667a((Throwable) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13662a(JSONObject jSONObject) {
        C3469r.m14667a((Throwable) null);
    }
}
