package com.ss.android.lark.mm.module.detail.translate;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EN_US", "ZH_CN", "JA_JP", "DEFAULT", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum MmTranslateLangType {
    EN_US("en_us"),
    ZH_CN("zh_cn"),
    JA_JP("ja_jp"),
    DEFAULT("default");
    
    public static final Companion Companion = new Companion(null);
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "value", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MmTranslateLangType mo162757a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            switch (str.hashCode()) {
                case 96647668:
                    if (str.equals("en_us")) {
                        return MmTranslateLangType.EN_US;
                    }
                    break;
                case 100877646:
                    if (str.equals("ja_jp")) {
                        return MmTranslateLangType.JA_JP;
                    }
                    break;
                case 115862300:
                    if (str.equals("zh_cn")) {
                        return MmTranslateLangType.ZH_CN;
                    }
                    break;
                case 1544803905:
                    if (str.equals("default")) {
                        return MmTranslateLangType.DEFAULT;
                    }
                    break;
            }
            return MmTranslateLangType.DEFAULT;
        }
    }

    public final String getValue() {
        return this.value;
    }

    private MmTranslateLangType(String str) {
        this.value = str;
    }
}
