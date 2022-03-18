package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.MailTxtAttrId;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.c */
public class C42816c extends RecyclerView.Adapter<C42819b> {

    /* renamed from: a */
    public AbstractC42818a f108998a;

    /* renamed from: b */
    private int f108999b;

    /* renamed from: c */
    private MailTxtAttrId[] f109000c;

    /* renamed from: d */
    private MailTxtAttrId f109001d;

    /* renamed from: e */
    private int f109002e;

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.c$a */
    public interface AbstractC42818a {
        void onFontSelected(MailTxtAttrId mailTxtAttrId);
    }

    /* renamed from: a */
    public int mo153714a() {
        return this.f109002e;
    }

    /* renamed from: b */
    public int mo153719b() {
        int i = this.f108999b;
        if (i == 0) {
            return R.layout.select_font_item;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        MailTxtAttrId[] mailTxtAttrIdArr = this.f109000c;
        if (mailTxtAttrIdArr == null) {
            return 0;
        }
        return mailTxtAttrIdArr.length;
    }

    /* renamed from: c */
    private void m170633c() {
        int i = 0;
        this.f109002e = 0;
        while (true) {
            MailTxtAttrId[] mailTxtAttrIdArr = this.f109000c;
            if (i >= mailTxtAttrIdArr.length) {
                return;
            }
            if (mailTxtAttrIdArr[i] == this.f109001d) {
                this.f109002e = i;
                return;
            }
            i++;
        }
    }

    /* renamed from: a */
    public void mo153716a(AbstractC42818a aVar) {
        this.f108998a = aVar;
    }

    /* renamed from: a */
    public void mo153718a(MailTxtAttrId[] mailTxtAttrIdArr, MailTxtAttrId mailTxtAttrId) {
        this.f109000c = mailTxtAttrIdArr;
        this.f109001d = mailTxtAttrId;
        m170633c();
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.c$b */
    public class C42819b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f109005a;

        /* renamed from: b */
        ImageView f109006b;

        C42819b(View view) {
            super(view);
            this.f109005a = (TextView) view.findViewById(R.id.fontName);
            this.f109006b = (ImageView) view.findViewById(R.id.fontSelected);
        }
    }

    /* renamed from: a */
    public C42819b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C42819b(LayoutInflater.from(viewGroup.getContext()).inflate(mo153719b(), viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C42819b bVar, int i) {
        boolean z;
        final MailTxtAttrId mailTxtAttrId = this.f109000c[i];
        bVar.f109005a.setText(mailTxtAttrId.getFontName());
        bVar.f109005a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42816c.C428171 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C42816c.this.f108998a != null) {
                    C42816c.this.f108998a.onFontSelected(mailTxtAttrId);
                }
            }
        });
        TextView textView = bVar.f109005a;
        if (mailTxtAttrId == this.f109001d) {
            z = true;
        } else {
            z = false;
        }
        textView.setSelected(z);
        if (mailTxtAttrId == this.f109001d) {
            bVar.f109006b.setVisibility(0);
        } else {
            bVar.f109006b.setVisibility(8);
        }
    }
}
