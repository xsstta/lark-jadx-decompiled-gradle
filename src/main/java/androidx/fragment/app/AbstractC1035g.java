package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.util.C0845f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.g */
public abstract class AbstractC1035g<E> extends AbstractC1032d {

    /* renamed from: a */
    private final Activity f3943a;

    /* renamed from: b */
    final FragmentManager f3944b;

    /* renamed from: c */
    private final Context f3945c;

    /* renamed from: d */
    private final Handler f3946d;

    /* renamed from: e */
    private final int f3947e;

    @Override // androidx.fragment.app.AbstractC1032d
    /* renamed from: a */
    public View mo5236a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo5277a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo5278a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // androidx.fragment.app.AbstractC1032d
    /* renamed from: a */
    public boolean mo5237a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo5279a(Fragment fragment) {
        return true;
    }

    /* renamed from: a */
    public boolean mo5280a(String str) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5282b(Fragment fragment) {
    }

    /* renamed from: d */
    public void mo5284d() {
    }

    /* renamed from: e */
    public abstract E mo5285e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity mo5556f() {
        return this.f3943a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Context mo5557g() {
        return this.f3945c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Handler mo5558h() {
        return this.f3946d;
    }

    /* renamed from: b */
    public LayoutInflater mo5281b() {
        return LayoutInflater.from(this.f3945c);
    }

    AbstractC1035g(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    /* renamed from: a */
    public void mo5275a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f3945c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    AbstractC1035g(Activity activity, Context context, Handler handler, int i) {
        this.f3944b = new C1039j();
        this.f3943a = activity;
        this.f3945c = (Context) C0845f.m3992a(context, "context == null");
        this.f3946d = (Handler) C0845f.m3992a(handler, "handler == null");
        this.f3947e = i;
    }

    /* renamed from: a */
    public void mo5276a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            ActivityCompat.startIntentSenderForResult(this.f3943a, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }
}
