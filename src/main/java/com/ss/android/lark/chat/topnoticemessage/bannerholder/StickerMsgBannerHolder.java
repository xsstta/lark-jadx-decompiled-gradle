package com.ss.android.lark.chat.topnoticemessage.bannerholder;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.topnoticemessage.message.entity.StickerTopNoticeMessage;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IStickerDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/StickerMsgBannerHolder;", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/MessageBannerViewHolder;", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/StickerTopNoticeMessage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "stickerLoader", "Lcom/ss/android/lark/dependency/IStickerDependency;", "kotlin.jvm.PlatformType", "layoutId", "", "icon", "", "imageView", "Landroid/widget/ImageView;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.b.d */
public final class StickerMsgBannerHolder extends MessageBannerViewHolder<StickerTopNoticeMessage> {

    /* renamed from: a */
    private final IStickerDependency f88624a;

    @Override // com.ss.android.lark.chat.topnoticemessage.bannerholder.MessageBannerViewHolder
    /* renamed from: a */
    public int mo126874a() {
        return R.layout.view_img_msg_banner;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerMsgBannerHolder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f88624a = b.mo134502A();
    }

    /* renamed from: a */
    public void mo126875a(StickerTopNoticeMessage eVar, ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(eVar, "$this$icon");
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        int dp2px = UIUtils.dp2px(mo126885d(), 40.0f);
        this.f88624a.mo134378a(mo126885d(), false, dp2px, dp2px, eVar.mo126904g(), imageView, R.drawable.common_chat_window_image_item_holder, R.drawable.common_failed_chat_picture);
    }
}
