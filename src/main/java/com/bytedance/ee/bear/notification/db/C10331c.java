package com.bytedance.ee.bear.notification.db;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1154e;
import androidx.lifecycle.LiveData;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1429d;
import androidx.room.C1439h;
import androidx.room.RoomDatabase;
import com.bytedance.ee.bear.notification.bean.Notification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.notification.db.c */
public final class C10331c implements AbstractC10330b {

    /* renamed from: a */
    public final RoomDatabase f27834a;

    /* renamed from: b */
    public final C10327a f27835b = new C10327a();

    /* renamed from: c */
    private final AbstractC1428c f27836c;

    /* renamed from: d */
    private final AbstractC1440i f27837d;

    /* renamed from: e */
    private final AbstractC1440i f27838e;

    /* renamed from: f */
    private final AbstractC1440i f27839f;

    @Override // com.bytedance.ee.bear.notification.db.AbstractC10330b
    /* renamed from: a */
    public int mo39439a() {
        AbstractC1090f c = this.f27837d.mo7618c();
        this.f27834a.mo7546g();
        try {
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f27834a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f27834a.mo7547h();
            this.f27837d.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.notification.db.AbstractC10330b
    /* renamed from: b */
    public List<String> mo39445b() {
        C1439h a = C1439h.m6573a("SELECT id FROM Notification WHERE close = 1", 0);
        Cursor a2 = this.f27834a.mo7532a(a);
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

    @Override // com.bytedance.ee.bear.notification.db.AbstractC10330b
    /* renamed from: a */
    public LiveData<List<Notification>> mo39440a(long j) {
        final C1439h a = C1439h.m6573a("SELECT * FROM Notification WHERE end_time> ? and close = 0", 1);
        a.bindLong(1, j);
        return new AbstractC1154e<List<Notification>>(this.f27834a.mo7548i()) {
            /* class com.bytedance.ee.bear.notification.db.C10331c.C103365 */

            /* renamed from: i */
            private C1429d.AbstractC1432b f27846i;

            /* access modifiers changed from: protected */
            public void finalize() {
                a.mo7613a();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public List<Notification> mo6021c() {
                boolean z;
                if (this.f27846i == null) {
                    this.f27846i = new C1429d.AbstractC1432b("Notification", new String[0]) {
                        /* class com.bytedance.ee.bear.notification.db.C10331c.C103365.C103371 */

                        @Override // androidx.room.C1429d.AbstractC1432b
                        /* renamed from: a */
                        public void mo7606a(Set<String> set) {
                            C103365.this.mo6020b();
                        }
                    };
                    C10331c.this.f27834a.mo7550k().mo7598b(this.f27846i);
                }
                Cursor a = C10331c.this.f27834a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("start_time");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("end_time");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("content");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("product");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("close");
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        Notification notification = new Notification();
                        notification.setId(a.getString(columnIndexOrThrow));
                        notification.setStart_time(a.getLong(columnIndexOrThrow2));
                        notification.setEnd_time(a.getLong(columnIndexOrThrow3));
                        notification.setContent(C10331c.this.f27835b.mo39435a(a.getString(columnIndexOrThrow4)));
                        notification.setProducts(C10331c.this.f27835b.mo39438b(a.getString(columnIndexOrThrow5)));
                        if (a.getInt(columnIndexOrThrow6) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        notification.setClose(z);
                        arrayList.add(notification);
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }.mo6019a();
    }

    public C10331c(RoomDatabase roomDatabase) {
        this.f27834a = roomDatabase;
        this.f27836c = new AbstractC1428c<Notification>(roomDatabase) {
            /* class com.bytedance.ee.bear.notification.db.C10331c.C103321 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR REPLACE INTO `Notification`(`id`,`start_time`,`end_time`,`content`,`product`,`close`) VALUES (?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, Notification notification) {
                if (notification.getId() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, notification.getId());
                }
                fVar.bindLong(2, notification.getStart_time());
                fVar.bindLong(3, notification.getEnd_time());
                String a = C10331c.this.f27835b.mo39436a(notification.getContent());
                if (a == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, a);
                }
                String a2 = C10331c.this.f27835b.mo39437a(notification.getProducts());
                if (a2 == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, a2);
                }
                fVar.bindLong(6, notification.isClose() ? 1 : 0);
            }
        };
        this.f27837d = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.notification.db.C10331c.C103332 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM Notification ";
            }
        };
        this.f27838e = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.notification.db.C10331c.C103343 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM Notification WHERE id= ?";
            }
        };
        this.f27839f = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.notification.db.C10331c.C103354 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE Notification SET close = 1 WHERE id = ?";
            }
        };
    }

    @Override // com.bytedance.ee.bear.notification.db.AbstractC10330b
    /* renamed from: b */
    public int mo39444b(String str) {
        AbstractC1090f c = this.f27839f.mo7618c();
        this.f27834a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f27834a.mo7547h();
                this.f27839f.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        int executeUpdateDelete = c.executeUpdateDelete();
        this.f27834a.mo7549j();
        this.f27834a.mo7547h();
        this.f27839f.mo7616a(c);
        return executeUpdateDelete;
    }

    @Override // com.bytedance.ee.bear.notification.db.AbstractC10330b
    /* renamed from: a */
    public void mo39441a(String str) {
        AbstractC1090f c = this.f27838e.mo7618c();
        this.f27834a.mo7546g();
        if (str == null) {
            try {
                c.bindNull(1);
            } catch (Throwable th) {
                this.f27834a.mo7547h();
                this.f27838e.mo7616a(c);
                throw th;
            }
        } else {
            c.bindString(1, str);
        }
        c.executeUpdateDelete();
        this.f27834a.mo7549j();
        this.f27834a.mo7547h();
        this.f27838e.mo7616a(c);
    }

    @Override // com.bytedance.ee.bear.notification.db.AbstractC10330b
    /* renamed from: a */
    public long[] mo39442a(List<Notification> list) {
        this.f27834a.mo7546g();
        try {
            long[] a = this.f27836c.mo7590a((Collection) list);
            this.f27834a.mo7549j();
            return a;
        } finally {
            this.f27834a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.notification.db.AbstractC10330b
    /* renamed from: a */
    public long[] mo39443a(Notification... notificationArr) {
        this.f27834a.mo7546g();
        try {
            long[] a = this.f27836c.mo7591a((Object[]) notificationArr);
            this.f27834a.mo7549j();
            return a;
        } finally {
            this.f27834a.mo7547h();
        }
    }
}
