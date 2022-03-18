package androidx.room;

import android.content.Context;
import androidx.p038g.p039a.AbstractC1083c;
import androidx.room.RoomDatabase;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.a */
public class C1419a {

    /* renamed from: a */
    public final AbstractC1083c.AbstractC1087c f4986a;

    /* renamed from: b */
    public final Context f4987b;

    /* renamed from: c */
    public final String f4988c;

    /* renamed from: d */
    public final RoomDatabase.C1418c f4989d;

    /* renamed from: e */
    public final List<RoomDatabase.AbstractC1417b> f4990e;

    /* renamed from: f */
    public final boolean f4991f;

    /* renamed from: g */
    public final RoomDatabase.JournalMode f4992g;

    /* renamed from: h */
    public final Executor f4993h;

    /* renamed from: i */
    public final boolean f4994i;

    /* renamed from: j */
    private final Set<Integer> f4995j;

    /* renamed from: a */
    public boolean mo7565a(int i) {
        Set<Integer> set;
        if (!this.f4994i || ((set = this.f4995j) != null && set.contains(Integer.valueOf(i)))) {
            return false;
        }
        return true;
    }

    public C1419a(Context context, String str, AbstractC1083c.AbstractC1087c cVar, RoomDatabase.C1418c cVar2, List<RoomDatabase.AbstractC1417b> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, boolean z2, Set<Integer> set) {
        this.f4986a = cVar;
        this.f4987b = context;
        this.f4988c = str;
        this.f4989d = cVar2;
        this.f4990e = list;
        this.f4991f = z;
        this.f4992g = journalMode;
        this.f4993h = executor;
        this.f4994i = z2;
        this.f4995j = set;
    }
}
