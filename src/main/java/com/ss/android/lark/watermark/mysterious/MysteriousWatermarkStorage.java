package com.ss.android.lark.watermark.mysterious;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ss.android.lark.util.share_preference.C57744a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkStorage;", "", "()V", "restoreWatermark", "Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkInfo;", "saveWatermark", "", "t", "Companion", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.mysterious.e */
public final class MysteriousWatermarkStorage {

    /* renamed from: a */
    public static final Companion f143329a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkStorage$Companion;", "", "()V", "FIELD_ALPHA", "", "FIELD_BG_COLOR", "FIELD_IMAGE_URL", "FIELD_WATERMARK_CONTENT", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final MysteriousWatermarkInfo mo197412a() {
        JsonObject jsonObject;
        String str;
        String str2;
        boolean z;
        float f;
        try {
            JsonElement parse = new JsonParser().parse(C57744a.m224104a().getString("MysteriousWatermark"));
            if (parse != null) {
                jsonObject = parse.getAsJsonObject();
            } else {
                jsonObject = null;
            }
            if (jsonObject != null) {
                MysteriousWatermarkInfo mysteriousWatermarkInfo = new MysteriousWatermarkInfo();
                JsonElement jsonElement = jsonObject.get("watermarkContent");
                if (jsonElement != null) {
                    str = jsonElement.getAsString();
                } else {
                    str = null;
                }
                mysteriousWatermarkInfo.setWatermarkContent(str);
                JsonElement jsonElement2 = jsonObject.get("imageUrl");
                if (jsonElement2 != null) {
                    str2 = jsonElement2.getAsString();
                } else {
                    str2 = null;
                }
                mysteriousWatermarkInfo.mo197387a(str2);
                int i = 0;
                if (mysteriousWatermarkInfo.mo197386a() != null) {
                    z = true;
                } else {
                    z = false;
                }
                mysteriousWatermarkInfo.mo197388a(z);
                JsonElement jsonElement3 = jsonObject.get("bgColor");
                if (jsonElement3 != null) {
                    i = jsonElement3.getAsInt();
                }
                mysteriousWatermarkInfo.setBgColor(i);
                JsonElement jsonElement4 = jsonObject.get("alpha");
                if (jsonElement4 != null) {
                    f = jsonElement4.getAsFloat();
                } else {
                    f = 0.1f;
                }
                mysteriousWatermarkInfo.setAlpha(f);
                return mysteriousWatermarkInfo;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo197413a(MysteriousWatermarkInfo mysteriousWatermarkInfo) {
        Intrinsics.checkParameterIsNotNull(mysteriousWatermarkInfo, "t");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("watermarkContent", mysteriousWatermarkInfo.getWatermarkContent());
        jsonObject.addProperty("imageUrl", mysteriousWatermarkInfo.mo197386a());
        jsonObject.addProperty("bgColor", Integer.valueOf(mysteriousWatermarkInfo.getBgColor()));
        jsonObject.addProperty("alpha", Float.valueOf(mysteriousWatermarkInfo.getAlpha()));
        C57744a.m224104a().putString("MysteriousWatermark", jsonObject.toString());
    }
}
