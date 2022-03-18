package com.ss.android.lark.search.impl.func.chatinside.detail.p2613d;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.search.constant.SearchConstants;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b;
import com.ss.android.lark.search.impl.func.pick.chatterpick.C53667b;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.d.c */
public class C53480c extends AbstractC53447b<SearchBaseInfo> implements AbstractC53483e {

    /* renamed from: c */
    private C53476a f132134c;

    /* renamed from: d */
    private C53478b f132135d;

    /* renamed from: i */
    public void mo182603i() {
        this.f132134c.mo182596s();
        this.f132135d.mo182572j();
        mo182542d();
        String b = this.f132134c.mo182515b();
        if (TextUtils.isEmpty(b)) {
            mo182538b(false);
        } else {
            mo182536a(b, false);
        }
    }

    /* renamed from: a */
    public void mo182602a(SearchConstants.SpaceType spaceType) {
        this.f132134c.mo182595a(spaceType);
        String b = this.f132134c.mo182515b();
        if (!mo182540b(b)) {
            mo182537a(true);
        } else {
            mo182536a(b, false);
        }
    }

    public C53480c(C53476a aVar, C53478b bVar) {
        super(aVar, bVar);
        this.f132134c = aVar;
        this.f132135d = bVar;
    }

    /* renamed from: a */
    public void mo182601a(final BaseFragment baseFragment, final int i) {
        C53476a aVar = this.f132134c;
        aVar.mo182510a(aVar.mo182561r(), new UIGetDataCallback(new IGetDataCallback<List<BasePickViewData>>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.C53480c.C534811 */

            /* renamed from: a */
            public void onSuccess(List<BasePickViewData> list) {
                C53667b.m207749a(baseFragment, list, null, i);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("LarkSearch.Search.ChatInsideSearchSpaceViewDelegate", "getFilterPickChatterViewData failed: " + errorResult.getDebugMsg());
            }
        }));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b
    /* renamed from: b */
    public void mo182472b(SearchBaseInfo searchBaseInfo, int i) {
        if (searchBaseInfo instanceof SearchSpaceInfo) {
            C53478b bVar = this.f132135d;
            bVar.mo182599a(bVar.mo182490f(), ((SearchSpaceInfo) searchBaseInfo).getDocUrl());
        } else if (searchBaseInfo instanceof SearchWikiInfo) {
            C53478b bVar2 = this.f132135d;
            bVar2.mo182599a(bVar2.mo182490f(), ((SearchWikiInfo) searchBaseInfo).getUrl());
        }
    }
}
