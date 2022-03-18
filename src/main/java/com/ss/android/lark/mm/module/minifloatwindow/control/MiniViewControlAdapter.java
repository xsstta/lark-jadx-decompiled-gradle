package com.ss.android.lark.mm.module.minifloatwindow.control;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.MmActiveStateObservable;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener;
import com.ss.android.lark.mm.module.minifloatwindow.floating.MiniType;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniListener;", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/MiniControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/minifloatwindow/control/MiniControl;)V", "TAG", "", "updateDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDependency", "onCreate", "", "onDestroy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.f */
public final class MiniViewControlAdapter extends MmBaseViewControlAdapter<IMiniListener, IMiniDependency> {

    /* renamed from: a */
    public final String f117078a = "MiniViewControlAdapter";

    /* renamed from: b */
    public C68289a f117079b;

    /* renamed from: c */
    public final MmViewControlRegister f117080c;

    /* renamed from: d */
    public final MiniControl f117081d;

    /* renamed from: e */
    private final MmControlRegister f117082e;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
    }

    /* renamed from: b */
    public IMiniDependency mo161230c() {
        return new C46502a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniDependency;", "getContext", "Landroid/content/Context;", "getTrackContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "onClickDismiss", "", "miniType", "Lcom/ss/android/lark/mm/module/minifloatwindow/floating/MiniType;", "onClickPause", "onClickResume", "subscribe", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.f$a */
    public static final class C46502a implements IMiniDependency {

        /* renamed from: a */
        final /* synthetic */ MiniViewControlAdapter f117083a;

        @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniDependency
        /* renamed from: c */
        public void mo163373c() {
            MmAudioRecordService.Companion aVar = MmAudioRecordService.f117956f;
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            aVar.mo164587a(a);
        }

        @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniDependency
        /* renamed from: d */
        public void mo163374d() {
            MmAudioRecordService.Companion aVar = MmAudioRecordService.f117956f;
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            aVar.mo164589b(a);
        }

        @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniDependency
        /* renamed from: b */
        public Context mo163371b() {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
            Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
            Context a2 = contextDepend.mo144557a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl().contextDepend.context");
            return a2;
        }

        @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniDependency
        /* renamed from: a */
        public C47084f mo163369a() {
            return new C47084f(this.f117083a.f117081d.mo163382a().getMeetingId(), true, this.f117083a.f117081d.mo163382a().getObjectToken(), this.f117083a.f117081d.mo163382a().getObjectType(), this.f117083a.f117081d.mo163382a().isCanModify());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46502a(MiniViewControlAdapter fVar) {
            this.f117083a = fVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "volume", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "accept", "com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControlAdapter$getDependency$1$subscribe$1$3"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.f$a$b */
        static final class C46504b<T> implements Consumer<Pair<? extends String, ? extends Long>> {

            /* renamed from: a */
            final /* synthetic */ C46502a f117085a;

            C46504b(C46502a aVar) {
                this.f117085a = aVar;
            }

            /* renamed from: a */
            public final void accept(Pair<String, Long> pair) {
                IMiniListener cVar = (IMiniListener) this.f117085a.f117083a.f117080c.mo161266d(IMiniListener.class);
                if (cVar != null) {
                    cVar.mo163377a(pair.getSecond().longValue());
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "kotlin.jvm.PlatformType", "accept", "com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControlAdapter$getDependency$1$subscribe$2$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.f$a$c */
        static final class C46505c<T> implements Consumer<MmBaseInfo> {

            /* renamed from: a */
            final /* synthetic */ C46502a f117086a;

            C46505c(C46502a aVar) {
                this.f117086a = aVar;
            }

            /* renamed from: a */
            public final void accept(MmBaseInfo mmBaseInfo) {
                MiniControl dVar = this.f117086a.f117083a.f117081d;
                Intrinsics.checkExpressionValueIsNotNull(mmBaseInfo, "it");
                dVar.mo163383a(mmBaseInfo);
                IMiniListener cVar = (IMiniListener) this.f117086a.f117083a.mo161258i();
                if (cVar != null) {
                    String videoCover = mmBaseInfo.getVideoCover();
                    Intrinsics.checkExpressionValueIsNotNull(videoCover, "it.videoCover");
                    cVar.mo163379a(videoCover, R.drawable.mm_ic_default_mini_podcast);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "accept", "com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControlAdapter$getDependency$1$subscribe$2$5"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.f$a$e */
        static final class C46507e<T> implements Consumer<Pair<? extends String, ? extends Long>> {

            /* renamed from: a */
            final /* synthetic */ C46502a f117088a;

            C46507e(C46502a aVar) {
                this.f117088a = aVar;
            }

            /* renamed from: a */
            public final void accept(Pair<String, Long> pair) {
                long longValue = pair.component2().longValue();
                IMiniListener cVar = (IMiniListener) this.f117088a.f117083a.mo161258i();
                if (cVar != null) {
                    cVar.mo163378a(longValue, this.f117088a.f117083a.f117081d.mo163382a().getDuration());
                }
            }
        }

        @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniDependency
        /* renamed from: b */
        public void mo163372b(MiniType miniType) {
            Intrinsics.checkParameterIsNotNull(miniType, "miniType");
            MmActiveStateObservable.f115698a.mo161188b();
            if (miniType == MiniType.MINUTES_RECORDING) {
                C45852d.m181651a().mo161150a(this.f117083a.f117081d.mo163382a().getObjectToken()).mo164529h();
                return;
            }
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            MmPodcastControl b = a.mo161151b();
            if (b != null) {
                b.mo164280j();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "kotlin.jvm.PlatformType", "accept", "com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControlAdapter$getDependency$1$subscribe$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.f$a$a */
        static final class C46503a<T> implements Consumer<Pair<? extends String, ? extends MmRecordManager.RecordState>> {

            /* renamed from: a */
            final /* synthetic */ C46502a f117084a;

            C46503a(C46502a aVar) {
                this.f117084a = aVar;
            }

            /* renamed from: a */
            public final void accept(Pair<String, ? extends MmRecordManager.RecordState> pair) {
                IMiniListener cVar;
                MmRecordManager.RecordState recordState = (MmRecordManager.RecordState) pair.component2();
                String str = this.f117084a.f117083a.f117078a;
                C45855f.m181664c(str, "[onStateChanged] " + recordState.name());
                int i = C46508g.f117089a[recordState.ordinal()];
                if (i == 1) {
                    IMiniListener cVar2 = (IMiniListener) this.f117084a.f117083a.mo161258i();
                    if (cVar2 != null) {
                        cVar2.mo163375A();
                    }
                } else if (i == 2) {
                    IMiniListener cVar3 = (IMiniListener) this.f117084a.f117083a.mo161258i();
                    if (cVar3 != null) {
                        cVar3.mo163380a(true);
                    }
                } else if (i == 3) {
                    IMiniListener cVar4 = (IMiniListener) this.f117084a.f117083a.mo161258i();
                    if (cVar4 != null) {
                        cVar4.mo163380a(false);
                    }
                } else if (i == 4 && (cVar = (IMiniListener) this.f117084a.f117083a.mo161258i()) != null) {
                    cVar.mo163381z();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$PlayState;", "kotlin.jvm.PlatformType", "accept", "com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControlAdapter$getDependency$1$subscribe$2$3"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.f$a$d */
        static final class C46506d<T> implements Consumer<Pair<? extends String, ? extends MmPodcastControl.PlayState>> {

            /* renamed from: a */
            final /* synthetic */ C46502a f117087a;

            C46506d(C46502a aVar) {
                this.f117087a = aVar;
            }

            /* renamed from: a */
            public final void accept(Pair<String, ? extends MmPodcastControl.PlayState> pair) {
                IMiniListener cVar;
                pair.component1();
                MmPodcastControl.PlayState playState = (MmPodcastControl.PlayState) pair.component2();
                if (playState == MmPodcastControl.PlayState.PAUSED) {
                    IMiniListener cVar2 = (IMiniListener) this.f117087a.f117083a.mo161258i();
                    if (cVar2 != null) {
                        IMiniListener.C46491a.m183881a(cVar2, false, 1, null);
                    }
                } else if (playState == MmPodcastControl.PlayState.PLAYING) {
                    IMiniListener cVar3 = (IMiniListener) this.f117087a.f117083a.mo161258i();
                    if (cVar3 != null) {
                        cVar3.mo163375A();
                    }
                } else if (playState == MmPodcastControl.PlayState.LOADING && (cVar = (IMiniListener) this.f117087a.f117083a.mo161258i()) != null) {
                    cVar.mo163376a();
                }
            }
        }

        @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniDependency
        /* renamed from: a */
        public void mo163370a(MiniType miniType) {
            Intrinsics.checkParameterIsNotNull(miniType, "miniType");
            C68289a aVar = this.f117083a.f117079b;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f117083a.f117079b = new C68289a();
            if (miniType == MiniType.MINUTES_RECORDING) {
                MmRecordManager a = C45852d.m181651a().mo161150a(this.f117083a.f117081d.mo163382a().getObjectToken());
                if (a != null) {
                    Disposable subscribe = a.mo164524b().subscribe(new C46503a(this));
                    C68289a aVar2 = this.f117083a.f117079b;
                    if (aVar2 != null) {
                        aVar2.mo237937a(subscribe);
                    }
                    Disposable subscribe2 = a.mo164526d().throttleFirst(1, TimeUnit.SECONDS).subscribe(new C46504b(this));
                    C68289a aVar3 = this.f117083a.f117079b;
                    if (aVar3 != null) {
                        aVar3.mo237937a(subscribe2);
                        return;
                    }
                    return;
                }
                return;
            }
            C45852d a2 = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmControl.of()");
            MmPodcastControl b = a2.mo161151b();
            if (b != null) {
                Disposable subscribe3 = b.mo164274d().subscribe(new C46505c(this));
                C68289a aVar4 = this.f117083a.f117079b;
                if (aVar4 != null) {
                    aVar4.mo237937a(subscribe3);
                }
                Disposable subscribe4 = b.mo164276f().subscribe(new C46506d(this));
                C68289a aVar5 = this.f117083a.f117079b;
                if (aVar5 != null) {
                    aVar5.mo237937a(subscribe4);
                }
                Disposable subscribe5 = b.mo164275e().subscribe(new C46507e(this));
                C68289a aVar6 = this.f117083a.f117079b;
                if (aVar6 != null) {
                    aVar6.mo237937a(subscribe5);
                }
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: d */
    public void mo161256d() {
        C68289a aVar = this.f117079b;
        if (aVar != null) {
            aVar.dispose();
        }
        super.mo161256d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MiniControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f117080c = kVar;
        this.f117082e = eVar;
        this.f117081d = dVar;
    }
}
