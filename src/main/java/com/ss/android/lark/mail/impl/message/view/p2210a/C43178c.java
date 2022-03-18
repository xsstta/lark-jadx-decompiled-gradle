package com.ss.android.lark.mail.impl.message.view.p2210a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.uiframework.view.actionbar.AbstractC43712b;

/* renamed from: com.ss.android.lark.mail.impl.message.view.a.c */
public class C43178c extends AbstractC43712b {

    /* renamed from: a */
    public View f109913a;

    /* renamed from: b */
    public TextView f109914b;

    /* renamed from: c */
    public ImageView f109915c;

    /* renamed from: d */
    private Context f109916d;

    @Override // com.ss.android.lark.mail.impl.uiframework.view.actionbar.AbstractC43712b
    /* renamed from: a */
    public View mo154561a() {
        return this.f109913a;
    }

    /* renamed from: a */
    private void m171627a(int i) {
        View inflate = LayoutInflater.from(this.f109916d).inflate(i, (ViewGroup) null);
        this.f109913a = inflate;
        this.f109914b = (TextView) inflate.findViewById(R.id.mail_messagelist_bottombar_name);
        this.f109915c = (ImageView) this.f109913a.findViewById(R.id.mail_messagelist_bottombar_icon);
    }

    public C43178c(Context context, int i) {
        this.f109916d = context;
        m171627a(i);
    }
}
