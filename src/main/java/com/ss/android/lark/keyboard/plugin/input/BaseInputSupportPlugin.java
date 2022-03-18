package com.ss.android.lark.keyboard.plugin.input;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\""}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/BaseInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "()V", "mAdditionController", "Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController;", "getMAdditionController", "()Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController;", "clearEditorFocus", "", "getAdditionDividerHeight", "", "initAdditionPluginController", "panelRegionParent", "Landroid/view/ViewGroup;", "activity", "Landroid/app/Activity;", "notifyKeyboardChange", "shown", "", "onBackPressed", "onDestroy", "onEnableChanged", "isEnable", "onStop", "registerAdditionPlugin", "name", "", "plugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin;", "setupSendAction", "editText", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "sendView", "Landroid/view/View;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.a */
public abstract class BaseInputSupportPlugin implements IInputSupportPlugin {

    /* renamed from: b */
    private final InputAdditionPluginController f103382b = new InputAdditionPluginController();

    /* renamed from: b */
    public abstract int mo147010b();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final InputAdditionPluginController mo147006a() {
        return this.f103382b;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: d */
    public void mo147013d() {
        this.f103382b.mo147134b();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: e */
    public void mo147014e() {
        this.f103382b.mo147136c();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: f */
    public boolean mo146901f() {
        return this.f103382b.mo147137d();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: g */
    public String mo146902g() {
        return IInputSupportPlugin.C40730b.m161156a(this);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: h */
    public boolean mo146903h() {
        return IInputSupportPlugin.C40730b.m161158b(this);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: c */
    public void mo147012c() {
        EditText l = mo146904l();
        if (l != null) {
            l.clearFocus();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: a */
    public void mo146900a(boolean z) {
        this.f103382b.mo147133a(z);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    public void mo147011b(boolean z) {
        this.f103382b.mo147135b(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/BaseInputSupportPlugin$setupSendAction$1", "Landroid/view/View$OnKeyListener;", "onKey", "", "v", "Landroid/view/View;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.a$a */
    public static final class View$OnKeyListenerC40697a implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f103383a;

        /* renamed from: b */
        final /* synthetic */ View f103384b;

        View$OnKeyListenerC40697a(RichTextEmojiconEditText richTextEmojiconEditText, View view) {
            this.f103383a = richTextEmojiconEditText;
            this.f103384b = view;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Intrinsics.checkParameterIsNotNull(keyEvent, "event");
            if (i != 66 || keyEvent.getAction() != 0) {
                return false;
            }
            if (!keyEvent.isShiftPressed() && !keyEvent.isCtrlPressed()) {
                Editable text = this.f103383a.getText();
                Intrinsics.checkExpressionValueIsNotNull(text, "editText.text");
                if (!TextUtils.isEmpty(StringsKt.trim(text))) {
                    this.f103384b.performClick();
                    return true;
                }
            }
            Editable text2 = this.f103383a.getText();
            Intrinsics.checkExpressionValueIsNotNull(text2, "editText.text");
            if (TextUtils.isEmpty(StringsKt.trim(text2))) {
                return true;
            }
            if (!keyEvent.isCtrlPressed() && !keyEvent.isShiftPressed()) {
                return false;
            }
            this.f103383a.append("\n");
            return true;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147009a(String str, IInputSupportAdditionPlugin iInputSupportAdditionPlugin) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(iInputSupportAdditionPlugin, "plugin");
        this.f103382b.mo147132a(new Pair<>(iInputSupportAdditionPlugin, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147007a(ViewGroup viewGroup, Activity activity) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "panelRegionParent");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        SlidingUpPanelLayout slidingUpPanelLayout = (SlidingUpPanelLayout) viewGroup.findViewById(R.id.top_drawer);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.bottom_container);
        Intrinsics.checkExpressionValueIsNotNull(slidingUpPanelLayout, "popContainer");
        slidingUpPanelLayout.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "container");
        constraintLayout.setVisibility(8);
        this.f103382b.mo147131a(slidingUpPanelLayout, constraintLayout, activity, mo147010b());
        this.f103382b.mo147129a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147008a(RichTextEmojiconEditText richTextEmojiconEditText, View view) {
        Intrinsics.checkParameterIsNotNull(richTextEmojiconEditText, "editText");
        Intrinsics.checkParameterIsNotNull(view, "sendView");
        Context context = richTextEmojiconEditText.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "editText.context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "editText.context.resources");
        if ((resources.getConfiguration().screenLayout & 15) >= 3) {
            richTextEmojiconEditText.setOnKeyListener(new View$OnKeyListenerC40697a(richTextEmojiconEditText, view));
        }
    }
}
