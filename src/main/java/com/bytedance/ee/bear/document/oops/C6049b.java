package com.bytedance.ee.bear.document.oops;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.oops.b */
public class C6049b extends UDDialogController {

    /* renamed from: a */
    private String f16921a;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateFooter() {
        View onCreateFooter = super.onCreateFooter();
        onCreateFooter.findViewById(R.id.ud_dialog_secondary_btn_divider3).setVisibility(onCreateFooter.findViewById(R.id.ud_dialog_btn_secondary3).getVisibility());
        return onCreateFooter;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        View onCreateContent = super.onCreateContent();
        boolean z = !TextUtils.isEmpty(this.f16921a);
        TextView textView = (TextView) onCreateContent.findViewById(R.id.ud_dialog_content_code_tv);
        if (z) {
            textView.setText(this.f16921a);
        } else {
            textView.setVisibility(8);
        }
        return onCreateContent;
    }

    public C6049b(Context context) {
        super(context);
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        if (uDBaseDialogBuilder instanceof C6048a) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            this.f16921a = ((C6048a) uDBaseDialogBuilder).mo24421a();
            return;
        }
        throw new IllegalArgumentException("builder should be OopsDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName());
    }
}
