package com.ss.android.lark.larkconfig.larksetting.handler.log;

import com.google.gson.Gson;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Unit;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.log.a */
public final class C41207a extends AbstractBaseSettingHandler {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.log.a$a */
    public static class C41209a {

        /* renamed from: a */
        public static C41207a f104985a = new C41207a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "alog_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "ALogSettingHandler";
    }

    /* renamed from: d */
    public static C41207a m163440d() {
        return C41209a.f104985a;
    }

    private C41207a() {
        if (C57765ac.m224188b(LarkContext.getApplication())) {
            mo148402a(mo148411i().mo148421a($$Lambda$a$f3qa7TjVC4dF1deQ_W9C3Qu89BE.INSTANCE));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m163439a(String str) {
        try {
            Log.m165389i("ALogSettingHandler", "json: " + str);
            LogDynamicConfig logDynamicConfig = (LogDynamicConfig) new Gson().fromJson(str, LogDynamicConfig.class);
            if (logDynamicConfig == null) {
                logDynamicConfig = new LogDynamicConfig();
            }
            ALogSettingUtils.m163443a(logDynamicConfig);
            return null;
        } catch (Exception e) {
            ALogSettingUtils.m163443a(new LogDynamicConfig());
            Log.m165383e("ALogSettingHandler", "parse exception: " + e.getMessage());
            return null;
        }
    }
}
