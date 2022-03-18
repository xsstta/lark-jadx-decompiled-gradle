package com.ss.android.lark.calendar.impl.framework.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\n\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\"\u0010\u0016\u001a\u00020\u00132\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0002R#\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8F¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/fragment/FragmentStackImpl;", "Lcom/ss/android/lark/calendar/impl/framework/fragment/FragmentStack;", "hostId", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onHandleEmpty", "Lkotlin/Function0;", "", "(ILandroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;)V", "addedFragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "getAddedFragments", "()Ljava/util/ArrayList;", "getTop", "onBackPressed", "pauseTop", "", "pop", "fragment", "push", "args", "Landroid/os/Bundle;", "fragmentClass", "Ljava/lang/Class;", "resumeTop", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.fragment.c */
public class FragmentStackImpl implements FragmentStack {

    /* renamed from: b */
    private final ArrayList<Fragment> f83317b = new ArrayList<>();

    /* renamed from: c */
    private final int f83318c;

    /* renamed from: d */
    private final FragmentManager f83319d;

    /* renamed from: e */
    private final Function0<Boolean> f83320e;

    /* renamed from: a */
    public final ArrayList<Fragment> mo118667a() {
        CollectionsKt.removeAll((List) this.f83317b, (Function1) C32495a.INSTANCE);
        return this.f83317b;
    }

    /* renamed from: c */
    public Fragment mo118669c() {
        return (Fragment) CollectionsKt.lastOrNull((List) mo118667a());
    }

    /* renamed from: d */
    private final void m124045d() {
        Fragment c = mo118669c();
        if (c != null) {
            this.f83319d.beginTransaction().setMaxLifecycle(c, Lifecycle.State.STARTED).commitNowAllowingStateLoss();
        }
    }

    /* renamed from: e */
    private final void m124046e() {
        Fragment c = mo118669c();
        if (c != null) {
            this.f83319d.beginTransaction().setMaxLifecycle(c, Lifecycle.State.RESUMED).commitNowAllowingStateLoss();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.fragment.HandleBackPress
    /* renamed from: b */
    public boolean mo109350b() {
        Fragment c = mo118669c();
        if (c == null) {
            return false;
        }
        if ((c instanceof HandleBackPress) && ((HandleBackPress) c).mo109350b()) {
            return true;
        }
        mo118661a(c);
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/fragment/app/Fragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.fragment.c$a */
    public static final class C32495a extends Lambda implements Function1<Fragment, Boolean> {
        public static final C32495a INSTANCE = new C32495a();

        C32495a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Fragment fragment) {
            return Boolean.valueOf(invoke(fragment));
        }

        public final boolean invoke(Fragment fragment) {
            Intrinsics.checkParameterIsNotNull(fragment, "it");
            return !fragment.isAdded();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.fragment.FragmentStack
    /* renamed from: a */
    public void mo118661a(Fragment fragment) {
        int i;
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        if (mo118667a().remove(fragment)) {
            if (!mo118667a().isEmpty() || !this.f83320e.invoke().booleanValue()) {
                FragmentTransaction beginTransaction = this.f83319d.beginTransaction();
                Bundle arguments = fragment.getArguments();
                int i2 = 0;
                if (arguments != null) {
                    i = FragmentStack.f83315a.mo118663a(arguments);
                } else {
                    i = 0;
                }
                Bundle arguments2 = fragment.getArguments();
                if (arguments2 != null) {
                    i2 = FragmentStack.f83315a.mo118665b(arguments2);
                }
                beginTransaction.setCustomAnimations(i, i2).remove(fragment).commitNowAllowingStateLoss();
                m124046e();
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.fragment.FragmentStack
    /* renamed from: a */
    public void mo118662a(Class<? extends Fragment> cls, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(cls, "fragmentClass");
        Fragment fragment = (Fragment) cls.newInstance();
        Intrinsics.checkExpressionValueIsNotNull(fragment, "it");
        mo118668a(fragment, bundle);
    }

    /* renamed from: a */
    public void mo118668a(Fragment fragment, Bundle bundle) {
        int i;
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        fragment.setArguments(bundle);
        m124045d();
        FragmentTransaction beginTransaction = this.f83319d.beginTransaction();
        int i2 = 0;
        if (bundle != null) {
            i = FragmentStack.f83315a.mo118663a(bundle);
        } else {
            i = 0;
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            i2 = FragmentStack.f83315a.mo118665b(arguments);
        }
        beginTransaction.setCustomAnimations(i, i2).add(this.f83318c, fragment).commitNowAllowingStateLoss();
        mo118667a().add(fragment);
    }

    public FragmentStackImpl(int i, FragmentManager fragmentManager, Function0<Boolean> function0) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(function0, "onHandleEmpty");
        this.f83318c = i;
        this.f83319d = fragmentManager;
        this.f83320e = function0;
    }
}
