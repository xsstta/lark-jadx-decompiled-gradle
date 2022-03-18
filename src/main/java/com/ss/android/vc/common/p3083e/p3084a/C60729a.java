package com.ss.android.vc.common.p3083e.p3084a;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;

/* renamed from: com.ss.android.vc.common.e.a.a */
public class C60729a extends UDBaseDialogBuilder<C60729a> {

    /* renamed from: a */
    public int f151901a;

    /* renamed from: b */
    public Long f151902b;

    /* renamed from: c */
    public Long f151903c;

    /* renamed from: d */
    public DialogInterface.OnClickListener f151904d;

    /* renamed from: a */
    public C60729a mo208353a(int i) {
        this.f151901a = i;
        return this;
    }

    /* renamed from: a */
    public C60729a mo208354a(long j) {
        this.f151902b = Long.valueOf(j);
        return this;
    }

    /* renamed from: b */
    public C60729a mo208356b(long j) {
        this.f151903c = Long.valueOf(j);
        return this;
    }

    public C60729a(Context context) {
        super(context);
        controller(new AutoEndConfirmDialogController(context));
    }

    /* renamed from: a */
    public C60729a mo208355a(DialogInterface.OnClickListener onClickListener) {
        this.f151904d = onClickListener;
        return this;
    }
}
