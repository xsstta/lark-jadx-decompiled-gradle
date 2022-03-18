package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.document.web.C6290a;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.biz.preview.viewfinder.DriveViewFinderVM;
import com.bytedance.ee.bear.drive.biz.upload.C6750c;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7523b;
import com.bytedance.ee.bear.drive.view.preview.wps.C7524c;
import com.bytedance.ee.bear.drive.view.preview.wps.WpsView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.widget.DriveWebView;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class WpsPreviewView extends AbsPreviewView implements C7524c.AbstractC7525a, AbstractC7664b {

    /* renamed from: a */
    public C7524c f20408a = new C7524c(this);

    /* renamed from: b */
    private WpsView f20409b;

    /* renamed from: c */
    private boolean f20410c;

    /* renamed from: d */
    private boolean f20411d;

    /* renamed from: e */
    private boolean f20412e;

    /* renamed from: f */
    private boolean f20413f;

    /* renamed from: g */
    private boolean f20414g;

    /* renamed from: h */
    private DriveViewFinderVM f20415h;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.f20409b;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        this.f20409b.show();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.C7524c.AbstractC7525a
    /* renamed from: a */
    public void mo29399a() {
        C13479a.m54764b("DRIVE_PREVIEW_FLOWWpsPreviewView", "requestCamera");
        C6750c.m26608a((Fragment) this.mViewOwner.lifecycleOwner(), new SimpleFileSelectListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.WpsPreviewView.C75483 */

            @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
            /* renamed from: a */
            public void mo18018a() {
                WpsPreviewView.this.f20408a.mo29397a(new Uri[0]);
            }

            @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
            /* renamed from: a */
            public void mo18019a(List<? extends FileBean> list) {
                if (list.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Uri.fromFile(new File(((FileBean) list.get(0)).getPath())));
                    Uri[] uriArr = new Uri[arrayList.size()];
                    arrayList.toArray(uriArr);
                    WpsPreviewView.this.f20408a.mo29397a(uriArr);
                }
            }
        });
    }

    /* renamed from: f */
    private void m30231f() {
        WpsView wpsView = this.f20409b;
        if (wpsView instanceof BaseWebPreviewView) {
            DriveWebView webView = wpsView.getWebView();
            new C6290a(webView.getSettings(), C4511g.m18594d()).mo25299a(webView);
            if (this.f20412e) {
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
            }
            if (this.f20414g) {
                webView.mo29641a(this.f20408a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29466b() {
        if (this.mPreviewViewModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("source_type", String.valueOf(this.mSourceType));
            this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(23, hashMap));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29467c() {
        if (this.mPreviewViewModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("source_type", String.valueOf(this.mSourceType));
            this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(24, hashMap));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo29468d() {
        if (this.mPreviewViewModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("source_type", String.valueOf(this.mSourceType));
            this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(25, hashMap));
        }
    }

    /* renamed from: e */
    private void m30230e() {
        this.f20414g = this.mPreviewViewModel.liveInnerWPSEditModeAvailable().mo5927b().booleanValue();
        WpsView wpsView = new WpsView(this.mContext);
        this.f20409b = wpsView;
        wpsView.mo29362a(this.f20411d, this.f20410c, this.f20412e, this.f20413f);
        this.f20409b.mo29363b(this.f20414g);
        this.f20409b.mo29360a(new WpsView.C7521a(this.mFileModel));
        this.f20409b.onSetup(this.mViewOwner);
        this.f20409b.mo29362a(this.f20411d, this.f20410c, this.f20412e, this.f20413f);
        this.f20409b.setServiceContext(this.mServiceContext);
        this.f20409b.setWpsLoadState(new AbstractC7523b() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.WpsPreviewView.C75461 */

            @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7523b
            /* renamed from: a */
            public void mo29393a() {
                WpsPreviewView.this.mo29466b();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7523b
            /* renamed from: b */
            public void mo29395b() {
                WpsPreviewView.this.mo29467c();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7523b
            /* renamed from: c */
            public void mo29396c() {
                WpsPreviewView.this.mo29468d();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7523b
            /* renamed from: a */
            public void mo29394a(String str) {
                WpsPreviewView.this.mo29465a(str);
            }
        });
        m30231f();
        this.f20409b.setOnShowViewTrackEventCallback(new AbstractC7256c() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.WpsPreviewView.C75472 */

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26117a() {
                WpsPreviewView.this.trackOpenStart();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26118a(String str) {
                C13479a.m54764b("DRIVE_PREVIEW_FLOWWpsPreviewView", "onShowSuccess");
                WpsPreviewView.this.trackOpenSuccess(str);
                WpsPreviewView.this.trackOpenDowngradeSuccess(str);
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
            /* renamed from: a */
            public void mo26119a(String str, Throwable th) {
                String str2;
                int i;
                C13479a.m54758a("DRIVE_PREVIEW_FLOWWpsPreviewView", "openType: " + str + "  errorMessage: " + th);
                if (WpsPreviewView.this.mPreviewViewModel == null) {
                    C13479a.m54758a("DRIVE_PREVIEW_FLOWWpsPreviewView", "onShowFailure mPreviewViewModel is null");
                    return;
                }
                try {
                    new JSONObject(th.getMessage()).getBoolean("isSuccess");
                    WpsPreviewView.this.mPreviewViewModel.liveInnerShowRetryPage().mo5926a((Void) null);
                } catch (Exception e) {
                    C13479a.m54759a("DRIVE_PREVIEW_FLOWWpsPreviewView", "parse wpsLoadStatus fail. ", e);
                    try {
                        str2 = JSON.parseObject(th.getMessage()).getString("errorType");
                    } catch (Exception e2) {
                        C13479a.m54761a("DRIVE_PREVIEW_FLOWWpsPreviewView", e2);
                        str2 = "";
                    }
                    if (TextUtils.equals(str2, "SessionFull")) {
                        i = R.string.Drive_Drive_WpsPreviewSessionFull;
                    } else {
                        i = R.string.Drive_Drive_WpsPreviewGenericError;
                    }
                    C7555f.C7556a aVar = new C7555f.C7556a();
                    aVar.mo29562a(WpsPreviewView.this.mContext.getResources().getString(i));
                    aVar.mo29560a(2);
                    WpsPreviewView.this.mPreviewViewModel.getLiveInnerChangeTipsState().mo5926a(aVar);
                    WpsPreviewView.this.mPreviewViewModel.getliveInnerDowngrade().mo5926a((Integer) 9);
                    WpsPreviewView.this.trackOpenDowngradeFail(str, th);
                }
            }
        });
        disableBehavior();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void showSelectedComment(String str) {
        this.f20409b.showSelectedComment(str);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void updateComment(ArrayList<CommentRectF> arrayList) {
        this.f20409b.updateComment(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29465a(String str) {
        if (this.mPreviewViewModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("wps_stage", str);
            this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(26, hashMap));
        }
    }

    /* renamed from: a */
    private List<Uri> m30229a(Intent intent) {
        Uri uri;
        String stringExtra = intent.getStringExtra("drive_picker_type");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("drive_picker_file_list");
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("drive_picker_media_list");
        int i = 0;
        boolean booleanExtra = intent.getBooleanExtra("drive_picker_success", false);
        boolean booleanExtra2 = intent.getBooleanExtra("drive_picker_file_use_uri", false);
        if (!booleanExtra) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        if (TextUtils.equals(stringExtra, "drive_picker_type_file")) {
            while (i < stringArrayListExtra.size()) {
                String str = stringArrayListExtra.get(i);
                if (booleanExtra2) {
                    uri = Uri.parse(str);
                } else {
                    uri = Uri.fromFile(new File(str));
                }
                arrayList2.add(uri);
                i++;
            }
        } else if (TextUtils.equals(stringExtra, "drive_picker_type_media")) {
            while (i < arrayList.size()) {
                arrayList2.add(Uri.fromFile(new File(((FileBean) arrayList.get(i)).getPath())));
                i++;
            }
        }
        return arrayList2;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.C7524c.AbstractC7525a
    /* renamed from: a */
    public void mo29400a(boolean z) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOWWpsPreviewView", "requestFilePicker");
        C6750c.m26609a((Fragment) this.mViewOwner.lifecycleOwner(), z);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.C7524c.AbstractC7525a
    /* renamed from: a */
    public void mo29401a(boolean z, boolean z2) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOWWpsPreviewView", "requestMediaPicker");
        C6750c.m26610a((Fragment) this.mViewOwner.lifecycleOwner(), z, z2);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            ArrayList arrayList = new ArrayList();
            if (intent != null && i2 == 101) {
                arrayList.addAll(m30229a(intent));
            }
            Uri[] uriArr = new Uri[arrayList.size()];
            arrayList.toArray(uriArr);
            this.f20408a.mo29397a(uriArr);
        }
    }

    public WpsPreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        boolean z;
        if (C6892d.m27247e(this.mFileModel.mo29494m()) || C6892d.m27248f(this.mFileModel.mo29494m())) {
            z = true;
        } else {
            z = false;
        }
        this.f20410c = z;
        this.f20411d = C6892d.m27246d(this.mFileModel.mo29494m());
        this.f20412e = C6892d.m27249g(this.mFileModel.mo29494m());
        this.f20413f = C6892d.m27248f(this.mFileModel.mo29494m());
        this.f20415h = (DriveViewFinderVM) viewOwner.viewModel(DriveViewFinderVM.class);
        m30230e();
    }
}
