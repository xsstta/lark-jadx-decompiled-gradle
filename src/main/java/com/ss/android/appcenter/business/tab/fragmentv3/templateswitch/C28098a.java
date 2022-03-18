package com.ss.android.appcenter.business.tab.fragmentv3.templateswitch;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.p1272c.C27733c;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.a */
public class C28098a extends LarkRecyclerViewBaseAdapter<C28112d, C27733c> {

    /* renamed from: a */
    private String f70376a;

    /* renamed from: b */
    private AbstractC28099a f70377b;

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.a$a */
    public interface AbstractC28099a {
        /* renamed from: a */
        void mo100013a();

        /* renamed from: a */
        void mo100014a(C27733c cVar);
    }

    /* renamed from: a */
    public void mo100022a(String str) {
        this.f70376a = str;
    }

    public C28098a(AbstractC28099a aVar) {
        this.f70377b = aVar;
    }

    /* renamed from: a */
    public void mo100023a(List<C27733c> list) {
        this.items = list;
    }

    /* renamed from: a */
    public C28112d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_template_switch_item, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102753a(C27733c cVar, View view) {
        C28184h.m103250d("TemplateAdapter", "onClick>>> item:" + cVar);
        if (TextUtils.equals(cVar.f69303a, this.f70376a)) {
            this.f70377b.mo100013a();
        } else {
            this.f70377b.mo100014a(cVar);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C28112d dVar, int i) {
        C27733c cVar = (C27733c) C28182f.m103235a(this.items, i, null);
        if (cVar == null) {
            C28184h.m103248b("TemplateAdapter", "onBindViewHolder>>> item is null. may be multithreading error.");
            return;
        }
        ((TextView) dVar.mo100072a(R.id.name)).setText(cVar.f69305c);
        if (TextUtils.equals(cVar.f69303a, this.f70376a)) {
            dVar.itemView.setSelected(true);
        } else {
            dVar.itemView.setSelected(false);
        }
        dVar.itemView.setOnClickListener(new View.OnClickListener(cVar) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.$$Lambda$a$7RQSM9QKC6KXrUMX_gfUrnVVtpQ */
            public final /* synthetic */ C27733c f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C28098a.this.m102753a((C28098a) this.f$1, (C27733c) view);
            }
        });
    }
}
