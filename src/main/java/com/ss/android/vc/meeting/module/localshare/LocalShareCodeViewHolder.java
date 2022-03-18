package com.ss.android.vc.meeting.module.localshare;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.entity.response.C60965at;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.localshare.LocalShareManager;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.LocalShareEvent;
import com.ss.android.vc.statistics.event.MeetingShareCodeEvent;
import com.ss.android.vc.statistics.event2.ShareCodeInputEvent;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r*\u0001*\u0018\u0000 =2\u00020\u0001:\u0001=B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J&\u0010/\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u00102\u001a\u00020-J\u0006\u00103\u001a\u00020-J\b\u00104\u001a\u00020-H\u0002J\u0006\u00105\u001a\u00020\u0016J\u0010\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u0016H\u0016J\b\u00108\u001a\u00020-H\u0002J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020\u0018H\u0002J\u0006\u0010;\u001a\u00020-J\b\u0010<\u001a\u00020-H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u0010\u0010)\u001a\u00020*X\u0004¢\u0006\u0004\n\u0002\u0010+¨\u0006>"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder;", "Lcom/ss/android/vc/meeting/module/localshare/ILocalShareInput;", "localSharePrepareView", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "(Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "activity", "Landroid/app/Activity;", "bottomView", "Landroid/view/View;", "codeInputView", "Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2;", "confirmBtn", "Landroidx/constraintlayout/widget/ConstraintLayout;", "dialogInterface", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "envId", "", "getEnvId", "()Ljava/lang/String;", "setEnvId", "(Ljava/lang/String;)V", "isLoading", "", "lastHeight", "", "loadingLottie", "Lcom/larksuite/component/ui/imageview/LKUILottieAnimationView;", "getLocalSharePrepareView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "mBackView", "Lcom/ss/android/vc/common/widget/IconFontView;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "rootView", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", ShareHitPoint.f121868c, "getSource", "setSource", "startMeetingCallback", "com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$startMeetingCallback$1", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$startMeetingCallback$1;", "checkAndShareToRoom", "", "checkAndStartMeetingByShareCode", "createView", "context", "Landroid/content/Context;", "endLoading", "init", "initBackView", "onBackPressed", "onCodeInputFinish", "finish", "putDownBottomLayout", "putUpBottomLayout", "paddingHeight", "startLoading", "updateConfirmBtn", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.e */
public final class LocalShareCodeViewHolder implements ILocalShareInput {

    /* renamed from: g */
    public static final Companion f156129g = new Companion(null);

    /* renamed from: a */
    public Activity f156130a;

    /* renamed from: b */
    public AbstractC61222a f156131b;

    /* renamed from: c */
    public LocalShareCodeInputView2 f156132c;

    /* renamed from: d */
    public boolean f156133d;

    /* renamed from: e */
    public int f156134e;

    /* renamed from: f */
    public final C62168j f156135f = new C62168j(this);

    /* renamed from: h */
    private String f156136h;

    /* renamed from: i */
    private String f156137i;

    /* renamed from: j */
    private View f156138j;

    /* renamed from: k */
    private C61303k f156139k;

    /* renamed from: l */
    private IconFontView f156140l;

    /* renamed from: m */
    private ConstraintLayout f156141m;

    /* renamed from: n */
    private LKUILottieAnimationView f156142n;

    /* renamed from: o */
    private View f156143o;

    /* renamed from: p */
    private final ILocalSharePrepareContract.IView f156144p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo215029a() {
        return this.f156137i;
    }

    /* renamed from: b */
    public final View mo215032b() {
        return this.f156138j;
    }

    /* renamed from: k */
    public final ILocalSharePrepareContract.IView mo215041k() {
        return this.f156144p;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$checkAndShareToRoom$1", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$IGetShareCodeInfoCallback;", "isRoom", "", "isShareBox", "onError", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$b */
    public static final class C62151b implements LocalShareManager.IGetShareCodeInfoCallback {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156145a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$checkAndShareToRoom$1$isRoom$1", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckLocalMeetingCallbak;", "hasNoMeeting", "", "inDiffNormalMeeting", "inSameNormalMeeting", "isSharingToRoom", "localInNormalMeetingAndRoomInWiredMeeting", "onError", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onlyLocalInNormalMeeting", "meetingId", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$b$a */
        public static final class C62152a implements LocalShareManager.ICheckLocalMeetingCallbak {

            /* renamed from: a */
            final /* synthetic */ C62151b f156146a;

            @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
            /* renamed from: a */
            public void mo215045a() {
                this.f156146a.f156145a.mo215035e();
            }

            @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
            /* renamed from: c */
            public void mo215049c() {
                this.f156146a.f156145a.mo215035e();
            }

            @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
            /* renamed from: b */
            public void mo215048b() {
                ILocalSharePrepareContract.IView k = this.f156146a.f156145a.mo215041k();
                if (k != null) {
                    k.mo217809m();
                }
            }

            @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
            /* renamed from: e */
            public void mo215051e() {
                ILocalSharePrepareContract.IView k = this.f156146a.f156145a.mo215041k();
                if (k != null) {
                    k.mo217809m();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.vc.meeting.module.localshare.e$b$a$a */
            static final class RunnableC62153a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C62152a f156147a;

                RunnableC62153a(C62152a aVar) {
                    this.f156147a = aVar;
                }

                public final void run() {
                    ILocalSharePrepareContract.IView k = this.f156147a.f156146a.f156145a.mo215041k();
                    if (k != null) {
                        k.mo217794a((String) null, (String) null);
                    }
                    LocalShareCodeInputView2 localShareCodeInputView2 = this.f156147a.f156146a.f156145a.f156132c;
                    if (localShareCodeInputView2 != null) {
                        localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNKNOWN);
                    }
                }
            }

            @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
            /* renamed from: d */
            public void mo215050d() {
                this.f156146a.f156145a.mo215038h();
                C60738ac.m236023a((int) R.string.View_G_AlreadySharingViaHDMI);
                C60735ab.m236001a(new RunnableC62153a(this));
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.vc.meeting.module.localshare.e$b$a$b */
            static final class RunnableC62154b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C62152a f156148a;

                /* renamed from: b */
                final /* synthetic */ C63602e f156149b;

                RunnableC62154b(C62152a aVar, C63602e eVar) {
                    this.f156148a = aVar;
                    this.f156149b = eVar;
                }

                public final void run() {
                    ILocalSharePrepareContract.IView k = this.f156148a.f156146a.f156145a.mo215041k();
                    if (k != null) {
                        k.mo217794a((String) null, (String) null);
                    }
                    if (this.f156149b.mo219899a() == 231106) {
                        LocalShareCodeInputView2 localShareCodeInputView2 = this.f156148a.f156146a.f156145a.f156132c;
                        if (localShareCodeInputView2 != null) {
                            localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNABLE_SHARE_TO_ROOM);
                        }
                    } else if (this.f156149b.mo219899a() == 232401) {
                        LocalShareCodeInputView2 localShareCodeInputView22 = this.f156148a.f156146a.f156145a.f156132c;
                        if (localShareCodeInputView22 != null) {
                            localShareCodeInputView22.mo217718b(LocalShareCodeInputView2.CodeFailReason.INVALID_SHARE_CODE);
                        }
                    } else {
                        LocalShareCodeInputView2 localShareCodeInputView23 = this.f156148a.f156146a.f156145a.f156132c;
                        if (localShareCodeInputView23 != null) {
                            localShareCodeInputView23.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNKNOWN);
                        }
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C62152a(C62151b bVar) {
                this.f156146a = bVar;
            }

            @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
            /* renamed from: a */
            public void mo215046a(C63602e eVar) {
                Intrinsics.checkParameterIsNotNull(eVar, "err");
                this.f156146a.f156145a.mo215038h();
                C60735ab.m236001a(new RunnableC62154b(this, eVar));
            }

            @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
            /* renamed from: a */
            public void mo215047a(String str) {
                String inputText;
                ILocalSharePrepareContract.IView k;
                LocalShareCodeInputView2 localShareCodeInputView2 = this.f156146a.f156145a.f156132c;
                if (localShareCodeInputView2 != null && (inputText = localShareCodeInputView2.getInputText()) != null && (k = this.f156146a.f156145a.mo215041k()) != null) {
                    k.mo217795a(inputText, str, this.f156146a.f156145a.f156135f);
                }
            }
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.IGetShareCodeInfoCallback
        /* renamed from: a */
        public void mo215042a() {
            this.f156145a.mo215035e();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.IGetShareCodeInfoCallback
        /* renamed from: b */
        public void mo215044b() {
            String str;
            LocalShareManager a = LocalShareManager.f156170b.mo215084a();
            LocalShareCodeInputView2 localShareCodeInputView2 = this.f156145a.f156132c;
            if (localShareCodeInputView2 != null) {
                str = localShareCodeInputView2.getInputText();
            } else {
                str = null;
            }
            a.mo215079a(str, new C62152a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$b$b */
        static final class RunnableC62155b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62151b f156150a;

            /* renamed from: b */
            final /* synthetic */ C63602e f156151b;

            RunnableC62155b(C62151b bVar, C63602e eVar) {
                this.f156150a = bVar;
                this.f156151b = eVar;
            }

            public final void run() {
                ILocalSharePrepareContract.IView k = this.f156150a.f156145a.mo215041k();
                if (k != null) {
                    k.mo217794a((String) null, (String) null);
                }
                C63602e eVar = this.f156151b;
                if (eVar == null || eVar.mo219899a() != 231106) {
                    C63602e eVar2 = this.f156151b;
                    if (eVar2 == null || eVar2.mo219899a() != 232401) {
                        LocalShareCodeInputView2 localShareCodeInputView2 = this.f156150a.f156145a.f156132c;
                        if (localShareCodeInputView2 != null) {
                            localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNKNOWN);
                            return;
                        }
                        return;
                    }
                    LocalShareCodeInputView2 localShareCodeInputView22 = this.f156150a.f156145a.f156132c;
                    if (localShareCodeInputView22 != null) {
                        localShareCodeInputView22.mo217718b(LocalShareCodeInputView2.CodeFailReason.INVALID_SHARE_CODE);
                        return;
                    }
                    return;
                }
                LocalShareCodeInputView2 localShareCodeInputView23 = this.f156150a.f156145a.f156132c;
                if (localShareCodeInputView23 != null) {
                    localShareCodeInputView23.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNABLE_SHARE_TO_ROOM);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62151b(LocalShareCodeViewHolder eVar) {
            this.f156145a = eVar;
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.IGetShareCodeInfoCallback
        /* renamed from: a */
        public void mo215043a(C63602e eVar) {
            this.f156145a.mo215038h();
            C60735ab.m236001a(new RunnableC62155b(this, eVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$checkAndShareToRoom$2", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckAndShareToRoomByMeetingNumber;", "alReadyInOtherMeeting", "", "alReadyInRoomNormalMeeting", "alReadyInRoomShareMeeting", "invalidShareCode", "magicShareNotSupport", "noRoomInMeeting", "noSharePermission", "notSupportShareToRoom", "onJoinMeetingSuccess", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "otherError", "roomInWiredShare", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$c */
    public static final class C62156c implements LocalShareManager.ICheckAndShareToRoomByMeetingNumber {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156152a;

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: a */
        public void mo215055a() {
            this.f156152a.mo215038h();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: c */
        public void mo215058c() {
            this.f156152a.mo215038h();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: d */
        public void mo215059d() {
            this.f156152a.mo215038h();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: g */
        public void mo215062g() {
            this.f156152a.mo215038h();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$c$a */
        static final class RunnableC62157a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62156c f156153a;

            RunnableC62157a(C62156c cVar) {
                this.f156153a = cVar;
            }

            public final void run() {
                LocalShareCodeInputView2 localShareCodeInputView2 = this.f156153a.f156152a.f156132c;
                if (localShareCodeInputView2 != null) {
                    localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.INVALID_SHARE_CODE);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$c$b */
        static final class RunnableC62158b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62156c f156154a;

            RunnableC62158b(C62156c cVar) {
                this.f156154a = cVar;
            }

            public final void run() {
                LocalShareCodeInputView2 localShareCodeInputView2 = this.f156154a.f156152a.f156132c;
                if (localShareCodeInputView2 != null) {
                    localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.NO_ROOM_IN_MEETING);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$c$c */
        static final class RunnableC62159c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62156c f156155a;

            RunnableC62159c(C62156c cVar) {
                this.f156155a = cVar;
            }

            public final void run() {
                LocalShareCodeInputView2 localShareCodeInputView2 = this.f156155a.f156152a.f156132c;
                if (localShareCodeInputView2 != null) {
                    localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNABLE_SHARE_TO_ROOM);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$c$d */
        static final class RunnableC62160d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62156c f156156a;

            RunnableC62160d(C62156c cVar) {
                this.f156156a = cVar;
            }

            public final void run() {
                LocalShareCodeInputView2 localShareCodeInputView2 = this.f156156a.f156152a.f156132c;
                if (localShareCodeInputView2 != null) {
                    localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNKNOWN);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$c$e */
        static final class RunnableC62161e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62156c f156157a;

            RunnableC62161e(C62156c cVar) {
                this.f156157a = cVar;
            }

            public final void run() {
                LocalShareCodeInputView2 localShareCodeInputView2 = this.f156157a.f156152a.f156132c;
                if (localShareCodeInputView2 != null) {
                    localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNKNOWN);
                }
            }
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: b */
        public void mo215057b() {
            this.f156152a.mo215038h();
            C60735ab.m236001a(new RunnableC62158b(this));
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: e */
        public void mo215060e() {
            this.f156152a.mo215038h();
            C60735ab.m236001a(new RunnableC62157a(this));
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: f */
        public void mo215061f() {
            this.f156152a.mo215038h();
            AbstractC61222a aVar = this.f156152a.f156131b;
            if (aVar != null) {
                aVar.dismiss();
            }
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: h */
        public void mo215063h() {
            this.f156152a.mo215038h();
            C60735ab.m236001a(new RunnableC62159c(this));
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: i */
        public void mo215064i() {
            this.f156152a.mo215038h();
            C60735ab.m236001a(new RunnableC62161e(this));
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: j */
        public void mo215065j() {
            this.f156152a.mo215038h();
            C60735ab.m236001a(new RunnableC62160d(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62156c(LocalShareCodeViewHolder eVar) {
            this.f156152a = eVar;
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: a */
        public void mo215056a(VideoChat videoChat) {
            Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
            this.f156152a.mo215038h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$startMeetingCallback$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/ShareScreenToRoomEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$j */
    public static final class C62168j implements AbstractC63598b<C60965at> {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156164a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$j$b */
        public static final class RunnableC62170b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62168j f156167a;

            RunnableC62170b(C62168j jVar) {
                this.f156167a = jVar;
            }

            public final void run() {
                LocalShareCodeInputView2 localShareCodeInputView2 = this.f156167a.f156164a.f156132c;
                if (localShareCodeInputView2 != null) {
                    localShareCodeInputView2.mo217714a();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$startMeetingCallback$1$onError$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.e$j$a */
        static final class RunnableC62169a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62168j f156165a;

            /* renamed from: b */
            final /* synthetic */ C63602e f156166b;

            RunnableC62169a(C62168j jVar, C63602e eVar) {
                this.f156165a = jVar;
                this.f156166b = eVar;
            }

            public final void run() {
                LocalShareCodeInputView2 localShareCodeInputView2;
                if (this.f156166b.mo219899a() == 231106) {
                    LocalShareCodeInputView2 localShareCodeInputView22 = this.f156165a.f156164a.f156132c;
                    if (localShareCodeInputView22 != null) {
                        localShareCodeInputView22.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNABLE_SHARE_TO_ROOM);
                    }
                } else if (this.f156166b.mo219899a() == 232401) {
                    LocalShareCodeInputView2 localShareCodeInputView23 = this.f156165a.f156164a.f156132c;
                    if (localShareCodeInputView23 != null) {
                        localShareCodeInputView23.mo217718b(LocalShareCodeInputView2.CodeFailReason.INVALID_SHARE_CODE);
                    }
                } else if (this.f156166b.mo219899a() == 236001) {
                    AbstractC61222a aVar = this.f156165a.f156164a.f156131b;
                    if (aVar != null) {
                        aVar.dismiss();
                    }
                } else if (this.f156166b.mo219899a() != 232402 && (localShareCodeInputView2 = this.f156165a.f156164a.f156132c) != null) {
                    localShareCodeInputView2.mo217718b(LocalShareCodeInputView2.CodeFailReason.UNKNOWN);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62168j(LocalShareCodeViewHolder eVar) {
            this.f156164a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(C60965at atVar) {
            this.f156164a.mo215038h();
            C60735ab.m236001a(new RunnableC62170b(this));
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            this.f156164a.mo215038h();
            if (eVar != null && eVar != null) {
                C60735ab.m236001a(new RunnableC62169a(this, eVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$d */
    public static final class RunnableC62162d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156158a;

        RunnableC62162d(LocalShareCodeViewHolder eVar) {
            this.f156158a = eVar;
        }

        public final void run() {
            this.f156158a.f156133d = false;
            this.f156158a.mo215037g();
            this.f156158a.mo215026a(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$i */
    public static final class RunnableC62167i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156163a;

        RunnableC62167i(LocalShareCodeViewHolder eVar) {
            this.f156163a = eVar;
        }

        public final void run() {
            this.f156163a.f156133d = true;
            this.f156163a.mo215037g();
        }
    }

    /* renamed from: h */
    public final void mo215038h() {
        C26171w.m94675a(new RunnableC62162d(this));
    }

    /* renamed from: i */
    public final void mo215039i() {
        C26171w.m94675a(new RunnableC62167i(this));
    }

    /* renamed from: j */
    public final boolean mo215040j() {
        LocalShareCodeInputView2 localShareCodeInputView2 = this.f156132c;
        if (localShareCodeInputView2 != null) {
            return localShareCodeInputView2.mo217721e();
        }
        return true;
    }

    /* renamed from: e */
    public final void mo215035e() {
        String inputText;
        ILocalSharePrepareContract.IView bVar;
        LocalShareCodeInputView2 localShareCodeInputView2 = this.f156132c;
        if (localShareCodeInputView2 != null && (inputText = localShareCodeInputView2.getInputText()) != null && (bVar = this.f156144p) != null) {
            bVar.mo217792a(ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_SHARE_CODE, inputText, this.f156135f, null);
        }
    }

    /* renamed from: f */
    public final void mo215036f() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f156143o;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.height = 0;
        }
        View view2 = this.f156143o;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l */
    private final void m242738l() {
        IconFontView iconFontView;
        IconFontView iconFontView2;
        View view = this.f156138j;
        if (view != null) {
            iconFontView = (IconFontView) view.findViewById(R.id.go_back);
        } else {
            iconFontView = null;
        }
        this.f156140l = iconFontView;
        if (DesktopUtil.m144307b() && (iconFontView2 = this.f156140l) != null) {
            iconFontView2.setText(R.string.iconfont_icon_close);
        }
        IconFontView iconFontView3 = this.f156140l;
        if (iconFontView3 != null) {
            iconFontView3.setOnClickListener(new C62166h(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$g */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC62165g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156161a;

        ViewTreeObserver$OnGlobalLayoutListenerC62165g(LocalShareCodeViewHolder eVar) {
            this.f156161a = eVar;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            if (this.f156161a.f156130a != null) {
                Activity activity = this.f156161a.f156130a;
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                if (activity.getWindow() != null) {
                    Activity activity2 = this.f156161a.f156130a;
                    if (activity2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Window window = activity2.getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window, "activity!!.window");
                    window.getDecorView().getWindowVisibleDisplayFrame(rect);
                    int i = rect.bottom;
                    int i2 = this.f156161a.f156134e - i;
                    if (i2 > 200) {
                        this.f156161a.mo215030a(i2);
                        this.f156161a.f156134e = i;
                    } else if (i2 < -200) {
                        this.f156161a.mo215036f();
                        this.f156161a.f156134e = i;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo215033c() {
        View view;
        ViewTreeObserver viewTreeObserver;
        m242738l();
        ConstraintLayout constraintLayout = this.f156141m;
        if (constraintLayout != null) {
            constraintLayout.setEnabled(false);
        }
        LocalShareCodeInputView2 localShareCodeInputView2 = this.f156132c;
        if (localShareCodeInputView2 != null) {
            localShareCodeInputView2.setLocalShareInputListener(this);
        }
        LocalShareCodeInputView2 localShareCodeInputView22 = this.f156132c;
        if (localShareCodeInputView22 != null) {
            localShareCodeInputView22.setDialogInterface(this.f156131b);
        }
        LocalShareCodeInputView2 localShareCodeInputView23 = this.f156132c;
        if (localShareCodeInputView23 != null) {
            localShareCodeInputView23.setLocalSharePrepareView(this.f156144p);
        }
        View view2 = this.f156138j;
        if (view2 != null) {
            view2.setOnClickListener(new C62163e(this));
        }
        ConstraintLayout constraintLayout2 = this.f156141m;
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new C62164f(this));
        }
        if (!DesktopUtil.m144301a((Context) this.f156130a) && (view = this.f156138j) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC62165g(this));
        }
    }

    /* renamed from: d */
    public final void mo215034d() {
        LocalShareCodeInputView2.InputType inputType;
        ILocalSharePrepareContract.IView bVar;
        String str;
        LocalShareCodeInputView2 localShareCodeInputView2 = this.f156132c;
        String str2 = null;
        if (localShareCodeInputView2 != null) {
            inputType = localShareCodeInputView2.getInputType();
        } else {
            inputType = null;
        }
        if (inputType != null) {
            int i = C62171f.f156168a[inputType.ordinal()];
            if (i == 1) {
                LocalShareManager a = LocalShareManager.f156170b.mo215084a();
                LocalShareCodeInputView2 localShareCodeInputView22 = this.f156132c;
                if (localShareCodeInputView22 != null) {
                    str2 = localShareCodeInputView22.getInputText();
                }
                a.mo215080a(str2, new C62151b(this));
            } else if (i == 2 && (bVar = this.f156144p) != null) {
                LocalShareCodeInputView2 localShareCodeInputView23 = this.f156132c;
                if (localShareCodeInputView23 == null || (str = localShareCodeInputView23.getInputText()) == null) {
                    str = "";
                }
                bVar.mo217793a(str, new C62156c(this));
            }
        }
    }

    /* renamed from: g */
    public final void mo215037g() {
        LKUILottieAnimationView lKUILottieAnimationView;
        boolean z = false;
        if (!this.f156133d) {
            LKUILottieAnimationView lKUILottieAnimationView2 = this.f156142n;
            if (lKUILottieAnimationView2 != null) {
                z = lKUILottieAnimationView2.isAnimating();
            }
            if (z && (lKUILottieAnimationView = this.f156142n) != null) {
                lKUILottieAnimationView.cancelAnimation();
            }
            LKUILottieAnimationView lKUILottieAnimationView3 = this.f156142n;
            if (lKUILottieAnimationView3 != null) {
                lKUILottieAnimationView3.setVisibility(8);
            }
            ConstraintLayout constraintLayout = this.f156141m;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(R.drawable.bg_preview_meeting_btn_selector);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = this.f156141m;
        if (constraintLayout2 != null) {
            constraintLayout2.setBackgroundResource(R.drawable.bg_local_share_confirm_loading);
        }
        LKUILottieAnimationView lKUILottieAnimationView4 = this.f156142n;
        if (lKUILottieAnimationView4 != null) {
            lKUILottieAnimationView4.setVisibility(0);
        }
        LKUILottieAnimationView lKUILottieAnimationView5 = this.f156142n;
        if (lKUILottieAnimationView5 != null) {
            lKUILottieAnimationView5.playAnimation();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$init$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$e */
    public static final class C62163e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156159a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62163e(LocalShareCodeViewHolder eVar) {
            this.f156159a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Object obj;
            Activity activity = this.f156159a.f156130a;
            IBinder iBinder = null;
            if (activity != null) {
                obj = activity.getSystemService("input_method");
            } else {
                obj = null;
            }
            if (obj != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                if (inputMethodManager != null) {
                    View b = this.f156159a.mo215032b();
                    if (b != null) {
                        iBinder = b.getWindowToken();
                    }
                    inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$init$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$f */
    public static final class C62164f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156160a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62164f(LocalShareCodeViewHolder eVar) {
            this.f156160a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            boolean z;
            LocalShareCodeInputView2.InputType inputType;
            String inputText;
            C60700b.m235851b("LocalShareViewHolder@", "[onClick]", "confirm btn clicked");
            LocalShareCodeInputView2 localShareCodeInputView2 = this.f156160a.f156132c;
            if (!(localShareCodeInputView2 == null || (inputText = localShareCodeInputView2.getInputText()) == null || inputText.length() < 6)) {
                LocalShareCodeInputView2 localShareCodeInputView22 = this.f156160a.f156132c;
                if (localShareCodeInputView22 != null) {
                    localShareCodeInputView22.mo217717b();
                }
                this.f156160a.mo215039i();
                VideoChatService d = VideoChatService.m249602d();
                Intrinsics.checkExpressionValueIsNotNull(d, "VideoChatService.inst()");
                if (!d.mo220080a()) {
                    VideoChatService.m249602d().asyncCheckAndInit(new LocalShareCodeViewHolder$init$2$onSingleClick$$inlined$let$lambda$1(this));
                } else {
                    this.f156160a.mo215034d();
                }
            }
            String str = null;
            MeetingShareCodeEvent.f160894b.mo220394a().mo220393a("confirm", "none", null, this.f156160a.mo215029a());
            ShareCodeInputEvent a = ShareCodeInputEvent.f160810b.mo220238a();
            MeetingManager a2 = MeetingManager.m238341a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MeetingManager.getInstance()");
            if (a2.mo211908l() != null) {
                z = true;
            } else {
                z = false;
            }
            LocalShareCodeInputView2 localShareCodeInputView23 = this.f156160a.f156132c;
            if (localShareCodeInputView23 != null) {
                inputType = localShareCodeInputView23.getInputType();
            } else {
                inputType = null;
            }
            LocalShareCodeInputView2 localShareCodeInputView24 = this.f156160a.f156132c;
            if (localShareCodeInputView24 != null) {
                str = localShareCodeInputView24.getInputText();
            }
            a.mo220236a(z, inputType, str, this.f156160a.mo215029a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder$initBackView$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.e$h */
    public static final class C62166h extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeViewHolder f156162a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62166h(LocalShareCodeViewHolder eVar) {
            this.f156162a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            AbstractC61222a aVar = this.f156162a.f156131b;
            if (aVar != null) {
                aVar.dismiss();
            }
            LocalShareEvent.m249995a("close", this.f156162a.mo215029a());
            MeetingShareCodeEvent.f160894b.mo220394a().mo220393a("close", "none", null, this.f156162a.mo215029a());
        }
    }

    /* renamed from: a */
    public final void mo215031a(String str) {
        this.f156136h = str;
    }

    public LocalShareCodeViewHolder(ILocalSharePrepareContract.IView bVar) {
        this.f156144p = bVar;
    }

    @Override // com.ss.android.vc.meeting.module.localshare.ILocalShareInput
    /* renamed from: a */
    public void mo215026a(boolean z) {
        ConstraintLayout constraintLayout = this.f156141m;
        if (constraintLayout != null) {
            constraintLayout.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final void mo215030a(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f156143o;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.height = i;
        }
        View view2 = this.f156143o;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final View mo215028a(C61303k kVar, Context context, AbstractC61222a aVar) {
        LocalShareCodeInputView2 localShareCodeInputView2;
        ConstraintLayout constraintLayout;
        LKUILottieAnimationView lKUILottieAnimationView;
        View view;
        Activity b = C60773o.m236124b(context);
        this.f156130a = b;
        this.f156131b = aVar;
        this.f156139k = kVar;
        VideoChat videoChat = null;
        View inflate = LayoutInflater.from(b).inflate(R.layout.dialog_local_share_code, (ViewGroup) null);
        this.f156138j = inflate;
        if (inflate != null) {
            localShareCodeInputView2 = (LocalShareCodeInputView2) inflate.findViewById(R.id.code_input_view);
        } else {
            localShareCodeInputView2 = null;
        }
        this.f156132c = localShareCodeInputView2;
        View view2 = this.f156138j;
        if (view2 != null) {
            constraintLayout = (ConstraintLayout) view2.findViewById(R.id.btn_confirm);
        } else {
            constraintLayout = null;
        }
        this.f156141m = constraintLayout;
        View view3 = this.f156138j;
        if (view3 != null) {
            lKUILottieAnimationView = (LKUILottieAnimationView) view3.findViewById(R.id.view_loading);
        } else {
            lKUILottieAnimationView = null;
        }
        this.f156142n = lKUILottieAnimationView;
        View view4 = this.f156138j;
        if (view4 != null) {
            view = view4.findViewById(R.id.bottom_view);
        } else {
            view = null;
        }
        this.f156143o = view;
        mo215033c();
        MeetingShareCodeEvent a = MeetingShareCodeEvent.f160894b.mo220394a();
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        }
        a.mo220392a(videoChat, this.f156137i);
        return this.f156138j;
    }
}
