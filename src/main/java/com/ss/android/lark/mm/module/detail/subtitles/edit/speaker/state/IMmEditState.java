package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditState;", "", "onAction", "", "sm", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "onExit", "stateId", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditState;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.a */
public interface IMmEditState {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.a$a */
    public static final class C46232a {
        /* renamed from: a */
        public static void m183043a(IMmEditState aVar, MmEditStateManager hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "sm");
        }
    }

    /* renamed from: a */
    MmEditState mo162445a();

    /* renamed from: a */
    void mo162446a(MmEditStateManager hVar);

    /* renamed from: b */
    void mo162447b(MmEditStateManager hVar);
}
