package com.bytedance.ee.bear.middleground.comment.input;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.bytedance.ee.bear.middleground.comment.input.InputComment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/comment/input/InputComment$showKeyboardByEditText$1$1", "Landroid/os/ResultReceiver;", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class InputComment$showKeyboardByEditText$1$1 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ InputComment.RunnableC9257ah f24892a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InputComment$showKeyboardByEditText$1$1(InputComment.RunnableC9257ah ahVar, Handler handler) {
        super(handler);
        this.f24892a = ahVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        this.f24892a.f24943a.f24906a = true;
    }
}
