package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.p026a.p027a.AbstractMenuItemC0708b;
import androidx.core.view.AbstractC0894b;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.view.menu.h */
public final class C0326h implements AbstractMenuItemC0708b {

    /* renamed from: A */
    private View f1089A;

    /* renamed from: B */
    private AbstractC0894b f1090B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1091C;

    /* renamed from: D */
    private boolean f1092D;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1093E;

    /* renamed from: a */
    C0322f f1094a;

    /* renamed from: b */
    private final int f1095b;

    /* renamed from: c */
    private final int f1096c;

    /* renamed from: d */
    private final int f1097d;

    /* renamed from: e */
    private final int f1098e;

    /* renamed from: f */
    private CharSequence f1099f;

    /* renamed from: g */
    private CharSequence f1100g;

    /* renamed from: h */
    private Intent f1101h;

    /* renamed from: i */
    private char f1102i;

    /* renamed from: j */
    private int f1103j = 4096;

    /* renamed from: k */
    private char f1104k;

    /* renamed from: l */
    private int f1105l = 4096;

    /* renamed from: m */
    private Drawable f1106m;

    /* renamed from: n */
    private int f1107n;

    /* renamed from: o */
    private SubMenuC0346q f1108o;

    /* renamed from: p */
    private Runnable f1109p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1110q;

    /* renamed from: r */
    private CharSequence f1111r;

    /* renamed from: s */
    private CharSequence f1112s;

    /* renamed from: t */
    private ColorStateList f1113t;

    /* renamed from: u */
    private PorterDuff.Mode f1114u;

    /* renamed from: v */
    private boolean f1115v;

    /* renamed from: w */
    private boolean f1116w;

    /* renamed from: x */
    private boolean f1117x;

    /* renamed from: y */
    private int f1118y = 16;

    /* renamed from: z */
    private int f1119z;

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    /* renamed from: a */
    public AbstractC0894b mo1284a() {
        return this.f1090B;
    }

    /* renamed from: c */
    public int mo1470c() {
        return this.f1098e;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public int getAlphabeticModifiers() {
        return this.f1105l;
    }

    public char getAlphabeticShortcut() {
        return this.f1104k;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public CharSequence getContentDescription() {
        return this.f1111r;
    }

    public int getGroupId() {
        return this.f1096c;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public ColorStateList getIconTintList() {
        return this.f1113t;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public PorterDuff.Mode getIconTintMode() {
        return this.f1114u;
    }

    public Intent getIntent() {
        return this.f1101h;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1095b;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1093E;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public int getNumericModifiers() {
        return this.f1103j;
    }

    public char getNumericShortcut() {
        return this.f1102i;
    }

    public int getOrder() {
        return this.f1097d;
    }

    public SubMenu getSubMenu() {
        return this.f1108o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1099f;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public CharSequence getTooltipText() {
        return this.f1112s;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public boolean isActionViewExpanded() {
        return this.f1092D;
    }

    /* renamed from: a */
    public void mo1466a(boolean z) {
        this.f1118y = (z ? 4 : 0) | (this.f1118y & -5);
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* renamed from: h */
    public void mo1490h() {
        this.f1094a.mo1410b(this);
    }

    public boolean hasSubMenu() {
        if (this.f1108o != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo1492i() {
        return this.f1094a.mo1446r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public char mo1472d() {
        if (this.f1094a.mo1417c()) {
            return this.f1104k;
        }
        return this.f1102i;
    }

    /* renamed from: g */
    public boolean mo1477g() {
        if ((this.f1118y & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isCheckable() {
        if ((this.f1118y & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f1118y & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f1118y & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo1497j() {
        if ((this.f1118y & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo1498k() {
        if ((this.f1119z & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo1499l() {
        if ((this.f1119z & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo1500m() {
        if ((this.f1119z & 4) == 4) {
            return true;
        }
        return false;
    }

    public String toString() {
        CharSequence charSequence = this.f1099f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public boolean expandActionView() {
        if (!mo1501n()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1091C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1094a.mo1418c(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo1476f() {
        if (!this.f1094a.mo1424d() || mo1472d() == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public View getActionView() {
        View view = this.f1089A;
        if (view != null) {
            return view;
        }
        AbstractC0894b bVar = this.f1090B;
        if (bVar == null) {
            return null;
        }
        View a = bVar.mo1581a(this);
        this.f1089A = a;
        return a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1100g;
        if (charSequence == null) {
            charSequence = this.f1099f;
        }
        if (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    /* renamed from: n */
    public boolean mo1501n() {
        AbstractC0894b bVar;
        if ((this.f1119z & 8) == 0) {
            return false;
        }
        if (this.f1089A == null && (bVar = this.f1090B) != null) {
            this.f1089A = bVar.mo1581a(this);
        }
        if (this.f1089A != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public boolean collapseActionView() {
        if ((this.f1119z & 8) == 0) {
            return false;
        }
        if (this.f1089A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1091C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1094a.mo1425d(this);
        }
        return false;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1106m;
        if (drawable != null) {
            return m1388a(drawable);
        }
        if (this.f1107n == 0) {
            return null;
        }
        Drawable b = C0215a.m655b(this.f1094a.mo1428f(), this.f1107n);
        this.f1107n = 0;
        this.f1106m = b;
        return m1388a(b);
    }

    public boolean isVisible() {
        AbstractC0894b bVar = this.f1090B;
        if (bVar == null || !bVar.mo1583d()) {
            if ((this.f1118y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1118y & 8) != 0 || !this.f1090B.mo1584e()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo1469b() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1110q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0322f fVar = this.f1094a;
        if (fVar.mo1398a(fVar, this)) {
            return true;
        }
        Runnable runnable = this.f1109p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1101h != null) {
            try {
                this.f1094a.mo1428f().startActivity(this.f1101h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractC0894b bVar = this.f1090B;
        if (bVar == null || !bVar.mo1579b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo1474e() {
        int i;
        char d = mo1472d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f1094a.mo1428f().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1094a.mo1428f()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        if (this.f1094a.mo1417c()) {
            i = this.f1105l;
        } else {
            i = this.f1103j;
        }
        m1389a(sb, i, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
        m1389a(sb, i, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
        m1389a(sb, i, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
        m1389a(sb, i, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
        m1389a(sb, i, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
        m1389a(sb, i, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
        if (d == '\b') {
            sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
        } else if (d == '\n') {
            sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
        } else if (d != ' ') {
            sb.append(d);
        } else {
            sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public AbstractMenuItemC0708b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1101h = intent;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1091C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1110q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    /* renamed from: a */
    public AbstractMenuItemC0708b setContentDescription(CharSequence charSequence) {
        this.f1111r = charSequence;
        this.f1094a.mo1412b(false);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    /* renamed from: b */
    public AbstractMenuItemC0708b setTooltipText(CharSequence charSequence) {
        this.f1112s = charSequence;
        this.f1094a.mo1412b(false);
        return this;
    }

    /* renamed from: e */
    public void mo1475e(boolean z) {
        this.f1092D = z;
        this.f1094a.mo1412b(false);
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1118y;
        int i2 = (z ? 1 : 0) | (i & -2);
        this.f1118y = i2;
        if (i != i2) {
            this.f1094a.mo1412b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1118y & 4) != 0) {
            this.f1094a.mo1389a((MenuItem) this);
        } else {
            mo1468b(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1106m = null;
        this.f1107n = i;
        this.f1117x = true;
        this.f1094a.mo1412b(false);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1113t = colorStateList;
        this.f1115v = true;
        this.f1117x = true;
        this.f1094a.mo1412b(false);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1114u = mode;
        this.f1116w = true;
        this.f1117x = true;
        this.f1094a.mo1412b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1102i == c) {
            return this;
        }
        this.f1102i = c;
        this.f1094a.mo1412b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f1094a.mo1428f().getString(i));
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1100g = charSequence;
        this.f1094a.mo1412b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1471c(z)) {
            this.f1094a.mo1391a(this);
        }
        return this;
    }

    /* renamed from: a */
    public AbstractMenuItemC0708b setActionView(int i) {
        Context f = this.f1094a.mo1428f();
        setActionView(LayoutInflater.from(f).inflate(i, (ViewGroup) new LinearLayout(f), false));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1468b(boolean z) {
        int i;
        int i2 = this.f1118y;
        int i3 = i2 & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f1118y = i4;
        if (i2 != i4) {
            this.f1094a.mo1412b(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1471c(boolean z) {
        int i;
        int i2 = this.f1118y;
        int i3 = i2 & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f1118y = i4;
        if (i2 != i4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo1473d(boolean z) {
        if (z) {
            this.f1118y |= 32;
        } else {
            this.f1118y &= -33;
        }
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1104k == c) {
            return this;
        }
        this.f1104k = Character.toLowerCase(c);
        this.f1094a.mo1412b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1118y |= 16;
        } else {
            this.f1118y &= -17;
        }
        this.f1094a.mo1412b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1107n = 0;
        this.f1106m = drawable;
        this.f1117x = true;
        this.f1094a.mo1412b(false);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1119z = i;
            this.f1094a.mo1410b(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1099f = charSequence;
        this.f1094a.mo1412b(false);
        SubMenuC0346q qVar = this.f1108o;
        if (qVar != null) {
            qVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* renamed from: a */
    private Drawable m1388a(Drawable drawable) {
        if (drawable != null && this.f1117x && (this.f1115v || this.f1116w)) {
            drawable = C0774a.m3779g(drawable).mutate();
            if (this.f1115v) {
                C0774a.m3768a(drawable, this.f1113t);
            }
            if (this.f1116w) {
                C0774a.m3771a(drawable, this.f1114u);
            }
            this.f1117x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public AbstractMenuItemC0708b setActionView(View view) {
        int i;
        this.f1089A = view;
        this.f1090B = null;
        if (view != null && view.getId() == -1 && (i = this.f1095b) > 0) {
            view.setId(i);
        }
        this.f1094a.mo1410b(this);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    /* renamed from: a */
    public AbstractMenuItemC0708b mo1282a(AbstractC0894b bVar) {
        AbstractC0894b bVar2 = this.f1090B;
        if (bVar2 != null) {
            bVar2.mo4683f();
        }
        this.f1089A = null;
        this.f1090B = bVar;
        this.f1094a.mo1412b(true);
        AbstractC0894b bVar3 = this.f1090B;
        if (bVar3 != null) {
            bVar3.mo1582a(new AbstractC0894b.AbstractC0896b() {
                /* class androidx.appcompat.view.menu.C0326h.C03271 */

                @Override // androidx.core.view.AbstractC0894b.AbstractC0896b
                /* renamed from: a */
                public void mo1521a(boolean z) {
                    C0326h.this.f1094a.mo1391a(C0326h.this);
                }
            });
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo1463a(AbstractC0339m.AbstractC0340a aVar) {
        if (aVar == null || !aVar.mo1215a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1464a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1093E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo1465a(SubMenuC0346q qVar) {
        this.f1108o = qVar;
        qVar.setHeaderTitle(getTitle());
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1102i = c;
        this.f1104k = Character.toLowerCase(c2);
        this.f1094a.mo1412b(false);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1102i == c && this.f1103j == i) {
            return this;
        }
        this.f1102i = c;
        this.f1103j = KeyEvent.normalizeMetaState(i);
        this.f1094a.mo1412b(false);
        return this;
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1104k == c && this.f1105l == i) {
            return this;
        }
        this.f1104k = Character.toLowerCase(c);
        this.f1105l = KeyEvent.normalizeMetaState(i);
        this.f1094a.mo1412b(false);
        return this;
    }

    /* renamed from: a */
    private static void m1389a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // androidx.core.p026a.p027a.AbstractMenuItemC0708b
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1102i = c;
        this.f1103j = KeyEvent.normalizeMetaState(i);
        this.f1104k = Character.toLowerCase(c2);
        this.f1105l = KeyEvent.normalizeMetaState(i2);
        this.f1094a.mo1412b(false);
        return this;
    }

    C0326h(C0322f fVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1094a = fVar;
        this.f1095b = i2;
        this.f1096c = i;
        this.f1097d = i3;
        this.f1098e = i4;
        this.f1099f = charSequence;
        this.f1119z = i5;
    }
}
