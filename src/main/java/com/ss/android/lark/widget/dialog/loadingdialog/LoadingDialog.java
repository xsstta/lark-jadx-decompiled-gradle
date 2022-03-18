package com.ss.android.lark.widget.dialog.loadingdialog;

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
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.dialog.loadingdialog.view.AnnularView;
import com.ss.android.lark.widget.dialog.loadingdialog.view.BackgroundLayout;
import com.ss.android.lark.widget.dialog.loadingdialog.view.BarView;
import com.ss.android.lark.widget.dialog.loadingdialog.view.PieView;
import com.ss.android.lark.widget.dialog.loadingdialog.view.SpinView;

public class LoadingDialog {

    /* renamed from: a */
    public DialogC58431a f143805a;

    /* renamed from: b */
    public float f143806b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c */
    public int f143807c;

    /* renamed from: d */
    public float f143808d;

    /* renamed from: e */
    public int f143809e;

    /* renamed from: f */
    public int f143810f;

    /* renamed from: g */
    public boolean f143811g;

    /* renamed from: h */
    public boolean f143812h;

    /* renamed from: i */
    private Context f143813i;

    /* renamed from: j */
    private int f143814j;

    /* renamed from: k */
    private Handler f143815k;

    public enum Style {
        SPIN_INDETERMINATE,
        PIE_DETERMINATE,
        ANNULAR_DETERMINATE,
        BAR_DETERMINATE
    }

    /* renamed from: b */
    public boolean mo197790b() {
        DialogC58431a aVar = this.f143805a;
        if (aVar == null || !aVar.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo197792c() {
        this.f143812h = true;
        DialogC58431a aVar = this.f143805a;
        if (aVar != null && aVar.isShowing()) {
            this.f143805a.dismiss();
        }
        Handler handler = this.f143815k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f143815k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog$2 */
    public static /* synthetic */ class C584302 {

        /* renamed from: a */
        static final /* synthetic */ int[] f143817a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog$Style[] r0 = com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.C584302.f143817a = r0
                com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog$Style r1 = com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.Style.SPIN_INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.C584302.f143817a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog$Style r1 = com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.Style.PIE_DETERMINATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.C584302.f143817a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog$Style r1 = com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.Style.ANNULAR_DETERMINATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.C584302.f143817a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog$Style r1 = com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.Style.BAR_DETERMINATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.C584302.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog$a */
    public class DialogC58431a extends Dialog {

        /* renamed from: b */
        private AbstractC58433a f143819b;

        /* renamed from: c */
        private AbstractC58434b f143820c;

        /* renamed from: d */
        private View f143821d;

        /* renamed from: e */
        private TextView f143822e;

        /* renamed from: f */
        private TextView f143823f;

        /* renamed from: g */
        private String f143824g;

        /* renamed from: h */
        private String f143825h;

        /* renamed from: i */
        private FrameLayout f143826i;

        /* renamed from: j */
        private BackgroundLayout f143827j;

        /* renamed from: k */
        private int f143828k;

        /* renamed from: l */
        private int f143829l;

        /* renamed from: m */
        private float f143830m;

        /* renamed from: n */
        private int f143831n;

        /* renamed from: o */
        private int f143832o;

        /* renamed from: p */
        private int f143833p = -1;

        /* renamed from: q */
        private int f143834q = -1;

        /* renamed from: b */
        private void m226507b() {
            ViewGroup.LayoutParams layoutParams = this.f143827j.getLayoutParams();
            layoutParams.width = UIUtils.dp2px(getContext(), (float) this.f143828k);
            layoutParams.height = UIUtils.dp2px(getContext(), (float) this.f143829l);
            this.f143827j.setLayoutParams(layoutParams);
        }

        /* renamed from: c */
        private void m226509c() {
            ViewGroup.LayoutParams layoutParams = this.f143826i.getLayoutParams();
            layoutParams.width = UIUtils.dp2px(getContext(), (float) this.f143831n);
            layoutParams.height = UIUtils.dp2px(getContext(), (float) this.f143832o);
            this.f143826i.setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        private void m226506a() {
            BackgroundLayout backgroundLayout = (BackgroundLayout) findViewById(R.id.background);
            this.f143827j = backgroundLayout;
            backgroundLayout.setBaseColor(LoadingDialog.this.f143807c);
            this.f143827j.setCornerRadius(LoadingDialog.this.f143808d);
            if (this.f143828k != 0) {
                m226507b();
            }
            this.f143826i = (FrameLayout) findViewById(R.id.container);
            if (this.f143831n != 0) {
                m226509c();
            }
            m226508b(this.f143821d);
            AbstractC58433a aVar = this.f143819b;
            if (aVar != null) {
                aVar.setMax(LoadingDialog.this.f143810f);
            }
            AbstractC58434b bVar = this.f143820c;
            if (bVar != null) {
                bVar.setAnimationSpeed((float) LoadingDialog.this.f143809e);
            }
            this.f143822e = (TextView) findViewById(R.id.label);
            float f = this.f143830m;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                mo197794a(f);
            }
            mo197798a(this.f143824g, this.f143833p);
            this.f143823f = (TextView) findViewById(R.id.details_label);
            mo197800b(this.f143825h, this.f143834q);
        }

        /* renamed from: b */
        private void m226508b(View view) {
            if (view != null) {
                this.f143826i.addView(view, new ViewGroup.LayoutParams(-2, -2));
            }
        }

        /* renamed from: a */
        public void mo197794a(float f) {
            this.f143830m = f;
            TextView textView = this.f143822e;
            if (textView != null) {
                textView.setTextSize(f);
                this.f143822e.setVisibility(0);
            }
        }

        /* renamed from: a */
        public void mo197796a(View view) {
            if (view != null) {
                if (view instanceof AbstractC58433a) {
                    this.f143819b = (AbstractC58433a) view;
                }
                if (view instanceof AbstractC58434b) {
                    this.f143820c = (AbstractC58434b) view;
                }
                this.f143821d = view;
                if (isShowing()) {
                    this.f143826i.removeAllViews();
                    m226508b(view);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            requestWindowFeature(1);
            setContentView(R.layout.loading_dialog_layout);
            Window window = getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = LoadingDialog.this.f143806b;
            attributes.gravity = 17;
            window.setAttributes(attributes);
            setCanceledOnTouchOutside(false);
            m226506a();
        }

        /* renamed from: a */
        public void mo197797a(String str) {
            this.f143824g = str;
            TextView textView = this.f143822e;
            if (textView == null) {
                return;
            }
            if (str != null) {
                textView.setText(str);
                this.f143822e.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }

        public DialogC58431a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public void mo197795a(int i, int i2) {
            this.f143831n = i;
            this.f143832o = i2;
            if (this.f143826i != null) {
                m226509c();
            }
        }

        /* renamed from: b */
        public void mo197799b(int i, int i2) {
            this.f143828k = i;
            this.f143829l = i2;
            if (this.f143827j != null) {
                m226507b();
            }
        }

        /* renamed from: b */
        public void mo197800b(String str, int i) {
            this.f143825h = str;
            this.f143834q = i;
            TextView textView = this.f143823f;
            if (textView == null) {
                return;
            }
            if (str != null) {
                textView.setText(str);
                this.f143823f.setTextColor(i);
                this.f143823f.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }

        /* renamed from: a */
        public void mo197798a(String str, int i) {
            this.f143824g = str;
            this.f143833p = i;
            TextView textView = this.f143822e;
            if (textView == null) {
                return;
            }
            if (str != null) {
                textView.setText(str);
                this.f143822e.setTextColor(i);
                this.f143822e.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public LoadingDialog mo197780a() {
        if (!mo197790b()) {
            this.f143812h = false;
            if (this.f143814j == 0) {
                this.f143805a.show();
            } else {
                Handler handler = new Handler();
                this.f143815k = handler;
                handler.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog.RunnableC584291 */

                    public void run() {
                        if (LoadingDialog.this.f143805a != null && !LoadingDialog.this.f143812h) {
                            LoadingDialog.this.f143805a.show();
                        }
                    }
                }, (long) this.f143814j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo197782a(int i) {
        this.f143807c = i;
        return this;
    }

    /* renamed from: b */
    public LoadingDialog mo197787b(float f) {
        this.f143808d = f;
        return this;
    }

    /* renamed from: a */
    public static LoadingDialog m226492a(Context context) {
        return new LoadingDialog(context);
    }

    /* renamed from: b */
    public LoadingDialog mo197788b(int i) {
        this.f143809e = i;
        return this;
    }

    /* renamed from: c */
    public LoadingDialog mo197791c(float f) {
        this.f143805a.mo197794a(f);
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo197781a(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            this.f143806b = f;
        }
        return this;
    }

    public LoadingDialog(Context context) {
        this.f143813i = context;
        this.f143805a = new DialogC58431a(context);
        this.f143807c = C25653b.m91893a(context.getResources().getColor(R.color.lkui_N900), 0.7f);
        this.f143809e = 1;
        this.f143808d = 10.0f;
        this.f143811g = true;
        this.f143814j = 0;
        this.f143812h = false;
        mo197784a(Style.SPIN_INDETERMINATE);
    }

    /* renamed from: a */
    public LoadingDialog mo197784a(Style style) {
        View view;
        int i = C584302.f143817a[style.ordinal()];
        if (i == 1) {
            view = new SpinView(this.f143813i);
        } else if (i == 2) {
            view = new PieView(this.f143813i);
        } else if (i == 3) {
            view = new AnnularView(this.f143813i);
        } else if (i != 4) {
            view = null;
        } else {
            view = new BarView(this.f143813i);
        }
        this.f143805a.mo197796a(view);
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo197785a(String str) {
        this.f143805a.mo197797a(str);
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo197786a(boolean z) {
        this.f143805a.setCancelable(z);
        return this;
    }

    /* renamed from: b */
    public LoadingDialog mo197789b(int i, int i2) {
        this.f143805a.mo197795a(i, i2);
        return this;
    }

    /* renamed from: a */
    public LoadingDialog mo197783a(int i, int i2) {
        this.f143805a.mo197799b(i, i2);
        return this;
    }
}
