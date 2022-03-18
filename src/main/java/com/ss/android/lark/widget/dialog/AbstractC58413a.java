package com.ss.android.lark.widget.dialog;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.dialog.AbstractC58413a;
import com.ss.android.lark.widget.util.C59255b;
import com.ss.android.lark.widget.util.TouchUtils;

/* renamed from: com.ss.android.lark.widget.dialog.a */
public abstract class AbstractC58413a<T extends AbstractC58413a> extends C25639g.AbstractC25641b {

    /* renamed from: a */
    private EditText f143771a;

    /* renamed from: b */
    private boolean f143772b = true;

    /* renamed from: c */
    private boolean f143773c;

    /* renamed from: l */
    protected Context f143774l;

    /* renamed from: m */
    protected DialogC25637f f143775m;

    /* renamed from: n */
    protected View f143776n;

    /* renamed from: o */
    protected View f143777o;

    /* renamed from: p */
    public View f143778p;

    /* renamed from: q */
    public FrameLayout f143779q;

    /* renamed from: r */
    public Runnable f143780r;

    /* renamed from: s */
    public int f143781s;

    /* renamed from: a */
    public abstract int mo145866a();

    /* renamed from: a */
    public abstract C25639g mo145867a(C25639g gVar);

    /* renamed from: c */
    public abstract void mo145868c(DialogC25637f fVar);

    /* renamed from: g */
    public void mo197766g() {
        DialogC25637f fVar = this.f143775m;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo145872b() {
        this.f143771a.setFocusable(true);
        this.f143771a.setFocusableInTouchMode(true);
        this.f143771a.requestFocus();
        C59255b.m230156a(this.f143774l);
    }

    /* renamed from: f */
    public T mo197765f() {
        float f;
        Activity a = ViewUtils.m224141a(this.f143774l);
        if (ViewUtils.m224151a(a)) {
            C25639g gVar = new C25639g(a);
            if (DesktopUtil.m144307b()) {
                f = 440.0f;
            } else {
                f = 1.0f;
            }
            this.f143775m = mo145867a(gVar.mo89222a(f).mo89257p(80).mo89226a(new DialogInterface.OnCancelListener() {
                /* class com.ss.android.lark.widget.dialog.AbstractC58413a.DialogInterface$OnCancelListenerC584152 */

                public void onCancel(DialogInterface dialogInterface) {
                    if (AbstractC58413a.this.f143780r != null) {
                        AbstractC58413a.this.f143780r.run();
                    }
                }
            }).mo89227a(new DialogInterface.OnDismissListener() {
                /* class com.ss.android.lark.widget.dialog.AbstractC58413a.DialogInterface$OnDismissListenerC584141 */

                public void onDismiss(DialogInterface dialogInterface) {
                    AbstractC58413a.this.mo145872b();
                    AbstractC58413a.this.f143780r = null;
                }
            }).mo89260s(R.layout.widget_base_drawer_dialog).mo89230a(this)).mo89239c();
        }
        return this;
    }

    /* renamed from: b */
    public T mo197764b(boolean z) {
        this.f143773c = z;
        return this;
    }

    /* renamed from: b */
    public <E extends View> E mo197763b(int i) {
        return (E) this.f143776n.findViewById(i);
    }

    public AbstractC58413a(Context context) {
        this.f143774l = context;
    }

    /* renamed from: a */
    public T mo197760a(int i) {
        this.f143781s = i;
        return this;
    }

    /* renamed from: a */
    public T mo197761a(Runnable runnable) {
        this.f143780r = runnable;
        return this;
    }

    /* renamed from: a */
    private void m226466a(Window window) {
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | DynamicModule.f58006b);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: a */
    public T mo197762a(boolean z) {
        this.f143772b = z;
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
    /* renamed from: a */
    public void mo89273a(DialogC25637f fVar) {
        super.mo89273a(fVar);
        m226466a(fVar.getWindow());
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
    /* renamed from: b */
    public void mo89274b(DialogC25637f fVar) {
        int i;
        super.mo89274b(fVar);
        Window window = fVar.getWindow();
        if (window != null) {
            this.f143776n = fVar.findViewById(R.id.wbddRootFl);
            this.f143777o = fVar.findViewById(R.id.wbddScrollFl);
            this.f143778p = fVar.findViewById(R.id.wbddThumbFl);
            this.f143771a = (EditText) fVar.findViewById(R.id.wbddFocusEt);
            this.f143779q = (FrameLayout) fVar.findViewById(R.id.wbddContentFl);
            window.getLayoutInflater().inflate(mo145866a(), this.f143779q);
            if (!this.f143772b) {
                this.f143778p.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
                this.f143778p.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            this.f143776n.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.dialog.AbstractC58413a.View$OnClickListenerC584163 */

                public void onClick(View view) {
                    AbstractC58413a.this.mo197766g();
                    if (AbstractC58413a.this.f143780r != null) {
                        AbstractC58413a.this.f143780r.run();
                    }
                }
            });
            fVar.setOnShowListener(new DialogInterface.OnShowListener() {
                /* class com.ss.android.lark.widget.dialog.AbstractC58413a.DialogInterface$OnShowListenerC584174 */

                public void onShow(DialogInterface dialogInterface) {
                    if (AbstractC58413a.this.f143775m.getWindow() != null) {
                        AbstractC58413a.this.f143775m.getWindow().getDecorView().postDelayed(new Runnable() {
                            /* class com.ss.android.lark.widget.dialog.AbstractC58413a.DialogInterface$OnShowListenerC584174.RunnableC584181 */

                            public void run() {
                                if (AbstractC58413a.this.f143775m.getWindow() != null) {
                                    AbstractC58413a.this.f143775m.getWindow().setWindowAnimations(R.style.WidgetDrawerDialogAnim);
                                }
                            }
                        }, 300);
                    }
                }
            });
            TouchUtils.m230143a(this.f143778p, new TouchUtils.AbstractView$OnTouchListenerC59251a() {
                /* class com.ss.android.lark.widget.dialog.AbstractC58413a.C584195 */

                @Override // com.ss.android.lark.widget.util.TouchUtils.AbstractView$OnTouchListenerC59251a
                /* renamed from: a */
                public boolean mo197773a(View view, int i, int i2, MotionEvent motionEvent) {
                    AbstractC58413a.this.mo145872b();
                    return true;
                }

                @Override // com.ss.android.lark.widget.util.TouchUtils.AbstractView$OnTouchListenerC59251a
                /* renamed from: a */
                public boolean mo197772a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, MotionEvent motionEvent) {
                    AbstractC58413a.this.f143777o.scrollTo(0, Math.max(Math.min(-i7, 0), -AbstractC58413a.this.f143779q.getHeight()));
                    return true;
                }

                @Override // com.ss.android.lark.widget.util.TouchUtils.AbstractView$OnTouchListenerC59251a
                /* renamed from: b */
                public boolean mo197774b(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, MotionEvent motionEvent) {
                    if ((-AbstractC58413a.this.f143777o.getScrollY()) > UIHelper.dp2px(60.0f)) {
                        if (AbstractC58413a.this.f143780r != null) {
                            AbstractC58413a.this.f143780r.run();
                        }
                        AbstractC58413a.this.f143775m.dismiss();
                    } else {
                        ValueAnimator ofInt = ValueAnimator.ofInt(AbstractC58413a.this.f143777o.getScrollY(), 0);
                        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.ss.android.lark.widget.dialog.AbstractC58413a.C584195.C584201 */

                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                AbstractC58413a.this.f143777o.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        });
                        ofInt.setInterpolator(new AccelerateInterpolator(0.5f));
                        ofInt.setDuration(200L).start();
                    }
                    return true;
                }
            });
            this.f143777o.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.widget.dialog.AbstractC58413a.View$OnTouchListenerC584216 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return AbstractC58413a.this.f143778p.dispatchTouchEvent(motionEvent);
                }
            });
            if (this.f143773c) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f143777o.getLayoutParams();
                layoutParams.gravity = -1;
                this.f143777o.setLayoutParams(layoutParams);
                if (this.f143781s <= 0) {
                    i = DeviceUtils.getScreenHeight(this.f143774l) / 6;
                } else {
                    i = DeviceUtils.getScreenHeight(this.f143774l) - this.f143781s;
                }
                this.f143776n.setPadding(0, i, 0, 0);
            } else {
                this.f143777o.post(new Runnable() {
                    /* class com.ss.android.lark.widget.dialog.AbstractC58413a.RunnableC584227 */

                    public void run() {
                        int i;
                        if (AbstractC58413a.this.f143781s <= 0) {
                            i = (DeviceUtils.getScreenHeight(AbstractC58413a.this.f143774l) * 5) / 6;
                        } else {
                            i = AbstractC58413a.this.f143781s;
                        }
                        if (AbstractC58413a.this.f143777o.getHeight() > i) {
                            ViewGroup.LayoutParams layoutParams = AbstractC58413a.this.f143777o.getLayoutParams();
                            layoutParams.height = i;
                            AbstractC58413a.this.f143777o.setLayoutParams(layoutParams);
                        }
                    }
                });
            }
            mo145868c(fVar);
        }
    }
}
