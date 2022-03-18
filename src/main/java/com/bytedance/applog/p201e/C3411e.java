package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.e */
public class C3411e extends AbstractC3402b {

    /* renamed from: j */
    public String f10802j;

    /* renamed from: k */
    public String f10803k;

    /* renamed from: l */
    public String f10804l;

    /* renamed from: m */
    public String f10805m;

    /* renamed from: n */
    public long f10806n;

    /* renamed from: o */
    long f10807o;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: d */
    public String mo13668d() {
        return "event";
    }

    C3411e() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: i */
    public String mo13673i() {
        return this.f10805m;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: h */
    public String mo13672h() {
        return "" + this.f10803k + ", " + this.f10804l;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public List<String> mo13659a() {
        List<String> a = super.mo13659a();
        ArrayList arrayList = new ArrayList(a.size());
        arrayList.addAll(a);
        arrayList.addAll(Arrays.asList("category", "varchar", "tag", "varchar", "value", "integer", "ext_value", "integer", "params", "varchar", "label", "varchar"));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public JSONObject mo13665b() throws JSONException {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(this.f10805m)) {
            jSONObject = new JSONObject(this.f10805m);
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("local_time_ms", this.f10780b);
        jSONObject.put("tea_event_index", this.f10781c);
        jSONObject.put("session_id", this.f10782d);
        if (this.f10783e > 0) {
            jSONObject.put("user_id", this.f10783e);
        }
        if (this.f10786h != NetworkUtils.NetworkType.UNKNOWN.getValue()) {
            jSONObject.put("nt", this.f10786h);
        }
        if (!TextUtils.isEmpty(this.f10784f)) {
            jSONObject.put("user_unique_id", this.f10784f);
        }
        jSONObject.put("category", this.f10802j);
        jSONObject.put("tag", this.f10803k);
        jSONObject.put("value", this.f10806n);
        jSONObject.put("ext_value", this.f10807o);
        jSONObject.put("label", this.f10804l);
        jSONObject.put("datetime", this.f10787i);
        if (!TextUtils.isEmpty(this.f10785g)) {
            jSONObject.put("ab_sdk_version", this.f10785g);
        }
        return jSONObject;
    }

    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public int mo13658a(Cursor cursor) {
        int a = super.mo13658a(cursor);
        int i = a + 1;
        this.f10802j = cursor.getString(a);
        int i2 = i + 1;
        this.f10803k = cursor.getString(i);
        int i3 = i2 + 1;
        this.f10806n = cursor.getLong(i2);
        int i4 = i3 + 1;
        this.f10807o = cursor.getLong(i3);
        int i5 = i4 + 1;
        this.f10805m = cursor.getString(i4);
        int i6 = i5 + 1;
        this.f10804l = cursor.getString(i5);
        return i6;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public AbstractC3402b mo13664b(JSONObject jSONObject) {
        super.mo13664b(jSONObject);
        this.f10781c = jSONObject.optLong("tea_event_index", 0);
        this.f10802j = jSONObject.optString("category", null);
        this.f10803k = jSONObject.optString("tag", null);
        this.f10806n = jSONObject.optLong("value", 0);
        this.f10807o = jSONObject.optLong("ext_value", 0);
        this.f10805m = jSONObject.optString("params", null);
        this.f10804l = jSONObject.optString("label", null);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13661a(ContentValues contentValues) {
        super.mo13661a(contentValues);
        contentValues.put("category", this.f10802j);
        contentValues.put("tag", this.f10803k);
        contentValues.put("value", Long.valueOf(this.f10806n));
        contentValues.put("ext_value", Long.valueOf(this.f10807o));
        contentValues.put("params", this.f10805m);
        contentValues.put("label", this.f10804l);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13662a(JSONObject jSONObject) throws JSONException {
        super.mo13662a(jSONObject);
        jSONObject.put("tea_event_index", this.f10781c);
        jSONObject.put("category", this.f10802j);
        jSONObject.put("tag", this.f10803k);
        jSONObject.put("value", this.f10806n);
        jSONObject.put("ext_value", this.f10807o);
        jSONObject.put("params", this.f10805m);
        jSONObject.put("label", this.f10804l);
    }

    public C3411e(String str, String str2, String str3, long j, long j2, String str4) {
        mo13660a(0);
        this.f10802j = str;
        this.f10803k = str2;
        this.f10804l = str3;
        this.f10806n = j;
        this.f10807o = j2;
        this.f10805m = str4;
    }
}
