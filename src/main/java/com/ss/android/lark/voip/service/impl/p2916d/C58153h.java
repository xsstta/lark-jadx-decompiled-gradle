package com.ss.android.lark.voip.service.impl.p2916d;

import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.lark.voip.service.impl.util.VoIPAudioManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.d.h */
public final /* synthetic */ class C58153h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f143058a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f143059b;

    static {
        int[] iArr = new int[NetworkUtils.NetworkType.values().length];
        f143058a = iArr;
        iArr[NetworkUtils.NetworkType.WIFI.ordinal()] = 1;
        iArr[NetworkUtils.NetworkType.MOBILE_2G.ordinal()] = 2;
        iArr[NetworkUtils.NetworkType.MOBILE_3G.ordinal()] = 3;
        iArr[NetworkUtils.NetworkType.MOBILE_4G.ordinal()] = 4;
        int[] iArr2 = new int[VoIPAudioManager.AudioType.values().length];
        f143059b = iArr2;
        iArr2[VoIPAudioManager.AudioType.Default.ordinal()] = 1;
        iArr2[VoIPAudioManager.AudioType.Bluetooth.ordinal()] = 2;
        iArr2[VoIPAudioManager.AudioType.HeadPhone.ordinal()] = 3;
    }
}
