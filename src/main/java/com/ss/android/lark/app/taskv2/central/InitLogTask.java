package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.bytedance.lark.sdk.log.C19837a;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.app.util.ALogUploader;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.larkconfig.larksetting.handler.log.ProcessEnum;
import com.ss.android.lark.log.C41702d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.log.alog.IALogEvent;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.C57881t;
import org.json.JSONObject;

public class InitLogTask extends AbstractLaunchTask {
    /* renamed from: g */
    private IALogEvent m106706g() {
        return $$Lambda$InitLogTask$kX732k1DMan70uLnOZLiGrfeRq4.INSTANCE;
    }

    /* renamed from: c */
    private boolean m106704c(Context context) {
        return !((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSimpleModeOn(context);
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        if (m106704c(context)) {
            m106703b(context);
        }
    }

    /* renamed from: d */
    private ProcessEnum m106705d(Context context) {
        ProcessEnum processEnum = ProcessEnum.Default;
        if (C57765ac.m224188b(context)) {
            return ProcessEnum.Main;
        }
        if (C57765ac.m224187a(context)) {
            return ProcessEnum.P0;
        }
        if (C57765ac.m224189c(context)) {
            return ProcessEnum.Mini;
        }
        if (C57765ac.m224194h(context)) {
            return ProcessEnum.Mail;
        }
        if (C57765ac.m224190d(context)) {
            return ProcessEnum.Sandbox;
        }
        if (C57765ac.m224193g(context)) {
            return ProcessEnum.Wschannel;
        }
        return processEnum;
    }

    /* renamed from: b */
    private void m106703b(Context context) {
        String a = C26252ad.m94992a(context);
        String c = C26252ad.m94994c(context);
        boolean b = C26252ad.m94993b(context);
        Log.init(C41702d.m165527a().mo149970a(context).mo149969a(4).mo149972a(a).mo149976b(c).mo149978c(m106705d(context).name()).mo149973a(b).mo149977b(C26284k.m95185a(context)).mo149980e(C57881t.m224632e(context)).mo149975b(5).mo149971a(m106706g()).mo149974a());
        ALogUploader.m106936a();
        if (b) {
            C19837a.m72362a("lark_main", C57881t.m224624b(context, ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).rustSdkLogSubPath()), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106702a(String str, JSONObject jSONObject) {
        try {
            Statistics.sendEvent(str, jSONObject);
        } catch (Throwable th) {
            Log.m165383e("InitLogTask", "reportEvent error: " + th.getMessage());
        }
    }
}
