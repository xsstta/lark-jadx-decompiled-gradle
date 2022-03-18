package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDInputDialogBuilder;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0016\u001a\u00020\u0017\"\u000e\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0014J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDInputDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mEditText", "", "mEditTextBackgroundRes", "", "mEditTextColor", "mEditTextHint", "mEditTextHintColor", "mEditTextMaxLine", "mEditTextPaddingBottom", "mEditTextPaddingLeft", "mEditTextPaddingRight", "mEditTextPaddingTop", "mInputType", "mOnTextChangedListener", "Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;", "mTextWatcher", "Landroid/text/TextWatcher;", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultContentRes", "onCreateContent", "Landroid/view/View;", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.dialog.h */
public class UDInputDialogController extends UDDialogController {

    /* renamed from: a */
    public UDInputDialogBuilder.OnTextChangedListener f63339a;

    /* renamed from: b */
    private int f63340b = -1;

    /* renamed from: c */
    private int f63341c = -1;

    /* renamed from: d */
    private int f63342d = -1;

    /* renamed from: e */
    private int f63343e = -1;

    /* renamed from: f */
    private int f63344f = -1;

    /* renamed from: g */
    private int f63345g = -1;

    /* renamed from: h */
    private int f63346h = -1;

    /* renamed from: i */
    private int f63347i = -1;

    /* renamed from: j */
    private int f63348j = -1;

    /* renamed from: k */
    private CharSequence f63349k;

    /* renamed from: l */
    private CharSequence f63350l = "";

    /* renamed from: m */
    private final TextWatcher f63351m = new C25752a(this);

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.ud_dialog_input_content;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        View onCreateContent = super.onCreateContent();
        if (onCreateContent == null) {
            return null;
        }
        View findViewById = onCreateContent.findViewById(R.id.ud_dialog_content_et);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contextView.findViewById….id.ud_dialog_content_et)");
        EditText editText = (EditText) findViewById;
        editText.setText(this.f63350l);
        editText.addTextChangedListener(this.f63351m);
        int i = this.f63340b;
        if (i != -1) {
            editText.setInputType(i);
        }
        CharSequence charSequence = this.f63349k;
        if (charSequence != null) {
            editText.setHint(charSequence);
        }
        if (this.f63345g != -1) {
            editText.setSingleLine(false);
            editText.setMaxLines(this.f63345g);
        }
        if (this.f63346h != -1) {
            editText.setHintTextColor(UDColorUtils.getColor(getContext(), this.f63346h));
        }
        if (this.f63347i != -1) {
            editText.setTextColor(UDColorUtils.getColor(getContext(), this.f63347i));
        }
        int i2 = this.f63348j;
        if (i2 != -1) {
            editText.setBackgroundResource(i2);
        }
        editText.setSelection(this.f63350l.length());
        setupViewPadding(editText, this.f63341c, this.f63342d, this.f63343e, this.f63344f);
        return onCreateContent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/larksuite/component/universe_design/dialog/UDInputDialogController$mTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.h$a */
    public static final class C25752a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ UDInputDialogController f63352a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25752a(UDInputDialogController hVar) {
            this.f63352a = hVar;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            UDInputDialogBuilder.OnTextChangedListener aVar = this.f63352a.f63339a;
            if (aVar != null) {
                aVar.mo89293a(editable);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDInputDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof UDInputDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            UDInputDialogBuilder gVar = (UDInputDialogBuilder) uDBaseDialogBuilder;
            this.f63340b = gVar.mo90898a();
            this.f63341c = gVar.mo90902b();
            this.f63342d = gVar.mo90905c();
            this.f63343e = gVar.mo90907d();
            this.f63344f = gVar.mo90908e();
            this.f63345g = gVar.mo90909f();
            this.f63346h = gVar.mo90910g();
            this.f63347i = gVar.mo90911h();
            this.f63348j = gVar.mo90912i();
            this.f63349k = gVar.mo90913j();
            this.f63350l = gVar.mo90914k();
            this.f63339a = gVar.mo90915l();
            return;
        }
        throw new IllegalArgumentException(("builder should be UDInputDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
