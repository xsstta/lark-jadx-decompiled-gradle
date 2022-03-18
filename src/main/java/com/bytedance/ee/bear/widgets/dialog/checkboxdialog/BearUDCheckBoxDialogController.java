package com.bytedance.ee.bear.widgets.dialog.checkboxdialog;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0012\u001a\u00020\u0013\"\u000e\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0014J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/checkboxdialog/BearUDCheckBoxDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mCheckStateListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mHint", "", "mHintColor", "", "getMHintColor$ccm_widget_release", "()I", "setMHintColor$ccm_widget_release", "(I)V", "mIsChecked", "", "mShowCheckbox", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultContentRes", "onCreateContent", "Landroid/view/View;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.dialog.a.b */
public final class BearUDCheckBoxDialogController extends UDDialogController {

    /* renamed from: a */
    private boolean f31923a;

    /* renamed from: b */
    private CharSequence f31924b = "";

    /* renamed from: c */
    private int f31925c = -1;

    /* renamed from: d */
    private boolean f31926d = true;

    /* renamed from: e */
    private CompoundButton.OnCheckedChangeListener f31927e;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.bear_ud_dialog_check_box_content;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        int i;
        View onCreateContent = super.onCreateContent();
        if (onCreateContent == null) {
            return null;
        }
        CheckBox checkBox = (CheckBox) onCreateContent.findViewById(R.id.ud_dialog_checkbox);
        if (checkBox != null) {
            checkBox.setChecked(this.f31923a);
            checkBox.setOnCheckedChangeListener(this.f31927e);
        }
        TextView textView = (TextView) onCreateContent.findViewById(R.id.ud_dialog_checkbox_hint);
        if (textView != null) {
            textView.setText(this.f31924b);
        }
        if (textView != null) {
            textView.setOnClickListener(new C11833a(checkBox));
        }
        if (!(this.f31925c == -1 || textView == null)) {
            textView.setTextColor(UDColorUtils.getColor(getContext(), this.f31925c));
        }
        LinearLayout linearLayout = (LinearLayout) onCreateContent.findViewById(R.id.ud_dialog_checkbox_layout);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C11834b(checkBox));
        }
        if (linearLayout != null) {
            if (this.f31926d) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
        return onCreateContent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/widgets/dialog/checkboxdialog/BearUDCheckBoxDialogController$onCreateContent$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.a.b$a */
    public static final class C11833a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ CheckBox f31928a;

        C11833a(CheckBox checkBox) {
            this.f31928a = checkBox;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            boolean z;
            CheckBox checkBox = this.f31928a;
            if (checkBox != null) {
                if (checkBox != null) {
                    z = checkBox.isChecked();
                } else {
                    z = false;
                }
                checkBox.setChecked(!z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/widgets/dialog/checkboxdialog/BearUDCheckBoxDialogController$onCreateContent$4", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.a.b$b */
    public static final class C11834b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ CheckBox f31929a;

        C11834b(CheckBox checkBox) {
            this.f31929a = checkBox;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            boolean z;
            CheckBox checkBox = this.f31929a;
            if (checkBox != null) {
                if (checkBox != null) {
                    z = checkBox.isChecked();
                } else {
                    z = false;
                }
                checkBox.setChecked(!z);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BearUDCheckBoxDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof BearUDCheckBoxDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            BearUDCheckBoxDialogBuilder aVar = (BearUDCheckBoxDialogBuilder) uDBaseDialogBuilder;
            this.f31923a = aVar.mo45381a();
            this.f31924b = aVar.mo45383b();
            this.f31925c = aVar.mo45384c();
            this.f31926d = aVar.mo45385d();
            this.f31927e = aVar.mo45386e();
            return;
        }
        throw new IllegalArgumentException(("builder should be BearUDCheckBoxDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
