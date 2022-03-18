package com.ss.android.vc.common.widget.p3087c;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.vc.common.widget.c.c */
public class C60854c extends UDBaseDialogBuilder<C60854c> {

    /* renamed from: a */
    protected float f152341a = -1.0f;

    /* renamed from: b */
    private Context f152342b;

    public C60854c(Context context) {
        super(context);
        this.f152342b = context;
        controller(new MaxWidthContentDialogController(context));
        style(R.style.VcLarkUIDialog);
        marginInDp(36);
    }
}
