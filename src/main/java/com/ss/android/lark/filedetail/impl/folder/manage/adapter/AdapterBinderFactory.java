package com.ss.android.lark.filedetail.impl.folder.manage.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder.GridFileInfoBinder;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder.ListFileInfoBinder;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\b0\u00060\u0004H\u0002J\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0005R5\u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\b0\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/AdapterBinderFactory;", "", "()V", "binderMap", "", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/IAdapterBinder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getBinderMap", "()Ljava/util/Map;", "binderMap$delegate", "Lkotlin/Lazy;", "generateBinderMap", "getBinder", ShareHitPoint.f121869d, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.a */
public final class AdapterBinderFactory {

    /* renamed from: a */
    private final Lazy f98173a = LazyKt.lazy(new C38268a(this));

    /* renamed from: b */
    private final Map<Integer, IAdapterBinder<FilePreviewInfo, ? extends RecyclerView.ViewHolder>> m150495b() {
        return (Map) this.f98173a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\b\u0001\u0012\u00020\u00050\u00030\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/IAdapterBinder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.a$a */
    static final class C38268a extends Lambda implements Function0<Map<Integer, ? extends IAdapterBinder<FilePreviewInfo, ? extends RecyclerView.ViewHolder>>> {
        final /* synthetic */ AdapterBinderFactory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38268a(AdapterBinderFactory aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.util.Map<java.lang.Integer, com.ss.android.lark.filedetail.impl.folder.manage.adapter.c<com.ss.android.lark.filedetail.impl.folder.manage.entity.a, ? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Map<Integer, ? extends IAdapterBinder<FilePreviewInfo, ? extends RecyclerView.ViewHolder>> invoke() {
            return this.this$0.mo139895a();
        }
    }

    /* renamed from: a */
    public final Map<Integer, IAdapterBinder<FilePreviewInfo, ? extends RecyclerView.ViewHolder>> mo139895a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, new GridFileInfoBinder());
        linkedHashMap.put(0, new ListFileInfoBinder());
        return linkedHashMap;
    }

    /* renamed from: a */
    public final IAdapterBinder<FilePreviewInfo, ? extends RecyclerView.ViewHolder> mo139894a(int i) {
        IAdapterBinder<FilePreviewInfo, ? extends RecyclerView.ViewHolder> cVar = m150495b().get(Integer.valueOf(i));
        if (cVar != null) {
            return cVar;
        }
        return new ListFileInfoBinder();
    }
}
