package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.DriveCommonConstants;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6801a;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6802b;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.C6818b;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.p338a.C6815a;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.p338a.C6816b;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.C6824a;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.UploadListStatusLayout;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6903b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.suite.R;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.b */
public class C6818b extends AbstractC6903b<C6821c> implements AbstractC6814a {

    /* renamed from: a */
    public Dialog f18535a;

    /* renamed from: b */
    public String f18536b;

    /* renamed from: c */
    private C6820a f18537c;

    /* renamed from: d */
    private TextView f18538d;

    /* renamed from: e */
    private C6824a f18539e;

    /* renamed from: f */
    private String f18540f;

    /* renamed from: g */
    private String f18541g;

    /* renamed from: h */
    private DriveCommonConstants.DriveRustFgConfig f18542h;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public int mo25870a() {
        return R.layout.drive_upload_list_fragment;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.AbstractC6822d
    /* renamed from: c */
    public void mo26857c() {
        this.f18539e.notifyDataSetChanged();
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.AbstractC6822d
    /* renamed from: d */
    public String mo26858d() {
        return this.f18539e.mo26868a();
    }

    /* renamed from: h */
    private void m26912h() {
        this.f18537c.f18546c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f18537c.f18546c.setAdapter(this.f18539e);
    }

    /* renamed from: i */
    private void m26913i() {
        this.f18539e.mo26871a(new C6824a.AbstractC6825a() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.$$Lambda$b$ufGy7U88s0YoZC1biJ8OraHJV3I */

            @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.C6824a.AbstractC6825a
            public final void onMenuDelConfirmClick(View view, int i, C6802b bVar) {
                C6818b.this.m26910b(view, i, bVar);
            }
        });
        this.f18539e.mo26870a(new UploadListStatusLayout.AbstractC6823a() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.$$Lambda$b$Dp81n4HS3hikdhPgmoAWguON98 */

            @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.UploadListStatusLayout.AbstractC6823a
            public final void onRetryClick(View view, int i, C6802b bVar) {
                C6818b.this.m26908a((C6818b) view, (View) i, (int) bVar);
            }
        });
    }

    /* renamed from: j */
    private void m26914j() {
        this.f18542h = (DriveCommonConstants.DriveRustFgConfig) C4211a.m17514a().mo16532a("drive_rust_config", DriveCommonConstants.DriveRustFgConfig.class, new DriveCommonConstants.DriveRustFgConfig());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.b$a */
    public static final class C6820a {

        /* renamed from: a */
        View f18544a;

        /* renamed from: b */
        BaseTitleBar f18545b;

        /* renamed from: c */
        RecyclerView f18546c;

        /* renamed from: d */
        SpaceEmptyState f18547d;

        /* renamed from: e */
        String f18548e;

        /* renamed from: a */
        private void m26930a() {
            BaseTitleBar baseTitleBar = (BaseTitleBar) this.f18544a.findViewById(R.id.upload_list_main_title);
            this.f18545b = baseTitleBar;
            baseTitleBar.setDividerVisible(false);
            this.f18546c = (RecyclerView) this.f18544a.findViewById(R.id.drive_upload_list_rececler_view);
            this.f18547d = (SpaceEmptyState) this.f18544a.findViewById(R.id.ud_empty_state_view);
            this.f18545b.setLeftClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.$$Lambda$b$a$JEtK_pLBZftKWFLnsx4mvr8eQfg */

                public final void onClick(View view) {
                    C6818b.C6820a.this.m26931a(view);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m26931a(View view) {
            C6920b.m27342f().mo27166a().mo27922a("back", "none", this.f18548e);
            View view2 = this.f18544a;
            if (view2 != null && (view2.getContext() instanceof Activity)) {
                ((Activity) this.f18544a.getContext()).finish();
            }
        }

        C6820a(View view, String str) {
            this.f18544a = view;
            this.f18548e = str;
            m26930a();
        }
    }

    /* renamed from: g */
    private void m26911g() {
        this.f18537c.f18545b.setTitle(getResources().getString(R.string.Drive_Drive_UploadList));
        C6815a aVar = new C6815a();
        aVar.mo26848a("1");
        aVar.mo26849b(getResources().getString(R.string.Drive_Drive_CancelUpload));
        m26909a(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: b */
    public void mo25878b() {
        if (getArguments() != null) {
            this.f18540f = getArguments().getString("mountNodeToken", "");
            this.f18541g = getArguments().getString("mountPoint", "");
            this.f18536b = getArguments().getString("spaceId", "");
            C13479a.m54764b("UpdateListTAG", "mountNodeTokens=" + C13721c.m55650d(this.f18540f) + ", mountPoint=" + this.f18541g);
        }
        m26914j();
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.AbstractC6822d
    /* renamed from: a */
    public void mo26854a(List<C6802b> list) {
        this.f18539e.mo26874a(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6821c mo25877b(Context context) {
        return new C6821c(context, ar.m20936a());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: b */
    public void mo26649b(View view) {
        super.mo26649b(view);
        this.f18537c = new C6820a(view, this.f18536b);
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.AbstractC6822d
    /* renamed from: b */
    public void mo26856b(List<C6802b> list) {
        if (list.size() == 0) {
            this.f18537c.f18546c.setVisibility(8);
            this.f18537c.f18547d.setVisibility(0);
            TextView textView = this.f18538d;
            if (textView != null) {
                textView.setTextColor(getResources().getColor(R.color.text_disable));
            }
        }
    }

    /* renamed from: a */
    private void m26909a(C6815a aVar) {
        if (aVar != null) {
            C68191 r0 = null;
            if (!TextUtils.isEmpty(aVar.mo26847a())) {
                r0 = new BaseTitleBar.C11804e(aVar.mo26847a(), R.color.primary_pri_500) {
                    /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.C6818b.C68191 */

                    /* access modifiers changed from: private */
                    /* renamed from: i */
                    public /* synthetic */ void m26928i() {
                        ((C6821c) C6818b.this.mo27144f()).mo26863c();
                    }

                    @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
                    /* renamed from: a */
                    public void mo16854a(View view) {
                        C7130c a = C6920b.m27342f().mo27166a();
                        a.mo27962g();
                        a.mo27922a("cancel", "ccm_drive_stop_upload_confirm_view", C6818b.this.f18536b);
                        a.mo27946d();
                        super.mo16854a(view);
                        if (C6818b.this.f18535a == null) {
                            C6818b bVar = C6818b.this;
                            bVar.f18535a = new C6816b(bVar.getContext(), a).mo26851a(new C6816b.AbstractC6817a() {
                                /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.$$Lambda$b$1$Clt4GhA_O1uTqNEGgmpgcYCC4c */

                                @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.p338a.C6816b.AbstractC6817a
                                public final void cancelAllFilesClick() {
                                    C6818b.C68191.this.m26928i();
                                }
                            }).mo26850a();
                            return;
                        }
                        C6818b.this.f18535a.show();
                    }
                };
            }
            this.f18538d = (TextView) this.f18537c.f18545b.mo45070a((BaseTitleBar.AbstractC11800a) r0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25873a(View view) {
        ((C6821c) mo27144f()).mo26862a(this.f18540f, this.f18541g, this.f18542h);
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.AbstractC6822d
    /* renamed from: a */
    public void mo26853a(String str) {
        boolean z;
        if ("13001".equals(str) && getActivity() != null) {
            ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40012a(getActivity(), FullQuotoConfig.UPLOAD);
        } else if (TextUtils.equals(str, String.valueOf(90003061)) && getActivity() != null) {
            AbstractC10575k kVar = (AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class);
            FragmentActivity activity = getActivity();
            if (TextUtils.isEmpty(this.f18540f) || TextUtils.equals(this.f18540f, "all_files_token")) {
                z = false;
            } else {
                z = true;
            }
            kVar.mo40013a(activity, "", "", z);
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.AbstractC6822d
    /* renamed from: a */
    public void mo26855a(boolean z) {
        this.f18538d.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25874a(View view, Bundle bundle) {
        C6824a aVar = new C6824a(((C6821c) mo27144f()).mo26859a(), this.f18542h);
        this.f18539e = aVar;
        aVar.mo26873a(this.f18541g);
        m26911g();
        m26912h();
        m26913i();
    }

    /* renamed from: a */
    public static C6818b m26907a(String str, String str2, String str3) {
        C6818b bVar = new C6818b();
        Bundle bundle = new Bundle();
        bundle.putString("mountNodeToken", str);
        bundle.putString("mountPoint", str2);
        bundle.putString("spaceId", str3);
        bVar.setArguments(bundle);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m26910b(View view, int i, C6802b bVar) {
        ((C6821c) mo27144f()).mo26860a(new C6801a(-1, bVar.mo26796f(), 0));
        C6920b.m27342f().mo27166a().mo27965h();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26908a(View view, int i, C6802b bVar) {
        C6920b.m27342f().mo27166a().mo27922a("retry", "none", this.f18536b);
        ((C6821c) mo27144f()).mo26861a(bVar.mo26796f());
    }
}
