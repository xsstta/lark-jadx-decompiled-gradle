package com.bytedance.ee.bear.facade.common.empty;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/facade/common/empty/DefaultConfig;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "default", "Lkotlin/Function0;", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "getDefault", "()Lkotlin/jvm/functions/Function0;", "biz-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.facade.common.empty.b */
public final class DefaultConfig {

    /* renamed from: a */
    private final Function0<Config> f20801a = new C7685a(this);

    /* renamed from: b */
    private final Context f20802b;

    /* renamed from: a */
    public final Function0<Config> mo30154a() {
        return this.f20801a;
    }

    /* renamed from: b */
    public final Context mo30155b() {
        return this.f20802b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.b$a */
    public static final class C7685a extends Lambda implements Function0<Config> {
        final /* synthetic */ DefaultConfig this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7685a(DefaultConfig bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Config invoke() {
            return C7689c.m30765a(new Function1<Config, Unit>(this) {
                /* class com.bytedance.ee.bear.facade.common.empty.DefaultConfig.C7685a.C76861 */
                final /* synthetic */ C7685a this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Config aVar) {
                    invoke(aVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(final Config aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                    aVar.mo30145a(new Function0<Unit>(this) {
                        /* class com.bytedance.ee.bear.facade.common.empty.DefaultConfig.C7685a.C76861.C76871 */
                        final /* synthetic */ C76861 this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            aVar.mo30143a(this.this$0.this$0.this$0.mo30155b());
                        }
                    });
                    aVar.mo30147b(new Function0<Unit>() {
                        /* class com.bytedance.ee.bear.facade.common.empty.DefaultConfig.C7685a.C76861.C76882 */

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            aVar.mo30152e();
                        }
                    });
                }
            });
        }
    }

    public DefaultConfig(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f20802b = context;
    }
}
