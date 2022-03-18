package com.bytedance.ee.bear.middleground.like;

import android.content.Context;
import com.bytedance.ee.bear.facade.common.empty.C7689c;
import com.bytedance.ee.bear.facade.common.empty.Config;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/middleground/like/LikeEmptyConfig;", "", "context", "Landroid/content/Context;", "lang", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "value", "Lkotlin/Function0;", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "getValue", "()Lkotlin/jvm/functions/Function0;", "like-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.like.b */
public final class LikeEmptyConfig {

    /* renamed from: a */
    private final Function0<Config> f25544a = new C9502a(this);

    /* renamed from: b */
    private final Context f25545b;

    /* renamed from: c */
    private String f25546c;

    /* renamed from: a */
    public final Function0<Config> mo36384a() {
        return this.f25544a;
    }

    /* renamed from: b */
    public final Context mo36385b() {
        return this.f25545b;
    }

    /* renamed from: c */
    public final String mo36386c() {
        return this.f25546c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.like.b$a */
    public static final class C9502a extends Lambda implements Function0<Config> {
        final /* synthetic */ LikeEmptyConfig this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9502a(LikeEmptyConfig bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Config invoke() {
            return C7689c.m30765a(new Function1<Config, Unit>(this) {
                /* class com.bytedance.ee.bear.middleground.like.LikeEmptyConfig.C9502a.C95031 */
                final /* synthetic */ C9502a this$0;

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
                        /* class com.bytedance.ee.bear.middleground.like.LikeEmptyConfig.C9502a.C95031.C95041 */
                        final /* synthetic */ C95031 this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            aVar.mo30143a(this.this$0.this$0.this$0.mo36385b());
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.middleground.like.LikeEmptyConfig.C9502a.C95031.C95041.C95051 */
                                final /* synthetic */ C95041 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(1, this.this$0.this$0.this$0.this$0.mo36385b().getString(R.string.Doc_Like_NoLike));
                                }
                            });
                        }
                    });
                    aVar.mo30147b(new Function0<Unit>() {
                        /* class com.bytedance.ee.bear.middleground.like.LikeEmptyConfig.C9502a.C95031.C95062 */

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            aVar.mo30152e();
                            aVar.mo30151d(C95071.INSTANCE);
                        }
                    });
                    aVar.mo30144a(this.this$0.this$0.mo36386c());
                }
            });
        }
    }

    public LikeEmptyConfig(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "lang");
        this.f25545b = context;
        this.f25546c = str;
    }
}
