package com.ss.android.photoeditor.mosaic.v2;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.photoeditor.mosaic.v2.d */
public class C59764d {

    /* renamed from: a */
    public ValueAnimator f148506a;

    /* renamed from: b */
    protected DialogInterface.OnCancelListener f148507b;

    /* renamed from: c */
    protected final long f148508c = 300;

    /* renamed from: d */
    private final Context f148509d;

    /* renamed from: e */
    private DialogC25637f f148510e;

    /* renamed from: f */
    private boolean f148511f;

    /* renamed from: g */
    private final Handler f148512g = new HandlerC59772a(this);

    /* renamed from: f */
    private int m231824f() {
        return R.layout.ocr_loading_dialog;
    }

    /* renamed from: b */
    public void mo203455b() {
        mo203454a(new Runnable() {
            /* class com.ss.android.photoeditor.mosaic.v2.C59764d.RunnableC597684 */

            public void run() {
                C59764d.this.mo203456c();
            }
        });
    }

    /* renamed from: d */
    public void mo203457d() {
        mo203454a(new Runnable() {
            /* class com.ss.android.photoeditor.mosaic.v2.C59764d.RunnableC597706 */

            public void run() {
                C59764d.this.mo203458e();
            }
        });
    }

    /* renamed from: e */
    public void mo203458e() {
        DialogC25637f fVar;
        this.f148511f = false;
        this.f148512g.removeCallbacksAndMessages(null);
        if (m231822a(this.f148509d) && (fVar = this.f148510e) != null) {
            fVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo203451a() {
        if (m231822a(this.f148509d)) {
            this.f148512g.sendEmptyMessageDelayed(1, 300);
        }
    }

    /* renamed from: c */
    public void mo203456c() {
        if (m231822a(this.f148509d)) {
            if (this.f148510e == null) {
                C25639g a = new C25639g(this.f148509d).mo89222a(1.0f).mo89234b(1.0f).mo89260s(m231824f()).mo89230a(new C25639g.AbstractC25641b() {
                    /* class com.ss.android.photoeditor.mosaic.v2.C59764d.C597695 */

                    /* access modifiers changed from: protected */
                    @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
                    /* renamed from: b */
                    public void mo89274b(DialogC25637f fVar) {
                        super.mo89274b(fVar);
                        C59764d.this.mo203453a(fVar);
                    }
                });
                DialogInterface.OnCancelListener onCancelListener = this.f148507b;
                if (onCancelListener != null) {
                    a.mo89226a(onCancelListener);
                } else {
                    a.mo89246d(false);
                }
                this.f148510e = a.mo89233b();
            }
            if (!this.f148511f) {
                this.f148511f = true;
                this.f148510e.show();
                m231823b(this.f148510e);
            }
        }
    }

    /* renamed from: com.ss.android.photoeditor.mosaic.v2.d$a */
    private static class HandlerC59772a extends Handler {

        /* renamed from: a */
        private final WeakReference<C59764d> f148524a;

        HandlerC59772a(C59764d dVar) {
            this.f148524a = new WeakReference<>(dVar);
        }

        public void handleMessage(Message message) {
            C59764d dVar = this.f148524a.get();
            if (dVar != null && message.what == 1) {
                dVar.mo203455b();
            }
        }
    }

    public C59764d(Context context) {
        this.f148509d = context;
    }

    /* renamed from: a */
    public static boolean m231822a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m231823b(DialogC25637f fVar) {
        if (this.f148506a == null) {
            this.f148506a = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(3000L);
        }
        final View findViewById = fVar.findViewById(R.id.scanningIv);
        findViewById.post(new Runnable() {
            /* class com.ss.android.photoeditor.mosaic.v2.C59764d.RunnableC597673 */

            public void run() {
                C59764d.this.mo203452a(findViewById);
            }
        });
    }

    /* renamed from: a */
    public void mo203452a(final View view) {
        final int height = ((RelativeLayout) view.getParent()).getHeight() - (view.getHeight() * 2);
        this.f148506a.setRepeatMode(1);
        this.f148506a.setRepeatCount(-1);
        this.f148506a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.photoeditor.mosaic.v2.C59764d.C597717 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams.topMargin = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) height));
                view.setLayoutParams(layoutParams);
            }
        });
        this.f148506a.start();
    }

    /* renamed from: a */
    public void mo203453a(final DialogC25637f fVar) {
        fVar.findViewById(R.id.stopView).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.mosaic.v2.C59764d.View$OnClickListenerC597651 */

            public void onClick(View view) {
                fVar.cancel();
            }
        });
        fVar.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.photoeditor.mosaic.v2.C59764d.DialogInterface$OnDismissListenerC597662 */

            public void onDismiss(DialogInterface dialogInterface) {
                if (C59764d.this.f148506a != null) {
                    C59764d.this.f148506a.removeAllUpdateListeners();
                    C59764d.this.f148506a.cancel();
                    C59764d.this.f148506a = null;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo203454a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
