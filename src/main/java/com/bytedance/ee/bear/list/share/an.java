package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.ColumnCountUtil;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BannerAdapter;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerView;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class an extends BaseBannerView<BannerAdapter, IBannerContract.IView.Delegate> {

    /* renamed from: e */
    public TextView f23572e;

    /* renamed from: f */
    public boolean f23573f;

    /* renamed from: g */
    public final ArrayList<Document> f23574g = new ArrayList<>();

    /* renamed from: h */
    private TextView f23575h;

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: e */
    public String mo33128e() {
        return mo33129f().getString(R.string.Doc_List_ShareFolders);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: b */
    public void mo33124b() {
        super.mo33124b();
        this.f23575h = (TextView) mo33130g().findViewById(R.id.list_banner_tv_empty);
        TextView textView = (TextView) mo33130g().findViewById(R.id.list_banner_expand);
        this.f23572e = textView;
        textView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.share.an.C87201 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Drawable drawable;
                ListAnalysis.m32507a(C5234y.m21391b(), an.this.f23573f);
                an anVar = an.this;
                anVar.f23573f = !anVar.f23573f;
                if (an.this.f23573f) {
                    drawable = an.this.mo33129f().getDrawable(R.drawable.facade_icon_arrow_up);
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    an.this.f23572e.setText(R.string.Doc_List_Collapse);
                } else {
                    drawable = an.this.mo33129f().getDrawable(R.drawable.facade_icon_arrow_down);
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    an.this.f23572e.setText(R.string.Doc_List_Expand_Show_All);
                }
                an.this.f23572e.setCompoundDrawables(null, null, drawable, null);
                an.this.mo33122a(new ArrayList<>(an.this.f23574g));
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView
    /* renamed from: a */
    public void mo33122a(ArrayList<Document> arrayList) {
        int i = 8;
        this.f23572e.setVisibility(8);
        this.f23574g.clear();
        if (CollectionUtils.isEmpty(arrayList)) {
            this.f22878b.setVisibility(8);
            this.f23575h.setVisibility(0);
            this.f22879c.mo70690f(new ArrayList());
            return;
        }
        this.f23574g.addAll(arrayList);
        this.f22878b.setVisibility(0);
        this.f23575h.setVisibility(8);
        TextView textView = this.f23572e;
        if (arrayList.size() > 6) {
            i = 0;
        }
        textView.setVisibility(i);
        ArrayList arrayList2 = new ArrayList();
        if (!this.f23573f) {
            arrayList2.addAll(arrayList.subList(0, Math.min(arrayList.size(), ColumnCountUtil.f21740a.mo31471a(mo33129f()) * 3)));
        } else {
            arrayList2.addAll(arrayList);
        }
        C1374g.m6297a(new ShareFolderItemDiffCallback(this.f22879c.mo70673b(), arrayList2)).mo7412a(this.f22879c);
        this.f22879c.mo33079a((List<? extends Document>) arrayList2);
    }

    an(Context context, View view, C10917c cVar) {
        super(context, view, cVar);
    }
}
