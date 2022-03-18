package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC0912n;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.lark.passport.infra.util.p2441c.C49173f;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u000b0\u000b0\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/ImeObserver;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "<set-?>", "", "imeHeight", "getImeHeight", "()I", "imeInfo", "Lcom/ss/android/lark/passport/infra/util/ImeObserver$ImeInfo;", "", "isImeShowing", "()Z", "liveData", "Landroidx/lifecycle/LiveData;", "mutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "handleWindowInsets", "Landroidx/core/view/WindowInsetsCompat;", "insets", "sendImeInfo", "", "isShowing", "Companion", "ImeInfo", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.n */
public final class ImeObserver {

    /* renamed from: d */
    public static final Companion f123492d = new Companion(null);

    /* renamed from: a */
    public volatile boolean f123493a;

    /* renamed from: b */
    public volatile int f123494b;

    /* renamed from: c */
    public final LiveData<ImeInfo> f123495c;

    /* renamed from: e */
    private final ImeInfo f123496e;

    /* renamed from: f */
    private final C1177w<ImeInfo> f123497f;

    @JvmStatic
    /* renamed from: a */
    public static final ImeObserver m193958a(Activity activity) {
        return f123492d.mo171701a(activity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/ImeObserver$Companion;", "", "()V", "TAG", "", "observe", "Lcom/ss/android/lark/passport/infra/util/ImeObserver;", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.n$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ImeObserver mo171702a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            return new ImeObserver(view, null);
        }

        @JvmStatic
        /* renamed from: a */
        public final ImeObserver mo171701a(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
            return mo171702a(decorView);
        }
    }

    /* renamed from: a */
    public final boolean mo171699a() {
        return this.f123493a;
    }

    /* renamed from: b */
    public final int mo171700b() {
        return this.f123494b;
    }

    /* renamed from: a */
    public final C0883ab mo171697a(C0883ab abVar) {
        boolean z;
        int i = 0;
        if (abVar.mo4647d() > abVar.mo4652h()) {
            z = true;
        } else {
            z = false;
        }
        this.f123493a = z;
        if (this.f123493a) {
            i = abVar.mo4647d() - abVar.mo4652h();
        }
        this.f123494b = i;
        mo171698a(this.f123493a, this.f123494b);
        return abVar;
    }

    private ImeObserver(View view) {
        C0883ab abVar = null;
        ImeInfo bVar = new ImeInfo(false, 0, 3, null);
        this.f123496e = bVar;
        C1177w<ImeInfo> wVar = new C1177w<>(bVar);
        this.f123497f = wVar;
        this.f123495c = wVar;
        ViewCompat.m4044a(view, new AbstractC0912n(this) {
            /* class com.ss.android.lark.passport.infra.util.ImeObserver.C492001 */

            /* renamed from: a */
            final /* synthetic */ ImeObserver f123498a;

            {
                this.f123498a = r1;
            }

            @Override // androidx.core.view.AbstractC0912n
            public final C0883ab onApplyWindowInsets(View view, C0883ab abVar) {
                ImeObserver nVar = this.f123498a;
                Intrinsics.checkExpressionValueIsNotNull(abVar, "insets");
                return nVar.mo171697a(abVar);
            }
        });
        abVar = view.isAttachedToWindow() ? ViewCompat.m4110y(view) : abVar;
        Activity a = C49173f.m193886a(view);
        if (abVar != null) {
            mo171697a(abVar);
        } else if (a != null) {
            C49203q.m193972a(a);
        }
        if (a instanceof LifecycleOwner) {
            ((LifecycleOwner) a).getLifecycle().addObserver(new ImeObserver$3(this));
        }
        if (abVar != null) {
            mo171697a(abVar);
        }
    }

    public /* synthetic */ ImeObserver(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/ImeObserver$ImeInfo;", "", "isShowing", "", "imeHeight", "", "(ZI)V", "component1", "component2", "copy", "equals", "other", "hashCode", "set", "", "toString", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.n$b */
    public static final class ImeInfo {

        /* renamed from: a */
        public boolean f123499a;

        /* renamed from: b */
        public int f123500b;

        public ImeInfo() {
            this(false, 0, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImeInfo)) {
                return false;
            }
            ImeInfo bVar = (ImeInfo) obj;
            return this.f123499a == bVar.f123499a && this.f123500b == bVar.f123500b;
        }

        public int hashCode() {
            boolean z = this.f123499a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return (i * 31) + this.f123500b;
        }

        public String toString() {
            return "ImeInfo(isShowing=" + this.f123499a + ", imeHeight=" + this.f123500b + ")";
        }

        /* renamed from: a */
        public final void mo171703a(boolean z, int i) {
            this.f123499a = z;
            this.f123500b = i;
        }

        public ImeInfo(boolean z, int i) {
            this.f123499a = z;
            this.f123500b = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ImeInfo(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
        }
    }

    /* renamed from: a */
    public final void mo171698a(boolean z, int i) {
        if (this.f123496e.f123499a != z || this.f123496e.f123500b != i) {
            this.f123496e.mo171703a(z, i);
            this.f123497f.mo5929b(this.f123496e);
        }
    }
}
