package com.ss.android.lark.watermark.mysterious;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.passport.v1.GetHiddenWaterMarkImageRequest;
import com.bytedance.lark.pb.passport.v1.GetHiddenWaterMarkImageResponse;
import com.bytedance.lark.pb.passport.v1.GetWaterMarkConfigRequest;
import com.bytedance.lark.pb.passport.v1.GetWaterMarkConfigResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.watermark.p2928e.AbstractC58277a;
import com.ss.android.lark.watermark.p2929f.C58286a;
import com.ss.android.vc.statistics.p3180a.C63690d;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69013u;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\u0012\b\u0000\u0010\u001d*\f\u0012\u0004\u0012\u0002H\u001d\u0012\u0002\b\u00030\u001e*\b\u0012\u0004\u0012\u0002H\u001d0\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfoService;", "Lcom/ss/android/lark/watermark/service/IWatermarkInfoService;", "()V", "storage", "Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkStorage;", "watermarkInfo", "Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfo;", "getWatermarkInfo", "()Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfo;", "setWatermarkInfo", "(Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfo;)V", "getLocalWatermarkInfo", "Lcom/ss/android/lark/watermark/dto/WatermarkInfo;", "getWatermarkInfoFromNet", "", "callback", "Lcom/ss/android/lark/watermark/service/IWatermarkInfoService$IGetWaterMarkInfoCallback;", "sendHiddenWatermarkImageRequest", "Lio/reactivex/functions/Function;", "Lio/reactivex/SingleSource;", "sendWatermarkConfigRequest", "Lio/reactivex/Single;", "updateMysteriousWatermarkInfo", "hiddenImage", "Lcom/bytedance/lark/pb/passport/v1/GetHiddenWaterMarkImageResponse;", "config", "Lcom/bytedance/lark/pb/passport/v1/GetWaterMarkConfigResponse;", "parserOf", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "T", "Lcom/squareup/wire/Message;", "Ljava/lang/Class;", "Companion", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.mysterious.c */
public final class MysteriousWatermarkInfoService implements AbstractC58277a {

    /* renamed from: b */
    public static final Companion f143315b = new Companion(null);

    /* renamed from: a */
    public final MysteriousWatermarkStorage f143316a = new MysteriousWatermarkStorage();

    /* renamed from: c */
    private MysteriousWatermarkInfo f143317c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfoService$Companion;", "", "()V", "SP_TAG", "", "TAG", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final MysteriousWatermarkInfo mo197398a() {
        return this.f143317c;
    }

    /* renamed from: d */
    private final Function<MysteriousWatermarkInfo, AbstractC69015w<MysteriousWatermarkInfo>> m226041d() {
        return new C58298d(this);
    }

    @Override // com.ss.android.lark.watermark.p2928e.AbstractC58277a
    /* renamed from: b */
    public WatermarkInfo mo197377b() {
        MysteriousWatermarkInfo mysteriousWatermarkInfo = this.f143317c;
        if (mysteriousWatermarkInfo == null) {
            mysteriousWatermarkInfo = this.f143316a.mo197412a();
            this.f143317c = mysteriousWatermarkInfo;
        }
        return mysteriousWatermarkInfo;
    }

    /* renamed from: c */
    private final Single<MysteriousWatermarkInfo> m226040c() {
        Single<MysteriousWatermarkInfo> create = Single.create(new C58301e(this));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create(SingleOnSu…a.parserOf())\n\n        })");
        return create;
    }

    /* renamed from: a */
    public final <T extends Message<T, ?>> SdkSender.IParser<T> mo197397a(Class<T> cls) {
        return new C58297c(cls);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u0002H\u0001\u0012\u0002\b\u00030\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "Lcom/squareup/wire/Message;", "bytes", "", "parse", "([B)Lcom/squareup/wire/Message;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.c$c */
    public static final class C58297c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ Class f143320a;

        C58297c(Class cls) {
            this.f143320a = cls;
        }

        /* renamed from: a */
        public final T parse(byte[] bArr) {
            return (T) ((Message) ProtoAdapter.get(this.f143320a).decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfoService$getWatermarkInfoFromNet$1", "Lio/reactivex/SingleObserver;", "Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfo;", "onError", "", "e", "", "onSubscribe", C63690d.f160779a, "Lio/reactivex/disposables/Disposable;", "onSuccess", "info", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.c$b */
    public static final class C58296b implements AbstractC69012t<MysteriousWatermarkInfo> {

        /* renamed from: a */
        final /* synthetic */ MysteriousWatermarkInfoService f143318a;

        /* renamed from: b */
        final /* synthetic */ AbstractC58277a.AbstractC58278a f143319b;

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
        }

        /* renamed from: a */
        public void onSuccess(MysteriousWatermarkInfo mysteriousWatermarkInfo) {
            Intrinsics.checkParameterIsNotNull(mysteriousWatermarkInfo, "info");
            Log.m165389i("Watermark-MysteriousWatermarkInfoService", "Mysterious watermark onSuccess");
            this.f143318a.f143316a.mo197413a(mysteriousWatermarkInfo);
            AbstractC58277a.AbstractC58278a aVar = this.f143319b;
            if (aVar != null) {
                aVar.mo197242a(mysteriousWatermarkInfo);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            Log.m165384e("Watermark-MysteriousWatermarkInfoService", "Mysterious watermark onError", th);
            MysteriousWatermarkInfo a = this.f143318a.mo197398a();
            if (a != null) {
                this.f143318a.f143316a.mo197413a(a);
                AbstractC58277a.AbstractC58278a aVar = this.f143319b;
                if (aVar != null) {
                    aVar.mo197242a(a);
                    return;
                }
                return;
            }
            AbstractC58277a.AbstractC58278a aVar2 = this.f143319b;
            if (aVar2 != null) {
                aVar2.mo197241a(new C58286a(th.getMessage()));
            }
        }

        C58296b(MysteriousWatermarkInfoService cVar, AbstractC58277a.AbstractC58278a aVar) {
            this.f143318a = cVar;
            this.f143319b = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfo;", "kotlin.jvm.PlatformType", "watermarkInfo", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.c$d */
    public static final class C58298d<T, R> implements Function<MysteriousWatermarkInfo, AbstractC69015w<MysteriousWatermarkInfo>> {

        /* renamed from: a */
        final /* synthetic */ MysteriousWatermarkInfoService f143321a;

        C58298d(MysteriousWatermarkInfoService cVar) {
            this.f143321a = cVar;
        }

        /* renamed from: a */
        public final Single<MysteriousWatermarkInfo> apply(final MysteriousWatermarkInfo mysteriousWatermarkInfo) {
            Intrinsics.checkParameterIsNotNull(mysteriousWatermarkInfo, "watermarkInfo");
            return Single.create(new AbstractC69013u<MysteriousWatermarkInfo>(this) {
                /* class com.ss.android.lark.watermark.mysterious.MysteriousWatermarkInfoService.C58298d.C582991 */

                /* renamed from: a */
                final /* synthetic */ C58298d f143322a;

                {
                    this.f143322a = r1;
                }

                @Override // io.reactivex.AbstractC69013u
                public final void subscribe(final AbstractC69011s<MysteriousWatermarkInfo> sVar) {
                    Intrinsics.checkParameterIsNotNull(sVar, "emitter");
                    if (!mysteriousWatermarkInfo.mo197389b()) {
                        sVar.onSuccess(mysteriousWatermarkInfo);
                        return;
                    }
                    GetHiddenWaterMarkImageRequest.C18723a aVar = new GetHiddenWaterMarkImageRequest.C18723a();
                    aVar.f46272c = 1;
                    aVar.f46270a = Integer.valueOf((int) 4294967055L);
                    aVar.f46271b = GetHiddenWaterMarkImageRequest.ImgSizeOption.ImgSizeOption_SIZE_192_192;
                    SdkSender.asynSendRequestNonWrap(Command.GET_HIDDEN_WATER_MARK_IMAGE, aVar, new IGetDataCallback<GetHiddenWaterMarkImageResponse>(this) {
                        /* class com.ss.android.lark.watermark.mysterious.MysteriousWatermarkInfoService.C58298d.C582991.C583001 */

                        /* renamed from: a */
                        final /* synthetic */ C582991 f143324a;

                        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: io.reactivex.s */
                        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: io.reactivex.s */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* renamed from: a */
                        public void onSuccess(GetHiddenWaterMarkImageResponse getHiddenWaterMarkImageResponse) {
                            if (getHiddenWaterMarkImageResponse != null) {
                                sVar.onSuccess(this.f143324a.f143322a.f143321a.mo197399a(getHiddenWaterMarkImageResponse));
                                return;
                            }
                            Log.m165389i("Watermark-MysteriousWatermarkInfoService", "GET_HIDDEN_WATER_MARK_IMAGE failed, data == null");
                            sVar.onSuccess(mysteriousWatermarkInfo);
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: io.reactivex.s */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            Log.m165389i("Watermark-MysteriousWatermarkInfoService", "GET_HIDDEN_WATER_MARK_IMAGE failed, err = " + errorResult.getDebugMsg());
                            sVar.onSuccess(mysteriousWatermarkInfo);
                        }

                        {
                            this.f143324a = r1;
                        }
                    }, this.f143322a.f143321a.mo197397a(GetHiddenWaterMarkImageResponse.class));
                }
            });
        }
    }

    /* renamed from: a */
    public final MysteriousWatermarkInfo mo197399a(GetHiddenWaterMarkImageResponse getHiddenWaterMarkImageResponse) {
        MysteriousWatermarkInfo mysteriousWatermarkInfo = this.f143317c;
        if (mysteriousWatermarkInfo == null) {
            mysteriousWatermarkInfo = new MysteriousWatermarkInfo();
        }
        mysteriousWatermarkInfo.mo197387a(getHiddenWaterMarkImageResponse.water_mark_url);
        this.f143317c = mysteriousWatermarkInfo;
        return mysteriousWatermarkInfo;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfo;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.c$e */
    public static final class C58301e<T> implements AbstractC69013u<MysteriousWatermarkInfo> {

        /* renamed from: a */
        final /* synthetic */ MysteriousWatermarkInfoService f143326a;

        C58301e(MysteriousWatermarkInfoService cVar) {
            this.f143326a = cVar;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<MysteriousWatermarkInfo> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "emitter");
            SdkSender.asynSendRequestNonWrap(Command.GET_WATER_MARK_CONFIG, new GetWaterMarkConfigRequest.C18733a(), new IGetDataCallback<GetWaterMarkConfigResponse>(this) {
                /* class com.ss.android.lark.watermark.mysterious.MysteriousWatermarkInfoService.C58301e.C583021 */

                /* renamed from: a */
                final /* synthetic */ C58301e f143327a;

                /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.s */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void onSuccess(GetWaterMarkConfigResponse getWaterMarkConfigResponse) {
                    if (getWaterMarkConfigResponse != null) {
                        sVar.onSuccess(this.f143327a.f143326a.mo197400a(getWaterMarkConfigResponse));
                    } else {
                        sVar.onError(new NullResponseException(null, null, 2, null));
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    sVar.onError(new SdkException(errorResult, null, 2, null));
                }

                {
                    this.f143327a = r1;
                }
            }, this.f143326a.mo197397a(GetWaterMarkConfigResponse.class));
        }
    }

    /* renamed from: a */
    public final MysteriousWatermarkInfo mo197400a(GetWaterMarkConfigResponse getWaterMarkConfigResponse) {
        String str;
        MysteriousWatermarkInfo mysteriousWatermarkInfo = this.f143317c;
        if (mysteriousWatermarkInfo == null) {
            mysteriousWatermarkInfo = new MysteriousWatermarkInfo();
        }
        Boolean bool = getWaterMarkConfigResponse.obvious_enabled;
        Intrinsics.checkExpressionValueIsNotNull(bool, "config.obvious_enabled");
        if (bool.booleanValue()) {
            str = getWaterMarkConfigResponse.content;
        } else {
            str = "";
        }
        mysteriousWatermarkInfo.setWatermarkContent(str);
        mysteriousWatermarkInfo.mo197387a((String) null);
        Boolean bool2 = getWaterMarkConfigResponse.hidden_enabled;
        Intrinsics.checkExpressionValueIsNotNull(bool2, "config.hidden_enabled");
        mysteriousWatermarkInfo.mo197388a(bool2.booleanValue());
        this.f143317c = mysteriousWatermarkInfo;
        return mysteriousWatermarkInfo;
    }

    @Override // com.ss.android.lark.watermark.p2928e.AbstractC58277a
    /* renamed from: a */
    public void mo197376a(AbstractC58277a.AbstractC58278a aVar) {
        m226040c().flatMap(m226041d()).subscribe(new C58296b(this, aVar));
    }
}
