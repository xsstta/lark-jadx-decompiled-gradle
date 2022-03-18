package com.ss.android.lark.chatwindow.view.binder;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.chat.base.view.AbstractC32925a;
import com.ss.android.lark.chat.base.view.AbstractC32939b;
import com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/binder/DocPreviewBinderCreator;", "", "holder", "Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;", "provider", "Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "(Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;Landroid/view/View$OnLongClickListener;)V", "getHolder", "()Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;", "getOnLongClickListener", "()Landroid/view/View$OnLongClickListener;", "getProvider", "()Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;", "create", "Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder;", "context", "Landroid/content/Context;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.a.a */
public final class DocPreviewBinderCreator {

    /* renamed from: a */
    private final AbstractC32939b f91036a;

    /* renamed from: b */
    private final AbstractC32925a f91037b;

    /* renamed from: c */
    private final View.OnLongClickListener f91038c;

    /* renamed from: a */
    public final AbstractC32925a mo129731a() {
        return this.f91037b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/chatwindow/view/binder/DocPreviewBinderCreator$create$1", "Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder$IDataProvider;", "getChatAvatarKey", "", "getChatId", "getChatName", "getP2p2ChatterName", "getP2pChatterAvatarKey", "getP2pChatterId", "getSendId", "isCrossTenant", "", "isGroup", "isSelf", "isShowThumbBorder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.a.a$a */
    public static final class C35253a implements DocPreviewBinder.IDataProvider {

        /* renamed from: a */
        final /* synthetic */ DocPreviewBinderCreator f91039a;

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: k */
        public boolean mo129743k() {
            return false;
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: a */
        public String mo129733a() {
            return this.f91039a.mo129731a().mo121573f();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: b */
        public String mo129734b() {
            return this.f91039a.mo129731a().mo121568a();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: c */
        public String mo129735c() {
            return this.f91039a.mo129731a().mo121574g();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: d */
        public String mo129736d() {
            return this.f91039a.mo129731a().mo121575h();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: e */
        public String mo129737e() {
            return this.f91039a.mo129731a().mo121577j();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: f */
        public String mo129738f() {
            return this.f91039a.mo129731a().mo121576i();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: g */
        public String mo129739g() {
            return this.f91039a.mo129731a().mo121578k();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: h */
        public boolean mo129740h() {
            return this.f91039a.mo129731a().mo121579l();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: i */
        public boolean mo129741i() {
            return this.f91039a.mo129731a().mo121569b();
        }

        @Override // com.ss.android.lark.chatwindow.view.preview.DocPreviewBinder.IDataProvider
        /* renamed from: j */
        public boolean mo129742j() {
            return this.f91039a.mo129731a().mo121570c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35253a(DocPreviewBinderCreator aVar) {
            this.f91039a = aVar;
        }
    }

    /* renamed from: a */
    public final DocPreviewBinder mo129732a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new DocPreviewBinder(context, new C35253a(this), this.f91038c);
    }

    public DocPreviewBinderCreator(AbstractC32939b bVar, AbstractC32925a aVar, View.OnLongClickListener onLongClickListener) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        this.f91036a = bVar;
        this.f91037b = aVar;
        this.f91038c = onLongClickListener;
    }
}
