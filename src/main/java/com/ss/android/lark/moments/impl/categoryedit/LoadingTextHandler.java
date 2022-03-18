package com.ss.android.lark.moments.impl.categoryedit;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/LoadingTextHandler;", "Landroid/os/Handler;", "textView", "Landroid/widget/TextView;", "text", "", "(Landroid/widget/TextView;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "textViewRef", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categoryedit.d */
public final class LoadingTextHandler extends Handler {

    /* renamed from: a */
    private final WeakReference<TextView> f119235a;

    /* renamed from: b */
    private final String f119236b;

    public void handleMessage(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "msg");
        super.handleMessage(message);
        int i = message.what;
        String str = this.f119236b;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                str = str + '.';
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        TextView textView = this.f119235a.get();
        if (textView != null) {
            textView.setText(str);
        }
        sendEmptyMessageDelayed((i + 1) % 3, 500);
    }

    public LoadingTextHandler(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f119236b = str;
        this.f119235a = new WeakReference<>(textView);
    }
}
