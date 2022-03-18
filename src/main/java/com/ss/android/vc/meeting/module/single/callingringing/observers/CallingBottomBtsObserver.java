package com.ss.android.vc.meeting.module.single.callingringing.observers;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.livedata.CallingRingingLiveDatas;
import com.ss.android.vc.meeting.module.single.stubs.CallingCancelStub;
import com.ss.android.vc.statistics.event.C63756f;
import com.ss.android.vc.statistics.event2.MeetingCallingEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/CallingBottomBtsObserver;", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "liveDatas", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;)V", "callingCancelStub", "Lcom/ss/android/vc/meeting/module/single/stubs/CallingCancelStub;", "isCancelClicked", "", "cancelVideoCalling", "", "initBottomViews", "onObserverCreated", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CallingBottomBtsObserver extends CallingRingingBaseObserver {

    /* renamed from: c */
    public boolean f158945c;

    /* renamed from: d */
    public CallingCancelStub f158946d;

    /* renamed from: c */
    private final void m247020c() {
        View a;
        CallingCancelStub aVar = this.f158946d;
        if (aVar != null && (a = aVar.mo217879a()) != null) {
            a.setOnClickListener(new View$OnClickListenerC63061a(this));
        }
    }

    /* renamed from: b */
    public final void mo217907b() {
        C60700b.m235841a(this.f151993b.mo212056e(), "UI", "StateEngine", "clickCallingCancel", mo217936f(), "[cancelVideoCalling]");
        mo217935a(104);
    }

    @Override // com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver
    public void ca_() {
        View view;
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            Fragment fragment = this.f151992a;
            if (fragment != null) {
                view = fragment.getView();
            } else {
                view = null;
            }
            this.f158946d = new CallingCancelStub(view);
            m247020c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/CallingBottomBtsObserver$initBottomViews$1", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.CallingBottomBtsObserver$a */
    public static final class View$OnClickListenerC63061a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CallingBottomBtsObserver f158947a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC63061a(CallingBottomBtsObserver callingBottomBtsObserver) {
            this.f158947a = callingBottomBtsObserver;
        }

        public void onClick(View view) {
            ImageView c;
            TextView b;
            View a;
            View a2;
            String f = this.f158947a.mo217936f();
            StringBuilder sb = new StringBuilder();
            sb.append("click calling cancel button, isCancelClicked = ");
            sb.append(this.f158947a.f158945c);
            sb.append(", meeting = ");
            C61303k kVar = this.f158947a.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            sb.append(kVar.mo212055d());
            C60700b.m235851b(f, "[onClick]", sb.toString());
            if (!this.f158947a.f158945c) {
                this.f158947a.f158945c = true;
                this.f158947a.mo217907b();
                C60738ac.m236025a((int) R.string.View_G_CallEnded, 1000);
                C63756f.m250285a(this.f158947a.f151993b.mo212056e());
                MeetingCallingEvent.f160833b.mo220278a().mo220277b(this.f158947a.f151993b.mo212056e(), null);
                CallingCancelStub aVar = this.f158947a.f158946d;
                if (!(aVar == null || (a2 = aVar.mo217879a()) == null)) {
                    a2.setEnabled(false);
                }
                CallingCancelStub aVar2 = this.f158947a.f158946d;
                if (!(aVar2 == null || (a = aVar2.mo217879a()) == null)) {
                    a.setClickable(false);
                }
                CallingCancelStub aVar3 = this.f158947a.f158946d;
                if (!(aVar3 == null || (b = aVar3.mo217880b()) == null)) {
                    b.setEnabled(false);
                }
                CallingCancelStub aVar4 = this.f158947a.f158946d;
                if (aVar4 != null && (c = aVar4.mo217881c()) != null) {
                    c.setEnabled(false);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallingBottomBtsObserver(Fragment fragment, C61303k kVar, CallingRingingLiveDatas aVar) {
        super(fragment, kVar, aVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
