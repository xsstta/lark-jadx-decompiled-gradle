package com.bytedance.ee.bear.widgets.dialog.inputdialog;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010!\u001a\u00020\"\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H#0$2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\nH\u0014J\n\u0010)\u001a\u0004\u0018\u00010*H\u0014J\n\u0010+\u001a\u0004\u0018\u00010*H\u0014J\b\u0010,\u001a\u00020\"H\u0016J\b\u0010-\u001a\u00020\"H\u0016J\u0010\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mDisablePrimaryBtnWhenInputEmpty", "", "mEditText", "", "mEditTextBackgroundRes", "", "mEditTextColor", "mEditTextHint", "mEditTextHintColor", "mEditTextMaxLine", "mEditTextPaddingBottom", "mEditTextPaddingLeft", "mEditTextPaddingRight", "mEditTextPaddingTop", "mEditTextSelection", "mInputEt", "Lcom/larksuite/component/universe_design/edittext/UDEditText;", "mInputType", "mOnTextChangedListener", "Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnTextChangedListener;", "mPrimaryBtn", "Landroid/widget/Button;", "mPrimaryBtnClickListener", "Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnBtnClickListener;", "mSecondaryBtnClickListener", "mShowClearBtn", "mShowKeyBoardRunnable", "Ljava/lang/Runnable;", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultContentRes", "onCreateContent", "Landroid/view/View;", "onCreateFooter", "onDismiss", "onShow", "setPrimaryBtnStatus", "s", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.dialog.b.b */
public final class BearUDInputDialogController extends UDDialogController {

    /* renamed from: a */
    public BearUDInputDialogBuilder.OnTextChangedListener f31948a;

    /* renamed from: b */
    public boolean f31949b = true;

    /* renamed from: c */
    public BearUDInputDialogBuilder.OnBtnClickListener f31950c;

    /* renamed from: d */
    public BearUDInputDialogBuilder.OnBtnClickListener f31951d;

    /* renamed from: e */
    public UDEditText f31952e;

    /* renamed from: f */
    private int f31953f = -1;

    /* renamed from: g */
    private int f31954g = -1;

    /* renamed from: h */
    private int f31955h = -1;

    /* renamed from: i */
    private int f31956i = -1;

    /* renamed from: j */
    private int f31957j = -1;

    /* renamed from: k */
    private int f31958k = -1;

    /* renamed from: l */
    private int f31959l = -1;

    /* renamed from: m */
    private int f31960m = -1;

    /* renamed from: n */
    private int f31961n = -1;

    /* renamed from: o */
    private CharSequence f31962o;

    /* renamed from: p */
    private CharSequence f31963p = "";

    /* renamed from: q */
    private int f31964q = -1;

    /* renamed from: r */
    private boolean f31965r;

    /* renamed from: s */
    private Button f31966s;

    /* renamed from: t */
    private Runnable f31967t = new RunnableC11835a(this);

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.ud_dialog_input_content;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback, com.larksuite.component.universe_design.dialog.UDDialogController
    public void onDismiss() {
        super.onDismiss();
        UDEditText uDEditText = this.f31952e;
        if (uDEditText != null) {
            uDEditText.removeCallbacks(this.f31967t);
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback, com.larksuite.component.universe_design.dialog.UDDialogController
    public void onShow() {
        super.onShow();
        UDEditText uDEditText = this.f31952e;
        if (uDEditText != null) {
            uDEditText.postDelayed(this.f31967t, 300);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.b.b$a */
    static final class RunnableC11835a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BearUDInputDialogController f31968a;

        RunnableC11835a(BearUDInputDialogController bVar) {
            this.f31968a = bVar;
        }

        public final void run() {
            UDDialog mDialog = this.f31968a.getMDialog();
            if (mDialog != null && mDialog.isShowing()) {
                C10548d.m43703b(this.f31968a.f31952e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateFooter() {
        Button button;
        View onCreateFooter = super.onCreateFooter();
        View view = null;
        if (this.f31950c != null) {
            if (onCreateFooter != null) {
                button = (Button) onCreateFooter.findViewById(R.id.ud_dialog_btn_primary);
            } else {
                button = null;
            }
            this.f31966s = button;
            if (button != null) {
                button.setOnClickListener(new C11837c(button, this));
            }
            mo45418a(this.f31963p);
        }
        if (this.f31951d != null) {
            if (onCreateFooter != null) {
                view = onCreateFooter.findViewById(R.id.ud_dialog_btn_secondary);
            }
            if (view != null) {
                view.setOnClickListener(new C11838d(view, this));
            }
        }
        return onCreateFooter;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        boolean z;
        View onCreateContent = super.onCreateContent();
        if (onCreateContent == null) {
            return null;
        }
        View findViewById = onCreateContent.findViewById(R.id.ud_dialog_content_et);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contextView.findViewById….id.ud_dialog_content_et)");
        UDEditText uDEditText = (UDEditText) findViewById;
        this.f31952e = uDEditText;
        uDEditText.setText(this.f31963p);
        uDEditText.addTextChangedListener(new C11836b(this, uDEditText));
        setupViewPadding(uDEditText, this.f31954g, this.f31955h, this.f31956i, this.f31957j);
        boolean z2 = true;
        if (this.f31949b) {
            if (this.f31963p.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            uDEditText.mo90926a(z);
        }
        int i = this.f31953f;
        if (i != -1) {
            uDEditText.setInputType(i);
        }
        CharSequence charSequence = this.f31962o;
        if (charSequence != null) {
            uDEditText.setHint(charSequence);
        }
        int i2 = this.f31958k;
        if (i2 != -1) {
            uDEditText.setMaxLines(i2);
        }
        if (this.f31959l != -1) {
            uDEditText.setHintTextColor(UDColorUtils.getColor(getContext(), this.f31959l));
        }
        if (this.f31960m != -1) {
            uDEditText.setTextColor(UDColorUtils.getColor(getContext(), this.f31960m));
        }
        int i3 = this.f31961n;
        if (i3 != -1) {
            uDEditText.setBackgroundResource(i3);
        }
        int i4 = this.f31964q;
        if (i4 == -1 || i4 > this.f31963p.length()) {
            uDEditText.setSelection(this.f31963p.length());
        } else {
            uDEditText.setSelection(this.f31964q);
        }
        CharSequence mMessage = getMMessage();
        if (!(mMessage == null || mMessage.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            TextView textView = (TextView) onCreateContent.findViewById(R.id.ud_dialog_content_message_tv);
            if (textView != null) {
                textView.setVisibility(8);
            }
            ViewGroup.LayoutParams layoutParams = uDEditText.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return onCreateContent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogController$onCreateContent$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.b.b$b */
    public static final class C11836b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ BearUDInputDialogController f31969a;

        /* renamed from: b */
        final /* synthetic */ UDEditText f31970b;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(editable, "s");
            BearUDInputDialogBuilder.OnTextChangedListener bVar = this.f31969a.f31948a;
            if (bVar != null) {
                bVar.mo45417a(editable);
            }
            Editable editable2 = editable;
            this.f31969a.mo45418a(editable2);
            if (this.f31969a.f31949b) {
                UDEditText uDEditText = this.f31970b;
                if (editable2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                uDEditText.mo90926a(z);
            }
        }

        C11836b(BearUDInputDialogController bVar, UDEditText uDEditText) {
            this.f31969a = bVar;
            this.f31970b = uDEditText;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogController$onCreateFooter$1$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.b.b$c */
    public static final class C11837c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ Button f31971a;

        /* renamed from: b */
        final /* synthetic */ BearUDInputDialogController f31972b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            String str;
            UDDialog mDialog;
            Editable text;
            UDEditText uDEditText = this.f31972b.f31952e;
            if (uDEditText == null || (text = uDEditText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            BearUDInputDialogBuilder.OnBtnClickListener aVar = this.f31972b.f31950c;
            if (aVar != null) {
                aVar.onClick(str);
            }
            C10548d.m43696a(this.f31971a.getContext());
            if (this.f31972b.getMAutoDismiss() && (mDialog = this.f31972b.getMDialog()) != null) {
                mDialog.dismiss();
            }
        }

        C11837c(Button button, BearUDInputDialogController bVar) {
            this.f31971a = button;
            this.f31972b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogController$onCreateFooter$2$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.b.b$d */
    public static final class C11838d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ View f31973a;

        /* renamed from: b */
        final /* synthetic */ BearUDInputDialogController f31974b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            String str;
            UDDialog mDialog;
            Editable text;
            UDEditText uDEditText = this.f31974b.f31952e;
            if (uDEditText == null || (text = uDEditText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            BearUDInputDialogBuilder.OnBtnClickListener aVar = this.f31974b.f31951d;
            if (aVar != null) {
                aVar.onClick(str);
            }
            C10548d.m43696a(this.f31973a.getContext());
            if (this.f31974b.getMAutoDismiss() && (mDialog = this.f31974b.getMDialog()) != null) {
                mDialog.dismiss();
            }
        }

        C11838d(View view, BearUDInputDialogController bVar) {
            this.f31973a = view;
            this.f31974b = bVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BearUDInputDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (android.text.TextUtils.equals(r3.f31963p, r4) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.length() > 0) goto L_0x0022;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45418a(java.lang.CharSequence r4) {
        /*
            r3 = this;
            boolean r0 = r3.f31965r
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000d
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0021
            goto L_0x0022
        L_0x000d:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0021
            java.lang.CharSequence r0 = r3.f31963p
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            android.widget.Button r4 = r3.f31966s
            if (r4 == 0) goto L_0x0029
            r4.setEnabled(r1)
        L_0x0029:
            if (r1 == 0) goto L_0x002f
            r4 = 2131100966(0x7f060526, float:1.7814328E38)
            goto L_0x0032
        L_0x002f:
            r4 = 2131100961(0x7f060521, float:1.7814318E38)
        L_0x0032:
            android.widget.Button r0 = r3.f31966s
            if (r0 == 0) goto L_0x0045
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r4 = r1.getColor(r4)
            r0.setTextColor(r4)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogController.mo45418a(java.lang.CharSequence):void");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof BearUDInputDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            BearUDInputDialogBuilder aVar = (BearUDInputDialogBuilder) uDBaseDialogBuilder;
            this.f31953f = aVar.mo45389a();
            this.f31954g = aVar.mo45394b();
            this.f31955h = aVar.mo45398c();
            this.f31956i = aVar.mo45401d();
            this.f31957j = aVar.mo45404e();
            this.f31958k = aVar.mo45405f();
            this.f31959l = aVar.mo45406g();
            this.f31960m = aVar.mo45407h();
            this.f31961n = aVar.mo45408i();
            this.f31962o = aVar.mo45409j();
            this.f31963p = aVar.mo45410k();
            this.f31964q = aVar.mo45411l();
            this.f31948a = aVar.mo45414o();
            this.f31949b = aVar.mo45412m();
            this.f31965r = aVar.mo45413n();
            this.f31950c = aVar.mo45415p();
            this.f31951d = aVar.mo45416q();
            Resources resources = getContext().getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            Configuration configuration = resources.getConfiguration();
            if (configuration != null && configuration.orientation == 2) {
                setMWidth(286.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("builder should be BearUDInputDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
