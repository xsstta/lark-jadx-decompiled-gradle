package com.ss.android.lark.mail.impl.home.threadlist.loadmore_footer;

import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42096i;
import com.ss.android.lark.mail.impl.home.C42515f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0014J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u0005¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "()V", "autoLoadMore", "", "dataLoader", "Lcom/ss/android/lark/mail/impl/home/MailHomeDataLoader;", "lastItemTimestamp", "", "showLoading", "", "defaultState", "finishLoadMore", "success", "setNoMoreData", "noMoreData", "setVisible", "show", "start", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d */
public final class LoadMoreViewModel extends JackViewModel<LoadMoreState> {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreViewModel$Companion;", "", "()V", "TAG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public LoadMoreState defaultState() {
        return new LoadMoreState(false, false, true, RefreshState.None);
    }

    public final void start() {
        initialize(new C42623f(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d$b */
    public static final class C42615b extends Lambda implements Function1<LoadMoreState, Unit> {
        final /* synthetic */ C42515f $dataLoader;
        final /* synthetic */ long $lastItemTimestamp;
        final /* synthetic */ boolean $showLoading;
        final /* synthetic */ LoadMoreViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42615b(LoadMoreViewModel dVar, C42515f fVar, long j, boolean z) {
            super(1);
            this.this$0 = dVar;
            this.$dataLoader = fVar;
            this.$lastItemTimestamp = j;
            this.$showLoading = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LoadMoreState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(LoadMoreState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            if (bVar.mo153155b()) {
                Log.m165389i("LoadMoreViewModel", "ignore loadMore when noMoreData");
            } else if (bVar.mo153157d() == RefreshState.Loading) {
                Log.m165389i("LoadMoreViewModel", "ignore loadMore when loading more");
            } else if (this.$dataLoader.mo152953a()) {
                Log.m165389i("LoadMoreViewModel", "ignore loadMore when loading all data");
            } else {
                Log.m165389i("LoadMoreViewModel", "execute loadMore task : " + this.$lastItemTimestamp);
                if (this.$showLoading) {
                    this.this$0.setState(C426161.INSTANCE);
                }
                this.$dataLoader.mo152950a(this.$lastItemTimestamp, false, new IGetDataCallback<C42096i>(this) {
                    /* class com.ss.android.lark.mail.impl.home.threadlist.loadmore_footer.LoadMoreViewModel.C42615b.C426172 */

                    /* renamed from: a */
                    final /* synthetic */ C42615b f108467a;

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f108467a = r1;
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d$b$2$a */
                    public static final class C42618a extends Lambda implements Function1<LoadMoreState, LoadMoreState> {
                        public static final C42618a INSTANCE = new C42618a();

                        C42618a() {
                            super(1);
                        }

                        public final LoadMoreState invoke(LoadMoreState bVar) {
                            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                            return LoadMoreState.m169983a(bVar, false, false, false, RefreshState.None, 1, null);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d$b$2$b */
                    public static final class C42619b extends Lambda implements Function1<LoadMoreState, LoadMoreState> {
                        final /* synthetic */ C42096i $data;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C42619b(C42096i iVar) {
                            super(1);
                            this.$data = iVar;
                        }

                        public final LoadMoreState invoke(LoadMoreState bVar) {
                            boolean z;
                            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                            C42096i iVar = this.$data;
                            if (iVar != null) {
                                z = iVar.mo151948b();
                            } else {
                                z = false;
                            }
                            return LoadMoreState.m169983a(bVar, false, z, true, RefreshState.None, 1, null);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(C42096i iVar) {
                        Log.m165389i("LoadMoreViewModel", "onSuccess");
                        this.f108467a.this$0.setState(new C42619b(iVar));
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        Log.m165389i("LoadMoreViewModel", "onError");
                        this.f108467a.this$0.setState(C42618a.INSTANCE);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d$f */
    static final class C42623f extends Lambda implements Function1<LoadMoreState, LoadMoreState> {
        final /* synthetic */ LoadMoreViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42623f(LoadMoreViewModel dVar) {
            super(1);
            this.this$0 = dVar;
        }

        public final LoadMoreState invoke(LoadMoreState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            return this.this$0.defaultState();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d$c */
    public static final class C42620c extends Lambda implements Function1<LoadMoreState, LoadMoreState> {
        final /* synthetic */ boolean $success;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42620c(boolean z) {
            super(1);
            this.$success = z;
        }

        public final LoadMoreState invoke(LoadMoreState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            return LoadMoreState.m169983a(bVar, false, false, this.$success, RefreshState.None, 3, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d$d */
    public static final class C42621d extends Lambda implements Function1<LoadMoreState, LoadMoreState> {
        final /* synthetic */ boolean $noMoreData;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42621d(boolean z) {
            super(1);
            this.$noMoreData = z;
        }

        public final LoadMoreState invoke(LoadMoreState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            return LoadMoreState.m169983a(bVar, false, this.$noMoreData, false, null, 13, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.d$e */
    static final class C42622e extends Lambda implements Function1<LoadMoreState, LoadMoreState> {
        final /* synthetic */ boolean $show;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42622e(boolean z) {
            super(1);
            this.$show = z;
        }

        public final LoadMoreState invoke(LoadMoreState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            return LoadMoreState.m169983a(bVar, this.$show, false, false, null, 14, null);
        }
    }

    public final void finishLoadMore(boolean z) {
        Log.m165389i("LoadMoreViewModel", "finishLoadMore " + z);
        setState(new C42620c(z));
    }

    public final void setNoMoreData(boolean z) {
        Log.m165389i("LoadMoreViewModel", "setNoMoreData " + z);
        setState(new C42621d(z));
    }

    public final void setVisible(boolean z) {
        Log.m165389i("LoadMoreViewModel", "setVisible " + z);
        setState(new C42622e(z));
    }

    public final void autoLoadMore(C42515f fVar, long j, boolean z) {
        Intrinsics.checkParameterIsNotNull(fVar, "dataLoader");
        withState(new C42615b(this, fVar, j, z));
    }
}
