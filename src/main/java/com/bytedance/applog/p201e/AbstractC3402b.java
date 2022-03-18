package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.database.Cursor;
import com.bytedance.applog.util.C3469r;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.b */
public abstract class AbstractC3402b implements Cloneable {

    /* renamed from: j */
    private static final SimpleDateFormat f10778j = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    /* renamed from: a */
    long f10779a;

    /* renamed from: b */
    public long f10780b;

    /* renamed from: c */
    public long f10781c;

    /* renamed from: d */
    public String f10782d;

    /* renamed from: e */
    public long f10783e;

    /* renamed from: f */
    public String f10784f;

    /* renamed from: g */
    public String f10785g;

    /* renamed from: h */
    public int f10786h;

    /* renamed from: i */
    String f10787i;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract JSONObject mo13665b() throws JSONException;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract String mo13668d();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo13673i() {
        return null;
    }

    public AbstractC3402b() {
        mo13660a(0);
    }

    /* renamed from: g */
    public AbstractC3402b clone() {
        try {
            return (AbstractC3402b) super.clone();
        } catch (CloneNotSupportedException e) {
            C3469r.m14667a(e);
            return null;
        }
    }

    /* renamed from: e */
    public final JSONObject mo13669e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("k_cls", mo13668d());
            mo13662a(jSONObject);
        } catch (JSONException e) {
            C3469r.m14667a(e);
        }
        return jSONObject;
    }

    /* renamed from: f */
    public final JSONObject mo13670f() {
        try {
            this.f10787i = m14198b(this.f10780b);
            return mo13665b();
        } catch (JSONException e) {
            C3469r.m14667a(e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo13672h() {
        return "sid:" + this.f10782d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo13666c() {
        List<String> a = mo13659a();
        if (a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
        sb.append("create table if not exists ");
        sb.append(mo13668d());
        sb.append("(");
        for (int i = 0; i < a.size(); i += 2) {
            sb.append(a.get(i));
            sb.append(" ");
            sb.append(a.get(i + 1));
            sb.append(",");
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append(")");
        return sb.toString();
    }

    public String toString() {
        String d = mo13668d();
        if (!getClass().getSimpleName().equalsIgnoreCase(d)) {
            d = d + ", " + getClass().getSimpleName();
        }
        String str = this.f10782d;
        String str2 = "-";
        if (str != null) {
            int indexOf = str.indexOf(str2);
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            str2 = str;
        }
        return "{" + d + ", " + mo13672h() + ", " + str2 + ", " + this.f10780b + "}";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<String> mo13659a() {
        return Arrays.asList("_id", "integer primary key autoincrement", "local_time_ms", "integer", "tea_event_index", "integer", "nt", "integer", "user_id", "integer", "session_id", "varchar", "user_unique_id", "varchar", "ab_sdk_version", "varchar");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13662a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("local_time_ms", this.f10780b);
    }

    /* renamed from: b */
    public static String m14198b(long j) {
        return f10778j.format(new Date(j));
    }

    /* renamed from: a */
    public void mo13660a(long j) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        this.f10780b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ContentValues mo13663b(ContentValues contentValues) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        } else {
            contentValues.clear();
        }
        mo13661a(contentValues);
        return contentValues;
    }

    /* renamed from: a */
    public static AbstractC3402b m14197a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return C3408d.f10793a.get(jSONObject.optString("k_cls", "")).clone().mo13664b(jSONObject);
        } catch (Throwable th) {
            C3469r.m14667a(th);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC3402b mo13664b(JSONObject jSONObject) {
        this.f10780b = jSONObject.optLong("local_time_ms", 0);
        this.f10779a = 0;
        this.f10781c = 0;
        this.f10786h = 0;
        this.f10783e = 0;
        this.f10782d = null;
        this.f10784f = null;
        this.f10785g = null;
        return this;
    }

    /* renamed from: a */
    public int mo13658a(Cursor cursor) {
        this.f10779a = cursor.getLong(0);
        this.f10780b = cursor.getLong(1);
        this.f10781c = cursor.getLong(2);
        this.f10786h = cursor.getInt(3);
        this.f10783e = cursor.getLong(4);
        this.f10782d = cursor.getString(5);
        this.f10784f = cursor.getString(6);
        this.f10785g = cursor.getString(7);
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13661a(ContentValues contentValues) {
        contentValues.put("local_time_ms", Long.valueOf(this.f10780b));
        contentValues.put("tea_event_index", Long.valueOf(this.f10781c));
        contentValues.put("nt", Integer.valueOf(this.f10786h));
        contentValues.put("user_id", Long.valueOf(this.f10783e));
        contentValues.put("session_id", this.f10782d);
        contentValues.put("user_unique_id", this.f10784f);
        contentValues.put("ab_sdk_version", this.f10785g);
    }
}
