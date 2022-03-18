package com.bytedance.ee.bear.middleground.permission.setting.doc.p490a;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPublicPermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.a.g */
public class C9957g extends AbstractC1142af {
    private DocPublicPermissionManager manager;
    private DocPermSetInfo permSetInfo;
    private final C1177w<DocPermSetInfo> permSetInfoLiveData;
    public final C1177w<C9959a> state = new C1177w<>();

    public LiveData<DocPermSetInfo> getPermSetInfoLiveData() {
        return this.permSetInfoLiveData;
    }

    public LiveData<C9959a> getState() {
        return this.state;
    }

    private AbstractC10169g getSimpleCallback() {
        return new AbstractC10169g() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9957g.C99581 */

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17110a() {
            }

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17111a(int i) {
                C9957g.this.state.mo5929b(new C9959a(2));
            }

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17112a(Throwable th) {
                C9957g.this.state.mo5929b(new C9959a(3, th));
            }
        };
    }

    private DocPublicPermissionManager getManager() {
        if (this.manager == null) {
            this.manager = new DocPublicPermissionManager(false);
        }
        return this.manager;
    }

    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.a.g$a */
    public static class C9959a {

        /* renamed from: a */
        int f26926a;

        /* renamed from: b */
        Throwable f26927b;

        public C9959a(int i) {
            this(i, null);
        }

        public C9959a(int i, Throwable th) {
            this.f26926a = i;
            this.f26927b = th;
        }
    }

    public void setPermSetInfo(DocPermSetInfo docPermSetInfo) {
        this.permSetInfo = docPermSetInfo;
        this.permSetInfoLiveData.mo5929b(docPermSetInfo);
    }

    public void setState(C9959a aVar) {
        this.state.mo5929b(aVar);
    }

    public C9957g(DocPermSetInfo docPermSetInfo) {
        C1177w<DocPermSetInfo> wVar = new C1177w<>();
        this.permSetInfoLiveData = wVar;
        this.permSetInfo = docPermSetInfo;
        wVar.mo5929b(docPermSetInfo);
    }

    public void updateEnable(boolean z) {
        this.state.mo5929b(new C9959a(1));
        getManager().mo38461a(this.permSetInfo.mo38827c(), this.permSetInfo.mo38825b(), z, 1, getSimpleCallback());
    }

    public void updatePermission(int i) {
        this.state.mo5929b(new C9959a(1));
        String c = this.permSetInfo.mo38827c();
        int b = this.permSetInfo.mo38825b();
        switch (i) {
            case 2:
                getManager().mo38460a(c, b, getSimpleCallback());
                return;
            case 3:
                getManager().mo38464b(c, b, getSimpleCallback());
                return;
            case 4:
                getManager().mo38472g(c, b, getSimpleCallback());
                return;
            case 5:
                getManager().mo38462a(c, b, this.permSetInfo.mo38795D(), getSimpleCallback());
                return;
            case 6:
                getManager().mo38462a(c, b, false, getSimpleCallback());
                return;
            case 7:
                getManager().mo38462a(c, b, true, getSimpleCallback());
                return;
            case 8:
                getManager().mo38471f(c, b, getSimpleCallback());
                return;
            case 9:
                getManager().mo38466c(c, b, getSimpleCallback());
                return;
            case 10:
                getManager().mo38468d(c, b, getSimpleCallback());
                return;
            case 11:
                getManager().mo38470e(c, b, getSimpleCallback());
                return;
            default:
                return;
        }
    }

    public AbstractC68307f<Boolean> checkLock(String str, int i, boolean z) {
        return DocPermissionManager.m41996a(i, str, z);
    }
}
