package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0768a;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.widget.aa */
public class C0422aa {

    /* renamed from: a */
    static final int[] f1527a = {-16842910};

    /* renamed from: b */
    static final int[] f1528b = {16842908};

    /* renamed from: c */
    static final int[] f1529c = {16843518};

    /* renamed from: d */
    static final int[] f1530d = {16842919};

    /* renamed from: e */
    static final int[] f1531e = {16842912};

    /* renamed from: f */
    static final int[] f1532f = {16842913};

    /* renamed from: g */
    static final int[] f1533g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f1534h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f1535i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f1536j = new int[1];

    /* renamed from: a */
    private static TypedValue m1767a() {
        ThreadLocal<TypedValue> threadLocal = f1535i;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    public static int m1765a(Context context, int i) {
        int[] iArr = f1536j;
        iArr[0] = i;
        C0427af a = C0427af.m1777a(context, (AttributeSet) null, iArr);
        try {
            return a.mo2480b(0, 0);
        } finally {
            a.mo2482b();
        }
    }

    /* renamed from: b */
    public static ColorStateList m1769b(Context context, int i) {
        int[] iArr = f1536j;
        iArr[0] = i;
        C0427af a = C0427af.m1777a(context, (AttributeSet) null, iArr);
        try {
            return a.mo2488e(0);
        } finally {
            a.mo2482b();
        }
    }

    /* renamed from: c */
    public static int m1770c(Context context, int i) {
        ColorStateList b = m1769b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f1527a, b.getDefaultColor());
        }
        TypedValue a = m1767a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1766a(context, i, a.getFloat());
    }

    /* renamed from: a */
    public static void m1768a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle});
        try {
            if (!obtainStyledAttributes.hasValue(115)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    static int m1766a(Context context, int i, float f) {
        int a = m1765a(context, i);
        return C0768a.m3716c(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
