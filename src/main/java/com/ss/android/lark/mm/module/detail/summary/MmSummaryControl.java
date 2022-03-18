package com.ss.android.lark.mm.module.detail.summary;

import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummary;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummaryContent;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.net.task.MmBizTask;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.utils.ResString;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0014J9\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00170\u001bJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0003J3\u0010\r\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00032#\u0010\u001a\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00170\u001bJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\b\u0002\u0010\"\u001a\u00020#R\u000e\u0010\b\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "host", "", "token", "url", "requestId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "TAG", "getRequestId", "()Ljava/lang/String;", "summaries", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "getSummaries", "()Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "setSummaries", "(Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;)V", "getUrl", "checkHasSummaryInitial", "Lio/reactivex/Single;", "", "isRefresh", "checkSummary", "", "contentId", "isChecked", "onResult", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getOriginalContent", "translateLanguage", "translateSummaries", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.summary.d */
public final class MmSummaryControl extends MmBaseControl {

    /* renamed from: a */
    public final String f116560a = "MmSummaryControl";

    /* renamed from: b */
    public final String f116561b;

    /* renamed from: c */
    public final String f116562c;

    /* renamed from: d */
    private MmSummary f116563d;

    /* renamed from: e */
    private final String f116564e;

    /* renamed from: f */
    private final String f116565f;

    /* renamed from: a */
    public final String mo162631a() {
        return this.f116564e;
    }

    /* renamed from: b */
    public final String mo162636b() {
        return this.f116565f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/summary/MmSummaryControl$getSummaries$1", "Lcom/ss/android/lark/mm/net/callback/IHttpRespCallback;", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary$MmSummaryResp;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", "resp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.d$c */
    public static final class C46260c extends AbstractC47071d<MmSummary.MmSummaryResp> {

        /* renamed from: a */
        final /* synthetic */ MmSummaryControl f116572a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46260c(MmSummaryControl dVar) {
            this.f116572a = dVar;
        }

        /* renamed from: a */
        public void mo161289a(MmSummary.MmSummaryResp mmSummaryResp) {
            MmSummary mmSummary;
            MmSummaryControl dVar = this.f116572a;
            if (mmSummaryResp != null) {
                mmSummary = (MmSummary) mmSummaryResp.data;
            } else {
                mmSummary = null;
            }
            dVar.mo162633a(mmSummary);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesDetail, Event.minutes_load_detail_error, ErrorType.Network, ErrorLevel.Exception, aVar.mo165306a(), "summaries", null, aVar.mo165308c(), false, null, null, null, 6144, null));
        }
    }

    /* renamed from: a */
    public final void mo162633a(MmSummary mmSummary) {
        this.f116563d = mmSummary;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/summary/MmSummaryControl$checkSummary$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.d$b */
    public static final class C46259b extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmSummaryControl f116570a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116571b;

        /* renamed from: a */
        public void mo161289a(String str) {
            boolean z;
            Function1 function1 = this.f116571b;
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f116570a.f116560a;
            C45855f.m181666e(str, "[checkSummary] failed: " + aVar);
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
            Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
            C45858j.m181678a(contextDepend.mo144557a(), ResString.f118656a.mo165504a(R.string.MMWeb_G_OperationFailedTryAgain));
            this.f116571b.invoke(false);
        }

        C46259b(MmSummaryControl dVar, Function1 function1) {
            this.f116570a = dVar;
            this.f116571b = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/summary/MmSummaryControl$getSummaries$2", "Lcom/ss/android/lark/mm/net/callback/IHttpRespCallback;", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary$MmSummaryResp;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", "resp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.d$d */
    public static final class C46261d extends AbstractC47071d<MmSummary.MmSummaryResp> {

        /* renamed from: a */
        final /* synthetic */ MmSummaryControl f116573a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116574b;

        /* renamed from: a */
        public void mo161289a(MmSummary.MmSummaryResp mmSummaryResp) {
            MmSummary mmSummary;
            Function1 function1 = this.f116574b;
            if (mmSummaryResp != null) {
                mmSummary = (MmSummary) mmSummaryResp.data;
            } else {
                mmSummary = null;
            }
            function1.invoke(mmSummary);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f116573a.f116560a;
            C45855f.m181666e(str, "[getSummaries] failed: " + aVar);
            this.f116574b.invoke(null);
        }

        C46261d(MmSummaryControl dVar, Function1 function1) {
            this.f116573a = dVar;
            this.f116574b = function1;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.d$f */
    public static final class C46264f<T> implements Consumer<MmSummary> {

        /* renamed from: a */
        final /* synthetic */ MmSummaryControl f116578a;

        /* renamed from: b */
        final /* synthetic */ MmTranslateLangType f116579b;

        C46264f(MmSummaryControl dVar, MmTranslateLangType mmTranslateLangType) {
            this.f116578a = dVar;
            this.f116579b = mmTranslateLangType;
        }

        /* renamed from: a */
        public final void accept(MmSummary mmSummary) {
            if (this.f116579b == MmTranslateLangType.DEFAULT) {
                this.f116578a.mo162633a(mmSummary);
            }
        }
    }

    /* renamed from: a */
    public final Single<Boolean> mo162630a(boolean z) {
        Single<Boolean> create = Single.create(new C46256a(this, z));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create {\n        …}\n            }\n        }");
        return create;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.d$e */
    public static final class C46262e<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ MmSummaryControl f116575a;

        /* renamed from: b */
        final /* synthetic */ MmTranslateLangType f116576b;

        C46262e(MmSummaryControl dVar, MmTranslateLangType mmTranslateLangType) {
            this.f116575a = dVar;
            this.f116576b = mmTranslateLangType;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<MmSummary> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "it");
            C47057a.m186276b(this.f116575a.f116561b, this.f116575a.f116562c, this.f116576b.getValue(), this.f116575a.mo162636b(), false, (AbstractC47070c) new AbstractC47071d<MmSummary.MmSummaryResp>() {
                /* class com.ss.android.lark.mm.module.detail.summary.MmSummaryControl.C46262e.C462631 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.s */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void mo161289a(MmSummary.MmSummaryResp mmSummaryResp) {
                    if (mmSummaryResp != null) {
                        sVar.onSuccess(mmSummaryResp.data);
                    } else {
                        sVar.onError(new NullPointerException());
                    }
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                    sVar.onError(aVar.mo165309d());
                }
            });
        }
    }

    /* renamed from: a */
    public final Single<MmSummary> mo162629a(MmTranslateLangType mmTranslateLangType) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
        Single create = Single.create(new C46262e(this, mmTranslateLangType));
        MmSummary mmSummary = this.f116563d;
        if (mmSummary == null) {
            mmSummary = new MmSummary();
        }
        Single<MmSummary> doOnSuccess = create.onErrorReturnItem(mmSummary).doOnSuccess(new C46264f(this, mmTranslateLangType));
        Intrinsics.checkExpressionValueIsNotNull(doOnSuccess, "Single.create<MmSummary>…          }\n            }");
        return doOnSuccess;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.d$a */
    public static final class C46256a<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ MmSummaryControl f116566a;

        /* renamed from: b */
        final /* synthetic */ boolean f116567b;

        C46256a(MmSummaryControl dVar, boolean z) {
            this.f116566a = dVar;
            this.f116567b = z;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<Boolean> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "it");
            MmBizTask<MmSummary.MmSummaryResp> b = C47057a.m186268b(this.f116566a.f116561b, this.f116566a.f116562c, MmTranslateLangType.DEFAULT.getValue(), this.f116566a.mo162636b());
            if (!C45865a.m181720c()) {
                sVar.onSuccess(false);
            } else if (this.f116567b) {
                b.mo165337a(new AbstractC47071d<MmSummary.MmSummaryResp>() {
                    /* class com.ss.android.lark.mm.module.detail.summary.MmSummaryControl.C46256a.C462571 */

                    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.s */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                    /* renamed from: a */
                    public void mo161288a(C47068a aVar) {
                        Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                        sVar.onSuccess(false);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.s */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: a */
                    public void mo161289a(MmSummary.MmSummaryResp mmSummaryResp) {
                        int i;
                        MmSummary mmSummary;
                        Integer total;
                        AbstractC69011s sVar = sVar;
                        boolean z = false;
                        if (mmSummaryResp == null || (mmSummary = (MmSummary) mmSummaryResp.data) == null || (total = mmSummary.getTotal()) == null) {
                            i = 0;
                        } else {
                            i = total.intValue();
                        }
                        if (i > 0) {
                            z = true;
                        }
                        sVar.onSuccess(Boolean.valueOf(z));
                    }
                });
            } else {
                b.mo165343c(new AbstractC47071d<MmSummary.MmSummaryResp>() {
                    /* class com.ss.android.lark.mm.module.detail.summary.MmSummaryControl.C46256a.C462582 */

                    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.s */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                    /* renamed from: a */
                    public void mo161288a(C47068a aVar) {
                        Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                        sVar.onSuccess(false);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.s */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: a */
                    public void mo161289a(MmSummary.MmSummaryResp mmSummaryResp) {
                        int i;
                        MmSummary mmSummary;
                        Integer total;
                        AbstractC69011s sVar = sVar;
                        boolean z = false;
                        if (mmSummaryResp == null || (mmSummary = (MmSummary) mmSummaryResp.data) == null || (total = mmSummary.getTotal()) == null) {
                            i = 0;
                        } else {
                            i = total.intValue();
                        }
                        if (i > 0) {
                            z = true;
                        }
                        sVar.onSuccess(Boolean.valueOf(z));
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final String mo162632a(String str) {
        HashMap<String, MmSummaryContent> summaries;
        Intrinsics.checkParameterIsNotNull(str, "contentId");
        MmSummary mmSummary = this.f116563d;
        if (mmSummary == null || (summaries = mmSummary.getSummaries()) == null) {
            return null;
        }
        for (Map.Entry<String, MmSummaryContent> entry : summaries.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), str)) {
                return entry.getValue().getData();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo162634a(String str, Function1<? super MmSummary, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "translateLanguage");
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        C47057a.m186276b(this.f116561b, this.f116562c, MmTranslateLangType.DEFAULT.getValue(), this.f116565f, false, (AbstractC47070c) new C46260c(this));
        C47057a.m186276b(this.f116561b, this.f116562c, str, this.f116565f, false, (AbstractC47070c) new C46261d(this, function1));
    }

    /* renamed from: a */
    public final void mo162635a(String str, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "contentId");
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        C47057a.m186260a(this.f116561b, this.f116562c, str, z, new C46259b(this, function1));
    }

    public MmSummaryControl(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "url");
        Intrinsics.checkParameterIsNotNull(str4, "requestId");
        this.f116561b = str;
        this.f116562c = str2;
        this.f116564e = str3;
        this.f116565f = str4;
    }
}
