package com.ss.android.lark.chat.chatwindow.chat.banner.component;

import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.chat.topnoticemessage.banner.TopNoticeBannerController;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0010\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/banner/component/TopNoticeMessageBanner;", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/BaseBanner;", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "builder", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/component/TopNoticeMessageBanner$Builder;", "(Lcom/ss/android/lark/chat/chatwindow/chat/banner/component/TopNoticeMessageBanner$Builder;)V", "controller", "Lcom/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController;", "createBanner", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getLayoutId", "", "getType", "updateBanner", "Builder", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.b */
public final class TopNoticeMessageBanner extends AbstractC33152a<ITopNoticeMessage<?>> {

    /* renamed from: h */
    public static final Companion f85377h = new Companion(null);

    /* renamed from: i */
    private TopNoticeBannerController f85378i;

    /* renamed from: j */
    private final Builder f85379j;

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a, com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: f */
    public int mo122352f() {
        return R.layout.view_chat_message_banner_wrapper;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: i */
    public int mo122363i() {
        return SmActions.ACTION_ONTHECALL_EXIT;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/banner/component/TopNoticeMessageBanner$Builder;", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/BaseBanner$Builder;", "()V", "bannerClickHandler", "Lcom/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController$BannerClickHandler;", "getBannerClickHandler", "()Lcom/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController$BannerClickHandler;", "setBannerClickHandler", "(Lcom/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController$BannerClickHandler;)V", "clickHandler", "build", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/component/TopNoticeMessageBanner;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.b$a */
    public static final class Builder extends AbstractC33152a.AbstractC33153a {

        /* renamed from: e */
        private TopNoticeBannerController.BannerClickHandler f85380e;

        /* renamed from: b */
        public final TopNoticeBannerController.BannerClickHandler mo122388b() {
            return this.f85380e;
        }

        /* renamed from: c */
        public TopNoticeMessageBanner mo122358a() {
            return new TopNoticeMessageBanner(this);
        }

        /* renamed from: a */
        public final Builder mo122387a(TopNoticeBannerController.BannerClickHandler aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "clickHandler");
            Builder aVar2 = this;
            aVar2.f85380e = aVar;
            return aVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/banner/component/TopNoticeMessageBanner$Companion;", "", "()V", "newBuilder", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/component/TopNoticeMessageBanner$Builder;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.b$b */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Builder mo122390a() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopNoticeMessageBanner(Builder aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f85379j = aVar;
    }

    /* renamed from: a */
    public void mo122361a(ITopNoticeMessage<?> cVar) {
        TopNoticeBannerController bVar = this.f85378i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controller");
        }
        bVar.mo126854a(cVar);
    }

    /* renamed from: a */
    public void mo122345a(View view, ITopNoticeMessage<?> cVar) {
        super.mo122345a(view, (AbstractC33155c) cVar);
        if (view != null) {
            TopNoticeBannerController bVar = new TopNoticeBannerController((ViewGroup) view);
            bVar.mo126853a(this.f85379j.mo122388b());
            this.f85378i = bVar;
            mo122361a(cVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
