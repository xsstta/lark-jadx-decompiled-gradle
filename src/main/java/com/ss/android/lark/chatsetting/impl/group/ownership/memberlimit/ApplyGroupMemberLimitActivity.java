package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleAwareLazy;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyGroupMemberLimitModel;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0004J'\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/ApplyGroupMemberLimitActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "Lcom/larksuite/arch/jack/JackView;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "viewModel", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyGroupMemberLimitModel;", "getViewModel", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyGroupMemberLimitModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ApplyGroupMemberLimitActivity extends BaseFragmentActivity implements C1144ai.AbstractC1146b, JackView {

    /* renamed from: a */
    public static final Companion f89779a = new Companion(null);

    /* renamed from: b */
    private Chat f89780b;

    /* renamed from: c */
    private final LifecycleAwareLazy f89781c;

    /* renamed from: f */
    private final ApplyGroupMemberLimitModel m135125f() {
        return (ApplyGroupMemberLimitModel) this.f89781c.getValue();
    }

    /* renamed from: a */
    public Context mo128297a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo128298a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m135122a(this, context);
    }

    /* renamed from: c */
    public Resources mo128299c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m135120a(this, configuration);
    }

    /* renamed from: d */
    public void mo128301d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo128302e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m135124c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m135121a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m135123b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/ApplyGroupMemberLimitActivity$Companion;", "", "()V", "KEY_CHAT", "", "LOG_TAG", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.ApplyGroupMemberLimitActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/ApplyGroupMemberLimitActivity;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.ApplyGroupMemberLimitActivity$c */
    static final class C34748c extends Lambda implements Function0<ApplyGroupMemberLimitActivity> {
        final /* synthetic */ ApplyGroupMemberLimitActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34748c(ApplyGroupMemberLimitActivity applyGroupMemberLimitActivity) {
            super(0);
            this.this$0 = applyGroupMemberLimitActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ApplyGroupMemberLimitActivity invoke() {
            return this.this$0;
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.ApplyGroupMemberLimitActivity$b */
    static final class C34747b extends Lambda implements Function0<ak> {
        final /* synthetic */ ApplyGroupMemberLimitActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34747b(ApplyGroupMemberLimitActivity applyGroupMemberLimitActivity) {
            super(0);
            this.this$0 = applyGroupMemberLimitActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ak invoke() {
            ak viewModelStore = this.this$0.getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public ApplyGroupMemberLimitActivity() {
        C34747b bVar = new C34747b(this);
        C34748c cVar = new C34748c(this);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApplyGroupMemberLimitModel.class);
        this.f89781c = new LifecycleAwareLazy(orCreateKotlinClass, new ApplyGroupMemberLimitActivity$$special$$inlined$viewModel$1(orCreateKotlinClass), bVar, cVar, ApplyGroupMemberLimitActivity$$special$$inlined$viewModel$2.INSTANCE);
    }

    /* renamed from: a */
    public static Resources m135121a(ApplyGroupMemberLimitActivity applyGroupMemberLimitActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applyGroupMemberLimitActivity);
        }
        return applyGroupMemberLimitActivity.mo128299c();
    }

    /* renamed from: c */
    public static AssetManager m135124c(ApplyGroupMemberLimitActivity applyGroupMemberLimitActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applyGroupMemberLimitActivity);
        }
        return applyGroupMemberLimitActivity.mo128302e();
    }

    /* renamed from: b */
    public static void m135123b(ApplyGroupMemberLimitActivity applyGroupMemberLimitActivity) {
        applyGroupMemberLimitActivity.mo128301d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ApplyGroupMemberLimitActivity applyGroupMemberLimitActivity2 = applyGroupMemberLimitActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    applyGroupMemberLimitActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        Constructor<T> constructor = cls.getConstructor(Chat.class);
        Object[] objArr = new Object[1];
        Chat chat = this.f89780b;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        objArr[0] = chat;
        return constructor.newInstance(objArr);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_apply_member_limit);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            serializable = extras.getSerializable("applyGroupMemberLimitActivity:key:chat");
        } else {
            serializable = null;
        }
        Chat chat = (Chat) serializable;
        if (chat == null) {
            Log.m165389i(this.TAG, "onCreate: initSelf: current chat is null, now finish self.");
            finish();
            return;
        }
        this.f89780b = chat;
        Log.m165389i("ApplyGroupMemberLimitActivity", "onCreate: viewModel created");
        m135125f().fetchApprovalSettingInfo();
        ChatSettingHitPointNew.m136651m();
    }

    /* renamed from: a */
    public static void m135122a(ApplyGroupMemberLimitActivity applyGroupMemberLimitActivity, Context context) {
        applyGroupMemberLimitActivity.mo128298a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applyGroupMemberLimitActivity);
        }
    }

    /* renamed from: a */
    public static Context m135120a(ApplyGroupMemberLimitActivity applyGroupMemberLimitActivity, Configuration configuration) {
        Context a = applyGroupMemberLimitActivity.mo128297a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }
}
