package com.ss.android.lark.keyboard.plugin.tool.checker;

import com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.h */
public final /* synthetic */ class C40829h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f103810a;

    static {
        int[] iArr = new int[VideoSendChecker.Result.values().length];
        f103810a = iArr;
        iArr[VideoSendChecker.Result.LIMIT_SIZE.ordinal()] = 1;
        iArr[VideoSendChecker.Result.LIMIT_DURATION.ordinal()] = 2;
        iArr[VideoSendChecker.Result.LIMIT_RESOLUTION.ordinal()] = 3;
        iArr[VideoSendChecker.Result.LIMIT_FPS.ordinal()] = 4;
        iArr[VideoSendChecker.Result.LIMIT_BITRATE.ordinal()] = 5;
        iArr[VideoSendChecker.Result.LIMIT_VE_NO_SUPPORT.ordinal()] = 6;
        iArr[VideoSendChecker.Result.VALID.ordinal()] = 7;
    }
}