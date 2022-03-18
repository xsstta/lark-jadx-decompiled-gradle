package com.ss.android.vc.meeting.module.floatingwindow;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.AbstractC60877ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61660c;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vcxp.annotation.XMethod;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0010\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0007J\b\u0010%\u001a\u00020\u001bH\u0003J\u0006\u0010&\u001a\u00020\u001bJ\b\u0010'\u001a\u00020\u001bH\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/ss/android/vc/meeting/module/floatingwindow/LocalShareFloatWindow;", "Lcom/ss/android/vc/meeting/module/floatingwindow/BaseFloatWindow;", "present", "Lcom/ss/android/vc/meeting/module/floatingwindow/IFloatWindowPresent;", "floatWindowType", "Lcom/ss/android/vc/meeting/module/floatingwindow/IFloatWindowPresent$FloatWindowType;", "(Lcom/ss/android/vc/meeting/module/floatingwindow/IFloatWindowPresent;Lcom/ss/android/vc/meeting/module/floatingwindow/IFloatWindowPresent$FloatWindowType;)V", "bubbleFloatWindow", "Lcom/ss/android/vc/meeting/module/floatingwindow/IBubbleFloatWindowPresent;", "getBubbleFloatWindow", "()Lcom/ss/android/vc/meeting/module/floatingwindow/IBubbleFloatWindowPresent;", "setBubbleFloatWindow", "(Lcom/ss/android/vc/meeting/module/floatingwindow/IBubbleFloatWindowPresent;)V", "fastEntryWindow", "Lcom/ss/android/vc/meeting/module/fastentry/IFastEntryWindowPresent;", "getFastEntryWindow", "()Lcom/ss/android/vc/meeting/module/fastentry/IFastEntryWindowPresent;", "setFastEntryWindow", "(Lcom/ss/android/vc/meeting/module/fastentry/IFastEntryWindowPresent;)V", "mMultiTaskFloating", "", "shouldScheduleProcess", "getShouldScheduleProcess", "()Z", "setShouldScheduleProcess", "(Z)V", "dismiss", "", "getFloatWindow", "initView", "meetingForeground", "meetingWakeUp", "onViewClicked", "v", "Landroid/view/View;", "playBubbleShowAnimation", "release", "returnToVideoChatFragment", "show", "tryPerformClick", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.floatingwindow.i */
public final class LocalShareFloatWindow extends AbstractC61729b {

    /* renamed from: e */
    public static final Companion f154910e = new Companion(null);

    /* renamed from: d */
    public boolean f154911d;

    /* renamed from: f */
    private AbstractC61732e f154912f;

    /* renamed from: g */
    private AbstractC61660c f154913g;

    /* renamed from: h */
    private boolean f154914h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/floatingwindow/LocalShareFloatWindow$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final AbstractC61732e mo213822d() {
        return this.f154912f;
    }

    /* renamed from: h */
    public final AbstractC61660c mo213823h() {
        return this.f154913g;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.i$b */
    public static final class RunnableC61736b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LocalShareFloatWindow f154915a;

        RunnableC61736b(LocalShareFloatWindow iVar) {
            this.f154915a = iVar;
        }

        public final void run() {
            this.f154915a.returnToVideoChatFragment();
        }
    }

    /* renamed from: p */
    public final void mo213826p() {
        C60700b.m235851b("LocalShareFloatWindow@", "[meetingWakeUp]", "meetingWakeUp");
        m241000t();
    }

    @XMethod(isReleaseMethod = true)
    public final void release() {
        IFloatWindowPresent iFloatWindowPresent = this.f154904a;
        Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent, "mPresent");
        iFloatWindowPresent.mo213670o().removeAllViews();
        this.f154906c = null;
    }

    @XMethod
    public final void returnToVideoChatFragment() {
        ByteRTCMeetingActivity.Companion aVar = ByteRTCMeetingActivity.f157054h;
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        aVar.mo215867a(e);
        mo213825o();
    }

    /* renamed from: s */
    private final void m240999s() {
        if (mo213814f() == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            IFloatWindowPresent iFloatWindowPresent = this.f154904a;
            if (iFloatWindowPresent != null) {
                this.f154912f = (AbstractC61732e) iFloatWindowPresent;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.floatingwindow.IBubbleFloatWindowPresent");
        } else if (mo213814f() == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            IFloatWindowPresent iFloatWindowPresent2 = this.f154904a;
            if (iFloatWindowPresent2 != null) {
                this.f154913g = (AbstractC61660c) iFloatWindowPresent2;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.fastentry.IFastEntryWindowPresent");
        }
    }

    /* renamed from: i */
    public final void mo213824i() {
        C60700b.m235851b("LocalShareFloatWindow@", "[show]", "show");
        m240997q();
        m240999s();
        ViewGroup viewGroup = this.f154906c;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new C61739e(this));
        }
        this.f154904a.mo213667l();
        m240998r();
    }

    /* renamed from: o */
    public final void mo213825o() {
        AbstractC61660c cVar;
        C60700b.m235851b("LocalShareFloatWindow@", "[dismiss]", "dismiss");
        if (this.f154905b == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            AbstractC61732e eVar = this.f154912f;
            if (eVar != null) {
                eVar.mo213677s();
            }
        } else if (this.f154905b == IFloatWindowPresent.FloatWindowType.FAST_ENTRY && (cVar = this.f154913g) != null) {
            cVar.dismissFastEntry();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.i$c */
    public static final class RunnableC61737c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LocalShareFloatWindow f154916a;

        RunnableC61737c(LocalShareFloatWindow iVar) {
            this.f154916a = iVar;
        }

        public final void run() {
            C60700b.m235851b("LocalShareFloatWindow@", "[playBubbleShowAnimation2]", "bubble showFloat, " + this.f154916a.f154911d);
            AbstractC61732e d = this.f154916a.mo213822d();
            if (d != null) {
                d.mo213676r();
            }
            if (this.f154916a.f154906c == null) {
                return;
            }
            if (this.f154916a.f154911d) {
                ViewGroup viewGroup = this.f154916a.f154906c;
                Intrinsics.checkExpressionValueIsNotNull(viewGroup, "contentView");
                viewGroup.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f154916a.f154906c, "translationX", (float) UIHelper.getDimens(R.dimen.fv_width), 0.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animIn");
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.start();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.i$d */
    public static final class RunnableC61738d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LocalShareFloatWindow f154917a;

        RunnableC61738d(LocalShareFloatWindow iVar) {
            this.f154917a = iVar;
        }

        public final void run() {
            C60700b.m235851b("LocalShareFloatWindow@", "[playBubbleShowAnimation3]", "fast entry showFloat, " + this.f154917a.f154911d);
            AbstractC61660c h = this.f154917a.mo213823h();
            if (h != null) {
                h.showFastEntry();
            }
            if (this.f154917a.f154906c == null) {
                return;
            }
            if (this.f154917a.f154911d) {
                ViewGroup viewGroup = this.f154917a.f154906c;
                Intrinsics.checkExpressionValueIsNotNull(viewGroup, "contentView");
                viewGroup.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f154917a.f154906c, "translationX", (float) UIHelper.getDimens(R.dimen.fv_width), 0.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animIn");
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.start();
        }
    }

    /* renamed from: r */
    private final void m240998r() {
        C60700b.m235851b("LocalShareFloatWindow@", "[playBubbleShowAnimation]", String.valueOf(this.f154911d));
        Boolean bool = null;
        if (this.f154905b == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            AbstractC61732e eVar = this.f154912f;
            if (eVar != null) {
                bool = Boolean.valueOf(eVar.mo213675q());
            }
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            if (!bool.booleanValue()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC61737c(this), 300);
            }
        } else if (this.f154905b == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            AbstractC61660c cVar = this.f154913g;
            if (cVar != null) {
                bool = Boolean.valueOf(cVar.isFastEntryShown());
            }
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            if (!bool.booleanValue()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC61738d(this), 300);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r0.booleanValue() == false) goto L_0x0020;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m241000t() {
        /*
            r3 = this;
            com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent$FloatWindowType r0 = r3.f154905b
            com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent$FloatWindowType r1 = com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent.FloatWindowType.BUBBLE
            r2 = 0
            if (r0 != r1) goto L_0x0020
            com.ss.android.vc.meeting.module.floatingwindow.e r0 = r3.f154912f
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.mo213675q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            if (r0 != 0) goto L_0x001a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x001a:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003d
        L_0x0020:
            com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent$FloatWindowType r0 = r3.f154905b
            com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent$FloatWindowType r1 = com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent.FloatWindowType.FAST_ENTRY
            if (r0 != r1) goto L_0x0057
            com.ss.android.vc.meeting.module.fastentry.c r0 = r3.f154913g
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.isFastEntryShown()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0032:
            if (r2 != 0) goto L_0x0037
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0037:
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L_0x0057
        L_0x003d:
            android.view.ViewGroup r0 = r3.f154906c
            java.lang.String r1 = "contentView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0057
            android.view.ViewGroup r0 = r3.f154906c
            boolean r0 = r0.hasOnClickListeners()
            if (r0 == 0) goto L_0x0057
            android.view.ViewGroup r0 = r3.f154906c
            r0.callOnClick()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.floatingwindow.LocalShareFloatWindow.m241000t():void");
    }

    /* renamed from: q */
    private final void m240997q() {
        TextView textView;
        Drawable drawable;
        int i;
        int i2;
        int i3;
        AbstractC62612a aj;
        ViewGroup viewGroup = this.f154906c;
        if (viewGroup == null || viewGroup == null) {
            IFloatWindowPresent iFloatWindowPresent = this.f154904a;
            Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent, "mPresent");
            iFloatWindowPresent.mo213670o().removeAllViews();
            LayoutInflater from = LayoutInflater.from(ar.m236694a());
            IFloatWindowPresent iFloatWindowPresent2 = this.f154904a;
            Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent2, "mPresent");
            boolean z = true;
            this.f154906c = (ViewGroup) from.inflate(R.layout.layout_local_share_float_view, (ViewGroup) iFloatWindowPresent2.mo213670o(), true);
            IFloatWindowPresent iFloatWindowPresent3 = this.f154904a;
            Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent3, "mPresent");
            C61303k m = iFloatWindowPresent3.mo213668m();
            if (m == null || (aj = m.aj()) == null || !aj.mo216408a()) {
                z = false;
            }
            ViewGroup viewGroup2 = this.f154906c;
            ImageView imageView = null;
            if (viewGroup2 != null) {
                textView = (TextView) viewGroup2.findViewById(R.id.sharing_status_tv);
            } else {
                textView = null;
            }
            ViewGroup viewGroup3 = this.f154906c;
            if (viewGroup3 != null) {
                imageView = (ImageView) viewGroup3.findViewById(R.id.sharing_status_icon);
            }
            if (textView != null) {
                if (z) {
                    i2 = R.string.View_G_ScreenSharingToRoom;
                } else {
                    i2 = R.string.View_MV_SharingNotStarted;
                }
                textView.setText(C60773o.m236119a(i2));
                if (z) {
                    i3 = R.color.function_success_600;
                } else {
                    i3 = R.color.text_placeholder;
                }
                textView.setTextColor(C60773o.m236126d(i3));
            }
            if (imageView != null && (drawable = imageView.getDrawable()) != null) {
                if (z) {
                    i = R.color.function_success_500;
                } else {
                    i = R.color.icon_n3;
                }
                drawable.setTint(C60773o.m236126d(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo213821a(boolean z) {
        this.f154914h = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/floatingwindow/LocalShareFloatWindow$show$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.i$e */
    public static final class C61739e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalShareFloatWindow f154918a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61739e(LocalShareFloatWindow iVar) {
            this.f154918a = iVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f154918a.mo213820a(view);
        }
    }

    /* renamed from: a */
    public final void mo213820a(View view) {
        C60700b.m235851b("LocalShareFloatWindow@", "[onViewClicked]", "onViewClicked");
        int[] iArr = new int[2];
        if (mo213814f() == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            AbstractC61732e eVar = this.f154912f;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            if (eVar.mo213580f() != null) {
                AbstractC61732e eVar2 = this.f154912f;
                if (eVar2 == null) {
                    Intrinsics.throwNpe();
                }
                eVar2.mo213580f().getLocationOnScreen(iArr);
            }
        } else if (mo213814f() == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            AbstractC61660c cVar = this.f154913g;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            if (cVar.mo213580f() != null) {
                AbstractC61660c cVar2 = this.f154913g;
                if (cVar2 == null) {
                    Intrinsics.throwNpe();
                }
                cVar2.mo213580f().getLocationOnScreen(iArr);
            }
        }
        if (this.f154911d || iArr[0] <= C60776r.m236139a() / 2) {
            returnToVideoChatFragment();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f154906c, "translationX", 0.0f, (float) UIHelper.getDimens(R.dimen.fv_width));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animOut");
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.start();
        this.f154906c.postDelayed(new RunnableC61736b(this), 100);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalShareFloatWindow(IFloatWindowPresent iFloatWindowPresent, IFloatWindowPresent.FloatWindowType floatWindowType) {
        super(iFloatWindowPresent, floatWindowType);
        Intrinsics.checkParameterIsNotNull(iFloatWindowPresent, "present");
        Intrinsics.checkParameterIsNotNull(floatWindowType, "floatWindowType");
        AbstractC60877ac multiTaskDependency = VideoChatModuleDependency.getMultiTaskDependency();
        Intrinsics.checkExpressionValueIsNotNull(multiTaskDependency, "VideoChatModuleDependency.getMultiTaskDependency()");
        this.f154911d = multiTaskDependency.mo196453b();
    }
}
