package com.ss.android.lark.desktopmode.p1788b.p1789a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.AbstractC36518c;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.desktopmode.b.a.b */
public class DialogInterface$OnCancelListenerC36531b implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, AbstractC36518c {

    /* renamed from: a */
    int f94058a;

    /* renamed from: b */
    int f94059b = R.style.DesktopDialog;

    /* renamed from: c */
    boolean f94060c = true;

    /* renamed from: d */
    boolean f94061d = true;

    /* renamed from: e */
    int f94062e = -1;

    /* renamed from: f */
    DialogC36530a f94063f;

    /* renamed from: g */
    boolean f94064g;

    /* renamed from: h */
    boolean f94065h;

    /* renamed from: i */
    boolean f94066i;

    /* renamed from: j */
    private C36516a<FloatWindowParams> f94067j;

    /* renamed from: k */
    private AbstractC36532a f94068k;

    /* renamed from: com.ss.android.lark.desktopmode.b.a.b$a */
    public interface AbstractC36532a {
        /* renamed from: a */
        void mo134856a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: a */
    public void mo134794a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    /* renamed from: f */
    public Dialog mo134852f() {
        return this.f94063f;
    }

    /* renamed from: g */
    public int mo134853g() {
        return this.f94059b;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: c */
    public void mo134797c() {
        DialogC36530a aVar = this.f94063f;
        if (aVar != null) {
            aVar.hide();
        }
    }

    /* renamed from: e */
    public void mo134851e() {
        mo134850a(false);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: a */
    public void mo134791a() {
        DialogC36530a aVar = this.f94063f;
        if (aVar != null) {
            this.f94064g = false;
            aVar.show();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: b */
    public void mo134795b() {
        if (!this.f94066i && !this.f94065h) {
            this.f94065h = true;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: d */
    public void mo134799d() {
        DialogC36530a aVar = this.f94063f;
        if (aVar != null) {
            this.f94064g = true;
            aVar.dismiss();
            this.f94063f = null;
        }
    }

    /* renamed from: h */
    private void m144132h() {
        Dialog f;
        if (this.f94067j.getFragmentParams() != null && this.f94067j.getFragmentParams().getContainerType() == ContainerType.Float && (f = mo134852f()) != null && this.f94067j.getFragmentParams() != null) {
            WindowManager.LayoutParams attributes = f.getWindow().getAttributes();
            FloatWindowParams fragmentParams = this.f94067j.getFragmentParams();
            attributes.gravity = fragmentParams.getGravity();
            if (fragmentParams.getCoordination() != null && fragmentParams.getCoordination().size() == 2) {
                int intValue = fragmentParams.getCoordination().get(0).intValue();
                int intValue2 = fragmentParams.getCoordination().get(1).intValue();
                if (intValue < 0 || intValue2 < 0) {
                    attributes.gravity = 17;
                } else {
                    attributes.x = intValue;
                    attributes.y = intValue2;
                }
            }
            Context context = this.f94067j.getContext();
            if (fragmentParams.getWindowSize() != null && fragmentParams.getWindowSize().size() == 2) {
                attributes.width = UIUtils.dp2px(context, (float) fragmentParams.getWindowSize().get(0).intValue());
                attributes.height = UIUtils.dp2px(context, (float) fragmentParams.getWindowSize().get(1).intValue());
            }
            if (attributes.gravity == 17) {
                attributes.gravity = 8388659;
                Rect rect = new Rect();
                ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                attributes.x = (rect.width() - attributes.width) / 2;
                attributes.y = ((rect.height() + DesktopUtil.m144309c(context)) - attributes.height) / 2;
            }
            attributes.flags &= 2;
            f.getWindow().setAttributes(attributes);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: a */
    public void mo134792a(Context context) {
        if (!this.f94066i) {
            this.f94065h = false;
        }
    }

    /* renamed from: d */
    private DialogC36530a m144131d(Bundle bundle) {
        return new DialogC36530a(this.f94067j.getActivity(), mo134853g());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f94064g) {
            AbstractC36532a aVar = this.f94068k;
            if (aVar != null) {
                aVar.mo134856a();
            }
            mo134850a(true);
        }
    }

    public DialogInterface$OnCancelListenerC36531b(C36516a<FloatWindowParams> aVar) {
        this.f94067j = aVar;
        aVar.setLifecycleCallback(this);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: a */
    public void mo134793a(Bundle bundle) {
        this.f94061d = true;
        if (bundle != null) {
            this.f94058a = bundle.getInt("android:style", 0);
            this.f94059b = bundle.getInt("android:theme", 0);
            this.f94060c = bundle.getBoolean("android:cancelable", true);
            this.f94061d = bundle.getBoolean("android:showsDialog", this.f94061d);
            this.f94062e = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: c */
    public void mo134798c(Bundle bundle) {
        Bundle onSaveInstanceState;
        DialogC36530a aVar = this.f94063f;
        if (!(aVar == null || (onSaveInstanceState = aVar.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f94058a;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f94059b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f94060c;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f94061d;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f94062e;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: a */
    public void mo134849a(AbstractC36532a aVar) {
        this.f94068k = aVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.AbstractC36518c
    /* renamed from: b */
    public void mo134796b(Bundle bundle) {
        Bundle bundle2;
        this.f94063f = m144131d(bundle);
        FloatWindowParams fragmentParams = this.f94067j.getFragmentParams();
        this.f94063f.setCancelable(fragmentParams.isCancelable());
        this.f94063f.getWindow().setDimAmount(fragmentParams.getDimAmount());
        m144130a(this.f94063f, this.f94058a);
        if (this.f94061d) {
            View view = this.f94067j.getView();
            if (view != null) {
                if (view.getParent() == null) {
                    FrameLayout frameLayout = new FrameLayout(this.f94067j.getActivity());
                    int bgResId = fragmentParams.getBgResId();
                    if (bgResId == 0) {
                        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(this.f94067j.getActivity());
                        lKUIRoundableLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        lKUIRoundableLayout.setRadius(6.0f);
                        lKUIRoundableLayout.addView(view);
                        frameLayout.addView(lKUIRoundableLayout);
                        frameLayout.setBackgroundResource(R.drawable.dialog_bg_panel_light);
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    } else {
                        frameLayout.setBackgroundResource(bgResId);
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        frameLayout.addView(view);
                    }
                    this.f94063f.setContentView(frameLayout);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            FragmentActivity activity = this.f94067j.getActivity();
            if (activity != null) {
                this.f94063f.setOwnerActivity(activity);
            }
            this.f94063f.setCancelable(this.f94060c);
            this.f94063f.setOnCancelListener(this);
            this.f94063f.setOnDismissListener(this);
            if (fragmentParams.getOutsideClickListener() != null) {
                this.f94063f.mo134844a(fragmentParams.getOutsideClickListener());
            }
            if (!(bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null)) {
                this.f94063f.onRestoreInstanceState(bundle2);
            }
            m144132h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo134850a(boolean z) {
        if (!this.f94065h) {
            this.f94065h = true;
            this.f94066i = false;
            DialogC36530a aVar = this.f94063f;
            if (aVar != null) {
                aVar.dismiss();
            }
            this.f94064g = true;
            if (this.f94062e >= 0) {
                this.f94067j.getFragmentManager().popBackStack(this.f94062e, 1);
                this.f94062e = -1;
            } else {
                FragmentTransaction beginTransaction = this.f94067j.getFragmentManager().beginTransaction();
                beginTransaction.remove(this.f94067j);
                if (z) {
                    beginTransaction.commitAllowingStateLoss();
                } else {
                    beginTransaction.commit();
                }
            }
            this.f94067j.setLifecycleCallback(null);
            this.f94067j = null;
        }
    }

    /* renamed from: a */
    private void m144130a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    public void mo134848a(FragmentManager fragmentManager, String str) {
        this.f94065h = false;
        this.f94066i = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this.f94067j, str);
        beginTransaction.commitAllowingStateLoss();
    }
}
