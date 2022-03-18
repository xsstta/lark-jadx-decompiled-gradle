package com.tt.miniapp.view.swipeback;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.frontendapiinterface.IKeyboardObserver;
import com.tt.miniapp.p3307n.C66493a;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.view.BaseActivity;

public class SwipeBackActivity extends BaseActivity implements IKeyboardObserver {

    /* renamed from: a */
    private SwipeBackLayout f169638a;

    /* renamed from: l */
    public boolean f169639l;

    /* renamed from: m */
    public C66493a f169640m;

    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
    }

    /* renamed from: k */
    public SwipeBackLayout mo233709k() {
        return this.f169638a;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        finish();
    }

    public boolean cD_() {
        if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onDestroy() {
        C66493a aVar = this.f169640m;
        if (aVar != null) {
            aVar.mo232068b();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo233708j() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundDrawable(null);
        this.f169638a = new SwipeBackLayout(this, C67448a.m262353a().mo234192k());
        this.f169638a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        getWindow().getDecorView().post(new Runnable() {
            /* class com.tt.miniapp.view.swipeback.SwipeBackActivity.RunnableC672182 */

            public void run() {
                SwipeBackActivity.this.f169640m.mo232066a();
            }
        });
        View childAt = mo233709k().getChildAt(0);
        if (childAt != null && childAt.getX() > BitmapDescriptorFactory.HUE_RED) {
            childAt.layout(0, childAt.getTop(), childAt.getRight(), childAt.getBottom());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public View findViewById(int i) {
        SwipeBackLayout swipeBackLayout;
        View findViewById = super.findViewById(i);
        if (findViewById != null || (swipeBackLayout = this.f169638a) == null) {
            return findViewById;
        }
        return swipeBackLayout.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.f169638a.mo233717a(this, (AbstractC67497e) null);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo233708j();
        C66493a aVar = new C66493a(this, null);
        this.f169640m = aVar;
        aVar.mo232067a(this);
        this.f169638a.setOnTouchListener(new View.OnTouchListener() {
            /* class com.tt.miniapp.view.swipeback.SwipeBackActivity.View$OnTouchListenerC672171 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!SwipeBackActivity.this.f169639l) {
                    return false;
                }
                C67047m.m261304a(SwipeBackActivity.this);
                return false;
            }
        });
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
    }

    @Override // com.tt.frontendapiinterface.IKeyboardObserver
    public void onKeyboardHeightChanged(int i, int i2) {
        if (i > 0) {
            this.f169639l = true;
        } else {
            this.f169639l = false;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
