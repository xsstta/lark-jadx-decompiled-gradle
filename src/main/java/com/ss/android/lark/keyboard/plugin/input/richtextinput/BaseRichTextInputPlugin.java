package com.ss.android.lark.keyboard.plugin.input.richtextinput;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.C40727b;
import com.ss.android.lark.keyboard.plugin.input.GetUrlInlineFromCallback;
import com.ss.android.lark.keyboard.plugin.input.IInputContext;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010O\u001a\u00020PH\u0014J\b\u0010Q\u001a\u00020PH\u0016J\b\u0010R\u001a\u00020PH\u0004J\b\u0010S\u001a\u00020)H\u0004J\b\u0010\u0011\u001a\u0004\u0018\u00010TJ\n\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u00020ZH\u0016J\u0012\u0010[\u001a\u00020P2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0004J\b\u0010^\u001a\u00020PH\u0014J\b\u0010_\u001a\u00020PH\u0014J\b\u0010`\u001a\u00020PH\u0014J\u0010\u0010a\u001a\u00020;2\u0006\u0010b\u001a\u00020cH\u0016J\u0018\u0010d\u001a\u00020;2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010e\u001a\u00020PH\u0016J\b\u0010f\u001a\u00020PH\u0014J\u0018\u0010g\u001a\u00020;2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010:\u001a\u00020;H\u0017J\u0010\u0010g\u001a\u00020P2\u0006\u0010:\u001a\u00020;H&J\u0012\u0010h\u001a\u00020P2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0004J\u0012\u0010i\u001a\u00020P2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\b\u0010j\u001a\u00020kH\u0014J\b\u0010l\u001a\u00020]H\u0016J\b\u0010m\u001a\u00020ZH\u0014J\u0010\u0010n\u001a\u00020P2\u0006\u0010o\u001a\u00020)H\u0014J\b\u0010p\u001a\u00020XH\u0014J\b\u0010q\u001a\u00020PH\u0016J\b\u0010r\u001a\u00020PH$J\u0010\u0010s\u001a\u00020P2\u0006\u0010t\u001a\u00020]H\u0004J\u0018\u0010u\u001a\u00020P2\u0006\u0010v\u001a\u00020Z2\u0006\u0010w\u001a\u00020xH\u0016J\u0012\u0010y\u001a\u00020P2\b\u0010z\u001a\u0004\u0018\u00010VH\u0004J\u0010\u0010{\u001a\u00020P2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010|\u001a\u00020P2\b\u0010}\u001a\u0004\u0018\u00010kH\u0004J\b\u0010~\u001a\u00020PH$J\u0011\u0010\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020#H\u0016J\u0013\u0010\u0001\u001a\u00020P2\b\u0010}\u001a\u0004\u0018\u00010kH\u0004J\u0012\u0010\u0001\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020\u0019H\u0016J\u0014\u0010\u0001\u001a\u00020P2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0003H\u0004J\t\u0010\u0001\u001a\u00020PH\u0004J\u001b\u0010\u0001\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020T2\u0007\u0010\u0001\u001a\u00020;H\u0004R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001a\u00100\u001a\u00020)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u001a\u00102\u001a\u00020)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020;X.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u00020;X.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u001a\u0010F\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010\u0014R \u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020L0K0JX¤\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "hint", "", "sendCallBack", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "lifeCallback", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;", "(Ljava/lang/CharSequence;Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;)V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "contentET", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText;", "getContentET", "()Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText;", "setContentET", "(Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText;)V", "currentEditor", "getCurrentEditor", "setCurrentEditor", "editorWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "getEditorWatcher", "()Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "setEditorWatcher", "(Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;)V", "getHint", "()Ljava/lang/CharSequence;", "setHint", "(Ljava/lang/CharSequence;)V", "inputContext", "Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "getInputContext", "()Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "setInputContext", "(Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;)V", "interruptSend", "", "getInterruptSend", "()Z", "setInterruptSend", "(Z)V", "isInReplyMode", "setInReplyMode", "isResumed", "setResumed", "isSilent", "setSilent", "msgInputContainerScrollView", "Landroid/widget/ScrollView;", "getMsgInputContainerScrollView", "()Landroid/widget/ScrollView;", "setMsgInputContainerScrollView", "(Landroid/widget/ScrollView;)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "sendButton", "getSendButton", "setSendButton", "statusTransformButton", "getStatusTransformButton", "setStatusTransformButton", "titleET", "getTitleET", "setTitleET", "visibleKeyboardPlugins", "", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getVisibleKeyboardPlugins", "()Ljava/util/List;", "changeTitleVisibilityIfNeed", "", "clearEditorFocus", "clearInput", "contentETInited", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "getCurrET", "Landroid/widget/EditText;", "getHeight", "", "getTitle", "", "handleExtraParamIfNeed", "params", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "initContentET", "initTitleET", "notifyContentSend", "onCreateSendBtn", "parent", "Landroid/view/ViewGroup;", "onCreateView", "onDestroy", "onEditorFocusedAfterResume", "onInitView", "onInputPluginPrepared", "onResume", "onSaveContent", "Lcom/ss/android/lark/widget/richtext/RichText;", "onSaveDraft", "onSaveTitle", "onSendBtnClicked", "triggeredBySendButton", "onSetDraftImageSize", "onStop", "onTriggerStatusTransform", "putExtraInputState", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "registerAdditionPlugin", "name", "plugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin;", "requestEditorFocus", "editor", "setContentHint", "setContentRichText", "richText", "setEditTextDisplay", "setInputSupportContext", "context", "setPostContentRichTextSilent", "setTextWatcher", "textWatcher", "setTitleString", "text", "setTitleToContentIfNeed", "setupSendAction", "editText", "sendView", "Companion", "LifeCycleCallback", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a */
public abstract class BaseRichTextInputPlugin implements IInputSupportPlugin {

    /* renamed from: j */
    public static final Companion f103385j = new Companion(null);

    /* renamed from: b */
    protected Activity f103386b;

    /* renamed from: c */
    protected IInputContext f103387c;

    /* renamed from: d */
    protected KeyboardRichTextEditText f103388d;

    /* renamed from: e */
    protected KeyboardRichTextEditText f103389e;

    /* renamed from: f */
    protected View f103390f;

    /* renamed from: g */
    protected View f103391g;

    /* renamed from: h */
    protected ScrollView f103392h;

    /* renamed from: i */
    protected View f103393i;

    /* renamed from: k */
    private IKeyBoardPlugin.IKeyBoardContext.ITextWatcher f103394k;

    /* renamed from: l */
    private KeyboardRichTextEditText f103395l;

    /* renamed from: m */
    private boolean f103396m;

    /* renamed from: n */
    private boolean f103397n;

    /* renamed from: o */
    private boolean f103398o;

    /* renamed from: p */
    private boolean f103399p;

    /* renamed from: q */
    private CharSequence f103400q;

    /* renamed from: r */
    private final OnSendRichTextCallBack f103401r;

    /* renamed from: s */
    private final LifeCycleCallback f103402s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;", "", "onResume", "", "onStop", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$b */
    public interface LifeCycleCallback {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$b$a */
        public static final class C40698a {
            /* renamed from: a */
            public static void m161059a(LifeCycleCallback bVar) {
            }
        }

        /* renamed from: a */
        void mo123224a();

        /* renamed from: b */
        void mo123225b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract void mo147019D();

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo147020E();

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo147021F() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo147024I() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo147025J() {
    }

    /* renamed from: a */
    public abstract void mo147034a(View view);

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147009a(String str, IInputSupportAdditionPlugin iInputSupportAdditionPlugin) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(iInputSupportAdditionPlugin, "plugin");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract List<KClass<? extends IKeyBoardPlugin>> mo147061v();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$Companion;", "", "()V", "COMBINED_BTN_SIZE", "", "INPUT_EMOJI_SIZE", "PARAM_CONTENT", "", "PARAM_SELECTED_PLUGIN", "PARAM_SHOW_EDIT_CURSOR", "PARAM_TITLE", "REPLY_CONTENT_HEIGHT", "REPLY_EMOJI_SIZE", "TAG", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final CharSequence mo147029N() {
        return this.f103400q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final IKeyBoardPlugin.IKeyBoardContext.ITextWatcher mo147059t() {
        return this.f103394k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final KeyboardRichTextEditText mo147060u() {
        return this.f103395l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo147062w() {
        return this.f103396m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo147063x() {
        return this.f103397n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo147064y() {
        return this.f103398o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo147065z() {
        return this.f103399p;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: a */
    public void mo146900a(boolean z) {
        IInputSupportPlugin.C40730b.m161157a(this, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147042a(CharSequence charSequence) {
        if (charSequence == null) {
            KeyboardRichTextEditText keyboardRichTextEditText = this.f103388d;
            if (keyboardRichTextEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleET");
            }
            keyboardRichTextEditText.setText("");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            C58508e[] eVarArr = (C58508e[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C58508e.class);
            for (C58508e eVar : eVarArr) {
                Intrinsics.checkExpressionValueIsNotNull(eVar, "span");
                if (eVar.mo198328e() != null) {
                    Drawable e = eVar.mo198328e();
                    e.mutate();
                    KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103388d;
                    if (keyboardRichTextEditText2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleET");
                    }
                    e.setTint(keyboardRichTextEditText2.getCurrentTextColor());
                }
            }
            KeyboardRichTextEditText keyboardRichTextEditText3 = this.f103388d;
            if (keyboardRichTextEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleET");
            }
            keyboardRichTextEditText3.setText(charSequence);
        }
        KeyboardRichTextEditText keyboardRichTextEditText4 = this.f103388d;
        if (keyboardRichTextEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        if (!TextUtils.isEmpty(keyboardRichTextEditText4.getText())) {
            KeyboardRichTextEditText keyboardRichTextEditText5 = this.f103388d;
            if (keyboardRichTextEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleET");
            }
            KeyboardRichTextEditText keyboardRichTextEditText6 = this.f103388d;
            if (keyboardRichTextEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleET");
            }
            keyboardRichTextEditText5.setSelection(keyboardRichTextEditText6.length());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147041a(RichText richText) {
        this.f103398o = true;
        mo147044b(richText);
        this.f103398o = false;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: e */
    public void mo147014e() {
        mo147013d();
        mo147018C();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: f */
    public boolean mo146901f() {
        return IInputSupportPlugin.C40730b.m161159c(this);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: g */
    public String mo146902g() {
        return mo147026K();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: h */
    public boolean mo146903h() {
        return IInputSupportPlugin.C40730b.m161158b(this);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: l */
    public EditText mo146904l() {
        return this.f103395l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo147016A() {
        IInputContext eVar = this.f103387c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContext");
        }
        eVar.mo147125d();
    }

    /* renamed from: M */
    public final RichTextEmojiconEditText mo147028M() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103389e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        return keyboardRichTextEditText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Activity mo147030a() {
        Activity activity = this.f103386b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        return activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final IInputContext mo147043b() {
        IInputContext eVar = this.f103387c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContext");
        }
        return eVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: d */
    public void mo147013d() {
        this.f103399p = false;
        LifeCycleCallback bVar = this.f103402s;
        if (bVar != null) {
            bVar.mo123225b();
        }
        this.f103395l = null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: n */
    public int mo146906n() {
        View view = this.f103393i;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view.getHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final KeyboardRichTextEditText mo147054o() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103388d;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        return keyboardRichTextEditText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final KeyboardRichTextEditText mo147055p() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103389e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        return keyboardRichTextEditText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final View mo147056q() {
        View view = this.f103390f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTransformButton");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final View mo147057r() {
        View view = this.f103391g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendButton");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final View mo147058s() {
        View view = this.f103393i;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public String mo147026K() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103388d;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        return keyboardRichTextEditText.getText().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public RichText mo147027L() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103389e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        RichText richText = keyboardRichTextEditText.getRichText();
        Intrinsics.checkExpressionValueIsNotNull(richText, "contentET.richText");
        return richText;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: c */
    public void mo147012c() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103388d;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText.clearFocus();
        KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103389e;
        if (keyboardRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText2.clearFocus();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo147018C() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103388d;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText.setText("");
        KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103389e;
        if (keyboardRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText2.setText("");
        KeyboardRichTextEditText keyboardRichTextEditText3 = this.f103389e;
        if (keyboardRichTextEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        mo147035a((EditText) keyboardRichTextEditText3);
        KeyboardRichTextEditText keyboardRichTextEditText4 = this.f103389e;
        if (keyboardRichTextEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText4.setSelection(0);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: k */
    public TransationData mo147053k() {
        boolean z;
        mo147017B();
        String K = mo147026K();
        RichText L = mo147027L();
        TransationData jVar = new TransationData();
        if (K.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jVar.mo147176a("draft_post_title", K);
        }
        if (!C59035h.m229210a(L)) {
            jVar.mo147176a("draft_post_reichtext", L);
        }
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo147022G() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103388d;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText.setEditorType("title");
        KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103388d;
        if (keyboardRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText2.setFocusAfterInsertAt(false);
        KeyboardRichTextEditText keyboardRichTextEditText3 = this.f103388d;
        if (keyboardRichTextEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText3.setTextStyleEnable(false);
        KeyboardRichTextEditText keyboardRichTextEditText4 = this.f103388d;
        if (keyboardRichTextEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText4.setOnEditorActionListener(new C40706j(this));
        KeyboardRichTextEditText keyboardRichTextEditText5 = this.f103388d;
        if (keyboardRichTextEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText5.addTextChangedListener(new C40707k(this));
        KeyboardRichTextEditText keyboardRichTextEditText6 = this.f103388d;
        if (keyboardRichTextEditText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText6.setOnFocusChangeListener(new View$OnFocusChangeListenerC40708l(this));
        KeyboardRichTextEditText keyboardRichTextEditText7 = this.f103388d;
        if (keyboardRichTextEditText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        keyboardRichTextEditText7.setOnKeyPreImeHandler(new C40709m(this));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo147017B() {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.mo147017B():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo147023H() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103389e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText.setEditorType("content");
        KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103389e;
        if (keyboardRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText2.setFocusAfterInsertAt(false);
        KeyboardRichTextEditText keyboardRichTextEditText3 = this.f103389e;
        if (keyboardRichTextEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText3.setDraftImageSize(mo147021F());
        KeyboardRichTextEditText keyboardRichTextEditText4 = this.f103389e;
        if (keyboardRichTextEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText4.addTextChangedListener(new C40699c(this));
        KeyboardRichTextEditText keyboardRichTextEditText5 = this.f103389e;
        if (keyboardRichTextEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText5.setSelectionChangedListener(new C40700d(this));
        KeyboardRichTextEditText keyboardRichTextEditText6 = this.f103389e;
        if (keyboardRichTextEditText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText6.setOnKeyPreImeHandler(new C40701e(this));
        KeyboardRichTextEditText keyboardRichTextEditText7 = this.f103389e;
        if (keyboardRichTextEditText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText7.setOnFocusChangeListener(new View$OnFocusChangeListenerC40702f(this));
        KeyboardRichTextEditText keyboardRichTextEditText8 = this.f103389e;
        if (keyboardRichTextEditText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText8.setOnEditorActionListener(new C40703g(this));
        KeyboardRichTextEditText keyboardRichTextEditText9 = this.f103389e;
        if (keyboardRichTextEditText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText9.setOnKeyListener(View$OnKeyListenerC40704h.f103408a);
        if (C40682g.m160850a().mo133170a()) {
            KeyboardRichTextEditText keyboardRichTextEditText10 = this.f103389e;
            if (keyboardRichTextEditText10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            keyboardRichTextEditText10.setImeOptions(4);
            KeyboardRichTextEditText keyboardRichTextEditText11 = this.f103389e;
            if (keyboardRichTextEditText11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            keyboardRichTextEditText11.setInputType(131072);
            KeyboardRichTextEditText keyboardRichTextEditText12 = this.f103389e;
            if (keyboardRichTextEditText12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            keyboardRichTextEditText12.setSingleLine(false);
        } else {
            KeyboardRichTextEditText keyboardRichTextEditText13 = this.f103389e;
            if (keyboardRichTextEditText13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            keyboardRichTextEditText13.setInputType(131073);
        }
        KeyboardRichTextEditText keyboardRichTextEditText14 = this.f103389e;
        if (keyboardRichTextEditText14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText14.setOnPasteListener(new C40705i(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo147048c(boolean z) {
        this.f103396m = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo147050d(boolean z) {
        this.f103397n = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$initContentET$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$c */
    public static final class C40699c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103403a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40699c(BaseRichTextInputPlugin aVar) {
            this.f103403a = aVar;
        }

        public void afterTextChanged(Editable editable) {
            CharSequence charSequence;
            View r = this.f103403a.mo147057r();
            if (editable != null) {
                charSequence = StringsKt.trim(editable);
            } else {
                charSequence = null;
            }
            r.setEnabled(!TextUtils.isEmpty(String.valueOf(charSequence)));
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher t;
            if (!this.f103403a.mo147064y() && (t = this.f103403a.mo147059t()) != null) {
                t.mo147172a(charSequence, i, i2, i3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$initContentET$2", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnSelectionChangedListener;", "onSelectionChanged", "", "selStart", "", "selEnd", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$d */
    public static final class C40700d implements KeyboardRichTextEditText.OnSelectionChangedListener {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103404a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40700d(BaseRichTextInputPlugin aVar) {
            this.f103404a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText.OnSelectionChangedListener
        /* renamed from: a */
        public void mo147069a(int i, int i2) {
            Editable text = this.f103404a.mo147055p().getText();
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher t = this.f103404a.mo147059t();
            if (t != null) {
                t.mo147170a(text, i, i2 - i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$initContentET$3", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnKeyPreImeHandler;", "onKeyPreIme", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$e */
    public static final class C40701e implements KeyboardRichTextEditText.OnKeyPreImeHandler {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103405a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40701e(BaseRichTextInputPlugin aVar) {
            this.f103405a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText.OnKeyPreImeHandler
        /* renamed from: a */
        public boolean mo147070a(int i, KeyEvent keyEvent) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher t;
            if (!Intrinsics.areEqual(this.f103405a.mo147060u(), this.f103405a.mo147055p()) || (t = this.f103405a.mo147059t()) == null || !t.mo147173a(i, keyEvent)) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$initTitleET$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$k */
    public static final class C40707k implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103412a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40707k(BaseRichTextInputPlugin aVar) {
            this.f103412a = aVar;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            for (int length = editable.length() - 1; length >= 0; length--) {
                if (editable.charAt(length) == '\n') {
                    editable.replace(length, length + 1, " ");
                }
            }
            this.f103412a.mo147024I();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f103412a.mo147064y()) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$initTitleET$4", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnKeyPreImeHandler;", "onKeyPreIme", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$m */
    public static final class C40709m implements KeyboardRichTextEditText.OnKeyPreImeHandler {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103414a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40709m(BaseRichTextInputPlugin aVar) {
            this.f103414a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText.OnKeyPreImeHandler
        /* renamed from: a */
        public boolean mo147070a(int i, KeyEvent keyEvent) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher t;
            if (!Intrinsics.areEqual(this.f103414a.mo147060u(), this.f103414a.mo147054o()) || (t = this.f103414a.mo147059t()) == null || !t.mo147173a(i, keyEvent)) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$n */
    static final class View$OnClickListenerC40710n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103415a;

        View$OnClickListenerC40710n(BaseRichTextInputPlugin aVar) {
            this.f103415a = aVar;
        }

        public final void onClick(View view) {
            this.f103415a.mo147052e(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$o */
    public static final class View$OnClickListenerC40711o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103416a;

        View$OnClickListenerC40711o(BaseRichTextInputPlugin aVar) {
            this.f103416a = aVar;
        }

        public final void onClick(View view) {
            this.f103416a.mo147019D();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147037a(IInputContext eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        this.f103387c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo147047c(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "<set-?>");
        this.f103400q = charSequence;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$initContentET$7", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "regex", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$i */
    public static final class C40705i extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103409a;

        /* renamed from: b */
        private final Regex f103410b = new Regex("\\s+|\n+");

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40705i(BaseRichTextInputPlugin aVar) {
            this.f103409a = aVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            int indexOf$default;
            if (charSequence != null) {
                String obj = charSequence.toString();
                String str = obj;
                int i3 = 0;
                for (String str2 : this.f103410b.split(str, 0)) {
                    if (!URLUtil.isNetworkUrl(str2) || (indexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, i3, false, 4, (Object) null)) == -1) {
                        i3 += str2.length();
                    } else {
                        int i4 = i + indexOf$default;
                        C40682g.m160850a().mo133169a(obj, new UIGetDataCallback(new C40727b(this.f103409a.mo147055p(), str2, i4)));
                        C40682g.m160850a().mo133173b(obj, new UIGetDataCallback(new GetUrlInlineFromCallback(i4, str2, this.f103409a.mo147055p())));
                        return;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147033a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View a = C40679d.m160785a(viewGroup.getContext());
        a.setOnClickListener(new View$OnClickListenerC40710n(this));
        Intrinsics.checkExpressionValueIsNotNull(a, "btn");
        this.f103391g = a;
        return a;
    }

    /* renamed from: b */
    public void mo147045b(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "hint");
        this.f103400q = charSequence;
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103389e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        keyboardRichTextEditText.setHint(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo147049d(TransationData jVar) {
        if (jVar != null) {
            mo147087a(jVar, false);
        }
        mo147051e(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo147044b(RichText richText) {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103389e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        if (!Intrinsics.areEqual(keyboardRichTextEditText.getRichText(), richText)) {
            KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103389e;
            if (keyboardRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            keyboardRichTextEditText2.setText("");
            if (!C59035h.m229210a(richText)) {
                KeyboardRichTextEditText keyboardRichTextEditText3 = this.f103389e;
                if (keyboardRichTextEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentET");
                }
                C59033g.m229196a(richText, keyboardRichTextEditText3.getRichTextRender());
                return;
            }
            RichText a = C59029c.m229155a();
            KeyboardRichTextEditText keyboardRichTextEditText4 = this.f103389e;
            if (keyboardRichTextEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            C59033g.m229196a(a, keyboardRichTextEditText4.getRichTextRender());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo147046c(TransationData jVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(jVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103395l;
        KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103388d;
        if (keyboardRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleET");
        }
        if (Intrinsics.areEqual(keyboardRichTextEditText, keyboardRichTextEditText2)) {
            jVar.mo147176a("extra_current_focus_editor", "title");
        } else {
            KeyboardRichTextEditText keyboardRichTextEditText3 = this.f103395l;
            KeyboardRichTextEditText keyboardRichTextEditText4 = this.f103389e;
            if (keyboardRichTextEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            if (Intrinsics.areEqual(keyboardRichTextEditText3, keyboardRichTextEditText4)) {
                jVar.mo147176a("extra_current_focus_editor", "content");
            }
        }
        KeyboardRichTextEditText keyboardRichTextEditText5 = this.f103395l;
        if (keyboardRichTextEditText5 != null) {
            i = keyboardRichTextEditText5.getSelectionStart();
        } else {
            i = -1;
        }
        jVar.mo147176a("extra_current_selector", Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo147052e(boolean z) {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f103389e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentET");
        }
        String a = keyboardRichTextEditText.mo146908a(false);
        Intrinsics.checkExpressionValueIsNotNull(a, "content");
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } else if (!TextUtils.isEmpty(StringsKt.trim((CharSequence) a).toString())) {
            mo147017B();
            String K = mo147026K();
            if (K != null) {
                String obj = StringsKt.trim((CharSequence) K).toString();
                KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103389e;
                if (keyboardRichTextEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentET");
                }
                RichText richText = keyboardRichTextEditText2.getRichText();
                Intrinsics.checkExpressionValueIsNotNull(richText, "richText");
                richText.setRichTextVersion(1);
                if (!this.f103397n) {
                    this.f103401r.mo123223a(obj, a, richText, z);
                    mo147018C();
                    mo147087a(new TransationData(), false);
                    mo147016A();
                    return;
                }
                this.f103401r.mo123222a();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147035a(EditText editText) {
        if (editText != null) {
            if (editText.hasFocus()) {
                editText.clearFocus();
            }
            editText.requestFocus();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo147051e(TransationData jVar) {
        String str;
        Boolean bool;
        boolean z;
        int i;
        int i2;
        KeyboardRichTextEditText keyboardRichTextEditText;
        Editable text;
        Integer num;
        String str2 = null;
        if (jVar != null) {
            str = (String) jVar.mo147174a("extra_current_focus_editor");
        } else {
            str = null;
        }
        if (jVar != null) {
            bool = (Boolean) jVar.mo147174a("param_show_edit_cursor");
        } else {
            bool = null;
        }
        boolean z2 = true;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (Intrinsics.areEqual(str, "title")) {
            KeyboardRichTextEditText keyboardRichTextEditText2 = this.f103388d;
            if (keyboardRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleET");
            }
            this.f103395l = keyboardRichTextEditText2;
        } else if (Intrinsics.areEqual(str, "content") || z) {
            KeyboardRichTextEditText keyboardRichTextEditText3 = this.f103389e;
            if (keyboardRichTextEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            this.f103395l = keyboardRichTextEditText3;
        }
        if (jVar != null) {
            str2 = (String) jVar.mo147174a("param_selected_plugin");
        }
        if (jVar == null || (num = (Integer) jVar.mo147174a("extra_current_selector")) == null) {
            i = -1;
        } else {
            i = num.intValue();
        }
        KeyboardRichTextEditText keyboardRichTextEditText4 = this.f103395l;
        if (keyboardRichTextEditText4 == null || (text = keyboardRichTextEditText4.getText()) == null) {
            i2 = 0;
        } else {
            i2 = text.length();
        }
        if (i >= 0 && i2 >= i && (keyboardRichTextEditText = this.f103395l) != null) {
            keyboardRichTextEditText.setSelection(i);
        }
        String str3 = str2;
        if (!(str3 == null || str3.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            IInputContext eVar = this.f103387c;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputContext");
            }
            eVar.mo147119a(str2);
            return;
        }
        KeyboardRichTextEditText keyboardRichTextEditText5 = this.f103395l;
        if (keyboardRichTextEditText5 != null) {
            mo147035a((EditText) keyboardRichTextEditText5);
            mo147025J();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147038a(TransationData jVar) {
        this.f103399p = true;
        IInputContext eVar = this.f103387c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContext");
        }
        Object[] array = mo147061v().toArray(new KClass[0]);
        if (array != null) {
            KClass[] kClassArr = (KClass[]) array;
            eVar.mo147122a((KClass[]) Arrays.copyOf(kClassArr, kClassArr.length));
            View view = this.f103391g;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendButton");
            }
            KeyboardRichTextEditText keyboardRichTextEditText = this.f103389e;
            if (keyboardRichTextEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentET");
            }
            Editable text = keyboardRichTextEditText.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "contentET.text");
            view.setEnabled(true ^ TextUtils.isEmpty(StringsKt.trim(text)));
            LifeCycleCallback bVar = this.f103402s;
            if (bVar != null) {
                bVar.mo123224a();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147039a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "textWatcher");
        this.f103394k = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147040a(KeyboardRichTextEditText keyboardRichTextEditText) {
        this.f103395l = keyboardRichTextEditText;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$setupSendAction$1", "Landroid/view/View$OnKeyListener;", "onKey", "", "v", "Landroid/view/View;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$q */
    public static final class View$OnKeyListenerC40713q implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f103418a;

        /* renamed from: b */
        final /* synthetic */ View f103419b;

        View$OnKeyListenerC40713q(RichTextEmojiconEditText richTextEmojiconEditText, View view) {
            this.f103418a = richTextEmojiconEditText;
            this.f103419b = view;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Intrinsics.checkParameterIsNotNull(keyEvent, "event");
            if (i != 66 || keyEvent.getAction() != 0) {
                return false;
            }
            if (!keyEvent.isShiftPressed() && !keyEvent.isCtrlPressed()) {
                Editable text = this.f103418a.getText();
                Intrinsics.checkExpressionValueIsNotNull(text, "editText.text");
                if (!TextUtils.isEmpty(StringsKt.trim(text))) {
                    this.f103419b.performClick();
                    return true;
                }
            }
            Editable text2 = this.f103418a.getText();
            Intrinsics.checkExpressionValueIsNotNull(text2, "editText.text");
            if (TextUtils.isEmpty(StringsKt.trim(text2))) {
                return true;
            }
            if (!keyEvent.isCtrlPressed() && !keyEvent.isShiftPressed()) {
                return false;
            }
            this.f103418a.append("\n");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "motionEvent", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$p */
    public static final class View$OnTouchListenerC40712p implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103417a;

        View$OnTouchListenerC40712p(BaseRichTextInputPlugin aVar) {
            this.f103417a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f103417a.mo147055p().canScrollVertically(-1)) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                view.getParent().requestDisallowInterceptTouchEvent(true);
                Intrinsics.checkExpressionValueIsNotNull(motionEvent, "motionEvent");
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147032a(Activity activity, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(activity).inflate(mo147089i(), viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        return mo147031a(activity, inflate);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$f */
    public static final class View$OnFocusChangeListenerC40702f implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103406a;

        View$OnFocusChangeListenerC40702f(BaseRichTextInputPlugin aVar) {
            this.f103406a = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && this.f103406a.mo147065z()) {
                KeyboardRichTextEditText p = this.f103406a.mo147055p();
                this.f103406a.mo147040a(p);
                List<KClass<? extends IKeyBoardPlugin>> v = this.f103406a.mo147061v();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(v, 10));
                Iterator<T> it = v.iterator();
                while (it.hasNext()) {
                    arrayList.add(TuplesKt.to(it.next(), true));
                }
                this.f103406a.mo147043b().mo147120a(MapsKt.toMap(arrayList));
                IKeyBoardPlugin.IKeyBoardContext.ITextWatcher t = this.f103406a.mo147059t();
                if (t != null) {
                    t.mo147171a(p);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$l */
    public static final class View$OnFocusChangeListenerC40708l implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103413a;

        View$OnFocusChangeListenerC40708l(BaseRichTextInputPlugin aVar) {
            this.f103413a = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && this.f103413a.mo147065z()) {
                KeyboardRichTextEditText o = this.f103413a.mo147054o();
                this.f103413a.mo147040a(o);
                List<KClass<? extends IKeyBoardPlugin>> v = this.f103413a.mo147061v();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(v, 10));
                Iterator<T> it = v.iterator();
                while (it.hasNext()) {
                    arrayList.add(TuplesKt.to(it.next(), false));
                }
                this.f103413a.mo147043b().mo147120a(MapsKt.toMap(arrayList));
                IKeyBoardPlugin.IKeyBoardContext.ITextWatcher t = this.f103413a.mo147059t();
                if (t != null) {
                    t.mo147171a(o);
                }
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147031a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f103386b = activity;
        this.f103393i = view;
        View findViewById = view.findViewById(R.id.kb_rich_text_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.kb_rich_text_content)");
        this.f103389e = (KeyboardRichTextEditText) findViewById;
        View findViewById2 = view.findViewById(R.id.kb_rich_text_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.kb_rich_text_title)");
        this.f103388d = (KeyboardRichTextEditText) findViewById2;
        View findViewById3 = view.findViewById(R.id.kb_rich_text_content_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.…ich_text_content_wrapper)");
        this.f103392h = (ScrollView) findViewById3;
        View findViewById4 = view.findViewById(R.id.status_transform_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.status_transform_btn)");
        this.f103390f = findViewById4;
        if (findViewById4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTransformButton");
        }
        findViewById4.setOnClickListener(new View$OnClickListenerC40711o(this));
        mo147034a(view);
        mo147022G();
        mo147023H();
        mo147020E();
        ScrollView scrollView = this.f103392h;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("msgInputContainerScrollView");
        }
        scrollView.setOnTouchListener(new View$OnTouchListenerC40712p(this));
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147036a(RichTextEmojiconEditText richTextEmojiconEditText, View view) {
        Intrinsics.checkParameterIsNotNull(richTextEmojiconEditText, "editText");
        Intrinsics.checkParameterIsNotNull(view, "sendView");
        Context context = richTextEmojiconEditText.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "editText.context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "editText.context.resources");
        if ((resources.getConfiguration().screenLayout & 15) >= 3) {
            richTextEmojiconEditText.setOnKeyListener(new View$OnKeyListenerC40713q(richTextEmojiconEditText, view));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$g */
    public static final class C40703g implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103407a;

        C40703g(BaseRichTextInputPlugin aVar) {
            this.f103407a = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f103407a.mo147052e(false);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "event", "Landroid/view/KeyEvent;", "onKey"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$h */
    public static final class View$OnKeyListenerC40704h implements View.OnKeyListener {

        /* renamed from: a */
        public static final View$OnKeyListenerC40704h f103408a = new View$OnKeyListenerC40704h();

        View$OnKeyListenerC40704h() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if ((keyEvent == null || keyEvent.getKeyCode() != 4) && keyEvent != null && keyEvent.getKeyCode() == 66) {
            }
            return false;
        }
    }

    public BaseRichTextInputPlugin(CharSequence charSequence, OnSendRichTextCallBack bVar, LifeCycleCallback bVar2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "hint");
        Intrinsics.checkParameterIsNotNull(bVar, "sendCallBack");
        this.f103400q = charSequence;
        this.f103401r = bVar;
        this.f103402s = bVar2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a.a$j */
    public static final class C40706j implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ BaseRichTextInputPlugin f103411a;

        C40706j(BaseRichTextInputPlugin aVar) {
            this.f103411a = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 4 && i != 6 && (keyEvent == null || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                return false;
            }
            this.f103411a.mo147055p().setSelection(0);
            BaseRichTextInputPlugin aVar = this.f103411a;
            aVar.mo147035a((EditText) aVar.mo147055p());
            return true;
        }
    }
}
