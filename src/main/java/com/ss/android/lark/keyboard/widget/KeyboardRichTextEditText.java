package com.ss.android.lark.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.utils.KBCopyManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0003%&'B'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014J\u0010\u0010\"\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0014R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText;", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "editorType", "", "getEditorType", "()Ljava/lang/String;", "setEditorType", "(Ljava/lang/String;)V", "keyPreImeHandler", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnKeyPreImeHandler;", "selectedEnd", "selectedStart", "selectionChangedListener", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnSelectionChangedListener;", "doStyleCopy", "", "content", "", "doStyleParse", "", "onKeyPreIme", "keyCode", "event", "Landroid/view/KeyEvent;", "onSelectionChanged", "selStart", "selEnd", "setOnKeyPreImeHandler", "setSelectionChangedListener", "listener", "Companion", "OnKeyPreImeHandler", "OnSelectionChangedListener", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyboardRichTextEditText extends RichTextEmojiconEditText {

    /* renamed from: k */
    public static final Companion f104782k = new Companion(null);

    /* renamed from: l */
    private String f104783l;

    /* renamed from: m */
    private int f104784m;

    /* renamed from: n */
    private int f104785n;

    /* renamed from: o */
    private OnSelectionChangedListener f104786o;

    /* renamed from: p */
    private OnKeyPreImeHandler f104787p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnKeyPreImeHandler;", "", "onKeyPreIme", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText$b */
    public interface OnKeyPreImeHandler {
        /* renamed from: a */
        boolean mo147070a(int i, KeyEvent keyEvent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnSelectionChangedListener;", "", "onSelectionChanged", "", "selStart", "", "selEnd", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText$c */
    public interface OnSelectionChangedListener {
        /* renamed from: a */
        void mo147069a(int i, int i2);
    }

    public KeyboardRichTextEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public KeyboardRichTextEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$Companion;", "", "()V", "EDITOR_TYPE_CONTENT", "", "EDITOR_TYPE_TITLE", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getEditorType() {
        return this.f104783l;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText
    /* renamed from: b */
    public boolean mo146925b() {
        KBCopyManager aVar = KBCopyManager.f103297a;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return aVar.mo146861a(context, this);
    }

    public final void setOnKeyPreImeHandler(OnKeyPreImeHandler bVar) {
        this.f104787p = bVar;
    }

    public final void setEditorType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f104783l = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText
    /* renamed from: a */
    public void mo146914a(CharSequence charSequence) {
        super.mo146914a(charSequence);
        if (charSequence != null) {
            KBCopyManager.f103297a.mo146860a(charSequence, null, true);
        }
    }

    public final void setSelectionChangedListener(OnSelectionChangedListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f104786o = cVar;
        cVar.mo147069a(this.f104784m, this.f104785n);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        OnSelectionChangedListener cVar = this.f104786o;
        if (cVar != null) {
            cVar.mo147069a(i, i2);
        }
        this.f104784m = i;
        this.f104785n = i2;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        OnKeyPreImeHandler bVar = this.f104787p;
        if (bVar == null || !bVar.mo147070a(i, keyEvent)) {
            return super.onKeyPreIme(i, keyEvent);
        }
        return true;
    }

    public KeyboardRichTextEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTextStyleEnable(true);
        this.f104783l = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KeyboardRichTextEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.autoCompleteTextViewStyle : i);
    }
}
