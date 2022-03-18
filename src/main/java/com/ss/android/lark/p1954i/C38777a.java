package com.ss.android.lark.p1954i;

import com.ss.android.lark.p1954i.p1955a.AbstractC38780a;
import com.ss.android.lark.p1954i.p1956b.AbstractC38781a;
import com.ss.android.lark.p1954i.p1956b.p1957a.C38782a;
import com.ss.android.lark.p1954i.p1956b.p1957a.C38788b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57762aa;

/* renamed from: com.ss.android.lark.i.a */
public class C38777a {

    /* renamed from: a */
    C57762aa f99711a = new C57762aa();

    /* renamed from: com.ss.android.lark.i.a$a */
    public interface AbstractC38779a {
        void onPushSaveToNutStoreState(String str, int i);
    }

    /* renamed from: a */
    public static AbstractC38780a m153086a() {
        return (AbstractC38780a) ApiUtils.getApi(AbstractC38780a.class);
    }

    /* renamed from: b */
    public AbstractC38781a mo142136b() {
        return (AbstractC38781a) this.f99711a.mo196049a(AbstractC38781a.class, new C57762aa.AbstractC57763a<AbstractC38781a>() {
            /* class com.ss.android.lark.p1954i.C38777a.C387781 */

            /* renamed from: a */
            public AbstractC38781a mo133374b(Class<AbstractC38781a> cls) {
                return new C38788b();
            }
        });
    }

    /* renamed from: a */
    public void mo142135a(AbstractC38779a aVar) {
        if (aVar != null) {
            C38782a.m153094a().mo142142a(aVar);
        }
    }

    /* renamed from: b */
    public void mo142137b(AbstractC38779a aVar) {
        if (aVar != null) {
            C38782a.m153094a().mo142144b(aVar);
        }
    }
}
