package com.bytedance.ee.bear.document.oops;

import android.content.DialogInterface;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.oops.OopsModel;
import com.bytedance.ee.bear.document.oops.OopsPluginV2;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Map;

public class OopsPluginV2 extends DocumentPlugin {
    public UDDialog dialog;

    /* renamed from: com.bytedance.ee.bear.document.oops.OopsPluginV2$a */
    private class C6046a implements AbstractC7945d<Void> {
        private C6046a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            if (OopsPluginV2.this.dialog != null && OopsPluginV2.this.dialog.isShowing()) {
                OopsPluginV2.this.dialog.dismiss();
                hVar.mo17188a(new JSONObject());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.oops.OopsPluginV2$b */
    public class C6047b implements AbstractC7945d<OopsModel> {

        /* renamed from: b */
        private final int[] f16919b;

        private C6047b() {
            this.f16919b = new int[]{R.id.ud_dialog_btn_primary, R.id.ud_dialog_btn_secondary, R.id.ud_dialog_btn_secondary2, R.id.ud_dialog_btn_secondary3};
        }

        /* renamed from: a */
        public void handle(OopsModel oopsModel, AbstractC7947h hVar) {
            if (OopsPluginV2.this.dialog != null && OopsPluginV2.this.dialog.isShowing()) {
                OopsPluginV2.this.dialog.dismiss();
            }
            int i = 0;
            C6048a aVar = (C6048a) ((C6048a) ((C6048a) ((C6048a) ((C6048a) ((C6048a) ((C6048a) ((C6048a) ((C6048a) new C6048a(OopsPluginV2.this.getContext()).controller(new C6049b(OopsPluginV2.this.getContext()))).contentLayoutRes(R.layout.ud_dialog_oops_content)).footerLayoutRes(R.layout.ud_dialog_oops_footer)).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL)).title(oopsModel.getTitle())).message(oopsModel.getContent())).mo24420a(oopsModel.getCode()).marginInDp(36)).cancelOnTouchOutside(false)).autoDismiss(false);
            List<OopsModel.C6044Button> buttons = oopsModel.getButtons();
            while (i < buttons.size() && i < this.f16919b.length) {
                m24512a(aVar, buttons.get(i), hVar, this.f16919b[i]);
                i++;
            }
            OopsPluginV2.this.dialog = aVar.show();
            ((C6095s) OopsPluginV2.this.getHost()).mo24599n().requestNotFocus(OopsPluginV2.this.getActivity());
        }

        /* renamed from: a */
        private void m24512a(C6048a aVar, OopsModel.C6044Button button, AbstractC7947h hVar, int i) {
            aVar.addActionButton(i, button.getText(), new DialogInterface.OnClickListener(hVar) {
                /* class com.bytedance.ee.bear.document.oops.$$Lambda$OopsPluginV2$b$gX_gOYLWHXlug6IEsQxzm6Qx71c */
                public final /* synthetic */ AbstractC7947h f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    OopsPluginV2.C6047b.m24511a(OopsModel.C6044Button.this, this.f$1, dialogInterface, i);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m24511a(OopsModel.C6044Button button, AbstractC7947h hVar, DialogInterface dialogInterface, int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buttonType", (Object) Integer.valueOf(button.getId()));
            hVar.mo17188a(jSONObject);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.showOops", new C6047b());
        map.put("biz.util.hideOops", new C6046a());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        UDDialog uDDialog = this.dialog;
        if (uDDialog != null && uDDialog.isShowing()) {
            this.dialog.dismiss();
        }
    }
}
