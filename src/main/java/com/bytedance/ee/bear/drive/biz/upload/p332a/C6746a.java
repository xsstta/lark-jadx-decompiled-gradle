package com.bytedance.ee.bear.drive.biz.upload.p332a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.biz.upload.C6745a;
import com.bytedance.ee.bear.drive.biz.upload.UploadPresenter;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.a.a */
public class C6746a extends C6745a {

    /* renamed from: n */
    private boolean f18369n = true;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a, com.bytedance.ee.bear.drive.biz.upload.C6745a
    /* renamed from: a */
    public int mo25870a() {
        return R.layout.drive_stub_layout;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m26583d() {
        FileSelectorManager.m31232a(getActivity(), getActivity().getSupportFragmentManager(), ((FileSelectConfig.C7790e) FileSelectConfig.filePickerBuilder().mo30477a(getResources().getString(R.string.Doc_Facade_Upload)).mo30459a(new SimpleFileSelectListener() {
            /* class com.bytedance.ee.bear.drive.biz.upload.p332a.C6746a.C67471 */

            @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
            /* renamed from: a */
            public void mo18018a() {
                C6746a.this.mo26551a((List<String>) null, false);
            }

            @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
            /* renamed from: a */
            public void mo25164a(List<String> list, boolean z) {
                C6746a.this.mo26551a(list, z);
            }
        })).mo30455a(), "DRIVE_FilePickerFragment");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.upload.C6745a
    /* renamed from: a */
    public UploadPresenter mo25877b(Context context) {
        return new UploadPresenter(getActivity(), C6920b.m27342f());
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6903b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("callSaveInstanceState", true);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.upload.C6745a
    /* renamed from: a */
    public void mo26545a(Bundle bundle) {
        this.f18360h = "drive_picker_type_file";
        C6920b.m27342f().mo27166a().mo27951d("");
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.C6745a
    /* renamed from: b */
    public void mo26547b(ConnectionService.NetworkState networkState) {
        if (networkState == null || getContext() == null || networkState.mo20041b()) {
            this.f18369n = true;
        } else {
            this.f18369n = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        if (bundle == null && (view = getView()) != null) {
            view.post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.biz.upload.p332a.$$Lambda$a$414i1Fchv1rIOu_ImBlfba12Fk */

                public final void run() {
                    C6746a.this.m26583d();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo26550a(ArrayList<String> arrayList, boolean z) {
        ((UploadPresenter) mo27144f()).mo26568a(arrayList, this.f18354b, this.f18353a, this.f18355c, false, z);
    }

    /* renamed from: a */
    public void mo26551a(List<String> list, boolean z) {
        if (!C13657b.m55421a(list)) {
            this.f18365m = z;
            this.f18363k = new ArrayList(list);
            this.f18361i = true;
            C13479a.m54764b("DRIVE_FilePickerFragment", "handleResult: needResult= " + this.f18359g);
            if (this.f18359g) {
                mo26548c();
            } else if (!this.f18369n) {
                mo26548c();
            } else {
                mo26550a(this.f18363k, this.f18365m);
                C7130c.m28591b(this.f18356d, this.f18357e, this.f18358f, "confirm");
            }
        } else {
            this.f18361i = false;
            this.f18363k = null;
            mo26548c();
            C7130c.m28591b(this.f18356d, this.f18357e, this.f18358f, "cancel");
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18369n = true;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
