package com.bytedance.ee.util.db;

import androidx.p011a.p012a.p013a.C0179a;
import androidx.room.RoomDatabase;
import com.bytedance.ee.util.common.C13606d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.util.db.b */
public class C13636b {
    /* renamed from: a */
    public static void m55347a() {
        C0179a.m584a().mo547a(new C13647h());
    }

    /* renamed from: a */
    private static <T> ArrayList<List<T>> m55346a(List<T> list, int i) {
        ArrayList<List<T>> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        if (list.size() == 0 || list.size() <= i) {
            arrayList.add(list);
            return arrayList;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            i3 += i;
            if (i3 > list.size()) {
                i3 = list.size();
            }
            arrayList.add(list.subList(i2, i3));
            i2 = i3;
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m55348a(ArrayList arrayList, AbstractC13648i iVar, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(iVar.doCommand((List) it.next())));
        }
    }

    /* renamed from: a */
    public static int m55345a(List<String> list, AbstractC13648i iVar, RoomDatabase roomDatabase) {
        if (!(list == null || roomDatabase == null)) {
            ArrayList arrayList = new ArrayList();
            try {
                if (list.size() > 900) {
                    roomDatabase.mo7539a(new Runnable(m55346a(list, 900), iVar, arrayList) {
                        /* class com.bytedance.ee.util.db.$$Lambda$b$ZaDwIcIvYRNdEfBubDpcEFhQ1I */
                        public final /* synthetic */ ArrayList f$0;
                        public final /* synthetic */ AbstractC13648i f$1;
                        public final /* synthetic */ ArrayList f$2;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C13636b.m55348a(this.f$0, this.f$1, this.f$2);
                        }
                    });
                } else {
                    arrayList.add(Integer.valueOf(iVar.doCommand(list)));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Integer) it.next()).intValue() < 0) {
                        return -1;
                    }
                }
                return 1;
            } catch (Exception e) {
                C13606d.m55244a(e);
            }
        }
        return -1;
    }
}
