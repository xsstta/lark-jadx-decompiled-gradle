package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27923c;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.a.a */
public class C27904a extends LarkRecyclerViewBaseAdapter<C28112d, AbstractC27922b> {

    /* renamed from: a */
    private AbstractC27905a f69759a;

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.a.a$a */
    public interface AbstractC27905a {
        /* renamed from: a */
        void mo99498a();
    }

    public C27904a(AbstractC27905a aVar) {
        this.f69759a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101855a(AbstractC27922b bVar, View view) {
        bVar.mo99547b().onClick(view);
        if (bVar instanceof C27923c) {
            C27710b.m101326z("custom");
        }
        this.f69759a.mo99498a();
    }

    /* renamed from: a */
    public C28112d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_item_menu_action_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C28112d dVar, int i) {
        AbstractC27922b bVar = (AbstractC27922b) getItem(i);
        Context context = dVar.itemView.getContext();
        TextView textView = (TextView) dVar.mo100072a(R.id.tv_menu_text);
        textView.setText(bVar.mo99548c(context));
        boolean a = bVar.mo99546a();
        View a2 = dVar.mo100072a(R.id.bg_wrapper);
        if (!a) {
            a2.setBackgroundResource(R.drawable.workplace_item_menu_press_selector);
        }
        if (a) {
            textView.setTextColor(UDColorUtils.getColor(context, R.color.text_disable));
        } else {
            textView.setTextColor(UDColorUtils.getColor(context, R.color.text_title));
        }
        bVar.mo99545a((LKUIRoundedImageView2) dVar.mo100072a(R.id.iv_menu_icon));
        dVar.itemView.setOnClickListener(new View.OnClickListener(bVar) {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.$$Lambda$a$8ejTEndctGmHnnw98iG6AIxLDs */
            public final /* synthetic */ AbstractC27922b f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27904a.m270208lambda$8ejTEndctGmHnnw98iG6AIxLDs(C27904a.this, this.f$1, view);
            }
        });
    }
}
