package com.ss.android.vc.meeting.module.landscapefloater;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.widget.VCFloatLayout;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.content.ContentViewType;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.bottombar.ILocalMicCameraListener;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001NB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0016J\b\u00106\u001a\u00020 H\u0016J\u0010\u00107\u001a\u0002032\u0006\u00108\u001a\u00020 H\u0016J\u0018\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020 H\u0016J\u0010\u0010<\u001a\u0002032\u0006\u00108\u001a\u00020 H\u0002J\u0012\u0010=\u001a\u0002032\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000203H\u0016J\b\u0010D\u001a\u000203H\u0016J\u0010\u0010E\u001a\u0002032\u0006\u0010F\u001a\u00020BH\u0016J\u0010\u0010G\u001a\u0002032\u0006\u0010H\u001a\u00020 H\u0016J\u0010\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020 H\u0016J\u000e\u0010K\u001a\u0002032\u0006\u0010L\u001a\u00020\bJ\u0010\u0010M\u001a\u0002032\u0006\u0010J\u001a\u00020 H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/ss/android/vc/meeting/module/landscapefloater/LandscapeFloatToolbarViewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseViewControl;", "Lcom/ss/android/vc/meeting/module/bottombar/ILocalMicCameraListener;", "Lcom/ss/android/vc/meeting/module/landscapefloater/ILandscapeFloatToolbarListener;", "present", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;)V", "contentViewType", "Lcom/ss/android/vc/meeting/module/base/content/ContentViewType;", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "setDivider", "(Landroid/view/View;)V", "expandContainer", "getExpandContainer", "setExpandContainer", "expandIcon", "Landroid/widget/ImageView;", "getExpandIcon", "()Landroid/widget/ImageView;", "setExpandIcon", "(Landroid/widget/ImageView;)V", "floaterContainer", "Lcom/ss/android/vc/common/widget/VCFloatLayout;", "getFloaterContainer", "()Lcom/ss/android/vc/common/widget/VCFloatLayout;", "setFloaterContainer", "(Lcom/ss/android/vc/common/widget/VCFloatLayout;)V", "floaterContent", "isLandscapeMode", "", "()Z", "setLandscapeMode", "(Z)V", "micContainer", "getMicContainer", "setMicContainer", "micIcon", "getMicIcon", "setMicIcon", "micWarning", "Landroidx/appcompat/widget/AppCompatImageView;", "getMicWarning", "()Landroidx/appcompat/widget/AppCompatImageView;", "setMicWarning", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "needReLayout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "adjustForLandscape", "", "adjustForPortrait", "destroy", "onBackPressed", "onLocalMicChanged", "isAudioMuted", "onOrientation", "isLandscape", "isRotate", "refreshMicIcon", "reinitFloatContainer", "listener", "Lcom/ss/android/vc/common/widget/VCFloatLayout$IReInitListener;", "setBottomMargin", "bottom", "", "setContentLocationWhenSketchOff", "setContentLocationWhenSketchOn", "setContentTopMargin", "top", "setNeedReLayout", "needRelayout", "showDivider", "show", "showFloat", ShareHitPoint.f121869d, "showMicContainer", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.h.b */
public final class LandscapeFloatToolbarViewControl extends AbstractC61424d implements ILocalMicCameraListener, ILandscapeFloatToolbarListener {

    /* renamed from: b */
    public static final float f155498b = 86.0f;

    /* renamed from: c */
    public static final float f155499c = 124.0f;

    /* renamed from: d */
    public static final Companion f155500d = new Companion(null);

    /* renamed from: o */
    private static final String f155501o = f155501o;

    /* renamed from: a */
    public ContentViewType f155502a;

    /* renamed from: e */
    private View f155503e;

    /* renamed from: f */
    private View f155504f;

    /* renamed from: g */
    private View f155505g;

    /* renamed from: h */
    private ImageView f155506h;

    /* renamed from: i */
    private VCFloatLayout f155507i;

    /* renamed from: j */
    private ImageView f155508j;

    /* renamed from: k */
    private AppCompatImageView f155509k;

    /* renamed from: l */
    private boolean f155510l;

    /* renamed from: m */
    private View f155511m;

    /* renamed from: n */
    private AtomicBoolean f155512n = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/landscapefloater/LandscapeFloatToolbarViewControl$Companion;", "", "()V", "LANDSCAPE_BOTTOM_PADDING_WHEN_SKETCH", "", "PORTRAINT_BOTTOM_PADDING_WHEN_SKETCH", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.h.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final VCFloatLayout mo214410c() {
        return this.f155507i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/landscapefloater/LandscapeFloatToolbarViewControl$adjustForPortrait$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.h.b$c */
    public static final class ViewTreeObserver$OnPreDrawListenerC61922c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ LandscapeFloatToolbarViewControl f155517a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onReInitFinished"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.h.b$c$a */
        static final class C61923a implements VCFloatLayout.AbstractC60820a {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC61922c f155518a;

            C61923a(ViewTreeObserver$OnPreDrawListenerC61922c cVar) {
                this.f155518a = cVar;
            }

            @Override // com.ss.android.vc.common.widget.VCFloatLayout.AbstractC60820a
            /* renamed from: a */
            public final void mo208539a() {
                this.f155518a.f155517a.mo214409b(0);
            }
        }

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            VCFloatLayout c = this.f155517a.mo214410c();
            if (!(c == null || (viewTreeObserver = c.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f155517a.mo214407a(new C61923a(this));
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC61922c(LandscapeFloatToolbarViewControl bVar) {
            this.f155517a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onReInitFinished", "com/ss/android/vc/meeting/module/landscapefloater/LandscapeFloatToolbarViewControl$setContentLocationWhenSketchOff$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.h.b$d */
    static final class C61924d implements VCFloatLayout.AbstractC60820a {

        /* renamed from: a */
        final /* synthetic */ LandscapeFloatToolbarViewControl f155519a;

        /* renamed from: b */
        final /* synthetic */ Integer f155520b;

        C61924d(LandscapeFloatToolbarViewControl bVar, Integer num) {
            this.f155519a = bVar;
            this.f155520b = num;
        }

        @Override // com.ss.android.vc.common.widget.VCFloatLayout.AbstractC60820a
        /* renamed from: a */
        public final void mo208539a() {
            this.f155519a.mo214406a(this.f155520b.intValue());
        }
    }

    /* renamed from: d */
    public boolean mo214413d() {
        if (!C61999a.m242220f()) {
            return false;
        }
        View view = this.f155503e;
        if (view == null) {
            return true;
        }
        view.performClick();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/landscapefloater/LandscapeFloatToolbarViewControl$adjustForLandscape$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.h.b$b */
    public static final class ViewTreeObserver$OnPreDrawListenerC61920b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ LandscapeFloatToolbarViewControl f155515a;

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            VCFloatLayout c = this.f155515a.mo214410c();
            if (!(c == null || (viewTreeObserver = c.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f155515a.mo214407a(new C61921a(this));
            return false;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onReInitFinished"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.h.b$b$a */
        static final class C61921a implements VCFloatLayout.AbstractC60820a {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC61920b f155516a;

            C61921a(ViewTreeObserver$OnPreDrawListenerC61920b bVar) {
                this.f155516a = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
                if (r3 == com.ss.android.vc.entity.follow.FollowInfo.ShareSubType.CCM_BITABLE) goto L_0x0051;
             */
            @Override // com.ss.android.vc.common.widget.VCFloatLayout.AbstractC60820a
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo208539a() {
                /*
                // Method dump skipped, instructions count: 104
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.landscapefloater.LandscapeFloatToolbarViewControl.ViewTreeObserver$OnPreDrawListenerC61920b.C61921a.mo208539a():void");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC61920b(LandscapeFloatToolbarViewControl bVar) {
            this.f155515a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onReInitFinished", "com/ss/android/vc/meeting/module/landscapefloater/LandscapeFloatToolbarViewControl$setContentLocationWhenSketchOn$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.h.b$e */
    static final class C61925e implements VCFloatLayout.AbstractC60820a {

        /* renamed from: a */
        final /* synthetic */ Integer f155521a;

        /* renamed from: b */
        final /* synthetic */ LandscapeFloatToolbarViewControl f155522b;

        /* renamed from: c */
        final /* synthetic */ Integer f155523c;

        /* renamed from: d */
        final /* synthetic */ Integer f155524d;

        C61925e(Integer num, LandscapeFloatToolbarViewControl bVar, Integer num2, Integer num3) {
            this.f155521a = num;
            this.f155522b = bVar;
            this.f155523c = num2;
            this.f155524d = num3;
        }

        @Override // com.ss.android.vc.common.widget.VCFloatLayout.AbstractC60820a
        /* renamed from: a */
        public final void mo208539a() {
            Integer num = this.f155521a;
            if (num != null) {
                num.intValue();
                if (this.f155521a.intValue() + UIHelper.dp2px(12.0f) < this.f155523c.intValue() + UIHelper.dp2px(-38.0f)) {
                    this.f155522b.mo214406a(this.f155524d.intValue());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onReInitFinished", "com/ss/android/vc/meeting/module/landscapefloater/LandscapeFloatToolbarViewControl$setContentLocationWhenSketchOn$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.h.b$f */
    static final class C61926f implements VCFloatLayout.AbstractC60820a {

        /* renamed from: a */
        final /* synthetic */ LandscapeFloatToolbarViewControl f155525a;

        /* renamed from: b */
        final /* synthetic */ Integer f155526b;

        /* renamed from: c */
        final /* synthetic */ Integer f155527c;

        C61926f(LandscapeFloatToolbarViewControl bVar, Integer num, Integer num2) {
            this.f155525a = bVar;
            this.f155526b = num;
            this.f155527c = num2;
        }

        @Override // com.ss.android.vc.common.widget.VCFloatLayout.AbstractC60820a
        /* renamed from: a */
        public final void mo208539a() {
            if (this.f155527c.intValue() + UIHelper.dp2px(116.0f) < this.f155526b.intValue() + UIHelper.dp2px(4.0f)) {
                this.f155525a.mo214406a(this.f155527c.intValue());
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.landscapefloater.ILandscapeFloatToolbarListener
    /* renamed from: b */
    public void mo214404b() {
        Integer num;
        View contentView;
        VCFloatLayout vCFloatLayout = this.f155507i;
        if (vCFloatLayout == null || (contentView = vCFloatLayout.getContentView()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(contentView.getTop());
        }
        if (num != null) {
            num.intValue();
            if (!C61999a.m242220f()) {
                mo214411c(false);
                mo214412d(false);
            }
            View view = this.f155511m;
            if (view != null) {
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                int paddingLeft = view.getPaddingLeft();
                View view2 = this.f155511m;
                if (view2 == null) {
                    Intrinsics.throwNpe();
                }
                int paddingTop = view2.getPaddingTop();
                View view3 = this.f155511m;
                if (view3 == null) {
                    Intrinsics.throwNpe();
                }
                view.setPadding(paddingLeft, paddingTop, view3.getPaddingRight(), UIHelper.dp2px(12.0f));
            }
            mo214407a(new C61924d(this, num));
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C60700b.m235851b(f155501o, "[destroy]", "destroy");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ai().mo213016b(this);
        VCFloatLayout vCFloatLayout = this.f155507i;
        if (vCFloatLayout != null) {
            C60752f.m236081b((View) vCFloatLayout);
        }
        View view = null;
        this.f155503e = view;
        this.f155504f = view;
        this.f155505g = view;
        ImageView imageView = null;
        this.f155506h = imageView;
        this.f155507i = null;
        this.f155508j = imageView;
        this.f155510l = false;
        this.f155502a = null;
        this.f155511m = view;
    }

    /* renamed from: f */
    private final void m241897f() {
        ViewTreeObserver viewTreeObserver;
        View view;
        Drawable drawable;
        C60700b.m235851b(f155501o, "[adjustForPortrait]", "start");
        View view2 = this.f155511m;
        if (view2 != null) {
            view2.setPadding(UIHelper.dp2px(12.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(12.0f));
        }
        if (this.f155502a == ContentViewType.SHARE_SCREEN) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbsSketchControl ag = meeting.ag();
            Intrinsics.checkExpressionValueIsNotNull(ag, "meeting.sketchControl");
            if (ag.isSketchOn()) {
                View view3 = this.f155504f;
                if (view3 != null) {
                    C60752f.m236079a(view3);
                }
                View view4 = this.f155505g;
                if (view4 != null) {
                    C60752f.m236079a(view4);
                }
            } else {
                View view5 = this.f155504f;
                if (view5 != null) {
                    C60752f.m236083c(view5);
                }
                View view6 = this.f155505g;
                if (view6 != null) {
                    C60752f.m236083c(view6);
                }
            }
            View view7 = this.f155503e;
            if (view7 != null) {
                C60752f.m236079a(view7);
            }
            ImageView imageView = this.f155506h;
            if (imageView != null) {
                imageView.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_expand_outlined));
            }
            ImageView imageView2 = this.f155506h;
            if (!(imageView2 == null || (drawable = imageView2.getDrawable()) == null)) {
                drawable.setTint(C60773o.m236126d(R.color.primary_pri_500));
            }
        } else {
            View view8 = this.f155504f;
            if (view8 != null) {
                C60752f.m236083c(view8);
            }
            View view9 = this.f155505g;
            if (view9 != null) {
                C60752f.m236083c(view9);
            }
            View view10 = this.f155503e;
            if (view10 != null) {
                C60752f.m236083c(view10);
            }
        }
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        AbsSketchControl ag2 = meeting2.ag();
        Intrinsics.checkExpressionValueIsNotNull(ag2, "meeting.sketchControl");
        if (ag2.isSketchOn() && (view = this.f155511m) != null) {
            if (view == null) {
                Intrinsics.throwNpe();
            }
            int paddingLeft = view.getPaddingLeft();
            View view11 = this.f155511m;
            if (view11 == null) {
                Intrinsics.throwNpe();
            }
            int paddingTop = view11.getPaddingTop();
            View view12 = this.f155511m;
            if (view12 == null) {
                Intrinsics.throwNpe();
            }
            view.setPadding(paddingLeft, paddingTop, view12.getPaddingRight(), UIHelper.dp2px(f155499c));
        }
        VCFloatLayout vCFloatLayout = this.f155507i;
        if (vCFloatLayout != null && (viewTreeObserver = vCFloatLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC61922c(this));
        }
    }

    @Override // com.ss.android.vc.meeting.module.landscapefloater.ILandscapeFloatToolbarListener
    /* renamed from: a */
    public void mo214403a() {
        Integer num;
        Integer num2;
        View contentView;
        View contentView2;
        if (this.f155512n.get()) {
            VCFloatLayout vCFloatLayout = this.f155507i;
            Integer num3 = null;
            if (vCFloatLayout != null) {
                num = Integer.valueOf(vCFloatLayout.getHeight());
            } else {
                num = null;
            }
            VCFloatLayout vCFloatLayout2 = this.f155507i;
            if (vCFloatLayout2 == null || (contentView2 = vCFloatLayout2.getContentView()) == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(contentView2.getTop());
            }
            if (num != null) {
                if (num2 != null) {
                    num2.intValue();
                    if (C61999a.m242220f()) {
                        View view = this.f155511m;
                        if (view != null) {
                            if (view == null) {
                                Intrinsics.throwNpe();
                            }
                            int paddingLeft = view.getPaddingLeft();
                            View view2 = this.f155511m;
                            if (view2 == null) {
                                Intrinsics.throwNpe();
                            }
                            int paddingTop = view2.getPaddingTop();
                            View view3 = this.f155511m;
                            if (view3 == null) {
                                Intrinsics.throwNpe();
                            }
                            view.setPadding(paddingLeft, paddingTop, view3.getPaddingRight(), UIHelper.dp2px(f155498b));
                        }
                        VCFloatLayout vCFloatLayout3 = this.f155507i;
                        if (!(vCFloatLayout3 == null || (contentView = vCFloatLayout3.getContentView()) == null)) {
                            num3 = Integer.valueOf(contentView.getBottom());
                        }
                        mo214407a(new C61925e(num3, this, num, num2));
                    } else {
                        mo214411c(true);
                        mo214412d(true);
                        View view4 = this.f155511m;
                        if (view4 != null) {
                            if (view4 == null) {
                                Intrinsics.throwNpe();
                            }
                            int paddingLeft2 = view4.getPaddingLeft();
                            View view5 = this.f155511m;
                            if (view5 == null) {
                                Intrinsics.throwNpe();
                            }
                            int paddingTop2 = view5.getPaddingTop();
                            View view6 = this.f155511m;
                            if (view6 == null) {
                                Intrinsics.throwNpe();
                            }
                            view4.setPadding(paddingLeft2, paddingTop2, view6.getPaddingRight(), UIHelper.dp2px(f155499c));
                        }
                        mo214407a(new C61926f(this, num, num2));
                    }
                }
                this.f155512n.set(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (r5 == com.ss.android.vc.entity.follow.FollowInfo.ShareSubType.CCM_BITABLE) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0101  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m241895e() {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.landscapefloater.LandscapeFloatToolbarViewControl.m241895e():void");
    }

    @Override // com.ss.android.vc.meeting.module.landscapefloater.ILandscapeFloatToolbarListener
    /* renamed from: b */
    public void mo214405b(boolean z) {
        this.f155512n.set(z);
    }

    /* renamed from: a */
    public void mo214407a(VCFloatLayout.AbstractC60820a aVar) {
        C60700b.m235851b(f155501o, "[reinitFloatContainer]", "start");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 85;
        VCFloatLayout vCFloatLayout = this.f155507i;
        if (vCFloatLayout != null) {
            vCFloatLayout.mo208525a(layoutParams, aVar);
        }
    }

    /* renamed from: a */
    public final void mo214408a(ContentViewType contentViewType) {
        Intrinsics.checkParameterIsNotNull(contentViewType, ShareHitPoint.f121869d);
        String str = f155501o;
        C60700b.m235851b(str, "[showFloat]", "type = " + contentViewType);
        this.f155502a = contentViewType;
        if (C61999a.m242220f()) {
            m241895e();
        } else {
            m241897f();
        }
        VCFloatLayout vCFloatLayout = this.f155507i;
        if (vCFloatLayout != null) {
            C60752f.m236079a((View) vCFloatLayout);
        }
    }

    /* renamed from: b */
    public void mo214409b(int i) {
        String str = f155501o;
        C60700b.m235851b(str, "[setBottomMargin]", "bottom = " + i);
        VCFloatLayout vCFloatLayout = this.f155507i;
        if (vCFloatLayout != null) {
            vCFloatLayout.mo208523a(i, (Integer) 5);
        }
    }

    /* renamed from: c */
    public void mo214411c(boolean z) {
        String str = f155501o;
        C60700b.m235851b(str, "[showMicContainer]", "show = " + z);
        if (z) {
            View view = this.f155504f;
            if (view != null) {
                C60752f.m236079a(view);
                return;
            }
            return;
        }
        View view2 = this.f155504f;
        if (view2 != null) {
            C60752f.m236083c(view2);
        }
    }

    /* renamed from: d */
    public void mo214412d(boolean z) {
        String str = f155501o;
        C60700b.m235851b(str, "[showDivider]", "show = " + z);
        if (z) {
            View view = this.f155505g;
            if (view != null) {
                C60752f.m236079a(view);
                return;
            }
            return;
        }
        View view2 = this.f155505g;
        if (view2 != null) {
            C60752f.m236083c(view2);
        }
    }

    /* renamed from: e */
    private final void m241896e(boolean z) {
        Drawable drawable;
        int i;
        Drawable drawable2;
        C60700b.m235851b(f155501o, "[refreshMicIcon]", "refresh");
        if (C60788y.m236250b(ar.m236694a())) {
            AppCompatImageView appCompatImageView = this.f155509k;
            if (appCompatImageView != null) {
                C60752f.m236083c(appCompatImageView);
            }
            if (z) {
                drawable = C60773o.m236128f(R.drawable.ud_icon_mic_off_filled);
                Intrinsics.checkExpressionValueIsNotNull(drawable, "VCCommonUtils.getDrawabl…e.ud_icon_mic_off_filled)");
                i = C60773o.m236126d(R.color.function_danger_500);
            } else {
                drawable = C60773o.m236128f(R.drawable.ud_icon_mic_filled);
                Intrinsics.checkExpressionValueIsNotNull(drawable, "VCCommonUtils.getDrawabl…wable.ud_icon_mic_filled)");
                i = C60773o.m236126d(R.color.ud_N700);
            }
        } else {
            AppCompatImageView appCompatImageView2 = this.f155509k;
            if (appCompatImageView2 != null) {
                C60752f.m236079a((View) appCompatImageView2);
            }
            drawable = C60773o.m236128f(R.drawable.ud_icon_mic_off_filled);
            Intrinsics.checkExpressionValueIsNotNull(drawable, "VCCommonUtils.getDrawabl…e.ud_icon_mic_off_filled)");
            i = C60773o.m236126d(R.color.icon_disable);
        }
        if (drawable != null) {
            ImageView imageView = this.f155508j;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            ImageView imageView2 = this.f155508j;
            if (imageView2 != null && (drawable2 = imageView2.getDrawable()) != null) {
                drawable2.setTint(i);
            }
        }
    }

    /* renamed from: a */
    public void mo214406a(int i) {
        ViewGroup.LayoutParams layoutParams;
        VCFloatLayout vCFloatLayout;
        View contentView;
        View contentView2;
        C60700b.m235851b(f155501o, "[setContentTopMargin]", "top = " + i);
        VCFloatLayout vCFloatLayout2 = this.f155507i;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (vCFloatLayout2 == null || (contentView2 = vCFloatLayout2.getContentView()) == null) {
            layoutParams = null;
        } else {
            layoutParams = contentView2.getLayoutParams();
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        if (layoutParams3 != null) {
            layoutParams3.gravity |= 48;
        }
        if (layoutParams3 != null) {
            layoutParams3.topMargin = i;
        }
        if (layoutParams3 != null && (vCFloatLayout = this.f155507i) != null && (contentView = vCFloatLayout.getContentView()) != null) {
            contentView.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LandscapeFloatToolbarViewControl(AbstractC61429i iVar) {
        super(iVar);
        Intrinsics.checkParameterIsNotNull(iVar, "present");
        String str = f155501o;
        C60700b.m235851b(str, "[init]", "start");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ai().mo213008a(this);
        ViewStub viewStub = (ViewStub) getRootView().findViewById(R.id.fv_landscape_folder_viewstub);
        if (viewStub != null) {
            C60700b.m235851b(str, "[showFloater]", "inflateStubView");
            C60740ad.m236052b(viewStub);
        }
        this.f155507i = (VCFloatLayout) getRootView().findViewById(R.id.fv_landscape_folder);
        this.f155503e = getRootView().findViewById(R.id.fv_landscape_folder_expand_container);
        this.f155504f = getRootView().findViewById(R.id.fv_landscape_folder_mic_container);
        this.f155505g = getRootView().findViewById(R.id.fv_landscape_folder_divider);
        this.f155506h = (ImageView) getRootView().findViewById(R.id.fv_landscape_folder_expand_icon);
        this.f155508j = (ImageView) getRootView().findViewById(R.id.fv_landscape_floater_mic_icon);
        this.f155511m = getRootView().findViewById(R.id.fv_landscape_folder_content_layout);
        View view = this.f155504f;
        if (view != null) {
            view.setOnClickListener(new OnSingleClickListener(this) {
                /* class com.ss.android.vc.meeting.module.landscapefloater.LandscapeFloatToolbarViewControl.C619181 */

                /* renamed from: a */
                final /* synthetic */ LandscapeFloatToolbarViewControl f155513a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f155513a = r1;
                }

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C61303k meeting = this.f155513a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                    meeting.ai().mo213025e();
                }
            });
        }
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        m241896e(aVar.mo212853b(meeting2));
        View view2 = this.f155503e;
        if (view2 != null) {
            view2.setOnClickListener(new OnSingleClickListener(this) {
                /* class com.ss.android.vc.meeting.module.landscapefloater.LandscapeFloatToolbarViewControl.C619192 */

                /* renamed from: a */
                final /* synthetic */ LandscapeFloatToolbarViewControl f155514a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f155514a = r1;
                }

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (!C61999a.m242220f()) {
                        Activity activity = this.f155514a.getActivity();
                        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                        if (activity.getRequestedOrientation() == 1) {
                            Activity activity2 = this.f155514a.getActivity();
                            Intrinsics.checkExpressionValueIsNotNull(activity2, "activity");
                            activity2.setRequestedOrientation(0);
                        } else if (C60776r.m236157o()) {
                            Activity activity3 = this.f155514a.getActivity();
                            Intrinsics.checkExpressionValueIsNotNull(activity3, "activity");
                            activity3.setRequestedOrientation(1);
                        }
                    } else {
                        Activity activity4 = this.f155514a.getActivity();
                        Intrinsics.checkExpressionValueIsNotNull(activity4, "activity");
                        activity4.setRequestedOrientation(1);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.ILocalMicCameraListener
    /* renamed from: a */
    public void mo213137a(boolean z) {
        String str = f155501o;
        C60700b.m235851b(str, "[onLocalMicChanged]", "isAudioMuted = " + z);
        m241896e(z);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        String str = f155501o;
        C60700b.m235851b(str, "[onOrientation]", "isLandscape = " + z);
        super.onOrientation(z, z2);
        if (z) {
            m241895e();
        } else {
            m241897f();
        }
    }
}
