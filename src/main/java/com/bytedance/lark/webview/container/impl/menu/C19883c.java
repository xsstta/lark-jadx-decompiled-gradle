package com.bytedance.lark.webview.container.impl.menu;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.lark.webview.container.impl.menu.C19880b;
import com.bytedance.lark.webview.container.impl.menu.C19885d;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lark.webview.container.impl.menu.c */
public class C19883c extends PagerAdapter {

    /* renamed from: a */
    private final int f48574a = 8;

    /* renamed from: b */
    private Context f48575b;

    /* renamed from: c */
    private final List<C19885d.C19889b> f48576c;

    /* renamed from: d */
    private Dialog f48577d;

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<C19885d.C19889b> list = this.f48576c;
        if (list != null) {
            return (int) Math.ceil((double) (((float) list.size()) / ((float) this.f48574a)));
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == null) {
            ArrayList arrayList = new ArrayList();
            int i2 = this.f48574a;
            int i3 = i * i2;
            int i4 = (i + 1) * i2;
            while (i3 < this.f48576c.size() && i3 < i4) {
                arrayList.add(this.f48576c.get(i3));
                i3++;
            }
            CommonRecyclerView commonRecyclerView = new CommonRecyclerView(this.f48575b);
            C19880b bVar = new C19880b(this.f48575b, arrayList);
            bVar.mo67389a(new C19880b.AbstractC19882b(arrayList) {
                /* class com.bytedance.lark.webview.container.impl.menu.$$Lambda$c$V6WOclKc5Y5uXfDyDj0N8fxivUY */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.lark.webview.container.impl.menu.C19880b.AbstractC19882b
                public final void onItemClick(View view, int i) {
                    C19883c.lambda$V6WOclKc5Y5uXfDyDj0N8fxivUY(C19883c.this, this.f$1, view, i);
                }
            });
            commonRecyclerView.setAdapter(bVar);
            commonRecyclerView.setLayoutManager(new GridLayoutManager(this.f48575b, this.f48574a / 2) {
                /* class com.bytedance.lark.webview.container.impl.menu.C19883c.C198841 */

                @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
            commonRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            commonRecyclerView.setHasFixedSize(true);
            viewGroup.addView(commonRecyclerView);
        }
        return viewGroup.getChildAt(i);
    }

    public C19883c(Context context, List<C19885d.C19889b> list, Dialog dialog) {
        this.f48575b = context;
        this.f48576c = list;
        this.f48577d = dialog;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m72571a(List list, View view, int i) {
        ((C19885d.C19889b) list.get(i)).f48584c.onMenuItemClick();
        if (this.f48577d.isShowing()) {
            this.f48577d.dismiss();
        }
    }
}
