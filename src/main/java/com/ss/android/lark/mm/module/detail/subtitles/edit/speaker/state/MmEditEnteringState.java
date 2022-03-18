package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmEditStatusResponse;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.utils.UIHelper;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JJ\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t0\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditEnteringState;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditState;", "()V", "<set-?>", "", "editSession", "getEditSession", "()Ljava/lang/String;", "enterEditStatus", "", "host", "token", "objectVersion", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmEditStatusResponse;", "onError", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onAction", "sm", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "stateId", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditState;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.c */
public final class MmEditEnteringState implements IMmEditState {

    /* renamed from: a */
    private String f116500a;

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public MmEditState mo162445a() {
        return MmEditState.ENTERING;
    }

    /* renamed from: b */
    public final String mo162448b() {
        return this.f116500a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditEnteringState$enterEditStatus$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmEditStatusResponse;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.c$a */
    public static final class C46233a extends AbstractC47070c<MmEditStatusResponse> {

        /* renamed from: a */
        final /* synthetic */ Function1 f116501a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116502b;

        /* renamed from: a */
        public void mo161289a(MmEditStatusResponse mmEditStatusResponse) {
            if (mmEditStatusResponse != null) {
                this.f116501a.invoke(mmEditStatusResponse);
            }
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            this.f116502b.invoke(aVar);
        }

        C46233a(Function1 function1, Function1 function12) {
            this.f116501a = function1;
            this.f116502b = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmEditStatusResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.c$b */
    static final class C46234b extends Lambda implements Function1<MmEditStatusResponse, Unit> {
        final /* synthetic */ MmEditStateManager $sm;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46234b(MmEditStateManager hVar) {
            super(1);
            this.$sm = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmEditStatusResponse mmEditStatusResponse) {
            invoke(mmEditStatusResponse);
            return Unit.INSTANCE;
        }

        public final void invoke(final MmEditStatusResponse mmEditStatusResponse) {
            Intrinsics.checkParameterIsNotNull(mmEditStatusResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String denyType = mmEditStatusResponse.getDenyType();
            if (Intrinsics.areEqual(denyType, MmEditStatusResponse.EditDenyType.SUCCEED.value)) {
                C45855f.m181664c("MmEditStateManager", "[enterEditStatus] enter edit mode succeed");
                MmEditStateManager hVar = this.$sm;
                hVar.mo162461a(hVar.mo162467c());
            } else if (Intrinsics.areEqual(denyType, MmEditStatusResponse.EditDenyType.USED_BY_OTHERS.value)) {
                C45855f.m181664c("MmEditStateManager", "[enterEditStatus] enter edit mode failed, due of occupied by other users");
                C45859k.m181685a(new Runnable() {
                    /* class com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditEnteringState.C46234b.RunnableC462351 */

                    public final void run() {
                        C45858j.m181680b(UIHelper.mustacheFormat((int) R.string.MMWeb_G_NameEditing, "name", mmEditStatusResponse.getEditorName()));
                    }
                });
                MmEditStateManager hVar2 = this.$sm;
                hVar2.mo162461a(hVar2.mo162468d());
            } else if (Intrinsics.areEqual(denyType, MmEditStatusResponse.EditDenyType.LOWER_VERSION.value)) {
                C45855f.m181664c("MmEditStateManager", "[enterEditStatus] enter edit mode failed, lower version");
                MmEditStateManager hVar3 = this.$sm;
                hVar3.mo162461a(hVar3.mo162457a());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.c$c */
    static final class C46236c extends Lambda implements Function1<C47068a, Unit> {
        final /* synthetic */ MmEditStateManager $sm;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46236c(MmEditStateManager hVar) {
            super(1);
            this.$sm = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C47068a aVar) {
            C45855f.m181666e("MmEditStateManager", "[enterEditStatus] enter edit mode failed, " + aVar);
            MmEditStateManager hVar = this.$sm;
            hVar.mo162461a(hVar.mo162469e());
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: b */
    public void mo162447b(MmEditStateManager hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sm");
        IMmEditState.C46232a.m183043a(this, hVar);
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public void mo162446a(MmEditStateManager hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sm");
        C45855f.m181664c("MmEditStateManager", "MmEditEnteringStateHandler onAction");
        MmBaseInfo f = hVar.mo162470f();
        if (f == null) {
            hVar.mo162461a(hVar.mo162469e());
            return;
        }
        String g = hVar.mo162471g();
        String objectToken = f.getObjectToken();
        Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
        m183049a(g, objectToken, String.valueOf(f.getObjectVersion()), new C46234b(hVar), new C46236c(hVar));
    }

    /* renamed from: a */
    private final void m183049a(String str, String str2, String str3, Function1<? super MmEditStatusResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
        String uuid = UUID.randomUUID().toString();
        this.f116500a = uuid;
        C47057a.m186258a(str, str2, str3, "1", uuid, new C46233a(function1, function12));
    }
}
