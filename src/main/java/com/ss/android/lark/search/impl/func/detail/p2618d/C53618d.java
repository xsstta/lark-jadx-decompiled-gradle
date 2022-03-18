package com.ss.android.lark.search.impl.func.detail.p2618d;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.entity.viewdata.SearchChatterViewData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53576c;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.hitpoint.profile.ProfileHitPoint;
import com.ss.android.lark.search.impl.p2592b.AbstractC53340a;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.Scene;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.detail.d.d */
public class C53618d extends AbstractC53576c implements AbstractC53584f.AbstractC53591f {

    /* renamed from: d */
    public C53613a f132371d;

    /* renamed from: e */
    private C53616c f132372e;

    /* renamed from: f */
    private Map<String, AbstractC53340a> f132373f = new HashMap();

    /* renamed from: d */
    private void m207569d() {
        this.f132373f.put("chatter_partial_click/open_contact_profile", new AbstractC53340a() {
            /* class com.ss.android.lark.search.impl.func.detail.p2618d.$$Lambda$d$Kt3zGVmeMsXlD0l7nBHkoW4Hr18 */

            @Override // com.ss.android.lark.search.impl.p2592b.AbstractC53340a
            public final void handlePartialClick(SearchBaseViewData searchBaseViewData, int i) {
                C53618d.this.m207566a((C53618d) ((SearchChatterViewData) searchBaseViewData), (SearchChatterViewData) i);
            }
        });
    }

    /* renamed from: c */
    private void m207568c(final String str) {
        this.f132371d.mo182903b(str, new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.search.impl.func.detail.p2618d.C53618d.C536191 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                C53618d.this.f132371d.mo182841a(chat.getId(), SearchCommonConstants.FeedType.CHAT);
                Log.m165389i("LarkSearch.Search.SearchUserViewDelegate", "getP2pChatByChatterId success userId: " + str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LarkSearch.Search.SearchUserViewDelegate", "getP2pChatByChatterId failed: " + errorResult.getDebugMsg() + "userId: " + str);
            }
        });
    }

    public C53618d(C53616c cVar, C53613a aVar) {
        super(cVar, aVar);
        this.f132371d = aVar;
        this.f132372e = cVar;
        m207569d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m207566a(SearchChatterViewData searchChatterViewData, int i) {
        ProfileHitPoint.f131905a.mo182048a(this.f132371d.mo182843b(), searchChatterViewData.getChatterId(), i, "mobile_contact", "organizational structure");
        this.f132372e.mo182800c(searchChatterViewData.getChatterId());
    }

    /* renamed from: a */
    private void m207565a(int i, String str, String str2) {
        m207567b(i, str, str2);
        mo182875c();
        mo182865a(this.f132371d.mo182853l(), SearchCommonConstants.SearchHistorySource.MAIN);
    }

    /* renamed from: b */
    private void m207567b(int i, String str, String str2) {
        mo182868a("single", "mobile_contact", i, Scene.Type.SEARCH_USERS.getNumber(), str, str2);
    }

    /* renamed from: c */
    public void mo182909c(String str, int i, String str2) {
        m207565a(i, str, str2);
        m207568c(str);
        this.f132372e.mo182905d(str);
    }

    /* renamed from: a */
    public void mo182908a(SearchChatterViewData searchChatterViewData, int i, String str) {
        AbstractC53340a aVar = this.f132373f.get(str);
        if (aVar == null) {
            Log.m165383e("LarkSearch.Search.SearchUserViewDelegate", "can not find partial click action");
        } else {
            aVar.handlePartialClick(searchChatterViewData, i);
        }
    }
}
