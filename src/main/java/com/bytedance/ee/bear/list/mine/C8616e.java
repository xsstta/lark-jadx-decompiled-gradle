package com.bytedance.ee.bear.list.mine;

import android.content.Context;
import com.bytedance.ee.bear.facade.common.p380a.C7662a;
import com.bytedance.ee.bear.list.homepage.BaseHomeFragment;
import com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a;
import com.bytedance.ee.bear.service.C10917c;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.mine.e */
public class C8616e extends BaseHomeFragment {
    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment
    /* renamed from: p */
    public int mo33065p() {
        return R.layout.list_home_my_space;
    }

    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment
    /* renamed from: a */
    public AbstractC8509a mo33060a(C7662a aVar, Context context, C10917c cVar, AppBarLayout appBarLayout) {
        return new C8615d(aVar, context, cVar, appBarLayout);
    }
}
