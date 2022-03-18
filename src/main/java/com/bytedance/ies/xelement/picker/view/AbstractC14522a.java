package com.bytedance.ies.xelement.picker.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.bytedance.ies.xelement.picker.p820c.C14503a;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14511e;
import com.bytedance.ies.xelement.picker.p824g.C14520a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ies.xelement.picker.view.a */
public abstract class AbstractC14522a {

    /* renamed from: a */
    protected ViewGroup f38385a;

    /* renamed from: b */
    public ViewGroup f38386b;

    /* renamed from: c */
    public AbstractC14511e f38387c;

    /* renamed from: d */
    public boolean f38388d;

    /* renamed from: e */
    public boolean f38389e;

    /* renamed from: f */
    protected int f38390f = 80;

    /* renamed from: g */
    protected View f38391g;

    /* renamed from: h */
    protected boolean f38392h;

    /* renamed from: i */
    private Context f38393i;

    /* renamed from: j */
    private ViewGroup f38394j;

    /* renamed from: k */
    private Animation f38395k;

    /* renamed from: l */
    private Animation f38396l;

    /* renamed from: m */
    private Dialog f38397m;

    /* renamed from: n */
    private boolean f38398n = true;

    /* renamed from: o */
    private View.OnKeyListener f38399o = new View.OnKeyListener() {
        /* class com.bytedance.ies.xelement.picker.view.AbstractC14522a.View$OnKeyListenerC145264 */

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 0 || !AbstractC14522a.this.mo53470f()) {
                return false;
            }
            AbstractC14522a.this.mo53471g();
            return true;
        }
    };

    /* renamed from: p */
    private final View.OnTouchListener f38400p = new View.OnTouchListener() {
        /* class com.bytedance.ies.xelement.picker.view.AbstractC14522a.View$OnTouchListenerC145275 */

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            AbstractC14522a.this.mo53471g();
            return false;
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C14503a mo53460a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo53468d() {
    }

    /* renamed from: m */
    public boolean mo53477m() {
        return false;
    }

    /* renamed from: k */
    public ViewGroup mo53475k() {
        return this.f38385a;
    }

    /* renamed from: l */
    public Dialog mo53476l() {
        return this.f38397m;
    }

    /* renamed from: r */
    private void m58710r() {
        Dialog dialog = this.f38397m;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: o */
    private Animation m58707o() {
        return AnimationUtils.loadAnimation(this.f38393i, C14520a.m58685a(this.f38390f, true));
    }

    /* renamed from: p */
    private Animation m58708p() {
        return AnimationUtils.loadAnimation(this.f38393i, C14520a.m58685a(this.f38390f, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo53467c() {
        this.f38396l = m58707o();
        this.f38395k = m58708p();
    }

    /* renamed from: h */
    public void mo53472h() {
        mo53460a().f38273d.post(new Runnable() {
            /* class com.bytedance.ies.xelement.picker.view.AbstractC14522a.RunnableC145253 */

            public void run() {
                AbstractC14522a.this.mo53460a().f38273d.removeView(AbstractC14522a.this.f38386b);
                AbstractC14522a.this.f38389e = false;
                AbstractC14522a.this.f38388d = false;
                if (AbstractC14522a.this.f38387c != null) {
                    AbstractC14522a.this.f38387c.mo53415a(AbstractC14522a.this);
                }
            }
        });
    }

    /* renamed from: i */
    public void mo53473i() {
        Dialog dialog = this.f38397m;
        if (dialog != null) {
            dialog.setCancelable(mo53460a().f38293x);
        }
    }

    /* renamed from: q */
    private void m58709q() {
        Dialog dialog = this.f38397m;
        if (dialog != null) {
            dialog.show();
            WindowManager.LayoutParams attributes = this.f38397m.getWindow().getAttributes();
            attributes.width = -1;
            this.f38397m.getWindow().setAttributes(attributes);
        }
    }

    /* renamed from: e */
    public void mo53469e() {
        if (mo53477m()) {
            m58709q();
        } else if (!mo53470f()) {
            this.f38389e = true;
            m58705c(this.f38386b);
            this.f38386b.requestFocus();
        }
    }

    /* renamed from: f */
    public boolean mo53470f() {
        if (mo53477m()) {
            return false;
        }
        if (this.f38386b.getParent() != null || this.f38389e) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void mo53485n() {
        Dialog l;
        if (mo53477m() && (l = mo53476l()) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            mo53475k().setLayoutParams(layoutParams);
            Window window = l.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.lynx_picker_slide_anim);
                window.setGravity(80);
                window.setDimAmount(0.3f);
            }
        }
    }

    /* renamed from: g */
    public void mo53471g() {
        if (mo53477m()) {
            m58710r();
        } else if (!this.f38388d) {
            if (this.f38398n) {
                this.f38395k.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.bytedance.ies.xelement.picker.view.AbstractC14522a.animationAnimation$AnimationListenerC145242 */

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        AbstractC14522a.this.mo53472h();
                    }
                });
                this.f38385a.startAnimation(this.f38395k);
            } else {
                mo53472h();
            }
            this.f38388d = true;
        }
    }

    /* renamed from: j */
    public void mo53474j() {
        if (this.f38394j != null) {
            Dialog dialog = new Dialog(this.f38393i, R.style.custom_dialog2);
            this.f38397m = dialog;
            dialog.setCancelable(mo53460a().f38293x);
            this.f38397m.setContentView(this.f38394j);
            Window window = this.f38397m.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.lynx_picker_scale_anim);
                window.setGravity(17);
            }
            this.f38397m.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ies.xelement.picker.view.AbstractC14522a.DialogInterface$OnDismissListenerC145286 */

                public void onDismiss(DialogInterface dialogInterface) {
                    if (AbstractC14522a.this.f38387c != null) {
                        AbstractC14522a.this.f38387c.mo53415a(AbstractC14522a.this);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo53465b() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater from = LayoutInflater.from(this.f38393i);
        if (mo53477m()) {
            ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.lynx_layout_basepicker, (ViewGroup) null, false);
            this.f38394j = viewGroup;
            viewGroup.setBackgroundColor(0);
            this.f38385a = (ViewGroup) this.f38394j.findViewById(R.id.content_container);
            layoutParams.leftMargin = 30;
            layoutParams.rightMargin = 30;
            this.f38385a.setLayoutParams(layoutParams);
            mo53474j();
        } else {
            if (mo53460a().f38273d == null) {
                mo53460a().f38273d = (ViewGroup) ((Activity) this.f38393i).getWindow().getDecorView();
            }
            ViewGroup viewGroup2 = (ViewGroup) from.inflate(R.layout.lynx_layout_basepicker, mo53460a().f38273d, false);
            this.f38386b = viewGroup2;
            viewGroup2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (mo53460a().f38290u != -1) {
                this.f38386b.setBackgroundColor(mo53460a().f38290u);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f38386b.findViewById(R.id.content_container);
            this.f38385a = viewGroup3;
            viewGroup3.setLayoutParams(layoutParams);
        }
        mo53463a(true);
        mo53461a(new AbstractC14511e() {
            /* class com.bytedance.ies.xelement.picker.view.AbstractC14522a.C145231 */

            @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14511e
            /* renamed from: a */
            public void mo53415a(Object obj) {
                if (!AbstractC14522a.this.f38392h && AbstractC14522a.this.mo53460a().f38270a != null) {
                    AbstractC14522a.this.mo53460a().f38270a.mo53380a();
                }
            }
        });
    }

    /* renamed from: a */
    public View mo53459a(int i) {
        return this.f38385a.findViewById(i);
    }

    /* renamed from: b */
    public void mo53466b(View view) {
        mo53485n();
        mo53462a(view);
    }

    /* renamed from: a */
    public AbstractC14522a mo53461a(AbstractC14511e eVar) {
        this.f38387c = eVar;
        return this;
    }

    public AbstractC14522a(Context context) {
        this.f38393i = context;
    }

    /* renamed from: c */
    private void m58705c(View view) {
        mo53460a().f38273d.addView(view);
        if (this.f38398n) {
            this.f38385a.startAnimation(this.f38396l);
        }
    }

    /* renamed from: a */
    public void mo53462a(View view) {
        this.f38391g = view;
        mo53469e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC14522a mo53464b(boolean z) {
        ViewGroup viewGroup = this.f38386b;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.outmost_container);
            if (z) {
                findViewById.setOnTouchListener(this.f38400p);
            } else {
                findViewById.setOnTouchListener(null);
            }
        }
        return this;
    }

    /* renamed from: a */
    public void mo53463a(boolean z) {
        ViewGroup viewGroup;
        if (mo53477m()) {
            viewGroup = this.f38394j;
        } else {
            viewGroup = this.f38386b;
        }
        viewGroup.setFocusable(z);
        viewGroup.setFocusableInTouchMode(z);
        if (z) {
            viewGroup.setOnKeyListener(this.f38399o);
        } else {
            viewGroup.setOnKeyListener(null);
        }
    }
}
