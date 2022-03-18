package com.ss.android.vc.meeting.module.guides;

import android.view.View;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dto.NewGuideConfig;
import com.ss.android.vc.service.C63634c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u001c\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/guides/NewGuideDelegate;", "", "()V", "TAG", "", "isNewGuideEnable", "", "sIGuideDependency", "Lcom/ss/android/vc/dependency/IGuideDependency;", "isNewGuideFgEnable", "refreshFg", "", "startGuide", "guideConfig", "Lcom/ss/android/vc/dto/NewGuideConfig;", "iGuideLifecycleListener", "Lcom/ss/android/vc/dependency/IGuideDependency$IGuideLifecycleListener;", "GuideLifecycleListenerAdapter", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.e.d */
public final class NewGuideDelegate {

    /* renamed from: a */
    public static final NewGuideDelegate f154546a = new NewGuideDelegate();

    /* renamed from: b */
    private static boolean f154547b;

    /* renamed from: c */
    private static AbstractC60902q f154548c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/meeting/module/guides/NewGuideDelegate$GuideLifecycleListenerAdapter;", "Lcom/ss/android/vc/dependency/IGuideDependency$IGuideLifecycleListener;", "()V", "onGuideDidAppear", "", "guideKey", "", "onGuideDidClose", "onGuideWillAppear", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.e.d$a */
    public static abstract class GuideLifecycleListenerAdapter implements AbstractC60902q.AbstractC60903a {
        @Override // com.ss.android.vc.dependency.AbstractC60902q.AbstractC60903a
        /* renamed from: a */
        public void mo144595a(String str) {
        }

        @Override // com.ss.android.vc.dependency.AbstractC60902q.AbstractC60903a
        /* renamed from: b */
        public void mo144596b(String str) {
        }

        @Override // com.ss.android.vc.dependency.AbstractC60902q.AbstractC60903a
        /* renamed from: c */
        public void mo144597c(String str) {
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m240526a(NewGuideConfig newGuideConfig) {
        m240528a(newGuideConfig, null, 2, null);
    }

    private NewGuideDelegate() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m240525a() {
        C60735ab.m236018e(RunnableC61607b.f154549a);
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m240533b() {
        return f154547b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/guides/NewGuideDelegate$startGuide$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.e.d$c */
    public static final class RunnableC61608c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NewGuideConfig f154550a;

        /* renamed from: b */
        final /* synthetic */ AbstractC60902q.AbstractC60903a f154551b;

        RunnableC61608c(NewGuideConfig newGuideConfig, AbstractC60902q.AbstractC60903a aVar) {
            this.f154550a = newGuideConfig;
            this.f154551b = aVar;
        }

        public final void run() {
            NewGuideDelegate dVar = NewGuideDelegate.f154546a;
            AbstractC60902q qVar = NewGuideDelegate.f154548c;
            if (qVar != null) {
                qVar.mo196398a(this.f154550a, this.f154551b);
            }
        }
    }

    static {
        m240525a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.e.d$b */
    public static final class RunnableC61607b implements Runnable {

        /* renamed from: a */
        public static final RunnableC61607b f154549a = new RunnableC61607b();

        RunnableC61607b() {
        }

        public final void run() {
            NewGuideDelegate dVar = NewGuideDelegate.f154546a;
            NewGuideDelegate.f154547b = C63634c.m249496b("lark.newguide.switch.vc");
            NewGuideDelegate dVar2 = NewGuideDelegate.f154546a;
            if (NewGuideDelegate.f154547b) {
                NewGuideDelegate dVar3 = NewGuideDelegate.f154546a;
                if (NewGuideDelegate.f154548c == null) {
                    NewGuideDelegate dVar4 = NewGuideDelegate.f154546a;
                    NewGuideDelegate.f154548c = VideoChatModuleDependency.getGuideDependency();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("new guide enable: ");
            NewGuideDelegate dVar5 = NewGuideDelegate.f154546a;
            sb.append(NewGuideDelegate.f154547b);
            C60700b.m235851b("NewGuideDelegate", "[refreshFg]", sb.toString());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m240527a(NewGuideConfig newGuideConfig, AbstractC60902q.AbstractC60903a aVar) {
        View a;
        Intrinsics.checkParameterIsNotNull(newGuideConfig, "guideConfig");
        if (!f154547b || (a = newGuideConfig.mo208761a()) == null) {
            return;
        }
        if (a.isAttachedToWindow()) {
            AbstractC60902q qVar = f154548c;
            if (qVar != null) {
                qVar.mo196398a(newGuideConfig, aVar);
                return;
            }
            return;
        }
        a.post(new RunnableC61608c(newGuideConfig, aVar));
    }

    /* renamed from: a */
    public static /* synthetic */ void m240528a(NewGuideConfig newGuideConfig, AbstractC60902q.AbstractC60903a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        m240527a(newGuideConfig, aVar);
    }
}
