package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.facade.common.empty.C7689c;
import com.bytedance.ee.bear.facade.common.empty.C7690d;
import com.bytedance.ee.bear.facade.common.empty.C7692e;
import com.bytedance.ee.bear.facade.common.empty.Config;
import com.bytedance.ee.bear.facade.common.empty.EmptyView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12477f;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.Err;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.Loading;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.Ok;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.Result;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiAction;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class WikiEmptyView extends EmptyView {

    /* renamed from: b */
    public static final Companion f33561b = new Companion(null);

    /* renamed from: a */
    public C7690d f33562a;

    /* renamed from: c */
    private LoadingConfig f33563c;

    /* renamed from: d */
    private final C68289a f33564d = new C68289a();

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$b */
    public static final class LoadingConfig {

        /* renamed from: a */
        private final int f33565a;

        /* renamed from: b */
        private final long f33566b;

        /* renamed from: a */
        public final int mo47690a() {
            return this.f33565a;
        }

        /* renamed from: b */
        public final long mo47691b() {
            return this.f33566b;
        }

        public LoadingConfig(int i, long j) {
            this.f33565a = i;
            this.f33566b = j;
        }
    }

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$c */
    public static final class WikiEmptyConfig {

        /* renamed from: a */
        public final Context f33567a;

        /* renamed from: b */
        public final String f33568b;

        /* renamed from: c */
        public final Integer f33569c;

        /* renamed from: d */
        private final Function0<Config> f33570d = new C12518a(this);

        /* renamed from: a */
        public final Function0<Config> mo47692a() {
            return this.f33570d;
        }

        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$c$a */
        public static final class C12518a extends Lambda implements Function0<Config> {
            final /* synthetic */ WikiEmptyConfig this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12518a(WikiEmptyConfig cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Config invoke() {
                return C7689c.m30765a(new Function1<Config, Unit>(this) {
                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191 */
                    final /* synthetic */ C12518a this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Config aVar) {
                        invoke(aVar);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final Config aVar) {
                        Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                        aVar.mo30145a(new Function0<Unit>(this) {
                            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201 */
                            final /* synthetic */ C125191 this$0;

                            {
                                this.this$0 = r1;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final void invoke() {
                                aVar.mo30143a(this.this$0.this$0.this$0.f33567a);
                                aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201.C125211 */
                                    final /* synthetic */ C125201 this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Pair<? extends Integer, ? extends String> invoke() {
                                        return TuplesKt.to(0, this.this$0.this$0.this$0.this$0.f33567a.getString(R.string.Doc_Facade_Loading));
                                    }
                                });
                                aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201.C125222 */
                                    final /* synthetic */ C125201 this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Pair<? extends Integer, ? extends String> invoke() {
                                        return TuplesKt.to(3, this.this$0.this$0.this$0.this$0.f33567a.getString(R.string.Doc_Wiki_Tree_LoadError));
                                    }
                                });
                                aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201.C125233 */
                                    final /* synthetic */ C125201 this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Pair<? extends Integer, ? extends String> invoke() {
                                        return TuplesKt.to(1, this.this$0.this$0.this$0.this$0.f33567a.getString(R.string.CreationMobile_Wiki_NoAvailablePage_Toast));
                                    }
                                });
                                aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201.C125244 */
                                    final /* synthetic */ C125201 this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Pair<? extends Integer, ? extends String> invoke() {
                                        return TuplesKt.to(4, this.this$0.this$0.this$0.this$0.f33567a.getString(R.string.Doc_Wiki_Network_Error));
                                    }
                                });
                                aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201.C125255 */
                                    final /* synthetic */ C125201 this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Pair<? extends Integer, ? extends String> invoke() {
                                        return TuplesKt.to(5, this.this$0.this$0.this$0.this$0.f33567a.getString(R.string.CreationMobile_Wiki_PageDeleted_Toast));
                                    }
                                });
                                aVar.mo30149c(C125266.INSTANCE);
                                aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201.C125277 */
                                    final /* synthetic */ C125201 this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Pair<? extends Integer, ? extends String> invoke() {
                                        return TuplesKt.to(99, this.this$0.this$0.this$0.this$0.f33567a.getString(R.string.Doc_Wiki_EnterWorkspaceNoPermission));
                                    }
                                });
                                aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201.C125288 */
                                    final /* synthetic */ C125201 this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Pair<? extends Integer, ? extends String> invoke() {
                                        return TuplesKt.to(9, this.this$0.this$0.this$0.this$0.f33567a.getString(R.string.CreationMobile_wiki_DeleteWiki_deleted_return_toast));
                                    }
                                });
                                aVar.mo30149c(new Function0<Pair<? extends Integer, ? extends String>>(this) {
                                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125201.C125299 */
                                    final /* synthetic */ C125201 this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Pair<? extends Integer, ? extends String> invoke() {
                                        return TuplesKt.to(10, this.this$0.this$0.this$0.this$0.f33567a.getString(R.string.CreationMobile_ECM_SiteUnavailableDesc));
                                    }
                                });
                            }
                        });
                        aVar.mo30147b(new Function0<Unit>() {
                            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125302 */

                            @Override // kotlin.jvm.functions.Function0
                            public final void invoke() {
                                aVar.mo30151d(C125311.INSTANCE);
                                aVar.mo30151d(C125333.INSTANCE);
                                aVar.mo30151d(C125344.INSTANCE);
                                aVar.mo30151d(C125355.INSTANCE);
                                aVar.mo30151d(C125366.INSTANCE);
                                aVar.mo30151d(C125377.INSTANCE);
                                aVar.mo30151d(C125388.INSTANCE);
                                aVar.mo30151d(C125399.INSTANCE);
                                aVar.mo30151d(AnonymousClass10.INSTANCE);
                                aVar.mo30151d(C125322.INSTANCE);
                            }
                        });
                        aVar.mo30153e(new Function0<Integer>(this) {
                            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125403 */
                            final /* synthetic */ C125191 this$0;

                            {
                                this.this$0 = r1;
                            }

                            /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.Integer] */
                            /* JADX WARNING: Unknown variable types count: 1 */
                            @Override // kotlin.jvm.functions.Function0
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Integer invoke() {
                                /*
                                    r1 = this;
                                    com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$c$a$1 r0 = r1.this$0
                                    com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$c$a r0 = r0.this$0
                                    com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$c r0 = r0.this$0
                                    java.lang.Integer r0 = r0.f33569c
                                    if (r0 == 0) goto L_0x000f
                                    int r0 = r0.intValue()
                                    goto L_0x0012
                                L_0x000f:
                                    r0 = 2131496304(0x7f0c0d70, float:1.861617E38)
                                L_0x0012:
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView.WikiEmptyConfig.C12518a.C125191.C125403.invoke():int");
                            }
                        });
                        aVar.mo30144a(this.this$0.this$0.f33568b);
                    }
                });
            }
        }

        public WikiEmptyConfig(Context context, String str, Integer num) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "lang");
            this.f33567a = context;
            this.f33568b = str;
            this.f33569c = num;
        }
    }

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$e */
    public static final class C12542e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12542e f33572a = new C12542e();

        C12542e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("Wiki_WikiEmptyView", "delay loading fail. ", th);
        }
    }

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView$d */
    public static final class C12541d<T> implements Consumer<Long> {

        /* renamed from: a */
        final /* synthetic */ WikiEmptyView f33571a;

        C12541d(WikiEmptyView wikiEmptyView) {
            this.f33571a = wikiEmptyView;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            WikiEmptyView.m52056a(this.f33571a).mo30158a(new C7692e.C7695b(0));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C7690d m52056a(WikiEmptyView wikiEmptyView) {
        C7690d dVar = wikiEmptyView.f33562a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyMediator");
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo47687a(int i) {
        long j;
        this.f33564d.mo237935a();
        if (i != 0) {
            C7690d dVar = this.f33562a;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emptyMediator");
            }
            dVar.mo30158a(new C7692e.C7695b(i));
            return;
        }
        C68289a aVar = this.f33564d;
        LoadingConfig bVar = this.f33563c;
        if (bVar != null) {
            j = bVar.mo47691b();
        } else {
            j = 400;
        }
        aVar.mo237937a(AbstractC68307f.m265098b(j, TimeUnit.MILLISECONDS).mo237985a(C11678b.m48481e()).mo238001b(new C12541d(this), C12542e.f33572a));
    }

    /* renamed from: a */
    public final void mo47689a(Result eVar) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(eVar, "result");
        if (eVar instanceof Loading) {
            i = 0;
        } else if (eVar instanceof Ok) {
            i = 2;
        } else if (eVar instanceof Err) {
            if (eVar.mo47506k() == WikiAction.PUSH_DES) {
                i2 = -3;
            } else {
                Err aVar = (Err) eVar;
                if (C12477f.m51913a(aVar.mo47463a())) {
                    i2 = 920004004;
                } else {
                    i2 = C12477f.m51915b(aVar.mo47463a());
                }
            }
            if (i2 == -3) {
                i = 9;
            } else if (i2 == -2) {
                i = 1;
            } else if (i2 == 920004002) {
                i = 5;
            } else if (i2 != 920004004) {
                i = 3;
            } else {
                i = 99;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mo47687a(i);
    }

    public WikiEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo47688a(View view, LoadingConfig bVar) {
        Integer num;
        this.f33563c = bVar;
        this.f33562a = new C7690d(getContext(), this, view);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        String c = C4484g.m18494b().mo17252c();
        Intrinsics.checkExpressionValueIsNotNull(c, "SdkLocaleServiceWrapper.…tance().provideLanguage()");
        LoadingConfig bVar2 = this.f33563c;
        if (bVar2 != null) {
            num = Integer.valueOf(bVar2.mo47690a());
        } else {
            num = null;
        }
        setConfig(new WikiEmptyConfig(context, c, num).mo47692a().invoke());
    }

    /* renamed from: a */
    public static /* synthetic */ void m52057a(WikiEmptyView wikiEmptyView, View view, LoadingConfig bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        wikiEmptyView.mo47688a(view, bVar);
    }
}
