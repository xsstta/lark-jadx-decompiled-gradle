package com.ss.android.lark.diskmanage.clean;

import com.ss.android.lark.diskmanage.Biz;
import com.ss.android.lark.diskmanage.CleanResult;
import com.ss.android.lark.diskmanage.DefaultAutoCleanItem;
import com.ss.android.lark.diskmanage.RemoteConfig;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/diskmanage/clean/IDiskCleanTask;", "", "getBiz", "Lcom/ss/android/lark/diskmanage/Biz;", "getCanManualSize", "", "getDefaultAutoCleanRegistry", "", "Lcom/ss/android/lark/diskmanage/DefaultAutoCleanItem;", "onManualClean", "Lcom/ss/android/lark/diskmanage/CleanResult;", "onRemoteClean", "remoteConfig", "Lcom/ss/android/lark/diskmanage/RemoteConfig;", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.clean.c */
public interface IDiskCleanTask {
    /* renamed from: a */
    Biz mo135615a();

    /* renamed from: a */
    CleanResult mo135616a(RemoteConfig dVar);

    /* renamed from: b */
    CleanResult mo135617b();

    /* renamed from: c */
    double mo135618c();

    /* renamed from: d */
    List<DefaultAutoCleanItem> mo135619d();
}
