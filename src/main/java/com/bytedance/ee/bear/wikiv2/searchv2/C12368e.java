package com.bytedance.ee.bear.wikiv2.searchv2;

import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.larksuite.suite.R;
import java.util.regex.Pattern;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.e */
public class C12368e extends C12361c {

    /* renamed from: c */
    private AbstractC5197b f33183c = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class));

    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.e$a */
    private static class C12369a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        SwipeMenuLayout f33184a;

        /* renamed from: b */
        ConstraintLayout f33185b;

        /* renamed from: c */
        CustomTitleView f33186c = ((CustomTitleView) this.f33185b.findViewById(R.id.item_name));

        /* renamed from: d */
        ImageView f33187d;

        /* renamed from: e */
        TextView f33188e = ((TextView) this.f33185b.findViewById(R.id.update_time));

        C12369a(View view) {
            super(view);
            this.f33184a = (SwipeMenuLayout) view.findViewById(R.id.list_item);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.item_content);
            this.f33185b = constraintLayout;
            this.f33187d = (ImageView) constraintLayout.findViewById(R.id.item_icon);
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.searchv2.C12361c, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12369a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wiki_space_list_item, viewGroup, false));
    }

    @Override // com.bytedance.ee.bear.wikiv2.searchv2.C12361c, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C12369a aVar = (C12369a) viewHolder;
        C12360b bVar = (C12360b) this.f33172b.get(i);
        if (!TextUtils.isEmpty(bVar.f33164i)) {
            if (!TextUtils.isEmpty(bVar.f33156a)) {
                String str = bVar.f33164i;
                String quote = Pattern.quote(bVar.f33156a);
                aVar.f33186c.setTitle(Html.fromHtml(str.replaceAll(quote, "<font color=#f01d94>" + bVar.f33156a + "</font>")));
            } else {
                aVar.f33186c.setTitle(bVar.f33164i);
            }
        }
        if (!TextUtils.isEmpty(bVar.f33166k)) {
            aVar.f33188e.setText(bVar.f33166k);
        } else {
            aVar.f33188e.setText(R.string.Doc_Wiki_Home_DescriptionEmptyText);
        }
        aVar.f33187d.setImageResource(R.drawable.ud_icon_wikibooklock_circle_colorful);
        CustomTitleView customTitleView = aVar.f33186c;
        if (!bVar.f33167l || !this.f33183c.mo20801b().mo20778d().f14914a) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setStarVisible(z);
        aVar.f33184a.setSwipeEnable(false);
        aVar.f33185b.setOnClickListener(new View.OnClickListener(bVar, i) {
            /* class com.bytedance.ee.bear.wikiv2.searchv2.$$Lambda$e$v5cqtBfnC_hLm5J3k0HT1PbxBP4 */
            public final /* synthetic */ C12360b f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C12368e.lambda$v5cqtBfnC_hLm5J3k0HT1PbxBP4(C12368e.this, this.f$1, this.f$2, view);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m51459a(C12360b bVar, int i, View view) {
        if (this.f33171a != null) {
            this.f33171a.mo47074a(bVar, i);
        }
    }
}
