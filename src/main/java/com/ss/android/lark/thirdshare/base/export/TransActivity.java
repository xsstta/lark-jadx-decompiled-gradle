package com.ss.android.lark.thirdshare.base.export;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TransActivity extends AppCompatActivity {

    /* renamed from: a */
    private static final Map<TransActivity, TransActivityDelegate> f137388a = new HashMap();

    public static abstract class TransActivityDelegate implements Serializable {
        public boolean dispatchTouchEvent(TransActivity transActivity, MotionEvent motionEvent) {
            return false;
        }

        public void onActivityResult(TransActivity transActivity, int i, int i2, Intent intent) {
        }

        public void onCreateBefore(TransActivity transActivity, Bundle bundle) {
        }

        public void onCreated(TransActivity transActivity, Bundle bundle) {
        }

        public void onDestroy(TransActivity transActivity) {
        }

        public void onPaused(TransActivity transActivity) {
        }

        public void onRequestPermissionsResult(TransActivity transActivity, int i, String[] strArr, int[] iArr) {
        }

        public void onResumed(TransActivity transActivity) {
        }

        public void onSaveInstanceState(TransActivity transActivity, Bundle bundle) {
        }

        public void onStarted(TransActivity transActivity) {
        }

        public void onStopped(TransActivity transActivity) {
        }
    }

    /* renamed from: com.ss.android.lark.thirdshare.base.export.TransActivity$a */
    public interface AbstractC55697a<T> {
        void accept(T t);
    }

    /* renamed from: a */
    public Context mo189781a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo189783a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m215742a(this, context);
    }

    /* renamed from: b */
    public Resources mo189784b() {
        return super.getResources();
    }

    /* renamed from: c */
    public AssetManager mo189785c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215738a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215744c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m215743b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215741a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Map<TransActivity, TransActivityDelegate> map = f137388a;
        TransActivityDelegate transActivityDelegate = map.get(this);
        if (transActivityDelegate != null) {
            map.remove(this);
            try {
                transActivityDelegate.onDestroy(this);
            } catch (Exception e) {
                Log.m165386e("ThirdShare", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
        TransActivityDelegate transActivityDelegate = f137388a.get(this);
        if (transActivityDelegate != null) {
            try {
                transActivityDelegate.onPaused(this);
            } catch (Exception e) {
                finish();
                Log.m165386e("ThirdShare", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        TransActivityDelegate transActivityDelegate = f137388a.get(this);
        if (transActivityDelegate != null) {
            try {
                transActivityDelegate.onResumed(this);
            } catch (Exception e) {
                finish();
                Log.m165386e("ThirdShare", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        TransActivityDelegate transActivityDelegate = f137388a.get(this);
        if (transActivityDelegate != null) {
            try {
                transActivityDelegate.onStarted(this);
            } catch (Exception e) {
                finish();
                Log.m165386e("ThirdShare", e);
            }
        }
    }

    /* renamed from: a */
    public void mo189782a() {
        super.onStop();
        TransActivityDelegate transActivityDelegate = f137388a.get(this);
        if (transActivityDelegate != null) {
            try {
                transActivityDelegate.onStopped(this);
            } catch (Exception e) {
                finish();
                Log.m165386e("ThirdShare", e);
            }
        }
    }

    /* renamed from: b */
    public static Resources m215743b(TransActivity transActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transActivity);
        }
        return transActivity.mo189784b();
    }

    /* renamed from: c */
    public static AssetManager m215744c(TransActivity transActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transActivity);
        }
        return transActivity.mo189785c();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TransActivityDelegate transActivityDelegate = f137388a.get(this);
        if (transActivityDelegate == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (transActivityDelegate.dispatchTouchEvent(this, motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TransActivityDelegate transActivityDelegate = f137388a.get(this);
        if (transActivityDelegate != null) {
            try {
                transActivityDelegate.onSaveInstanceState(this, bundle);
            } catch (Exception e) {
                finish();
                Log.m165386e("ThirdShare", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_delegate");
        if (!(serializableExtra instanceof TransActivityDelegate)) {
            super.onCreate(bundle);
            finish();
            return;
        }
        TransActivityDelegate transActivityDelegate = (TransActivityDelegate) serializableExtra;
        f137388a.put(this, transActivityDelegate);
        transActivityDelegate.onCreateBefore(this, bundle);
        super.onCreate(bundle);
        try {
            transActivityDelegate.onCreated(this, bundle);
        } catch (Exception e) {
            finish();
            Log.m165386e("ThirdShare", e);
        }
    }

    /* renamed from: a */
    public static void m215741a(TransActivity transActivity) {
        transActivity.mo189782a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TransActivity transActivity2 = transActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    transActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m215740a(AbstractC55697a<Intent> aVar, TransActivityDelegate transActivityDelegate) {
        m215739a(null, aVar, transActivityDelegate);
    }

    /* renamed from: a */
    public static void m215742a(TransActivity transActivity, Context context) {
        transActivity.mo189783a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transActivity);
        }
    }

    /* renamed from: a */
    public static Context m215738a(TransActivity transActivity, Configuration configuration) {
        Context a = transActivity.mo189781a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        TransActivityDelegate transActivityDelegate = f137388a.get(this);
        if (transActivityDelegate != null) {
            try {
                transActivityDelegate.onActivityResult(this, i, i2, intent);
            } catch (Exception e) {
                finish();
                Log.m165386e("ThirdShare", e);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        TransActivityDelegate transActivityDelegate = f137388a.get(this);
        if (transActivityDelegate != null) {
            try {
                transActivityDelegate.onRequestPermissionsResult(this, i, strArr, iArr);
            } catch (Exception e) {
                finish();
                Log.m165386e("ThirdShare", e);
            }
        }
    }

    /* renamed from: a */
    public static void m215739a(Activity activity, AbstractC55697a<Intent> aVar, TransActivityDelegate transActivityDelegate) {
        if (transActivityDelegate != null) {
            try {
                Intent intent = new Intent(aj.m224263a(), TransActivity.class);
                intent.putExtra("extra_delegate", transActivityDelegate);
                if (aVar != null) {
                    aVar.accept(intent);
                }
                if (!ViewUtils.m224151a(activity)) {
                    intent.addFlags(268435456);
                    aj.m224263a().startActivity(intent);
                    return;
                }
                activity.startActivity(intent);
            } catch (Exception e) {
                Log.m165386e("ThirdShare", e);
            }
        }
    }
}
