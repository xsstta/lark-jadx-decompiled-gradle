package com.ss.android.vc.common.widget.p3087c;

import android.content.Context;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.maxwidthdialog.LKVCJumpMaxWidthDialogController;

/* renamed from: com.ss.android.vc.common.widget.c.a */
public class C60851a extends UDBaseDialogBuilder<C60851a> {

    /* renamed from: a */
    protected TextView f152329a;

    /* renamed from: b */
    protected String f152330b = "";

    /* renamed from: c */
    protected LKVCJumpMaxWidthDialogController.OnJumpListener f152331c;

    public C60851a(Context context) {
        super(context);
        controller(new LKVCJumpMaxWidthDialogController(context));
        style(R.style.VcLarkUIDialog);
        marginInDp(36);
    }

    /* renamed from: a */
    public C60851a mo208658a(String str, LKVCJumpMaxWidthDialogController.OnJumpListener aVar) {
        message(str);
        this.f152330b = str;
        this.f152331c = aVar;
        return this;
    }
}
