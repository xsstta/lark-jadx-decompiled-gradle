package com.ss.android.appcenter.business.tab.business.popups;

import androidx.lifecycle.Lifecycle;
import com.ss.android.appcenter.business.tab.business.popups.content.PopupsContentType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.popups.b */
public final /* synthetic */ class C27858b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f69641a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f69642b;

    static {
        int[] iArr = new int[PopupsContentType.values().length];
        f69641a = iArr;
        iArr[PopupsContentType.Image.ordinal()] = 1;
        iArr[PopupsContentType.Video.ordinal()] = 2;
        int[] iArr2 = new int[Lifecycle.Event.values().length];
        f69642b = iArr2;
        iArr2[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
        iArr2[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
        iArr2[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
    }
}
