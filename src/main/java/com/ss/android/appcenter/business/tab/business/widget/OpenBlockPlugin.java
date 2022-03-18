package com.ss.android.appcenter.business.tab.business.widget;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.utils.LarkContext;

public class OpenBlockPlugin extends OPPlugin {

    private static class OpenBlockRequest extends C25920a {
        @JSONField(name = "appId")
        public String appId;
        @JSONField(name = "blockTypeId")
        @LKRequiredParam
        public String blockTypeId;
        @JSONField(name = "sourceData")
        public JSONObject sourceData;
        @JSONField(name = "title")
        public String title;

        private OpenBlockRequest() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"_openDemoBlock"})
    public void openBlock(AbstractC25895f fVar, OpenBlockRequest openBlockRequest) {
        OPTrace a = fVar.mo92188a();
        a.mo92224i("OpenBlockPlugin", "openBlock called :" + openBlockRequest.toString());
        Intent intent = new Intent(LarkContext.getApplication(), BlockDemoActivity.class);
        intent.putExtra("param1", openBlockRequest.appId);
        intent.putExtra("param2", openBlockRequest.blockTypeId);
        intent.putExtra("param3", openBlockRequest.sourceData.toString());
        intent.putExtra("title", openBlockRequest.title);
        intent.addFlags(268435456);
        LarkContext.getApplication().startActivity(intent);
    }
}
