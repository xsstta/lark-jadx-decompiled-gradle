package com.bytedance.ee.util.db;

import android.content.Context;
import android.text.TextUtils;
import androidx.room.C1435e;
import androidx.room.RoomDatabase;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.util.p701d.C13629i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.sqlcipher.SQLException;

public class DBController {

    /* renamed from: a */
    public static boolean f35794a = true;

    /* renamed from: b */
    private static volatile DBController f35795b;

    /* renamed from: h */
    private static final ReadWriteLock f35796h = new ReentrantReadWriteLock();

    /* renamed from: c */
    private volatile String f35797c;

    /* renamed from: d */
    private volatile String f35798d;

    /* renamed from: e */
    private Map<String, Map<String, RoomDatabase>> f35799e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, C13632a> f35800f = new ConcurrentHashMap();

    /* renamed from: g */
    private List<WeakReference<AbstractC13633b>> f35801g = new ArrayList();

    /* renamed from: com.bytedance.ee.util.db.DBController$b */
    public interface AbstractC13633b {
        /* renamed from: a */
        void mo24114a(String str);
    }

    /* renamed from: d */
    public static boolean m55316d() {
        return f35794a;
    }

    /* renamed from: b */
    public String mo50591b() {
        return this.f35798d;
    }

    private DBController() {
    }

    /* renamed from: a */
    public static DBController m55314a() {
        if (f35795b == null) {
            synchronized (DBController.class) {
                if (f35795b == null) {
                    f35795b = new DBController();
                }
            }
        }
        return f35795b;
    }

    /* renamed from: c */
    public synchronized void mo50593c() {
        String str = this.f35798d;
        List<WeakReference<AbstractC13633b>> list = this.f35801g;
        if (list != null && list.size() > 0) {
            for (WeakReference<AbstractC13633b> weakReference : this.f35801g) {
                if (!(weakReference == null || weakReference.get() == null)) {
                    weakReference.get().mo24114a(str);
                }
            }
        }
    }

    public static class GetDBException extends RuntimeException {
        public GetDBException(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.ee.util.db.DBController$a */
    public static class C13632a {

        /* renamed from: a */
        String f35802a;

        /* renamed from: b */
        Class f35803b;

        /* renamed from: c */
        Context f35804c;

        /* renamed from: d */
        RoomDatabase.AbstractC1417b f35805d;

        /* renamed from: e */
        List<AbstractC1420a> f35806e = new ArrayList();

        /* renamed from: f */
        boolean f35807f = DBController.f35794a;

        /* renamed from: g */
        RoomDatabase.JournalMode f35808g = RoomDatabase.JournalMode.AUTOMATIC;

        /* renamed from: a */
        public C13632a mo50594a(RoomDatabase.JournalMode journalMode) {
            this.f35808g = journalMode;
            return this;
        }

        /* renamed from: a */
        public C13632a mo50595a(RoomDatabase.AbstractC1417b bVar) {
            this.f35805d = bVar;
            return this;
        }

        /* renamed from: a */
        public C13632a mo50596a(Class cls) {
            this.f35803b = cls;
            return this;
        }

        public C13632a(Context context) {
            this.f35804c = context;
        }

        /* renamed from: a */
        public C13632a mo50597a(String str) {
            this.f35802a = str;
            return this;
        }

        /* renamed from: a */
        public C13632a mo50598a(AbstractC1420a... aVarArr) {
            if (aVarArr != null) {
                for (AbstractC1420a aVar : aVarArr) {
                    this.f35806e.add(aVar);
                }
            }
            return this;
        }
    }

    /* renamed from: b */
    public <T extends RoomDatabase> T mo50590b(String str) {
        return (T) m55313a(str, C13635a.m55342a());
    }

    /* renamed from: a */
    public synchronized void mo50586a(AbstractC13633b bVar) {
        if (bVar != null) {
            this.f35801g.add(new WeakReference<>(bVar));
        }
    }

    /* renamed from: a */
    public void mo50587a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("DBController", "user id is null");
            str = "default";
        }
        ReadWriteLock readWriteLock = f35796h;
        readWriteLock.writeLock().lock();
        try {
            if (TextUtils.equals(str, this.f35797c)) {
                C13479a.m54758a("DBController", "user id is same");
                readWriteLock.writeLock().unlock();
                return;
            }
            C13479a.m54764b("DBController", "init userID : " + str);
            this.f35797c = str;
            m55315a(str, "a1p2c95");
            readWriteLock.writeLock().unlock();
            mo50593c();
        } catch (Throwable th) {
            f35796h.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo50589a(boolean z) {
        f35794a = z;
        C13479a.m54764b("DBController", "setNeedEncrypt : " + z);
    }

    /* renamed from: a */
    public void mo50588a(String str, C13632a aVar) {
        this.f35800f.put(str, aVar);
    }

    /* renamed from: a */
    public String mo50585a(Context context, String str) {
        if (f35794a) {
            return this.f35797c + "_encrypted_" + C13629i.m55299a(context, str);
        }
        return this.f35797c + "_" + C13629i.m55299a(context, str);
    }

    /* renamed from: a */
    private void m55315a(String str, String str2) {
        String a = C13602d.m55222a(str + "_" + str2);
        if (!TextUtils.isEmpty(a)) {
            this.f35798d = a.substring(0, 8);
        }
        C13479a.m54764b("DBController", "DBController  rebuildKey mKey : " + C13598b.m55197d(this.f35798d));
    }

    /* renamed from: b */
    public void mo50592b(Context context, String str) {
        if (f35794a) {
            try {
                C13675f.m55498a(context.getDatabasePath(this.f35797c + "_" + C13629i.m55299a(context, str)));
                C13675f.m55498a(context.getDatabasePath(this.f35797c + "_encrypt_" + C13629i.m55299a(context, str)));
            } catch (Exception e) {
                C13479a.m54761a("DBController", e);
            }
        }
    }

    /* renamed from: a */
    private <T extends RoomDatabase> T m55313a(String str, int i) {
        C13632a aVar = this.f35800f.get(str);
        if (aVar != null) {
            ReadWriteLock readWriteLock = f35796h;
            readWriteLock.readLock().lock();
            String str2 = this.f35797c;
            String b = mo50591b();
            readWriteLock.readLock().unlock();
            if (!TextUtils.isEmpty(str2)) {
                Map<String, RoomDatabase> map = this.f35799e.get(str2);
                if (map == null) {
                    map = new HashMap<>();
                    this.f35799e.put(str2, map);
                }
                T t = (T) map.get(str);
                if (t == null) {
                    try {
                        RoomDatabase.C1416a a = C1435e.m6556a(aVar.f35804c, aVar.f35803b, mo50585a(aVar.f35804c, aVar.f35802a));
                        if (aVar.f35806e != null) {
                            Iterator<AbstractC1420a> it = aVar.f35806e.iterator();
                            while (it.hasNext()) {
                                a.mo7557a(it.next());
                            }
                        }
                        if (aVar.f35805d != null) {
                            a.mo7556a(aVar.f35805d);
                        }
                        if (aVar.f35807f) {
                            C13635a.m55344a(a, b, i);
                        }
                        t = a.mo7555a(aVar.f35808g).mo7553a().mo7558b();
                        C13479a.m54764b("DBController", "DBController  get db, type = " + str + ", userID = " + str2 + ", key = " + C13598b.m55197d(b) + ", cipher config = " + i);
                        t.mo7540b().getWritableDatabase();
                    } catch (SQLException e) {
                        C13479a.m54758a("DBController", "catches SQLException");
                        int a2 = C13635a.m55343a(e, i);
                        if (a2 == C13635a.f35815e) {
                            C13479a.m54758a("DBController", "this excp is not relates to cipher config");
                            C13606d.m55244a(e);
                        } else if (a2 == C13635a.f35814d) {
                            C13479a.m54758a("DBController", "there is no other fallback cipher configs for usage");
                            C13606d.m55244a(e);
                        } else {
                            C13479a.m54764b("DBController", "find available fallback configs = " + a2);
                            t = (T) m55313a(str, a2);
                        }
                    } catch (Exception e2) {
                        C13606d.m55244a(e2);
                    }
                    map.put(str, t);
                }
                return t;
            }
            C13479a.m54758a("DBController", "getDB... get db with empty userId with type : " + str);
            throw new GetDBException("You can`t getDB when db is not init. Please check your method sequence with DBController.init(). type = " + str);
        }
        throw new RuntimeException("DBBuildWrapper is null.You must register it before use DB");
    }
}
