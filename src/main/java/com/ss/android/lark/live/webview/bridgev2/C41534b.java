package com.ss.android.lark.live.webview.bridgev2;

import com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.webview.bridgev2.b */
public final /* synthetic */ class C41534b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f105594a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f105595b;

    static {
        int[] iArr = new int[CallNativeEvent.values().length];
        f105594a = iArr;
        iArr[CallNativeEvent.ERROR.ordinal()] = 1;
        iArr[CallNativeEvent.END.ordinal()] = 2;
        iArr[CallNativeEvent.PAUSE.ordinal()] = 3;
        iArr[CallNativeEvent.PLAY.ordinal()] = 4;
        int[] iArr2 = new int[CallNativeEvent.values().length];
        f105595b = iArr2;
        iArr2[CallNativeEvent.PLAY.ordinal()] = 1;
        iArr2[CallNativeEvent.PAUSE.ordinal()] = 2;
        iArr2[CallNativeEvent.END.ordinal()] = 3;
        iArr2[CallNativeEvent.ERROR.ordinal()] = 4;
    }
}
