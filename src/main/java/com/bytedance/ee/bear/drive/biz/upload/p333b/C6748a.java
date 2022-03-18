package com.bytedance.ee.bear.drive.biz.upload.p333b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.biz.upload.C6745a;
import com.bytedance.ee.bear.drive.biz.upload.UploadPresenter;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p710m.AbstractC13706a;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.b.a */
public class C6748a extends C6745a {

    /* renamed from: n */
    private int f18371n = 3;

    /* renamed from: o */
    private boolean f18372o;

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a, com.bytedance.ee.bear.drive.biz.upload.C6745a
    /* renamed from: a */
    public int mo25870a() {
        return R.layout.drive_stub_layout;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.C6745a
    /* renamed from: b */
    public void mo26547b(ConnectionService.NetworkState networkState) {
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m26599g() {
        if (!this.f18372o) {
            mo26548c();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m26598d() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", getString(R.string.Doc_Facade_PermissionStorage));
        Handler handler = new Handler(Looper.getMainLooper());
        C13708c.m55600a(getContext(), hashMap, new AbstractC13707b(handler) {
            /* class com.bytedance.ee.bear.drive.biz.upload.p333b.$$Lambda$a$e8hmBCEdChXspcxpg1qTfsdoyA */
            public final /* synthetic */ Handler f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.util.p710m.AbstractC13707b
            public final void onCheckResult(boolean z) {
                C6748a.m269388lambda$e8hmBCEdChXspcxpg1qTfsdoyA(C6748a.this, this.f$1, z);
            }
        }, new AbstractC13706a(handler) {
            /* class com.bytedance.ee.bear.drive.biz.upload.p333b.$$Lambda$a$jkdYl72OiK_L2pBf9uZHDQsmSZU */
            public final /* synthetic */ Handler f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.util.p710m.AbstractC13706a
            public final void onDialogStateChange(boolean z) {
                C6748a.lambda$jkdYl72OiK_L2pBf9uZHDQsmSZU(C6748a.this, this.f$1, z);
            }
        });
    }

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

    /* renamed from: b */
    private List<String> m26596b(List<FileBean> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).getPath());
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        if (bundle == null && (view = getView()) != null) {
            view.post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.biz.upload.p333b.$$Lambda$a$U9hk5x3reKVBHICC3seYlStG8Uo */

                public final void run() {
                    C6748a.lambda$U9hk5x3reKVBHICC3seYlStG8Uo(C6748a.this);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.C6745a
    /* renamed from: a */
    public void mo26545a(Bundle bundle) {
        this.f18360h = "drive_picker_type_media";
        this.f18371n = bundle.getInt("extras_media_type", 2);
        C6920b.m27342f().mo27166a().mo27944c("");
    }

    /* renamed from: a */
    public void mo26563a(List<FileBean> list) {
        List<String> b = m26596b(list);
        C13479a.m54764b("DRIVE_MediaPickerFragment", "selected files=" + b);
        ((UploadPresenter) mo27144f()).mo26568a(b, this.f18354b, this.f18353a, this.f18355c, true, false);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m26595a(Handler handler, boolean z) {
        if (z) {
            this.f18372o = true;
        } else {
            handler.postDelayed(new Runnable() {
                /* class com.bytedance.ee.bear.drive.biz.upload.p333b.$$Lambda$xiOWCCEgZtm2rz2VTcyUaFDuck */

                public final void run() {
                    C6748a.this.mo26548c();
                }
            }, 100);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m26597b(Handler handler, boolean z) {
        int i;
        C13479a.m54764b("DRIVE_MediaPickerFragment", "onCheckResult: isGrant=" + z);
        if (z) {
            FragmentActivity activity = getActivity();
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            FileSelectConfig.C7791f fVar = (FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) FileSelectConfig.fullScreenAlbumBuilder().mo30453d(true)).mo30478g(2).mo30454e(false)).mo30445a(this.f18371n);
            if (!this.f18362j) {
                i = 1;
            } else {
                i = 99;
            }
            FileSelectorManager.m31232a(activity, supportFragmentManager, ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) fVar.mo30452d(i)).mo30451c(true)).mo30463g(false)).mo30479h(2).mo30459a(new SimpleFileSelectListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.p333b.C6748a.C67491 */

                @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
                /* renamed from: a */
                public void mo18018a() {
                    C6748a.this.mo26548c();
                }

                @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
                /* renamed from: a */
                public void mo18019a(List<? extends FileBean> list) {
                    C6748a.this.f18364l = new ArrayList(list);
                    if (!C5084ad.m20847d().mo20038b().mo20041b()) {
                        Toast.showFailureText(C6748a.this.getContext(), C6748a.this.getString(R.string.Drive_Drive_NetInterrupt), 0);
                        C6748a.this.mo26548c();
                        return;
                    }
                    C6748a.this.f18361i = true;
                    C13479a.m54764b("DRIVE_MediaPickerFragment", "onSelectFileBeanList: needResult= " + C6748a.this.f18359g + "isSend=" + C6748a.this.f18361i);
                    if (C6748a.this.f18359g) {
                        C6748a.this.mo26548c();
                    } else if (C6748a.this.f18361i) {
                        C6748a aVar = C6748a.this;
                        aVar.mo26563a(aVar.f18364l);
                        C7130c.m28591b(C6748a.this.f18356d, C6748a.this.f18357e, C6748a.this.f18358f, "confirm");
                    } else {
                        C6748a.this.mo26548c();
                        C7130c.m28591b(C6748a.this.f18356d, C6748a.this.f18357e, C6748a.this.f18358f, "cancel");
                    }
                }
            })).mo30455a(), "DRIVE_MediaPickerFragment");
            return;
        }
        handler.postDelayed(new Runnable() {
            /* class com.bytedance.ee.bear.drive.biz.upload.p333b.$$Lambda$a$Eo5UCEk_i1Cb6zYX1MAIA5DuLJo */

            public final void run() {
                C6748a.lambda$Eo5UCEk_i1Cb6zYX1MAIA5DuLJo(C6748a.this);
            }
        }, 100);
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
