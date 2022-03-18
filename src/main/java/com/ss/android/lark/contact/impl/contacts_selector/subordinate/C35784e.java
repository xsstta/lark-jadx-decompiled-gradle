package com.ss.android.lark.contact.impl.contacts_selector.subordinate;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.passport.v1.GetUserSidebarRequest;
import com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal;
import com.ss.android.lark.contact.impl.p1761f.C35917f;
import com.ss.android.lark.sdk.SdkSender;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.subordinate.e */
public class C35784e implements AbstractC35776c {

    /* renamed from: a */
    IDepartmentServiceInternal f92517a = C35917f.m140749a();

    /* renamed from: b */
    private CallbackManager f92518b = new CallbackManager();

    @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35776c
    /* renamed from: a */
    public void mo131680a() {
        this.f92518b.cancelCallbacks();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private List<GetUserSidebarResponse.SidebarInfo> m140050a(byte[] bArr) {
        GetUserSidebarResponse decode;
        if (bArr == null || (decode = GetUserSidebarResponse.ADAPTER.decode(bArr)) == null) {
            return null;
        }
        return decode.sidebar_infos;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35776c
    /* renamed from: b */
    public void mo131682b(IGetDataCallback<List<GetUserSidebarResponse.SidebarInfo>> iGetDataCallback) {
        GetUserSidebarRequest.C18727a aVar = new GetUserSidebarRequest.C18727a();
        aVar.mo64405a(SyncDataStrategy.FORCE_SERVER);
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SIDEBAR, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.$$Lambda$e$g6Aijo4EbvA5pptEcccx_wT7rE */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C35784e.m270489lambda$g6Aijo4EbvA5pptEcccx_wT7rE(C35784e.this, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35776c
    /* renamed from: a */
    public void mo131681a(final IGetDataCallback<IDepartmentServiceInternal.SubordinateDepartmentStructure> iGetDataCallback) {
        this.f92517a.mo132177a((IGetDataCallback) this.f92518b.wrapAndAddCallback(new IGetDataCallback<IDepartmentServiceInternal.SubordinateDepartmentStructure>() {
            /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35784e.C357851 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(final IDepartmentServiceInternal.SubordinateDepartmentStructure subordinateDepartmentStructure) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35784e.C357851.RunnableC357861 */

                    public void run() {
                        iGetDataCallback.onSuccess(subordinateDepartmentStructure);
                    }
                });
            }
        }));
    }
}
