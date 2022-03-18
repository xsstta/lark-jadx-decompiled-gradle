package com.ss.android.lark.core.dependency;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.diskmanage.clean.DiskCleanTaskManager;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.setting.export.AbstractC54125a;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.core.dependency.l */
public interface AbstractC36126l {
    /* renamed from: a */
    List<AbstractBaseSettingHandler> mo132990a();

    /* renamed from: a */
    void mo132991a(Activity activity, List<AbstractC54125a> list);

    /* renamed from: a */
    void mo132992a(Context context, Map<String, AbstractC29186b> map);

    /* renamed from: a */
    void mo132993a(IABTestService iABTestService);

    /* renamed from: a */
    void mo132994a(DiskCleanTaskManager aVar);

    /* renamed from: a */
    void mo132995a(List<IQRCodeScanResultHandler> list);

    /* renamed from: a */
    void mo132996a(Map<String, Boolean> map);

    /* renamed from: a */
    void mo132997a(Map<String, AbstractC44136a.C44142ac> map, Map<String, AbstractC44136a.C44142ac.AbstractC44143a> map2);

    /* renamed from: a */
    void mo132998a(Set<String> set);

    /* renamed from: b */
    void mo132999b(DiskCleanTaskManager aVar);

    /* renamed from: b */
    void mo133000b(List<IQRCodeScanResultHandler> list);

    /* renamed from: b */
    void mo133001b(Map<String, AbstractC44136a.C44142ac.AbstractC44143a> map);

    /* renamed from: b */
    boolean mo133002b();

    /* renamed from: c */
    void mo133003c(List<AbstractNotification> list);
}
