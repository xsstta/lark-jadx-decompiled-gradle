package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0321e;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.u */
public class C0470u extends ListPopupWindow implements AbstractC0469t {

    /* renamed from: a */
    private static Method f1716a;

    /* renamed from: b */
    private AbstractC0469t f1717b;

    /* renamed from: androidx.appcompat.widget.u$a */
    public static class C0471a extends C0461q {

        /* renamed from: b */
        final int f1718b;

        /* renamed from: c */
        final int f1719c;

        /* renamed from: d */
        private AbstractC0469t f1720d;

        /* renamed from: e */
        private MenuItem f1721e;

        @Override // androidx.appcompat.widget.C0461q
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0461q
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0461q
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0461q
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public void setHoverListener(AbstractC0469t tVar) {
            this.f1720d = tVar;
        }

        @Override // android.widget.AbsListView, androidx.appcompat.widget.C0461q
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // androidx.appcompat.widget.C0461q
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.C0461q
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0321e eVar;
            int pointToPosition;
            int i2;
            if (this.f1720d != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    eVar = (C0321e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    eVar = (C0321e) adapter;
                }
                C0326h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < eVar.getCount()) {
                    hVar = eVar.getItem(i2);
                }
                MenuItem menuItem = this.f1721e;
                if (menuItem != hVar) {
                    C0322f a = eVar.mo1371a();
                    if (menuItem != null) {
                        this.f1720d.mo1261a(a, menuItem);
                    }
                    this.f1721e = hVar;
                    if (hVar != null) {
                        this.f1720d.mo1262b(a, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.C0461q
        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo2653a(int i, boolean z) {
            return super.mo2653a(i, z);
        }

        @Override // androidx.appcompat.widget.C0461q
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo2654a(MotionEvent motionEvent, int i) {
            return super.mo2654a(motionEvent, i);
        }

        public C0471a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1718b = 22;
                this.f1719c = 21;
                return;
            }
            this.f1718b = 21;
            this.f1719c = 22;
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1718b) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1719c) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0321e) getAdapter()).mo1371a().mo1395a(false);
                return true;
            }
        }

        @Override // androidx.appcompat.widget.C0461q
        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo2652a(int i, int i2, int i3, int i4, int i5) {
            return super.mo2652a(i, i2, i3, i4, i5);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1716a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    /* renamed from: a */
    public void mo2676a(AbstractC0469t tVar) {
        this.f1717b = tVar;
    }

    /* renamed from: a */
    public void mo2677a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mPopup.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo2679b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mPopup.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: a */
    public void mo2678a(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1716a;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.mPopup.setTouchModal(z);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0469t
    /* renamed from: a */
    public void mo1261a(C0322f fVar, MenuItem menuItem) {
        AbstractC0469t tVar = this.f1717b;
        if (tVar != null) {
            tVar.mo1261a(fVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0469t
    /* renamed from: b */
    public void mo1262b(C0322f fVar, MenuItem menuItem) {
        AbstractC0469t tVar = this.f1717b;
        if (tVar != null) {
            tVar.mo1262b(fVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.ListPopupWindow
    public C0461q createDropDownListView(Context context, boolean z) {
        C0471a aVar = new C0471a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public C0470u(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
