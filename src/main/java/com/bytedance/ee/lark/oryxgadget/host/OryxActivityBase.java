package com.bytedance.ee.lark.oryxgadget.host;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.MiniappHostBase;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0016J-\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/lark/oryxgadget/host/OryxActivityBase;", "Lcom/tt/miniapphost/MiniappHostBase;", "()V", "createRealActivity", "Lcom/tt/miniapphost/IActivityProxy;", "appType", "", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onPostResume", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onTrimMemory", "level", "onUserLeaveHint", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class OryxActivityBase extends MiniappHostBase {
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.activity.ComponentActivity, com.tt.miniapphost.MiniappHostBase, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onPostResume() {
        super.onPostResume();
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase
    public AbstractC67497e createRealActivity(int i) {
        AbstractC67497e createRealActivity = super.createRealActivity(i);
        Intrinsics.checkExpressionValueIsNotNull(createRealActivity, "super.createRealActivity(appType)");
        return createRealActivity;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, com.tt.miniapphost.MiniappHostBase, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "permissions");
        Intrinsics.checkParameterIsNotNull(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
