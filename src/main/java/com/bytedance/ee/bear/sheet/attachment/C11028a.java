package com.bytedance.ee.bear.sheet.attachment;

import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.sheet.attachment.AttachmentModelList;
import com.bytedance.ee.bear.sheet.attachment.C11030b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.sheet.attachment.a */
public class C11028a extends DialogInterface$OnCancelListenerC1021b implements AbstractC7666d {

    /* renamed from: c */
    public C11033c f29691c;

    /* renamed from: d */
    private AbstractC7665c f29692d;

    /* renamed from: e */
    private CommonActionPanelLayout f29693e;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        this.f29691c.closeAttachmentPanel();
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29691c.closeAttachmentPanel();
        AbstractC7665c cVar = this.f29692d;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog v_ = v_();
        Window window = v_.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = BitmapDescriptorFactory.HUE_RED;
            attributes.gravity = 80;
            attributes.flags |= 8;
            attributes.y = C13746i.m55722a(getContext());
            attributes.windowAnimations = R.style.DropdownPopupWindowStyle;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        mo5512a(false);
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40644a(v_);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45934a(View view) {
        this.f29691c.closeAttachmentPanel();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45936a(AttachmentModelList.AttachmentModel attachmentModel) {
        this.f29691c.selectAttachmentItem(attachmentModel);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f29693e.getLayoutParams().height = (int) (((float) C13749l.m55748b()) * 0.4f);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo5510a(2, 0);
        this.f29691c = (C11033c) C4950k.m20474a(this, C11033c.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.attachment_root).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.sheet.attachment.$$Lambda$a$r2k0INnblXRiIS1CCqHAkCdVwiU */

            public final void onClick(View view) {
                C11028a.lambda$r2k0INnblXRiIS1CCqHAkCdVwiU(C11028a.this, view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.attachment_list);
        C11030b bVar = new C11030b();
        bVar.mo42090a(new C11030b.AbstractC11032b() {
            /* class com.bytedance.ee.bear.sheet.attachment.$$Lambda$a$GvWh6df6aPJs3n0GYlcNqR2KGr0 */

            @Override // com.bytedance.ee.bear.sheet.attachment.C11030b.AbstractC11032b
            public final void onItemClick(AttachmentModelList.AttachmentModel attachmentModel) {
                C11028a.lambda$GvWh6df6aPJs3n0GYlcNqR2KGr0(C11028a.this, attachmentModel);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(bVar);
        CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) view.findViewById(R.id.attachment_panel);
        this.f29693e = commonActionPanelLayout;
        commonActionPanelLayout.getLayoutParams().height = (int) (((float) C13749l.m55748b()) * 0.4f);
        this.f29693e.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
            /* class com.bytedance.ee.bear.sheet.attachment.C11028a.C110291 */

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: d */
            public void mo18838d() {
                C11028a.this.f29691c.closeAttachmentPanel();
            }
        });
        this.f29693e.addOnLayoutChangeListener(new View.OnLayoutChangeListener(recyclerView) {
            /* class com.bytedance.ee.bear.sheet.attachment.$$Lambda$a$NwhlDdIPPyBZ12ttjLQiAEvCss */
            public final /* synthetic */ RecyclerView f$1;

            {
                this.f$1 = r2;
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C11028a.m269922lambda$NwhlDdIPPyBZ12ttjLQiAEvCss(C11028a.this, this.f$1, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        this.f29691c.getAttachmentList().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.attachment.$$Lambda$UbMBZf_ATmMbArDfZxfj09lQ_8 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11030b.this.mo42091a((List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7665c.class);
        this.f29692d = cVar;
        if (cVar != null) {
            cVar.mo30121a(this);
        }
        return layoutInflater.inflate(R.layout.sheet_attachment_fragment, viewGroup, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45935a(RecyclerView recyclerView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f29691c.notifyPanelHeightChange(i4 - i2);
        if (i3 != i7) {
            recyclerView.requestLayout();
        }
    }
}
