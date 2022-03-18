package com.ss.android.lark.chat.topnoticemessage.banner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.topnoticemessage.bannerholder.MessageBannerViewHolder;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0017\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController;", "", "bannerView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bannerClickHandler", "Lcom/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController$BannerClickHandler;", "closeBtn", "Landroid/view/View;", "kotlin.jvm.PlatformType", "contentContainer", "factory", "Lcom/ss/android/lark/chat/topnoticemessage/banner/BannerHolderFactory;", "targetHolder", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/MessageBannerViewHolder;", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "topNoticeMessage", "bindMessage", "", "noticeMessage", "removeLastTargetViewIfNeed", "setBannerClickHandler", "clickHandler", "setStickyTopMessage", "BannerClickHandler", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.a.b */
public final class TopNoticeBannerController {

    /* renamed from: a */
    public BannerClickHandler f88595a;

    /* renamed from: b */
    private ITopNoticeMessage<?> f88596b;

    /* renamed from: c */
    private MessageBannerViewHolder<ITopNoticeMessage<?>> f88597c;

    /* renamed from: d */
    private final BannerHolderFactory f88598d;

    /* renamed from: e */
    private final ViewGroup f88599e;

    /* renamed from: f */
    private final View f88600f;

    /* renamed from: g */
    private final ViewGroup f88601g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController$BannerClickHandler;", "", "onBannerClose", "", "onMessageTopperClick", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onTopNoticeMsgClick", "noticeMessage", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.a.b$a */
    public interface BannerClickHandler {
        /* renamed from: a */
        void mo122163a(Chatter chatter);

        /* renamed from: b */
        void mo122167b(ITopNoticeMessage<?> cVar);

        /* renamed from: d */
        void mo122169d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController$bindMessage$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.a.b$b */
    public static final class C34306b extends Lambda implements Function0<Unit> {
        final /* synthetic */ ITopNoticeMessage $noticeMessage$inlined;
        final /* synthetic */ TopNoticeBannerController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34306b(TopNoticeBannerController bVar, ITopNoticeMessage cVar) {
            super(0);
            this.this$0 = bVar;
            this.$noticeMessage$inlined = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            BannerClickHandler aVar = this.this$0.f88595a;
            if (aVar != null) {
                aVar.mo122163a(this.$noticeMessage$inlined.mo126895a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController$bindMessage$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.a.b$c */
    public static final class C34307c extends Lambda implements Function0<Unit> {
        final /* synthetic */ ITopNoticeMessage $noticeMessage$inlined;
        final /* synthetic */ TopNoticeBannerController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34307c(TopNoticeBannerController bVar, ITopNoticeMessage cVar) {
            super(0);
            this.this$0 = bVar;
            this.$noticeMessage$inlined = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            BannerClickHandler aVar = this.this$0.f88595a;
            if (aVar != null) {
                aVar.mo122167b(this.$noticeMessage$inlined);
            }
        }
    }

    /* renamed from: a */
    private final void m132997a() {
        View c;
        boolean z;
        MessageBannerViewHolder<ITopNoticeMessage<?>> cVar = this.f88597c;
        if (cVar != null && (c = cVar.mo126884c()) != null) {
            ViewGroup viewGroup = this.f88599e;
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "contentContainer");
            if (viewGroup.indexOfChild(c) != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f88599e.removeView(c);
            }
        }
    }

    /* renamed from: a */
    public final void mo126853a(BannerClickHandler aVar) {
        this.f88595a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.a.b$d */
    public static final class View$OnClickListenerC34308d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TopNoticeBannerController f88603a;

        /* renamed from: b */
        final /* synthetic */ ITopNoticeMessage f88604b;

        View$OnClickListenerC34308d(TopNoticeBannerController bVar, ITopNoticeMessage cVar) {
            this.f88603a = bVar;
            this.f88604b = cVar;
        }

        public final void onClick(View view) {
            BannerClickHandler aVar = this.f88603a.f88595a;
            if (aVar != null) {
                aVar.mo122167b(this.f88604b);
            }
        }
    }

    public TopNoticeBannerController(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "bannerView");
        this.f88601g = viewGroup;
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "bannerView.context");
        this.f88598d = new BannerHolderFactory(context);
        this.f88599e = (ViewGroup) viewGroup.findViewById(R.id.container);
        View findViewById = viewGroup.findViewById(R.id.iv_close);
        this.f88600f = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.chat.topnoticemessage.banner.TopNoticeBannerController.View$OnClickListenerC343051 */

            /* renamed from: a */
            final /* synthetic */ TopNoticeBannerController f88602a;

            {
                this.f88602a = r1;
            }

            public final void onClick(View view) {
                BannerClickHandler aVar = this.f88602a.f88595a;
                if (aVar != null) {
                    aVar.mo122169d();
                }
            }
        });
    }

    /* renamed from: b */
    private final void m132998b(ITopNoticeMessage<?> cVar) {
        MessageBannerViewHolder<ITopNoticeMessage<?>> cVar2 = this.f88597c;
        if (cVar2 != null) {
            cVar2.mo126882b(new C34306b(this, cVar));
            cVar2.mo126879a(new C34307c(this, cVar));
            cVar2.mo126876a(cVar);
        }
        this.f88601g.setOnClickListener(new View$OnClickListenerC34308d(this, cVar));
    }

    /* renamed from: a */
    public final void mo126854a(ITopNoticeMessage<?> cVar) {
        if (cVar != null) {
            MessageBannerViewHolder<ITopNoticeMessage<?>> a = this.f88598d.mo126848a(cVar);
            if (!Intrinsics.areEqual(a, this.f88597c)) {
                m132997a();
                this.f88599e.addView(a.mo126884c());
                this.f88597c = a;
            }
            m132998b(cVar);
            this.f88596b = cVar;
        }
    }
}
