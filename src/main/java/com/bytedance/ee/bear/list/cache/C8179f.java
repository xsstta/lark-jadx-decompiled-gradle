package com.bytedance.ee.bear.list.cache;

import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* renamed from: com.bytedance.ee.bear.list.cache.f */
public final class C8179f implements AbstractC8178e {

    /* renamed from: a */
    private final RoomDatabase f21923a;

    /* renamed from: b */
    private final AbstractC1428c f21924b;

    /* renamed from: c */
    private final AbstractC1440i f21925c;

    /* renamed from: d */
    private final AbstractC1440i f21926d;

    public C8179f(RoomDatabase roomDatabase) {
        this.f21923a = roomDatabase;
        this.f21924b = new AbstractC1428c<FolderSortStrategy>(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8179f.C81801 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `FolderSortStrategy`(`obj_token`,`type`,`file_type`,`forbidden_file_type`,`strategy`,`is_asc`,`update_time`,`user_id`) VALUES (?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, FolderSortStrategy folderSortStrategy) {
                if (folderSortStrategy.mo31545a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, folderSortStrategy.mo31545a());
                }
                fVar.bindLong(2, (long) folderSortStrategy.mo31554d());
                if (folderSortStrategy.mo31560f() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, folderSortStrategy.mo31560f());
                }
                if (folderSortStrategy.mo31561g() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, folderSortStrategy.mo31561g());
                }
                fVar.bindLong(5, (long) folderSortStrategy.mo31549b());
                fVar.bindLong(6, folderSortStrategy.mo31558e() ? 1 : 0);
                if (folderSortStrategy.mo31552c() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, folderSortStrategy.mo31552c());
                }
                if (folderSortStrategy.mo31562h() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, folderSortStrategy.mo31562h());
                }
            }
        };
        this.f21925c = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8179f.C81812 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM FolderSortStrategy WHERE obj_token IN(SELECT obj_token FROM FolderSortStrategy order by update_time asc limit ?)";
            }
        };
        this.f21926d = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.list.cache.C8179f.C81823 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM FolderSortStrategy";
            }
        };
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8178e
    /* renamed from: a */
    public long mo31911a(FolderSortStrategy folderSortStrategy) {
        this.f21923a.mo7546g();
        try {
            long a = this.f21924b.mo7587a(folderSortStrategy);
            this.f21923a.mo7549j();
            return a;
        } finally {
            this.f21923a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8178e
    /* renamed from: a */
    public int mo31910a(int i) {
        AbstractC1090f c = this.f21925c.mo7618c();
        this.f21923a.mo7546g();
        try {
            c.bindLong(1, (long) i);
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f21923a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f21923a.mo7547h();
            this.f21925c.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.list.cache.AbstractC8178e
    /* renamed from: a */
    public FolderSortStrategy mo31912a(String str) {
        FolderSortStrategy folderSortStrategy;
        boolean z = true;
        C1439h a = C1439h.m6573a("SELECT * FROM FolderSortStrategy WHERE obj_token= ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.f21923a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("obj_token");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow(ShareHitPoint.f121869d);
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("file_type");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("forbidden_file_type");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("strategy");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("is_asc");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("update_time");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("user_id");
            if (a2.moveToFirst()) {
                folderSortStrategy = new FolderSortStrategy();
                folderSortStrategy.mo31547a(a2.getString(columnIndexOrThrow));
                folderSortStrategy.mo31550b(a2.getInt(columnIndexOrThrow2));
                folderSortStrategy.mo31553c(a2.getString(columnIndexOrThrow3));
                folderSortStrategy.mo31555d(a2.getString(columnIndexOrThrow4));
                folderSortStrategy.mo31546a(a2.getInt(columnIndexOrThrow5));
                if (a2.getInt(columnIndexOrThrow6) == 0) {
                    z = false;
                }
                folderSortStrategy.mo31548a(z);
                folderSortStrategy.mo31551b(a2.getString(columnIndexOrThrow7));
                folderSortStrategy.mo31557e(a2.getString(columnIndexOrThrow8));
            } else {
                folderSortStrategy = null;
            }
            return folderSortStrategy;
        } finally {
            a2.close();
            a.mo7613a();
        }
    }
}
