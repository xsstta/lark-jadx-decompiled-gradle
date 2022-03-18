package com.ss.android.lark.moments.impl.feed;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J0\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016J*\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u001e\u0010\u001e\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\t\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH\u0016¨\u0006%"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "", "createPost", "", "getTouchY", "", "onChangeBackgroundClick", "url", "", "imageView", "Landroid/view/View;", "onClickFollowersLayout", "onClickFollowingsLayout", "onClickHashTag", "id", "content", "postId", "onClickPrivateChat", "context", "Landroid/content/Context;", "commentId", "anonymousName", "onForwardClicked", "contentText", "totalShareCount", "", "categoryId", "onItemCellClicked", "onItemCellLongClicked", "onNoContentItemClicked", "onPreviewBackgroundClick", "photoList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "Landroid/widget/ImageView;", "onReplyClicked", "onReportClick", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.a */
public interface IMomentClickListener {
    /* renamed from: a */
    float mo166614a();

    /* renamed from: a */
    void mo166615a(Context context, String str, String str2, String str3);

    /* renamed from: a */
    void mo166616a(String str);

    /* renamed from: a */
    void mo166617a(String str, View view);

    /* renamed from: a */
    void mo166618a(String str, String str2);

    /* renamed from: a */
    void mo166619a(String str, String str2, int i, String str3);

    /* renamed from: a */
    void mo166620a(String str, String str2, String str3);

    /* renamed from: a */
    void mo166621a(ArrayList<PhotoItem> arrayList, ImageView imageView);

    /* renamed from: b */
    void mo166622b();

    /* renamed from: b */
    void mo166623b(String str, String str2);

    /* renamed from: c */
    void mo166624c();

    /* renamed from: c */
    void mo166625c(String str, String str2);

    /* renamed from: d */
    void mo166626d();

    /* renamed from: e */
    void mo166627e();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.a$a */
    public static final class C47490a {
        /* renamed from: a */
        public static void m188213a(IMomentClickListener aVar) {
        }

        /* renamed from: a */
        public static void m188214a(IMomentClickListener aVar, Context context, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str3, "anonymousName");
        }

        /* renamed from: a */
        public static void m188216a(IMomentClickListener aVar, String str, View view) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(view, "imageView");
        }

        /* renamed from: a */
        public static void m188217a(IMomentClickListener aVar, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
        }

        /* renamed from: a */
        public static void m188218a(IMomentClickListener aVar, ArrayList<PhotoItem> arrayList, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(arrayList, "photoList");
            Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        }

        /* renamed from: b */
        public static void m188219b(IMomentClickListener aVar) {
        }

        /* renamed from: c */
        public static void m188220c(IMomentClickListener aVar) {
        }

        /* renamed from: d */
        public static void m188221d(IMomentClickListener aVar) {
        }

        /* renamed from: a */
        public static /* synthetic */ void m188215a(IMomentClickListener aVar, Context context, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                aVar.mo166615a(context, str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickPrivateChat");
        }
    }
}
