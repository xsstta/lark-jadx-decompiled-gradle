package com.bytedance.ee.android.file.picker.lib.widget.loadingdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view.AnnularView;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view.BackgroundLayout;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view.BarView;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view.PieView;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view.SpinView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class LoadingDialog {

    /* renamed from: a */
    public DialogC4138a f12534a;

    /* renamed from: b */
    public float f12535b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c */
    public int f12536c;

    /* renamed from: d */
    public float f12537d;

    /* renamed from: e */
    public int f12538e;

    /* renamed from: f */
    public int f12539f;

    /* renamed from: g */
    public boolean f12540g;

    /* renamed from: h */
    public boolean f12541h;

    /* renamed from: i */
    private Context f12542i;

    /* renamed from: j */
    private int f12543j;

    /* renamed from: k */
    private Handler f12544k;

    public enum Style {
        SPIN_INDETERMINATE,
        PIE_DETERMINATE,
        ANNULAR_DETERMINATE,
        BAR_DETERMINATE
    }

    /* renamed from: b */
    public boolean mo16207b() {
        DialogC4138a aVar = this.f12534a;
        if (aVar == null || !aVar.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo16209c() {
        this.f12541h = true;
        DialogC4138a aVar = this.f12534a;
        if (aVar != null && aVar.isShowing()) {
            this.f12534a.dismiss();
        }
        Handler handler = this.f12544k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f12544k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog$2 */
    public static /* synthetic */ class C41372 {

        /* renamed from: a */
        static final /* synthetic */ int[] f12546a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog$Style[] r0 = com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.C41372.f12546a = r0
                com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog$Style r1 = com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.Style.SPIN_INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.C41372.f12546a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog$Style r1 = com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.Style.PIE_DETERMINATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.C41372.f12546a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog$Style r1 = com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.Style.ANNULAR_DETERMINATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.C41372.f12546a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog$Style r1 = com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.Style.BAR_DETERMINATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.C41372.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog$a */
    public class DialogC4138a extends Dialog {

        /* renamed from: b */
        private AbstractC4139a f12548b;

        /* renamed from: c */
        private AbstractC4140b f12549c;

        /* renamed from: d */
        private View f12550d;

        /* renamed from: e */
        private TextView f12551e;

        /* renamed from: f */
        private TextView f12552f;

        /* renamed from: g */
        private String f12553g;

        /* renamed from: h */
        private String f12554h;

        /* renamed from: i */
        private FrameLayout f12555i;

        /* renamed from: j */
        private BackgroundLayout f12556j;

        /* renamed from: k */
        private int f12557k;

        /* renamed from: l */
        private int f12558l;

        /* renamed from: m */
        private float f12559m;

        /* renamed from: n */
        private int f12560n;

        /* renamed from: o */
        private int f12561o;

        /* renamed from: p */
        private int f12562p = -1;

        /* renamed from: q */
        private int f12563q = -1;

        /* renamed from: b */
        private void m17225b() {
            ViewGroup.LayoutParams layoutParams = this.f12556j.getLayoutParams();
            layoutParams.width = UIHelper.f12487a.mo16121a(getContext(), (float) this.f12557k);
            layoutParams.height = UIHelper.f12487a.mo16121a(getContext(), (float) this.f12558l);
            this.f12556j.setLayoutParams(layoutParams);
        }

        /* renamed from: c */
        private void m17227c() {
            ViewGroup.LayoutParams layoutParams = this.f12555i.getLayoutParams();
            layoutParams.width = UIHelper.f12487a.mo16121a(getContext(), (float) this.f12560n);
            layoutParams.height = UIHelper.f12487a.mo16121a(getContext(), (float) this.f12561o);
            this.f12555i.setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        private void m17224a() {
            BackgroundLayout backgroundLayout = (BackgroundLayout) findViewById(R.id.background);
            this.f12556j = backgroundLayout;
            backgroundLayout.setBaseColor(LoadingDialog.this.f12536c);
            this.f12556j.setCornerRadius(LoadingDialog.this.f12537d);
            if (this.f12557k != 0) {
                m17225b();
            }
            this.f12555i = (FrameLayout) findViewById(R.id.container);
            if (this.f12560n != 0) {
                m17227c();
            }
            m17226b(this.f12550d);
            AbstractC4139a aVar = this.f12548b;
            if (aVar != null) {
                aVar.setMax(LoadingDialog.this.f12539f);
            }
            AbstractC4140b bVar = this.f12549c;
            if (bVar != null) {
                bVar.setAnimationSpeed((float) LoadingDialog.this.f12538e);
            }
            this.f12551e = (TextView) findViewById(R.id.label);
            float f = this.f12559m;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                mo16211a(f);
            }
            mo16215a(this.f12553g, this.f12562p);
            this.f12552f = (TextView) findViewById(R.id.details_label);
            mo16217b(this.f12554h, this.f12563q);
        }

        /* renamed from: b */
        private void m17226b(View view) {
            if (view != null) {
                this.f12555i.addView(view, new ViewGroup.LayoutParams(-2, -2));
            }
        }

        /* renamed from: a */
        public void mo16211a(float f) {
            this.f12559m = f;
            TextView textView = this.f12551e;
            if (textView != null) {
                textView.setTextSize(f);
                this.f12551e.setVisibility(0);
            }
        }

        /* renamed from: a */
        public void mo16213a(View view) {
            if (view != null) {
                if (view instanceof AbstractC4139a) {
                    this.f12548b = (AbstractC4139a) view;
                }
                if (view instanceof AbstractC4140b) {
                    this.f12549c = (AbstractC4140b) view;
                }
                this.f12550d = view;
                if (isShowing()) {
                    this.f12555i.removeAllViews();
                    m17226b(view);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            requestWindowFeature(1);
            setContentView(R.layout.file_picker_file_loading_dialog_layout);
            Window window = getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = LoadingDialog.this.f12535b;
            attributes.gravity = 17;
            window.setAttributes(attributes);
            setCanceledOnTouchOutside(false);
            m17224a();
        }

        /* renamed from: a */
        public void mo16214a(String str) {
            this.f12553g = str;
            TextView textView = this.f12551e;
            if (textView == null) {
                return;
            }
            if (str != null) {
                textView.setText(str);
                this.f12551e.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }

        public DialogC4138a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public void mo16212a(int i, int i2) {
            this.f12560n = i;
            this.f12561o = i2;
            if (this.f12555i != null) {
                m17227c();
            }
        }

        /* renamed from: b */
        public void mo16216b(int i, int i2) {
            this.f12557k = i;
            this.f12558l = i2;
            if (this.f12556j != null) {
                m17225b();
            }
        }

        /* renamed from: b */
        public void mo16217b(String str, int i) {
            this.f12554h = str;
            this.f12563q = i;
            TextView textView = this.f12552f;
            if (textView == null) {
                return;
            }
            if (str != null) {
                textView.setText(str);
                this.f12552f.setTextColor(i);
                this.f12552f.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }

        /* renamed from: a */
        public void mo16215a(String str, int i) {
            this.f12553g = str;
            this.f12562p = i;
            TextView textView = this.f12551e;
            if (textView == null) {
                return;
            }
            if (str != null) {
                textView.setText(str);
                this.f12551e.setTextColor(i);
                this.f12551e.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public LoadingDialog mo16198a() {
        if (!mo16207b()) {
            this.f12541h = false;
            if (this.f12543j == 0) {
                this.f12534a.show();
            } else {
                Handler handler = new Handler();
                this.f12544k = handler;
                handler.postDelayed(new Runnable() {
                    /* class com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog.RunnableC41361 */

                    public void run() {
                        if (LoadingDialog.this.f12534a != null && !LoadingDialog.this.f12541h) {
                            LoadingDialog.this.f12534a.show();
                        }
                    }
                }, (long) this.f12543j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo16200a(int i) {
        this.f12538e = i;
        return this;
    }

    /* renamed from: b */
    public LoadingDialog mo16205b(float f) {
        this.f12537d = f;
        return this;
    }

    /* renamed from: a */
    public static LoadingDialog m17211a(Context context) {
        return new LoadingDialog(context);
    }

    /* renamed from: c */
    public LoadingDialog mo16208c(float f) {
        this.f12534a.mo16211a(f);
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo16199a(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            this.f12535b = f;
        }
        return this;
    }

    public LoadingDialog(Context context) {
        this.f12542i = context;
        this.f12534a = new DialogC4138a(context);
        this.f12536c = context.getResources().getColor(R.color.file_picker_loading_dialog_default_color);
        this.f12538e = 1;
        this.f12537d = 10.0f;
        this.f12540g = true;
        this.f12543j = 0;
        this.f12541h = false;
        mo16202a(Style.SPIN_INDETERMINATE);
    }

    /* renamed from: a */
    public LoadingDialog mo16202a(Style style) {
        View view;
        int i = C41372.f12546a[style.ordinal()];
        if (i == 1) {
            view = new SpinView(this.f12542i);
        } else if (i == 2) {
            view = new PieView(this.f12542i);
        } else if (i == 3) {
            view = new AnnularView(this.f12542i);
        } else if (i != 4) {
            view = null;
        } else {
            view = new BarView(this.f12542i);
        }
        this.f12534a.mo16213a(view);
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo16203a(String str) {
        this.f12534a.mo16214a(str);
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo16204a(boolean z) {
        this.f12534a.setCancelable(z);
        return this;
    }

    /* renamed from: b */
    public LoadingDialog mo16206b(int i, int i2) {
        this.f12534a.mo16212a(i, i2);
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo16201a(int i, int i2) {
        this.f12534a.mo16216b(i, i2);
        return this;
    }
}
