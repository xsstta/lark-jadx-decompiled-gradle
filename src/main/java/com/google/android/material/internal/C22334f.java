package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.view.menu.SubMenuC0346q;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.recyclerview.widget.C1406t;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
public class C22334f implements AbstractC0337l {

    /* renamed from: a */
    LinearLayout f54720a;

    /* renamed from: b */
    C0322f f54721b;

    /* renamed from: c */
    C22337b f54722c;

    /* renamed from: d */
    LayoutInflater f54723d;

    /* renamed from: e */
    int f54724e;

    /* renamed from: f */
    boolean f54725f;

    /* renamed from: g */
    ColorStateList f54726g;

    /* renamed from: h */
    ColorStateList f54727h;

    /* renamed from: i */
    Drawable f54728i;

    /* renamed from: j */
    int f54729j;

    /* renamed from: k */
    int f54730k;

    /* renamed from: l */
    int f54731l;

    /* renamed from: m */
    boolean f54732m;

    /* renamed from: n */
    boolean f54733n = true;

    /* renamed from: o */
    public int f54734o;

    /* renamed from: p */
    int f54735p;

    /* renamed from: q */
    final View.OnClickListener f54736q = new View.OnClickListener() {
        /* class com.google.android.material.internal.C22334f.View$OnClickListenerC223351 */

        public void onClick(View view) {
            boolean z = true;
            C22334f.this.mo77815b(true);
            C0326h itemData = ((NavigationMenuItemView) view).getItemData();
            boolean a = C22334f.this.f54721b.mo1397a(itemData, C22334f.this, 0);
            if (itemData == null || !itemData.isCheckable() || !a) {
                z = false;
            } else {
                C22334f.this.f54722c.mo77835a(itemData);
            }
            C22334f.this.mo77815b(false);
            if (z) {
                C22334f.this.mo1243a(false);
            }
        }
    };

    /* renamed from: r */
    private NavigationMenuView f54737r;

    /* renamed from: s */
    private AbstractC0337l.AbstractC0338a f54738s;

    /* renamed from: t */
    private int f54739t;

    /* renamed from: u */
    private int f54740u;

    /* renamed from: v */
    private int f54741v = -1;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$d */
    public interface AbstractC22339d {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1350a(C0322f fVar, C0326h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1244a(SubMenuC0346q qVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1247b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1352b(C0322f fVar, C0326h hVar) {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$b */
    public class C22337b extends RecyclerView.Adapter<AbstractC22346k> {

        /* renamed from: b */
        private final ArrayList<AbstractC22339d> f54744b = new ArrayList<>();

        /* renamed from: c */
        private C0326h f54745c;

        /* renamed from: d */
        private boolean f54746d;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        /* renamed from: b */
        public C0326h mo77839b() {
            return this.f54745c;
        }

        /* renamed from: a */
        public void mo77833a() {
            m80955e();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f54744b.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo77841d() {
            int i;
            if (C22334f.this.f54720a.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < C22334f.this.f54722c.getItemCount(); i2++) {
                if (C22334f.this.f54722c.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: c */
        public Bundle mo77840c() {
            View view;
            Bundle bundle = new Bundle();
            C0326h hVar = this.f54745c;
            if (hVar != null) {
                bundle.putInt("android:menu:checked", hVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f54744b.size();
            for (int i = 0; i < size; i++) {
                AbstractC22339d dVar = this.f54744b.get(i);
                if (dVar instanceof C22341f) {
                    C0326h a = ((C22341f) dVar).mo77844a();
                    if (a != null) {
                        view = a.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: e */
        private void m80955e() {
            if (!this.f54746d) {
                this.f54746d = true;
                this.f54744b.clear();
                this.f54744b.add(new C22338c());
                int i = -1;
                int size = C22334f.this.f54721b.mo1436j().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0326h hVar = C22334f.this.f54721b.mo1436j().get(i3);
                    if (hVar.isChecked()) {
                        mo77835a(hVar);
                    }
                    if (hVar.isCheckable()) {
                        hVar.mo1466a(false);
                    }
                    if (hVar.hasSubMenu()) {
                        SubMenu subMenu = hVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f54744b.add(new C22340e(C22334f.this.f54735p, 0));
                            }
                            this.f54744b.add(new C22341f(hVar));
                            int size2 = this.f54744b.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0326h hVar2 = (C0326h) subMenu.getItem(i4);
                                if (hVar2.isVisible()) {
                                    if (!z2 && hVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (hVar2.isCheckable()) {
                                        hVar2.mo1466a(false);
                                    }
                                    if (hVar.isChecked()) {
                                        mo77835a(hVar);
                                    }
                                    this.f54744b.add(new C22341f(hVar2));
                                }
                            }
                            if (z2) {
                                m80954a(size2, this.f54744b.size());
                            }
                        }
                    } else {
                        int groupId = hVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f54744b.size();
                            if (hVar.getIcon() != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i3 != 0) {
                                i2++;
                                this.f54744b.add(new C22340e(C22334f.this.f54735p, C22334f.this.f54735p));
                            }
                        } else if (!z && hVar.getIcon() != null) {
                            m80954a(i2, this.f54744b.size());
                            z = true;
                        }
                        C22341f fVar = new C22341f(hVar);
                        fVar.f54749a = z;
                        this.f54744b.add(fVar);
                        i = groupId;
                    }
                }
                this.f54746d = false;
            }
        }

        /* renamed from: a */
        public void mo77838a(boolean z) {
            this.f54746d = z;
        }

        C22337b() {
            m80955e();
        }

        /* renamed from: a */
        public void onViewRecycled(AbstractC22346k kVar) {
            if (kVar instanceof C22343h) {
                ((NavigationMenuItemView) kVar.itemView).mo77725b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            AbstractC22339d dVar = this.f54744b.get(i);
            if (dVar instanceof C22340e) {
                return 2;
            }
            if (dVar instanceof C22338c) {
                return 3;
            }
            if (!(dVar instanceof C22341f)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C22341f) dVar).mo77844a().hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: a */
        public void mo77834a(Bundle bundle) {
            C0326h a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0326h a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f54746d = true;
                int size = this.f54744b.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    AbstractC22339d dVar = this.f54744b.get(i2);
                    if ((dVar instanceof C22341f) && (a2 = ((C22341f) dVar).mo77844a()) != null && a2.getItemId() == i) {
                        mo77835a(a2);
                        break;
                    }
                    i2++;
                }
                this.f54746d = false;
                m80955e();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f54744b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC22339d dVar2 = this.f54744b.get(i3);
                    if (!(!(dVar2 instanceof C22341f) || (a = ((C22341f) dVar2).mo77844a()) == null || (actionView = a.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo77835a(C0326h hVar) {
            if (this.f54745c != hVar && hVar.isCheckable()) {
                C0326h hVar2 = this.f54745c;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f54745c = hVar;
                hVar.setChecked(true);
            }
        }

        /* renamed from: a */
        private void m80954a(int i, int i2) {
            while (i < i2) {
                ((C22341f) this.f54744b.get(i)).f54749a = true;
                i++;
            }
        }

        /* renamed from: a */
        public AbstractC22346k onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new C22343h(C22334f.this.f54723d, viewGroup, C22334f.this.f54736q);
            }
            if (i == 1) {
                return new C22345j(C22334f.this.f54723d, viewGroup);
            }
            if (i == 2) {
                return new C22344i(C22334f.this.f54723d, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new C22336a(C22334f.this.f54720a);
        }

        /* renamed from: a */
        public void onBindViewHolder(AbstractC22346k kVar, int i) {
            Drawable drawable;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) kVar.itemView;
                navigationMenuItemView.setIconTintList(C22334f.this.f54727h);
                if (C22334f.this.f54725f) {
                    navigationMenuItemView.setTextAppearance(C22334f.this.f54724e);
                }
                if (C22334f.this.f54726g != null) {
                    navigationMenuItemView.setTextColor(C22334f.this.f54726g);
                }
                if (C22334f.this.f54728i != null) {
                    drawable = C22334f.this.f54728i.getConstantState().newDrawable();
                } else {
                    drawable = null;
                }
                ViewCompat.m4039a(navigationMenuItemView, drawable);
                C22341f fVar = (C22341f) this.f54744b.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(fVar.f54749a);
                navigationMenuItemView.setHorizontalPadding(C22334f.this.f54729j);
                navigationMenuItemView.setIconPadding(C22334f.this.f54730k);
                if (C22334f.this.f54732m) {
                    navigationMenuItemView.setIconSize(C22334f.this.f54731l);
                }
                navigationMenuItemView.setMaxLines(C22334f.this.f54734o);
                navigationMenuItemView.mo1214a(fVar.mo77844a(), 0);
            } else if (itemViewType == 1) {
                ((TextView) kVar.itemView).setText(((C22341f) this.f54744b.get(i)).mo77844a().getTitle());
            } else if (itemViewType == 2) {
                C22340e eVar = (C22340e) this.f54744b.get(i);
                kVar.itemView.setPadding(0, eVar.mo77842a(), 0, eVar.mo77843b());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$c */
    public static class C22338c implements AbstractC22339d {
        C22338c() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$e */
    public static class C22340e implements AbstractC22339d {

        /* renamed from: a */
        private final int f54747a;

        /* renamed from: b */
        private final int f54748b;

        /* renamed from: a */
        public int mo77842a() {
            return this.f54747a;
        }

        /* renamed from: b */
        public int mo77843b() {
            return this.f54748b;
        }

        public C22340e(int i, int i2) {
            this.f54747a = i;
            this.f54748b = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$f */
    public static class C22341f implements AbstractC22339d {

        /* renamed from: a */
        boolean f54749a;

        /* renamed from: b */
        private final C0326h f54750b;

        /* renamed from: a */
        public C0326h mo77844a() {
            return this.f54750b;
        }

        C22341f(C0326h hVar) {
            this.f54750b = hVar;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: c */
    public int mo1353c() {
        return this.f54739t;
    }

    /* renamed from: f */
    public ColorStateList mo77822f() {
        return this.f54727h;
    }

    /* renamed from: g */
    public ColorStateList mo77824g() {
        return this.f54726g;
    }

    /* renamed from: h */
    public Drawable mo77826h() {
        return this.f54728i;
    }

    /* renamed from: i */
    public int mo77828i() {
        return this.f54729j;
    }

    /* renamed from: j */
    public int mo77829j() {
        return this.f54730k;
    }

    /* renamed from: k */
    public int mo77830k() {
        return this.f54734o;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1243a(boolean z) {
        C22337b bVar = this.f54722c;
        if (bVar != null) {
            bVar.mo77833a();
        }
    }

    /* renamed from: d */
    public C0326h mo77818d() {
        return this.f54722c.mo77839b();
    }

    /* renamed from: e */
    public int mo77820e() {
        return this.f54720a.getChildCount();
    }

    /* renamed from: l */
    private void m80918l() {
        int i;
        if (this.f54720a.getChildCount() != 0 || !this.f54733n) {
            i = 0;
        } else {
            i = this.f54740u;
        }
        NavigationMenuView navigationMenuView = this.f54737r;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    public Parcelable c_() {
        Bundle bundle = new Bundle();
        if (this.f54737r != null) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            this.f54737r.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C22337b bVar = this.f54722c;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.mo77840c());
        }
        if (this.f54720a != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f54720a.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$a */
    public static class C22336a extends AbstractC22346k {
        public C22336a(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.f$k */
    private static abstract class AbstractC22346k extends RecyclerView.ViewHolder {
        public AbstractC22346k(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo77807a(int i) {
        this.f54739t = i;
    }

    /* renamed from: a */
    public void mo77808a(ColorStateList colorStateList) {
        this.f54727h = colorStateList;
        mo1243a(false);
    }

    /* renamed from: b */
    public void mo77814b(ColorStateList colorStateList) {
        this.f54726g = colorStateList;
        mo1243a(false);
    }

    /* renamed from: f */
    public void mo77823f(int i) {
        this.f54734o = i;
        mo1243a(false);
    }

    /* renamed from: a */
    public void mo77809a(Drawable drawable) {
        this.f54728i = drawable;
        mo1243a(false);
    }

    /* renamed from: b */
    public View mo77813b(int i) {
        View inflate = this.f54723d.inflate(i, (ViewGroup) this.f54720a, false);
        mo77810a(inflate);
        return inflate;
    }

    /* renamed from: c */
    public void mo77816c(int i) {
        this.f54724e = i;
        this.f54725f = true;
        mo1243a(false);
    }

    /* renamed from: d */
    public void mo77819d(int i) {
        this.f54729j = i;
        mo1243a(false);
    }

    /* renamed from: e */
    public void mo77821e(int i) {
        this.f54730k = i;
        mo1243a(false);
    }

    /* renamed from: g */
    public void mo77825g(int i) {
        if (this.f54731l != i) {
            this.f54731l = i;
            this.f54732m = true;
            mo1243a(false);
        }
    }

    /* renamed from: h */
    public void mo77827h(int i) {
        this.f54741v = i;
        NavigationMenuView navigationMenuView = this.f54737r;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: b */
    public void mo77815b(boolean z) {
        C22337b bVar = this.f54722c;
        if (bVar != null) {
            bVar.mo77838a(z);
        }
    }

    /* renamed from: c */
    public void mo77817c(boolean z) {
        if (this.f54733n != z) {
            this.f54733n = z;
            m80918l();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1237a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f54737r.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f54722c.mo77834a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f54720a.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: a */
    public AbstractC0339m mo77806a(ViewGroup viewGroup) {
        if (this.f54737r == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f54723d.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f54737r = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C22342g(navigationMenuView));
            if (this.f54722c == null) {
                this.f54722c = new C22337b();
            }
            int i = this.f54741v;
            if (i != -1) {
                this.f54737r.setOverScrollMode(i);
            }
            this.f54720a = (LinearLayout) this.f54723d.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f54737r, false);
            this.f54737r.setAdapter(this.f54722c);
        }
        return this.f54737r;
    }

    /* renamed from: a */
    public void mo77810a(View view) {
        this.f54720a.addView(view);
        NavigationMenuView navigationMenuView = this.f54737r;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: a */
    public void mo77811a(C0326h hVar) {
        this.f54722c.mo77835a(hVar);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1242a(AbstractC0337l.AbstractC0338a aVar) {
        this.f54738s = aVar;
    }

    /* renamed from: a */
    public void mo77812a(C0883ab abVar) {
        int b = abVar.mo4644b();
        if (this.f54740u != b) {
            this.f54740u = b;
            m80918l();
        }
        NavigationMenuView navigationMenuView = this.f54737r;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, abVar.mo4647d());
        ViewCompat.m4056b(this.f54720a, abVar);
    }

    /* renamed from: com.google.android.material.internal.f$g */
    private class C22342g extends C1406t {
        C22342g(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.core.view.C0859a, androidx.recyclerview.widget.C1406t
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            super.mo4535a(view, dVar);
            dVar.mo4559a(C0864d.C0866b.m4256a(C22334f.this.f54722c.mo77841d(), 0, false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$i */
    public static class C22344i extends AbstractC22346k {
        public C22344i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$j */
    public static class C22345j extends AbstractC22346k {
        public C22345j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1345a(Context context, C0322f fVar) {
        this.f54723d = LayoutInflater.from(context);
        this.f54721b = fVar;
        this.f54735p = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1241a(C0322f fVar, boolean z) {
        AbstractC0337l.AbstractC0338a aVar = this.f54738s;
        if (aVar != null) {
            aVar.mo882a(fVar, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$h */
    public static class C22343h extends AbstractC22346k {
        public C22343h(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }
}
