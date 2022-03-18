package com.bytedance.ee.bear.facade.common.icon.wiki;

import com.bytedance.ee.util.io.AbstractC13673d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/facade/common/icon/wiki/FileCategory;", "", "()V", "aep", "", "ai", "apk", "categories", "", "kotlin.jvm.PlatformType", "code", "excel", "image", "keys", "music", "numbers", "pages", "pdf", "ppt", "psd", "sketch", "text", "unknown", "video", "word", "zip", "valueOf", "fileExt", "list-export-min_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.facade.common.icon.a.a */
public final class FileCategory {

    /* renamed from: a */
    public static final FileCategory f20827a = new FileCategory();

    /* renamed from: b */
    private static final Map<String, String> f20828b;

    private FileCategory() {
    }

    static {
        String[] strArr = AbstractC13673d.f35862a;
        Intrinsics.checkExpressionValueIsNotNull(strArr, "FileSuffix.images");
        String[] strArr2 = AbstractC13673d.f35863b;
        Intrinsics.checkExpressionValueIsNotNull(strArr2, "FileSuffix.videos");
        String[] strArr3 = AbstractC13673d.f35864c;
        Intrinsics.checkExpressionValueIsNotNull(strArr3, "FileSuffix.musics");
        String[] strArr4 = AbstractC13673d.f35865d;
        Intrinsics.checkExpressionValueIsNotNull(strArr4, "FileSuffix.texts");
        String[] strArr5 = AbstractC13673d.f35866e;
        Intrinsics.checkExpressionValueIsNotNull(strArr5, "FileSuffix.codes");
        String[] strArr6 = AbstractC13673d.f35867f;
        Intrinsics.checkExpressionValueIsNotNull(strArr6, "FileSuffix.words");
        String[] strArr7 = AbstractC13673d.f35868g;
        Intrinsics.checkExpressionValueIsNotNull(strArr7, "FileSuffix.excels");
        String[] strArr8 = AbstractC13673d.f35869h;
        Intrinsics.checkExpressionValueIsNotNull(strArr8, "FileSuffix.ppts");
        String[] strArr9 = AbstractC13673d.f35870i;
        Intrinsics.checkExpressionValueIsNotNull(strArr9, "FileSuffix.keys");
        String[] strArr10 = AbstractC13673d.f35871j;
        Intrinsics.checkExpressionValueIsNotNull(strArr10, "FileSuffix.zips");
        f20828b = C7715c.m30856a(C7715c.m30855a(strArr, "image"), C7715c.m30855a(strArr2, "video"), C7715c.m30855a(strArr3, "music"), C7715c.m30855a(new String[]{"pdf"}, "pdf"), C7715c.m30855a(strArr4, "text"), C7715c.m30855a(strArr5, "code"), C7715c.m30855a(strArr6, "word"), C7715c.m30855a(strArr7, "excel"), C7715c.m30855a(strArr8, "ppt"), C7715c.m30855a(new String[]{"pages"}, "pages"), C7715c.m30855a(new String[]{"numbers"}, "numbers"), C7715c.m30855a(strArr9, "keys"), C7715c.m30855a(strArr10, "zip"), C7715c.m30855a(new String[]{"apk"}, "apk"), C7715c.m30855a(new String[]{"psd"}, "psd"), C7715c.m30855a(new String[]{"aep"}, "aep"), C7715c.m30855a(new String[]{"ai"}, "ai"), C7715c.m30855a(new String[]{"sketch"}, "sketch"));
    }

    /* renamed from: a */
    public final String mo30188a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileExt");
        Map<String, String> map = f20828b;
        String lowerCase = str.toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
        String str2 = map.get(lowerCase);
        if (str2 != null) {
            return str2;
        }
        return "unknown";
    }
}
