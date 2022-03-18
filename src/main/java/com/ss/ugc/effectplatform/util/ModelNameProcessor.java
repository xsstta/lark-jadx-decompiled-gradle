package com.ss.ugc.effectplatform.util;

import bytekn.foundation.utils.StringExtension;
import com.ss.ugc.effectplatform.model.algorithm.C65518b;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/ugc/effectplatform/util/ModelNameProcessor;", "", "()V", "PATTERN_MD5", "", "PATTERN_SUFFIX", "PATTERN_VERSION", "getFullNameFromModelInfo", "info", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "getMD5OfModel", "sourceStr", "getNameOfModel", "getSizeOfModel", "", "getVersionOfModel", "isBigVersionEquals", "", "version1", "version2", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.n */
public final class ModelNameProcessor {

    /* renamed from: a */
    public static final ModelNameProcessor f165128a = new ModelNameProcessor();

    private ModelNameProcessor() {
    }

    /* renamed from: a */
    public final String mo228345a(ModelInfo modelInfo) {
        Intrinsics.checkParameterIsNotNull(modelInfo, "info");
        return modelInfo.getName() + "_v" + modelInfo.getVersion() + "_size" + modelInfo.getType() + "_md5" + C65518b.m256861a(modelInfo) + ".model";
    }

    /* renamed from: b */
    public final String mo228348b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceStr");
        String str2 = str;
        StringsKt.lastIndexOf$default((CharSequence) str2, "/", 0, false, 6, (Object) null);
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, "_v", 0, false, 6, (Object) null);
        int a = StringExtension.f5768a.mo8677a(str, "\\.model|_model|\\.dat");
        if (lastIndexOf$default <= 0) {
            return "1.0";
        }
        String substring = str.substring(lastIndexOf$default + 2, a);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public final String mo228350d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceStr");
        String str2 = str;
        if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "md5", false, 2, (Object) null)) {
            return null;
        }
        String str3 = null;
        try {
            String substring = str.substring(StringsKt.indexOf$default((CharSequence) str2, "md5", 0, false, 6, (Object) null) + 3, StringsKt.lastIndexOf$default((CharSequence) str2, "_model", 0, false, 6, (Object) null));
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception unused) {
            return str3;
        }
    }

    /* renamed from: a */
    public final String mo228346a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceStr");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null);
        int a = StringExtension.f5768a.mo8677a(str, "_v[0-9]");
        int i = lastIndexOf$default + 1;
        if (StringUtil.f165132a.mo228355a(str, i, a)) {
            String substring = str.substring(i, a);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        int a2 = StringExtension.f5768a.mo8677a(str, "\\.model|_model|\\.dat");
        if (a2 > 0) {
            String substring2 = str.substring(i, a2);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }
        String substring3 = str.substring(i, str.length());
        Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring3;
    }

    /* renamed from: c */
    public final int mo228349c(String str) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "sourceStr");
        String str2 = str;
        if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "size", false, 2, (Object) null)) {
            return 0;
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, "size", 0, false, 6, (Object) null);
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "md5", false, 2, (Object) null)) {
            i = StringExtension.f5768a.mo8677a(str, "_md5");
        } else {
            i = StringExtension.f5768a.mo8677a(str, "\\.model|_model|\\.dat");
        }
        if (lastIndexOf$default >= i) {
            return -1;
        }
        String substring = str.substring(lastIndexOf$default + 4, i);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            return Integer.parseInt(substring);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final boolean mo228347a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "version1");
        Intrinsics.checkParameterIsNotNull(str2, "version2");
        boolean z = false;
        if (TextUtils.f165135a.mo228357a(str) || TextUtils.f165135a.mo228357a(str2)) {
            return false;
        }
        if (TextUtils.f165135a.mo228358a(str, str2)) {
            return true;
        }
        try {
            String substring = str.substring(0, StringsKt.indexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null));
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring2 = str2.substring(0, StringsKt.indexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null));
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            z = TextUtils.f165135a.mo228358a(substring, substring2);
        } catch (Exception unused) {
        }
        return z;
    }
}
