package com.bytedance.ee.bear.document.export.p307b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.export.p308c.C5766c;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.export.b.c */
public class View$OnClickListenerC5761c extends AbstractC5756a<C5766c> implements View.OnClickListener, AbstractC6054a {
    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    /* renamed from: j */
    private void m23271j() {
        ((C5766c) this.f16225c).onClickSheetLongImage();
        mo5513b();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    public void onDestroy() {
        ((C5766c) this.f16225c).onOrientationSupportPanelDismiss(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C5766c mo23186h() {
        return (C5766c) aj.m5366a(getActivity()).mo6005a(C5766c.class);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment, com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C5766c) this.f16225c).onOrientationSupportPanelShowing(this);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.export_item_Excel) {
            mo23183a(ExportFormatEnum.XLSX);
        } else if (id == R.id.export_item_long_image) {
            m23271j();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    /* renamed from: a */
    public void mo23182a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.document_export_sheet_items, viewGroup);
        inflate.findViewById(R.id.export_item_Excel).setOnClickListener(this);
        View findViewById = inflate.findViewById(R.id.export_item_long_image);
        findViewById.setOnClickListener(this);
        if (((C5766c) this.f16225c).shouldShowLongImage()) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
    }
}
