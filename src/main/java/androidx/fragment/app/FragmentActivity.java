package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.collection.C0525g;
import androidx.core.app.AbstractC0743j;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ak;
import androidx.loader.p045a.AbstractC1181a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry = new LifecycleRegistry(this);
    final C1033e mFragments = C1033e.m4989a(new C1003a());
    int mNextCandidateRequestIndex;
    C0525g<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;

    public void onAttachFragment(Fragment fragment) {
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    class C1003a extends AbstractC1035g<FragmentActivity> implements OnBackPressedDispatcherOwner, ViewModelStoreOwner {
        /* renamed from: c */
        public FragmentActivity mo5285e() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: d */
        public void mo5284d() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public ak getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: b */
        public LayoutInflater mo5281b() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.AbstractC1032d, androidx.fragment.app.AbstractC1035g
        /* renamed from: a */
        public boolean mo5237a() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public C1003a() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.AbstractC1032d, androidx.fragment.app.AbstractC1035g
        /* renamed from: a */
        public View mo5236a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: b */
        public void mo5282b(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: a */
        public boolean mo5279a(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: a */
        public boolean mo5280a(String str) {
            return ActivityCompat.shouldShowRequestPermissionRationale(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: a */
        public void mo5277a(Fragment fragment, String[] strArr, int i) {
            FragmentActivity.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: a */
        public void mo5275a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: a */
        public void mo5278a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1035g
        /* renamed from: a */
        public void mo5276a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            FragmentActivity.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.mo5534a();
    }

    public AbstractC1181a getSupportLoaderManager() {
        return AbstractC1181a.m5421a(this);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void onStateNotSaved() {
        this.mFragments.mo5542b();
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.mo5553j();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.mo5554k();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.mFragments.mo5550g();
    }

    public FragmentActivity() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.mo5551h();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo5542b();
        this.mFragments.mo5555l();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo5552i();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo5548e();
        }
        this.mFragments.mo5542b();
        this.mFragments.mo5555l();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.mFragments.mo5549f();
    }

    public void setEnterSharedElementCallback(AbstractC0743j jVar) {
        ActivityCompat.setEnterSharedElementCallback(this, jVar);
    }

    public void setExitSharedElementCallback(AbstractC0743j jVar) {
        ActivityCompat.setExitSharedElementCallback(this, jVar);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.mo5538a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.mo5544b(z);
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo5542b();
        this.mFragments.mo5535a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo5542b();
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public FragmentActivity(int i) {
        super(i);
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.mo3049b() < 65534) {
            while (this.mPendingFragmentActivityResults.mo3058f(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.mo3051b(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity
    public void onCreate(Bundle bundle) {
        this.mFragments.mo5537a((Fragment) null);
        if (bundle != null) {
            this.mFragments.mo5536a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new C0525g<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.mo3051b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C0525g<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.mFragments.mo5547d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        Parcelable c = this.mFragments.mo5546c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.mPendingFragmentActivityResults.mo3049b() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.mo3049b()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.mo3049b()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.mo3049b(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.mo3056d(i);
                strArr[i] = this.mPendingFragmentActivityResults.mo3057e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.mo5543b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // androidx.activity.ComponentActivity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.mo5540a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.mo5541a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.mo5545b(menuItem);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
                if (fragment.mViewLifecycleOwner != null && fragment.mViewLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.mo5689a(state);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, null);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.mo5539a(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            ActivityCompat.requestPermissions(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            ActivityCompat.requestPermissions(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
            this.mRequestedPermissionsFromFragment = false;
        } catch (Throwable th) {
            this.mRequestedPermissionsFromFragment = false;
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo5542b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a = this.mPendingFragmentActivityResults.mo3047a(i4);
            this.mPendingFragmentActivityResults.mo3050b(i4);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.mFragments.mo5533a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.onActivityResult(i & 65535, i2, intent);
            return;
        }
        ActivityCompat.AbstractC0712a permissionCompatDelegate = ActivityCompat.getPermissionCompatDelegate();
        if (permissionCompatDelegate == null || !permissionCompatDelegate.mo4062a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo5542b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.mPendingFragmentActivityResults.mo3047a(i3);
            this.mPendingFragmentActivityResults.mo3050b(i3);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.mFragments.mo5533a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.onRequestPermissionsResult(i & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.mo5532a(view, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                ActivityCompat.startActivityForResult(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            ActivityCompat.startActivityForResult(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC1181a.m5421a(this).mo6049a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo5534a().dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.mStartedIntentSenderFromFragment = true;
        if (i == -1) {
            try {
                ActivityCompat.startIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            ActivityCompat.startIntentSenderForResult(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }
}
