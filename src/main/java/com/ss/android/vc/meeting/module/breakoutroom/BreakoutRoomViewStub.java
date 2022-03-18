package com.ss.android.vc.meeting.module.breakoutroom;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.statistics.event.C63752c;
import com.ss.android.vc.statistics.event2.MeetingBreakoutRoomsPopupEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/breakoutroom/BreakoutRoomViewStub;", "", "rootView", "Landroid/view/View;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroid/view/View;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "StubContainer", "backBtn", "contentTv", "Lcom/ss/android/vc/common/widget/LineHeightTextView;", "isShowing", "", "leaveMeeting", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMeeting", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "runnable", "Ljava/lang/Runnable;", "simpleName", "gone", "", "initIfNotInflated", "visible", "visibleWithTransfer", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.breakoutroom.c */
public final class BreakoutRoomViewStub {

    /* renamed from: a */
    public LineHeightTextView f154332a;

    /* renamed from: b */
    private View f154333b;

    /* renamed from: c */
    private LineHeightTextView f154334c;

    /* renamed from: d */
    private LineHeightTextView f154335d;

    /* renamed from: e */
    private View f154336e;

    /* renamed from: f */
    private Runnable f154337f;

    /* renamed from: g */
    private boolean f154338g;

    /* renamed from: h */
    private View f154339h;

    /* renamed from: i */
    private C61303k f154340i;

    /* renamed from: d */
    public final C61303k mo213238d() {
        return this.f154340i;
    }

    /* renamed from: c */
    public final void mo213237c() {
        View view = this.f154333b;
        if (view != null) {
            view.setVisibility(8);
        }
        C60735ab.m236011b(this.f154337f);
        this.f154338g = false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.c$b */
    public static final class RunnableC61528b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BreakoutRoomViewStub f154342a;

        RunnableC61528b(BreakoutRoomViewStub cVar) {
            this.f154342a = cVar;
        }

        public final void run() {
            LineHeightTextView lineHeightTextView = this.f154342a.f154332a;
            if (lineHeightTextView != null) {
                lineHeightTextView.setVisibility(0);
            }
            C63752c.m250234a(this.f154342a.mo213238d().mo212056e());
            LineHeightTextView lineHeightTextView2 = this.f154342a.f154332a;
            if (lineHeightTextView2 != null) {
                lineHeightTextView2.setOnClickListener(new OnSingleClickListener(this) {
                    /* class com.ss.android.vc.meeting.module.breakoutroom.BreakoutRoomViewStub.RunnableC61528b.C615291 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC61528b f154343a;

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f154343a = r1;
                    }

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        this.f154343a.f154342a.mo213238d().ah().mo219482b();
                        C63752c.m250238b(this.f154343a.f154342a.mo213238d().mo212056e());
                        MeetingBreakoutRoomsPopupEvent.f160827b.mo220267a().mo220262a(this.f154343a.f154342a.mo213238d());
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo213235a() {
        m240175e();
        View view = this.f154333b;
        if (view != null) {
            view.setVisibility(0);
        }
        AbsBreakoutRoomControl al = this.f154340i.al();
        Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
        AbsBreakoutRoomControl.Status m = al.mo213186m();
        if (m == AbsBreakoutRoomControl.Status.JOINING) {
            LineHeightTextView lineHeightTextView = this.f154335d;
            if (lineHeightTextView != null) {
                lineHeightTextView.setVisibility(0);
            }
            LineHeightTextView lineHeightTextView2 = this.f154334c;
            if (lineHeightTextView2 != null) {
                AbsBreakoutRoomControl al2 = this.f154340i.al();
                Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                VCBreakoutRoomInfo k = al2.mo213184k();
                Intrinsics.checkExpressionValueIsNotNull(k, "meeting.breakoutRoomControl.breakoutRoomInfo");
                lineHeightTextView2.setText(UIHelper.mustacheFormat((int) R.string.View_G_HostInvitedYouToJoinRoom, "roomName", k.getRoomTopic()));
            }
            LineHeightTextView lineHeightTextView3 = this.f154335d;
            if (lineHeightTextView3 != null) {
                lineHeightTextView3.setText(UIHelper.getString(R.string.View_M_JoiningEllipsis));
            }
        } else if (m == AbsBreakoutRoomControl.Status.LEAVING) {
            LineHeightTextView lineHeightTextView4 = this.f154335d;
            if (lineHeightTextView4 != null) {
                lineHeightTextView4.setVisibility(8);
            }
            LineHeightTextView lineHeightTextView5 = this.f154334c;
            if (lineHeightTextView5 != null) {
                lineHeightTextView5.setText(UIHelper.getString(R.string.View_G_ReturningToMainRoom));
            }
        }
        this.f154338g = true;
    }

    /* renamed from: e */
    private final void m240175e() {
        View view;
        LineHeightTextView lineHeightTextView;
        View view2;
        LineHeightTextView lineHeightTextView2;
        ViewStub viewStub;
        if (this.f154333b == null) {
            View view3 = this.f154339h;
            if (!(view3 == null || (viewStub = (ViewStub) view3.findViewById(R.id.stub_break_room_mask)) == null)) {
                viewStub.inflate();
            }
            View view4 = this.f154339h;
            LineHeightTextView lineHeightTextView3 = null;
            if (view4 != null) {
                view = view4.findViewById(R.id.breakoutRoomMask);
            } else {
                view = null;
            }
            this.f154333b = view;
            View view5 = this.f154339h;
            if (view5 != null) {
                lineHeightTextView = (LineHeightTextView) view5.findViewById(R.id.content);
            } else {
                lineHeightTextView = null;
            }
            this.f154334c = lineHeightTextView;
            View view6 = this.f154339h;
            if (view6 != null) {
                view2 = view6.findViewById(R.id.iv_bd_back);
            } else {
                view2 = null;
            }
            this.f154336e = view2;
            View view7 = this.f154339h;
            if (view7 != null) {
                lineHeightTextView2 = (LineHeightTextView) view7.findViewById(R.id.simple_name);
            } else {
                lineHeightTextView2 = null;
            }
            this.f154335d = lineHeightTextView2;
            View view8 = this.f154339h;
            if (view8 != null) {
                lineHeightTextView3 = (LineHeightTextView) view8.findViewById(R.id.leave_meeting);
            }
            this.f154332a = lineHeightTextView3;
            View view9 = this.f154336e;
            if (view9 != null) {
                view9.setOnClickListener(new C61527a(this));
            }
            RunnableC61528b bVar = new RunnableC61528b(this);
            this.f154337f = bVar;
            C60735ab.m236002a(bVar, 10000);
        }
    }

    /* renamed from: b */
    public final void mo213236b() {
        m240175e();
        View view = this.f154333b;
        if (view != null) {
            view.setVisibility(0);
        }
        AbsBreakoutRoomControl al = this.f154340i.al();
        Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
        AbsBreakoutRoomControl.Status m = al.mo213186m();
        if (m == AbsBreakoutRoomControl.Status.JOINING) {
            AbsBreakoutRoomControl al2 = this.f154340i.al();
            Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
            if (al2.mo213183j()) {
                LineHeightTextView lineHeightTextView = this.f154334c;
                if (lineHeightTextView != null) {
                    lineHeightTextView.setText(UIHelper.getString(R.string.View_G_ReturningToMainRoom));
                }
                LineHeightTextView lineHeightTextView2 = this.f154335d;
                if (lineHeightTextView2 != null) {
                    lineHeightTextView2.setVisibility(8);
                }
            } else {
                AbsBreakoutRoomControl al3 = this.f154340i.al();
                Intrinsics.checkExpressionValueIsNotNull(al3, "meeting.breakoutRoomControl");
                if (al3.mo213182i()) {
                    LineHeightTextView lineHeightTextView3 = this.f154334c;
                    if (lineHeightTextView3 != null) {
                        lineHeightTextView3.setVisibility(0);
                    }
                    LineHeightTextView lineHeightTextView4 = this.f154334c;
                    if (lineHeightTextView4 != null) {
                        AbsBreakoutRoomControl al4 = this.f154340i.al();
                        Intrinsics.checkExpressionValueIsNotNull(al4, "meeting.breakoutRoomControl");
                        VCBreakoutRoomInfo k = al4.mo213184k();
                        Intrinsics.checkExpressionValueIsNotNull(k, "meeting.breakoutRoomControl.breakoutRoomInfo");
                        lineHeightTextView4.setText(UIHelper.mustacheFormat((int) R.string.View_G_HostInvitedYouToJoinRoom, "roomName", k.getRoomTopic()));
                    }
                    LineHeightTextView lineHeightTextView5 = this.f154335d;
                    if (lineHeightTextView5 != null) {
                        lineHeightTextView5.setVisibility(0);
                    }
                    LineHeightTextView lineHeightTextView6 = this.f154335d;
                    if (lineHeightTextView6 != null) {
                        lineHeightTextView6.setText(UIHelper.getString(R.string.View_M_JoiningEllipsis));
                    }
                }
            }
            MeetingBreakoutRoomsPopupEvent.f160827b.mo220267a().mo220263a(this.f154340i, "join_room_transfer");
        } else if (m == AbsBreakoutRoomControl.Status.LEAVING) {
            LineHeightTextView lineHeightTextView7 = this.f154335d;
            if (lineHeightTextView7 != null) {
                lineHeightTextView7.setVisibility(8);
            }
            LineHeightTextView lineHeightTextView8 = this.f154334c;
            if (lineHeightTextView8 != null) {
                lineHeightTextView8.setText(UIHelper.getString(R.string.View_G_ReturningToMainRoom));
            }
        }
        this.f154338g = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/breakoutroom/BreakoutRoomViewStub$initIfNotInflated$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.c$a */
    public static final class C61527a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BreakoutRoomViewStub f154341a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61527a(BreakoutRoomViewStub cVar) {
            this.f154341a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Activity c = VCAppLifeCycle.m236256c();
            if (C60773o.m236120a(c)) {
                this.f154341a.mo213238d().ah().mo219483b(c);
            }
        }
    }

    public BreakoutRoomViewStub(View view, C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f154339h = view;
        this.f154340i = kVar;
    }
}
