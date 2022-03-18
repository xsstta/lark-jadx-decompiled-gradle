package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.j */
public class C3416j extends AbstractC3402b {

    /* renamed from: j */
    public long f10831j;

    /* renamed from: k */
    public String f10832k;

    /* renamed from: l */
    public String f10833l;

    /* renamed from: m */
    public int f10834m;

    /* renamed from: n */
    public String f10835n;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: d */
    public String mo13668d() {
        return "page";
    }

    /* renamed from: j */
    public boolean mo13714j() {
        if (this.f10831j == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo13715k() {
        return this.f10833l.contains(":");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: h */
    public String mo13672h() {
        return this.f10833l + ", " + this.f10831j;
    }

    /* renamed from: l */
    private JSONObject m14330l() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_key", this.f10833l);
        jSONObject.put("refer_page_key", this.f10832k);
        jSONObject.put("is_back", this.f10834m);
        jSONObject.put("duration", this.f10831j);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public List<String> mo13659a() {
        List<String> a = super.mo13659a();
        ArrayList arrayList = new ArrayList(a.size());
        arrayList.addAll(a);
        arrayList.addAll(Arrays.asList("page_key", "varchar", "refer_page_key", "varchar", "duration", "integer", "is_back", "integer", "last_session", "varchar"));
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
        jSONObject.put("event", "bav2b_page");
        jSONObject.put("is_bav", 1);
        jSONObject.put("params", m14330l());
        jSONObject.put("datetime", this.f10787i);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13662a(JSONObject jSONObject) throws JSONException {
        super.mo13662a(jSONObject);
        jSONObject.put("page_key", this.f10833l);
        jSONObject.put("refer_page_key", this.f10832k);
        jSONObject.put("duration", this.f10831j);
        jSONObject.put("is_back", this.f10834m);
    }

    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public int mo13658a(Cursor cursor) {
        int a = super.mo13658a(cursor);
        int i = a + 1;
        this.f10833l = cursor.getString(a);
        int i2 = i + 1;
        this.f10832k = cursor.getString(i);
        int i3 = i2 + 1;
        this.f10831j = cursor.getLong(i2);
        int i4 = i3 + 1;
        this.f10834m = cursor.getInt(i3);
        int i5 = i4 + 1;
        this.f10835n = cursor.getString(i4);
        return i5;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public AbstractC3402b mo13664b(JSONObject jSONObject) {
        super.mo13664b(jSONObject);
        this.f10833l = jSONObject.optString("page_key", null);
        this.f10832k = jSONObject.optString("refer_page_key", null);
        this.f10831j = jSONObject.optLong("duration", 0);
        this.f10834m = jSONObject.optInt("is_back", 0);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13661a(ContentValues contentValues) {
        super.mo13661a(contentValues);
        contentValues.put("page_key", this.f10833l);
        contentValues.put("refer_page_key", this.f10832k);
        contentValues.put("duration", Long.valueOf(this.f10831j));
        contentValues.put("is_back", Integer.valueOf(this.f10834m));
        contentValues.put("last_session", this.f10835n);
    }
}
