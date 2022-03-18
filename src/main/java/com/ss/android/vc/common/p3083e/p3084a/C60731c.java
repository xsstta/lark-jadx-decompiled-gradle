package com.ss.android.vc.common.p3083e.p3084a;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.vc.common.e.a.c */
public class C60731c extends UDBaseDialogBuilder {

    /* renamed from: a */
    public String f151914a;

    /* renamed from: b */
    public int f151915b;

    public C60731c(Context context) {
        super(context);
        controller(new ShareSecurityDialogController(context));
        style(R.style.VcLarkUIDialog);
        marginInDp(36);
    }

    /* renamed from: a */
    public C60731c mo208359a(String str, int i) {
        this.f151914a = str;
        this.f151915b = i;
        return this;
    }
}
