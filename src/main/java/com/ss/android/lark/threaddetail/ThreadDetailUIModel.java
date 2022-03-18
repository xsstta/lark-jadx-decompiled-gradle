package com.ss.android.lark.threaddetail;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0007J\u001a\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\rR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/threaddetail/ThreadDetailUIModel;", "", "uiModelChangeListener", "Lcom/ss/android/lark/threaddetail/ThreadDetailUIModel$ItemModeChangeListener;", "(Lcom/ss/android/lark/threaddetail/ThreadDetailUIModel$ItemModeChangeListener;)V", "itemUIModels", "", "", "Lcom/ss/android/lark/threaddetail/ThreadDetailUIModel$ItemUIModel;", "getMaxHeightFactor", "", "messageId", "isEnableEllipsize", "", "setEnableEllipsize", "", "item", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "enable", "ItemModeChangeListener", "ItemUIModel", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threaddetail.g */
public final class ThreadDetailUIModel {

    /* renamed from: a */
    private Map<String, ItemUIModel> f137839a = new HashMap();

    /* renamed from: b */
    private final ItemModeChangeListener f137840b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/threaddetail/ThreadDetailUIModel$ItemModeChangeListener;", "", "onUIItemModelChange", "", "item", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threaddetail.g$a */
    public interface ItemModeChangeListener {
        void onUIItemModelChange(AbsMessageVO<?> aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/threaddetail/ThreadDetailUIModel$ItemUIModel;", "", "enableEllipsize", "", "maxHeightFactor", "", "(ZF)V", "getEnableEllipsize", "()Z", "setEnableEllipsize", "(Z)V", "getMaxHeightFactor", "()F", "setMaxHeightFactor", "(F)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threaddetail.g$b */
    public static final class ItemUIModel {

        /* renamed from: a */
        private boolean f137841a;

        /* renamed from: b */
        private float f137842b;

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
            return this.f137841a == bVar.f137841a && Float.compare(this.f137842b, bVar.f137842b) == 0;
        }

        public int hashCode() {
            boolean z = this.f137841a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return (i * 31) + Float.floatToIntBits(this.f137842b);
        }

        public String toString() {
            return "ItemUIModel(enableEllipsize=" + this.f137841a + ", maxHeightFactor=" + this.f137842b + ")";
        }

        /* renamed from: b */
        public final float mo190407b() {
            return this.f137842b;
        }

        /* renamed from: a */
        public final boolean mo190406a() {
            return this.f137841a;
        }

        /* renamed from: a */
        public final void mo190405a(boolean z) {
            this.f137841a = z;
        }

        public ItemUIModel(boolean z, float f) {
            this.f137841a = z;
            this.f137842b = f;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ItemUIModel(boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 0.9f : f);
        }
    }

    public ThreadDetailUIModel(ItemModeChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "uiModelChangeListener");
        this.f137840b = aVar;
    }

    /* renamed from: b */
    public final float mo190404b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        if (this.f137839a.get(str) == null) {
            this.f137839a.put(str, new ItemUIModel(false, BitmapDescriptorFactory.HUE_RED, 3, null));
        }
        ItemUIModel bVar = this.f137839a.get(str);
        if (bVar != null) {
            return bVar.mo190407b();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public final boolean mo190403a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        if (this.f137839a.get(str) == null) {
            this.f137839a.put(str, new ItemUIModel(false, BitmapDescriptorFactory.HUE_RED, 3, null));
        }
        ItemUIModel bVar = this.f137839a.get(str);
        if (bVar != null) {
            return bVar.mo190406a();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo190402a(AbsMessageVO<?> aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "item");
        ItemUIModel bVar = this.f137839a.get(((ChatMessageVO) aVar).mo121681a());
        if (bVar != null && bVar.mo190406a() != z) {
            bVar.mo190405a(z);
            this.f137840b.onUIItemModelChange(aVar);
        }
    }
}
