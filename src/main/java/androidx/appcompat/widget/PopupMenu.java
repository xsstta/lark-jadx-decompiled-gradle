package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.C0303f;
import androidx.appcompat.view.menu.AbstractC0342o;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0335k;
import com.larksuite.suite.R;

public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private View.OnTouchListener mDragListener;
    private final C0322f mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    AbstractC0394a mOnDismissListener;
    final C0335k mPopup;

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$a */
    public interface AbstractC0394a {
        /* renamed from: a */
        void mo2194a(PopupMenu popupMenu);
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public void dismiss() {
        this.mPopup.mo1603e();
    }

    public int getGravity() {
        return this.mPopup.mo1593a();
    }

    public MenuInflater getMenuInflater() {
        return new C0303f(this.mContext);
    }

    public void show() {
        this.mPopup.mo1600b();
    }

    public View.OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new AbstractView$OnAttachStateChangeListenerC0466s(this.mAnchor) {
                /* class androidx.appcompat.widget.PopupMenu.C03933 */

                /* access modifiers changed from: protected */
                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
                /* renamed from: b */
                public boolean mo1234b() {
                    PopupMenu.this.show();
                    return true;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
                /* renamed from: c */
                public boolean mo1781c() {
                    PopupMenu.this.dismiss();
                    return true;
                }

                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
                /* renamed from: a */
                public AbstractC0342o mo1233a() {
                    return PopupMenu.this.mPopup.mo1601c();
                }
            };
        }
        return this.mDragListener;
    }

    /* access modifiers changed from: package-private */
    public ListView getMenuListView() {
        if (!this.mPopup.mo1605g()) {
            return null;
        }
        return this.mPopup.mo1606h();
    }

    public void setOnDismissListener(AbstractC0394a aVar) {
        this.mOnDismissListener = aVar;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void setGravity(int i) {
        this.mPopup.mo1594a(i);
    }

    public void inflate(int i) {
        getMenuInflater().inflate(i, this.mMenu);
    }

    public PopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public PopupMenu(Context context, View view, int i) {
        this(context, view, i, R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(Context context, View view, int i, int i2, int i3) {
        this.mContext = context;
        this.mAnchor = view;
        C0322f fVar = new C0322f(context);
        this.mMenu = fVar;
        fVar.mo1390a(new C0322f.AbstractC0323a() {
            /* class androidx.appcompat.widget.PopupMenu.C03911 */

            @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
            /* renamed from: a */
            public void mo836a(C0322f fVar) {
            }

            @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
            /* renamed from: a */
            public boolean mo839a(C0322f fVar, MenuItem menuItem) {
                if (PopupMenu.this.mMenuItemClickListener != null) {
                    return PopupMenu.this.mMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        });
        C0335k kVar = new C0335k(context, fVar, view, false, i2, i3);
        this.mPopup = kVar;
        kVar.mo1594a(i);
        kVar.mo1596a(new PopupWindow.OnDismissListener() {
            /* class androidx.appcompat.widget.PopupMenu.C03922 */

            public void onDismiss() {
                if (PopupMenu.this.mOnDismissListener != null) {
                    PopupMenu.this.mOnDismissListener.mo2194a(PopupMenu.this);
                }
            }
        });
    }
}
