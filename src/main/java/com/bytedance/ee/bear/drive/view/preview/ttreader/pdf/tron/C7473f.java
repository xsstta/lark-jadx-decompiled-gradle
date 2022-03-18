package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.app.Application;
import android.content.res.Resources;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13749l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\b\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u0006\u0010\f\u001a\u00020\u000b\u001a\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"TAG", "", "calcThumbnailSizeF", "Landroid/util/SizeF;", "view", "Landroid/view/View;", "pageSizeF", "getSpanCount", "", "getThumbSpacing", "isPDFOutlineEnable", "", "isPDFThumbEnable", "setImageLayout", "", "spanCount", "drive-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.f */
public final class C7473f {
    /* renamed from: b */
    public static final int m29886b() {
        return C13749l.m55738a(4);
    }

    /* renamed from: a */
    public static final int m29883a() {
        int a = C13749l.m55738a(100);
        int b = m29886b();
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        Resources resources = application.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "ContextUtils.baseApplica…on\n            .resources");
        return (int) Math.floor(((double) resources.getDisplayMetrics().widthPixels) / ((double) (a + b)));
    }

    /* renamed from: c */
    public static final boolean m29887c() {
        boolean a = C4211a.m17514a().mo16536a("ccm.drive.pdf_thumb_enable", false);
        C13479a.m54764b("PDFUtils", "isPDFThumbEnable: " + a);
        return a;
    }

    /* renamed from: d */
    public static final boolean m29888d() {
        boolean a = C4211a.m17514a().mo16536a("ccm.drive.pdf_outline_enable", false);
        C13479a.m54764b("PDFUtils", "isPDFOutlineEnable: " + a);
        return a;
    }

    /* renamed from: a */
    public static final SizeF m29884a(View view, SizeF sizeF) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(sizeF, "pageSizeF");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkExpressionValueIsNotNull(layoutParams, "view.layoutParams");
        int i = layoutParams.width;
        int i2 = layoutParams.height;
        float f = (float) 0;
        if (sizeF.getWidth() > f && sizeF.getHeight() > f) {
            float width = sizeF.getWidth();
            float height = sizeF.getHeight();
            float min = Math.min(((float) i) / width, ((float) i2) / height);
            i = (int) (width * min);
            i2 = (int) (min * height);
        }
        return new SizeF(((float) i) * 1.0f, ((float) i2) * 1.0f);
    }

    /* renamed from: a */
    public static final void m29885a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (C13749l.m55736a() - C13749l.m55738a(20)) / i;
        layoutParams.height = (int) (((double) layoutParams.width) * 1.29d);
        view.requestLayout();
    }
}
