package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.AbstractC0297b;
import androidx.appcompat.widget.Toolbar;
import com.ss.android.lark.language.service.impl.C41121a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J#\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bJ\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020\u0007H\u0016J\b\u0010&\u001a\u00020\u0007H\u0016J\b\u0010'\u001a\u00020\rH\u0016J\u0012\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J,\u0010.\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010.\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\u0012\u00100\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00101\u001a\u00020\u0007H\u0016J\u0012\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010-H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u0007H\u0016J\u0010\u00106\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001aH\u0016J\u0012\u00107\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u00107\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u001aH\u0016J\u0010\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\rH\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u001aH\u0016J\u0012\u0010=\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u001aH\u0016J\u0012\u0010B\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0012\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Landroidx/appcompat/app/BaseContextWrapperDelegate;", "Landroidx/appcompat/app/AppCompatDelegate;", "Landroid/view/LayoutInflater$Factory2;", "superDelegate", "(Landroidx/appcompat/app/AppCompatDelegate;)V", "factory2", "addContentView", "", "v", "Landroid/view/View;", "lp", "Landroid/view/ViewGroup$LayoutParams;", "applyDayNight", "", "attachBaseContext2", "Landroid/content/Context;", "context", "createView", "parent", "name", "", "attrs", "Landroid/util/AttributeSet;", "findViewById", "T", "id", "", "(I)Landroid/view/View;", "getDrawerToggleDelegate", "Landroidx/appcompat/app/ActionBarDrawerToggle$Delegate;", "getLocalNightMode", "getMenuInflater", "Landroid/view/MenuInflater;", "getSupportActionBar", "Landroidx/appcompat/app/ActionBar;", "hasWindowFeature", "featureId", "installViewFactory", "invalidateOptionsMenu", "isHandleNativeActionModesEnabled", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "onDestroy", "onPostCreate", "onPostResume", "onSaveInstanceState", "outState", "onStart", "onStop", "requestWindowFeature", "setContentView", "resId", "setHandleNativeActionModesEnabled", "enabled", "setLocalNightMode", "mode", "setSupportActionBar", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "setTheme", "themeResId", "setTitle", "title", "", "startSupportActionMode", "Landroidx/appcompat/view/ActionMode;", "callback", "Landroidx/appcompat/view/ActionMode$Callback;", "wrap", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: androidx.appcompat.app.e */
public final class BaseContextWrapperDelegate extends AppCompatDelegate implements LayoutInflater.Factory2 {

    /* renamed from: a */
    private final LayoutInflater.Factory2 f711a;

    /* renamed from: b */
    private final AppCompatDelegate f712b;

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public ActionBar mo801a() {
        return this.f712b.mo801a();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public MenuInflater mo812b() {
        return this.f712b.mo812b();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: c */
    public void mo816c() {
        this.f712b.mo816c();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: d */
    public void mo819d() {
        this.f712b.mo819d();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: e */
    public void mo821e() {
        this.f712b.mo821e();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: f */
    public void mo822f() {
        this.f712b.mo822f();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: h */
    public ActionBarDrawerToggle.AbstractC0219a mo824h() {
        return this.f712b.mo824h();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: i */
    public void mo825i() {
        this.f712b.mo825i();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: j */
    public boolean mo826j() {
        return this.f712b.mo826j();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: k */
    public int mo827k() {
        return this.f712b.mo827k();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: g */
    public void mo823g() {
        this.f712b.mo823g();
        AppCompatDelegate.m729b(this);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public AbstractC0297b mo802a(AbstractC0297b.AbstractC0298a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        return this.f712b.mo802a(aVar);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public <T extends View> T mo813b(int i) {
        return (T) this.f712b.mo813b(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: c */
    public void mo817c(int i) {
        this.f712b.mo817c(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: d */
    public boolean mo820d(int i) {
        return this.f712b.mo820d(i);
    }

    public BaseContextWrapperDelegate(AppCompatDelegate appCompatDelegate) {
        Intrinsics.checkParameterIsNotNull(appCompatDelegate, "superDelegate");
        this.f712b = appCompatDelegate;
        this.f711a = (LayoutInflater.Factory2) (!(appCompatDelegate instanceof LayoutInflater.Factory2) ? null : appCompatDelegate);
    }

    /* renamed from: c */
    private final Context m939c(Context context) {
        C41121a m = C41121a.m163149m();
        Intrinsics.checkExpressionValueIsNotNull(m, "LanguageSettingService.inst()");
        Context a = m.mo148285a(context);
        Intrinsics.checkExpressionValueIsNotNull(a, "service.updateContextForLanguage(context)");
        return a;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo803a(int i) {
        this.f712b.mo803a(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public Context mo811b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Context b = this.f712b.mo811b(super.mo811b(context));
        Intrinsics.checkExpressionValueIsNotNull(b, "superDelegate.attachBase…achBaseContext2(context))");
        return m939c(b);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo805a(Configuration configuration) {
        this.f712b.mo805a(configuration);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public void mo814b(Bundle bundle) {
        this.f712b.mo814b(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: c */
    public void mo818c(Bundle bundle) {
        this.f712b.mo818c(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo806a(Bundle bundle) {
        this.f712b.mo806a(bundle);
        AppCompatDelegate.m729b(this.f712b);
        AppCompatDelegate.m727a(this);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo807a(View view) {
        this.f712b.mo807a(view);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo809a(Toolbar toolbar) {
        this.f712b.mo809a(toolbar);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo810a(CharSequence charSequence) {
        this.f712b.mo810a(charSequence);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public void mo815b(View view, ViewGroup.LayoutParams layoutParams) {
        this.f712b.mo815b(view, layoutParams);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo808a(View view, ViewGroup.LayoutParams layoutParams) {
        this.f712b.mo808a(view, layoutParams);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.Factory2 factory2 = this.f711a;
        if (factory2 != null) {
            return factory2.onCreateView(str, context, attributeSet);
        }
        return null;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.Factory2 factory2 = this.f711a;
        if (factory2 != null) {
            return factory2.onCreateView(view, str, context, attributeSet);
        }
        return null;
    }
}
