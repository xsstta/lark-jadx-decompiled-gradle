package com.ss.android.appcenter.business.tab.business.blockit;

import androidx.lifecycle.Lifecycle;
import com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.blockit.b */
public final /* synthetic */ class C27834b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f69570a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f69571b;

    static {
        int[] iArr = new int[BlockitStatusView.Status.values().length];
        f69570a = iArr;
        iArr[BlockitStatusView.Status.Error.ordinal()] = 1;
        iArr[BlockitStatusView.Status.Upgrade.ordinal()] = 2;
        int[] iArr2 = new int[Lifecycle.Event.values().length];
        f69571b = iArr2;
        iArr2[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
        iArr2[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
        iArr2[Lifecycle.Event.ON_STOP.ordinal()] = 3;
        iArr2[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
    }
}
