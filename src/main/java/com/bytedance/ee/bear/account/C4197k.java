package com.bytedance.ee.bear.account;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.account.k */
public class C4197k extends AbstractC1420a {

    /* renamed from: com.bytedance.ee.bear.account.k$a */
    public static class C4198a {

        /* renamed from: a */
        private String f12667a;

        /* renamed from: b */
        private String f12668b;

        /* renamed from: c */
        private String f12669c;

        /* renamed from: d */
        private String f12670d;

        /* renamed from: e */
        private String f12671e;

        /* renamed from: f */
        private String f12672f;

        /* renamed from: g */
        private String f12673g;

        /* renamed from: h */
        private String f12674h;

        /* renamed from: i */
        private int f12675i;

        /* renamed from: j */
        private String f12676j;

        /* renamed from: a */
        public String mo16431a() {
            return this.f12667a;
        }

        /* renamed from: b */
        public String mo16434b() {
            return this.f12668b;
        }

        /* renamed from: c */
        public String mo16436c() {
            return this.f12669c;
        }

        /* renamed from: d */
        public String mo16438d() {
            return this.f12670d;
        }

        /* renamed from: e */
        public String mo16440e() {
            return this.f12671e;
        }

        /* renamed from: f */
        public String mo16442f() {
            return this.f12672f;
        }

        /* renamed from: g */
        public String mo16444g() {
            return this.f12673g;
        }

        /* renamed from: h */
        public String mo16446h() {
            return this.f12674h;
        }

        /* renamed from: i */
        public int mo16448i() {
            return this.f12675i;
        }

        /* renamed from: j */
        public String mo16450j() {
            return this.f12676j;
        }

        /* renamed from: a */
        public void mo16432a(int i) {
            this.f12675i = i;
        }

        /* renamed from: b */
        public void mo16435b(String str) {
            this.f12668b = str;
        }

        /* renamed from: c */
        public void mo16437c(String str) {
            this.f12669c = str;
        }

        /* renamed from: d */
        public void mo16439d(String str) {
            this.f12670d = str;
        }

        /* renamed from: e */
        public void mo16441e(String str) {
            this.f12671e = str;
        }

        /* renamed from: f */
        public void mo16443f(String str) {
            this.f12672f = str;
        }

        /* renamed from: g */
        public void mo16445g(String str) {
            this.f12673g = str;
        }

        /* renamed from: h */
        public void mo16447h(String str) {
            this.f12674h = str;
        }

        /* renamed from: i */
        public void mo16449i(String str) {
            this.f12676j = str;
        }

        /* renamed from: a */
        public void mo16433a(String str) {
            this.f12667a = str;
        }
    }

    public C4197k() {
        super(2, 3);
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        C13479a.m54772d("Migration2_3", "users database migration: 2 —> 3 ");
        m17399a(bVar, m17400b(bVar));
        C13479a.m54772d("Migration2_3", "users database migration: 2 —> 3 done");
    }

    /* renamed from: b */
    private List<C4198a> m17400b(AbstractC1082b bVar) {
        C13479a.m54772d("Migration2_3", "migration findAllUser: ");
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
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("state");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("tmp_uid");
            C4193g gVar = new C4193g();
            while (cursor.moveToNext()) {
                C4198a aVar = new C4198a();
                aVar.mo16433a(gVar.mo16429a(cursor.getString(columnIndexOrThrow)));
                aVar.mo16435b(gVar.mo16429a(cursor.getString(columnIndexOrThrow2)));
                aVar.mo16437c(gVar.mo16429a(cursor.getString(columnIndexOrThrow3)));
                aVar.mo16439d(gVar.mo16429a(cursor.getString(columnIndexOrThrow4)));
                aVar.mo16441e(gVar.mo16429a(cursor.getString(columnIndexOrThrow5)));
                aVar.mo16443f(gVar.mo16429a(cursor.getString(columnIndexOrThrow6)));
                aVar.mo16445g(gVar.mo16429a(cursor.getString(columnIndexOrThrow7)));
                aVar.mo16447h(gVar.mo16429a(cursor.getString(columnIndexOrThrow8)));
                aVar.mo16432a(cursor.getInt(columnIndexOrThrow9));
                aVar.mo16449i(gVar.mo16429a(cursor.getString(columnIndexOrThrow10)));
                arrayList.add(aVar);
            }
        } catch (Exception e) {
            C13479a.m54761a("Migration2_3", e);
        } catch (Throwable th) {
            C4194h.m17396a(null);
            throw th;
        }
        C4194h.m17396a(cursor);
        return arrayList;
    }

    /* renamed from: a */
    private void m17399a(AbstractC1082b bVar, List<C4198a> list) {
        C13479a.m54772d("Migration2_3", "migration updateAllUserData");
        bVar.delete("user", null, null);
        for (C4198a aVar : list) {
            C13479a.m54772d("Migration2_3", "encrypted user: " + aVar);
            ContentValues contentValues = new ContentValues();
            contentValues.put("uid", aVar.mo16431a());
            contentValues.put("user_name", aVar.mo16434b());
            contentValues.put("organization", aVar.mo16436c());
            contentValues.put("email", aVar.mo16438d());
            contentValues.put("mobile", aVar.mo16440e());
            contentValues.put("avatar_url", aVar.mo16442f());
            contentValues.put("openid", aVar.mo16444g());
            contentValues.put("token", aVar.mo16446h());
            contentValues.put("state", Integer.valueOf(aVar.mo16448i()));
            contentValues.put("tmp_uid", aVar.mo16450j());
            bVar.insert("user", 5, contentValues);
        }
    }
}
