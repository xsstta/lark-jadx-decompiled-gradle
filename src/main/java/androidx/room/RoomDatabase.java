package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.collection.C0525g;
import androidx.core.app.C0728a;
import androidx.p011a.p012a.p013a.C0179a;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.p038g.p039a.AbstractC1089e;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.p038g.p039a.C1073a;
import androidx.p038g.p039a.p040a.C1079c;
import androidx.room.p047a.AbstractC1420a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class RoomDatabase {

    /* renamed from: a */
    public volatile AbstractC1082b f4965a;

    /* renamed from: b */
    boolean f4966b;

    /* renamed from: c */
    public List<AbstractC1417b> f4967c;

    /* renamed from: d */
    private Executor f4968d;

    /* renamed from: e */
    private AbstractC1083c f4969e;

    /* renamed from: f */
    private final C1429d f4970f = mo7542c();

    /* renamed from: g */
    private boolean f4971g;

    /* renamed from: h */
    private final ReentrantLock f4972h = new ReentrantLock();

    /* renamed from: androidx.room.RoomDatabase$b */
    public static abstract class AbstractC1417b {
        /* renamed from: a */
        public void mo7559a(AbstractC1082b bVar) {
        }

        /* renamed from: b */
        public void mo7560b(AbstractC1082b bVar) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC1083c mo7541b(C1419a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C1429d mo7542c();

    /* renamed from: d */
    public abstract void mo7543d();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Lock mo7536a() {
        return this.f4972h;
    }

    /* renamed from: b */
    public AbstractC1083c mo7540b() {
        return this.f4969e;
    }

    /* renamed from: i */
    public Executor mo7548i() {
        return this.f4968d;
    }

    /* renamed from: k */
    public C1429d mo7550k() {
        return this.f4970f;
    }

    /* renamed from: e */
    public boolean mo7544e() {
        AbstractC1082b bVar = this.f4965a;
        if (bVar == null || !bVar.isOpen()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo7549j() {
        this.f4969e.getWritableDatabase().setTransactionSuccessful();
    }

    /* renamed from: l */
    public boolean mo7551l() {
        return this.f4969e.getWritableDatabase().inTransaction();
    }

    /* renamed from: m */
    private static boolean mo16369m() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo7545f() {
        if (!this.f4971g && mo16369m()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: g */
    public void mo7546g() {
        mo7545f();
        AbstractC1082b writableDatabase = this.f4969e.getWritableDatabase();
        this.f4970f.mo7597b(writableDatabase);
        writableDatabase.beginTransaction();
    }

    /* renamed from: h */
    public void mo7547h() {
        this.f4969e.getWritableDatabase().endTransaction();
        if (!mo7551l()) {
            this.f4970f.mo7596b();
        }
    }

    /* renamed from: androidx.room.RoomDatabase$a */
    public static class C1416a<T extends RoomDatabase> {

        /* renamed from: a */
        private final Class<T> f4973a;

        /* renamed from: b */
        private final String f4974b;

        /* renamed from: c */
        private final Context f4975c;

        /* renamed from: d */
        private ArrayList<AbstractC1417b> f4976d;

        /* renamed from: e */
        private Executor f4977e;

        /* renamed from: f */
        private AbstractC1083c.AbstractC1087c f4978f;

        /* renamed from: g */
        private boolean f4979g;

        /* renamed from: h */
        private JournalMode f4980h = JournalMode.AUTOMATIC;

        /* renamed from: i */
        private boolean f4981i = true;

        /* renamed from: j */
        private final C1418c f4982j = new C1418c();

        /* renamed from: k */
        private Set<Integer> f4983k;

        /* renamed from: l */
        private Set<Integer> f4984l;

        /* renamed from: a */
        public C1416a<T> mo7553a() {
            this.f4981i = false;
            return this;
        }

        /* renamed from: b */
        public T mo7558b() {
            if (this.f4975c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f4973a != null) {
                if (this.f4977e == null) {
                    this.f4977e = C0179a.m585b();
                }
                Set<Integer> set = this.f4984l;
                if (!(set == null || this.f4983k == null)) {
                    for (Integer num : set) {
                        if (this.f4983k.contains(num)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                        }
                    }
                }
                if (this.f4978f == null) {
                    this.f4978f = new C1079c();
                }
                Context context = this.f4975c;
                C1419a aVar = new C1419a(context, this.f4974b, this.f4978f, this.f4982j, this.f4976d, this.f4979g, this.f4980h.resolve(context), this.f4977e, this.f4981i, this.f4983k);
                T t = (T) ((RoomDatabase) C1435e.m6557a(this.f4973a, "_Impl"));
                t.mo7538a(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: a */
        public C1416a<T> mo7554a(AbstractC1083c.AbstractC1087c cVar) {
            this.f4978f = cVar;
            return this;
        }

        /* renamed from: a */
        public C1416a<T> mo7555a(JournalMode journalMode) {
            this.f4980h = journalMode;
            return this;
        }

        /* renamed from: a */
        public C1416a<T> mo7556a(AbstractC1417b bVar) {
            if (this.f4976d == null) {
                this.f4976d = new ArrayList<>();
            }
            this.f4976d.add(bVar);
            return this;
        }

        /* renamed from: a */
        public C1416a<T> mo7557a(AbstractC1420a... aVarArr) {
            if (this.f4984l == null) {
                this.f4984l = new HashSet();
            }
            for (AbstractC1420a aVar : aVarArr) {
                this.f4984l.add(Integer.valueOf(aVar.f4996a));
                this.f4984l.add(Integer.valueOf(aVar.f4997b));
            }
            this.f4982j.mo7562a(aVarArr);
            return this;
        }

        C1416a(Context context, Class<T> cls, String str) {
            this.f4975c = context;
            this.f4973a = cls;
            this.f4974b = str;
        }
    }

    /* renamed from: a */
    public void mo7537a(AbstractC1082b bVar) {
        this.f4970f.mo7593a(bVar);
    }

    /* renamed from: androidx.room.RoomDatabase$c */
    public static class C1418c {

        /* renamed from: a */
        private C0525g<C0525g<AbstractC1420a>> f4985a = new C0525g<>();

        /* renamed from: a */
        public void mo7562a(AbstractC1420a... aVarArr) {
            for (AbstractC1420a aVar : aVarArr) {
                m6510a(aVar);
            }
        }

        /* renamed from: a */
        private void m6510a(AbstractC1420a aVar) {
            int i = aVar.f4996a;
            int i2 = aVar.f4997b;
            C0525g<AbstractC1420a> a = this.f4985a.mo3047a(i);
            if (a == null) {
                a = new C0525g<>();
                this.f4985a.mo3051b(i, a);
            }
            AbstractC1420a a2 = a.mo3047a(i2);
            if (a2 != null) {
                Log.w("ROOM", "Overriding migration " + a2 + " with " + aVar);
            }
            a.mo3054c(i2, aVar);
        }

        /* renamed from: a */
        public List<AbstractC1420a> mo7561a(int i, int i2) {
            boolean z;
            if (i == i2) {
                return Collections.emptyList();
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return m6509a(new ArrayList(), z, i, i2);
        }

        /* renamed from: a */
        private List<AbstractC1420a> m6509a(List<AbstractC1420a> list, boolean z, int i, int i2) {
            int i3;
            boolean z2;
            int i4;
            int i5;
            boolean z3;
            if (z) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                C0525g<AbstractC1420a> a = this.f4985a.mo3047a(i);
                if (a != null) {
                    int b = a.mo3049b();
                    z2 = false;
                    if (z) {
                        i5 = b - 1;
                        i4 = -1;
                    } else {
                        i4 = b;
                        i5 = 0;
                    }
                    while (true) {
                        if (i5 == i4) {
                            break;
                        }
                        int d = a.mo3056d(i5);
                        if (!z ? d < i2 || d >= i : d > i2 || d <= i) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            list.add(a.mo3057e(i5));
                            i = d;
                            z2 = true;
                            continue;
                            break;
                        }
                        i5 += i3;
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    /* renamed from: a */
    public Cursor mo7532a(AbstractC1089e eVar) {
        mo7545f();
        return this.f4969e.getWritableDatabase().query(eVar);
    }

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* access modifiers changed from: package-private */
        public JournalMode resolve(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || C0728a.m3579a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: a */
    public AbstractC1090f mo7534a(String str) {
        mo7545f();
        return this.f4969e.getWritableDatabase().compileStatement(str);
    }

    /* renamed from: a */
    public <V> V mo7535a(Callable<V> callable) {
        mo7546g();
        try {
            V call = callable.call();
            mo7549j();
            mo7547h();
            return call;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException("Exception in transaction", e2);
        } catch (Throwable th) {
            mo7547h();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo7538a(C1419a aVar) {
        this.f4969e = mo7541b(aVar);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f4992g == JournalMode.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f4969e.setWriteAheadLoggingEnabled(z);
        }
        this.f4967c = aVar.f4990e;
        this.f4968d = aVar.f4993h;
        this.f4971g = aVar.f4991f;
        this.f4966b = z;
    }

    /* renamed from: a */
    public void mo7539a(Runnable runnable) {
        mo7546g();
        try {
            runnable.run();
            mo7549j();
        } finally {
            mo7547h();
        }
    }

    /* renamed from: a */
    public Cursor mo7533a(String str, Object[] objArr) {
        return this.f4969e.getWritableDatabase().query(new C1073a(str, objArr));
    }
}
