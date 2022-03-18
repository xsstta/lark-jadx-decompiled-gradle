package com.bytedance.ee.bear.drive.loader.download.platform.p358a;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a.g */
public class C7017g implements AbstractC7013c {

    /* renamed from: a */
    private static C7019a f18968a = new C7019a();

    /* renamed from: b */
    private List<Integer> f18969b;

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a.g$a */
    private static class C7019a implements Comparator<Integer> {
        private C7019a() {
        }

        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            if (num.intValue() == 3 || num.intValue() == 9 || num.intValue() == 11) {
                return -1;
            }
            if (num2.intValue() == 3 || num2.intValue() == 9 || num2.intValue() == 11) {
                return 1;
            }
            return 0;
        }
    }

    public C7017g(List<Integer> list) {
        if (list != null) {
            this.f18969b = new ArrayList(list);
        } else {
            this.f18969b = new ArrayList(1);
        }
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c
    /* renamed from: a */
    public List<Integer> mo27565a(AbstractC6949c cVar, List<Integer> list) {
        if (C7096d.m28344a(list)) {
            if (this.f18969b.contains(-2)) {
                this.f18969b.remove((Object) -2);
            }
            Collections.sort(this.f18969b, f18968a);
            this.f18969b.addAll(list);
            return this.f18969b;
        }
        List<Integer> f = C7096d.m28354f();
        f.retainAll(list);
        list.retainAll(this.f18969b);
        this.f18969b.removeAll(list);
        this.f18969b.retainAll(C7096d.m28356h());
        list.addAll(this.f18969b);
        list.addAll(f);
        return list;
    }
}
