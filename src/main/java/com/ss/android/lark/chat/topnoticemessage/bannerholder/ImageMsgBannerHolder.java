package com.ss.android.lark.chat.topnoticemessage.bannerholder;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMsgType;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ImageTopNoticeMessage;
import com.ss.android.lark.chat.utils.C34336c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0014\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/ImageMsgBannerHolder;", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/MessageBannerViewHolder;", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ImageTopNoticeMessage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "playIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "bindBanner", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "layoutId", "", "showPlayButtonIfNeed", "icon", "imageView", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.b.b */
public final class ImageMsgBannerHolder extends MessageBannerViewHolder<ImageTopNoticeMessage> {

    /* renamed from: a */
    public static final Companion f88613a = new Companion(null);

    /* renamed from: c */
    private final ImageView f88614c = ((ImageView) mo126884c().findViewById(R.id.cover));

    @Override // com.ss.android.lark.chat.topnoticemessage.bannerholder.MessageBannerViewHolder
    /* renamed from: a */
    public int mo126874a() {
        return R.layout.view_img_msg_banner;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/ImageMsgBannerHolder$Companion;", "", "()V", "IMAGE_SIZE", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageMsgBannerHolder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: b */
    private final void m133023b(ImageTopNoticeMessage dVar) {
        boolean z;
        ImageView imageView = this.f88614c;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "playIcon");
        ImageView imageView2 = imageView;
        int i = 0;
        if (dVar.mo126896b() == TopNoticeMsgType.VideoMessage) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        imageView2.setVisibility(i);
    }

    /* renamed from: a */
    public void mo126876a(ImageTopNoticeMessage dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo126876a((ITopNoticeMessage) dVar);
        m133023b(dVar);
    }

    /* renamed from: a */
    public void mo126875a(ImageTopNoticeMessage dVar, ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$icon");
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        int dp2px = UIUtils.dp2px(mo126885d(), 40.0f);
        GradientDrawable b = C34336c.m133131b(mo126885d(), dp2px, dp2px, 0);
        C34336c.m133127a(mo126885d(), imageView, dVar.mo126903g(), new LoadParams().mo105413a(dp2px).mo105422b(dp2px).mo105414a(b).mo105423b(C34336c.m133121a(mo126885d(), dp2px, dp2px, 0)));
    }
}
