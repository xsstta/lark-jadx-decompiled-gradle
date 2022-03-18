package com.bytedance.ee.bear.document.loading;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Map;

public class SmallLoadingPlugin extends DocumentPlugin {
    public View loadingView;

    public enum Gravity {
        top,
        center,
        bottom
    }

    public static class LoadingParam implements BaseJSModel {
        public Gravity gravity;
        public String msg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.loading.SmallLoadingPlugin$2 */
    public static /* synthetic */ class C58662 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16428a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.ee.bear.document.loading.SmallLoadingPlugin$Gravity[] r0 = com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.Gravity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.C58662.f16428a = r0
                com.bytedance.ee.bear.document.loading.SmallLoadingPlugin$Gravity r1 = com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.Gravity.top     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.C58662.f16428a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.document.loading.SmallLoadingPlugin$Gravity r1 = com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.Gravity.center     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.C58662.f16428a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.document.loading.SmallLoadingPlugin$Gravity r1 = com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.Gravity.bottom     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.C58662.<clinit>():void");
        }
    }

    public void hideLoading() {
        View view = this.loadingView;
        if (view != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(200L);
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.document.loading.SmallLoadingPlugin.C58651 */

                public void onAnimationEnd(Animator animator) {
                    SmallLoadingPlugin.this.loadingView.setVisibility(8);
                }
            });
            duration.start();
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.loading.SmallLoadingPlugin$a */
    private class C5867a implements AbstractC7945d<Void> {
        private C5867a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            SmallLoadingPlugin.this.hideLoading();
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.loading.SmallLoadingPlugin$b */
    private class C5868b implements AbstractC7945d<LoadingParam> {
        private C5868b() {
        }

        /* renamed from: a */
        public void handle(LoadingParam loadingParam, AbstractC7947h hVar) {
            Gravity gravity;
            if (loadingParam == null || TextUtils.isEmpty(loadingParam.msg)) {
                C13479a.m54761a("SmallLoadingPlugin", new IllegalArgumentException("Bad show loading param"));
                return;
            }
            SmallLoadingPlugin smallLoadingPlugin = SmallLoadingPlugin.this;
            String str = loadingParam.msg;
            if (loadingParam.gravity == null) {
                gravity = Gravity.bottom;
            } else {
                gravity = loadingParam.gravity;
            }
            smallLoadingPlugin.showLoading(str, gravity);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.showSmallLoading", new C5868b());
        map.put("biz.util.hideSmallLoading", new C5867a());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        View view = this.loadingView;
        if (view != null) {
            view.setVisibility(8);
            nVar.mo19594b(this, this.loadingView);
        }
    }

    public void showLoading(String str, Gravity gravity) {
        AbstractC4958n uIContainer = getUIContainer();
        View a = uIContainer.mo19583a(R.id.smallLoading);
        this.loadingView = a;
        if (a == null) {
            this.loadingView = uIContainer.mo19584a(this, R.layout.small_loading);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.loadingView.getLayoutParams();
        int i = C58662.f16428a[gravity.ordinal()];
        if (i == 1) {
            layoutParams.gravity = 49;
            layoutParams.topMargin = C13749l.m55738a(50);
            layoutParams.bottomMargin = 0;
        } else if (i == 2) {
            layoutParams.gravity = 17;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else if (i == 3) {
            layoutParams.gravity = 81;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = C13749l.m55738a((int) SmActions.ACTION_ONTHECALL_EXIT);
        }
        this.loadingView.requestLayout();
        ((TextView) this.loadingView.findViewById(R.id.smallLoadingTxt)).setText(str);
        this.loadingView.setVisibility(0);
        ObjectAnimator.ofFloat(this.loadingView, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L).start();
    }
}
