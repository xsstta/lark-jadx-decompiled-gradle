package com.bytedance.ee.bear.doc.toolbar;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.RectColorView;
import com.bytedance.ee.bear.document.toolbar.AbstractC6204a;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.doc.toolbar.a */
public abstract class AbstractC5542a extends AbstractC6204a {

    /* renamed from: c */
    static final /* synthetic */ boolean f15768c = true;

    /* renamed from: d */
    private C5546d f15769d;

    /* renamed from: e */
    private List<FrameLayout> f15770e = new ArrayList(9);

    /* renamed from: f */
    private RectColorView f15771f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C5546d mo22130a(FragmentActivity fragmentActivity);

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: f */
    public int mo22132f() {
        return R.layout.doc_toolbar_attribution_fragment;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: g */
    public ItemId mo22133g() {
        return DocItemId.attribution;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: h */
    public AbstractC6212e mo22134h() {
        return this.f15769d;
    }

    /* renamed from: k */
    private void m22501k() {
        if (this.f15770e.size() == 9) {
            m22499a(m22498a(8, 0, 1, 4.0d, 4.5d), 9, 1);
        }
    }

    /* renamed from: j */
    public void mo22136j() {
        Item a = mo25095a(DocTxtAttrId.highlight);
        if (a == null) {
            C13479a.m54758a("AbsDocTxtAttrFragment", "selectColor while color item invalid ");
            return;
        }
        C13479a.m54764b("AbsDocTxtAttrFragment", "highlight process value:" + a.getValue());
        this.f15769d.processToolbarItemClick(DocTxtAttrId.highlight, a.getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.List<android.widget.FrameLayout> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6204a, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: i */
    public View mo22135i() {
        View i = super.mo22135i();
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) i.findViewById(R.id.headerLevel);
        for (int i2 = 1; i2 <= 9; i2++) {
            List<FrameLayout> list = this.f15770e;
            list.add(horizontalScrollView.findViewWithTag(C14002h.f36692e + i2));
        }
        m22501k();
        i.findViewById(R.id.selectColor).setVisibility(8);
        this.f15771f = (RectColorView) i.findViewById(R.id.highLightColorV2);
        i.findViewById(R.id.selectColorV2).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.doc.toolbar.AbstractC5542a.C55431 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                AbstractC5542a.this.mo22136j();
            }
        });
        return i;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f15768c || activity != null) {
            this.f15769d = mo22130a(activity);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private void m22500a(Highlight.Selected selected) {
        if (getContext() != null) {
            if (this.f15771f == null) {
                mo22135i();
            }
            if (selected != null) {
                this.f15771f.mo23730a(selected.getBackground(), selected.getText());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: a */
    public void mo22131a(Item[] itemArr, View view) {
        super.mo22131a(itemArr, view);
        Item a = mo25095a(DocTxtAttrId.highlight);
        if (a != null) {
            m22500a(Highlight.Selected.fromJson(a.getValue()));
        }
    }

    /* renamed from: a */
    private void m22499a(int i, int i2, int i3) {
        int a = C13749l.m55738a(i3);
        for (int i4 = 1; i4 <= i2; i4++) {
            FrameLayout frameLayout = this.f15770e.get(i4 - 1);
            frameLayout.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = i;
            if (i4 == 1) {
                frameLayout.setBackgroundResource(R.drawable.doc_toolbar_subitem_left);
                ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(a);
            } else if (i4 == i2) {
                frameLayout.setBackgroundResource(R.drawable.doc_toolbar_subitem_right);
                ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(0);
            } else {
                frameLayout.setBackgroundResource(R.drawable.doc_toolbar_subitem_none);
                ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(a);
            }
            frameLayout.setLayoutParams(layoutParams);
        }
        for (int i5 = i2 + 1; i5 <= 9; i5++) {
            this.f15770e.get(i5 - 1).setVisibility(8);
        }
    }

    /* renamed from: a */
    private int m22498a(int i, int i2, int i3, double d, double d2) {
        int a = C13749l.m55738a(i);
        return (int) ((((double) ((C13749l.m55736a() - a) - C13749l.m55738a(i2))) - (d * ((double) C13749l.m55738a(i3)))) / d2);
    }
}
