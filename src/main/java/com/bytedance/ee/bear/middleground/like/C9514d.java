package com.bytedance.ee.bear.middleground.like;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.facade.common.widget.RoundImageView;
import com.bytedance.ee.bear.middleground.like.C9512c;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9510c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p705h.C13666a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.like.d */
public class C9514d extends RecyclerView.Adapter<C9515a> {

    /* renamed from: a */
    private C9512c f25556a = new C9512c();

    /* renamed from: b */
    private LayoutInflater f25557b;

    /* renamed from: c */
    private Context f25558c;

    /* renamed from: d */
    private String f25559d;

    /* renamed from: e */
    private AbstractC9510c f25560e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25556a.f25547a.size();
    }

    /* renamed from: a */
    public void mo36392a(AbstractC9510c cVar) {
        this.f25560e = cVar;
    }

    /* renamed from: a */
    public void mo36393a(C9512c cVar) {
        this.f25556a = cVar;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.like.d$a */
    public static class C9515a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RoundImageView f25561a;

        /* renamed from: b */
        CustomTitleView f25562b;

        /* renamed from: c */
        TextView f25563c;

        C9515a(View view) {
            super(view);
            this.f25561a = (RoundImageView) view.findViewById(R.id.like_list_item_icon);
            this.f25562b = (CustomTitleView) view.findViewById(R.id.like_list_item_name);
            this.f25563c = (TextView) view.findViewById(R.id.like_list_item_time);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m39343a(C9512c.C9513a aVar, View view) {
        AbstractC9510c cVar = this.f25560e;
        if (cVar != null) {
            cVar.mo36347a(aVar.f25550b);
        }
    }

    public C9514d(Context context, C10917c cVar) {
        this.f25558c = context;
        this.f25557b = LayoutInflater.from(context);
        this.f25559d = C9536g.m39375a().mo36377a();
    }

    /* renamed from: a */
    public C9515a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9515a(this.f25557b.inflate(R.layout.like_list_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C9515a aVar, int i) {
        C9512c.C9513a aVar2 = this.f25556a.f25547a.get(i);
        if (C13726a.m55674a(this.f25558c)) {
            ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f25558c).mo10414a(new C13664a(aVar2.f25552d)).mo11123a((int) R.drawable.facade_common_avatar_place_holder)).mo10399a((ImageView) aVar.f25561a);
        }
        aVar.f25561a.setOnClickListener(new View.OnClickListener(aVar2) {
            /* class com.bytedance.ee.bear.middleground.like.$$Lambda$d$kfjKgL56aBhODaA1e1aPTDjZv3Y */
            public final /* synthetic */ C9512c.C9513a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C9514d.this.m39343a((C9514d) this.f$1, (C9512c.C9513a) view);
            }
        });
        aVar.f25562b.setTitle(C13666a.m55443a(this.f25559d, aVar2.f25553e, aVar2.f25554f));
        aVar.f25562b.setExternalVisible(C9536g.m39375a().mo36381a(aVar2.f25551c));
        aVar.f25563c.setText(C13723a.m55654a(this.f25558c, aVar2.f25555g * 1000));
    }
}
