package com.ss.android.lark.search.impl.func.detail.p2615a;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.entity.viewdata.SearchChatterViewData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53576c;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.p2592b.AbstractC53340a;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.p2634b.C53883a;
import com.ss.android.lark.utils.UIHelper;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.detail.a.d */
public class C53559d extends AbstractC53576c implements AbstractC53584f.AbstractC53587b {

    /* renamed from: d */
    public C53557c f132277d;

    /* renamed from: e */
    public C53555b f132278e;

    /* renamed from: f */
    private Map<String, AbstractC53340a> f132279f;

    /* renamed from: a */
    private void m207392a(String str, int i) {
        mo182867a(str, i, C53883a.m208794a().mo183799b());
    }

    /* renamed from: b */
    private void m207394b(String str, int i) {
        mo182874b(str, i, C53883a.m208794a().mo183799b());
    }

    /* renamed from: b */
    private void m207393b(SearchChatterViewData searchChatterViewData, int i) {
        mo182875c();
        m207392a(searchChatterViewData.getChatterId(), i);
        mo182865a(this.f132278e.mo182853l(), SearchCommonConstants.SearchHistorySource.MAIN);
    }

    /* renamed from: a */
    public void mo182804a(final SearchChatterViewData searchChatterViewData, final int i) {
        final boolean z;
        m207393b(searchChatterViewData, i);
        if (searchChatterViewData.getType() == Chatter.ChatterType.BOT) {
            z = true;
        } else {
            z = false;
        }
        final String b = C53883a.m208794a().mo183799b();
        this.f132278e.mo182797b(searchChatterViewData.getChatterId(), new UIGetDataCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.search.impl.func.detail.p2615a.C53559d.C535601 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (!C53258a.m205939a().mo181745a("lark.feed.openapp.v2") || !z) {
                    C53559d.this.f132278e.mo182841a(chat.getId(), SearchCommonConstants.FeedType.CHAT);
                    C53559d.this.f132277d.mo182800c(chat.getId());
                    C53559d.this.mo182806a(chat.getId(), i, z, searchChatterViewData.getId(), b);
                } else {
                    C53258a.m205939a().mo181743a(chat.getId(), true);
                    C53559d.this.mo182806a(chat.getId(), i, true, searchChatterViewData.getId(), b);
                }
                Log.m165389i("LarkSearch.Search.SearchChatterViewDelegate", "go to chat success, chatId:" + chat.getId());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LarkSearch.Search.SearchChatterViewDelegate", "getP2pChatByChatterId failed: " + errorResult.getDebugMsg());
                if (errorResult.getErrorCode() == 4051) {
                    C53258a.m205939a().mo181756f().mo181800d(errorResult.getDisplayMsg());
                } else {
                    C53559d.this.f132277d.mo182820b(UIHelper.getString(R.string.Lark_Search_EnterChatFailedError));
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo182803a(SearchBaseViewData searchBaseViewData, int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC53340a aVar = this.f132279f.get(str);
            if (aVar == null) {
                Log.m165383e("LarkSearch.Search.SearchChatterViewDelegate", "can not find partial click action");
            } else {
                aVar.handlePartialClick(searchBaseViewData, i);
            }
        }
    }

    /* renamed from: b */
    private void m207395b(String str, int i, String str2, String str3) {
        m207394b(str, i);
        mo182865a(this.f132278e.mo182853l(), SearchCommonConstants.SearchHistorySource.MAIN);
        mo182869a("secret_chat", "mobile_contact", i, str, str3, Scene.Type.SEARCH_CHATTERS.getNumber(), str2);
    }

    /* renamed from: a */
    public void mo182805a(String str, int i, String str2, String str3) {
        m207395b(str, i, str2, str3);
        this.f132278e.mo182841a(str, SearchCommonConstants.FeedType.CHAT);
        this.f132277d.mo182800c(str);
    }

    /* renamed from: a */
    public void mo182806a(String str, int i, boolean z, String str2, String str3) {
        if (!z) {
            mo182869a("single", "mobile_contact", i, str, str3, Scene.Type.SEARCH_CHATTERS.getNumber(), str2);
        } else {
            mo182869a("single_bot", "mobile_contact", i, str, str3, Scene.Type.SEARCH_CHATTERS.getNumber(), str2);
        }
    }
}
