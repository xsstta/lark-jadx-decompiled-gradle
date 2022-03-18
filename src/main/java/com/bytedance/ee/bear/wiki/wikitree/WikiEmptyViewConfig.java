package com.bytedance.ee.bear.wiki.wikitree;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/wiki/wikitree/WikiEmptyViewConfig;", "", "context", "Landroid/content/Context;", "lang", "", "(Landroid/content/Context;Ljava/lang/String;)V", "value", "Lkotlin/Function0;", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "getValue", "()Lkotlin/jvm/functions/Function0;", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.d */
public final class WikiEmptyViewConfig {

    /* renamed from: a */
    public final Context f32567a;

    /* renamed from: b */
    public String f32568b;

    /* renamed from: c */
    private final Function0<Config> f32569c = new C12077a(this);

    /* renamed from: a */
    public final Function0<Config> mo46257a() {
        return this.f32569c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.d$a */
    public static final class C12077a extends Lambda implements Function0<Config> {
        final /* synthetic */ WikiEmptyViewConfig this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12077a(WikiEmptyViewConfig dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Config invoke() {
            return C7689c.m30765a(new Function1<Config, Unit>(this) {
                /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781 */
                final /* synthetic */ C12077a this$0;

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
                        /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781.C120791 */
                        final /* synthetic */ C120781 this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            aVar.mo30143a(this.this$0.this$0.this$0.f32567a);
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781.C120791.C120801 */
                                final /* synthetic */ C120791 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(0, this.this$0.this$0.this$0.this$0.f32567a.getString(R.string.Doc_Facade_Loading));
                                }
                            });
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781.C120791.C120812 */
                                final /* synthetic */ C120791 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(3, this.this$0.this$0.this$0.this$0.f32567a.getString(R.string.Doc_Doc_NetException));
                                }
                            });
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781.C120791.C120823 */
                                final /* synthetic */ C120791 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(1, this.this$0.this$0.this$0.this$0.f32567a.getString(R.string.Doc_Doc_NoContent));
                                }
                            });
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781.C120791.C120834 */
                                final /* synthetic */ C120791 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(4, this.this$0.this$0.this$0.this$0.f32567a.getString(R.string.Doc_Wiki_Network_Error));
                                }
                            });
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781.C120791.C120845 */
                                final /* synthetic */ C120791 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(5, this.this$0.this$0.this$0.this$0.f32567a.getString(R.string.Doc_Wiki_PageRemovedTextClickable));
                                }
                            });
                            aVar.mo30149c(C120856.INSTANCE);
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781.C120791.C120867 */
                                final /* synthetic */ C120791 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(99, this.this$0.this$0.this$0.this$0.f32567a.getString(R.string.Doc_Wiki_EnterWorkspaceNoPermission));
                                }
                            });
                        }
                    });
                    aVar.mo30147b(new Function0<Unit>() {
                        /* class com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig.C12077a.C120781.C120872 */

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            aVar.mo30151d(C120881.INSTANCE);
                            aVar.mo30151d(C120892.INSTANCE);
                            aVar.mo30151d(C120903.INSTANCE);
                            aVar.mo30151d(C120914.INSTANCE);
                            aVar.mo30151d(C120925.INSTANCE);
                            aVar.mo30151d(C120936.INSTANCE);
                            aVar.mo30151d(C120947.INSTANCE);
                            aVar.mo30151d(C120958.INSTANCE);
                        }
                    });
                    aVar.mo30153e(C120963.INSTANCE);
                    aVar.mo30144a(this.this$0.this$0.f32568b);
                }
            });
        }
    }

    public WikiEmptyViewConfig(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "lang");
        this.f32567a = context;
        this.f32568b = str;
    }
}
