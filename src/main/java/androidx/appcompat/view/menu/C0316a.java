package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.p026a.p027a.AbstractMenuItemC0708b;
import androidx.core.view.AbstractC0894b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0316a implements AbstractMenuItemC0708b {

    /* renamed from: a */
    private final int f1007a;

    /* renamed from: b */
    private final int f1008b;

    /* renamed from: c */
    private final int f1009c;

    /* renamed from: d */
    private CharSequence f1010d;

    /* renamed from: e */
    private CharSequence f1011e;

    /* renamed from: f */
    private Intent f1012f;

    /* renamed from: g */
    private char f1013g;

    /* renamed from: h */
    private int f1014h = 4096;

    /* renamed from: i */
    private char f1015i;

    /* renamed from: j */
    private int f1016j = 4096;

    /* renamed from: k */
    private Drawable f1017k;

    /* renamed from: l */
    private Context f1018l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f1019m;

    /* renamed from: n */
    private CharSequence f1020n;

    /* renamed from: o */
    private CharSequence f1021o;

    /* renamed from: p */
    private ColorStateList f1022p;

    /* renamed from: q */
    private PorterDuff.Mode f1023q;

    /* renamed from: r */
    private boolean f1024r;

    /* renamed from: s */
    private boolean f1025s;

    /* renamed from: t */
    private int f1026t = 16;

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    /* renamed from: a */
    public AbstractC0894b mo1284a() {
        return null;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public boolean expandActionView() {
        return false;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public View getActionView() {
        return null;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public void setShowAsAction(int i) {
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public int getAlphabeticModifiers() {
        return this.f1016j;
    }

    public char getAlphabeticShortcut() {
        return this.f1015i;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public CharSequence getContentDescription() {
        return this.f1020n;
    }

    public int getGroupId() {
        return this.f1008b;
    }

    public Drawable getIcon() {
        return this.f1017k;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public ColorStateList getIconTintList() {
        return this.f1022p;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public PorterDuff.Mode getIconTintMode() {
        return this.f1023q;
    }

    public Intent getIntent() {
        return this.f1012f;
    }

    public int getItemId() {
        return this.f1007a;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public int getNumericModifiers() {
        return this.f1014h;
    }

    public char getNumericShortcut() {
        return this.f1013g;
    }

    public int getOrder() {
        return this.f1009c;
    }

    public CharSequence getTitle() {
        return this.f1010d;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public CharSequence getTooltipText() {
        return this.f1021o;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1011e;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f1010d;
    }

    public boolean isCheckable() {
        if ((this.f1026t & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f1026t & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f1026t & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.f1026t & 8) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m1270b() {
        Drawable drawable = this.f1017k;
        if (drawable == null) {
            return;
        }
        if (this.f1024r || this.f1025s) {
            Drawable g = C0774a.m3779g(drawable);
            this.f1017k = g;
            Drawable mutate = g.mutate();
            this.f1017k = mutate;
            if (this.f1024r) {
                C0774a.m3768a(mutate, this.f1022p);
            }
            if (this.f1025s) {
                C0774a.m3771a(this.f1017k, this.f1023q);
            }
        }
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    /* renamed from: a */
    public AbstractMenuItemC0708b setContentDescription(CharSequence charSequence) {
        this.f1020n = charSequence;
        return this;
    }

    /* renamed from: b */
    public AbstractMenuItemC0708b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1012f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1013g = c;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1019m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1010d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1011e = charSequence;
        return this;
    }

    /* renamed from: a */
    public AbstractMenuItemC0708b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    /* renamed from: b */
    public AbstractMenuItemC0708b setTooltipText(CharSequence charSequence) {
        this.f1021o = charSequence;
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1015i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1026t = (z ? 1 : 0) | (this.f1026t & -2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1017k = drawable;
        m1270b();
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public AbstractMenuItemC0708b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.f1026t & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f1026t = i | i2;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.f1026t & -17;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f1026t = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1017k = ContextCompat.getDrawable(this.f1018l, i);
        m1270b();
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1022p = colorStateList;
        this.f1024r = true;
        m1270b();
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1023q = mode;
        this.f1025s = true;
        m1270b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1010d = this.f1018l.getResources().getString(i);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1026t & 8;
        if (z) {
            i = 0;
        }
        this.f1026t = i2 | i;
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    /* renamed from: a */
    public AbstractMenuItemC0708b mo1282a(AbstractC0894b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1015i = Character.toLowerCase(c);
        this.f1016j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setNumericShortcut(char c, int i) {
        this.f1013g = c;
        this.f1014h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1013g = c;
        this.f1015i = Character.toLowerCase(c2);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1013g = c;
        this.f1014h = KeyEvent.normalizeMetaState(i);
        this.f1015i = Character.toLowerCase(c2);
        this.f1016j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public C0316a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1018l = context;
        this.f1007a = i2;
        this.f1008b = i;
        this.f1009c = i4;
        this.f1010d = charSequence;
    }
}
