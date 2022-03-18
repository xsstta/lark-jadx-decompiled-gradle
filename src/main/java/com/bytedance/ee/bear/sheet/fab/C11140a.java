package com.bytedance.ee.bear.sheet.fab;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.sheet.fab.FabItem;
import com.bytedance.ee.bear.sheet.inputbar.C11219d;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11271b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedence.ee.bear.fabview.FabView;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.sheet.fab.a */
public class C11140a extends C7667e {

    /* renamed from: c */
    static final /* synthetic */ boolean f29930c = true;

    /* renamed from: a */
    public LinearLayout f29931a;

    /* renamed from: b */
    public C11143b f29932b;

    /* renamed from: d */
    private LiveData<Integer> f29933d;

    /* renamed from: e */
    private LiveData<Boolean> f29934e;

    /* renamed from: f */
    private LiveData<Boolean> f29935f;

    /* renamed from: g */
    private C1174u<Boolean> f29936g;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m46374c() {
        this.f29932b.setFabHideTime(0);
        m46371b();
    }

    /* renamed from: b */
    private void m46371b() {
        boolean z;
        Integer b = this.f29933d.mo5927b();
        boolean z2 = f29930c;
        if (b == null || this.f29933d.mo5927b().intValue() <= 0) {
            z = false;
        } else {
            z = f29930c;
        }
        boolean equals = Boolean.TRUE.equals(this.f29934e.mo5927b());
        boolean equals2 = Boolean.TRUE.equals(this.f29935f.mo5927b());
        C1174u<Boolean> uVar = this.f29936g;
        if (z || equals || equals2) {
            z2 = false;
        }
        uVar.mo5929b(Boolean.valueOf(z2));
    }

    /* renamed from: a */
    private void m46367a() {
        this.f29934e = ((C11271b) C4950k.m20474a(this, C11271b.class)).getActive();
        this.f29935f = ((C11219d) C4950k.m20474a(this, C11219d.class)).getActive();
        this.f29933d = this.f29932b.getFabHideTime();
        C1174u<Boolean> uVar = new C1174u<>();
        this.f29936g = uVar;
        uVar.mo6042a((LiveData<S>) this.f29934e, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.fab.$$Lambda$a$exDevJfQo2iuIcsM7AMAa_7ac7M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11140a.this.m46372b((C11140a) ((Boolean) obj));
            }
        });
        this.f29936g.mo6042a((LiveData<S>) this.f29935f, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.fab.$$Lambda$a$7PNUUoK0LGnSFp2cATvnZrv6ta4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11140a.this.m46368a((C11140a) ((Boolean) obj));
            }
        });
        this.f29936g.mo6042a(this.f29932b.getFabHideTime(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.fab.$$Lambda$a$VQXBL3bSN2EDNK9TxIF1DDRGkew */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11140a.this.m46369a((C11140a) ((Integer) obj));
            }
        });
        this.f29936g.mo5923a(this, new AbstractC13687a<Boolean>() {
            /* class com.bytedance.ee.bear.sheet.fab.C11140a.C111422 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo18510a(Boolean bool) {
                int i;
                LinearLayout linearLayout = C11140a.this.f29931a;
                if (Boolean.TRUE.equals(bool)) {
                    i = 0;
                } else {
                    i = 8;
                }
                linearLayout.setVisibility(i);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m46368a(Boolean bool) {
        m46371b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m46372b(Boolean bool) {
        m46371b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m46369a(Integer num) {
        if (num.intValue() > 0) {
            m46371b();
            C13742g.m55706a(new Runnable() {
                /* class com.bytedance.ee.bear.sheet.fab.$$Lambda$a$SIJ3NXidxkZZSU0rLIo5UJoqsM */

                public final void run() {
                    C11140a.this.m46374c();
                }
            }, (long) num.intValue());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m46373b(FabItem.FabSheetItem[] fabSheetItemArr) {
        C13479a.m54772d("FabFragment", "fab change: " + Arrays.toString(fabSheetItemArr));
        if (fabSheetItemArr != null) {
            m46370a(fabSheetItemArr);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f29930c || getActivity() != null) {
            C11143b bVar = (C11143b) C4950k.m20474a(this, C11143b.class);
            this.f29932b = bVar;
            bVar.getTopItems().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.sheet.fab.$$Lambda$a$0XRmZggcMwQNAHUqiVR8yWCwZM */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C11140a.this.m46373b((C11140a) ((FabItem.FabSheetItem[]) obj));
                }
            });
            m46367a();
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private View m46366a(final FabItem.FabSheetItem fabSheetItem) {
        C13479a.m54772d("FabFragment", "add fab: " + fabSheetItem.getId());
        Context context = getContext();
        Objects.requireNonNull(context);
        FabView fabView = new FabView(context);
        FabItemEnum valueOf = FabItemEnum.valueOf(fabSheetItem.getId());
        fabView.setType(valueOf.type);
        fabView.setImageRes(valueOf.imageRes);
        fabView.setColorRes(valueOf.colorRes);
        fabView.setImageTintRes(valueOf.imageTintColorRes);
        fabView.setTextRes(fabSheetItem.getTitle());
        fabView.setTag(R.id.tag_id, fabSheetItem.getId());
        fabView.setTag(R.id.tag_title, fabSheetItem.getTitle());
        fabView.setTag(fabSheetItem.getId());
        fabView.setContentDescription(fabSheetItem.getId());
        fabView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.fab.C11140a.C111411 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C11140a.this.f29932b.clickItem(fabSheetItem.getId(), null);
            }
        });
        fabView.mo70654a();
        return fabView;
    }

    /* renamed from: a */
    private void m46370a(FabItem.FabSheetItem[] fabSheetItemArr) {
        boolean z;
        int childCount = this.f29931a.getChildCount();
        int i = 0;
        while (i < fabSheetItemArr.length && i < childCount) {
            View childAt = this.f29931a.getChildAt(i);
            FabItem.FabSheetItem fabSheetItem = fabSheetItemArr[i];
            if (!TextUtils.equals(fabSheetItem.getId(), (String) childAt.getTag(R.id.tag_id)) || !TextUtils.equals(fabSheetItem.getTitle(), (String) childAt.getTag(R.id.tag_title))) {
                z = f29930c;
            } else {
                z = false;
            }
            if (z) {
                C13479a.m54772d("FabFragment", "update fab: " + fabSheetItemArr[i].getId());
                this.f29931a.removeView(childAt);
                this.f29931a.addView(m46366a(fabSheetItemArr[i]), i);
            }
            i++;
        }
        while (i < fabSheetItemArr.length) {
            this.f29931a.addView(m46366a(fabSheetItemArr[i]), i);
            i++;
        }
        if (i < childCount) {
            this.f29931a.removeViews(fabSheetItemArr.length, childCount - fabSheetItemArr.length);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f29931a = (LinearLayout) view.findViewById(R.id.fab_container);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sheet_fab_layout, viewGroup, false);
    }
}
