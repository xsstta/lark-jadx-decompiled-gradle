package com.tt.remotedebug.p3439c;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.remotedebug.p3437a.C67958c;
import com.tt.remotedebug.p3438b.C67965b;

/* renamed from: com.tt.remotedebug.c.b */
public class C67967b implements AbstractC67966a {

    /* renamed from: a */
    public C67958c f171232a;

    /* renamed from: b */
    public IAppContext f171233b;

    /* renamed from: c */
    public boolean f171234c;

    /* renamed from: d */
    private DialogC25637f f171235d;

    /* renamed from: e */
    private ViewGroup f171236e;

    @Override // com.tt.remotedebug.p3439c.AbstractC67966a
    /* renamed from: c */
    public void mo235825c(Activity activity) {
        if (this.f171235d.isShowing()) {
            this.f171235d.dismiss();
        }
        ViewGroup viewGroup = this.f171236e;
        if (viewGroup != null && viewGroup.getVisibility() == 4) {
            this.f171236e.setVisibility(0);
        }
    }

    @Override // com.tt.remotedebug.p3439c.AbstractC67966a
    /* renamed from: d */
    public void mo235826d(Activity activity) {
        new C25639g(activity).mo89248g(R.string.OpenPlatform_RealdeviceDebug_endinfo).mo89254m(R.string.OpenPlatform_RealdeviceDebug_exitinfo).mo89224a(R.id.lkui_dialog_btn_right, R.string.OpenPlatform_RealdeviceDebug_ok, new DialogInterface.OnClickListener() {
            /* class com.tt.remotedebug.p3439c.C67967b.DialogInterface$OnClickListenerC679756 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C67967b.this.f171232a.mo235819b();
                ProcessUtil.killCurrentMiniAppProcess();
            }
        }).mo89247e(false).mo89239c();
    }

    @Override // com.tt.remotedebug.p3439c.AbstractC67966a
    /* renamed from: e */
    public void mo235827e(Activity activity) {
        new C25639g(activity).mo89248g(R.string.OpenPlatform_RealdeviceDebug_hints).mo89254m(R.string.OpenPlatform_RealdeviceDebug_wificonfirm).mo89224a(R.id.lkui_dialog_btn_right, R.string.OpenPlatform_RealdeviceDebug_ok, new DialogInterface.OnClickListener() {
            /* class com.tt.remotedebug.p3439c.C67967b.DialogInterface$OnClickListenerC679767 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C67967b.this.f171232a.mo235819b();
                ProcessUtil.killCurrentMiniAppProcess();
            }
        }).mo89247e(false).mo89239c();
    }

    @Override // com.tt.remotedebug.p3439c.AbstractC67966a
    /* renamed from: a */
    public void mo235823a(final Activity activity) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.lark_debug_opdev_layout, (ViewGroup) null);
        this.f171236e = viewGroup;
        final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.debug_connect_status_expand);
        final View findViewById = this.f171236e.findViewById(R.id.debug_expand_divider);
        final FrameLayout frameLayout = (FrameLayout) this.f171236e.findViewById(R.id.debug_close_layout);
        imageView.setOnClickListener(new OnSingleClickListener() {
            /* class com.tt.remotedebug.p3439c.C67967b.C679681 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C67967b bVar = C67967b.this;
                bVar.f171234c = !bVar.f171234c;
                C67967b bVar2 = C67967b.this;
                bVar2.mo235828a(findViewById, imageView, frameLayout, bVar2.f171234c);
            }
        });
        ((Button) this.f171236e.findViewById(R.id.debug_close_button)).setOnClickListener(new View.OnClickListener() {
            /* class com.tt.remotedebug.p3439c.C67967b.View$OnClickListenerC679692 */

            public void onClick(View view) {
                C67967b.this.mo235829f(activity);
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = ((int) C67590h.m263065a(activity, 66.0f)) + C67043j.m261285g(this.f171233b.getApplicationContext());
        marginLayoutParams.leftMargin = C67590h.m263066a(activity) - ((int) C67590h.m263065a(activity, 180.0f));
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this.f171236e, marginLayoutParams);
    }

    @Override // com.tt.remotedebug.p3439c.AbstractC67966a
    /* renamed from: b */
    public void mo235824b(final Activity activity) {
        ViewGroup viewGroup = this.f171236e;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            this.f171236e.setVisibility(4);
        }
        DialogC25637f c = new C25639g(activity).mo89260s(R.layout.lark_debug_opdev_layout).mo89230a(new C25639g.AbstractC25641b() {
            /* class com.tt.remotedebug.p3439c.C67967b.C679725 */

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
            /* renamed from: b */
            public void mo89274b(DialogC25637f fVar) {
                final View findViewById = fVar.findViewById(R.id.debug_expand_divider);
                final FrameLayout frameLayout = (FrameLayout) fVar.findViewById(R.id.debug_close_layout);
                final ImageView imageView = (ImageView) fVar.findViewById(R.id.debug_connect_status_expand);
                ((ImageView) fVar.findViewById(R.id.debug_status_icon)).setImageResource(R.drawable.lark_debug_connect_hit);
                ((TextView) fVar.findViewById(R.id.debug_status_text)).setText(activity.getString(R.string.OpenPlatform_RealdeviceDebug_hitbreakpoint));
                fVar.findViewById(R.id.debug_connect_status_expand).setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.remotedebug.p3439c.C67967b.C679725.View$OnClickListenerC679731 */

                    public void onClick(View view) {
                        C67967b.this.f171234c = !C67967b.this.f171234c;
                        C67967b.this.mo235828a(findViewById, imageView, frameLayout, C67967b.this.f171234c);
                    }
                });
                fVar.findViewById(R.id.debug_close_button).setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.remotedebug.p3439c.C67967b.C679725.View$OnClickListenerC679742 */

                    public void onClick(View view) {
                        C67967b.this.mo235829f(activity);
                    }
                });
            }
        }).mo89257p(53).mo89247e(false).mo89245d(0.2f).mo89239c();
        this.f171235d = c;
        Window window = c.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = (int) C67590h.m263065a(activity, 66.0f);
        attributes.width = (int) C67590h.m263065a(activity, 180.0f);
        window.setAttributes(attributes);
    }

    /* renamed from: f */
    public void mo235829f(Activity activity) {
        if (activity == null) {
            activity = this.f171233b.getCurrentActivity();
        }
        if (activity == null) {
            AppBrandLogger.m52829e("VscDebugUIImpl", "show end dialog activity is null ");
            return;
        }
        new C25639g(this.f171233b.getCurrentActivity()).mo89248g(R.string.OpenPlatform_RealdeviceDebug_hints).mo89254m(R.string.OpenPlatform_RealdeviceDebug_endconfirm).mo89224a(R.id.lkui_dialog_btn_left, R.string.OpenPlatform_RealdeviceDebug_cancel, new DialogInterface.OnClickListener() {
            /* class com.tt.remotedebug.p3439c.C67967b.DialogInterface$OnClickListenerC679714 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.OpenPlatform_RealdeviceDebug_endsession, new DialogInterface.OnClickListener() {
            /* class com.tt.remotedebug.p3439c.C67967b.DialogInterface$OnClickListenerC679703 */

            public void onClick(DialogInterface dialogInterface, int i) {
                new C67500a(C67965b.f171230e, C67967b.this.f171233b).flush();
                C67967b.this.f171232a.mo235819b();
                ProcessUtil.killCurrentMiniAppProcess();
                AppBrandLogger.m52830i("VscDebugUIImpl", " user close socket ");
            }
        }).mo89247e(false).mo89239c();
    }

    public C67967b(C67958c cVar, IAppContext iAppContext) {
        this.f171232a = cVar;
        this.f171233b = iAppContext;
    }

    /* renamed from: a */
    public void mo235828a(View view, ImageView imageView, FrameLayout frameLayout, boolean z) {
        int i;
        int i2;
        if (view != null && frameLayout != null && imageView != null) {
            if (z) {
                i = R.drawable.lark_debug_expand_up_filled;
            } else {
                i = R.drawable.lark_debug_expand_down_filled;
            }
            imageView.setImageResource(i);
            int i3 = 0;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            if (!z) {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
        }
    }
}
