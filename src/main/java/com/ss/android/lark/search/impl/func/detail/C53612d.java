package com.ss.android.lark.search.impl.func.detail;

import android.app.Activity;
import android.util.Pair;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a;
import com.ss.android.lark.search.impl.func.detail.base.BaseSearchView;
import com.ss.android.lark.search.impl.func.detail.p2617c.C53606b;
import com.ss.android.lark.search.impl.func.detail.p2617c.C53608d;
import com.ss.android.lark.search.impl.func.detail.p2617c.C53611f;
import com.ss.android.lark.search.impl.func.detail.p2618d.C53613a;
import com.ss.android.lark.search.impl.func.detail.p2618d.C53616c;
import com.ss.android.lark.search.impl.func.detail.p2618d.C53620e;

/* renamed from: com.ss.android.lark.search.impl.func.detail.d */
public class C53612d {
    /* renamed from: a */
    public static Pair<? extends AbstractC53569a, ? extends BaseSearchView> m207554a(Activity activity, SearchDetailInitData searchDetailInitData) {
        switch (searchDetailInitData.resultType) {
            case 100000010:
                return Pair.create(new C53613a(searchDetailInitData), new C53616c(activity, new C53620e(activity), searchDetailInitData));
            case 100000011:
                return Pair.create(new C53606b(searchDetailInitData), new C53608d(activity, new C53611f(activity), searchDetailInitData));
            default:
                return null;
        }
    }
}
