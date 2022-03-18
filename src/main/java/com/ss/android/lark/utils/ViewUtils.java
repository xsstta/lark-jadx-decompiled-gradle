package com.ss.android.lark.utils;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class ViewUtils {

    /* renamed from: a */
    private static final Handler f142255a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static boolean m224151a(Activity activity) {
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    /* renamed from: a */
    public static void m224150a(String str) {
        LKUIToast.show(LarkContext.getApplication(), str);
    }

    /* renamed from: com.ss.android.lark.utils.ViewUtils$b */
    public static abstract class AbstractC57752b {

        /* renamed from: a */
        protected Handler f142257a;

        /* renamed from: b */
        protected Context f142258b;

        /* renamed from: c */
        protected DialogC25637f f142259c;

        /* renamed from: d */
        protected CharSequence f142260d;

        /* renamed from: e */
        protected boolean f142261e;

        /* renamed from: f */
        protected long f142262f;

        /* renamed from: g */
        protected DialogInterface.OnCancelListener f142263g;

        /* renamed from: h */
        protected DialogInterface.OnDismissListener f142264h;

        /* renamed from: i */
        protected boolean f142265i;

        /* renamed from: a */
        public abstract int mo196033a();

        /* renamed from: a */
        public abstract void mo196034a(DialogC25637f fVar, CharSequence charSequence);

        /* renamed from: g */
        public boolean mo196044g() {
            return ViewUtils.m224153b(this.f142258b);
        }

        /* renamed from: c */
        public void mo196040c() {
            ViewUtils.m224148a(new Runnable() {
                /* class com.ss.android.lark.utils.ViewUtils.AbstractC57752b.RunnableC577531 */

                public void run() {
                    AbstractC57752b.this.mo196041d();
                }
            });
        }

        /* renamed from: e */
        public void mo196042e() {
            ViewUtils.m224148a(new Runnable() {
                /* class com.ss.android.lark.utils.ViewUtils.AbstractC57752b.RunnableC577553 */

                public void run() {
                    AbstractC57752b.this.mo196043f();
                }
            });
        }

        /* renamed from: b */
        public void mo196039b() {
            if (mo196044g()) {
                this.f142257a.sendEmptyMessageDelayed(10086, this.f142262f);
            }
        }

        /* renamed from: f */
        public void mo196043f() {
            DialogC25637f fVar;
            this.f142265i = false;
            this.f142257a.removeCallbacksAndMessages(null);
            if (mo196044g() && (fVar = this.f142259c) != null) {
                fVar.dismiss();
            }
        }

        /* renamed from: d */
        public void mo196041d() {
            if (mo196044g()) {
                if (this.f142259c == null) {
                    C25639g a = new C25639g(this.f142258b).mo89222a(1.0f).mo89234b(1.0f).mo89260s(mo196033a()).mo89230a(new C25639g.AbstractC25641b() {
                        /* class com.ss.android.lark.utils.ViewUtils.AbstractC57752b.C577542 */

                        /* access modifiers changed from: protected */
                        @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
                        /* renamed from: a */
                        public void mo89273a(DialogC25637f fVar) {
                            super.mo89273a(fVar);
                            AbstractC57752b.this.mo196038a(fVar.getWindow());
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
                        /* renamed from: b */
                        public void mo89274b(DialogC25637f fVar) {
                            super.mo89274b(fVar);
                            AbstractC57752b bVar = AbstractC57752b.this;
                            bVar.mo196034a(fVar, bVar.f142260d);
                        }
                    });
                    DialogInterface.OnCancelListener onCancelListener = this.f142263g;
                    if (onCancelListener != null) {
                        a.mo89226a(onCancelListener);
                    } else {
                        a.mo89246d(false);
                    }
                    DialogC25637f b = a.mo89233b();
                    this.f142259c = b;
                    b.setOnDismissListener(new DialogInterface$OnDismissListenerC57758d(this));
                }
                if (!this.f142265i) {
                    this.f142265i = true;
                    this.f142259c.show();
                }
            }
        }

        public AbstractC57752b(Context context) {
            this(context, null, true);
        }

        /* renamed from: a */
        public void mo196035a(long j) {
            this.f142262f = j;
        }

        /* renamed from: com.ss.android.lark.utils.ViewUtils$b$a */
        private static class HandlerC57756a extends Handler {

            /* renamed from: a */
            private WeakReference<AbstractC57752b> f142269a;

            HandlerC57756a(AbstractC57752b bVar) {
                this.f142269a = new WeakReference<>(bVar);
            }

            public void handleMessage(Message message) {
                AbstractC57752b bVar = this.f142269a.get();
                if (bVar != null && message.what == 10086) {
                    bVar.mo196040c();
                }
            }
        }

        /* renamed from: a */
        public void mo196036a(DialogInterface.OnCancelListener onCancelListener) {
            this.f142263g = onCancelListener;
        }

        /* renamed from: a */
        public void mo196037a(DialogInterface.OnDismissListener onDismissListener) {
            this.f142264h = onDismissListener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo196038a(Window window) {
            if (window != null) {
                window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
                window.setWindowAnimations(R.style.UtilLoadingAnim);
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                int i = DynamicModule.f58006b;
                if (this.f142261e && Build.VERSION.SDK_INT >= 23) {
                    i = 8448;
                }
                window.getDecorView().setSystemUiVisibility(i | window.getDecorView().getSystemUiVisibility());
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
            }
        }

        public AbstractC57752b(Context context, CharSequence charSequence) {
            this(context, charSequence, true);
        }

        public AbstractC57752b(Context context, CharSequence charSequence, boolean z) {
            this.f142257a = new HandlerC57756a(this);
            this.f142262f = 300;
            this.f142258b = context;
            this.f142260d = charSequence;
            this.f142261e = z;
            if (!mo196044g()) {
                Log.m165397w("ViewUtils", "context is not alive: " + context);
            }
        }
    }

    /* renamed from: com.ss.android.lark.utils.ViewUtils$c */
    public static class C57757c extends AbstractC57752b {

        /* renamed from: j */
        private LKUIStatus f142270j;

        /* renamed from: k */
        private FrameLayout f142271k;

        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: a */
        public int mo196033a() {
            return R.layout.util_page_loading;
        }

        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: b */
        public void mo196039b() {
            super.mo196039b();
            if (this.f142270j != null) {
                m224173h();
            }
        }

        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: e */
        public void mo196042e() {
            super.mo196042e();
            LKUIStatus lKUIStatus = this.f142270j;
            if (lKUIStatus != null) {
                lKUIStatus.mo89848e();
            }
        }

        /* renamed from: h */
        private void m224173h() {
            this.f142270j.mo89837a();
            View childAt = this.f142271k.getChildAt(0);
            if (childAt != null) {
                childAt.setBackgroundColor(0);
            }
        }

        private C57757c(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: a */
        public void mo196038a(Window window) {
            window.getAttributes().flags = SmEvents.EVENT_UA_SUCCESS;
            super.mo196038a(window);
        }

        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: a */
        public void mo196034a(DialogC25637f fVar, CharSequence charSequence) {
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = UIHelper.getString(R.string.Lark_Legacy_InLoading);
            }
            FrameLayout frameLayout = (FrameLayout) fVar.findViewById(R.id.utilPageRootFl);
            this.f142271k = frameLayout;
            this.f142270j = new LKUIStatus.C25680a(frameLayout).mo89858a(charSequence).mo89859a();
            m224173h();
        }
    }

    /* renamed from: a */
    public static void m224144a() {
        LKUIToast.show(LarkContext.getApplication(), (int) R.string.Lark_Legacy_RecallMessageErr);
    }

    /* renamed from: com.ss.android.lark.utils.ViewUtils$a */
    public static class C57751a extends AbstractC57752b {
        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: a */
        public int mo196033a() {
            return R.layout.util_action_loading;
        }

        private C57751a(Context context) {
            super(context);
        }

        private C57751a(Context context, CharSequence charSequence) {
            super(context, charSequence);
        }

        @Override // com.ss.android.lark.utils.ViewUtils.AbstractC57752b
        /* renamed from: a */
        public void mo196034a(DialogC25637f fVar, CharSequence charSequence) {
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = UIHelper.getString(R.string.Lark_Legacy_InLoading);
            }
            ((TextView) fVar.findViewById(R.id.utilActionLoadingMsgTv)).setText(charSequence);
        }
    }

    public static class ActionLoadingView extends AppCompatImageView {

        /* renamed from: a */
        private ObjectAnimator f142256a;

        public ActionLoadingView(Context context) {
            this(context, null);
        }

        public ActionLoadingView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        /* access modifiers changed from: protected */
        public void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            ObjectAnimator objectAnimator = this.f142256a;
            if (objectAnimator == null) {
                return;
            }
            if (i == 0) {
                objectAnimator.start();
            } else {
                objectAnimator.end();
            }
        }

        /* renamed from: a */
        private void m224156a(Context context, AttributeSet attributeSet) {
            setImageResource(R.drawable.util_loading_icon);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", BitmapDescriptorFactory.HUE_RED, 360.0f);
            this.f142256a = ofFloat;
            ofFloat.setRepeatCount(-1);
            this.f142256a.setInterpolator(new LinearInterpolator());
            this.f142256a.setRepeatMode(1);
            this.f142256a.setDuration(1000L);
            this.f142256a.start();
        }

        public ActionLoadingView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            m224156a(context, attributeSet);
        }
    }

    /* renamed from: c */
    public static C57751a m224154c(Context context) {
        return new C57751a(context);
    }

    /* renamed from: d */
    public static C57757c m224155d(Context context) {
        return new C57757c(context);
    }

    /* renamed from: com.ss.android.lark.utils.ViewUtils$d */
    public static class DialogInterface$OnDismissListenerC57758d implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        private WeakReference<AbstractC57752b> f142272a;

        public DialogInterface$OnDismissListenerC57758d(AbstractC57752b bVar) {
            this.f142272a = new WeakReference<>(bVar);
        }

        public void onDismiss(DialogInterface dialogInterface) {
            AbstractC57752b bVar = this.f142272a.get();
            if (bVar != null) {
                if (bVar.f142264h != null) {
                    bVar.f142264h.onDismiss(dialogInterface);
                }
                bVar.mo196043f();
                bVar.f142263g = null;
                bVar.f142264h = null;
            }
        }
    }

    /* renamed from: a */
    public static Activity m224142a(View view) {
        return m224141a(view.getContext());
    }

    /* renamed from: b */
    public static void m224152b(String str) {
        LKUIToast.show(LarkContext.getApplication(), str, 3500);
    }

    /* renamed from: b */
    public static boolean m224153b(Context context) {
        return m224151a(m224141a(context));
    }

    /* renamed from: a */
    public static void m224145a(int i) {
        LKUIToast.show(LarkContext.getApplication(), i);
    }

    /* renamed from: a */
    public static Activity m224141a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context != null && context.getClass().getName().equals("com.android.internal.policy.DecorContext")) {
            try {
                Field declaredField = context.getClass().getDeclaredField("mActivityContext");
                declaredField.setAccessible(true);
                return (Activity) ((WeakReference) declaredField.get(context)).get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    public static void m224148a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f142255a.post(runnable);
        }
    }

    /* renamed from: a */
    public static C57751a m224143a(Context context, CharSequence charSequence) {
        return new C57751a(context, charSequence);
    }

    /* renamed from: a */
    public static void m224146a(View view, boolean z) {
        m224147a(view, z, null);
    }

    /* renamed from: a */
    public static void m224149a(Runnable runnable, long j) {
        f142255a.postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static void m224147a(View view, boolean z, View... viewArr) {
        if (view != null) {
            if (viewArr != null) {
                for (View view2 : viewArr) {
                    if (view == view2) {
                        return;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m224147a(viewGroup.getChildAt(i), z, viewArr);
                }
            }
            view.setEnabled(z);
        }
    }
}
