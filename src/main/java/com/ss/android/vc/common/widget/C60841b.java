package com.ss.android.vc.common.widget;

import android.content.Context;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.LKVCJumpDialogController;

/* renamed from: com.ss.android.vc.common.widget.b */
public class C60841b extends C25639g<C60841b> {

    /* renamed from: a */
    protected String f152266a = "";

    /* renamed from: i */
    protected LKVCJumpDialogController.OnJumpListener f152267i;

    /* renamed from: j */
    protected final C60842a f152268j;

    /* renamed from: k */
    protected int f152269k;

    /* renamed from: com.ss.android.vc.common.widget.b$a */
    public static class C60842a extends UDBaseDialogBuilder<C60842a> {

        /* renamed from: a */
        protected TextView f152270a;

        /* renamed from: b */
        protected String f152271b = "";

        /* renamed from: c */
        protected LKVCJumpDialogController.OnJumpListener f152272c;

        /* renamed from: d */
        protected int f152273d;

        public C60842a(Context context) {
            super(context);
            controller(new LKVCJumpDialogController(context));
            style(R.style.VcLarkUIDialog);
            marginInDp(36);
        }

        /* renamed from: a */
        public C60842a mo208635a(String str, LKVCJumpDialogController.OnJumpListener aVar, int i) {
            message(str);
            this.f152271b = str;
            this.f152272c = aVar;
            this.f152273d = i;
            return this;
        }
    }

    public C60841b(Context context) {
        super(context);
        C60842a aVar = new C60842a(context);
        this.f152268j = aVar;
        mo89232a(new LKVCJumpDialogController(context));
        mo89231a(aVar);
        mo89265x(R.style.VcLarkUIDialog);
        mo89261t(36);
        this.f62586f = true;
    }

    /* renamed from: a */
    public C60841b mo208633a(String str, LKVCJumpDialogController.OnJumpListener aVar) {
        mo89242c(str);
        this.f152266a = str;
        this.f152267i = aVar;
        this.f152269k = 0;
        this.f152268j.mo208635a(str, aVar, 0);
        return this;
    }

    /* renamed from: a */
    public C60841b mo208634a(String str, LKVCJumpDialogController.OnJumpListener aVar, int i) {
        mo89242c(str);
        this.f152266a = str;
        this.f152267i = aVar;
        this.f152269k = i;
        this.f152268j.mo208635a(str, aVar, i);
        return this;
    }
}
