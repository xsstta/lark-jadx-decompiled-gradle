package com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.InactiveReason;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.helper.SignInStateHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u0006\u0010\u001a\u001a\u00020\u0010J\u0010\u0010\u001b\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/MtRoomSignInStateView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "signInViewDependency", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/MtRoomSignInStateView$SignInViewDependency;", "getSignInViewDependency", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/MtRoomSignInStateView$SignInViewDependency;", "setSignInViewDependency", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/MtRoomSignInStateView$SignInViewDependency;)V", "initTextSize", "", "updateBlockTv", "state", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "updateBlockerContainer", "updateContainerVisibility", "updateIdleState", "updateInUseState", "updateInactiveState", "updateNeedCheckInState", "updateNeedCheckInStateTv", "updateStateView", "SignInViewDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MtRoomSignInStateView extends FrameLayout {

    /* renamed from: a */
    private SignInViewDependency f82247a;

    /* renamed from: b */
    private HashMap f82248b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH&J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\u0011H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/widget/MtRoomSignInStateView$SignInViewDependency;", "", "getBlocker", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "state", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "getCanUserBlockResource", "", "getIdleTimeString", "", "getInactiveReason", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;", "getInactiveReasonString", "inactiveReason", "getInstanceTimeText", "isSignInInstanceStarted", "onAvatarClicked", "", BottomDialog.f17198f, "onBlockTvClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView$a */
    public interface SignInViewDependency {
        /* renamed from: a */
        CalendarEventCreator mo117470a(MeetingRoomSignInState meetingRoomSignInState);

        /* renamed from: a */
        String mo117471a(InactiveReason inactiveReason);

        /* renamed from: a */
        void mo117472a(String str);

        /* renamed from: a */
        boolean mo117473a();

        /* renamed from: b */
        InactiveReason mo117474b();

        /* renamed from: b */
        String mo117475b(MeetingRoomSignInState meetingRoomSignInState);

        /* renamed from: c */
        void mo117476c();

        /* renamed from: d */
        boolean mo117477d();
    }

    public MtRoomSignInStateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MtRoomSignInStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo117483a(int i) {
        if (this.f82248b == null) {
            this.f82248b = new HashMap();
        }
        View view = (View) this.f82248b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82248b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final SignInViewDependency getSignInViewDependency() {
        return this.f82247a;
    }

    /* renamed from: c */
    private final void m122599c() {
        String str;
        TextView textView = (TextView) mo117483a(R.id.meetingRoomState);
        Intrinsics.checkExpressionValueIsNotNull(textView, "meetingRoomState");
        textView.setText(C32634ae.m125182b(R.string.Calendar_MeetingRoom_AvailableLable));
        TextView textView2 = (TextView) mo117483a(R.id.stateViewStateTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "stateViewStateTimeTv");
        SignInViewDependency aVar = this.f82247a;
        if (aVar == null || (str = aVar.mo117475b(MeetingRoomSignInState.IDLE)) == null) {
            str = "";
        }
        textView2.setText(str);
    }

    /* renamed from: d */
    private final void m122601d() {
        String str;
        mo117486b();
        TextView textView = (TextView) mo117483a(R.id.stateViewStateTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "stateViewStateTimeTv");
        SignInViewDependency aVar = this.f82247a;
        if (aVar == null || (str = aVar.mo117475b(MeetingRoomSignInState.NEED_CHECK_IN)) == null) {
            str = "";
        }
        textView.setText(str);
    }

    /* renamed from: e */
    private final void m122603e() {
        String str;
        TextView textView = (TextView) mo117483a(R.id.meetingRoomState);
        Intrinsics.checkExpressionValueIsNotNull(textView, "meetingRoomState");
        textView.setText(C32634ae.m125182b(R.string.Calendar_MeetingRoom_InUseLable));
        TextView textView2 = (TextView) mo117483a(R.id.stateViewStateTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "stateViewStateTimeTv");
        SignInViewDependency aVar = this.f82247a;
        if (aVar != null) {
            str = aVar.mo117475b(MeetingRoomSignInState.IN_USE);
        } else {
            str = null;
        }
        textView2.setText(str);
    }

    /* renamed from: b */
    public final void mo117486b() {
        String str;
        SignInViewDependency aVar = this.f82247a;
        boolean z = true;
        if (aVar == null || !aVar.mo117473a()) {
            z = false;
        }
        TextView textView = (TextView) mo117483a(R.id.meetingRoomState);
        Intrinsics.checkExpressionValueIsNotNull(textView, "meetingRoomState");
        if (z) {
            str = C32634ae.m125182b(R.string.Calendar_MeetingRoom_StartedLable);
        } else {
            str = C32634ae.m125182b(R.string.Calendar_MeetingRoom_StartingLable);
        }
        textView.setText(str);
    }

    /* renamed from: a */
    public final void mo117484a() {
        TextView textView = (TextView) mo117483a(R.id.stateViewStateTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "stateViewStateTimeTv");
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        TextView textView2 = (TextView) mo117483a(R.id.blockActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "blockActionTv");
        TextPaint paint2 = textView2.getPaint();
        if (paint2 != null) {
            paint2.setFakeBoldText(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r1 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r3 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009d, code lost:
        if (r1 != null) goto L_0x00bc;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m122604f() {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView.m122604f():void");
    }

    public final void setSignInViewDependency(SignInViewDependency aVar) {
        this.f82247a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView$b */
    public static final class View$OnClickListenerC32173b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MtRoomSignInStateView f82249a;

        View$OnClickListenerC32173b(MtRoomSignInStateView mtRoomSignInStateView) {
            this.f82249a = mtRoomSignInStateView;
        }

        public final void onClick(View view) {
            SignInViewDependency signInViewDependency = this.f82249a.getSignInViewDependency();
            if (signInViewDependency != null) {
                signInViewDependency.mo117476c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.MtRoomSignInStateView$c */
    public static final class View$OnClickListenerC32174c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MtRoomSignInStateView f82250a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventCreator f82251b;

        View$OnClickListenerC32174c(MtRoomSignInStateView mtRoomSignInStateView, CalendarEventCreator calendarEventCreator) {
            this.f82250a = mtRoomSignInStateView;
            this.f82251b = calendarEventCreator;
        }

        public final void onClick(View view) {
            String str;
            SignInViewDependency signInViewDependency = this.f82250a.getSignInViewDependency();
            if (signInViewDependency != null) {
                CalendarEventCreator calendarEventCreator = this.f82251b;
                if (calendarEventCreator == null || (str = calendarEventCreator.getChatterId()) == null) {
                    str = "";
                }
                signInViewDependency.mo117472a(str);
            }
        }
    }

    /* renamed from: b */
    private final void m122598b(MeetingRoomSignInState meetingRoomSignInState) {
        if (meetingRoomSignInState == MeetingRoomSignInState.INACTIVE) {
            RelativeLayout relativeLayout = (RelativeLayout) mo117483a(R.id.stateViewInactiveRootContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "stateViewInactiveRootContainer");
            relativeLayout.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) mo117483a(R.id.stateViewNormalRootContainer);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "stateViewNormalRootContainer");
            constraintLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo117483a(R.id.stateViewInactiveRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "stateViewInactiveRootContainer");
        relativeLayout2.setVisibility(8);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo117483a(R.id.stateViewNormalRootContainer);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "stateViewNormalRootContainer");
        constraintLayout2.setVisibility(0);
    }

    /* renamed from: c */
    private final void m122600c(MeetingRoomSignInState meetingRoomSignInState) {
        SignInViewDependency aVar;
        boolean z = true;
        if (!(meetingRoomSignInState == MeetingRoomSignInState.IDLE && (aVar = this.f82247a) != null && aVar.mo117477d())) {
            z = false;
        }
        if (!z) {
            TextView textView = (TextView) mo117483a(R.id.blockActionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "blockActionTv");
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) mo117483a(R.id.blockActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "blockActionTv");
        textView2.setVisibility(0);
        ((TextView) mo117483a(R.id.blockActionTv)).setOnClickListener(new View$OnClickListenerC32173b(this));
    }

    /* renamed from: d */
    private final void m122602d(MeetingRoomSignInState meetingRoomSignInState) {
        boolean z;
        CalendarEventCreator calendarEventCreator;
        if (meetingRoomSignInState == MeetingRoomSignInState.IN_USE || meetingRoomSignInState == MeetingRoomSignInState.NEED_CHECK_IN) {
            z = true;
        } else {
            z = false;
        }
        SignInViewDependency aVar = this.f82247a;
        if (aVar != null) {
            calendarEventCreator = aVar.mo117470a(meetingRoomSignInState);
        } else {
            calendarEventCreator = null;
        }
        if (!z) {
            SelectableRoundedImageView selectableRoundedImageView = (SelectableRoundedImageView) mo117483a(R.id.currentBlockerAvatarIv);
            Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView, "currentBlockerAvatarIv");
            selectableRoundedImageView.setVisibility(8);
            TextView textView = (TextView) mo117483a(R.id.currentBlockerName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "currentBlockerName");
            textView.setVisibility(8);
            return;
        }
        SelectableRoundedImageView selectableRoundedImageView2 = (SelectableRoundedImageView) mo117483a(R.id.currentBlockerAvatarIv);
        Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView2, "currentBlockerAvatarIv");
        selectableRoundedImageView2.setVisibility(0);
        TextView textView2 = (TextView) mo117483a(R.id.currentBlockerName);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "currentBlockerName");
        textView2.setVisibility(0);
        View rootView = getRootView();
        Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
        Context context = rootView.getContext();
        if (context != null) {
            SignInStateHelper aVar2 = SignInStateHelper.f82200a;
            SelectableRoundedImageView selectableRoundedImageView3 = (SelectableRoundedImageView) mo117483a(R.id.currentBlockerAvatarIv);
            Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView3, "currentBlockerAvatarIv");
            TextView textView3 = (TextView) mo117483a(R.id.currentBlockerName);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "currentBlockerName");
            aVar2.mo117411a(context, calendarEventCreator, selectableRoundedImageView3, textView3);
            ((SelectableRoundedImageView) mo117483a(R.id.currentBlockerAvatarIv)).setOnClickListener(new View$OnClickListenerC32174c(this, calendarEventCreator));
        }
    }

    /* renamed from: a */
    public final void mo117485a(MeetingRoomSignInState meetingRoomSignInState) {
        if (meetingRoomSignInState != null) {
            m122602d(meetingRoomSignInState);
            m122600c(meetingRoomSignInState);
            m122598b(meetingRoomSignInState);
            int i = C32176a.f82263a[meetingRoomSignInState.ordinal()];
            if (i == 1) {
                m122599c();
            } else if (i == 2) {
                m122601d();
            } else if (i == 3) {
                m122603e();
            } else if (i == 4) {
                m122604f();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MtRoomSignInStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.layout_meeting_room_sign_in_state, (ViewGroup) this, true);
        mo117484a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MtRoomSignInStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
