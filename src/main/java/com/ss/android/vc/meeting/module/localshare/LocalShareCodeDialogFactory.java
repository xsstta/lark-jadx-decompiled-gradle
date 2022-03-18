package com.ss.android.vc.meeting.module.localshare;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeDialogFactory;", "", "()V", "createDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "activity", "Landroid/app/Activity;", ShareHitPoint.f121868c, "", "view", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.d */
public final class LocalShareCodeDialogFactory {

    /* renamed from: a */
    public static final LocalShareCodeDialogFactory f156128a = new LocalShareCodeDialogFactory();

    private LocalShareCodeDialogFactory() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC61222a m242737a(Activity activity, String str, ILocalSharePrepareContract.IView bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        if (DesktopUtil.m144307b()) {
            return new LocalShareCodeDesktopDialog(activity, str, bVar);
        }
        return new LocalShareCodeDialog(activity, str, bVar);
    }
}
