package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState;
import com.ss.android.lark.mm.p2288b.C45858j;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditErrorState;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditState;", "()V", "onAction", "", "sm", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "stateId", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditState;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.d */
public final class MmEditErrorState implements IMmEditState {
    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public MmEditState mo162445a() {
        return MmEditState.ERROR;
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
        String str;
        Intrinsics.checkParameterIsNotNull(hVar, "sm");
        C45858j.m181677a((int) R.string.MMWeb_G_ConnectionErrorCheckInternet_Toast);
        hVar.mo162461a(hVar.mo162468d());
        AppreciableKit a = AppreciableKit.f73094h.mo103524a();
        Biz biz = Biz.VideoConference;
        Scene scene = Scene.MinutesDetail;
        Event event = Event.minutes_edit_detail_error;
        ErrorType errorType = ErrorType.Network;
        ErrorLevel errorLevel = ErrorLevel.Exception;
        MmBaseInfo f = hVar.mo162470f();
        if (f == null || (str = f.getObjectToken()) == null) {
            str = "";
        }
        a.mo103514a(new ErrorParams(biz, scene, event, errorType, errorLevel, 0, "enterEditSession", null, "noNetwork", false, MapsKt.mapOf(TuplesKt.to("objecttoken", str)), null, null, 6144, null));
    }
}
