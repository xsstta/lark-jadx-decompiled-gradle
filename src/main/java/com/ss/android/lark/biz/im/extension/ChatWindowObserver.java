package com.ss.android.lark.biz.im.extension;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010\u0012\u001a\u00020\u0013H\u0017J\b\u0010\u0014\u001a\u00020\u0013H\u0017J\b\u0010\u0015\u001a\u00020\u0013H\u0017J\b\u0010\u0016\u001a\u00020\u0013H\u0017J\b\u0010\u0017\u001a\u00020\u0013H\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/biz/im/extension/ChatWindowObserver;", "Landroidx/lifecycle/LifecycleObserver;", "tagName", "", "(Ljava/lang/String;)V", "isChatWindowAlive", "", "()Z", "setChatWindowAlive", "(Z)V", "getTagName", "()Ljava/lang/String;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onPause", "onResume", "onStart", "onStop", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class ChatWindowObserver implements LifecycleObserver {

    /* renamed from: a */
    private boolean f74302a;

    /* renamed from: b */
    private final String f74303b;

    /* renamed from: a */
    public final boolean mo106794a() {
        return this.f74302a;
    }

    /* renamed from: b */
    public final String mo106796b() {
        return this.f74303b;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        Log.m165379d(this.f74303b, "onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Log.m165379d(this.f74303b, "onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        Log.m165379d(this.f74303b, "onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        Log.m165379d(this.f74303b, "onStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.f74302a = true;
        Log.m165379d(this.f74303b, "onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        Log.m165379d(this.f74303b, "onDestroy");
        this.f74302a = false;
    }

    public ChatWindowObserver(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tagName");
        this.f74303b = str;
    }

    /* renamed from: a */
    public boolean mo106795a(int i, int i2, Intent intent) {
        Log.m165379d(this.f74303b, "onActivityResult");
        return false;
    }
}
