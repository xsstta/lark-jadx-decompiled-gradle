package com.bytedance.ee.bear.list.create;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.bizwidget.p271a.C4861b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.create.f */
public class C8238f extends C4861b {

    /* renamed from: c */
    private boolean f22216c;

    /* renamed from: d */
    private boolean f22217d;

    /* renamed from: e */
    private long f22218e;

    /* renamed from: g */
    private void m33824g() {
        Dialog v_ = v_();
        if (v_ == null) {
            C13479a.m54758a("CreationMenuPanel", "addWatermark()... dialog == null");
        } else {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(v_);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m33825h() {
        try {
            if (isAdded()) {
                super.mo5513b();
            } else {
                C13479a.m54758a("CreationMenuPanel", "fragment is not add");
            }
        } catch (Throwable th) {
            C13479a.m54761a("CreationMenuPanel", th);
            C13606d.m55245a("CreationMenuPanel_dismissIgnoreErr()", th);
        }
    }

    /* renamed from: f */
    public void mo32338f() {
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(R.id.wrapContent);
        if (findFragmentById instanceof C8247j) {
            ((C8247j) findFragmentById).mo32346a();
        }
    }

    /* renamed from: i */
    private boolean m33826i() {
        Dialog v_ = v_();
        if (v_ == null || v_.getWindow() == null || (v_.getWindow().getDecorView().getVisibility() != 8 && v_.getWindow().getDecorView().getVisibility() != 4)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: b */
    public void mo5513b() {
        Dialog v_ = v_();
        if (v_ != null && v_.isShowing() && getView() != null) {
            getView().animate().y((float) C13749l.m55748b()).withEndAction(new Runnable() {
                /* class com.bytedance.ee.bear.list.create.$$Lambda$f$d5q1w6yai4pSCezX6fComEmwIuM */

                public final void run() {
                    C8238f.this.m33825h();
                }
            }).setDuration(250).start();
        } else if (m33826i()) {
            m33825h();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog v_ = v_();
        if (!(v_ == null || this.f22216c || getView() == null)) {
            this.f22216c = true;
            View view = getView();
            view.post(new Runnable(view, v_) {
                /* class com.bytedance.ee.bear.list.create.$$Lambda$f$i5riVviYROM03Jt8hx02T4Mhlmw */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ Dialog f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C8238f.this.m33822a((C8238f) this.f$1, (View) this.f$2);
                }
            });
        }
        super.onStart();
        if (v_ == null) {
            window = null;
        } else {
            window = v_.getWindow();
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            attributes.gravity = 80;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    public static C8238f m33821a(FragmentActivity fragmentActivity, Bundle bundle) {
        C8238f fVar = (C8238f) Fragment.instantiate(fragmentActivity, C8238f.class.getName(), bundle);
        fVar.mo5510a(0, R.style.SpaceFullDialogFragment);
        fVar.mo5511a(fragmentActivity.getSupportFragmentManager(), "CreationMenuPanel");
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33822a(View view, Dialog dialog) {
        view.setY((float) C13749l.m55748b());
        view.setVisibility(0);
        view.animate().y(BitmapDescriptorFactory.HUE_RED).setDuration(250).start();
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            /* class com.bytedance.ee.bear.list.create.$$Lambda$f$gTiRZ4CRUMlXNZes1dTsW2i1OjI */

            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return C8238f.this.m33823a(dialogInterface, i, keyEvent);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() == null) {
            C13479a.m54758a("CreationMenuPanel", "args is null !!!");
            mo5513b();
            return;
        }
        Fragment instantiate = instantiate(getContext(), C8247j.class.getName(), getArguments());
        this.f22217d = getArguments().getBoolean("report_click_cancel", false);
        C13479a.m54764b("CreationMenuPanel", "onViewCreated()...reportClickCancel = " + this.f22217d);
        getChildFragmentManager().beginTransaction().replace(R.id.wrapContent, instantiate).commitAllowingStateLoss();
        view.findViewById(R.id.closeBtn).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.create.C8238f.C82391 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C8238f.this.mo5513b();
                C8238f.this.mo32338f();
            }
        });
        view.findViewById(R.id.placeView).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.create.C8238f.C82402 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C8238f.this.mo5513b();
                C8238f.this.mo32338f();
            }
        });
        m33824g();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.list_fragment_creation_panel, viewGroup, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m33823a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        mo5513b();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f22218e > 500) {
            mo32338f();
        }
        this.f22218e = currentTimeMillis;
        return true;
    }
}
