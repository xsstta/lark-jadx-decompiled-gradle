package com.ss.android.vc.meeting.module.single.callingringing.observers;

import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.a */
public final /* synthetic */ class C63080a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f158987a;

    static {
        int[] iArr = new int[MeetingAudioManager.AudioType.values().length];
        f158987a = iArr;
        iArr[MeetingAudioManager.AudioType.Default.ordinal()] = 1;
        iArr[MeetingAudioManager.AudioType.Bluetooth.ordinal()] = 2;
        iArr[MeetingAudioManager.AudioType.HeadPhone.ordinal()] = 3;
    }
}
