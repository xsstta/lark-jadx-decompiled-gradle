package com.tt.miniapp.webbridge.sync;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.C65844b;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.C67587d;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "hideKeyboard")
/* renamed from: com.tt.miniapp.webbridge.sync.d */
public class C67349d extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "hideKeyboard";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            final int optInt = new JSONObject(this.mArgs).optInt("inputId");
            if (this.mRender == null) {
                return makeFailMsg("current render is null");
            }
            NativeViewManager nativeViewManager = this.mRender.getNativeViewManager();
            if (nativeViewManager == null) {
                return makeFailMsg("native view manager is null");
            }
            if (optInt <= 0) {
                return makeFailMsg("input id error");
            }
            final View view = nativeViewManager.getView(optInt);
            if (!(view instanceof EditText)) {
                return makeFailMsg("input id error");
            }
            C67047m.m261306a((EditText) view, (Context) AppbrandContext.getInst().getApplicationContext());
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67349d.RunnableC673501 */

                public void run() {
                    View view = view;
                    if (view instanceof C65844b) {
                        C65844b bVar = (C65844b) view;
                        JSONObject a = new C67587d().mo234783a("inputId", Integer.valueOf(optInt)).mo234783a("cursor", Integer.valueOf(bVar.getCursor())).mo234783a("value", bVar.getValue()).mo234784a();
                        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(C67349d.this.iAppContext).getRenderViewManager();
                        if (renderViewManager != null) {
                            renderViewManager.publishDirectly(C67349d.this.mRender.getRenderViewId(), "onKeyboardConfirm", a.toString());
                            renderViewManager.publishDirectly(C67349d.this.mRender.getRenderViewId(), "onKeyboardComplete", a.toString());
                        }
                        C67349d.this.mRender.removeNativeView(optInt, null);
                    }
                }
            });
            return CharacterUtils.empty();
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_HideKeyBoardHandler", "", e);
            return makeFailMsg(e);
        }
    }

    public C67349d(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
