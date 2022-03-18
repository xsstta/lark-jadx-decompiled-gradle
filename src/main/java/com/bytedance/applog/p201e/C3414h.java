package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.applog.util.C3469r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.h */
public class C3414h extends AbstractC3402b {

    /* renamed from: j */
    public int f10813j;

    /* renamed from: k */
    public String f10814k;

    /* renamed from: l */
    public boolean f10815l;

    /* renamed from: m */
    public String f10816m;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: d */
    public String mo13668d() {
        return "launch";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: h */
    public String mo13672h() {
        if (this.f10815l) {
            return "bg";
        }
        return "fg";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public List<String> mo13659a() {
        List<String> a = super.mo13659a();
        ArrayList arrayList = new ArrayList(a.size());
        arrayList.addAll(a);
        arrayList.addAll(Arrays.asList("ver_name", "varchar", "ver_code", "integer", "last_session", "varchar"));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public JSONObject mo13665b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.f10780b);
        jSONObject.put("tea_event_index", this.f10781c);
        jSONObject.put("session_id", this.f10782d);
        if (this.f10783e > 0) {
            jSONObject.put("user_id", this.f10783e);
        }
        if (!TextUtils.isEmpty(this.f10784f)) {
            jSONObject.put("user_unique_id", this.f10784f);
        }
        boolean z = this.f10815l;
        if (z) {
            jSONObject.put("is_background", z);
        }
        jSONObject.put("datetime", this.f10787i);
        if (!TextUtils.isEmpty(this.f10785g)) {
            jSONObject.put("ab_sdk_version", this.f10785g);
        }
        if (!TextUtils.isEmpty(this.f10816m)) {
            jSONObject.put("uuid_changed", true);
            jSONObject.put("original_session_id", this.f10816m);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13662a(JSONObject jSONObject) {
        C3469r.m14667a((Throwable) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public AbstractC3402b mo13664b(JSONObject jSONObject) {
        C3469r.m14667a((Throwable) null);
        return null;
    }

    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public int mo13658a(Cursor cursor) {
        int a = super.mo13658a(cursor);
        int i = a + 1;
        this.f10814k = cursor.getString(a);
        int i2 = i + 1;
        this.f10813j = cursor.getInt(i);
        int i3 = i2 + 1;
        this.f10816m = cursor.getString(i2);
        return i3;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13661a(ContentValues contentValues) {
        super.mo13661a(contentValues);
        contentValues.put("ver_name", this.f10814k);
        contentValues.put("ver_code", Integer.valueOf(this.f10813j));
        contentValues.put("last_session", this.f10816m);
    }
}
