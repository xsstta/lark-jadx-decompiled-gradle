package com.ss.android.lark.mm.module.record.audiorecorder;

import com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.c */
public final /* synthetic */ class C46870c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f118000a;

    static {
        int[] iArr = new int[MmAudioUploadManager.UploadState.values().length];
        f118000a = iArr;
        iArr[MmAudioUploadManager.UploadState.COMPLETE.ordinal()] = 1;
        iArr[MmAudioUploadManager.UploadState.INTERRUPTED.ordinal()] = 2;
        iArr[MmAudioUploadManager.UploadState.WEAK_NETWORK.ordinal()] = 3;
    }
}
