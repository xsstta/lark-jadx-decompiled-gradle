package com.ss.android.lark.chat.preview.components;

import android.graphics.RectF;
import android.view.View;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.preview.components.view.VideoCoverView;
import com.ss.android.lark.chat.preview.entity.component.property.VideoProperty;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/VideoComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty;", "Lcom/ss/android/lark/chat/preview/components/view/VideoCoverView;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "props", "videoStyle", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "update", "", "view", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.q */
public final class VideoComponent extends RenderComponent<VideoProperty, VideoCoverView, Dependency> {

    /* renamed from: a */
    private final Style f88201a;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return false;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "com.ss.android.lark.chat.preview.components.view.VideoCoverView";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/preview/components/VideoComponent$update$1$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.q$a */
    public static final class C34108a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Action f88202a;

        /* renamed from: b */
        final /* synthetic */ VideoCoverView f88203b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f88202a.mo126248a(this.f88203b);
        }

        C34108a(Action aVar, VideoCoverView hVar) {
            this.f88202a = aVar;
            this.f88203b = hVar;
        }
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f = mo188730f();
        if (f != null) {
            return new VideoCoverView(f.mo188743a());
        }
        return super.mo126262a(rectF);
    }

    /* renamed from: a */
    public void mo126263a(VideoCoverView hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "view");
        super.mo126263a((View) hVar);
        Action l = mo188742l();
        if (l != null) {
            hVar.setOnClickListener(new C34108a(l, hVar));
        }
        hVar.mo126357a((VideoProperty) mo188739i(), this.f88201a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoComponent(VideoProperty videoProperty, Style style, Dependency aVar, Action<VideoCoverView> aVar2) {
        super(videoProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(videoProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f88201a = style;
    }
}
