package com.ss.android.lark.moments.impl.common.widget.keyboard.identity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.moments.v1.AnonymityLimitation;
import com.bytedance.lark.pb.moments.v1.AnonymityPolicy;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsIdentityDependency;
import com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\nH\u0016J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\u0006\u0010#\u001a\u00020\u0018J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0010H\u0016J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\nJ\u0006\u0010)\u001a\u00020\u0018J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\u0006\u0010,\u001a\u00020\u0018J\u000e\u0010-\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u000200J\u001e\u0010.\u001a\u00020\u00182\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202J\u0006\u00105\u001a\u00020\u0018J\u0006\u00106\u001a\u00020\u0018J\u0006\u00107\u001a\u00020\u0018R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectorPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin;", "keyBoardDependency", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsKeyboardManagerDependency;", "dependency", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsIdentityDependency;", "(Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsKeyboardManagerDependency;Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsIdentityDependency;)V", "activity", "Landroid/app/Activity;", "categoryEnableAnonymous", "", "getDependency", "()Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsIdentityDependency;", "forceDisable", "hasQuota", "pluginContext", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;", "rootView", "Landroid/view/View;", "scope", "Lcom/bytedance/lark/pb/moments/v1/AnonymityPolicy$Scope;", "visibility", "", "collapse", "", "getLayoutId", "initIdentity", "onCreateView", "parent", "Landroid/view/ViewGroup;", "onDestroy", "onEnableChanged", "enable", "onInitView", "onStop", "pop", "refreshHasQuota", "setAdditionSupportContext", "context", "setCategoryEnableAnonymous", "enableAnonymous", "setForceDisableAnonymous", "setRealIdentity", "setVisibility", "showAnonymousIdentity", "showNicknameEntrance", "showNicknameIdentity", "nicknameUser", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "name", "", "avatarKey", "userId", "switchToAnonymous", "switchToNickname", "switchToRealIdentity", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.e */
public final class MomentsIdentitySelectorPlugin implements IInputSupportAdditionPlugin {

    /* renamed from: a */
    private IInputSupportAdditionPlugin.IAdditionSupportContext f119359a;

    /* renamed from: b */
    private View f119360b;

    /* renamed from: c */
    private int f119361c;

    /* renamed from: d */
    private boolean f119362d = true;

    /* renamed from: e */
    private boolean f119363e;

    /* renamed from: f */
    private AnonymityPolicy.Scope f119364f;

    /* renamed from: g */
    private boolean f119365g;

    /* renamed from: h */
    private Activity f119366h;

    /* renamed from: i */
    private final IMomentsKeyboardManagerDependency f119367i;

    /* renamed from: j */
    private final IMomentsIdentityDependency f119368j;

    /* renamed from: m */
    private final void m187425m() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public int mo102073a() {
        return R.layout.moments_publish_identity_selector;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: b */
    public void mo102080b() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: c */
    public void mo102082c() {
    }

    /* renamed from: k */
    public final IMomentsIdentityDependency mo166333k() {
        return this.f119368j;
    }

    /* renamed from: h */
    public final void mo166330h() {
        IInputSupportAdditionPlugin.IAdditionSupportContext aVar = this.f119359a;
        if (aVar != null) {
            aVar.mo146897a();
        }
    }

    /* renamed from: i */
    public final void mo166331i() {
        IInputSupportAdditionPlugin.IAdditionSupportContext aVar = this.f119359a;
        if (aVar != null) {
            aVar.mo146899b();
        }
    }

    /* renamed from: j */
    public final void mo166332j() {
        this.f119365g = true;
        m187425m();
    }

    /* renamed from: d */
    public final void mo166326d() {
        View view = this.f119360b;
        if (view != null) {
            View findViewById = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "anonymousIdentity");
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "anonymousIdentity.icon");
            imageView.setVisibility(0);
            View findViewById2 = view.findViewById(R.id.realIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "realIdentity");
            ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "realIdentity.icon");
            imageView2.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo166327e() {
        View view = this.f119360b;
        if (view != null) {
            View findViewById = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "anonymousIdentity");
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "anonymousIdentity.icon");
            imageView.setVisibility(0);
            View findViewById2 = view.findViewById(R.id.realIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "realIdentity");
            ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "realIdentity.icon");
            imageView2.setVisibility(8);
        }
    }

    /* renamed from: l */
    private final void m187424l() {
        View view = this.f119360b;
        if (view != null) {
            View findViewById = view.findViewById(R.id.realIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.realIdentity");
            TextView textView = (TextView) findViewById.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.realIdentity.name");
            textView.setText(UIUtils.getString(view.getContext(), R.string.Lark_Community_RealNameIs) + MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144689b());
            int dp2px = UIUtils.dp2px(view.getContext(), 48.0f);
            IRequestCreator override = ImageLoader.with(view.getContext()).load(AvatarImage.Builder.obtain(MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144690c(), MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144688a(), dp2px, dp2px).build()).placeholder(new ColorDrawable(UIUtils.getColor(view.getContext(), R.color.bg_filler))).override(dp2px, dp2px);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(rootVie…e(avatarSize, avatarSize)");
            IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null);
            View findViewById2 = view.findViewById(R.id.realIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.realIdentity");
            a.into((LKUIRoundedImageView2) findViewById2.findViewById(R.id.avatar));
            View findViewById3 = view.findViewById(R.id.realIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.realIdentity");
            ImageView imageView = (ImageView) findViewById3.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.realIdentity.icon");
            imageView.setVisibility(0);
            view.findViewById(R.id.realIdentity).setOnClickListener(new C47319a(this, view));
        }
    }

    /* renamed from: f */
    public final void mo166328f() {
        View view = this.f119360b;
        if (view != null) {
            View findViewById = view.findViewById(R.id.realIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "realIdentity");
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "realIdentity.icon");
            imageView.setVisibility(0);
            View rootView = view.getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
            View findViewById2 = rootView.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.anonymousIdentity");
            TextView textView = (TextView) findViewById2.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.anonymousIdentity.name");
            CharSequence text = textView.getText();
            StringBuilder sb = new StringBuilder();
            View rootView2 = view.getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView2, "rootView");
            sb.append(UIUtils.getString(rootView2.getContext(), R.string.Lark_Community_NicknameIs));
            View rootView3 = view.getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView3, "rootView");
            sb.append(UIUtils.getString(rootView3.getContext(), R.string.Lark_Community_GoPickNickname));
            if (!Intrinsics.areEqual(text, sb.toString())) {
                View findViewById3 = view.findViewById(R.id.anonymousIdentity);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "anonymousIdentity");
                ImageView imageView2 = (ImageView) findViewById3.findViewById(R.id.icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "anonymousIdentity.icon");
                imageView2.setVisibility(8);
            }
        }
    }

    /* renamed from: g */
    public final void mo166329g() {
        View view = this.f119360b;
        if (view != null) {
            View findViewById = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.anonymousIdentity");
            TextView textView = (TextView) findViewById.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.anonymousIdentity.name");
            textView.setText(UIUtils.getString(view.getContext(), R.string.Lark_Community_AnonymousIs) + UIUtils.getString(view.getContext(), R.string.Lark_Community_AnonymousUser));
            int dp2px = UIUtils.dp2px(view.getContext(), 48.0f);
            String c = UserGlobalConfigAndSettingsManager.f120180a.mo167302c();
            IRequestCreator override = ImageLoader.with(view.getContext()).load(AvatarImage.Builder.obtain(c, "", dp2px, dp2px).build()).placeholder(new ColorDrawable(UIUtils.getColor(view.getContext(), R.color.bg_filler))).override(dp2px, dp2px);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(rootVie…e(avatarSize, avatarSize)");
            IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null);
            View findViewById2 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.anonymousIdentity");
            a.into((LKUIRoundedImageView2) findViewById2.findViewById(R.id.avatar));
            View findViewById3 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.anonymousIdentity");
            ((ImageView) findViewById3.findViewById(R.id.icon)).setImageDrawable(UIUtils.getDrawable(view.getContext(), R.drawable.ud_icon_list_check_colorful));
            View findViewById4 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.anonymousIdentity");
            TextView textView2 = (TextView) findViewById4.findViewById(R.id.tip);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.anonymousIdentity.tip");
            textView2.setText(UIUtils.getString(view.getContext(), R.string.Lark_Community_AnonymousUplimitReachedDesc));
            view.findViewById(R.id.anonymousIdentity).setOnClickListener(new C47320b(this, view, c));
            mo166325c(this.f119362d);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public void mo102078a(IInputSupportAdditionPlugin.IAdditionSupportContext aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        this.f119359a = aVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public void mo102079a(boolean z) {
        View view = this.f119360b;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final void mo166322a(MomentUser momentUser) {
        Intrinsics.checkParameterIsNotNull(momentUser, "nicknameUser");
        String str = momentUser.name;
        Intrinsics.checkExpressionValueIsNotNull(str, "nicknameUser.name");
        String str2 = momentUser.avatar_key;
        Intrinsics.checkExpressionValueIsNotNull(str2, "nicknameUser.avatar_key");
        String str3 = momentUser.user_id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "nicknameUser.user_id");
        mo166323a(str, str2, str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectorPlugin$showNicknameEntrance$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.e$c */
    public static final class C47321c extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsIdentitySelectorPlugin f119374a;

        /* renamed from: b */
        final /* synthetic */ View f119375b;

        /* renamed from: c */
        final /* synthetic */ Activity f119376c;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            KeyboardUtils.hideKeyboard(this.f119375b.getContext());
            this.f119374a.mo166331i();
            this.f119376c.startActivityForResult(new Intent(this.f119375b.getContext(), NickIdentityChooseActivity.class), 15619);
        }

        C47321c(MomentsIdentitySelectorPlugin eVar, View view, Activity activity) {
            this.f119374a = eVar;
            this.f119375b = view;
            this.f119376c = activity;
        }
    }

    /* renamed from: b */
    public final void mo166324b(boolean z) {
        this.f119363e = z;
        if (this.f119365g) {
            m187425m();
        } else if (this.f119364f == AnonymityPolicy.Scope.GLOBAL || (this.f119364f == AnonymityPolicy.Scope.CATEGORY && z)) {
            m187425m();
        } else {
            m187425m();
            mo166331i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectorPlugin$setRealIdentity$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.e$a */
    public static final class C47319a extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsIdentitySelectorPlugin f119369a;

        /* renamed from: b */
        final /* synthetic */ View f119370b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            if (IMomentsIdentityDependency.C47314a.m187387a(this.f119369a.mo166333k(), MomentsPublishViewModel.IdentityType.NORMAL, null, null, null, 14, null)) {
                View findViewById = this.f119370b.findViewById(R.id.realIdentity);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.realIdentity");
                ImageView imageView = (ImageView) findViewById.findViewById(R.id.icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.realIdentity.icon");
                imageView.setVisibility(0);
                View findViewById2 = this.f119370b.findViewById(R.id.anonymousIdentity);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.anonymousIdentity");
                ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.anonymousIdentity.icon");
                imageView2.setVisibility(8);
                this.f119369a.mo166331i();
            }
        }

        C47319a(MomentsIdentitySelectorPlugin eVar, View view) {
            this.f119369a = eVar;
            this.f119370b = view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectorPlugin$showAnonymousIdentity$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.e$b */
    public static final class C47320b extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsIdentitySelectorPlugin f119371a;

        /* renamed from: b */
        final /* synthetic */ View f119372b;

        /* renamed from: c */
        final /* synthetic */ String f119373c;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            if (this.f119371a.mo166333k().mo166297a(MomentsPublishViewModel.IdentityType.ANONYMOUS, UIUtils.getString(this.f119372b.getContext(), R.string.Lark_Community_AnonymousUser), this.f119373c, "")) {
                View findViewById = this.f119372b.findViewById(R.id.anonymousIdentity);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.anonymousIdentity");
                ImageView imageView = (ImageView) findViewById.findViewById(R.id.icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.anonymousIdentity.icon");
                imageView.setVisibility(0);
                View findViewById2 = this.f119372b.findViewById(R.id.realIdentity);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.realIdentity");
                ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.realIdentity.icon");
                imageView2.setVisibility(8);
                this.f119371a.mo166331i();
            }
        }

        C47320b(MomentsIdentitySelectorPlugin eVar, View view, String str) {
            this.f119371a = eVar;
            this.f119372b = view;
            this.f119373c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectorPlugin$showNicknameIdentity$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.e$d */
    public static final class C47322d extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsIdentitySelectorPlugin f119377a;

        /* renamed from: b */
        final /* synthetic */ String f119378b;

        /* renamed from: c */
        final /* synthetic */ String f119379c;

        /* renamed from: d */
        final /* synthetic */ String f119380d;

        /* renamed from: e */
        final /* synthetic */ View f119381e;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            if (this.f119377a.mo166333k().mo166297a(MomentsPublishViewModel.IdentityType.NICKNAME, this.f119378b, this.f119379c, this.f119380d)) {
                View findViewById = this.f119381e.findViewById(R.id.anonymousIdentity);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.anonymousIdentity");
                ImageView imageView = (ImageView) findViewById.findViewById(R.id.icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.anonymousIdentity.icon");
                imageView.setVisibility(0);
                View findViewById2 = this.f119381e.findViewById(R.id.realIdentity);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.realIdentity");
                ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.realIdentity.icon");
                imageView2.setVisibility(8);
                this.f119377a.mo166331i();
            }
        }

        C47322d(MomentsIdentitySelectorPlugin eVar, String str, String str2, String str3, View view) {
            this.f119377a = eVar;
            this.f119378b = str;
            this.f119379c = str2;
            this.f119380d = str3;
            this.f119381e = view;
        }
    }

    /* renamed from: b */
    private final void m187423b(Activity activity) {
        AnonymityLimitation.Type type;
        boolean z;
        AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
        if (b != null) {
            MomentUser d = UserGlobalConfigAndSettingsManager.f120180a.mo167303d();
            if (this.f119365g) {
                m187425m();
                return;
            }
            boolean areEqual = Intrinsics.areEqual((Object) b.enabled, (Object) true);
            AnonymityLimitation anonymityLimitation = b.limitation;
            if (anonymityLimitation != null) {
                type = anonymityLimitation.type;
            } else {
                type = null;
            }
            if (type == AnonymityLimitation.Type.NO_LIMITATION) {
                z = true;
            } else {
                z = false;
            }
            AnonymityPolicy.AnonymousType anonymousType = b.type;
            this.f119364f = b.scope;
            if (!areEqual) {
                m187425m();
                return;
            }
            if (anonymousType != null) {
                int i = C47323f.f119382a[anonymousType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        mo166329g();
                    }
                } else if (d == null) {
                    mo166321a(activity);
                } else {
                    mo166322a(d);
                }
                this.f119367i.mo166300a(z);
                if (this.f119364f == AnonymityPolicy.Scope.GLOBAL || (this.f119364f == AnonymityPolicy.Scope.CATEGORY && this.f119363e)) {
                    m187425m();
                    return;
                } else {
                    m187425m();
                    return;
                }
            }
            m187425m();
            return;
        }
        mo166331i();
        m187425m();
    }

    /* renamed from: a */
    public final void mo166321a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        View view = this.f119360b;
        if (view != null) {
            int dp2px = UIUtils.dp2px(view.getContext(), 48.0f);
            IRequestCreator override = ImageLoader.with(view.getContext()).load(new ColorDrawable(UIUtils.getColor(view.getContext(), R.color.ud_N300))).override(dp2px, dp2px);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(rootVie…e(avatarSize, avatarSize)");
            IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null);
            View findViewById = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.anonymousIdentity");
            a.into((LKUIRoundedImageView2) findViewById.findViewById(R.id.avatar));
            View findViewById2 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.anonymousIdentity");
            TextView textView = (TextView) findViewById2.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.anonymousIdentity.name");
            textView.setText(UIUtils.getString(view.getContext(), R.string.Lark_Community_NicknameIs) + UIUtils.getString(view.getContext(), R.string.Lark_Community_GoPickNickname));
            View findViewById3 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.anonymousIdentity");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
            ((ImageView) findViewById3.findViewById(R.id.icon)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_right_outlined, UIUtils.getColor(view.getContext(), R.color.icon_n3)));
            View findViewById4 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.anonymousIdentity");
            ImageView imageView = (ImageView) findViewById4.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.anonymousIdentity.icon");
            imageView.setVisibility(0);
            view.findViewById(R.id.anonymousIdentity).setOnClickListener(new C47321c(this, view, activity));
        }
    }

    /* renamed from: c */
    public final void mo166325c(boolean z) {
        this.f119362d = z;
        View view = this.f119360b;
        if (view != null) {
            if (!z) {
                View findViewById = view.findViewById(R.id.anonymousIdentity);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.anonymousIdentity");
                TextView textView = (TextView) findViewById.findViewById(R.id.name);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.anonymousIdentity.name");
                CharSequence text = textView.getText();
                if (!Intrinsics.areEqual(text, UIUtils.getString(view.getContext(), R.string.Lark_Community_NicknameIs) + UIUtils.getString(view.getContext(), R.string.Lark_Community_GoPickNickname))) {
                    View findViewById2 = view.findViewById(R.id.anonymousIdentity);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.anonymousIdentity");
                    TextView textView2 = (TextView) findViewById2.findViewById(R.id.tip);
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.anonymousIdentity.tip");
                    textView2.setVisibility(0);
                    View findViewById3 = view.findViewById(R.id.anonymousIdentity);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.anonymousIdentity");
                    ((TextView) findViewById3.findViewById(R.id.name)).setTextColor(UIUtils.getColor(view.getContext(), R.color.text_disable));
                    View findViewById4 = view.findViewById(R.id.anonymousIdentity);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.anonymousIdentity");
                    LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) findViewById4.findViewById(R.id.avatar);
                    Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "rootView.anonymousIdentity.avatar");
                    lKUIRoundedImageView2.setAlpha(0.5f);
                    View findViewById5 = view.findViewById(R.id.anonymousIdentity);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.anonymousIdentity");
                    findViewById5.setEnabled(false);
                    View findViewById6 = view.findViewById(R.id.anonymousIdentity);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.anonymousIdentity");
                    findViewById6.setClickable(false);
                    return;
                }
            }
            View findViewById7 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.anonymousIdentity");
            TextView textView3 = (TextView) findViewById7.findViewById(R.id.tip);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.anonymousIdentity.tip");
            textView3.setVisibility(8);
            View findViewById8 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.anonymousIdentity");
            ((TextView) findViewById8.findViewById(R.id.name)).setTextColor(UIUtils.getColor(view.getContext(), R.color.text_title));
            View findViewById9 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.anonymousIdentity");
            LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) findViewById9.findViewById(R.id.avatar);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "rootView.anonymousIdentity.avatar");
            lKUIRoundedImageView22.setAlpha(1.0f);
            View findViewById10 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.anonymousIdentity");
            findViewById10.setEnabled(true);
            View findViewById11 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.anonymousIdentity");
            findViewById11.setClickable(true);
        }
    }

    public MomentsIdentitySelectorPlugin(IMomentsKeyboardManagerDependency bVar, IMomentsIdentityDependency aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "keyBoardDependency");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f119367i = bVar;
        this.f119368j = aVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public View mo102075a(Activity activity, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f119366h = activity;
        View inflate = LayoutInflater.from(activity).inflate(mo102073a(), viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "contentView");
        return mo102074a(activity, inflate);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public View mo102074a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f119360b = view;
        view.setVisibility(this.f119361c);
        TextView textView = (TextView) view.findViewById(R.id.tvTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.tvTitle");
        textView.setText(FakeBoldSpan.f119246a.mo166167a(UIUtils.getString(view.getContext(), R.string.Lark_Community_SelectPostIdentity)));
        m187424l();
        m187423b(activity);
        IInputSupportAdditionPlugin.IAdditionSupportContext aVar = this.f119359a;
        if (aVar != null) {
            aVar.mo146899b();
        }
        return view;
    }

    /* renamed from: a */
    public final void mo166323a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str3, "userId");
        View view = this.f119360b;
        if (view != null) {
            View findViewById = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.anonymousIdentity");
            TextView textView = (TextView) findViewById.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.anonymousIdentity.name");
            textView.setText(UIUtils.getString(view.getContext(), R.string.Lark_Community_NicknameIs) + str);
            int dp2px = UIUtils.dp2px(view.getContext(), 48.0f);
            IRequestCreator override = ImageLoader.with(view.getContext()).load(AvatarImage.Builder.obtain(str2, str3, dp2px, dp2px).build()).placeholder(new ColorDrawable(UIUtils.getColor(view.getContext(), R.color.bg_filler))).override(dp2px, dp2px);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(rootVie…e(avatarSize, avatarSize)");
            IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null);
            View findViewById2 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.anonymousIdentity");
            a.into((LKUIRoundedImageView2) findViewById2.findViewById(R.id.avatar));
            View findViewById3 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.anonymousIdentity");
            ((ImageView) findViewById3.findViewById(R.id.icon)).setImageDrawable(UIUtils.getDrawable(view.getContext(), R.drawable.ud_icon_list_check_colorful));
            View findViewById4 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.anonymousIdentity");
            ImageView imageView = (ImageView) findViewById4.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.anonymousIdentity.icon");
            imageView.setVisibility(8);
            View findViewById5 = view.findViewById(R.id.anonymousIdentity);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.anonymousIdentity");
            TextView textView2 = (TextView) findViewById5.findViewById(R.id.tip);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.anonymousIdentity.tip");
            textView2.setText(UIUtils.getString(view.getContext(), R.string.Lark_Community_NicknameUplimitReachedDesc));
            mo166325c(this.f119362d);
            view.findViewById(R.id.anonymousIdentity).setOnClickListener(new C47322d(this, str, str2, str3, view));
        }
    }
}
