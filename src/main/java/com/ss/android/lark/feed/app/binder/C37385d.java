package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.entity.NoticeHeaderPreview;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.view.C37996h;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.feed.app.binder.d */
public class C37385d implements AbstractC37406i<NoticeHeaderPreview, C37387a, AbstractC37628k> {

    /* renamed from: a */
    public AbstractC37628k f95923a;

    /* renamed from: b */
    private Context f95924b;

    /* renamed from: com.ss.android.lark.feed.app.binder.d$a */
    public static class C37387a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f95926a;

        /* renamed from: b */
        TextView f95927b;

        public C37387a(View view) {
            super(view);
            this.f95926a = view.findViewById(R.id.tip_holder);
            this.f95927b = (TextView) view.findViewById(R.id.tv_delayed);
        }
    }

    /* renamed from: a */
    private void m147159a(C37387a aVar, NoticeHeaderPreview noticeHeaderPreview) {
        if (aVar.f95927b.getVisibility() == 0) {
            aVar.f95926a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.binder.C37385d.View$OnClickListenerC373861 */

                public void onClick(View view) {
                    if (C37385d.this.f95923a.mo138037d() != null) {
                        C37385d.this.f95923a.mo138037d().mo138949a();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public C37387a mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        this.f95924b = viewGroup.getContext();
        return new C37387a(bVar.mo137128a(C37996h.class, viewGroup.getContext()));
    }

    /* renamed from: a */
    public void mo137226a(C37387a aVar, NoticeHeaderPreview noticeHeaderPreview, AbstractC37628k kVar, int i) {
        boolean z;
        this.f95923a = kVar;
        if (noticeHeaderPreview.getDelayCount() > 0) {
            aVar.f95927b.setVisibility(0);
            aVar.f95927b.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MarkForLaterHeader, "count", Integer.toString(noticeHeaderPreview.getDelayCount())));
            z = true;
        } else {
            aVar.f95927b.setVisibility(8);
            z = false;
        }
        Drawable drawable = this.f95924b.getResources().getDrawable(R.drawable.feed_menu_delay_solid);
        drawable.setBounds(0, 0, UIUtils.dp2px(this.f95924b, 14.0f), UIUtils.dp2px(this.f95924b, 14.0f));
        aVar.f95927b.setCompoundDrawables(drawable, null, null, null);
        if (!z) {
            aVar.f95926a.setVisibility(8);
        } else {
            aVar.f95926a.setVisibility(0);
        }
        m147159a(aVar, noticeHeaderPreview);
    }
}
