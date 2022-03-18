package com.ss.android.lark.larkconfig.larksetting.handler.log;

import android.app.Application;
import android.text.TextUtils;
import com.ss.android.lark.log.alog.ALogUtils;
import com.ss.android.lark.log.alog.ProcessItemConfig;
import com.ss.android.lark.log.alog.ReportConfig;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/log/ALogSettingUtils;", "", "()V", "initAlogConfigDir", "", "dynamicConfig", "Lcom/ss/android/lark/larkconfig/larksetting/handler/log/LogDynamicConfig;", "initProcessItemConfigDir", "processDir", "Ljava/io/File;", "processEnum", "Lcom/ss/android/lark/larkconfig/larksetting/handler/log/ProcessEnum;", "processItemConfig", "Lcom/ss/android/lark/log/alog/ProcessItemConfig;", "initReportConfigDir", "reportDir", "reportConfig", "Lcom/ss/android/lark/log/alog/ReportConfig;", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.log.b */
public final class ALogSettingUtils {

    /* renamed from: a */
    public static final ALogSettingUtils f104986a = new ALogSettingUtils();

    private ALogSettingUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m163443a(LogDynamicConfig logDynamicConfig) {
        Intrinsics.checkParameterIsNotNull(logDynamicConfig, "dynamicConfig");
        Application application = LarkContext.getApplication();
        ALogUtils dVar = ALogUtils.f105895a;
        Intrinsics.checkExpressionValueIsNotNull(application, "context");
        Application application2 = application;
        File a = dVar.mo149953a(application2);
        ProcessConfig processConfig = logDynamicConfig.getProcessConfig();
        ALogSettingUtils bVar = f104986a;
        bVar.m163444a(a, ProcessEnum.Main, processConfig.getMain());
        bVar.m163444a(a, ProcessEnum.P0, processConfig.getP0());
        bVar.m163444a(a, ProcessEnum.Mini, processConfig.getMini());
        bVar.m163444a(a, ProcessEnum.Mail, processConfig.getMail());
        bVar.m163444a(a, ProcessEnum.Sandbox, processConfig.getSandbox());
        bVar.m163444a(a, ProcessEnum.Wschannel, processConfig.getWschannel());
        bVar.m163444a(a, ProcessEnum.Push, processConfig.getPush());
        bVar.m163444a(a, ProcessEnum.PushService, processConfig.getPushService());
        bVar.m163444a(a, ProcessEnum.Default, processConfig.getDefault());
        bVar.m163445a(ALogUtils.f105895a.mo149956b(application2), logDynamicConfig.getReportConfig());
    }

    /* renamed from: a */
    private final void m163445a(File file, ReportConfig reportConfig) {
        StringBuilder sb = new StringBuilder();
        sb.append(reportConfig.getDuration());
        sb.append(',');
        sb.append(reportConfig.getMaxTagF());
        sb.append(',');
        sb.append(reportConfig.getMaxLogSize());
        sb.append(',');
        sb.append(reportConfig.getMaxLogSubSize());
        File file2 = new File(file.getPath() + File.separator + sb.toString());
        if (!file2.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    file3.delete();
                }
            }
            file2.mkdir();
        }
    }

    /* renamed from: a */
    private final void m163444a(File file, ProcessEnum processEnum, ProcessItemConfig processItemConfig) {
        File file2 = new File(file.getPath() + File.separator + processEnum.name());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String str = processItemConfig.getMaxSize() + ',' + processItemConfig.getLevel() + ',' + processItemConfig.getLimitMsgRegex();
        Iterator<String> it = processItemConfig.getLimitTag().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                str = str + ',' + next;
            }
        }
        File file3 = new File(file2.getPath() + File.separator + str);
        if (!file3.exists()) {
            File[] listFiles = file2.listFiles();
            if (listFiles != null) {
                for (File file4 : listFiles) {
                    file4.delete();
                }
            }
            file3.mkdir();
        }
    }
}
