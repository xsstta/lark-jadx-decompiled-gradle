package com.bytedance.ee.bear.middleground.feed.view.empty;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/empty/FeedPanelStatusConfig;", "", "context", "Landroid/content/Context;", "lang", "", "(Landroid/content/Context;Ljava/lang/String;)V", "value", "Lkotlin/Function0;", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "getValue", "()Lkotlin/jvm/functions/Function0;", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.e.b.a */
public final class FeedPanelStatusConfig {

    /* renamed from: a */
    public final Context f25492a;

    /* renamed from: b */
    public String f25493b;

    /* renamed from: c */
    private final Function0<Config> f25494c = new C9469a(this);

    /* renamed from: a */
    public final Function0<Config> mo36056a() {
        return this.f25494c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/facade/common/empty/Config;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.b.a$a */
    public static final class C9469a extends Lambda implements Function0<Config> {
        final /* synthetic */ FeedPanelStatusConfig this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9469a(FeedPanelStatusConfig aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Config invoke() {
            return C7689c.m30765a(new Function1<Config, Unit>(this) {
                /* class com.bytedance.ee.bear.middleground.feed.view.empty.FeedPanelStatusConfig.C9469a.C94701 */
                final /* synthetic */ C9469a this$0;

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
                        /* class com.bytedance.ee.bear.middleground.feed.view.empty.FeedPanelStatusConfig.C9469a.C94701.C94711 */
                        final /* synthetic */ C94701 this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            aVar.mo30143a(this.this$0.this$0.this$0.f25492a);
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.middleground.feed.view.empty.FeedPanelStatusConfig.C9469a.C94701.C94711.C94721 */
                                final /* synthetic */ C94711 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(0, this.this$0.this$0.this$0.this$0.f25492a.getString(R.string.Doc_Facade_Loading));
                                }
                            });
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.middleground.feed.view.empty.FeedPanelStatusConfig.C9469a.C94701.C94711.C94732 */
                                final /* synthetic */ C94711 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(3, this.this$0.this$0.this$0.this$0.f25492a.getString(R.string.Doc_Doc_NetException));
                                }
                            });
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.middleground.feed.view.empty.FeedPanelStatusConfig.C9469a.C94701.C94711.C94743 */
                                final /* synthetic */ C94711 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(1, this.this$0.this$0.this$0.this$0.f25492a.getString(R.string.Doc_Doc_NoContent));
                                }
                            });
                            aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                /* class com.bytedance.ee.bear.middleground.feed.view.empty.FeedPanelStatusConfig.C9469a.C94701.C94711.C94754 */
                                final /* synthetic */ C94711 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public final Pair<? extends Integer, ? extends String> invoke() {
                                    return TuplesKt.to(4, this.this$0.this$0.this$0.this$0.f25492a.getString(R.string.Doc_Doc_NetException));
                                }
                            });
                            aVar.mo30149c(C94765.INSTANCE);
                        }
                    });
                    aVar.mo30147b(new Function0<Unit>() {
                        /* class com.bytedance.ee.bear.middleground.feed.view.empty.FeedPanelStatusConfig.C9469a.C94701.C94772 */

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            aVar.mo30151d(C94781.INSTANCE);
                            aVar.mo30151d(C94792.INSTANCE);
                            aVar.mo30151d(C94803.INSTANCE);
                            aVar.mo30151d(C94814.INSTANCE);
                            aVar.mo30151d(C94825.INSTANCE);
                            aVar.mo30151d(C94836.INSTANCE);
                            aVar.mo30151d(C94847.INSTANCE);
                        }
                    });
                    aVar.mo30153e(C94853.INSTANCE);
                    aVar.mo30144a(this.this$0.this$0.f25493b);
                }
            });
        }
    }

    public FeedPanelStatusConfig(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "lang");
        this.f25492a = context;
        this.f25493b = str;
    }
}
