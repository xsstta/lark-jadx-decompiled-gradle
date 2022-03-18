package com.tt.miniapp.p3299l.p3300a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.p3293h.DialogC66199d;
import com.tt.miniapp.view.dialog.C67179c;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.p3255a.C65678c;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.tt.miniapp.l.a.b */
public class C66290b extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    private static boolean f167292c;

    /* renamed from: d */
    private ImageView f167293d;

    /* renamed from: e */
    private TextView f167294e;

    /* renamed from: f */
    private TextView f167295f;

    /* renamed from: g */
    private AbstractC66293a f167296g;

    /* renamed from: h */
    private IAppContext f167297h;

    /* renamed from: com.tt.miniapp.l.a.b$a */
    public interface AbstractC66293a {
        /* renamed from: a */
        void mo231679a();
    }

    /* renamed from: com.tt.miniapp.l.a.b$b */
    private static final class DialogInterface$OnKeyListenerC66294b implements DialogInterface.OnKeyListener {
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return 4 == i;
        }

        private DialogInterface$OnKeyListenerC66294b() {
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        super.onDestroyView();
        this.f167293d = null;
        this.f167295f = null;
        this.f167294e = null;
        this.f167296g = null;
    }

    /* renamed from: f */
    public void mo231687f() {
        C66020b.m258530a("mp_retain_guide_done", this.f167297h).mo231092a();
        if (this.f167296g != null) {
            AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(this.f167297h).getAppInfo();
            final AbstractC66293a aVar = this.f167296g;
            if (appInfo == null || !appInfo.isGame() || f167292c) {
                this.f167296g.mo231679a();
            } else {
                C67866g.m264028a(new Runnable() {
                    /* class com.tt.miniapp.p3299l.p3300a.C66290b.RunnableC662922 */

                    public void run() {
                        AbstractC66293a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo231679a();
                        }
                    }
                }, 220);
            }
        }
        f167292c = true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        AppBrandLogger.m52828d("tma_ReenterDialog", "r64091: onStart");
        if (AppbrandApplicationImpl.getInst(this.f167297h).getAppInfo().isGame()) {
            Window window = null;
            Dialog v_ = v_();
            if (v_ != null) {
                window = v_.getWindow();
            }
            C67179c.m261840a(window);
            super.onStart();
            C67179c.m261842b(window);
            return;
        }
        super.onStart();
    }

    /* renamed from: a */
    public void mo231685a(IAppContext iAppContext) {
        this.f167297h = iAppContext;
    }

    /* renamed from: a */
    public void mo231686a(AbstractC66293a aVar) {
        this.f167296g = aVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo231687f();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo5510a(2, R.style.microapp_m_DialogTheme);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        DialogC66199d dVar = new DialogC66199d(getActivity(), mo5515e());
        dVar.setCancelable(false);
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnKeyListener(new DialogInterface$OnKeyListenerC66294b());
        return dVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            C67179c.m261837a(view.getContext(), view, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("key_text_title", "");
            String string2 = arguments.getString("key_image_uri", "");
            String string3 = arguments.getString("key_btn_color", "");
            String string4 = arguments.getString("key_btn_text", "");
            Resources resources = getResources();
            try {
                this.f167294e.setText(string);
                float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.microapp_m_reenter_guide_dialog_image_width);
                HostDependManager.getInst().loadImage(this.f167293d.getContext(), new C65678c(string2).mo229921a(new ColorDrawable(0)).mo229920a((int) dimensionPixelSize, (int) ((((float) resources.getDimensionPixelSize(R.dimen.microapp_m_reenter_guide_dialog_image_height)) / dimensionPixelSize) * C67590h.m263065a(this.f167293d.getContext(), (float) C67179c.m261841a(this.f167293d.getContext(), true)[0]))).mo229922a(this.f167293d));
                this.f167295f.setTextColor(Color.parseColor(string3));
                this.f167295f.setText(string4);
            } catch (RuntimeException e) {
                AppBrandLogger.eWithThrowable("tma_ReenterDialog", "r49403 dialog error", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.microapp_m_dialog_reenter, viewGroup, false);
        this.f167293d = (ImageView) inflate.findViewById(R.id.iv_image);
        this.f167294e = (TextView) inflate.findViewById(R.id.tv_desc);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_confirm);
        this.f167295f = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.p3299l.p3300a.C66290b.View$OnClickListenerC662911 */

            public void onClick(View view) {
                AppBrandLogger.m52828d("tma_ReenterDialog", "r64091: click guide dialog btn");
                C66290b.this.mo5513b();
            }
        });
        return inflate;
    }
}
