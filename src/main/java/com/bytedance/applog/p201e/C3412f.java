package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.applog.util.C3469r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.f */
public class C3412f extends AbstractC3402b {

    /* renamed from: j */
    private String f10808j;

    /* renamed from: k */
    private String f10809k;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: d */
    public String mo13668d() {
        return "event_misc";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: i */
    public String mo13673i() {
        return this.f10808j;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: h */
    public String mo13672h() {
        return "param:" + this.f10808j + " logType:" + this.f10809k;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public List<String> mo13659a() {
        List<String> a = super.mo13659a();
        ArrayList arrayList = new ArrayList(a.size());
        arrayList.addAll(a);
        arrayList.addAll(Arrays.asList("params", "varchar", "log_type", "varchar"));
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
        jSONObject.put("log_type", this.f10809k);
        try {
            JSONObject jSONObject2 = new JSONObject(this.f10808j);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.opt(next) != null) {
                    C3469r.m14668b("misc事件存在重复的key", null);
                }
                jSONObject.put(next, obj);
            }
        } catch (Exception e) {
            C3469r.m14669c("解析 event misc 失败", e);
        }
        return jSONObject;
    }

    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public int mo13658a(Cursor cursor) {
        int a = super.mo13658a(cursor);
        int i = a + 1;
        this.f10808j = cursor.getString(a);
        int i2 = i + 1;
        this.f10809k = cursor.getString(i);
        return i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public AbstractC3402b mo13664b(JSONObject jSONObject) {
        super.mo13664b(jSONObject);
        this.f10808j = jSONObject.optString("params", null);
        this.f10809k = jSONObject.optString("log_type", null);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13661a(ContentValues contentValues) {
        super.mo13661a(contentValues);
        contentValues.put("params", this.f10808j);
        contentValues.put("log_type", this.f10809k);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13662a(JSONObject jSONObject) throws JSONException {
        super.mo13662a(jSONObject);
        jSONObject.put("params", this.f10808j);
        jSONObject.put("log_type", this.f10809k);
    }

    public C3412f(String str, JSONObject jSONObject) {
        this.f10809k = str;
        this.f10808j = jSONObject.toString();
    }
}
