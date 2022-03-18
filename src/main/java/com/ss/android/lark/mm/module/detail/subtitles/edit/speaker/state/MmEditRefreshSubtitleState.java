package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditRefreshSubtitleState;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditState;", "()V", "listener", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditRefreshSubtitleState$IMmEditReqSubtitleStateListener;", "getListener", "()Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditRefreshSubtitleState$IMmEditReqSubtitleStateListener;", "setListener", "(Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditRefreshSubtitleState$IMmEditReqSubtitleStateListener;)V", "onAction", "", "sm", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "stateId", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditState;", "IMmEditReqSubtitleStateListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.g */
public final class MmEditRefreshSubtitleState implements IMmEditState {

    /* renamed from: a */
    private IMmEditReqSubtitleStateListener f116506a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditRefreshSubtitleState$IMmEditReqSubtitleStateListener;", "", "onRefreshSubtitles", "", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "onFailed", "Lkotlin/Function0;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.g$a */
    public interface IMmEditReqSubtitleStateListener {
        /* renamed from: a */
        void mo162455a(Function1<? super MmBaseInfo, Unit> function1, Function0<Unit> function0);
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditState
    /* renamed from: a */
    public MmEditState mo162445a() {
        return MmEditState.REFRESH_DATA;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.g$c */
    static final class C46238c extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmEditStateManager $sm;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46238c(MmEditStateManager hVar) {
            super(0);
            this.$sm = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            MmEditStateManager hVar = this.$sm;
            hVar.mo162461a(hVar.mo162469e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.g$b */
    static final class C46237b extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ MmEditStateManager $sm;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46237b(MmEditStateManager hVar) {
            super(1);
            this.$sm = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
            invoke(mmBaseInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(MmBaseInfo mmBaseInfo) {
            Integer num;
            StringBuilder sb = new StringBuilder();
            sb.append("MmEditRefreshSubtitleStateHandler refresh subtitles success, version: ");
            if (mmBaseInfo != null) {
                num = Integer.valueOf(mmBaseInfo.getObjectVersion());
            } else {
                num = null;
            }
            sb.append(num);
            C45855f.m181664c("MmEditStateManager", sb.toString());
            this.$sm.mo162459a(mmBaseInfo);
            MmEditStateManager hVar = this.$sm;
            hVar.mo162461a(hVar.mo162464b());
        }
    }

    /* renamed from: a */
    public final void mo162454a(IMmEditReqSubtitleStateListener aVar) {
        this.f116506a = aVar;
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
        C45855f.m181664c("MmEditStateManager", "MmEditRefreshSubtitleStateHandler onAction");
        IMmEditReqSubtitleStateListener aVar = this.f116506a;
        if (aVar != null) {
            aVar.mo162455a(new C46237b(hVar), new C46238c(hVar));
        }
    }
}
