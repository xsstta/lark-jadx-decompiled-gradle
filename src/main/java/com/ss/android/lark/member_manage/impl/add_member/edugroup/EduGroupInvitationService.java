package com.ss.android.lark.member_manage.impl.add_member.edugroup;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.im.v1.BatchPutP2PChatMessageRequest;
import com.bytedance.lark.pb.im.v1.BatchPutP2PChatMessageResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J*\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ,\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0011¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationService;", "", "()V", "doSendEduGroupInvitationMessage", "", "shareLink", "", "userList", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "sendEduGroupInvitationMessage", "chatId", "sendGroupInvitationReason", "inviteeIds", "reason", "Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.b */
public final class EduGroupInvitationService {

    /* renamed from: a */
    public static final Companion f113796a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationService$Companion;", "", "()V", "ERROR_CODE_REPEATED_PUT_CHAT_CHATTER_REQUEST", "", "ERROR_CODE_SHARE_GROUP_CHAT_HAVE_ENTERED", "LINK_EXPIRE_DAYS", "LOG_TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationService$sendGroupInvitationReason$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.b$e */
    public static final class C44945e implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC44896a f113802a;

        /* renamed from: b */
        final /* synthetic */ String f113803b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.b$e$b */
        public static final class RunnableC44947b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44945e f113806a;

            RunnableC44947b(C44945e eVar) {
                this.f113806a = eVar;
            }

            public final void run() {
                this.f113806a.f113802a.mo128965a(this.f113806a.f113803b);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.b$e$a */
        public static final class RunnableC44946a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44945e f113804a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f113805b;

            RunnableC44946a(C44945e eVar, ErrorResult errorResult) {
                this.f113804a = eVar;
                this.f113805b = errorResult;
            }

            public final void run() {
                int errorCode = this.f113805b.getErrorCode();
                if (errorCode == 4012 || errorCode == 5008) {
                    this.f113804a.f113802a.mo128965a(this.f113804a.f113803b);
                } else {
                    this.f113804a.f113802a.mo128967b(this.f113805b);
                }
            }
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            UICallbackExecutor.execute(new RunnableC44947b(this));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC44946a(this, errorResult));
        }

        C44945e(AbstractC44896a aVar, String str) {
            this.f113802a = aVar;
            this.f113803b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationService$doSendEduGroupInvitationMessage$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/BatchPutP2PChatMessageResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.b$b */
    public static final class C44942b implements IGetDataCallback<BatchPutP2PChatMessageResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f113797a;

        C44942b(IGetDataCallback iGetDataCallback) {
            this.f113797a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(BatchPutP2PChatMessageResponse batchPutP2PChatMessageResponse) {
            C53241h.m205898b("EduGroupInvitationService", "batch send message success");
            this.f113797a.onSuccess(true);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("EduGroupInvitationService", "batch send message failed:" + errorResult);
            this.f113797a.onError(errorResult);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/BatchPutP2PChatMessageResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.b$c */
    public static final class C44943c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C44943c f113798a = new C44943c();

        C44943c() {
        }

        /* renamed from: a */
        public final BatchPutP2PChatMessageResponse parse(byte[] bArr) {
            return BatchPutP2PChatMessageResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationService$sendEduGroupInvitationMessage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.b$d */
    public static final class C44944d implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ EduGroupInvitationService f113799a;

        /* renamed from: b */
        final /* synthetic */ List f113800b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f113801c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("EduGroupInvitationService", "Fail to getChatSharedLink");
            this.f113801c.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C53241h.m205898b("EduGroupInvitationService", "getChatSharedLink success, link is:" + str);
            this.f113799a.mo159055b(str, this.f113800b, this.f113801c);
        }

        C44944d(EduGroupInvitationService bVar, List list, IGetDataCallback iGetDataCallback) {
            this.f113799a = bVar;
            this.f113800b = list;
            this.f113801c = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public final void mo159053a(String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(list, "userList");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        a.getChatDependency().mo143748a(str, 7, new C44944d(this, list, iGetDataCallback));
    }

    /* renamed from: b */
    public final void mo159055b(String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        RichText b = C59029c.m229161b(str);
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        com.bytedance.lark.pb.basic.v1.RichText a2 = a.getChatDependency().mo143742a(b);
        Command command = Command.BATCH_PUT_P2P_CHAT_MESSAGES;
        BatchPutP2PChatMessageRequest.C17292a aVar = new BatchPutP2PChatMessageRequest.C17292a();
        aVar.mo60760a(list);
        aVar.mo60758a(new Content.C14856a().mo54490a(a2).build());
        aVar.mo60759a(Message.Type.TEXT);
        SdkSender.asynSendRequestNonWrap(command, aVar, new C44942b(iGetDataCallback), C44943c.f113798a);
    }

    /* renamed from: a */
    public final void mo159054a(String str, List<String> list, String str2, AbstractC44896a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(list, "inviteeIds");
        Intrinsics.checkParameterIsNotNull(str2, "reason");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        IGroupMemberManageModuleDependency.AbstractC44878a accountDependency = a.getAccountDependency();
        Intrinsics.checkExpressionValueIsNotNull(accountDependency, "GroupMemberManageModule.…dency().accountDependency");
        String b = accountDependency.mo143795b();
        IGroupMemberManageModuleDependency a2 = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "GroupMemberManageModule.getDependency()");
        a2.getChatDependency().mo143758a(str, list, b, (String) null, str2, 2, new C44945e(aVar, str));
    }
}
