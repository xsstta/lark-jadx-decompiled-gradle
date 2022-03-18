package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmEditStatusResponse;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmKeepEditResponse;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.p2335a.AbstractC47095a;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JR\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\b0\u000fH\u0002J4\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditingState;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditState;", "()V", "retryTimes", "", "timerExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "exitEditStatus", "", "host", "", "token", "objectVersion", "editSession", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmEditStatusResponse;", "onError", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "keepEdit", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmKeepEditResponse;", "onAction", "sm", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "onExit", "stateId", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditState;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.j */
public final class MmEditingState implements IMmEditState {

    /* renamed from: a */
    public int f116522a = 3;

    /* renamed from: b */
    private C47096b f116523b;

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public MmEditState mo162445a() {
        return MmEditState.EDITING;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditingState$exitEditStatus$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmEditStatusResponse;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.j$a */
    public static final class C46242a extends AbstractC47070c<MmEditStatusResponse> {

        /* renamed from: a */
        final /* synthetic */ MmEditingState f116524a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116525b;

        /* renamed from: c */
        final /* synthetic */ String f116526c;

        /* renamed from: d */
        final /* synthetic */ String f116527d;

        /* renamed from: e */
        final /* synthetic */ String f116528e;

        /* renamed from: f */
        final /* synthetic */ String f116529f;

        /* renamed from: g */
        final /* synthetic */ Function1 f116530g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.j$a$a */
        static final class RunnableC46243a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46242a f116531a;

            RunnableC46243a(C46242a aVar) {
                this.f116531a = aVar;
            }

            public final void run() {
                this.f116531a.f116524a.mo162478a(this.f116531a.f116526c, this.f116531a.f116527d, this.f116531a.f116528e, this.f116531a.f116529f, this.f116531a.f116525b, this.f116531a.f116530g);
            }
        }

        /* renamed from: a */
        public void mo161289a(MmEditStatusResponse mmEditStatusResponse) {
            if (mmEditStatusResponse != null) {
                this.f116525b.invoke(mmEditStatusResponse);
            }
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            if (this.f116524a.f116522a >= 0) {
                MmEditingState jVar = this.f116524a;
                jVar.f116522a--;
                C45859k.m181686a(new RunnableC46243a(this), 1000);
                return;
            }
            this.f116530g.invoke(aVar);
        }

        C46242a(MmEditingState jVar, Function1 function1, String str, String str2, String str3, String str4, Function1 function12) {
            this.f116524a = jVar;
            this.f116525b = function1;
            this.f116526c = str;
            this.f116527d = str2;
            this.f116528e = str3;
            this.f116529f = str4;
            this.f116530g = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditingState$keepEdit$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmKeepEditResponse;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.j$b */
    public static final class C46244b extends AbstractC47070c<MmKeepEditResponse> {

        /* renamed from: a */
        final /* synthetic */ Function1 f116532a;

        C46244b(Function1 function1) {
            this.f116532a = function1;
        }

        /* renamed from: a */
        public void mo161289a(MmKeepEditResponse mmKeepEditResponse) {
            Intrinsics.checkParameterIsNotNull(mmKeepEditResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f116532a.invoke(mmKeepEditResponse);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmEditingStateHandler", "[keepEdit] error: " + aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmEditStatusResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.j$d */
    static final class C46247d extends Lambda implements Function1<MmEditStatusResponse, Unit> {
        public static final C46247d INSTANCE = new C46247d();

        C46247d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmEditStatusResponse mmEditStatusResponse) {
            invoke(mmEditStatusResponse);
            return Unit.INSTANCE;
        }

        public final void invoke(MmEditStatusResponse mmEditStatusResponse) {
            Intrinsics.checkParameterIsNotNull(mmEditStatusResponse, "it");
            C45855f.m181664c("MmEditingStateHandler", "[exitEditStatus] success, denyType: " + mmEditStatusResponse.getDenyType());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.j$e */
    static final class C46248e extends Lambda implements Function1<C47068a, Unit> {
        public static final C46248e INSTANCE = new C46248e();

        C46248e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C47068a aVar) {
            C45855f.m181666e("MmEditingStateHandler", "[exitEditStatus]  failed, " + aVar);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public void mo162446a(MmEditStateManager hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sm");
        C45855f.m181664c("MmEditStateManager", "MmEditingStateHandler onAction");
        this.f116523b = hVar.mo162472h();
        C47096b h = hVar.mo162472h();
        if (h != null) {
            h.mo165473b("keep_edit", HwBuildEx.VersionCodes.CUR_DEVELOPMENT, new C46245c(this, hVar));
        }
        C47096b h2 = hVar.mo162472h();
        if (h2 != null) {
            h2.mo165477c("keep_edit");
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: b */
    public void mo162447b(MmEditStateManager hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sm");
        IMmEditState.C46232a.m183043a(this, hVar);
        C47096b h = hVar.mo162472h();
        if (h != null) {
            h.mo165471a("keep_edit");
        }
        MmBaseInfo f = hVar.mo162470f();
        String i = hVar.mo162473i();
        if (f != null && i != null) {
            C45855f.m181664c("MmEditingStateHandler", "exitEditStatus, token:" + f.getObjectToken());
            String g = hVar.mo162471g();
            String objectToken = f.getObjectToken();
            Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
            mo162478a(g, objectToken, String.valueOf(f.getObjectVersion()), i, C46247d.INSTANCE, C46248e.INSTANCE);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onTimer"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.j$c */
    public static final class C46245c implements AbstractC47095a {

        /* renamed from: a */
        final /* synthetic */ MmEditingState f116533a;

        /* renamed from: b */
        final /* synthetic */ MmEditStateManager f116534b;

        C46245c(MmEditingState jVar, MmEditStateManager hVar) {
            this.f116533a = jVar;
            this.f116534b = hVar;
        }

        @Override // com.ss.android.lark.mm.utils.p2335a.AbstractC47095a
        /* renamed from: a */
        public final void mo161113a(String str, int i) {
            String str2;
            boolean z;
            MmBaseInfo f = this.f116534b.mo162470f();
            if (f != null) {
                str2 = f.getObjectToken();
            } else {
                str2 = null;
            }
            String i2 = this.f116534b.mo162473i();
            String str3 = str2;
            boolean z2 = false;
            if (str3 == null || StringsKt.isBlank(str3)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str4 = i2;
                if (str4 == null || StringsKt.isBlank(str4)) {
                    z2 = true;
                }
                if (!z2) {
                    this.f116533a.mo162479a(this.f116534b.mo162471g(), str2, i2, new Function1<MmKeepEditResponse, Unit>(this) {
                        /* class com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditingState.C46245c.C462461 */
                        final /* synthetic */ C46245c this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(MmKeepEditResponse mmKeepEditResponse) {
                            invoke(mmKeepEditResponse);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(MmKeepEditResponse mmKeepEditResponse) {
                            Intrinsics.checkParameterIsNotNull(mmKeepEditResponse, "it");
                            MmKeepEditResponse.EditStatus fromValue = MmKeepEditResponse.EditStatus.fromValue(mmKeepEditResponse.getExitEdit());
                            if (fromValue != null) {
                                int i = C46249k.f116535a[fromValue.ordinal()];
                                if (i == 1) {
                                    C45855f.m181664c("MmEditingStateHandler", "EditStatus Keep");
                                } else if (i == 2) {
                                    C45855f.m181664c("MmEditingStateHandler", "EditStatus Occupied");
                                    C45858j.m181677a((int) R.string.MMWeb_G_EditOnOtherDeviceQuitEdit_Toast);
                                    this.this$0.f116534b.mo162461a(this.this$0.f116534b.mo162468d());
                                } else if (i == 3) {
                                    C45858j.m181677a((int) R.string.MMWeb_G_NoActionForLongQuitEdit_Toast);
                                    this.this$0.f116534b.mo162461a(this.this$0.f116534b.mo162468d());
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo162479a(String str, String str2, String str3, Function1<? super MmKeepEditResponse, Unit> function1) {
        C47057a.m186294i(str, str2, str3, new C46244b(function1));
    }

    /* renamed from: a */
    public final void mo162478a(String str, String str2, String str3, String str4, Function1<? super MmEditStatusResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        C47057a.m186258a(str, str2, str3, "0", str4, new C46242a(this, function1, str, str2, str3, str4, function12));
    }
}
