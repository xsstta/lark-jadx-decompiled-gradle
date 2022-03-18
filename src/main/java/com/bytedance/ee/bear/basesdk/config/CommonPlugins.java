package com.bytedance.ee.bear.basesdk.config;

import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.DocumentMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/config/CommonPlugins;", "", "()V", "handleTemplatePreviewPlugin", "", "documentMetadata", "Lcom/bytedance/ee/bear/document/DocumentMetadata;", "previewListener", "Lkotlin/Function3;", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.basesdk.a.f */
public final class CommonPlugins {

    /* renamed from: a */
    public static final CommonPlugins f12991a = new CommonPlugins();

    private CommonPlugins() {
    }

    /* renamed from: a */
    public final void mo17010a(DocumentMetadata qVar, Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> oVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(qVar, "documentMetadata");
        Intrinsics.checkParameterIsNotNull(oVar, "previewListener");
        boolean z2 = true;
        if (qVar.getOpenSource() == DocsOpenSource.template_preview) {
            z = true;
        } else {
            z = false;
        }
        boolean isCommonTemplatePreview = qVar.isCommonTemplatePreview();
        if (isCommonTemplatePreview) {
            z = false;
        }
        if (!z && !isCommonTemplatePreview) {
            z2 = false;
        }
        oVar.invoke(Boolean.valueOf(z2), Boolean.valueOf(z), Boolean.valueOf(isCommonTemplatePreview));
    }
}
