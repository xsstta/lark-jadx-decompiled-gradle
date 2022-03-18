package kotlinx.coroutines;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0003R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078PX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "handlesException", "", "getHandlesException$kotlinx_coroutines_core", "()Z", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "complete", "completeExceptionally", ApiHandler.API_CALLBACK_EXCEPTION, "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.bv */
public class JobImpl extends JobSupport implements CompletableJob {

    /* renamed from: a */
    private final boolean f173462a = m266402h();

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: b */
    public boolean mo242739b() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: c */
    public boolean mo242740c() {
        return this.f173462a;
    }

    /* renamed from: h */
    private final boolean m266402h() {
        JobSupport caVar;
        ChildHandle l = mo242761l();
        if (!(l instanceof ChildHandleNode)) {
            l = null;
        }
        ChildHandleNode rVar = (ChildHandleNode) l;
        if (!(rVar == null || (caVar = (JobSupport) rVar.f173463b) == null)) {
            while (!caVar.mo242740c()) {
                ChildHandle l2 = caVar.mo242761l();
                if (!(l2 instanceof ChildHandleNode)) {
                    l2 = null;
                }
                ChildHandleNode rVar2 = (ChildHandleNode) l2;
                if (rVar2 != null) {
                    caVar = (JobSupport) rVar2.f173463b;
                    if (caVar == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public JobImpl(Job btVar) {
        super(true);
        mo242744a(btVar);
    }
}
