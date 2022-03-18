package com.bytedance.ee.bear.middleground.like;

import com.bytedance.ee.bear.rn.RnPushProtocol;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/like/Push;", "", "docToken", "", "messageBoxVersion", "", "(Ljava/lang/String;I)V", "RELIABLE_LIKE_TAG_PREFIX", "rnPushProtocol", "Lcom/bytedance/ee/bear/rn/RnPushProtocol;", "getRnPushProtocol", "()Lcom/bytedance/ee/bear/rn/RnPushProtocol;", "rnPushProtocol$delegate", "Lkotlin/Lazy;", "registerPushObserver", "", "observer", "Lcom/bytedance/ee/bear/middleground/like/PushObserver;", "unregisterPushObserver", "Builder", "Companion", "like-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.like.i */
public final class Push {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f25602a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Push.class), "rnPushProtocol", "getRnPushProtocol()Lcom/bytedance/ee/bear/rn/RnPushProtocol;"))};

    /* renamed from: e */
    public static final Companion f25603e = new Companion(null);

    /* renamed from: b */
    public final String f25604b;

    /* renamed from: c */
    public final String f25605c;

    /* renamed from: d */
    public final int f25606d;

    /* renamed from: f */
    private final Lazy f25607f;

    /* renamed from: b */
    private final RnPushProtocol m39386b() {
        Lazy lazy = this.f25607f;
        KProperty kProperty = f25602a[0];
        return (RnPushProtocol) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/like/Push$Companion;", "", "()V", "TAG", "", "like-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.like.i$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo36516a() {
        m39386b().mo40241a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/like/Push$Builder;", "", "()V", "docToken", "", "messageBoxVersion", "", "build", "Lcom/bytedance/ee/bear/middleground/like/Push;", "setDocToken", "setMessageBoxVersion", "like-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.like.i$a */
    public static final class Builder {

        /* renamed from: a */
        private String f25608a = "";

        /* renamed from: b */
        private int f25609b;

        /* renamed from: a */
        public final Push mo36520a() {
            return new Push(this.f25608a, this.f25609b, null);
        }

        /* renamed from: a */
        public final Builder mo36518a(int i) {
            this.f25609b = i;
            return this;
        }

        /* renamed from: a */
        public final Builder mo36519a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "docToken");
            this.f25608a = str;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/rn/RnPushProtocol;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.like.i$d */
    public static final class C9542d extends Lambda implements Function0<RnPushProtocol> {
        final /* synthetic */ Push this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9542d(Push iVar) {
            super(0);
            this.this$0 = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RnPushProtocol invoke() {
            return (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Specify, new Function0<DefinitionParameters>(this) {
                /* class com.bytedance.ee.bear.middleground.like.Push.C9542d.C95431 */
                final /* synthetic */ C9542d this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final DefinitionParameters invoke() {
                    return C70039b.m268661a(this.this$0.this$0.f25604b, this.this$0.this$0.f25605c, Integer.valueOf(this.this$0.this$0.f25606d));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "didReceivePush"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.like.i$c */
    static final class C9541c implements RnPushProtocol.AbstractC10622a {

        /* renamed from: a */
        final /* synthetic */ PushObserver f25610a;

        C9541c(PushObserver jVar) {
            this.f25610a = jVar;
        }

        @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
        public final void didReceivePush(String str) {
            this.f25610a.didReceivePush(str);
        }
    }

    /* renamed from: a */
    public final void mo36517a(PushObserver jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "observer");
        m39386b().mo40242a(new C9541c(jVar));
    }

    private Push(String str, int i) {
        this.f25605c = str;
        this.f25606d = i;
        this.f25604b = "LIKE_";
        this.f25607f = LazyKt.lazy(new C9542d(this));
    }

    public /* synthetic */ Push(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }
}
