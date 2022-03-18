package com.ss.android.lark.member_manage.impl.add_member.edugroup;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.impl.GroupUtils;
import com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0002-.B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J,\u0010\u0016\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016J,\u0010\u001c\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0016J&\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010#\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0$H\u0002J4\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010(\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010)H\u0002J\u001e\u0010*\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010+\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J,\u0010,\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationDelegate;", "Lcom/ss/android/lark/member_manage/impl/add_member/IAddGroupMemberContract$JoinGroupDelegate;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "context", "Landroid/content/Context;", "target", "Lcom/ss/android/lark/member_manage/impl/add_member/IAddGroupMemberContract$IModel;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Landroid/content/Context;Lcom/ss/android/lark/member_manage/impl/add_member/IAddGroupMemberContract$IModel;)V", "mNeedIntercept", "", "pendingCallback", "Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;", "service", "Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationService;", "getService", "()Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationService;", "service$delegate", "Lkotlin/Lazy;", "checkNeedApply", "clearPendingCallback", "", "handleGroupFilterResult", "unPassedMembers", "", "", "passedMembers", "intercept", "joinGroupChat", "entities", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "callback", "requestJoinGroupByVerification", "reason", "invitees", "requestJoinGroupForEduMembers", "Lcom/larksuite/framework/callback/IGetDataCallback;", "requestJoinGroupForMixedMembers", "passedInvitees", "unPassedInvitees", "scheduleFilterChatters", "", "scheduleJoinGroupByVerification", "scheduleJoinGroupForEduMembers", "scheduleJoinGroupForMixedMembers", "Companion", "EduInnerCallback", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a */
public final class EduGroupInvitationDelegate implements IAddGroupMemberContract.AbstractC44930b {

    /* renamed from: f */
    public static final Companion f113767f = new Companion(null);

    /* renamed from: a */
    public AbstractC44896a f113768a;

    /* renamed from: b */
    public boolean f113769b = true;

    /* renamed from: c */
    public final Chat f113770c;

    /* renamed from: d */
    public final Context f113771d;

    /* renamed from: e */
    public final IAddGroupMemberContract.AbstractC44929a f113772e;

    /* renamed from: g */
    private final Lazy f113773g = LazyKt.lazy(C44941h.INSTANCE);

    /* renamed from: c */
    private final EduGroupInvitationService m178203c() {
        return (EduGroupInvitationService) this.f113773g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationDelegate$Companion;", "", "()V", "LOG_TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44930b
    /* renamed from: a */
    public boolean mo159037a() {
        return this.f113769b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a$h */
    static final class C44941h extends Lambda implements Function0<EduGroupInvitationService> {
        public static final C44941h INSTANCE = new C44941h();

        C44941h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EduGroupInvitationService invoke() {
            return new EduGroupInvitationService();
        }
    }

    /* renamed from: b */
    public final void mo159043b() {
        this.f113768a = null;
    }

    /* renamed from: d */
    private final boolean m178204d() {
        if (this.f113770c.getAddMemberApply() != Chat.AddMemberApply.NEED_APPLY || GroupUtils.m178040b(this.f113770c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a$e */
    public static final class RunnableC44935e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EduGroupInvitationDelegate f113782a;

        /* renamed from: b */
        final /* synthetic */ List f113783b;

        /* renamed from: c */
        final /* synthetic */ AbstractC44896a f113784c;

        RunnableC44935e(EduGroupInvitationDelegate aVar, List list, AbstractC44896a aVar2) {
            this.f113782a = aVar;
            this.f113783b = list;
            this.f113784c = aVar2;
        }

        public final void run() {
            final View inflate = LayoutInflater.from(this.f113782a.f113771d).inflate(R.layout.join_group_dialog_edu, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.mDescTv)).setText(R.string.Lark_Legacy_MembershipApprovalEnabledPlaceholder);
            View findViewById = inflate.findViewById(R.id.tv_edu_desc);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "dialogContent.findViewBy…xtView>(R.id.tv_edu_desc)");
            ((TextView) findViewById).setVisibility(8);
            new C25639g(this.f113782a.f113771d).mo89236b(inflate).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.member_manage.impl.add_member.edugroup.EduGroupInvitationDelegate.RunnableC44935e.DialogInterface$OnClickListenerC449361 */

                /* renamed from: a */
                final /* synthetic */ RunnableC44935e f113785a;

                {
                    this.f113785a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    EditText editText = (EditText) inflate.findViewById(R.id.mReasonEt);
                    Intrinsics.checkExpressionValueIsNotNull(editText, "editText");
                    this.f113785a.f113782a.mo159039a(editText.getText().toString(), this.f113785a.f113783b, this.f113785a.f113784c);
                }
            }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a$f */
    public static final class RunnableC44937f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EduGroupInvitationDelegate f113787a;

        /* renamed from: b */
        final /* synthetic */ List f113788b;

        RunnableC44937f(EduGroupInvitationDelegate aVar, List list) {
            this.f113787a = aVar;
            this.f113788b = list;
        }

        public final void run() {
            View inflate = LayoutInflater.from(this.f113787a.f113771d).inflate(R.layout.join_group_dialog_edu, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.mDescTv)).setText(R.string.Lark_Education_JoinClassRequest);
            View findViewById = inflate.findViewById(R.id.mReasonEt);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "dialogContent.findViewBy…EditText>(R.id.mReasonEt)");
            ((EditText) findViewById).setVisibility(8);
            View findViewById2 = inflate.findViewById(R.id.tv_edu_desc);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "dialogContent.findViewBy…xtView>(R.id.tv_edu_desc)");
            ((TextView) findViewById2).setVisibility(8);
            new C25639g(this.f113787a.f113771d).mo89236b(inflate).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.member_manage.impl.add_member.edugroup.EduGroupInvitationDelegate.RunnableC44937f.DialogInterface$OnClickListenerC449381 */

                /* renamed from: a */
                final /* synthetic */ RunnableC44937f f113789a;

                {
                    this.f113789a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f113789a.f113787a.mo159041a(this.f113789a.f113788b, new EduInnerCallback());
                }
            }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a$g */
    public static final class RunnableC44939g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EduGroupInvitationDelegate f113790a;

        /* renamed from: b */
        final /* synthetic */ List f113791b;

        /* renamed from: c */
        final /* synthetic */ List f113792c;

        /* renamed from: d */
        final /* synthetic */ AbstractC44896a f113793d;

        RunnableC44939g(EduGroupInvitationDelegate aVar, List list, List list2, AbstractC44896a aVar2) {
            this.f113790a = aVar;
            this.f113791b = list;
            this.f113792c = list2;
            this.f113793d = aVar2;
        }

        public final void run() {
            final View inflate = LayoutInflater.from(this.f113790a.f113771d).inflate(R.layout.join_group_dialog_edu, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.mDescTv)).setText(R.string.Lark_Legacy_MembershipApprovalEnabledPlaceholder);
            ((TextView) inflate.findViewById(R.id.tv_edu_desc)).setText(R.string.Lark_Education_JoinClassRequest);
            new C25639g(this.f113790a.f113771d).mo89236b(inflate).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.member_manage.impl.add_member.edugroup.EduGroupInvitationDelegate.RunnableC44939g.DialogInterface$OnClickListenerC449401 */

                /* renamed from: a */
                final /* synthetic */ RunnableC44939g f113794a;

                {
                    this.f113794a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    EditText editText = (EditText) inflate.findViewById(R.id.mReasonEt);
                    Intrinsics.checkExpressionValueIsNotNull(editText, "editText");
                    this.f113794a.f113790a.mo159040a(editText.getText().toString(), this.f113794a.f113791b, this.f113794a.f113792c, this.f113794a.f113793d);
                }
            }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0017\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationDelegate$EduInnerCallback;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "(Lcom/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationDelegate;)V", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a$b */
    public final class EduInnerCallback implements IGetDataCallback<Boolean> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public EduInnerCallback() {
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            AbstractC44896a aVar = EduGroupInvitationDelegate.this.f113768a;
            if (aVar != null) {
                aVar.mo128965a(EduGroupInvitationDelegate.this.f113770c.getId());
            }
            EduGroupInvitationDelegate.this.mo159043b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            AbstractC44896a aVar = EduGroupInvitationDelegate.this.f113768a;
            if (aVar != null) {
                aVar.mo128964a(errorResult);
            }
            EduGroupInvitationDelegate.this.mo159043b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationDelegate$requestJoinGroupForMixedMembers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a$c */
    public static final class C44933c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ EduGroupInvitationDelegate f113775a;

        /* renamed from: b */
        final /* synthetic */ String f113776b;

        /* renamed from: c */
        final /* synthetic */ List f113777c;

        /* renamed from: d */
        final /* synthetic */ AbstractC44896a f113778d;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f113775a.mo159039a(this.f113776b, this.f113777c, this.f113778d);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f113778d.mo128964a(errorResult);
            this.f113775a.mo159043b();
        }

        C44933c(EduGroupInvitationDelegate aVar, String str, List list, AbstractC44896a aVar2) {
            this.f113775a = aVar;
            this.f113776b = str;
            this.f113777c = list;
            this.f113778d = aVar2;
        }
    }

    /* renamed from: a */
    private final void m178200a(List<String> list) {
        UICallbackExecutor.execute(new RunnableC44937f(this, list));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/member_manage/impl/add_member/edugroup/EduGroupInvitationDelegate$scheduleFilterChatters$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.a.a$d */
    public static final class C44934d implements IGetDataCallback<Map<String, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ EduGroupInvitationDelegate f113779a;

        /* renamed from: b */
        final /* synthetic */ Context f113780b;

        /* renamed from: c */
        final /* synthetic */ List f113781c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EduGroupInvitationDelegate", "filterGroupChatter error:" + errorResult);
            AbstractC44896a aVar = this.f113779a.f113768a;
            if (aVar != null) {
                aVar.mo128964a(errorResult);
            }
            this.f113779a.f113768a = null;
        }

        /* renamed from: a */
        public void onSuccess(Map<String, Boolean> map) {
            AbstractC44896a aVar;
            if (!(map == null || (aVar = this.f113779a.f113768a) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    if (true ^ entry.getValue().booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    arrayList.add((String) entry2.getKey());
                }
                ArrayList arrayList2 = arrayList;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Boolean> entry3 : map.entrySet()) {
                    if (entry3.getValue().booleanValue()) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                    arrayList3.add((String) entry4.getKey());
                }
                if (!this.f113779a.mo159042a(arrayList2, arrayList3, aVar)) {
                    this.f113779a.f113769b = false;
                    this.f113779a.f113772e.mo159018a(this.f113780b, this.f113781c, aVar);
                    this.f113779a.f113769b = true;
                }
            }
        }

        C44934d(EduGroupInvitationDelegate aVar, Context context, List list) {
            this.f113779a = aVar;
            this.f113780b = context;
            this.f113781c = list;
        }
    }

    /* renamed from: a */
    private final void m178201a(List<String> list, AbstractC44896a aVar) {
        UICallbackExecutor.execute(new RunnableC44935e(this, list, aVar));
    }

    /* renamed from: a */
    private final void m178199a(Context context, List<PickChatEntity> list) {
        boolean z;
        boolean z2;
        List<PickChatEntity> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.mo124689a() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(t);
                }
            }
            ArrayList<PickChatEntity> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (PickChatEntity pickChatEntity : arrayList2) {
                arrayList3.add(pickChatEntity.mo124690b());
            }
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            a.getChatDependency().mo143767b(this.f113770c.getId(), arrayList3, new C44934d(this, context, list));
        }
    }

    /* renamed from: a */
    public final void mo159041a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        EduGroupInvitationService c = m178203c();
        String id = this.f113770c.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        c.mo159053a(id, list, iGetDataCallback);
    }

    /* renamed from: b */
    private final void m178202b(List<String> list, List<String> list2, AbstractC44896a aVar) {
        UICallbackExecutor.execute(new RunnableC44939g(this, list, list2, aVar));
    }

    public EduGroupInvitationDelegate(Chat chat, Context context, IAddGroupMemberContract.AbstractC44929a aVar) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(aVar, "target");
        this.f113770c = chat;
        this.f113771d = context;
        this.f113772e = aVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44930b
    /* renamed from: a */
    public void mo159036a(Context context, List<? extends PickChatEntity> list, AbstractC44896a aVar) {
        List<PickChatEntity> list2;
        this.f113768a = aVar;
        if (list != null) {
            list2 = CollectionsKt.toMutableList((Collection) list);
        } else {
            list2 = null;
        }
        m178199a(context, list2);
    }

    /* renamed from: a */
    public final void mo159039a(String str, List<String> list, AbstractC44896a aVar) {
        EduGroupInvitationService c = m178203c();
        String id = this.f113770c.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        c.mo159054a(id, list, str, aVar);
    }

    /* renamed from: a */
    public final boolean mo159042a(List<String> list, List<String> list2, AbstractC44896a aVar) {
        boolean d = m178204d();
        List<String> list3 = list;
        if ((!list3.isEmpty()) && (list2.isEmpty() || ((!list2.isEmpty()) && !d))) {
            m178200a(list);
            return true;
        } else if (list.isEmpty() && (!list2.isEmpty()) && d) {
            m178201a(list2, aVar);
            return true;
        } else if (!(!list3.isEmpty()) || !(!list2.isEmpty())) {
            return false;
        } else {
            m178202b(list2, list, aVar);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo159040a(String str, List<String> list, List<String> list2, AbstractC44896a aVar) {
        mo159041a(list2, new C44933c(this, str, list, aVar));
    }
}
