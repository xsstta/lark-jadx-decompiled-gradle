package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditRefreshSubtitleState;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableEditSpeakerTracker;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020#J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020%H\u0002J\u0006\u00106\u001a\u000201J\u0006\u00107\u001a\u000201J\b\u00108\u001a\u0004\u0018\u00010\u0016J,\u00109\u001a\u0002012\u0014\u0010:\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002010;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002010=H\u0016J\u0010\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020@H\u0002J\u000e\u0010A\u001a\u0002012\u0006\u00102\u001a\u00020#J&\u0010B\u001a\u0002012\u0006\u0010C\u001a\u00020D2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+J\u000e\u0010E\u001a\u0002012\u0006\u00105\u001a\u00020%JH\u0010F\u001a\u0002012\u0006\u00105\u001a\u00020%26\u0010G\u001a2\u0012\u0013\u0012\u00110@¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(K\u0012\u0013\u0012\u00110@¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(?\u0012\u0004\u0012\u0002010HH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006L"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditRefreshSubtitleState$IMmEditReqSubtitleStateListener;", "()V", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getBaseInfo$mm_release", "()Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "setBaseInfo$mm_release", "(Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;)V", "editingState", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditingState;", "getEditingState$mm_release", "()Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditingState;", "enteringState", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditEnteringState;", "getEnteringState$mm_release", "()Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditEnteringState;", "errorState", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditErrorState;", "getErrorState$mm_release", "()Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditErrorState;", "host", "", "getHost$mm_release", "()Ljava/lang/String;", "setHost$mm_release", "(Ljava/lang/String;)V", "idleState", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditIdleState;", "getIdleState$mm_release", "()Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditIdleState;", "initState", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditInitialState;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditStateListener;", "mState", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditState;", "reqSubtitlesState", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditRefreshSubtitleState;", "getReqSubtitlesState$mm_release", "()Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditRefreshSubtitleState;", "timerExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getTimerExecutor$mm_release", "()Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "setTimerExecutor$mm_release", "(Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;)V", "addListener", "", "listener", "checkState", "", "state", "clear", "exit", "getEditSession", "onRefreshSubtitles", "onSuccess", "Lkotlin/Function1;", "onFailed", "Lkotlin/Function0;", "processStateChange", "curState", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditState;", "removeListener", "start", "latestPollVersion", "", "transformState", "transitionTo", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "preState", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.h */
public final class MmEditStateManager implements MmEditRefreshSubtitleState.IMmEditReqSubtitleStateListener {

    /* renamed from: a */
    public IMmEditState f116507a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<IMmEditStateListener> f116508b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final MmEditInitialState f116509c = new MmEditInitialState();

    /* renamed from: d */
    private final MmEditRefreshSubtitleState f116510d;

    /* renamed from: e */
    private final MmEditEnteringState f116511e;

    /* renamed from: f */
    private final MmEditingState f116512f;

    /* renamed from: g */
    private final MmEditIdleState f116513g;

    /* renamed from: h */
    private final MmEditErrorState f116514h;

    /* renamed from: i */
    private MmBaseInfo f116515i;

    /* renamed from: j */
    private String f116516j;

    /* renamed from: k */
    private C47096b f116517k;

    /* renamed from: a */
    public final MmEditRefreshSubtitleState mo162457a() {
        return this.f116510d;
    }

    /* renamed from: b */
    public final MmEditEnteringState mo162464b() {
        return this.f116511e;
    }

    /* renamed from: c */
    public final MmEditingState mo162467c() {
        return this.f116512f;
    }

    /* renamed from: d */
    public final MmEditIdleState mo162468d() {
        return this.f116513g;
    }

    /* renamed from: e */
    public final MmEditErrorState mo162469e() {
        return this.f116514h;
    }

    /* renamed from: f */
    public final MmBaseInfo mo162470f() {
        return this.f116515i;
    }

    /* renamed from: g */
    public final String mo162471g() {
        return this.f116516j;
    }

    /* renamed from: h */
    public final C47096b mo162472h() {
        return this.f116517k;
    }

    /* renamed from: i */
    public final String mo162473i() {
        return this.f116511e.mo162448b();
    }

    /* renamed from: j */
    public final void mo162474j() {
        C45855f.m181664c("MmEditStateManager", "exit");
        mo162461a(this.f116513g);
    }

    /* renamed from: k */
    public final void mo162475k() {
        C45855f.m181664c("MmEditStateManager", "clear");
        mo162474j();
        this.f116508b.clear();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.h$a */
    public static final class RunnableC46239a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmEditStateManager f116518a;

        /* renamed from: b */
        final /* synthetic */ IMmEditState f116519b;

        RunnableC46239a(MmEditStateManager hVar, IMmEditState aVar) {
            this.f116518a = hVar;
            this.f116519b = aVar;
        }

        public final void run() {
            C45855f.m181664c("MmEditStateManager", "[transformState] current state: " + this.f116519b.mo162445a() + ", lastState: " + this.f116518a.f116507a.mo162445a());
            if (this.f116518a.mo162466b(this.f116519b)) {
                this.f116518a.mo162462a(this.f116519b, new Function2<MmEditState, MmEditState, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditStateManager.RunnableC46239a.C462401 */
                    final /* synthetic */ RunnableC46239a this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(MmEditState mmEditState, MmEditState mmEditState2) {
                        invoke(mmEditState, mmEditState2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(MmEditState mmEditState, MmEditState mmEditState2) {
                        Intrinsics.checkParameterIsNotNull(mmEditState, "<anonymous parameter 0>");
                        Intrinsics.checkParameterIsNotNull(mmEditState2, "curState");
                        this.this$0.f116518a.mo162460a(mmEditState2);
                    }
                });
                return;
            }
            C45855f.m181664c("MmEditStateManager", "state check failed, current state: " + this.f116519b.mo162445a() + ", lastState: " + this.f116518a.f116507a.mo162445a());
        }
    }

    public MmEditStateManager() {
        MmEditRefreshSubtitleState gVar = new MmEditRefreshSubtitleState();
        this.f116510d = gVar;
        this.f116511e = new MmEditEnteringState();
        this.f116512f = new MmEditingState();
        this.f116513g = new MmEditIdleState();
        this.f116514h = new MmEditErrorState();
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        String a2 = domainDepend.mo144616a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl().domainDepend.host");
        this.f116516j = a2;
        this.f116507a = new MmEditIdleState();
        gVar.mo162454a((MmEditRefreshSubtitleState.IMmEditReqSubtitleStateListener) this);
    }

    /* renamed from: a */
    public final void mo162459a(MmBaseInfo mmBaseInfo) {
        this.f116515i = mmBaseInfo;
    }

    /* renamed from: a */
    public final void mo162461a(IMmEditState aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "state");
        C45859k.m181685a(new RunnableC46239a(this, aVar));
    }

    /* renamed from: b */
    public final void mo162465b(IMmEditStateListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f116508b.remove(bVar);
    }

    /* renamed from: a */
    public final void mo162460a(MmEditState mmEditState) {
        int i = C46241i.f116521b[mmEditState.ordinal()];
        if (i == 1) {
            Iterator<T> it = this.f116508b.iterator();
            while (it.hasNext()) {
                it.next().mo162386a();
            }
        } else if (i == 2) {
            MmAppreciableEditSpeakerTracker.f118521a.mo165383c();
            MmAppreciableEditSpeakerTracker.f118521a.mo165384d();
            Iterator<T> it2 = this.f116508b.iterator();
            while (it2.hasNext()) {
                it2.next().mo162389b();
            }
        } else if (i == 3) {
            Iterator<T> it3 = this.f116508b.iterator();
            while (it3.hasNext()) {
                it3.next().mo162390c();
            }
        } else if (i == 4) {
            Iterator<T> it4 = this.f116508b.iterator();
            while (it4.hasNext()) {
                it4.next().mo162391d();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo162466b(IMmEditState aVar) {
        switch (C46241i.f116520a[aVar.mo162445a().ordinal()]) {
            case 1:
                if (this.f116507a.mo162445a() == MmEditState.IDLE) {
                    return true;
                }
                return false;
            case 2:
                if (this.f116507a.mo162445a() == MmEditState.INIT || this.f116507a.mo162445a() == MmEditState.ENTERING) {
                    return true;
                }
                return false;
            case 3:
                if (this.f116507a.mo162445a() == MmEditState.INIT || this.f116507a.mo162445a() == MmEditState.REFRESH_DATA) {
                    return true;
                }
                return false;
            case 4:
                if (this.f116507a.mo162445a() == MmEditState.ENTERING) {
                    return true;
                }
                return false;
            case 5:
                if (this.f116507a.mo162445a() != MmEditState.IDLE) {
                    return true;
                }
                return false;
            case 6:
                if (this.f116507a.mo162445a() != MmEditState.IDLE) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final void mo162463a(IMmEditStateListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f116508b.add(bVar);
    }

    /* renamed from: a */
    public final void mo162462a(IMmEditState aVar, Function2<? super MmEditState, ? super MmEditState, Unit> kVar) {
        IMmEditState aVar2 = this.f116507a;
        aVar2.mo162447b(this);
        this.f116507a = aVar;
        kVar.invoke(aVar2.mo162445a(), this.f116507a.mo162445a());
        this.f116507a.mo162446a(this);
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditRefreshSubtitleState.IMmEditReqSubtitleStateListener
    /* renamed from: a */
    public void mo162455a(Function1<? super MmBaseInfo, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        Intrinsics.checkParameterIsNotNull(function0, "onFailed");
        Iterator<T> it = this.f116508b.iterator();
        while (it.hasNext()) {
            it.next().mo162388a(function1, function0);
        }
    }

    /* renamed from: a */
    public final void mo162458a(int i, MmBaseInfo mmBaseInfo, String str, C47096b bVar) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(bVar, "timerExecutor");
        C45855f.m181664c("MmEditStateManager", "start");
        this.f116516j = str;
        this.f116515i = mmBaseInfo;
        this.f116517k = bVar;
        this.f116509c.mo162453a(mmBaseInfo.getObjectVersion(), i);
        mo162461a(this.f116509c);
    }
}
