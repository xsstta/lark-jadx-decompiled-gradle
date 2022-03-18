package com.bytedance.ee.bear.drive.test.item;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.preload.C7115c;
import com.bytedance.ee.bear.drive.preload.VideoCacheInfo;
import com.bytedance.ee.bear.drive.test.p361b.AbstractC7206b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.component.ui.dialog.C25644o;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/test/item/DrivePreloadVideoTestItem;", "Lcom/bytedance/ee/bear/drive/test/recyclerview/TestItemInterface;", "()V", "getButtonName", "", "getOnItemClickListener", "Landroid/view/View$OnClickListener;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.test.a.a */
public final class DrivePreloadVideoTestItem implements AbstractC7206b {
    @Override // com.bytedance.ee.bear.drive.test.p361b.AbstractC7206b
    /* renamed from: a */
    public String mo28199a() {
        return "查看预加载视频";
    }

    @Override // com.bytedance.ee.bear.drive.test.p361b.AbstractC7206b
    /* renamed from: b */
    public View.OnClickListener mo28200b() {
        return View$OnClickListenerC7200a.f19321a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.test.a.a$a */
    static final class View$OnClickListenerC7200a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC7200a f19321a = new View$OnClickListenerC7200a();

        View$OnClickListenerC7200a() {
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            C7115c cVar = new C7115c();
            File[] listFiles = C6880a.m27109f(C13615c.f35773a).listFiles(C7201a.f19322a);
            if (listFiles != null) {
                for (File file : listFiles) {
                    VideoCacheInfo a = cVar.mo27842a(file);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            Context context = null;
            if (arrayList.isEmpty()) {
                if (view != null) {
                    context = view.getContext();
                }
                Toast.showText(context, "本地无视频缓存", 0);
                return;
            }
            ArrayList<VideoCacheInfo> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (VideoCacheInfo videoCacheInfo : arrayList2) {
                C7086a fileModel = videoCacheInfo.getFileModel();
                Intrinsics.checkExpressionValueIsNotNull(fileModel, "videoCacheInfo.fileModel");
                C7086a.C7087a x = fileModel.mo27322a();
                arrayList3.add(x != null ? x.mo27358a() : null);
            }
            List list = CollectionsKt.toList(arrayList3);
            if (view != null) {
                context = view.getContext();
            }
            C25644o oVar = new C25644o(context);
            List list2 = list;
            if (list2 != null) {
                Object[] array = list2.toArray(new String[0]);
                if (array != null) {
                    CharSequence[] charSequenceArr = (CharSequence[]) array;
                    ((C25644o) oVar.mo89206a((CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length))).mo89239c();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.test.a.a$a$a */
        static final class C7201a implements FilenameFilter {

            /* renamed from: a */
            public static final C7201a f19322a = new C7201a();

            C7201a() {
            }

            public final boolean accept(File file, String str) {
                Intrinsics.checkExpressionValueIsNotNull(str, "name");
                return StringsKt.endsWith$default(str, ".json", false, 2, (Object) null);
            }
        }
    }
}
