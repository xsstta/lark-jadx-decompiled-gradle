package com.bytedance.ee.bear.drive.view.preview.wrapper;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.drive.config.C6920b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/wrapper/TitleBarViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "outlineActive", "Landroidx/lifecycle/MutableLiveData;", "", "getOutlineActive", "()Landroidx/lifecycle/MutableLiveData;", "outlineEnable", "getOutlineEnable", "dismissOutlineDialog", "", "hideOutlineMenu", "showOutlineDialog", "showOutlineMenu", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.h */
public final class TitleBarViewModel extends AbstractC1142af {
    private final C1177w<Boolean> outlineActive = new C1177w<>();
    private final C1177w<Boolean> outlineEnable = new C1177w<>();

    public final C1177w<Boolean> getOutlineActive() {
        return this.outlineActive;
    }

    public final C1177w<Boolean> getOutlineEnable() {
        return this.outlineEnable;
    }

    public final void dismissOutlineDialog() {
        this.outlineActive.mo5926a((Boolean) false);
    }

    public final void hideOutlineMenu() {
        this.outlineEnable.mo5926a((Boolean) false);
    }

    public final void showOutlineDialog() {
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        f.mo27166a().mo27900a();
        this.outlineActive.mo5926a((Boolean) true);
    }

    public final void showOutlineMenu() {
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        f.mo27166a().mo27928b();
        this.outlineEnable.mo5926a((Boolean) true);
    }
}
