package com.ss.android.vc.meeting.module.tab3.list.mvp.repo;

import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.AbstractC60894j;
import com.ss.android.vc.dependency.VCNetworkLevel;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ap;
import com.ss.android.vc.dependency.aq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J+\u0010\u0007\u001a\u00020\u00062#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\tJ)\u0010\u000e\u001a\u00020\u00062!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ConnectionRepo;", "", "()V", "networkListener", "Lcom/ss/android/vc/dependency/VCNetworkLevelListener;", "dispose", "", "listenConnection", "onChange", "Lkotlin/Function1;", "Lcom/ss/android/vc/dependency/VCNetworkLevel;", "Lkotlin/ParameterName;", "name", "level", "listenNetwork", "", "isConnected", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.a */
public final class ConnectionRepo {

    /* renamed from: a */
    private aq f160037a;

    /* renamed from: a */
    public final void mo219351a() {
        if (this.f160037a != null) {
            VideoChatModuleDependency.getWschannelDependency().unRegisterNetworkLevelListener(this.f160037a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "level", "Lcom/ss/android/vc/dependency/VCNetworkLevel;", "onNetworkLevelChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.a$a */
    public static final class C63384a implements aq {

        /* renamed from: a */
        final /* synthetic */ Function1 f160038a;

        C63384a(Function1 function1) {
            this.f160038a = function1;
        }

        @Override // com.ss.android.vc.dependency.aq
        public final void onNetworkLevelChanged(VCNetworkLevel vCNetworkLevel) {
            this.f160038a.invoke(vCNetworkLevel);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isConnected", "", "onConnStateChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.a$b */
    public static final class C63385b implements AbstractC60894j {

        /* renamed from: a */
        final /* synthetic */ Function1 f160039a;

        C63385b(Function1 function1) {
            this.f160039a = function1;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60894j
        public final void onConnStateChanged(final boolean z) {
            C60735ab.m236001a(new Runnable(this) {
                /* class com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ConnectionRepo.C63385b.RunnableC633861 */

                /* renamed from: a */
                final /* synthetic */ C63385b f160040a;

                {
                    this.f160040a = r1;
                }

                public final void run() {
                    this.f160040a.f160039a.invoke(Boolean.valueOf(z));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo219352a(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onChange");
        VideoChatModule.m235665i().mo208191a(new C63385b(function1));
    }

    /* renamed from: b */
    public final void mo219353b(Function1<? super VCNetworkLevel, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onChange");
        ap wschannelDependency = VideoChatModuleDependency.getWschannelDependency();
        aq aqVar = this.f160037a;
        if (aqVar != null) {
            wschannelDependency.unRegisterNetworkLevelListener(aqVar);
        }
        C63384a aVar = new C63384a(function1);
        this.f160037a = aVar;
        wschannelDependency.registerNetworkLevelListener(aVar);
    }
}
