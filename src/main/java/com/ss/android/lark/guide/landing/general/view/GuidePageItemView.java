package com.ss.android.lark.guide.landing.general.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class GuidePageItemView extends FrameLayout {

    /* renamed from: a */
    private TextView f99337a;

    /* renamed from: b */
    private TextView f99338b;

    /* renamed from: c */
    private ImageView[] f99339c;

    /* renamed from: d */
    private Context f99340d;

    /* renamed from: a */
    private void m152504a() {
        View inflate = LayoutInflater.from(this.f99340d).inflate(R.layout.fragment_guide_layout, this);
        this.f99339c[0] = (ImageView) inflate.findViewById(R.id.guide_image_1);
        this.f99339c[1] = (ImageView) inflate.findViewById(R.id.guide_image_2);
        this.f99339c[2] = (ImageView) inflate.findViewById(R.id.guide_image_3);
        this.f99339c[3] = (ImageView) inflate.findViewById(R.id.guide_image_4);
        this.f99337a = (TextView) inflate.findViewById(R.id.sloganTitle);
        this.f99338b = (TextView) inflate.findViewById(R.id.sloganContent);
    }

    public GuidePageItemView(Context context) {
        super(context);
        this.f99339c = new ImageView[4];
        this.f99340d = context;
        m152504a();
    }

    public void setData(C38647a aVar) {
        this.f99337a.setText(aVar.f99342b);
        this.f99338b.setText(aVar.f99343c);
        this.f99339c[0].setImageResource(aVar.f99341a[0]);
        this.f99339c[1].setImageResource(aVar.f99341a[1]);
        this.f99339c[2].setImageResource(aVar.f99341a[2]);
        this.f99339c[3].setImageResource(aVar.f99341a[3]);
    }

    public void setPagerScrollOffset(float f) {
        float f2 = ((float) (-getWidth())) * f;
        this.f99339c[0].setTranslationX(0.3f * f2);
        this.f99339c[1].setTranslationX(0.2f * f2);
        this.f99339c[2].setTranslationX(0.1f * f2);
        this.f99339c[3].setTranslationX(f2 * BitmapDescriptorFactory.HUE_RED);
    }

    public GuidePageItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f99339c = new ImageView[4];
        this.f99340d = context;
        m152504a();
    }

    /* renamed from: com.ss.android.lark.guide.landing.general.view.GuidePageItemView$a */
    public static class C38647a {

        /* renamed from: a */
        public int[] f99341a;

        /* renamed from: b */
        public String f99342b;

        /* renamed from: c */
        public String f99343c;

        public C38647a(int[] iArr, String str, String str2) {
            this.f99341a = iArr;
            this.f99342b = str;
            this.f99343c = str2;
        }
    }

    public GuidePageItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f99339c = new ImageView[4];
        this.f99340d = context;
        m152504a();
    }
}
