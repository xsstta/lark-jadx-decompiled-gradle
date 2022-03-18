package com.ss.android.lark.search.impl.func.chatinside.detail;

import android.util.Pair;
import android.view.View;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53417a;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53420c;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53423e;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2611b.C53428a;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2611b.C53430b;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2611b.C53433d;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53458a;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53463b;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53469d;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.C53476a;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.C53478b;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.C53482d;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.c */
public class C53457c {
    /* renamed from: a */
    public static Pair<AbstractC53443a, BaseChatInsideSearchView> m207006a(BaseFragment baseFragment, View view, String str, int i) {
        if (i == 3) {
            return Pair.create(new C53458a(str, i), new C53463b(baseFragment, new C53469d(baseFragment, view)));
        }
        if (i == 6) {
            return Pair.create(new C53476a(str, i), new C53478b(baseFragment, new C53482d(baseFragment, view)));
        }
        if (i == 13) {
            return Pair.create(new C53428a(str, i), new C53430b(baseFragment, new C53433d(baseFragment, view)));
        }
        if (i != 10000001) {
            return null;
        }
        return Pair.create(new C53417a(str, i), new C53420c(baseFragment, new C53423e(baseFragment, view)));
    }
}
