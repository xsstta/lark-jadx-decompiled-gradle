package com.ss.android.vc.meeting.utils.meetingcheck.rx;

import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import io.reactivex.Observable;

@XClass(runOnProcess = XProcess.Original)
public class XObservable<T> {

    /* renamed from: a */
    private Observable<T> f160470a;

    public XObservable(Observable<T> observable) {
        this.f160470a = observable;
    }

    @XMethod
    public final XDisposable subscribe(XConsumer<? super T> xConsumer) {
        return new XDisposable(this.f160470a.subscribe(xConsumer, $$Lambda$XObservable$o5T6gaYxEirO_FmHwSim1KeGzZ8.INSTANCE));
    }
}
