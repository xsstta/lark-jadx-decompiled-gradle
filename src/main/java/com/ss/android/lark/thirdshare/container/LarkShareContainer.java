package com.ss.android.lark.thirdshare.container;

import android.content.Context;
import com.ss.android.lark.thirdshare.container.impl.LarkShareContainerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainer;", "", "uiConfig", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig;", "config", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig;", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig;Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig;)V", "getConfig", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig;", "getUiConfig", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig;", "Companion", "LarkShareContainerSupplier", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.thirdshare.container.a */
public final class LarkShareContainer {

    /* renamed from: a */
    public static LarkShareContainerSupplier f137482a;

    /* renamed from: b */
    public static LarkShareContainer f137483b;

    /* renamed from: c */
    public static final Companion f137484c = new Companion(null);

    /* renamed from: d */
    private final LarkShareContainerUiConfig f137485d;

    /* renamed from: e */
    private final LarkShareContainerConfig f137486e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainer$LarkShareContainerSupplier;", "", "getContainer", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainer;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.a$b */
    public interface LarkShareContainerSupplier {
        /* renamed from: a */
        LarkShareContainer mo146279a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainer$Companion;", "", "()V", "TAG", "", "container", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainer;", "getContainer", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainer;", "setContainer", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainer;)V", "supplier", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainer$LarkShareContainerSupplier;", "getSupplier", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainer$LarkShareContainerSupplier;", "setSupplier", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainer$LarkShareContainerSupplier;)V", "destroy", "", "destroy$components_third_share_container_release", "show", "context", "Landroid/content/Context;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final LarkShareContainerSupplier mo189938a() {
            return LarkShareContainer.f137482a;
        }

        /* renamed from: b */
        public final LarkShareContainer mo189942b() {
            return LarkShareContainer.f137483b;
        }

        /* renamed from: c */
        public final void mo189943c() {
            Companion aVar = this;
            aVar.mo189940a((LarkShareContainerSupplier) null);
            LarkShareContainer b = aVar.mo189942b();
            if (b != null) {
                b.mo189936a().mo189928d().mo146281b();
                LarkShareContainer.f137484c.mo189941a((LarkShareContainer) null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo189940a(LarkShareContainerSupplier bVar) {
            LarkShareContainer.f137482a = bVar;
        }

        /* renamed from: a */
        public final void mo189941a(LarkShareContainer aVar) {
            LarkShareContainer.f137483b = aVar;
        }

        /* renamed from: a */
        public final void mo189939a(Context context, LarkShareContainerSupplier bVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(bVar, "supplier");
            mo189940a(bVar);
            LarkShareContainerActivity.f137497a.mo189962a(context);
        }
    }

    /* renamed from: a */
    public final LarkShareContainerUiConfig mo189936a() {
        return this.f137485d;
    }

    /* renamed from: b */
    public final LarkShareContainerConfig mo189937b() {
        return this.f137486e;
    }

    public LarkShareContainer(LarkShareContainerUiConfig larkShareContainerUiConfig, LarkShareContainerConfig larkShareContainerConfig) {
        Intrinsics.checkParameterIsNotNull(larkShareContainerUiConfig, "uiConfig");
        Intrinsics.checkParameterIsNotNull(larkShareContainerConfig, "config");
        this.f137485d = larkShareContainerUiConfig;
        this.f137486e = larkShareContainerConfig;
    }
}
