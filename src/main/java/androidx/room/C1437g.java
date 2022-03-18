package androidx.room;

import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.p038g.p039a.C1073a;
import androidx.room.p047a.AbstractC1420a;
import java.util.List;

/* renamed from: androidx.room.g */
public class C1437g extends AbstractC1083c.AbstractC1084a {

    /* renamed from: b */
    private C1419a f5047b;

    /* renamed from: c */
    private final AbstractC1438a f5048c;

    /* renamed from: d */
    private final String f5049d;

    /* renamed from: e */
    private final String f5050e;

    @Override // androidx.p038g.p039a.AbstractC1083c.AbstractC1084a
    /* renamed from: a */
    public void mo5735a(AbstractC1082b bVar) {
        super.mo5735a(bVar);
    }

    /* renamed from: androidx.room.g$a */
    public static abstract class AbstractC1438a {

        /* renamed from: a */
        public final int f5051a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo7608a(AbstractC1082b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo7609b(AbstractC1082b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo7610c(AbstractC1082b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo7611d(AbstractC1082b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo7612e(AbstractC1082b bVar);

        public AbstractC1438a(int i) {
            this.f5051a = i;
        }
    }

    /* renamed from: g */
    private void m6561g(AbstractC1082b bVar) {
        bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: f */
    private void m6560f(AbstractC1082b bVar) {
        m6561g(bVar);
        bVar.execSQL(C1436f.m6558a(this.f5049d));
    }

    @Override // androidx.p038g.p039a.AbstractC1083c.AbstractC1084a
    /* renamed from: b */
    public void mo5737b(AbstractC1082b bVar) {
        m6560f(bVar);
        this.f5048c.mo7609b(bVar);
        this.f5048c.mo7611d(bVar);
    }

    @Override // androidx.p038g.p039a.AbstractC1083c.AbstractC1084a
    /* renamed from: c */
    public void mo5739c(AbstractC1082b bVar) {
        super.mo5739c(bVar);
        m6559e(bVar);
        this.f5048c.mo7610c(bVar);
        this.f5047b = null;
    }

    /* renamed from: h */
    private static boolean m6562h(AbstractC1082b bVar) {
        Cursor query = bVar.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (query.moveToFirst() && query.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    private void m6559e(AbstractC1082b bVar) {
        String str = null;
        if (m6562h(bVar)) {
            Cursor query = bVar.query(new C1073a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (query.moveToFirst()) {
                    str = query.getString(0);
                }
            } finally {
                query.close();
            }
        }
        if (!this.f5049d.equals(str) && !this.f5050e.equals(str)) {
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1083c.AbstractC1084a
    /* renamed from: b */
    public void mo5738b(AbstractC1082b bVar, int i, int i2) {
        mo5736a(bVar, i, i2);
    }

    @Override // androidx.p038g.p039a.AbstractC1083c.AbstractC1084a
    /* renamed from: a */
    public void mo5736a(AbstractC1082b bVar, int i, int i2) {
        boolean z;
        List<AbstractC1420a> a;
        C1419a aVar = this.f5047b;
        if (aVar == null || (a = aVar.f4989d.mo7561a(i, i2)) == null) {
            z = false;
        } else {
            for (AbstractC1420a aVar2 : a) {
                aVar2.mo7566a(bVar);
            }
            this.f5048c.mo7612e(bVar);
            m6560f(bVar);
            z = true;
        }
        if (!z) {
            C1419a aVar3 = this.f5047b;
            if (aVar3 == null || aVar3.mo7565a(i)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the " + "necessary Migration path via " + "RoomDatabase.Builder.addMigration(Migration ...) or allow for " + "destructive migrations via one of the " + "RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f5048c.mo7608a(bVar);
            this.f5048c.mo7609b(bVar);
        }
    }

    public C1437g(C1419a aVar, AbstractC1438a aVar2, String str, String str2) {
        super(aVar2.f5051a);
        this.f5047b = aVar;
        this.f5048c = aVar2;
        this.f5049d = str;
        this.f5050e = str2;
    }
}
