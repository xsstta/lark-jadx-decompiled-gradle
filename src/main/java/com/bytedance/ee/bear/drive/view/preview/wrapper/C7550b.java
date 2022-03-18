package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.wrapper.PlaceHolderView;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.b */
public class C7550b {

    /* renamed from: a */
    public C6418d f20419a;

    /* renamed from: b */
    private PlaceHolderView f20420b;

    /* renamed from: c */
    private Context f20421c;

    /* renamed from: d */
    private C7553d f20422d;

    /* renamed from: e */
    private C7555f f20423e;

    /* renamed from: f */
    private ViewOwner f20424f;

    /* renamed from: a */
    public PlaceHolderView mo29469a() {
        return this.f20420b;
    }

    /* renamed from: b */
    public void mo29470b() {
        this.f20420b.mo29437b();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m30254e() {
        this.f20423e.liveInnerOpenExternal().mo5926a((Void) null);
    }

    /* renamed from: d */
    private void m30253d() {
        if (this.f20423e.getBizType() == 4) {
            this.f20420b.setNoExportPermissionTips(this.f20421c.getResources().getString(R.string.Drive_Drive_AttachFileNotSupportPreviewNoPermissionTips));
            this.f20420b.setNoExportPermissionTipsVisibility(false);
        }
    }

    /* renamed from: c */
    private void m30252c() {
        boolean z;
        if (this.f20423e.getBizType() == 2 || this.f20423e.getBizType() == 4 || this.f20423e.getBizType() == 5) {
            z = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36546e(C8275a.f22375h.mo32555b(), this.f20422d.mo29479b());
        } else if (this.f20423e.getBizType() == 3) {
            z = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36540a(6, 5, this.f20422d.mo29479b());
        } else {
            z = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36540a(6, 0, this.f20422d.mo29479b());
        }
        if (!z) {
            this.f20420b.setBtnOpenExternalVisibility(false);
            C13479a.m54764b("PlaceHolderViewWrapper", "adminEnable=false, hide open external btn. sdkAppId: " + this.f20422d.mo29496o());
            return;
        }
        this.f20420b.setOnBtnOpenExternalClickListener(new PlaceHolderView.AbstractC7541a() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$b$1tqNXy_aUmnefda_iiS1vKPca3Y */

            @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.PlaceHolderView.AbstractC7541a
            public final void onClick() {
                C7550b.this.m30254e();
            }
        });
        this.f20420b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.C7550b.View$OnAttachStateChangeListenerC75511 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                C7550b.this.f20419a.mo25756g();
            }
        });
        this.f20423e.liveOuterExportVisible().mo5923a(this.f20424f.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$b$wlafsSvIKlsSM4Ouu8KwpBtbqRs */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7550b.this.m30251b((Boolean) obj);
            }
        });
        this.f20423e.liveOuterNetState().mo5923a(this.f20424f.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$b$_FD6enjXklcJol2p0g8AKzpqyxQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7550b.this.m30250a((C7550b) ((Boolean) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30249a(DriveBlockPreviewVM.BlockState blockState) {
        this.f20420b.mo29436a(blockState);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30250a(Boolean bool) {
        boolean z;
        PlaceHolderView placeHolderView = this.f20420b;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        placeHolderView.setBtnOpenExternalEnable(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30251b(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            this.f20420b.setBtnOpenExternalVisibility(false);
            this.f20419a.mo25755f();
            return;
        }
        this.f20420b.setBtnOpenExternalVisibility(true);
    }

    public C7550b(Context context, PlaceHolderView placeHolderView, C6418d dVar, ViewOwner viewOwner, C7553d dVar2) {
        this.f20419a = dVar;
        this.f20420b = placeHolderView;
        this.f20424f = viewOwner;
        this.f20421c = context;
        this.f20422d = dVar2;
        this.f20423e = (C7555f) viewOwner.viewModel(C7555f.class);
        m30253d();
        m30252c();
        ((DriveBlockPreviewVM) this.f20424f.viewModel(DriveBlockPreviewVM.class)).getLiveBlockState().mo5923a(this.f20424f.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$b$41YEnJNOhRvYzJVF8Fd8wH5XH3M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7550b.this.m30249a((C7550b) ((DriveBlockPreviewVM.BlockState) obj));
            }
        });
    }
}
