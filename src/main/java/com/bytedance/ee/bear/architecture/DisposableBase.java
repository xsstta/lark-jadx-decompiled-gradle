package com.bytedance.ee.bear.architecture;

import com.bytedance.ee.log.C13479a;
import com.ss.android.vc.statistics.p3180a.C63690d;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/architecture/DisposableBase;", "", "()V", "TAG", "", "dispose", "Lio/reactivex/disposables/CompositeDisposable;", "addDispose", "", C63690d.f160779a, "Lio/reactivex/disposables/Disposable;", "onCleared", "removeDispose", "component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.a.a */
public class DisposableBase {

    /* renamed from: a */
    private final String f12619a = ("DisposableBase#" + getClass());

    /* renamed from: b */
    private final C68289a f12620b = new C68289a();

    /* renamed from: a */
    public void mo16330a() {
        C13479a.m54764b(this.f12619a, "clear");
        this.f12620b.mo237935a();
    }

    /* renamed from: a */
    public final void mo16331a(Disposable disposable) {
        if (disposable != null) {
            this.f12620b.mo237937a(disposable);
        }
    }

    /* renamed from: b */
    public final void mo16332b(Disposable disposable) {
        if (disposable != null) {
            if (!disposable.isDisposed()) {
                disposable.dispose();
            }
            this.f12620b.mo237941c(disposable);
        }
    }
}
