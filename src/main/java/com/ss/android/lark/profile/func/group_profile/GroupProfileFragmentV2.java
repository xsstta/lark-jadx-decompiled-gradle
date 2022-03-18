package com.ss.android.lark.profile.func.group_profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.layout.LKUIConstraintLayout;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileLoadParams;
import com.ss.android.lark.profile.func.group_profile.mvvm.GroupProfileViewModel;
import com.ss.android.lark.profile.statistics.GroupProfilePerceivableErrorCostTimeHitPoint;
import com.ss.android.lark.profile.statistics.ProfileHitPointNew;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 .2\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002:\u0001.B\u0005¢\u0006\u0002\u0010\u0004J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J$\u0010(\u001a\u00020\u00172\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010*\u001a\u00020\u0006H\u0002J\u001c\u0010+\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/profile/func/group_profile/GroupProfileFragmentV2;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Ljava/util/concurrent/Callable;", "Landroid/content/Context;", "()V", "LOG_TAG", "", "actionResultNotifyObserver", "Landroidx/lifecycle/Observer;", "Lkotlin/Pair;", "Lcom/ss/android/lark/profile/func/group_profile/mvvm/GroupProfileViewModel$ActionResultNotify;", "", "chatInfoObserver", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "closePageObserver", "", "groupStateObserver", "Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "ownerNameObserver", "viewModel", "Lcom/ss/android/lark/profile/func/group_profile/mvvm/GroupProfileViewModel;", "call", "finishPageWithResult", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onViewCreated", "view", "sendClickJoinGroupBtn", "showApplyDialog", "showErrorToastFirst", "it", "defaultMsg", "showGroupAvatar", "avatarKey", "entityId", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.group_profile.b */
public final class GroupProfileFragmentV2 extends BaseFragment implements Callable<Context> {

    /* renamed from: c */
    public static final Companion f129698c = new Companion(null);

    /* renamed from: a */
    public GroupProfileViewModel f129699a;

    /* renamed from: b */
    public final String f129700b = "GroupProfileFragmentV2";

    /* renamed from: d */
    private final AbstractC1178x<String> f129701d = new C52312g(this);

    /* renamed from: e */
    private final AbstractC1178x<Chat> f129702e = new C52302c(this);

    /* renamed from: f */
    private final AbstractC1178x<ShareGroupChatContent.GroupState> f129703f = new C52304e(this);

    /* renamed from: g */
    private final AbstractC1178x<Boolean> f129704g = new C52303d(this);

    /* renamed from: h */
    private final AbstractC1178x<Pair<GroupProfileViewModel.ActionResultNotify, Object>> f129705h = new C52301b(this);

    /* renamed from: i */
    private HashMap f129706i;

    /* renamed from: a */
    public View mo179139a(int i) {
        if (this.f129706i == null) {
            this.f129706i = new HashMap();
        }
        View view = (View) this.f129706i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129706i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public void mo179147e() {
        HashMap hashMap = this.f129706i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/group_profile/GroupProfileFragmentV2$Companion;", "", "()V", "AVATAR_SIZE_DP", "", "BACK_BUTTON_MARGIN_TOP_DP", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public Context call() {
        return this.mContext;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((LKUIConstraintLayout) mo179139a(R.id.root_layout)).unRegisterPlus(GroupProfileDrawEventPlus.class);
        super.onDestroyView();
        mo179147e();
    }

    /* renamed from: c */
    public final void mo179144c() {
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133583m().mo133661a(this.mContext, new C52314h(this));
        ProfileHitPointNew.Companion aVar = ProfileHitPointNew.f130740b;
        GroupProfileViewModel groupProfileViewModel = this.f129699a;
        if (groupProfileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        aVar.mo180544b(groupProfileViewModel.getChatInfoLiveData().mo5927b());
    }

    /* renamed from: d */
    public final void mo179146d() {
        GroupProfileViewModel groupProfileViewModel = this.f129699a;
        if (groupProfileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Message message = groupProfileViewModel.getMessage();
        if (message != null) {
            Intent intent = new Intent();
            intent.putExtra("params_group_message_id", message.getId());
            GroupProfileViewModel groupProfileViewModel2 = this.f129699a;
            if (groupProfileViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            intent.putExtra("params_group_state", groupProfileViewModel2.getGroupStateLiveData().mo5927b());
            setResult(-1, intent);
        }
        finish();
    }

    /* renamed from: a */
    public final void mo179140a() {
        Map<String, ? extends Object> mapOf = MapsKt.mapOf(TuplesKt.to("is_toast_remind", "false"));
        ProfileHitPointNew.Companion aVar = ProfileHitPointNew.f130740b;
        GroupProfileViewModel groupProfileViewModel = this.f129699a;
        if (groupProfileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        aVar.mo180542a(groupProfileViewModel.getChatInfoLiveData().mo5927b(), "group_join", "none", mapOf);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        GroupProfileViewModel groupProfileViewModel = this.f129699a;
        if (groupProfileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel.setContextProvider(null);
        GroupProfileViewModel groupProfileViewModel2 = this.f129699a;
        if (groupProfileViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel2.getOwnerNameLiveData().mo5928b(this.f129701d);
        GroupProfileViewModel groupProfileViewModel3 = this.f129699a;
        if (groupProfileViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel3.getChatInfoLiveData().mo5928b(this.f129702e);
        GroupProfileViewModel groupProfileViewModel4 = this.f129699a;
        if (groupProfileViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel4.getGroupStateLiveData().mo5928b(this.f129703f);
        GroupProfileViewModel groupProfileViewModel5 = this.f129699a;
        if (groupProfileViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel5.getClosePageLiveData().mo5928b(this.f129704g);
        GroupProfileViewModel groupProfileViewModel6 = this.f129699a;
        if (groupProfileViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel6.getActionResultNotifyLiveData().mo5928b(this.f129705h);
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.b$f */
    static final class View$OnClickListenerC52311f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupProfileFragmentV2 f129717a;

        View$OnClickListenerC52311f(GroupProfileFragmentV2 bVar) {
            this.f129717a = bVar;
        }

        public final void onClick(View view) {
            this.f129717a.mo179146d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/group_profile/GroupProfileFragmentV2$showApplyDialog$1", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency$IChatSettingDependency$ApplyDialogConfirmClickListener;", "onClick", "", "view", "Landroid/view/View;", "reason", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.b$h */
    public static final class C52314h implements IProfileModuleDependency.AbstractC52248d.AbstractC52249a {

        /* renamed from: a */
        final /* synthetic */ GroupProfileFragmentV2 f129720a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52314h(GroupProfileFragmentV2 bVar) {
            this.f129720a = bVar;
        }

        @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52248d.AbstractC52249a
        /* renamed from: a */
        public void mo178830a(View view, String str) {
            boolean z;
            String str2;
            GroupProfileFragmentV2.m202932a(this.f129720a).applyGroup(str);
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = "false";
            } else {
                str2 = "true";
            }
            ProfileHitPointNew.f130740b.mo180545b(GroupProfileFragmentV2.m202932a(this.f129720a).getChatInfoLiveData().mo5927b(), "confirm", "none", MapsKt.mapOf(TuplesKt.to("is_reason_filled", str2)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.b$d */
    static final class C52303d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileFragmentV2 f129709a;

        C52303d(GroupProfileFragmentV2 bVar) {
            this.f129709a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (bool != null && bool.booleanValue()) {
                this.f129709a.mo179146d();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ GroupProfileViewModel m202932a(GroupProfileFragmentV2 bVar) {
        GroupProfileViewModel groupProfileViewModel = bVar.f129699a;
        if (groupProfileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return groupProfileViewModel;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = new C1144ai(this).mo6005a(GroupProfileViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(this).…ileViewModel::class.java)");
        GroupProfileViewModel groupProfileViewModel = (GroupProfileViewModel) a;
        this.f129699a = groupProfileViewModel;
        if (groupProfileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel.setContextProvider(this);
        GroupProfileViewModel groupProfileViewModel2 = this.f129699a;
        if (groupProfileViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel2.onCreate(getArguments());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "name", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.b$g */
    static final class C52312g<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileFragmentV2 f129718a;

        C52312g(GroupProfileFragmentV2 bVar) {
            this.f129718a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (str == null) {
                TextView textView = (TextView) this.f129718a.mo179139a(R.id.group_owner_detail);
                Intrinsics.checkExpressionValueIsNotNull(textView, "group_owner_detail");
                textView.setText("");
                ((TextView) this.f129718a.mo179139a(R.id.group_owner_detail)).setOnClickListener(null);
                return;
            }
            TextView textView2 = (TextView) this.f129718a.mo179139a(R.id.group_owner_detail);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "group_owner_detail");
            textView2.setText(str);
            ((TextView) this.f129718a.mo179139a(R.id.group_owner_detail)).setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.profile.func.group_profile.GroupProfileFragmentV2.C52312g.View$OnClickListenerC523131 */

                /* renamed from: a */
                final /* synthetic */ C52312g f129719a;

                {
                    this.f129719a = r1;
                }

                public final void onClick(View view) {
                    GroupProfileViewModel a = GroupProfileFragmentV2.m202932a(this.f129719a.f129718a);
                    Context context = this.f129719a.f129718a.mContext;
                    Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                    a.openOwnerProfile(context);
                }
            });
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        GroupProfileViewModel groupProfileViewModel = this.f129699a;
        if (groupProfileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel.getOwnerNameLiveData().mo5923a(getViewLifecycleOwner(), this.f129701d);
        GroupProfileViewModel groupProfileViewModel2 = this.f129699a;
        if (groupProfileViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel2.getChatInfoLiveData().mo5923a(getViewLifecycleOwner(), this.f129702e);
        GroupProfileViewModel groupProfileViewModel3 = this.f129699a;
        if (groupProfileViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel3.getGroupStateLiveData().mo5923a(getViewLifecycleOwner(), this.f129703f);
        GroupProfileViewModel groupProfileViewModel4 = this.f129699a;
        if (groupProfileViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel4.getClosePageLiveData().mo5923a(getViewLifecycleOwner(), this.f129704g);
        GroupProfileViewModel groupProfileViewModel5 = this.f129699a;
        if (groupProfileViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        groupProfileViewModel5.getActionResultNotifyLiveData().mo5923a(getViewLifecycleOwner(), this.f129705h);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.b$c */
    static final class C52302c<T> implements AbstractC1178x<Chat> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileFragmentV2 f129708a;

        C52302c(GroupProfileFragmentV2 bVar) {
            this.f129708a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Chat chat) {
            boolean z;
            String str;
            if (chat != null) {
                this.f129708a.mo179141a(chat.getAvatarKey(), chat.getEntityId());
                TextView textView = (TextView) this.f129708a.mo179139a(R.id.group_name);
                Intrinsics.checkExpressionValueIsNotNull(textView, "group_name");
                textView.setText(chat.getName());
                TextView textView2 = (TextView) this.f129708a.mo179139a(R.id.group_description_detail);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "group_description_detail");
                String description = chat.getDescription();
                if (description == null || description.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = UIHelper.getString(R.string.Lark_Legacy_EmptyDescription);
                } else {
                    str = chat.getDescription();
                }
                textView2.setText(str);
                TextView textView3 = (TextView) this.f129708a.mo179139a(R.id.group_member_count_detail);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "group_member_count_detail");
                textView3.setText(chat.getMemberCount() + UIHelper.getString(R.string.Lark_Legacy_AmountGroupUnit));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/profile/func/group_profile/mvvm/GroupProfileViewModel$ActionResultNotify;", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.b$b */
    static final class C52301b<T> implements AbstractC1178x<Pair<? extends GroupProfileViewModel.ActionResultNotify, ? extends Object>> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileFragmentV2 f129707a;

        C52301b(GroupProfileFragmentV2 bVar) {
            this.f129707a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<? extends GroupProfileViewModel.ActionResultNotify, ? extends Object> pair) {
            if (pair != null) {
                switch (C52315c.f129722b[((GroupProfileViewModel.ActionResultNotify) pair.getFirst()).ordinal()]) {
                    case 1:
                        UDButton uDButton = (UDButton) this.f129707a.mo179139a(R.id.action_button);
                        Intrinsics.checkExpressionValueIsNotNull(uDButton, "action_button");
                        Context context = uDButton.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "action_button.context");
                        UDToast.makeToast(context, (int) R.string.Lark_Group_JoinGroupToast).show();
                        return;
                    case 2:
                        this.f129707a.mo179144c();
                        return;
                    case 3:
                        UDButton uDButton2 = (UDButton) this.f129707a.mo179139a(R.id.action_button);
                        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "action_button");
                        Context context2 = uDButton2.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context2, "action_button.context");
                        UDToast.makeToast(context2, (int) R.string.Lark_Group_UnableJoinLeftToast).show();
                        return;
                    case 4:
                        UDButton uDButton3 = (UDButton) this.f129707a.mo179139a(R.id.action_button);
                        Intrinsics.checkExpressionValueIsNotNull(uDButton3, "action_button");
                        Context context3 = uDButton3.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context3, "action_button.context");
                        UDToast.makeToast(context3, (int) R.string.Lark_Group_UnableJoinDisbandedToast).show();
                        return;
                    case 5:
                        UDButton uDButton4 = (UDButton) this.f129707a.mo179139a(R.id.action_button);
                        Intrinsics.checkExpressionValueIsNotNull(uDButton4, "action_button");
                        Context context4 = uDButton4.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context4, "action_button.context");
                        UDToast.makeToast(context4, (int) R.string.Lark_Group_InvitationDisabledToast).show();
                        return;
                    case 6:
                        UDButton uDButton5 = (UDButton) this.f129707a.mo179139a(R.id.action_button);
                        Intrinsics.checkExpressionValueIsNotNull(uDButton5, "action_button");
                        Context context5 = uDButton5.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context5, "action_button.context");
                        UDToast.makeToast(context5, (int) R.string.Lark_Group_InvitationExpiredToast).show();
                        return;
                    case 7:
                        GroupProfileFragmentV2 bVar = this.f129707a;
                        String string = UIHelper.getString(R.string.Lark_Legacy_GroupMemberOutOfRange);
                        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…cy_GroupMemberOutOfRange)");
                        bVar.mo179142a(pair, string);
                        ProfileHitPointNew.f130740b.mo180540a();
                        return;
                    case 8:
                        if (pair.getSecond() instanceof ErrorResult) {
                            Object second = pair.getSecond();
                            if (second != null) {
                                BillingTipsDialog.m226151a(this.f129707a.mContext, ((ErrorResult) second).getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.framework.callback.Entity.ErrorResult");
                        }
                        return;
                    case 9:
                        UDButton uDButton6 = (UDButton) this.f129707a.mo179139a(R.id.action_button);
                        Intrinsics.checkExpressionValueIsNotNull(uDButton6, "action_button");
                        Context context6 = uDButton6.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context6, "action_button.context");
                        UDToast.makeToast(context6, (int) R.string.Lark_Profile_FailedToLoadTryAgainLater).show();
                        return;
                    case 10:
                        GroupProfileFragmentV2 bVar2 = this.f129707a;
                        String string2 = UIHelper.getString(R.string.Lark_Group_InternalContactAdminJoinToast);
                        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…nalContactAdminJoinToast)");
                        bVar2.mo179142a(pair, string2);
                        return;
                    case 11:
                        GroupProfileFragmentV2 bVar3 = this.f129707a;
                        String string3 = UIUtils.getString(bVar3.mContext, R.string.Lark_Contacts_PermissionControlDescFive);
                        Intrinsics.checkExpressionValueIsNotNull(string3, "UIUtils.getString(mConte…ermissionControlDescFive)");
                        bVar3.mo179142a(pair, string3);
                        return;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        GroupProfileFragmentV2 bVar4 = this.f129707a;
                        String string4 = UIHelper.getString(R.string.Lark_Legacy_JoinFailed);
                        Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(R.str…g.Lark_Legacy_JoinFailed)");
                        bVar4.mo179142a(pair, string4);
                        return;
                    case 13:
                        GroupProfileFragmentV2 bVar5 = this.f129707a;
                        String string5 = UIHelper.getString(R.string.Lark_Groups_CantOpenGroupLink);
                        Intrinsics.checkExpressionValueIsNotNull(string5, "UIHelper.getString(R.str…Groups_CantOpenGroupLink)");
                        bVar5.mo179142a(pair, string5);
                        return;
                    case 14:
                        GroupProfileFragmentV2 bVar6 = this.f129707a;
                        String string6 = UIHelper.getString(R.string.Lark_Groups_CantReadGroupCode);
                        Intrinsics.checkExpressionValueIsNotNull(string6, "UIHelper.getString(R.str…Groups_CantReadGroupCode)");
                        bVar6.mo179142a(pair, string6);
                        return;
                    case 15:
                        GroupProfileFragmentV2 bVar7 = this.f129707a;
                        String string7 = UIHelper.getString(R.string.Lark_Groups_CantJoinGroup);
                        Intrinsics.checkExpressionValueIsNotNull(string7, "UIHelper.getString(R.str…ark_Groups_CantJoinGroup)");
                        bVar7.mo179142a(pair, string7);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.group_profile.b$e */
    static final class C52304e<T> implements AbstractC1178x<ShareGroupChatContent.GroupState> {

        /* renamed from: a */
        final /* synthetic */ GroupProfileFragmentV2 f129710a;

        C52304e(GroupProfileFragmentV2 bVar) {
            this.f129710a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x018d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x01cd  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onChanged(com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent.GroupState r12) {
            /*
            // Method dump skipped, instructions count: 578
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.group_profile.GroupProfileFragmentV2.C52304e.onChanged(com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent$GroupState):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "it.decorView");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            View decorView2 = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView2, "it.decorView");
            decorView2.setSystemUiVisibility(systemUiVisibility | DynamicModule.f58006b | 1024);
            window.setStatusBarColor(0);
            int statusBarHeight = StatusBarUtil.getStatusBarHeight(getContext()) + C57582a.m223600a(10);
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo179139a(R.id.back);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "back");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams != null) {
                ((ConstraintLayout.LayoutParams) layoutParams).topMargin = statusBarHeight;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        ((AppCompatImageView) mo179139a(R.id.back)).setOnClickListener(new View$OnClickListenerC52311f(this));
    }

    /* renamed from: a */
    public final void mo179141a(String str, String str2) {
        boolean z;
        String str3 = str;
        boolean z2 = false;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                int a = C57582a.m223600a(96);
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133585o().mo133596a(this.mContext, (LKUIRoundedImageView2) mo179139a(R.id.group_avatar), str, str2, new ProfileLoadParams().mo178889a(a).mo178894b(a).mo178891a(str).mo178897b(true).mo178898c(true).mo178896b("webp").mo178892a(true));
                GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180537h();
            }
        }
    }

    /* renamed from: a */
    public final void mo179142a(Pair<? extends GroupProfileViewModel.ActionResultNotify, ? extends Object> pair, String str) {
        if (pair.getSecond() instanceof ErrorResult) {
            Object second = pair.getSecond();
            if (second != null) {
                str = ((ErrorResult) second).getDisplayMsg(str);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.larksuite.framework.callback.Entity.ErrorResult");
            }
        }
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        Intrinsics.checkExpressionValueIsNotNull(str, "errorMsg");
        UDToast.makeToast(context, str).show();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180534e();
        View inflate = layoutInflater.inflate(R.layout.fragment_group_profile, viewGroup, false);
        GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180535f();
        ((LKUIConstraintLayout) inflate.findViewById(R.id.root_layout)).registerPlus(GroupProfileDrawEventPlus.class);
        ProfileHitPointNew.Companion aVar = ProfileHitPointNew.f130740b;
        GroupProfileViewModel groupProfileViewModel = this.f129699a;
        if (groupProfileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        aVar.mo180541a(groupProfileViewModel.getChatInfoLiveData().mo5927b());
        return inflate;
    }
}
