package com.ss.android.lark.search.redesign.click.handler;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.utils.C57782ag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/MessageClickHandler;", "Lcom/ss/android/lark/search/redesign/click/handler/AbsItemClickHandler;", "contextProvider", "Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "(Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;)V", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "startDefaultModeChat", "Lcom/ss/android/lark/searchcommon/dto/info/SearchMessageInfo;", "startThreadModeChat", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.a.g */
public final class MessageClickHandler extends AbsItemClickHandler {

    /* renamed from: a */
    public static final Companion f132489a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/MessageClickHandler$Companion;", "", "()V", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageClickHandler(IContextProvider eVar) {
        super(eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "contextProvider");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/MessageClickHandler$onItemClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.g$b */
    public static final class C53687b implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ MessageClickHandler f132490a;

        /* renamed from: b */
        final /* synthetic */ SearchBaseInfo f132491b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165397w("LarkSearch.Search.V2.MessageClickListener", "handleClick getChatById failed: " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat == null) {
                Log.m165397w("LarkSearch.Search.V2.MessageClickListener", "handleClick getChatById failed: chat is null");
            } else if (chat.isThread()) {
                this.f132490a.mo183102b((SearchMessageInfo) this.f132491b);
            } else {
                this.f132490a.mo183101a((SearchMessageInfo) this.f132491b);
            }
        }

        C53687b(MessageClickHandler gVar, SearchBaseInfo searchBaseInfo) {
            this.f132490a = gVar;
            this.f132491b = searchBaseInfo;
        }
    }

    /* renamed from: b */
    public final void mo183102b(SearchMessageInfo searchMessageInfo) {
        mo183087a(searchMessageInfo.getThreadId(), SearchCommonConstants.FeedType.THREAD);
        mo183085a().mo181782a(searchMessageInfo.getThreadId(), searchMessageInfo.getMessageThreadPosition());
    }

    /* renamed from: a */
    public final void mo183101a(SearchMessageInfo searchMessageInfo) {
        if (TextUtils.isEmpty(searchMessageInfo.getP2pBotId()) || !C53258a.m205939a().mo181745a("lark.feed.openapp.v2")) {
            mo183087a(searchMessageInfo.getChatId(), SearchCommonConstants.FeedType.CHAT);
            mo183085a().mo181793b(searchMessageInfo.getChatId(), searchMessageInfo.getPosition());
            return;
        }
        C53258a.m205939a().mo181744a(searchMessageInfo.getChatId(), true, searchMessageInfo.getPosition());
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
    /* renamed from: a */
    public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (searchBaseInfo instanceof SearchMessageInfo) {
            SearchMessageInfo searchMessageInfo = (SearchMessageInfo) searchBaseInfo;
            if (C57782ag.m224241a(searchMessageInfo.getThreadId())) {
                mo183101a(searchMessageInfo);
            } else {
                mo183085a().mo181783a(searchMessageInfo.getChatId(), new UIGetDataCallback(new C53687b(this, searchBaseInfo)));
            }
        }
    }
}
