package com.ss.android.lark.contact.impl.setting.widget;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.setting.widget.c */
public final class C36076c {

    /* renamed from: a */
    private List<C36075b> f93242a = new ArrayList();

    /* renamed from: b */
    public boolean mo132649b() {
        return CollectionUtils.isEmpty(this.f93242a);
    }

    /* renamed from: a */
    public List<C36074a> mo132647a() {
        if (this.f93242a == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (C36075b bVar : this.f93242a) {
            arrayList.add(new C36074a(bVar.f93236a, bVar.f93237b, bVar.f93238c, bVar.f93239d, bVar.f93240e, bVar.f93241f));
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo132648a(C36075b bVar) {
        return this.f93242a.add(bVar);
    }

    /* renamed from: a */
    public C36075b mo132646a(String str) {
        List<C36075b> list = this.f93242a;
        if (list == null) {
            return new C36075b();
        }
        for (C36075b bVar : list) {
            if (TextUtils.equals(str, bVar.f93236a)) {
                return bVar;
            }
        }
        return new C36075b();
    }
}
