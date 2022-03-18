package com.ss.android.vc.meeting.module.tab.history.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.lark.widget.tab.NavigationTabItemView;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.meeting.module.tab.history.view.VideoChatNavigationTabView;
import com.ss.android.vc.meeting.module.tab.p3168a.C63224c;
import com.ss.android.vc.meeting.module.tab.widgets.C63323c;
import java.util.List;

public class VideoChatNavigationTabView extends NavigationTabItemView {

    /* renamed from: a */
    public int f159710a;

    /* renamed from: b */
    private C63224c f159711b;

    /* renamed from: a */
    public boolean mo153395a() {
        if (this.f159710a > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m247977e();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private void m247976c() {
        C60700b.m235851b("VideoChatTab_VideoChatNavigationTabView", "[register]", "register");
        C63224c cVar = this.f159711b;
        if (cVar != null) {
            cVar.mo218815a();
        }
    }

    /* renamed from: e */
    private void m247977e() {
        C60700b.m235851b("VideoChatTab_VideoChatNavigationTabView", "[unRegister]", "unRegister");
        C63224c cVar = this.f159711b;
        if (cVar != null) {
            cVar.mo218817b();
        }
    }

    /* renamed from: b */
    private void m247974b() {
        try {
            setTabIcon(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_video_filled, C60773o.m236126d(R.color.ud_B500)));
        } catch (Exception e) {
            C60700b.m235864f("VideoChatTab_VideoChatNavigationTabView", "[setTabIcon]", e.getMessage());
        }
        setTabTitle(getResources().getString(R.string.Lark_Legacy_VideoMeetingsSideBarNew));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m247974b();
        if (this.f159711b == null) {
            C63224c cVar = new C63224c(new C63224c.AbstractC63227a() {
                /* class com.ss.android.vc.meeting.module.tab.history.view.VideoChatNavigationTabView.C633011 */

                @Override // com.ss.android.vc.meeting.module.tab.p3168a.C63224c.AbstractC63227a
                /* renamed from: a */
                public void mo218820a(C59204a aVar) {
                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                    layoutParams.f2815g = R.id.icon;
                    layoutParams.f2813e = R.id.icon;
                    layoutParams.f2816h = R.id.icon;
                    layoutParams.f2818j = R.id.icon;
                    VideoChatNavigationTabView.this.mo201264a(aVar, layoutParams);
                }

                @Override // com.ss.android.vc.meeting.module.tab.p3168a.C63224c.AbstractC63227a
                /* renamed from: a */
                public void mo218819a(int i) {
                    C60700b.m235851b("VideoChatTab_VideoChatNavigationTabView", "[onShowRedDot]", "count= " + i);
                    VideoChatNavigationTabView.this.f159710a = i;
                    VideoChatNavigationTabView.this.mo201263a(i);
                }
            });
            this.f159711b = cVar;
            cVar.mo218816a(getContext());
        }
        m247976c();
        VCAppLifeCycle.m236254a(new IGetDataCallback<Activity>() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.VideoChatNavigationTabView.C633022 */

            /* renamed from: a */
            public void onSuccess(Activity activity) {
                if (activity != null) {
                    VideoChatModuleDependency.getMainDependency().mo196434a(activity, new IGetDataCallback<List<Pair<String, View>>>() {
                        /* class com.ss.android.vc.meeting.module.tab.history.view.VideoChatNavigationTabView.C633022.C633031 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }

                        /* renamed from: a */
                        public void onSuccess(List<Pair<String, View>> list) {
                            if (!list.isEmpty()) {
                                for (Pair<String, View> pair : list) {
                                    if (((String) pair.first).equals("more")) {
                                        VideoChatNavigationTabView.this.mo219073a((View) pair.second);
                                        return;
                                    }
                                }
                            }
                        }
                    });
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C60700b.m235864f("VideoChatTab_VideoChatNavigationTabView", "[getTopActivity]", "async error");
            }
        });
    }

    public VideoChatNavigationTabView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m247975b(View view) {
        C63323c.m248039a().mo219111a(view);
    }

    /* renamed from: a */
    public void mo219073a(final View view) {
        if (view != null) {
            boolean isAttachedToWindow = view.isAttachedToWindow();
            C60700b.m235851b("VideoChatTab_VideoChatNavigationTabView", "[dealWithGuideOnTabView]", "tabView[more] is attached? " + isAttachedToWindow);
            if (isAttachedToWindow) {
                view.postDelayed(new Runnable(view) {
                    /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VideoChatNavigationTabView$tgiedftrxKSECpOp5psmthehnPg */
                    public final /* synthetic */ View f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void run() {
                        VideoChatNavigationTabView.m247975b(this.f$0);
                    }
                }, 3000);
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    /* class com.ss.android.vc.meeting.module.tab.history.view.VideoChatNavigationTabView.View$OnAttachStateChangeListenerC633043 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m247984a(View view) {
                        C63323c.m248039a().mo219111a(view);
                    }

                    public void onViewDetachedFromWindow(View view) {
                        C60700b.m235851b("VideoChatTab_VideoChatNavigationTabView", "[onViewDetachedFromWindow]", "moreTabView");
                    }

                    public void onViewAttachedToWindow(View view) {
                        C60700b.m235851b("VideoChatTab_VideoChatNavigationTabView", "[onViewAttachedToWindow]", "moreTabView");
                        View view2 = view;
                        view2.postDelayed(new Runnable(view2) {
                            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VideoChatNavigationTabView$3$_8Kq1ja2GbNAIXRzzZYV8f7KRDI */
                            public final /* synthetic */ View f$0;

                            {
                                this.f$0 = r1;
                            }

                            public final void run() {
                                VideoChatNavigationTabView.View$OnAttachStateChangeListenerC633043.m247984a(this.f$0);
                            }
                        }, 3000);
                    }
                });
            }
        }
    }

    public VideoChatNavigationTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoChatNavigationTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247974b();
    }
}
