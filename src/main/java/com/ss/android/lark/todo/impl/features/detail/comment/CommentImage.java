package com.ss.android.lark.todo.impl.features.detail.comment;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage;", "", "info", "", "infoType", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage$Companion$ImageInfoType;", "(Ljava/lang/String;Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage$Companion$ImageInfoType;)V", "getInfo", "()Ljava/lang/String;", "getInfoType", "()Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage$Companion$ImageInfoType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CommentImage {

    /* renamed from: a */
    public static final Companion f139719a = new Companion(null);

    /* renamed from: b */
    private final String f139720b;

    /* renamed from: c */
    private final Companion.ImageInfoType f139721c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentImage)) {
            return false;
        }
        CommentImage commentImage = (CommentImage) obj;
        return Intrinsics.areEqual(this.f139720b, commentImage.f139720b) && Intrinsics.areEqual(this.f139721c, commentImage.f139721c);
    }

    public int hashCode() {
        String str = this.f139720b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Companion.ImageInfoType imageInfoType = this.f139721c;
        if (imageInfoType != null) {
            i = imageInfoType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CommentImage(info=" + this.f139720b + ", infoType=" + this.f139721c + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage$Companion;", "", "()V", "ImageInfoType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage$Companion$ImageInfoType;", "", "(Ljava/lang/String;I)V", "PATH", "KEY", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        public enum ImageInfoType {
            PATH,
            KEY
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo192327a() {
        return this.f139720b;
    }

    /* renamed from: b */
    public final Companion.ImageInfoType mo192328b() {
        return this.f139721c;
    }

    public CommentImage(String str, Companion.ImageInfoType imageInfoType) {
        Intrinsics.checkParameterIsNotNull(str, "info");
        Intrinsics.checkParameterIsNotNull(imageInfoType, "infoType");
        this.f139720b = str;
        this.f139721c = imageInfoType;
    }
}
