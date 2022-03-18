package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1350a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.q */
public class C1399q {

    /* renamed from: a */
    final AbstractC1400a f4947a;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.q$a */
    public interface AbstractC1400a {
        /* renamed from: a */
        C1350a.C1352b mo7344a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo7346a(C1350a.C1352b bVar);
    }

    C1399q(AbstractC1400a aVar) {
        this.f4947a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7458a(List<C1350a.C1352b> list) {
        while (true) {
            int b = m6383b(list);
            if (b != -1) {
                m6382a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private int m6383b(List<C1350a.C1352b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4785a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m6382a(List<C1350a.C1352b> list, int i, int i2) {
        C1350a.C1352b bVar = list.get(i);
        C1350a.C1352b bVar2 = list.get(i2);
        int i3 = bVar2.f4785a;
        if (i3 == 1) {
            m6384c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo7459a(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo7460b(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: c */
    private void m6384c(List<C1350a.C1352b> list, int i, C1350a.C1352b bVar, int i2, C1350a.C1352b bVar2) {
        int i3;
        if (bVar.f4788d < bVar2.f4786b) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        if (bVar.f4786b < bVar2.f4786b) {
            i3++;
        }
        if (bVar2.f4786b <= bVar.f4786b) {
            bVar.f4786b += bVar2.f4788d;
        }
        if (bVar2.f4786b <= bVar.f4788d) {
            bVar.f4788d += bVar2.f4788d;
        }
        bVar2.f4786b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7460b(java.util.List<androidx.recyclerview.widget.C1350a.C1352b> r8, int r9, androidx.recyclerview.widget.C1350a.C1352b r10, int r11, androidx.recyclerview.widget.C1350a.C1352b r12) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1399q.mo7460b(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7459a(java.util.List<androidx.recyclerview.widget.C1350a.C1352b> r9, int r10, androidx.recyclerview.widget.C1350a.C1352b r11, int r12, androidx.recyclerview.widget.C1350a.C1352b r13) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1399q.mo7459a(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
