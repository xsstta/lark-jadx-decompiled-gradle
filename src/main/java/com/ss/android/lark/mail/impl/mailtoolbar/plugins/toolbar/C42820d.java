package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.toolbar.AbstractC6207c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.MailTxtAttrId;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42816c;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42822e;
import com.ss.android.lark.mail.impl.widget.C43992a;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.d */
public class C42820d extends AbstractC6207c {

    /* renamed from: c */
    static final /* synthetic */ boolean f109008c = true;

    /* renamed from: d */
    private C42822e f109009d;

    /* renamed from: e */
    private TextView f109010e;

    /* renamed from: f */
    private ImageView f109011f;

    /* renamed from: g */
    private C42816c f109012g;

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: i */
    public View mo22135i() {
        Context context = getContext();
        if (f109008c || context != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.mail_select_font_fragment, (ViewGroup) null);
            this.f109010e = (TextView) inflate.findViewById(R.id.title);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.select_font_back_button);
            this.f109011f = imageView;
            imageView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42820d.C428211 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C42820d.this.mo5513b();
                }
            });
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.fontList);
            C42816c cVar = new C42816c();
            this.f109012g = cVar;
            recyclerView.setAdapter(cVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.addItemDecoration(new C43992a.C43994a(context).mo156557c(R.color.line_divider_default).mo156554a(R.dimen.mail_divider_height).mo156556b(R.dimen.mail_home_list_padding).mo156555a());
            this.f109012g.mo153716a(new C42816c.AbstractC42818a() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.$$Lambda$d$NDCAZAQNLquWSoNOLNA3KrIexaQ */

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42816c.AbstractC42818a
                public final void onFontSelected(MailTxtAttrId mailTxtAttrId) {
                    C42820d.lambda$NDCAZAQNLquWSoNOLNA3KrIexaQ(C42820d.this, mailTxtAttrId);
                }
            });
            this.f109009d.getSelectParam().mo5923a(this, new AbstractC1178x(recyclerView) {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.$$Lambda$d$dTn74RBkB2oHDvcksJQ3O9Hszo */
                public final /* synthetic */ RecyclerView f$1;

                {
                    this.f$1 = r2;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C42820d.m270773lambda$dTn74RBkB2oHDvcksJQ3O9Hszo(C42820d.this, this.f$1, (C42822e.C42824b) obj);
                }
            });
            return inflate;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m170642a(MailTxtAttrId mailTxtAttrId) {
        this.f109009d.fontSelected(mailTxtAttrId);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f109008c || activity != null) {
            this.f109009d = (C42822e) aj.m5366a(activity).mo6005a(C42822e.class);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m170641a(RecyclerView recyclerView, C42822e.C42824b bVar) {
        if (bVar != null) {
            this.f109010e.setText(bVar.f109014a);
            this.f109012g.mo153718a(bVar.f109016c, bVar.f109015b);
            recyclerView.scrollToPosition(this.f109012g.mo153714a());
        }
    }
}
