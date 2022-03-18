package com.bytedance.ee.bear.attachment.filereader;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/attachment/filereader/FileReaderMainDocActivity;", "Lcom/bytedance/ee/bear/attachment/filereader/FileReaderActivity;", "()V", "attachment-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FileReaderMainDocActivity extends FileReaderActivity {

    /* renamed from: e */
    private HashMap f12868e;

    /* renamed from: a */
    public Context mo16866a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.bytedance.ee.bear.attachment.filereader.FileReaderActivity
    /* renamed from: a */
    public View mo16849a(int i) {
        if (this.f12868e == null) {
            this.f12868e = new HashMap();
        }
        View view = (View) this.f12868e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f12868e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo16867a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m17775a(this, context);
    }

    /* renamed from: c */
    public Resources mo16868c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m17773a(this, configuration);
    }

    /* renamed from: d */
    public void mo16870d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo16871e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m17777c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m17774a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m17776b(this);
    }

    /* renamed from: a */
    public static Resources m17774a(FileReaderMainDocActivity fileReaderMainDocActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fileReaderMainDocActivity);
        }
        return fileReaderMainDocActivity.mo16868c();
    }

    /* renamed from: c */
    public static AssetManager m17777c(FileReaderMainDocActivity fileReaderMainDocActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fileReaderMainDocActivity);
        }
        return fileReaderMainDocActivity.mo16871e();
    }

    /* renamed from: b */
    public static void m17776b(FileReaderMainDocActivity fileReaderMainDocActivity) {
        fileReaderMainDocActivity.mo16870d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FileReaderMainDocActivity fileReaderMainDocActivity2 = fileReaderMainDocActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    fileReaderMainDocActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m17775a(FileReaderMainDocActivity fileReaderMainDocActivity, Context context) {
        fileReaderMainDocActivity.mo16867a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fileReaderMainDocActivity);
        }
    }

    /* renamed from: a */
    public static Context m17773a(FileReaderMainDocActivity fileReaderMainDocActivity, Configuration configuration) {
        Context a = fileReaderMainDocActivity.mo16866a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
