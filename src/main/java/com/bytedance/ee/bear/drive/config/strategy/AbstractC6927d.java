package com.bytedance.ee.bear.drive.config.strategy;

import android.content.Context;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.config.strategy.d */
public interface AbstractC6927d {

    /* renamed from: a */
    public static final DrivePriority.DownloadPriority f18713a = DrivePriority.DownloadPriority.USER_INTERACTION;

    /* renamed from: b */
    public static final DrivePriority.DownloadPriority f18714b = DrivePriority.DownloadPriority.PREVIEW;

    /* renamed from: c */
    public static final DrivePriority.DownloadPriority f18715c = DrivePriority.DownloadPriority.MANUAL_OFFLINE;

    /* renamed from: d */
    public static final DrivePriority.DownloadPriority f18716d = DrivePriority.DownloadPriority.PRELOAD;

    /* renamed from: a */
    File mo27239a(Context context, long j);

    /* renamed from: a */
    String mo27238a();

    /* renamed from: a */
    String mo27240a(AbstractC6946a aVar);

    /* renamed from: a */
    String mo27241a(String str);

    /* renamed from: a */
    boolean mo27242a(long j);

    /* renamed from: a */
    boolean mo27243a(long j, String str);

    /* renamed from: a */
    boolean mo27244a(C6880a aVar, AbstractC6949c cVar);

    /* renamed from: b */
    String mo27245b();

    /* renamed from: b */
    boolean mo27246b(long j, String str);

    /* renamed from: c */
    DrivePriority.DownloadPriority mo27247c();

    /* renamed from: d */
    boolean mo27248d();
}
