package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.larksuite.suite.R;

public class NotSupportPreviewView extends AbsPreviewView {

    /* renamed from: a */
    private C7550b f20368a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m30186a(View view) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.f20368a.mo29469a();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        trackOpenStart();
        this.f20368a.mo29470b();
        trackOpenSuccess("not_support_view");
    }

    /* renamed from: a */
    private void m30185a() {
        PlaceHolderView placeHolderView = new PlaceHolderView(this.mContext);
        placeHolderView.setImagePlaceHolder(R.drawable.illustration_empty_neutral_no_preview);
        placeHolderView.setTipsText(m30184a(this.mContext, this.mFileModel, this.mFileModel.mo29494m()));
        placeHolderView.setSizeInBytes(this.mFileModel.mo29488g());
        placeHolderView.setBtnText(this.mContext.getString(R.string.Drive_Drive_OpenWithOtherApps));
        placeHolderView.setOnClickListener($$Lambda$NotSupportPreviewView$ICfG_hLAMWJTnpoD3WLoQ6volFg.INSTANCE);
        this.f20368a = new C7550b(this.mContext, placeHolderView, C6418d.m25763a(this.mPreviewViewModel.getBizType(), this.mContext, this.mServiceContext), this.mViewOwner, this.mFileModel);
    }

    /* renamed from: a */
    private SpannableString m30184a(Context context, C7553d dVar, String str) {
        if (dVar.mo29490i() == 5) {
            return new SpannableString(context.getString(R.string.Drive_Drive_PreviewOversize));
        }
        if (dVar.mo29490i() == 6) {
            return new SpannableString(context.getString(R.string.Drive_Drive_PreviewSizeZero));
        }
        if (str == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(String.format(".%s %s", str, context.getString(R.string.Drive_Drive_FileTypeCannotPreview)));
        spannableString.setSpan(new StyleSpan(1), 0, str.length() + 1, 33);
        return spannableString;
    }

    public NotSupportPreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        m30185a();
    }
}
