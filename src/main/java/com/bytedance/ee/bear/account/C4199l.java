package com.bytedance.ee.bear.account;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.account.l */
public class C4199l extends AbstractC1420a {

    /* renamed from: com.bytedance.ee.bear.account.l$a */
    public static class C4200a {

        /* renamed from: a */
        private String f12677a;

        /* renamed from: b */
        private String f12678b;

        /* renamed from: c */
        private String f12679c;

        /* renamed from: d */
        private String f12680d;

        /* renamed from: e */
        private String f12681e;

        /* renamed from: f */
        private String f12682f;

        /* renamed from: g */
        private String f12683g;

        /* renamed from: h */
        private String f12684h;

        /* renamed from: i */
        private String f12685i;

        /* renamed from: j */
        private String f12686j;

        /* renamed from: k */
        private int f12687k;

        public String toString() {
            return "LegacyUserV6{}";
        }

        /* renamed from: a */
        public String mo16451a() {
            return this.f12677a;
        }

        /* renamed from: b */
        public String mo16454b() {
            return this.f12678b;
        }

        /* renamed from: c */
        public String mo16456c() {
            return this.f12679c;
        }

        /* renamed from: d */
        public String mo16458d() {
            return this.f12680d;
        }

        /* renamed from: e */
        public String mo16460e() {
            return this.f12681e;
        }

        /* renamed from: f */
        public String mo16462f() {
            return this.f12682f;
        }

        /* renamed from: g */
        public String mo16464g() {
            return this.f12683g;
        }

        /* renamed from: h */
        public String mo16466h() {
            return this.f12684h;
        }

        /* renamed from: i */
        public int mo16468i() {
            return this.f12687k;
        }

        /* renamed from: j */
        public String mo16470j() {
            return this.f12685i;
        }

        /* renamed from: k */
        public String mo16472k() {
            return this.f12686j;
        }

        /* renamed from: a */
        public void mo16452a(int i) {
            this.f12687k = i;
        }

        /* renamed from: b */
        public void mo16455b(String str) {
            this.f12678b = str;
        }

        /* renamed from: c */
        public void mo16457c(String str) {
            this.f12679c = str;
        }

        /* renamed from: d */
        public void mo16459d(String str) {
            this.f12680d = str;
        }

        /* renamed from: e */
        public void mo16461e(String str) {
            this.f12681e = str;
        }

        /* renamed from: f */
        public void mo16463f(String str) {
            this.f12682f = str;
        }

        /* renamed from: g */
        public void mo16465g(String str) {
            this.f12683g = str;
        }

        /* renamed from: h */
        public void mo16467h(String str) {
            this.f12684h = str;
        }

        /* renamed from: i */
        public void mo16469i(String str) {
            this.f12685i = str;
        }

        /* renamed from: j */
        public void mo16471j(String str) {
            this.f12686j = str;
        }

        /* renamed from: a */
        public void mo16453a(String str) {
            this.f12677a = str;
        }
    }

    public C4199l() {
        super(6, 7);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        C13479a.m54772d("Migration6_7", "users database migration: 6 —> 7 start");
        List<C4200a> b = m17423b(bVar);
        bVar.execSQL("DROP TABLE IF EXISTS `user`");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `user` (`uid` TEXT NOT NULL, `cn_name` TEXT, `en_name` TEXT, `organization` TEXT, `email` TEXT, `mobile` TEXT, `avatar_url` TEXT, `openid` TEXT, `token` TEXT, `tenant_id` TEXT, `department_id` TEXT, `state` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
        m17422a(bVar, b);
        C13479a.m54772d("Migration6_7", "users database migration: 6 —> 7 done");
    }

    /* renamed from: b */
    private List<C4200a> m17423b(AbstractC1082b bVar) {
        C13479a.m54772d("Migration6_7", "migration findAllUser: ");
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = bVar.query("SELECT * FROM user");
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("user_name");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("organization");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("email");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("mobile");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("avatar_url");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("openid");
            int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("token");
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("tenant_id");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("department_id");
            int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("state");
            while (cursor.moveToNext()) {
                C4200a aVar = new C4200a();
                aVar.mo16453a(cursor.getString(columnIndexOrThrow));
                aVar.mo16455b(cursor.getString(columnIndexOrThrow2));
                aVar.mo16457c(cursor.getString(columnIndexOrThrow3));
                aVar.mo16459d(cursor.getString(columnIndexOrThrow4));
                aVar.mo16461e(cursor.getString(columnIndexOrThrow5));
                aVar.mo16463f(cursor.getString(columnIndexOrThrow6));
                aVar.mo16465g(cursor.getString(columnIndexOrThrow7));
                aVar.mo16467h(cursor.getString(columnIndexOrThrow8));
                aVar.mo16469i(cursor.getString(columnIndexOrThrow9));
                aVar.mo16471j(cursor.getString(columnIndexOrThrow10));
                aVar.mo16452a(cursor.getInt(columnIndexOrThrow11));
                arrayList.add(aVar);
            }
            C13479a.m54772d("Migration6_7", "find all user done");
        } catch (Exception e) {
            C13479a.m54761a("Migration6_7", e);
        } catch (Throwable th) {
            C4194h.m17396a(null);
            throw th;
        }
        C4194h.m17396a(cursor);
        return arrayList;
    }

    /* renamed from: a */
    private void m17422a(AbstractC1082b bVar, List<C4200a> list) {
        C13479a.m54772d("Migration6_7", "migration insertAllUserData");
        for (C4200a aVar : list) {
            C13479a.m54772d("Migration6_7", "inserting user: " + aVar);
            ContentValues contentValues = new ContentValues();
            contentValues.put("uid", aVar.mo16451a());
            String b = aVar.mo16454b();
            try {
                C4193g gVar = new C4193g();
                JSONObject jSONObject = new JSONObject(gVar.mo16430b(b));
                contentValues.put("cn_name", gVar.mo16429a(jSONObject.getString("cn_name")));
                contentValues.put("en_name", gVar.mo16429a(jSONObject.getString("en_name")));
            } catch (JSONException e) {
                C13479a.m54769c("Migration6_7", "insertAllUserData: ", e);
            }
            contentValues.put("organization", aVar.mo16456c());
            contentValues.put("email", aVar.mo16458d());
            contentValues.put("mobile", aVar.mo16460e());
            contentValues.put("avatar_url", aVar.mo16462f());
            contentValues.put("openid", aVar.mo16464g());
            contentValues.put("token", aVar.mo16466h());
            contentValues.put("state", Integer.valueOf(aVar.mo16468i()));
            contentValues.put("tenant_id", aVar.mo16470j());
            contentValues.put("department_id", aVar.mo16472k());
            bVar.insert("user", 5, contentValues);
        }
        C13479a.m54772d("Migration6_7", "finish insertAllUserData");
    }
}
