package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.view.AbstractC0894b;
import com.larksuite.suite.R;

public class ShareActionProvider extends AbstractC0894b {

    /* renamed from: a */
    final Context f1415a;

    /* renamed from: b */
    String f1416b = "share_history.xml";

    /* renamed from: c */
    private int f1417c = 4;

    /* renamed from: d */
    private final MenuItem$OnMenuItemClickListenerC0411a f1418d = new MenuItem$OnMenuItemClickListenerC0411a();

    @Override // androidx.core.view.AbstractC0894b
    /* renamed from: c */
    public boolean mo1580c() {
        return true;
    }

    @Override // androidx.core.view.AbstractC0894b
    /* renamed from: a */
    public View mo1577a() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1415a);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C0436c.m1867a(this.f1415a, this.f1416b));
        }
        TypedValue typedValue = new TypedValue();
        this.f1415a.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C0215a.m655b(this.f1415a, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    /* renamed from: androidx.appcompat.widget.ShareActionProvider$a */
    private class MenuItem$OnMenuItemClickListenerC0411a implements MenuItem.OnMenuItemClickListener {
        MenuItem$OnMenuItemClickListenerC0411a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent b = C0436c.m1867a(ShareActionProvider.this.f1415a, ShareActionProvider.this.f1416b).mo2554b(menuItem.getItemId());
            if (b == null) {
                return true;
            }
            String action = b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ShareActionProvider.this.mo2289a(b);
            }
            ShareActionProvider.this.f1415a.startActivity(b);
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.f1415a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2289a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(134742016);
        } else {
            intent.addFlags(524288);
        }
    }

    @Override // androidx.core.view.AbstractC0894b
    /* renamed from: a */
    public void mo1578a(SubMenu subMenu) {
        subMenu.clear();
        C0436c a = C0436c.m1867a(this.f1415a, this.f1416b);
        PackageManager packageManager = this.f1415a.getPackageManager();
        int a2 = a.mo2551a();
        int min = Math.min(a2, this.f1417c);
        for (int i = 0; i < min; i++) {
            ResolveInfo a3 = a.mo2553a(i);
            subMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1418d);
        }
        if (min < a2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1415a.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < a2; i2++) {
                ResolveInfo a4 = a.mo2553a(i2);
                addSubMenu.add(0, i2, i2, a4.loadLabel(packageManager)).setIcon(a4.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1418d);
            }
        }
    }
}
