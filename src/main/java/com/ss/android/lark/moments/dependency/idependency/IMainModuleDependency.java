package com.ss.android.lark.moments.dependency.idependency;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.TabType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/moments/dependency/idependency/IMainModuleDependency;", "", "getTabIndex", "", "tabKey", "", "getTabType", "Lcom/ss/android/lark/maincore/TabType;", "isTabEnable", "", "launchMainWindow", "", "context", "Landroid/content/Context;", "pageName", "bundle", "Landroid/os/Bundle;", "registerBootMileStoneListener", "listener", "Lcom/ss/android/lark/maincore/IBootMileStoneListener;", "unregisterBootMileStoneListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.b.a.n */
public interface IMainModuleDependency {
    /* renamed from: a */
    void mo144717a(Context context, String str, Bundle bundle);

    /* renamed from: a */
    void mo144718a(AbstractC44544a aVar);

    /* renamed from: a */
    boolean mo144719a(String str);

    /* renamed from: b */
    TabType mo144720b(String str);

    /* renamed from: b */
    void mo144721b(AbstractC44544a aVar);

    /* renamed from: c */
    int mo144722c(String str);
}
