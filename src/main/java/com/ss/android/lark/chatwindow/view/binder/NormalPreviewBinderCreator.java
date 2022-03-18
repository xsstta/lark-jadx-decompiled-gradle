package com.ss.android.lark.chatwindow.view.binder;

import android.content.Context;
import android.view.View;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.ss.android.lark.chat.base.view.AbstractC32925a;
import com.ss.android.lark.chat.base.view.AbstractC32939b;
import com.ss.android.lark.chatwindow.view.preview.IFontExtraProvider;
import com.ss.android.lark.chatwindow.view.preview.NormalPreviewBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/binder/NormalPreviewBinderCreator;", "", "holder", "Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;", "provider", "Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "(Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;Landroid/view/View$OnLongClickListener;)V", "getHolder", "()Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;", "getOnLongClickListener", "()Landroid/view/View$OnLongClickListener;", "getProvider", "()Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;", "create", "Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder;", "context", "Landroid/content/Context;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.a.e */
public final class NormalPreviewBinderCreator {

    /* renamed from: a */
    private final AbstractC32939b f91051a;

    /* renamed from: b */
    private final AbstractC32925a f91052b;

    /* renamed from: c */
    private final View.OnLongClickListener f91053c;

    /* renamed from: a */
    public final AbstractC32939b mo129755a() {
        return this.f91051a;
    }

    /* renamed from: b */
    public final AbstractC32925a mo129757b() {
        return this.f91052b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chatwindow/view/binder/NormalPreviewBinderCreator$create$1", "Lcom/ss/android/lark/chatwindow/view/preview/NormalPreviewBinder$IDataProvider;", "isGroup", "", "isSelf", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.a.e$a */
    public static final class C35257a implements NormalPreviewBinder.IDataProvider {

        /* renamed from: a */
        final /* synthetic */ NormalPreviewBinderCreator f91054a;

        @Override // com.ss.android.lark.chatwindow.view.preview.NormalPreviewBinder.IDataProvider
        /* renamed from: a */
        public boolean mo129758a() {
            return this.f91054a.mo129757b().mo121569b();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.NormalPreviewBinder.IDataProvider
        /* renamed from: b */
        public boolean mo129759b() {
            return this.f91054a.mo129757b().mo121570c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35257a(NormalPreviewBinderCreator eVar) {
            this.f91054a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatwindow/view/binder/NormalPreviewBinderCreator$create$2", "Lcom/ss/android/lark/chatwindow/view/preview/IFontExtraProvider;", "descriptionFont", "Lcom/larksuite/component/ui/display/manager/LarkFont;", "iconSize", "", "titleFont", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.a.e$b */
    public static final class C35258b implements IFontExtraProvider {

        /* renamed from: a */
        final /* synthetic */ NormalPreviewBinderCreator f91055a;

        @Override // com.ss.android.lark.chatwindow.view.preview.IFontExtraProvider
        /* renamed from: a */
        public int mo129749a() {
            return this.f91055a.mo129755a().mo121631f();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.IFontExtraProvider
        /* renamed from: b */
        public LarkFont mo129750b() {
            LarkFont g = this.f91055a.mo129755a().mo121632g();
            Intrinsics.checkExpressionValueIsNotNull(g, "holder.titleFont()");
            return g;
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.IFontExtraProvider
        /* renamed from: c */
        public LarkFont mo129751c() {
            LarkFont h = this.f91055a.mo129755a().mo121633h();
            Intrinsics.checkExpressionValueIsNotNull(h, "holder.descriptionFont()");
            return h;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35258b(NormalPreviewBinderCreator eVar) {
            this.f91055a = eVar;
        }
    }

    /* renamed from: a */
    public final NormalPreviewBinder mo129756a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new NormalPreviewBinder(context, this.f91053c, new C35257a(this), new C35258b(this));
    }

    public NormalPreviewBinderCreator(AbstractC32939b bVar, AbstractC32925a aVar, View.OnLongClickListener onLongClickListener) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        this.f91051a = bVar;
        this.f91052b = aVar;
        this.f91053c = onLongClickListener;
    }
}
