package com.ss.android.vc.meeting.module.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61299g;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.multi.presenter.MeetingPageModel;
import com.ss.android.vc.meeting.module.p3119f.AbstractC61653b;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.tt.frontendapiinterface.ApiHandler;
import io.reactivex.p3457e.C68296b;

/* renamed from: com.ss.android.vc.meeting.module.base.m */
public class C61434m extends Fragment implements AbstractC61299g, AbstractC61653b {

    /* renamed from: a */
    private InMeetingPresenter f154065a;

    /* renamed from: B */
    public void mo212961B() {
    }

    /* renamed from: a */
    public View mo212879a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public void mo212880a(Context context) {
    }

    /* renamed from: a */
    public void mo212927a(Bundle bundle) {
    }

    public void a_(View view, Bundle bundle) {
    }

    /* renamed from: l */
    public void mo212933l() {
    }

    /* renamed from: m */
    public void mo212934m() {
    }

    /* renamed from: n */
    public void mo212935n() {
    }

    /* renamed from: o */
    public void mo212936o() {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingCombinedInfo(VideoChatCombinedInfo videoChatCombinedInfo) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingVideoChat(VideoChat videoChat) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onStateTransform(int i, int i2, int i3) {
    }

    @Override // com.ss.android.vc.meeting.module.p3119f.AbstractC61653b
    public void onVpPageSwitch(MeetingPageModel meetingPageModel, MeetingPageModel meetingPageModel2) {
    }

    /* renamed from: p */
    public void mo212937p() {
    }

    /* renamed from: q */
    public void mo212938q() {
    }

    /* renamed from: y */
    public final InMeetingPresenter mo212967y() {
        return this.f154065a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo212962C() {
        C60700b.m235851b("MeetingFragment@", "[onPreDraw_]", "onPreDraw_");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (this.f154065a != null) {
            mo212938q();
        }
        C60795b.m236298b();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f154065a != null) {
            mo212937p();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.f154065a != null) {
            mo212935n();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.f154065a != null) {
            mo212936o();
        }
    }

    /* renamed from: w */
    public final C61303k mo212965w() {
        return mo212967y().getMeeting();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final AbstractC61417a mo212966x() {
        return mo212965w().mo212105W();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        mo212967y().removeMeetingListener(this);
        if (this.f154065a != null) {
            mo212961B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo212968z() {
        return getClass().getSimpleName() + "@";
    }

    /* renamed from: A */
    public boolean mo212960A() {
        boolean z;
        if (!isAdded() || getActivity() == null) {
            z = false;
        } else {
            z = true;
        }
        C60700b.m235851b("MeetingFragment@", "[isValid]", "isValid = " + z);
        return z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingFragment@:onResume");
        if (this.f154065a != null) {
            String str = mo212968z() + "onResume";
            C48211b.m190251a().mo168689b(str);
            mo212934m();
            C48211b.m190251a().mo168691c(str);
            C48211b.m190251a().mo168690c();
        }
        TimeConsumeUtils.m248928a(a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingFragment@:onStart");
        if (this.f154065a != null) {
            String str = mo212968z() + "onStart";
            C48211b.m190251a().mo168689b(str);
            mo212933l();
            C48211b.m190251a().mo168691c(str);
        }
        TimeConsumeUtils.m248928a(a);
    }

    /* renamed from: b */
    private void m239780b(Context context) {
        try {
            Activity b = C60773o.m236124b(context);
            if (b != null) {
                b.finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo212963b(int i) {
        if (mo212965w() != null) {
            mo212965w().mo212051a(C61344j.m239002a().mo212329a(i).mo212331a(EventSource.EVENT_ACTIVITY));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingFragment@:onCreate");
        if (this.f154065a != null) {
            String str = mo212968z() + "onCreate";
            C48211b.m190251a().mo168689b(str);
            mo212927a(bundle);
            C48211b.m190251a().mo168691c(str);
        }
        TimeConsumeUtils.m248928a(a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingFragment@:onAttach");
        if (C61436n.m239798a(context) == null || C61436n.m239798a(context).bw_() == null) {
            try {
                C60700b.m235851b("MeetingFragment@", "[onAttach]", "remove fragment");
                getFragmentManager().beginTransaction().remove(this).commit();
            } catch (Exception e) {
                e.printStackTrace();
                C60700b.m235864f("MeetingFragment@", "[onAttach2]", ApiHandler.API_CALLBACK_EXCEPTION);
            }
            m239780b(context);
            return;
        }
        InMeetingPresenter bw_ = C61436n.m239798a(context).bw_();
        this.f154065a = bw_;
        bw_.addMeetingListener(this);
        String str = mo212968z() + "onAttach";
        C48211b.m190251a().mo168689b(str);
        mo212880a(context);
        C48211b.m190251a().mo168691c(str);
        TimeConsumeUtils.m248928a(a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingFragment@:onViewCreated");
        if (this.f154065a != null) {
            String str = mo212968z() + "onViewCreated";
            C48211b.m190251a().mo168689b(str);
            a_(view, bundle);
            C48211b.m190251a().mo168691c(str);
        } else {
            super.onViewCreated(view, bundle);
        }
        if (getView() != null) {
            getView().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.vc.meeting.module.base.C61434m.ViewTreeObserver$OnPreDrawListenerC614351 */

                public boolean onPreDraw() {
                    if (C61434m.this.getView() != null) {
                        C61434m.this.getView().getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    C61434m.this.mo212962C();
                    return true;
                }
            });
        }
        TimeConsumeUtils.m248928a(a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f154065a == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingFragment@:onCreateView");
        String str = mo212968z() + "onCreateView";
        C48211b.m190251a().mo168689b(str);
        View a2 = mo212879a(layoutInflater, viewGroup, bundle);
        C48211b.m190251a().mo168691c(str);
        C48211b.m190251a().mo168687a(a2);
        TimeConsumeUtils.m248928a(a);
        return a2;
    }
}
