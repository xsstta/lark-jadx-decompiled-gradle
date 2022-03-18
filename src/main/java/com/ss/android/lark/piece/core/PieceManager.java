package com.ss.android.lark.piece.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.piece.data.SharedData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0002\"#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/ss/android/lark/piece/core/PieceManager;", "Landroidx/fragment/app/Fragment;", "builder", "Lcom/ss/android/lark/piece/core/PieceManager$Builder;", "(Lcom/ss/android/lark/piece/core/PieceManager$Builder;)V", "activityContext", "Landroid/content/Context;", "attachedActivity", "Landroidx/fragment/app/FragmentActivity;", "attachedFragment", "pieceContext", "Lcom/ss/android/lark/piece/core/PieceContext;", "pieceGroup", "Lcom/ss/android/lark/piece/core/PieceGroup;", "Landroid/view/ViewGroup$MarginLayoutParams;", "sharedData", "Lcom/ss/android/lark/piece/data/SharedData;", "getSharedData", "()Lcom/ss/android/lark/piece/data/SharedData;", "innerSetup", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "setup", "Builder", "Companion", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.piece.core.c */
public final class PieceManager extends Fragment {

    /* renamed from: a */
    public static final Companion f128077a = new Companion(null);

    /* renamed from: b */
    private final SharedData f128078b;

    /* renamed from: c */
    private final PieceContext f128079c;

    /* renamed from: d */
    private final Context f128080d;

    /* renamed from: e */
    private final PieceGroup<?, ? extends ViewGroup.MarginLayoutParams> f128081e;

    /* renamed from: f */
    private FragmentActivity f128082f;

    /* renamed from: g */
    private Fragment f128083g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/ss/android/lark/piece/core/PieceManager$Builder;", "", "pieceGroup", "Lcom/ss/android/lark/piece/core/PieceGroup;", "Landroid/view/ViewGroup$MarginLayoutParams;", "activityContext", "Landroid/content/Context;", "(Lcom/ss/android/lark/piece/core/PieceGroup;Landroid/content/Context;)V", "getActivityContext", "()Landroid/content/Context;", "<set-?>", "Landroidx/fragment/app/FragmentActivity;", "attachedActivity", "getAttachedActivity", "()Landroidx/fragment/app/FragmentActivity;", "Landroidx/fragment/app/Fragment;", "attachedFragment", "getAttachedFragment", "()Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "intentExtras", "getIntentExtras", "()Landroid/os/Bundle;", "getPieceGroup", "()Lcom/ss/android/lark/piece/core/PieceGroup;", "attachActivity", "activity", "attachFragment", "fragment", "build", "Lcom/ss/android/lark/piece/core/PieceManager;", "buildAndSetup", "extras", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.piece.core.c$a */
    public static final class Builder {

        /* renamed from: a */
        private FragmentActivity f128084a;

        /* renamed from: b */
        private Fragment f128085b;

        /* renamed from: c */
        private Bundle f128086c = new Bundle();

        /* renamed from: d */
        private final PieceGroup<?, ? extends ViewGroup.MarginLayoutParams> f128087d;

        /* renamed from: e */
        private final Context f128088e;

        /* renamed from: a */
        public final FragmentActivity mo177232a() {
            return this.f128084a;
        }

        /* renamed from: b */
        public final Fragment mo177235b() {
            return this.f128085b;
        }

        /* renamed from: c */
        public final Bundle mo177236c() {
            return this.f128086c;
        }

        /* renamed from: f */
        public final PieceGroup<?, ? extends ViewGroup.MarginLayoutParams> mo177239f() {
            return this.f128087d;
        }

        /* renamed from: g */
        public final Context mo177240g() {
            return this.f128088e;
        }

        /* renamed from: e */
        public final PieceManager mo177238e() {
            return mo177237d().mo177230b();
        }

        /* renamed from: d */
        public final PieceManager mo177237d() {
            FragmentActivity fragmentActivity = this.f128084a;
            if (fragmentActivity == null && this.f128085b == null) {
                throw new IllegalArgumentException("both attachedActivity and attachedFragment is null");
            } else if (fragmentActivity == null || this.f128085b == null) {
                return new PieceManager(this);
            } else {
                throw new IllegalArgumentException("attachedActivity and attachedFragment can not been set at the same time");
            }
        }

        /* renamed from: a */
        public final Builder mo177233a(Bundle bundle) {
            Builder aVar = this;
            if (bundle != null) {
                aVar.f128086c.putAll(bundle);
            }
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo177234a(FragmentActivity fragmentActivity) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Builder aVar = this;
            aVar.f128084a = fragmentActivity;
            return aVar;
        }

        public Builder(PieceGroup<?, ? extends ViewGroup.MarginLayoutParams> pieceGroup, Context context) {
            Intrinsics.checkParameterIsNotNull(pieceGroup, "pieceGroup");
            Intrinsics.checkParameterIsNotNull(context, "activityContext");
            this.f128087d = pieceGroup;
            this.f128088e = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/piece/core/PieceManager$Companion;", "", "()V", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.piece.core.c$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final SharedData mo177229a() {
        return this.f128078b;
    }

    /* renamed from: c */
    public final boolean mo177231c() {
        return this.f128081e.mo177178A();
    }

    /* renamed from: b */
    public final PieceManager mo177230b() {
        PieceManager cVar = this;
        FragmentActivity fragmentActivity = cVar.f128082f;
        if (fragmentActivity != null) {
            Lifecycle lifecycle = fragmentActivity.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "it.lifecycle");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it.supportFragmentManager");
            cVar.m199557a(lifecycle, supportFragmentManager);
        }
        Fragment fragment = cVar.f128083g;
        if (fragment != null) {
            Lifecycle lifecycle2 = fragment.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle2, "it.lifecycle");
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "it.childFragmentManager");
            cVar.m199557a(lifecycle2, childFragmentManager);
        }
        return cVar;
    }

    public PieceManager(Builder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        SharedData cVar = new SharedData();
        this.f128078b = cVar;
        Context g = aVar.mo177240g();
        this.f128080d = g;
        cVar.mo177166a(aVar.mo177236c());
        PieceContext bVar = new PieceContext(g, this);
        this.f128079c = bVar;
        FragmentActivity a = aVar.mo177232a();
        if (a != null) {
            this.f128082f = a;
            bVar.mo177224a(a);
            FragmentManager supportFragmentManager = a.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it.supportFragmentManager");
            bVar.mo177223a(supportFragmentManager);
        }
        Fragment b = aVar.mo177235b();
        if (b != null) {
            this.f128083g = b;
            bVar.mo177224a(b);
            FragmentManager childFragmentManager = b.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "it.childFragmentManager");
            bVar.mo177223a(childFragmentManager);
        }
        PieceGroup<?, ? extends ViewGroup.MarginLayoutParams> f = aVar.mo177239f();
        this.f128081e = f;
        f.mo177188a(cVar);
        f.mo177189a(bVar);
    }

    /* renamed from: a */
    private final void m199557a(Lifecycle lifecycle, FragmentManager fragmentManager) {
        lifecycle.addObserver(this.f128081e);
        fragmentManager.beginTransaction().add(this, toString()).commitNowAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f128081e.mo128689a(i, i2, intent);
    }
}
