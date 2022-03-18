package com.ss.android.lark.mm.module.detail.menu.p2298a.p2299a;

import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.widget.moreDetails.repo.MmMoreDetails;

/* renamed from: com.ss.android.lark.mm.module.detail.menu.a.a.a */
public class C46106a {

    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a.a.a$a */
    public interface AbstractC46108a {
        /* renamed from: a */
        void mo161985a(C47068a aVar);

        /* renamed from: a */
        void mo161986a(MmMoreDetails mmMoreDetails);
    }

    /* renamed from: a */
    public void mo161983a(String str, String str2, final AbstractC46108a aVar) {
        C47057a.m186295j(str, str2, new AbstractC47070c<MmMoreDetails>() {
            /* class com.ss.android.lark.mm.module.detail.menu.p2298a.p2299a.C46106a.C461071 */

            /* renamed from: a */
            public void mo161289a(MmMoreDetails mmMoreDetails) {
                aVar.mo161986a(mmMoreDetails);
            }

            @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
            /* renamed from: a */
            public void mo161288a(C47068a aVar) {
                aVar.mo161985a(aVar);
                C45855f.m181665d("MoreDetailsRepo", "onError " + aVar);
            }
        });
    }
}
