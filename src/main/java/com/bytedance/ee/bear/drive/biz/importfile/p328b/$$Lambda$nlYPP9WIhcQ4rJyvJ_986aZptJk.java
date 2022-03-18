package com.bytedance.ee.bear.drive.biz.importfile.p328b;

import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.b.-$$Lambda$nlYPP9WIhcQ4rJyvJ_986aZptJk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nlYPP9WIhcQ4rJyvJ_986aZptJk implements Function {
    public static final /* synthetic */ $$Lambda$nlYPP9WIhcQ4rJyvJ_986aZptJk INSTANCE = new $$Lambda$nlYPP9WIhcQ4rJyvJ_986aZptJk();

    private /* synthetic */ $$Lambda$nlYPP9WIhcQ4rJyvJ_986aZptJk() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((IDocUserPermission) obj).canExport());
    }
}
