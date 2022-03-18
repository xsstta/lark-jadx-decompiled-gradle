package com.ss.android.lark.keyboard.plugin.input.richtextinput;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnLifeKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.ThreadPhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.uploadlog.UploadLogKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.linked_emojicon.C58507d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.listener.OnSizeChangeListener;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 @2\u00020\u0001:\u0001@B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0014J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H\u0016J\u0012\u0010/\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010'H\u0016J\u0018\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u000bH\u0016J\b\u00104\u001a\u00020\u0005H\u0014J\b\u00105\u001a\u00020\u001eH\u0016J\b\u00106\u001a\u00020\u001eH\u0014J\b\u00107\u001a\u00020\u001eH\u0002J\u0010\u00108\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u00108\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\b\u00109\u001a\u00020\u001eH\u0014J\u000e\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u0011J\u000e\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u000bJ\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\u0003H\u0002R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00190\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006A"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputShrinkPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin;", "hint", "", "hintColor", "", "sendPostCallback", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "lifeCallback", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;", "isSecretChat", "", "(Ljava/lang/CharSequence;ILcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;Z)V", "closeReplyBtn", "Landroid/widget/ImageView;", "isReplyViewVisible", "replyCloseBtListener", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$OnClickReplyCloseBtListener;", "replyContentRegion", "Landroid/widget/LinearLayout;", "replyRegion", "rootMsgTV", "Lcom/ss/android/lark/widget/EllipsizedEmojiconTextView;", "visibleKeyboardPlugins", "", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getVisibleKeyboardPlugins", "()Ljava/util/List;", "changeTitleVisibilityIfNeed", "", "getInputModel", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "getLayoutId", "initContentET", "initHint", "initReplyRegion", "onChangeToReplyMode", "replyData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "onDestroy", "onEnableChanged", "isEnable", "onFinishReplyMode", "onInitView", "rootView", "Landroid/view/View;", "onResume", "params", "onSetDraft", "draft", "append", "onSetDraftImageSize", "onStop", "onTriggerStatusTransform", "sendExpandHitPoint", "setContentHint", "setEditTextDisplay", "setOnClickReplyCloseBtListener", "listener", "setReplyViewVisible", "visible", "showReplyView", "msgDigest", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.a.d */
public final class RichTextInputShrinkPlugin extends BaseRichTextInputPlugin {

    /* renamed from: n */
    public static final Companion f103435n = new Companion(null);

    /* renamed from: k */
    public LinearLayout f103436k;

    /* renamed from: l */
    public EllipsizedEmojiconTextView f103437l;

    /* renamed from: m */
    public TextInputSupportPlugin.OnClickReplyCloseBtListener f103438m;

    /* renamed from: o */
    private LinearLayout f103439o;

    /* renamed from: p */
    private ImageView f103440p;

    /* renamed from: q */
    private boolean f103441q;

    /* renamed from: r */
    private final List<KClass<? extends IKeyBoardPlugin>> f103442r;

    /* renamed from: s */
    private int f103443s;

    /* renamed from: t */
    private final boolean f103444t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.d$d */
    static final class View$OnClickListenerC40725d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC40725d f103447a = new View$OnClickListenerC40725d();

        View$OnClickListenerC40725d() {
        }

        public final void onClick(View view) {
        }
    }

    public RichTextInputShrinkPlugin(CharSequence charSequence, int i, OnSendRichTextCallBack bVar, BaseRichTextInputPlugin.LifeCycleCallback bVar2) {
        this(charSequence, i, bVar, bVar2, false, 16, null);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: i */
    public int mo147089i() {
        return R.layout.kb_input_richtext_shrink;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputShrinkPlugin$Companion;", "", "()V", "IMAGE_SIZE", "", "MAX_KEYBOARD_HEIGHT", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.d$a */
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
        return IOutInputSupport.InputSupportType.TEXTINPUT;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: v */
    public List<KClass<? extends IKeyBoardPlugin>> mo147061v() {
        return this.f103442r;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: F */
    public int mo147021F() {
        return UIHelper.dp2px(80.0f);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: d */
    public void mo147013d() {
        super.mo147013d();
        mo147043b().mo147123b();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: e */
    public void mo147014e() {
        super.mo147014e();
        mo147043b().mo147123b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: D */
    public void mo147019D() {
        m161104Q();
        TransationData k = mo147053k();
        mo147046c(k);
        mo147043b().mo147121a(Reflection.getOrCreateKotlinClass(RichTextInputExpandPlugin.class), this, k);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: j */
    public void mo147090j() {
        if (mo147062w()) {
            mo147048c(false);
            LinearLayout linearLayout = this.f103436k;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("replyRegion");
            }
            linearLayout.setVisibility(8);
            mo147018C();
        }
    }

    /* renamed from: P */
    private final void m161103P() {
        mo147054o().setHint(UIHelper.getString(R.string.Lark_Legacy_PostNoTitleHint));
        mo147045b(mo147029N());
        mo147055p().setHintTextColor(this.f103443s);
    }

    /* renamed from: Q */
    private final void m161104Q() {
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
            KeyboardHitPointNew.m160872a(C40683h.m160851a(f), C54952a.m213204a(click.plus(eVar).plus(KeyboardHitPointExtraParams.ActionType.OPEN), C40683h.m160856f(f)));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: I */
    public void mo147024I() {
        boolean z;
        Editable text = mo147054o().getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "titleET.text");
        if (text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo147054o().setVisibility(8);
            mo147055p().setSelection(0);
            mo147035a((EditText) mo147055p());
            return;
        }
        mo147054o().setVisibility(0);
    }

    /* renamed from: O */
    private final void m161102O() {
        View findViewById = mo147058s().findViewById(R.id.layout_reply);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.layout_reply)");
        this.f103436k = (LinearLayout) findViewById;
        View findViewById2 = mo147058s().findViewById(R.id.layout_replay_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.layout_replay_content)");
        this.f103439o = (LinearLayout) findViewById2;
        View findViewById3 = mo147058s().findViewById(R.id.btn_close_reply);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.btn_close_reply)");
        this.f103440p = (ImageView) findViewById3;
        View findViewById4 = mo147058s().findViewById(R.id.tv_root_msg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.tv_root_msg)");
        this.f103437l = (EllipsizedEmojiconTextView) findViewById4;
        ImageView imageView = this.f103440p;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeReplyBtn");
        }
        imageView.setOnClickListener(new View$OnClickListenerC40724c(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: H */
    public void mo147023H() {
        super.mo147023H();
        mo147055p().setPadding(0, 0, 0, 0);
        mo147055p().setOnSizeChangeListener(new C40723b(this));
        if (mo147058s().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            View s = mo147058s();
            ViewGroup.LayoutParams layoutParams = mo147058s().getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 80;
                s.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        mo147055p().setMaxLines(4);
        mo147036a(mo147055p(), mo147057r());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: E */
    public void mo147020E() {
        C25649b.m91857a(mo147054o(), LarkFont.HEADLINE);
        mo147054o().setEmojiconSize((int) LKUIDisplayManager.m91865a(mo147030a(), LarkFont.HEADLINE));
        C25649b.m91857a(mo147055p(), LarkFont.HEADLINE);
        mo147055p().setEmojiconSize(LKUIDisplayManager.m91881c(mo147030a(), 19));
        mo147055p().setEmojiconTextSize((int) LKUIDisplayManager.m91865a(mo147030a(), LarkFont.HEADLINE));
        C25649b.m91853a(mo147056q(), 24);
        LinearLayout linearLayout = this.f103439o;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replyContentRegion");
        }
        linearLayout.getLayoutParams().height = LKUIDisplayManager.m91881c(mo147030a(), 20);
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = this.f103437l;
        if (ellipsizedEmojiconTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootMsgTV");
        }
        C25649b.m91857a(ellipsizedEmojiconTextView, LarkFont.BODY1);
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = this.f103437l;
        if (ellipsizedEmojiconTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootMsgTV");
        }
        ellipsizedEmojiconTextView2.setEmojiconSize(LKUIDisplayManager.m91881c(mo147030a(), 16));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputShrinkPlugin$initContentET$1", "Lcom/ss/android/lark/widget/listener/OnSizeChangeListener;", "onSizeChanged", "", "w", "", C14002h.f36692e, "oldw", "oldh", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.d$b */
    public static final class C40723b implements OnSizeChangeListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputShrinkPlugin f103445a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40723b(RichTextInputShrinkPlugin dVar) {
            this.f103445a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSizeChangeListener
        /* renamed from: a */
        public void mo147113a(int i, int i2, int i3, int i4) {
            if (i != i3) {
                RichTextInputShrinkPlugin dVar = this.f103445a;
                dVar.mo147045b(dVar.mo147029N());
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147038a(TransationData jVar) {
        super.mo147038a(jVar);
        mo147049d(jVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ EllipsizedEmojiconTextView m161105a(RichTextInputShrinkPlugin dVar) {
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = dVar.f103437l;
        if (ellipsizedEmojiconTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootMsgTV");
        }
        return ellipsizedEmojiconTextView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.d$c */
    public static final class View$OnClickListenerC40724c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RichTextInputShrinkPlugin f103446a;

        View$OnClickListenerC40724c(RichTextInputShrinkPlugin dVar) {
            this.f103446a = dVar;
        }

        public final void onClick(View view) {
            this.f103446a.mo147043b().mo147118a();
            TextInputSupportPlugin.OnClickReplyCloseBtListener bVar = this.f103446a.f103438m;
            if (bVar != null) {
                bVar.mo147272a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputShrinkPlugin$showReplyView$drawableCallback$1", "Lcom/ss/android/lark/widget/linked_emojicon/DrawableCallback;", "invalidateDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.d$e */
    public static final class C40726e extends C58507d {

        /* renamed from: a */
        final /* synthetic */ RichTextInputShrinkPlugin f103448a;

        @Override // com.ss.android.lark.widget.linked_emojicon.C58507d
        public void invalidateDrawable(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            drawable.mutate();
            drawable.setTint(RichTextInputShrinkPlugin.m161105a(this.f103448a).getCurrentTextColor());
            super.invalidateDrawable(drawable);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40726e(RichTextInputShrinkPlugin dVar, View view) {
            super(view);
            this.f103448a = dVar;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    public void mo147088b(TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "replyData");
        mo147048c(true);
        CharSequence charSequence = (CharSequence) jVar.mo147174a("reply_data_msgdigest");
        if (charSequence == null) {
        }
        m161106d(charSequence);
        mo147087a(jVar, false);
    }

    /* renamed from: f */
    public final void mo147112f(boolean z) {
        this.f103441q = z;
        if (!z && this.f103436k != null) {
            LinearLayout linearLayout = this.f103436k;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("replyRegion");
            }
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: b */
    public void mo147045b(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "hint");
        mo147047c(charSequence);
        mo147055p().setHint(TextUtils.ellipsize(charSequence, mo147055p().getPaint(), ((((float) mo147055p().getMeasuredWidth()) - ((float) mo147055p().getPaddingLeft())) - ((float) mo147055p().getPaddingRight())) - 1.0f, TextUtils.TruncateAt.END));
    }

    /* renamed from: d */
    private final void m161106d(CharSequence charSequence) {
        if (this.f103441q) {
            LinearLayout linearLayout = this.f103436k;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("replyRegion");
            }
            linearLayout.setVisibility(0);
        }
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = this.f103437l;
        if (ellipsizedEmojiconTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootMsgTV");
        }
        ellipsizedEmojiconTextView.setTranslateEmojiCode(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        C58508e[] eVarArr = (C58508e[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C58508e.class);
        for (C58508e eVar : eVarArr) {
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = this.f103437l;
            if (ellipsizedEmojiconTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootMsgTV");
            }
            eVar.mo198322a(new C40726e(this, ellipsizedEmojiconTextView2));
        }
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView3 = this.f103437l;
        if (ellipsizedEmojiconTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootMsgTV");
        }
        ellipsizedEmojiconTextView3.setText(charSequence);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin
    /* renamed from: a */
    public void mo147034a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        m161102O();
        m161103P();
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 80;
                view.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        if (this.f103444t) {
            mo147056q().setVisibility(8);
        }
        view.setOnClickListener(View$OnClickListenerC40725d.f103447a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7  */
    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo147011b(boolean r6) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin.mo147011b(boolean):void");
    }

    /* renamed from: a */
    public final void mo147111a(CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "hint");
        this.f103443s = i;
        mo147047c(charSequence);
        if (i != 0) {
            mo147055p().setHintTextColor(i);
        }
        mo147045b(charSequence);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147087a(TransationData jVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(jVar, "draft");
        RichText richText = (RichText) jVar.mo147174a("draft_msg_richtext");
        if (!C59035h.m229210a(richText)) {
            mo147041a(richText);
        } else {
            String str = (String) jVar.mo147174a("draft_post_title");
            if (str == null) {
                str = "";
            }
            RichText richText2 = (RichText) jVar.mo147174a("draft_post_reichtext");
            if (richText2 == null) {
                richText2 = C59029c.m229155a();
            }
            if (z) {
                mo147054o().append(str);
                C59033g.m229196a(richText2, mo147055p().getRichTextRender());
            } else {
                mo147042a(str);
                mo147041a(richText2);
            }
        }
        mo147017B();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichTextInputShrinkPlugin(CharSequence charSequence, int i, OnSendRichTextCallBack bVar, BaseRichTextInputPlugin.LifeCycleCallback bVar2, boolean z) {
        super(charSequence, bVar, bVar2);
        Intrinsics.checkParameterIsNotNull(charSequence, "hint");
        Intrinsics.checkParameterIsNotNull(bVar, "sendPostCallback");
        this.f103443s = i;
        this.f103444t = z;
        this.f103441q = true;
        this.f103442r = CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(VoiceKBPlugin.class), Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(ThreadPhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(BurnLifeKBPlugin.class), Reflection.getOrCreateKotlinClass(PlusKBPlugin.class), Reflection.getOrCreateKotlinClass(UploadLogKBPlugin.class), Reflection.getOrCreateKotlinClass(AaStyleKBPlugin.class)});
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RichTextInputShrinkPlugin(java.lang.CharSequence r7, int r8, com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack r9, com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0007
            r10 = 0
            com.ss.android.lark.keyboard.plugin.input.a.a$b r10 = (com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback) r10
        L_0x0007:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto L_0x000f
            r11 = 0
            r5 = 0
            goto L_0x0010
        L_0x000f:
            r5 = r11
        L_0x0010:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin.<init>(java.lang.CharSequence, int, com.ss.android.lark.keyboard.plugin.input.a.b, com.ss.android.lark.keyboard.plugin.input.a.a$b, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
