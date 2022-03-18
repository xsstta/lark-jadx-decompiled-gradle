package com.ss.android.lark.chat.preview.components.view;

import android.view.View;
import com.ss.android.lark.chat.preview.components.view.CenterSpaceRemoteImageSpan;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/RemoteImageLoadListener;", "Lcom/ss/android/lark/chat/preview/components/view/CenterSpaceRemoteImageSpan$OnImageReadyListener;", "refs", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "(Ljava/lang/ref/WeakReference;)V", "onImageReady", "", "onLoadFailed", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.view.b */
public final class RemoteImageLoadListener implements CenterSpaceRemoteImageSpan.OnImageReadyListener {

    /* renamed from: a */
    private final WeakReference<View> f88246a;

    @Override // com.ss.android.lark.chat.preview.components.view.CenterSpaceRemoteImageSpan.OnImageReadyListener
    /* renamed from: a */
    public void mo126341a() {
        View view;
        WeakReference<View> weakReference = this.f88246a;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.postInvalidate();
        }
    }

    @Override // com.ss.android.lark.chat.preview.components.view.CenterSpaceRemoteImageSpan.OnImageReadyListener
    /* renamed from: b */
    public void mo126342b() {
        View view;
        WeakReference<View> weakReference = this.f88246a;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.postInvalidate();
        }
    }

    public RemoteImageLoadListener(WeakReference<View> weakReference) {
        Intrinsics.checkParameterIsNotNull(weakReference, "refs");
        this.f88246a = weakReference;
    }
}
