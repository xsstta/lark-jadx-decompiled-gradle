package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.button.ButtonDrawableParams;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\tJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\tJ0\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0012H\u0002J\u000e\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0010J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0010H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/FooterRSVPView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mActionListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/FooterRSVPView$OnActionClickListener;", "mAnimationSet", "Landroid/view/animation/AnimationSet;", "mCurStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "mIsFirstUpdateStatus", "", "mLongBtnClickListener", "Landroid/view/View$OnClickListener;", "mPreStatus", "mShortBtnClickListener", "init", "", "setActionListener", "setBackGround", "drawable", "Landroid/graphics/drawable/Drawable;", "setEndIconClickListener", "listener", "setEndIconDrawable", "drawableResId", "setEndIconVisibility", "visibility", "showLongBtn", "bgColorCode", "strokeColorCode", "textColorCode", "iconColorCode", "textCode", "showShortBtn", "isShow", "updateStatus", "selfAttendeeStatus", "updateView", "OnActionClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FooterRSVPView extends ConstraintLayout {

    /* renamed from: a */
    public RSVPStatus f79726a;

    /* renamed from: b */
    public OnActionClickListener f79727b;

    /* renamed from: c */
    private RSVPStatus f79728c;

    /* renamed from: d */
    private View.OnClickListener f79729d;

    /* renamed from: e */
    private View.OnClickListener f79730e;

    /* renamed from: f */
    private AnimationSet f79731f;

    /* renamed from: g */
    private boolean f79732g;

    /* renamed from: h */
    private HashMap f79733h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/FooterRSVPView$OnActionClickListener;", "", "onActionClick", "", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView$a */
    public interface OnActionClickListener {
        /* renamed from: a */
        void mo114074a(RSVPStatus rSVPStatus);
    }

    /* renamed from: a */
    public View mo114160a(int i) {
        if (this.f79733h == null) {
            this.f79733h = new HashMap();
        }
        View view = (View) this.f79733h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79733h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m118385a() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_calendar_detail_footer, this);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.calendar_scale_to_normal_size);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.calendar_alpha_to_show);
        this.f79731f.addAnimation(loadAnimation);
        this.f79731f.addAnimation(loadAnimation2);
        this.f79729d = new View$OnClickListenerC31460b(this);
        this.f79730e = new View$OnClickListenerC31461c(this);
        ((UDButton) mo114160a(R.id.event_accept_btn)).setOnClickListener(this.f79729d);
        ((UDButton) mo114160a(R.id.event_reject_btn)).setOnClickListener(this.f79729d);
        ((UDButton) mo114160a(R.id.event_tentative_btn)).setOnClickListener(this.f79729d);
        ((UDButton) mo114160a(R.id.event_status_btn)).setOnClickListener(this.f79730e);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView$d */
    static final class C31463d extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        public static final C31463d INSTANCE = new C31463d();

        C31463d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90319a(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView$e */
    static final class C31464e extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        public static final C31464e INSTANCE = new C31464e();

        C31464e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90319a(2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView$f */
    public static final class C31465f extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        final /* synthetic */ int $textCode;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31465f(int i) {
            super(1);
            this.$textCode = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90319a(1);
            aVar.mo90320a(C32634ae.m125182b(this.$textCode));
        }
    }

    public final void setActionListener(OnActionClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mActionListener");
        this.f79727b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FooterRSVPView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setBackGround(Drawable drawable) {
        View rootView = getRootView();
        Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
        rootView.setBackground(drawable);
    }

    /* renamed from: a */
    public final void mo114161a(RSVPStatus rSVPStatus) {
        Intrinsics.checkParameterIsNotNull(rSVPStatus, "selfAttendeeStatus");
        RSVPStatus rSVPStatus2 = this.f79726a;
        if (rSVPStatus != rSVPStatus2) {
            if (rSVPStatus2 != null) {
                this.f79728c = rSVPStatus2;
            }
            this.f79726a = rSVPStatus;
            m118388b(rSVPStatus);
        }
    }

    public final void setEndIconClickListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        ((UDButton) mo114160a(R.id.end_icon)).setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView$b */
    public static final class View$OnClickListenerC31460b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FooterRSVPView f79734a;

        View$OnClickListenerC31460b(FooterRSVPView footerRSVPView) {
            this.f79734a = footerRSVPView;
        }

        public final void onClick(View view) {
            RSVPStatus rSVPStatus = RSVPStatus.NEEDS_ACTION;
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            int id = view.getId();
            if (id == R.id.event_accept_btn) {
                rSVPStatus = RSVPStatus.ACCEPT;
            } else if (id == R.id.event_reject_btn) {
                rSVPStatus = RSVPStatus.DECLINE;
            } else if (id == R.id.event_tentative_btn) {
                rSVPStatus = RSVPStatus.TENTATIVE;
            }
            if (rSVPStatus != RSVPStatus.NEEDS_ACTION && this.f79734a.f79726a != rSVPStatus && this.f79734a.f79727b != null) {
                OnActionClickListener aVar = this.f79734a.f79727b;
                if (aVar == null) {
                    Intrinsics.throwNpe();
                }
                aVar.mo114074a(rSVPStatus);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView$c */
    public static final class View$OnClickListenerC31461c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FooterRSVPView f79735a;

        View$OnClickListenerC31461c(FooterRSVPView footerRSVPView) {
            this.f79735a = footerRSVPView;
        }

        public final void onClick(View view) {
            Context context = this.f79735a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(CollectionsKt.listOf((Object[]) new String[]{C32634ae.m125182b(R.string.Calendar_Detail_Accept), C32634ae.m125182b(R.string.Calendar_Detail_Refuse), C32634ae.m125182b(R.string.Calendar_Detail_Maybe)}))).mo90869a(new UDListDialogController.OnItemClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView.View$OnClickListenerC31461c.C314621 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31461c f79736a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f79736a = r1;
                }

                @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                public void onItemClick(int i) {
                    RSVPStatus rSVPStatus;
                    OnActionClickListener aVar = this.f79736a.f79735a.f79727b;
                    if (aVar == null) {
                        Intrinsics.throwNpe();
                    }
                    if (i == 0) {
                        rSVPStatus = RSVPStatus.ACCEPT;
                    } else if (i == 1) {
                        rSVPStatus = RSVPStatus.DECLINE;
                    } else if (i != 2) {
                        rSVPStatus = RSVPStatus.TENTATIVE;
                    } else {
                        rSVPStatus = RSVPStatus.TENTATIVE;
                    }
                    aVar.mo114074a(rSVPStatus);
                }
            })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
        }
    }

    /* renamed from: b */
    private final void m118388b(RSVPStatus rSVPStatus) {
        int i = C31484e.f79793a[rSVPStatus.ordinal()];
        if (i == 1) {
            m118387a(true);
        } else if (i == 2) {
            m118387a(false);
            m118386a(R.color.ud_G50, R.color.ud_G700, R.color.ud_G700, R.color.function_success_700, R.string.Calendar_Detail_Accepted);
        } else if (i == 3) {
            m118387a(false);
            m118386a(R.color.ud_R50, R.color.function_danger_600, R.color.function_danger_600, R.color.function_danger_500, R.string.Calendar_Detail_Refused);
        } else if (i == 4) {
            m118387a(false);
            m118386a(R.color.ud_N100, R.color.line_border_component, R.color.text_title, R.color.icon_n1, R.string.Calendar_Legacy_EventInvitationReplyMaybe_Dropdown);
        }
        if (this.f79732g) {
            this.f79732g = false;
        }
    }

    public final void setEndIconDrawable(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int color = UDColorUtils.getColor(context, R.color.icon_n2);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context2, i, color);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        int a = (int) UDDimenUtils.m93308a(context3, 16);
        iconDrawable.setBounds(new Rect(0, 0, a, a));
        UDButton uDButton = (UDButton) mo114160a(R.id.end_icon);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "end_icon");
        C25717e.m92488a(uDButton, iconDrawable, C31463d.INSTANCE);
    }

    public final void setEndIconVisibility(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int color = UDColorUtils.getColor(context, R.color.icon_n2);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_chat_news_outlined, color);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        int a = (int) UDDimenUtils.m93308a(context3, 16);
        iconDrawable.setBounds(new Rect(0, 0, a, a));
        UDButton uDButton = (UDButton) mo114160a(R.id.end_icon);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "end_icon");
        C25717e.m92488a(uDButton, iconDrawable, C31464e.INSTANCE);
        UDButton uDButton2 = (UDButton) mo114160a(R.id.end_icon);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "end_icon");
        uDButton2.setVisibility(i);
    }

    /* renamed from: a */
    private final void m118387a(boolean z) {
        if (z) {
            UDButton uDButton = (UDButton) mo114160a(R.id.event_accept_btn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "event_accept_btn");
            uDButton.setText(C32634ae.m125182b(R.string.Calendar_Detail_Accept));
            UDButton uDButton2 = (UDButton) mo114160a(R.id.event_reject_btn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton2, "event_reject_btn");
            uDButton2.setText(C32634ae.m125182b(R.string.Calendar_Detail_Refuse));
            UDButton uDButton3 = (UDButton) mo114160a(R.id.event_tentative_btn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton3, "event_tentative_btn");
            uDButton3.setText(C32634ae.m125182b(R.string.Calendar_Detail_Maybe));
            UDButton uDButton4 = (UDButton) mo114160a(R.id.event_status_btn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton4, "event_status_btn");
            uDButton4.setVisibility(8);
            return;
        }
        UDButton uDButton5 = (UDButton) mo114160a(R.id.event_accept_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton5, "event_accept_btn");
        uDButton5.setVisibility(8);
        UDButton uDButton6 = (UDButton) mo114160a(R.id.event_reject_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton6, "event_reject_btn");
        uDButton6.setVisibility(8);
        UDButton uDButton7 = (UDButton) mo114160a(R.id.event_tentative_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton7, "event_tentative_btn");
        uDButton7.setVisibility(8);
        UDButton uDButton8 = (UDButton) mo114160a(R.id.event_status_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton8, "event_status_btn");
        uDButton8.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FooterRSVPView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FooterRSVPView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f79726a = RSVPStatus.NEEDS_ACTION;
        this.f79728c = RSVPStatus.NEEDS_ACTION;
        this.f79731f = new AnimationSet(true);
        this.f79732g = true;
        m118385a();
    }

    /* renamed from: a */
    private final void m118386a(int i, int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int color = UDColorUtils.getColor(context, i4);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_down_outlined, color);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        int a = (int) UDDimenUtils.m93308a(context3, 16);
        iconDrawable.setBounds(new Rect(0, 0, a, a));
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        ((UDButton) mo114160a(R.id.event_status_btn)).setBackgroundColor(UDColorUtils.getColor(context4, i));
        Context context5 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context5, "context");
        ((UDButton) mo114160a(R.id.event_status_btn)).setStrokeColor(UDColorUtils.getColor(context5, i2));
        Context context6 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context6, "context");
        ((UDButton) mo114160a(R.id.event_status_btn)).setTextColor(UDColorUtils.getColor(context6, i3));
        UDButton uDButton = (UDButton) mo114160a(R.id.event_status_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "event_status_btn");
        C25717e.m92488a(uDButton, iconDrawable, new C31465f(i5));
    }
}
