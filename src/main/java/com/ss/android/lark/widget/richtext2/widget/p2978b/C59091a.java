package com.ss.android.lark.widget.richtext2.widget.p2978b;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.C59032f;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext2.entity.ImageParseResult;
import com.ss.android.lark.widget.richtext2.widget.RichTextView2;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.b.a */
public class C59091a {
    /* renamed from: a */
    private static int m229515a(boolean z) {
        return z ? 2 : 1;
    }

    /* renamed from: a */
    private static LinearLayout.LayoutParams m229516a(int[] iArr) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        return layoutParams;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m229521a(RichTextView2.AbstractC59086a aVar, View view) {
        if (aVar != null) {
            return aVar.mo200744a(view);
        }
        return false;
    }

    /* renamed from: a */
    private static void m229518a(View view, Image image, RichTextView2.AbstractC59086a aVar) {
        view.setOnClickListener(new View.OnClickListener(image) {
            /* class com.ss.android.lark.widget.richtext2.widget.p2978b.$$Lambda$a$RVKzdWY94HfJk_00y27KjSEnC9c */
            public final /* synthetic */ Image f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C59091a.m229520a(RichTextView2.AbstractC59086a.this, this.f$1, view);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.widget.richtext2.widget.p2978b.$$Lambda$a$b2X2vp0pBpC2izharQmjq2_UpWQ */

            public final boolean onLongClick(View view) {
                return C59091a.m229521a(RichTextView2.AbstractC59086a.this, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m229520a(RichTextView2.AbstractC59086a aVar, Image image, View view) {
        if (aVar != null) {
            aVar.mo200743a(image, view);
        }
    }

    /* renamed from: a */
    private static int[] m229522a(Context context, Image image, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            i = (int) (((double) DeviceUtils.getScreenWidth(context)) * 0.6d);
            i2 = DeviceUtils.getScreenWidth(context);
        } else {
            i = (int) (((double) DeviceUtils.getScreenWidth(context)) * 0.7d);
            i2 = DeviceUtils.getScreenHeight(context);
        }
        int i5 = (int) (((double) i2) * 0.6d);
        if (image.getWidth() <= 0) {
            i3 = UIUtils.dp2px(context, 80.0f);
        } else {
            i3 = Math.min(UIUtils.dp2px(context, 27.0f), image.getWidth());
        }
        if (image.getHeight() <= 0) {
            i4 = UIUtils.dp2px(context, 80.0f);
        } else {
            i4 = Math.min(UIUtils.dp2px(context, 27.0f), image.getHeight());
        }
        return ImageUtils.m224135a(image.getWidth(), image.getHeight(), i, i5, i3, i4);
    }

    /* renamed from: a */
    public static void m229519a(LKUIRoundableLayout lKUIRoundableLayout, int i, float f, int i2) {
        lKUIRoundableLayout.setBackground(null);
        lKUIRoundableLayout.setBorderColor(i);
        lKUIRoundableLayout.setBorderWidthInPx(f);
        lKUIRoundableLayout.setRadiusInPx(i2);
    }

    /* renamed from: a */
    public static LKUIRoundableLayout m229517a(Context context, ImageParseResult imageParseResult, boolean z, RichTextView2.AbstractC59086a aVar) {
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(context, null);
        ImageView imageView = new ImageView(context);
        lKUIRoundableLayout.addView(imageView);
        Image a = C59031e.m229176a(imageParseResult.getProperty(), m229515a(z));
        m229518a(lKUIRoundableLayout, a, aVar);
        int[] a2 = m229522a(context, a, z);
        lKUIRoundableLayout.setLayoutParams(m229516a(a2));
        C59032f.m229191a().mo200569a(a, a2[0], a2[1], imageView);
        return lKUIRoundableLayout;
    }
}
