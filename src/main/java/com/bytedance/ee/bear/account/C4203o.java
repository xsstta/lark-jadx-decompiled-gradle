package com.bytedance.ee.bear.account;

import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.room.AbstractC1421b;
import androidx.room.AbstractC1428c;
import androidx.room.AbstractC1440i;
import androidx.room.C1439h;
import androidx.room.EmptyResultSetException;
import androidx.room.RoomDatabase;
import io.reactivex.Single;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.ee.bear.account.o */
public final class C4203o implements AbstractC4202n {

    /* renamed from: a */
    public final RoomDatabase f12707a;

    /* renamed from: b */
    private final AbstractC1428c f12708b;

    /* renamed from: c */
    private final AbstractC1421b f12709c;

    /* renamed from: d */
    private final AbstractC1421b f12710d;

    /* renamed from: e */
    private final AbstractC1440i f12711e;

    @Override // com.bytedance.ee.bear.account.AbstractC4202n
    /* renamed from: a */
    public Single<C4201m> mo16518a() {
        final C1439h a = C1439h.m6573a("SELECT * FROM user WHERE state = 1 LIMIT 1", 0);
        return Single.fromCallable(new Callable<C4201m>() {
            /* class com.bytedance.ee.bear.account.C4203o.CallableC42085 */

            /* access modifiers changed from: protected */
            @Override // java.lang.Object
            public void finalize() {
                a.mo7613a();
            }

            /* renamed from: a */
            public C4201m call() throws Exception {
                Throwable th;
                C4201m mVar;
                boolean z;
                boolean z2;
                boolean z3;
                Cursor a = C4203o.this.f12707a.mo7532a(a);
                try {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("uid");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("cn_name");
                    int columnIndexOrThrow3 = a.getColumnIndexOrThrow("en_name");
                    int columnIndexOrThrow4 = a.getColumnIndexOrThrow("organization");
                    int columnIndexOrThrow5 = a.getColumnIndexOrThrow("email");
                    int columnIndexOrThrow6 = a.getColumnIndexOrThrow("mobile");
                    int columnIndexOrThrow7 = a.getColumnIndexOrThrow("avatar_url");
                    int columnIndexOrThrow8 = a.getColumnIndexOrThrow("openid");
                    int columnIndexOrThrow9 = a.getColumnIndexOrThrow("token");
                    int columnIndexOrThrow10 = a.getColumnIndexOrThrow("tenant_id");
                    int columnIndexOrThrow11 = a.getColumnIndexOrThrow("department_id");
                    int columnIndexOrThrow12 = a.getColumnIndexOrThrow("tenant_name");
                    int columnIndexOrThrow13 = a.getColumnIndexOrThrow("state");
                    int columnIndexOrThrow14 = a.getColumnIndexOrThrow("can_create_sheet");
                    try {
                        int columnIndexOrThrow15 = a.getColumnIndexOrThrow("can_cross");
                        int columnIndexOrThrow16 = a.getColumnIndexOrThrow("domain");
                        int columnIndexOrThrow17 = a.getColumnIndexOrThrow("is_singleproduct");
                        int columnIndexOrThrow18 = a.getColumnIndexOrThrow("tenant_tag");
                        int columnIndexOrThrow19 = a.getColumnIndexOrThrow("is_manager");
                        if (a.moveToFirst()) {
                            mVar = new C4201m();
                            mVar.mo16477a(a.getString(columnIndexOrThrow));
                            mVar.mo16480b(a.getString(columnIndexOrThrow2));
                            mVar.mo16483c(a.getString(columnIndexOrThrow3));
                            mVar.mo16486d(a.getString(columnIndexOrThrow4));
                            mVar.mo16489e(a.getString(columnIndexOrThrow5));
                            mVar.mo16492f(a.getString(columnIndexOrThrow6));
                            mVar.mo16494g(a.getString(columnIndexOrThrow7));
                            mVar.mo16496h(a.getString(columnIndexOrThrow8));
                            mVar.mo16499i(a.getString(columnIndexOrThrow9));
                            mVar.mo16501j(a.getString(columnIndexOrThrow10));
                            mVar.mo16503k(a.getString(columnIndexOrThrow11));
                            mVar.mo16505l(a.getString(columnIndexOrThrow12));
                            mVar.mo16475a(a.getInt(columnIndexOrThrow13));
                            boolean z4 = true;
                            if (a.getInt(columnIndexOrThrow14) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            mVar.mo16487d(z);
                            if (a.getInt(columnIndexOrThrow15) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            mVar.mo16481b(z2);
                            mVar.mo16506m(a.getString(columnIndexOrThrow16));
                            if (a.getInt(columnIndexOrThrow17) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            mVar.mo16484c(z3);
                            mVar.mo16509n(a.getString(columnIndexOrThrow18));
                            if (a.getInt(columnIndexOrThrow19) == 0) {
                                z4 = false;
                            }
                            mVar.mo16478a(z4);
                        } else {
                            mVar = null;
                        }
                        if (mVar != null) {
                            a.close();
                            return mVar;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Query returned empty result set: ");
                        try {
                            sb.append(a.mo5696b());
                            throw new EmptyResultSetException(sb.toString());
                        } catch (Throwable th2) {
                            th = th2;
                            a.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        a.close();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    a.close();
                    throw th;
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.account.AbstractC4202n
    /* renamed from: c */
    public int mo16521c() {
        AbstractC1090f c = this.f12711e.mo7618c();
        this.f12707a.mo7546g();
        try {
            int executeUpdateDelete = c.executeUpdateDelete();
            this.f12707a.mo7549j();
            return executeUpdateDelete;
        } finally {
            this.f12707a.mo7547h();
            this.f12711e.mo7616a(c);
        }
    }

    @Override // com.bytedance.ee.bear.account.AbstractC4202n
    /* renamed from: b */
    public C4201m mo16519b() {
        C1439h hVar;
        Throwable th;
        C4201m mVar;
        boolean z;
        boolean z2;
        boolean z3;
        C1439h a = C1439h.m6573a("SELECT * FROM user WHERE state = 1 LIMIT 1", 0);
        Cursor a2 = this.f12707a.mo7532a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("cn_name");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("en_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("organization");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("email");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("mobile");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("avatar_url");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("openid");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("token");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("tenant_id");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("department_id");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("tenant_name");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("can_create_sheet");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("can_cross");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("domain");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("is_singleproduct");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("tenant_tag");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("is_manager");
                if (a2.moveToFirst()) {
                    mVar = new C4201m();
                    mVar.mo16477a(a2.getString(columnIndexOrThrow));
                    mVar.mo16480b(a2.getString(columnIndexOrThrow2));
                    mVar.mo16483c(a2.getString(columnIndexOrThrow3));
                    mVar.mo16486d(a2.getString(columnIndexOrThrow4));
                    mVar.mo16489e(a2.getString(columnIndexOrThrow5));
                    mVar.mo16492f(a2.getString(columnIndexOrThrow6));
                    mVar.mo16494g(a2.getString(columnIndexOrThrow7));
                    mVar.mo16496h(a2.getString(columnIndexOrThrow8));
                    mVar.mo16499i(a2.getString(columnIndexOrThrow9));
                    mVar.mo16501j(a2.getString(columnIndexOrThrow10));
                    mVar.mo16503k(a2.getString(columnIndexOrThrow11));
                    mVar.mo16505l(a2.getString(columnIndexOrThrow12));
                    mVar.mo16475a(a2.getInt(columnIndexOrThrow13));
                    boolean z4 = true;
                    if (a2.getInt(columnIndexOrThrow14) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mVar.mo16487d(z);
                    if (a2.getInt(columnIndexOrThrow15) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    mVar.mo16481b(z2);
                    mVar.mo16506m(a2.getString(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mVar.mo16484c(z3);
                    mVar.mo16509n(a2.getString(columnIndexOrThrow18));
                    if (a2.getInt(columnIndexOrThrow19) == 0) {
                        z4 = false;
                    }
                    mVar.mo16478a(z4);
                } else {
                    mVar = null;
                }
                a2.close();
                hVar.mo7613a();
                return mVar;
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

    @Override // com.bytedance.ee.bear.account.AbstractC4202n
    /* renamed from: a */
    public int mo16517a(C4201m... mVarArr) {
        this.f12707a.mo7546g();
        try {
            int a = this.f12710d.mo7569a((Object[]) mVarArr) + 0;
            this.f12707a.mo7549j();
            return a;
        } finally {
            this.f12707a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.account.AbstractC4202n
    /* renamed from: b */
    public Long[] mo16520b(C4201m... mVarArr) {
        this.f12707a.mo7546g();
        try {
            Long[] b = this.f12708b.mo7592b(mVarArr);
            this.f12707a.mo7549j();
            return b;
        } finally {
            this.f12707a.mo7547h();
        }
    }

    @Override // com.bytedance.ee.bear.account.AbstractC4202n
    /* renamed from: c */
    public int mo16522c(C4201m... mVarArr) {
        this.f12707a.mo7546g();
        try {
            int a = this.f12709c.mo7569a((Object[]) mVarArr) + 0;
            this.f12707a.mo7549j();
            return a;
        } finally {
            this.f12707a.mo7547h();
        }
    }

    public C4203o(RoomDatabase roomDatabase) {
        this.f12707a = roomDatabase;
        this.f12708b = new AbstractC1428c<C4201m>(roomDatabase) {
            /* class com.bytedance.ee.bear.account.C4203o.C42041 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "INSERT OR ABORT INTO `user`(`uid`,`cn_name`,`en_name`,`organization`,`email`,`mobile`,`avatar_url`,`openid`,`token`,`tenant_id`,`department_id`,`tenant_name`,`state`,`can_create_sheet`,`can_cross`,`domain`,`is_singleproduct`,`tenant_tag`,`is_manager`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo7588a(AbstractC1090f fVar, C4201m mVar) {
                if (mVar.mo16474a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, mVar.mo16474a());
                }
                if (mVar.mo16479b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, mVar.mo16479b());
                }
                if (mVar.mo16482c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, mVar.mo16482c());
                }
                if (mVar.mo16485d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, mVar.mo16485d());
                }
                if (mVar.mo16488e() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, mVar.mo16488e());
                }
                if (mVar.mo16491f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, mVar.mo16491f());
                }
                if (mVar.mo16493g() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, mVar.mo16493g());
                }
                if (mVar.mo16495h() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, mVar.mo16495h());
                }
                if (mVar.mo16498i() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, mVar.mo16498i());
                }
                if (mVar.mo16502k() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, mVar.mo16502k());
                }
                if (mVar.mo16504l() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, mVar.mo16504l());
                }
                if (mVar.mo16508n() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, mVar.mo16508n());
                }
                fVar.bindLong(13, (long) mVar.mo16500j());
                fVar.bindLong(14, mVar.mo16515t() ? 1 : 0);
                fVar.bindLong(15, mVar.mo16510o() ? 1 : 0);
                if (mVar.mo16511p() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, mVar.mo16511p());
                }
                fVar.bindLong(17, mVar.mo16512q() ? 1 : 0);
                if (mVar.mo16513r() == null) {
                    fVar.bindNull(18);
                } else {
                    fVar.bindString(18, mVar.mo16513r());
                }
                fVar.bindLong(19, mVar.mo16507m() ? 1 : 0);
            }
        };
        this.f12709c = new AbstractC1421b<C4201m>(roomDatabase) {
            /* class com.bytedance.ee.bear.account.C4203o.C42052 */

            @Override // androidx.room.AbstractC1421b, androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM `user` WHERE `uid` = ?";
            }

            /* renamed from: a */
            public void mo7571a(AbstractC1090f fVar, C4201m mVar) {
                if (mVar.mo16474a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, mVar.mo16474a());
                }
            }
        };
        this.f12710d = new AbstractC1421b<C4201m>(roomDatabase) {
            /* class com.bytedance.ee.bear.account.C4203o.C42063 */

            @Override // androidx.room.AbstractC1421b, androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "UPDATE OR ABORT `user` SET `uid` = ?,`cn_name` = ?,`en_name` = ?,`organization` = ?,`email` = ?,`mobile` = ?,`avatar_url` = ?,`openid` = ?,`token` = ?,`tenant_id` = ?,`department_id` = ?,`tenant_name` = ?,`state` = ?,`can_create_sheet` = ?,`can_cross` = ?,`domain` = ?,`is_singleproduct` = ?,`tenant_tag` = ?,`is_manager` = ? WHERE `uid` = ?";
            }

            /* renamed from: a */
            public void mo7571a(AbstractC1090f fVar, C4201m mVar) {
                if (mVar.mo16474a() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, mVar.mo16474a());
                }
                if (mVar.mo16479b() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, mVar.mo16479b());
                }
                if (mVar.mo16482c() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, mVar.mo16482c());
                }
                if (mVar.mo16485d() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, mVar.mo16485d());
                }
                if (mVar.mo16488e() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, mVar.mo16488e());
                }
                if (mVar.mo16491f() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, mVar.mo16491f());
                }
                if (mVar.mo16493g() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, mVar.mo16493g());
                }
                if (mVar.mo16495h() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, mVar.mo16495h());
                }
                if (mVar.mo16498i() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, mVar.mo16498i());
                }
                if (mVar.mo16502k() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, mVar.mo16502k());
                }
                if (mVar.mo16504l() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, mVar.mo16504l());
                }
                if (mVar.mo16508n() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, mVar.mo16508n());
                }
                fVar.bindLong(13, (long) mVar.mo16500j());
                fVar.bindLong(14, mVar.mo16515t() ? 1 : 0);
                fVar.bindLong(15, mVar.mo16510o() ? 1 : 0);
                if (mVar.mo16511p() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, mVar.mo16511p());
                }
                fVar.bindLong(17, mVar.mo16512q() ? 1 : 0);
                if (mVar.mo16513r() == null) {
                    fVar.bindNull(18);
                } else {
                    fVar.bindString(18, mVar.mo16513r());
                }
                fVar.bindLong(19, mVar.mo16507m() ? 1 : 0);
                if (mVar.mo16474a() == null) {
                    fVar.bindNull(20);
                } else {
                    fVar.bindString(20, mVar.mo16474a());
                }
            }
        };
        this.f12711e = new AbstractC1440i(roomDatabase) {
            /* class com.bytedance.ee.bear.account.C4203o.C42074 */

            @Override // androidx.room.AbstractC1440i
            /* renamed from: a */
            public String mo7570a() {
                return "DELETE FROM user";
            }
        };
    }
}
