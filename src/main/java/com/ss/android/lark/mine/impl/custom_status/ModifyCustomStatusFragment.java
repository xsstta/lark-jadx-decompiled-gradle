package com.ss.android.lark.mine.impl.custom_status;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.os.C0796b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.ak;
import androidx.navigation.fragment.C1254b;
import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.LifecycleAwareLazy;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupLayout;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.AvatarViewData;
import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel;
import com.ss.android.lark.mine.impl.custom_status.model.ErrorEvent;
import com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusState;
import com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusViewModel;
import com.ss.android.lark.mine.impl.custom_status.setting.SettingSwitchItemView;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0016\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b>?@ABCDEB\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d0%H\u0016J\b\u0010&\u001a\u00020'H\u0016J5\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d0%2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,\"\u00020-H\u0002¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020)H\u0002J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J&\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u00020)H\u0016J\u001a\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u0002042\b\u00109\u001a\u0004\u0018\u00010:H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0019¨\u0006F"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment;", "Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment;", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusViewModel;", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "()V", "autoSettingMap", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "Lcom/ss/android/lark/mine/impl/custom_status/setting/SettingSwitchItemView;", "mainViewModel", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "getMainViewModel", "()Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "mainViewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "modifyStatus", "Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$AbsModifyStatusLayout;", "viewModel", "getViewModel", "()Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusViewModel;", "viewModel$delegate", "viewModelFactory", "com/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$viewModelFactory$2$1", "viewModelFactory$annotations", "getViewModelFactory", "()Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$viewModelFactory$2$1;", "viewModelFactory$delegate", "Lkotlin/Lazy;", "getDisturbSetting", "", "()Ljava/lang/Boolean;", "getIconImageView", "Landroid/widget/ImageView;", "getModifyAwareViewModel", "getSaveTextView", "Landroid/widget/TextView;", "getSyncSetting", "", "getTitleText", "", "initAutoSetting", "", "syncMap", "settings", "", "Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$IAddAutoSetting;", "(Ljava/util/Map;[Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$IAddAutoSetting;)V", "initEditText", "initSubscriber", "initTitleBar", "initView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "AbsModifyStatusLayout", "Companion", "IAddAutoSetting", "ModifyCustomStatus", "ModifySystemStatus", "OnLeavingSetting", "OnMeetingSetting", "OnScheduleSetting", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ModifyCustomStatusFragment extends AbsModifyAwareFragment<UpdateStatusViewModel, UpdateStatusState> {

    /* renamed from: d */
    public static final Companion f115029d = new Companion(null);

    /* renamed from: b */
    public final Map<CustomStatusSyncField, SettingSwitchItemView> f115030b = new EnumMap(CustomStatusSyncField.class);

    /* renamed from: c */
    public AbsModifyStatusLayout f115031c = new ModifySystemStatus();

    /* renamed from: e */
    private final LifecycleAwareLazy f115032e;

    /* renamed from: f */
    private final LifecycleAwareLazy f115033f;

    /* renamed from: g */
    private final Lazy f115034g = LazyKt.lazy(new C45455z(this));

    /* renamed from: h */
    private HashMap f115035h;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$IAddAutoSetting;", "", "getDescText", "", "getSyncField", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "getTitleText", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$c */
    public interface IAddAutoSetting {
        /* renamed from: a */
        CustomStatusSyncField mo160341a();

        /* renamed from: b */
        int mo160342b();

        /* renamed from: c */
        int mo160343c();
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: a */
    public View mo160322a(int i) {
        if (this.f115035h == null) {
            this.f115035h = new HashMap();
        }
        View view = (View) this.f115035h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f115035h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: o */
    public void mo160330o() {
        HashMap hashMap = this.f115035h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment, com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo160330o();
    }

    /* renamed from: p */
    public final UpdateStatusViewModel mo160331p() {
        return (UpdateStatusViewModel) this.f115032e.getValue();
    }

    /* renamed from: q */
    public final CustomStatusViewModel mo160332q() {
        return (CustomStatusViewModel) this.f115033f.getValue();
    }

    /* renamed from: s */
    public final C45455z.C454561 mo160334s() {
        return (C45455z.C454561) this.f115034g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$Companion;", "", "()V", "KEY_STATUS", "", "TAG", "generateBundle", "Landroid/os/Bundle;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo160340a(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
            return C0796b.m3875a(TuplesKt.to(UpdateKey.STATUS, userCustomStatus));
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$OnLeavingSetting;", "Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$IAddAutoSetting;", "(Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment;)V", "getDescText", "", "getSyncField", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "getTitleText", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$f */
    public final class OnLeavingSetting implements IAddAutoSetting {
        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: b */
        public int mo160342b() {
            return R.string.Lark_Profile_AutoSyncOnLeave;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: c */
        public int mo160343c() {
            return R.string.Lark_Profile_AutoSyncOnLeaveDesc;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: a */
        public CustomStatusSyncField mo160341a() {
            return CustomStatusSyncField.IS_SYN_ON_LEAVE;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OnLeavingSetting() {
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$OnMeetingSetting;", "Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$IAddAutoSetting;", "(Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment;)V", "getDescText", "", "getSyncField", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "getTitleText", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$g */
    public final class OnMeetingSetting implements IAddAutoSetting {
        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: b */
        public int mo160342b() {
            return R.string.Lark_Profile_AutoSyncMeetings;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: c */
        public int mo160343c() {
            return R.string.Lark_Profile_AutoSyncMeetingsDesc;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: a */
        public CustomStatusSyncField mo160341a() {
            return CustomStatusSyncField.IS_SYN_MEETING;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OnMeetingSetting() {
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$OnScheduleSetting;", "Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$IAddAutoSetting;", "(Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment;)V", "getDescText", "", "getSyncField", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "getTitleText", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$h */
    public final class OnScheduleSetting implements IAddAutoSetting {
        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: b */
        public int mo160342b() {
            return R.string.Lark_Profile_AutoSyncCurrentEvent;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: c */
        public int mo160343c() {
            return R.string.Lark_Profile_AutoSyncEventDesc;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.IAddAutoSetting
        /* renamed from: a */
        public CustomStatusSyncField mo160341a() {
            return CustomStatusSyncField.IS_SYN_SCHEDULE;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OnScheduleSetting() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$viewModelFactory$2$1", "invoke", "()Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$viewModelFactory$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$y */
    static final class C45454y extends Lambda implements Function0<C45455z.C454561> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45454y(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(0);
            this.this$0 = modifyCustomStatusFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C45455z.C454561 invoke() {
            return this.this$0.mo160334s();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$viewModelFactory$2$1", "invoke", "()Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$viewModelFactory$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$z */
    static final class C45455z extends Lambda implements Function0<C454561> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45455z(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(0);
            this.this$0 = modifyCustomStatusFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C454561 invoke() {
            return new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.C45455z.C454561 */

                /* renamed from: a */
                final /* synthetic */ C45455z f115043a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f115043a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    Bundle arguments = this.f115043a.this$0.getArguments();
                    if (arguments != null) {
                        Serializable serializable = arguments.getSerializable(UpdateKey.STATUS);
                        if (serializable == null || !(serializable instanceof UserCustomStatus)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (_Assertions.f173221a && !z) {
                            throw new AssertionError("Assertion failed");
                        } else if (serializable != null) {
                            return new UpdateStatusViewModel((UserCustomStatus) serializable);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.lark.pb.contact.v1.UserCustomStatus");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
            };
        }
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: e */
    public ImageView mo160324e() {
        return this.f115031c.mo160337b();
    }

    /* renamed from: r */
    public UpdateStatusViewModel mo160329j() {
        return mo160331p();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$ModifyCustomStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$AbsModifyStatusLayout;", "(Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment;)V", "getIconImageView", "Landroid/widget/ImageView;", "getTitleTextView", "Landroid/widget/TextView;", "setHeaderLayout", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$d */
    public final class ModifyCustomStatus extends AbsModifyStatusLayout {
        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.AbsModifyStatusLayout
        /* renamed from: a */
        public TextView mo160335a() {
            return (UDEditText) ModifyCustomStatusFragment.this.mo160322a(R.id.input_title);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.AbsModifyStatusLayout
        /* renamed from: b */
        public ImageView mo160337b() {
            return (ImageView) ModifyCustomStatusFragment.this.mo160322a(R.id.avatar_custom_status);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.AbsModifyStatusLayout
        /* renamed from: c */
        public void mo160339c() {
            Group group = (Group) ModifyCustomStatusFragment.this.mo160322a(R.id.group_system_status_header);
            Intrinsics.checkExpressionValueIsNotNull(group, "group_system_status_header");
            group.setVisibility(8);
            Group group2 = (Group) ModifyCustomStatusFragment.this.mo160322a(R.id.group_custom_status_header);
            Intrinsics.checkExpressionValueIsNotNull(group2, "group_custom_status_header");
            group2.setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ModifyCustomStatus() {
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$ModifySystemStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$AbsModifyStatusLayout;", "(Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment;)V", "getIconImageView", "Landroid/widget/ImageView;", "getTitleTextView", "Landroid/widget/TextView;", "setHeaderLayout", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$e */
    public final class ModifySystemStatus extends AbsModifyStatusLayout {
        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.AbsModifyStatusLayout
        /* renamed from: a */
        public TextView mo160335a() {
            return (TextView) ModifyCustomStatusFragment.this.mo160322a(R.id.title_system_status);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.AbsModifyStatusLayout
        /* renamed from: b */
        public ImageView mo160337b() {
            return (ImageView) ModifyCustomStatusFragment.this.mo160322a(R.id.avatar_system_status);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.AbsModifyStatusLayout
        /* renamed from: c */
        public void mo160339c() {
            Group group = (Group) ModifyCustomStatusFragment.this.mo160322a(R.id.group_system_status_header);
            Intrinsics.checkExpressionValueIsNotNull(group, "group_system_status_header");
            group.setVisibility(0);
            Group group2 = (Group) ModifyCustomStatusFragment.this.mo160322a(R.id.group_custom_status_header);
            Intrinsics.checkExpressionValueIsNotNull(group2, "group_custom_status_header");
            group2.setVisibility(8);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ModifySystemStatus() {
        }
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: g */
    public TextView mo160326g() {
        return (TextView) mo160322a(R.id.save_title_bar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$w */
    static final class C45452w extends Lambda implements Function0<ak> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45452w(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(0);
            this.this$0 = modifyCustomStatusFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ak invoke() {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            ak viewModelStore = requireActivity.getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: t */
    private final void m180475t() {
        UDEditText uDEditText = (UDEditText) mo160322a(R.id.input_title);
        Intrinsics.checkExpressionValueIsNotNull(uDEditText, "input_title");
        ((UDEditText) mo160322a(R.id.input_title)).addTextChangedListener(mo160384a(20, uDEditText));
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: f */
    public String mo160325f() {
        CharSequence charSequence;
        TextView a = this.f115031c.mo160335a();
        if (a != null) {
            charSequence = a.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: h */
    public Boolean mo160327h() {
        UDSwitch uDSwitch = (UDSwitch) mo160322a(R.id.switch_notification);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switch_notification");
        return Boolean.valueOf(uDSwitch.isChecked());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        StatusBarUtil.setColor(requireActivity(), ContextCompat.getColor(requireActivity(), R.color.bg_base), 0);
    }

    /* renamed from: u */
    private final void m180476u() {
        CustomStatusUIUtils bVar = CustomStatusUIUtils.f115068a;
        TextView textView = (TextView) mo160322a(R.id.cancel_title_bar);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancel_title_bar");
        bVar.mo160435a(textView, new C45446s(this));
        CustomStatusUIUtils bVar2 = CustomStatusUIUtils.f115068a;
        TextView textView2 = (TextView) mo160322a(R.id.save_title_bar);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "save_title_bar");
        bVar2.mo160435a(textView2, new C45447t(this));
    }

    /* renamed from: w */
    private final void m180478w() {
        CustomStatusUIUtils bVar = CustomStatusUIUtils.f115068a;
        TextView textView = (TextView) mo160322a(R.id.text_delete_status);
        Intrinsics.checkExpressionValueIsNotNull(textView, "text_delete_status");
        bVar.mo160435a(textView, new C45448u(this));
        CustomStatusUIUtils bVar2 = CustomStatusUIUtils.f115068a;
        ImageView imageView = (ImageView) mo160322a(R.id.avatar_custom_status);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "avatar_custom_status");
        bVar2.mo160435a(imageView, new C45451v(this));
    }

    public ModifyCustomStatusFragment() {
        C45454y yVar = new C45454y(this);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateStatusViewModel.class);
        this.f115032e = new LifecycleAwareLazy(orCreateKotlinClass, new ModifyCustomStatusFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), new ModifyCustomStatusFragment$$special$$inlined$viewModel$3(this), yVar, ModifyCustomStatusFragment$$special$$inlined$viewModel$2.INSTANCE);
        C45452w wVar = new C45452w(this);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(CustomStatusViewModel.class);
        this.f115033f = new LifecycleAwareLazy(orCreateKotlinClass2, new ModifyCustomStatusFragment$$special$$inlined$viewModel$5(orCreateKotlinClass2), wVar, ModifyCustomStatusFragment$$special$$inlined$viewModel$7.INSTANCE, ModifyCustomStatusFragment$$special$$inlined$viewModel$6.INSTANCE);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: i */
    public Map<CustomStatusSyncField, Boolean> mo160328i() {
        Map<CustomStatusSyncField, SettingSwitchItemView> map = this.f115030b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (T t : map.entrySet()) {
            linkedHashMap.put(t.getKey(), Boolean.valueOf(((SettingSwitchItemView) t.getValue()).getSwitchView().isChecked()));
        }
        return linkedHashMap;
    }

    /* renamed from: v */
    private final void m180477v() {
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45475d.INSTANCE, (SubscriptionConfig) null, new C45441n(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45484j.INSTANCE, (SubscriptionConfig) null, new C45443p(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45485k.INSTANCE, (SubscriptionConfig) null, new C45444q(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45486l.INSTANCE, (SubscriptionConfig) null, new C45445r(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45487m.INSTANCE, (SubscriptionConfig) null, new C45436i(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45476e.INSTANCE, (SubscriptionConfig) null, new C45437j(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45480f.INSTANCE, (SubscriptionConfig) null, new C45438k(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45481g.INSTANCE, (SubscriptionConfig) null, new C45439l(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45482h.INSTANCE, (SubscriptionConfig) null, new C45440m(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160331p(), C45483i.INSTANCE, (SubscriptionConfig) null, new C45442o(this), 2, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$i */
    public static final class C45436i extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45436i(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            UpdateUserCustomStatusResponse a = jVar.mo160556i().mo86215a();
            if (a != null) {
                Map<Long, UserCustomStatus> map = a.status;
                if (map != null) {
                    Context context = this.this$0.mContext;
                    Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                    UDToast.show(context, (int) R.string.Lark_Profile_Saved);
                    this.this$0.mo160332q().notifyModify(map);
                    if (map != null) {
                        return;
                    }
                }
                Context context2 = this.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
                UDToast.show(context2, (int) R.string.Lark_Profile_FailedSaveRetry);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$j */
    public static final class C45437j extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45437j(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            DeleteUserCustomStatusResponse a = jVar.mo160557j().mo86215a();
            if (a != null) {
                Context context = this.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                UDToast.show(context, (int) R.string.Lark_Legacy_SaveBoxDeleteSuccess);
                Map<Long, UserCustomStatus> map = a.status;
                if (map != null) {
                    this.this$0.mo160332q().notifyAfterDelete(map);
                }
                C1254b.m5698a(this.this$0).mo6337b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$k */
    public static final class C45438k extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45438k(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            SettingSwitchItemView settingSwitchItemView;
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            ErrorEvent a = jVar.mo160558k().mo86215a();
            if (a instanceof ErrorEvent.UpdateCustomStatus) {
                Context context = this.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                UDToast.show(context, (int) R.string.Lark_Profile_FailedSaveRetry);
            } else if (a instanceof ErrorEvent.DeleteCustomStatus) {
                Context context2 = this.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
                UDToast.show(context2, (int) R.string.Lark_Legacy_SaveBoxDeleteFail);
            } else if ((a instanceof ErrorEvent.SettingSync) && (settingSwitchItemView = this.this$0.f115030b.get(((ErrorEvent.SettingSync) a).mo160538b())) != null) {
                settingSwitchItemView.mo160715a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$l */
    public static final class C45439l extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45439l(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            Pair<List<AvatarViewData>, Integer> a = jVar.mo160560m().mo86215a();
            if (a != null) {
                this.this$0.mo160386a(a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$m */
    public static final class C45440m extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45440m(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            int i = C45474c.f115070a[jVar.mo160545b().ordinal()];
            if (i == 1) {
                this.this$0.mo160323a(jVar.mo160553g(), new OnMeetingSetting(), new OnScheduleSetting());
            } else if (i != 2) {
                Group group = (Group) this.this$0.mo160322a(R.id.auto_setting_group);
                Intrinsics.checkExpressionValueIsNotNull(group, "auto_setting_group");
                group.setVisibility(8);
            } else {
                this.this$0.mo160323a(jVar.mo160553g(), new OnLeavingSetting());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$n */
    public static final class C45441n extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45441n(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            AbsModifyStatusLayout aVar;
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            ModifyCustomStatusFragment modifyCustomStatusFragment = this.this$0;
            if (jVar.mo160548c()) {
                aVar = new ModifySystemStatus();
            } else {
                aVar = new ModifyCustomStatus();
            }
            modifyCustomStatusFragment.f115031c = aVar;
            this.this$0.f115031c.mo160339c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$o */
    public static final class C45442o extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45442o(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            Boolean a = jVar.mo160559l().mo86215a();
            if (a != null && a.booleanValue()) {
                this.this$0.mo160387c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$p */
    public static final class C45443p extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45443p(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            this.this$0.f115031c.mo160336a(jVar.mo160549d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$q */
    public static final class C45444q extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45444q(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            this.this$0.mo160385a(jVar.mo160550e());
            this.this$0.f115031c.mo160338b(jVar.mo160550e());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$r */
    public static final class C45445r extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45445r(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "$receiver");
            UDSwitch uDSwitch = (UDSwitch) this.this$0.mo160322a(R.id.switch_notification);
            Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switch_notification");
            uDSwitch.setChecked(jVar.mo160552f());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$s */
    public static final class C45446s extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45446s(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            this.this$0.mo160390l();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$t */
    public static final class C45447t extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45447t(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            boolean z;
            TextView a = this.this$0.f115031c.mo160335a();
            if (a != null) {
                CharSequence text = a.getText();
                if (text == null || StringsKt.isBlank(text)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Context context = this.this$0.mContext;
                    Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                    UDToast.show(context, (int) R.string.Lark_Profile_StatusNameDesc);
                    return;
                }
                this.this$0.mo160391m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$u */
    public static final class C45448u extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45448u(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            this.this$0.mo160331p().sendDeleteStatusClick();
            Context context = this.this$0.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            String string = UIHelper.getString(R.string.Lark_Profile_DeleteStatus);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…ark_Profile_DeleteStatus)");
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).title(R.string.Lark_Profile_DeleteStatusDesc)).mo90873b(CollectionsKt.listOf(new UDBaseListDialogBuilder.ListItemBuilder(string).mo90888b(R.color.function_danger_500).mo90889c()))).mo90869a(new UDListDialogController.OnItemClickListener(this) {
                /* class com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment.C45448u.C454491 */

                /* renamed from: a */
                final /* synthetic */ C45448u f115041a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f115041a = r1;
                }

                @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                public void onItemClick(int i) {
                    UserCustomStatusHitPoint.f115066a.mo160414b(true);
                    this.f115041a.this$0.mo160331p().delete();
                }
            })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Profile_Cancel, DialogInterface$OnClickListenerC454502.f115042a)).show();
            UserCustomStatusHitPoint.f115066a.mo160430h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$v */
    public static final class C45451v extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ ModifyCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45451v(ModifyCustomStatusFragment modifyCustomStatusFragment) {
            super(1);
            this.this$0 = modifyCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            this.this$0.mo160331p().getAvatarList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$x */
    static final class C45453x extends Lambda implements Function1<UpdateStatusState, Unit> {
        public static final C45453x INSTANCE = new C45453x();

        C45453x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "it");
            UserCustomStatusHitPoint aVar = UserCustomStatusHitPoint.f115066a;
            String str = jVar.mo160554h().event_name;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.currentStatus.event_name");
            aVar.mo160405a(str);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/ModifyCustomStatusFragment$AbsModifyStatusLayout;", "", "()V", "getIconImageView", "Landroid/widget/ImageView;", "getTitleTextView", "Landroid/widget/TextView;", "setHeaderLayout", "", "setImageIcon", "iconKey", "", "setTitleText", "text", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment$a */
    public static abstract class AbsModifyStatusLayout {
        /* renamed from: a */
        public abstract TextView mo160335a();

        /* renamed from: b */
        public abstract ImageView mo160337b();

        /* renamed from: c */
        public abstract void mo160339c();

        /* renamed from: b */
        public final void mo160338b(String str) {
            C52977a.m205190a().mo180995a(mo160337b(), str);
        }

        /* renamed from: a */
        public final void mo160336a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            TextView a = mo160335a();
            if (a != null) {
                a.setText(str);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m180477v();
        m180476u();
        m180478w();
        m180475t();
        mo160331p().withState(C45453x.INSTANCE);
    }

    /* renamed from: a */
    public final void mo160323a(Map<CustomStatusSyncField, Boolean> map, IAddAutoSetting... cVarArr) {
        boolean z;
        for (IAddAutoSetting cVar : cVarArr) {
            SettingGroupLayout settingGroupLayout = (SettingGroupLayout) mo160322a(R.id.auto_setting_layout);
            Intrinsics.checkExpressionValueIsNotNull(settingGroupLayout, "auto_setting_layout");
            Context context = settingGroupLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "auto_setting_layout.context");
            SettingSwitchItemView settingSwitchItemView = new SettingSwitchItemView(context, null, 0, 0, 14, null);
            settingSwitchItemView.setTitleText(cVar.mo160342b());
            settingSwitchItemView.setHintText(cVar.mo160343c());
            Boolean bool = map.get(cVar.mo160341a());
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            settingSwitchItemView.setSwitchChecked(z);
            this.f115030b.put(cVar.mo160341a(), settingSwitchItemView);
            ((SettingGroupLayout) mo160322a(R.id.auto_setting_layout)).addView(settingSwitchItemView);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_modify_system_status, viewGroup, false);
    }
}
