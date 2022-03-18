package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC0259b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.bottomsheet.a */
public class DialogC22179a extends DialogC0259b {

    /* renamed from: a */
    boolean f54086a;

    /* renamed from: b */
    boolean f54087b = true;

    /* renamed from: c */
    private BottomSheetBehavior<FrameLayout> f54088c;

    /* renamed from: d */
    private FrameLayout f54089d;

    /* renamed from: e */
    private boolean f54090e = true;

    /* renamed from: f */
    private boolean f54091f;

    /* renamed from: g */
    private BottomSheetBehavior.AbstractC22177a f54092g = new BottomSheetBehavior.AbstractC22177a() {
        /* class com.google.android.material.bottomsheet.DialogC22179a.C221834 */

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24937a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24938a(View view, int i) {
            if (i == 5) {
                DialogC22179a.this.cancel();
            }
        }
    };

    /* renamed from: b */
    public boolean mo76734b() {
        return this.f54086a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo76737d() {
        this.f54088c.mo76714c(this.f54092g);
    }

    /* renamed from: a */
    public BottomSheetBehavior<FrameLayout> mo76733a() {
        if (this.f54088c == null) {
            mo101734e();
        }
        return this.f54088c;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> a = mo76733a();
        if (!this.f54086a || a.mo76717d() == 5) {
            super.cancel();
        } else {
            a.mo76718d(5);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f54088c;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo76717d() == 5) {
            this.f54088c.mo76718d(4);
        }
    }

    /* renamed from: e */
    private FrameLayout mo101734e() {
        if (this.f54089d == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f54089d = frameLayout;
            BottomSheetBehavior<FrameLayout> b = BottomSheetBehavior.m79955b((FrameLayout) frameLayout.findViewById(R.id.design_bottom_sheet));
            this.f54088c = b;
            b.mo76710b(this.f54092g);
            this.f54088c.mo76715c(this.f54087b);
        }
        return this.f54089d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo76735c() {
        if (!this.f54091f) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f54090e = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f54091f = true;
        }
        return this.f54090e;
    }

    @Override // androidx.appcompat.app.DialogC0259b, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m80010a(i, null, null));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0259b
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f54087b != z) {
            this.f54087b = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f54088c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo76715c(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f54087b) {
            this.f54087b = true;
        }
        this.f54090e = z;
        this.f54091f = true;
    }

    @Override // androidx.appcompat.app.DialogC0259b, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m80010a(0, view, null));
    }

    public DialogC22179a(Context context, int i) {
        super(context, m80009a(context, i));
        supportRequestWindowFeature(1);
    }

    /* renamed from: a */
    private static int m80009a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 2131886947;
    }

    @Override // androidx.appcompat.app.DialogC0259b
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m80010a(0, view, layoutParams));
    }

    /* renamed from: a */
    private View m80010a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        mo101734e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f54089d.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f54089d.findViewById(R.id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.bottomsheet.DialogC22179a.View$OnClickListenerC221801 */

            public void onClick(View view) {
                if (DialogC22179a.this.f54087b && DialogC22179a.this.isShowing() && DialogC22179a.this.mo76735c()) {
                    DialogC22179a.this.cancel();
                }
            }
        });
        ViewCompat.m4043a(frameLayout, new C0859a() {
            /* class com.google.android.material.bottomsheet.DialogC22179a.C221812 */

            @Override // androidx.core.view.C0859a
            /* renamed from: a */
            public void mo4535a(View view, C0864d dVar) {
                super.mo4535a(view, dVar);
                if (DialogC22179a.this.f54087b) {
                    dVar.mo4552a(1048576);
                    dVar.mo4604m(true);
                    return;
                }
                dVar.mo4604m(false);
            }

            @Override // androidx.core.view.C0859a
            /* renamed from: a */
            public boolean mo4536a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !DialogC22179a.this.f54087b) {
                    return super.mo4536a(view, i, bundle);
                }
                DialogC22179a.this.cancel();
                return true;
            }
        });
        frameLayout.setOnTouchListener(new View.OnTouchListener() {
            /* class com.google.android.material.bottomsheet.DialogC22179a.View$OnTouchListenerC221823 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.f54089d;
    }
}
