package com.ss.android.vc.common.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.component.air.AirActivity;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60750d;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.dependency.AbstractC60906t;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vcxp.C63791b;
import com.ss.android.vcxp.C63801c;
import java.util.List;
import java.util.Locale;

public abstract class BaseActivity extends AirActivity implements C60795b.AbstractC60797a {

    /* renamed from: a */
    public static Locale f151859a;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo208278e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo208279f() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        C60795b.m236298b();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        FrameLayout frameLayout;
        View childAt;
        super.onStart();
        if (mo208278e()) {
            View findViewById = findViewById(16908290);
            if ((findViewById instanceof FrameLayout) && (frameLayout = (FrameLayout) findViewById) != null && frameLayout.getChildCount() > 0 && (childAt = frameLayout.getChildAt(0)) != null && childAt.getPaddingTop() == 0) {
                childAt.setPadding(childAt.getPaddingLeft(), StatusBarUtil.getStatusBarHeight(this), childAt.getPaddingRight(), childAt.getPaddingBottom());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        boolean z;
        if (C63791b.m250468b() || C26252ad.m94993b(context)) {
            z = false;
        } else {
            z = true;
        }
        C60700b.m235851b("BaseActivity@", "[attachBaseContext]", "isNonMainProcess = " + z);
        if (!z) {
            context = mo208276b(context);
        }
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        boolean z;
        if (C63791b.m250468b() || C26252ad.m94993b(this)) {
            z = false;
        } else {
            z = true;
        }
        if (z || !C63801c.m250499a(this, bundle)) {
            finish();
            return;
        }
        super.onCreate(bundle);
        if (mo208279f()) {
            C60750d.m236072a(this);
        }
    }

    /* renamed from: b */
    public Context mo208276b(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        if (f151859a == null) {
            AbstractC60906t languageDependency = VideoChatModuleDependency.getLanguageDependency();
            if (languageDependency == null) {
                return context;
            }
            f151859a = languageDependency.getLanguageSetting();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(f151859a);
        } else {
            configuration.locale = f151859a;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return context.createConfigurationContext(configuration);
        }
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        return context;
    }

    @Override // com.ss.android.vc.common.permission.C60795b.AbstractC60797a
    /* renamed from: a */
    public void mo208275a(int i, List<String> list) {
        C60700b.m235851b("BaseActivity@", "[onPermissionsGranted]", i + ":" + list.size());
    }

    @Override // com.ss.android.vc.common.permission.C60795b.AbstractC60797a
    /* renamed from: b */
    public void mo208277b(int i, List<String> list) {
        C60700b.m235851b("BaseActivity@", "[onPermissionsDenied]", i + ":" + list.size());
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C60795b.m236289a(i, strArr, iArr, this);
    }
}
