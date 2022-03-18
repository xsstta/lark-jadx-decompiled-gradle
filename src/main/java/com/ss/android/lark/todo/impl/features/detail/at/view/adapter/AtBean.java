package com.ss.android.lark.todo.impl.features.detail.at.view.adapter;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\u00020\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;", "", ShareHitPoint.f121868c, "", "(I)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSource", "()I", ShareHitPoint.f121869d, "getType", "setType", "Source", "Type", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class AtBean {

    /* renamed from: a */
    private final int f139669a;

    @Target({ElementType.TYPE, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean$Source;", "", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface Source {
        public static final Companion Companion = Companion.f139670a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean$Source$Companion;", "", "()V", "CHAT_MEMBER", "", "OUT_CHAT", "RECOMMEND", "SEARCH", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean$Source$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f139670a = new Companion();

            private Companion() {
            }
        }
    }

    @Target({ElementType.TYPE, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean$Type;", "", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface Type {
        public static final Companion Companion = Companion.f139671a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean$Type$Companion;", "", "()V", "DATA", "", "LABEL", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean$Type$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f139671a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: a */
    public abstract String mo192272a();

    /* renamed from: b */
    public abstract int mo192273b();

    /* renamed from: c */
    public final int mo192274c() {
        return this.f139669a;
    }

    public AtBean(int i) {
        this.f139669a = i;
    }
}
