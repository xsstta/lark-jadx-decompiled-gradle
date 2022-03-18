package com.ss.android.lark.setting.page.content.general.feedfilter.viewmodel;

import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.Uninitialized;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "Lcom/larksuite/arch/jack/State;", "feedFilterInfo", "Lcom/larksuite/arch/jack/Async;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "updateSetting", "", "updateMuteSetting", "updateAtFeedSetting", "(Lcom/larksuite/arch/jack/Async;Lcom/larksuite/arch/jack/Async;Lcom/larksuite/arch/jack/Async;Lcom/larksuite/arch/jack/Async;)V", "getFeedFilterInfo", "()Lcom/larksuite/arch/jack/Async;", "getUpdateAtFeedSetting", "getUpdateMuteSetting", "getUpdateSetting", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.a */
public final class FeedFilterSettingState implements State {

    /* renamed from: a */
    private final Async<FeedFilterTabInfo> f134764a;

    /* renamed from: b */
    private final Async<Long> f134765b;

    /* renamed from: c */
    private final Async<Long> f134766c;

    /* renamed from: d */
    private final Async<Long> f134767d;

    public FeedFilterSettingState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.setting.page.content.general.feedfilter.d.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ FeedFilterSettingState m211487a(FeedFilterSettingState aVar, Async aVar2, Async aVar3, Async aVar4, Async aVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar2 = aVar.f134764a;
        }
        if ((i & 2) != 0) {
            aVar3 = aVar.f134765b;
        }
        if ((i & 4) != 0) {
            aVar4 = aVar.f134766c;
        }
        if ((i & 8) != 0) {
            aVar5 = aVar.f134767d;
        }
        return aVar.mo186273a(aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: a */
    public final FeedFilterSettingState mo186273a(Async<FeedFilterTabInfo> aVar, Async<Long> aVar2, Async<Long> aVar3, Async<Long> aVar4) {
        Intrinsics.checkParameterIsNotNull(aVar, "feedFilterInfo");
        Intrinsics.checkParameterIsNotNull(aVar2, "updateSetting");
        Intrinsics.checkParameterIsNotNull(aVar3, "updateMuteSetting");
        Intrinsics.checkParameterIsNotNull(aVar4, "updateAtFeedSetting");
        return new FeedFilterSettingState(aVar, aVar2, aVar3, aVar4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedFilterSettingState)) {
            return false;
        }
        FeedFilterSettingState aVar = (FeedFilterSettingState) obj;
        return Intrinsics.areEqual(this.f134764a, aVar.f134764a) && Intrinsics.areEqual(this.f134765b, aVar.f134765b) && Intrinsics.areEqual(this.f134766c, aVar.f134766c) && Intrinsics.areEqual(this.f134767d, aVar.f134767d);
    }

    public int hashCode() {
        Async<FeedFilterTabInfo> aVar = this.f134764a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Async<Long> aVar2 = this.f134765b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        Async<Long> aVar3 = this.f134766c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        Async<Long> aVar4 = this.f134767d;
        if (aVar4 != null) {
            i = aVar4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "FeedFilterSettingState(feedFilterInfo=" + this.f134764a + ", updateSetting=" + this.f134765b + ", updateMuteSetting=" + this.f134766c + ", updateAtFeedSetting=" + this.f134767d + ")";
    }

    /* renamed from: a */
    public final Async<FeedFilterTabInfo> mo186272a() {
        return this.f134764a;
    }

    /* renamed from: b */
    public final Async<Long> mo186274b() {
        return this.f134765b;
    }

    /* renamed from: c */
    public final Async<Long> mo186275c() {
        return this.f134766c;
    }

    /* renamed from: d */
    public final Async<Long> mo186276d() {
        return this.f134767d;
    }

    public FeedFilterSettingState(Async<FeedFilterTabInfo> aVar, Async<Long> aVar2, Async<Long> aVar3, Async<Long> aVar4) {
        Intrinsics.checkParameterIsNotNull(aVar, "feedFilterInfo");
        Intrinsics.checkParameterIsNotNull(aVar2, "updateSetting");
        Intrinsics.checkParameterIsNotNull(aVar3, "updateMuteSetting");
        Intrinsics.checkParameterIsNotNull(aVar4, "updateAtFeedSetting");
        this.f134764a = aVar;
        this.f134765b = aVar2;
        this.f134766c = aVar3;
        this.f134767d = aVar4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedFilterSettingState(Async aVar, Async aVar2, Async aVar3, Async aVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Uninitialized.f59411a : aVar, (i & 2) != 0 ? Uninitialized.f59411a : aVar2, (i & 4) != 0 ? Uninitialized.f59411a : aVar3, (i & 8) != 0 ? Uninitialized.f59411a : aVar4);
    }
}
