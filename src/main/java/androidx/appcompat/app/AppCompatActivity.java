package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.AbstractC0297b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ak;
import androidx.core.app.ActivityCompat;
import androidx.core.app.C0739f;
import androidx.core.app.TaskStackBuilder;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;

public class AppCompatActivity extends FragmentActivity implements ActionBarDrawerToggle.DelegateProvider, AppCompatCallback, TaskStackBuilder.SupportParentable {
    public AppCompatDelegate mDelegate;
    private Resources mResources;

    public AppCompatDelegate getDelegate() {
        return androidx_appcompat_app_AppCompatActivity_com_ss_android_lark_integrator_lancet_LancetHooker_getDelegate(this);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(AbstractC0297b bVar) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(AbstractC0297b bVar) {
    }

    public void onSupportContentChanged() {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public AbstractC0297b onWindowStartingSupportActionMode(AbstractC0297b.AbstractC0298a aVar) {
        return null;
    }

    public void setSupportProgress(int i) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    public AppCompatActivity() {
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.core.app.TaskStackBuilder.SupportParentable
    public Intent getSupportParentActivityIntent() {
        return C0739f.m3598a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo822f();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo822f();
    }

    public AppCompatDelegate AppCompatActivity__getDelegate$___twin___() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.m725a(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider
    public ActionBarDrawerToggle.AbstractC0219a getDrawerToggleDelegate() {
        return getDelegate().mo824h();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo812b();
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo801a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo823g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo821e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        getDelegate().mo816c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        getDelegate().mo819d();
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo707d()) {
            super.closeOptionsMenu();
        }
    }

    public Resources getResources() {
        if (this.mResources == null && ak.m1860a()) {
            this.mResources = new ak(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo705c()) {
            super.openOptionsMenu();
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            TaskStackBuilder a = TaskStackBuilder.m3572a((Context) this);
            onCreateSupportNavigateUpTaskStack(a);
            onPrepareSupportNavigateUpTaskStack(a);
            a.mo4232a();
            try {
                ActivityCompat.finishAffinity(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.mo4229a((Activity) this);
    }

    public void supportNavigateUpTo(Intent intent) {
        C0739f.m3603b(this, intent);
    }

    public AppCompatActivity(int i) {
        super(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        getDelegate().mo817c(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo809a(toolbar);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0739f.m3600a(this, intent);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo811b(context));
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo813b(i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        AppCompatDelegate delegate = getDelegate();
        delegate.mo825i();
        delegate.mo806a(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo814b(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo818c(bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        getDelegate().mo807a(view);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo803a(i);
    }

    public AbstractC0297b startSupportActionMode(AbstractC0297b.AbstractC0298a aVar) {
        return getDelegate().mo802a(aVar);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo820d(i);
    }

    @Override // androidx.core.app.ComponentActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo700a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo805a(configuration);
    }

    public static AppCompatDelegate androidx_appcompat_app_AppCompatActivity_com_ss_android_lark_integrator_lancet_LancetHooker_getDelegate(AppCompatActivity appCompatActivity) {
        AppCompatDelegate AppCompatActivity__getDelegate$___twin___ = appCompatActivity.AppCompatActivity__getDelegate$___twin___();
        Log.m165379d("LanguageHooker", "hook app delegate");
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInstanceOfBaseContextWrapperDelegate(AppCompatActivity__getDelegate$___twin___)) {
            return AppCompatActivity__getDelegate$___twin___;
        }
        AppCompatDelegate localeHookDelegate = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleHookDelegate(AppCompatActivity__getDelegate$___twin___);
        appCompatActivity.mDelegate = localeHookDelegate;
        return localeHookDelegate;
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // androidx.activity.ComponentActivity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo815b(view, layoutParams);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo810a(charSequence);
    }

    @Override // androidx.activity.ComponentActivity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo808a(view, layoutParams);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo692a() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }
}
