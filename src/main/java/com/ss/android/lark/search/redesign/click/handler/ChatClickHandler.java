package com.ss.android.lark.search.redesign.click.handler;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.export.p2253a.C44897b;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ$\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J \u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u001a\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/ChatClickHandler;", "Lcom/ss/android/lark/search/redesign/click/handler/AbsItemClickHandler;", "contextProvider", "Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "(Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;)V", "mLoginDependency", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "applyConfirmBtnClick", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "reason", "", "joinGroupChat", "context", "Landroid/content/Context;", "chatId", "callback", "Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;", "joinPublicGroup", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "position", "", "newJoinPublicGroup", "oldJoinPublicGroup", "onItemClick", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "showFailedDialog", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "updateSearchChatMemberView", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.a.b */
public final class ChatClickHandler extends AbsItemClickHandler {

    /* renamed from: a */
    public static final Companion f132471a = new Companion(null);

    /* renamed from: b */
    private final ISearchModuleDependency.AbstractC53328n f132472b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/ChatClickHandler$Companion;", "", "()V", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/ChatClickHandler$newJoinPublicGroup$1", "Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;", "joinGroupChatSuccess", "", "chatId", "", "onCancelSendApply", "onError", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSendApplyError", "err", "sendApplySuccess", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.b$c */
    public static final class C53682c implements AbstractC44896a {

        /* renamed from: a */
        final /* synthetic */ ChatClickHandler f132474a;

        /* renamed from: b */
        final /* synthetic */ String f132475b;

        /* renamed from: c */
        final /* synthetic */ SearchChatInfo f132476c;

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: b */
        public void mo128966b() {
        }

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: a */
        public void mo128963a() {
            this.f132474a.mo183086a(UIHelper.getString(R.string.Lark_Group_JoinGroupToast));
            Log.m165389i("LarkSearch.Search.V2.ChatClickListener", "on send apply success:" + this.f132475b);
        }

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: b */
        public void mo128967b(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                this.f132474a.mo183086a(errorResult.getDisplayMsg());
            }
            Log.m165383e("LarkSearch.Search.V2.ChatClickListener", "on send apply error: " + errorResult + " chatId: " + this.f132475b);
        }

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: a */
        public void mo128964a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Log.m165383e("LarkSearch.Search.V2.ChatClickListener", "join public group failed: " + errorResult + " chatId: " + this.f132475b);
            this.f132474a.mo183090a(errorResult);
        }

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: a */
        public void mo128965a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            this.f132474a.mo183092a(this.f132476c);
            this.f132474a.mo183085a().mo181793b(str, -1);
            Log.m165389i("LarkSearch.Search.V2.ChatClickListener", "join group chat success:" + str);
        }

        C53682c(ChatClickHandler bVar, String str, SearchChatInfo searchChatInfo) {
            this.f132474a = bVar;
            this.f132475b = str;
            this.f132476c = searchChatInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/ChatClickHandler$applyConfirmBtnClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.b$b */
    public static final class C53681b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ChatClickHandler f132473a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53681b(ChatClickHandler bVar) {
            this.f132473a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f132473a.mo183086a(UIHelper.getString(R.string.Lark_Group_JoinGroupToast));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                this.f132473a.mo183086a(errorResult.getDisplayMsg());
            }
            Log.m165383e("LarkSearch.Search.V2.ChatClickListener", errorResult.toString());
        }
    }

    /* renamed from: a */
    public final void mo183092a(SearchChatInfo searchChatInfo) {
        Intrinsics.checkParameterIsNotNull(searchChatInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        searchChatInfo.setMember(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/ChatClickHandler$onItemClick$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.b$e */
    public static final class C53685e implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ ChatClickHandler f132481a;

        /* renamed from: b */
        final /* synthetic */ String f132482b;

        /* renamed from: c */
        final /* synthetic */ SearchBaseInfo f132483c;

        /* renamed from: d */
        final /* synthetic */ int f132484d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.ChatClickListener", "getChatById failed: " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat == null) {
                Log.m165383e("LarkSearch.Search.V2.ChatClickListener", "get chat by id fail: " + this.f132482b);
                return;
            }
            boolean c = C53339b.m206443c();
            if (!chat.isPublic() || (chat.getRole() != Chat.Role.VISITOR && (chat.getRole() != Chat.Role.THREAD_FOLLOWER || c))) {
                this.f132481a.mo183085a().mo181793b(chat.getId(), -1);
            } else {
                this.f132481a.mo183093a((SearchChatInfo) this.f132483c, chat, this.f132484d);
            }
            Log.m165389i("LarkSearch.Search.V2.ChatClickListener", "get chat by id success: " + this.f132482b);
        }

        C53685e(ChatClickHandler bVar, String str, SearchBaseInfo searchBaseInfo, int i) {
            this.f132481a = bVar;
            this.f132482b = str;
            this.f132483c = searchBaseInfo;
            this.f132484d = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatClickHandler(IContextProvider eVar) {
        super(eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "contextProvider");
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        this.f132472b = a.mo181761j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/ChatClickHandler$oldJoinPublicGroup$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/lang/Void;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aVoid", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.b$d */
    public static final class C53683d implements IGetDataCallback<Void> {

        /* renamed from: a */
        final /* synthetic */ ChatClickHandler f132477a;

        /* renamed from: b */
        final /* synthetic */ SearchChatInfo f132478b;

        /* renamed from: c */
        final /* synthetic */ Chat f132479c;

        /* renamed from: a */
        public void onSuccess(Void r3) {
            this.f132477a.mo183092a(this.f132478b);
            this.f132477a.mo183085a().mo181793b(this.f132479c.getId(), -1);
            Log.m165389i("LarkSearch.Search.V2.ChatClickListener", "old join public group success chatID: " + this.f132479c.getId());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Activity C;
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Log.m165383e("LarkSearch.Search.V2.ChatClickListener", "join public failed: " + errorResult + " chatId: " + this.f132479c.getId());
            if (errorResult.getErrorCode() == 5020) {
                IContextProvider b = this.f132477a.mo183088b();
                if (b != null && (C = b.mo183099C()) != null) {
                    ISearchModuleDependency a = C53258a.m205939a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
                    a.mo181762k().showApplyDialog(C, new C53684a(this));
                    return;
                }
                return;
            }
            this.f132477a.mo183090a(errorResult);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "reason", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.a.a.b$d$a */
        public static final class C53684a implements ISearchModuleDependency.AbstractC53318f.AbstractC53319a {

            /* renamed from: a */
            final /* synthetic */ C53683d f132480a;

            C53684a(C53683d dVar) {
                this.f132480a = dVar;
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53318f.AbstractC53319a
            /* renamed from: a */
            public final void mo181955a(View view, String str) {
                this.f132480a.f132477a.mo183091a(this.f132480a.f132479c, str);
            }
        }

        C53683d(ChatClickHandler bVar, SearchChatInfo searchChatInfo, Chat chat) {
            this.f132477a = bVar;
            this.f132478b = searchChatInfo;
            this.f132479c = chat;
        }
    }

    /* renamed from: a */
    public final void mo183090a(ErrorResult errorResult) {
        Activity C;
        Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        IContextProvider b = mo183088b();
        if (b != null && (C = b.mo183099C()) != null) {
            if (BillingTipsDialog.m226153a(errorResult.getErrorCode())) {
                BillingTipsDialog.m226151a(C, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
            } else {
                new C25639g(C).mo89242c(errorResult.getDisplayMsg()).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmDone, (DialogInterface.OnClickListener) null).mo89239c();
            }
        }
    }

    /* renamed from: a */
    public final void mo183091a(Chat chat, String str) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        mo183085a().mo181786a(chat.getId(), str, new C53681b(this));
    }

    /* renamed from: a */
    private final void m207814a(SearchChatInfo searchChatInfo, String str, int i) {
        Activity C;
        IContextProvider b = mo183088b();
        if (b != null && (C = b.mo183099C()) != null) {
            mo183089a(C, str, new C53682c(this, str, searchChatInfo));
        }
    }

    /* renamed from: b */
    private final void m207815b(SearchChatInfo searchChatInfo, Chat chat, int i) {
        ISearchModuleDependency.AbstractC53328n nVar = this.f132472b;
        Intrinsics.checkExpressionValueIsNotNull(nVar, "mLoginDependency");
        mo183085a().mo181787a(chat.getId(), CollectionsKt.listOf(nVar.mo181815a()), new UIGetDataCallback(new C53683d(this, searchChatInfo, chat)));
    }

    /* renamed from: a */
    public final void mo183089a(Context context, String str, AbstractC44896a aVar) {
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        ISearchModuleDependency.AbstractC53326l l = a.mo181763l();
        ISearchModuleDependency.AbstractC53328n nVar = this.f132472b;
        Intrinsics.checkExpressionValueIsNotNull(nVar, "mLoginDependency");
        l.mo181772a(context, str, CollectionsKt.listOf(nVar.mo181815a()), 4, new C44897b(aVar));
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
    /* renamed from: a */
    public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        Activity C;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (searchBaseInfo instanceof SearchChatInfo) {
            SearchChatInfo searchChatInfo = (SearchChatInfo) searchBaseInfo;
            String id = searchChatInfo.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
            mo183087a(id, SearchCommonConstants.FeedType.CHAT);
            if (!searchChatInfo.isPublic() || searchChatInfo.isMember()) {
                mo183085a().mo181783a(id, new UIGetDataCallback(new C53685e(this, id, searchBaseInfo, i)));
                return;
            }
            IContextProvider b = mo183088b();
            if (b != null && (C = b.mo183099C()) != null) {
                C53258a.m205939a().mo181753d(C, id);
                SearchClickReporter.f133152a.mo183815a(searchBaseInfo);
            }
        }
    }

    /* renamed from: a */
    public final void mo183093a(SearchChatInfo searchChatInfo, Chat chat, int i) {
        if (C53258a.m205939a().mo181745a("app.join.group.chat")) {
            String id = chat.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            m207814a(searchChatInfo, id, i);
            return;
        }
        m207815b(searchChatInfo, chat, i);
    }
}
