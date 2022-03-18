package com.ss.android.lark.keyboard.plugin.input.richtextinput;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.ThreadPhotoKBPlugin;
import com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0016H\u0014J\b\u0010!\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0014J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0018H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\fH\u0016J\u0012\u0010+\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010$H\u0016J\b\u0010-\u001a\u00020.H\u0014J\u0018\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u0018H\u0016J\b\u00102\u001a\u00020\u0016H\u0016J\b\u00103\u001a\u00020\u0016H\u0014J\b\u00104\u001a\u00020\u0016H\u0002J\b\u00105\u001a\u00020\u0016H\u0002J\b\u00106\u001a\u00020\u0016H\u0014J\b\u00107\u001a\u00020\u0016H\u0002J\b\u00108\u001a\u00020\u0016H\u0002J\u0012\u00109\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0002R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006>"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputExpandPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin;", "hint", "", "onSendPostCallback", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "lifeCallback", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;", "(Ljava/lang/CharSequence;Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;)V", "dragShrinkLayout", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/DragShrinkLayout;", "shadowView", "Landroid/view/View;", "statusBarColor", "", "visibleKeyboardPlugins", "", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getVisibleKeyboardPlugins", "()Ljava/util/List;", "changeTitleStyle", "", "isReply", "", "getInputModel", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "getLayoutId", "initDragLayout", "initHint", "initShadowView", "isFullScreen", "notifyContentSend", "onBackPressed", "onChangeToReplyMode", "replyData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "onEditorFocusedAfterResume", "onEnableChanged", "isEnable", "onFinishReplyMode", "onInitView", "rootView", "onResume", "params", "onSaveTitle", "", "onSetDraft", "draft", "append", "onStop", "onTriggerStatusTransform", "sendDragDownShrinkHitPoint", "sendShrinkHitPoint", "setEditTextDisplay", "startHideAnim", "startRichTextShrinkPlugin", "startShowAnim", "updateBackgroundAlpha", "alpha", "", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c */
public final class RichTextInputExpandPlugin extends BaseRichTextInputPlugin {

    /* renamed from: m */
    public static final Companion f103420m = new Companion(null);

    /* renamed from: k */
    public DragShrinkLayout f103421k;

    /* renamed from: l */
    public View f103422l;

    /* renamed from: n */
    private final List<KClass<? extends IKeyBoardPlugin>> f103423n;

    /* renamed from: o */
    private int f103424o;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$b */
    public static final class View$OnClickListenerC40714b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC40714b f103425a = new View$OnClickListenerC40714b();

        View$OnClickListenerC40714b() {
        }

        public final void onClick(View view) {
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin, com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: h */
    public boolean mo146903h() {
        return true;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: i */
    public int mo147089i() {
        return R.layout.kb_input_richtext_expand;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputExpandPlugin$Companion;", "", "()V", "ANIMATION_DURATION", "", "BASE_ALPHA", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: m */
    public IOutInputSupport.InputSupportType mo146905m() {
        return IOutInputSupport.InputSupportType.POSTINPUT;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: v */
    public List<KClass<? extends IKeyBoardPlugin>> mo147061v() {
        return this.f103423n;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputExpandPlugin$initDragLayout$2", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/DragShrinkLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutHideAnimEnd", "onLayoutHideAnimStart", "onLayoutShowAnimEnd", "onLayoutShowAnimStart", "startDrag", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$c */
    public static final class C40715c implements DragShrinkLayout.AbstractC40746a {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f103426a;

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: b */
        public void mo147094b() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: c */
        public void mo147095c() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: e */
        public void mo147097e() {
            this.f103426a.mo147085P();
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: a */
        public void mo147092a() {
            if (KeyboardUtils.isSoftShowing(this.f103426a.mo147030a())) {
                this.f103426a.mo147043b().mo147123b();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: d */
        public void mo147096d() {
            this.f103426a.mo147084O();
            if (KeyboardUtils.isSoftShowing(this.f103426a.mo147030a())) {
                this.f103426a.mo147043b().mo147123b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40715c(RichTextInputExpandPlugin cVar) {
            this.f103426a = cVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: a */
        public void mo147093a(float f, float f2) {
            this.f103426a.mo147086a(((f - f2) / f) * 0.7f);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: A */
    public void mo147016A() {
        super.mo147016A();
        m161071U();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: D */
    public void mo147019D() {
        m161069S();
        m161071U();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: J */
    public void mo147025J() {
        super.mo147025J();
        mo147043b().mo147124c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: K */
    public String mo147026K() {
        if (mo147062w()) {
            return "";
        }
        return super.mo147026K();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin, com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: f */
    public boolean mo146901f() {
        if (!mo147065z()) {
            return false;
        }
        m161071U();
        return true;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: j */
    public void mo147090j() {
        mo147048c(false);
        m161075f(mo147062w());
    }

    /* renamed from: R */
    private final void m161068R() {
        mo147055p().setHint(mo147029N());
        mo147054o().setHint(UIHelper.getString(R.string.Lark_Legacy_PostNoTitleHint));
    }

    /* renamed from: P */
    public final void mo147085P() {
        TransationData k = mo147053k();
        mo147046c(k);
        mo147043b().mo147121a(Reflection.getOrCreateKotlinClass(RichTextInputShrinkPlugin.class), this, k);
    }

    /* renamed from: Q */
    private final void m161067Q() {
        View findViewById = mo147058s().findViewById(R.id.shadow_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.shadow_view)");
        this.f103422l = findViewById;
        if (findViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowView");
        }
        findViewById.getLayoutParams().height = DeviceUtils.getScreenHeight(mo147030a());
        View view = this.f103422l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowView");
        }
        view.setOnClickListener(new View$OnClickListenerC40716d(this));
    }

    /* renamed from: S */
    private final void m161069S() {
        boolean z;
        KeyboardScene f = mo147043b().mo147127f();
        if (C40683h.m160851a(f).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            KeyboardHitPointExtraParams.Click click = KeyboardHitPointExtraParams.Click.FULL_SCREEN;
            TARGET_NONE eVar = TARGET_NONE.f135700a;
            KeyboardHitPointNew.m160872a(C40683h.m160851a(f), C54952a.m213204a(click.plus(eVar).plus(KeyboardHitPointExtraParams.ActionType.CLOSE), C40683h.m160856f(f)));
        }
    }

    /* renamed from: T */
    private final void m161070T() {
        View findViewById = mo147058s().findViewById(R.id.kb_rich_text_shrink_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.…rich_text_shrink_wrapper)");
        DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) findViewById;
        this.f103421k = dragShrinkLayout;
        if (dragShrinkLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragShrinkLayout");
        }
        dragShrinkLayout.setOnClickListener(View$OnClickListenerC40714b.f103425a);
        DragShrinkLayout dragShrinkLayout2 = this.f103421k;
        if (dragShrinkLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragShrinkLayout");
        }
        dragShrinkLayout2.setListener(new C40715c(this));
    }

    /* renamed from: O */
    public final void mo147084O() {
        boolean z;
        KeyboardScene f = mo147043b().mo147127f();
        if (C40683h.m160851a(f).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            KeyboardHitPointExtraParams.Click click = KeyboardHitPointExtraParams.Click.FULL_SCREEN_SLIDE;
            TARGET_NONE eVar = TARGET_NONE.f135700a;
            KeyboardHitPointNew.m160872a(C40683h.m160851a(f), C54952a.m213204a(click.plus(eVar).plus(KeyboardHitPointExtraParams.SlideDirection.DOWN), C40683h.m160856f(f)));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: d */
    public void mo147013d() {
        super.mo147013d();
        mo147058s().setVisibility(8);
        View view = this.f103422l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowView");
        }
        view.setVisibility(8);
        DragShrinkLayout dragShrinkLayout = this.f103421k;
        if (dragShrinkLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragShrinkLayout");
        }
        dragShrinkLayout.setVisibility(8);
    }

    /* renamed from: U */
    private final void m161071U() {
        mo147043b().mo147123b();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, DeviceUtils.getScreenHeight(mo147030a()));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new C40717e(this));
        ofInt.addListener(new C40718f(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.7f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.addUpdateListener(new C40719g(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: E */
    public void mo147020E() {
        C25649b.m91857a(mo147054o(), LarkFont.HEADLINE);
        mo147054o().setEmojiconSize((int) LKUIDisplayManager.m91865a(mo147030a(), LarkFont.HEADLINE));
        C25649b.m91857a(mo147055p(), LarkFont.HEADLINE);
        mo147055p().setEmojiconSize((int) LKUIDisplayManager.m91865a(mo147030a(), LarkFont.HEADLINE));
        mo147055p().setEmojiconTextSize((int) LKUIDisplayManager.m91865a(mo147030a(), LarkFont.HEADLINE));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$d */
    public static final class View$OnClickListenerC40716d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f103427a;

        View$OnClickListenerC40716d(RichTextInputExpandPlugin cVar) {
            this.f103427a = cVar;
        }

        public final void onClick(View view) {
            this.f103427a.mo147019D();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputExpandPlugin$startHideAnim$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$f */
    public static final class C40718f implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f103429a;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40718f(RichTextInputExpandPlugin cVar) {
            this.f103429a = cVar;
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            RichTextInputExpandPlugin.m161072a(this.f103429a).setDragEnabled(false);
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f103429a.mo147086a(BitmapDescriptorFactory.HUE_RED);
            this.f103429a.mo147085P();
            RichTextInputExpandPlugin.m161072a(this.f103429a).setDragEnabled(true);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DragShrinkLayout m161072a(RichTextInputExpandPlugin cVar) {
        DragShrinkLayout dragShrinkLayout = cVar.f103421k;
        if (dragShrinkLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragShrinkLayout");
        }
        return dragShrinkLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m161073b(RichTextInputExpandPlugin cVar) {
        View view = cVar.f103422l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowView");
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$g */
    public static final class C40719g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f103430a;

        C40719g(RichTextInputExpandPlugin cVar) {
            this.f103430a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            RichTextInputExpandPlugin cVar = this.f103430a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                cVar.mo147086a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$h */
    public static final class C40720h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f103431a;

        C40720h(RichTextInputExpandPlugin cVar) {
            this.f103431a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            RichTextInputExpandPlugin cVar = this.f103431a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                cVar.mo147086a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputExpandPlugin$startShowAnim$3", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$j */
    public static final class C40722j implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f103433a;

        /* renamed from: b */
        final /* synthetic */ TransationData f103434b;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f103433a.mo147086a(0.7f);
            RichTextInputExpandPlugin.m161072a(this.f103433a).setDragEnabled(true);
            this.f103433a.mo147049d(this.f103434b);
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            RichTextInputExpandPlugin.m161072a(this.f103433a).setVisibility(0);
            RichTextInputExpandPlugin.m161072a(this.f103433a).setDragEnabled(false);
            RichTextInputExpandPlugin.m161073b(this.f103433a).setVisibility(0);
        }

        C40722j(RichTextInputExpandPlugin cVar, TransationData jVar) {
            this.f103433a = cVar;
            this.f103434b = jVar;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147038a(TransationData jVar) {
        super.mo147038a(jVar);
        mo147058s().setVisibility(0);
        m161075f(mo147062w());
        m161074f(jVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$e */
    public static final class C40717e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f103428a;

        C40717e(RichTextInputExpandPlugin cVar) {
            this.f103428a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout a = RichTextInputExpandPlugin.m161072a(this.f103428a);
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.c$i */
    public static final class C40721i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f103432a;

        C40721i(RichTextInputExpandPlugin cVar) {
            this.f103432a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout a = RichTextInputExpandPlugin.m161072a(this.f103432a);
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: a */
    public void mo147034a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Window window = mo147030a().getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        this.f103424o = window.getStatusBarColor();
        m161070T();
        m161067Q();
        m161068R();
        view.setVisibility(8);
        mo147056q().setVisibility(0);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    public void mo147088b(TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "replyData");
        mo147048c(true);
        m161075f(mo147062w());
        mo147087a(jVar, false);
        CharSequence charSequence = (CharSequence) jVar.mo147174a("reply_data_msgdigest");
        if (charSequence == null) {
        }
        mo147042a(charSequence);
    }

    /* renamed from: f */
    private final void m161074f(TransationData jVar) {
        int screenHeight = DeviceUtils.getScreenHeight(mo147030a());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 0.7f);
        ofFloat.addUpdateListener(new C40720h(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(screenHeight, 0);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C40721i(this));
        ofInt.addListener(new C40722j(this, jVar));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo147086a(float f) {
        int color = UDColorUtils.getColor(mo147030a(), R.color.kb_input_post_mask);
        float alpha = (((float) Color.alpha(color)) * f) / 255.0f;
        float f2 = ((float) 1) - alpha;
        int argb = Color.argb(255, (int) ((((((float) Color.red(this.f103424o)) / 255.0f) * f2) + ((((float) Color.red(color)) / 255.0f) * alpha)) * 255.0f), (int) ((((((float) Color.green(this.f103424o)) / 255.0f) * f2) + ((((float) Color.green(color)) / 255.0f) * alpha)) * 255.0f), (int) ((((((float) Color.blue(this.f103424o)) / 255.0f) * f2) + ((((float) Color.blue(color)) / 255.0f) * alpha)) * 255.0f));
        Window window = mo147030a().getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        window.setStatusBarColor(argb);
        View view = this.f103422l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowView");
        }
        view.setAlpha(f);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    public void mo147011b(boolean z) {
        boolean z2;
        mo147050d(!z);
        boolean z3 = false;
        if (mo147062w()) {
            mo147054o().setEnabled(false);
        } else {
            KeyboardRichTextEditText o = mo147054o();
            if (z || !TextUtils.isEmpty(mo147054o().getText())) {
                z2 = true;
            } else {
                z2 = false;
            }
            o.setEnabled(z2);
        }
        KeyboardRichTextEditText p = mo147055p();
        if (z || !TextUtils.isEmpty(mo147055p().getText())) {
            z3 = true;
        }
        p.setEnabled(z3);
        View r = mo147057r();
        Editable text = mo147055p().getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "contentET.text");
        r.setEnabled(!TextUtils.isEmpty(StringsKt.trim(text)));
    }

    /* renamed from: f */
    private final void m161075f(boolean z) {
        if (z) {
            mo147054o().setEnabled(false);
            mo147054o().setTextColor(C57582a.m223616d(mo147055p().getContext(), R.color.text_placeholder));
            return;
        }
        mo147054o().setEnabled(!mo147063x());
        mo147054o().setTextColor(C57582a.m223616d(mo147055p().getContext(), R.color.text_title));
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147087a(TransationData jVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(jVar, "draft");
        RichText richText = (RichText) jVar.mo147174a("draft_msg_richtext");
        if (richText != null) {
            mo147041a(richText);
            return;
        }
        String str = (String) jVar.mo147174a("draft_post_title");
        if (str == null) {
            str = "";
        }
        RichText richText2 = (RichText) jVar.mo147174a("draft_post_reichtext");
        if (richText2 == null) {
            richText2 = C59029c.m229155a();
        }
        if (z) {
            if (!mo147062w()) {
                mo147054o().append(str);
            }
            C59033g.m229199b(richText2, mo147055p().getRichTextRender());
            return;
        }
        if (!mo147062w() || !TextUtils.isEmpty(str)) {
            mo147042a(str);
        }
        mo147041a(richText2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichTextInputExpandPlugin(CharSequence charSequence, OnSendRichTextCallBack bVar, BaseRichTextInputPlugin.LifeCycleCallback bVar2) {
        super(charSequence, bVar, bVar2);
        Intrinsics.checkParameterIsNotNull(charSequence, "hint");
        Intrinsics.checkParameterIsNotNull(bVar, "onSendPostCallback");
        this.f103423n = CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(AaStyleKBPlugin.class), Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(ThreadPhotoKBPlugin.class)});
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RichTextInputExpandPlugin(CharSequence charSequence, OnSendRichTextCallBack bVar, BaseRichTextInputPlugin.LifeCycleCallback bVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, bVar, (i & 4) != 0 ? null : bVar2);
    }
}
