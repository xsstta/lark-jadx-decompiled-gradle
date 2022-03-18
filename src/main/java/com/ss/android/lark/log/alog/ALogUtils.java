package com.ss.android.lark.log.alog;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.C41702d;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u0005J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0007J\u0006\u0010\"\u001a\u00020\u0005¨\u0006#"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogUtils;", "", "()V", "filterFiles", "", "", "parent", "Ljava/io/File;", "startTimeMS", "", "endTimeMS", "getALogBaseDirPath", "logConfig", "Lcom/ss/android/lark/log/LogConfig;", "getALogDirPath", "getALogFilesSize", "", "logDirPath", "date", "getFileCreateTime", "logFile", "getInnerFilePath", "context", "Landroid/content/Context;", "getProcessConfig", "Lcom/ss/android/lark/log/alog/ProcessItemConfig;", "getProcessDir", "getReportConfig", "Lcom/ss/android/lark/log/alog/ReportConfig;", "getReportDir", "getTodayDate", "getUploadFiles", "startTime", "endTime", "getYesterdayDate", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.log.alog.d */
public final class ALogUtils {

    /* renamed from: a */
    public static final ALogUtils f105895a = new ALogUtils();

    private ALogUtils() {
    }

    /* renamed from: b */
    public final String mo149957b() {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.ENGLISH);
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        String format = simpleDateFormat.format(instance.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "SimpleDateFormat(\"yyyy_M…SH).format(calendar.time)");
        return format;
    }

    /* renamed from: a */
    public final String mo149954a() {
        Calendar instance = Calendar.getInstance();
        instance.add(5, -1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.ENGLISH);
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        String format = simpleDateFormat.format(instance.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "SimpleDateFormat(\"yyyy_M…SH).format(calendar.time)");
        return format;
    }

    /* renamed from: c */
    private final String m165452c(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return "";
        }
        String path = filesDir.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "dir.path");
        return path;
    }

    /* renamed from: a */
    public final String mo149955a(C41702d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "logConfig");
        return dVar.mo149967b() + "alog/";
    }

    /* renamed from: a */
    public final File mo149953a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File file = new File(m165452c(context) + File.separator + "alog_config" + File.separator + "process_config");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public final File mo149956b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File file = new File(m165452c(context) + File.separator + "alog_config" + File.separator + "report_config");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public final String mo149958b(C41702d dVar) {
        if (dVar == null) {
            return "";
        }
        String str = f105895a.mo149955a(dVar) + dVar.f105908e + "/";
        File file = new File(str);
        if (file.exists()) {
            return str;
        }
        file.mkdirs();
        return str;
    }

    /* renamed from: c */
    public final ProcessItemConfig mo149959c(C41702d dVar) {
        File[] listFiles;
        Intrinsics.checkParameterIsNotNull(dVar, "logConfig");
        ProcessItemConfig processItemConfig = new ProcessItemConfig(0, 0, null, null, 15, null);
        StringBuilder sb = new StringBuilder();
        Context context = dVar.f105904a;
        Intrinsics.checkExpressionValueIsNotNull(context, "logConfig.context");
        sb.append(mo149953a(context).getPath());
        sb.append(File.separator);
        sb.append(dVar.f105908e);
        File file = new File(sb.toString());
        if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length != 1) {
            return processItemConfig;
        }
        try {
            File file2 = listFiles[0];
            Intrinsics.checkExpressionValueIsNotNull(file2, "childDir[0]");
            String name = file2.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "childDir[0].name");
            List split$default = StringsKt.split$default((CharSequence) name, new String[]{","}, false, 0, 6, (Object) null);
            if (split$default.size() < 3) {
                return processItemConfig;
            }
            processItemConfig.setMaxSize(Integer.parseInt((String) split$default.get(0)));
            processItemConfig.setLevel(Integer.parseInt((String) split$default.get(1)));
            processItemConfig.setLimitMsgRegex((String) split$default.get(2));
            if (split$default.size() <= 3) {
                return processItemConfig;
            }
            processItemConfig.getLimitTag().addAll(split$default.subList(3, split$default.size()));
            return processItemConfig;
        } catch (Exception unused) {
            return new ProcessItemConfig(0, 0, null, null, 15, null);
        }
    }

    /* renamed from: d */
    public final ReportConfig mo149960d(C41702d dVar) {
        File[] listFiles;
        Intrinsics.checkParameterIsNotNull(dVar, "logConfig");
        ReportConfig reportConfig = new ReportConfig(0, 0, 0, 0, 15, null);
        Context context = dVar.f105904a;
        Intrinsics.checkExpressionValueIsNotNull(context, "logConfig.context");
        File b = mo149956b(context);
        if (!b.exists() || (listFiles = b.listFiles()) == null || listFiles.length != 1) {
            return reportConfig;
        }
        try {
            File file = listFiles[0];
            Intrinsics.checkExpressionValueIsNotNull(file, "childDir[0]");
            String name = file.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "childDir[0].name");
            List split$default = StringsKt.split$default((CharSequence) name, new String[]{","}, false, 0, 6, (Object) null);
            if (split$default.size() < 4) {
                return reportConfig;
            }
            reportConfig.setDuration(Long.parseLong((String) split$default.get(0)));
            reportConfig.setMaxTagF(Integer.parseInt((String) split$default.get(1)));
            reportConfig.setMaxLogSize(Integer.parseInt((String) split$default.get(2)));
            reportConfig.setMaxLogSubSize(Integer.parseInt((String) split$default.get(3)));
            return reportConfig;
        } catch (Exception unused) {
            return new ReportConfig(0, 0, 0, 0, 15, null);
        }
    }

    /* renamed from: a */
    public final float mo149952a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "logDirPath");
        Intrinsics.checkParameterIsNotNull(str2, "date");
        File[] listFiles = new File(str).listFiles();
        ArrayList<File> arrayList = null;
        if (listFiles != null) {
            ArrayList arrayList2 = new ArrayList();
            for (File file : listFiles) {
                Intrinsics.checkExpressionValueIsNotNull(file, "it");
                String name = file.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "it.name");
                if (StringsKt.contains$default((CharSequence) name, (CharSequence) str2, false, 2, (Object) null)) {
                    arrayList2.add(file);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        double d = 0.0d;
        for (File file2 : arrayList) {
            d += (double) file2.length();
        }
        double d2 = (double) 1024;
        return new BigDecimal((d / d2) / d2).setScale(2, 4).floatValue();
    }
}
