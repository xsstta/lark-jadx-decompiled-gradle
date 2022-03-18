package com.ss.android.vc.meeting.module.bottombar;

import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.bottombar.function.FunctionItem;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.bottombar.d */
public final /* synthetic */ class C61498d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f154230a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f154231b;

    static {
        int[] iArr = new int[MeetingAudioManager.AudioType.values().length];
        f154230a = iArr;
        iArr[MeetingAudioManager.AudioType.Default.ordinal()] = 1;
        iArr[MeetingAudioManager.AudioType.Bluetooth.ordinal()] = 2;
        iArr[MeetingAudioManager.AudioType.HeadPhone.ordinal()] = 3;
        int[] iArr2 = new int[FunctionItem.FunctionType.values().length];
        f154231b = iArr2;
        iArr2[FunctionItem.FunctionType.Chat.ordinal()] = 1;
        iArr2[FunctionItem.FunctionType.Record.ordinal()] = 2;
        iArr2[FunctionItem.FunctionType.BreakoutRoom.ordinal()] = 3;
        iArr2[FunctionItem.FunctionType.Subtitle.ordinal()] = 4;
        iArr2[FunctionItem.FunctionType.Live.ordinal()] = 5;
        iArr2[FunctionItem.FunctionType.Effect.ordinal()] = 6;
        iArr2[FunctionItem.FunctionType.PSTN.ordinal()] = 7;
        iArr2[FunctionItem.FunctionType.SIP.ordinal()] = 8;
        iArr2[FunctionItem.FunctionType.Interpretation.ordinal()] = 9;
        iArr2[FunctionItem.FunctionType.Settings.ordinal()] = 10;
    }
}
