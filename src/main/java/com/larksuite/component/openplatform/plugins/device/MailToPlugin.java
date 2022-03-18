package com.larksuite.component.openplatform.plugins.device;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.plugins.utils.C25611a;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;

public class MailToPlugin extends AbstractC25889a {

    public static class MailToRequest extends C25920a {
        @JSONField(name = "bcc")
        public String[] bcc;
        @JSONField(name = "body")
        public String body;
        @JSONField(name = "cc")
        public String[] cc;
        @JSONField(name = "subject")
        public String subject;
        @JSONField(name = "to")
        public String[] to;
    }

    public static class MailToResponse extends C25921b {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public Intent buildMailToIntent(MailToRequest mailToRequest) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", mailToRequest.to);
            intent.putExtra("android.intent.extra.CC", mailToRequest.cc);
            intent.putExtra("android.intent.extra.BCC", mailToRequest.bcc);
            intent.putExtra("android.intent.extra.SUBJECT", mailToRequest.subject);
            intent.putExtra("android.intent.extra.TEXT", mailToRequest.body);
            intent.setFlags(268435456);
            return intent;
        } catch (Exception unused) {
            return null;
        }
    }

    @LKPluginFunction(async = true, eventName = {"mailto"})
    public void mailTo(AbstractC25897h<MailToResponse> hVar, MailToRequest mailToRequest, AbstractC25905b bVar) {
        MailToResponse mailToResponse = new MailToResponse();
        try {
            Intent buildMailToIntent = buildMailToIntent(mailToRequest);
            if (buildMailToIntent != null) {
                Log.e("MailToPlugin", "mailto success");
                bVar.mo92207a().startActivity(buildMailToIntent);
                hVar.callback(null);
                return;
            }
            fillFailedResponse(mailToResponse, C25906a.f64072b, C25611a.m91379a(new Exception("mailto intent is null")));
            hVar.callback(mailToResponse);
            Log.e("MailToPlugin", "mailto intent is null");
        } catch (Exception e) {
            fillFailedResponse(mailToResponse, C25906a.f64080j, C25611a.m91379a(e));
            hVar.callback(mailToResponse);
            Log.e("MailToPlugin", e.getMessage());
        }
    }
}
