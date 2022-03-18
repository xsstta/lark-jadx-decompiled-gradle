package com.ss.android.lark.mm.module.detail;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.mm.p2288b.C45850b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.utils.C47098d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDetailCommonDataProvider", "Lcom/ss/android/lark/mm/module/detail/IMmDetailCommonDataProvider;", "Landroid/content/Context;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.b */
public final class C45950b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/mm/module/detail/IMmDetailCommonDataProviderKt$toDetailCommonDataProvider$1", "Lcom/ss/android/lark/mm/module/detail/IMmDetailCommonDataProvider;", "getBottomPanelY", "", "getFromSource", "", "getHost", "getMmHitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "getTabPositionY", "getToken", "getUrl", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b$a */
    public static final class C45951a implements IMmDetailCommonDataProvider {
        @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
        /* renamed from: a */
        public String mo161315a() {
            return "";
        }

        @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
        public String bc_() {
            return "";
        }

        @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
        /* renamed from: c */
        public String mo161319c() {
            return "";
        }

        @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
        /* renamed from: d */
        public String mo161321d() {
            return "";
        }

        @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
        /* renamed from: e */
        public C47084f mo161231e() {
            return null;
        }

        @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
        /* renamed from: f */
        public int mo161322f() {
            return 0;
        }

        @Override // com.ss.android.lark.mm.module.detail.IMmDetailCommonDataProvider
        /* renamed from: g */
        public int mo161323g() {
            return 0;
        }

        C45951a() {
        }
    }

    /* renamed from: a */
    public static final IMmDetailCommonDataProvider m182104a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$toDetailCommonDataProvider");
        Activity a = C47098d.m186533a(context);
        if (a instanceof IMmDetailCommonDataProvider) {
            return (IMmDetailCommonDataProvider) a;
        }
        if (!C45850b.m181645a()) {
            C45855f.m181666e("MmHitPointContextProvider", "context is not MmHitPointContextProvider");
            return new C45951a();
        }
        throw new IllegalStateException("context is not MmHitPointContextProvider");
    }
}
