package com.bytedance.ee.bear.wikiv2.wikitreev2.create;

import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/NetObserveView;", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "view", "Landroid/view/View;", "(Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;)V", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "viewEnable", "", "bindNetwork", "", "setClickListener", "clickListener", "Landroid/view/View$OnClickListener;", "nonClickableClickListener", "setEnable", "enable", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.a */
public final class NetObserveView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33257a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NetObserveView.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    public boolean f33258b = true;

    /* renamed from: c */
    public final View f33259c;

    /* renamed from: d */
    private final Lazy f33260d = LazyKt.lazy(C12392b.INSTANCE);

    /* renamed from: e */
    private final LifecycleOwner f33261e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.a$b */
    static final class C12392b extends Lambda implements Function0<C10917c> {
        public static final C12392b INSTANCE = new C12392b();

        C12392b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* renamed from: a */
    private final void m51570a() {
        C5084ad.m20847d().mo20037a().mo5923a(this.f33261e, new C12391a(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "networkState", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.a$a */
    public static final class C12391a<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ NetObserveView f33262a;

        C12391a(NetObserveView aVar) {
            this.f33262a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            boolean z;
            if (networkState == null || !networkState.mo20041b()) {
                z = false;
            } else {
                z = true;
            }
            this.f33262a.f33259c.setEnabled(z);
            NetObserveView aVar = this.f33262a;
            aVar.mo47243a(aVar.f33258b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.a$c */
    public static final class View$OnClickListenerC12393c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NetObserveView f33263a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f33264b;

        /* renamed from: c */
        final /* synthetic */ View.OnClickListener f33265c;

        View$OnClickListenerC12393c(NetObserveView aVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            this.f33263a = aVar;
            this.f33264b = onClickListener;
            this.f33265c = onClickListener2;
        }

        public final void onClick(View view) {
            if (this.f33263a.f33258b) {
                this.f33264b.onClick(view);
                return;
            }
            View.OnClickListener onClickListener = this.f33265c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo47243a(boolean z) {
        boolean z2;
        this.f33258b = z;
        if (!z) {
            this.f33259c.setAlpha(0.5f);
            return;
        }
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        if (b != null) {
            z2 = b.mo20041b();
        } else {
            z2 = false;
        }
        if (z2) {
            this.f33259c.setAlpha(1.0f);
        } else {
            this.f33259c.setAlpha(0.5f);
        }
    }

    public NetObserveView(LifecycleOwner lifecycleOwner, View view) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f33261e = lifecycleOwner;
        this.f33259c = view;
        m51570a();
    }

    /* renamed from: a */
    public final void mo47242a(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        this.f33259c.setOnClickListener(new View$OnClickListenerC12393c(this, onClickListener, onClickListener2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m51571a(NetObserveView aVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i, Object obj) {
        if ((i & 2) != 0) {
            onClickListener2 = null;
        }
        aVar.mo47242a(onClickListener, onClickListener2);
    }
}
