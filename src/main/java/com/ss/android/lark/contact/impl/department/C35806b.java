package com.ss.android.lark.contact.impl.department;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.department.C35812c;
import com.ss.android.lark.contact.impl.department.DepartmentStructureModel;
import com.ss.android.lark.contact.impl.department.DepartmentStructureView;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.lark.contact.impl.department.b */
public class C35806b extends BasePresenter<C35812c.AbstractC35813a, C35812c.AbstractC35815b, C35812c.AbstractC35815b.AbstractC35816a> {

    /* renamed from: a */
    public static String f92575a = "DepartmentStructurePresenter";

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* renamed from: c */
    private C35812c.AbstractC35813a.AbstractC35814a m140144c() {
        return new C35810a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C35812c.AbstractC35815b.AbstractC35816a createViewDelegate() {
        return new C35811b();
    }

    /* renamed from: a */
    public void mo131737a() {
        ((C35812c.AbstractC35815b) getView()).mo131718a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.department.b$a */
    public class C35810a implements C35812c.AbstractC35813a.AbstractC35814a {
        private C35810a() {
        }

        @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35813a.AbstractC35814a
        /* renamed from: a */
        public void mo131743a(String str) {
            ((C35812c.AbstractC35815b) C35806b.this.getView()).mo131724a(str, (String) null);
        }

        @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35813a.AbstractC35814a
        /* renamed from: a */
        public void mo131744a(String str, String str2) {
            ((C35812c.AbstractC35815b) C35806b.this.getView()).mo131724a(str, str2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.department.b$b */
    public class C35811b implements C35812c.AbstractC35815b.AbstractC35816a {
        private C35811b() {
        }

        @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35815b.AbstractC35816a
        /* renamed from: a */
        public void mo131745a(Bundle bundle, String str, boolean z, boolean z2, String str2) {
            bundle.putString("department_id", str);
            bundle.putBoolean("is_edu", z);
            bundle.putBoolean("get_inactive_parent", z2);
            bundle.putString("school_parent_contact_extra", str2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m140141a(Boolean bool) {
        if (bool.booleanValue()) {
            ((C35812c.AbstractC35815b) getView()).mo131727d();
        }
    }

    /* renamed from: a */
    private void m140140a(Context context) {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable(context) {
            /* class com.ss.android.lark.contact.impl.department.$$Lambda$b$LchSMgC_styyZnwjlHvj0bTX3Y */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C35806b.this.m140143b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m140143b(Context context) {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        ((C35812c.AbstractC35813a) getModel()).mo131711a(context, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.contact.impl.department.C35806b.C358082 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e(C35806b.f92575a, "getShowMoreIcon is error");
                countDownLatch.countDown();
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                atomicReference2.set((DepartmentStructureModel.UnregisterCheckData) C38760a.m153056a(str, DepartmentStructureModel.UnregisterCheckData.class));
                countDownLatch.countDown();
            }
        });
        ((C35812c.AbstractC35813a) getModel()).mo131712a(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.contact.impl.department.C35806b.C358093 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str = C35806b.f92575a;
                Log.m165383e(str, "checkManageShow is error: " + errorResult);
                countDownLatch.countDown();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                boolean z;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                if (z) {
                    String x = C35358a.m138143a().mo130179x();
                    if (!TextUtils.isEmpty(x)) {
                        atomicReference.set(x);
                    }
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(atomicReference2, atomicReference) {
            /* class com.ss.android.lark.contact.impl.department.$$Lambda$b$4AmKQcChI34EMyw19gsvu_NAd58 */
            public final /* synthetic */ AtomicReference f$1;
            public final /* synthetic */ AtomicReference f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C35806b.this.m140142a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo131738a(Bundle bundle) {
        ((C35812c.AbstractC35815b) getView()).mo131719a(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m140142a(AtomicReference atomicReference, AtomicReference atomicReference2) {
        ((C35812c.AbstractC35815b) getView()).mo131720a((DepartmentStructureModel.UnregisterCheckData) atomicReference.get(), (String) atomicReference2.get());
        ((C35812c.AbstractC35813a) getModel()).mo131713a((DepartmentStructureModel.UnregisterCheckData) atomicReference.get());
    }

    public C35806b(Activity activity, DepartmentStructureView.AbstractC35803a aVar, Bundle bundle, Bundle bundle2) {
        boolean z = bundle.getBoolean("is_edu", false);
        String string = bundle.getString("school_parent_contact_extra");
        boolean z2 = bundle.getBoolean("get_inactive_parent", false);
        boolean z3 = bundle.getBoolean("b2b_connect", false);
        DepartmentStructureView departmentStructureView = new DepartmentStructureView(activity, aVar, z, z3, z2, string, bundle.getBoolean("read_departments_from_shared_memory", false), bundle.getString("department_page_title"));
        DepartmentStructureModel departmentStructureModel = new DepartmentStructureModel(bundle, bundle2);
        setModel(departmentStructureModel);
        setView(departmentStructureView);
        departmentStructureView.setViewDelegate(createViewDelegate());
        departmentStructureModel.mo131714a(m140144c());
        if (z3) {
            departmentStructureModel.mo131715b(new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.contact.impl.department.C35806b.C358071 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool.booleanValue()) {
                        ((C35812c.AbstractC35815b) C35806b.this.getView()).mo131727d();
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    String str = C35806b.f92575a;
                    Log.m165383e(str, "checkShowInviteCollaboration err: " + errorResult.toString());
                }
            }));
        } else {
            C35358a.m138143a().mo130158e().mo130215a(new C57865c.AbstractC57871b() {
                /* class com.ss.android.lark.contact.impl.department.$$Lambda$b$P2eL3gS8NJWyjHNVNTxC_2v0E */

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                public final void consume(Object obj) {
                    C35806b.this.m140141a((C35806b) ((Boolean) obj));
                }
            });
        }
        m140140a(activity);
    }
}
