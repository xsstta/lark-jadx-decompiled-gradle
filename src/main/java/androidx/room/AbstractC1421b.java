package androidx.room;

import androidx.p038g.p039a.AbstractC1090f;

/* renamed from: androidx.room.b */
public abstract class AbstractC1421b<T> extends AbstractC1440i {
    /* access modifiers changed from: protected */
    @Override // androidx.room.AbstractC1440i
    /* renamed from: a */
    public abstract String mo7570a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7571a(AbstractC1090f fVar, T t);

    public AbstractC1421b(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* renamed from: a */
    public final int mo7568a(T t) {
        AbstractC1090f c = mo7618c();
        try {
            mo7571a(c, t);
            return c.executeUpdateDelete();
        } finally {
            mo7616a(c);
        }
    }

    /* renamed from: a */
    public final int mo7567a(Iterable<T> iterable) {
        AbstractC1090f c = mo7618c();
        int i = 0;
        try {
            for (T t : iterable) {
                mo7571a(c, t);
                i += c.executeUpdateDelete();
            }
            return i;
        } finally {
            mo7616a(c);
        }
    }

    /* renamed from: a */
    public final int mo7569a(T[] tArr) {
        AbstractC1090f c = mo7618c();
        try {
            int i = 0;
            for (T t : tArr) {
                mo7571a(c, t);
                i += c.executeUpdateDelete();
            }
            return i;
        } finally {
            mo7616a(c);
        }
    }
}
