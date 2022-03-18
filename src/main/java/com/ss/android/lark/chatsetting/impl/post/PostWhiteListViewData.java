package com.ss.android.lark.chatsetting.impl.post;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "", ShareHitPoint.f121869d, "", "avatar", "", BottomDialog.f17198f, "(ILjava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getChatterId", "getType", "()I", "compareTo", "other", "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "toString", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.h */
public final class PostWhiteListViewData implements Comparable<PostWhiteListViewData> {

    /* renamed from: a */
    public static final Companion f90505a = new Companion(null);

    /* renamed from: b */
    private final int f90506b;

    /* renamed from: c */
    private final String f90507c;

    /* renamed from: d */
    private final String f90508d;

    public String toString() {
        return "PostWhiteListViewData(type=" + this.f90506b + ", avatar=" + this.f90507c + ", chatterId=" + this.f90508d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData$Companion;", "", "()V", "POST_BINDER_CHATTER", "", "POST_BINDER_EDIT", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo129172a() {
        return this.f90506b;
    }

    /* renamed from: b */
    public final String mo129174b() {
        return this.f90507c;
    }

    /* renamed from: c */
    public final String mo129175c() {
        return this.f90508d;
    }

    public int hashCode() {
        return (((this.f90506b * 31) + this.f90507c.hashCode()) * 31) + this.f90508d.hashCode();
    }

    /* renamed from: a */
    public int compareTo(PostWhiteListViewData hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "other");
        return this.f90508d.compareTo(hVar.f90508d);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            PostWhiteListViewData hVar = (PostWhiteListViewData) obj;
            if (this.f90506b == hVar.f90506b && !(!Intrinsics.areEqual(this.f90507c, hVar.f90507c)) && !(!Intrinsics.areEqual(this.f90508d, hVar.f90508d))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chatsetting.impl.post.PostWhiteListViewData");
    }

    public PostWhiteListViewData(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "avatar");
        Intrinsics.checkParameterIsNotNull(str2, BottomDialog.f17198f);
        this.f90506b = i;
        this.f90507c = str;
        this.f90508d = str2;
    }
}
