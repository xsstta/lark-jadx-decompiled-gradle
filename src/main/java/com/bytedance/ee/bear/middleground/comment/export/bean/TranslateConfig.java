package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "autoShow", "", "getAutoShow", "()Z", "setAutoShow", "(Z)V", "show", "getShow", "setShow", "srcLang", "", "getSrcLang", "()Ljava/lang/String;", "setSrcLang", "(Ljava/lang/String;)V", "targetLang", "getTargetLang", "setTargetLang", ShareHitPoint.f121869d, "", "getType", "()I", "setType", "(I)V", "toString", "Companion", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TranslateConfig implements NonProguard {
    public static final Companion Companion = new Companion(null);
    @JSONField(name = "enable_auto_translate")
    private boolean autoShow;
    @JSONField(name = "enable_comment_translate")
    private boolean show;
    @JSONField(name = "src_lang")
    private String srcLang = "";
    @JSONField(name = "target_lang")
    private String targetLang = "";
    @JSONField(name = "display_type")
    private int type = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig$Companion;", "", "()V", "NOT_SHOW", "", "SHOW_ALL", "SHOW_TRANSLATE", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getAutoShow() {
        return this.autoShow;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final String getSrcLang() {
        return this.srcLang;
    }

    public final String getTargetLang() {
        return this.targetLang;
    }

    public final int getType() {
        return this.type;
    }

    public String toString() {
        return "TranslateConfig(show=" + this.show + ", autoShow=" + this.autoShow + ", type=" + this.type + ", targetLang='" + this.targetLang + "', srcLang='" + this.srcLang + "')";
    }

    public final void setAutoShow(boolean z) {
        this.autoShow = z;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setSrcLang(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.srcLang = str;
    }

    public final void setTargetLang(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.targetLang = str;
    }
}
