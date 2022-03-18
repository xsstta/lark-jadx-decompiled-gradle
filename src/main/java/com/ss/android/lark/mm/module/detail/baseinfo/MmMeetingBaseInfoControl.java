package com.ss.android.lark.mm.module.detail.baseinfo;

import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.share.model.ApplyInfo;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.utils.MmRxThrowable;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.UrlUtil;
import com.ss.android.lark.mm.utils.p2335a.AbstractC47095a;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import io.reactivex.p3457e.C68294a;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class MmMeetingBaseInfoControl extends MmBaseControl {

    /* renamed from: a */
    public Integer f115884a;

    /* renamed from: b */
    public boolean f115885b;

    /* renamed from: c */
    public int f115886c;

    /* renamed from: d */
    private String f115887d;

    /* renamed from: e */
    private String f115888e;

    /* renamed from: f */
    private String f115889f;

    /* renamed from: g */
    private MmBaseInfo f115890g;

    /* renamed from: h */
    private final C68294a<DataError> f115891h;

    /* renamed from: i */
    private final C68294a<PermissionStatus> f115892i;

    /* renamed from: j */
    private final C68294a<MmBaseInfo> f115893j;

    /* renamed from: k */
    private boolean f115894k;

    /* renamed from: l */
    private final String f115895l;

    /* renamed from: m */
    private final boolean f115896m;

    /* renamed from: n */
    private final C47096b f115897n;

    public enum DataError {
        None,
        Deleted,
        NoAuth,
        Failed,
        Processing,
        Empty
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$a */
    public static final class C45986a extends AbstractC47070c<String> {
        C45986a() {
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmBaseInfoControl", "applyAction error: " + aVar);
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
            Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
            C45858j.m181678a(contextDepend.mo144557a(), ResString.f118656a.mo165504a(R.string.MMWeb_G_RequestSentShort));
        }
    }

    /* renamed from: a */
    public final String mo161572a() {
        return this.f115888e;
    }

    /* renamed from: b */
    public final MmBaseInfo mo161581b() {
        return this.f115890g;
    }

    /* renamed from: c */
    public final C68294a<DataError> mo161584c() {
        return this.f115891h;
    }

    /* renamed from: d */
    public final C68294a<PermissionStatus> mo161586d() {
        return this.f115892i;
    }

    /* renamed from: e */
    public final C68294a<MmBaseInfo> mo161587e() {
        return this.f115893j;
    }

    /* renamed from: f */
    public final int mo161588f() {
        return this.f115886c;
    }

    /* renamed from: h */
    public final boolean mo161590h() {
        return this.f115885b;
    }

    /* renamed from: a */
    public final void mo161578a(Function1<? super MmBaseInfo, Unit> function1, Function1<? super C47068a, Unit> function12, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        C45990e eVar = new C45990e(this, function1, function12, z2);
        if (z) {
            C47057a.m186238a(this.f115887d, this.f115888e, this.f115895l).mo165343c(eVar);
        } else {
            C47057a.m186238a(this.f115887d, this.f115888e, this.f115895l).mo165337a(eVar);
        }
    }

    /* renamed from: a */
    public final boolean mo161580a(Integer num, Integer num2, boolean z) {
        C45855f.m181663b("MmBaseInfoControl", "objectStatus: " + num + ", reviewStatus: " + num2 + ", isOwner: " + z);
        if (num == null) {
            this.f115891h.onNext(DataError.Failed);
            return false;
        }
        if (num.intValue() == ObjectStatus.Deleted.getValue()) {
            C45855f.m181663b("MmBaseInfoControl", "objectStatus: Deleted");
            this.f115891h.onNext(DataError.Deleted);
            return false;
        }
        if (num.intValue() != ObjectStatus.WaitASR.getValue() && num.intValue() != ObjectStatus.Complete.getValue()) {
            if (ObjectStatus.Companion.mo161608c(num)) {
                C45855f.m181663b("MmBaseInfoControl", "isRecording");
            } else {
                MmBaseInfo mmBaseInfo = this.f115890g;
                if (mmBaseInfo == null || !mmBaseInfo.isRecordingObjectType() || !ObjectStatus.Companion.mo161607b(num)) {
                    if (ObjectStatus.Companion.mo161607b(num)) {
                        C45855f.m181663b("MmBaseInfoControl", "processing, status: " + num);
                        this.f115891h.onNext(DataError.Processing);
                        return false;
                    }
                    C45855f.m181663b("MmBaseInfoControl", "Failed");
                    this.f115891h.onNext(DataError.Failed);
                    return false;
                }
            }
            return true;
        } else if (num2 == null || num2.intValue() == ReviewStatus.Passed.getValue() || z) {
            C45855f.m181663b("MmBaseInfoControl", "None");
            this.f115891h.onNext(DataError.None);
            return true;
        } else {
            C45855f.m181663b("MmBaseInfoControl", "NoAuth");
            this.f115891h.onNext(DataError.NoAuth);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo161579a(Integer num, Integer num2) {
        Set a = am.m265689a((Object[]) new Integer[]{Integer.valueOf(ObjectStatus.WaitASR.getValue()), Integer.valueOf(ObjectStatus.Complete.getValue())});
        if (!CollectionsKt.contains(a, num) || !CollectionsKt.contains(a, num2)) {
            return !Intrinsics.areEqual(num2, num);
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo161589g() {
        MmBaseInfo mmBaseInfo = this.f115890g;
        if (mmBaseInfo != null) {
            return mmBaseInfo.isOwner();
        }
        return false;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: k */
    public void mo161235k() {
        super.mo161235k();
        C47096b bVar = this.f115897n;
        if (bVar != null) {
            bVar.mo165471a("pollStatus");
        }
    }

    /* renamed from: i */
    public final Single<MmBaseInfo> mo161591i() {
        Single<MmBaseInfo> create = Single.create(new C45991f(this));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create { emitter …       }, true)\n        }");
        return create;
    }

    /* renamed from: l */
    public final void mo161593l() {
        this.f115892i.onNext(new PermissionStatus(null, null, null, null, null, null, true, 63, null));
    }

    /* renamed from: j */
    public final void mo161592j() {
        if (this.f115896m && !this.f115894k) {
            this.f115894k = true;
            C47096b bVar = this.f115897n;
            if (bVar != null) {
                bVar.mo165468a("pollStatus", HwBuildEx.VersionCodes.CUR_DEVELOPMENT, new C45999j(this));
            }
            C47096b bVar2 = this.f115897n;
            if (bVar2 != null) {
                bVar2.mo165477c("pollStatus");
            }
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$b */
    public static final class C45987b extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f115898a;

        C45987b(Function1 function1) {
            this.f115898a = function1;
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmBaseInfoControl", "applyInfo error: " + aVar);
            this.f115898a.invoke(null);
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            try {
                this.f115898a.invoke((ApplyInfo) new Gson().fromJson(str, ApplyInfo.class));
            } catch (Exception unused) {
                C45855f.m181666e("MmBaseInfoControl", "applyInfo failed");
                this.f115898a.invoke(null);
            }
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$i */
    public static final class C45998i extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f115914a;

        C45998i(Function1 function1) {
            this.f115914a = function1;
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            this.f115914a.invoke(false);
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f115914a.invoke(true);
        }
    }

    /* renamed from: a */
    public final void mo161573a(MmBaseInfo mmBaseInfo) {
        this.f115890g = mmBaseInfo;
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$c */
    public static final class C45988c extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingBaseInfoControl f115899a;

        /* renamed from: b */
        final /* synthetic */ String f115900b;

        /* renamed from: c */
        final /* synthetic */ Function0 f115901c;

        /* renamed from: a */
        public void mo161289a(String str) {
            MmBaseInfo b = this.f115899a.mo161581b();
            if (b != null) {
                b.setTopic(this.f115900b);
            }
            this.f115901c.invoke();
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            C45855f.m181666e("MmBaseInfoControl", "[changeTitle] failed: " + aVar);
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesDetail, Event.minutes_edit_detail_error, ErrorType.Network, ErrorLevel.Exception, aVar.mo165306a(), "rename", null, aVar.mo165308c(), false, MapsKt.mapOf(TuplesKt.to("objecttoken", this.f115899a.mo161572a())), null, null, 6144, null));
        }

        C45988c(MmMeetingBaseInfoControl mmMeetingBaseInfoControl, String str, Function0 function0) {
            this.f115899a = mmMeetingBaseInfoControl;
            this.f115900b = str;
            this.f115901c = function0;
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$e */
    public static final class C45990e extends AbstractC47071d<MmBaseInfo.MmBaseInfoResp> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingBaseInfoControl f115904a;

        /* renamed from: b */
        final /* synthetic */ Function1 f115905b;

        /* renamed from: c */
        final /* synthetic */ Function1 f115906c;

        /* renamed from: d */
        final /* synthetic */ boolean f115907d;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Function1 function1 = this.f115906c;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(aVar);
            }
            this.f115904a.mo161574a(aVar, this.f115907d);
            this.f115904a.mo161592j();
        }

        /* renamed from: a */
        public void mo161289a(MmBaseInfo.MmBaseInfoResp mmBaseInfoResp) {
            Intrinsics.checkParameterIsNotNull(mmBaseInfoResp, "resp");
            MmBaseInfo mmBaseInfo = (MmBaseInfo) mmBaseInfoResp.data;
            this.f115904a.mo161573a(mmBaseInfo);
            this.f115904a.mo161587e().onNext(mmBaseInfo);
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = this.f115904a;
            Intrinsics.checkExpressionValueIsNotNull(mmBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            boolean a = mmMeetingBaseInfoControl.mo161580a(Integer.valueOf(mmBaseInfo.getObjectStatus()), Integer.valueOf(mmBaseInfo.getReviewStatus()), this.f115904a.mo161589g());
            this.f115904a.f115885b = a;
            if (a) {
                this.f115904a.f115884a = Integer.valueOf(mmBaseInfo.getReviewStatus());
                this.f115905b.invoke(mmBaseInfo);
            } else {
                Function1 function1 = this.f115906c;
                if (function1 != null) {
                    Unit unit = (Unit) function1.invoke(C47068a.f118469d);
                }
            }
            this.f115904a.mo161592j();
        }

        C45990e(MmMeetingBaseInfoControl mmMeetingBaseInfoControl, Function1 function1, Function1 function12, boolean z) {
            this.f115904a = mmMeetingBaseInfoControl;
            this.f115905b = function1;
            this.f115906c = function12;
            this.f115907d = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$f */
    public static final class C45991f<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingBaseInfoControl f115908a;

        C45991f(MmMeetingBaseInfoControl mmMeetingBaseInfoControl) {
            this.f115908a = mmMeetingBaseInfoControl;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<MmBaseInfo> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "emitter");
            MmMeetingBaseInfoControl.m182198a(this.f115908a, new Function1<MmBaseInfo, Unit>() {
                /* class com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl.C45991f.C459921 */

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
                    invoke(mmBaseInfo);
                    return Unit.INSTANCE;
                }

                public final void invoke(MmBaseInfo mmBaseInfo) {
                    Intrinsics.checkParameterIsNotNull(mmBaseInfo, "it");
                    sVar.onSuccess(mmBaseInfo);
                }
            }, new Function1<C47068a, Unit>() {
                /* class com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl.C45991f.C459932 */

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
                    invoke(aVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(C47068a aVar) {
                    MmRxThrowable mmRxThrowable;
                    MmRxThrowable d;
                    AbstractC69011s sVar = sVar;
                    Intrinsics.checkExpressionValueIsNotNull(sVar, "emitter");
                    if (!sVar.isDisposed()) {
                        AbstractC69011s sVar2 = sVar;
                        if (aVar == null || (d = aVar.mo165309d()) == null) {
                            mmRxThrowable = new Throwable("loadBaseInfoForStartUp error");
                        } else {
                            mmRxThrowable = d;
                        }
                        sVar2.onError(mmRxThrowable);
                    }
                }
            }, true, false, 8, null);
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$g */
    public static final class C45994g<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingBaseInfoControl f115909a;

        /* renamed from: b */
        final /* synthetic */ boolean f115910b;

        C45994g(MmMeetingBaseInfoControl mmMeetingBaseInfoControl, boolean z) {
            this.f115909a = mmMeetingBaseInfoControl;
            this.f115910b = z;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<MmBaseInfo> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "emitter");
            MmMeetingBaseInfoControl.m182198a(this.f115909a, new Function1<MmBaseInfo, Unit>() {
                /* class com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl.C45994g.C459951 */

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
                    invoke(mmBaseInfo);
                    return Unit.INSTANCE;
                }

                public final void invoke(MmBaseInfo mmBaseInfo) {
                    Intrinsics.checkParameterIsNotNull(mmBaseInfo, "it");
                    sVar.onSuccess(mmBaseInfo);
                }
            }, new Function1<C47068a, Unit>() {
                /* class com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl.C45994g.C459962 */

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
                    invoke(aVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(C47068a aVar) {
                    MmRxThrowable mmRxThrowable;
                    MmRxThrowable d;
                    AbstractC69011s sVar = sVar;
                    if (aVar == null || (d = aVar.mo165309d()) == null) {
                        mmRxThrowable = new Throwable("loadBaseInfoRx error");
                    } else {
                        mmRxThrowable = d;
                    }
                    sVar.onError(mmRxThrowable);
                }
            }, false, this.f115910b, 4, null);
        }
    }

    /* renamed from: b */
    public final void mo161582b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "remark");
        C47057a.m186281c(this.f115887d, this.f115888e, str, new C45986a());
    }

    /* renamed from: c */
    public final void mo161585c(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onData");
        C47057a.m186289g(this.f115887d, this.f115888e, new C45998i(function1));
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$d */
    public static final class C45989d extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingBaseInfoControl f115902a;

        /* renamed from: b */
        final /* synthetic */ Function1 f115903b;

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f115902a.mo161586d().onNext(new PermissionStatus(Integer.valueOf(ObjectStatus.Deleted.getValue()), null, null, null, null, null, false, SmActions.ACTION_RINGING_EXIT, null));
            this.f115903b.invoke("");
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Integer num;
            String str;
            C45855f.m181666e("MmBaseInfoControl", "delete error: " + aVar);
            if (aVar != null) {
                num = Integer.valueOf(aVar.mo165306a());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 403) {
                str = ResString.f118656a.mo165504a(R.string.MMWeb_G_NoPermissionToDelete);
            } else if (num != null && num.intValue() == 410) {
                str = ResString.f118656a.mo165504a(R.string.MMWeb_G_DeletedByOwner);
            } else {
                str = ResString.f118656a.mo165504a(R.string.MMWeb_G_SomethingWentWrong);
            }
            this.f115903b.invoke(str);
        }

        C45989d(MmMeetingBaseInfoControl mmMeetingBaseInfoControl, Function1 function1) {
            this.f115902a = mmMeetingBaseInfoControl;
            this.f115903b = function1;
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$h */
    public static final class C45997h extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmMeetingBaseInfoControl f115911a;

        /* renamed from: b */
        final /* synthetic */ Function1 f115912b;

        /* renamed from: c */
        final /* synthetic */ Function1 f115913c;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmBaseInfoControl", "pollStatus error: " + aVar);
            Function1 function1 = this.f115913c;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(aVar);
            }
            this.f115911a.mo161574a(aVar, true);
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            Integer num;
            int i;
            boolean z;
            try {
                PermissionStatus permissionStatus = (PermissionStatus) new Gson().fromJson(str, PermissionStatus.class);
                if (permissionStatus != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("lastStatus: ");
                    MmBaseInfo b = this.f115911a.mo161581b();
                    Integer num2 = null;
                    if (b != null) {
                        num = Integer.valueOf(b.getObjectStatus());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(", currentStatus: ");
                    sb.append(permissionStatus.getObjectStatus());
                    sb.append(", objectVersion: ");
                    sb.append(permissionStatus.getObjectVersion());
                    C45855f.m181664c("MmBaseInfoControl", sb.toString());
                    MmMeetingBaseInfoControl mmMeetingBaseInfoControl = this.f115911a;
                    Integer objectVersion = permissionStatus.getObjectVersion();
                    if (objectVersion != null) {
                        i = objectVersion.intValue();
                    } else {
                        i = -1;
                    }
                    mmMeetingBaseInfoControl.f115886c = i;
                    MmBaseInfo b2 = this.f115911a.mo161581b();
                    if (b2 != null) {
                        Boolean canComment = permissionStatus.getCanComment();
                        if (canComment != null) {
                            z = canComment.booleanValue();
                        } else {
                            z = false;
                        }
                        b2.setCanComment(z);
                    }
                    this.f115911a.mo161586d().onNext(permissionStatus);
                    MmMeetingBaseInfoControl mmMeetingBaseInfoControl2 = this.f115911a;
                    Integer objectStatus = permissionStatus.getObjectStatus();
                    MmBaseInfo b3 = this.f115911a.mo161581b();
                    if (b3 != null) {
                        num2 = Integer.valueOf(b3.getObjectStatus());
                    }
                    if (mmMeetingBaseInfoControl2.mo161579a(objectStatus, num2) || (!Intrinsics.areEqual(this.f115911a.f115884a, permissionStatus.getReviewStatus()))) {
                        this.f115911a.f115884a = permissionStatus.getReviewStatus();
                        this.f115911a.f115885b = this.f115911a.mo161580a(permissionStatus.getObjectStatus(), this.f115911a.f115884a, this.f115911a.mo161589g());
                    }
                    Integer objectStatus2 = permissionStatus.getObjectStatus();
                    if (objectStatus2 != null) {
                        int intValue = objectStatus2.intValue();
                        MmBaseInfo b4 = this.f115911a.mo161581b();
                        if (b4 != null) {
                            b4.setObjectStatus(intValue);
                        }
                    }
                    Integer reviewStatus = permissionStatus.getReviewStatus();
                    if (reviewStatus != null) {
                        int intValue2 = reviewStatus.intValue();
                        MmBaseInfo b5 = this.f115911a.mo161581b();
                        if (b5 != null) {
                            b5.setReviewStatus(intValue2);
                        }
                    }
                    Function1 function1 = this.f115912b;
                    if (function1 != null) {
                        Unit unit = (Unit) function1.invoke(permissionStatus);
                    }
                }
            } catch (Exception unused) {
                C45855f.m181666e("MmBaseInfoControl", "pollStatus failed");
            }
        }

        C45997h(MmMeetingBaseInfoControl mmMeetingBaseInfoControl, Function1 function1, Function1 function12) {
            this.f115911a = mmMeetingBaseInfoControl;
            this.f115912b = function1;
            this.f115913c = function12;
        }
    }

    /* renamed from: b */
    public final void mo161583b(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onResponse");
        C47057a.m186265a(this.f115887d, this.f115888e, false, (AbstractC47070c) new C45989d(this, function1));
    }

    /* renamed from: a */
    public final Single<MmBaseInfo> mo161571a(boolean z) {
        Single<MmBaseInfo> create = Single.create(new C45994g(this, z));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create { emitter …reUnknownError)\n        }");
        return create;
    }

    /* renamed from: a */
    public final void mo161575a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.f115889f = str;
        this.f115887d = UrlUtil.f118671a.mo165518b(this.f115889f);
        this.f115888e = UrlUtil.f118671a.mo165517a(this.f115889f);
    }

    /* renamed from: a */
    public final void mo161577a(Function1<? super ApplyInfo, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onData");
        C47057a.m186280c(this.f115887d, this.f115888e, new C45987b(function1));
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl$j */
    public static final class C45999j implements AbstractC47095a {

        /* renamed from: a */
        final /* synthetic */ MmMeetingBaseInfoControl f115915a;

        C45999j(MmMeetingBaseInfoControl mmMeetingBaseInfoControl) {
            this.f115915a = mmMeetingBaseInfoControl;
        }

        @Override // com.ss.android.lark.mm.utils.p2335a.AbstractC47095a
        /* renamed from: a */
        public final void mo161113a(String str, int i) {
            MmMeetingBaseInfoControl.m182197a(this.f115915a, null, null, 3, null);
        }
    }

    /* renamed from: a */
    private final void m182199a(Function1<? super PermissionStatus, Unit> function1, Function1<? super C47068a, Unit> function12) {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
        Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
        if (!lifecycleDependency.mo144571b()) {
            C45855f.m181664c("MmBaseInfoControl", "[pollStatus] return, because app is in background");
        } else {
            C47057a.m186236a(this.f115887d, this.f115888e).mo165337a(new C45997h(this, function1, function12));
        }
    }

    /* renamed from: a */
    public final void mo161574a(C47068a aVar, boolean z) {
        Integer num;
        if (aVar != null) {
            num = Integer.valueOf(aVar.mo165306a());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 403) {
            this.f115884a = Integer.valueOf(ReviewStatus.NoAuth.getValue());
            this.f115891h.onNext(DataError.NoAuth);
            this.f115892i.onNext(new PermissionStatus(null, Integer.valueOf(ReviewStatus.NoAuth.getValue()), null, null, null, null, false, SmActions.ACTION_RINGING_ENTRY, null));
        } else if ((num != null && num.intValue() == 404) || (num != null && num.intValue() == 410)) {
            this.f115891h.onNext(DataError.Deleted);
            this.f115892i.onNext(new PermissionStatus(Integer.valueOf(ObjectStatus.Deleted.getValue()), null, null, null, null, null, false, SmActions.ACTION_RINGING_EXIT, null));
        } else if (!z) {
            this.f115891h.onNext(DataError.Failed);
        }
    }

    /* renamed from: a */
    public final void mo161576a(String str, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(function0, "onSuccess");
        C47057a.m186291h(this.f115888e, str, new C45988c(this, str, function0));
    }

    /* renamed from: a */
    public static /* synthetic */ Single m182196a(MmMeetingBaseInfoControl mmMeetingBaseInfoControl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return mmMeetingBaseInfoControl.mo161571a(z);
    }

    public MmMeetingBaseInfoControl(String str, String str2, boolean z, C47096b bVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "requestId");
        this.f115895l = str2;
        this.f115896m = z;
        this.f115897n = bVar;
        this.f115887d = UrlUtil.f118671a.mo165518b(str);
        this.f115888e = UrlUtil.f118671a.mo165517a(str);
        this.f115889f = str;
        C68294a<DataError> a = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BehaviorSubject.create<DataError>()");
        this.f115891h = a;
        C68294a<PermissionStatus> a2 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "BehaviorSubject.create<PermissionStatus>()");
        this.f115892i = a2;
        C68294a<MmBaseInfo> a3 = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "BehaviorSubject.create<MmBaseInfo>()");
        this.f115893j = a3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m182197a(MmMeetingBaseInfoControl mmMeetingBaseInfoControl, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        mmMeetingBaseInfoControl.m182199a(function1, function12);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmMeetingBaseInfoControl(String str, String str2, boolean z, C47096b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m182198a(MmMeetingBaseInfoControl mmMeetingBaseInfoControl, Function1 function1, Function1 function12, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        mmMeetingBaseInfoControl.mo161578a(function1, function12, z, z2);
    }
}
