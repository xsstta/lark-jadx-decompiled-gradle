package com.ss.android.vc.lark.guidetips;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.ui.BasePopupWindow;
import com.ss.android.lark.ui.C57580a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.VideoChatModule;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.android.vc.lark.guidetips.a */
public class C61087a extends BasePopupWindow {

    /* renamed from: b */
    public static C61087a f152999b;

    /* renamed from: e */
    private static Handler f153000e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public Activity f153001a;

    /* renamed from: c */
    private View f153002c;

    /* renamed from: d */
    private View f153003d;

    /* renamed from: c */
    private int m237586c() {
        return C57580a.m223594a() - C57580a.m223598b();
    }

    /* renamed from: b */
    private void m237584b() {
        this.f153002c.setFocusable(true);
        this.f153002c.setFocusableInTouchMode(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(true);
    }

    /* renamed from: a */
    public static void m237578a() {
        f153000e.removeCallbacksAndMessages(null);
        C61087a aVar = f152999b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    private static Observable<Boolean> m237576a(String str) {
        return Observable.create(new ObservableOnSubscribe(str) {
            /* class com.ss.android.vc.lark.guidetips.$$Lambda$a$Ke0pweu0gp8AZt7rgATcJYZNmg */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C61087a.m237583a(this.f$0, observableEmitter);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m237577a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return Observable.just(false);
        }
        return m237576a("all_lark_view_video_meeting_moved");
    }

    public C61087a(Activity activity) {
        super(-2, -2);
        this.f153001a = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.popup_tip_top_right_call, (ViewGroup) null);
        this.f153002c = inflate;
        this.f153003d = inflate.findViewById(R.id.top_right_call_top_arrow);
        setContentView(this.f153002c);
        m237584b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m237585b(View view) {
        Activity activity;
        if (view != null && (activity = this.f153001a) != null && activity.getWindow() != null && this.f153001a.getWindow().getDecorView() != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f153003d.getLayoutParams();
            layoutParams.rightMargin = ((((DeviceUtils.getScreenWidth(this.f153001a) - i) - (view.getWidth() / 2)) - C57582a.m223601a((Context) this.f153001a, 8.0f)) - (this.f153003d.getWidth() / 2)) - m237586c();
            this.f153003d.setLayoutParams(layoutParams);
            showAtLocation(this.f153001a.getWindow().getDecorView(), 53, C57582a.m223601a((Context) this.f153001a, 8.0f), ((i2 + view.getHeight()) - C57580a.m223594a()) + C57582a.m223601a((Context) this.f153001a, 10.0f));
            VideoChatModule.getDependency().getGuideDependency().completeGuide("all_lark_view_video_meeting_moved", true);
        }
    }

    /* renamed from: a */
    public static void m237579a(Activity activity, View view) {
        m237576a("mobile_sidebar").flatMap($$Lambda$a$l9KwH0Mlcwt1kNuTOqmfKtMofZo.INSTANCE).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer(activity, view) {
            /* class com.ss.android.vc.lark.guidetips.$$Lambda$a$ugwFgrgHL63mSXoqGMz0n_QBfrg */
            public final /* synthetic */ Activity f$0;
            public final /* synthetic */ View f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C61087a.m237580a(this.f$0, this.f$1, (Boolean) obj);
            }
        });
    }

    /* renamed from: a */
    private void m237582a(View view, int i) {
        f153000e.postDelayed(new Runnable(view) {
            /* class com.ss.android.vc.lark.guidetips.$$Lambda$a$44wc9IdSjP1Yju0SMcoaC1MJKTU */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61087a.this.m237585b(this.f$1);
            }
        }, (long) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m237583a(String str, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(VideoChatModule.getDependency().getGuideDependency().checkToShow(str)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m237580a(Activity activity, View view, Boolean bool) throws Exception {
        if (bool.booleanValue() && activity != null && view != null) {
            m237578a();
            C61087a aVar = new C61087a(activity);
            f152999b = aVar;
            aVar.m237582a(view, ParticipantRepo.f117150c);
            f152999b.setOnDismissListener(new PopupWindow.OnDismissListener() {
                /* class com.ss.android.vc.lark.guidetips.C61087a.C610881 */

                public void onDismiss() {
                    C61087a.f152999b.f153001a = null;
                    C61087a.f152999b = null;
                }
            });
        }
    }
}
