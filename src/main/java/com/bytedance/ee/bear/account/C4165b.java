package com.bytedance.ee.bear.account;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.ee.bear.account.C4165b;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.db.DBController;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.account.b */
public class C4165b {

    /* renamed from: a */
    private C4193g f12625a;

    /* renamed from: f */
    private C4193g m17299f() {
        if (this.f12625a == null) {
            this.f12625a = new C4193g();
        }
        return this.f12625a;
    }

    /* renamed from: e */
    private synchronized AbstractC4202n m17298e() {
        return ((UserDatabase) DBController.m55314a().mo50590b("docs_user.db")).mo16369m();
    }

    /* renamed from: c */
    public void mo16385c() {
        try {
            m17298e().mo16521c();
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: d */
    public Single<Boolean> mo16386d() {
        return Single.create(new AbstractC69013u() {
            /* class com.bytedance.ee.bear.account.$$Lambda$b$6lNYiGTxLdbfzNz5huOmY_wuzI */

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                C4165b.m269065lambda$6lNYiGTxLdbfzNz5huOmY_wuzI(C4165b.this, sVar);
            }
        }).subscribeOn(C11678b.m48479c());
    }

    /* renamed from: b */
    public C4201m mo16382b() {
        C4201m b = m17298e().mo16519b();
        if (b == null) {
            C13479a.m54758a("AccountDbManager", "findLoginUserBlocked(): DB user is null");
        } else {
            C13479a.m54764b("AccountDbManager", " findLoginUserBlocked(): DB user uid = " + b.mo16474a());
        }
        return b;
    }

    /* renamed from: a */
    public Single<C4201m> mo16378a() {
        return m17298e().mo16518a().subscribeOn(C11678b.m48479c());
    }

    /* renamed from: com.bytedance.ee.bear.account.b$a */
    public static class C4175a implements Function<C4201m, Single<Boolean>> {

        /* renamed from: a */
        private C4165b f12637a;

        public C4175a(C4165b bVar) {
            this.f12637a = bVar;
        }

        /* renamed from: a */
        public Single<Boolean> apply(C4201m mVar) {
            return Single.create(new AbstractC69013u(mVar) {
                /* class com.bytedance.ee.bear.account.$$Lambda$b$a$HettiOXdwzt907A68saTr7lfmIs */
                public final /* synthetic */ C4201m f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.AbstractC69013u
                public final void subscribe(AbstractC69011s sVar) {
                    C4165b.C4175a.lambda$HettiOXdwzt907A68saTr7lfmIs(C4165b.C4175a.this, this.f$1, sVar);
                }
            });
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m17320a(C4201m mVar, AbstractC69011s sVar) {
            synchronized (C4165b.class) {
                mVar.mo16475a(1);
                this.f12637a.mo16385c();
                this.f12637a.mo16383b(mVar);
                C13479a.m54764b("AccountDbManager", "LoginFun  apply : " + mVar);
                if (!sVar.isDisposed()) {
                    sVar.onSuccess(true);
                }
            }
        }
    }

    /* renamed from: c */
    public Single<Boolean> mo16384c(C4201m mVar) {
        return Single.create(new AbstractC69013u(mVar) {
            /* class com.bytedance.ee.bear.account.$$Lambda$b$qMuuzQ70o5M7RUMqayR_Zx3AE20 */
            public final /* synthetic */ C4201m f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                C4165b.lambda$qMuuzQ70o5M7RUMqayR_Zx3AE20(C4165b.this, this.f$1, sVar);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m17293a(AbstractC69011s sVar) {
        synchronized (C4165b.class) {
            C4201m b = m17298e().mo16519b();
            if (b != null) {
                if (m17298e().mo16522c(b) > 0) {
                    C13479a.m54758a("AccountDbManager", "logoutFlow() delete suc");
                } else {
                    C13479a.m54758a("AccountDbManager", "logoutFlow() delete fail");
                }
                if (!sVar.isDisposed()) {
                    sVar.onSuccess(true);
                }
            } else if (!sVar.isDisposed()) {
                sVar.onSuccess(false);
            }
        }
    }

    /* renamed from: b */
    public void mo16383b(C4201m mVar) {
        if (TextUtils.isEmpty(mVar.mo16498i()) || TextUtils.isEmpty(mVar.mo16474a())) {
            C13479a.m54758a("AccountDbManager", "insert user error, user = ");
            return;
        }
        Long[] b = m17298e().mo16520b(mVar);
        if (b == null || b.length <= 0) {
            C13479a.m54758a("AccountDbManager", "insertUser()... fail");
        } else {
            C13479a.m54758a("AccountDbManager", "insertUser()... suc");
        }
    }

    public C4165b(Context context) {
        synchronized (C4165b.class) {
            DBController.m55314a().mo50588a("docs_user.db", new DBController.C13632a(context).mo50597a("docs_user.db").mo50596a(UserDatabase.class).mo50598a(new AbstractC1420a(1, 2) {
                /* class com.bytedance.ee.bear.account.C4165b.C41661 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    bVar.execSQL("ALTER TABLE user ADD COLUMN tmp_uid TEXT");
                    C13479a.m54772d("AccountDbManager", "users database migration: 1 —> 2 ");
                }
            }, new C4197k(), new AbstractC1420a(3, 4) {
                /* class com.bytedance.ee.bear.account.C4165b.C41694 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    bVar.execSQL("ALTER TABLE user ADD COLUMN tenant_id TEXT");
                    C13479a.m54772d("AccountDbManager", "users database migration: 3 —> 4 ");
                }
            }, new AbstractC1420a(4, 5) {
                /* class com.bytedance.ee.bear.account.C4165b.C41705 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    bVar.execSQL("ALTER TABLE user ADD COLUMN department_id TEXT");
                    C13479a.m54772d("AccountDbManager", "users database migration: 4 —> 5 ");
                }
            }, new AbstractC1420a(5, 6) {
                /* class com.bytedance.ee.bear.account.C4165b.C41716 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    C13479a.m54772d("AccountDbManager", "users database migration: 5 —> 6 ");
                }
            }, new C4199l(), new AbstractC1420a(7, 8) {
                /* class com.bytedance.ee.bear.account.C4165b.C41727 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    bVar.execSQL("ALTER TABLE user ADD COLUMN tenant_name TEXT");
                }
            }, new AbstractC1420a(8, 9) {
                /* class com.bytedance.ee.bear.account.C4165b.C41738 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    bVar.execSQL("ALTER TABLE user ADD COLUMN can_create_sheet INTEGER NOT NULL DEFAULT 0");
                }
            }, new AbstractC1420a(9, 10) {
                /* class com.bytedance.ee.bear.account.C4165b.C41749 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    bVar.execSQL("ALTER TABLE user ADD COLUMN can_cross INTEGER NOT NULL DEFAULT 0");
                }
            }, new AbstractC1420a(10, 11) {
                /* class com.bytedance.ee.bear.account.C4165b.AnonymousClass10 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    bVar.execSQL("ALTER TABLE user ADD COLUMN domain TEXT");
                }
            }, new AbstractC1420a(11, 12) {
                /* class com.bytedance.ee.bear.account.C4165b.AnonymousClass11 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    C13479a.m54764b("AccountDbManager", "migrate 11 to 12");
                    C4165b.this.mo16379a(bVar);
                }
            }, new AbstractC1420a(12, 13) {
                /* class com.bytedance.ee.bear.account.C4165b.C41672 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    C13479a.m54764b("AccountDbManager", "migrate 12 to 13");
                    bVar.execSQL("ALTER TABLE user ADD COLUMN is_singleproduct INTEGER NOT NULL DEFAULT 0");
                    bVar.execSQL("ALTER TABLE user ADD COLUMN tenant_tag TEXT");
                }
            }, new AbstractC1420a(13, 14) {
                /* class com.bytedance.ee.bear.account.C4165b.C41683 */

                @Override // androidx.room.p047a.AbstractC1420a
                /* renamed from: a */
                public void mo7566a(AbstractC1082b bVar) {
                    bVar.execSQL("ALTER TABLE user ADD COLUMN is_manager INTEGER NOT NULL DEFAULT 0");
                }
            }));
        }
    }

    /* renamed from: b */
    private List<C4201m> m17296b(AbstractC1082b bVar) {
        int i;
        boolean z;
        boolean z2;
        Cursor query = bVar.query("SELECT * FROM user");
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("cn_name");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("en_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("organization");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("email");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("mobile");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("avatar_url");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("openid");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("token");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("tenant_id");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("department_id");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("tenant_name");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("can_create_sheet");
            int columnIndexOrThrow15 = query.getColumnIndexOrThrow("can_cross");
            int columnIndexOrThrow16 = query.getColumnIndexOrThrow("domain");
            int i2 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C4201m mVar = new C4201m();
                mVar.mo16477a(query.getString(columnIndexOrThrow));
                mVar.mo16480b(query.getString(columnIndexOrThrow2));
                mVar.mo16483c(query.getString(columnIndexOrThrow3));
                mVar.mo16486d(query.getString(columnIndexOrThrow4));
                mVar.mo16489e(query.getString(columnIndexOrThrow5));
                mVar.mo16492f(query.getString(columnIndexOrThrow6));
                mVar.mo16494g(query.getString(columnIndexOrThrow7));
                mVar.mo16496h(query.getString(columnIndexOrThrow8));
                mVar.mo16499i(query.getString(columnIndexOrThrow9));
                mVar.mo16501j(query.getString(columnIndexOrThrow10));
                mVar.mo16503k(query.getString(columnIndexOrThrow11));
                mVar.mo16505l(query.getString(columnIndexOrThrow12));
                mVar.mo16475a(query.getInt(columnIndexOrThrow13));
                if (query.getInt(i2) != 0) {
                    i = columnIndexOrThrow;
                    z = true;
                } else {
                    i = columnIndexOrThrow;
                    z = false;
                }
                mVar.mo16487d(z);
                int i3 = query.getInt(columnIndexOrThrow15);
                columnIndexOrThrow15 = columnIndexOrThrow15;
                if (i3 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mVar.mo16481b(z2);
                mVar.mo16506m(query.getString(columnIndexOrThrow16));
                arrayList.add(mVar);
                columnIndexOrThrow16 = columnIndexOrThrow16;
                columnIndexOrThrow = i;
                i2 = i2;
                arrayList = arrayList;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public void mo16379a(AbstractC1082b bVar) {
        try {
            mo16380a(bVar, m17296b(bVar));
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public void mo16381a(C4201m mVar) {
        if (TextUtils.isEmpty(mVar.mo16498i()) || TextUtils.isEmpty(mVar.mo16474a())) {
            C13479a.m54758a("AccountDbManager", "update user error, user = ");
            return;
        }
        if (m17298e().mo16517a(mVar) > 0) {
            C13479a.m54764b("AccountDbManager", "updateUser()... update suc ");
        } else {
            C13479a.m54764b("AccountDbManager", "updateUser()... update fail ");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17294a(AbstractC69011s sVar, Boolean bool) {
        if (!sVar.isDisposed()) {
            sVar.onSuccess(bool);
        }
    }

    /* renamed from: a */
    private void m17290a(C4201m mVar, AbstractC69011s<Boolean> sVar) {
        Single.just(mVar).flatMap(new C4175a(this)).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.account.$$Lambda$b$aEva6AbZPAAoK1NhJggxI4ZJGRM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4165b.lambda$aEva6AbZPAAoK1NhJggxI4ZJGRM(AbstractC69011s.this, (Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.account.$$Lambda$b$LF3b6kvstrrlqihVnYv1bdURi2c */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4165b.lambda$LF3b6kvstrrlqihVnYv1bdURi2c(AbstractC69011s.this, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m17297b(C4201m mVar, AbstractC69011s sVar) {
        mo16386d().observeOn(C11678b.m48479c()).subscribe(new Consumer(mVar, sVar) {
            /* class com.bytedance.ee.bear.account.$$Lambda$b$jrItTYh6sYu7lbgb80eRQ2fStOI */
            public final /* synthetic */ C4201m f$1;
            public final /* synthetic */ AbstractC69011s f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4165b.lambda$jrItTYh6sYu7lbgb80eRQ2fStOI(C4165b.this, this.f$1, this.f$2, (Boolean) obj);
            }
        }, new Consumer(mVar, sVar) {
            /* class com.bytedance.ee.bear.account.$$Lambda$b$4o78jMJN1xrF8ps0HPVcvoeo8WE */
            public final /* synthetic */ C4201m f$1;
            public final /* synthetic */ AbstractC69011s f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4165b.lambda$4o78jMJN1xrF8ps0HPVcvoeo8WE(C4165b.this, this.f$1, this.f$2, (Throwable) obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m17295a(AbstractC69011s sVar, Throwable th) {
        if (!sVar.isDisposed()) {
            sVar.onError(th);
        }
    }

    /* renamed from: a */
    public void mo16380a(AbstractC1082b bVar, List<C4201m> list) {
        if (!(list == null || list.size() == 0)) {
            bVar.beginTransaction();
            for (C4201m mVar : list) {
                ContentValues contentValues = new ContentValues();
                C4201m a = m17299f().mo16428a(mVar);
                contentValues.put("uid", a.mo16474a());
                contentValues.put("cn_name", a.mo16479b());
                contentValues.put("en_name", a.mo16482c());
                contentValues.put("organization", a.mo16485d());
                contentValues.put("email", a.mo16488e());
                contentValues.put("mobile", a.mo16491f());
                contentValues.put("avatar_url", a.mo16493g());
                contentValues.put("openid", a.mo16495h());
                contentValues.put("token", a.mo16498i());
                contentValues.put("tenant_id", a.mo16502k());
                contentValues.put("department_id", a.mo16504l());
                contentValues.put("tenant_name", a.mo16508n());
                contentValues.put("state", Integer.valueOf(a.mo16500j()));
                contentValues.put("can_create_sheet", Boolean.valueOf(a.mo16515t()));
                contentValues.put("can_cross", Boolean.valueOf(a.mo16510o()));
                contentValues.put("domain", a.mo16511p());
                bVar.insert("user", 5, contentValues);
            }
            bVar.setTransactionSuccessful();
            bVar.endTransaction();
            C13479a.m54764b("AccountDbManager", "AccountDbManager  updateUserList update: " + list.size());
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m17291a(C4201m mVar, AbstractC69011s sVar, Boolean bool) {
        m17290a(mVar, sVar);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m17292a(C4201m mVar, AbstractC69011s sVar, Throwable th) {
        m17290a(mVar, sVar);
    }
}
