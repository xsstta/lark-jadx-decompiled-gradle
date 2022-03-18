package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import com.larksuite.framework.utils.NetworkUtils;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableEditSpeakerTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditInitialState;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditState;", "()V", "latestPollVersion", "", "localVersion", "onAction", "", "sm", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "setVersions", "stateId", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditState;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.f */
public final class MmEditInitialState implements IMmEditState {

    /* renamed from: a */
    private int f116504a = -1;

    /* renamed from: b */
    private int f116505b = -1;

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public MmEditState mo162445a() {
        return MmEditState.INIT;
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
        int i;
        Intrinsics.checkParameterIsNotNull(hVar, "sm");
        C45855f.m181664c("MmEditStateManager", "MmEditInitialState onAction");
        if (!NetworkUtils.m94915b(C45851c.m181646a())) {
            hVar.mo162461a(hVar.mo162469e());
            mo162447b(hVar);
            return;
        }
        int i2 = this.f116504a;
        if (i2 == -1 || (i = this.f116505b) == -1) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
            Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
            if (hostDepend.mo144643k()) {
                throw new IllegalArgumentException("localVersion or latestPollVersion not initialized, please call setVersions function");
            }
            return;
        }
        if (i2 >= i) {
            hVar.mo162461a(hVar.mo162464b());
        } else {
            hVar.mo162461a(hVar.mo162457a());
        }
        MmAppreciableEditSpeakerTracker.f118521a.mo165382b();
    }

    /* renamed from: a */
    public final void mo162453a(int i, int i2) {
        this.f116504a = i;
        this.f116505b = i2;
    }
}
