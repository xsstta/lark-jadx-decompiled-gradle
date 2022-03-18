package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C0845f;
import androidx.lifecycle.ViewModelStoreOwner;

/* renamed from: androidx.fragment.app.e */
public class C1033e {

    /* renamed from: a */
    private final AbstractC1035g<?> f3942a;

    /* renamed from: a */
    public boolean mo5540a(Menu menu, MenuInflater menuInflater) {
        return this.f3942a.f3944b.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo5541a(MenuItem menuItem) {
        return this.f3942a.f3944b.dispatchOptionsItemSelected(menuItem);
    }

    /* renamed from: a */
    public FragmentManager mo5534a() {
        return this.f3942a.f3944b;
    }

    /* renamed from: b */
    public void mo5542b() {
        this.f3942a.f3944b.noteStateNotSaved();
    }

    /* renamed from: d */
    public void mo5547d() {
        this.f3942a.f3944b.dispatchCreate();
    }

    /* renamed from: e */
    public void mo5548e() {
        this.f3942a.f3944b.dispatchActivityCreated();
    }

    /* renamed from: f */
    public void mo5549f() {
        this.f3942a.f3944b.dispatchStart();
    }

    /* renamed from: g */
    public void mo5550g() {
        this.f3942a.f3944b.dispatchResume();
    }

    /* renamed from: h */
    public void mo5551h() {
        this.f3942a.f3944b.dispatchPause();
    }

    /* renamed from: i */
    public void mo5552i() {
        this.f3942a.f3944b.dispatchStop();
    }

    /* renamed from: j */
    public void mo5553j() {
        this.f3942a.f3944b.dispatchDestroy();
    }

    /* renamed from: k */
    public void mo5554k() {
        this.f3942a.f3944b.dispatchLowMemory();
    }

    /* renamed from: c */
    public Parcelable mo5546c() {
        return this.f3942a.f3944b.saveAllState();
    }

    /* renamed from: l */
    public boolean mo5555l() {
        return this.f3942a.f3944b.execPendingActions(true);
    }

    private C1033e(AbstractC1035g<?> gVar) {
        this.f3942a = gVar;
    }

    /* renamed from: a */
    public static C1033e m4989a(AbstractC1035g<?> gVar) {
        return new C1033e((AbstractC1035g) C0845f.m3992a(gVar, "callbacks == null"));
    }

    /* renamed from: b */
    public void mo5543b(Menu menu) {
        this.f3942a.f3944b.dispatchOptionsMenuClosed(menu);
    }

    /* renamed from: b */
    public void mo5544b(boolean z) {
        this.f3942a.f3944b.dispatchPictureInPictureModeChanged(z);
    }

    /* renamed from: a */
    public Fragment mo5533a(String str) {
        return this.f3942a.f3944b.findFragmentByWho(str);
    }

    /* renamed from: b */
    public boolean mo5545b(MenuItem menuItem) {
        return this.f3942a.f3944b.dispatchContextItemSelected(menuItem);
    }

    /* renamed from: a */
    public void mo5535a(Configuration configuration) {
        this.f3942a.f3944b.dispatchConfigurationChanged(configuration);
    }

    /* renamed from: a */
    public void mo5536a(Parcelable parcelable) {
        AbstractC1035g<?> gVar = this.f3942a;
        if (gVar instanceof ViewModelStoreOwner) {
            gVar.f3944b.restoreSaveState(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: a */
    public void mo5537a(Fragment fragment) {
        FragmentManager fragmentManager = this.f3942a.f3944b;
        AbstractC1035g<?> gVar = this.f3942a;
        fragmentManager.attachController(gVar, gVar, fragment);
    }

    /* renamed from: a */
    public void mo5538a(boolean z) {
        this.f3942a.f3944b.dispatchMultiWindowModeChanged(z);
    }

    /* renamed from: a */
    public boolean mo5539a(Menu menu) {
        return this.f3942a.f3944b.dispatchPrepareOptionsMenu(menu);
    }

    /* renamed from: a */
    public View mo5532a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3942a.f3944b.getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }
}
