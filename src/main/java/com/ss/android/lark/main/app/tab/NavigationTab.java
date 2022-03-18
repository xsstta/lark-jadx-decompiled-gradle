package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.larkconfig.larksetting.handler.customnav.NavDataSource;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.widget.tab.NavigationTabItemView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NavigationTab extends FrameLayout implements RoundableLayoutContainer, NavigationTabItemView.AbstractC59203a {

    /* renamed from: a */
    public AbstractC44371p f112446a;

    /* renamed from: b */
    private LinearLayout f112447b;

    /* renamed from: c */
    private LinearLayout f112448c;

    /* renamed from: d */
    private LKUIRoundableLayout f112449d;

    /* renamed from: e */
    private TextView f112450e;

    /* renamed from: f */
    private TextView f112451f;

    /* renamed from: g */
    private ImageView f112452g;

    /* renamed from: h */
    private Set<String> f112453h;

    /* renamed from: i */
    private List<WeakReference<View>> f112454i;

    /* renamed from: j */
    private final Map<CharSequence, Integer> f112455j;

    /* renamed from: k */
    private View.OnClickListener f112456k;

    /* renamed from: l */
    private AbstractC44343b f112457l;

    /* renamed from: m */
    private final View.OnClickListener f112458m;

    /* renamed from: n */
    private AbstractC44342a f112459n;

    /* renamed from: o */
    private LinearLayout f112460o;

    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTab$a */
    public interface AbstractC44342a {
        /* renamed from: a */
        void mo157509a(int i);
    }

    /* renamed from: com.ss.android.lark.main.app.tab.NavigationTab$b */
    public interface AbstractC44343b {
        void onNavigationTabEditorClick(NavigationTab navigationTab);
    }

    /* renamed from: c */
    public void mo157500c() {
        m175901g();
    }

    @Override // com.ss.android.lark.main.app.tab.RoundableLayoutContainer
    /* renamed from: d */
    public LKUIRoundableLayout mo157501d() {
        return this.f112449d;
    }

    /* renamed from: f */
    public void mo157503f() {
        LinearLayout linearLayout = this.f112460o;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getParent() instanceof CoordinatorLayout)) {
            throw new IllegalArgumentException("NavigationTab must be added to a CoordinatorLayout.");
        }
    }

    /* renamed from: g */
    private void m175901g() {
        TextView textView = (TextView) findViewById(R.id.navigation_tab_edit);
        this.f112450e = textView;
        textView.setOnClickListener(this.f112458m);
        if (C44373s.m176069a().mo157645f() != NavDataSource.V2) {
            this.f112450e.setVisibility(8);
        } else {
            this.f112450e.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo157499b() {
        LinearLayout linearLayout;
        this.f112446a = null;
        this.f112447b = null;
        for (WeakReference<View> weakReference : this.f112454i) {
            View view = weakReference.get();
            if (!(view == null || (linearLayout = this.f112448c) == null)) {
                linearLayout.removeView(view);
                m175899b(view);
            }
        }
        this.f112453h.clear();
        this.f112454i.clear();
    }

    /* renamed from: e */
    public void mo157502e() {
        LinearLayout linearLayout = this.f112460o;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            return;
        }
        this.f112460o = new LinearLayout(getContext());
        int a = (int) C25653b.m91892a(getContext(), 24.0f);
        this.f112460o.setPadding(a, a, a, a);
        this.f112460o.setOrientation(1);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.illustration_im_empty_positive_add_application);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        this.f112460o.addView(imageView);
        TextView textView = new TextView(getContext());
        textView.setText(R.string.Lark_Legacy_Navigation);
        textView.setTextSize(14.0f);
        textView.setGravity(1);
        textView.setPadding(0, (int) C25653b.m91892a(getContext(), 10.0f), 0, 0);
        textView.setTextColor(UIUtils.getColor(getContext(), R.color.text_placeholder));
        this.f112460o.addView(textView);
        this.f112448c.addView(this.f112460o);
    }

    /* renamed from: a */
    public boolean mo157498a() {
        Set<String> set = this.f112453h;
        if (set == null || set.isEmpty()) {
            return false;
        }
        return true;
    }

    public void setNavRedDotListener(AbstractC44342a aVar) {
        this.f112459n = aVar;
    }

    public void setOnTabEditClickListener(AbstractC44343b bVar) {
        this.f112457l = bVar;
    }

    public void setOnTabItemClickListener(AbstractC44371p pVar) {
        this.f112446a = pVar;
    }

    public NavigationTab(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m175900c(View view) {
        AbstractC44343b bVar = this.f112457l;
        if (bVar != null) {
            bVar.onNavigationTabEditorClick(this);
        }
    }

    /* renamed from: a */
    private void m175897a(View view) {
        if (view instanceof NavigationTabItemView) {
            ((NavigationTabItemView) view).setNavigationRedDotListener(this);
        }
    }

    /* renamed from: b */
    private void m175898b(Context context) {
        this.f112451f.setVisibility(0);
        this.f112452g.setLayoutParams((ViewGroup.MarginLayoutParams) this.f112452g.getLayoutParams());
    }

    /* renamed from: a */
    private void m175896a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.navigation_tab_layout, (ViewGroup) this, true);
        this.f112448c = (LinearLayout) findViewById(R.id.nav_tab_container);
        this.f112452g = (ImageView) findViewById(R.id.navigation_tab_title);
        this.f112451f = (TextView) findViewById(R.id.navigation_tab_left_title);
        this.f112449d = (LKUIRoundableLayout) findViewById(R.id.nav_tab_roundable_container);
        m175898b(context);
        m175901g();
    }

    /* renamed from: b */
    private void m175899b(View view) {
        if (view instanceof NavigationTabItemView) {
            NavigationTabItemView navigationTabItemView = (NavigationTabItemView) view;
            navigationTabItemView.setNavigationRedDotListener(null);
            this.f112455j.remove(navigationTabItemView.getTitle());
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m175899b(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: a */
    public void mo157497a(String str, boolean z) {
        mo157494a(findViewWithTag(str), z);
    }

    public NavigationTab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo157494a(View view, boolean z) {
        if (view instanceof NavigationTabItemView) {
            ((NavigationTabItemView) view).mo201265a(z);
        }
    }

    /* renamed from: a */
    public void mo157496a(String str, View view) {
        mo157503f();
        if (str == null || view == null) {
            C53241h.m205900d("SubTab", "add sub tab failed; tabName = " + str);
        } else if (this.f112453h.contains(str)) {
            C53241h.m205900d("SubTab", "add sub tab failed, tab already exist; tabName = " + str);
        } else {
            this.f112453h.add(str);
            view.setTag(R.id.main_tab_sub_tab_tag, str);
            view.setOnClickListener(this.f112456k);
            LinearLayout linearLayout = this.f112447b;
            if (linearLayout == null || linearLayout.getChildCount() >= 4) {
                this.f112447b = new LinearLayout(getContext(), null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int a = (int) C25653b.m91892a(getContext(), 12.0f);
                layoutParams.leftMargin = a;
                layoutParams.rightMargin = a;
                this.f112447b.setOrientation(0);
                this.f112447b.setWeightSum(4.0f);
                this.f112448c.addView(this.f112447b, layoutParams);
                this.f112454i.add(new WeakReference<>(this.f112447b));
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, (int) C25653b.m91892a(getContext(), 108.0f));
            layoutParams2.weight = 1.0f;
            if (C44373s.m176069a().mo157643d(str)) {
                mo157494a(view, true);
            }
            this.f112447b.addView(view, layoutParams2);
            m175897a(view);
        }
    }

    public NavigationTab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112453h = new HashSet();
        this.f112454i = new ArrayList();
        this.f112455j = new HashMap();
        this.f112456k = new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.tab.NavigationTab.View$OnClickListenerC443411 */

            public void onClick(View view) {
                String str = (String) view.getTag(R.id.main_tab_sub_tab_tag);
                if (!TextUtils.isEmpty(str) && NavigationTab.this.f112446a != null) {
                    NavigationTab.this.f112446a.mo157345a(str);
                }
                NavigationTab.this.mo157494a(view, false);
            }
        };
        this.f112458m = new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.tab.$$Lambda$NavigationTab$iuonZYe55B9Uw16DnSWGfcEzmUc */

            public final void onClick(View view) {
                NavigationTab.this.m175900c(view);
            }
        };
        m175896a(getContext());
        this.f112449d.mo89662a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.ss.android.lark.widget.tab.NavigationTabItemView.AbstractC59203a
    /* renamed from: a */
    public void mo157495a(NavigationTabItemView navigationTabItemView, boolean z, int i) {
        Map<CharSequence, Integer> map = this.f112455j;
        CharSequence title = navigationTabItemView.getTitle();
        boolean z2 = false;
        if (!z) {
            i = 0;
        }
        map.put(title, Integer.valueOf(i));
        int i2 = 0;
        for (Integer num : this.f112455j.values()) {
            if (!(num == null || num.intValue() == 0)) {
                if (num.intValue() > 0) {
                    i2 += num.intValue();
                }
                z2 = true;
            }
        }
        AbstractC44342a aVar = this.f112459n;
        if (aVar != null) {
            if (z2 && i2 <= 0) {
                i2 = -1;
            }
            aVar.mo157509a(i2);
        }
    }
}
