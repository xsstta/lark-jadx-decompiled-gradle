package com.bytedance.ee.bear.list.folder.complaint;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.folder.complaint.AbstractC8354i;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.list.folder.complaint.c */
public class C8345c extends BasePresenter<AbstractC8353h, AbstractC8354i, AbstractC8354i.AbstractC8355a> implements AbstractC8354i.AbstractC8355a {

    /* renamed from: a */
    private final Context f22550a;

    /* renamed from: b */
    private final AbstractC8346a f22551b;

    /* renamed from: c */
    private final C68289a f22552c = new C68289a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.folder.complaint.c$a */
    public interface AbstractC8346a {
        /* renamed from: a */
        void mo32785a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC8354i.AbstractC8355a createViewDelegate() {
        return this;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f22552c.mo237935a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34571a(SendComplaintResult sendComplaintResult) throws Exception {
        C13479a.m54764b("FolderComplaintPresenter", "sendComplaint()...success");
        ((AbstractC8354i) getView()).mo32790b();
        AbstractC8346a aVar = this.f22551b;
        if (aVar != null) {
            aVar.mo32785a();
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.complaint.AbstractC8354i.AbstractC8355a
    /* renamed from: a */
    public void mo32788a(View view) {
        ((AbstractC8354i) getView()).mo32789a();
        this.f22552c.mo237937a(((AbstractC8353h) getModel()).mo32786a().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.complaint.$$Lambda$c$l2uZUkcwApasWSggzlT5BDL3HR0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8345c.this.m34571a((C8345c) ((SendComplaintResult) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.complaint.$$Lambda$c$g08bE515R3abzKpeuExwLsmej1U */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8345c.this.m34572a((C8345c) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34572a(Throwable th) throws Exception {
        C13479a.m54758a("FolderComplaintPresenter", "sendComplaint()...failed, error = " + th);
        ((AbstractC8354i) getView()).mo32790b();
        if (C5203d.m21235a(th, 10004)) {
            Toast.showFailureText(this.f22550a, (int) R.string.CreationMobile_ECM_SubmitThreeTimesToast);
        } else if (C5203d.m21235a(th, 10005)) {
            Toast.showFailureText(this.f22550a, (int) R.string.CreationMobile_ECM_SubmitMaximumToast);
        } else if (C5203d.m21235a(th, 10003)) {
            Toast.showFailureText(this.f22550a, (int) R.string.CreationMobile_appealing_folder_identical);
        } else {
            Toast.showFailureText(this.f22550a, (int) R.string.Doc_Facade_OperateFailed);
        }
    }

    public C8345c(AbstractC8353h hVar, AbstractC8354i iVar, AbstractC8346a aVar, Context context) {
        super(hVar, iVar);
        this.f22550a = context;
        this.f22551b = aVar;
    }
}
