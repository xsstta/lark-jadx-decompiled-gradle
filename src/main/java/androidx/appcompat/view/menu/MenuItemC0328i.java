package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.AbstractC0299c;
import androidx.core.p026a.p027a.AbstractMenuItemC0708b;
import androidx.core.view.AbstractC0894b;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.view.menu.i */
public class MenuItemC0328i extends AbstractC0318c implements MenuItem {

    /* renamed from: b */
    private final AbstractMenuItemC0708b f1121b;

    /* renamed from: c */
    private Method f1122c;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    private class C0329a extends AbstractC0894b {

        /* renamed from: a */
        final ActionProvider f1123a;

        @Override // androidx.core.view.AbstractC0894b
        /* renamed from: a */
        public View mo1577a() {
            return this.f1123a.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0894b
        /* renamed from: b */
        public boolean mo1579b() {
            return this.f1123a.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0894b
        /* renamed from: c */
        public boolean mo1580c() {
            return this.f1123a.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0894b
        /* renamed from: a */
        public void mo1578a(SubMenu subMenu) {
            this.f1123a.onPrepareSubMenu(MenuItemC0328i.this.mo1355a(subMenu));
        }

        C0329a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1123a = actionProvider;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.i$b */
    private class ActionProvider$VisibilityListenerC0330b extends C0329a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private AbstractC0894b.AbstractC0896b f1126d;

        @Override // androidx.core.view.AbstractC0894b
        /* renamed from: d */
        public boolean mo1583d() {
            return this.f1123a.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0894b
        /* renamed from: e */
        public boolean mo1584e() {
            return this.f1123a.isVisible();
        }

        @Override // androidx.core.view.AbstractC0894b
        /* renamed from: a */
        public View mo1581a(MenuItem menuItem) {
            return this.f1123a.onCreateActionView(menuItem);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0894b.AbstractC0896b bVar = this.f1126d;
            if (bVar != null) {
                bVar.mo1521a(z);
            }
        }

        @Override // androidx.core.view.AbstractC0894b
        /* renamed from: a */
        public void mo1582a(AbstractC0894b.AbstractC0896b bVar) {
            ActionProvider$VisibilityListenerC0330b bVar2;
            this.f1126d = bVar;
            ActionProvider actionProvider = this.f1123a;
            if (bVar != null) {
                bVar2 = this;
            } else {
                bVar2 = null;
            }
            actionProvider.setVisibilityListener(bVar2);
        }

        ActionProvider$VisibilityListenerC0330b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.i$c */
    static class C0331c extends FrameLayout implements AbstractC0299c {

        /* renamed from: a */
        final CollapsibleActionView f1127a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo1586a() {
            return (View) this.f1127a;
        }

        @Override // androidx.appcompat.view.AbstractC0299c
        public void onActionViewCollapsed() {
            this.f1127a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.AbstractC0299c
        public void onActionViewExpanded() {
            this.f1127a.onActionViewExpanded();
        }

        C0331c(View view) {
            super(view.getContext());
            this.f1127a = (CollapsibleActionView) view;
            addView(view);
        }
    }

    public boolean collapseActionView() {
        return this.f1121b.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1121b.expandActionView();
    }

    public int getAlphabeticModifiers() {
        return this.f1121b.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1121b.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1121b.getContentDescription();
    }

    public int getGroupId() {
        return this.f1121b.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1121b.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1121b.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1121b.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1121b.getIntent();
    }

    public int getItemId() {
        return this.f1121b.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1121b.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1121b.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1121b.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1121b.getOrder();
    }

    public CharSequence getTitle() {
        return this.f1121b.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1121b.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1121b.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f1121b.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1121b.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1121b.isCheckable();
    }

    public boolean isChecked() {
        return this.f1121b.isChecked();
    }

    public boolean isEnabled() {
        return this.f1121b.isEnabled();
    }

    public boolean isVisible() {
        return this.f1121b.isVisible();
    }

    public SubMenu getSubMenu() {
        return mo1355a(this.f1121b.getSubMenu());
    }

    public ActionProvider getActionProvider() {
        AbstractC0894b a = this.f1121b.mo1284a();
        if (a instanceof C0329a) {
            return ((C0329a) a).f1123a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1121b.getActionView();
        if (actionView instanceof C0331c) {
            return ((C0331c) actionView).mo1586a();
        }
        return actionView;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1121b.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1121b.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1121b.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1121b.mo1283a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1121b.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1121b.setIcon(i);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1121b.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1121b.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1121b.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1121b.setNumericShortcut(c);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1121b.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1121b.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1121b.setTitle(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1121b.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1121b.mo1286b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1121b.setVisible(z);
    }

    /* renamed from: androidx.appcompat.view.menu.i$d */
    private class MenuItem$OnActionExpandListenerC0332d implements MenuItem.OnActionExpandListener {

        /* renamed from: b */
        private final MenuItem.OnActionExpandListener f1129b;

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1129b.onMenuItemActionCollapse(MenuItemC0328i.this.mo1354a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1129b.onMenuItemActionExpand(MenuItemC0328i.this.mo1354a(menuItem));
        }

        MenuItem$OnActionExpandListenerC0332d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1129b = onActionExpandListener;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.i$e */
    private class MenuItem$OnMenuItemClickListenerC0333e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        private final MenuItem.OnMenuItemClickListener f1131b;

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1131b.onMenuItemClick(MenuItemC0328i.this.mo1354a(menuItem));
        }

        MenuItem$OnMenuItemClickListenerC0333e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1131b = onMenuItemClickListener;
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0331c(view);
        }
        this.f1121b.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1121b.setIcon(drawable);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItem$OnActionExpandListenerC0332d dVar;
        AbstractMenuItemC0708b bVar = this.f1121b;
        if (onActionExpandListener != null) {
            dVar = new MenuItem$OnActionExpandListenerC0332d(onActionExpandListener);
        } else {
            dVar = null;
        }
        bVar.setOnActionExpandListener(dVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem$OnMenuItemClickListenerC0333e eVar;
        AbstractMenuItemC0708b bVar = this.f1121b;
        if (onMenuItemClickListener != null) {
            eVar = new MenuItem$OnMenuItemClickListenerC0333e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        bVar.setOnMenuItemClickListener(eVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1121b.setTitle(charSequence);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC0894b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new ActionProvider$VisibilityListenerC0330b(this.f1037a, actionProvider);
        } else {
            bVar = new C0329a(this.f1037a, actionProvider);
        }
        AbstractMenuItemC0708b bVar2 = this.f1121b;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo1282a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f1121b.setActionView(i);
        View actionView = this.f1121b.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1121b.setActionView(new C0331c(actionView));
        }
        return this;
    }

    /* renamed from: a */
    public void mo1522a(boolean z) {
        try {
            if (this.f1122c == null) {
                this.f1122c = this.f1121b.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1122c.invoke(this.f1121b, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1121b.setShortcut(c, c2);
        return this;
    }

    public MenuItemC0328i(Context context, AbstractMenuItemC0708b bVar) {
        super(context);
        if (bVar != null) {
            this.f1121b = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1121b.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1121b.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1121b.setShortcut(c, c2, i, i2);
        return this;
    }
}
