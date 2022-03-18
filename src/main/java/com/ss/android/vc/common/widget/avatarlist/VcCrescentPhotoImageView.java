package com.ss.android.vc.common.widget.avatarlist;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.shapeimage.ShaderImageView;
import com.ss.android.shapeimage.p3023b.AbstractC59984a;
import com.ss.android.shapeimage.p3023b.C59985b;

public class VcCrescentPhotoImageView extends ShaderImageView {
    @Override // com.ss.android.shapeimage.ShaderImageView
    /* renamed from: a */
    public AbstractC59984a mo126280a() {
        return new C60830a(R.raw.meeting_card_photo_shape);
    }

    /* renamed from: com.ss.android.vc.common.widget.avatarlist.VcCrescentPhotoImageView$a */
    static class C60830a extends C59985b {
        @Override // com.ss.android.shapeimage.p3023b.AbstractC59984a
        /* renamed from: a */
        public Bitmap mo126282a() {
            Bitmap d = mo204260d();
            if (d != null) {
                int width = d.getWidth();
                int height = d.getHeight();
                if (width > 0 && height > 0) {
                    float round = (float) Math.round(((float) this.f149545a) - (((float) this.f149548d) * 2.0f));
                    float round2 = (float) Math.round(((float) this.f149546b) - (((float) this.f149548d) * 2.0f));
                    float f = round2 / ((float) height);
                    this.f149555k.setScale(f, f);
                    this.f149555k.postTranslate((float) this.f149548d, (float) this.f149548d);
                    mo204251a(width, height, round, round2, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    return d;
                }
            }
            mo204257b();
            return null;
        }

        public C60830a(int i) {
            super(i);
        }
    }

    public VcCrescentPhotoImageView(Context context) {
        super(context);
    }

    @Override // com.ss.android.shapeimage.ShaderImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        getPathHelper().mo204254a(getDrawable());
    }

    public VcCrescentPhotoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VcCrescentPhotoImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
