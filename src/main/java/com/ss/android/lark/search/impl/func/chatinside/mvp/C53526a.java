package com.ss.android.lark.search.impl.func.chatinside.mvp;

import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.search.impl.func.chatinside.detail.C53416a;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.C53491a;
import com.ss.android.lark.search.impl.func.chatinside.mvp.AbstractC53528c;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.mvp.a */
public class C53526a extends BaseModel implements AbstractC53528c.AbstractC53529a {

    /* renamed from: a */
    private String f132240a;

    /* renamed from: b */
    private boolean f132241b;

    /* renamed from: c */
    private boolean f132242c;

    /* renamed from: d */
    private int f132243d;

    /* renamed from: e */
    private final Map<Integer, Integer> f132244e = new HashMap();

    @Override // com.ss.android.lark.search.impl.func.chatinside.mvp.AbstractC53528c.AbstractC53529a
    /* renamed from: b */
    public int mo182758b() {
        if (this.f132244e.containsKey(Integer.valueOf(this.f132243d))) {
            return this.f132244e.get(Integer.valueOf(this.f132243d)).intValue();
        }
        return 0;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.mvp.AbstractC53528c.AbstractC53529a
    /* renamed from: a */
    public List<C29527a> mo182757a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C29527a(C53416a.m206852a(this.f132240a, 3), UIHelper.getString(R.string.Lark_Legacy_MessageFragmentTitle)));
        this.f132244e.put(0, Integer.valueOf(arrayList.size() - 1));
        arrayList.add(new C29527a(C53416a.m206852a(this.f132240a, 6), UIHelper.getString(R.string.Lark_Legacy_SendDocKey)));
        this.f132244e.put(1, Integer.valueOf(arrayList.size() - 1));
        if (this.f132241b) {
            arrayList.add(new C29527a(C53416a.m206852a(this.f132240a, 10000001), UIHelper.getString(R.string.Lark_Legacy_FileFragmentTitle)));
            this.f132244e.put(2, Integer.valueOf(arrayList.size() - 1));
        }
        arrayList.add(new C29527a(C53491a.m207166a(this.f132240a, this.f132242c), UIHelper.getString(R.string.Lark_Legacy_SearchPhotoInchat)));
        this.f132244e.put(3, Integer.valueOf(arrayList.size() - 1));
        arrayList.add(new C29527a(C53416a.m206852a(this.f132240a, 13), UIHelper.getString(R.string.Lark_Search_Link)));
        this.f132244e.put(4, Integer.valueOf(arrayList.size() - 1));
        return arrayList;
    }

    public C53526a(String str, boolean z, boolean z2, int i) {
        this.f132240a = str;
        this.f132241b = z;
        this.f132242c = z2;
        this.f132243d = i;
    }
}
