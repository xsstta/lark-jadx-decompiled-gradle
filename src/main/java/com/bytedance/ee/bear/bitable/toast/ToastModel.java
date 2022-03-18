package com.bytedance.ee.bear.bitable.toast;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0003\u001f !B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0016\n\u0002\u0010\u001d\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/ToastModel;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "confirmText", "", "getConfirmText", "()Ljava/lang/String;", "setConfirmText", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "duration", "", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "id", "getId", "setId", ShareHitPoint.f121869d, "", "type$annotations", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "toString", "CLoseType", "Companion", "ToastType", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ToastModel implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private String confirmText;
    private String content;
    private Long duration = 3000L;
    private String id;
    private Integer type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/ToastModel$ToastType;", "", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ToastType {
        public static final Companion Companion = Companion.f14222a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/ToastModel$ToastType$Companion;", "", "()V", "TOAST_TYPE_FAIL", "", "getTOAST_TYPE_FAIL", "()I", "setTOAST_TYPE_FAIL", "(I)V", "TOAST_TYPE_LOADING", "getTOAST_TYPE_LOADING", "setTOAST_TYPE_LOADING", "TOAST_TYPE_NORMAL", "getTOAST_TYPE_NORMAL", "setTOAST_TYPE_NORMAL", "TOAST_TYPE_SUCCESS", "getTOAST_TYPE_SUCCESS", "setTOAST_TYPE_SUCCESS", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.toast.ToastModel$ToastType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f14222a = new Companion();

            /* renamed from: b */
            private static int f14223b = ToastTypeEnum.NORMAL.ordinal();

            /* renamed from: c */
            private static int f14224c = ToastTypeEnum.LOADING.ordinal();

            /* renamed from: d */
            private static int f14225d = ToastTypeEnum.FAIL.ordinal();

            /* renamed from: e */
            private static int f14226e = ToastTypeEnum.SUCCESS.ordinal();

            private Companion() {
            }
        }
    }

    public static /* synthetic */ void type$annotations() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/ToastModel$CLoseType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Timeout", "Confirm", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum CLoseType {
        Timeout(0),
        Confirm(1);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private CLoseType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/ToastModel$Companion;", "", "()V", "DEFAULT_DURATION", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.ToastModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getConfirmText() {
        return this.confirmText;
    }

    public final String getContent() {
        return this.content;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getType() {
        return this.type;
    }

    public String toString() {
        return "ToastModel(id=" + this.id + ", type=" + this.type + ", content='" + this.content + "', confirmText=" + this.confirmText + ", duration=" + this.duration + ')';
    }

    public final void setConfirmText(String str) {
        this.confirmText = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setDuration(Long l) {
        this.duration = l;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }
}
