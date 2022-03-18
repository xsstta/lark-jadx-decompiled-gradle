package androidx.core.p026a.p027a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.AbstractC0894b;

/* renamed from: androidx.core.a.a.b */
public interface AbstractMenuItemC0708b extends MenuItem {
    /* renamed from: a */
    AbstractMenuItemC0708b mo1282a(AbstractC0894b bVar);

    /* renamed from: a */
    AbstractMenuItemC0708b mo1283a(CharSequence charSequence);

    /* renamed from: a */
    AbstractC0894b mo1284a();

    /* renamed from: b */
    AbstractMenuItemC0708b mo1286b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
