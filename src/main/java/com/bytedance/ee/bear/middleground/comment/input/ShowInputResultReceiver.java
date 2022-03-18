package com.bytedance.ee.bear.middleground.comment.input;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/input/ShowInputResultReceiver;", "Landroid/os/ResultReceiver;", "input", "Lcom/bytedance/ee/bear/middleground/comment/input/InputComment;", "(Lcom/bytedance/ee/bear/middleground/comment/input/InputComment;)V", "inputComment", "Ljava/lang/ref/WeakReference;", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
final class ShowInputResultReceiver extends ResultReceiver {

    /* renamed from: a */
    private final WeakReference<InputComment> f24893a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowInputResultReceiver(InputComment bVar) {
        super(new Handler());
        Intrinsics.checkParameterIsNotNull(bVar, "input");
        this.f24893a = new WeakReference<>(bVar);
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        InputComment bVar = this.f24893a.get();
        if (bVar != null) {
            bVar.mo35382d(true);
        }
    }
}
