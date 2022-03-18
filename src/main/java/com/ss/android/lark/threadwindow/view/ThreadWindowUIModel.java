package com.ss.android.lark.threadwindow.view;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u0012\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0014R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel;", "", ShareHitPoint.f121869d, "", "uiModelChangeListener", "Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel$ItemModeChangeListener;", "(ILcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel$ItemModeChangeListener;)V", "itemUIModels", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel$ItemUIModel;", "Lkotlin/collections/HashMap;", "getMaxHeightFactor", "", "threadId", "initEllipsizeIfNeed", "", "threadMessageVO", "Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO;", "isEnableEllipsize", "", "setEnableEllipsize", "enable", "ItemModeChangeListener", "ItemUIModel", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadwindow.view.d */
public final class ThreadWindowUIModel {

    /* renamed from: a */
    private final HashMap<String, ItemUIModel> f138950a = new HashMap<>();

    /* renamed from: b */
    private final int f138951b;

    /* renamed from: c */
    private final ItemModeChangeListener f138952c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel$ItemModeChangeListener;", "", "onUIItemModelChange", "", ShareHitPoint.f121869d, "", "threadId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadwindow.view.d$a */
    public interface ItemModeChangeListener {
        /* renamed from: a */
        void mo191461a(int i, String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel$ItemUIModel;", "", "enableEllipsize", "", "maxHeightFactor", "", "(ZF)V", "getEnableEllipsize", "()Z", "setEnableEllipsize", "(Z)V", "getMaxHeightFactor", "()F", "setMaxHeightFactor", "(F)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadwindow.view.d$b */
    public static final class ItemUIModel {

        /* renamed from: a */
        private boolean f138953a;

        /* renamed from: b */
        private float f138954b;

        public ItemUIModel() {
            this(false, BitmapDescriptorFactory.HUE_RED, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemUIModel)) {
                return false;
            }
            ItemUIModel bVar = (ItemUIModel) obj;
            return this.f138953a == bVar.f138953a && Float.compare(this.f138954b, bVar.f138954b) == 0;
        }

        public int hashCode() {
            boolean z = this.f138953a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return (i * 31) + Float.floatToIntBits(this.f138954b);
        }

        public String toString() {
            return "ItemUIModel(enableEllipsize=" + this.f138953a + ", maxHeightFactor=" + this.f138954b + ")";
        }

        /* renamed from: b */
        public final float mo191497b() {
            return this.f138954b;
        }

        /* renamed from: a */
        public final boolean mo191496a() {
            return this.f138953a;
        }

        /* renamed from: a */
        public final void mo191495a(boolean z) {
            this.f138953a = z;
        }

        public ItemUIModel(boolean z, float f) {
            this.f138953a = z;
            this.f138954b = f;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ItemUIModel(boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 0.9f : f);
        }
    }

    /* renamed from: a */
    public final boolean mo191493a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        ItemUIModel bVar = this.f138950a.get(str);
        if (bVar != null) {
            return bVar.mo191496a();
        }
        return true;
    }

    /* renamed from: b */
    public final float mo191494b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        ItemUIModel bVar = this.f138950a.get(str);
        if (bVar != null) {
            return bVar.mo191497b();
        }
        return 0.9f;
    }

    public ThreadWindowUIModel(int i, ItemModeChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "uiModelChangeListener");
        this.f138951b = i;
        this.f138952c = aVar;
    }

    /* renamed from: a */
    public final void mo191492a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        ItemUIModel bVar = this.f138950a.get(str);
        if (bVar == null) {
            this.f138950a.put(str, new ItemUIModel(z, BitmapDescriptorFactory.HUE_RED, 2, null));
            this.f138952c.mo191461a(this.f138951b, str);
        } else if (bVar.mo191496a() != z) {
            bVar.mo191495a(z);
            this.f138952c.mo191461a(this.f138951b, str);
        }
    }
}
