package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditIdleState;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditState;", "()V", "onAction", "", "sm", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "stateId", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditState;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.e */
public final class MmEditIdleState implements IMmEditState {
    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public MmEditState mo162445a() {
        return MmEditState.IDLE;
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public void mo162446a(MmEditStateManager hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sm");
        C45855f.m181664c("MmEditStateManager", "[MmEditIdleState] onAction");
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: b */
    public void mo162447b(MmEditStateManager hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sm");
        IMmEditState.C46232a.m183043a(this, hVar);
    }
}
