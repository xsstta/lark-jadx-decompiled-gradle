package com.ss.android.lark.helpdesk.monitor;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jk\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/helpdesk/monitor/HelpDeskMonitor;", "", "()V", "openBannerMonitor", "", "eventName", "", "targetId", "targetType", "", "containerTag", "resourceId", "resourceType", "duration", "", "resultType", "errorMsg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.helpdesk.b.a */
public final class HelpDeskMonitor {

    /* renamed from: a */
    public static final HelpDeskMonitor f99630a = new HelpDeskMonitor();

    private HelpDeskMonitor() {
    }

    /* renamed from: a */
    public final void mo141951a(String str, String str2, Integer num, Integer num2, String str3, String str4, Long l, String str5, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(str2, "targetId");
        OPMonitor oPMonitor = new OPMonitor(str);
        oPMonitor.addCategoryValue("target_id", str2);
        if (num != null) {
            num.intValue();
            oPMonitor.addCategoryValue("target_type", num);
        }
        if (num2 != null) {
            num2.intValue();
            oPMonitor.addCategoryValue("container_tag", num2);
        }
        if (str3 != null) {
            oPMonitor.addCategoryValue("resource_id", str3);
        }
        if (str4 != null) {
            oPMonitor.addCategoryValue("resource_type", str4);
        }
        if (l != null) {
            l.longValue();
            oPMonitor.setDuration(l.longValue());
        }
        if (str5 != null) {
            oPMonitor.setResultType(str5);
        }
        if (str6 != null) {
            oPMonitor.setErrorMessage(str6);
        }
        oPMonitor.flush();
    }

    /* renamed from: a */
    public static /* synthetic */ void m153000a(HelpDeskMonitor aVar, String str, String str2, Integer num, Integer num2, String str3, String str4, Long l, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        Long l2;
        String str9;
        String str10;
        if ((i & 16) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 32) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 64) != 0) {
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            str9 = null;
        } else {
            str9 = str5;
        }
        if ((i & DynamicModule.f58006b) != 0) {
            str10 = null;
        } else {
            str10 = str6;
        }
        aVar.mo141951a(str, str2, num, num2, str7, str8, l2, str9, str10);
    }
}
