package com.ss.android.vc.common.widget;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0014J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/common/widget/FullScreenDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "backHandlers", "", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/IBackPressedHandler;", "isHandlerEmpty", "", "onBackPressed", "", "onStart", "registerHandler", "handler", "unregisterHandler", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.a */
public final class FullScreenDialog extends Dialog {

    /* renamed from: a */
    private final List<AbstractC61214a> f152167a = new ArrayList();

    /* renamed from: a */
    public final boolean mo208575a() {
        return this.f152167a.isEmpty();
    }

    public void onBackPressed() {
        if (this.f152167a.isEmpty()) {
            super.onBackPressed();
            return;
        }
        List<AbstractC61214a> list = this.f152167a;
        list.get(list.size() - 1).bS_();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            Window window = getWindow();
            if (window == null) {
                Intrinsics.throwNpe();
            }
            window.setLayout(-1, -1);
        }
    }

    /* renamed from: a */
    public final void mo208574a(AbstractC61214a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        this.f152167a.add(aVar);
    }

    /* renamed from: b */
    public final void mo208576b(AbstractC61214a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        this.f152167a.remove(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullScreenDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
