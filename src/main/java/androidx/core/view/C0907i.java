package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import androidx.core.p026a.p027a.AbstractMenuItemC0708b;

/* renamed from: androidx.core.view.i */
public final class C0907i {
    /* renamed from: a */
    public static MenuItem m4359a(MenuItem menuItem, AbstractC0894b bVar) {
        if (menuItem instanceof AbstractMenuItemC0708b) {
            return ((AbstractMenuItemC0708b) menuItem).mo1282a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m4365b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC0708b) {
            ((AbstractMenuItemC0708b) menuItem).mo1286b(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m4361a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof AbstractMenuItemC0708b) {
            ((AbstractMenuItemC0708b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4362a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof AbstractMenuItemC0708b) {
            ((AbstractMenuItemC0708b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m4363a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC0708b) {
            ((AbstractMenuItemC0708b) menuItem).mo1283a(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m4364b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC0708b) {
            ((AbstractMenuItemC0708b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m4360a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC0708b) {
            ((AbstractMenuItemC0708b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }
}
