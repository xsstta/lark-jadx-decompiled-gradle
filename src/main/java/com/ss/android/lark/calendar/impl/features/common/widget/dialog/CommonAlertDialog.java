package com.ss.android.lark.calendar.impl.features.common.widget.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.button.LKUICheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.DialogC57584b;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\fJ\u001e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/dialog/CommonAlertDialog;", "Lcom/ss/android/lark/ui/BaseDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "setCheckBox", "isChecked", "", "checkBoxDesc", "", "setCheckBoxDescColor", "textColor", "", "setCheckBoxDescSize", "textSizeDp", "setConfirmCancelBtn", "cancelText", "confirmText", "clickListener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/dialog/CommonAlertDialog$OnBottomClickListener;", "setContent", "content", "setTitle", "title", "show", "", "OnBottomClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.a.a */
public final class CommonAlertDialog extends DialogC57584b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/dialog/CommonAlertDialog$OnBottomClickListener;", "", "onClickedConfirm", "", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.a.a$a */
    public interface OnBottomClickListener {
        /* renamed from: a */
        void mo112875a(boolean z);
    }

    @Override // com.ss.android.lark.ui.DialogC57584b
    public void show() {
        Window window = getWindow();
        if (window != null) {
            window.getAttributes().width = C57582a.m223601a(getContext(), 300.0f);
        }
        super.show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.a.a$c */
    static final class View$OnClickListenerC31158c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonAlertDialog f78738a;

        View$OnClickListenerC31158c(CommonAlertDialog aVar) {
            this.f78738a = aVar;
        }

        public final void onClick(View view) {
            this.f78738a.dismiss();
        }
    }

    /* renamed from: a */
    public final CommonAlertDialog mo112869a(int i) {
        ((TextView) findViewById(R.id.checkboxDesc)).setTextSize(1, (float) i);
        return this;
    }

    /* renamed from: b */
    public final CommonAlertDialog mo112873b(int i) {
        ((TextView) findViewById(R.id.checkboxDesc)).setTextColor(i);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonAlertDialog(Context context) {
        super(context, 2131886424);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setContentView(R.layout.calendar_common_alert_dialog);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.a.a$b */
    static final class View$OnClickListenerC31157b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonAlertDialog f78737a;

        View$OnClickListenerC31157b(CommonAlertDialog aVar) {
            this.f78737a = aVar;
        }

        public final void onClick(View view) {
            LKUICheckBox lKUICheckBox = (LKUICheckBox) this.f78737a.findViewById(R.id.checkbox);
            Intrinsics.checkExpressionValueIsNotNull(lKUICheckBox, "checkbox");
            ((LKUICheckBox) this.f78737a.findViewById(R.id.checkbox)).setChecked(!lKUICheckBox.isChecked());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.a.a$d */
    static final class View$OnClickListenerC31159d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonAlertDialog f78739a;

        /* renamed from: b */
        final /* synthetic */ OnBottomClickListener f78740b;

        View$OnClickListenerC31159d(CommonAlertDialog aVar, OnBottomClickListener aVar2) {
            this.f78739a = aVar;
            this.f78740b = aVar2;
        }

        public final void onClick(View view) {
            boolean z;
            LinearLayout linearLayout = (LinearLayout) this.f78739a.findViewById(R.id.checkboxContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "checkboxContainer");
            if (linearLayout.getVisibility() == 0) {
                LKUICheckBox lKUICheckBox = (LKUICheckBox) this.f78739a.findViewById(R.id.checkbox);
                Intrinsics.checkExpressionValueIsNotNull(lKUICheckBox, "checkbox");
                if (lKUICheckBox.isChecked()) {
                    z = true;
                    this.f78740b.mo112875a(z);
                }
            }
            z = false;
            this.f78740b.mo112875a(z);
        }
    }

    /* renamed from: a */
    public final CommonAlertDialog mo112870a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        TextView textView = (TextView) findViewById(R.id.dialogTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "dialogTitle");
        textView.setVisibility(0);
        TextView textView2 = (TextView) findViewById(R.id.dialogTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "dialogTitle");
        textView2.setText(str);
        return this;
    }

    /* renamed from: a */
    public final CommonAlertDialog mo112872a(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "checkBoxDesc");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.checkboxContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "checkboxContainer");
        linearLayout.setVisibility(0);
        LKUICheckBox lKUICheckBox = (LKUICheckBox) findViewById(R.id.checkbox);
        Intrinsics.checkExpressionValueIsNotNull(lKUICheckBox, "checkbox");
        lKUICheckBox.setChecked(z);
        TextView textView = (TextView) findViewById(R.id.checkboxDesc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "checkboxDesc");
        textView.setText(str);
        ((LinearLayout) findViewById(R.id.checkboxContainer)).setOnClickListener(new View$OnClickListenerC31157b(this));
        return this;
    }

    /* renamed from: a */
    public final CommonAlertDialog mo112871a(String str, String str2, OnBottomClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(str, "cancelText");
        Intrinsics.checkParameterIsNotNull(str2, "confirmText");
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.doubleBtnContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "doubleBtnContainer");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.cancelBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancelBtn");
        textView.setText(str);
        ((TextView) findViewById(R.id.cancelBtn)).setOnClickListener(new View$OnClickListenerC31158c(this));
        TextView textView2 = (TextView) findViewById(R.id.confirmBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "confirmBtn");
        textView2.setText(str2);
        TextView textView3 = (TextView) findViewById(R.id.confirmBtn);
        if (textView3 != null) {
            textView3.setOnClickListener(new View$OnClickListenerC31159d(this, aVar));
        }
        return this;
    }
}
