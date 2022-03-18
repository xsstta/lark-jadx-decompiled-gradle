package com.bytedance.ee.bear.slide.common.export.p551a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.slide.common.export.a.b */
public class C11395b extends AbstractC11394a<Bitmap, C11397a> {

    /* renamed from: b */
    private Context f30617b;

    public C11395b(Context context) {
        this.f30617b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.slide.common.export.a.b$a */
    public static class C11397a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f30618a;

        private C11397a(View view) {
            super(view);
            this.f30618a = (ImageView) view.findViewById(R.id.image_view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43642a(C11397a aVar, Bitmap bitmap) {
        aVar.f30618a.setImageBitmap(bitmap);
    }

    /* renamed from: b */
    public C11397a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C11397a(mo43639a(viewGroup, R.layout.slide_export_long_picture_item));
    }
}
