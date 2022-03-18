package com.ss.android.lark.watermark.mysterious;

import com.ss.android.lark.watermark.dto.WatermarkInfo;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016J\u0006\u0010\u0017\u001a\u00020\nJ\b\u0010\u0018\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfo;", "Lcom/ss/android/lark/watermark/dto/WatermarkInfo;", "()V", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "mysteriousEnabled", "", "getMysteriousEnabled", "()Z", "setMysteriousEnabled", "(Z)V", "tag", "getTag", "tag$delegate", "Lkotlin/Lazy;", "getWatermarkTag", "setWatermarkTag", "", "watermarkTag", "shouldRefreshPeriodically", "toString", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MysteriousWatermarkInfo extends WatermarkInfo {

    /* renamed from: a */
    private final Lazy f143294a = LazyKt.lazy(C58290a.INSTANCE);

    /* renamed from: b */
    private String f143295b;

    /* renamed from: c */
    private boolean f143296c;

    /* renamed from: d */
    private final String m226024d() {
        return (String) this.f143294a.getValue();
    }

    @Override // com.ss.android.lark.watermark.dto.WatermarkInfo
    public void setWatermarkTag(String str) {
    }

    /* renamed from: a */
    public final String mo197386a() {
        return this.f143295b;
    }

    /* renamed from: b */
    public final boolean mo197389b() {
        return this.f143296c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.MysteriousWatermarkInfo$a */
    static final class C58290a extends Lambda implements Function0<String> {
        public static final C58290a INSTANCE = new C58290a();

        C58290a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    @Override // com.ss.android.lark.watermark.dto.WatermarkInfo
    public String getWatermarkTag() {
        String d = m226024d();
        Intrinsics.checkExpressionValueIsNotNull(d, "tag");
        return d;
    }

    /* renamed from: c */
    public final boolean mo197390c() {
        String watermarkContent = getWatermarkContent();
        if (watermarkContent != null) {
            return StringsKt.contains$default((CharSequence) watermarkContent, (CharSequence) "{{.timestamp}}", false, 2, (Object) null);
        }
        return false;
    }

    @Override // com.ss.android.lark.watermark.dto.WatermarkInfo
    public String toString() {
        return "MysteriousWatermarkInfo(imageUrl=" + this.f143295b + ") " + super.toString();
    }

    /* renamed from: a */
    public final void mo197387a(String str) {
        this.f143295b = str;
    }

    /* renamed from: a */
    public final void mo197388a(boolean z) {
        this.f143296c = z;
    }
}
