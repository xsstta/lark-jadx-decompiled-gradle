package com.ss.android.vc.meeting.utils.meetingcheck;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.an;
import com.ss.android.vc.meeting.utils.XLKUIToast;
import com.ss.android.vc.service.impl.VideoChatService;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: com.ss.android.vc.meeting.utils.meetingcheck.a */
public class C63511a {

    /* renamed from: a */
    private static String f160465a = "CallCheckUtil";

    /* renamed from: a */
    public static Observable<Boolean> m248909a(Context context) {
        C60700b.m235851b(f160465a, "[callCheck]", "CallCheckUtil");
        return Observable.create(new ObservableOnSubscribe(context, VideoChatModuleDependency.getVoIpDependency()) {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$a$JjJ_PzEqJpZxtGTVVgPIjQFFR8U */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ an f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C63511a.lambda$JjJ_PzEqJpZxtGTVVgPIjQFFR8U(this.f$0, this.f$1, observableEmitter);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248910a(Context context, an anVar, ObservableEmitter observableEmitter) throws Exception {
        if (context != null && !C60785x.m236238b()) {
            XLKUIToast.showToast(context, Integer.valueOf((int) R.string.View_G_NoConnection));
            observableEmitter.onNext(false);
            observableEmitter.onComplete();
        } else if (VideoChatService.m249602d().isOngoing(true) || anVar.isFloatIconShown()) {
            C60700b.m235864f(f160465a, "[launchVideoChat]", "there is current meeting");
            if (VideoChatService.m249602d().isRinging() || anVar.isRinging()) {
                XLKUIToast.showToast(context, Integer.valueOf((int) R.string.View_G_IncomingCall));
            } else {
                XLKUIToast.showToast(context, Integer.valueOf((int) R.string.View_G_CurrentlyInCall));
            }
            observableEmitter.onNext(false);
            observableEmitter.onComplete();
        } else {
            observableEmitter.onNext(true);
            observableEmitter.onComplete();
        }
    }
}
