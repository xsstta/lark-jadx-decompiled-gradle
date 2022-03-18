package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0296a;
import androidx.appcompat.view.menu.AbstractC0317b;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.AbstractC0342o;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.view.menu.C0335k;
import androidx.appcompat.view.menu.SubMenuC0346q;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.AbstractC0894b;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class ActionMenuPresenter extends AbstractC0317b implements AbstractC0894b.AbstractC0895a {

    /* renamed from: g */
    C0357d f1231g;

    /* renamed from: h */
    C0359e f1232h;

    /* renamed from: i */
    C0354a f1233i;

    /* renamed from: j */
    RunnableC0356c f1234j;

    /* renamed from: k */
    final C0360f f1235k = new C0360f();

    /* renamed from: l */
    int f1236l;

    /* renamed from: m */
    private Drawable f1237m;

    /* renamed from: n */
    private boolean f1238n;

    /* renamed from: o */
    private boolean f1239o;

    /* renamed from: p */
    private boolean f1240p;

    /* renamed from: q */
    private int f1241q;

    /* renamed from: r */
    private int f1242r;

    /* renamed from: s */
    private int f1243s;

    /* renamed from: t */
    private boolean f1244t;

    /* renamed from: u */
    private boolean f1245u;

    /* renamed from: v */
    private boolean f1246v;

    /* renamed from: w */
    private boolean f1247w;

    /* renamed from: x */
    private int f1248x;

    /* renamed from: y */
    private final SparseBooleanArray f1249y = new SparseBooleanArray();

    /* renamed from: z */
    private C0355b f1250z;

    /* access modifiers changed from: private */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.appcompat.widget.ActionMenuPresenter.SavedState.C03531 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        public int f1251a;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f1251a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1251a);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public boolean mo1348a(int i, C0326h hVar) {
        return hVar.mo1497j();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l, androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public void mo1243a(boolean z) {
        super.mo1243a(z);
        ((View) this.f1032f).requestLayout();
        boolean z2 = false;
        if (this.f1029c != null) {
            ArrayList<C0326h> l = this.f1029c.mo1438l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                AbstractC0894b a = l.get(i).mo1284a();
                if (a != null) {
                    a.mo4681a(this);
                }
            }
        }
        ArrayList<C0326h> m = this.f1029c != null ? this.f1029c.mo1439m() : null;
        if (this.f1239o && m != null) {
            int size2 = m.size();
            if (size2 == 1) {
                z2 = !m.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1231g == null) {
                this.f1231g = new C0357d(this.f1027a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1231g.getParent();
            if (viewGroup != this.f1032f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1231g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1032f;
                actionMenuView.addView(this.f1231g, actionMenuView.mo1788c());
            }
        } else {
            C0357d dVar = this.f1231g;
            if (dVar != null && dVar.getParent() == this.f1032f) {
                ((ViewGroup) this.f1032f).removeView(this.f1231g);
            }
        }
        ((ActionMenuView) this.f1032f).setOverflowReserved(this.f1239o);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public boolean mo1349a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1231g) {
            return false;
        }
        return super.mo1349a(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l, androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public boolean mo1244a(SubMenuC0346q qVar) {
        boolean z = false;
        if (!qVar.hasVisibleItems()) {
            return false;
        }
        SubMenuC0346q qVar2 = qVar;
        while (qVar2.mo1645t() != this.f1029c) {
            qVar2 = (SubMenuC0346q) qVar2.mo1645t();
        }
        View a = m1541a(qVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f1236l = qVar.getItem().getItemId();
        int size = qVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = qVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0354a aVar = new C0354a(this.f1028b, qVar, a);
        this.f1233i = aVar;
        aVar.mo1598a(z);
        this.f1233i.mo1600b();
        super.mo1244a(qVar);
        return true;
    }

    /* renamed from: a */
    public void mo1761a(ActionMenuView actionMenuView) {
        this.f1032f = actionMenuView;
        actionMenuView.mo1265a(this.f1029c);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C0354a extends C0335k {
        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C0335k
        /* renamed from: f */
        public void mo1604f() {
            ActionMenuPresenter.this.f1233i = null;
            ActionMenuPresenter.this.f1236l = 0;
            super.mo1604f();
        }

        public C0354a(Context context, SubMenuC0346q qVar, View view) {
            super(context, qVar, view, false, R.attr.actionOverflowMenuStyle);
            View view2;
            if (!((C0326h) qVar.getItem()).mo1497j()) {
                if (ActionMenuPresenter.this.f1231g == null) {
                    view2 = (View) ActionMenuPresenter.this.f1032f;
                } else {
                    view2 = ActionMenuPresenter.this.f1231g;
                }
                mo1595a(view2);
            }
            mo1597a(ActionMenuPresenter.this.f1235k);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    public Parcelable c_() {
        SavedState savedState = new SavedState();
        savedState.f1251a = this.f1236l;
        return savedState;
    }

    /* renamed from: g */
    public boolean mo1768g() {
        return mo1767f() | mo1769h();
    }

    /* renamed from: h */
    public boolean mo1769h() {
        C0354a aVar = this.f1233i;
        if (aVar == null) {
            return false;
        }
        aVar.mo1603e();
        return true;
    }

    /* renamed from: i */
    public boolean mo1770i() {
        C0359e eVar = this.f1232h;
        if (eVar == null || !eVar.mo1605g()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo1771j() {
        if (this.f1234j != null || mo1770i()) {
            return true;
        }
        return false;
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0355b extends ActionMenuItemView.AbstractC0310b {
        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0310b
        /* renamed from: a */
        public AbstractC0342o mo1235a() {
            if (ActionMenuPresenter.this.f1233i != null) {
                return ActionMenuPresenter.this.f1233i.mo1601c();
            }
            return null;
        }

        C0355b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C0357d extends AppCompatImageView implements ActionMenuView.AbstractC0361a {
        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0361a
        /* renamed from: c */
        public boolean mo1217c() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0361a
        /* renamed from: d */
        public boolean mo1218d() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1766e();
            return true;
        }

        public C0357d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0431ah.m1845a(this, getContentDescription());
            setOnTouchListener(new AbstractView$OnAttachStateChangeListenerC0466s(this, ActionMenuPresenter.this) {
                /* class androidx.appcompat.widget.ActionMenuPresenter.C0357d.C03581 */

                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
                /* renamed from: b */
                public boolean mo1234b() {
                    ActionMenuPresenter.this.mo1766e();
                    return true;
                }

                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
                /* renamed from: a */
                public AbstractC0342o mo1233a() {
                    if (ActionMenuPresenter.this.f1232h == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.f1232h.mo1601c();
                }

                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
                /* renamed from: c */
                public boolean mo1781c() {
                    if (ActionMenuPresenter.this.f1234j != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.mo1767f();
                    return true;
                }
            });
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0774a.m3767a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C0359e extends C0335k {
        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C0335k
        /* renamed from: f */
        public void mo1604f() {
            if (ActionMenuPresenter.this.f1029c != null) {
                ActionMenuPresenter.this.f1029c.close();
            }
            ActionMenuPresenter.this.f1232h = null;
            super.mo1604f();
        }

        public C0359e(Context context, C0322f fVar, View view, boolean z) {
            super(context, fVar, view, z, R.attr.actionOverflowMenuStyle);
            mo1594a(8388613);
            mo1597a(ActionMenuPresenter.this.f1235k);
        }
    }

    /* renamed from: d */
    public Drawable mo1764d() {
        C0357d dVar = this.f1231g;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1238n) {
            return this.f1237m;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo1767f() {
        if (this.f1234j == null || this.f1032f == null) {
            C0359e eVar = this.f1232h;
            if (eVar == null) {
                return false;
            }
            eVar.mo1603e();
            return true;
        }
        ((View) this.f1032f).removeCallbacks(this.f1234j);
        this.f1234j = null;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class RunnableC0356c implements Runnable {

        /* renamed from: b */
        private C0359e f1255b;

        public void run() {
            if (ActionMenuPresenter.this.f1029c != null) {
                ActionMenuPresenter.this.f1029c.mo1430g();
            }
            View view = (View) ActionMenuPresenter.this.f1032f;
            if (!(view == null || view.getWindowToken() == null || !this.f1255b.mo1602d())) {
                ActionMenuPresenter.this.f1232h = this.f1255b;
            }
            ActionMenuPresenter.this.f1234j = null;
        }

        public RunnableC0356c(C0359e eVar) {
            this.f1255b = eVar;
        }
    }

    /* renamed from: e */
    public boolean mo1766e() {
        if (!this.f1239o || mo1770i() || this.f1029c == null || this.f1032f == null || this.f1234j != null || this.f1029c.mo1439m().isEmpty()) {
            return false;
        }
        this.f1234j = new RunnableC0356c(new C0359e(this.f1028b, this.f1029c, this.f1231g, true));
        ((View) this.f1032f).post(this.f1234j);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l, androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: b */
    public boolean mo1247b() {
        int i;
        ArrayList<C0326h> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        ActionMenuPresenter actionMenuPresenter = this;
        View view = null;
        int i5 = 0;
        if (actionMenuPresenter.f1029c != null) {
            arrayList = actionMenuPresenter.f1029c.mo1436j();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f1243s;
        int i7 = actionMenuPresenter.f1242r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f1032f;
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0326h hVar = arrayList.get(i10);
            if (hVar.mo1499l()) {
                i8++;
            } else if (hVar.mo1498k()) {
                i9++;
            } else {
                z3 = true;
            }
            if (actionMenuPresenter.f1247w && hVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.f1239o && (z3 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1249y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1245u) {
            int i12 = actionMenuPresenter.f1248x;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0326h hVar2 = arrayList.get(i13);
            if (hVar2.mo1499l()) {
                View a = actionMenuPresenter.mo1341a(hVar2, view, viewGroup);
                if (actionMenuPresenter.f1245u) {
                    i2 -= ActionMenuView.m1578a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                hVar2.mo1473d(true);
                i4 = i;
            } else if (hVar2.mo1498k()) {
                int groupId2 = hVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                if ((i11 > 0 || z4) && i7 > 0 && (!actionMenuPresenter.f1245u || i2 > 0)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = z;
                i4 = i;
                if (z) {
                    View a2 = actionMenuPresenter.mo1341a(hVar2, null, viewGroup);
                    if (actionMenuPresenter.f1245u) {
                        int a3 = ActionMenuView.m1578a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    if (!actionMenuPresenter.f1245u ? i7 + i14 <= 0 : i7 < 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z = z5 & z2;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C0326h hVar3 = arrayList.get(i15);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.mo1497j()) {
                                i11++;
                            }
                            hVar3.mo1473d(false);
                        }
                    }
                }
                if (z) {
                    i11--;
                }
                hVar2.mo1473d(z);
            } else {
                i4 = i;
                hVar2.mo1473d(false);
                i13++;
                view = null;
                actionMenuPresenter = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            actionMenuPresenter = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: c */
    public void mo1763c(boolean z) {
        this.f1247w = z;
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0360f implements AbstractC0337l.AbstractC0338a {
        C0360f() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public boolean mo883a(C0322f fVar) {
            if (fVar == ActionMenuPresenter.this.f1029c) {
                return false;
            }
            ActionMenuPresenter.this.f1236l = ((SubMenuC0346q) fVar).getItem().getItemId();
            AbstractC0337l.AbstractC0338a a = ActionMenuPresenter.this.mo1342a();
            if (a != null) {
                return a.mo883a(fVar);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public void mo882a(C0322f fVar, boolean z) {
            if (fVar instanceof SubMenuC0346q) {
                fVar.mo1445q().mo1395a(false);
            }
            AbstractC0337l.AbstractC0338a a = ActionMenuPresenter.this.mo1342a();
            if (a != null) {
                a.mo882a(fVar, z);
            }
        }
    }

    /* renamed from: b */
    public void mo1762b(boolean z) {
        this.f1239o = z;
        this.f1240p = true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public AbstractC0339m mo1343a(ViewGroup viewGroup) {
        AbstractC0339m mVar = this.f1032f;
        AbstractC0339m a = super.mo1343a(viewGroup);
        if (mVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public void mo1759a(Configuration configuration) {
        if (!this.f1244t) {
            this.f1243s = C0296a.m1150a(this.f1028b).mo1151a();
        }
        if (this.f1029c != null) {
            this.f1029c.mo1412b(true);
        }
    }

    /* renamed from: a */
    private View m1541a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1032f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof AbstractC0339m.AbstractC0340a) && ((AbstractC0339m.AbstractC0340a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC0894b.AbstractC0895a
    /* renamed from: d */
    public void mo1765d(boolean z) {
        if (z) {
            super.mo1244a((SubMenuC0346q) null);
        } else if (this.f1029c != null) {
            this.f1029c.mo1395a(false);
        }
    }

    /* renamed from: a */
    public void mo1760a(Drawable drawable) {
        C0357d dVar = this.f1231g;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1238n = true;
        this.f1237m = drawable;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1237a(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.f1251a > 0 && (findItem = this.f1029c.findItem(savedState.f1251a)) != null) {
                mo1244a((SubMenuC0346q) findItem.getSubMenu());
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l, androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public void mo1241a(C0322f fVar, boolean z) {
        mo1768g();
        super.mo1241a(fVar, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l, androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public void mo1345a(Context context, C0322f fVar) {
        super.mo1345a(context, fVar);
        Resources resources = context.getResources();
        C0296a a = C0296a.m1150a(context);
        if (!this.f1240p) {
            this.f1239o = a.mo1152b();
        }
        if (!this.f1246v) {
            this.f1241q = a.mo1153c();
        }
        if (!this.f1244t) {
            this.f1243s = a.mo1151a();
        }
        int i = this.f1241q;
        if (this.f1239o) {
            if (this.f1231g == null) {
                C0357d dVar = new C0357d(this.f1027a);
                this.f1231g = dVar;
                if (this.f1238n) {
                    dVar.setImageDrawable(this.f1237m);
                    this.f1237m = null;
                    this.f1238n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1231g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1231g.getMeasuredWidth();
        } else {
            this.f1231g = null;
        }
        this.f1242r = i;
        this.f1248x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public void mo1347a(C0326h hVar, AbstractC0339m.AbstractC0340a aVar) {
        aVar.mo1214a(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1032f);
        if (this.f1250z == null) {
            this.f1250z = new C0355b();
        }
        actionMenuItemView.setPopupCallback(this.f1250z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0317b
    /* renamed from: a */
    public View mo1341a(C0326h hVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.mo1501n()) {
            actionView = super.mo1341a(hVar, view, viewGroup);
        }
        if (hVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }
}
