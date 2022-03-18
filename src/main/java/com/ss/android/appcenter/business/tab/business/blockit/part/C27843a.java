package com.ss.android.appcenter.business.tab.business.blockit.part;

import com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.a */
public final /* synthetic */ class C27843a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f69597a;

    static {
        int[] iArr = new int[BlockitStatusView.Status.values().length];
        f69597a = iArr;
        iArr[BlockitStatusView.Status.Loading.ordinal()] = 1;
        iArr[BlockitStatusView.Status.Content.ordinal()] = 2;
        iArr[BlockitStatusView.Status.Error.ordinal()] = 3;
        iArr[BlockitStatusView.Status.Upgrade.ordinal()] = 4;
    }
}
