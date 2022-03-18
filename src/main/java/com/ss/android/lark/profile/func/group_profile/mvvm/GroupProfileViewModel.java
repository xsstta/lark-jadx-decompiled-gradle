package com.ss.android.lark.profile.func.group_profile.mvvm;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.service.C52904e;
import com.ss.android.lark.profile.statistics.GroupProfilePerceivableErrorCostTimeHitPoint;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.ProfileHitPointNew;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001RB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00100\u001a\u0002012\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0013H\u0002J\u0010\u00104\u001a\u0002012\b\u00105\u001a\u0004\u0018\u00010\u0011J\u000e\u00106\u001a\u0002012\u0006\u00107\u001a\u00020\u0019J\u0010\u00108\u001a\u0002012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020\u0011H\u0002J\b\u0010;\u001a\u00020\u0011H\u0002J\b\u0010<\u001a\u0004\u0018\u00010*J\b\u0010=\u001a\u00020\u0011H\u0002J\u0006\u0010>\u001a\u00020\u0011J\u000e\u0010?\u001a\u0002012\u0006\u00107\u001a\u00020\u0019J\b\u0010@\u001a\u000201H\u0002J\b\u0010A\u001a\u000201H\u0014J\u0010\u0010B\u001a\u0002012\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010C\u001a\u0002012\u0006\u00107\u001a\u00020\u0019J\u0010\u0010D\u001a\u0002012\u0006\u00107\u001a\u00020\u0019H\u0002J\u000e\u0010E\u001a\u0002012\u0006\u00107\u001a\u00020\u0019J\u000e\u0010F\u001a\u0002012\u0006\u0010G\u001a\u00020\u0019J\u0018\u0010H\u001a\u0002012\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u0011H\u0002J\u0018\u0010K\u001a\u0002012\u0010\u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018J\u000e\u0010M\u001a\u0002012\u0006\u00107\u001a\u00020\u0019J\u0012\u0010N\u001a\u0002012\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\b\u0010Q\u001a\u000201H\u0002R%\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR\u0018\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\tR\u000e\u0010!\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0019\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\tR\u000e\u0010/\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/ss/android/lark/profile/func/group_profile/mvvm/GroupProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "actionResultNotifyLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "Lcom/ss/android/lark/profile/func/group_profile/mvvm/GroupProfileViewModel$ActionResultNotify;", "", "getActionResultNotifyLiveData", "()Landroidx/lifecycle/MutableLiveData;", "alreadyInGroup", "", "arguments", "Landroid/os/Bundle;", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "chatId", "", "chatInfoLiveData", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatInfoLiveData", "closePageLiveData", "getClosePageLiveData", "contextProvider", "Ljava/util/concurrent/Callable;", "Landroid/content/Context;", "disableApply", "fetchChatInfoDisposable", "Lio/reactivex/disposables/Disposable;", "fetchOwnerInfoDisposable", "groupStateLiveData", "Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "getGroupStateLiveData", "inviterId", "isCurrentTenantInOrganization", "isExternalGroup", "isFromShareLink", "isOtherTenantInOrganization", "isSearchPublic", "joinGroupToken", "justShowGroupInfo", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "owner", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "ownerNameLiveData", "getOwnerNameLiveData", "showJoinOrganization", "analyzeBundleInfo", "", "analyzeChatInfo", "chat", "applyGroup", "reason", "createTenant", "context", "fetchChatInfo", "fetchOwnerInfo", BottomDialog.f17198f, "getInviteUrl", "getMessage", "getTenantId", "getTipsForOtherOrganization", "joinGroup", "logSdkNetCostEnd", "onCleared", "onCreate", "openChat", "openChatAfterJoin", "openFeed", "openOwnerProfile", "activityContext", "sendGroupJoinBtnClick", "isToastRemind", "toastRemind", "setContextProvider", "provider", "switchTenant", "tryHandleErrorResult", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "updateGroupState", "ActionResultNotify", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupProfileViewModel extends AbstractC1142af {
    private final C1177w<Pair<ActionResultNotify, Object>> actionResultNotifyLiveData = new C1177w<>();
    private boolean alreadyInGroup;
    private Bundle arguments;
    private final CallbackManager callbackManager = new CallbackManager();
    private String chatId = "";
    private final C1177w<Chat> chatInfoLiveData = new C1177w<>();
    private final C1177w<Boolean> closePageLiveData = new C1177w<>();
    private Callable<Context> contextProvider;
    private boolean disableApply;
    private Disposable fetchChatInfoDisposable;
    private Disposable fetchOwnerInfoDisposable;
    private final C1177w<ShareGroupChatContent.GroupState> groupStateLiveData = new C1177w<>();
    private String inviterId = "";
    private boolean isCurrentTenantInOrganization = true;
    private boolean isExternalGroup;
    private boolean isFromShareLink;
    private boolean isOtherTenantInOrganization = true;
    private boolean isSearchPublic;
    private String joinGroupToken = "";
    private boolean justShowGroupInfo;
    private Message message;
    public Chatter owner;
    private final C1177w<String> ownerNameLiveData = new C1177w<>();
    private boolean showJoinOrganization;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/func/group_profile/mvvm/GroupProfileViewModel$ActionResultNotify;", "", "(Ljava/lang/String;I)V", "PENDING_APPROVAL", "NEED_APPLY", "INVITER_LEFT", "GROUP_DISBANDED", "SHARING_DISABLED", "SHARE_EXPIRED", "GROUP_IS_FULL", "REACH_MEMBER_LIMIT_FOR_FEE", "FETCH_INFO_FAILED", "INTERNAL_GROUP_CAN_NOT_JOIN", "NO_EXTERNAL_COMMUNICATION_AUTHORITY", "LINK_CERTIFIED_REFUSE", "QR_CODE_CERTIFIED_REFUSE", "SHARE_CARD_CERTIFIED_REFUSE", "OTHER_ACTION_RESULT", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ActionResultNotify {
        PENDING_APPROVAL,
        NEED_APPLY,
        INVITER_LEFT,
        GROUP_DISBANDED,
        SHARING_DISABLED,
        SHARE_EXPIRED,
        GROUP_IS_FULL,
        REACH_MEMBER_LIMIT_FOR_FEE,
        FETCH_INFO_FAILED,
        INTERNAL_GROUP_CAN_NOT_JOIN,
        NO_EXTERNAL_COMMUNICATION_AUTHORITY,
        LINK_CERTIFIED_REFUSE,
        QR_CODE_CERTIFIED_REFUSE,
        SHARE_CARD_CERTIFIED_REFUSE,
        OTHER_ACTION_RESULT
    }

    public final C1177w<Pair<ActionResultNotify, Object>> getActionResultNotifyLiveData() {
        return this.actionResultNotifyLiveData;
    }

    public final C1177w<Chat> getChatInfoLiveData() {
        return this.chatInfoLiveData;
    }

    public final C1177w<Boolean> getClosePageLiveData() {
        return this.closePageLiveData;
    }

    public final C1177w<ShareGroupChatContent.GroupState> getGroupStateLiveData() {
        return this.groupStateLiveData;
    }

    public final Message getMessage() {
        return this.message;
    }

    public final C1177w<String> getOwnerNameLiveData() {
        return this.ownerNameLiveData;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "call"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel$b */
    public static final class CallableC52336b<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ String f129765a;

        CallableC52336b(String str) {
            this.f129765a = str;
        }

        /* renamed from: a */
        public final Chat call() {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            return d.mo133586p().mo133614d(this.f129765a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "kotlin.jvm.PlatformType", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel$e */
    public static final class CallableC52339e<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ String f129768a;

        CallableC52339e(String str) {
            this.f129768a = str;
        }

        /* renamed from: a */
        public final Pair<Chatter, String> call() {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52246c p = d.mo133586p();
            Chatter a = p.mo133599a(this.f129768a);
            return TuplesKt.to(a, p.mo133602a(a));
        }
    }

    private final String getInviteUrl() {
        Bundle bundle = this.arguments;
        if (bundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arguments");
        }
        String string = bundle.getString("params_invite_url", "");
        if (string != null) {
            return string;
        }
        return "";
    }

    public final String getTipsForOtherOrganization() {
        Bundle bundle = this.arguments;
        if (bundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arguments");
        }
        String string = bundle.getString("parmas_tip_str", null);
        if (string != null) {
            return string;
        }
        return "";
    }

    public final void logSdkNetCostEnd() {
        if (this.chatInfoLiveData.mo5927b() != null && this.ownerNameLiveData.mo5927b() != null) {
            GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180533d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/profile/func/group_profile/mvvm/GroupProfileViewModel$joinGroup$callback$1", "Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;", "joinGroupChatSuccess", "", "chatId", "", "onCancelSendApply", "onError", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSendApplyError", "sendApplySuccess", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel$h */
    public static final class C52342h implements AbstractC44896a {

        /* renamed from: a */
        final /* synthetic */ GroupProfileViewModel f129771a;

        /* renamed from: b */
        final /* synthetic */ Context f129772b;

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: b */
        public void mo128966b() {
        }

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: a */
        public void mo128963a() {
            this.f129771a.getGroupStateLiveData().mo5929b(ShareGroupChatContent.GroupState.PENDING_APPROVAL);
            this.f129771a.getActionResultNotifyLiveData().mo5929b(TuplesKt.to(ActionResultNotify.PENDING_APPROVAL, Unit.INSTANCE));
            this.f129771a.sendGroupJoinBtnClick(false, "none");
        }

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: a */
        public void mo128964a(ErrorResult errorResult) {
            this.f129771a.tryHandleErrorResult(errorResult);
        }

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: b */
        public void mo128967b(ErrorResult errorResult) {
            this.f129771a.tryHandleErrorResult(errorResult);
        }

        @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
        /* renamed from: a */
        public void mo128965a(String str) {
            this.f129771a.openChatAfterJoin(this.f129772b);
            this.f129771a.getClosePageLiveData().mo5929b((Boolean) true);
            this.f129771a.sendGroupJoinBtnClick(false, "none");
        }

        C52342h(GroupProfileViewModel groupProfileViewModel, Context context) {
            this.f129771a = groupProfileViewModel;
            this.f129772b = context;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        Disposable disposable;
        Disposable disposable2;
        Disposable disposable3 = this.fetchChatInfoDisposable;
        if ((disposable3 == null || !disposable3.isDisposed()) && (disposable2 = this.fetchChatInfoDisposable) != null) {
            disposable2.dispose();
        }
        Disposable disposable4 = this.fetchOwnerInfoDisposable;
        if ((disposable4 == null || !disposable4.isDisposed()) && (disposable = this.fetchOwnerInfoDisposable) != null) {
            disposable.dispose();
        }
        this.callbackManager.cancelCallbacks();
        super.onCleared();
    }

    private final String getTenantId() {
        boolean z;
        Chat b = this.chatInfoLiveData.mo5927b();
        boolean z2 = false;
        if (b != null) {
            String tenantId = b.getTenantId();
            if (tenantId == null || tenantId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String tenantId2 = b.getTenantId();
                Intrinsics.checkExpressionValueIsNotNull(tenantId2, "chat.tenantId");
                return tenantId2;
            }
        }
        Bundle bundle = this.arguments;
        if (bundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arguments");
        }
        String string = bundle.getString("params_tenant_id");
        String str = string;
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            return string;
        }
        return "";
    }

    private final void updateGroupState() {
        ShareGroupChatContent.GroupState groupState;
        ShareGroupChatContent.GroupState groupState2;
        if (this.alreadyInGroup) {
            this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.ALREADY_IN_GROUP);
        } else if (this.justShowGroupInfo || this.disableApply) {
            this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.JUST_SHOW_GROUP_INFO);
        } else {
            Chat b = this.chatInfoLiveData.mo5927b();
            boolean z = true;
            if (b == null || !b.isDissolved()) {
                Message message2 = this.message;
                if (message2 != null) {
                    Content content = message2.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content, "it.getContent<ShareGroupChatContent>()");
                    ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) content;
                    String joinToken = shareGroupChatContent.getJoinToken();
                    if (!(joinToken == null || joinToken.length() == 0)) {
                        z = false;
                    }
                    if (z || shareGroupChatContent.getExpireTime() * ((long) 1000) <= System.currentTimeMillis()) {
                        this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.SHARE_EXPIRED);
                        return;
                    } else if (shareGroupChatContent.getJoinChatErrState() != null) {
                        this.groupStateLiveData.mo5929b(shareGroupChatContent.getJoinChatErrState());
                        return;
                    }
                }
                Chat.AddMemberApply addMemberApply = null;
                if (!this.isCurrentTenantInOrganization) {
                    C1177w<ShareGroupChatContent.GroupState> wVar = this.groupStateLiveData;
                    if (this.isExternalGroup) {
                        Chat b2 = this.chatInfoLiveData.mo5927b();
                        if (b2 != null) {
                            addMemberApply = b2.getAddMemberApply();
                        }
                        if (addMemberApply == Chat.AddMemberApply.NEED_APPLY) {
                            groupState2 = ShareGroupChatContent.GroupState.NEED_APPLY;
                        } else {
                            groupState2 = ShareGroupChatContent.GroupState.CAN_JOIN_DIRECTLY;
                        }
                    } else if (this.isOtherTenantInOrganization) {
                        groupState2 = ShareGroupChatContent.GroupState.NEED_SWITCH_TENANT;
                    } else if (this.showJoinOrganization) {
                        groupState2 = ShareGroupChatContent.GroupState.NEED_CREATE_TENANT;
                    } else {
                        groupState2 = ShareGroupChatContent.GroupState.CAN_JOIN_DIRECTLY;
                    }
                    wVar.mo5929b(groupState2);
                    return;
                }
                C1177w<ShareGroupChatContent.GroupState> wVar2 = this.groupStateLiveData;
                Chat b3 = this.chatInfoLiveData.mo5927b();
                if (b3 != null) {
                    addMemberApply = b3.getAddMemberApply();
                }
                if (addMemberApply == Chat.AddMemberApply.NEED_APPLY) {
                    groupState = ShareGroupChatContent.GroupState.NEED_APPLY;
                } else {
                    groupState = ShareGroupChatContent.GroupState.CAN_JOIN_DIRECTLY;
                }
                wVar2.mo5929b(groupState);
                return;
            }
            this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.GROUP_DISBANDED);
        }
    }

    public final void setContextProvider(Callable<Context> callable) {
        this.contextProvider = callable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/group_profile/mvvm/GroupProfileViewModel$applyGroup$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel$a */
    public static final class C52335a implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileViewModel f129764a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52335a(GroupProfileViewModel groupProfileViewModel) {
            this.f129764a = groupProfileViewModel;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f129764a.tryHandleErrorResult(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f129764a.getGroupStateLiveData().mo5929b(ShareGroupChatContent.GroupState.PENDING_APPROVAL);
            this.f129764a.getActionResultNotifyLiveData().mo5929b(TuplesKt.to(ActionResultNotify.PENDING_APPROVAL, Unit.INSTANCE));
        }
    }

    public final void openFeed(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C52239a.m202617d().mo133548a(context);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel$d */
    public static final class C52338d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileViewModel f129767a;

        C52338d(GroupProfileViewModel groupProfileViewModel) {
            this.f129767a = groupProfileViewModel;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f129767a.getActionResultNotifyLiveData().mo5929b(TuplesKt.to(ActionResultNotify.FETCH_INFO_FAILED, th));
            GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180533d();
            GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180530a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel$g */
    public static final class C52341g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileViewModel f129770a;

        C52341g(GroupProfileViewModel groupProfileViewModel) {
            this.f129770a = groupProfileViewModel;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f129770a.getActionResultNotifyLiveData().mo5929b(TuplesKt.to(ActionResultNotify.FETCH_INFO_FAILED, th));
            GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180533d();
            GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180530a();
        }
    }

    public final void createTenant(Context context) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        String inviteUrl = getInviteUrl();
        if (inviteUrl.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C52239a.m202617d().mo133564b(context, inviteUrl);
        }
    }

    public final void openChat(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ProfileHitPoint.m204703a(this.chatInfoLiveData.mo5927b(), true);
        openChatAfterJoin(context);
    }

    public final void switchTenant(Context context) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        String tenantId = getTenantId();
        if (tenantId.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C52239a.m202617d().mo133566c(context, tenantId);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel$c */
    public static final class C52337c<T> implements Consumer<Chat> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileViewModel f129766a;

        C52337c(GroupProfileViewModel groupProfileViewModel) {
            this.f129766a = groupProfileViewModel;
        }

        /* renamed from: a */
        public final void accept(Chat chat) {
            this.f129766a.getChatInfoLiveData().mo5929b(chat);
            this.f129766a.logSdkNetCostEnd();
            GroupProfileViewModel groupProfileViewModel = this.f129766a;
            Intrinsics.checkExpressionValueIsNotNull(chat, "it");
            String ownerId = chat.getOwnerId();
            Intrinsics.checkExpressionValueIsNotNull(ownerId, "it.ownerId");
            groupProfileViewModel.fetchOwnerInfo(ownerId);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "kotlin.jvm.PlatformType", "", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel$f */
    public static final class C52340f<T> implements Consumer<Pair<? extends Chatter, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileViewModel f129769a;

        C52340f(GroupProfileViewModel groupProfileViewModel) {
            this.f129769a = groupProfileViewModel;
        }

        /* renamed from: a */
        public final void accept(Pair<? extends Chatter, String> pair) {
            this.f129769a.owner = (Chatter) pair.getFirst();
            this.f129769a.getOwnerNameLiveData().mo5929b(pair.getSecond());
            this.f129769a.logSdkNetCostEnd();
            GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180538i();
        }
    }

    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.arguments = bundle;
            analyzeBundleInfo(bundle);
            fetchChatInfo(this.chatId);
            Chat b = this.chatInfoLiveData.mo5927b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(b, "it");
                String ownerId = b.getOwnerId();
                Intrinsics.checkExpressionValueIsNotNull(ownerId, "it.ownerId");
                fetchOwnerInfo(ownerId);
                analyzeChatInfo(b);
            }
            updateGroupState();
        }
    }

    public final void openChatAfterJoin(Context context) {
        boolean z;
        if (this.chatId.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133586p().mo133603a(context, this.chatId);
            C52239a.m202617d().mo133571e(this.chatId);
        }
    }

    private final void analyzeChatInfo(Chat chat) {
        boolean z;
        boolean z2 = false;
        if (chat.getRole() == Chat.Role.MEMBER) {
            z = true;
        } else {
            z = false;
        }
        this.alreadyInGroup = z;
        String tenantId = chat.getTenantId();
        if (tenantId == null || tenantId.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            String tenantId2 = chat.getTenantId();
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52256j u = d.mo133591u();
            Intrinsics.checkExpressionValueIsNotNull(u, "ProfileModule.getDependency().passportDependency");
            boolean areEqual = Intrinsics.areEqual(tenantId2, u.mo133640a());
            this.isCurrentTenantInOrganization = areEqual;
            if (!areEqual) {
                IProfileModuleDependency d2 = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
                IProfileModuleDependency.AbstractC52256j u2 = d2.mo133591u();
                Intrinsics.checkExpressionValueIsNotNull(u2, "ProfileModule.getDependency().passportDependency");
                Iterator<TenantInfo> it = u2.mo133641b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TenantInfo next = it.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "tenant");
                    if (Intrinsics.areEqual(next.getTenantId(), chat.getTenantId())) {
                        this.isOtherTenantInOrganization = true;
                        break;
                    }
                }
            }
        }
        this.isExternalGroup = chat.isCrossTenant();
    }

    private final void fetchChatInfo(String str) {
        boolean z;
        Disposable disposable;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Disposable disposable2 = this.fetchChatInfoDisposable;
            if ((disposable2 == null || !disposable2.isDisposed()) && (disposable = this.fetchChatInfoDisposable) != null) {
                disposable.dispose();
            }
            GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180532c();
            this.fetchChatInfoDisposable = Single.fromCallable(new CallableC52336b(str)).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C52337c(this), new C52338d(this));
        }
    }

    public final void applyGroup(String str) {
        boolean z;
        boolean z2;
        AddChatChatterApply.Ways ways;
        boolean z3 = true;
        if (this.chatId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.isFromShareLink) {
                ProfileHitPoint.m204708a(z2);
                ways = AddChatChatterApply.Ways.VIA_LINK;
            } else {
                if (this.inviterId.length() <= 0) {
                    z3 = false;
                }
                if (z3) {
                    ProfileHitPoint.m204708a(z2);
                    ways = AddChatChatterApply.Ways.VIA_QR_CODE;
                } else if (this.isSearchPublic) {
                    ways = AddChatChatterApply.Ways.VIA_SEARCH;
                } else {
                    ProfileHitPoint.m204713b(z2);
                    ways = AddChatChatterApply.Ways.VIA_SHARE;
                }
            }
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133586p().mo133610a(this.chatId, str, this.inviterId, this.joinGroupToken, ways, new UIGetDataCallback(new C52335a(this)));
        }
    }

    public final void fetchOwnerInfo(String str) {
        boolean z;
        Disposable disposable;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && this.ownerNameLiveData.mo5927b() == null) {
            Disposable disposable2 = this.fetchOwnerInfoDisposable;
            if ((disposable2 == null || !disposable2.isDisposed()) && (disposable = this.fetchOwnerInfoDisposable) != null) {
                disposable.dispose();
            }
            this.fetchOwnerInfoDisposable = Single.fromCallable(new CallableC52339e(str)).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C52340f(this), new C52341g(this));
        }
    }

    public final void openOwnerProfile(Context context) {
        boolean z;
        String str;
        Intrinsics.checkParameterIsNotNull(context, "activityContext");
        Chatter chatter = this.owner;
        if (chatter != null) {
            String id = chatter.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "it.getId()");
            if (id.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Chat b = this.chatInfoLiveData.mo5927b();
                if (b == null || (str = b.getName()) == null) {
                    str = "";
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "chatInfoLiveData.value?.getName() ?: \"\"");
                C52904e.m204638a().mo105573a(context, chatter.getId(), this.chatId, new ContactSource.C29531a().mo104726a(2).mo104729b(str).mo104728a());
            }
        }
    }

    private final void analyzeBundleInfo(Bundle bundle) {
        boolean z;
        Message message2 = (Message) bundle.getSerializable("params_message");
        this.message = message2;
        if (message2 != null) {
            if (message2.getType() != Message.Type.SHARE_GROUP_CHAT || !(message2.getContent() instanceof ShareGroupChatContent)) {
                this.message = null;
            } else {
                Content content = message2.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "it.getContent<ShareGroupChatContent>()");
                ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) content;
                String joinToken = shareGroupChatContent.getJoinToken();
                if (joinToken == null) {
                    joinToken = "";
                }
                this.joinGroupToken = joinToken;
                Chat chat = shareGroupChatContent.getChat();
                if (chat != null) {
                    this.chatInfoLiveData.mo5929b(chat);
                    String id = chat.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                    this.chatId = id;
                }
            }
        }
        String string = bundle.getString("params__chat_id", this.chatId);
        Intrinsics.checkExpressionValueIsNotNull(string, "arguments.getString(Grou…EY_PARAM_CHAT_ID, chatId)");
        this.chatId = string;
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String string2 = bundle.getString("params_group_inviter_id", "");
            Intrinsics.checkExpressionValueIsNotNull(string2, "arguments.getString(Grou…RAM_GROUP_INVITER_ID, \"\")");
            this.inviterId = string2;
            String string3 = bundle.getString("param_token", this.joinGroupToken);
            Intrinsics.checkExpressionValueIsNotNull(string3, "arguments.getString(Grou…AM_TOKEN, joinGroupToken)");
            this.joinGroupToken = string3;
            this.justShowGroupInfo = bundle.getBoolean("param_just_show_chat_info", false);
            this.disableApply = !bundle.getBoolean("params_could_apply", true);
            this.isFromShareLink = bundle.getBoolean("key_param_is_from_link", false);
            this.isCurrentTenantInOrganization = bundle.getBoolean("params_in_organization", true);
            this.isOtherTenantInOrganization = bundle.getBoolean("params_is_other_tenant_in_orgainization", false);
            this.isExternalGroup = bundle.getBoolean("key_param_is_external_group", false);
            this.showJoinOrganization = bundle.getBoolean("params_show_join_organization", false);
            this.isSearchPublic = bundle.getBoolean("key_params_is_search_public", false);
        }
    }

    public final void joinGroup(Context context) {
        boolean z;
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (this.chatId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.isFromShareLink) {
                ProfileHitPoint.m204727h();
            }
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
            Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
            String a = q.mo133622a();
            ICallback wrapAndAddCallback = this.callbackManager.wrapAndAddCallback(new C52342h(this, context));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndA…endApply() {}\n\n        })");
            AbstractC44896a aVar = (AbstractC44896a) wrapAndAddCallback;
            if (this.isSearchPublic) {
                C52239a.m202617d().mo133554a(context, this.chatId, CollectionsKt.listOf(a), 4, aVar);
            } else if (this.message != null) {
                ProfileHitPoint.m204703a(this.chatInfoLiveData.mo5927b(), false);
                IProfileModuleDependency d2 = C52239a.m202617d();
                String str2 = this.chatId;
                List<String> listOf = CollectionsKt.listOf(a);
                Message message2 = this.message;
                if (message2 == null || (str = message2.getId()) == null) {
                    str = "";
                }
                d2.mo133555a(context, str2, listOf, str, this.joinGroupToken, aVar);
            } else {
                ProfileHitPoint.m204702a(this.chatInfoLiveData.mo5927b());
                C52239a.m202617d().mo133556a(context, this.chatId, CollectionsKt.listOf(a), this.inviterId, this.joinGroupToken, this.isFromShareLink, aVar);
            }
        }
    }

    public final void tryHandleErrorResult(ErrorResult errorResult) {
        String str;
        Context call;
        Context call2;
        long j;
        ShareGroupChatContent shareGroupChatContent;
        if (errorResult != null) {
            int errorCode = errorResult.getErrorCode();
            if (errorCode == 4011) {
                Message message2 = this.message;
                if (message2 == null || (shareGroupChatContent = (ShareGroupChatContent) message2.getContent()) == null) {
                    j = 0;
                } else {
                    j = shareGroupChatContent.getExpireTime();
                }
                if (j * ((long) 1000) > System.currentTimeMillis()) {
                    this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.SHARING_DISABLED);
                    this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.SHARING_DISABLED, Unit.INSTANCE));
                    str = "sharing_method_stop";
                    sendGroupJoinBtnClick(true, str);
                }
                this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.SHARE_EXPIRED);
                this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.SHARE_EXPIRED, Unit.INSTANCE));
            } else if (errorCode == 4012 || errorCode == 5008) {
                Callable<Context> callable = this.contextProvider;
                if (!(callable == null || (call = callable.call()) == null)) {
                    openChatAfterJoin(call);
                    this.closePageLiveData.mo5929b((Boolean) true);
                }
            } else {
                if (errorCode == 4013) {
                    this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.GROUP_IS_FULL);
                    this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.GROUP_IS_FULL, errorResult));
                    str = "group_member_full";
                } else if (errorCode == 4018) {
                    this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.GROUP_DISBANDED);
                    this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.GROUP_DISBANDED, Unit.INSTANCE));
                    str = "group_disband";
                } else if (errorCode == 4037) {
                    this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.EXTERNAL_USERS_CANNOT_OPERATE);
                    this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.INTERNAL_GROUP_CAN_NOT_JOIN, errorResult));
                    str = "external_user_cannot_operate";
                } else if (errorCode == 5020) {
                    this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.NEED_APPLY);
                    this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.NEED_APPLY, Unit.INSTANCE));
                } else if (errorCode == 5027) {
                    Callable<Context> callable2 = this.contextProvider;
                    if (!(callable2 == null || (call2 = callable2.call()) == null)) {
                        joinGroup(call2);
                    }
                } else if (errorCode == 6002) {
                    this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.REACH_MEMBER_LIMIT_FOR_FEE, errorResult));
                } else {
                    IProfileModuleDependency d = C52239a.m202617d();
                    Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                    IProfileModuleDependency.AbstractC52244a s = d.mo133589s();
                    Intrinsics.checkExpressionValueIsNotNull(s, "ProfileModule.getDependency().authorityDependency");
                    if (errorCode == s.mo133635a()) {
                        this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.NO_EXTERNAL_COMMUNICATION_AUTHORITY);
                        this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.NO_EXTERNAL_COMMUNICATION_AUTHORITY, errorResult));
                        str = "internal_user_cannot_operate";
                    } else if (errorCode == 5016) {
                        this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.INVITER_LEFT);
                        this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.INVITER_LEFT, errorResult));
                        str = "sharing_group_user_exit";
                    } else if (errorCode == 4026) {
                        this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.LINK_CERTIFIED_REFUSE);
                        this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.LINK_CERTIFIED_REFUSE, errorResult));
                    } else if (errorCode == 4027) {
                        this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.QR_CODE_CERTIFIED_REFUSE);
                        this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.QR_CODE_CERTIFIED_REFUSE, errorResult));
                    } else if (errorCode == 4028) {
                        this.groupStateLiveData.mo5929b(ShareGroupChatContent.GroupState.SHARE_CARD_CERTIFIED_REFUSE);
                        this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.SHARE_CARD_CERTIFIED_REFUSE, errorResult));
                    } else {
                        this.actionResultNotifyLiveData.mo5929b(TuplesKt.to(ActionResultNotify.OTHER_ACTION_RESULT, errorResult));
                    }
                }
                sendGroupJoinBtnClick(true, str);
            }
            str = "";
            sendGroupJoinBtnClick(true, str);
        }
    }

    public final void sendGroupJoinBtnClick(boolean z, String str) {
        Map<String, ? extends Object> map;
        if (z) {
            map = MapsKt.mapOf(TuplesKt.to("is_toast_remind", "true"), TuplesKt.to("toast_remind", str));
        } else {
            map = MapsKt.mapOf(TuplesKt.to("is_toast_remind", "false"));
        }
        ProfileHitPointNew.f130740b.mo180542a(this.chatInfoLiveData.mo5927b(), "group_join", "none", map);
    }
}
