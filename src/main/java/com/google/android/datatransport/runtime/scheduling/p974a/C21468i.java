package com.google.android.datatransport.runtime.scheduling.p974a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.C21349b;
import com.google.android.datatransport.runtime.AbstractC21433h;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.C21432g;
import com.google.android.datatransport.runtime.p971a.C21399a;
import com.google.android.datatransport.runtime.p973c.C21426a;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.i */
public class C21468i implements AbstractC21461c, AbstractC21521a {

    /* renamed from: a */
    private static final C21349b f52103a = C21349b.m77288a("proto");

    /* renamed from: b */
    private final C21454ab f52104b;

    /* renamed from: c */
    private final AbstractC21523a f52105c;

    /* renamed from: d */
    private final AbstractC21523a f52106d;

    /* renamed from: e */
    private final AbstractC21462d f52107e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.i$a */
    public interface AbstractC21470a<T, U> {
        /* renamed from: a */
        U mo72739a(T t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.i$c */
    public interface AbstractC21472c<T> {
        /* renamed from: a */
        T mo72740a();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: a */
    public AbstractC21467h mo72727a(AbstractC21439l lVar, AbstractC21433h hVar) {
        C21399a.m77447a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", lVar.mo72663c(), hVar.mo72604a(), lVar.mo72661a());
        long longValue = ((Long) m77671a(C21485v.m77732a(this, lVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC21467h.m77661a(longValue, lVar, hVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: a */
    public void mo72730a(Iterable<AbstractC21467h> iterable) {
        if (iterable.iterator().hasNext()) {
            m77671a(C21487x.m77736a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m77690c(iterable)));
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: a */
    public long mo72726a(AbstractC21439l lVar) {
        return ((Long) m77669a(m77688c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{lVar.mo72661a(), String.valueOf(C21426a.m77512a(lVar.mo72663c()))}), C21488y.m77738a())).longValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: a */
    public void mo72729a(AbstractC21439l lVar, long j) {
        m77671a(C21474k.m77710a(j, lVar));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: a */
    public Iterable<AbstractC21439l> mo72728a() {
        return (Iterable) m77671a(C21476m.m77714a());
    }

    /* renamed from: a */
    static /* synthetic */ List m77677a(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC21439l.m77567d().mo72667a(cursor.getString(1)).mo72666a(C21426a.m77513a(cursor.getInt(2))).mo72668a(m77681a(cursor.getString(3))).mo72669a());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static byte[] m77681a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: a */
    static /* synthetic */ Object m77675a(List list, AbstractC21439l lVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            AbstractC21433h.AbstractC21434a a = AbstractC21433h.m77526i().mo72616a(cursor.getString(1)).mo72613a(cursor.getLong(2)).mo72619b(cursor.getLong(3)).mo72614a(new C21432g(m77683b(cursor.getString(4)), cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                a.mo72615a(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC21467h.m77661a(j, lVar, a.mo72620b()));
        }
        return null;
    }

    /* renamed from: a */
    private Map<Long, Set<C21471b>> m77680a(SQLiteDatabase sQLiteDatabase, List<AbstractC21467h> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo72720a());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m77669a(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), C21479p.m77720a((Map) hashMap));
        return hashMap;
    }

    /* renamed from: a */
    static /* synthetic */ Object m77676a(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C21471b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: a */
    private List<AbstractC21467h> m77679a(List<AbstractC21467h> list, Map<Long, Set<C21471b>> map) {
        ListIterator<AbstractC21467h> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC21467h next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo72720a()))) {
                AbstractC21433h.AbstractC21434a h = next.mo72722c().mo72684h();
                for (C21471b bVar : map.get(Long.valueOf(next.mo72720a()))) {
                    h.mo72687a(bVar.f52108a, bVar.f52109b);
                }
                listIterator.set(AbstractC21467h.m77661a(next.mo72720a(), next.mo72721b(), h.mo72620b()));
            }
        }
        return list;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.AbstractC21521a
    /* renamed from: a */
    public <T> T mo72737a(AbstractC21521a.AbstractC21522a<T> aVar) {
        SQLiteDatabase c = m77688c();
        m77692c(c);
        try {
            T a = aVar.mo72742a();
            c.setTransactionSuccessful();
            return a;
        } finally {
            c.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52104b.close();
    }

    /* renamed from: e */
    private long m77694e() {
        return m77688c().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: f */
    private long m77695f() {
        return m77688c().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: c */
    private SQLiteDatabase m77688c() {
        C21454ab abVar = this.f52104b;
        abVar.getClass();
        return (SQLiteDatabase) m77672a(C21473j.m77708a(abVar), C21484u.m77730a());
    }

    /* renamed from: d */
    private boolean m77693d() {
        if (m77695f() * m77694e() >= this.f52107e.mo72700a()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: b */
    public int mo72731b() {
        return ((Integer) m77671a(C21477n.m77716a(this.f52105c.mo72782a() - this.f52107e.mo72703d()))).intValue();
    }

    /* renamed from: b */
    static /* synthetic */ SQLiteDatabase m77682b(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* renamed from: b */
    private static C21349b m77683b(String str) {
        if (str == null) {
            return f52103a;
        }
        return C21349b.m77288a(str);
    }

    /* renamed from: c */
    private void m77692c(SQLiteDatabase sQLiteDatabase) {
        m77672a(C21480q.m77722a(sQLiteDatabase), C21481r.m77724a());
    }

    /* renamed from: b */
    static /* synthetic */ Long m77685b(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: a */
    private <T> T m77671a(AbstractC21470a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase c = m77688c();
        c.beginTransaction();
        try {
            T a = aVar.mo72739a(c);
            c.setTransactionSuccessful();
            return a;
        } finally {
            c.endTransaction();
        }
    }

    /* renamed from: c */
    static /* synthetic */ Long m77689c(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: c */
    private static String m77690c(Iterable<AbstractC21467h> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC21467h> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo72720a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: b */
    static /* synthetic */ List m77687b(SQLiteDatabase sQLiteDatabase) {
        return (List) m77669a(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C21482s.m77726a());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: c */
    public Iterable<AbstractC21467h> mo72734c(AbstractC21439l lVar) {
        return (Iterable) m77671a(C21475l.m77712a(this, lVar));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: b */
    public void mo72732b(Iterable<AbstractC21467h> iterable) {
        if (iterable.iterator().hasNext()) {
            m77688c().compileStatement("DELETE FROM events WHERE _id in " + m77690c(iterable)).execute();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c
    /* renamed from: b */
    public boolean mo72733b(AbstractC21439l lVar) {
        return ((Boolean) m77671a(C21489z.m77740a(this, lVar))).booleanValue();
    }

    /* renamed from: a */
    static /* synthetic */ Object m77674a(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.i$b */
    public static class C21471b {

        /* renamed from: a */
        final String f52108a;

        /* renamed from: b */
        final String f52109b;

        private C21471b(String str, String str2) {
            this.f52108a = str;
            this.f52109b = str2;
        }
    }

    /* renamed from: a */
    private static <T> T m77669a(Cursor cursor, AbstractC21470a<Cursor, T> aVar) {
        try {
            return aVar.mo72739a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: a */
    private long m77665a(SQLiteDatabase sQLiteDatabase, AbstractC21439l lVar) {
        Long b = m77686b(sQLiteDatabase, lVar);
        if (b != null) {
            return b.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", lVar.mo72661a());
        contentValues.put("priority", Integer.valueOf(C21426a.m77512a(lVar.mo72663c())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (lVar.mo72662b() != null) {
            contentValues.put("extras", Base64.encodeToString(lVar.mo72662b(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: b */
    private Long m77686b(SQLiteDatabase sQLiteDatabase, AbstractC21439l lVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(lVar.mo72661a(), String.valueOf(C21426a.m77512a(lVar.mo72663c()))));
        if (lVar.mo72662b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(lVar.mo72662b(), 0));
        }
        return (Long) m77669a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), C21486w.m77734a());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public List<AbstractC21467h> m77691c(SQLiteDatabase sQLiteDatabase, AbstractC21439l lVar) {
        ArrayList arrayList = new ArrayList();
        Long b = m77686b(sQLiteDatabase, lVar);
        if (b == null) {
            return arrayList;
        }
        m77669a(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(this.f52107e.mo72701b())), C21478o.m77718a(arrayList, lVar));
        return arrayList;
    }

    /* renamed from: a */
    private <T> T m77672a(AbstractC21472c<T> cVar, AbstractC21470a<Throwable, T> aVar) {
        long a = this.f52106d.mo72782a();
        while (true) {
            try {
                return cVar.mo72740a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f52106d.mo72782a() >= ((long) this.f52107e.mo72702c()) + a) {
                    return aVar.mo72739a(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m77673a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m77684b(C21468i iVar, AbstractC21439l lVar, SQLiteDatabase sQLiteDatabase) {
        Long b = iVar.m77686b(sQLiteDatabase, lVar);
        if (b == null) {
            return false;
        }
        return (Boolean) m77669a(iVar.m77688c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b.toString()}), C21483t.m77728a());
    }

    /* renamed from: a */
    static /* synthetic */ Object m77668a(long j, AbstractC21439l lVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{lVar.mo72661a(), String.valueOf(C21426a.m77512a(lVar.mo72663c()))}) < 1) {
            contentValues.put("backend_name", lVar.mo72661a());
            contentValues.put("priority", Integer.valueOf(C21426a.m77512a(lVar.mo72663c())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Inject
    C21468i(AbstractC21523a aVar, AbstractC21523a aVar2, AbstractC21462d dVar, C21454ab abVar) {
        this.f52104b = abVar;
        this.f52105c = aVar;
        this.f52106d = aVar2;
        this.f52107e = dVar;
    }

    /* renamed from: a */
    static /* synthetic */ Long m77667a(C21468i iVar, AbstractC21439l lVar, AbstractC21433h hVar, SQLiteDatabase sQLiteDatabase) {
        if (iVar.m77693d()) {
            return -1L;
        }
        long a = iVar.m77665a(sQLiteDatabase, lVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(a));
        contentValues.put("transport_name", hVar.mo72604a());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.mo72607d()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.mo72608e()));
        contentValues.put("payload_encoding", hVar.mo72606c().mo72675a().mo72499a());
        contentValues.put("payload", hVar.mo72606c().mo72676b());
        contentValues.put("code", hVar.mo72605b());
        contentValues.put("num_attempts", (Integer) 0);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        for (Map.Entry<String, String> entry : hVar.mo72683g().entrySet()) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", Long.valueOf(insert));
            contentValues2.put("name", entry.getKey());
            contentValues2.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues2);
        }
        return Long.valueOf(insert);
    }
}
