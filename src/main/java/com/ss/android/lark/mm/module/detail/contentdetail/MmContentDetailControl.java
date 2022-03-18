package com.ss.android.lark.mm.module.detail.contentdetail;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fJ\u001a\u0010\u0011\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "host", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getToken", "loadParticipants", "", "offset", "", "size", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "loadShareFiles", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$File;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.a.d */
public final class MmContentDetailControl extends MmBaseControl {

    /* renamed from: a */
    private final String f115784a;

    /* renamed from: b */
    private final String f115785b;

    /* renamed from: a */
    public final String mo161353a() {
        return this.f115784a;
    }

    /* renamed from: b */
    public final String mo161356b() {
        return this.f115785b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailControl$loadParticipants$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.d$a */
    public static final class C45928a extends AbstractC47070c<MmParticipants> {

        /* renamed from: a */
        final /* synthetic */ MmContentDetailControl f115786a;

        /* renamed from: b */
        final /* synthetic */ Function1 f115787b;

        /* renamed from: a */
        public void mo161289a(MmParticipants mmParticipants) {
            Intrinsics.checkParameterIsNotNull(mmParticipants, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f115787b.invoke(mmParticipants);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesDetail, Event.minutes_load_detail_error, ErrorType.Network, ErrorLevel.Exception, aVar.mo165306a(), "participants", null, aVar.mo165308c(), false, MapsKt.mapOf(TuplesKt.to("objecttoken", this.f115786a.mo161356b())), null, null, 6144, null));
        }

        C45928a(MmContentDetailControl dVar, Function1 function1) {
            this.f115786a = dVar;
            this.f115787b = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailControl$loadShareFiles$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$File;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.d$b */
    public static final class C45929b extends AbstractC47070c<MmBaseInfo.File> {

        /* renamed from: a */
        final /* synthetic */ MmContentDetailControl f115788a;

        /* renamed from: b */
        final /* synthetic */ Function1 f115789b;

        /* renamed from: a */
        public void mo161289a(MmBaseInfo.File file) {
            Intrinsics.checkParameterIsNotNull(file, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f115789b.invoke(file);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesDetail, Event.minutes_load_detail_error, ErrorType.Network, ErrorLevel.Exception, aVar.mo165306a(), "files", null, aVar.mo165308c(), false, MapsKt.mapOf(TuplesKt.to("objecttoken", this.f115788a.mo161356b())), null, null, 6144, null));
        }

        C45929b(MmContentDetailControl dVar, Function1 function1) {
            this.f115788a = dVar;
            this.f115789b = function1;
        }
    }

    /* renamed from: a */
    public final void mo161355a(Function1<? super MmBaseInfo.File, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        C47057a.m186272b(this.f115784a, this.f115785b, new C45929b(this, function1));
    }

    public MmContentDetailControl(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        this.f115784a = str;
        this.f115785b = str2;
    }

    /* renamed from: a */
    public final void mo161354a(int i, int i2, Function1<? super MmParticipants, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        C47057a.m186246a(this.f115784a, this.f115785b, i, i2, new C45928a(this, function1));
    }
}
