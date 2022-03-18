package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.applog.util.C3469r;
import com.bytedance.common.utility.NetworkUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.g */
public class C3413g extends AbstractC3402b {

    /* renamed from: j */
    protected String f10810j;

    /* renamed from: k */
    protected String f10811k;

    /* renamed from: l */
    private boolean f10812l;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: d */
    public String mo13668d() {
        return "eventv3";
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo13710j() throws JSONException {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: h */
    public String mo13672h() {
        return this.f10811k;
    }

    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: i */
    public String mo13673i() {
        return this.f10810j;
    }

    /* renamed from: k */
    public String mo13711k() {
        return this.f10811k;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public List<String> mo13659a() {
        List<String> a = super.mo13659a();
        ArrayList arrayList = new ArrayList(a.size());
        arrayList.addAll(a);
        arrayList.addAll(Arrays.asList("event", "varchar", "params", "varchar", "is_bav", "integer"));
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
        jSONObject.put("event", this.f10811k);
        if (this.f10812l) {
            jSONObject.put("is_bav", 1);
        }
        if (!TextUtils.isEmpty(this.f10810j)) {
            jSONObject.put("params", new JSONObject(this.f10810j));
        }
        if (this.f10786h != NetworkUtils.NetworkType.UNKNOWN.getValue()) {
            jSONObject.put("nt", this.f10786h);
        }
        jSONObject.put("datetime", this.f10787i);
        if (!TextUtils.isEmpty(this.f10785g)) {
            jSONObject.put("ab_sdk_version", this.f10785g);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public AbstractC3402b mo13664b(JSONObject jSONObject) {
        super.mo13664b(jSONObject);
        this.f10811k = jSONObject.optString("event", null);
        this.f10810j = jSONObject.optString("params", null);
        this.f10812l = jSONObject.optBoolean("is_bav", false);
        return this;
    }

    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public int mo13658a(Cursor cursor) {
        int a = super.mo13658a(cursor);
        int i = a + 1;
        this.f10811k = cursor.getString(a);
        int i2 = i + 1;
        this.f10810j = cursor.getString(i);
        int i3 = i2 + 1;
        int i4 = cursor.getInt(i2);
        boolean z = true;
        if (i4 != 1) {
            z = false;
        }
        this.f10812l = z;
        return i3;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13661a(ContentValues contentValues) {
        super.mo13661a(contentValues);
        contentValues.put("event", this.f10811k);
        if (this.f10812l && this.f10810j == null) {
            try {
                mo13710j();
            } catch (JSONException e) {
                C3469r.m14667a(e);
            }
        }
        contentValues.put("params", this.f10810j);
        contentValues.put("is_bav", Integer.valueOf(this.f10812l ? 1 : 0));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13662a(JSONObject jSONObject) throws JSONException {
        super.mo13662a(jSONObject);
        jSONObject.put("event", this.f10811k);
        if (this.f10812l && this.f10810j == null) {
            mo13710j();
        }
        jSONObject.put("params", this.f10810j);
        jSONObject.put("is_bav", this.f10812l);
    }

    public C3413g(String str, boolean z, String str2) {
        this.f10811k = str;
        this.f10812l = z;
        this.f10810j = str2;
    }
}
