package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.NetworkUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleDependency;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener;
import com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerListDialog;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditStateListener;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditStateManager;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableEditSpeakerTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.MmLoadingDialog;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import com.ss.android.lark.utils.UIHelper;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J,\u0010\u001d\u001a\u00020\u00182\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00180\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0016J\u001e\u0010#\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerProxy;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/IMmEditStateListener;", "context", "Landroid/content/Context;", "adapter", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitlesAdapter;", "subtitleListener", "Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleListener;", "dependency", "Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitlesAdapter;Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleListener;Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleDependency;)V", "getAdapter", "()Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitlesAdapter;", "getContext", "()Landroid/content/Context;", "getDependency", "()Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleDependency;", "loadingDialog", "Lcom/ss/android/lark/mm/utils/MmLoadingDialog;", "mSpeakerDialog", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog;", "getSubtitleListener", "()Lcom/ss/android/lark/mm/module/detail/subtitles/IMmMeetingSubtitleListener;", "onDestroy", "", "onEnterEditModeError", "onEnteredEditMode", "onExitEditMode", "onPrepareEnterEditMode", "onRefreshSubtitles", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "onFailed", "Lkotlin/Function0;", "showEditSpeakerDialog", "paragraphId", "", "currentSpeakerUserId", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.b */
public final class MmEditSpeakerProxy implements IMmEditStateListener {

    /* renamed from: a */
    public MmEditSpeakerListDialog f116467a;

    /* renamed from: b */
    private MmLoadingDialog f116468b;

    /* renamed from: c */
    private final Context f116469c;

    /* renamed from: d */
    private final MmSubtitlesAdapter f116470d;

    /* renamed from: e */
    private final IMmMeetingSubtitleListener f116471e;

    /* renamed from: f */
    private final IMmMeetingSubtitleDependency f116472f;

    /* renamed from: f */
    public final MmSubtitlesAdapter mo162393f() {
        return this.f116470d;
    }

    /* renamed from: g */
    public final IMmMeetingSubtitleListener mo162394g() {
        return this.f116471e;
    }

    /* renamed from: h */
    public final IMmMeetingSubtitleDependency mo162395h() {
        return this.f116472f;
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditStateListener
    /* renamed from: d */
    public void mo162391d() {
        MmLoadingDialog mmLoadingDialog = this.f116468b;
        if (mmLoadingDialog != null) {
            mmLoadingDialog.mo5513b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.b$f */
    public static final class C46227f extends Lambda implements Function0<Unit> {
        public static final C46227f INSTANCE = new C46227f();

        C46227f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45858j.m181677a((int) R.string.MMWeb_G_ConnectionErrorCheckInternet_Toast);
        }
    }

    /* renamed from: e */
    public final void mo162392e() {
        MmEditStateManager f = this.f116472f.mo162254f();
        if (f != null) {
            f.mo162465b(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r¸\u0006\u000e"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerProxy$showEditSpeakerDialog$1$1$1", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$IEditSpeakerListener;", "onChangingSpeaker", "", "onClickCancel", "onClickDone", "speaker", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "isAdd", "", "onSearch", "keywords", "", "mm_release", "com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerProxy$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.b$d */
    public static final class C46222d implements MmEditSpeakerListDialog.IEditSpeakerListener {

        /* renamed from: a */
        final /* synthetic */ MmEditSpeakerProxy f116477a;

        /* renamed from: b */
        final /* synthetic */ Context f116478b;

        /* renamed from: c */
        final /* synthetic */ String f116479c;

        /* renamed from: d */
        final /* synthetic */ String f116480d;

        @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerListDialog.IEditSpeakerListener
        /* renamed from: a */
        public void mo162376a() {
            IMmMeetingSubtitleDependency h = this.f116477a.mo162395h();
            String string = this.f116478b.getString(R.string.MMWeb_G_Saving);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.MMWeb_G_Saving)");
            h.mo162249b(string);
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerListDialog.IEditSpeakerListener
        /* renamed from: b */
        public void mo162379b() {
            IMmMeetingSubtitleDependency h = this.f116477a.mo162395h();
            String string = this.f116478b.getString(R.string.MMWeb_G_Saved);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.MMWeb_G_Saved)");
            h.mo162249b(string);
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerListDialog.IEditSpeakerListener
        /* renamed from: a */
        public void mo162378a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "keywords");
            this.f116477a.mo162395h().mo162250b(str, new Function1<List<? extends MmParticipants.MmParticipantInfo>, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerProxy.C46222d.C462253 */
                final /* synthetic */ C46222d this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends MmParticipants.MmParticipantInfo> list) {
                    invoke(list);
                    return Unit.INSTANCE;
                }

                public final void invoke(List<? extends MmParticipants.MmParticipantInfo> list) {
                    T t;
                    if (C47098d.m186535b(C47098d.m186533a(this.this$0.f116478b))) {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                if (Intrinsics.areEqual(t.getUserId(), this.this$0.f116479c)) {
                                    break;
                                }
                            }
                            T t2 = t;
                            if (t2 != null) {
                                t2.setIs_paragraph_speaker(true);
                            }
                        }
                        MmEditSpeakerListDialog aVar = this.this$0.f116477a.f116467a;
                        if (aVar != null) {
                            aVar.mo162372b(list);
                        }
                    }
                }
            }, C46228c.INSTANCE);
        }

        @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerListDialog.IEditSpeakerListener
        /* renamed from: a */
        public void mo162377a(MmParticipants.MmParticipantInfo mmParticipantInfo, boolean z) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "speaker");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            String str3 = null;
            objectRef.element = (T) null;
            C47084f a = C47085h.m186430a(this.f116477a.mo162395h().mo162237a());
            C47086i b = C47086i.m186432a().mo165422d("speaker_edit").mo165416b();
            if (z) {
                str = "add_speaker";
            } else {
                str = "change_speaker";
            }
            C47083e.m186425a(a, "vc_minutes_detail_click", b.mo165413a("edit_type", str).mo165421c());
            String str4 = "";
            if (!NetworkUtils.m94915b(this.f116478b)) {
                C45858j.m181677a((int) R.string.MMWeb_G_SaveFailedCheckConnection);
                AppreciableKit a2 = AppreciableKit.f73094h.mo103524a();
                Biz biz = Biz.VideoConference;
                Scene scene = Scene.MinutesDetail;
                Event event = Event.minutes_edit_detail_error;
                ErrorType errorType = ErrorType.Network;
                ErrorLevel errorLevel = ErrorLevel.Exception;
                Pair[] pairArr = new Pair[2];
                MmBaseInfo a3 = this.f116477a.mo162395h().mo162237a();
                if (a3 == null || (str2 = a3.getObjectToken()) == null) {
                    str2 = str4;
                }
                pairArr[0] = TuplesKt.to("objecttoken", str2);
                String userId = mmParticipantInfo.getUserId();
                if (userId != null) {
                    str4 = userId;
                }
                pairArr[1] = TuplesKt.to("Userid", str4);
                a2.mo103514a(new ErrorParams(biz, scene, event, errorType, errorLevel, 0, "editSpeaker", null, "noNetwork", false, MapsKt.mapOf(pairArr), null, null, 6144, null));
            } else if (Intrinsics.areEqual(mmParticipantInfo.getUserId(), this.f116479c)) {
                IMmMeetingSubtitleDependency h = this.f116477a.mo162395h();
                String string = this.f116478b.getString(R.string.MMWeb_G_Saved);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.MMWeb_G_Saved)");
                h.mo162249b(string);
                MmEditSpeakerListDialog aVar = this.f116477a.f116467a;
                if (aVar != null) {
                    aVar.mo5513b();
                }
            } else {
                if (z) {
                    objectRef.element = (T) new MmLoadingDialog.Builder(MmLoadingDialog.Builder.Mode.Small).mo165459a();
                    FragmentActivity a4 = C47107a.m186565a(this.f116478b);
                    if (a4 != null) {
                        objectRef.element.mo5511a(a4.getSupportFragmentManager(), str4);
                    }
                }
                IMmMeetingSubtitleDependency h2 = this.f116477a.mo162395h();
                String str5 = this.f116480d;
                MmEditStateManager f = this.f116477a.mo162395h().mo162254f();
                if (f != null) {
                    str3 = f.mo162473i();
                }
                h2.mo162245a(str5, str3, mmParticipantInfo, new Function1<List<? extends String>, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerProxy.C46222d.C462231 */
                    final /* synthetic */ C46222d this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                        invoke((List<String>) list);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(List<String> list) {
                        Intrinsics.checkParameterIsNotNull(list, "it");
                        T t = objectRef.element;
                        if (t != null) {
                            t.mo5513b();
                        }
                        MmEditSpeakerListDialog aVar = this.this$0.f116477a.f116467a;
                        if (aVar != null) {
                            aVar.mo5513b();
                        }
                        if (list.size() > 1) {
                            C45858j.m181680b(UIHelper.mustacheFormat((int) R.string.MMWeb_G_EditNumSpeakers_Toast, "number", String.valueOf(list.size())));
                        }
                        this.this$0.f116477a.mo162394g().mo162295m();
                        IMmMeetingSubtitleDependency h = this.this$0.f116477a.mo162395h();
                        String string = this.this$0.f116478b.getString(R.string.MMWeb_G_Saved);
                        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.MMWeb_G_Saved)");
                        h.mo162249b(string);
                    }
                }, new Function2<Integer, C47068a, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerProxy.C46222d.C462242 */
                    final /* synthetic */ C46222d this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, C47068a aVar) {
                        invoke(num, aVar);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Integer num, C47068a aVar) {
                        MmEditStateManager f;
                        if (aVar != null && aVar.mo165307b() == 11004) {
                            C47083e.m186425a(C47085h.m186430a(this.this$0.f116477a.mo162395h().mo162237a()), "vc_minutes_popup_view", C47086i.m186432a().mo165427i("violative_speaker_name").mo165421c());
                        }
                        T t = objectRef.element;
                        if (t != null) {
                            t.mo5513b();
                        }
                        if (num != null && (f = this.this$0.f116477a.mo162395h().mo162254f()) != null) {
                            f.mo162474j();
                        }
                    }
                });
            }
        }

        C46222d(MmEditSpeakerProxy bVar, Context context, String str, String str2) {
            this.f116477a = bVar;
            this.f116478b = context;
            this.f116479c = str;
            this.f116480d = str2;
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditStateListener
    /* renamed from: b */
    public void mo162389b() {
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116470d;
        if (mmSubtitlesAdapter != null) {
            mmSubtitlesAdapter.mo162183b(true);
        }
        this.f116472f.mo162272x();
        MmLoadingDialog mmLoadingDialog = this.f116468b;
        if (mmLoadingDialog != null) {
            mmLoadingDialog.mo5513b();
        }
        MmAppreciableEditSpeakerTracker.f118521a.mo165385e();
        MmAppreciableEditSpeakerTracker.m186388f();
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditStateListener
    /* renamed from: c */
    public void mo162390c() {
        MmEditSpeakerListDialog aVar = this.f116467a;
        if (aVar != null) {
            aVar.mo5513b();
        }
        MmLoadingDialog mmLoadingDialog = this.f116468b;
        if (mmLoadingDialog != null) {
            mmLoadingDialog.mo5513b();
        }
        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116470d;
        if (mmSubtitlesAdapter != null) {
            mmSubtitlesAdapter.mo162183b(false);
        }
        this.f116472f.mo162273y();
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditStateListener
    /* renamed from: a */
    public void mo162386a() {
        FragmentManager supportFragmentManager;
        FragmentActivity a = C47107a.m186565a(this.f116469c);
        if (a != null && (supportFragmentManager = a.getSupportFragmentManager()) != null) {
            MmLoadingDialog a2 = new MmLoadingDialog.Builder(MmLoadingDialog.Builder.Mode.Small).mo165459a();
            this.f116468b = a2;
            a2.mo5511a(supportFragmentManager, "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.b$c */
    static final class C46221c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Function0 f116476a;

        C46221c(Function0 function0) {
            this.f116476a = function0;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f116476a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "invoke", "com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerProxy$showEditSpeakerDialog$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.b$e */
    public static final class C46226e extends Lambda implements Function1<List<? extends MmParticipants.MmParticipantInfo>, Unit> {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ String $currentSpeakerUserId$inlined;
        final /* synthetic */ String $paragraphId$inlined;
        final /* synthetic */ MmEditSpeakerProxy this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46226e(MmEditSpeakerProxy bVar, Context context, String str, String str2) {
            super(1);
            this.this$0 = bVar;
            this.$context$inlined = context;
            this.$currentSpeakerUserId$inlined = str;
            this.$paragraphId$inlined = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends MmParticipants.MmParticipantInfo> list) {
            invoke(list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<? extends MmParticipants.MmParticipantInfo> list) {
            MmEditSpeakerListDialog aVar = this.this$0.f116467a;
            if (aVar != null) {
                aVar.mo162371a(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.b$b */
    static final class C46220b<T> implements Consumer<Pair<? extends MmMeetingSubtitles, ? extends MmBaseInfo>> {

        /* renamed from: a */
        final /* synthetic */ MmEditSpeakerProxy f116474a;

        /* renamed from: b */
        final /* synthetic */ Function1 f116475b;

        C46220b(MmEditSpeakerProxy bVar, Function1 function1) {
            this.f116474a = bVar;
            this.f116475b = function1;
        }

        /* renamed from: a */
        public final void accept(Pair<? extends MmMeetingSubtitles, ? extends MmBaseInfo> pair) {
            List<MmMeetingParagraph> list;
            this.f116475b.invoke(this.f116474a.mo162395h().mo162237a());
            MmSubtitlesAdapter f = this.f116474a.mo162393f();
            if (f != null) {
                MmMeetingSubtitles c = this.f116474a.mo162395h().mo162251c();
                if (c != null) {
                    list = c.getParagraphs();
                } else {
                    list = null;
                }
                f.mo162175a(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "t1", "t2", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.b$a */
    static final class C46219a<T1, T2, R> implements BiFunction<MmMeetingSubtitles, MmBaseInfo, Pair<? extends MmMeetingSubtitles, ? extends MmBaseInfo>> {

        /* renamed from: a */
        public static final C46219a f116473a = new C46219a();

        C46219a() {
        }

        /* renamed from: a */
        public final Pair<MmMeetingSubtitles, MmBaseInfo> apply(MmMeetingSubtitles mmMeetingSubtitles, MmBaseInfo mmBaseInfo) {
            Intrinsics.checkParameterIsNotNull(mmMeetingSubtitles, "t1");
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "t2");
            return TuplesKt.to(mmMeetingSubtitles, mmBaseInfo);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.IMmEditStateListener
    /* renamed from: a */
    public void mo162388a(Function1<? super MmBaseInfo, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        Intrinsics.checkParameterIsNotNull(function0, "onFailed");
        IMmMeetingSubtitleDependency aVar = this.f116472f;
        Disposable subscribe = Single.zip(aVar.mo162239a(aVar.mo162264p(), true), this.f116472f.mo162247b(), C46219a.f116473a).observeOn(AndroidSchedulers.mainThread()).subscribe(new C46220b(this, function1), new C46221c(function0));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "Single.zip(dependency.lo…iled()\n                })");
        C47108b.m186566a(subscribe, this.f116469c);
    }

    /* renamed from: a */
    public final void mo162387a(Context context, String str, String str2) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "paragraphId");
        Intrinsics.checkParameterIsNotNull(str2, "currentSpeakerUserId");
        FragmentActivity a = C47107a.m186565a(context);
        if (a != null && (supportFragmentManager = a.getSupportFragmentManager()) != null) {
            MmEditSpeakerListDialog aVar = new MmEditSpeakerListDialog();
            this.f116467a = aVar;
            aVar.mo162370a(new C46222d(this, context, str2, str));
            MmEditSpeakerListDialog aVar2 = this.f116467a;
            if (aVar2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
                aVar2.mo5511a(supportFragmentManager, "");
            }
            this.f116472f.mo162246a(str, new C46226e(this, context, str2, str), C46227f.INSTANCE);
        }
    }

    public MmEditSpeakerProxy(Context context, MmSubtitlesAdapter mmSubtitlesAdapter, IMmMeetingSubtitleListener cVar, IMmMeetingSubtitleDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "subtitleListener");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f116469c = context;
        this.f116470d = mmSubtitlesAdapter;
        this.f116471e = cVar;
        this.f116472f = aVar;
        MmEditStateManager f = aVar.mo162254f();
        if (f != null) {
            f.mo162463a(this);
        }
    }
}
