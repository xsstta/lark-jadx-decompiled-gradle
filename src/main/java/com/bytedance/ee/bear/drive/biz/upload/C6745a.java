package com.bytedance.ee.bear.drive.biz.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6903b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.a */
public class C6745a extends AbstractC6903b<UploadPresenter> implements AbstractC1178x<ConnectionService.NetworkState>, IUploadView {

    /* renamed from: a */
    protected String f18353a;

    /* renamed from: b */
    protected String f18354b;

    /* renamed from: c */
    protected Bundle f18355c;

    /* renamed from: d */
    public String f18356d;

    /* renamed from: e */
    public String f18357e;

    /* renamed from: f */
    public String f18358f;

    /* renamed from: g */
    public boolean f18359g;

    /* renamed from: h */
    protected String f18360h;

    /* renamed from: i */
    public boolean f18361i;

    /* renamed from: j */
    protected boolean f18362j = true;

    /* renamed from: k */
    protected ArrayList<String> f18363k;

    /* renamed from: l */
    public ArrayList<FileBean> f18364l;

    /* renamed from: m */
    protected boolean f18365m;

    /* renamed from: n */
    private LiveData<ConnectionService.NetworkState> f18366n;

    /* renamed from: o */
    private AbstractC68323g<ConnectionService.NetworkState> f18367o;

    /* renamed from: p */
    private Disposable f18368p;

    public static /* synthetic */ void lambda$8fkWbUgPcJaLrRojTNq7uHvqOzQ(C6745a aVar, AbstractC68323g gVar) {
        aVar.m26569a(gVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public int mo25870a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UploadPresenter mo25877b(Context context) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26545a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25873a(View view) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25874a(View view, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void m26571c(ConnectionService.NetworkState networkState) {
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.IUploadView
    /* renamed from: c */
    public void mo26548c() {
        mo26544a(0);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LiveData<ConnectionService.NetworkState> liveData = this.f18366n;
        if (liveData != null) {
            liveData.mo5928b(this);
        }
        Disposable disposable = this.f18368p;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: b */
    public void mo25878b() {
        Bundle arguments = getArguments();
        Objects.requireNonNull(arguments);
        Bundle bundle = arguments;
        this.f18353a = bundle.getString("extras_mount_node_point", "");
        this.f18354b = bundle.getString("extras_mount_point", "");
        this.f18359g = bundle.getBoolean("extras_need_result", false);
        this.f18362j = bundle.getBoolean("extras_multiple", true);
        Bundle bundle2 = bundle.getBundle("extras_tea_params");
        this.f18355c = bundle2;
        if (bundle2 != null) {
            this.f18356d = bundle2.getString("module", "");
            this.f18357e = this.f18355c.getString("sub_module", "");
            this.f18358f = this.f18355c.getString("parent_token", "");
        }
        this.f18366n = C5084ad.m20847d().mo20037a();
        this.f18368p = AbstractC68307f.m265080a(new AbstractC68324h() {
            /* class com.bytedance.ee.bear.drive.biz.upload.$$Lambda$a$8fkWbUgPcJaLrRojTNq7uHvqOzQ */

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                C6745a.lambda$8fkWbUgPcJaLrRojTNq7uHvqOzQ(C6745a.this, gVar);
            }
        }, BackpressureStrategy.LATEST).mo238025e(1, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.upload.$$Lambda$a$jrW6WlMu92eq4JYA5aD1eyZ254 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6745a.this.m26571c((C6745a) ((ConnectionService.NetworkState) obj));
            }
        }, $$Lambda$a$HtdPUlZoRvH2Yzm2Q_EQBPlNqic.INSTANCE);
        this.f18366n.mo5925a((AbstractC1178x<? super ConnectionService.NetworkState>) this);
        C6920b.m27342f().mo27166a().mo27923a("click_upload", "", "", this.f18355c);
        mo26545a(bundle);
    }

    /* renamed from: a */
    private /* synthetic */ void m26569a(AbstractC68323g gVar) throws Exception {
        if (this.f18367o == null) {
            this.f18367o = gVar;
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.IUploadView
    /* renamed from: a */
    public void mo26544a(int i) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (this.f18359g) {
                Intent intent = activity.getIntent();
                intent.putExtra("drive_picker_success", this.f18361i);
                intent.putExtra("drive_picker_type", this.f18360h);
                intent.putStringArrayListExtra("drive_picker_file_list", this.f18363k);
                intent.putExtra("drive_picker_file_use_uri", this.f18365m);
                intent.putExtra("drive_picker_media_list", this.f18364l);
                activity.setResult(101, intent);
            } else {
                activity.setResult(i);
            }
            activity.finish();
        }
    }

    /* renamed from: a */
    public void onChanged(ConnectionService.NetworkState networkState) {
        AbstractC68323g<ConnectionService.NetworkState> gVar = this.f18367o;
        if (gVar != null) {
            gVar.onNext(networkState);
        }
    }
}
