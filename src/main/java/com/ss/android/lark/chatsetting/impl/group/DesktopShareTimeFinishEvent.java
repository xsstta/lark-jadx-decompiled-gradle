package com.ss.android.lark.chatsetting.impl.group;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.ss.android.eventbus.BaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/DesktopShareTimeFinishEvent;", "Lcom/ss/android/eventbus/BaseEvent;", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "(IILandroid/content/Intent;)V", "mData", "mRequestCode", "mResultCode", "getIntentData", "getRequestCode", "getResultCode", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.a */
public final class DesktopShareTimeFinishEvent extends BaseEvent {

    /* renamed from: a */
    private final int f89197a;

    /* renamed from: b */
    private final int f89198b;

    /* renamed from: c */
    private final Intent f89199c;

    /* renamed from: a */
    public final int mo127682a() {
        return this.f89197a;
    }

    /* renamed from: b */
    public final int mo127683b() {
        return this.f89198b;
    }

    /* renamed from: c */
    public final Intent mo127684c() {
        return this.f89199c;
    }

    public DesktopShareTimeFinishEvent(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f89197a = i;
        this.f89198b = i2;
        this.f89199c = intent;
    }
}
