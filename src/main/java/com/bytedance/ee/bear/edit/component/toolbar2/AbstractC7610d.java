package com.bytedance.ee.bear.edit.component.toolbar2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c;
import com.bytedance.ee.bear.edit.component.toolbar2.C7642j;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.d */
public abstract class AbstractC7610d<T extends ToolbarV2> extends C7667e implements AbstractC10549e {

    /* renamed from: b */
    protected static final int f20638b = C13749l.m55738a(9);

    /* renamed from: c */
    protected static final int f20639c = C13749l.m55738a(48);

    /* renamed from: g */
    static final /* synthetic */ boolean f20640g = true;

    /* renamed from: a */
    private View f20641a;

    /* renamed from: d */
    protected RecyclerView f20642d;

    /* renamed from: e */
    protected AbstractC7605c f20643e;

    /* renamed from: f */
    protected boolean f20644f;

    /* renamed from: h */
    private View f20645h;

    /* renamed from: i */
    private View f20646i;

    /* renamed from: j */
    private LinearLayoutManager f20647j;

    /* renamed from: k */
    private int f20648k = f20638b;

    /* renamed from: l */
    private int f20649l;

    /* renamed from: m */
    private ItemV2 f20650m;

    /* renamed from: n */
    private int f20651n = -1;

    /* renamed from: o */
    private boolean f20652o;

    /* renamed from: p */
    private boolean f20653p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC7616f<T> mo22161a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29940a(ItemV2[] itemV2Arr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC7605c mo29923b();

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AbstractC7605c mo29945d() {
        AbstractC7605c cVar = this.f20643e;
        if (cVar != null) {
            return cVar;
        }
        AbstractC7605c b = mo29923b();
        this.f20643e = b;
        return b;
    }

    /* renamed from: j */
    private int m30518j() {
        ItemV2[] a = mo29945d().mo29937a();
        int i = -1;
        if (a == null) {
            return -1;
        }
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2].isSelected()) {
                i = i2;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo29946e() {
        T b = mo22161a().getToolbar().mo5927b();
        ItemV2.Children b2 = mo29942b(b);
        if (b == null || b2 == null) {
            return 0;
        }
        return !b2.isHorizontal();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (f20640g || getActivity() != null) {
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    private void mo43462f() {
        if (f20640g || getActivity() != null) {
            AbstractC7616f<T> a = mo22161a();
            a.getSubToolbarV2Rect().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$d$gc6OxmLinYw6v9MtS0F9W3CpXWU */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    AbstractC7610d.this.m30512a((AbstractC7610d) ((Rect) obj));
                }
            });
            a.getToolbar().mo5923a(this, new AbstractC1178x(a) {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$d$7KvmDs6Lu_Uo99no0fzi56aofFo */
                public final /* synthetic */ AbstractC7616f f$1;

                {
                    this.f$1 = r2;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    AbstractC7610d.this.m30513a((AbstractC7610d) this.f$1, (AbstractC7616f) ((ToolbarV2) obj));
                }
            });
            m30512a(a.getSubToolbarV2Rect().mo5927b());
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    private boolean m30515g() {
        ItemV2 b = mo22161a().getExpandedSubToolbar().mo5927b();
        if (this.f20650m == null || b == null || b.id() != this.f20650m.id()) {
            return false;
        }
        return f20640g;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private void m30516h() {
        int j = m30518j();
        int findLastVisibleItemPosition = this.f20647j.findLastVisibleItemPosition();
        C13479a.m54764b("BaseSubToolbarV2Fragment", "selected item pos " + j + " ,last visible item pos:" + findLastVisibleItemPosition);
        if (j != -1 && j > findLastVisibleItemPosition) {
            this.f20642d.scrollToPosition(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29944c() {
        AbstractC7605c d = mo29945d();
        this.f20643e = d;
        this.f20642d.setAdapter(d);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), mo29946e(), false);
        this.f20647j = linearLayoutManager;
        this.f20642d.setLayoutManager(linearLayoutManager);
        this.f20643e.mo29935a(new AbstractC7605c.AbstractC7607b() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$6D3oQpg9phml3Q7FjN8aoU4l38 */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c.AbstractC7607b
            public final void onItemClicked(ItemV2 itemV2) {
                AbstractC7610d.this.mo29943b(itemV2);
            }
        });
        C7642j jVar = new C7642j();
        jVar.mo30033a(new C7642j.AbstractC7643a() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d.C76111 */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.C7642j.AbstractC7643a
            /* renamed from: a */
            public void mo29947a(int i) {
                C13479a.m54772d("BaseSubToolbarV2Fragment", "onScrollToPosition: " + i);
                if (i == 2) {
                    AbstractC7610d.this.mo29939a(AbstractC7610d.f20640g);
                } else {
                    AbstractC7610d.this.mo29939a(false);
                }
            }
        });
        this.f20642d.addOnScrollListener(jVar);
    }

    /* renamed from: i */
    private void m30517i() {
        int measuredWidth = this.f20642d.getMeasuredWidth();
        C13479a.m54772d("BaseSubToolbarV2Fragment", "width=> " + measuredWidth);
        if (measuredWidth == 0) {
            return;
        }
        if (this.f20649l != measuredWidth || this.f20644f) {
            this.f20642d.post(new Runnable() {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$d$SAYNDkYh2zJRlgC7LNHoF6S1K64 */

                public final void run() {
                    AbstractC7610d.this.m30516h();
                }
            });
            int i = 0;
            this.f20644f = false;
            this.f20649l = measuredWidth;
            int a = C13749l.m55736a();
            int i2 = this.f20649l;
            int i3 = f20638b;
            if (i2 >= a - (i3 * 2)) {
                boolean z = f20640g;
                this.f20653p = f20640g;
                int a2 = mo29938a(a);
                if (m30518j() != mo29945d().mo29937a().length - 1) {
                    z = false;
                }
                mo29939a(z);
                C13479a.m54772d("BaseSubToolbarV2Fragment", "suggestionWidth " + a2);
                if (a2 > 0 && a2 < this.f20649l) {
                    ViewGroup.LayoutParams layoutParams = this.f20642d.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = a2;
                        this.f20642d.requestLayout();
                        this.f20649l = layoutParams.width;
                    }
                } else {
                    return;
                }
            }
            int i4 = this.f20648k;
            int i5 = this.f20649l;
            int i6 = i4 - (i5 / 2);
            int i7 = (i5 / 2) + i4;
            if (i6 >= i3 && i7 <= a - i3) {
                i = (i4 - (i5 / 2)) - i3;
            } else if (i6 >= i3 && i7 > a - i3) {
                i = a - i5;
            }
            C13479a.m54764b("BaseSubToolbarV2Fragment", "width:" + this.f20649l + ", posX:" + this.f20648k + ", paddingStart:" + i);
            View view = this.f20641a;
            view.setPadding(i, view.getPaddingTop(), this.f20641a.getPaddingRight(), this.f20641a.getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo29938a(int i) {
        return i - (f20638b * 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29943b(ItemV2 itemV2) {
        mo29922a(itemV2, itemV2.getValue());
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f20650m = (ItemV2) arguments.getSerializable(ItemV2.class.getName());
        }
        if (f20640g || getActivity() != null) {
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m30512a(Rect rect) {
        if (m30515g()) {
            this.f20642d.measure(0, 0);
            if (rect != null && !rect.isEmpty()) {
                if (this.f20642d.getVisibility() != 0) {
                    this.f20642d.setVisibility(0);
                }
                int centerX = rect.centerX();
                C13479a.m54764b("BaseSubToolbarV2Fragment", "new x:" + centerX + ", old x:" + this.f20648k);
                if (centerX != this.f20648k || this.f20652o) {
                    this.f20652o = false;
                    this.f20648k = centerX;
                    this.f20644f = f20640g;
                    m30517i();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ItemV2.Children mo29942b(ToolbarV2 toolbarV2) {
        if (toolbarV2 == null || toolbarV2.getItems() == null || toolbarV2.getItems().length <= 0) {
            C13479a.m54775e("BaseSubToolbarV2Fragment", "toolbar data is null!");
            return null;
        }
        ItemV2[] items = toolbarV2.getItems();
        for (ItemV2 itemV2 : items) {
            ItemV2 itemV22 = this.f20650m;
            if (!(itemV22 == null || !itemV22.getId().equals(itemV2.getId()) || itemV2.getChildren() == null)) {
                return itemV2.getChildren();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo29939a(boolean z) {
        if (mo29946e() == 0 && this.f20653p) {
            if (z) {
                this.f20645h.setVisibility(0);
                this.f20646i.setVisibility(8);
                return;
            }
            this.f20645h.setVisibility(8);
            this.f20646i.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ItemV2[] mo29941a(ToolbarV2 toolbarV2) {
        ItemV2.Children b = mo29942b(toolbarV2);
        if (b != null && b.getItems() != null && b.getItems().length > 0) {
            return b.getItems();
        }
        C13479a.m54775e("BaseSubToolbarV2Fragment", "children is null");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo29944c();
        mo43462f();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m30513a(AbstractC7616f fVar, ToolbarV2 toolbarV2) {
        C13479a.m54772d("BaseSubToolbarV2Fragment", "Toolbar changed ");
        ItemV2[] a = mo29941a(toolbarV2);
        if (a != null) {
            mo29945d().mo29936a(a);
            mo29940a(a);
            int i = this.f20651n;
            if (!(i == -1 || i == a.length || !m30515g())) {
                this.f20652o = f20640g;
                m30512a(fVar.getSubToolbarV2Rect().mo5927b());
            }
            this.f20651n = a.length;
        }
    }

    /* renamed from: a */
    public <V> void mo29922a(ItemV2 itemV2, V v) {
        C13479a.m54764b("BaseSubToolbarV2Fragment", "processOnItemClick " + itemV2);
        mo22161a().processSubToolbarItemClick(itemV2.id(), v);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.doc_sub_toolbar_layout, viewGroup, false);
        this.f20642d = (RecyclerView) inflate.findViewById(R.id.sub_toolbar_menu_list);
        View findViewById = inflate.findViewById(R.id.menu_parent);
        this.f20641a = findViewById;
        this.f20645h = findViewById.findViewById(R.id.mask_left);
        this.f20646i = this.f20641a.findViewById(R.id.mask_right);
        return inflate;
    }
}
