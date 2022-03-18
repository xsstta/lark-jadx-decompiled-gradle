package com.tt.miniapp.launchaction;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.meta.GadgetSchema;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.launchaction.e */
public class View$OnClickListenerC66306e implements View.OnClickListener {

    /* renamed from: a */
    public View f167340a;

    /* renamed from: b */
    public IAppContext f167341b;

    /* renamed from: c */
    private Activity f167342c;

    /* renamed from: d */
    private AppInfoEntity f167343d;

    /* renamed from: a */
    public boolean mo231760a(AppInfoEntity appInfoEntity) {
        return mo231761a(appInfoEntity, true);
    }

    /* renamed from: b */
    public void mo231762b(AppInfoEntity appInfoEntity) {
        if ("message_action".equals(appInfoEntity.launchActionAbility) && appInfoEntity.bdpLaunchQuery != null) {
            try {
                final String optString = new JSONObject(appInfoEntity.bdpLaunchQuery).optString("__trigger_id__");
                if (!TextUtils.isEmpty(optString)) {
                    C67866g.m264025a(new Action() {
                        /* class com.tt.miniapp.launchaction.View$OnClickListenerC66306e.C663071 */

                        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                        public void act() {
                            ActionMessageLoadManager.f167308a.mo231697a(View$OnClickListenerC66306e.this.f167341b, optString).subscribe();
                        }
                    }, Schedulers.shortIO());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn_ignore) {
            C67070z.m261391a(this.f167342c, 16, this.f167341b);
        } else if (view.getId() == R.id.btn_update) {
            ((IAppMetaService) this.f167341b.findServiceByInterface(IAppMetaService.class)).mo235257b(this.f167342c, new GadgetSchema.C67943Entity(this.f167343d.appId));
            C67070z.m261391a(this.f167342c, 16, this.f167341b);
        }
    }

    /* renamed from: a */
    private void m259424a(Activity activity) {
        ViewStub viewStub;
        if (this.f167340a == null && (viewStub = (ViewStub) activity.findViewById(R.id.action_not_support_stub)) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f167340a = viewStub.inflate();
            AppBrandLogger.m52830i("LaunchActionHelper", "inflate not support duration:" + (System.currentTimeMillis() - currentTimeMillis));
            final Button button = (Button) this.f167340a.findViewById(R.id.btn_ignore);
            final Button button2 = (Button) this.f167340a.findViewById(R.id.btn_update);
            this.f167340a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.tt.miniapp.launchaction.View$OnClickListenerC66306e.ViewTreeObserver$OnGlobalLayoutListenerC663082 */

                public void onGlobalLayout() {
                    int width = button.getWidth();
                    int width2 = button2.getWidth();
                    if (width < width2) {
                        button.setWidth(width2);
                    } else if (width > width2) {
                        button2.setWidth(width2);
                    } else {
                        AppBrandLogger.m52830i("LaunchActionHelper", "width equal not change");
                    }
                    View$OnClickListenerC66306e.this.f167340a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
        }
    }

    public View$OnClickListenerC66306e(Activity activity, IAppContext iAppContext) {
        this.f167341b = iAppContext;
        this.f167342c = activity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo231761a(com.tt.miniapphost.entity.AppInfoEntity r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.launchaction.View$OnClickListenerC66306e.mo231761a(com.tt.miniapphost.entity.AppInfoEntity, boolean):boolean");
    }
}
