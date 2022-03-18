package com.ss.android.lark.mm.module.record.audiorecorder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mm/module/record/audiorecorder/MmAudioRecordService$onCreate$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmAudioRecordService$onCreate$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ MmAudioRecordService f117975a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MmAudioRecordService$onCreate$1(MmAudioRecordService mmAudioRecordService) {
        this.f117975a = mmAudioRecordService;
    }

    public void onReceive(Context context, Intent intent) {
        MmRecordManager mmRecordManager = this.f117975a.f117958a;
        if (mmRecordManager != null) {
            mmRecordManager.mo164529h();
        }
    }
}
