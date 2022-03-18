package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.view.a */
public class C0296a {

    /* renamed from: a */
    private Context f871a;

    /* renamed from: c */
    public int mo1153c() {
        return this.f871a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean mo1154d() {
        return this.f871a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    /* renamed from: f */
    public boolean mo1156f() {
        if (this.f871a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int mo1157g() {
        return this.f871a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: b */
    public boolean mo1152b() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f871a).hasPermanentMenuKey();
    }

    /* renamed from: a */
    public int mo1151a() {
        Configuration configuration = this.f871a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: e */
    public int mo1155e() {
        TypedArray obtainStyledAttributes = this.f871a.obtainStyledAttributes(null, new int[]{R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle}, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = this.f871a.getResources();
        if (!mo1154d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    private C0296a(Context context) {
        this.f871a = context;
    }

    /* renamed from: a */
    public static C0296a m1150a(Context context) {
        return new C0296a(context);
    }
}
