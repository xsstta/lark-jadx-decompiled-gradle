package com.bytedance.ee.android.file.picker.lib.receiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/receiver/CloseReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CloseReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final Companion f12466a = new Companion(null);

    /* renamed from: b */
    private final Activity f12467b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/receiver/CloseReceiver$Companion;", "", "()V", "closeAction", "", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.receiver.CloseReceiver$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CloseReceiver() {
        this(null);
    }

    public CloseReceiver(Activity activity) {
        this.f12467b = activity;
    }

    public void onReceive(Context context, Intent intent) {
        Activity activity = this.f12467b;
        if (activity != null) {
            activity.finish();
        }
    }
}
