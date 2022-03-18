package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.collection.C0513a;
import androidx.p011a.p012a.p014b.C0186b;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1090f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: androidx.room.d */
public class C1429d {

    /* renamed from: j */
    private static final String[] f5020j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    ArrayMap<String, Integer> f5021a;

    /* renamed from: b */
    long[] f5022b;

    /* renamed from: c */
    Object[] f5023c = new Object[1];

    /* renamed from: d */
    long f5024d;

    /* renamed from: e */
    final RoomDatabase f5025e;

    /* renamed from: f */
    AtomicBoolean f5026f;

    /* renamed from: g */
    volatile AbstractC1090f f5027g;

    /* renamed from: h */
    final C0186b<AbstractC1432b, C1433c> f5028h;

    /* renamed from: i */
    Runnable f5029i;

    /* renamed from: k */
    private String[] f5030k;

    /* renamed from: l */
    private volatile boolean f5031l;

    /* renamed from: m */
    private C1431a f5032m;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.room.d$a */
    public static class C1431a {

        /* renamed from: a */
        final long[] f5034a;

        /* renamed from: b */
        final boolean[] f5035b;

        /* renamed from: c */
        final int[] f5036c;

        /* renamed from: d */
        boolean f5037d;

        /* renamed from: e */
        boolean f5038e;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7604b() {
            synchronized (this) {
                this.f5038e = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo7603a() {
            boolean z;
            synchronized (this) {
                if (this.f5037d) {
                    if (!this.f5038e) {
                        int length = this.f5034a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                if (this.f5034a[i] > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean[] zArr = this.f5035b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.f5036c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f5036c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.f5038e = true;
                                this.f5037d = false;
                                return this.f5036c;
                            }
                        }
                    }
                }
                return null;
            }
        }

        C1431a(int i) {
            long[] jArr = new long[i];
            this.f5034a = jArr;
            boolean[] zArr = new boolean[i];
            this.f5035b = zArr;
            this.f5036c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7602a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f5034a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f5037d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo7605b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f5034a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f5037d = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: b */
    public void mo7596b() {
        if (this.f5026f.compareAndSet(false, true)) {
            this.f5025e.mo7548i().execute(this.f5029i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7599c() {
        if (this.f5025e.mo7544e()) {
            mo7597b(this.f5025e.mo7540b().getWritableDatabase());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7595a() {
        if (!this.f5025e.mo7544e()) {
            return false;
        }
        if (!this.f5031l) {
            this.f5025e.mo7540b().getWritableDatabase();
        }
        if (this.f5031l) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: androidx.room.d$b */
    public static abstract class AbstractC1432b {

        /* renamed from: a */
        final String[] f5039a;

        /* renamed from: a */
        public abstract void mo7606a(Set<String> set);

        public AbstractC1432b(String[] strArr) {
            this.f5039a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        protected AbstractC1432b(String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.f5039a = strArr2;
            strArr2[strArr.length] = str;
        }
    }

    /* renamed from: b */
    public void mo7598b(AbstractC1432b bVar) {
        mo7594a(new C1434d(this, bVar));
    }

    /* renamed from: androidx.room.d$d */
    static class C1434d extends AbstractC1432b {

        /* renamed from: b */
        final C1429d f5045b;

        /* renamed from: c */
        final WeakReference<AbstractC1432b> f5046c;

        @Override // androidx.room.C1429d.AbstractC1432b
        /* renamed from: a */
        public void mo7606a(Set<String> set) {
            AbstractC1432b bVar = this.f5046c.get();
            if (bVar == null) {
                this.f5045b.mo7600c(this);
            } else {
                bVar.mo7606a(set);
            }
        }

        C1434d(C1429d dVar, AbstractC1432b bVar) {
            super(bVar.f5039a);
            this.f5045b = dVar;
            this.f5046c = new WeakReference<>(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.room.d$c */
    public static class C1433c {

        /* renamed from: a */
        final int[] f5040a;

        /* renamed from: b */
        final AbstractC1432b f5041b;

        /* renamed from: c */
        private final String[] f5042c;

        /* renamed from: d */
        private final long[] f5043d;

        /* renamed from: e */
        private final Set<String> f5044e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7607a(long[] jArr) {
            int length = this.f5040a.length;
            Set<String> set = null;
            for (int i = 0; i < length; i++) {
                long j = jArr[this.f5040a[i]];
                long[] jArr2 = this.f5043d;
                if (jArr2[i] < j) {
                    jArr2[i] = j;
                    if (length == 1) {
                        set = this.f5044e;
                    } else {
                        if (set == null) {
                            set = new C0513a<>(length);
                        }
                        set.add(this.f5042c[i]);
                    }
                }
            }
            if (set != null) {
                this.f5041b.mo7606a(set);
            }
        }

        C1433c(AbstractC1432b bVar, int[] iArr, String[] strArr, long[] jArr) {
            this.f5041b = bVar;
            this.f5040a = iArr;
            this.f5042c = strArr;
            this.f5043d = jArr;
            if (iArr.length == 1) {
                C0513a aVar = new C0513a();
                aVar.add(strArr[0]);
                this.f5044e = Collections.unmodifiableSet(aVar);
                return;
            }
            this.f5044e = null;
        }
    }

    /* renamed from: c */
    public void mo7600c(AbstractC1432b bVar) {
        C1433c b;
        synchronized (this.f5028h) {
            b = this.f5028h.mo557b(bVar);
        }
        if (b != null && this.f5032m.mo7605b(b.f5040a)) {
            mo7599c();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7593a(AbstractC1082b bVar) {
        synchronized (this) {
            if (this.f5031l) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.beginTransaction();
            try {
                bVar.execSQL("PRAGMA temp_store = MEMORY;");
                bVar.execSQL("PRAGMA recursive_triggers='ON';");
                bVar.execSQL("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                bVar.setTransactionSuccessful();
                bVar.endTransaction();
                mo7597b(bVar);
                this.f5027g = bVar.compileStatement("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                this.f5031l = true;
            } catch (Throwable th) {
                bVar.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo7594a(AbstractC1432b bVar) {
        C1433c a;
        String[] strArr = bVar.f5039a;
        int[] iArr = new int[strArr.length];
        int length = strArr.length;
        long[] jArr = new long[strArr.length];
        for (int i = 0; i < length; i++) {
            Integer num = this.f5021a.get(strArr[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                jArr[i] = this.f5024d;
            } else {
                throw new IllegalArgumentException("There is no table with name " + strArr[i]);
            }
        }
        C1433c cVar = new C1433c(bVar, iArr, strArr, jArr);
        synchronized (this.f5028h) {
            a = this.f5028h.mo556a(bVar, cVar);
        }
        if (a == null && this.f5032m.mo7602a(iArr)) {
            mo7599c();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7597b(AbstractC1082b bVar) {
        if (!bVar.inTransaction()) {
            while (true) {
                try {
                    Lock a = this.f5025e.mo7536a();
                    a.lock();
                    try {
                        int[] a2 = this.f5032m.mo7603a();
                        if (a2 == null) {
                            a.unlock();
                            return;
                        }
                        int length = a2.length;
                        try {
                            bVar.beginTransaction();
                            for (int i = 0; i < length; i++) {
                                int i2 = a2[i];
                                if (i2 == 1) {
                                    m6539b(bVar, i);
                                } else if (i2 == 2) {
                                    m6537a(bVar, i);
                                }
                            }
                            bVar.setTransactionSuccessful();
                            bVar.endTransaction();
                            this.f5032m.mo7604b();
                        } catch (Throwable th) {
                            bVar.endTransaction();
                            throw th;
                        }
                    } finally {
                        a.unlock();
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m6537a(AbstractC1082b bVar, int i) {
        String str = this.f5030k[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f5020j;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m6538a(sb, str, str2);
            bVar.execSQL(sb.toString());
        }
    }

    public C1429d(RoomDatabase roomDatabase, String... strArr) {
        this.f5026f = new AtomicBoolean(false);
        this.f5031l = false;
        this.f5028h = new C0186b<>();
        this.f5029i = new Runnable() {
            /* class androidx.room.C1429d.RunnableC14301 */

            /* renamed from: a */
            private boolean m6548a() {
                Cursor a = C1429d.this.f5025e.mo7533a("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", C1429d.this.f5023c);
                boolean z = false;
                while (a.moveToNext()) {
                    try {
                        long j = a.getLong(0);
                        C1429d.this.f5022b[a.getInt(1)] = j;
                        C1429d.this.f5024d = j;
                        z = true;
                    } finally {
                        a.close();
                    }
                }
                return z;
            }

            public void run() {
                Lock a = C1429d.this.f5025e.mo7536a();
                boolean z = false;
                try {
                    a.lock();
                    if (!C1429d.this.mo7595a()) {
                        a.unlock();
                    } else if (!C1429d.this.f5026f.compareAndSet(true, false)) {
                        a.unlock();
                    } else if (C1429d.this.f5025e.mo7551l()) {
                        a.unlock();
                    } else {
                        C1429d.this.f5027g.executeUpdateDelete();
                        C1429d.this.f5023c[0] = Long.valueOf(C1429d.this.f5024d);
                        if (C1429d.this.f5025e.f4966b) {
                            AbstractC1082b writableDatabase = C1429d.this.f5025e.mo7540b().getWritableDatabase();
                            try {
                                writableDatabase.beginTransaction();
                                z = m6548a();
                                writableDatabase.setTransactionSuccessful();
                            } finally {
                                writableDatabase.endTransaction();
                            }
                        } else {
                            z = m6548a();
                        }
                        a.unlock();
                        if (z) {
                            synchronized (C1429d.this.f5028h) {
                                Iterator<Map.Entry<AbstractC1432b, C1433c>> it = C1429d.this.f5028h.iterator();
                                while (it.hasNext()) {
                                    it.next().getValue().mo7607a(C1429d.this.f5022b);
                                }
                            }
                        }
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (Throwable th) {
                    a.unlock();
                    throw th;
                }
            }
        };
        this.f5025e = roomDatabase;
        this.f5032m = new C1431a(strArr.length);
        this.f5021a = new ArrayMap<>();
        int length = strArr.length;
        this.f5030k = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f5021a.put(lowerCase, Integer.valueOf(i));
            this.f5030k[i] = lowerCase;
        }
        long[] jArr = new long[strArr.length];
        this.f5022b = jArr;
        Arrays.fill(jArr, 0L);
    }

    /* renamed from: b */
    private void m6539b(AbstractC1082b bVar, int i) {
        String str = this.f5030k[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f5020j;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m6538a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN INSERT OR REPLACE INTO ");
            sb.append("room_table_modification_log");
            sb.append(" VALUES(null, ");
            sb.append(i);
            sb.append("); END");
            bVar.execSQL(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m6538a(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }
}
