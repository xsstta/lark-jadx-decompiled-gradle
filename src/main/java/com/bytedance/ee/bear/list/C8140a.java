package com.bytedance.ee.bear.list;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.bizwidget.p271a.C4861b;
import com.bytedance.ee.bear.list.sort.AbstractC8757c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.a */
public class C8140a extends C4861b {

    /* renamed from: c */
    static final /* synthetic */ boolean f21725c = true;

    /* renamed from: d */
    private String f21726d;

    /* renamed from: e */
    private Bundle f21727e;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m32493f() {
        if (C13726a.m55676b(getActivity())) {
            mo5513b();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
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
            window.setWindowAnimations(R.style.ActionSheetAnimation);
            window.setBackgroundDrawableResource(17170445);
            TypedValue typedValue = new TypedValue();
            getResources().getValue(R.dimen.spacekit_dialog_background_dim_amount, typedValue, f21725c);
            window.setDimAmount(typedValue.getFloat());
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (f21725c || arguments != null) {
            this.f21726d = arguments.getString("contentClass", "");
            this.f21727e = arguments.getBundle("contentArgs");
            return;
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Fragment instantiate = instantiate(getContext(), this.f21726d, this.f21727e);
        if (instantiate instanceof AbstractC8757c) {
            AbstractC8757c cVar = (AbstractC8757c) instantiate;
            cVar.mo33804a(new AbstractC8757c.AbstractC8758a() {
                /* class com.bytedance.ee.bear.list.$$Lambda$a$ltaergMMV9dnZBhyjNG8NWpVJgs */

                @Override // com.bytedance.ee.bear.list.sort.AbstractC8757c.AbstractC8758a
                public final void close() {
                    C8140a.this.m32493f();
                }
            });
            Dialog v_ = v_();
            if (v_ != null) {
                v_.setOnKeyListener(new DialogInterface.OnKeyListener() {
                    /* class com.bytedance.ee.bear.list.$$Lambda$a$loX_aCrKsTjFUhOVsEYSdq961jE */

                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        return C8140a.m32492a(AbstractC8757c.this, dialogInterface, i, keyEvent);
                    }
                });
            }
        }
        getChildFragmentManager().beginTransaction().replace(R.id.wrapContent, instantiate).commitAllowingStateLoss();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(v_());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.desktop_compat_action_dialog_fragment, viewGroup, false);
    }

    /* renamed from: a */
    public static C8140a m32491a(FragmentActivity fragmentActivity, Class<? extends Fragment> cls, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("contentClass", cls.getName());
        bundle2.putBundle("contentArgs", bundle);
        C8140a aVar = (C8140a) Fragment.instantiate(fragmentActivity, C8140a.class.getName(), bundle2);
        if (C13726a.m55676b(fragmentActivity)) {
            aVar.mo5511a(fragmentActivity.getSupportFragmentManager(), cls.getName());
        } else {
            C13479a.m54759a("ActionSheetDialogFrag", "show when activity not active", new IllegalStateException());
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m32492a(AbstractC8757c cVar, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        cVar.mo33803a();
        return false;
    }
}
