package com.ss.android.lark.member_manage.impl.show_member.team_group.show_member;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.base.p2259b.C45051a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0016\u0010\u001a\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014H\u0016J \u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractModel;", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mCondition", "", "mIsForceNet", "", "(Lcom/ss/android/lark/chat/entity/chat/Chat;IZ)V", "mChatChatterSearcher", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ChatChatterSearcher;", "mShowMemLoader", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/TeamShowMemberLoader;", "getCurrentChat", "getItemChatter", "", BottomDialog.f17198f, "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "hasMore", "loadFirstPageMembers", "Lcom/larksuite/framework/callback/UIGetContinualDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "loadMoreMembers", "search", "key", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/SearchData;", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.c */
public final class MemberShowModel extends BaseModel implements IMemberShowContract.IMemberShowContractModel {

    /* renamed from: a */
    public static final Companion f114544a = new Companion(null);

    /* renamed from: b */
    private TeamShowMemberLoader f114545b;

    /* renamed from: c */
    private final C45051a f114546c = new C45051a();

    /* renamed from: d */
    private final Chat f114547d;

    /* renamed from: e */
    private final int f114548e;

    /* renamed from: f */
    private final boolean f114549f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowModel$Companion;", "", "()V", "TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractModel
    /* renamed from: b */
    public Chat mo159894b() {
        return this.f114547d;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractModel
    /* renamed from: a */
    public boolean mo159893a() {
        TeamShowMemberLoader hVar = this.f114545b;
        if (hVar != null) {
            return hVar.mo159319c();
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u000b\u001a\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowModel$search$1", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ISearchResultCallback;", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "onSearchEmpty", "", "key", "", "onSearchFail", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSearchSuccess", "result", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.c$c */
    public static final class C45258c implements AbstractC45053b<List<? extends C45084c>> {

        /* renamed from: a */
        final /* synthetic */ UIGetDataCallback f114552a;

        C45258c(UIGetDataCallback uIGetDataCallback) {
            this.f114552a = uIGetDataCallback;
        }

        @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b
        /* renamed from: a */
        public void mo159378a(String str) {
            if (str == null) {
                str = "";
            }
            this.f114552a.onSuccess(new SearchData(str, null));
        }

        /* renamed from: a */
        public void mo159377a(List<? extends C45084c> list, String str) {
            if (str == null) {
                str = "";
            }
            this.f114552a.onSuccess(new SearchData(str, list));
        }

        @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b
        /* renamed from: a */
        public void mo159379a(String str, ErrorResult errorResult) {
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append("key:");
            sb.append(str);
            sb.append(" errMsg:");
            if (errorResult != null) {
                str2 = errorResult.getDisplayMsg();
            } else {
                str2 = null;
            }
            sb.append(str2);
            Log.m165383e("MemberShowModel", sb.toString());
            UIGetDataCallback uIGetDataCallback = this.f114552a;
            if (errorResult == null) {
                errorResult = new ErrorResult("");
            }
            uIGetDataCallback.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowModel$getItemChatter$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.c$b */
    public static final class C45257b implements IGetDataCallback<Map<String, ? extends ChatChatter>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f114550a;

        /* renamed from: b */
        final /* synthetic */ String f114551b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f114550a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends ChatChatter> map) {
            if (map == null) {
                this.f114550a.onError(new ErrorResult("getItemChatter data is null"));
            } else {
                this.f114550a.onSuccess(map.get(this.f114551b));
            }
        }

        C45257b(IGetDataCallback iGetDataCallback, String str) {
            this.f114550a = iGetDataCallback;
            this.f114551b = str;
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractModel
    /* renamed from: a */
    public void mo159890a(IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        TeamShowMemberLoader hVar = this.f114545b;
        if (hVar != null) {
            hVar.mo159312a(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractModel
    /* renamed from: a */
    public void mo159891a(C25975i<SelectBeansResult> iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "callback");
        CallbackManager callbackManager = getCallbackManager();
        if (callbackManager != null) {
            callbackManager.addCancelableCallback(iVar);
        }
        String id = this.f114547d.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "mCurrentChat.getId()");
        TeamShowMemberLoader hVar = new TeamShowMemberLoader(iVar, id, this.f114547d, this.f114549f);
        this.f114545b = hVar;
        if (hVar != null) {
            hVar.mo159311a(this.f114548e);
        }
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(this.f114545b);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractModel
    /* renamed from: a */
    public void mo159892a(String str, IGetDataCallback<SearchData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f114546c.mo159374a(this.f114545b, this.f114547d.getId(), str, new C45258c(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback)));
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractModel
    /* renamed from: b */
    public void mo159895b(String str, IGetDataCallback<Chatter> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        a.getChatterDependency().mo143783a(this.f114547d.getId(), CollectionsKt.listOf(str), getCallbackManager().wrapAndAddGetDataCallback(new C45257b(iGetDataCallback, str)));
    }

    public MemberShowModel(Chat chat, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(chat, "mCurrentChat");
        this.f114547d = chat;
        this.f114548e = i;
        this.f114549f = z;
    }
}
