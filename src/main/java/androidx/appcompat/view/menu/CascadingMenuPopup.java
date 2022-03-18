package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.widget.AbstractC0469t;
import androidx.appcompat.widget.C0470u;
import androidx.core.view.C0904f;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class CascadingMenuPopup extends AbstractC0334j implements View.OnKeyListener, PopupWindow.OnDismissListener, AbstractC0337l {

    /* renamed from: g */
    private static final int f950g = 2131492888;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f951A;

    /* renamed from: a */
    final Handler f952a;

    /* renamed from: b */
    final List<C0315a> f953b = new ArrayList();

    /* renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f954c = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class androidx.appcompat.view.menu.CascadingMenuPopup.ViewTreeObserver$OnGlobalLayoutListenerC03111 */

        public void onGlobalLayout() {
            if (CascadingMenuPopup.this.isShowing() && CascadingMenuPopup.this.f953b.size() > 0 && !CascadingMenuPopup.this.f953b.get(0).f984a.isModal()) {
                View view = CascadingMenuPopup.this.f955d;
                if (view == null || !view.isShown()) {
                    CascadingMenuPopup.this.dismiss();
                    return;
                }
                for (C0315a aVar : CascadingMenuPopup.this.f953b) {
                    aVar.f984a.show();
                }
            }
        }
    };

    /* renamed from: d */
    View f955d;

    /* renamed from: e */
    ViewTreeObserver f956e;

    /* renamed from: f */
    boolean f957f;

    /* renamed from: h */
    private final Context f958h;

    /* renamed from: i */
    private final int f959i;

    /* renamed from: j */
    private final int f960j;

    /* renamed from: k */
    private final int f961k;

    /* renamed from: l */
    private final boolean f962l;

    /* renamed from: m */
    private final List<C0322f> f963m = new ArrayList();

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f964n = new View.OnAttachStateChangeListener() {
        /* class androidx.appcompat.view.menu.CascadingMenuPopup.View$OnAttachStateChangeListenerC03122 */

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (CascadingMenuPopup.this.f956e != null) {
                if (!CascadingMenuPopup.this.f956e.isAlive()) {
                    CascadingMenuPopup.this.f956e = view.getViewTreeObserver();
                }
                CascadingMenuPopup.this.f956e.removeGlobalOnLayoutListener(CascadingMenuPopup.this.f954c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o */
    private final AbstractC0469t f965o = new AbstractC0469t() {
        /* class androidx.appcompat.view.menu.CascadingMenuPopup.C03133 */

        @Override // androidx.appcompat.widget.AbstractC0469t
        /* renamed from: a */
        public void mo1261a(C0322f fVar, MenuItem menuItem) {
            CascadingMenuPopup.this.f952a.removeCallbacksAndMessages(fVar);
        }

        @Override // androidx.appcompat.widget.AbstractC0469t
        /* renamed from: b */
        public void mo1262b(final C0322f fVar, final MenuItem menuItem) {
            final C0315a aVar = null;
            CascadingMenuPopup.this.f952a.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f953b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (fVar == CascadingMenuPopup.this.f953b.get(i).f985b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < CascadingMenuPopup.this.f953b.size()) {
                    aVar = CascadingMenuPopup.this.f953b.get(i2);
                }
                CascadingMenuPopup.this.f952a.postAtTime(new Runnable() {
                    /* class androidx.appcompat.view.menu.CascadingMenuPopup.C03133.RunnableC03141 */

                    public void run() {
                        if (aVar != null) {
                            CascadingMenuPopup.this.f957f = true;
                            aVar.f985b.mo1395a(false);
                            CascadingMenuPopup.this.f957f = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            fVar.mo1396a(menuItem, 4);
                        }
                    }
                }, fVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: p */
    private int f966p = 0;

    /* renamed from: q */
    private int f967q = 0;

    /* renamed from: r */
    private View f968r;

    /* renamed from: s */
    private int f969s;

    /* renamed from: t */
    private boolean f970t;

    /* renamed from: u */
    private boolean f971u;

    /* renamed from: v */
    private int f972v;

    /* renamed from: w */
    private int f973w;

    /* renamed from: x */
    private boolean f974x;

    /* renamed from: y */
    private boolean f975y;

    /* renamed from: z */
    private AbstractC0337l.AbstractC0338a f976z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1237a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1247b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    public Parcelable c_() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: d */
    public boolean mo1251d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1244a(SubMenuC0346q qVar) {
        for (C0315a aVar : this.f953b) {
            if (qVar == aVar.f985b) {
                aVar.mo1264a().requestFocus();
                return true;
            }
        }
        if (!qVar.hasVisibleItems()) {
            return false;
        }
        mo1240a((C0322f) qVar);
        AbstractC0337l.AbstractC0338a aVar2 = this.f976z;
        if (aVar2 != null) {
            aVar2.mo883a(qVar);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$a */
    public static class C0315a {

        /* renamed from: a */
        public final C0470u f984a;

        /* renamed from: b */
        public final C0322f f985b;

        /* renamed from: c */
        public final int f986c;

        /* renamed from: a */
        public ListView mo1264a() {
            return this.f984a.getListView();
        }

        public C0315a(C0470u uVar, C0322f fVar, int i) {
            this.f984a = uVar;
            this.f985b = fVar;
            this.f986c = i;
        }
    }

    /* renamed from: g */
    private int m1241g() {
        if (ViewCompat.m4082h(this.f968r) == 1) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public ListView getListView() {
        if (this.f953b.isEmpty()) {
            return null;
        }
        List<C0315a> list = this.f953b;
        return list.get(list.size() - 1).mo1264a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public boolean isShowing() {
        if (this.f953b.size() <= 0 || !this.f953b.get(0).f984a.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private C0470u m1240f() {
        C0470u uVar = new C0470u(this.f958h, null, this.f960j, this.f961k);
        uVar.mo2676a(this.f965o);
        uVar.setOnItemClickListener(this);
        uVar.setOnDismissListener(this);
        uVar.setAnchorView(this.f968r);
        uVar.setDropDownGravity(this.f967q);
        uVar.setModal(true);
        uVar.setInputMethodMode(2);
        return uVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public void dismiss() {
        int size = this.f953b.size();
        if (size > 0) {
            C0315a[] aVarArr = (C0315a[]) this.f953b.toArray(new C0315a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0315a aVar = aVarArr[i];
                if (aVar.f984a.isShowing()) {
                    aVar.f984a.dismiss();
                }
            }
        }
    }

    public void onDismiss() {
        C0315a aVar;
        int size = this.f953b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f953b.get(i);
            if (!aVar.f984a.isShowing()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f985b.mo1395a(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public void show() {
        boolean z;
        if (!isShowing()) {
            for (C0322f fVar : this.f963m) {
                m1237c(fVar);
            }
            this.f963m.clear();
            View view = this.f968r;
            this.f955d = view;
            if (view != null) {
                if (this.f956e == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f956e = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f954c);
                }
                this.f955d.addOnAttachStateChangeListener(this.f964n);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: b */
    public void mo1246b(boolean z) {
        this.f974x = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: c */
    public void mo1249c(boolean z) {
        this.f975y = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: a */
    public void mo1239a(PopupWindow.OnDismissListener onDismissListener) {
        this.f951A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: b */
    public void mo1245b(int i) {
        this.f970t = true;
        this.f972v = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: c */
    public void mo1248c(int i) {
        this.f971u = true;
        this.f973w = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1242a(AbstractC0337l.AbstractC0338a aVar) {
        this.f976z = aVar;
    }

    /* renamed from: d */
    private int m1239d(C0322f fVar) {
        int size = this.f953b.size();
        for (int i = 0; i < size; i++) {
            if (fVar == this.f953b.get(i).f985b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m1238d(int i) {
        List<C0315a> list = this.f953b;
        ListView a = list.get(list.size() - 1).mo1264a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f955d.getWindowVisibleDisplayFrame(rect);
        if (this.f969s == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: a */
    public void mo1236a(int i) {
        if (this.f966p != i) {
            this.f966p = i;
            this.f967q = C0904f.m4351a(i, ViewCompat.m4082h(this.f968r));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: a */
    public void mo1238a(View view) {
        if (this.f968r != view) {
            this.f968r = view;
            this.f967q = C0904f.m4351a(this.f966p, ViewCompat.m4082h(view));
        }
    }

    /* renamed from: c */
    private void m1237c(C0322f fVar) {
        View view;
        C0315a aVar;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f958h);
        C0321e eVar = new C0321e(fVar, from, this.f962l, f950g);
        if (!isShowing() && this.f974x) {
            eVar.mo1373a(true);
        } else if (isShowing()) {
            eVar.mo1373a(AbstractC0334j.m1431b(fVar));
        }
        int a = m1429a(eVar, null, this.f958h, this.f959i);
        C0470u f = m1240f();
        f.setAdapter(eVar);
        f.setContentWidth(a);
        f.setDropDownGravity(this.f967q);
        if (this.f953b.size() > 0) {
            List<C0315a> list = this.f953b;
            aVar = list.get(list.size() - 1);
            view = m1236a(aVar, fVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            f.mo2678a(false);
            f.mo2677a((Object) null);
            int d = m1238d(a);
            if (d == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f969s = d;
            if (Build.VERSION.SDK_INT >= 26) {
                f.setAnchorView(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f968r.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f967q & 7) == 5) {
                    iArr[0] = iArr[0] + this.f968r.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f967q & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                f.setHorizontalOffset(i3);
                f.setOverlapAnchor(true);
                f.setVerticalOffset(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                f.setHorizontalOffset(i3);
                f.setOverlapAnchor(true);
                f.setVerticalOffset(i2);
            }
            i3 = i + a;
            f.setHorizontalOffset(i3);
            f.setOverlapAnchor(true);
            f.setVerticalOffset(i2);
        } else {
            if (this.f970t) {
                f.setHorizontalOffset(this.f972v);
            }
            if (this.f971u) {
                f.setVerticalOffset(this.f973w);
            }
            f.setEpicenterBounds(mo1591e());
        }
        this.f953b.add(new C0315a(f, fVar, this.f969s));
        f.show();
        ListView listView = f.getListView();
        listView.setOnKeyListener(this);
        if (aVar == null && this.f975y && fVar.mo1440n() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(fVar.mo1440n());
            listView.addHeaderView(frameLayout, null, false);
            f.show();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: a */
    public void mo1240a(C0322f fVar) {
        fVar.mo1393a(this, this.f958h);
        if (isShowing()) {
            m1237c(fVar);
        } else {
            this.f963m.add(fVar);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1243a(boolean z) {
        for (C0315a aVar : this.f953b) {
            m1430a(aVar.mo1264a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private MenuItem m1235a(C0322f fVar, C0322f fVar2) {
        int size = fVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = fVar.getItem(i);
            if (item.hasSubMenu() && fVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m1236a(C0315a aVar, C0322f fVar) {
        int i;
        C0321e eVar;
        int firstVisiblePosition;
        MenuItem a = m1235a(aVar.f985b, fVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo1264a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            eVar = (C0321e) headerViewListAdapter.getWrappedAdapter();
        } else {
            eVar = (C0321e) adapter;
            i = 0;
        }
        int count = eVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == eVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1241a(C0322f fVar, boolean z) {
        int d = m1239d(fVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f953b.size()) {
                this.f953b.get(i).f985b.mo1395a(false);
            }
            C0315a remove = this.f953b.remove(d);
            remove.f985b.mo1411b(this);
            if (this.f957f) {
                remove.f984a.mo2679b(null);
                remove.f984a.setAnimationStyle(0);
            }
            remove.f984a.dismiss();
            int size = this.f953b.size();
            if (size > 0) {
                this.f969s = this.f953b.get(size - 1).f986c;
            } else {
                this.f969s = m1241g();
            }
            if (size == 0) {
                dismiss();
                AbstractC0337l.AbstractC0338a aVar = this.f976z;
                if (aVar != null) {
                    aVar.mo882a(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f956e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f956e.removeGlobalOnLayoutListener(this.f954c);
                    }
                    this.f956e = null;
                }
                this.f955d.removeOnAttachStateChangeListener(this.f964n);
                this.f951A.onDismiss();
            } else if (z) {
                this.f953b.get(0).f985b.mo1395a(false);
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public CascadingMenuPopup(Context context, View view, int i, int i2, boolean z) {
        this.f958h = context;
        this.f968r = view;
        this.f960j = i;
        this.f961k = i2;
        this.f962l = z;
        this.f974x = false;
        this.f969s = m1241g();
        Resources resources = context.getResources();
        this.f959i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f952a = new Handler();
    }
}
