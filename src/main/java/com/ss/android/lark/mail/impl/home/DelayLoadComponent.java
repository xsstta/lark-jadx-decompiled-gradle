package com.ss.android.lark.mail.impl.home;

import androidx.lifecycle.C1144ai;
import androidx.lifecycle.ak;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleAwareLazy;
import com.larksuite.arch.jack.State;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.utils.DevicePerfUtils;
import kotlin.Metadata;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u0015*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u0015B7\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H&R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent;", "S", "Lcom/larksuite/arch/jack/State;", "V", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "clazz", "Lkotlin/reflect/KClass;", "normalPerfDelayTime", "", "lowPerfDelayTime", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Lkotlin/reflect/KClass;JJ)V", "isInit", "", "init", "", "onDelayInit", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.a */
public abstract class DelayLoadComponent<S extends State, V extends JackViewModel<S>> extends LifecycleAwareLazy<S, V> {

    /* renamed from: a */
    public static final Companion f107820a = new Companion(null);

    /* renamed from: e */
    private static final DevicePerfUtils.DevicePerfLevel f107821e = DevicePerfUtils.m224113b();

    /* renamed from: b */
    private boolean f107822b;

    /* renamed from: c */
    private final ak f107823c;

    /* renamed from: d */
    private final C1144ai.AbstractC1146b f107824d;

    /* renamed from: d */
    public abstract void mo152510d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent$Companion;", "", "()V", "sDeviceLevel", "Lcom/ss/android/lark/utils/DevicePerfUtils$DevicePerfLevel;", "kotlin.jvm.PlatformType", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void aO_() {
        if (!this.f107822b) {
            this.f107822b = true;
            mo152510d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DelayLoadComponent(final ak akVar, final C1144ai.AbstractC1146b bVar, final KClass<V> kClass, long j, long j2) {
        super(kClass, new Function0<String>() {
            /* class com.ss.android.lark.mail.impl.home.DelayLoadComponent.C423531 */

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "delay_load:" + C69113a.m265954a(kClass).getCanonicalName();
            }
        }, new Function0<ak>() {
            /* class com.ss.android.lark.mail.impl.home.DelayLoadComponent.C423542 */

            @Override // kotlin.jvm.functions.Function0
            public final ak invoke() {
                return akVar;
            }
        }, new Function0<C1144ai.AbstractC1146b>() {
            /* class com.ss.android.lark.mail.impl.home.DelayLoadComponent.C423553 */

            @Override // kotlin.jvm.functions.Function0
            public final C1144ai.AbstractC1146b invoke() {
                return bVar;
            }
        }, C423564.INSTANCE);
        Intrinsics.checkParameterIsNotNull(akVar, "viewModelStore");
        Intrinsics.checkParameterIsNotNull(bVar, "factory");
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        this.f107823c = akVar;
        this.f107824d = bVar;
        if (j >= 0 && j2 >= 0) {
            DevicePerfUtils.DevicePerfLevel devicePerfLevel = f107821e;
            if (devicePerfLevel == DevicePerfUtils.DevicePerfLevel.LOW || devicePerfLevel == DevicePerfUtils.DevicePerfLevel.ULTRALOW) {
                C43849u.m173827a(new Runnable(this) {
                    /* class com.ss.android.lark.mail.impl.home.DelayLoadComponent.RunnableC423575 */

                    /* renamed from: a */
                    final /* synthetic */ DelayLoadComponent f107825a;

                    {
                        this.f107825a = r1;
                    }

                    public final void run() {
                        this.f107825a.aO_();
                    }
                }, j);
            } else {
                C43849u.m173827a(new Runnable(this) {
                    /* class com.ss.android.lark.mail.impl.home.DelayLoadComponent.RunnableC423586 */

                    /* renamed from: a */
                    final /* synthetic */ DelayLoadComponent f107826a;

                    {
                        this.f107826a = r1;
                    }

                    public final void run() {
                        this.f107826a.aO_();
                    }
                }, j2);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DelayLoadComponent(androidx.lifecycle.ak r11, androidx.lifecycle.C1144ai.AbstractC1146b r12, kotlin.reflect.KClass r13, long r14, long r16, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 8
            if (r0 == 0) goto L_0x0008
            r0 = 500(0x1f4, double:2.47E-321)
            r6 = r0
            goto L_0x0009
        L_0x0008:
            r6 = r14
        L_0x0009:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0011
            r0 = 1000(0x3e8, double:4.94E-321)
            r8 = r0
            goto L_0x0013
        L_0x0011:
            r8 = r16
        L_0x0013:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.DelayLoadComponent.<init>(androidx.lifecycle.ak, androidx.lifecycle.ai$b, kotlin.reflect.KClass, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
