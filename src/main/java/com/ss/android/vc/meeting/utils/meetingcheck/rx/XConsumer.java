package com.ss.android.vc.meeting.utils.meetingcheck.rx;

import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XProcess;
import io.reactivex.functions.Consumer;

@XClass(autoRelease = true, runOnProcess = XProcess.Original)
public interface XConsumer<T> extends Consumer<T> {
}
