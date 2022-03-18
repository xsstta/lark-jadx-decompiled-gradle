package com.bytedance.push;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.push.interfaze.AbstractC20450m;
import com.bytedance.push.interfaze.IPushMsgHandler;
import com.bytedance.push.interfaze.IThirdSupportService;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.p889j.RunnableC20459a;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.AbstractC20545c;
import com.bytedance.push.third.PushChannelHelper;
import com.bytedance.push.utils.C20550b;
import com.bytedance.push.utils.C20553d;
import com.ss.android.message.AppProvider;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.push.Triple;
import com.ss.android.pushmanager.setting.C59971b;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.g */
public class C20431g implements IThirdSupportService {

    /* renamed from: a */
    private final AbstractC20450m f49925a;

    /* renamed from: b */
    private final IPushMsgHandler f49926b;

    /* renamed from: c */
    private final C20386c f49927c;

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public void sendMonitor(Context context, String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public Triple<String, String, String> getUmConfig() {
        return this.f49927c.f49796r.mo68792d();
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public String getAdmPayloadName() {
        C20386c cVar = this.f49927c;
        if (cVar == null || TextUtils.isEmpty(cVar.f49802x)) {
            return "payload";
        }
        return this.f49927c.f49802x;
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public String getFcmPayloadName() {
        C20386c cVar = this.f49927c;
        if (cVar == null || TextUtils.isEmpty(cVar.f49801w)) {
            return "payload";
        }
        return this.f49927c.f49801w;
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public void hackJobHandler(Service service) {
        C20550b.m74841a(service);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public boolean isMainProcess(Context context) {
        return C59436a.m230732b(context);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public Pair<String, String> getPushConfig(int i) {
        return PushChannelHelper.inst(AppProvider.getApp()).getPushConfig(i, this.f49927c);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public boolean shouldShowUpgradeDialog(Activity activity) {
        if (this.f49927c.f49795q != null) {
            return this.f49927c.f49795q.shouldShowUpgradeDialog(activity);
        }
        return false;
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public boolean allowPullUp(String str) {
        ILogger logger = PushSupporter.logger();
        logger.mo68949d("AgooFactory", "Um try pull up:" + str);
        return TextUtils.equals(this.f49927c.f49779a.getPackageName(), str);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public void sendToken(Context context, AbstractC20545c cVar) {
        RunnableC20459a.m74466a(context, cVar);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public JSONObject getMessage(byte[] bArr, boolean z) throws DataFormatException, IOException {
        return C20553d.m74854a(bArr, z);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public String getToken(Context context, int i) {
        return RunnableC20459a.m74465a(context, i);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public boolean canKeepPackageAlive(Context context, String str) {
        List<String> a;
        if (!TextUtils.isEmpty(str) && (a = ((AliveOnlineSettings) C20520j.m74724a(context, AliveOnlineSettings.class)).mo69002a()) != null && a.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo68874a(Context context, int i) {
        String i2 = C59971b.m232728b().mo204213i();
        if (!TextUtils.isEmpty(i2)) {
            this.f49925a.mo68832a(context.getApplicationContext(), i2, i);
            ILogger logger = PushSupporter.logger();
            logger.mo68955i("BDPush", "setAlias dlid " + i2);
            return;
        }
        String h = C59971b.m232728b().mo204212h();
        if (!TextUtils.isEmpty(h)) {
            this.f49925a.mo68832a(context.getApplicationContext(), h, i);
            PushSupporter.logger().mo68955i("BDPush", "setAlias did");
        }
    }

    C20431g(AbstractC20450m mVar, IPushMsgHandler iPushMsgHandler, C20386c cVar) {
        this.f49925a = mVar;
        this.f49926b = iPushMsgHandler;
        this.f49927c = cVar;
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public void registerSenderFailed(int i, String str, String str2) {
        if (this.f49927c.mo68756a() != null) {
            this.f49927c.mo68756a().mo68920a(false, i);
        }
        ILogger logger = PushSupporter.logger();
        logger.mo68951e("registerSenderFailed: pushType=" + i + " ,errorId=" + str + " ,msg=" + str2);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public void registerSenderSuccessAndUploadToken(Context context, final int i, final String str) {
        if (C59436a.m230732b(context)) {
            PushSupporter.thirdService().sendToken(context, new AbstractC20545c() {
                /* class com.bytedance.push.C20431g.C204321 */

                @Override // com.bytedance.push.third.AbstractC20545c
                /* renamed from: a */
                public int mo68891a() {
                    return i;
                }

                @Override // com.bytedance.push.third.AbstractC20545c
                /* renamed from: a */
                public String mo68892a(Context context) {
                    return str;
                }
            });
        }
        if (this.f49927c.mo68756a() != null) {
            this.f49927c.mo68756a().mo68920a(true, i);
        }
        if (((PushOnlineSettings) C20520j.m74724a(AppProvider.getApp(), PushOnlineSettings.class)).mo69058i() > 0) {
            ILogger logger = PushSupporter.logger();
            logger.mo68955i("BDPush", "forbid set alias. pushType = " + i + ", token = " + str);
            return;
        }
        mo68874a(AppProvider.getApp(), i);
    }

    @Override // com.bytedance.push.interfaze.IThirdSupportService
    public void onClickNotPassThroughNotification(Context context, String str, int i, String str2) {
        this.f49926b.onClickMsg(context, str, i);
    }
}
