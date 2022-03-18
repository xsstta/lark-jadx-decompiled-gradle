package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\r\u001a\u00020\u000e\"\u000e\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDCheckBoxDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkedChangeListener", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "mCheckStateListener", "mHint", "", "mIsChecked", "", "mRequireCheck", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultContentRes", "", "onCreateContent", "Landroid/view/View;", "onCreateFooter", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.dialog.d */
public class UDCheckBoxDialogController extends UDDialogController {

    /* renamed from: a */
    public boolean f63319a;

    /* renamed from: b */
    public UDCheckBox.OnCheckedChangeListener f63320b;

    /* renamed from: c */
    public UDCheckBox.OnCheckedChangeListener f63321c;

    /* renamed from: d */
    private CharSequence f63322d = "";

    /* renamed from: e */
    private boolean f63323e;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.ud_dialog_checkbox_content;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateFooter() {
        View onCreateFooter = super.onCreateFooter();
        if (onCreateFooter == null) {
            return null;
        }
        View findViewById = onCreateFooter.findViewById(R.id.ud_dialog_btn_primary);
        if (this.f63323e && findViewById != null) {
            findViewById.setEnabled(this.f63319a);
            this.f63320b = new C25750b(findViewById);
        }
        return onCreateFooter;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        TextView textView;
        View onCreateContent = super.onCreateContent();
        if (onCreateContent == null) {
            return null;
        }
        if (TextUtils.isEmpty(getMMessage()) && (textView = (TextView) onCreateContent.findViewById(R.id.ud_dialog_content_message_tv)) != null) {
            textView.setVisibility(8);
        }
        UDCheckBox uDCheckBox = (UDCheckBox) onCreateContent.findViewById(R.id.ud_dialog_checkbox);
        if (uDCheckBox != null) {
            uDCheckBox.setChecked(this.f63319a);
            uDCheckBox.setOnCheckedChangeListener(new C25749a(this));
        }
        TextView textView2 = (TextView) onCreateContent.findViewById(R.id.ud_dialog_checkbox_hint);
        if (textView2 != null) {
            textView2.setText(this.f63322d);
        }
        return onCreateContent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/larksuite/component/universe_design/dialog/UDCheckBoxDialogController$onCreateContent$1$1", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.d$a */
    public static final class C25749a implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ UDCheckBoxDialogController f63324a;

        C25749a(UDCheckBoxDialogController dVar) {
            this.f63324a = dVar;
        }

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            this.f63324a.f63319a = z;
            UDCheckBox.OnCheckedChangeListener gVar = this.f63324a.f63320b;
            if (gVar != null) {
                gVar.onCheckedChanged(uDCheckBox, z);
            }
            UDCheckBox.OnCheckedChangeListener gVar2 = this.f63324a.f63321c;
            if (gVar2 != null) {
                gVar2.onCheckedChanged(uDCheckBox, z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/universe_design/dialog/UDCheckBoxDialogController$onCreateFooter$1", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.d$b */
    public static final class C25750b implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f63325a;

        C25750b(View view) {
            this.f63325a = view;
        }

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            this.f63325a.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDCheckBoxDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof UDCheckBoxDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            UDCheckBoxDialogBuilder cVar = (UDCheckBoxDialogBuilder) uDBaseDialogBuilder;
            this.f63319a = cVar.mo90894a();
            this.f63322d = cVar.mo90895b();
            this.f63323e = cVar.mo90896c();
            this.f63321c = cVar.mo90897d();
            return;
        }
        throw new IllegalArgumentException(("builder should be UDCheckBoxDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
