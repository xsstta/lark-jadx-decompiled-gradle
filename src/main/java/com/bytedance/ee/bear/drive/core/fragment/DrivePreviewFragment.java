package com.bytedance.ee.bear.drive.core.fragment;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0014J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/fragment/DrivePreviewFragment;", "Lcom/bytedance/ee/bear/drive/core/fragment/AbsLazyLoadFragment;", "()V", "mLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "moveLifecycleState", "", "state", "Landroidx/lifecycle/Lifecycle$Event;", "onAttachData", "onDestroyView", "onDetachData", "onPause", "onResume", "requiredLifecycleRegistry", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.core.b.c */
public final class DrivePreviewFragment extends AbstractC6939a {

    /* renamed from: e */
    public static final Companion f18751e = new Companion(null);

    /* renamed from: f */
    private LifecycleRegistry f18752f = new LifecycleRegistry(this);

    /* renamed from: g */
    private HashMap f18753g;

    /* renamed from: h */
    public void mo27295h() {
        HashMap hashMap = this.f18753g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/fragment/DrivePreviewFragment$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i */
    private final void m27497i() {
        if (this.f18752f == null) {
            this.f18752f = new LifecycleRegistry(this);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner, androidx.fragment.app.Fragment
    public Lifecycle getLifecycle() {
        m27497i();
        LifecycleRegistry lifecycleRegistry = this.f18752f;
        if (lifecycleRegistry == null) {
            Intrinsics.throwNpe();
        }
        return lifecycleRegistry;
    }

    @Override // com.bytedance.ee.bear.drive.core.p348b.AbstractC6939a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mo27289g()) {
            m27496a(Lifecycle.Event.ON_STOP);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.p348b.AbstractC6939a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (mo27289g()) {
            m27496a(Lifecycle.Event.ON_RESUME);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.core.p348b.AbstractC6939a
    /* renamed from: e */
    public void mo27287e() {
        super.mo27287e();
        m27496a(Lifecycle.Event.ON_RESUME);
        mo27286d().mo27262m().mo27301d();
        mo27286d().mo27262m().mo27298b();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.core.p348b.AbstractC6939a
    /* renamed from: f */
    public void mo27288f() {
        super.mo27288f();
        m27496a(Lifecycle.Event.ON_STOP);
        mo27286d().mo27262m().mo27302e();
    }

    @Override // com.bytedance.ee.bear.drive.core.p348b.AbstractC6939a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Lifecycle.State state;
        super.onDestroyView();
        LifecycleRegistry lifecycleRegistry = this.f18752f;
        if (lifecycleRegistry != null) {
            state = lifecycleRegistry.getCurrentState();
        } else {
            state = null;
        }
        if (state != Lifecycle.State.INITIALIZED) {
            m27496a(Lifecycle.Event.ON_DESTROY);
        }
        this.f18752f = null;
        mo27295h();
    }

    /* renamed from: a */
    private final void m27496a(Lifecycle.Event event) {
        try {
            LifecycleRegistry lifecycleRegistry = this.f18752f;
            if (lifecycleRegistry != null) {
                lifecycleRegistry.handleLifecycleEvent(event);
            }
        } catch (Throwable th) {
            C13479a.m54759a("DrivePreviewFragment", "moveLifecycleState() error:", th);
        }
    }
}
