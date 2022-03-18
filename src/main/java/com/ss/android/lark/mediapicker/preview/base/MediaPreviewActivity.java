package com.ss.android.lark.mediapicker.preview.base;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mediapicker.C44614a;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.base.BaseActivity;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.preview.EditorPreviewView;
import com.ss.android.lark.mediapicker.preview.base.AbstractC44726b;
import com.ss.android.lark.mediapicker.utils.C44760o;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class MediaPreviewActivity extends BaseActivity {

    /* renamed from: a */
    private C44735h f113305a;

    /* renamed from: a */
    public Context mo158407a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo158408a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo158409a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m177356a(this, context);
    }

    /* renamed from: b */
    public void mo158410b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo158411c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m177352a(this, configuration);
    }

    public AssetManager getAssets() {
        return m177358c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m177353a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m177357b(this);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        C44735h hVar = this.f113305a;
        if (hVar == null || !hVar.mo158452b()) {
            m177359d();
        }
    }

    /* renamed from: d */
    private void m177359d() {
        ArrayList<LocalMedia> c = this.f113305a.mo158453c();
        ArrayList<LocalMedia> d = this.f113305a.mo158454d();
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("PICKED_MEDIAS", c);
        intent.putParcelableArrayListExtra("EDITED_MEDIAS", d);
        intent.putExtra("isSend", false);
        intent.putExtra("PICKED_ORIGIN", this.f113305a.mo158455e());
        setResult(-1, intent);
        finish();
    }

    /* renamed from: e */
    private void m177360e() {
        AbstractC44726b.AbstractC44728b bVar;
        C44733f a = m177355a(getIntent());
        if (a.f113324d.f113083p == null) {
            bVar = new EditorPreviewView();
        } else {
            bVar = m177354a(a.f113324d);
        }
        if (bVar != null) {
            C44734g gVar = new C44734g();
            this.f113305a = new C44735h(gVar, bVar);
            bVar.mo158415a(this, a.f113324d);
            gVar.mo158430a(a);
        }
    }

    /* renamed from: a */
    public static Resources m177353a(MediaPreviewActivity mediaPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mediaPreviewActivity);
        }
        return mediaPreviewActivity.mo158408a();
    }

    /* renamed from: c */
    public static AssetManager m177358c(MediaPreviewActivity mediaPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mediaPreviewActivity);
        }
        return mediaPreviewActivity.mo158411c();
    }

    /* renamed from: b */
    public static void m177357b(MediaPreviewActivity mediaPreviewActivity) {
        mediaPreviewActivity.mo158410b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MediaPreviewActivity mediaPreviewActivity2 = mediaPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mediaPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mediapicker.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            C44614a.m176967b(bundle);
            C44677b.m177240c("reOpen destroyed preview page, finish");
            finish();
            return;
        }
        m177360e();
        C44735h hVar = this.f113305a;
        if (hVar == null) {
            C44677b.m177236a("failed to preview page");
            finish();
            return;
        }
        hVar.mo158450a();
        C44677b.m177240c("MediaPreviewActivity current process: " + Process.myPid());
    }

    /* renamed from: a */
    private AbstractC44726b.AbstractC44728b m177354a(MediaPickerConfig mediaPickerConfig) {
        if (AbstractC44726b.AbstractC44728b.class.isAssignableFrom(mediaPickerConfig.f113083p)) {
            try {
                return (AbstractC44726b.AbstractC44728b) mediaPickerConfig.f113083p.newInstance();
            } catch (Exception e) {
                C44677b.m177235a(e);
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    private C44733f m177355a(Intent intent) {
        MediaPickerConfig mediaPickerConfig;
        ArrayList arrayList = (ArrayList) C44760o.m177512a().mo158476a(this, (String) intent.getSerializableExtra("allListKey"));
        Parcelable parcelableExtra = intent.getParcelableExtra("mediaConfig");
        if (parcelableExtra instanceof MediaPickerConfig) {
            mediaPickerConfig = (MediaPickerConfig) parcelableExtra;
        } else {
            mediaPickerConfig = new MediaPickerConfig();
        }
        return new C44733f(arrayList, (List) intent.getSerializableExtra("selectList"), intent.getIntExtra("position", 0), mediaPickerConfig, intent.getBooleanExtra("keepOrigin", false));
    }

    /* renamed from: a */
    public static void m177356a(MediaPreviewActivity mediaPreviewActivity, Context context) {
        mediaPreviewActivity.mo158409a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mediaPreviewActivity);
        }
    }

    /* renamed from: a */
    public static Context m177352a(MediaPreviewActivity mediaPreviewActivity, Configuration configuration) {
        Context a = mediaPreviewActivity.mo158407a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        C44735h hVar;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && (hVar = this.f113305a) != null) {
            hVar.mo158451a(i, i2, intent);
        }
    }
}
