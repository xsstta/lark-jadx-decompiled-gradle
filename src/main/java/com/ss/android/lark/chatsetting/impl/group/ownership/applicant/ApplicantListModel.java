package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatApplyInfo;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u001c\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0016H\u0016J\u001e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0016J.\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IModel;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "mChatModule", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mHasMore", "", "mNextCursor", "getChat", "getChatName", "hasMore", "loadInitData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/InitData;", "loadMoreData", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewData;", "setGroupChatAddMemberApprove", "needApply", "updateApplyChatterStatus", "inviteeId", "isApproved", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.d */
public final class ApplicantListModel extends BaseModel implements IApplicantListContract.IModel {

    /* renamed from: a */
    public final AbstractC34461c.AbstractC34466e f89562a;

    /* renamed from: b */
    public boolean f89563b;

    /* renamed from: c */
    public String f89564c = "";

    /* renamed from: d */
    public Chat f89565d;

    /* renamed from: e */
    private final String f89566e;

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IModel
    /* renamed from: b */
    public Chat mo128100b() {
        return this.f89565d;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IModel
    /* renamed from: c */
    public boolean mo128102c() {
        return this.f89563b;
    }

    /* renamed from: d */
    public final String mo128103d() {
        return this.f89566e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.d$a */
    static final class C34691a<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ ApplicantListModel f89567a;

        C34691a(ApplicantListModel dVar) {
            this.f89567a = dVar;
        }

        /* renamed from: a */
        public final Chat produce() {
            return this.f89567a.f89562a.mo127349b(this.f89567a.mo128103d());
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IModel
    /* renamed from: a */
    public String mo128096a() {
        Chat chat = this.f89565d;
        if (chat != null) {
            return chat.getName();
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListModel$loadMoreData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/ChatApplyInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.d$c */
    public static final class C34694c implements IGetDataCallback<ChatApplyInfo> {

        /* renamed from: a */
        final /* synthetic */ ApplicantListModel f89572a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f89573b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89573b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(ChatApplyInfo aVar) {
            List<AddChatChatterApply> a;
            String str;
            ArrayList arrayList = new ArrayList();
            if (!(aVar == null || (a = aVar.mo124704a()) == null)) {
                for (T t : a) {
                    if (t.mo124343b() == AddChatChatterApply.Status.PROCESSING) {
                        String a2 = this.f89572a.f89562a.mo127314a(t.mo124346e());
                        Intrinsics.checkExpressionValueIsNotNull(a2, "mChatModule.getDisplayNameByAliasName(it.invitee)");
                        String avatarKey = t.mo124346e().getAvatarKey();
                        Intrinsics.checkExpressionValueIsNotNull(avatarKey, "it.invitee.getAvatarKey()");
                        String id = t.mo124346e().getId();
                        Intrinsics.checkExpressionValueIsNotNull(id, "it.invitee.getId()");
                        AddChatChatterApply.Ways c = t.mo124344c();
                        Chatter d = t.mo124345d();
                        if (d != null) {
                            str = d.getId();
                        } else {
                            str = null;
                        }
                        arrayList.add(new ApplicantViewData(a2, avatarKey, id, c, str, this.f89572a.f89562a.mo127314a(t.mo124345d()), t.mo124342a()));
                    }
                }
            }
            this.f89573b.onSuccess(arrayList);
        }

        C34694c(ApplicantListModel dVar, IGetDataCallback iGetDataCallback) {
            this.f89572a = dVar;
            this.f89573b = iGetDataCallback;
        }
    }

    public ApplicantListModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f89566e = str;
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        this.f89562a = a.mo127274d();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IModel
    /* renamed from: a */
    public void mo128097a(IGetDataCallback<InitData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C57865c.m224574a(new C34691a(this), new C34692b(this, iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IModel
    /* renamed from: b */
    public void mo128101b(IGetDataCallback<List<ApplicantViewData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f89562a.mo127339a(this.f89566e, this.f89564c, getCallbackManager().wrapAndAddGetDataCallback(new C34694c(this, iGetDataCallback)));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.d$b */
    public static final class C34692b<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ ApplicantListModel f89568a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f89569b;

        C34692b(ApplicantListModel dVar, IGetDataCallback iGetDataCallback) {
            this.f89568a = dVar;
            this.f89569b = iGetDataCallback;
        }

        /* renamed from: a */
        public final void consume(final Chat chat) {
            this.f89568a.f89565d = chat;
            this.f89568a.f89562a.mo127339a(this.f89568a.mo128103d(), (String) null, this.f89568a.getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<ChatApplyInfo>(this) {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListModel.C34692b.C346931 */

                /* renamed from: a */
                final /* synthetic */ C34692b f89570a;

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    this.f89570a.f89569b.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(ChatApplyInfo aVar) {
                    boolean z;
                    String str;
                    List<AddChatChatterApply> a;
                    String str2;
                    ArrayList arrayList = new ArrayList();
                    if (!(aVar == null || (a = aVar.mo124704a()) == null)) {
                        for (T t : a) {
                            if (t.mo124343b() == AddChatChatterApply.Status.PROCESSING) {
                                String a2 = this.f89570a.f89568a.f89562a.mo127314a(t.mo124346e());
                                Intrinsics.checkExpressionValueIsNotNull(a2, "mChatModule.getDisplayNameByAliasName(it.invitee)");
                                String avatarKey = t.mo124346e().getAvatarKey();
                                Intrinsics.checkExpressionValueIsNotNull(avatarKey, "it.invitee.getAvatarKey()");
                                String id = t.mo124346e().getId();
                                Intrinsics.checkExpressionValueIsNotNull(id, "it.invitee.getId()");
                                AddChatChatterApply.Ways c = t.mo124344c();
                                Chatter d = t.mo124345d();
                                if (d != null) {
                                    str2 = d.getId();
                                } else {
                                    str2 = null;
                                }
                                arrayList.add(new ApplicantViewData(a2, avatarKey, id, c, str2, this.f89570a.f89568a.f89562a.mo127314a(t.mo124345d()), t.mo124342a()));
                            }
                        }
                    }
                    Chat chat = chat;
                    Intrinsics.checkExpressionValueIsNotNull(chat, "chat");
                    boolean z2 = false;
                    if (chat.getAddMemberApply() == Chat.AddMemberApply.NEED_APPLY) {
                        z = true;
                    } else {
                        z = false;
                    }
                    InitData kVar = new InitData(z, arrayList);
                    ApplicantListModel dVar = this.f89570a.f89568a;
                    if (aVar == null || (str = aVar.mo124705b()) == null) {
                        str = "";
                    }
                    dVar.f89564c = str;
                    ApplicantListModel dVar2 = this.f89570a.f89568a;
                    if (aVar != null) {
                        z2 = aVar.mo124706c();
                    }
                    dVar2.f89563b = z2;
                    this.f89570a.f89569b.onSuccess(kVar);
                }

                {
                    this.f89570a = r1;
                }
            }));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IModel
    /* renamed from: a */
    public void mo128099a(boolean z, IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        a.mo127274d().mo127376f(this.f89566e, z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IModel
    /* renamed from: a */
    public void mo128098a(String str, String str2, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "inviteeId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        a.mo127274d().mo127342a(str, str2, z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
