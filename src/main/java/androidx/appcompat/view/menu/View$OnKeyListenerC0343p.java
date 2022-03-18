package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.widget.C0470u;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.p */
public final class View$OnKeyListenerC0343p extends AbstractC0334j implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, AbstractC0337l {

    /* renamed from: e */
    private static final int f1147e = 2131492896;

    /* renamed from: a */
    final C0470u f1148a;

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f1149b = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class androidx.appcompat.view.menu.View$OnKeyListenerC0343p.ViewTreeObserver$OnGlobalLayoutListenerC03441 */

        public void onGlobalLayout() {
            if (View$OnKeyListenerC0343p.this.isShowing() && !View$OnKeyListenerC0343p.this.f1148a.isModal()) {
                View view = View$OnKeyListenerC0343p.this.f1150c;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC0343p.this.dismiss();
                } else {
                    View$OnKeyListenerC0343p.this.f1148a.show();
                }
            }
        }
    };

    /* renamed from: c */
    View f1150c;

    /* renamed from: d */
    ViewTreeObserver f1151d;

    /* renamed from: f */
    private final Context f1152f;

    /* renamed from: g */
    private final C0322f f1153g;

    /* renamed from: h */
    private final C0321e f1154h;

    /* renamed from: i */
    private final boolean f1155i;

    /* renamed from: j */
    private final int f1156j;

    /* renamed from: k */
    private final int f1157k;

    /* renamed from: l */
    private final int f1158l;

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f1159m = new View.OnAttachStateChangeListener() {
        /* class androidx.appcompat.view.menu.View$OnKeyListenerC0343p.View$OnAttachStateChangeListenerC03452 */

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (View$OnKeyListenerC0343p.this.f1151d != null) {
                if (!View$OnKeyListenerC0343p.this.f1151d.isAlive()) {
                    View$OnKeyListenerC0343p.this.f1151d = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0343p.this.f1151d.removeGlobalOnLayoutListener(View$OnKeyListenerC0343p.this.f1149b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: n */
    private PopupWindow.OnDismissListener f1160n;

    /* renamed from: o */
    private View f1161o;

    /* renamed from: p */
    private AbstractC0337l.AbstractC0338a f1162p;

    /* renamed from: q */
    private boolean f1163q;

    /* renamed from: r */
    private boolean f1164r;

    /* renamed from: s */
    private int f1165s;

    /* renamed from: t */
    private int f1166t = 0;

    /* renamed from: u */
    private boolean f1167u;

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1237a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: a */
    public void mo1240a(C0322f fVar) {
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

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public ListView getListView() {
        return this.f1148a.getListView();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public void dismiss() {
        if (isShowing()) {
            this.f1148a.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public boolean isShowing() {
        if (this.f1163q || !this.f1148a.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public void show() {
        if (!m1478f()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void onDismiss() {
        this.f1163q = true;
        this.f1153g.close();
        ViewTreeObserver viewTreeObserver = this.f1151d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1151d = this.f1150c.getViewTreeObserver();
            }
            this.f1151d.removeGlobalOnLayoutListener(this.f1149b);
            this.f1151d = null;
        }
        this.f1150c.removeOnAttachStateChangeListener(this.f1159m);
        PopupWindow.OnDismissListener onDismissListener = this.f1160n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    private boolean m1478f() {
        View view;
        boolean z;
        if (isShowing()) {
            return true;
        }
        if (this.f1163q || (view = this.f1161o) == null) {
            return false;
        }
        this.f1150c = view;
        this.f1148a.setOnDismissListener(this);
        this.f1148a.setOnItemClickListener(this);
        this.f1148a.setModal(true);
        View view2 = this.f1150c;
        if (this.f1151d == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1151d = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1149b);
        }
        view2.addOnAttachStateChangeListener(this.f1159m);
        this.f1148a.setAnchorView(view2);
        this.f1148a.setDropDownGravity(this.f1166t);
        if (!this.f1164r) {
            this.f1165s = m1429a(this.f1154h, null, this.f1152f, this.f1156j);
            this.f1164r = true;
        }
        this.f1148a.setContentWidth(this.f1165s);
        this.f1148a.setInputMethodMode(2);
        this.f1148a.setEpicenterBounds(mo1591e());
        this.f1148a.show();
        ListView listView = this.f1148a.getListView();
        listView.setOnKeyListener(this);
        if (this.f1167u && this.f1153g.mo1440n() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1152f).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1153g.mo1440n());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f1148a.setAdapter(this.f1154h);
        this.f1148a.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: a */
    public void mo1236a(int i) {
        this.f1166t = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: c */
    public void mo1249c(boolean z) {
        this.f1167u = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: b */
    public void mo1245b(int i) {
        this.f1148a.setHorizontalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: c */
    public void mo1248c(int i) {
        this.f1148a.setVerticalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: a */
    public void mo1238a(View view) {
        this.f1161o = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: b */
    public void mo1246b(boolean z) {
        this.f1154h.mo1373a(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0334j
    /* renamed from: a */
    public void mo1239a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1160n = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1242a(AbstractC0337l.AbstractC0338a aVar) {
        this.f1162p = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1243a(boolean z) {
        this.f1164r = false;
        C0321e eVar = this.f1154h;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1244a(SubMenuC0346q qVar) {
        if (qVar.hasVisibleItems()) {
            C0335k kVar = new C0335k(this.f1152f, qVar, this.f1150c, this.f1155i, this.f1157k, this.f1158l);
            kVar.mo1597a(this.f1162p);
            kVar.mo1598a(AbstractC0334j.m1431b(qVar));
            kVar.mo1596a(this.f1160n);
            this.f1160n = null;
            this.f1153g.mo1395a(false);
            int horizontalOffset = this.f1148a.getHorizontalOffset();
            int verticalOffset = this.f1148a.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.f1166t, ViewCompat.m4082h(this.f1161o)) & 7) == 5) {
                horizontalOffset += this.f1161o.getWidth();
            }
            if (kVar.mo1599a(horizontalOffset, verticalOffset)) {
                AbstractC0337l.AbstractC0338a aVar = this.f1162p;
                if (aVar == null) {
                    return true;
                }
                aVar.mo883a(qVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1241a(C0322f fVar, boolean z) {
        if (fVar == this.f1153g) {
            dismiss();
            AbstractC0337l.AbstractC0338a aVar = this.f1162p;
            if (aVar != null) {
                aVar.mo882a(fVar, z);
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

    public View$OnKeyListenerC0343p(Context context, C0322f fVar, View view, int i, int i2, boolean z) {
        this.f1152f = context;
        this.f1153g = fVar;
        this.f1155i = z;
        this.f1154h = new C0321e(fVar, LayoutInflater.from(context), z, f1147e);
        this.f1157k = i;
        this.f1158l = i2;
        Resources resources = context.getResources();
        this.f1156j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1161o = view;
        this.f1148a = new C0470u(context, null, i, i2);
        fVar.mo1393a(this, context);
    }
}
