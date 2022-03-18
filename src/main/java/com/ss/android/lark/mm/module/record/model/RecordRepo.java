package com.ss.android.lark.mm.module.record.model;

import android.content.Context;
import android.content.DialogInterface;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
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
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableRecordTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.ResString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J`\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b28\u0010\f\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015J9\u0010\u0016\u001a\u00020\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/module/record/model/RecordRepo;", "", "()V", "TAG", "", "helperLink", "create", "", "context", "Landroid/content/Context;", "isForced", "", "onResult", "Lkotlin/Function2;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "Lkotlin/ParameterName;", "name", "baseInfo", "Lcom/ss/android/lark/mm/module/record/model/Language;", "recordingLan", "onError", "Lkotlin/Function0;", "getRecordingLanguage", "Lkotlin/Function1;", "showNoQuotaDialog", "isAdmin", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.model.b */
public final class RecordRepo {

    /* renamed from: c */
    public static final Companion f118186c = new Companion(null);

    /* renamed from: a */
    public final String f118187a = "RecordRepo";

    /* renamed from: b */
    public String f118188b = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/record/model/RecordRepo$Companion;", "", "()V", "NO_QUOTA_CODE", "", "SUCCESS_CODE", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.model.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.model.b$c */
    public static final class C46958c extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function0 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46958c(Function0 function0) {
            super(0);
            this.$onError = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$onError.invoke();
        }
    }

    public RecordRepo() {
        StringBuilder sb = new StringBuilder();
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        sb.append(domainDepend.mo144618c());
        sb.append("/client/helpdesk/open?id=6626260912531570952&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1616898084%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6888204905589325826%2C%22signature%22%3A%2278b0c5156b727a66d02c9b689ea0785d1a865bb5%22%7D");
        this.f118188b = sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "recordingLan", "Lcom/ss/android/lark/mm/module/record/model/Language;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.model.b$b */
    public static final class C46956b extends Lambda implements Function1<Language, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isForced;
        final /* synthetic */ Function0 $onError;
        final /* synthetic */ Function2 $onResult;
        final /* synthetic */ RecordRepo this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46956b(RecordRepo bVar, boolean z, Context context, Function0 function0, Function2 kVar) {
            super(1);
            this.this$0 = bVar;
            this.$isForced = z;
            this.$context = context;
            this.$onError = function0;
            this.$onResult = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Language language) {
            invoke(language);
            return Unit.INSTANCE;
        }

        public final void invoke(final Language language) {
            Intrinsics.checkParameterIsNotNull(language, "recordingLan");
            C47057a.m186277b(language.getLanguage(), ResString.f118656a.mo165504a(R.string.MMWeb_G_UntitledRecording), this.$isForced, new AbstractC47071d<MmBaseInfo.MmBaseInfoResp>(this) {
                /* class com.ss.android.lark.mm.module.record.model.RecordRepo.C46956b.C469571 */

                /* renamed from: a */
                final /* synthetic */ C46956b f118189a;

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                    String str = this.f118189a.this$0.f118187a;
                    C45855f.m181666e(str, "createAudio error: " + aVar);
                    if (aVar.mo165306a() == 409) {
                        this.f118189a.$onResult.invoke(null, language);
                        return;
                    }
                    this.f118189a.$onError.invoke();
                    AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesRecorder, Event.minutes_create_audio_record_error, ErrorType.Network, ErrorLevel.Exception, aVar.mo165306a(), null, null, aVar.mo165308c(), false, null, null, null, 6144, null));
                }

                /* renamed from: a */
                public void mo161289a(MmBaseInfo.MmBaseInfoResp mmBaseInfoResp) {
                    if (mmBaseInfoResp != null) {
                        MmBaseInfo mmBaseInfo = (MmBaseInfo) mmBaseInfoResp.data;
                        MmAppreciableRecordTracker.TrackDetailInitTime.f118539a.mo165398c();
                        String str = this.f118189a.this$0.f118187a;
                        C45855f.m181664c(str, "create audio code: " + mmBaseInfoResp.code + ", baseInfo: " + mmBaseInfo);
                        int i = mmBaseInfoResp.code;
                        boolean z = true;
                        if (i == 0) {
                            if (mmBaseInfo != null) {
                                mmBaseInfo.setRecordingDevice(true);
                            }
                            if (mmBaseInfo != null) {
                                mmBaseInfo.setOwner(true);
                            }
                            if (mmBaseInfo != null) {
                                mmBaseInfo.setCanModify(true);
                            }
                            if (mmBaseInfo != null) {
                                mmBaseInfo.setObjectType(MmBaseInfo.MMObjectType.RECORDING.value);
                            }
                            this.f118189a.$onResult.invoke(mmBaseInfo, language);
                        } else if (i != 1007) {
                            C45858j.m181677a((int) R.string.MMWeb_G_SomethingWentWrong);
                        } else {
                            RecordRepo bVar = this.f118189a.this$0;
                            Context context = this.f118189a.$context;
                            if (mmBaseInfo == null || !mmBaseInfo.isAdmin()) {
                                z = false;
                            }
                            bVar.mo164883a(context, z);
                            this.f118189a.$onError.invoke();
                        }
                    } else {
                        C45855f.m181666e(this.f118189a.this$0.f118187a, "createAudio error: baseInfo is null");
                        this.f118189a.$onError.invoke();
                    }
                }

                {
                    this.f118189a = r1;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/model/RecordRepo$getRecordingLanguage$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/record/model/MmRecordingLanguage;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.model.b$d */
    public static final class C46959d extends AbstractC47070c<MmRecordingLanguage> {

        /* renamed from: a */
        final /* synthetic */ RecordRepo f118191a;

        /* renamed from: b */
        final /* synthetic */ Function1 f118192b;

        /* renamed from: c */
        final /* synthetic */ Function0 f118193c;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Integer num;
            String str = this.f118191a.f118187a;
            StringBuilder sb = new StringBuilder();
            sb.append("[onError] errorCode=");
            if (aVar != null) {
                num = Integer.valueOf(aVar.mo165306a());
            } else {
                num = null;
            }
            sb.append(num);
            C45855f.m181664c(str, sb.toString());
            this.f118193c.invoke();
        }

        /* renamed from: a */
        public void mo161289a(MmRecordingLanguage mmRecordingLanguage) {
            if (mmRecordingLanguage != null) {
                String str = this.f118191a.f118187a;
                C45855f.m181664c(str, "[getRecordingLanguage] success data :" + mmRecordingLanguage);
                MmRecordingLangSp aVar = MmRecordingLangSp.f118185a;
                String recordingLang = mmRecordingLanguage.getRecordingLang();
                Intrinsics.checkExpressionValueIsNotNull(recordingLang, "data.recordingLang");
                String languageName = mmRecordingLanguage.getLanguageName();
                Intrinsics.checkExpressionValueIsNotNull(languageName, "data.languageName");
                aVar.mo164882a(recordingLang, languageName);
                this.f118192b.invoke(new Language(mmRecordingLanguage.getLanguageName(), mmRecordingLanguage.getRecordingLang()));
                return;
            }
            C45855f.m181664c(this.f118191a.f118187a, "[onError] data is null");
        }

        C46959d(RecordRepo bVar, Function1 function1, Function0 function0) {
            this.f118191a = bVar;
            this.f118192b = function1;
            this.f118193c = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.model.b$e */
    public static final class DialogInterface$OnClickListenerC46960e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC46960e f118194a = new DialogInterface$OnClickListenerC46960e();

        DialogInterface$OnClickListenerC46960e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C47083e.m186427a("vc_minutes_popup_click", C47086i.m186432a().mo165422d("i_see").mo165427i("over_capacity_administrator").mo165423e("none").mo165421c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.model.b$g */
    public static final class DialogInterface$OnClickListenerC46962g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC46962g f118197a = new DialogInterface$OnClickListenerC46962g();

        DialogInterface$OnClickListenerC46962g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C47083e.m186427a("vc_minutes_popup_click", C47086i.m186432a().mo165422d("i_see").mo165427i("over_capacity_user").mo165423e("none").mo165421c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.model.b$f */
    public static final class DialogInterface$OnClickListenerC46961f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordRepo f118195a;

        /* renamed from: b */
        final /* synthetic */ Context f118196b;

        DialogInterface$OnClickListenerC46961f(RecordRepo bVar, Context context) {
            this.f118195a = bVar;
            this.f118196b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C47083e.m186427a("vc_minutes_popup_click", C47086i.m186432a().mo165422d("upgrade_package").mo165427i("over_capacity_administrator").mo165423e("none").mo165421c());
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getBrowserDepend().mo144660a(this.f118196b, this.f118195a.f118188b);
        }
    }

    /* renamed from: a */
    private final void m185933a(Function1<? super Language, Unit> function1, Function0<Unit> function0) {
        Language a = MmRecordingLangSp.f118185a.mo164879a();
        if (a != null) {
            String str = this.f118187a;
            C45855f.m181664c(str, "get recording language from cache, " + a);
            function1.invoke(a);
            return;
        }
        C47057a.m186241a(new C46959d(this, function1, function0));
    }

    /* renamed from: a */
    public final void mo164883a(Context context, boolean z) {
        if (!C47098d.m186535b(context)) {
            return;
        }
        if (z) {
            C47083e.m186427a("vc_minutes_popup_view", C47086i.m186432a().mo165427i("over_capacity_administrator").mo165421c());
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).titleBold(true)).message(R.string.MMWeb_G_InsufficientStorageUpgrade_Toast)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_InsufficientStorageGotIt_Button, DialogInterface$OnClickListenerC46960e.f118194a)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_G_InsufficientStorage_Upgrade_Button).mo90710d(R.color.primary_pri_500).mo90703a(new DialogInterface$OnClickListenerC46961f(this, context)))).show();
            return;
        }
        C47083e.m186427a("vc_minutes_popup_view", C47086i.m186432a().mo165427i("over_capacity_user").mo165421c());
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).titleBold(true)).message(R.string.MMWeb_G_InsufficientStorageContactAdministrator_Toast)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_G_InsufficientStorageGotIt_Button).mo90710d(R.color.primary_pri_500).mo90703a(DialogInterface$OnClickListenerC46962g.f118197a))).show();
    }

    /* renamed from: a */
    public final void mo164884a(Context context, boolean z, Function2<? super MmBaseInfo, ? super Language, Unit> kVar, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(kVar, "onResult");
        Intrinsics.checkParameterIsNotNull(function0, "onError");
        m185933a(new C46956b(this, z, context, function0, kVar), new C46958c(function0));
    }
}
