package com.bytedance.ee.bear.basesdk.apiimpl;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.basesdk.api.AbstractC4381f;
import com.bytedance.ee.bear.basesdk.api.AbstractC4392p;
import com.bytedance.ee.bear.lark.p418f.C8039a;
import com.bytedance.ee.bear.search.AbstractC10816c;
import com.bytedance.ee.bear.search.lark.p540a.C10860b;
import com.bytedance.ee.bear.search.lark.space.SpaceSearchFragment;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.q */
public final class C4414q implements AbstractC4392p {
    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4392p
    /* renamed from: a */
    public AbstractC10816c mo17078a() {
        return new C10860b();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4392p
    /* renamed from: b */
    public AbstractC4381f mo17081b() {
        return new C4401g();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4392p
    /* renamed from: a */
    public void mo17080a(Context context) {
        C13479a.m54764b("TabControlImpl", "preloadSpacePageUI()...");
        C8039a.m32112a().mo31077a(context);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4392p
    /* renamed from: a */
    public AbstractC10816c mo17079a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SEARCH_PAGE_TYPE", 1);
        bundle.putString("module", "GlobalSearch");
        bundle.putBoolean("is_combine_wiki", z);
        SpaceSearchFragment spaceSearchFragment = new SpaceSearchFragment();
        spaceSearchFragment.setArguments(bundle);
        return spaceSearchFragment;
    }
}
