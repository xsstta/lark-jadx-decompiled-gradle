package com.bytedance.ee.bear.drive.view.preview.p364a;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.mimetype.C7094b;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7550b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.PlaceHolderView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.p522q.C10539a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.a.a */
public class C7218a implements AbstractC7219b {

    /* renamed from: a */
    private C7550b f19353a;

    @Override // com.bytedance.ee.bear.drive.view.preview.p364a.AbstractC7219b
    /* renamed from: a */
    public View mo28238a() {
        return this.f19353a.mo29469a();
    }

    public C7218a(ViewOwner viewOwner, C7553d dVar, Context context, C7094b bVar, C6418d dVar2) {
        PlaceHolderView placeHolderView = new PlaceHolderView(context);
        placeHolderView.setLottiePlaceHolder(R.raw.loading_anim);
        placeHolderView.setTipsText(C10539a.m43639a(context, R.string.Drive_Drive_WaitingForTranscode, "filetype", context.getResources().getText(C7096d.m28349c(bVar.mo27730e())).toString()));
        placeHolderView.setBtnText(context.getString(R.string.Drive_Drive_OpenWithOtherApps));
        this.f19353a = new C7550b(context, placeHolderView, dVar2, viewOwner, dVar);
    }
}
