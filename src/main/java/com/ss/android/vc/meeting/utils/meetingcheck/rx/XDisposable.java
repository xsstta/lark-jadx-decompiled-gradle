package com.ss.android.vc.meeting.utils.meetingcheck.rx;

import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import io.reactivex.disposables.Disposable;

@XClass(runOnProcess = XProcess.Original)
public class XDisposable implements Disposable {

    /* renamed from: a */
    private Disposable f160469a;

    public XDisposable() {
    }

    @Override // io.reactivex.disposables.Disposable
    @XMethod
    public void dispose() {
        Disposable disposable = this.f160469a;
        if (disposable != null && !disposable.isDisposed()) {
            this.f160469a.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    @XMethod
    public boolean isDisposed() {
        Disposable disposable = this.f160469a;
        if (disposable != null) {
            return disposable.isDisposed();
        }
        return true;
    }

    public XDisposable(Disposable disposable) {
        this.f160469a = disposable;
    }
}
