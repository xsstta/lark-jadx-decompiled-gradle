package com.bytedance.p230d.p231a;

import android.util.Log;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.block.p136a.C2861h;
import com.bytedance.apm.p139e.C2930g;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.bytedance.d.a.a */
public class C3971a {

    /* renamed from: com.bytedance.d.a.a$a */
    public interface AbstractC3973a {
        /* renamed from: a */
        int mo15643a();

        /* renamed from: a */
        void mo15644a(List<C2861h> list, int i);

        /* renamed from: a */
        boolean mo15645a(long j, int i);
    }

    /* renamed from: a */
    public static int m16561a(long j) {
        return (int) ((j >> 43) & 1048575);
    }

    /* renamed from: b */
    private static boolean m16572b(long j) {
        return ((j >> 63) & 1) == 1;
    }

    /* renamed from: c */
    private static long m16573c(long j) {
        return j & 8796093022207L;
    }

    /* renamed from: a */
    public static void m16570a(long[] jArr, LinkedList<C2861h> linkedList, boolean z, long j) {
        m16566a(1048574, jArr, linkedList, z, j, -1);
    }

    /* renamed from: a */
    public static void m16569a(List<C2861h> list, int i, AbstractC3973a aVar) {
        if (i < 0) {
            list.clear();
            return;
        }
        int size = list.size();
        int i2 = 1;
        while (size > i) {
            ListIterator<C2861h> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (aVar.mo15645a((long) listIterator.previous().f9134b, i2)) {
                    listIterator.remove();
                    size--;
                    if (size <= i) {
                        return;
                    }
                }
            }
            size = list.size();
            i2++;
            if (aVar.mo15643a() < i2) {
                break;
            }
        }
        int size2 = list.size();
        if (size2 > i) {
            aVar.mo15644a(list, size2);
        }
    }

    /* renamed from: com.bytedance.d.a.a$b */
    public static final class C3974b {

        /* renamed from: a */
        C2861h f12070a;

        /* renamed from: b */
        C3974b f12071b;

        /* renamed from: c */
        LinkedList<C3974b> f12072c = new LinkedList<>();

        /* renamed from: a */
        public int mo15646a() {
            C2861h hVar = this.f12070a;
            if (hVar == null) {
                return 0;
            }
            return hVar.f9136d;
        }

        /* renamed from: a */
        public void mo15647a(C3974b bVar) {
            this.f12072c.addFirst(bVar);
        }

        C3974b(C2861h hVar, C3974b bVar) {
            this.f12070a = hVar;
            this.f12071b = bVar;
        }
    }

    /* renamed from: a */
    public static void m16568a(List<C2861h> list, int i) {
        ListIterator<C2861h> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C2861h previous = listIterator.previous();
            if (previous != null && previous.f9134b < i) {
                listIterator.remove();
            }
        }
    }

    /* renamed from: a */
    public static long m16564a(LinkedList<C2861h> linkedList, StringBuilder sb) {
        Iterator<C2861h> it = linkedList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C2861h next = it.next();
            sb.append(next.toString());
            sb.append('\n');
            if (j < ((long) next.f9134b)) {
                j = (long) next.f9134b;
            }
        }
        return j;
    }

    /* renamed from: b */
    public static void m16571b(List<C2861h> list, int i) {
        if (i < 0) {
            list.clear();
            return;
        }
        ListIterator<C2861h> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().f9134b < i) {
                listIterator.remove();
            }
        }
    }

    /* renamed from: a */
    private static int m16562a(LinkedList<C2861h> linkedList, C2861h hVar) {
        int i;
        if (C2785b.m11769j()) {
            Log.v("TraceDataUtils", "method:" + hVar);
        }
        C2861h hVar2 = null;
        if (!linkedList.isEmpty()) {
            hVar2 = linkedList.peek();
        }
        if (hVar2 == null || hVar2.f9133a != hVar.f9133a || hVar2.f9136d != hVar.f9136d || hVar.f9136d == 0) {
            linkedList.push(hVar);
            return hVar.f9134b;
        }
        if (hVar.f9134b == 5000) {
            i = hVar2.f9134b;
        } else {
            i = hVar.f9134b;
        }
        hVar.f9134b = i;
        hVar2.mo12277a((long) hVar.f9134b);
        return hVar2.f9134b;
    }

    /* renamed from: a */
    public static int m16563a(LinkedList<C2861h> linkedList, C3974b bVar) {
        ListIterator<C2861h> listIterator = linkedList.listIterator(0);
        C3974b bVar2 = null;
        int i = 0;
        while (listIterator.hasNext()) {
            C3974b bVar3 = new C3974b(listIterator.next(), bVar2);
            i++;
            if (bVar2 != null || bVar3.mo15646a() == 0) {
                int a = bVar3.mo15646a();
                if (bVar2 == null || a == 0) {
                    bVar.mo15647a(bVar3);
                } else if (bVar2.mo15646a() >= a) {
                    while (bVar2 != null && bVar2.mo15646a() > a) {
                        bVar2 = bVar2.f12071b;
                    }
                    if (bVar2 != null) {
                        if (bVar2.f12071b != null) {
                            bVar3.f12071b = bVar2.f12071b;
                            bVar2.f12071b.mo15647a(bVar3);
                        }
                    }
                } else {
                    bVar2.mo15647a(bVar3);
                }
                bVar2 = bVar3;
            } else {
                if (C2785b.m11769j()) {
                    C2930g.m12388c("TraceDataUtils", "[stackToTree] SceneMethodsInfo begin error! why the first node'depth is not 0!", new Object[0]);
                }
                return 0;
            }
        }
        C2930g.m12386a("SceneMethodsInfo", "[stackToTree] count [%d] ", Integer.valueOf(i));
        return i;
    }

    /* renamed from: a */
    public static String m16565a(List<C2861h> list, long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = (long) (((float) j) * 0.3f);
        LinkedList linkedList = new LinkedList();
        for (C2861h hVar : list) {
            if (((long) hVar.f9134b) >= j2) {
                linkedList.add(hVar);
            }
        }
        Collections.sort(linkedList, new Comparator<C2861h>() {
            /* class com.bytedance.p230d.p231a.C3971a.C39721 */

            /* renamed from: a */
            public int compare(C2861h hVar, C2861h hVar2) {
                return Integer.compare((hVar2.f9136d + 1) * hVar2.f9134b, (hVar.f9136d + 1) * hVar.f9134b);
            }
        });
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add(list.get(0));
        } else if (linkedList.size() > 1 && ((C2861h) linkedList.peek()).f9133a == 1048574) {
            linkedList.removeFirst();
        }
        Iterator it = linkedList.iterator();
        if (it.hasNext()) {
            sb.append(((C2861h) it.next()).f9133a + "\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m16567a(C3974b bVar, LinkedList<C2861h> linkedList) {
        LinkedList linkedList2 = new LinkedList();
        while (bVar != null) {
            if (bVar.f12070a != null) {
                linkedList.add(bVar.f12070a);
            }
            LinkedList<C3974b> linkedList3 = bVar.f12072c;
            if (!linkedList3.isEmpty()) {
                for (int size = linkedList3.size() - 1; size >= 0; size--) {
                    linkedList2.add(linkedList3.get(size));
                }
            }
            bVar = (C3974b) linkedList2.pollLast();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0127  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m16566a(int r24, long[] r25, java.util.LinkedList<com.bytedance.apm.block.p136a.C2861h> r26, boolean r27, long r28, int r30) {
        /*
        // Method dump skipped, instructions count: 602
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p230d.p231a.C3971a.m16566a(int, long[], java.util.LinkedList, boolean, long, int):void");
    }
}
