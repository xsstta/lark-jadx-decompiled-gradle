package me.p3476a.p3477a.p3478a.p3479a;

import androidx.recyclerview.widget.RecyclerView;
import me.p3476a.p3477a.p3478a.p3479a.p3480a.C69589b;

/* renamed from: me.a.a.a.a.g */
public class C69607g {
    /* renamed from: a */
    public static AbstractC69593b m267378a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            return new C69608h(new C69589b(recyclerView));
        }
        if (i == 1) {
            return new C69585a(new C69589b(recyclerView));
        }
        throw new IllegalArgumentException("orientation");
    }
}
