package com.bytedance.ee.bear.bitable.fab;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.bitable.fab.BitableFabModel;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedence.ee.bear.fabview.FabView;
import com.larksuite.suite.R;
import java.util.Arrays;

/* renamed from: com.bytedance.ee.bear.bitable.fab.a */
public class C4783a extends C7667e {

    /* renamed from: b */
    static final /* synthetic */ boolean f14065b;

    /* renamed from: a */
    public BitableFabViewModel f14066a;

    /* renamed from: c */
    private LinearLayout f14067c;

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m19811b(BitableFabModel.BitableFabItem[] bitableFabItemArr) {
        C13479a.m54772d("BitableFabFragment", "fab change: " + Arrays.toString(bitableFabItemArr));
        if (bitableFabItemArr != null) {
            m19810a(bitableFabItemArr);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f14065b || getActivity() != null) {
            BitableFabViewModel bVar = (BitableFabViewModel) C4950k.m20474a(this, BitableFabViewModel.class);
            this.f14066a = bVar;
            bVar.getFabItems().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.bitable.fab.$$Lambda$a$PlFO3xQYntRBHINcM9WK5gThgE */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C4783a.m269132lambda$PlFO3xQYntRBHINcM9WK5gThgE(C4783a.this, (BitableFabModel.BitableFabItem[]) obj);
                }
            });
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private View m19809a(final BitableFabModel.BitableFabItem bitableFabItem) {
        C13479a.m54772d("BitableFabFragment", "add fab: " + bitableFabItem.getId());
        FabView fabView = new FabView(requireContext());
        EnumC4785c eBitableFabByName = EnumC4785c.getEBitableFabByName(bitableFabItem.getId());
        fabView.setType(eBitableFabByName.type);
        fabView.setImageRes(eBitableFabByName.imageRes);
        fabView.setColorRes(eBitableFabByName.colorRes);
        fabView.setImageTintRes(eBitableFabByName.imageTintColorRes);
        fabView.setTextRes(bitableFabItem.getTitle());
        fabView.setTag(R.id.tag_id, bitableFabItem.getId());
        fabView.setTag(bitableFabItem.getId());
        fabView.setContentDescription(bitableFabItem.getId());
        fabView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.bitable.fab.C4783a.C47841 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C4783a.this.f14066a.onClickFabItem(bitableFabItem.getId());
            }
        });
        fabView.mo70654a();
        return fabView;
    }

    /* renamed from: a */
    private void m19810a(BitableFabModel.BitableFabItem[] bitableFabItemArr) {
        int childCount = this.f14067c.getChildCount();
        int i = 0;
        while (i < bitableFabItemArr.length && i < childCount) {
            View childAt = this.f14067c.getChildAt(i);
            if (TextUtils.equals(bitableFabItemArr[i].getId(), (String) childAt.getTag(R.id.tag_id)) ^ f14065b) {
                C13479a.m54772d("BitableFabFragment", "update fab: " + bitableFabItemArr[i].getId());
                this.f14067c.removeView(childAt);
                this.f14067c.addView(m19809a(bitableFabItemArr[i]), i);
            }
            i++;
        }
        while (i < bitableFabItemArr.length) {
            this.f14067c.addView(m19809a(bitableFabItemArr[i]), i);
            i++;
        }
        if (i < childCount) {
            this.f14067c.removeViews(bitableFabItemArr.length, childCount - bitableFabItemArr.length);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14067c = (LinearLayout) view.findViewById(R.id.bitable_fab_container);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bitable_fab_layout, viewGroup, false);
    }
}
