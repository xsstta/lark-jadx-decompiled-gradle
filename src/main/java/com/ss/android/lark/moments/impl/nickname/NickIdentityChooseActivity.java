package com.ss.android.lark.moments.impl.nickname;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.SpinDrawableUtils;
import com.ss.android.lark.pb.moments_entities.AnonymousNickname;
import com.ss.android.lark.pb.moments_entities.MomentUser;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ss/android/lark/moments/impl/nickname/NickIdentityChooseActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "avatarSpinDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getAvatarSpinDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "avatarSpinDrawable$delegate", "Lkotlin/Lazy;", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialogBuilder;", "getDialog", "()Lcom/larksuite/component/universe_design/dialog/UDDialogBuilder;", "dialog$delegate", "nameSpinDrawable", "getNameSpinDrawable", "nameSpinDrawable$delegate", "vm", "Lcom/ss/android/lark/moments/impl/nickname/NickIdentityChooseViewModel;", "getVm", "()Lcom/ss/android/lark/moments/impl/nickname/NickIdentityChooseViewModel;", "vm$delegate", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "getRefreshDrawable", "Landroid/graphics/drawable/Drawable;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showConfirmDialog", "name", "", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NickIdentityChooseActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f120337a = new Companion(null);

    /* renamed from: b */
    private final Lazy f120338b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(NickIdentityChooseViewModel.class), new NickIdentityChooseActivity$$special$$inlined$viewModels$2(this), new NickIdentityChooseActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: c */
    private final Lazy f120339c = LazyKt.lazy(new C47760c(this));

    /* renamed from: d */
    private final Lazy f120340d = LazyKt.lazy(new C47761d(this));

    /* renamed from: e */
    private final Lazy f120341e = LazyKt.lazy(new C47759b(this));

    /* renamed from: f */
    private HashMap f120342f;

    /* renamed from: h */
    private final UDDialogBuilder m188816h() {
        return (UDDialogBuilder) this.f120339c.getValue();
    }

    /* renamed from: a */
    public Context mo167457a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo167458a(int i) {
        if (this.f120342f == null) {
            this.f120342f = new HashMap();
        }
        View view = (View) this.f120342f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f120342f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final NickIdentityChooseViewModel mo167459a() {
        return (NickIdentityChooseViewModel) this.f120338b.getValue();
    }

    /* renamed from: a */
    public void mo167460a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m188813a(this, context);
    }

    /* renamed from: b */
    public final CircularProgressDrawable mo167462b() {
        return (CircularProgressDrawable) this.f120340d.getValue();
    }

    /* renamed from: c */
    public final CircularProgressDrawable mo167463c() {
        return (CircularProgressDrawable) this.f120341e.getValue();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m188811a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo167466e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo167467f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo167468g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m188815c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m188812a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m188814b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/nickname/NickIdentityChooseActivity$Companion;", "", "()V", "EXTRA_KEY_FROM_REACTION", "", "EXTRA_KEY_NICKNAME_USER", "REQUEST_CODE_SELECT_NICK_NAME", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/dialog/UDDialogBuilder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$c */
    static final class C47760c extends Lambda implements Function0<UDDialogBuilder> {
        final /* synthetic */ NickIdentityChooseActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47760c(NickIdentityChooseActivity nickIdentityChooseActivity) {
            super(0);
            this.this$0 = nickIdentityChooseActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDDialogBuilder invoke() {
            return new UDDialogBuilder(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$b */
    static final class C47759b extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ NickIdentityChooseActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47759b(NickIdentityChooseActivity nickIdentityChooseActivity) {
            super(0);
            this.this$0 = nickIdentityChooseActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CircularProgressDrawable invoke() {
            NickIdentityChooseActivity nickIdentityChooseActivity = this.this$0;
            return SpinDrawableUtils.f119255a.mo166216a(nickIdentityChooseActivity, UIUtils.getColor(nickIdentityChooseActivity, R.color.primary_pri_500), UIUtils.dp2px(nickIdentityChooseActivity, 5.0f), UIUtils.dp2px(nickIdentityChooseActivity, 1.5f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$d */
    static final class C47761d extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ NickIdentityChooseActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47761d(NickIdentityChooseActivity nickIdentityChooseActivity) {
            super(0);
            this.this$0 = nickIdentityChooseActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CircularProgressDrawable invoke() {
            NickIdentityChooseActivity nickIdentityChooseActivity = this.this$0;
            return SpinDrawableUtils.f119255a.mo166216a(nickIdentityChooseActivity, UIUtils.getColor(nickIdentityChooseActivity, R.color.primary_pri_500), UIUtils.dp2px(nickIdentityChooseActivity, 5.0f), UIUtils.dp2px(nickIdentityChooseActivity, 1.5f));
        }
    }

    /* renamed from: d */
    public final Drawable mo167465d() {
        return UDIconUtils.getIconDrawable(this, (int) R.drawable.ud_icon_refresh_outlined, UIHelper.getColor(R.color.primary_pri_500));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/nickname/NickIdentityChooseActivity$onCreate$pullAvatarListener$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$n */
    public static final class C47771n extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120354a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47771n(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120354a = nickIdentityChooseActivity;
        }

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            ((ImageView) this.f120354a.mo167458a(R.id.ivNickAvatarChange)).setImageDrawable(this.f120354a.mo167463c());
            this.f120354a.mo167463c().start();
            this.f120354a.mo167459a().pullNicknameAvatar();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/nickname/NickIdentityChooseActivity$onCreate$pullNicknameClickListener$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$o */
    public static final class C47772o extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120355a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47772o(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120355a = nickIdentityChooseActivity;
        }

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            ((ImageView) this.f120355a.mo167458a(R.id.ivNameChange)).setImageDrawable(this.f120355a.mo167462b());
            this.f120355a.mo167462b().start();
            this.f120355a.mo167459a().pullNicknames();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "user", "Lcom/ss/android/lark/pb/moments_entities/MomentUser;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$k */
    static final class C47768k<T> implements AbstractC1178x<MomentUser> {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120350a;

        C47768k(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120350a = nickIdentityChooseActivity;
        }

        /* renamed from: a */
        public final void onChanged(MomentUser momentUser) {
            NickIdentityChooseActivity nickIdentityChooseActivity = this.f120350a;
            Intent intent = new Intent();
            intent.putExtra("nickname_user", momentUser);
            nickIdentityChooseActivity.setResult(-1, intent);
            this.f120350a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "success", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$l */
    static final class C47769l<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120351a;

        C47769l(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120351a = nickIdentityChooseActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "success");
            if (bool.booleanValue()) {
                LKUIToast.show(this.f120351a, (int) R.string.Lark_Community_NicknameSetAddReactionNowToast);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/nickname/NickIdentityChooseActivity$onCreate$sureAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ViewAction;", "performAction", "", "view", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$p */
    public static final class C47773p extends IActionTitlebar.C57575b {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120356a;

        /* renamed from: b */
        final /* synthetic */ TextView f120357b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            String str;
            super.performAction(view);
            AnonymousNickname selectedAnonymousNickname = this.f120356a.mo167459a().getSelectedAnonymousNickname();
            if (selectedAnonymousNickname != null && (str = selectedAnonymousNickname.mnickname) != null) {
                this.f120356a.mo167461a(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47773p(NickIdentityChooseActivity nickIdentityChooseActivity, TextView textView, View view) {
            super(view);
            this.f120356a = nickIdentityChooseActivity;
            this.f120357b = textView;
        }
    }

    /* renamed from: a */
    public static Resources m188812a(NickIdentityChooseActivity nickIdentityChooseActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(nickIdentityChooseActivity);
        }
        return nickIdentityChooseActivity.mo167466e();
    }

    /* renamed from: c */
    public static AssetManager m188815c(NickIdentityChooseActivity nickIdentityChooseActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(nickIdentityChooseActivity);
        }
        return nickIdentityChooseActivity.mo167468g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "toastStr", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$g */
    static final class C47764g<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120346a;

        C47764g(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120346a = nickIdentityChooseActivity;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                LKUIToast.show(this.f120346a, str);
                return;
            }
            NickIdentityChooseActivity nickIdentityChooseActivity = this.f120346a;
            LKUIToast.show(nickIdentityChooseActivity, UIUtils.getString(nickIdentityChooseActivity, R.string.Lark_Community_UnableSelectNickname));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$h */
    static final class C47765h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120347a;

        C47765h(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120347a = nickIdentityChooseActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                NickIdentityChooseActivity nickIdentityChooseActivity = this.f120347a;
                LKUIToast.show(nickIdentityChooseActivity, UIUtils.getString(nickIdentityChooseActivity, R.string.Lark_Community_LoadingFailed));
                this.f120347a.mo167462b().stop();
                ((ImageView) this.f120347a.mo167458a(R.id.ivNameChange)).setImageDrawable(this.f120347a.mo167465d());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$i */
    static final class C47766i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120348a;

        C47766i(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120348a = nickIdentityChooseActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                NickIdentityChooseActivity nickIdentityChooseActivity = this.f120348a;
                LKUIToast.show(nickIdentityChooseActivity, UIUtils.getString(nickIdentityChooseActivity, R.string.Lark_Community_LoadingFailed));
                this.f120348a.mo167463c().stop();
                ((ImageView) this.f120348a.mo167458a(R.id.ivNickAvatarChange)).setImageDrawable(this.f120348a.mo167465d());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "success", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$j */
    static final class C47767j<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120349a;

        C47767j(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120349a = nickIdentityChooseActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "success");
            if (bool.booleanValue()) {
                LKUIToast.cancelLoading();
                return;
            }
            NickIdentityChooseActivity nickIdentityChooseActivity = this.f120349a;
            LKUIToast.loadFail(nickIdentityChooseActivity, UIUtils.getString(nickIdentityChooseActivity, R.string.Lark_Community_LoadingFailed));
            this.f120349a.finish();
        }
    }

    /* renamed from: b */
    public static void m188814b(NickIdentityChooseActivity nickIdentityChooseActivity) {
        nickIdentityChooseActivity.mo167467f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            NickIdentityChooseActivity nickIdentityChooseActivity2 = nickIdentityChooseActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    nickIdentityChooseActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nameList", "", "Lcom/ss/android/lark/pb/moments_entities/AnonymousNickname;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$e */
    static final class C47762e<T> implements AbstractC1178x<List<? extends AnonymousNickname>> {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120343a;

        /* renamed from: b */
        final /* synthetic */ FlowAdapter f120344b;

        C47762e(NickIdentityChooseActivity nickIdentityChooseActivity, FlowAdapter aVar) {
            this.f120343a = nickIdentityChooseActivity;
            this.f120344b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(List<AnonymousNickname> list) {
            Intrinsics.checkExpressionValueIsNotNull(list, "nameList");
            List<AnonymousNickname> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                String str = t.mnickname_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.mnickname_id");
                String str2 = t.mnickname;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.mnickname");
                Integer num = t.mnickname_idx;
                Intrinsics.checkExpressionValueIsNotNull(num, "it.mnickname_idx");
                arrayList.add(new NicknameItemViewData(str, str2, num.intValue(), false));
            }
            this.f120344b.mo167484a(arrayList);
            this.f120343a.mo167462b().stop();
            ((ImageView) this.f120343a.mo167458a(R.id.ivNameChange)).setImageDrawable(this.f120343a.mo167465d());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "avatarKey", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$f */
    static final class C47763f<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120345a;

        C47763f(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120345a = nickIdentityChooseActivity;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            int dp2px = UIUtils.dp2px(this.f120345a, 72.0f);
            AvatarImage build = AvatarImage.Builder.obtain(str, "", dp2px, dp2px).build();
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) this.f120345a.mo167458a(R.id.avatar);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "avatar");
            ColorDrawable drawable = lKUIRoundedImageView2.getDrawable();
            if (drawable == null) {
                drawable = new ColorDrawable(UIUtils.getColor(this.f120345a, R.color.ud_N300));
            }
            IRequestCreator override = ImageLoader.with(this.f120345a).load(build).placeholder(drawable).override(dp2px, dp2px);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(this).l…    .override(size, size)");
            C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null).into((LKUIRoundedImageView2) this.f120345a.mo167458a(R.id.avatar));
            this.f120345a.mo167463c().stop();
            ((ImageView) this.f120345a.mo167458a(R.id.ivNickAvatarChange)).setImageDrawable(this.f120345a.mo167465d());
        }
    }

    /* renamed from: a */
    public final void mo167461a(String str) {
        UDDialogBuilder h = m188816h();
        String string = UIUtils.getString(this, R.string.Lark_Community_ConfirmNicknameTitle);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(this, …ity_ConfirmNicknameTitle)");
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Community_ConfirmNicknameDesc, "nickname", str);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…meDesc, \"nickname\", name)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) h.title(string)).message(mustacheFormat)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_ConfirmTip, new DialogInterface$OnClickListenerC47774q(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Community_Cancel, DialogInterface$OnClickListenerC47775r.f120359a)).show();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.moments_activity_nick_identity_choose);
        NickIdentityChooseActivity nickIdentityChooseActivity = this;
        if (UDUiModeUtils.m93319a(nickIdentityChooseActivity)) {
            setLightTextStatusBar(UIUtils.getColor(nickIdentityChooseActivity, R.color.bg_float));
        } else {
            setDarkTextStatusBar(UIUtils.getColor(nickIdentityChooseActivity, R.color.bg_float));
        }
        ((CommonTitleBar) mo167458a(R.id.titleBar)).setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        ((CommonTitleBar) mo167458a(R.id.titleBar)).setLeftImageDrawable(null);
        ((CommonTitleBar) mo167458a(R.id.titleBar)).setTitle(FakeBoldSpan.f119246a.mo166167a(UIUtils.getString(nickIdentityChooseActivity, R.string.Lark_Community_SelectNicknameTitle)));
        mo167459a().setFromClickReaction(getIntent().getBooleanExtra("from_click_reaction", false));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        TextView textView = new TextView(nickIdentityChooseActivity);
        textView.setTextSize(1, 16.0f);
        textView.setText(UIHelper.getString(R.string.Lark_Community_SelectNicknameDone));
        textView.setTextColor(UIUtils.getColor(nickIdentityChooseActivity, R.color.text_disable));
        textView.setEnabled(false);
        textView.setClickable(false);
        ((CommonTitleBar) mo167458a(R.id.titleBar)).addAction(new C47773p(this, textView, textView), layoutParams);
        FlowAdapter aVar = new FlowAdapter(new C47770m(this, textView));
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(nickIdentityChooseActivity, 0);
        flexboxLayoutManager.mo72862d(1);
        RecyclerView recyclerView = (RecyclerView) mo167458a(R.id.rvNicknames);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvNicknames");
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = (RecyclerView) mo167458a(R.id.rvNicknames);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvNicknames");
        recyclerView2.setLayoutManager(flexboxLayoutManager);
        C47772o oVar = new C47772o(this);
        ((ImageView) mo167458a(R.id.ivNameChange)).setOnClickListener(oVar);
        ((TextView) mo167458a(R.id.tvNameChange)).setOnClickListener(oVar);
        C47771n nVar = new C47771n(this);
        ((ImageView) mo167458a(R.id.ivNickAvatarChangeBg)).setOnClickListener(nVar);
        ((ImageView) mo167458a(R.id.ivNickAvatarChange)).setOnClickListener(nVar);
        ((ImageView) mo167458a(R.id.ivNickAvatarChangeBg)).setImageDrawable(UIUtils.getDrawable(nickIdentityChooseActivity, R.drawable.moments_refresh_bg_selector));
        NickIdentityChooseActivity nickIdentityChooseActivity2 = this;
        mo167459a().getNicknames().mo5923a(nickIdentityChooseActivity2, new C47762e(this, aVar));
        mo167459a().getNickAvatarKey().mo5923a(nickIdentityChooseActivity2, new C47763f(this));
        mo167459a().getCreateFailToastStr().mo5923a(nickIdentityChooseActivity2, new C47764g(this));
        mo167459a().getNicknamesLoadFail().mo5923a(nickIdentityChooseActivity2, new C47765h(this));
        mo167459a().getNickAvatarLoadFail().mo5923a(nickIdentityChooseActivity2, new C47766i(this));
        mo167459a().getLoadInitDataIsSuccess().mo5923a(nickIdentityChooseActivity2, new C47767j(this));
        mo167459a().getMomentUser().mo5923a(nickIdentityChooseActivity2, new C47768k(this));
        mo167459a().getCreateNicknameUserSuccessFromReaction().mo5923a(nickIdentityChooseActivity2, new C47769l(this));
        LKUIToast.showLoading(nickIdentityChooseActivity, UIUtils.getString(nickIdentityChooseActivity, R.string.Lark_Community_LoadingToast));
        mo167459a().loadInitData();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/nickname/NickIdentityChooseActivity$onCreate$adapter$1", "Lcom/ss/android/lark/moments/impl/nickname/NicknameClickListener;", "onNicknameClicked", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/nickname/NicknameItemViewData;", "isSelect", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$m */
    public static final class C47770m implements NicknameClickListener {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120352a;

        /* renamed from: b */
        final /* synthetic */ TextView f120353b;

        C47770m(NickIdentityChooseActivity nickIdentityChooseActivity, TextView textView) {
            this.f120352a = nickIdentityChooseActivity;
            this.f120353b = textView;
        }

        @Override // com.ss.android.lark.moments.impl.nickname.NicknameClickListener
        /* renamed from: a */
        public void mo167478a(NicknameItemViewData dVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            NickIdentityChooseActivity nickIdentityChooseActivity = this.f120352a;
            if (z) {
                TextView textView = (TextView) nickIdentityChooseActivity.mo167458a(R.id.name);
                Intrinsics.checkExpressionValueIsNotNull(textView, "name");
                textView.setText(FakeBoldSpan.f119246a.mo166167a(dVar.mo167503b()));
                NickIdentityChooseActivity nickIdentityChooseActivity2 = nickIdentityChooseActivity;
                ((TextView) this.f120352a.mo167458a(R.id.name)).setTextColor(UIUtils.getColor(nickIdentityChooseActivity2, R.color.text_title));
                this.f120352a.mo167459a().setSelectedName(dVar);
                this.f120353b.setTextColor(UIUtils.getColor(nickIdentityChooseActivity2, R.color.primary_pri_500));
                this.f120353b.setEnabled(true);
                this.f120353b.setClickable(true);
                return;
            }
            TextView textView2 = (TextView) nickIdentityChooseActivity.mo167458a(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "name");
            NickIdentityChooseActivity nickIdentityChooseActivity3 = nickIdentityChooseActivity;
            textView2.setText(FakeBoldSpan.f119246a.mo166167a(UIUtils.getString(nickIdentityChooseActivity3, R.string.Lark_Community_SelectNicknameDesc)));
            ((TextView) this.f120352a.mo167458a(R.id.name)).setTextColor(UIUtils.getColor(nickIdentityChooseActivity3, R.color.text_disable));
            this.f120352a.mo167459a().setSelectedName(null);
            this.f120353b.setTextColor(UIUtils.getColor(nickIdentityChooseActivity3, R.color.text_disable));
            this.f120353b.setEnabled(false);
            this.f120353b.setClickable(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$r */
    public static final class DialogInterface$OnClickListenerC47775r implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC47775r f120359a = new DialogInterface$OnClickListenerC47775r();

        DialogInterface$OnClickListenerC47775r() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity$q */
    public static final class DialogInterface$OnClickListenerC47774q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NickIdentityChooseActivity f120358a;

        DialogInterface$OnClickListenerC47774q(NickIdentityChooseActivity nickIdentityChooseActivity) {
            this.f120358a = nickIdentityChooseActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f120358a.mo167459a().createNickNameUser();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: a */
    public static void m188813a(NickIdentityChooseActivity nickIdentityChooseActivity, Context context) {
        nickIdentityChooseActivity.mo167460a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(nickIdentityChooseActivity);
        }
    }

    /* renamed from: a */
    public static Context m188811a(NickIdentityChooseActivity nickIdentityChooseActivity, Configuration configuration) {
        Context a = nickIdentityChooseActivity.mo167457a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
