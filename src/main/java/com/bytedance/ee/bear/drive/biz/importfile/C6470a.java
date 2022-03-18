package com.bytedance.ee.bear.drive.biz.importfile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.biz.importfile.p327a.C6473b;
import com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6479b;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.ImportFailedType;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6903b;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.a */
public class C6470a extends AbstractC6903b<C6473b> implements AbstractC6479b {

    /* renamed from: a */
    private BaseTitleBar f17864a;

    /* renamed from: b */
    private View f17865b;

    /* renamed from: c */
    private SpaceEmptyState f17866c;

    /* renamed from: d */
    private View.OnClickListener f17867d;

    /* renamed from: e */
    private View.OnClickListener f17868e;

    /* renamed from: f */
    private View.OnClickListener f17869f;

    /* renamed from: g */
    private LiveData<ConnectionService.NetworkState> f17870g;

    /* renamed from: h */
    private ConnectionService f17871h;

    /* renamed from: i */
    private ImportFileEntity f17872i;

    /* renamed from: j */
    private boolean f17873j;

    /* renamed from: k */
    private ImportFailedType f17874k;

    /* renamed from: l */
    private long f17875l;

    public static /* synthetic */ void lambda$zVG2nQw8zLzzPYN9WjzM3qM8ZBQ(C6470a aVar, ConnectionService.NetworkState networkState) {
        aVar.m25978a(networkState);
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public int mo25870a() {
        return R.layout.drive_import_file_fragment;
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25873a(View view) {
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6903b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: g */
    private void m25985g() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: d */
    private void m25981d() {
        try {
            if (getArguments() != null) {
                this.f17872i = (ImportFileEntity) getArguments().getParcelable("extra_drive_file_open_entity");
            }
        } catch (Exception e) {
            C13479a.m54761a("DriveImportFileFragment", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: b */
    public void mo25878b() {
        m25981d();
        ((C6473b) mo27144f()).mo25886a(this.f17872i);
        ConnectionService d = C5084ad.m20847d();
        this.f17871h = d;
        this.f17870g = d.mo20037a();
        if (this.f17872i == null) {
            m25985g();
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6479b
    /* renamed from: c */
    public void mo25879c() {
        C13479a.m54764b("DriveImportFileFragment", "showGenerating");
        this.f17865b.setVisibility(0);
        this.f17866c.setVisibility(8);
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.a$1 */
    public static /* synthetic */ class C64711 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17876a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 157
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.importfile.C6470a.C64711.<clinit>():void");
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m25984f(View view) {
        m25985g();
    }

    /* renamed from: a */
    private void m25979a(boolean z) {
        this.f17866c.setPrimaryActionEnabled(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m25982d(View view) {
        ((C6473b) mo27144f()).mo25891d();
    }

    /* renamed from: a */
    public C6473b mo25877b(Context context) {
        return new C6473b(context, ar.m20936a());
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m25980c(View view) {
        ((C6473b) mo27144f()).mo25882a().mo25990a(getContext(), (NetService) KoinJavaComponent.m268610a(NetService.class));
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m25983e(View view) {
        ((C6473b) mo27144f()).mo25889a(false);
        ((C6473b) mo27144f()).mo25890c();
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6903b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("error_page_state", this.f17873j);
        bundle.putSerializable("failed_type", this.f17874k);
        bundle.putLong("file_size", this.f17875l);
    }

    /* renamed from: a */
    private /* synthetic */ void m25978a(ConnectionService.NetworkState networkState) {
        if (networkState != null && networkState.mo20041b()) {
            m25979a(true);
        } else if (!this.f17873j) {
            ((C6473b) mo27144f()).mo25889a(true);
            ((C6473b) mo27144f()).r_().mo237935a();
            mo25875a(ImportFailedType.FailedNoNet);
        } else {
            m25979a(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.f17873j = bundle.getBoolean("error_page_state");
            this.f17874k = (ImportFailedType) bundle.getSerializable("failed_type");
            this.f17875l = bundle.getLong("file_size");
            ImportFailedType importFailedType = this.f17874k;
            if (importFailedType != null) {
                if (this.f17873j) {
                    mo25875a(importFailedType);
                }
                if (this.f17874k == ImportFailedType.FailedSize) {
                    mo25872a(this.f17875l);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6479b
    /* renamed from: a */
    public void mo25872a(long j) {
        String str;
        this.f17875l = j;
        this.f17865b.setVisibility(8);
        this.f17866c.setVisibility(0);
        if (j >= 0) {
            str = C13675f.m55486a(j);
        } else {
            str = "";
        }
        this.f17866c.setDesc(str);
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6479b
    /* renamed from: a */
    public void mo25875a(ImportFailedType importFailedType) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        C13479a.m54764b("DriveImportFileFragment", "showFailed failedType = " + importFailedType);
        this.f17865b.setVisibility(8);
        this.f17874k = importFailedType;
        String str5 = "";
        View.OnClickListener onClickListener = null;
        switch (C64711.f17876a[importFailedType.ordinal()]) {
            case 1:
                str = getString(R.string.CreationMobile_DocX_import_failed_NoPermission);
                str2 = str5;
                z = true;
                break;
            case 2:
                str = getString(R.string.Drive_Drive_ImportFailedByType);
                str2 = str5;
                z = true;
                break;
            case 3:
                str = ((C6473b) mo27144f()).mo25883a(R.string.Drive_Drive_ImportFailedBySize);
                str2 = str5;
                z = true;
                break;
            case 4:
                str = getString(R.string.CreationMobile_import_failed_retry);
                str2 = getString(R.string.Drive_Drive_Retry);
                onClickListener = this.f17867d;
                z = true;
                break;
            case 5:
                str = getString(R.string.CreationMobile_DocX_import_failed_NoSpace);
                str2 = str5;
                z = true;
                break;
            case 6:
                str = getString(R.string.CreationMobile_DocX_import_failed_encrypted);
                str2 = str5;
                z = true;
                break;
            case 7:
                str = getString(R.string.Dirve_Drive_ImportNoNetwork);
                str2 = getString(R.string.Drive_Drive_Retry);
                onClickListener = this.f17867d;
                z = false;
                break;
            case 8:
                str3 = getString(R.string.Drive_Drive_ImportFailedRetry);
                str4 = getString(R.string.CreationMobile_DocX_import_7000);
                z = true;
                str5 = str3;
                str = str4;
                str2 = str5;
                break;
            case 9:
                str3 = getString(R.string.Drive_Drive_ImportFailedRetry);
                str4 = getString(R.string.CreationMobile_DocX_import_7001);
                z = true;
                str5 = str3;
                str = str4;
                str2 = str5;
                break;
            case 10:
                str3 = getString(R.string.Drive_Drive_ImportFailedRetry);
                str4 = getString(R.string.CreationMobile_DocX_import_7002);
                z = true;
                str5 = str3;
                str = str4;
                str2 = str5;
                break;
            case 11:
                str = getString(R.string.CreationMobile_DocX_import_failed_Nonexist);
                str2 = str5;
                z = true;
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                str = getString(R.string.CreationMobile_drive_import_import_empty_file);
                str2 = str5;
                z = true;
                break;
            default:
                str = getString(R.string.Drive_Drive_ImportFailedSupport);
                str2 = getString(R.string.Drive_Drive_ImportContactSupport);
                onClickListener = this.f17868e;
                z = true;
                break;
        }
        this.f17866c.setTitle(str5);
        this.f17866c.setDesc(str);
        this.f17866c.setPrimaryText(str2);
        this.f17866c.setPrimaryClickListener(onClickListener);
        this.f17866c.setPrimaryActionEnabled(z);
        this.f17866c.setVisibility(0);
        this.f17873j = true;
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6479b
    /* renamed from: a */
    public void mo25876a(String str) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(str);
        m25985g();
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25874a(View view, Bundle bundle) {
        if (this.f17872i == null) {
            m25985g();
            return;
        }
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.main_title_bar);
        this.f17864a = baseTitleBar;
        baseTitleBar.setDividerVisible(false);
        this.f17864a.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.$$Lambda$a$rSxFzPZ6ZJxYS4SBY7raPsi2rS0 */

            public final void onClick(View view) {
                C6470a.lambda$rSxFzPZ6ZJxYS4SBY7raPsi2rS0(C6470a.this, view);
            }
        });
        this.f17864a.setRightVisible(false);
        this.f17864a.setTitle(this.f17872i.mo27487b());
        this.f17865b = view.findViewById(R.id.import_generating_view);
        this.f17866c = (SpaceEmptyState) view.findViewById(R.id.ud_empty_state_view);
        this.f17867d = new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.$$Lambda$a$yjcWS6I0qrtqIOO7zdADQU6exqc */

            public final void onClick(View view) {
                C6470a.lambda$yjcWS6I0qrtqIOO7zdADQU6exqc(C6470a.this, view);
            }
        };
        this.f17868e = new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.$$Lambda$a$lbcMPlqBAB1XKUsSKs68BGJzDtU */

            public final void onClick(View view) {
                C6470a.lambda$lbcMPlqBAB1XKUsSKs68BGJzDtU(C6470a.this, view);
            }
        };
        this.f17869f = new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.$$Lambda$a$KXZI13npziiQpvhoVtA56jzYS84 */

            public final void onClick(View view) {
                C6470a.lambda$KXZI13npziiQpvhoVtA56jzYS84(C6470a.this, view);
            }
        };
        this.f17870g.mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.$$Lambda$a$zVG2nQw8zLzzPYN9WjzM3qM8ZBQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C6470a.lambda$zVG2nQw8zLzzPYN9WjzM3qM8ZBQ(C6470a.this, (ConnectionService.NetworkState) obj);
            }
        });
        ((C6473b) mo27144f()).mo25884a(this.f17870g);
        if (bundle == null) {
            ((C6473b) mo27144f()).mo25890c();
        }
    }
}
