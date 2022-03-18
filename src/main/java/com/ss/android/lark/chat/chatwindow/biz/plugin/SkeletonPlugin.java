package com.ss.android.lark.chat.chatwindow.biz.plugin;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/SkeletonPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "darkStyle", "", "(Z)V", "getDarkStyle", "()Z", "mIsHide", "mKeyboardSkeletonRunnable", "Ljava/lang/Runnable;", "mKeyboardSkeletonShow", "mKeyboardViewSkeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "mTitleSkeletonShow", "mTitleViewSkeleton", "mTitlebarSkeletonRunnable", "hideSkeleton", "", "isNotShowSkeleton", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "showSkeleton", "isSecret", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.g */
public final class SkeletonPlugin extends BaseChatPlugin {

    /* renamed from: a */
    public C2057g f85194a;

    /* renamed from: b */
    public C2057g f85195b;

    /* renamed from: c */
    public boolean f85196c;

    /* renamed from: d */
    public boolean f85197d;

    /* renamed from: e */
    public boolean f85198e = m127903c();

    /* renamed from: f */
    public Runnable f85199f;

    /* renamed from: g */
    public Runnable f85200g;

    /* renamed from: h */
    private final boolean f85201h;

    /* renamed from: b */
    public final boolean mo122202b() {
        return this.f85201h;
    }

    /* renamed from: c */
    private final boolean m127903c() {
        return !UIUtils.canShowSkeleton();
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        m127904d();
    }

    /* renamed from: d */
    private final void m127904d() {
        Runnable runnable = this.f85200g;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
            this.f85200g = null;
        }
        Runnable runnable2 = this.f85199f;
        if (runnable2 != null) {
            UICallbackExecutor.removeCallbacks(runnable2);
            this.f85199f = null;
        }
        if (this.f85197d) {
            C2057g gVar = this.f85195b;
            if (gVar != null) {
                gVar.mo10130b();
            }
            this.f85197d = false;
        }
        if (this.f85196c) {
            C2057g gVar2 = this.f85194a;
            if (gVar2 != null) {
                gVar2.mo10130b();
            }
            this.f85196c = false;
        }
        this.f85198e = true;
    }

    public SkeletonPlugin(boolean z) {
        this.f85201h = z;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        m127904d();
    }

    /* renamed from: a */
    public final void mo122201a(IChatWindowApp dVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
        cVar.getLifecycle().addObserver(new SkeletonPlugin$showSkeleton$1(this, cVar));
        ITitlebarComponent bVar = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
        bVar.getLifecycle().addObserver(new SkeletonPlugin$showSkeleton$2(this, bVar, z));
    }
}
