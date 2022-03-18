package com.bytedance.ee.bear.document.template;

import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.AbstractC6277u;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.domain.BearUrl;
import java.io.Serializable;

public class TemplatePlugin extends DocumentPlugin {
    private void clearTemplateRenderParam() {
        AbstractC4931i web = getWeb();
        if (web instanceof AbstractC6277u) {
            ((AbstractC6277u) web).mo22568d("isTemplate");
        }
    }

    private void setTemplateRenderParam() {
        AbstractC4931i web = getWeb();
        if (web instanceof AbstractC6277u) {
            ((AbstractC6277u) web).mo22566a("isTemplate", (Serializable) true);
        }
    }

    private boolean isNewlyCreatedFromTemplate() {
        BearUrl bearUrl = getDocViewModel().getBearUrl();
        if (bearUrl == null) {
            return false;
        }
        if ("space_template".equals(bearUrl.f17453h) || "new_template".equals(bearUrl.f17453h)) {
            return true;
        }
        return false;
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        clearTemplateRenderParam();
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        if (isNewlyCreatedFromTemplate()) {
            setTemplateRenderParam();
        } else {
            clearTemplateRenderParam();
        }
    }
}
