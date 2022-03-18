package com.ss.android.lark.todo.impl.features.common.urlpreview;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0004J#\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J+\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/urlpreview/UrlPreviewLoader;", "", "()V", "TAG_KEY", "", "cache", "Ljava/util/HashMap;", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "Lkotlin/collections/HashMap;", "getInCache", "id", "getPreviewEntityPair", "Lcom/bytedance/lark/pb/basic/v1/PreviewEntityPair;", "richContent", "(Lcom/bytedance/lark/pb/basic/v1/RichContent;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrlPreview", "view", "Landroid/view/View;", "cacheKey", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/basic/v1/RichContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrlPreviewInChat", "", "Lcom/ss/android/lark/widget/richtext/RichTextView;", "todoDetail", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "(Lcom/ss/android/lark/widget/richtext/RichTextView;Ljava/lang/String;Lcom/bytedance/lark/pb/basic/v1/TodoDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldLoadUrlPreview", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.d.a */
public final class UrlPreviewLoader {

    /* renamed from: a */
    public static final UrlPreviewLoader f139388a = new UrlPreviewLoader();

    /* renamed from: b */
    private static final HashMap<String, RichContent> f139389b = new HashMap<>();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H@"}, d2 = {"getPreviewEntityPair", "", "richContent", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "id", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/basic/v1/PreviewEntityPair;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader", mo239173f = "UrlPreviewLoader.kt", mo239174i = {0, 0, 0, 0, 0, 0}, mo239175l = {77}, mo239176m = "getPreviewEntityPair", mo239177n = {"this", "richContent", "id", "previewMap", "hangPointCount", "previewEntityCount"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.d.a$a */
    public static final class C56325a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UrlPreviewLoader this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56325a(UrlPreviewLoader aVar, Continuation cVar) {
            super(cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo191966a(null, null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH@"}, d2 = {"loadUrlPreview", "", "view", "Landroid/view/View;", "id", "", "cacheKey", "richContent", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "continuation", "Lkotlin/coroutines/Continuation;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader", mo239173f = "UrlPreviewLoader.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0}, mo239175l = {40}, mo239176m = "loadUrlPreview", mo239177n = {"this", "view", "id", "cacheKey", "richContent", "tag", "it"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.d.a$b */
    public static final class C56326b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UrlPreviewLoader this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56326b(UrlPreviewLoader aVar, Continuation cVar) {
            super(cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo191965a(null, null, null, null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH@"}, d2 = {"loadUrlPreviewInChat", "", "view", "Lcom/ss/android/lark/widget/richtext/RichTextView;", "id", "", "todoDetail", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader", mo239173f = "UrlPreviewLoader.kt", mo239174i = {0, 0, 0, 0, 0, 0}, mo239175l = {55}, mo239176m = "loadUrlPreviewInChat", mo239177n = {"this", "view", "id", "todoDetail", "tag", "it"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.d.a$c */
    public static final class C56327c extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UrlPreviewLoader this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56327c(UrlPreviewLoader aVar, Continuation cVar) {
            super(cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo191967a(null, null, null, this);
        }
    }

    private UrlPreviewLoader() {
    }

    /* renamed from: a */
    public final RichContent mo191964a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return f139389b.get(str);
    }

    /* renamed from: a */
    public final boolean mo191968a(RichContent richContent) {
        Collection<UrlPreviewHangPoint> values;
        Map<String, UrlPreviewEntity> map;
        boolean z = false;
        if (richContent == null) {
            return false;
        }
        Map<String, UrlPreviewHangPoint> map2 = richContent.url_preview_hang_points;
        ArrayList arrayList = null;
        Integer valueOf = map2 != null ? Integer.valueOf(map2.size()) : null;
        PreviewEntityPair previewEntityPair = richContent.url_preview_entities;
        Integer valueOf2 = (previewEntityPair == null || (map = previewEntityPair.preview_entity) == null) ? null : Integer.valueOf(map.size());
        if (!(!Intrinsics.areEqual(valueOf, valueOf2))) {
            return false;
        }
        Map<String, UrlPreviewHangPoint> map3 = richContent.url_preview_hang_points;
        if (!(map3 == null || (values = map3.values()) == null)) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : values) {
                if (!TextUtils.isEmpty(t.preview_id)) {
                    arrayList2.add(t);
                }
            }
            ArrayList<UrlPreviewHangPoint> arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (UrlPreviewHangPoint urlPreviewHangPoint : arrayList3) {
                arrayList4.add(urlPreviewHangPoint.preview_id);
            }
            arrayList = arrayList4;
        }
        ArrayList arrayList5 = arrayList;
        if (arrayList5 == null || arrayList5.isEmpty()) {
            z = true;
        }
        return !z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo191966a(com.bytedance.lark.pb.basic.v1.RichContent r11, java.lang.String r12, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.basic.v1.PreviewEntityPair> r13) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader.mo191966a(com.bytedance.lark.pb.basic.v1.RichContent, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo191967a(com.ss.android.lark.widget.richtext.RichTextView r9, java.lang.String r10, com.bytedance.lark.pb.basic.v1.TodoDetail r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader.mo191967a(com.ss.android.lark.widget.richtext.RichTextView, java.lang.String, com.bytedance.lark.pb.basic.v1.TodoDetail, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo191965a(android.view.View r9, java.lang.String r10, java.lang.String r11, com.bytedance.lark.pb.basic.v1.RichContent r12, kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.basic.v1.RichContent> r13) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader.mo191965a(android.view.View, java.lang.String, java.lang.String, com.bytedance.lark.pb.basic.v1.RichContent, kotlin.coroutines.c):java.lang.Object");
    }
}
