package com.bytedance.ee.bear.list.cache;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1154e;
import androidx.lifecycle.LiveData;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1429d;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import androidx.room.p048b.C1422a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.list.cache.h */
public final class C8184h implements AbstractC8183g {

    /* renamed from: A */
    private final AbstractC1440i f21930A;

    /* renamed from: B */
    private final AbstractC1440i f21931B;

    /* renamed from: C */
    private final AbstractC1440i f21932C;

    /* renamed from: D */
    private final AbstractC1440i f21933D;

    /* renamed from: E */
    private final AbstractC1440i f21934E;

    /* renamed from: F */
    private final AbstractC1440i f21935F;

    /* renamed from: G */
    private final AbstractC1440i f21936G;

    /* renamed from: H */
    private final AbstractC1440i f21937H;

    /* renamed from: I */
    private final AbstractC1440i f21938I;

    /* renamed from: J */
    private final AbstractC1440i f21939J;

    /* renamed from: a */
    public final RoomDatabase f21940a;

    /* renamed from: b */
    private final AbstractC1428c f21941b;

    /* renamed from: c */
    private final AbstractC1428c f21942c;

    /* renamed from: d */
    private final AbstractC1428c f21943d;

    /* renamed from: e */
    private final AbstractC1428c f21944e;

    /* renamed from: f */
    private final AbstractC1440i f21945f;

    /* renamed from: g */
    private final AbstractC1440i f21946g;

    /* renamed from: h */
    private final AbstractC1440i f21947h;

    /* renamed from: i */
    private final AbstractC1440i f21948i;

    /* renamed from: j */
    private final AbstractC1440i f21949j;

    /* renamed from: k */
    private final AbstractC1440i f21950k;

    /* renamed from: l */
    private final AbstractC1440i f21951l;

    /* renamed from: m */
    private final AbstractC1440i f21952m;

    /* renamed from: n */
    private final AbstractC1440i f21953n;

    /* renamed from: o */
    private final AbstractC1440i f21954o;

    /* renamed from: p */
    private final AbstractC1440i f21955p;

    /* renamed from: q */
    private final AbstractC1440i f21956q;

    /* renamed from: r */
    private final AbstractC1440i f21957r;

    /* renamed from: s */
    private final AbstractC1440i f21958s;

    /* renamed from: t */
    private final AbstractC1440i f21959t;

    /* renamed from: u */
    private final AbstractC1440i f21960u;

    /* renamed from: v */
    private final AbstractC1440i f21961v;

    /* renamed from: w */
    private final AbstractC1440i f21962w;

    /* renamed from: x */
    private final AbstractC1440i f21963x;

    /* renamed from: y */
    private final AbstractC1440i f21964y;

    /* renamed from: z */
    private final AbstractC1440i f21965z;

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public long[] mo31939a(C8175b... bVarArr) {
        this.f21940a.mo7546g();
        try {
            long[] a = this.f21942c.mo7591a((Object[]) bVarArr);
            this.f21940a.mo7549j();
            return a;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public long mo31923a(C8201j jVar) {
        this.f21940a.mo7546g();
        try {
            long a = this.f21943d.mo7587a(jVar);
            this.f21940a.mo7549j();
            return a;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public long[] mo31940a(C8201j... jVarArr) {
        this.f21940a.mo7546g();
        try {
            long[] a = this.f21943d.mo7591a((Object[]) jVarArr);
            this.f21940a.mo7549j();
            return a;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public long[] mo31938a(List<C8201j> list) {
        this.f21940a.mo7546g();
        try {
            long[] a = this.f21943d.mo7590a((Collection) list);
            this.f21940a.mo7549j();
            return a;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public long mo31924a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, String str12, String str13, String str14, int i, boolean z3, boolean z4, boolean z5, String str15, boolean z6, String str16, String str17, String str18, String str19, int i2, int i3, String str20, int i4, boolean z7, boolean z8, String str21, String str22, int i5, String str23, String str24, int i6, String str25, boolean z9, int i7, boolean z10) {
        AbstractC1090f fVar;
        Throwable th;
        AbstractC1090f c = this.f21945f.mo7618c();
        this.f21940a.mo7546g();
        int i8 = 1;
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th2) {
                th = th2;
                fVar = c;
                this.f21940a.mo7547h();
                this.f21945f.mo7616a(fVar);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str3 == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str3);
        }
        if (str4 == null) {
            c.bindNull(3);
        } else {
            c.bindString(3, str4);
        }
        if (str5 == null) {
            c.bindNull(4);
        } else {
            c.bindString(4, str5);
        }
        if (str6 == null) {
            c.bindNull(5);
        } else {
            c.bindString(5, str6);
        }
        if (str7 == null) {
            c.bindNull(6);
        } else {
            c.bindString(6, str7);
        }
        if (str8 == null) {
            c.bindNull(7);
        } else {
            c.bindString(7, str8);
        }
        if (str9 == null) {
            c.bindNull(8);
        } else {
            c.bindString(8, str9);
        }
        if (str10 == null) {
            c.bindNull(9);
        } else {
            c.bindString(9, str10);
        }
        if (str11 == null) {
            c.bindNull(10);
        } else {
            c.bindString(10, str11);
        }
        c.bindLong(11, (long) (z ? 1 : 0));
        c.bindLong(12, (long) (z2 ? 1 : 0));
        if (str12 == null) {
            c.bindNull(13);
        } else {
            c.bindString(13, str12);
        }
        if (str13 == null) {
            c.bindNull(14);
        } else {
            c.bindString(14, str13);
        }
        if (str14 == null) {
            c.bindNull(15);
        } else {
            c.bindString(15, str14);
        }
        c.bindLong(16, (long) i);
        c.bindLong(17, (long) (z3 ? 1 : 0));
        c.bindLong(18, (long) (z4 ? 1 : 0));
        c.bindLong(19, (long) (z5 ? 1 : 0));
        fVar = c;
        if (str15 == null) {
            try {
                fVar.bindNull(20);
            } catch (Throwable th3) {
                th = th3;
                this.f21940a.mo7547h();
                this.f21945f.mo7616a(fVar);
                throw th;
            }
        } else {
            fVar.bindString(20, str15);
        }
        fVar.bindLong(21, (long) (z6 ? 1 : 0));
        if (str16 == null) {
            fVar.bindNull(22);
        } else {
            fVar.bindString(22, str16);
        }
        if (str17 == null) {
            fVar.bindNull(23);
        } else {
            fVar.bindString(23, str17);
        }
        if (str18 == null) {
            fVar.bindNull(24);
        } else {
            fVar.bindString(24, str18);
        }
        if (str19 == null) {
            fVar.bindNull(25);
        } else {
            fVar.bindString(25, str19);
        }
        fVar.bindLong(26, (long) i2);
        fVar.bindLong(27, (long) i3);
        if (str20 == null) {
            fVar.bindNull(28);
        } else {
            fVar.bindString(28, str20);
        }
        fVar.bindLong(29, (long) i4);
        fVar.bindLong(30, (long) (z7 ? 1 : 0));
        fVar.bindLong(31, (long) (z8 ? 1 : 0));
        if (str21 == null) {
            fVar.bindNull(32);
        } else {
            fVar.bindString(32, str21);
        }
        if (str22 == null) {
            fVar.bindNull(33);
        } else {
            fVar.bindString(33, str22);
        }
        fVar.bindLong(34, (long) i5);
        if (str23 == null) {
            fVar.bindNull(35);
        } else {
            fVar.bindString(35, str23);
        }
        if (str24 == null) {
            fVar.bindNull(36);
        } else {
            fVar.bindString(36, str24);
        }
        fVar.bindLong(37, (long) i6);
        if (str25 == null) {
            fVar.bindNull(38);
        } else {
            fVar.bindString(38, str25);
        }
        fVar.bindLong(39, (long) (z9 ? 1 : 0));
        fVar.bindLong(40, (long) i7);
        if (!z10) {
            i8 = 0;
        }
        fVar.bindLong(41, (long) i8);
        if (str == null) {
            fVar.bindNull(42);
        } else {
            fVar.bindString(42, str);
        }
        long executeUpdateDelete = (long) fVar.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21945f.mo7616a(fVar);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public long mo31925a(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, int i, boolean z3, String str7, String str8, String str9, String str10, int i2, String str11, String str12, int i3, String str13, String str14, int i4, String str15, int i5) {
        AbstractC1090f fVar;
        Throwable th;
        AbstractC1090f c = this.f21946g.mo7618c();
        this.f21940a.mo7546g();
        int i6 = 1;
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th2) {
                th = th2;
                fVar = c;
                this.f21940a.mo7547h();
                this.f21946g.mo7616a(fVar);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str3 == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str3);
        }
        if (!z) {
            i6 = 0;
        }
        c.bindLong(3, (long) i6);
        c.bindLong(4, (long) (z2 ? 1 : 0));
        if (str4 == null) {
            c.bindNull(5);
        } else {
            c.bindString(5, str4);
        }
        if (str5 == null) {
            c.bindNull(6);
        } else {
            c.bindString(6, str5);
        }
        if (str6 == null) {
            c.bindNull(7);
        } else {
            c.bindString(7, str6);
        }
        c.bindLong(8, (long) i);
        c.bindLong(9, (long) (z3 ? 1 : 0));
        if (str7 == null) {
            c.bindNull(10);
        } else {
            c.bindString(10, str7);
        }
        if (str8 == null) {
            c.bindNull(11);
        } else {
            c.bindString(11, str8);
        }
        if (str9 == null) {
            c.bindNull(12);
        } else {
            c.bindString(12, str9);
        }
        if (str10 == null) {
            c.bindNull(13);
        } else {
            c.bindString(13, str10);
        }
        c.bindLong(14, (long) i2);
        if (str11 == null) {
            c.bindNull(15);
        } else {
            c.bindString(15, str11);
        }
        if (str12 == null) {
            c.bindNull(16);
        } else {
            c.bindString(16, str12);
        }
        c.bindLong(17, (long) i3);
        if (str13 == null) {
            c.bindNull(18);
        } else {
            c.bindString(18, str13);
        }
        if (str14 == null) {
            c.bindNull(19);
        } else {
            c.bindString(19, str14);
        }
        c.bindLong(20, (long) i4);
        fVar = c;
        if (str15 == null) {
            try {
                fVar.bindNull(21);
            } catch (Throwable th3) {
                th = th3;
                this.f21940a.mo7547h();
                this.f21946g.mo7616a(fVar);
                throw th;
            }
        } else {
            fVar.bindString(21, str15);
        }
        fVar.bindLong(22, (long) i5);
        if (str == null) {
            fVar.bindNull(23);
        } else {
            fVar.bindString(23, str);
        }
        long executeUpdateDelete = (long) fVar.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21946g.mo7616a(fVar);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31961c(String str, boolean z) {
        AbstractC1090f c = this.f21957r.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) (z ? 1 : 0));
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21957r.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31960c(String str, String str2, String str3) {
        AbstractC1090f c = this.f21930A.mo7618c();
        this.f21940a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21930A.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str3 == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str3);
        }
        if (str == null) {
            c.bindNull(3);
        } else {
            c.bindString(3, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21930A.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public void mo31951b(int i, int i2) {
        AbstractC1090f c = this.f21934E.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            c.bindLong(2, (long) i2);
            c.executeUpdateDelete();
            this.f21940a.mo7549j();
        } finally {
            this.f21940a.mo7547h();
            this.f21934E.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public void mo31937a(boolean z) {
        AbstractC1090f c = this.f21937H.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) (z ? 1 : 0));
            c.executeUpdateDelete();
            this.f21940a.mo7549j();
        } finally {
            this.f21940a.mo7547h();
            this.f21937H.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public LiveData<List<C8200i>> mo31926a(int i) {
        final C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.list_type = ?", 1);
        a.bindLong(1, (long) i);
        return new AbstractC1154e<List<C8200i>>(this.f21940a.mo7548i()) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass30 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f21991i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<C8200i> mo6021c() {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                int i2;
                boolean z10;
                boolean z11;
                boolean z12;
                int i3;
                boolean z13;
                int i4;
                boolean z14;
                if (this.f21991i == null) {
                    this.f21991i = new C1429d.AbstractC1432b("ListTypes", "DocMetaInfo") {
                        /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass30.C81881 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            AnonymousClass30.this.mo6020b();
                        }
                    };
                    C8184h.this.f21940a.mo7550k().mo7598b(this.f21991i);
                }
                Cursor a = C8184h.this.f21940a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("list_type");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("token");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("extra");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("space_id");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("file_path");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("add_time_manualoffline");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("is_need_wifi_download");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("open_time_recent");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("my_edit_time_recent");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("activity_time_recent");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("has_perm_folder");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("show_external_hint_folder");
                    int columnIndexOrThrow14 = a.getColumnIndexOrThrow("node_type_folder");
                    int columnIndexOrThrow15 = a.getColumnIndexOrThrow("shortcut_name_folder");
                    int columnIndexOrThrow16 = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow17 = a.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow18 = a.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                    int columnIndexOrThrow19 = a.getColumnIndexOrThrow("owner_id");
                    int columnIndexOrThrow20 = a.getColumnIndexOrThrow("create_tenant_id");
                    int columnIndexOrThrow21 = a.getColumnIndexOrThrow("creator_cn_name");
                    int columnIndexOrThrow22 = a.getColumnIndexOrThrow("creator_en_name");
                    int columnIndexOrThrow23 = a.getColumnIndexOrThrow("edit_uid");
                    int columnIndexOrThrow24 = a.getColumnIndexOrThrow("edit_time");
                    int columnIndexOrThrow25 = a.getColumnIndexOrThrow("url");
                    int columnIndexOrThrow26 = a.getColumnIndexOrThrow("fake_token");
                    int columnIndexOrThrow27 = a.getColumnIndexOrThrow("is_stared");
                    int columnIndexOrThrow28 = a.getColumnIndexOrThrow("is_pined");
                    int columnIndexOrThrow29 = a.getColumnIndexOrThrow("is_subscribed");
                    int columnIndexOrThrow30 = a.getColumnIndexOrThrow("extra_icon_url");
                    int columnIndexOrThrow31 = a.getColumnIndexOrThrow("extra_icon_key");
                    int columnIndexOrThrow32 = a.getColumnIndexOrThrow("extra_icon_nonce");
                    int columnIndexOrThrow33 = a.getColumnIndexOrThrow("extra_icon_encrypted_type");
                    int columnIndexOrThrow34 = a.getColumnIndexOrThrow("extra_copiable");
                    int columnIndexOrThrow35 = a.getColumnIndexOrThrow("extra_is_share_root");
                    int columnIndexOrThrow36 = a.getColumnIndexOrThrow("extra_is_external");
                    int columnIndexOrThrow37 = a.getColumnIndexOrThrow("extra_sub_type");
                    int columnIndexOrThrow38 = a.getColumnIndexOrThrow("is_visited");
                    int columnIndexOrThrow39 = a.getColumnIndexOrThrow("create_time");
                    int columnIndexOrThrow40 = a.getColumnIndexOrThrow("thumbnail_url");
                    int columnIndexOrThrow41 = a.getColumnIndexOrThrow("thumbnail_secret");
                    int columnIndexOrThrow42 = a.getColumnIndexOrThrow("thumbnail_nonce");
                    int columnIndexOrThrow43 = a.getColumnIndexOrThrow("thumbnail_type");
                    int columnIndexOrThrow44 = a.getColumnIndexOrThrow("permission");
                    int columnIndexOrThrow45 = a.getColumnIndexOrThrow("share_time");
                    int columnIndexOrThrow46 = a.getColumnIndexOrThrow("share_version");
                    int columnIndexOrThrow47 = a.getColumnIndexOrThrow("is_hidden");
                    int columnIndexOrThrow48 = a.getColumnIndexOrThrow("need_sync");
                    int columnIndexOrThrow49 = a.getColumnIndexOrThrow("size");
                    int columnIndexOrThrow50 = a.getColumnIndexOrThrow("thumbnail");
                    int columnIndexOrThrow51 = a.getColumnIndexOrThrow("document_icon_key");
                    int columnIndexOrThrow52 = a.getColumnIndexOrThrow("document_icon_type");
                    int columnIndexOrThrow53 = a.getColumnIndexOrThrow("document_icon_fsunit");
                    int columnIndexOrThrow54 = a.getColumnIndexOrThrow("app_id");
                    int columnIndexOrThrow55 = a.getColumnIndexOrThrow("doc_cache_status");
                    int columnIndexOrThrow56 = a.getColumnIndexOrThrow("is_offline_create");
                    int columnIndexOrThrow57 = a.getColumnIndexOrThrow("wiki_real_type");
                    int columnIndexOrThrow58 = a.getColumnIndexOrThrow("wiki_version");
                    int columnIndexOrThrow59 = a.getColumnIndexOrThrow("owner_type");
                    int columnIndexOrThrow60 = a.getColumnIndexOrThrow("is_share_folder");
                    int i5 = columnIndexOrThrow15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        C8200i iVar = new C8200i();
                        iVar.mo32025a(a.getString(columnIndexOrThrow));
                        iVar.mo32044e(a.getInt(columnIndexOrThrow2));
                        iVar.mo32100y(a.getString(columnIndexOrThrow3));
                        iVar.mo32102z(a.getString(columnIndexOrThrow4));
                        iVar.mo31989A(a.getString(columnIndexOrThrow5));
                        iVar.mo31991B(a.getString(columnIndexOrThrow6));
                        iVar.mo31993C(a.getString(columnIndexOrThrow7));
                        if (a.getInt(columnIndexOrThrow8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iVar.mo32066j(z);
                        iVar.mo32070l(a.getString(columnIndexOrThrow9));
                        iVar.mo32086r(a.getString(columnIndexOrThrow10));
                        iVar.mo32087s(a.getString(columnIndexOrThrow11));
                        if (a.getInt(columnIndexOrThrow12) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        iVar.mo32071l(z2);
                        if (a.getInt(columnIndexOrThrow13) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iVar.mo32074m(z3);
                        iVar.mo32064j(a.getInt(columnIndexOrThrow14));
                        iVar.mo32005I(a.getString(i5));
                        iVar.mo32025a(a.getString(columnIndexOrThrow16));
                        iVar.mo32033b(a.getString(columnIndexOrThrow17));
                        iVar.mo32037c(a.getString(columnIndexOrThrow18));
                        iVar.mo32041d(a.getString(columnIndexOrThrow19));
                        iVar.mo32045e(a.getString(columnIndexOrThrow20));
                        iVar.mo32049f(a.getString(columnIndexOrThrow21));
                        iVar.mo32053g(a.getString(columnIndexOrThrow22));
                        iVar.mo32057h(a.getString(columnIndexOrThrow23));
                        iVar.mo32061i(a.getString(columnIndexOrThrow24));
                        iVar.mo32065j(a.getString(columnIndexOrThrow25));
                        iVar.mo32067k(a.getString(columnIndexOrThrow26));
                        if (a.getInt(columnIndexOrThrow27) != 0) {
                            i = columnIndexOrThrow26;
                            z4 = true;
                        } else {
                            i = columnIndexOrThrow26;
                            z4 = false;
                        }
                        iVar.mo32026a(z4);
                        if (a.getInt(columnIndexOrThrow28) != 0) {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = true;
                        } else {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = false;
                        }
                        iVar.mo32034b(z5);
                        if (a.getInt(columnIndexOrThrow29) != 0) {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = true;
                        } else {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = false;
                        }
                        iVar.mo32038c(z6);
                        iVar.mo32073m(a.getString(columnIndexOrThrow30));
                        iVar.mo32077n(a.getString(columnIndexOrThrow31));
                        iVar.mo32080o(a.getString(columnIndexOrThrow32));
                        iVar.mo32024a(a.getInt(columnIndexOrThrow33));
                        if (a.getInt(columnIndexOrThrow34) != 0) {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = true;
                        } else {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = false;
                        }
                        iVar.mo32042d(z7);
                        if (a.getInt(columnIndexOrThrow35) != 0) {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = true;
                        } else {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = false;
                        }
                        iVar.mo32046e(z8);
                        if (a.getInt(columnIndexOrThrow36) != 0) {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = true;
                        } else {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = false;
                        }
                        iVar.mo32050f(z9);
                        iVar.mo32082p(a.getString(columnIndexOrThrow37));
                        if (a.getInt(columnIndexOrThrow38) != 0) {
                            i2 = columnIndexOrThrow37;
                            z10 = true;
                        } else {
                            i2 = columnIndexOrThrow37;
                            z10 = false;
                        }
                        iVar.mo32054g(z10);
                        iVar.mo32084q(a.getString(columnIndexOrThrow39));
                        iVar.mo32089t(a.getString(columnIndexOrThrow40));
                        iVar.mo32091u(a.getString(columnIndexOrThrow41));
                        iVar.mo32094v(a.getString(columnIndexOrThrow42));
                        iVar.mo32032b(a.getInt(columnIndexOrThrow43));
                        iVar.mo32036c(a.getInt(columnIndexOrThrow44));
                        iVar.mo32095w(a.getString(columnIndexOrThrow45));
                        iVar.mo32040d(a.getInt(columnIndexOrThrow46));
                        if (a.getInt(columnIndexOrThrow47) != 0) {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = true;
                        } else {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = false;
                        }
                        iVar.mo32058h(z11);
                        if (a.getInt(columnIndexOrThrow48) != 0) {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = true;
                        } else {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = false;
                        }
                        iVar.mo32062i(z12);
                        iVar.mo32098x(a.getString(columnIndexOrThrow49));
                        iVar.mo31999F(a.getString(columnIndexOrThrow50));
                        iVar.mo31995D(a.getString(columnIndexOrThrow51));
                        iVar.mo32048f(a.getInt(columnIndexOrThrow52));
                        iVar.mo31997E(a.getString(columnIndexOrThrow53));
                        iVar.mo32001G(a.getString(columnIndexOrThrow54));
                        iVar.mo32052g(a.getInt(columnIndexOrThrow55));
                        if (a.getInt(columnIndexOrThrow56) != 0) {
                            i3 = columnIndexOrThrow55;
                            z13 = true;
                        } else {
                            i3 = columnIndexOrThrow55;
                            z13 = false;
                        }
                        iVar.mo32068k(z13);
                        iVar.mo32056h(a.getInt(columnIndexOrThrow57));
                        iVar.mo32002H(a.getString(columnIndexOrThrow58));
                        iVar.mo32060i(a.getInt(columnIndexOrThrow59));
                        if (a.getInt(columnIndexOrThrow60) != 0) {
                            i4 = columnIndexOrThrow59;
                            z14 = true;
                        } else {
                            i4 = columnIndexOrThrow59;
                            z14 = false;
                        }
                        iVar.mo32078n(z14);
                        arrayList = arrayList;
                        arrayList.add(iVar);
                        columnIndexOrThrow60 = columnIndexOrThrow60;
                        columnIndexOrThrow = columnIndexOrThrow;
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                        i5 = i5;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow17 = columnIndexOrThrow17;
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        columnIndexOrThrow19 = columnIndexOrThrow19;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow23 = columnIndexOrThrow23;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        columnIndexOrThrow26 = i;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow30 = columnIndexOrThrow30;
                        columnIndexOrThrow31 = columnIndexOrThrow31;
                        columnIndexOrThrow32 = columnIndexOrThrow32;
                        columnIndexOrThrow33 = columnIndexOrThrow33;
                        columnIndexOrThrow37 = i2;
                        columnIndexOrThrow38 = columnIndexOrThrow38;
                        columnIndexOrThrow39 = columnIndexOrThrow39;
                        columnIndexOrThrow40 = columnIndexOrThrow40;
                        columnIndexOrThrow41 = columnIndexOrThrow41;
                        columnIndexOrThrow42 = columnIndexOrThrow42;
                        columnIndexOrThrow43 = columnIndexOrThrow43;
                        columnIndexOrThrow44 = columnIndexOrThrow44;
                        columnIndexOrThrow45 = columnIndexOrThrow45;
                        columnIndexOrThrow46 = columnIndexOrThrow46;
                        columnIndexOrThrow49 = columnIndexOrThrow49;
                        columnIndexOrThrow50 = columnIndexOrThrow50;
                        columnIndexOrThrow51 = columnIndexOrThrow51;
                        columnIndexOrThrow52 = columnIndexOrThrow52;
                        columnIndexOrThrow53 = columnIndexOrThrow53;
                        columnIndexOrThrow54 = columnIndexOrThrow54;
                        columnIndexOrThrow55 = i3;
                        columnIndexOrThrow56 = columnIndexOrThrow56;
                        columnIndexOrThrow57 = columnIndexOrThrow57;
                        columnIndexOrThrow58 = columnIndexOrThrow58;
                        columnIndexOrThrow59 = i4;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public List<C8200i> mo31950b(int i) {
        C1439h hVar;
        Throwable th;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        boolean z7;
        boolean z8;
        boolean z9;
        int i4;
        boolean z10;
        int i5;
        boolean z11;
        C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.list_type = ?", 1);
        a.bindLong(1, (long) i);
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("list_type");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("extra");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("add_time_manualoffline");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("is_need_wifi_download");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("open_time_recent");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("my_edit_time_recent");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("activity_time_recent");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("has_perm_folder");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("show_external_hint_folder");
            hVar = a;
            try {
                int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("node_type_folder");
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("shortcut_name_folder");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("obj_token");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("name");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("owner_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("create_tenant_id");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("creator_cn_name");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("creator_en_name");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("edit_uid");
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("edit_time");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("url");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("fake_token");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("is_stared");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("is_pined");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("is_subscribed");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("extra_icon_url");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("extra_icon_key");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("extra_icon_nonce");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("extra_icon_encrypted_type");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("extra_copiable");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("extra_is_share_root");
                int columnIndexOrThrow36 = a2.getColumnIndexOrThrow("extra_is_external");
                int columnIndexOrThrow37 = a2.getColumnIndexOrThrow("extra_sub_type");
                int columnIndexOrThrow38 = a2.getColumnIndexOrThrow("is_visited");
                int columnIndexOrThrow39 = a2.getColumnIndexOrThrow("create_time");
                int columnIndexOrThrow40 = a2.getColumnIndexOrThrow("thumbnail_url");
                int columnIndexOrThrow41 = a2.getColumnIndexOrThrow("thumbnail_secret");
                int columnIndexOrThrow42 = a2.getColumnIndexOrThrow("thumbnail_nonce");
                int columnIndexOrThrow43 = a2.getColumnIndexOrThrow("thumbnail_type");
                int columnIndexOrThrow44 = a2.getColumnIndexOrThrow("permission");
                int columnIndexOrThrow45 = a2.getColumnIndexOrThrow("share_time");
                int columnIndexOrThrow46 = a2.getColumnIndexOrThrow("share_version");
                int columnIndexOrThrow47 = a2.getColumnIndexOrThrow("is_hidden");
                int columnIndexOrThrow48 = a2.getColumnIndexOrThrow("need_sync");
                int columnIndexOrThrow49 = a2.getColumnIndexOrThrow("size");
                int columnIndexOrThrow50 = a2.getColumnIndexOrThrow("thumbnail");
                int columnIndexOrThrow51 = a2.getColumnIndexOrThrow("document_icon_key");
                int columnIndexOrThrow52 = a2.getColumnIndexOrThrow("document_icon_type");
                int columnIndexOrThrow53 = a2.getColumnIndexOrThrow("document_icon_fsunit");
                int columnIndexOrThrow54 = a2.getColumnIndexOrThrow("app_id");
                int columnIndexOrThrow55 = a2.getColumnIndexOrThrow("doc_cache_status");
                int columnIndexOrThrow56 = a2.getColumnIndexOrThrow("is_offline_create");
                int columnIndexOrThrow57 = a2.getColumnIndexOrThrow("wiki_real_type");
                int columnIndexOrThrow58 = a2.getColumnIndexOrThrow("wiki_version");
                int columnIndexOrThrow59 = a2.getColumnIndexOrThrow("owner_type");
                int columnIndexOrThrow60 = a2.getColumnIndexOrThrow("is_share_folder");
                int i6 = columnIndexOrThrow15;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C8200i iVar = new C8200i();
                    iVar.mo32025a(a2.getString(columnIndexOrThrow));
                    iVar.mo32044e(a2.getInt(columnIndexOrThrow2));
                    iVar.mo32100y(a2.getString(columnIndexOrThrow3));
                    iVar.mo32102z(a2.getString(columnIndexOrThrow4));
                    iVar.mo31989A(a2.getString(columnIndexOrThrow5));
                    iVar.mo31991B(a2.getString(columnIndexOrThrow6));
                    iVar.mo31993C(a2.getString(columnIndexOrThrow7));
                    iVar.mo32066j(a2.getInt(columnIndexOrThrow8) != 0);
                    iVar.mo32070l(a2.getString(columnIndexOrThrow9));
                    iVar.mo32086r(a2.getString(columnIndexOrThrow10));
                    iVar.mo32087s(a2.getString(columnIndexOrThrow11));
                    iVar.mo32071l(a2.getInt(columnIndexOrThrow12) != 0);
                    iVar.mo32074m(a2.getInt(columnIndexOrThrow13) != 0);
                    iVar.mo32064j(a2.getInt(columnIndexOrThrow14));
                    iVar.mo32005I(a2.getString(i6));
                    iVar.mo32025a(a2.getString(columnIndexOrThrow16));
                    iVar.mo32033b(a2.getString(columnIndexOrThrow17));
                    iVar.mo32037c(a2.getString(columnIndexOrThrow18));
                    iVar.mo32041d(a2.getString(columnIndexOrThrow19));
                    iVar.mo32045e(a2.getString(columnIndexOrThrow20));
                    iVar.mo32049f(a2.getString(columnIndexOrThrow21));
                    iVar.mo32053g(a2.getString(columnIndexOrThrow22));
                    iVar.mo32057h(a2.getString(columnIndexOrThrow23));
                    iVar.mo32061i(a2.getString(columnIndexOrThrow24));
                    iVar.mo32065j(a2.getString(columnIndexOrThrow25));
                    iVar.mo32067k(a2.getString(columnIndexOrThrow26));
                    if (a2.getInt(columnIndexOrThrow27) != 0) {
                        i2 = columnIndexOrThrow26;
                        z = true;
                    } else {
                        i2 = columnIndexOrThrow26;
                        z = false;
                    }
                    iVar.mo32026a(z);
                    if (a2.getInt(columnIndexOrThrow28) != 0) {
                        columnIndexOrThrow28 = columnIndexOrThrow28;
                        z2 = true;
                    } else {
                        columnIndexOrThrow28 = columnIndexOrThrow28;
                        z2 = false;
                    }
                    iVar.mo32034b(z2);
                    if (a2.getInt(columnIndexOrThrow29) != 0) {
                        columnIndexOrThrow29 = columnIndexOrThrow29;
                        z3 = true;
                    } else {
                        columnIndexOrThrow29 = columnIndexOrThrow29;
                        z3 = false;
                    }
                    iVar.mo32038c(z3);
                    iVar.mo32073m(a2.getString(columnIndexOrThrow30));
                    iVar.mo32077n(a2.getString(columnIndexOrThrow31));
                    iVar.mo32080o(a2.getString(columnIndexOrThrow32));
                    iVar.mo32024a(a2.getInt(columnIndexOrThrow33));
                    if (a2.getInt(columnIndexOrThrow34) != 0) {
                        columnIndexOrThrow34 = columnIndexOrThrow34;
                        z4 = true;
                    } else {
                        columnIndexOrThrow34 = columnIndexOrThrow34;
                        z4 = false;
                    }
                    iVar.mo32042d(z4);
                    if (a2.getInt(columnIndexOrThrow35) != 0) {
                        columnIndexOrThrow35 = columnIndexOrThrow35;
                        z5 = true;
                    } else {
                        columnIndexOrThrow35 = columnIndexOrThrow35;
                        z5 = false;
                    }
                    iVar.mo32046e(z5);
                    if (a2.getInt(columnIndexOrThrow36) != 0) {
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        z6 = true;
                    } else {
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        z6 = false;
                    }
                    iVar.mo32050f(z6);
                    iVar.mo32082p(a2.getString(columnIndexOrThrow37));
                    if (a2.getInt(columnIndexOrThrow38) != 0) {
                        i3 = columnIndexOrThrow37;
                        z7 = true;
                    } else {
                        i3 = columnIndexOrThrow37;
                        z7 = false;
                    }
                    iVar.mo32054g(z7);
                    iVar.mo32084q(a2.getString(columnIndexOrThrow39));
                    iVar.mo32089t(a2.getString(columnIndexOrThrow40));
                    iVar.mo32091u(a2.getString(columnIndexOrThrow41));
                    iVar.mo32094v(a2.getString(columnIndexOrThrow42));
                    iVar.mo32032b(a2.getInt(columnIndexOrThrow43));
                    iVar.mo32036c(a2.getInt(columnIndexOrThrow44));
                    iVar.mo32095w(a2.getString(columnIndexOrThrow45));
                    iVar.mo32040d(a2.getInt(columnIndexOrThrow46));
                    if (a2.getInt(columnIndexOrThrow47) != 0) {
                        columnIndexOrThrow47 = columnIndexOrThrow47;
                        z8 = true;
                    } else {
                        columnIndexOrThrow47 = columnIndexOrThrow47;
                        z8 = false;
                    }
                    iVar.mo32058h(z8);
                    if (a2.getInt(columnIndexOrThrow48) != 0) {
                        columnIndexOrThrow48 = columnIndexOrThrow48;
                        z9 = true;
                    } else {
                        columnIndexOrThrow48 = columnIndexOrThrow48;
                        z9 = false;
                    }
                    iVar.mo32062i(z9);
                    iVar.mo32098x(a2.getString(columnIndexOrThrow49));
                    iVar.mo31999F(a2.getString(columnIndexOrThrow50));
                    iVar.mo31995D(a2.getString(columnIndexOrThrow51));
                    iVar.mo32048f(a2.getInt(columnIndexOrThrow52));
                    iVar.mo31997E(a2.getString(columnIndexOrThrow53));
                    iVar.mo32001G(a2.getString(columnIndexOrThrow54));
                    iVar.mo32052g(a2.getInt(columnIndexOrThrow55));
                    if (a2.getInt(columnIndexOrThrow56) != 0) {
                        i4 = columnIndexOrThrow55;
                        z10 = true;
                    } else {
                        i4 = columnIndexOrThrow55;
                        z10 = false;
                    }
                    iVar.mo32068k(z10);
                    iVar.mo32056h(a2.getInt(columnIndexOrThrow57));
                    iVar.mo32002H(a2.getString(columnIndexOrThrow58));
                    iVar.mo32060i(a2.getInt(columnIndexOrThrow59));
                    if (a2.getInt(columnIndexOrThrow60) != 0) {
                        i5 = columnIndexOrThrow59;
                        z11 = true;
                    } else {
                        i5 = columnIndexOrThrow59;
                        z11 = false;
                    }
                    iVar.mo32078n(z11);
                    arrayList = arrayList;
                    arrayList.add(iVar);
                    columnIndexOrThrow12 = columnIndexOrThrow12;
                    columnIndexOrThrow14 = columnIndexOrThrow14;
                    i6 = i6;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    columnIndexOrThrow25 = columnIndexOrThrow25;
                    columnIndexOrThrow26 = i2;
                    columnIndexOrThrow27 = columnIndexOrThrow27;
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    columnIndexOrThrow31 = columnIndexOrThrow31;
                    columnIndexOrThrow32 = columnIndexOrThrow32;
                    columnIndexOrThrow33 = columnIndexOrThrow33;
                    columnIndexOrThrow37 = i3;
                    columnIndexOrThrow38 = columnIndexOrThrow38;
                    columnIndexOrThrow39 = columnIndexOrThrow39;
                    columnIndexOrThrow40 = columnIndexOrThrow40;
                    columnIndexOrThrow41 = columnIndexOrThrow41;
                    columnIndexOrThrow42 = columnIndexOrThrow42;
                    columnIndexOrThrow43 = columnIndexOrThrow43;
                    columnIndexOrThrow44 = columnIndexOrThrow44;
                    columnIndexOrThrow45 = columnIndexOrThrow45;
                    columnIndexOrThrow46 = columnIndexOrThrow46;
                    columnIndexOrThrow49 = columnIndexOrThrow49;
                    columnIndexOrThrow50 = columnIndexOrThrow50;
                    columnIndexOrThrow51 = columnIndexOrThrow51;
                    columnIndexOrThrow52 = columnIndexOrThrow52;
                    columnIndexOrThrow53 = columnIndexOrThrow53;
                    columnIndexOrThrow54 = columnIndexOrThrow54;
                    columnIndexOrThrow55 = i4;
                    columnIndexOrThrow56 = columnIndexOrThrow56;
                    columnIndexOrThrow57 = columnIndexOrThrow57;
                    columnIndexOrThrow58 = columnIndexOrThrow58;
                    columnIndexOrThrow59 = i5;
                    columnIndexOrThrow60 = columnIndexOrThrow60;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public List<C8200i> mo31935a(String str, int i) {
        C1439h hVar;
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        boolean z10;
        int i4;
        boolean z11;
        C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.obj_token = ? AND LT.list_type = ?", 2);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        a.bindLong(2, (long) i);
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("list_type");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("extra");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("add_time_manualoffline");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("is_need_wifi_download");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("open_time_recent");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("my_edit_time_recent");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("activity_time_recent");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("has_perm_folder");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("show_external_hint_folder");
            hVar = a;
            try {
                int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("node_type_folder");
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("shortcut_name_folder");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("obj_token");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("name");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("owner_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("create_tenant_id");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("creator_cn_name");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("creator_en_name");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("edit_uid");
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("edit_time");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("url");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("fake_token");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("is_stared");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("is_pined");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("is_subscribed");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("extra_icon_url");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("extra_icon_key");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("extra_icon_nonce");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("extra_icon_encrypted_type");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("extra_copiable");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("extra_is_share_root");
                int columnIndexOrThrow36 = a2.getColumnIndexOrThrow("extra_is_external");
                int columnIndexOrThrow37 = a2.getColumnIndexOrThrow("extra_sub_type");
                int columnIndexOrThrow38 = a2.getColumnIndexOrThrow("is_visited");
                int columnIndexOrThrow39 = a2.getColumnIndexOrThrow("create_time");
                int columnIndexOrThrow40 = a2.getColumnIndexOrThrow("thumbnail_url");
                int columnIndexOrThrow41 = a2.getColumnIndexOrThrow("thumbnail_secret");
                int columnIndexOrThrow42 = a2.getColumnIndexOrThrow("thumbnail_nonce");
                int columnIndexOrThrow43 = a2.getColumnIndexOrThrow("thumbnail_type");
                int columnIndexOrThrow44 = a2.getColumnIndexOrThrow("permission");
                int columnIndexOrThrow45 = a2.getColumnIndexOrThrow("share_time");
                int columnIndexOrThrow46 = a2.getColumnIndexOrThrow("share_version");
                int columnIndexOrThrow47 = a2.getColumnIndexOrThrow("is_hidden");
                int columnIndexOrThrow48 = a2.getColumnIndexOrThrow("need_sync");
                int columnIndexOrThrow49 = a2.getColumnIndexOrThrow("size");
                int columnIndexOrThrow50 = a2.getColumnIndexOrThrow("thumbnail");
                int columnIndexOrThrow51 = a2.getColumnIndexOrThrow("document_icon_key");
                int columnIndexOrThrow52 = a2.getColumnIndexOrThrow("document_icon_type");
                int columnIndexOrThrow53 = a2.getColumnIndexOrThrow("document_icon_fsunit");
                int columnIndexOrThrow54 = a2.getColumnIndexOrThrow("app_id");
                int columnIndexOrThrow55 = a2.getColumnIndexOrThrow("doc_cache_status");
                int columnIndexOrThrow56 = a2.getColumnIndexOrThrow("is_offline_create");
                int columnIndexOrThrow57 = a2.getColumnIndexOrThrow("wiki_real_type");
                int columnIndexOrThrow58 = a2.getColumnIndexOrThrow("wiki_version");
                int columnIndexOrThrow59 = a2.getColumnIndexOrThrow("owner_type");
                int columnIndexOrThrow60 = a2.getColumnIndexOrThrow("is_share_folder");
                int i5 = columnIndexOrThrow15;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C8200i iVar = new C8200i();
                    iVar.mo32025a(a2.getString(columnIndexOrThrow));
                    iVar.mo32044e(a2.getInt(columnIndexOrThrow2));
                    iVar.mo32100y(a2.getString(columnIndexOrThrow3));
                    iVar.mo32102z(a2.getString(columnIndexOrThrow4));
                    iVar.mo31989A(a2.getString(columnIndexOrThrow5));
                    iVar.mo31991B(a2.getString(columnIndexOrThrow6));
                    iVar.mo31993C(a2.getString(columnIndexOrThrow7));
                    iVar.mo32066j(a2.getInt(columnIndexOrThrow8) != 0);
                    iVar.mo32070l(a2.getString(columnIndexOrThrow9));
                    iVar.mo32086r(a2.getString(columnIndexOrThrow10));
                    iVar.mo32087s(a2.getString(columnIndexOrThrow11));
                    iVar.mo32071l(a2.getInt(columnIndexOrThrow12) != 0);
                    iVar.mo32074m(a2.getInt(columnIndexOrThrow13) != 0);
                    iVar.mo32064j(a2.getInt(columnIndexOrThrow14));
                    iVar.mo32005I(a2.getString(i5));
                    iVar.mo32025a(a2.getString(columnIndexOrThrow16));
                    iVar.mo32033b(a2.getString(columnIndexOrThrow17));
                    iVar.mo32037c(a2.getString(columnIndexOrThrow18));
                    iVar.mo32041d(a2.getString(columnIndexOrThrow19));
                    iVar.mo32045e(a2.getString(columnIndexOrThrow20));
                    iVar.mo32049f(a2.getString(columnIndexOrThrow21));
                    iVar.mo32053g(a2.getString(columnIndexOrThrow22));
                    iVar.mo32057h(a2.getString(columnIndexOrThrow23));
                    iVar.mo32061i(a2.getString(columnIndexOrThrow24));
                    iVar.mo32065j(a2.getString(columnIndexOrThrow25));
                    iVar.mo32067k(a2.getString(columnIndexOrThrow26));
                    if (a2.getInt(columnIndexOrThrow27) != 0) {
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        z = true;
                    } else {
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        z = false;
                    }
                    iVar.mo32026a(z);
                    if (a2.getInt(columnIndexOrThrow28) != 0) {
                        columnIndexOrThrow28 = columnIndexOrThrow28;
                        z2 = true;
                    } else {
                        columnIndexOrThrow28 = columnIndexOrThrow28;
                        z2 = false;
                    }
                    iVar.mo32034b(z2);
                    if (a2.getInt(columnIndexOrThrow29) != 0) {
                        columnIndexOrThrow29 = columnIndexOrThrow29;
                        z3 = true;
                    } else {
                        columnIndexOrThrow29 = columnIndexOrThrow29;
                        z3 = false;
                    }
                    iVar.mo32038c(z3);
                    iVar.mo32073m(a2.getString(columnIndexOrThrow30));
                    iVar.mo32077n(a2.getString(columnIndexOrThrow31));
                    iVar.mo32080o(a2.getString(columnIndexOrThrow32));
                    iVar.mo32024a(a2.getInt(columnIndexOrThrow33));
                    if (a2.getInt(columnIndexOrThrow34) != 0) {
                        columnIndexOrThrow34 = columnIndexOrThrow34;
                        z4 = true;
                    } else {
                        columnIndexOrThrow34 = columnIndexOrThrow34;
                        z4 = false;
                    }
                    iVar.mo32042d(z4);
                    if (a2.getInt(columnIndexOrThrow35) != 0) {
                        columnIndexOrThrow35 = columnIndexOrThrow35;
                        z5 = true;
                    } else {
                        columnIndexOrThrow35 = columnIndexOrThrow35;
                        z5 = false;
                    }
                    iVar.mo32046e(z5);
                    if (a2.getInt(columnIndexOrThrow36) != 0) {
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        z6 = true;
                    } else {
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        z6 = false;
                    }
                    iVar.mo32050f(z6);
                    iVar.mo32082p(a2.getString(columnIndexOrThrow37));
                    if (a2.getInt(columnIndexOrThrow38) != 0) {
                        i2 = columnIndexOrThrow37;
                        z7 = true;
                    } else {
                        i2 = columnIndexOrThrow37;
                        z7 = false;
                    }
                    iVar.mo32054g(z7);
                    iVar.mo32084q(a2.getString(columnIndexOrThrow39));
                    iVar.mo32089t(a2.getString(columnIndexOrThrow40));
                    iVar.mo32091u(a2.getString(columnIndexOrThrow41));
                    iVar.mo32094v(a2.getString(columnIndexOrThrow42));
                    iVar.mo32032b(a2.getInt(columnIndexOrThrow43));
                    iVar.mo32036c(a2.getInt(columnIndexOrThrow44));
                    iVar.mo32095w(a2.getString(columnIndexOrThrow45));
                    iVar.mo32040d(a2.getInt(columnIndexOrThrow46));
                    if (a2.getInt(columnIndexOrThrow47) != 0) {
                        columnIndexOrThrow47 = columnIndexOrThrow47;
                        z8 = true;
                    } else {
                        columnIndexOrThrow47 = columnIndexOrThrow47;
                        z8 = false;
                    }
                    iVar.mo32058h(z8);
                    if (a2.getInt(columnIndexOrThrow48) != 0) {
                        columnIndexOrThrow48 = columnIndexOrThrow48;
                        z9 = true;
                    } else {
                        columnIndexOrThrow48 = columnIndexOrThrow48;
                        z9 = false;
                    }
                    iVar.mo32062i(z9);
                    iVar.mo32098x(a2.getString(columnIndexOrThrow49));
                    iVar.mo31999F(a2.getString(columnIndexOrThrow50));
                    iVar.mo31995D(a2.getString(columnIndexOrThrow51));
                    iVar.mo32048f(a2.getInt(columnIndexOrThrow52));
                    iVar.mo31997E(a2.getString(columnIndexOrThrow53));
                    iVar.mo32001G(a2.getString(columnIndexOrThrow54));
                    iVar.mo32052g(a2.getInt(columnIndexOrThrow55));
                    if (a2.getInt(columnIndexOrThrow56) != 0) {
                        i3 = columnIndexOrThrow55;
                        z10 = true;
                    } else {
                        i3 = columnIndexOrThrow55;
                        z10 = false;
                    }
                    iVar.mo32068k(z10);
                    iVar.mo32056h(a2.getInt(columnIndexOrThrow57));
                    iVar.mo32002H(a2.getString(columnIndexOrThrow58));
                    iVar.mo32060i(a2.getInt(columnIndexOrThrow59));
                    if (a2.getInt(columnIndexOrThrow60) != 0) {
                        i4 = columnIndexOrThrow59;
                        z11 = true;
                    } else {
                        i4 = columnIndexOrThrow59;
                        z11 = false;
                    }
                    iVar.mo32078n(z11);
                    arrayList.add(iVar);
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow14;
                    i5 = i5;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    columnIndexOrThrow25 = columnIndexOrThrow25;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    columnIndexOrThrow31 = columnIndexOrThrow31;
                    columnIndexOrThrow32 = columnIndexOrThrow32;
                    columnIndexOrThrow33 = columnIndexOrThrow33;
                    columnIndexOrThrow37 = i2;
                    columnIndexOrThrow38 = columnIndexOrThrow38;
                    columnIndexOrThrow39 = columnIndexOrThrow39;
                    columnIndexOrThrow40 = columnIndexOrThrow40;
                    columnIndexOrThrow41 = columnIndexOrThrow41;
                    columnIndexOrThrow42 = columnIndexOrThrow42;
                    columnIndexOrThrow43 = columnIndexOrThrow43;
                    columnIndexOrThrow44 = columnIndexOrThrow44;
                    columnIndexOrThrow45 = columnIndexOrThrow45;
                    columnIndexOrThrow46 = columnIndexOrThrow46;
                    columnIndexOrThrow49 = columnIndexOrThrow49;
                    columnIndexOrThrow50 = columnIndexOrThrow50;
                    columnIndexOrThrow51 = columnIndexOrThrow51;
                    columnIndexOrThrow52 = columnIndexOrThrow52;
                    columnIndexOrThrow53 = columnIndexOrThrow53;
                    columnIndexOrThrow54 = columnIndexOrThrow54;
                    columnIndexOrThrow55 = i3;
                    columnIndexOrThrow56 = columnIndexOrThrow56;
                    columnIndexOrThrow57 = columnIndexOrThrow57;
                    columnIndexOrThrow58 = columnIndexOrThrow58;
                    columnIndexOrThrow59 = i4;
                    columnIndexOrThrow60 = columnIndexOrThrow60;
                    arrayList = arrayList;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public C8200i mo31949b(String str, int i) {
        C1439h hVar;
        Throwable th;
        C8200i iVar;
        C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.obj_token = ? AND LT.list_type = ?", 2);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        a.bindLong(2, (long) i);
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("list_type");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("extra");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("add_time_manualoffline");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("is_need_wifi_download");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("open_time_recent");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("my_edit_time_recent");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("activity_time_recent");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("has_perm_folder");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("show_external_hint_folder");
            hVar = a;
            try {
                int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("node_type_folder");
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("shortcut_name_folder");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("obj_token");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("name");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("owner_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("create_tenant_id");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("creator_cn_name");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("creator_en_name");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("edit_uid");
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("edit_time");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("url");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("fake_token");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("is_stared");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("is_pined");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("is_subscribed");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("extra_icon_url");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("extra_icon_key");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("extra_icon_nonce");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("extra_icon_encrypted_type");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("extra_copiable");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("extra_is_share_root");
                int columnIndexOrThrow36 = a2.getColumnIndexOrThrow("extra_is_external");
                int columnIndexOrThrow37 = a2.getColumnIndexOrThrow("extra_sub_type");
                int columnIndexOrThrow38 = a2.getColumnIndexOrThrow("is_visited");
                int columnIndexOrThrow39 = a2.getColumnIndexOrThrow("create_time");
                int columnIndexOrThrow40 = a2.getColumnIndexOrThrow("thumbnail_url");
                int columnIndexOrThrow41 = a2.getColumnIndexOrThrow("thumbnail_secret");
                int columnIndexOrThrow42 = a2.getColumnIndexOrThrow("thumbnail_nonce");
                int columnIndexOrThrow43 = a2.getColumnIndexOrThrow("thumbnail_type");
                int columnIndexOrThrow44 = a2.getColumnIndexOrThrow("permission");
                int columnIndexOrThrow45 = a2.getColumnIndexOrThrow("share_time");
                int columnIndexOrThrow46 = a2.getColumnIndexOrThrow("share_version");
                int columnIndexOrThrow47 = a2.getColumnIndexOrThrow("is_hidden");
                int columnIndexOrThrow48 = a2.getColumnIndexOrThrow("need_sync");
                int columnIndexOrThrow49 = a2.getColumnIndexOrThrow("size");
                int columnIndexOrThrow50 = a2.getColumnIndexOrThrow("thumbnail");
                int columnIndexOrThrow51 = a2.getColumnIndexOrThrow("document_icon_key");
                int columnIndexOrThrow52 = a2.getColumnIndexOrThrow("document_icon_type");
                int columnIndexOrThrow53 = a2.getColumnIndexOrThrow("document_icon_fsunit");
                int columnIndexOrThrow54 = a2.getColumnIndexOrThrow("app_id");
                int columnIndexOrThrow55 = a2.getColumnIndexOrThrow("doc_cache_status");
                int columnIndexOrThrow56 = a2.getColumnIndexOrThrow("is_offline_create");
                int columnIndexOrThrow57 = a2.getColumnIndexOrThrow("wiki_real_type");
                int columnIndexOrThrow58 = a2.getColumnIndexOrThrow("wiki_version");
                int columnIndexOrThrow59 = a2.getColumnIndexOrThrow("owner_type");
                int columnIndexOrThrow60 = a2.getColumnIndexOrThrow("is_share_folder");
                if (a2.moveToFirst()) {
                    iVar = new C8200i();
                    iVar.mo32025a(a2.getString(columnIndexOrThrow));
                    iVar.mo32044e(a2.getInt(columnIndexOrThrow2));
                    iVar.mo32100y(a2.getString(columnIndexOrThrow3));
                    iVar.mo32102z(a2.getString(columnIndexOrThrow4));
                    iVar.mo31989A(a2.getString(columnIndexOrThrow5));
                    iVar.mo31991B(a2.getString(columnIndexOrThrow6));
                    iVar.mo31993C(a2.getString(columnIndexOrThrow7));
                    iVar.mo32066j(a2.getInt(columnIndexOrThrow8) != 0);
                    iVar.mo32070l(a2.getString(columnIndexOrThrow9));
                    iVar.mo32086r(a2.getString(columnIndexOrThrow10));
                    iVar.mo32087s(a2.getString(columnIndexOrThrow11));
                    iVar.mo32071l(a2.getInt(columnIndexOrThrow12) != 0);
                    iVar.mo32074m(a2.getInt(columnIndexOrThrow13) != 0);
                    iVar.mo32064j(a2.getInt(columnIndexOrThrow14));
                    iVar.mo32005I(a2.getString(columnIndexOrThrow15));
                    iVar.mo32025a(a2.getString(columnIndexOrThrow16));
                    iVar.mo32033b(a2.getString(columnIndexOrThrow17));
                    iVar.mo32037c(a2.getString(columnIndexOrThrow18));
                    iVar.mo32041d(a2.getString(columnIndexOrThrow19));
                    iVar.mo32045e(a2.getString(columnIndexOrThrow20));
                    iVar.mo32049f(a2.getString(columnIndexOrThrow21));
                    iVar.mo32053g(a2.getString(columnIndexOrThrow22));
                    iVar.mo32057h(a2.getString(columnIndexOrThrow23));
                    iVar.mo32061i(a2.getString(columnIndexOrThrow24));
                    iVar.mo32065j(a2.getString(columnIndexOrThrow25));
                    iVar.mo32067k(a2.getString(columnIndexOrThrow26));
                    iVar.mo32026a(a2.getInt(columnIndexOrThrow27) != 0);
                    iVar.mo32034b(a2.getInt(columnIndexOrThrow28) != 0);
                    iVar.mo32038c(a2.getInt(columnIndexOrThrow29) != 0);
                    iVar.mo32073m(a2.getString(columnIndexOrThrow30));
                    iVar.mo32077n(a2.getString(columnIndexOrThrow31));
                    iVar.mo32080o(a2.getString(columnIndexOrThrow32));
                    iVar.mo32024a(a2.getInt(columnIndexOrThrow33));
                    iVar.mo32042d(a2.getInt(columnIndexOrThrow34) != 0);
                    iVar.mo32046e(a2.getInt(columnIndexOrThrow35) != 0);
                    iVar.mo32050f(a2.getInt(columnIndexOrThrow36) != 0);
                    iVar.mo32082p(a2.getString(columnIndexOrThrow37));
                    iVar.mo32054g(a2.getInt(columnIndexOrThrow38) != 0);
                    iVar.mo32084q(a2.getString(columnIndexOrThrow39));
                    iVar.mo32089t(a2.getString(columnIndexOrThrow40));
                    iVar.mo32091u(a2.getString(columnIndexOrThrow41));
                    iVar.mo32094v(a2.getString(columnIndexOrThrow42));
                    iVar.mo32032b(a2.getInt(columnIndexOrThrow43));
                    iVar.mo32036c(a2.getInt(columnIndexOrThrow44));
                    iVar.mo32095w(a2.getString(columnIndexOrThrow45));
                    iVar.mo32040d(a2.getInt(columnIndexOrThrow46));
                    iVar.mo32058h(a2.getInt(columnIndexOrThrow47) != 0);
                    iVar.mo32062i(a2.getInt(columnIndexOrThrow48) != 0);
                    iVar.mo32098x(a2.getString(columnIndexOrThrow49));
                    iVar.mo31999F(a2.getString(columnIndexOrThrow50));
                    iVar.mo31995D(a2.getString(columnIndexOrThrow51));
                    iVar.mo32048f(a2.getInt(columnIndexOrThrow52));
                    iVar.mo31997E(a2.getString(columnIndexOrThrow53));
                    iVar.mo32001G(a2.getString(columnIndexOrThrow54));
                    iVar.mo32052g(a2.getInt(columnIndexOrThrow55));
                    iVar.mo32068k(a2.getInt(columnIndexOrThrow56) != 0);
                    iVar.mo32056h(a2.getInt(columnIndexOrThrow57));
                    iVar.mo32002H(a2.getString(columnIndexOrThrow58));
                    iVar.mo32060i(a2.getInt(columnIndexOrThrow59));
                    iVar.mo32078n(a2.getInt(columnIndexOrThrow60) != 0);
                } else {
                    iVar = null;
                }
                a2.close();
                hVar.mo7613a();
                return iVar;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public List<C8200i> mo31933a(int i, String str, String str2) {
        C1439h hVar;
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        boolean z10;
        int i4;
        boolean z11;
        C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE list_type = ? AND file_path = ? AND LT.obj_token LIKE ? || '%'", 3);
        a.bindLong(1, (long) i);
        if (str2 == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str2);
        }
        if (str == null) {
            a.bindNull(3);
        } else {
            a.bindString(3, str);
        }
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("list_type");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("extra");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("add_time_manualoffline");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("is_need_wifi_download");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("open_time_recent");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("my_edit_time_recent");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("activity_time_recent");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("has_perm_folder");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("show_external_hint_folder");
            hVar = a;
            try {
                int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("node_type_folder");
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("shortcut_name_folder");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("obj_token");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("name");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("owner_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("create_tenant_id");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("creator_cn_name");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("creator_en_name");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("edit_uid");
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("edit_time");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("url");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("fake_token");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("is_stared");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("is_pined");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("is_subscribed");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("extra_icon_url");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("extra_icon_key");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("extra_icon_nonce");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("extra_icon_encrypted_type");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("extra_copiable");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("extra_is_share_root");
                int columnIndexOrThrow36 = a2.getColumnIndexOrThrow("extra_is_external");
                int columnIndexOrThrow37 = a2.getColumnIndexOrThrow("extra_sub_type");
                int columnIndexOrThrow38 = a2.getColumnIndexOrThrow("is_visited");
                int columnIndexOrThrow39 = a2.getColumnIndexOrThrow("create_time");
                int columnIndexOrThrow40 = a2.getColumnIndexOrThrow("thumbnail_url");
                int columnIndexOrThrow41 = a2.getColumnIndexOrThrow("thumbnail_secret");
                int columnIndexOrThrow42 = a2.getColumnIndexOrThrow("thumbnail_nonce");
                int columnIndexOrThrow43 = a2.getColumnIndexOrThrow("thumbnail_type");
                int columnIndexOrThrow44 = a2.getColumnIndexOrThrow("permission");
                int columnIndexOrThrow45 = a2.getColumnIndexOrThrow("share_time");
                int columnIndexOrThrow46 = a2.getColumnIndexOrThrow("share_version");
                int columnIndexOrThrow47 = a2.getColumnIndexOrThrow("is_hidden");
                int columnIndexOrThrow48 = a2.getColumnIndexOrThrow("need_sync");
                int columnIndexOrThrow49 = a2.getColumnIndexOrThrow("size");
                int columnIndexOrThrow50 = a2.getColumnIndexOrThrow("thumbnail");
                int columnIndexOrThrow51 = a2.getColumnIndexOrThrow("document_icon_key");
                int columnIndexOrThrow52 = a2.getColumnIndexOrThrow("document_icon_type");
                int columnIndexOrThrow53 = a2.getColumnIndexOrThrow("document_icon_fsunit");
                int columnIndexOrThrow54 = a2.getColumnIndexOrThrow("app_id");
                int columnIndexOrThrow55 = a2.getColumnIndexOrThrow("doc_cache_status");
                int columnIndexOrThrow56 = a2.getColumnIndexOrThrow("is_offline_create");
                int columnIndexOrThrow57 = a2.getColumnIndexOrThrow("wiki_real_type");
                int columnIndexOrThrow58 = a2.getColumnIndexOrThrow("wiki_version");
                int columnIndexOrThrow59 = a2.getColumnIndexOrThrow("owner_type");
                int columnIndexOrThrow60 = a2.getColumnIndexOrThrow("is_share_folder");
                int i5 = columnIndexOrThrow15;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C8200i iVar = new C8200i();
                    iVar.mo32025a(a2.getString(columnIndexOrThrow));
                    iVar.mo32044e(a2.getInt(columnIndexOrThrow2));
                    iVar.mo32100y(a2.getString(columnIndexOrThrow3));
                    iVar.mo32102z(a2.getString(columnIndexOrThrow4));
                    iVar.mo31989A(a2.getString(columnIndexOrThrow5));
                    iVar.mo31991B(a2.getString(columnIndexOrThrow6));
                    iVar.mo31993C(a2.getString(columnIndexOrThrow7));
                    iVar.mo32066j(a2.getInt(columnIndexOrThrow8) != 0);
                    iVar.mo32070l(a2.getString(columnIndexOrThrow9));
                    iVar.mo32086r(a2.getString(columnIndexOrThrow10));
                    iVar.mo32087s(a2.getString(columnIndexOrThrow11));
                    iVar.mo32071l(a2.getInt(columnIndexOrThrow12) != 0);
                    iVar.mo32074m(a2.getInt(columnIndexOrThrow13) != 0);
                    iVar.mo32064j(a2.getInt(columnIndexOrThrow14));
                    iVar.mo32005I(a2.getString(i5));
                    iVar.mo32025a(a2.getString(columnIndexOrThrow16));
                    iVar.mo32033b(a2.getString(columnIndexOrThrow17));
                    iVar.mo32037c(a2.getString(columnIndexOrThrow18));
                    iVar.mo32041d(a2.getString(columnIndexOrThrow19));
                    iVar.mo32045e(a2.getString(columnIndexOrThrow20));
                    iVar.mo32049f(a2.getString(columnIndexOrThrow21));
                    iVar.mo32053g(a2.getString(columnIndexOrThrow22));
                    iVar.mo32057h(a2.getString(columnIndexOrThrow23));
                    iVar.mo32061i(a2.getString(columnIndexOrThrow24));
                    iVar.mo32065j(a2.getString(columnIndexOrThrow25));
                    iVar.mo32067k(a2.getString(columnIndexOrThrow26));
                    if (a2.getInt(columnIndexOrThrow27) != 0) {
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        z = true;
                    } else {
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        z = false;
                    }
                    iVar.mo32026a(z);
                    if (a2.getInt(columnIndexOrThrow28) != 0) {
                        columnIndexOrThrow28 = columnIndexOrThrow28;
                        z2 = true;
                    } else {
                        columnIndexOrThrow28 = columnIndexOrThrow28;
                        z2 = false;
                    }
                    iVar.mo32034b(z2);
                    if (a2.getInt(columnIndexOrThrow29) != 0) {
                        columnIndexOrThrow29 = columnIndexOrThrow29;
                        z3 = true;
                    } else {
                        columnIndexOrThrow29 = columnIndexOrThrow29;
                        z3 = false;
                    }
                    iVar.mo32038c(z3);
                    iVar.mo32073m(a2.getString(columnIndexOrThrow30));
                    iVar.mo32077n(a2.getString(columnIndexOrThrow31));
                    iVar.mo32080o(a2.getString(columnIndexOrThrow32));
                    iVar.mo32024a(a2.getInt(columnIndexOrThrow33));
                    if (a2.getInt(columnIndexOrThrow34) != 0) {
                        columnIndexOrThrow34 = columnIndexOrThrow34;
                        z4 = true;
                    } else {
                        columnIndexOrThrow34 = columnIndexOrThrow34;
                        z4 = false;
                    }
                    iVar.mo32042d(z4);
                    if (a2.getInt(columnIndexOrThrow35) != 0) {
                        columnIndexOrThrow35 = columnIndexOrThrow35;
                        z5 = true;
                    } else {
                        columnIndexOrThrow35 = columnIndexOrThrow35;
                        z5 = false;
                    }
                    iVar.mo32046e(z5);
                    if (a2.getInt(columnIndexOrThrow36) != 0) {
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        z6 = true;
                    } else {
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        z6 = false;
                    }
                    iVar.mo32050f(z6);
                    iVar.mo32082p(a2.getString(columnIndexOrThrow37));
                    if (a2.getInt(columnIndexOrThrow38) != 0) {
                        i2 = columnIndexOrThrow37;
                        z7 = true;
                    } else {
                        i2 = columnIndexOrThrow37;
                        z7 = false;
                    }
                    iVar.mo32054g(z7);
                    iVar.mo32084q(a2.getString(columnIndexOrThrow39));
                    iVar.mo32089t(a2.getString(columnIndexOrThrow40));
                    iVar.mo32091u(a2.getString(columnIndexOrThrow41));
                    iVar.mo32094v(a2.getString(columnIndexOrThrow42));
                    iVar.mo32032b(a2.getInt(columnIndexOrThrow43));
                    iVar.mo32036c(a2.getInt(columnIndexOrThrow44));
                    iVar.mo32095w(a2.getString(columnIndexOrThrow45));
                    iVar.mo32040d(a2.getInt(columnIndexOrThrow46));
                    if (a2.getInt(columnIndexOrThrow47) != 0) {
                        columnIndexOrThrow47 = columnIndexOrThrow47;
                        z8 = true;
                    } else {
                        columnIndexOrThrow47 = columnIndexOrThrow47;
                        z8 = false;
                    }
                    iVar.mo32058h(z8);
                    if (a2.getInt(columnIndexOrThrow48) != 0) {
                        columnIndexOrThrow48 = columnIndexOrThrow48;
                        z9 = true;
                    } else {
                        columnIndexOrThrow48 = columnIndexOrThrow48;
                        z9 = false;
                    }
                    iVar.mo32062i(z9);
                    iVar.mo32098x(a2.getString(columnIndexOrThrow49));
                    iVar.mo31999F(a2.getString(columnIndexOrThrow50));
                    iVar.mo31995D(a2.getString(columnIndexOrThrow51));
                    iVar.mo32048f(a2.getInt(columnIndexOrThrow52));
                    iVar.mo31997E(a2.getString(columnIndexOrThrow53));
                    iVar.mo32001G(a2.getString(columnIndexOrThrow54));
                    iVar.mo32052g(a2.getInt(columnIndexOrThrow55));
                    if (a2.getInt(columnIndexOrThrow56) != 0) {
                        i3 = columnIndexOrThrow55;
                        z10 = true;
                    } else {
                        i3 = columnIndexOrThrow55;
                        z10 = false;
                    }
                    iVar.mo32068k(z10);
                    iVar.mo32056h(a2.getInt(columnIndexOrThrow57));
                    iVar.mo32002H(a2.getString(columnIndexOrThrow58));
                    iVar.mo32060i(a2.getInt(columnIndexOrThrow59));
                    if (a2.getInt(columnIndexOrThrow60) != 0) {
                        i4 = columnIndexOrThrow59;
                        z11 = true;
                    } else {
                        i4 = columnIndexOrThrow59;
                        z11 = false;
                    }
                    iVar.mo32078n(z11);
                    arrayList.add(iVar);
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow14;
                    arrayList = arrayList;
                    i5 = i5;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    columnIndexOrThrow25 = columnIndexOrThrow25;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    columnIndexOrThrow31 = columnIndexOrThrow31;
                    columnIndexOrThrow32 = columnIndexOrThrow32;
                    columnIndexOrThrow33 = columnIndexOrThrow33;
                    columnIndexOrThrow37 = i2;
                    columnIndexOrThrow38 = columnIndexOrThrow38;
                    columnIndexOrThrow39 = columnIndexOrThrow39;
                    columnIndexOrThrow40 = columnIndexOrThrow40;
                    columnIndexOrThrow41 = columnIndexOrThrow41;
                    columnIndexOrThrow42 = columnIndexOrThrow42;
                    columnIndexOrThrow43 = columnIndexOrThrow43;
                    columnIndexOrThrow44 = columnIndexOrThrow44;
                    columnIndexOrThrow45 = columnIndexOrThrow45;
                    columnIndexOrThrow46 = columnIndexOrThrow46;
                    columnIndexOrThrow49 = columnIndexOrThrow49;
                    columnIndexOrThrow50 = columnIndexOrThrow50;
                    columnIndexOrThrow51 = columnIndexOrThrow51;
                    columnIndexOrThrow52 = columnIndexOrThrow52;
                    columnIndexOrThrow53 = columnIndexOrThrow53;
                    columnIndexOrThrow54 = columnIndexOrThrow54;
                    columnIndexOrThrow55 = i3;
                    columnIndexOrThrow56 = columnIndexOrThrow56;
                    columnIndexOrThrow57 = columnIndexOrThrow57;
                    columnIndexOrThrow58 = columnIndexOrThrow58;
                    columnIndexOrThrow59 = i4;
                    columnIndexOrThrow60 = columnIndexOrThrow60;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public List<C8200i> mo31932a(int i, String str) {
        C1439h hVar;
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        boolean z10;
        int i4;
        boolean z11;
        C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE DMI.doc_cache_status = ? and DMI.name LIKE '%' || ? || '%'", 2);
        a.bindLong(1, (long) i);
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("list_type");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("extra");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("add_time_manualoffline");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("is_need_wifi_download");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("open_time_recent");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("my_edit_time_recent");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("activity_time_recent");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("has_perm_folder");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("show_external_hint_folder");
            hVar = a;
            try {
                int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("node_type_folder");
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("shortcut_name_folder");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("obj_token");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("name");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("owner_id");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("create_tenant_id");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("creator_cn_name");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("creator_en_name");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("edit_uid");
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("edit_time");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("url");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("fake_token");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("is_stared");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("is_pined");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("is_subscribed");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("extra_icon_url");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("extra_icon_key");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("extra_icon_nonce");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("extra_icon_encrypted_type");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("extra_copiable");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("extra_is_share_root");
                int columnIndexOrThrow36 = a2.getColumnIndexOrThrow("extra_is_external");
                int columnIndexOrThrow37 = a2.getColumnIndexOrThrow("extra_sub_type");
                int columnIndexOrThrow38 = a2.getColumnIndexOrThrow("is_visited");
                int columnIndexOrThrow39 = a2.getColumnIndexOrThrow("create_time");
                int columnIndexOrThrow40 = a2.getColumnIndexOrThrow("thumbnail_url");
                int columnIndexOrThrow41 = a2.getColumnIndexOrThrow("thumbnail_secret");
                int columnIndexOrThrow42 = a2.getColumnIndexOrThrow("thumbnail_nonce");
                int columnIndexOrThrow43 = a2.getColumnIndexOrThrow("thumbnail_type");
                int columnIndexOrThrow44 = a2.getColumnIndexOrThrow("permission");
                int columnIndexOrThrow45 = a2.getColumnIndexOrThrow("share_time");
                int columnIndexOrThrow46 = a2.getColumnIndexOrThrow("share_version");
                int columnIndexOrThrow47 = a2.getColumnIndexOrThrow("is_hidden");
                int columnIndexOrThrow48 = a2.getColumnIndexOrThrow("need_sync");
                int columnIndexOrThrow49 = a2.getColumnIndexOrThrow("size");
                int columnIndexOrThrow50 = a2.getColumnIndexOrThrow("thumbnail");
                int columnIndexOrThrow51 = a2.getColumnIndexOrThrow("document_icon_key");
                int columnIndexOrThrow52 = a2.getColumnIndexOrThrow("document_icon_type");
                int columnIndexOrThrow53 = a2.getColumnIndexOrThrow("document_icon_fsunit");
                int columnIndexOrThrow54 = a2.getColumnIndexOrThrow("app_id");
                int columnIndexOrThrow55 = a2.getColumnIndexOrThrow("doc_cache_status");
                int columnIndexOrThrow56 = a2.getColumnIndexOrThrow("is_offline_create");
                int columnIndexOrThrow57 = a2.getColumnIndexOrThrow("wiki_real_type");
                int columnIndexOrThrow58 = a2.getColumnIndexOrThrow("wiki_version");
                int columnIndexOrThrow59 = a2.getColumnIndexOrThrow("owner_type");
                int columnIndexOrThrow60 = a2.getColumnIndexOrThrow("is_share_folder");
                int i5 = columnIndexOrThrow15;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C8200i iVar = new C8200i();
                    iVar.mo32025a(a2.getString(columnIndexOrThrow));
                    iVar.mo32044e(a2.getInt(columnIndexOrThrow2));
                    iVar.mo32100y(a2.getString(columnIndexOrThrow3));
                    iVar.mo32102z(a2.getString(columnIndexOrThrow4));
                    iVar.mo31989A(a2.getString(columnIndexOrThrow5));
                    iVar.mo31991B(a2.getString(columnIndexOrThrow6));
                    iVar.mo31993C(a2.getString(columnIndexOrThrow7));
                    iVar.mo32066j(a2.getInt(columnIndexOrThrow8) != 0);
                    iVar.mo32070l(a2.getString(columnIndexOrThrow9));
                    iVar.mo32086r(a2.getString(columnIndexOrThrow10));
                    iVar.mo32087s(a2.getString(columnIndexOrThrow11));
                    iVar.mo32071l(a2.getInt(columnIndexOrThrow12) != 0);
                    iVar.mo32074m(a2.getInt(columnIndexOrThrow13) != 0);
                    iVar.mo32064j(a2.getInt(columnIndexOrThrow14));
                    iVar.mo32005I(a2.getString(i5));
                    iVar.mo32025a(a2.getString(columnIndexOrThrow16));
                    iVar.mo32033b(a2.getString(columnIndexOrThrow17));
                    iVar.mo32037c(a2.getString(columnIndexOrThrow18));
                    iVar.mo32041d(a2.getString(columnIndexOrThrow19));
                    iVar.mo32045e(a2.getString(columnIndexOrThrow20));
                    iVar.mo32049f(a2.getString(columnIndexOrThrow21));
                    iVar.mo32053g(a2.getString(columnIndexOrThrow22));
                    iVar.mo32057h(a2.getString(columnIndexOrThrow23));
                    iVar.mo32061i(a2.getString(columnIndexOrThrow24));
                    iVar.mo32065j(a2.getString(columnIndexOrThrow25));
                    iVar.mo32067k(a2.getString(columnIndexOrThrow26));
                    if (a2.getInt(columnIndexOrThrow27) != 0) {
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        z = true;
                    } else {
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        z = false;
                    }
                    iVar.mo32026a(z);
                    if (a2.getInt(columnIndexOrThrow28) != 0) {
                        columnIndexOrThrow28 = columnIndexOrThrow28;
                        z2 = true;
                    } else {
                        columnIndexOrThrow28 = columnIndexOrThrow28;
                        z2 = false;
                    }
                    iVar.mo32034b(z2);
                    if (a2.getInt(columnIndexOrThrow29) != 0) {
                        columnIndexOrThrow29 = columnIndexOrThrow29;
                        z3 = true;
                    } else {
                        columnIndexOrThrow29 = columnIndexOrThrow29;
                        z3 = false;
                    }
                    iVar.mo32038c(z3);
                    iVar.mo32073m(a2.getString(columnIndexOrThrow30));
                    iVar.mo32077n(a2.getString(columnIndexOrThrow31));
                    iVar.mo32080o(a2.getString(columnIndexOrThrow32));
                    iVar.mo32024a(a2.getInt(columnIndexOrThrow33));
                    if (a2.getInt(columnIndexOrThrow34) != 0) {
                        columnIndexOrThrow34 = columnIndexOrThrow34;
                        z4 = true;
                    } else {
                        columnIndexOrThrow34 = columnIndexOrThrow34;
                        z4 = false;
                    }
                    iVar.mo32042d(z4);
                    if (a2.getInt(columnIndexOrThrow35) != 0) {
                        columnIndexOrThrow35 = columnIndexOrThrow35;
                        z5 = true;
                    } else {
                        columnIndexOrThrow35 = columnIndexOrThrow35;
                        z5 = false;
                    }
                    iVar.mo32046e(z5);
                    if (a2.getInt(columnIndexOrThrow36) != 0) {
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        z6 = true;
                    } else {
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        z6 = false;
                    }
                    iVar.mo32050f(z6);
                    iVar.mo32082p(a2.getString(columnIndexOrThrow37));
                    if (a2.getInt(columnIndexOrThrow38) != 0) {
                        i2 = columnIndexOrThrow37;
                        z7 = true;
                    } else {
                        i2 = columnIndexOrThrow37;
                        z7 = false;
                    }
                    iVar.mo32054g(z7);
                    iVar.mo32084q(a2.getString(columnIndexOrThrow39));
                    iVar.mo32089t(a2.getString(columnIndexOrThrow40));
                    iVar.mo32091u(a2.getString(columnIndexOrThrow41));
                    iVar.mo32094v(a2.getString(columnIndexOrThrow42));
                    iVar.mo32032b(a2.getInt(columnIndexOrThrow43));
                    iVar.mo32036c(a2.getInt(columnIndexOrThrow44));
                    iVar.mo32095w(a2.getString(columnIndexOrThrow45));
                    iVar.mo32040d(a2.getInt(columnIndexOrThrow46));
                    if (a2.getInt(columnIndexOrThrow47) != 0) {
                        columnIndexOrThrow47 = columnIndexOrThrow47;
                        z8 = true;
                    } else {
                        columnIndexOrThrow47 = columnIndexOrThrow47;
                        z8 = false;
                    }
                    iVar.mo32058h(z8);
                    if (a2.getInt(columnIndexOrThrow48) != 0) {
                        columnIndexOrThrow48 = columnIndexOrThrow48;
                        z9 = true;
                    } else {
                        columnIndexOrThrow48 = columnIndexOrThrow48;
                        z9 = false;
                    }
                    iVar.mo32062i(z9);
                    iVar.mo32098x(a2.getString(columnIndexOrThrow49));
                    iVar.mo31999F(a2.getString(columnIndexOrThrow50));
                    iVar.mo31995D(a2.getString(columnIndexOrThrow51));
                    iVar.mo32048f(a2.getInt(columnIndexOrThrow52));
                    iVar.mo31997E(a2.getString(columnIndexOrThrow53));
                    iVar.mo32001G(a2.getString(columnIndexOrThrow54));
                    iVar.mo32052g(a2.getInt(columnIndexOrThrow55));
                    if (a2.getInt(columnIndexOrThrow56) != 0) {
                        i3 = columnIndexOrThrow55;
                        z10 = true;
                    } else {
                        i3 = columnIndexOrThrow55;
                        z10 = false;
                    }
                    iVar.mo32068k(z10);
                    iVar.mo32056h(a2.getInt(columnIndexOrThrow57));
                    iVar.mo32002H(a2.getString(columnIndexOrThrow58));
                    iVar.mo32060i(a2.getInt(columnIndexOrThrow59));
                    if (a2.getInt(columnIndexOrThrow60) != 0) {
                        i4 = columnIndexOrThrow59;
                        z11 = true;
                    } else {
                        i4 = columnIndexOrThrow59;
                        z11 = false;
                    }
                    iVar.mo32078n(z11);
                    arrayList.add(iVar);
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow14;
                    i5 = i5;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    columnIndexOrThrow25 = columnIndexOrThrow25;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    columnIndexOrThrow31 = columnIndexOrThrow31;
                    columnIndexOrThrow32 = columnIndexOrThrow32;
                    columnIndexOrThrow33 = columnIndexOrThrow33;
                    columnIndexOrThrow37 = i2;
                    columnIndexOrThrow38 = columnIndexOrThrow38;
                    columnIndexOrThrow39 = columnIndexOrThrow39;
                    columnIndexOrThrow40 = columnIndexOrThrow40;
                    columnIndexOrThrow41 = columnIndexOrThrow41;
                    columnIndexOrThrow42 = columnIndexOrThrow42;
                    columnIndexOrThrow43 = columnIndexOrThrow43;
                    columnIndexOrThrow44 = columnIndexOrThrow44;
                    columnIndexOrThrow45 = columnIndexOrThrow45;
                    columnIndexOrThrow46 = columnIndexOrThrow46;
                    columnIndexOrThrow49 = columnIndexOrThrow49;
                    columnIndexOrThrow50 = columnIndexOrThrow50;
                    columnIndexOrThrow51 = columnIndexOrThrow51;
                    columnIndexOrThrow52 = columnIndexOrThrow52;
                    columnIndexOrThrow53 = columnIndexOrThrow53;
                    columnIndexOrThrow54 = columnIndexOrThrow54;
                    columnIndexOrThrow55 = i3;
                    columnIndexOrThrow56 = columnIndexOrThrow56;
                    columnIndexOrThrow57 = columnIndexOrThrow57;
                    columnIndexOrThrow58 = columnIndexOrThrow58;
                    columnIndexOrThrow59 = i4;
                    columnIndexOrThrow60 = columnIndexOrThrow60;
                    arrayList = arrayList;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public List<C8177d> mo31931a(int i, int i2, String str, int i3, boolean z, String str2) {
        C1439h hVar;
        Throwable th;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1439h a = C1439h.m6573a("SELECT * FROM FilterCache AS FC JOIN DocMetaInfo AS DMI ON FC.obj_token = DMI.obj_token WHERE FC.list_type =? AND FC.filter_type =? AND FC.file_type =? AND FC.strategy =? AND FC.is_asc =? AND FC.file_path =? ORDER BY FC.id", 6);
        a.bindLong(1, (long) i);
        a.bindLong(2, (long) i2);
        if (str == null) {
            a.bindNull(3);
        } else {
            a.bindString(3, str);
        }
        a.bindLong(4, (long) i3);
        a.bindLong(5, z ? 1 : 0);
        if (str2 == null) {
            a.bindNull(6);
        } else {
            a.bindString(6, str2);
        }
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("list_type");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("filter_type");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("file_type");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("strategy");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("is_asc");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("extra");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("space_id");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("add_time_manualoffline");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("is_need_wifi_download");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("open_time_recent");
            hVar = a;
            try {
                int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("my_edit_time_recent");
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("activity_time_recent");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("has_perm_folder");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("show_external_hint_folder");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("node_type_folder");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("shortcut_name_folder");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("id");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("obj_token");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("name");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("owner_id");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("create_tenant_id");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("creator_cn_name");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("creator_en_name");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("edit_uid");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("edit_time");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("url");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("fake_token");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("is_stared");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("is_pined");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("is_subscribed");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("extra_icon_url");
                int columnIndexOrThrow36 = a2.getColumnIndexOrThrow("extra_icon_key");
                int columnIndexOrThrow37 = a2.getColumnIndexOrThrow("extra_icon_nonce");
                int columnIndexOrThrow38 = a2.getColumnIndexOrThrow("extra_icon_encrypted_type");
                int columnIndexOrThrow39 = a2.getColumnIndexOrThrow("extra_copiable");
                int columnIndexOrThrow40 = a2.getColumnIndexOrThrow("extra_is_share_root");
                int columnIndexOrThrow41 = a2.getColumnIndexOrThrow("extra_is_external");
                int columnIndexOrThrow42 = a2.getColumnIndexOrThrow("extra_sub_type");
                int columnIndexOrThrow43 = a2.getColumnIndexOrThrow("is_visited");
                int columnIndexOrThrow44 = a2.getColumnIndexOrThrow("create_time");
                int columnIndexOrThrow45 = a2.getColumnIndexOrThrow("thumbnail_url");
                int columnIndexOrThrow46 = a2.getColumnIndexOrThrow("thumbnail_secret");
                int columnIndexOrThrow47 = a2.getColumnIndexOrThrow("thumbnail_nonce");
                int columnIndexOrThrow48 = a2.getColumnIndexOrThrow("thumbnail_type");
                int columnIndexOrThrow49 = a2.getColumnIndexOrThrow("permission");
                int columnIndexOrThrow50 = a2.getColumnIndexOrThrow("share_time");
                int columnIndexOrThrow51 = a2.getColumnIndexOrThrow("share_version");
                int columnIndexOrThrow52 = a2.getColumnIndexOrThrow("is_hidden");
                int columnIndexOrThrow53 = a2.getColumnIndexOrThrow("need_sync");
                int columnIndexOrThrow54 = a2.getColumnIndexOrThrow("size");
                int columnIndexOrThrow55 = a2.getColumnIndexOrThrow("thumbnail");
                int columnIndexOrThrow56 = a2.getColumnIndexOrThrow("document_icon_key");
                int columnIndexOrThrow57 = a2.getColumnIndexOrThrow("document_icon_type");
                int columnIndexOrThrow58 = a2.getColumnIndexOrThrow("document_icon_fsunit");
                int columnIndexOrThrow59 = a2.getColumnIndexOrThrow("app_id");
                int columnIndexOrThrow60 = a2.getColumnIndexOrThrow("doc_cache_status");
                int columnIndexOrThrow61 = a2.getColumnIndexOrThrow("is_offline_create");
                int columnIndexOrThrow62 = a2.getColumnIndexOrThrow("wiki_real_type");
                int columnIndexOrThrow63 = a2.getColumnIndexOrThrow("wiki_version");
                int columnIndexOrThrow64 = a2.getColumnIndexOrThrow("owner_type");
                int columnIndexOrThrow65 = a2.getColumnIndexOrThrow("is_share_folder");
                int i5 = columnIndexOrThrow20;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    C8177d dVar = new C8177d();
                    dVar.mo31863i(a2.getInt(columnIndexOrThrow));
                    dVar.mo31867j(a2.getInt(columnIndexOrThrow2));
                    dVar.mo31909z(a2.getString(columnIndexOrThrow3));
                    dVar.mo31870k(a2.getInt(columnIndexOrThrow4));
                    dVar.mo31872k(a2.getInt(columnIndexOrThrow5) != 0);
                    dVar.mo31829a(a2.getString(columnIndexOrThrow6));
                    dVar.mo31792A(a2.getString(columnIndexOrThrow7));
                    dVar.mo31794B(a2.getString(columnIndexOrThrow8));
                    dVar.mo31796C(a2.getString(columnIndexOrThrow9));
                    dVar.mo31798D(a2.getString(columnIndexOrThrow10));
                    dVar.mo31799E(a2.getString(columnIndexOrThrow11));
                    dVar.mo31876l(a2.getInt(columnIndexOrThrow12) != 0);
                    dVar.mo31802F(a2.getString(columnIndexOrThrow13));
                    dVar.mo31804G(a2.getString(columnIndexOrThrow14));
                    dVar.mo31806H(a2.getString(columnIndexOrThrow15));
                    if (a2.getInt(columnIndexOrThrow16) != 0) {
                        i4 = columnIndexOrThrow15;
                        z2 = true;
                    } else {
                        i4 = columnIndexOrThrow15;
                        z2 = false;
                    }
                    dVar.mo31880m(z2);
                    int i6 = a2.getInt(columnIndexOrThrow17);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    dVar.mo31884n(i6 != 0);
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    dVar.mo31874l(a2.getInt(columnIndexOrThrow18));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    dVar.mo31808I(a2.getString(columnIndexOrThrow19));
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    dVar.mo31878m(a2.getInt(i5));
                    i5 = i5;
                    dVar.mo31829a(a2.getString(columnIndexOrThrow21));
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    dVar.mo31836b(a2.getString(columnIndexOrThrow22));
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    dVar.mo31840c(a2.getString(columnIndexOrThrow23));
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    dVar.mo31844d(a2.getString(columnIndexOrThrow24));
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    dVar.mo31848e(a2.getString(columnIndexOrThrow25));
                    columnIndexOrThrow25 = columnIndexOrThrow25;
                    dVar.mo31852f(a2.getString(columnIndexOrThrow26));
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    dVar.mo31856g(a2.getString(columnIndexOrThrow27));
                    columnIndexOrThrow27 = columnIndexOrThrow27;
                    dVar.mo31860h(a2.getString(columnIndexOrThrow28));
                    columnIndexOrThrow28 = columnIndexOrThrow28;
                    dVar.mo31864i(a2.getString(columnIndexOrThrow29));
                    columnIndexOrThrow29 = columnIndexOrThrow29;
                    dVar.mo31868j(a2.getString(columnIndexOrThrow30));
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    dVar.mo31871k(a2.getString(columnIndexOrThrow31));
                    int i7 = a2.getInt(columnIndexOrThrow32);
                    columnIndexOrThrow32 = columnIndexOrThrow32;
                    dVar.mo31830a(i7 != 0);
                    int i8 = a2.getInt(columnIndexOrThrow33);
                    columnIndexOrThrow33 = columnIndexOrThrow33;
                    dVar.mo31837b(i8 != 0);
                    int i9 = a2.getInt(columnIndexOrThrow34);
                    columnIndexOrThrow34 = columnIndexOrThrow34;
                    dVar.mo31841c(i9 != 0);
                    columnIndexOrThrow31 = columnIndexOrThrow31;
                    dVar.mo31875l(a2.getString(columnIndexOrThrow35));
                    columnIndexOrThrow35 = columnIndexOrThrow35;
                    dVar.mo31879m(a2.getString(columnIndexOrThrow36));
                    columnIndexOrThrow36 = columnIndexOrThrow36;
                    dVar.mo31883n(a2.getString(columnIndexOrThrow37));
                    columnIndexOrThrow37 = columnIndexOrThrow37;
                    dVar.mo31828a(a2.getInt(columnIndexOrThrow38));
                    int i10 = a2.getInt(columnIndexOrThrow39);
                    columnIndexOrThrow39 = columnIndexOrThrow39;
                    dVar.mo31845d(i10 != 0);
                    int i11 = a2.getInt(columnIndexOrThrow40);
                    columnIndexOrThrow40 = columnIndexOrThrow40;
                    dVar.mo31849e(i11 != 0);
                    int i12 = a2.getInt(columnIndexOrThrow41);
                    columnIndexOrThrow41 = columnIndexOrThrow41;
                    dVar.mo31853f(i12 != 0);
                    columnIndexOrThrow38 = columnIndexOrThrow38;
                    dVar.mo31886o(a2.getString(columnIndexOrThrow42));
                    if (a2.getInt(columnIndexOrThrow43) != 0) {
                        columnIndexOrThrow42 = columnIndexOrThrow42;
                        z3 = true;
                    } else {
                        columnIndexOrThrow42 = columnIndexOrThrow42;
                        z3 = false;
                    }
                    dVar.mo31857g(z3);
                    columnIndexOrThrow43 = columnIndexOrThrow43;
                    dVar.mo31889p(a2.getString(columnIndexOrThrow44));
                    columnIndexOrThrow44 = columnIndexOrThrow44;
                    dVar.mo31891q(a2.getString(columnIndexOrThrow45));
                    columnIndexOrThrow45 = columnIndexOrThrow45;
                    dVar.mo31892r(a2.getString(columnIndexOrThrow46));
                    columnIndexOrThrow46 = columnIndexOrThrow46;
                    dVar.mo31894s(a2.getString(columnIndexOrThrow47));
                    columnIndexOrThrow47 = columnIndexOrThrow47;
                    dVar.mo31835b(a2.getInt(columnIndexOrThrow48));
                    columnIndexOrThrow48 = columnIndexOrThrow48;
                    dVar.mo31839c(a2.getInt(columnIndexOrThrow49));
                    columnIndexOrThrow49 = columnIndexOrThrow49;
                    dVar.mo31896t(a2.getString(columnIndexOrThrow50));
                    columnIndexOrThrow50 = columnIndexOrThrow50;
                    dVar.mo31843d(a2.getInt(columnIndexOrThrow51));
                    int i13 = a2.getInt(columnIndexOrThrow52);
                    columnIndexOrThrow52 = columnIndexOrThrow52;
                    dVar.mo31861h(i13 != 0);
                    int i14 = a2.getInt(columnIndexOrThrow53);
                    columnIndexOrThrow53 = columnIndexOrThrow53;
                    dVar.mo31865i(i14 != 0);
                    columnIndexOrThrow51 = columnIndexOrThrow51;
                    dVar.mo31899u(a2.getString(columnIndexOrThrow54));
                    columnIndexOrThrow54 = columnIndexOrThrow54;
                    dVar.mo31900v(a2.getString(columnIndexOrThrow55));
                    columnIndexOrThrow55 = columnIndexOrThrow55;
                    dVar.mo31903w(a2.getString(columnIndexOrThrow56));
                    columnIndexOrThrow56 = columnIndexOrThrow56;
                    dVar.mo31847e(a2.getInt(columnIndexOrThrow57));
                    columnIndexOrThrow57 = columnIndexOrThrow57;
                    dVar.mo31905x(a2.getString(columnIndexOrThrow58));
                    columnIndexOrThrow58 = columnIndexOrThrow58;
                    dVar.mo31907y(a2.getString(columnIndexOrThrow59));
                    columnIndexOrThrow59 = columnIndexOrThrow59;
                    dVar.mo31851f(a2.getInt(columnIndexOrThrow60));
                    if (a2.getInt(columnIndexOrThrow61) != 0) {
                        columnIndexOrThrow60 = columnIndexOrThrow60;
                        z4 = true;
                    } else {
                        columnIndexOrThrow60 = columnIndexOrThrow60;
                        z4 = false;
                    }
                    dVar.mo31869j(z4);
                    columnIndexOrThrow61 = columnIndexOrThrow61;
                    dVar.mo31855g(a2.getInt(columnIndexOrThrow62));
                    columnIndexOrThrow62 = columnIndexOrThrow62;
                    dVar.mo31810J(a2.getString(columnIndexOrThrow63));
                    columnIndexOrThrow63 = columnIndexOrThrow63;
                    dVar.mo31859h(a2.getInt(columnIndexOrThrow64));
                    if (a2.getInt(columnIndexOrThrow65) != 0) {
                        columnIndexOrThrow64 = columnIndexOrThrow64;
                        z5 = true;
                    } else {
                        columnIndexOrThrow64 = columnIndexOrThrow64;
                        z5 = false;
                    }
                    dVar.mo31887o(z5);
                    arrayList.add(dVar);
                    columnIndexOrThrow65 = columnIndexOrThrow65;
                    columnIndexOrThrow13 = columnIndexOrThrow13;
                    columnIndexOrThrow15 = i4;
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow14;
                    arrayList = arrayList;
                }
                a2.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public C8175b mo31929a(String str) {
        C1439h hVar;
        Throwable th;
        C8175b bVar;
        C1439h a = C1439h.m6573a("SELECT * FROM DocMetaInfo WHERE obj_token =?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("name");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("owner_id");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("create_tenant_id");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("creator_cn_name");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("creator_en_name");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("edit_uid");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("edit_time");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("url");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("fake_token");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("is_stared");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("is_pined");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("is_subscribed");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("extra_icon_url");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("extra_icon_key");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("extra_icon_nonce");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("extra_icon_encrypted_type");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("extra_copiable");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("extra_is_share_root");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("extra_is_external");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("extra_sub_type");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("is_visited");
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("create_time");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("thumbnail_url");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("thumbnail_secret");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("thumbnail_nonce");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("thumbnail_type");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("permission");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("share_time");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("share_version");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("is_hidden");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("need_sync");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("size");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("thumbnail");
                int columnIndexOrThrow36 = a2.getColumnIndexOrThrow("document_icon_key");
                int columnIndexOrThrow37 = a2.getColumnIndexOrThrow("document_icon_type");
                int columnIndexOrThrow38 = a2.getColumnIndexOrThrow("document_icon_fsunit");
                int columnIndexOrThrow39 = a2.getColumnIndexOrThrow("app_id");
                int columnIndexOrThrow40 = a2.getColumnIndexOrThrow("doc_cache_status");
                int columnIndexOrThrow41 = a2.getColumnIndexOrThrow("is_offline_create");
                int columnIndexOrThrow42 = a2.getColumnIndexOrThrow("wiki_real_type");
                int columnIndexOrThrow43 = a2.getColumnIndexOrThrow("wiki_version");
                int columnIndexOrThrow44 = a2.getColumnIndexOrThrow("owner_type");
                int columnIndexOrThrow45 = a2.getColumnIndexOrThrow("is_share_folder");
                if (a2.moveToFirst()) {
                    bVar = new C8175b();
                    bVar.mo31679a(a2.getString(columnIndexOrThrow));
                    bVar.mo31683b(a2.getString(columnIndexOrThrow2));
                    bVar.mo31687c(a2.getString(columnIndexOrThrow3));
                    bVar.mo31691d(a2.getString(columnIndexOrThrow4));
                    bVar.mo31695e(a2.getString(columnIndexOrThrow5));
                    bVar.mo31699f(a2.getString(columnIndexOrThrow6));
                    bVar.mo31703g(a2.getString(columnIndexOrThrow7));
                    bVar.mo31707h(a2.getString(columnIndexOrThrow8));
                    bVar.mo31710i(a2.getString(columnIndexOrThrow9));
                    bVar.mo31713j(a2.getString(columnIndexOrThrow10));
                    bVar.mo31716k(a2.getString(columnIndexOrThrow11));
                    bVar.mo31684b(a2.getInt(columnIndexOrThrow12) != 0);
                    bVar.mo31688c(a2.getInt(columnIndexOrThrow13) != 0);
                    bVar.mo31692d(a2.getInt(columnIndexOrThrow14) != 0);
                    bVar.mo31721m(a2.getString(columnIndexOrThrow15));
                    bVar.mo31723n(a2.getString(columnIndexOrThrow16));
                    bVar.mo31725o(a2.getString(columnIndexOrThrow17));
                    bVar.mo31678a(a2.getInt(columnIndexOrThrow18));
                    bVar.mo31696e(a2.getInt(columnIndexOrThrow19) != 0);
                    bVar.mo31700f(a2.getInt(columnIndexOrThrow20) != 0);
                    bVar.mo31680a(a2.getInt(columnIndexOrThrow21) != 0);
                    bVar.mo31718l(a2.getString(columnIndexOrThrow22));
                    bVar.mo31704g(a2.getInt(columnIndexOrThrow23) != 0);
                    bVar.mo31728p(a2.getString(columnIndexOrThrow24));
                    bVar.mo31730q(a2.getString(columnIndexOrThrow25));
                    bVar.mo31732r(a2.getString(columnIndexOrThrow26));
                    bVar.mo31734s(a2.getString(columnIndexOrThrow27));
                    bVar.mo31686c(a2.getInt(columnIndexOrThrow28));
                    bVar.mo31690d(a2.getInt(columnIndexOrThrow29));
                    bVar.mo31736t(a2.getString(columnIndexOrThrow30));
                    bVar.mo31694e(a2.getInt(columnIndexOrThrow31));
                    bVar.mo31708h(a2.getInt(columnIndexOrThrow32) != 0);
                    bVar.mo31711i(a2.getInt(columnIndexOrThrow33) != 0);
                    bVar.mo31739u(a2.getString(columnIndexOrThrow34));
                    bVar.mo31745x(a2.getString(columnIndexOrThrow35));
                    bVar.mo31741v(a2.getString(columnIndexOrThrow36));
                    bVar.mo31698f(a2.getInt(columnIndexOrThrow37));
                    bVar.mo31742w(a2.getString(columnIndexOrThrow38));
                    bVar.mo31747y(a2.getString(columnIndexOrThrow39));
                    bVar.mo31682b(a2.getInt(columnIndexOrThrow40));
                    bVar.mo31714j(a2.getInt(columnIndexOrThrow41) != 0);
                    bVar.mo31702g(a2.getInt(columnIndexOrThrow42));
                    bVar.mo31749z(a2.getString(columnIndexOrThrow43));
                    bVar.mo31706h(a2.getInt(columnIndexOrThrow44));
                    bVar.mo31717k(a2.getInt(columnIndexOrThrow45) != 0);
                } else {
                    bVar = null;
                }
                a2.close();
                hVar.mo7613a();
                return bVar;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a;
            a2.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public List<String> mo31934a(long j) {
        C1439h a = C1439h.m6573a("SELECT LT.obj_token FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.list_type = 1 AND LT.open_time_recent > ?", 1);
        a.bindLong(1, j);
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public LiveData<List<C8200i>> mo31948b(int i, String str, String str2) {
        final C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.list_type = ? AND LT.file_path= ? and DMI.type = ?", 3);
        a.bindLong(1, (long) i);
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        if (str2 == null) {
            a.bindNull(3);
        } else {
            a.bindString(3, str2);
        }
        return new AbstractC1154e<List<C8200i>>(this.f21940a.mo7548i()) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass31 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f21995i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<C8200i> mo6021c() {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                int i2;
                boolean z10;
                boolean z11;
                boolean z12;
                int i3;
                boolean z13;
                int i4;
                boolean z14;
                if (this.f21995i == null) {
                    this.f21995i = new C1429d.AbstractC1432b("ListTypes", "DocMetaInfo") {
                        /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass31.C81891 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            AnonymousClass31.this.mo6020b();
                        }
                    };
                    C8184h.this.f21940a.mo7550k().mo7598b(this.f21995i);
                }
                Cursor a = C8184h.this.f21940a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("list_type");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("token");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("extra");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("space_id");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("file_path");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("add_time_manualoffline");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("is_need_wifi_download");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("open_time_recent");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("my_edit_time_recent");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("activity_time_recent");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("has_perm_folder");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("show_external_hint_folder");
                    int columnIndexOrThrow14 = a.getColumnIndexOrThrow("node_type_folder");
                    int columnIndexOrThrow15 = a.getColumnIndexOrThrow("shortcut_name_folder");
                    int columnIndexOrThrow16 = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow17 = a.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow18 = a.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                    int columnIndexOrThrow19 = a.getColumnIndexOrThrow("owner_id");
                    int columnIndexOrThrow20 = a.getColumnIndexOrThrow("create_tenant_id");
                    int columnIndexOrThrow21 = a.getColumnIndexOrThrow("creator_cn_name");
                    int columnIndexOrThrow22 = a.getColumnIndexOrThrow("creator_en_name");
                    int columnIndexOrThrow23 = a.getColumnIndexOrThrow("edit_uid");
                    int columnIndexOrThrow24 = a.getColumnIndexOrThrow("edit_time");
                    int columnIndexOrThrow25 = a.getColumnIndexOrThrow("url");
                    int columnIndexOrThrow26 = a.getColumnIndexOrThrow("fake_token");
                    int columnIndexOrThrow27 = a.getColumnIndexOrThrow("is_stared");
                    int columnIndexOrThrow28 = a.getColumnIndexOrThrow("is_pined");
                    int columnIndexOrThrow29 = a.getColumnIndexOrThrow("is_subscribed");
                    int columnIndexOrThrow30 = a.getColumnIndexOrThrow("extra_icon_url");
                    int columnIndexOrThrow31 = a.getColumnIndexOrThrow("extra_icon_key");
                    int columnIndexOrThrow32 = a.getColumnIndexOrThrow("extra_icon_nonce");
                    int columnIndexOrThrow33 = a.getColumnIndexOrThrow("extra_icon_encrypted_type");
                    int columnIndexOrThrow34 = a.getColumnIndexOrThrow("extra_copiable");
                    int columnIndexOrThrow35 = a.getColumnIndexOrThrow("extra_is_share_root");
                    int columnIndexOrThrow36 = a.getColumnIndexOrThrow("extra_is_external");
                    int columnIndexOrThrow37 = a.getColumnIndexOrThrow("extra_sub_type");
                    int columnIndexOrThrow38 = a.getColumnIndexOrThrow("is_visited");
                    int columnIndexOrThrow39 = a.getColumnIndexOrThrow("create_time");
                    int columnIndexOrThrow40 = a.getColumnIndexOrThrow("thumbnail_url");
                    int columnIndexOrThrow41 = a.getColumnIndexOrThrow("thumbnail_secret");
                    int columnIndexOrThrow42 = a.getColumnIndexOrThrow("thumbnail_nonce");
                    int columnIndexOrThrow43 = a.getColumnIndexOrThrow("thumbnail_type");
                    int columnIndexOrThrow44 = a.getColumnIndexOrThrow("permission");
                    int columnIndexOrThrow45 = a.getColumnIndexOrThrow("share_time");
                    int columnIndexOrThrow46 = a.getColumnIndexOrThrow("share_version");
                    int columnIndexOrThrow47 = a.getColumnIndexOrThrow("is_hidden");
                    int columnIndexOrThrow48 = a.getColumnIndexOrThrow("need_sync");
                    int columnIndexOrThrow49 = a.getColumnIndexOrThrow("size");
                    int columnIndexOrThrow50 = a.getColumnIndexOrThrow("thumbnail");
                    int columnIndexOrThrow51 = a.getColumnIndexOrThrow("document_icon_key");
                    int columnIndexOrThrow52 = a.getColumnIndexOrThrow("document_icon_type");
                    int columnIndexOrThrow53 = a.getColumnIndexOrThrow("document_icon_fsunit");
                    int columnIndexOrThrow54 = a.getColumnIndexOrThrow("app_id");
                    int columnIndexOrThrow55 = a.getColumnIndexOrThrow("doc_cache_status");
                    int columnIndexOrThrow56 = a.getColumnIndexOrThrow("is_offline_create");
                    int columnIndexOrThrow57 = a.getColumnIndexOrThrow("wiki_real_type");
                    int columnIndexOrThrow58 = a.getColumnIndexOrThrow("wiki_version");
                    int columnIndexOrThrow59 = a.getColumnIndexOrThrow("owner_type");
                    int columnIndexOrThrow60 = a.getColumnIndexOrThrow("is_share_folder");
                    int i5 = columnIndexOrThrow15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        C8200i iVar = new C8200i();
                        iVar.mo32025a(a.getString(columnIndexOrThrow));
                        iVar.mo32044e(a.getInt(columnIndexOrThrow2));
                        iVar.mo32100y(a.getString(columnIndexOrThrow3));
                        iVar.mo32102z(a.getString(columnIndexOrThrow4));
                        iVar.mo31989A(a.getString(columnIndexOrThrow5));
                        iVar.mo31991B(a.getString(columnIndexOrThrow6));
                        iVar.mo31993C(a.getString(columnIndexOrThrow7));
                        if (a.getInt(columnIndexOrThrow8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iVar.mo32066j(z);
                        iVar.mo32070l(a.getString(columnIndexOrThrow9));
                        iVar.mo32086r(a.getString(columnIndexOrThrow10));
                        iVar.mo32087s(a.getString(columnIndexOrThrow11));
                        if (a.getInt(columnIndexOrThrow12) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        iVar.mo32071l(z2);
                        if (a.getInt(columnIndexOrThrow13) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iVar.mo32074m(z3);
                        iVar.mo32064j(a.getInt(columnIndexOrThrow14));
                        iVar.mo32005I(a.getString(i5));
                        iVar.mo32025a(a.getString(columnIndexOrThrow16));
                        iVar.mo32033b(a.getString(columnIndexOrThrow17));
                        iVar.mo32037c(a.getString(columnIndexOrThrow18));
                        iVar.mo32041d(a.getString(columnIndexOrThrow19));
                        iVar.mo32045e(a.getString(columnIndexOrThrow20));
                        iVar.mo32049f(a.getString(columnIndexOrThrow21));
                        iVar.mo32053g(a.getString(columnIndexOrThrow22));
                        iVar.mo32057h(a.getString(columnIndexOrThrow23));
                        iVar.mo32061i(a.getString(columnIndexOrThrow24));
                        iVar.mo32065j(a.getString(columnIndexOrThrow25));
                        iVar.mo32067k(a.getString(columnIndexOrThrow26));
                        if (a.getInt(columnIndexOrThrow27) != 0) {
                            i = columnIndexOrThrow26;
                            z4 = true;
                        } else {
                            i = columnIndexOrThrow26;
                            z4 = false;
                        }
                        iVar.mo32026a(z4);
                        if (a.getInt(columnIndexOrThrow28) != 0) {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = true;
                        } else {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = false;
                        }
                        iVar.mo32034b(z5);
                        if (a.getInt(columnIndexOrThrow29) != 0) {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = true;
                        } else {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = false;
                        }
                        iVar.mo32038c(z6);
                        iVar.mo32073m(a.getString(columnIndexOrThrow30));
                        iVar.mo32077n(a.getString(columnIndexOrThrow31));
                        iVar.mo32080o(a.getString(columnIndexOrThrow32));
                        iVar.mo32024a(a.getInt(columnIndexOrThrow33));
                        if (a.getInt(columnIndexOrThrow34) != 0) {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = true;
                        } else {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = false;
                        }
                        iVar.mo32042d(z7);
                        if (a.getInt(columnIndexOrThrow35) != 0) {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = true;
                        } else {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = false;
                        }
                        iVar.mo32046e(z8);
                        if (a.getInt(columnIndexOrThrow36) != 0) {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = true;
                        } else {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = false;
                        }
                        iVar.mo32050f(z9);
                        iVar.mo32082p(a.getString(columnIndexOrThrow37));
                        if (a.getInt(columnIndexOrThrow38) != 0) {
                            i2 = columnIndexOrThrow37;
                            z10 = true;
                        } else {
                            i2 = columnIndexOrThrow37;
                            z10 = false;
                        }
                        iVar.mo32054g(z10);
                        iVar.mo32084q(a.getString(columnIndexOrThrow39));
                        iVar.mo32089t(a.getString(columnIndexOrThrow40));
                        iVar.mo32091u(a.getString(columnIndexOrThrow41));
                        iVar.mo32094v(a.getString(columnIndexOrThrow42));
                        iVar.mo32032b(a.getInt(columnIndexOrThrow43));
                        iVar.mo32036c(a.getInt(columnIndexOrThrow44));
                        iVar.mo32095w(a.getString(columnIndexOrThrow45));
                        iVar.mo32040d(a.getInt(columnIndexOrThrow46));
                        if (a.getInt(columnIndexOrThrow47) != 0) {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = true;
                        } else {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = false;
                        }
                        iVar.mo32058h(z11);
                        if (a.getInt(columnIndexOrThrow48) != 0) {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = true;
                        } else {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = false;
                        }
                        iVar.mo32062i(z12);
                        iVar.mo32098x(a.getString(columnIndexOrThrow49));
                        iVar.mo31999F(a.getString(columnIndexOrThrow50));
                        iVar.mo31995D(a.getString(columnIndexOrThrow51));
                        iVar.mo32048f(a.getInt(columnIndexOrThrow52));
                        iVar.mo31997E(a.getString(columnIndexOrThrow53));
                        iVar.mo32001G(a.getString(columnIndexOrThrow54));
                        iVar.mo32052g(a.getInt(columnIndexOrThrow55));
                        if (a.getInt(columnIndexOrThrow56) != 0) {
                            i3 = columnIndexOrThrow55;
                            z13 = true;
                        } else {
                            i3 = columnIndexOrThrow55;
                            z13 = false;
                        }
                        iVar.mo32068k(z13);
                        iVar.mo32056h(a.getInt(columnIndexOrThrow57));
                        iVar.mo32002H(a.getString(columnIndexOrThrow58));
                        iVar.mo32060i(a.getInt(columnIndexOrThrow59));
                        if (a.getInt(columnIndexOrThrow60) != 0) {
                            i4 = columnIndexOrThrow59;
                            z14 = true;
                        } else {
                            i4 = columnIndexOrThrow59;
                            z14 = false;
                        }
                        iVar.mo32078n(z14);
                        arrayList = arrayList;
                        arrayList.add(iVar);
                        columnIndexOrThrow60 = columnIndexOrThrow60;
                        columnIndexOrThrow = columnIndexOrThrow;
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                        i5 = i5;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow17 = columnIndexOrThrow17;
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        columnIndexOrThrow19 = columnIndexOrThrow19;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow23 = columnIndexOrThrow23;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        columnIndexOrThrow26 = i;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow30 = columnIndexOrThrow30;
                        columnIndexOrThrow31 = columnIndexOrThrow31;
                        columnIndexOrThrow32 = columnIndexOrThrow32;
                        columnIndexOrThrow33 = columnIndexOrThrow33;
                        columnIndexOrThrow37 = i2;
                        columnIndexOrThrow38 = columnIndexOrThrow38;
                        columnIndexOrThrow39 = columnIndexOrThrow39;
                        columnIndexOrThrow40 = columnIndexOrThrow40;
                        columnIndexOrThrow41 = columnIndexOrThrow41;
                        columnIndexOrThrow42 = columnIndexOrThrow42;
                        columnIndexOrThrow43 = columnIndexOrThrow43;
                        columnIndexOrThrow44 = columnIndexOrThrow44;
                        columnIndexOrThrow45 = columnIndexOrThrow45;
                        columnIndexOrThrow46 = columnIndexOrThrow46;
                        columnIndexOrThrow49 = columnIndexOrThrow49;
                        columnIndexOrThrow50 = columnIndexOrThrow50;
                        columnIndexOrThrow51 = columnIndexOrThrow51;
                        columnIndexOrThrow52 = columnIndexOrThrow52;
                        columnIndexOrThrow53 = columnIndexOrThrow53;
                        columnIndexOrThrow54 = columnIndexOrThrow54;
                        columnIndexOrThrow55 = i3;
                        columnIndexOrThrow56 = columnIndexOrThrow56;
                        columnIndexOrThrow57 = columnIndexOrThrow57;
                        columnIndexOrThrow58 = columnIndexOrThrow58;
                        columnIndexOrThrow59 = i4;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public LiveData<List<C8200i>> mo31928a(int i, int i2, boolean z) {
        final C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.list_type = ? AND DMI.type = ? AND DMI.is_hidden =?", 3);
        a.bindLong(1, (long) i);
        a.bindLong(2, (long) i2);
        a.bindLong(3, z ? 1 : 0);
        return new AbstractC1154e<List<C8200i>>(this.f21940a.mo7548i()) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass33 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f22003i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<C8200i> mo6021c() {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                int i2;
                boolean z10;
                boolean z11;
                boolean z12;
                int i3;
                boolean z13;
                int i4;
                boolean z14;
                if (this.f22003i == null) {
                    this.f22003i = new C1429d.AbstractC1432b("ListTypes", "DocMetaInfo") {
                        /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass33.C81911 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            AnonymousClass33.this.mo6020b();
                        }
                    };
                    C8184h.this.f21940a.mo7550k().mo7598b(this.f22003i);
                }
                Cursor a = C8184h.this.f21940a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("list_type");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("token");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("extra");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("space_id");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("file_path");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("add_time_manualoffline");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("is_need_wifi_download");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("open_time_recent");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("my_edit_time_recent");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("activity_time_recent");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("has_perm_folder");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("show_external_hint_folder");
                    int columnIndexOrThrow14 = a.getColumnIndexOrThrow("node_type_folder");
                    int columnIndexOrThrow15 = a.getColumnIndexOrThrow("shortcut_name_folder");
                    int columnIndexOrThrow16 = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow17 = a.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow18 = a.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                    int columnIndexOrThrow19 = a.getColumnIndexOrThrow("owner_id");
                    int columnIndexOrThrow20 = a.getColumnIndexOrThrow("create_tenant_id");
                    int columnIndexOrThrow21 = a.getColumnIndexOrThrow("creator_cn_name");
                    int columnIndexOrThrow22 = a.getColumnIndexOrThrow("creator_en_name");
                    int columnIndexOrThrow23 = a.getColumnIndexOrThrow("edit_uid");
                    int columnIndexOrThrow24 = a.getColumnIndexOrThrow("edit_time");
                    int columnIndexOrThrow25 = a.getColumnIndexOrThrow("url");
                    int columnIndexOrThrow26 = a.getColumnIndexOrThrow("fake_token");
                    int columnIndexOrThrow27 = a.getColumnIndexOrThrow("is_stared");
                    int columnIndexOrThrow28 = a.getColumnIndexOrThrow("is_pined");
                    int columnIndexOrThrow29 = a.getColumnIndexOrThrow("is_subscribed");
                    int columnIndexOrThrow30 = a.getColumnIndexOrThrow("extra_icon_url");
                    int columnIndexOrThrow31 = a.getColumnIndexOrThrow("extra_icon_key");
                    int columnIndexOrThrow32 = a.getColumnIndexOrThrow("extra_icon_nonce");
                    int columnIndexOrThrow33 = a.getColumnIndexOrThrow("extra_icon_encrypted_type");
                    int columnIndexOrThrow34 = a.getColumnIndexOrThrow("extra_copiable");
                    int columnIndexOrThrow35 = a.getColumnIndexOrThrow("extra_is_share_root");
                    int columnIndexOrThrow36 = a.getColumnIndexOrThrow("extra_is_external");
                    int columnIndexOrThrow37 = a.getColumnIndexOrThrow("extra_sub_type");
                    int columnIndexOrThrow38 = a.getColumnIndexOrThrow("is_visited");
                    int columnIndexOrThrow39 = a.getColumnIndexOrThrow("create_time");
                    int columnIndexOrThrow40 = a.getColumnIndexOrThrow("thumbnail_url");
                    int columnIndexOrThrow41 = a.getColumnIndexOrThrow("thumbnail_secret");
                    int columnIndexOrThrow42 = a.getColumnIndexOrThrow("thumbnail_nonce");
                    int columnIndexOrThrow43 = a.getColumnIndexOrThrow("thumbnail_type");
                    int columnIndexOrThrow44 = a.getColumnIndexOrThrow("permission");
                    int columnIndexOrThrow45 = a.getColumnIndexOrThrow("share_time");
                    int columnIndexOrThrow46 = a.getColumnIndexOrThrow("share_version");
                    int columnIndexOrThrow47 = a.getColumnIndexOrThrow("is_hidden");
                    int columnIndexOrThrow48 = a.getColumnIndexOrThrow("need_sync");
                    int columnIndexOrThrow49 = a.getColumnIndexOrThrow("size");
                    int columnIndexOrThrow50 = a.getColumnIndexOrThrow("thumbnail");
                    int columnIndexOrThrow51 = a.getColumnIndexOrThrow("document_icon_key");
                    int columnIndexOrThrow52 = a.getColumnIndexOrThrow("document_icon_type");
                    int columnIndexOrThrow53 = a.getColumnIndexOrThrow("document_icon_fsunit");
                    int columnIndexOrThrow54 = a.getColumnIndexOrThrow("app_id");
                    int columnIndexOrThrow55 = a.getColumnIndexOrThrow("doc_cache_status");
                    int columnIndexOrThrow56 = a.getColumnIndexOrThrow("is_offline_create");
                    int columnIndexOrThrow57 = a.getColumnIndexOrThrow("wiki_real_type");
                    int columnIndexOrThrow58 = a.getColumnIndexOrThrow("wiki_version");
                    int columnIndexOrThrow59 = a.getColumnIndexOrThrow("owner_type");
                    int columnIndexOrThrow60 = a.getColumnIndexOrThrow("is_share_folder");
                    int i5 = columnIndexOrThrow15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        C8200i iVar = new C8200i();
                        iVar.mo32025a(a.getString(columnIndexOrThrow));
                        iVar.mo32044e(a.getInt(columnIndexOrThrow2));
                        iVar.mo32100y(a.getString(columnIndexOrThrow3));
                        iVar.mo32102z(a.getString(columnIndexOrThrow4));
                        iVar.mo31989A(a.getString(columnIndexOrThrow5));
                        iVar.mo31991B(a.getString(columnIndexOrThrow6));
                        iVar.mo31993C(a.getString(columnIndexOrThrow7));
                        if (a.getInt(columnIndexOrThrow8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iVar.mo32066j(z);
                        iVar.mo32070l(a.getString(columnIndexOrThrow9));
                        iVar.mo32086r(a.getString(columnIndexOrThrow10));
                        iVar.mo32087s(a.getString(columnIndexOrThrow11));
                        if (a.getInt(columnIndexOrThrow12) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        iVar.mo32071l(z2);
                        if (a.getInt(columnIndexOrThrow13) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iVar.mo32074m(z3);
                        iVar.mo32064j(a.getInt(columnIndexOrThrow14));
                        iVar.mo32005I(a.getString(i5));
                        iVar.mo32025a(a.getString(columnIndexOrThrow16));
                        iVar.mo32033b(a.getString(columnIndexOrThrow17));
                        iVar.mo32037c(a.getString(columnIndexOrThrow18));
                        iVar.mo32041d(a.getString(columnIndexOrThrow19));
                        iVar.mo32045e(a.getString(columnIndexOrThrow20));
                        iVar.mo32049f(a.getString(columnIndexOrThrow21));
                        iVar.mo32053g(a.getString(columnIndexOrThrow22));
                        iVar.mo32057h(a.getString(columnIndexOrThrow23));
                        iVar.mo32061i(a.getString(columnIndexOrThrow24));
                        iVar.mo32065j(a.getString(columnIndexOrThrow25));
                        iVar.mo32067k(a.getString(columnIndexOrThrow26));
                        if (a.getInt(columnIndexOrThrow27) != 0) {
                            i = columnIndexOrThrow26;
                            z4 = true;
                        } else {
                            i = columnIndexOrThrow26;
                            z4 = false;
                        }
                        iVar.mo32026a(z4);
                        if (a.getInt(columnIndexOrThrow28) != 0) {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = true;
                        } else {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = false;
                        }
                        iVar.mo32034b(z5);
                        if (a.getInt(columnIndexOrThrow29) != 0) {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = true;
                        } else {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = false;
                        }
                        iVar.mo32038c(z6);
                        iVar.mo32073m(a.getString(columnIndexOrThrow30));
                        iVar.mo32077n(a.getString(columnIndexOrThrow31));
                        iVar.mo32080o(a.getString(columnIndexOrThrow32));
                        iVar.mo32024a(a.getInt(columnIndexOrThrow33));
                        if (a.getInt(columnIndexOrThrow34) != 0) {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = true;
                        } else {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = false;
                        }
                        iVar.mo32042d(z7);
                        if (a.getInt(columnIndexOrThrow35) != 0) {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = true;
                        } else {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = false;
                        }
                        iVar.mo32046e(z8);
                        if (a.getInt(columnIndexOrThrow36) != 0) {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = true;
                        } else {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = false;
                        }
                        iVar.mo32050f(z9);
                        iVar.mo32082p(a.getString(columnIndexOrThrow37));
                        if (a.getInt(columnIndexOrThrow38) != 0) {
                            i2 = columnIndexOrThrow37;
                            z10 = true;
                        } else {
                            i2 = columnIndexOrThrow37;
                            z10 = false;
                        }
                        iVar.mo32054g(z10);
                        iVar.mo32084q(a.getString(columnIndexOrThrow39));
                        iVar.mo32089t(a.getString(columnIndexOrThrow40));
                        iVar.mo32091u(a.getString(columnIndexOrThrow41));
                        iVar.mo32094v(a.getString(columnIndexOrThrow42));
                        iVar.mo32032b(a.getInt(columnIndexOrThrow43));
                        iVar.mo32036c(a.getInt(columnIndexOrThrow44));
                        iVar.mo32095w(a.getString(columnIndexOrThrow45));
                        iVar.mo32040d(a.getInt(columnIndexOrThrow46));
                        if (a.getInt(columnIndexOrThrow47) != 0) {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = true;
                        } else {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = false;
                        }
                        iVar.mo32058h(z11);
                        if (a.getInt(columnIndexOrThrow48) != 0) {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = true;
                        } else {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = false;
                        }
                        iVar.mo32062i(z12);
                        iVar.mo32098x(a.getString(columnIndexOrThrow49));
                        iVar.mo31999F(a.getString(columnIndexOrThrow50));
                        iVar.mo31995D(a.getString(columnIndexOrThrow51));
                        iVar.mo32048f(a.getInt(columnIndexOrThrow52));
                        iVar.mo31997E(a.getString(columnIndexOrThrow53));
                        iVar.mo32001G(a.getString(columnIndexOrThrow54));
                        iVar.mo32052g(a.getInt(columnIndexOrThrow55));
                        if (a.getInt(columnIndexOrThrow56) != 0) {
                            i3 = columnIndexOrThrow55;
                            z13 = true;
                        } else {
                            i3 = columnIndexOrThrow55;
                            z13 = false;
                        }
                        iVar.mo32068k(z13);
                        iVar.mo32056h(a.getInt(columnIndexOrThrow57));
                        iVar.mo32002H(a.getString(columnIndexOrThrow58));
                        iVar.mo32060i(a.getInt(columnIndexOrThrow59));
                        if (a.getInt(columnIndexOrThrow60) != 0) {
                            i4 = columnIndexOrThrow59;
                            z14 = true;
                        } else {
                            i4 = columnIndexOrThrow59;
                            z14 = false;
                        }
                        iVar.mo32078n(z14);
                        arrayList = arrayList;
                        arrayList.add(iVar);
                        columnIndexOrThrow60 = columnIndexOrThrow60;
                        columnIndexOrThrow = columnIndexOrThrow;
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                        i5 = i5;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow17 = columnIndexOrThrow17;
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        columnIndexOrThrow19 = columnIndexOrThrow19;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow23 = columnIndexOrThrow23;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        columnIndexOrThrow26 = i;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow30 = columnIndexOrThrow30;
                        columnIndexOrThrow31 = columnIndexOrThrow31;
                        columnIndexOrThrow32 = columnIndexOrThrow32;
                        columnIndexOrThrow33 = columnIndexOrThrow33;
                        columnIndexOrThrow37 = i2;
                        columnIndexOrThrow38 = columnIndexOrThrow38;
                        columnIndexOrThrow39 = columnIndexOrThrow39;
                        columnIndexOrThrow40 = columnIndexOrThrow40;
                        columnIndexOrThrow41 = columnIndexOrThrow41;
                        columnIndexOrThrow42 = columnIndexOrThrow42;
                        columnIndexOrThrow43 = columnIndexOrThrow43;
                        columnIndexOrThrow44 = columnIndexOrThrow44;
                        columnIndexOrThrow45 = columnIndexOrThrow45;
                        columnIndexOrThrow46 = columnIndexOrThrow46;
                        columnIndexOrThrow49 = columnIndexOrThrow49;
                        columnIndexOrThrow50 = columnIndexOrThrow50;
                        columnIndexOrThrow51 = columnIndexOrThrow51;
                        columnIndexOrThrow52 = columnIndexOrThrow52;
                        columnIndexOrThrow53 = columnIndexOrThrow53;
                        columnIndexOrThrow54 = columnIndexOrThrow54;
                        columnIndexOrThrow55 = i3;
                        columnIndexOrThrow56 = columnIndexOrThrow56;
                        columnIndexOrThrow57 = columnIndexOrThrow57;
                        columnIndexOrThrow58 = columnIndexOrThrow58;
                        columnIndexOrThrow59 = i4;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public LiveData<List<C8200i>> mo31927a(int i, int i2) {
        final C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.list_type = ? AND DMI.type = ?", 2);
        a.bindLong(1, (long) i);
        a.bindLong(2, (long) i2);
        return new AbstractC1154e<List<C8200i>>(this.f21940a.mo7548i()) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass35 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f22008i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<C8200i> mo6021c() {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                int i2;
                boolean z10;
                boolean z11;
                boolean z12;
                int i3;
                boolean z13;
                int i4;
                boolean z14;
                if (this.f22008i == null) {
                    this.f22008i = new C1429d.AbstractC1432b("ListTypes", "DocMetaInfo") {
                        /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass35.C81921 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            AnonymousClass35.this.mo6020b();
                        }
                    };
                    C8184h.this.f21940a.mo7550k().mo7598b(this.f22008i);
                }
                Cursor a = C8184h.this.f21940a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("list_type");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("token");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("extra");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("space_id");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("file_path");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("add_time_manualoffline");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("is_need_wifi_download");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("open_time_recent");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("my_edit_time_recent");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("activity_time_recent");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("has_perm_folder");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("show_external_hint_folder");
                    int columnIndexOrThrow14 = a.getColumnIndexOrThrow("node_type_folder");
                    int columnIndexOrThrow15 = a.getColumnIndexOrThrow("shortcut_name_folder");
                    int columnIndexOrThrow16 = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow17 = a.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow18 = a.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                    int columnIndexOrThrow19 = a.getColumnIndexOrThrow("owner_id");
                    int columnIndexOrThrow20 = a.getColumnIndexOrThrow("create_tenant_id");
                    int columnIndexOrThrow21 = a.getColumnIndexOrThrow("creator_cn_name");
                    int columnIndexOrThrow22 = a.getColumnIndexOrThrow("creator_en_name");
                    int columnIndexOrThrow23 = a.getColumnIndexOrThrow("edit_uid");
                    int columnIndexOrThrow24 = a.getColumnIndexOrThrow("edit_time");
                    int columnIndexOrThrow25 = a.getColumnIndexOrThrow("url");
                    int columnIndexOrThrow26 = a.getColumnIndexOrThrow("fake_token");
                    int columnIndexOrThrow27 = a.getColumnIndexOrThrow("is_stared");
                    int columnIndexOrThrow28 = a.getColumnIndexOrThrow("is_pined");
                    int columnIndexOrThrow29 = a.getColumnIndexOrThrow("is_subscribed");
                    int columnIndexOrThrow30 = a.getColumnIndexOrThrow("extra_icon_url");
                    int columnIndexOrThrow31 = a.getColumnIndexOrThrow("extra_icon_key");
                    int columnIndexOrThrow32 = a.getColumnIndexOrThrow("extra_icon_nonce");
                    int columnIndexOrThrow33 = a.getColumnIndexOrThrow("extra_icon_encrypted_type");
                    int columnIndexOrThrow34 = a.getColumnIndexOrThrow("extra_copiable");
                    int columnIndexOrThrow35 = a.getColumnIndexOrThrow("extra_is_share_root");
                    int columnIndexOrThrow36 = a.getColumnIndexOrThrow("extra_is_external");
                    int columnIndexOrThrow37 = a.getColumnIndexOrThrow("extra_sub_type");
                    int columnIndexOrThrow38 = a.getColumnIndexOrThrow("is_visited");
                    int columnIndexOrThrow39 = a.getColumnIndexOrThrow("create_time");
                    int columnIndexOrThrow40 = a.getColumnIndexOrThrow("thumbnail_url");
                    int columnIndexOrThrow41 = a.getColumnIndexOrThrow("thumbnail_secret");
                    int columnIndexOrThrow42 = a.getColumnIndexOrThrow("thumbnail_nonce");
                    int columnIndexOrThrow43 = a.getColumnIndexOrThrow("thumbnail_type");
                    int columnIndexOrThrow44 = a.getColumnIndexOrThrow("permission");
                    int columnIndexOrThrow45 = a.getColumnIndexOrThrow("share_time");
                    int columnIndexOrThrow46 = a.getColumnIndexOrThrow("share_version");
                    int columnIndexOrThrow47 = a.getColumnIndexOrThrow("is_hidden");
                    int columnIndexOrThrow48 = a.getColumnIndexOrThrow("need_sync");
                    int columnIndexOrThrow49 = a.getColumnIndexOrThrow("size");
                    int columnIndexOrThrow50 = a.getColumnIndexOrThrow("thumbnail");
                    int columnIndexOrThrow51 = a.getColumnIndexOrThrow("document_icon_key");
                    int columnIndexOrThrow52 = a.getColumnIndexOrThrow("document_icon_type");
                    int columnIndexOrThrow53 = a.getColumnIndexOrThrow("document_icon_fsunit");
                    int columnIndexOrThrow54 = a.getColumnIndexOrThrow("app_id");
                    int columnIndexOrThrow55 = a.getColumnIndexOrThrow("doc_cache_status");
                    int columnIndexOrThrow56 = a.getColumnIndexOrThrow("is_offline_create");
                    int columnIndexOrThrow57 = a.getColumnIndexOrThrow("wiki_real_type");
                    int columnIndexOrThrow58 = a.getColumnIndexOrThrow("wiki_version");
                    int columnIndexOrThrow59 = a.getColumnIndexOrThrow("owner_type");
                    int columnIndexOrThrow60 = a.getColumnIndexOrThrow("is_share_folder");
                    int i5 = columnIndexOrThrow15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        C8200i iVar = new C8200i();
                        iVar.mo32025a(a.getString(columnIndexOrThrow));
                        iVar.mo32044e(a.getInt(columnIndexOrThrow2));
                        iVar.mo32100y(a.getString(columnIndexOrThrow3));
                        iVar.mo32102z(a.getString(columnIndexOrThrow4));
                        iVar.mo31989A(a.getString(columnIndexOrThrow5));
                        iVar.mo31991B(a.getString(columnIndexOrThrow6));
                        iVar.mo31993C(a.getString(columnIndexOrThrow7));
                        if (a.getInt(columnIndexOrThrow8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iVar.mo32066j(z);
                        iVar.mo32070l(a.getString(columnIndexOrThrow9));
                        iVar.mo32086r(a.getString(columnIndexOrThrow10));
                        iVar.mo32087s(a.getString(columnIndexOrThrow11));
                        if (a.getInt(columnIndexOrThrow12) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        iVar.mo32071l(z2);
                        if (a.getInt(columnIndexOrThrow13) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iVar.mo32074m(z3);
                        iVar.mo32064j(a.getInt(columnIndexOrThrow14));
                        iVar.mo32005I(a.getString(i5));
                        iVar.mo32025a(a.getString(columnIndexOrThrow16));
                        iVar.mo32033b(a.getString(columnIndexOrThrow17));
                        iVar.mo32037c(a.getString(columnIndexOrThrow18));
                        iVar.mo32041d(a.getString(columnIndexOrThrow19));
                        iVar.mo32045e(a.getString(columnIndexOrThrow20));
                        iVar.mo32049f(a.getString(columnIndexOrThrow21));
                        iVar.mo32053g(a.getString(columnIndexOrThrow22));
                        iVar.mo32057h(a.getString(columnIndexOrThrow23));
                        iVar.mo32061i(a.getString(columnIndexOrThrow24));
                        iVar.mo32065j(a.getString(columnIndexOrThrow25));
                        iVar.mo32067k(a.getString(columnIndexOrThrow26));
                        if (a.getInt(columnIndexOrThrow27) != 0) {
                            i = columnIndexOrThrow26;
                            z4 = true;
                        } else {
                            i = columnIndexOrThrow26;
                            z4 = false;
                        }
                        iVar.mo32026a(z4);
                        if (a.getInt(columnIndexOrThrow28) != 0) {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = true;
                        } else {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = false;
                        }
                        iVar.mo32034b(z5);
                        if (a.getInt(columnIndexOrThrow29) != 0) {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = true;
                        } else {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = false;
                        }
                        iVar.mo32038c(z6);
                        iVar.mo32073m(a.getString(columnIndexOrThrow30));
                        iVar.mo32077n(a.getString(columnIndexOrThrow31));
                        iVar.mo32080o(a.getString(columnIndexOrThrow32));
                        iVar.mo32024a(a.getInt(columnIndexOrThrow33));
                        if (a.getInt(columnIndexOrThrow34) != 0) {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = true;
                        } else {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = false;
                        }
                        iVar.mo32042d(z7);
                        if (a.getInt(columnIndexOrThrow35) != 0) {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = true;
                        } else {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = false;
                        }
                        iVar.mo32046e(z8);
                        if (a.getInt(columnIndexOrThrow36) != 0) {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = true;
                        } else {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = false;
                        }
                        iVar.mo32050f(z9);
                        iVar.mo32082p(a.getString(columnIndexOrThrow37));
                        if (a.getInt(columnIndexOrThrow38) != 0) {
                            i2 = columnIndexOrThrow37;
                            z10 = true;
                        } else {
                            i2 = columnIndexOrThrow37;
                            z10 = false;
                        }
                        iVar.mo32054g(z10);
                        iVar.mo32084q(a.getString(columnIndexOrThrow39));
                        iVar.mo32089t(a.getString(columnIndexOrThrow40));
                        iVar.mo32091u(a.getString(columnIndexOrThrow41));
                        iVar.mo32094v(a.getString(columnIndexOrThrow42));
                        iVar.mo32032b(a.getInt(columnIndexOrThrow43));
                        iVar.mo32036c(a.getInt(columnIndexOrThrow44));
                        iVar.mo32095w(a.getString(columnIndexOrThrow45));
                        iVar.mo32040d(a.getInt(columnIndexOrThrow46));
                        if (a.getInt(columnIndexOrThrow47) != 0) {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = true;
                        } else {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = false;
                        }
                        iVar.mo32058h(z11);
                        if (a.getInt(columnIndexOrThrow48) != 0) {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = true;
                        } else {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = false;
                        }
                        iVar.mo32062i(z12);
                        iVar.mo32098x(a.getString(columnIndexOrThrow49));
                        iVar.mo31999F(a.getString(columnIndexOrThrow50));
                        iVar.mo31995D(a.getString(columnIndexOrThrow51));
                        iVar.mo32048f(a.getInt(columnIndexOrThrow52));
                        iVar.mo31997E(a.getString(columnIndexOrThrow53));
                        iVar.mo32001G(a.getString(columnIndexOrThrow54));
                        iVar.mo32052g(a.getInt(columnIndexOrThrow55));
                        if (a.getInt(columnIndexOrThrow56) != 0) {
                            i3 = columnIndexOrThrow55;
                            z13 = true;
                        } else {
                            i3 = columnIndexOrThrow55;
                            z13 = false;
                        }
                        iVar.mo32068k(z13);
                        iVar.mo32056h(a.getInt(columnIndexOrThrow57));
                        iVar.mo32002H(a.getString(columnIndexOrThrow58));
                        iVar.mo32060i(a.getInt(columnIndexOrThrow59));
                        if (a.getInt(columnIndexOrThrow60) != 0) {
                            i4 = columnIndexOrThrow59;
                            z14 = true;
                        } else {
                            i4 = columnIndexOrThrow59;
                            z14 = false;
                        }
                        iVar.mo32078n(z14);
                        arrayList = arrayList;
                        arrayList.add(iVar);
                        columnIndexOrThrow60 = columnIndexOrThrow60;
                        columnIndexOrThrow = columnIndexOrThrow;
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                        i5 = i5;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow17 = columnIndexOrThrow17;
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        columnIndexOrThrow19 = columnIndexOrThrow19;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow23 = columnIndexOrThrow23;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        columnIndexOrThrow26 = i;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow30 = columnIndexOrThrow30;
                        columnIndexOrThrow31 = columnIndexOrThrow31;
                        columnIndexOrThrow32 = columnIndexOrThrow32;
                        columnIndexOrThrow33 = columnIndexOrThrow33;
                        columnIndexOrThrow37 = i2;
                        columnIndexOrThrow38 = columnIndexOrThrow38;
                        columnIndexOrThrow39 = columnIndexOrThrow39;
                        columnIndexOrThrow40 = columnIndexOrThrow40;
                        columnIndexOrThrow41 = columnIndexOrThrow41;
                        columnIndexOrThrow42 = columnIndexOrThrow42;
                        columnIndexOrThrow43 = columnIndexOrThrow43;
                        columnIndexOrThrow44 = columnIndexOrThrow44;
                        columnIndexOrThrow45 = columnIndexOrThrow45;
                        columnIndexOrThrow46 = columnIndexOrThrow46;
                        columnIndexOrThrow49 = columnIndexOrThrow49;
                        columnIndexOrThrow50 = columnIndexOrThrow50;
                        columnIndexOrThrow51 = columnIndexOrThrow51;
                        columnIndexOrThrow52 = columnIndexOrThrow52;
                        columnIndexOrThrow53 = columnIndexOrThrow53;
                        columnIndexOrThrow54 = columnIndexOrThrow54;
                        columnIndexOrThrow55 = i3;
                        columnIndexOrThrow56 = columnIndexOrThrow56;
                        columnIndexOrThrow57 = columnIndexOrThrow57;
                        columnIndexOrThrow58 = columnIndexOrThrow58;
                        columnIndexOrThrow59 = i4;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public List<C8175b> mo31936a(Set<String> set) {
        C1439h hVar;
        Throwable th;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        boolean z8;
        int i4;
        boolean z9;
        StringBuilder a = C1422a.m6520a();
        a.append("SELECT * FROM DocMetaInfo WHERE obj_token in (");
        int size = set.size();
        C1422a.m6521a(a, size);
        a.append(") and doc_cache_status = 2");
        C1439h a2 = C1439h.m6573a(a.toString(), size + 0);
        int i5 = 1;
        for (String str : set) {
            if (str == null) {
                a2.bindNull(i5);
            } else {
                a2.bindString(i5, str);
            }
            i5++;
        }
        Cursor a3 = this.f21940a.mo7532a(a2);
        try {
            int columnIndexOrThrow = a3.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow2 = a3.getColumnIndexOrThrow("name");
            int columnIndexOrThrow3 = a3.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow4 = a3.getColumnIndexOrThrow("owner_id");
            int columnIndexOrThrow5 = a3.getColumnIndexOrThrow("create_tenant_id");
            int columnIndexOrThrow6 = a3.getColumnIndexOrThrow("creator_cn_name");
            int columnIndexOrThrow7 = a3.getColumnIndexOrThrow("creator_en_name");
            int columnIndexOrThrow8 = a3.getColumnIndexOrThrow("edit_uid");
            int columnIndexOrThrow9 = a3.getColumnIndexOrThrow("edit_time");
            int columnIndexOrThrow10 = a3.getColumnIndexOrThrow("url");
            int columnIndexOrThrow11 = a3.getColumnIndexOrThrow("fake_token");
            int columnIndexOrThrow12 = a3.getColumnIndexOrThrow("is_stared");
            int columnIndexOrThrow13 = a3.getColumnIndexOrThrow("is_pined");
            int columnIndexOrThrow14 = a3.getColumnIndexOrThrow("is_subscribed");
            hVar = a2;
            try {
                int columnIndexOrThrow15 = a3.getColumnIndexOrThrow("extra_icon_url");
                int columnIndexOrThrow16 = a3.getColumnIndexOrThrow("extra_icon_key");
                int columnIndexOrThrow17 = a3.getColumnIndexOrThrow("extra_icon_nonce");
                int columnIndexOrThrow18 = a3.getColumnIndexOrThrow("extra_icon_encrypted_type");
                int columnIndexOrThrow19 = a3.getColumnIndexOrThrow("extra_copiable");
                int columnIndexOrThrow20 = a3.getColumnIndexOrThrow("extra_is_share_root");
                int columnIndexOrThrow21 = a3.getColumnIndexOrThrow("extra_is_external");
                int columnIndexOrThrow22 = a3.getColumnIndexOrThrow("extra_sub_type");
                int columnIndexOrThrow23 = a3.getColumnIndexOrThrow("is_visited");
                int columnIndexOrThrow24 = a3.getColumnIndexOrThrow("create_time");
                int columnIndexOrThrow25 = a3.getColumnIndexOrThrow("thumbnail_url");
                int columnIndexOrThrow26 = a3.getColumnIndexOrThrow("thumbnail_secret");
                int columnIndexOrThrow27 = a3.getColumnIndexOrThrow("thumbnail_nonce");
                int columnIndexOrThrow28 = a3.getColumnIndexOrThrow("thumbnail_type");
                int columnIndexOrThrow29 = a3.getColumnIndexOrThrow("permission");
                int columnIndexOrThrow30 = a3.getColumnIndexOrThrow("share_time");
                int columnIndexOrThrow31 = a3.getColumnIndexOrThrow("share_version");
                int columnIndexOrThrow32 = a3.getColumnIndexOrThrow("is_hidden");
                int columnIndexOrThrow33 = a3.getColumnIndexOrThrow("need_sync");
                int columnIndexOrThrow34 = a3.getColumnIndexOrThrow("size");
                int columnIndexOrThrow35 = a3.getColumnIndexOrThrow("thumbnail");
                int columnIndexOrThrow36 = a3.getColumnIndexOrThrow("document_icon_key");
                int columnIndexOrThrow37 = a3.getColumnIndexOrThrow("document_icon_type");
                int columnIndexOrThrow38 = a3.getColumnIndexOrThrow("document_icon_fsunit");
                int columnIndexOrThrow39 = a3.getColumnIndexOrThrow("app_id");
                int columnIndexOrThrow40 = a3.getColumnIndexOrThrow("doc_cache_status");
                int columnIndexOrThrow41 = a3.getColumnIndexOrThrow("is_offline_create");
                int columnIndexOrThrow42 = a3.getColumnIndexOrThrow("wiki_real_type");
                int columnIndexOrThrow43 = a3.getColumnIndexOrThrow("wiki_version");
                int columnIndexOrThrow44 = a3.getColumnIndexOrThrow("owner_type");
                int columnIndexOrThrow45 = a3.getColumnIndexOrThrow("is_share_folder");
                int i6 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    C8175b bVar = new C8175b();
                    bVar.mo31679a(a3.getString(columnIndexOrThrow));
                    bVar.mo31683b(a3.getString(columnIndexOrThrow2));
                    bVar.mo31687c(a3.getString(columnIndexOrThrow3));
                    bVar.mo31691d(a3.getString(columnIndexOrThrow4));
                    bVar.mo31695e(a3.getString(columnIndexOrThrow5));
                    bVar.mo31699f(a3.getString(columnIndexOrThrow6));
                    bVar.mo31703g(a3.getString(columnIndexOrThrow7));
                    bVar.mo31707h(a3.getString(columnIndexOrThrow8));
                    bVar.mo31710i(a3.getString(columnIndexOrThrow9));
                    bVar.mo31713j(a3.getString(columnIndexOrThrow10));
                    bVar.mo31716k(a3.getString(columnIndexOrThrow11));
                    bVar.mo31684b(a3.getInt(columnIndexOrThrow12) != 0);
                    bVar.mo31688c(a3.getInt(columnIndexOrThrow13) != 0);
                    if (a3.getInt(i6) != 0) {
                        i = columnIndexOrThrow;
                        z = true;
                    } else {
                        i = columnIndexOrThrow;
                        z = false;
                    }
                    bVar.mo31692d(z);
                    bVar.mo31721m(a3.getString(columnIndexOrThrow15));
                    bVar.mo31723n(a3.getString(columnIndexOrThrow16));
                    bVar.mo31725o(a3.getString(columnIndexOrThrow17));
                    bVar.mo31678a(a3.getInt(columnIndexOrThrow18));
                    if (a3.getInt(columnIndexOrThrow19) != 0) {
                        columnIndexOrThrow19 = columnIndexOrThrow19;
                        z2 = true;
                    } else {
                        columnIndexOrThrow19 = columnIndexOrThrow19;
                        z2 = false;
                    }
                    bVar.mo31696e(z2);
                    if (a3.getInt(columnIndexOrThrow20) != 0) {
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        z3 = true;
                    } else {
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        z3 = false;
                    }
                    bVar.mo31700f(z3);
                    if (a3.getInt(columnIndexOrThrow21) != 0) {
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        z4 = true;
                    } else {
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        z4 = false;
                    }
                    bVar.mo31680a(z4);
                    bVar.mo31718l(a3.getString(columnIndexOrThrow22));
                    if (a3.getInt(columnIndexOrThrow23) != 0) {
                        i2 = columnIndexOrThrow22;
                        z5 = true;
                    } else {
                        i2 = columnIndexOrThrow22;
                        z5 = false;
                    }
                    bVar.mo31704g(z5);
                    bVar.mo31728p(a3.getString(columnIndexOrThrow24));
                    bVar.mo31730q(a3.getString(columnIndexOrThrow25));
                    bVar.mo31732r(a3.getString(columnIndexOrThrow26));
                    bVar.mo31734s(a3.getString(columnIndexOrThrow27));
                    bVar.mo31686c(a3.getInt(columnIndexOrThrow28));
                    bVar.mo31690d(a3.getInt(columnIndexOrThrow29));
                    bVar.mo31736t(a3.getString(columnIndexOrThrow30));
                    bVar.mo31694e(a3.getInt(columnIndexOrThrow31));
                    if (a3.getInt(columnIndexOrThrow32) != 0) {
                        columnIndexOrThrow32 = columnIndexOrThrow32;
                        z6 = true;
                    } else {
                        columnIndexOrThrow32 = columnIndexOrThrow32;
                        z6 = false;
                    }
                    bVar.mo31708h(z6);
                    if (a3.getInt(columnIndexOrThrow33) != 0) {
                        columnIndexOrThrow33 = columnIndexOrThrow33;
                        z7 = true;
                    } else {
                        columnIndexOrThrow33 = columnIndexOrThrow33;
                        z7 = false;
                    }
                    bVar.mo31711i(z7);
                    bVar.mo31739u(a3.getString(columnIndexOrThrow34));
                    bVar.mo31745x(a3.getString(columnIndexOrThrow35));
                    bVar.mo31741v(a3.getString(columnIndexOrThrow36));
                    bVar.mo31698f(a3.getInt(columnIndexOrThrow37));
                    bVar.mo31742w(a3.getString(columnIndexOrThrow38));
                    bVar.mo31747y(a3.getString(columnIndexOrThrow39));
                    bVar.mo31682b(a3.getInt(columnIndexOrThrow40));
                    if (a3.getInt(columnIndexOrThrow41) != 0) {
                        i3 = columnIndexOrThrow40;
                        z8 = true;
                    } else {
                        i3 = columnIndexOrThrow40;
                        z8 = false;
                    }
                    bVar.mo31714j(z8);
                    bVar.mo31702g(a3.getInt(columnIndexOrThrow42));
                    bVar.mo31749z(a3.getString(columnIndexOrThrow43));
                    bVar.mo31706h(a3.getInt(columnIndexOrThrow44));
                    if (a3.getInt(columnIndexOrThrow45) != 0) {
                        i4 = columnIndexOrThrow44;
                        z9 = true;
                    } else {
                        i4 = columnIndexOrThrow44;
                        z9 = false;
                    }
                    bVar.mo31717k(z9);
                    arrayList.add(bVar);
                    arrayList = arrayList;
                    columnIndexOrThrow = i;
                    i6 = i6;
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    columnIndexOrThrow22 = i2;
                    columnIndexOrThrow23 = columnIndexOrThrow23;
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    columnIndexOrThrow25 = columnIndexOrThrow25;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    columnIndexOrThrow27 = columnIndexOrThrow27;
                    columnIndexOrThrow28 = columnIndexOrThrow28;
                    columnIndexOrThrow29 = columnIndexOrThrow29;
                    columnIndexOrThrow30 = columnIndexOrThrow30;
                    columnIndexOrThrow31 = columnIndexOrThrow31;
                    columnIndexOrThrow34 = columnIndexOrThrow34;
                    columnIndexOrThrow35 = columnIndexOrThrow35;
                    columnIndexOrThrow36 = columnIndexOrThrow36;
                    columnIndexOrThrow37 = columnIndexOrThrow37;
                    columnIndexOrThrow38 = columnIndexOrThrow38;
                    columnIndexOrThrow39 = columnIndexOrThrow39;
                    columnIndexOrThrow40 = i3;
                    columnIndexOrThrow41 = columnIndexOrThrow41;
                    columnIndexOrThrow42 = columnIndexOrThrow42;
                    columnIndexOrThrow43 = columnIndexOrThrow43;
                    columnIndexOrThrow44 = i4;
                    columnIndexOrThrow45 = columnIndexOrThrow45;
                }
                a3.close();
                hVar.mo7613a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a3.close();
                hVar.mo7613a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = a2;
            a3.close();
            hVar.mo7613a();
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public List<String> mo31930a() {
        C1439h a = C1439h.m6573a("SELECT obj_token FROM DocMetaInfo WHERE doc_cache_status = 2", 0);
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public int mo31921a(List<String> list, int i) {
        StringBuilder a = C1422a.m6520a();
        a.append("UPDATE DocMetaInfo SET doc_cache_status = ");
        a.append("?");
        a.append(" WHERE obj_token IN(");
        C1422a.m6521a(a, list.size());
        a.append(")");
        AbstractC1090f a2 = this.f21940a.mo7534a(a.toString());
        a2.bindLong(1, (long) i);
        int i2 = 2;
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i2);
            } else {
                a2.bindString(i2, str);
            }
            i2++;
        }
        this.f21940a.mo7546g();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public long mo31922a(C8175b bVar) {
        this.f21940a.mo7546g();
        try {
            long a = this.f21941b.mo7587a(bVar);
            this.f21940a.mo7549j();
            return a;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public long[] mo31952b(List<C8176c> list) {
        this.f21940a.mo7546g();
        try {
            long[] a = this.f21944e.mo7590a((Collection) list);
            this.f21940a.mo7549j();
            return a;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31953c(int i) {
        AbstractC1090f c = this.f21959t.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21959t.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: d */
    public int mo31962d(int i) {
        AbstractC1090f c = this.f21938I.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21938I.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: f */
    public int mo31971f(String str) {
        C1439h a = C1439h.m6573a("SELECT doc_cache_status FROM DocMetaInfo WHERE obj_token =?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int i = 0;
            if (a2.moveToFirst()) {
                i = a2.getInt(0);
            }
            return i;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: d */
    public int mo31963d(String str) {
        AbstractC1090f c = this.f21952m.mo7618c();
        this.f21940a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21952m.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21952m.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: e */
    public int mo31969e(String str) {
        C1439h a = C1439h.m6573a("SELECT COUNT(*) FROM ListTypes WHERE obj_token = ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f21940a.mo7532a(a);
        try {
            int i = 0;
            if (a2.moveToFirst()) {
                i = a2.getInt(0);
            }
            return i;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }

    public C8184h(RoomDatabase roomDatabase) {
        this.f21940a = roomDatabase;
        this.f21941b = new AbstractC1428c<C8175b>(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81851 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `DocMetaInfo`(`obj_token`,`name`,`type`,`owner_id`,`create_tenant_id`,`creator_cn_name`,`creator_en_name`,`edit_uid`,`edit_time`,`url`,`fake_token`,`is_stared`,`is_pined`,`is_subscribed`,`extra_icon_url`,`extra_icon_key`,`extra_icon_nonce`,`extra_icon_encrypted_type`,`extra_copiable`,`extra_is_share_root`,`extra_is_external`,`extra_sub_type`,`is_visited`,`create_time`,`thumbnail_url`,`thumbnail_secret`,`thumbnail_nonce`,`thumbnail_type`,`permission`,`share_time`,`share_version`,`is_hidden`,`need_sync`,`size`,`thumbnail`,`document_icon_key`,`document_icon_type`,`document_icon_fsunit`,`app_id`,`doc_cache_status`,`is_offline_create`,`wiki_real_type`,`wiki_version`,`owner_type`,`is_share_folder`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C8175b bVar) {
                if (bVar.mo31677a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, bVar.mo31677a());
                }
                if (bVar.mo31681b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, bVar.mo31681b());
                }
                if (bVar.mo31685c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, bVar.mo31685c());
                }
                if (bVar.mo31689d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, bVar.mo31689d());
                }
                if (bVar.mo31693e() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, bVar.mo31693e());
                }
                if (bVar.mo31697f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, bVar.mo31697f());
                }
                if (bVar.mo31701g() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, bVar.mo31701g());
                }
                if (bVar.mo31705h() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, bVar.mo31705h());
                }
                if (bVar.mo31709i() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, bVar.mo31709i());
                }
                if (bVar.mo31712j() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, bVar.mo31712j());
                }
                if (bVar.mo31715k() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, bVar.mo31715k());
                }
                fVar.bindLong(12, bVar.mo31722m() ? 1 : 0);
                fVar.bindLong(13, bVar.mo31724n() ? 1 : 0);
                fVar.bindLong(14, bVar.mo31726o() ? 1 : 0);
                if (bVar.mo31729q() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, bVar.mo31729q());
                }
                if (bVar.mo31731r() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, bVar.mo31731r());
                }
                if (bVar.mo31733s() == null) {
                    fVar.bindNull(17);
                } else {
                    fVar.bindString(17, bVar.mo31733s());
                }
                fVar.bindLong(18, (long) bVar.mo31735t());
                fVar.bindLong(19, bVar.mo31743w() ? 1 : 0);
                fVar.bindLong(20, bVar.mo31658B() ? 1 : 0);
                fVar.bindLong(21, bVar.mo31720l() ? 1 : 0);
                if (bVar.mo31727p() == null) {
                    fVar.bindNull(22);
                } else {
                    fVar.bindString(22, bVar.mo31727p());
                }
                fVar.bindLong(23, bVar.mo31662F() ? 1 : 0);
                if (bVar.mo31738u() == null) {
                    fVar.bindNull(24);
                } else {
                    fVar.bindString(24, bVar.mo31738u());
                }
                if (bVar.mo31744x() == null) {
                    fVar.bindNull(25);
                } else {
                    fVar.bindString(25, bVar.mo31744x());
                }
                if (bVar.mo31746y() == null) {
                    fVar.bindNull(26);
                } else {
                    fVar.bindString(26, bVar.mo31746y());
                }
                if (bVar.mo31748z() == null) {
                    fVar.bindNull(27);
                } else {
                    fVar.bindString(27, bVar.mo31748z());
                }
                fVar.bindLong(28, (long) bVar.mo31657A());
                fVar.bindLong(29, (long) bVar.mo31659C());
                if (bVar.mo31660D() == null) {
                    fVar.bindNull(30);
                } else {
                    fVar.bindString(30, bVar.mo31660D());
                }
                fVar.bindLong(31, (long) bVar.mo31661E());
                fVar.bindLong(32, bVar.mo31663G() ? 1 : 0);
                fVar.bindLong(33, bVar.mo31664H() ? 1 : 0);
                if (bVar.mo31665I() == null) {
                    fVar.bindNull(34);
                } else {
                    fVar.bindString(34, bVar.mo31665I());
                }
                if (bVar.mo31669M() == null) {
                    fVar.bindNull(35);
                } else {
                    fVar.bindString(35, bVar.mo31669M());
                }
                if (bVar.mo31666J() == null) {
                    fVar.bindNull(36);
                } else {
                    fVar.bindString(36, bVar.mo31666J());
                }
                fVar.bindLong(37, (long) bVar.mo31667K());
                if (bVar.mo31668L() == null) {
                    fVar.bindNull(38);
                } else {
                    fVar.bindString(38, bVar.mo31668L());
                }
                if (bVar.mo31671O() == null) {
                    fVar.bindNull(39);
                } else {
                    fVar.bindString(39, bVar.mo31671O());
                }
                fVar.bindLong(40, (long) bVar.mo31740v());
                fVar.bindLong(41, bVar.mo31670N() ? 1 : 0);
                fVar.bindLong(42, (long) bVar.mo31672P());
                if (bVar.mo31673Q() == null) {
                    fVar.bindNull(43);
                } else {
                    fVar.bindString(43, bVar.mo31673Q());
                }
                fVar.bindLong(44, (long) bVar.mo31674R());
                fVar.bindLong(45, bVar.mo31675S() ? 1 : 0);
            }
        };
        this.f21942c = new AbstractC1428c<C8175b>(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass12 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR IGNORE INTO `DocMetaInfo`(`obj_token`,`name`,`type`,`owner_id`,`create_tenant_id`,`creator_cn_name`,`creator_en_name`,`edit_uid`,`edit_time`,`url`,`fake_token`,`is_stared`,`is_pined`,`is_subscribed`,`extra_icon_url`,`extra_icon_key`,`extra_icon_nonce`,`extra_icon_encrypted_type`,`extra_copiable`,`extra_is_share_root`,`extra_is_external`,`extra_sub_type`,`is_visited`,`create_time`,`thumbnail_url`,`thumbnail_secret`,`thumbnail_nonce`,`thumbnail_type`,`permission`,`share_time`,`share_version`,`is_hidden`,`need_sync`,`size`,`thumbnail`,`document_icon_key`,`document_icon_type`,`document_icon_fsunit`,`app_id`,`doc_cache_status`,`is_offline_create`,`wiki_real_type`,`wiki_version`,`owner_type`,`is_share_folder`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C8175b bVar) {
                if (bVar.mo31677a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, bVar.mo31677a());
                }
                if (bVar.mo31681b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, bVar.mo31681b());
                }
                if (bVar.mo31685c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, bVar.mo31685c());
                }
                if (bVar.mo31689d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, bVar.mo31689d());
                }
                if (bVar.mo31693e() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, bVar.mo31693e());
                }
                if (bVar.mo31697f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, bVar.mo31697f());
                }
                if (bVar.mo31701g() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, bVar.mo31701g());
                }
                if (bVar.mo31705h() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, bVar.mo31705h());
                }
                if (bVar.mo31709i() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, bVar.mo31709i());
                }
                if (bVar.mo31712j() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, bVar.mo31712j());
                }
                if (bVar.mo31715k() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, bVar.mo31715k());
                }
                fVar.bindLong(12, bVar.mo31722m() ? 1 : 0);
                fVar.bindLong(13, bVar.mo31724n() ? 1 : 0);
                fVar.bindLong(14, bVar.mo31726o() ? 1 : 0);
                if (bVar.mo31729q() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, bVar.mo31729q());
                }
                if (bVar.mo31731r() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, bVar.mo31731r());
                }
                if (bVar.mo31733s() == null) {
                    fVar.bindNull(17);
                } else {
                    fVar.bindString(17, bVar.mo31733s());
                }
                fVar.bindLong(18, (long) bVar.mo31735t());
                fVar.bindLong(19, bVar.mo31743w() ? 1 : 0);
                fVar.bindLong(20, bVar.mo31658B() ? 1 : 0);
                fVar.bindLong(21, bVar.mo31720l() ? 1 : 0);
                if (bVar.mo31727p() == null) {
                    fVar.bindNull(22);
                } else {
                    fVar.bindString(22, bVar.mo31727p());
                }
                fVar.bindLong(23, bVar.mo31662F() ? 1 : 0);
                if (bVar.mo31738u() == null) {
                    fVar.bindNull(24);
                } else {
                    fVar.bindString(24, bVar.mo31738u());
                }
                if (bVar.mo31744x() == null) {
                    fVar.bindNull(25);
                } else {
                    fVar.bindString(25, bVar.mo31744x());
                }
                if (bVar.mo31746y() == null) {
                    fVar.bindNull(26);
                } else {
                    fVar.bindString(26, bVar.mo31746y());
                }
                if (bVar.mo31748z() == null) {
                    fVar.bindNull(27);
                } else {
                    fVar.bindString(27, bVar.mo31748z());
                }
                fVar.bindLong(28, (long) bVar.mo31657A());
                fVar.bindLong(29, (long) bVar.mo31659C());
                if (bVar.mo31660D() == null) {
                    fVar.bindNull(30);
                } else {
                    fVar.bindString(30, bVar.mo31660D());
                }
                fVar.bindLong(31, (long) bVar.mo31661E());
                fVar.bindLong(32, bVar.mo31663G() ? 1 : 0);
                fVar.bindLong(33, bVar.mo31664H() ? 1 : 0);
                if (bVar.mo31665I() == null) {
                    fVar.bindNull(34);
                } else {
                    fVar.bindString(34, bVar.mo31665I());
                }
                if (bVar.mo31669M() == null) {
                    fVar.bindNull(35);
                } else {
                    fVar.bindString(35, bVar.mo31669M());
                }
                if (bVar.mo31666J() == null) {
                    fVar.bindNull(36);
                } else {
                    fVar.bindString(36, bVar.mo31666J());
                }
                fVar.bindLong(37, (long) bVar.mo31667K());
                if (bVar.mo31668L() == null) {
                    fVar.bindNull(38);
                } else {
                    fVar.bindString(38, bVar.mo31668L());
                }
                if (bVar.mo31671O() == null) {
                    fVar.bindNull(39);
                } else {
                    fVar.bindString(39, bVar.mo31671O());
                }
                fVar.bindLong(40, (long) bVar.mo31740v());
                fVar.bindLong(41, bVar.mo31670N() ? 1 : 0);
                fVar.bindLong(42, (long) bVar.mo31672P());
                if (bVar.mo31673Q() == null) {
                    fVar.bindNull(43);
                } else {
                    fVar.bindString(43, bVar.mo31673Q());
                }
                fVar.bindLong(44, (long) bVar.mo31674R());
                fVar.bindLong(45, bVar.mo31675S() ? 1 : 0);
            }
        };
        this.f21943d = new AbstractC1428c<C8201j>(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass23 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `ListTypes`(`obj_token`,`list_type`,`token`,`extra`,`space_id`,`file_path`,`add_time_manualoffline`,`is_need_wifi_download`,`open_time_recent`,`my_edit_time_recent`,`activity_time_recent`,`has_perm_folder`,`show_external_hint_folder`,`node_type_folder`,`shortcut_name_folder`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C8201j jVar) {
                if (jVar.mo32103a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, jVar.mo32103a());
                }
                fVar.bindLong(2, (long) jVar.mo32107b());
                if (jVar.mo32115d() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, jVar.mo32115d());
                }
                if (jVar.mo32111c() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, jVar.mo32111c());
                }
                if (jVar.mo32120g() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, jVar.mo32120g());
                }
                if (jVar.mo32122h() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, jVar.mo32122h());
                }
                if (jVar.mo32117e() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, jVar.mo32117e());
                }
                fVar.bindLong(8, jVar.mo32119f() ? 1 : 0);
                if (jVar.mo32128k() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, jVar.mo32128k());
                }
                if (jVar.mo32124i() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, jVar.mo32124i());
                }
                if (jVar.mo32126j() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, jVar.mo32126j());
                }
                fVar.bindLong(12, jVar.mo32131l() ? 1 : 0);
                fVar.bindLong(13, jVar.mo32132m() ? 1 : 0);
                fVar.bindLong(14, (long) jVar.mo32133n());
                if (jVar.mo32134o() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, jVar.mo32134o());
                }
            }
        };
        this.f21944e = new AbstractC1428c<C8176c>(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass34 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `FilterCache`(`list_type`,`filter_type`,`file_type`,`strategy`,`is_asc`,`obj_token`,`file_path`,`token`,`extra`,`space_id`,`add_time_manualoffline`,`is_need_wifi_download`,`open_time_recent`,`my_edit_time_recent`,`activity_time_recent`,`has_perm_folder`,`show_external_hint_folder`,`node_type_folder`,`shortcut_name_folder`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C8176c cVar) {
                fVar.bindLong(1, (long) cVar.mo31750a());
                fVar.bindLong(2, (long) cVar.mo31754b());
                if (cVar.mo31758c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, cVar.mo31758c());
                }
                fVar.bindLong(4, (long) cVar.mo31762d());
                fVar.bindLong(5, cVar.mo31768e() ? 1 : 0);
                if (cVar.mo31769f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, cVar.mo31769f());
                }
                if (cVar.mo31771g() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, cVar.mo31771g());
                }
                if (cVar.mo31773h() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, cVar.mo31773h());
                }
                if (cVar.mo31775i() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, cVar.mo31775i());
                }
                if (cVar.mo31777j() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, cVar.mo31777j());
                }
                if (cVar.mo31779k() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, cVar.mo31779k());
                }
                fVar.bindLong(12, cVar.mo31781l() ? 1 : 0);
                if (cVar.mo31782m() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, cVar.mo31782m());
                }
                if (cVar.mo31783n() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, cVar.mo31783n());
                }
                if (cVar.mo31784o() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, cVar.mo31784o());
                }
                fVar.bindLong(16, cVar.mo31785p() ? 1 : 0);
                fVar.bindLong(17, cVar.mo31786q() ? 1 : 0);
                fVar.bindLong(18, (long) cVar.mo31787r());
                if (cVar.mo31788s() == null) {
                    fVar.bindNull(19);
                } else {
                    fVar.bindString(19, cVar.mo31788s());
                }
                fVar.bindLong(20, (long) cVar.mo31789t());
            }
        };
        this.f21945f = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass37 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET name = ?, type=?, owner_id = ?,create_tenant_id=?, creator_cn_name=?, creator_en_name=?, edit_uid=?,edit_time=?, url=?, fake_token=?, is_stared=?,is_pined=?, extra_icon_url=?, extra_icon_key=?, extra_icon_nonce=?,extra_icon_encrypted_type=?, extra_copiable=?, extra_is_share_root=?, extra_is_external=?,extra_sub_type=?, is_visited=?, create_time=?, thumbnail_url=?,thumbnail_secret=?, thumbnail_nonce=?, thumbnail_type=?, permission=?,share_time=?, share_version=?, is_hidden=?, need_sync=?,thumbnail=?, document_icon_key=?, document_icon_type=?,document_icon_fsunit=?, app_id=?, wiki_real_type=?, wiki_version=?,is_subscribed=?,owner_type =?, is_offline_create = 0, is_share_folder=? WHERE obj_token = ?";
            }
        };
        this.f21946g = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass38 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET type=?, url=?, is_stared=?,is_pined=?, extra_icon_url=?, extra_icon_key=?, extra_icon_nonce=?,extra_icon_encrypted_type=?, extra_copiable=?, extra_sub_type=?, thumbnail_url=?,thumbnail_secret=?, thumbnail_nonce=?, thumbnail_type=?, thumbnail=?, document_icon_key=?, document_icon_type=?,document_icon_fsunit=?, app_id=?, wiki_real_type=?, wiki_version=?,owner_type =? WHERE obj_token = ?";
            }
        };
        this.f21947h = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass39 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM DocMetaInfo WHERE obj_token NOT LIKE ? || '%' AND obj_token NOT IN(SELECT obj_token FROM ListTypes)";
            }
        };
        this.f21948i = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass40 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM FilterCache WHERE list_type =? AND filter_type =? AND file_type =? AND strategy =? AND is_asc =? AND file_path =?";
            }
        };
        this.f21949j = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass41 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM DocMetaInfo WHERE obj_token =?";
            }
        };
        this.f21950k = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81862 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE obj_token =? AND node_type_folder !=?";
            }
        };
        this.f21951l = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81873 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE obj_token =? AND list_type = ?";
            }
        };
        this.f21952m = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81944 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE token = ?";
            }
        };
        this.f21953n = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81955 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET obj_token =?, doc_cache_status =? WHERE obj_token =?";
            }
        };
        this.f21954o = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81966 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE ListTypes SET show_external_hint_folder = ? WHERE obj_token = ? AND list_type = ? AND file_path = ?";
            }
        };
        this.f21955p = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81977 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET is_pined = ? WHERE obj_token = ?";
            }
        };
        this.f21956q = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81988 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET is_stared = ? WHERE obj_token = ?";
            }
        };
        this.f21957r = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.C81999 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET is_subscribed = ? WHERE obj_token = ?";
            }
        };
        this.f21958s = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass10 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET size = ? WHERE obj_token = ?";
            }
        };
        this.f21959t = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass11 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE list_type = ?";
            }
        };
        this.f21960u = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass13 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE list_type = ? AND obj_token NOT LIKE ? || '%'  AND obj_token NOT IN (SELECT obj_token FROM DocMetaInfo WHERE is_offline_create = 1)";
            }
        };
        this.f21961v = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass14 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE list_type !=? AND list_type !=? AND list_type !=? AND obj_token NOT LIKE ? || '%'";
            }
        };
        this.f21962w = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass15 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET name= ? WHERE obj_token= ?";
            }
        };
        this.f21963x = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass16 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE ListTypes SET obj_token = ?, token = ? WHERE obj_token =?";
            }
        };
        this.f21964y = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass17 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE ListTypes SET shortcut_name_folder= ? WHERE token= ?";
            }
        };
        this.f21965z = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass18 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET name= ?, edit_time =? WHERE obj_token= ?";
            }
        };
        this.f21930A = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass19 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET name= ?, edit_time =? WHERE fake_token= ?";
            }
        };
        this.f21931B = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass20 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE file_path= ? AND list_type = ?";
            }
        };
        this.f21932C = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass21 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE list_type = ? AND file_path = ? AND obj_token NOT LIKE ? || '%'";
            }
        };
        this.f21933D = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass22 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET is_visited= ? WHERE obj_token= ?";
            }
        };
        this.f21934E = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass24 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE list_type = ? AND obj_token IN(SELECT DocMetaInfo.obj_token FROM DocMetaInfo WHERE type != ?)";
            }
        };
        this.f21935F = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass25 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM ListTypes WHERE list_type = ? AND obj_token IN(SELECT DocMetaInfo.obj_token FROM DocMetaInfo WHERE type = ?)";
            }
        };
        this.f21936G = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass26 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE ListTypes SET is_need_wifi_download = ? WHERE obj_token =?";
            }
        };
        this.f21937H = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass27 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE ListTypes SET is_need_wifi_download =?";
            }
        };
        this.f21938I = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass28 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET doc_cache_status = ?";
            }
        };
        this.f21939J = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass29 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE DocMetaInfo SET doc_cache_status = ? WHERE obj_token = ?";
            }
        };
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public int mo31944b(String str) {
        AbstractC1090f c = this.f21947h.mo7618c();
        this.f21940a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21947h.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21947h.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31957c(String str) {
        AbstractC1090f c = this.f21949j.mo7618c();
        this.f21940a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21949j.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21949j.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: d */
    public LiveData<List<C8200i>> mo31966d(int i, int i2) {
        final C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.list_type = ? AND DMI.type != ?", 2);
        a.bindLong(1, (long) i);
        a.bindLong(2, (long) i2);
        return new AbstractC1154e<List<C8200i>>(this.f21940a.mo7548i()) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass36 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f22012i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<C8200i> mo6021c() {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                int i2;
                boolean z10;
                boolean z11;
                boolean z12;
                int i3;
                boolean z13;
                int i4;
                boolean z14;
                if (this.f22012i == null) {
                    this.f22012i = new C1429d.AbstractC1432b("ListTypes", "DocMetaInfo") {
                        /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass36.C81931 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            AnonymousClass36.this.mo6020b();
                        }
                    };
                    C8184h.this.f21940a.mo7550k().mo7598b(this.f22012i);
                }
                Cursor a = C8184h.this.f21940a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("list_type");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("token");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("extra");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("space_id");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("file_path");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("add_time_manualoffline");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("is_need_wifi_download");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("open_time_recent");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("my_edit_time_recent");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("activity_time_recent");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("has_perm_folder");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("show_external_hint_folder");
                    int columnIndexOrThrow14 = a.getColumnIndexOrThrow("node_type_folder");
                    int columnIndexOrThrow15 = a.getColumnIndexOrThrow("shortcut_name_folder");
                    int columnIndexOrThrow16 = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow17 = a.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow18 = a.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                    int columnIndexOrThrow19 = a.getColumnIndexOrThrow("owner_id");
                    int columnIndexOrThrow20 = a.getColumnIndexOrThrow("create_tenant_id");
                    int columnIndexOrThrow21 = a.getColumnIndexOrThrow("creator_cn_name");
                    int columnIndexOrThrow22 = a.getColumnIndexOrThrow("creator_en_name");
                    int columnIndexOrThrow23 = a.getColumnIndexOrThrow("edit_uid");
                    int columnIndexOrThrow24 = a.getColumnIndexOrThrow("edit_time");
                    int columnIndexOrThrow25 = a.getColumnIndexOrThrow("url");
                    int columnIndexOrThrow26 = a.getColumnIndexOrThrow("fake_token");
                    int columnIndexOrThrow27 = a.getColumnIndexOrThrow("is_stared");
                    int columnIndexOrThrow28 = a.getColumnIndexOrThrow("is_pined");
                    int columnIndexOrThrow29 = a.getColumnIndexOrThrow("is_subscribed");
                    int columnIndexOrThrow30 = a.getColumnIndexOrThrow("extra_icon_url");
                    int columnIndexOrThrow31 = a.getColumnIndexOrThrow("extra_icon_key");
                    int columnIndexOrThrow32 = a.getColumnIndexOrThrow("extra_icon_nonce");
                    int columnIndexOrThrow33 = a.getColumnIndexOrThrow("extra_icon_encrypted_type");
                    int columnIndexOrThrow34 = a.getColumnIndexOrThrow("extra_copiable");
                    int columnIndexOrThrow35 = a.getColumnIndexOrThrow("extra_is_share_root");
                    int columnIndexOrThrow36 = a.getColumnIndexOrThrow("extra_is_external");
                    int columnIndexOrThrow37 = a.getColumnIndexOrThrow("extra_sub_type");
                    int columnIndexOrThrow38 = a.getColumnIndexOrThrow("is_visited");
                    int columnIndexOrThrow39 = a.getColumnIndexOrThrow("create_time");
                    int columnIndexOrThrow40 = a.getColumnIndexOrThrow("thumbnail_url");
                    int columnIndexOrThrow41 = a.getColumnIndexOrThrow("thumbnail_secret");
                    int columnIndexOrThrow42 = a.getColumnIndexOrThrow("thumbnail_nonce");
                    int columnIndexOrThrow43 = a.getColumnIndexOrThrow("thumbnail_type");
                    int columnIndexOrThrow44 = a.getColumnIndexOrThrow("permission");
                    int columnIndexOrThrow45 = a.getColumnIndexOrThrow("share_time");
                    int columnIndexOrThrow46 = a.getColumnIndexOrThrow("share_version");
                    int columnIndexOrThrow47 = a.getColumnIndexOrThrow("is_hidden");
                    int columnIndexOrThrow48 = a.getColumnIndexOrThrow("need_sync");
                    int columnIndexOrThrow49 = a.getColumnIndexOrThrow("size");
                    int columnIndexOrThrow50 = a.getColumnIndexOrThrow("thumbnail");
                    int columnIndexOrThrow51 = a.getColumnIndexOrThrow("document_icon_key");
                    int columnIndexOrThrow52 = a.getColumnIndexOrThrow("document_icon_type");
                    int columnIndexOrThrow53 = a.getColumnIndexOrThrow("document_icon_fsunit");
                    int columnIndexOrThrow54 = a.getColumnIndexOrThrow("app_id");
                    int columnIndexOrThrow55 = a.getColumnIndexOrThrow("doc_cache_status");
                    int columnIndexOrThrow56 = a.getColumnIndexOrThrow("is_offline_create");
                    int columnIndexOrThrow57 = a.getColumnIndexOrThrow("wiki_real_type");
                    int columnIndexOrThrow58 = a.getColumnIndexOrThrow("wiki_version");
                    int columnIndexOrThrow59 = a.getColumnIndexOrThrow("owner_type");
                    int columnIndexOrThrow60 = a.getColumnIndexOrThrow("is_share_folder");
                    int i5 = columnIndexOrThrow15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        C8200i iVar = new C8200i();
                        iVar.mo32025a(a.getString(columnIndexOrThrow));
                        iVar.mo32044e(a.getInt(columnIndexOrThrow2));
                        iVar.mo32100y(a.getString(columnIndexOrThrow3));
                        iVar.mo32102z(a.getString(columnIndexOrThrow4));
                        iVar.mo31989A(a.getString(columnIndexOrThrow5));
                        iVar.mo31991B(a.getString(columnIndexOrThrow6));
                        iVar.mo31993C(a.getString(columnIndexOrThrow7));
                        if (a.getInt(columnIndexOrThrow8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iVar.mo32066j(z);
                        iVar.mo32070l(a.getString(columnIndexOrThrow9));
                        iVar.mo32086r(a.getString(columnIndexOrThrow10));
                        iVar.mo32087s(a.getString(columnIndexOrThrow11));
                        if (a.getInt(columnIndexOrThrow12) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        iVar.mo32071l(z2);
                        if (a.getInt(columnIndexOrThrow13) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iVar.mo32074m(z3);
                        iVar.mo32064j(a.getInt(columnIndexOrThrow14));
                        iVar.mo32005I(a.getString(i5));
                        iVar.mo32025a(a.getString(columnIndexOrThrow16));
                        iVar.mo32033b(a.getString(columnIndexOrThrow17));
                        iVar.mo32037c(a.getString(columnIndexOrThrow18));
                        iVar.mo32041d(a.getString(columnIndexOrThrow19));
                        iVar.mo32045e(a.getString(columnIndexOrThrow20));
                        iVar.mo32049f(a.getString(columnIndexOrThrow21));
                        iVar.mo32053g(a.getString(columnIndexOrThrow22));
                        iVar.mo32057h(a.getString(columnIndexOrThrow23));
                        iVar.mo32061i(a.getString(columnIndexOrThrow24));
                        iVar.mo32065j(a.getString(columnIndexOrThrow25));
                        iVar.mo32067k(a.getString(columnIndexOrThrow26));
                        if (a.getInt(columnIndexOrThrow27) != 0) {
                            i = columnIndexOrThrow26;
                            z4 = true;
                        } else {
                            i = columnIndexOrThrow26;
                            z4 = false;
                        }
                        iVar.mo32026a(z4);
                        if (a.getInt(columnIndexOrThrow28) != 0) {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = true;
                        } else {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = false;
                        }
                        iVar.mo32034b(z5);
                        if (a.getInt(columnIndexOrThrow29) != 0) {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = true;
                        } else {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = false;
                        }
                        iVar.mo32038c(z6);
                        iVar.mo32073m(a.getString(columnIndexOrThrow30));
                        iVar.mo32077n(a.getString(columnIndexOrThrow31));
                        iVar.mo32080o(a.getString(columnIndexOrThrow32));
                        iVar.mo32024a(a.getInt(columnIndexOrThrow33));
                        if (a.getInt(columnIndexOrThrow34) != 0) {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = true;
                        } else {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = false;
                        }
                        iVar.mo32042d(z7);
                        if (a.getInt(columnIndexOrThrow35) != 0) {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = true;
                        } else {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = false;
                        }
                        iVar.mo32046e(z8);
                        if (a.getInt(columnIndexOrThrow36) != 0) {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = true;
                        } else {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = false;
                        }
                        iVar.mo32050f(z9);
                        iVar.mo32082p(a.getString(columnIndexOrThrow37));
                        if (a.getInt(columnIndexOrThrow38) != 0) {
                            i2 = columnIndexOrThrow37;
                            z10 = true;
                        } else {
                            i2 = columnIndexOrThrow37;
                            z10 = false;
                        }
                        iVar.mo32054g(z10);
                        iVar.mo32084q(a.getString(columnIndexOrThrow39));
                        iVar.mo32089t(a.getString(columnIndexOrThrow40));
                        iVar.mo32091u(a.getString(columnIndexOrThrow41));
                        iVar.mo32094v(a.getString(columnIndexOrThrow42));
                        iVar.mo32032b(a.getInt(columnIndexOrThrow43));
                        iVar.mo32036c(a.getInt(columnIndexOrThrow44));
                        iVar.mo32095w(a.getString(columnIndexOrThrow45));
                        iVar.mo32040d(a.getInt(columnIndexOrThrow46));
                        if (a.getInt(columnIndexOrThrow47) != 0) {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = true;
                        } else {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = false;
                        }
                        iVar.mo32058h(z11);
                        if (a.getInt(columnIndexOrThrow48) != 0) {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = true;
                        } else {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = false;
                        }
                        iVar.mo32062i(z12);
                        iVar.mo32098x(a.getString(columnIndexOrThrow49));
                        iVar.mo31999F(a.getString(columnIndexOrThrow50));
                        iVar.mo31995D(a.getString(columnIndexOrThrow51));
                        iVar.mo32048f(a.getInt(columnIndexOrThrow52));
                        iVar.mo31997E(a.getString(columnIndexOrThrow53));
                        iVar.mo32001G(a.getString(columnIndexOrThrow54));
                        iVar.mo32052g(a.getInt(columnIndexOrThrow55));
                        if (a.getInt(columnIndexOrThrow56) != 0) {
                            i3 = columnIndexOrThrow55;
                            z13 = true;
                        } else {
                            i3 = columnIndexOrThrow55;
                            z13 = false;
                        }
                        iVar.mo32068k(z13);
                        iVar.mo32056h(a.getInt(columnIndexOrThrow57));
                        iVar.mo32002H(a.getString(columnIndexOrThrow58));
                        iVar.mo32060i(a.getInt(columnIndexOrThrow59));
                        if (a.getInt(columnIndexOrThrow60) != 0) {
                            i4 = columnIndexOrThrow59;
                            z14 = true;
                        } else {
                            i4 = columnIndexOrThrow59;
                            z14 = false;
                        }
                        iVar.mo32078n(z14);
                        arrayList = arrayList;
                        arrayList.add(iVar);
                        columnIndexOrThrow60 = columnIndexOrThrow60;
                        columnIndexOrThrow = columnIndexOrThrow;
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                        i5 = i5;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow17 = columnIndexOrThrow17;
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        columnIndexOrThrow19 = columnIndexOrThrow19;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow23 = columnIndexOrThrow23;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        columnIndexOrThrow26 = i;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow30 = columnIndexOrThrow30;
                        columnIndexOrThrow31 = columnIndexOrThrow31;
                        columnIndexOrThrow32 = columnIndexOrThrow32;
                        columnIndexOrThrow33 = columnIndexOrThrow33;
                        columnIndexOrThrow37 = i2;
                        columnIndexOrThrow38 = columnIndexOrThrow38;
                        columnIndexOrThrow39 = columnIndexOrThrow39;
                        columnIndexOrThrow40 = columnIndexOrThrow40;
                        columnIndexOrThrow41 = columnIndexOrThrow41;
                        columnIndexOrThrow42 = columnIndexOrThrow42;
                        columnIndexOrThrow43 = columnIndexOrThrow43;
                        columnIndexOrThrow44 = columnIndexOrThrow44;
                        columnIndexOrThrow45 = columnIndexOrThrow45;
                        columnIndexOrThrow46 = columnIndexOrThrow46;
                        columnIndexOrThrow49 = columnIndexOrThrow49;
                        columnIndexOrThrow50 = columnIndexOrThrow50;
                        columnIndexOrThrow51 = columnIndexOrThrow51;
                        columnIndexOrThrow52 = columnIndexOrThrow52;
                        columnIndexOrThrow53 = columnIndexOrThrow53;
                        columnIndexOrThrow54 = columnIndexOrThrow54;
                        columnIndexOrThrow55 = i3;
                        columnIndexOrThrow56 = columnIndexOrThrow56;
                        columnIndexOrThrow57 = columnIndexOrThrow57;
                        columnIndexOrThrow58 = columnIndexOrThrow58;
                        columnIndexOrThrow59 = i4;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public int mo31917a(String str, String str2) {
        AbstractC1090f c = this.f21958s.mo7618c();
        this.f21940a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21958s.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21958s.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public int mo31942b(int i, String str) {
        AbstractC1090f c = this.f21951l.mo7618c();
        this.f21940a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21951l.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        c.bindLong(2, (long) i);
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21951l.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: e */
    public int mo31968e(int i, String str) {
        AbstractC1090f c = this.f21931B.mo7618c();
        this.f21940a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21931B.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        c.bindLong(2, (long) i);
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21931B.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31954c(int i, int i2) {
        AbstractC1090f c = this.f21935F.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            c.bindLong(2, (long) i2);
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21935F.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public int mo31943b(int i, List<String> list) {
        StringBuilder a = C1422a.m6520a();
        a.append("DELETE FROM ListTypes WHERE NOT obj_token IN(");
        int size = list.size();
        C1422a.m6521a(a, size);
        a.append(") AND list_type = ");
        a.append("?");
        AbstractC1090f a2 = this.f21940a.mo7534a(a.toString());
        int i2 = 1;
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i2);
            } else {
                a2.bindString(i2, str);
            }
            i2++;
        }
        a2.bindLong(size + 1, (long) i);
        this.f21940a.mo7546g();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31955c(int i, String str) {
        AbstractC1090f c = this.f21960u.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21960u.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: d */
    public int mo31964d(String str, int i) {
        AbstractC1090f c = this.f21939J.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21939J.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: e */
    public void mo31970e(String str, boolean z) {
        int i;
        AbstractC1090f c = this.f21936G.mo7618c();
        this.f21940a.mo7546g();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            c.executeUpdateDelete();
            this.f21940a.mo7549j();
        } finally {
            this.f21940a.mo7547h();
            this.f21936G.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public int mo31916a(int i, List<String> list) {
        StringBuilder a = C1422a.m6520a();
        a.append("DELETE FROM ListTypes WHERE obj_token IN(");
        int size = list.size();
        C1422a.m6521a(a, size);
        a.append(") AND list_type = ");
        a.append("?");
        AbstractC1090f a2 = this.f21940a.mo7534a(a.toString());
        int i2 = 1;
        for (String str : list) {
            if (str == null) {
                a2.bindNull(i2);
            } else {
                a2.bindString(i2, str);
            }
            i2++;
        }
        a2.bindLong(size + 1, (long) i);
        this.f21940a.mo7546g();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: d */
    public int mo31965d(String str, boolean z) {
        int i;
        AbstractC1090f c = this.f21933D.mo7618c();
        this.f21940a.mo7546g();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21933D.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public int mo31945b(String str, String str2) {
        AbstractC1090f c = this.f21962w.mo7618c();
        this.f21940a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21962w.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21962w.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: d */
    public LiveData<List<C8200i>> mo31967d(int i, String str) {
        final C1439h a = C1439h.m6573a("SELECT * FROM ListTypes AS LT LEFT OUTER JOIN DocMetaInfo AS DMI ON LT.obj_token = DMI.obj_token WHERE LT.list_type = ? AND LT.file_path= ?", 2);
        a.bindLong(1, (long) i);
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        return new AbstractC1154e<List<C8200i>>(this.f21940a.mo7548i()) {
            /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass32 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f21999i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<C8200i> mo6021c() {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                int i2;
                boolean z10;
                boolean z11;
                boolean z12;
                int i3;
                boolean z13;
                int i4;
                boolean z14;
                if (this.f21999i == null) {
                    this.f21999i = new C1429d.AbstractC1432b("ListTypes", "DocMetaInfo") {
                        /* class com.bytedance.ee.bear.list.cache.C8184h.AnonymousClass32.C81901 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            AnonymousClass32.this.mo6020b();
                        }
                    };
                    C8184h.this.f21940a.mo7550k().mo7598b(this.f21999i);
                }
                Cursor a = C8184h.this.f21940a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("list_type");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("token");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("extra");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("space_id");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("file_path");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("add_time_manualoffline");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("is_need_wifi_download");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("open_time_recent");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("my_edit_time_recent");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("activity_time_recent");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("has_perm_folder");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("show_external_hint_folder");
                    int columnIndexOrThrow14 = a.getColumnIndexOrThrow("node_type_folder");
                    int columnIndexOrThrow15 = a.getColumnIndexOrThrow("shortcut_name_folder");
                    int columnIndexOrThrow16 = a.getColumnIndexOrThrow("obj_token");
                    int columnIndexOrThrow17 = a.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow18 = a.getColumnIndexOrThrow(ShareHitPoint.f121869d);
                    int columnIndexOrThrow19 = a.getColumnIndexOrThrow("owner_id");
                    int columnIndexOrThrow20 = a.getColumnIndexOrThrow("create_tenant_id");
                    int columnIndexOrThrow21 = a.getColumnIndexOrThrow("creator_cn_name");
                    int columnIndexOrThrow22 = a.getColumnIndexOrThrow("creator_en_name");
                    int columnIndexOrThrow23 = a.getColumnIndexOrThrow("edit_uid");
                    int columnIndexOrThrow24 = a.getColumnIndexOrThrow("edit_time");
                    int columnIndexOrThrow25 = a.getColumnIndexOrThrow("url");
                    int columnIndexOrThrow26 = a.getColumnIndexOrThrow("fake_token");
                    int columnIndexOrThrow27 = a.getColumnIndexOrThrow("is_stared");
                    int columnIndexOrThrow28 = a.getColumnIndexOrThrow("is_pined");
                    int columnIndexOrThrow29 = a.getColumnIndexOrThrow("is_subscribed");
                    int columnIndexOrThrow30 = a.getColumnIndexOrThrow("extra_icon_url");
                    int columnIndexOrThrow31 = a.getColumnIndexOrThrow("extra_icon_key");
                    int columnIndexOrThrow32 = a.getColumnIndexOrThrow("extra_icon_nonce");
                    int columnIndexOrThrow33 = a.getColumnIndexOrThrow("extra_icon_encrypted_type");
                    int columnIndexOrThrow34 = a.getColumnIndexOrThrow("extra_copiable");
                    int columnIndexOrThrow35 = a.getColumnIndexOrThrow("extra_is_share_root");
                    int columnIndexOrThrow36 = a.getColumnIndexOrThrow("extra_is_external");
                    int columnIndexOrThrow37 = a.getColumnIndexOrThrow("extra_sub_type");
                    int columnIndexOrThrow38 = a.getColumnIndexOrThrow("is_visited");
                    int columnIndexOrThrow39 = a.getColumnIndexOrThrow("create_time");
                    int columnIndexOrThrow40 = a.getColumnIndexOrThrow("thumbnail_url");
                    int columnIndexOrThrow41 = a.getColumnIndexOrThrow("thumbnail_secret");
                    int columnIndexOrThrow42 = a.getColumnIndexOrThrow("thumbnail_nonce");
                    int columnIndexOrThrow43 = a.getColumnIndexOrThrow("thumbnail_type");
                    int columnIndexOrThrow44 = a.getColumnIndexOrThrow("permission");
                    int columnIndexOrThrow45 = a.getColumnIndexOrThrow("share_time");
                    int columnIndexOrThrow46 = a.getColumnIndexOrThrow("share_version");
                    int columnIndexOrThrow47 = a.getColumnIndexOrThrow("is_hidden");
                    int columnIndexOrThrow48 = a.getColumnIndexOrThrow("need_sync");
                    int columnIndexOrThrow49 = a.getColumnIndexOrThrow("size");
                    int columnIndexOrThrow50 = a.getColumnIndexOrThrow("thumbnail");
                    int columnIndexOrThrow51 = a.getColumnIndexOrThrow("document_icon_key");
                    int columnIndexOrThrow52 = a.getColumnIndexOrThrow("document_icon_type");
                    int columnIndexOrThrow53 = a.getColumnIndexOrThrow("document_icon_fsunit");
                    int columnIndexOrThrow54 = a.getColumnIndexOrThrow("app_id");
                    int columnIndexOrThrow55 = a.getColumnIndexOrThrow("doc_cache_status");
                    int columnIndexOrThrow56 = a.getColumnIndexOrThrow("is_offline_create");
                    int columnIndexOrThrow57 = a.getColumnIndexOrThrow("wiki_real_type");
                    int columnIndexOrThrow58 = a.getColumnIndexOrThrow("wiki_version");
                    int columnIndexOrThrow59 = a.getColumnIndexOrThrow("owner_type");
                    int columnIndexOrThrow60 = a.getColumnIndexOrThrow("is_share_folder");
                    int i5 = columnIndexOrThrow15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        C8200i iVar = new C8200i();
                        iVar.mo32025a(a.getString(columnIndexOrThrow));
                        iVar.mo32044e(a.getInt(columnIndexOrThrow2));
                        iVar.mo32100y(a.getString(columnIndexOrThrow3));
                        iVar.mo32102z(a.getString(columnIndexOrThrow4));
                        iVar.mo31989A(a.getString(columnIndexOrThrow5));
                        iVar.mo31991B(a.getString(columnIndexOrThrow6));
                        iVar.mo31993C(a.getString(columnIndexOrThrow7));
                        if (a.getInt(columnIndexOrThrow8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iVar.mo32066j(z);
                        iVar.mo32070l(a.getString(columnIndexOrThrow9));
                        iVar.mo32086r(a.getString(columnIndexOrThrow10));
                        iVar.mo32087s(a.getString(columnIndexOrThrow11));
                        if (a.getInt(columnIndexOrThrow12) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        iVar.mo32071l(z2);
                        if (a.getInt(columnIndexOrThrow13) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iVar.mo32074m(z3);
                        iVar.mo32064j(a.getInt(columnIndexOrThrow14));
                        iVar.mo32005I(a.getString(i5));
                        iVar.mo32025a(a.getString(columnIndexOrThrow16));
                        iVar.mo32033b(a.getString(columnIndexOrThrow17));
                        iVar.mo32037c(a.getString(columnIndexOrThrow18));
                        iVar.mo32041d(a.getString(columnIndexOrThrow19));
                        iVar.mo32045e(a.getString(columnIndexOrThrow20));
                        iVar.mo32049f(a.getString(columnIndexOrThrow21));
                        iVar.mo32053g(a.getString(columnIndexOrThrow22));
                        iVar.mo32057h(a.getString(columnIndexOrThrow23));
                        iVar.mo32061i(a.getString(columnIndexOrThrow24));
                        iVar.mo32065j(a.getString(columnIndexOrThrow25));
                        iVar.mo32067k(a.getString(columnIndexOrThrow26));
                        if (a.getInt(columnIndexOrThrow27) != 0) {
                            i = columnIndexOrThrow26;
                            z4 = true;
                        } else {
                            i = columnIndexOrThrow26;
                            z4 = false;
                        }
                        iVar.mo32026a(z4);
                        if (a.getInt(columnIndexOrThrow28) != 0) {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = true;
                        } else {
                            columnIndexOrThrow28 = columnIndexOrThrow28;
                            z5 = false;
                        }
                        iVar.mo32034b(z5);
                        if (a.getInt(columnIndexOrThrow29) != 0) {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = true;
                        } else {
                            columnIndexOrThrow29 = columnIndexOrThrow29;
                            z6 = false;
                        }
                        iVar.mo32038c(z6);
                        iVar.mo32073m(a.getString(columnIndexOrThrow30));
                        iVar.mo32077n(a.getString(columnIndexOrThrow31));
                        iVar.mo32080o(a.getString(columnIndexOrThrow32));
                        iVar.mo32024a(a.getInt(columnIndexOrThrow33));
                        if (a.getInt(columnIndexOrThrow34) != 0) {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = true;
                        } else {
                            columnIndexOrThrow34 = columnIndexOrThrow34;
                            z7 = false;
                        }
                        iVar.mo32042d(z7);
                        if (a.getInt(columnIndexOrThrow35) != 0) {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = true;
                        } else {
                            columnIndexOrThrow35 = columnIndexOrThrow35;
                            z8 = false;
                        }
                        iVar.mo32046e(z8);
                        if (a.getInt(columnIndexOrThrow36) != 0) {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = true;
                        } else {
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            z9 = false;
                        }
                        iVar.mo32050f(z9);
                        iVar.mo32082p(a.getString(columnIndexOrThrow37));
                        if (a.getInt(columnIndexOrThrow38) != 0) {
                            i2 = columnIndexOrThrow37;
                            z10 = true;
                        } else {
                            i2 = columnIndexOrThrow37;
                            z10 = false;
                        }
                        iVar.mo32054g(z10);
                        iVar.mo32084q(a.getString(columnIndexOrThrow39));
                        iVar.mo32089t(a.getString(columnIndexOrThrow40));
                        iVar.mo32091u(a.getString(columnIndexOrThrow41));
                        iVar.mo32094v(a.getString(columnIndexOrThrow42));
                        iVar.mo32032b(a.getInt(columnIndexOrThrow43));
                        iVar.mo32036c(a.getInt(columnIndexOrThrow44));
                        iVar.mo32095w(a.getString(columnIndexOrThrow45));
                        iVar.mo32040d(a.getInt(columnIndexOrThrow46));
                        if (a.getInt(columnIndexOrThrow47) != 0) {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = true;
                        } else {
                            columnIndexOrThrow47 = columnIndexOrThrow47;
                            z11 = false;
                        }
                        iVar.mo32058h(z11);
                        if (a.getInt(columnIndexOrThrow48) != 0) {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = true;
                        } else {
                            columnIndexOrThrow48 = columnIndexOrThrow48;
                            z12 = false;
                        }
                        iVar.mo32062i(z12);
                        iVar.mo32098x(a.getString(columnIndexOrThrow49));
                        iVar.mo31999F(a.getString(columnIndexOrThrow50));
                        iVar.mo31995D(a.getString(columnIndexOrThrow51));
                        iVar.mo32048f(a.getInt(columnIndexOrThrow52));
                        iVar.mo31997E(a.getString(columnIndexOrThrow53));
                        iVar.mo32001G(a.getString(columnIndexOrThrow54));
                        iVar.mo32052g(a.getInt(columnIndexOrThrow55));
                        if (a.getInt(columnIndexOrThrow56) != 0) {
                            i3 = columnIndexOrThrow55;
                            z13 = true;
                        } else {
                            i3 = columnIndexOrThrow55;
                            z13 = false;
                        }
                        iVar.mo32068k(z13);
                        iVar.mo32056h(a.getInt(columnIndexOrThrow57));
                        iVar.mo32002H(a.getString(columnIndexOrThrow58));
                        iVar.mo32060i(a.getInt(columnIndexOrThrow59));
                        if (a.getInt(columnIndexOrThrow60) != 0) {
                            i4 = columnIndexOrThrow59;
                            z14 = true;
                        } else {
                            i4 = columnIndexOrThrow59;
                            z14 = false;
                        }
                        iVar.mo32078n(z14);
                        arrayList = arrayList;
                        arrayList.add(iVar);
                        columnIndexOrThrow60 = columnIndexOrThrow60;
                        columnIndexOrThrow = columnIndexOrThrow;
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                        i5 = i5;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow17 = columnIndexOrThrow17;
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        columnIndexOrThrow19 = columnIndexOrThrow19;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow23 = columnIndexOrThrow23;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        columnIndexOrThrow26 = i;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow30 = columnIndexOrThrow30;
                        columnIndexOrThrow31 = columnIndexOrThrow31;
                        columnIndexOrThrow32 = columnIndexOrThrow32;
                        columnIndexOrThrow33 = columnIndexOrThrow33;
                        columnIndexOrThrow37 = i2;
                        columnIndexOrThrow38 = columnIndexOrThrow38;
                        columnIndexOrThrow39 = columnIndexOrThrow39;
                        columnIndexOrThrow40 = columnIndexOrThrow40;
                        columnIndexOrThrow41 = columnIndexOrThrow41;
                        columnIndexOrThrow42 = columnIndexOrThrow42;
                        columnIndexOrThrow43 = columnIndexOrThrow43;
                        columnIndexOrThrow44 = columnIndexOrThrow44;
                        columnIndexOrThrow45 = columnIndexOrThrow45;
                        columnIndexOrThrow46 = columnIndexOrThrow46;
                        columnIndexOrThrow49 = columnIndexOrThrow49;
                        columnIndexOrThrow50 = columnIndexOrThrow50;
                        columnIndexOrThrow51 = columnIndexOrThrow51;
                        columnIndexOrThrow52 = columnIndexOrThrow52;
                        columnIndexOrThrow53 = columnIndexOrThrow53;
                        columnIndexOrThrow54 = columnIndexOrThrow54;
                        columnIndexOrThrow55 = i3;
                        columnIndexOrThrow56 = columnIndexOrThrow56;
                        columnIndexOrThrow57 = columnIndexOrThrow57;
                        columnIndexOrThrow58 = columnIndexOrThrow58;
                        columnIndexOrThrow59 = i4;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31958c(String str, int i) {
        AbstractC1090f c = this.f21950k.mo7618c();
        this.f21940a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21950k.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        c.bindLong(2, (long) i);
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21950k.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public int mo31920a(String str, boolean z) {
        int i;
        AbstractC1090f c = this.f21955p.mo7618c();
        this.f21940a.mo7546g();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21955p.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public int mo31947b(String str, boolean z) {
        int i;
        AbstractC1090f c = this.f21956q.mo7618c();
        this.f21940a.mo7546g();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21956q.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31959c(String str, String str2) {
        AbstractC1090f c = this.f21964y.mo7618c();
        this.f21940a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21964y.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21964y.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: c */
    public int mo31956c(int i, String str, String str2) {
        AbstractC1090f c = this.f21932C.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            if (str2 == null) {
                c.bindNull(3);
            } else {
                c.bindString(3, str2);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21932C.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public int mo31918a(String str, String str2, int i) {
        AbstractC1090f c = this.f21953n.mo7618c();
        this.f21940a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21953n.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        c.bindLong(2, (long) i);
        if (str == null) {
            c.bindNull(3);
        } else {
            c.bindString(3, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21953n.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public int mo31919a(String str, String str2, String str3) {
        AbstractC1090f c = this.f21963x.mo7618c();
        this.f21940a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21963x.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str3 == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str3);
        }
        if (str == null) {
            c.bindNull(3);
        } else {
            c.bindString(3, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21963x.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public int mo31946b(String str, String str2, String str3) {
        AbstractC1090f c = this.f21965z.mo7618c();
        this.f21940a.mo7546g();
        if (str2 == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f21940a.mo7547h();
                this.f21965z.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str2);
        }
        if (str3 == null) {
            c.bindNull(2);
        } else {
            c.bindString(2, str3);
        }
        if (str == null) {
            c.bindNull(3);
        } else {
            c.bindString(3, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f21940a.mo7549j();
        this.f21940a.mo7547h();
        this.f21965z.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public int mo31914a(int i, int i2, int i3, String str) {
        AbstractC1090f c = this.f21961v.mo7618c();
        this.f21940a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            c.bindLong(2, (long) i2);
            c.bindLong(3, (long) i3);
            if (str == null) {
                c.bindNull(4);
            } else {
                c.bindString(4, str);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21961v.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: a */
    public int mo31915a(int i, String str, String str2, boolean z) {
        int i2;
        AbstractC1090f c = this.f21954o.mo7618c();
        this.f21940a.mo7546g();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            c.bindLong(1, (long) i2);
            if (str == null) {
                c.bindNull(2);
            } else {
                c.bindString(2, str);
            }
            c.bindLong(3, (long) i);
            if (str2 == null) {
                c.bindNull(4);
            } else {
                c.bindString(4, str2);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21954o.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8183g
    /* renamed from: b */
    public int mo31941b(int i, int i2, String str, int i3, boolean z, String str2) {
        AbstractC1090f c = this.f21948i.mo7618c();
        this.f21940a.mo7546g();
        long j = (long) i;
        int i4 = 1;
        try {
            c.bindLong(1, j);
            c.bindLong(2, (long) i2);
            if (str == null) {
                c.bindNull(3);
            } else {
                c.bindString(3, str);
            }
            c.bindLong(4, (long) i3);
            if (!z) {
                i4 = 0;
            }
            c.bindLong(5, (long) i4);
            if (str2 == null) {
                c.bindNull(6);
            } else {
                c.bindString(6, str2);
            }
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21940a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21940a.mo7547h();
            this.f21948i.mo7616a(c);
        }
    }
}
