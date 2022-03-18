package com.bytedance.ee.bear.list.folderselect;

import android.app.Activity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.C8377p;
import com.bytedance.ee.bear.list.folder.C8378q;
import com.bytedance.ee.bear.list.folder.C8384w;
import com.bytedance.ee.bear.list.folder.C8386y;
import com.bytedance.ee.bear.list.folderselect.AbstractC8407f;
import com.bytedance.ee.bear.list.share.C8713af;
import com.bytedance.ee.bear.list.share.C8753y;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.m */
public class C8423m implements AbstractC8407f.AbstractC8408a {

    /* renamed from: a */
    private final C10917c f22718a;

    /* renamed from: b */
    private final String f22719b;

    /* renamed from: c */
    private final int f22720c;

    /* renamed from: d */
    private final int f22721d;

    /* renamed from: e */
    private final boolean f22722e;

    /* renamed from: f */
    private Disposable f22723f;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    /* renamed from: c */
    private String m34879c() {
        if (this.f22722e) {
            return "shared_subfolder";
        }
        return "personal_subfolder";
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable = this.f22723f;
        if (disposable != null && !disposable.isDisposed()) {
            this.f22723f.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8408a
    /* renamed from: b */
    public AbstractC68307f<GetMyRootFolderTokenResult> mo32861b() {
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8401c()).mo20141a(new NetService.C5077f("/space/api/explorer/root/"));
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8408a
    /* renamed from: a */
    public AbstractC68307f<DocumentListInfo> mo32859a() {
        Object obj;
        String str;
        String str2;
        boolean a = SpaceFeatureGatingV2.m32622a();
        NetService.C5076e eVar = new NetService.C5076e();
        int i = this.f22721d;
        String str3 = "/api/explorer/folder/children/";
        if (i == 4) {
            if (a) {
                if (C4211a.m17514a().mo16536a("ccm.space.mobile.folder_shortcut_enable", false)) {
                    eVar.mo20145a("shortcut_filter", "-1");
                    str2 = "/space/api/explorer/v3/my_space/list/";
                } else {
                    str2 = "/space/api/explorer/v2/my_space/list/";
                }
                str3 = str2;
                eVar.mo20145a("obj_type", String.valueOf(C8275a.f22370c.mo32555b()));
            } else {
                eVar.mo20145a(ShareHitPoint.f121869d, String.valueOf(C8275a.f22370c.mo32555b()));
            }
            obj = new C8377p(this.f22719b);
        } else if (i != 6) {
            if (FolderVersion.isShareFolderV2(this.f22720c)) {
                if (C4211a.m17514a().mo16536a("ccm.space.mobile.folder_shortcut_enable", false)) {
                    eVar.mo20145a("shortcut_filter", "-1");
                    str = "/space/api/explorer/v3/children/list/";
                } else {
                    str = "/space/api/explorer/v2/children/list/";
                }
                str3 = str;
                eVar.mo20145a("obj_type", String.valueOf(C8275a.f22370c.mo32555b()));
                obj = new C8378q(this.f22719b);
            } else {
                eVar.mo20145a(ShareHitPoint.f121869d, String.valueOf(C8275a.f22370c.mo32555b()));
                obj = new C8377p(this.f22719b);
            }
            eVar.mo20145a("token", this.f22719b);
        } else if (a) {
            eVar.mo20145a("obj_type", String.valueOf(C8275a.f22370c.mo32555b()));
            obj = new C8753y();
            str3 = "/space/api/explorer/v2/share/list/";
        } else {
            str3 = C8292f.m34128a();
            obj = new C8713af();
        }
        eVar.mo20150b(str3);
        eVar.mo20143a(2);
        eVar.mo20145a("need_total", "1");
        eVar.mo20145a("length", "100");
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a((NetService.AbstractC5074c) obj).mo20141a(eVar).mo238014c(new C8384w()).mo238014c(new C8386y());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34877a(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
        C13479a.m54761a("SubFolderSelectModel", th);
        iGetDataCallback.onError(new ErrorResult("createFolder()...error"));
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8408a
    /* renamed from: a */
    public void mo32860a(Activity activity, IGetDataCallback<DocumentCreateInfo> iGetDataCallback) {
        boolean z;
        Disposable disposable = this.f22723f;
        if (disposable != null && !disposable.isDisposed()) {
            this.f22723f.dispose();
        }
        if (this.f22721d == 4) {
            z = SpaceFeatureGatingV2.m32622a();
        } else {
            z = FolderVersion.isShareFolderV2(this.f22720c);
        }
        C8292f.m34145a(activity, m34879c(), "", this.f22719b, new BearUDInputDialogBuilder.OnBtnClickListener(z, iGetDataCallback) {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$m$9BLMtECrVJ11bJEhDeas2mVuCYQ */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ IGetDataCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
            public final void onClick(String str) {
                C8423m.this.m34878a(this.f$1, this.f$2, str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34878a(boolean z, IGetDataCallback iGetDataCallback, String str) {
        AbstractC68307f<DocumentCreateInfo> a = new DocumentCreateHelper(this.f22718a).mo31350a(C8275a.f22370c.mo32555b(), str, null, this.f22719b, m34879c(), z);
        iGetDataCallback.getClass();
        this.f22723f = a.mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$DQCW4KHO5EhM_fgahLPjmaGy7w */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IGetDataCallback.this.onSuccess((DocumentCreateInfo) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$m$V79uqBEg5oFvvwcfGi4GhoUUHLc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8423m.m34877a(IGetDataCallback.this, (Throwable) obj);
            }
        });
    }

    C8423m(C10917c cVar, int i, String str, int i2, boolean z) {
        this.f22718a = cVar;
        this.f22721d = i;
        this.f22719b = str;
        this.f22720c = i2;
        this.f22722e = z;
    }
}
