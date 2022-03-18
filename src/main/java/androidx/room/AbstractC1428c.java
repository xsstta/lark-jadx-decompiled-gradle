package androidx.room;

import androidx.p038g.p039a.AbstractC1090f;
import java.util.Collection;

/* renamed from: androidx.room.c */
public abstract class AbstractC1428c<T> extends AbstractC1440i {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7588a(AbstractC1090f fVar, T t);

    public AbstractC1428c(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* renamed from: a */
    public final long mo7587a(T t) {
        AbstractC1090f c = mo7618c();
        try {
            mo7588a(c, t);
            return c.executeInsert();
        } finally {
            mo7616a(c);
        }
    }

    /* renamed from: a */
    public final void mo7589a(Iterable<T> iterable) {
        AbstractC1090f c = mo7618c();
        try {
            for (T t : iterable) {
                mo7588a(c, t);
                c.executeInsert();
            }
        } finally {
            mo7616a(c);
        }
    }

    /* renamed from: b */
    public final Long[] mo7592b(T[] tArr) {
        AbstractC1090f c = mo7618c();
        try {
            Long[] lArr = new Long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                mo7588a(c, t);
                lArr[i] = Long.valueOf(c.executeInsert());
                i++;
            }
            return lArr;
        } finally {
            mo7616a(c);
        }
    }

    /* renamed from: a */
    public final long[] mo7590a(Collection<T> collection) {
        AbstractC1090f c = mo7618c();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (T t : collection) {
                mo7588a(c, t);
                jArr[i] = c.executeInsert();
                i++;
            }
            return jArr;
        } finally {
            mo7616a(c);
        }
    }

    /* renamed from: a */
    public final long[] mo7591a(T[] tArr) {
        AbstractC1090f c = mo7618c();
        try {
            long[] jArr = new long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                mo7588a(c, t);
                jArr[i] = c.executeInsert();
                i++;
            }
            return jArr;
        } finally {
            mo7616a(c);
        }
    }
}
