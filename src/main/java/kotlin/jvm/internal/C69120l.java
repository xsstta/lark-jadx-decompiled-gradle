package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.l */
public class C69120l {

    /* renamed from: a */
    private final ArrayList<Object> f173214a;

    /* renamed from: a */
    public int mo239351a() {
        return this.f173214a.size();
    }

    /* renamed from: b */
    public void mo239354b(Object obj) {
        this.f173214a.add(obj);
    }

    public C69120l(int i) {
        this.f173214a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public Object[] mo239353a(Object[] objArr) {
        return this.f173214a.toArray(objArr);
    }

    /* renamed from: a */
    public void mo239352a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f173214a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f173214a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f173214a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj2 : (Iterable) obj) {
                    this.f173214a.add(obj2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f173214a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }
}
