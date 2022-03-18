package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

public final class RemoteInput {

    /* renamed from: a */
    private final String f3058a;

    /* renamed from: b */
    private final CharSequence f3059b;

    /* renamed from: c */
    private final CharSequence[] f3060c;

    /* renamed from: d */
    private final boolean f3061d;

    /* renamed from: e */
    private final int f3062e;

    /* renamed from: f */
    private final Bundle f3063f;

    /* renamed from: g */
    private final Set<String> f3064g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    /* renamed from: a */
    public String mo4222a() {
        return this.f3058a;
    }

    /* renamed from: b */
    public CharSequence mo4223b() {
        return this.f3059b;
    }

    /* renamed from: c */
    public CharSequence[] mo4224c() {
        return this.f3060c;
    }

    /* renamed from: d */
    public Set<String> mo4225d() {
        return this.f3064g;
    }

    /* renamed from: e */
    public boolean mo4226e() {
        return this.f3061d;
    }

    /* renamed from: f */
    public int mo4227f() {
        return this.f3062e;
    }

    /* renamed from: g */
    public Bundle mo4228g() {
        return this.f3063f;
    }

    /* renamed from: a */
    static android.app.RemoteInput[] m3564a(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            remoteInputArr2[i] = m3563a(remoteInputArr[i]);
        }
        return remoteInputArr2;
    }

    /* renamed from: a */
    static android.app.RemoteInput m3563a(RemoteInput remoteInput) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.mo4222a()).setLabel(remoteInput.mo4223b()).setChoices(remoteInput.mo4224c()).setAllowFreeFormInput(remoteInput.mo4226e()).addExtras(remoteInput.mo4228g());
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(remoteInput.mo4227f());
        }
        return addExtras.build();
    }
}
