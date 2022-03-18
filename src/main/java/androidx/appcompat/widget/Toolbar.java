package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.view.AbstractC0299c;
import androidx.appcompat.view.C0303f;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.view.menu.SubMenuC0346q;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0904f;
import androidx.core.view.C0906h;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private ColorStateList f1461A;

    /* renamed from: B */
    private ColorStateList f1462B;

    /* renamed from: C */
    private boolean f1463C;

    /* renamed from: D */
    private boolean f1464D;

    /* renamed from: E */
    private final ArrayList<View> f1465E;

    /* renamed from: F */
    private final ArrayList<View> f1466F;

    /* renamed from: G */
    private final int[] f1467G;

    /* renamed from: H */
    private final ActionMenuView.AbstractC0364d f1468H;

    /* renamed from: I */
    private C0428ag f1469I;

    /* renamed from: J */
    private ActionMenuPresenter f1470J;

    /* renamed from: K */
    private C0417a f1471K;

    /* renamed from: L */
    private AbstractC0337l.AbstractC0338a f1472L;

    /* renamed from: M */
    private C0322f.AbstractC0323a f1473M;

    /* renamed from: N */
    private boolean f1474N;

    /* renamed from: O */
    private final Runnable f1475O;

    /* renamed from: a */
    ImageButton f1476a;

    /* renamed from: b */
    View f1477b;

    /* renamed from: c */
    int f1478c;

    /* renamed from: d */
    AbstractC0418b f1479d;

    /* renamed from: e */
    private ActionMenuView f1480e;

    /* renamed from: f */
    private TextView f1481f;

    /* renamed from: g */
    private TextView f1482g;

    /* renamed from: h */
    private ImageButton f1483h;

    /* renamed from: i */
    private ImageView f1484i;

    /* renamed from: j */
    private Drawable f1485j;

    /* renamed from: k */
    private CharSequence f1486k;

    /* renamed from: l */
    private Context f1487l;

    /* renamed from: m */
    private int f1488m;

    /* renamed from: n */
    private int f1489n;

    /* renamed from: o */
    private int f1490o;

    /* renamed from: p */
    private int f1491p;

    /* renamed from: q */
    private int f1492q;

    /* renamed from: r */
    private int f1493r;

    /* renamed from: s */
    private int f1494s;

    /* renamed from: t */
    private int f1495t;

    /* renamed from: u */
    private C0480x f1496u;

    /* renamed from: v */
    private int f1497v;

    /* renamed from: w */
    private int f1498w;

    /* renamed from: x */
    private int f1499x;

    /* renamed from: y */
    private CharSequence f1500y;

    /* renamed from: z */
    private CharSequence f1501z;

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public interface AbstractC0418b {
        /* renamed from: a */
        boolean mo971a(MenuItem menuItem);
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1470J;
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1487l;
    }

    public int getPopupTheme() {
        return this.f1488m;
    }

    public CharSequence getSubtitle() {
        return this.f1501z;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1482g;
    }

    public CharSequence getTitle() {
        return this.f1500y;
    }

    public int getTitleMarginBottom() {
        return this.f1495t;
    }

    public int getTitleMarginEnd() {
        return this.f1493r;
    }

    public int getTitleMarginStart() {
        return this.f1492q;
    }

    public int getTitleMarginTop() {
        return this.f1494s;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1481f;
    }

    /* renamed from: a */
    public boolean mo2352a() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1480e) != null && actionMenuView.mo1785a();
    }

    /* renamed from: a */
    public void mo2350a(C0322f fVar, ActionMenuPresenter actionMenuPresenter) {
        if (fVar != null || this.f1480e != null) {
            mo76548o();
            C0322f d = this.f1480e.mo1790d();
            if (d != fVar) {
                if (d != null) {
                    d.mo1411b(this.f1470J);
                    d.mo1411b(this.f1471K);
                }
                if (this.f1471K == null) {
                    this.f1471K = new C0417a();
                }
                actionMenuPresenter.mo1763c(true);
                if (fVar != null) {
                    fVar.mo1393a(actionMenuPresenter, this.f1487l);
                    fVar.mo1393a(this.f1471K, this.f1487l);
                } else {
                    actionMenuPresenter.mo1345a(this.f1487l, (C0322f) null);
                    this.f1471K.mo1345a(this.f1487l, (C0322f) null);
                    actionMenuPresenter.mo1243a(true);
                    this.f1471K.mo1243a(true);
                }
                this.f1480e.setPopupTheme(this.f1488m);
                this.f1480e.setPresenter(actionMenuPresenter);
                this.f1470J = actionMenuPresenter;
            }
        }
    }

    /* renamed from: a */
    public void mo2349a(Context context, int i) {
        this.f1489n = i;
        TextView textView = this.f1481f;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo2347a(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: a */
    public void mo2348a(int i, int i2) {
        mo76553s();
        this.f1496u.mo2737a(i, i2);
    }

    /* renamed from: a */
    private void m1701a(List<View> list, int i) {
        boolean z = ViewCompat.m4082h(this) == 1;
        int childCount = getChildCount();
        int a = C0904f.m4351a(i, ViewCompat.m4082h(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1505b == 0 && m1702a(childAt) && mo76533c(layoutParams.f476a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1505b == 0 && m1702a(childAt2) && mo76533c(layoutParams2.f476a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo2351a(AbstractC0337l.AbstractC0338a aVar, C0322f.AbstractC0323a aVar2) {
        this.f1472L = aVar;
        this.f1473M = aVar2;
        ActionMenuView actionMenuView = this.f1480e;
        if (actionMenuView != null) {
            actionMenuView.mo1784a(aVar, aVar2);
        }
    }

    /* renamed from: f */
    public void mo2359f() {
        ActionMenuView actionMenuView = this.f1480e;
        if (actionMenuView != null) {
            actionMenuView.mo1803i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    private MenuInflater getMenuInflater() {
        return new C0303f(getContext());
    }

    /* renamed from: m */
    private void mo76546m() {
        if (this.f1484i == null) {
            this.f1484i = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: q */
    private void mo76551q() {
        removeCallbacks(this.f1475O);
        post(this.f1475O);
    }

    /* renamed from: s */
    private void mo76553s() {
        if (this.f1496u == null) {
            this.f1496u = new C0480x();
        }
    }

    /* renamed from: d */
    public boolean mo2357d() {
        ActionMenuView actionMenuView = this.f1480e;
        if (actionMenuView == null || !actionMenuView.mo1792e()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo2358e() {
        ActionMenuView actionMenuView = this.f1480e;
        if (actionMenuView == null || !actionMenuView.mo1793f()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo2360g() {
        C0417a aVar = this.f1471K;
        if (aVar == null || aVar.f1509b == null) {
            return false;
        }
        return true;
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1476a;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1476a;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0480x xVar = this.f1496u;
        if (xVar != null) {
            return xVar.mo2742d();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1498w;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0480x xVar = this.f1496u;
        if (xVar != null) {
            return xVar.mo2736a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0480x xVar = this.f1496u;
        if (xVar != null) {
            return xVar.mo2739b();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0480x xVar = this.f1496u;
        if (xVar != null) {
            return xVar.mo2741c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1497v;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1484i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1484i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo76547n();
        return this.f1480e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1483h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1483h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public Drawable getOverflowIcon() {
        mo76547n();
        return this.f1480e.getOverflowIcon();
    }

    public AbstractC0459o getWrapper() {
        if (this.f1469I == null) {
            this.f1469I = new C0428ag(this, true);
        }
        return this.f1469I;
    }

    /* renamed from: h */
    public void mo2394h() {
        C0326h hVar;
        C0417a aVar = this.f1471K;
        if (aVar == null) {
            hVar = null;
        } else {
            hVar = aVar.f1509b;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1475O);
    }

    public int getCurrentContentInsetLeft() {
        if (ViewCompat.m4082h(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ViewCompat.m4082h(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1497v, 0));
        }
        return getContentInsetStart();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2398l() {
        for (int size = this.f1466F.size() - 1; size >= 0; size--) {
            addView(this.f1466F.get(size));
        }
        this.f1466F.clear();
    }

    /* renamed from: n */
    private void mo76547n() {
        mo76548o();
        if (this.f1480e.mo1790d() == null) {
            C0322f fVar = (C0322f) this.f1480e.getMenu();
            if (this.f1471K == null) {
                this.f1471K = new C0417a();
            }
            this.f1480e.setExpandedActionViewsExclusive(true);
            fVar.mo1393a(this.f1471K, this.f1487l);
        }
    }

    /* renamed from: o */
    private void mo76548o() {
        if (this.f1480e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1480e = actionMenuView;
            actionMenuView.setPopupTheme(this.f1488m);
            this.f1480e.setOnMenuItemClickListener(this.f1468H);
            this.f1480e.mo1784a(this.f1472L, this.f1473M);
            LayoutParams j = generateDefaultLayoutParams();
            j.f476a = 8388613 | (this.f1478c & SmEvents.EVENT_NE_RR);
            this.f1480e.setLayoutParams(j);
            m1700a((View) this.f1480e, false);
        }
    }

    /* renamed from: p */
    private void mo76550p() {
        if (this.f1483h == null) {
            this.f1483h = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams j = generateDefaultLayoutParams();
            j.f476a = 8388611 | (this.f1478c & SmEvents.EVENT_NE_RR);
            this.f1483h.setLayoutParams(j);
        }
    }

    /* renamed from: r */
    private boolean mo76552r() {
        if (!this.f1474N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1702a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo2355c() {
        ActionMenuView actionMenuView = this.f1480e;
        if (actionMenuView == null || !actionMenuView.mo1802h()) {
            return false;
        }
        return true;
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        C0322f d;
        ActionMenuView actionMenuView = this.f1480e;
        if (actionMenuView == null || (d = actionMenuView.mo1790d()) == null || !d.hasVisibleItems()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1498w, 0));
        }
        return getContentInsetEnd();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2395i() {
        if (this.f1476a == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1476a = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1485j);
            this.f1476a.setContentDescription(this.f1486k);
            LayoutParams j = generateDefaultLayoutParams();
            j.f476a = 8388611 | (this.f1478c & SmEvents.EVENT_NE_RR);
            j.f1505b = 2;
            this.f1476a.setLayoutParams(j);
            this.f1476a.setOnClickListener(new View.OnClickListener() {
                /* class androidx.appcompat.widget.Toolbar.View$OnClickListenerC04153 */

                public void onClick(View view) {
                    Toolbar.this.mo2394h();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2397k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f1505b == 2 || childAt == this.f1480e)) {
                removeViewAt(childCount);
                this.f1466F.add(childAt);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0417a aVar = this.f1471K;
        if (!(aVar == null || aVar.f1509b == null)) {
            savedState.f1506a = this.f1471K.f1509b.getItemId();
        }
        savedState.f1507b = mo2354b();
        return savedState;
    }

    /* renamed from: b */
    public boolean mo2354b() {
        ActionMenuView actionMenuView = this.f1480e;
        if (actionMenuView == null || !actionMenuView.mo1794g()) {
            return false;
        }
        return true;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.appcompat.widget.Toolbar.SavedState.C04161 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f1506a;

        /* renamed from: b */
        boolean f1507b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1506a);
            parcel.writeInt(this.f1507b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.f1506a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f1507b = z;
        }
    }

    public void setOnMenuItemClickListener(AbstractC0418b bVar) {
        this.f1479d = bVar;
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        int f1505b;

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            mo2440a(marginLayoutParams);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2440a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1505b = layoutParams.f1505b;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f476a = 8388627;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0417a implements AbstractC0337l {

        /* renamed from: a */
        C0322f f1508a;

        /* renamed from: b */
        C0326h f1509b;

        @Override // androidx.appcompat.view.menu.AbstractC0337l
        /* renamed from: a */
        public void mo1237a(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l
        /* renamed from: a */
        public void mo1241a(C0322f fVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l
        /* renamed from: a */
        public void mo1242a(AbstractC0337l.AbstractC0338a aVar) {
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
        /* renamed from: c */
        public int mo1353c() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l
        public Parcelable c_() {
            return null;
        }

        C0417a() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l
        /* renamed from: a */
        public void mo1243a(boolean z) {
            if (this.f1509b != null) {
                C0322f fVar = this.f1508a;
                boolean z2 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1508a.getItem(i) == this.f1509b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1352b(this.f1508a, this.f1509b);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l
        /* renamed from: a */
        public void mo1345a(Context context, C0322f fVar) {
            C0326h hVar;
            C0322f fVar2 = this.f1508a;
            if (!(fVar2 == null || (hVar = this.f1509b) == null)) {
                fVar2.mo1425d(hVar);
            }
            this.f1508a = fVar;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l
        /* renamed from: b */
        public boolean mo1352b(C0322f fVar, C0326h hVar) {
            if (Toolbar.this.f1477b instanceof AbstractC0299c) {
                ((AbstractC0299c) Toolbar.this.f1477b).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1477b);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1476a);
            Toolbar.this.f1477b = null;
            Toolbar.this.mo2398l();
            this.f1509b = null;
            Toolbar.this.requestLayout();
            hVar.mo1475e(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l
        /* renamed from: a */
        public boolean mo1350a(C0322f fVar, C0326h hVar) {
            Toolbar.this.mo2395i();
            ViewParent parent = Toolbar.this.f1476a.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1476a);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1476a);
            }
            Toolbar.this.f1477b = hVar.getActionView();
            this.f1509b = hVar;
            ViewParent parent2 = Toolbar.this.f1477b.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1477b);
                }
                LayoutParams j = Toolbar.this.generateDefaultLayoutParams();
                j.f476a = 8388611 | (Toolbar.this.f1478c & SmEvents.EVENT_NE_RR);
                j.f1505b = 2;
                Toolbar.this.f1477b.setLayoutParams(j);
                Toolbar toolbar4 = Toolbar.this;
                toolbar4.addView(toolbar4.f1477b);
            }
            Toolbar.this.mo2397k();
            Toolbar.this.requestLayout();
            hVar.mo1475e(true);
            if (Toolbar.this.f1477b instanceof AbstractC0299c) {
                ((AbstractC0299c) Toolbar.this.f1477b).onActionViewExpanded();
            }
            return true;
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public void setCollapsible(boolean z) {
        this.f1474N = z;
        requestLayout();
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1495t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1493r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1492q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1494s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: b */
    private int m1704b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0906h.m4355a(marginLayoutParams) + C0906h.m4357b(marginLayoutParams);
    }

    /* renamed from: c */
    private int m1707c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setCollapseContentDescription(charSequence);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0215a.m655b(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(C0215a.m655b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0215a.m655b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo76550p();
        this.f1483h.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        mo76547n();
        this.f1480e.setOverflowIcon(drawable);
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1462B = colorStateList;
        TextView textView = this.f1482g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1461A = colorStateList;
        TextView textView = this.f1481f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: a */
    private boolean m1702a(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int mo76532b(int i) {
        int i2 = i & SmEvents.EVENT_NE_RR;
        if (i2 == 16 || i2 == 48 || i2 == 80) {
            return i2;
        }
        return this.f1499x & SmEvents.EVENT_NE_RR;
    }

    /* renamed from: c */
    private int mo76533c(int i) {
        int h = ViewCompat.m4082h(this);
        int a = C0904f.m4351a(i, h) & 7;
        if (a == 1 || a == 3 || a == 5) {
            return a;
        }
        if (h == 1) {
            return 5;
        }
        return 3;
    }

    /* renamed from: d */
    private boolean m1708d(View view) {
        if (view.getParent() == this || this.f1466F.contains(view)) {
            return true;
        }
        return false;
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        mo76553s();
        C0480x xVar = this.f1496u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        xVar.mo2738a(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1463C = false;
        }
        if (!this.f1463C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1463C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1463C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo2395i();
        }
        ImageButton imageButton = this.f1476a;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo2395i();
            this.f1476a.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1476a;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1485j);
        }
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1498w) {
            this.f1498w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1497v) {
            this.f1497v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo76546m();
        }
        ImageView imageView = this.f1484i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo76550p();
        }
        ImageButton imageButton = this.f1483h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setPopupTheme(int i) {
        if (this.f1488m != i) {
            this.f1488m = i;
            if (i == 0) {
                this.f1487l = getContext();
            } else {
                this.f1487l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1464D = false;
        }
        if (!this.f1464D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1464D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1464D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C0322f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        ActionMenuView actionMenuView = this.f1480e;
        if (actionMenuView != null) {
            fVar = actionMenuView.mo1790d();
        } else {
            fVar = null;
        }
        if (!(savedState.f1506a == 0 || this.f1471K == null || fVar == null || (findItem = fVar.findItem(savedState.f1506a)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1507b) {
            mo76551q();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            mo76546m();
            if (!m1708d(this.f1484i)) {
                m1700a((View) this.f1484i, true);
            }
        } else {
            ImageView imageView = this.f1484i;
            if (imageView != null && m1708d(imageView)) {
                removeView(this.f1484i);
                this.f1466F.remove(this.f1484i);
            }
        }
        ImageView imageView2 = this.f1484i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mo76550p();
            if (!m1708d(this.f1483h)) {
                m1700a((View) this.f1483h, true);
            }
        } else {
            ImageButton imageButton = this.f1483h;
            if (imageButton != null && m1708d(imageButton)) {
                removeView(this.f1483h);
                this.f1466F.remove(this.f1483h);
            }
        }
        ImageButton imageButton2 = this.f1483h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1482g == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1482g = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1482g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1490o;
                if (i != 0) {
                    this.f1482g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1462B;
                if (colorStateList != null) {
                    this.f1482g.setTextColor(colorStateList);
                }
            }
            if (!m1708d(this.f1482g)) {
                m1700a((View) this.f1482g, true);
            }
        } else {
            TextView textView = this.f1482g;
            if (textView != null && m1708d(textView)) {
                removeView(this.f1482g);
                this.f1466F.remove(this.f1482g);
            }
        }
        TextView textView2 = this.f1482g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1501z = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1481f == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1481f = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1481f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1489n;
                if (i != 0) {
                    this.f1481f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1461A;
                if (colorStateList != null) {
                    this.f1481f.setTextColor(colorStateList);
                }
            }
            if (!m1708d(this.f1481f)) {
                m1700a((View) this.f1481f, true);
            }
        } else {
            TextView textView = this.f1481f;
            if (textView != null && m1708d(textView)) {
                removeView(this.f1481f);
                this.f1466F.remove(this.f1481f);
            }
        }
        TextView textView2 = this.f1481f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1500y = charSequence;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* renamed from: a */
    private int m1695a(View view, int i) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int b = mo76532b(layoutParams.f476a);
        if (b == 48) {
            return getPaddingTop() - i2;
        }
        if (b == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < layoutParams.topMargin) {
            i3 = layoutParams.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < layoutParams.bottomMargin) {
                i3 = Math.max(0, i3 - (layoutParams.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: b */
    public void mo2353b(Context context, int i) {
        this.f1490o = i;
        TextView textView = this.f1482g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    private int m1698a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = layoutParams.leftMargin - i;
            int i6 = layoutParams.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1467G;
        int i10 = 0;
        if (al.m1864a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m1702a(this.f1483h)) {
            m1699a(this.f1483h, i, 0, i2, 0, this.f1491p);
            i5 = this.f1483h.getMeasuredWidth() + m1704b(this.f1483h);
            i4 = Math.max(0, this.f1483h.getMeasuredHeight() + m1707c(this.f1483h));
            i3 = View.combineMeasuredStates(0, this.f1483h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1702a(this.f1476a)) {
            m1699a(this.f1476a, i, 0, i2, 0, this.f1491p);
            i5 = this.f1476a.getMeasuredWidth() + m1704b(this.f1476a);
            i4 = Math.max(i4, this.f1476a.getMeasuredHeight() + m1707c(this.f1476a));
            i3 = View.combineMeasuredStates(i3, this.f1476a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m1702a(this.f1480e)) {
            m1699a(this.f1480e, i, max, i2, 0, this.f1491p);
            i6 = this.f1480e.getMeasuredWidth() + m1704b(this.f1480e);
            i4 = Math.max(i4, this.f1480e.getMeasuredHeight() + m1707c(this.f1480e));
            i3 = View.combineMeasuredStates(i3, this.f1480e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1702a(this.f1477b)) {
            max2 += m1696a(this.f1477b, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1477b.getMeasuredHeight() + m1707c(this.f1477b));
            i3 = View.combineMeasuredStates(i3, this.f1477b.getMeasuredState());
        }
        if (m1702a(this.f1484i)) {
            max2 += m1696a(this.f1484i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1484i.getMeasuredHeight() + m1707c(this.f1484i));
            i3 = View.combineMeasuredStates(i3, this.f1484i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).f1505b == 0 && m1702a(childAt)) {
                max2 += m1696a(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1707c(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1494s + this.f1495t;
        int i13 = this.f1492q + this.f1493r;
        if (m1702a(this.f1481f)) {
            m1696a(this.f1481f, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1481f.getMeasuredWidth() + m1704b(this.f1481f);
            i7 = this.f1481f.getMeasuredHeight() + m1707c(this.f1481f);
            i9 = View.combineMeasuredStates(i3, this.f1481f.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1702a(this.f1482g)) {
            i8 = Math.max(i8, m1696a(this.f1482g, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.f1482g.getMeasuredHeight() + m1707c(this.f1482g);
            i9 = View.combineMeasuredStates(i9, this.f1482g.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!mo76552r()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* renamed from: a */
    private void m1700a(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f1505b = 1;
        if (!z || this.f1477b == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f1466F.add(view);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1499x = 8388627;
        this.f1465E = new ArrayList<>();
        this.f1466F = new ArrayList<>();
        this.f1467G = new int[2];
        this.f1468H = new ActionMenuView.AbstractC0364d() {
            /* class androidx.appcompat.widget.Toolbar.C04131 */

            @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0364d
            /* renamed from: a */
            public boolean mo1814a(MenuItem menuItem) {
                if (Toolbar.this.f1479d != null) {
                    return Toolbar.this.f1479d.mo971a(menuItem);
                }
                return false;
            }
        };
        this.f1475O = new Runnable() {
            /* class androidx.appcompat.widget.Toolbar.RunnableC04142 */

            public void run() {
                Toolbar.this.mo2357d();
            }
        };
        C0427af a = C0427af.m1778a(getContext(), attributeSet, new int[]{16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor}, i, 0);
        ViewCompat.m4034a(this, context, new int[]{16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor}, attributeSet, a.mo2475a(), i, 0);
        this.f1489n = a.mo2491g(28, 0);
        this.f1490o = a.mo2491g(19, 0);
        this.f1499x = a.mo2483c(0, this.f1499x);
        this.f1478c = a.mo2483c(2, 48);
        int d = a.mo2485d(22, 0);
        d = a.mo2492g(27) ? a.mo2485d(27, d) : d;
        this.f1495t = d;
        this.f1494s = d;
        this.f1493r = d;
        this.f1492q = d;
        int d2 = a.mo2485d(25, -1);
        if (d2 >= 0) {
            this.f1492q = d2;
        }
        int d3 = a.mo2485d(24, -1);
        if (d3 >= 0) {
            this.f1493r = d3;
        }
        int d4 = a.mo2485d(26, -1);
        if (d4 >= 0) {
            this.f1494s = d4;
        }
        int d5 = a.mo2485d(23, -1);
        if (d5 >= 0) {
            this.f1495t = d5;
        }
        this.f1491p = a.mo2487e(13, -1);
        int d6 = a.mo2485d(9, Integer.MIN_VALUE);
        int d7 = a.mo2485d(5, Integer.MIN_VALUE);
        int e = a.mo2487e(7, 0);
        int e2 = a.mo2487e(8, 0);
        mo76553s();
        this.f1496u.mo2740b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f1496u.mo2737a(d6, d7);
        }
        this.f1497v = a.mo2485d(10, Integer.MIN_VALUE);
        this.f1498w = a.mo2485d(6, Integer.MIN_VALUE);
        this.f1485j = a.mo2477a(4);
        this.f1486k = a.mo2484c(3);
        CharSequence c = a.mo2484c(21);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo2484c(18);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.f1487l = getContext();
        setPopupTheme(a.mo2491g(17, 0));
        Drawable a2 = a.mo2477a(16);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo2484c(15);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo2477a(11);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo2484c(12);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo2492g(29)) {
            setTitleTextColor(a.mo2488e(29));
        }
        if (a.mo2492g(20)) {
            setSubtitleTextColor(a.mo2488e(20));
        }
        if (a.mo2492g(14)) {
            mo2347a(a.mo2491g(14, 0));
        }
        a.mo2482b();
    }

    /* renamed from: a */
    private int m1697a(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m1695a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: b */
    private int m1705b(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m1695a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x029f A[LOOP:0: B:100:0x029d->B:101:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02c1 A[LOOP:1: B:103:0x02bf->B:104:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02fa A[LOOP:2: B:111:0x02f8->B:112:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 783
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: a */
    private int m1696a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private void m1699a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }
}
