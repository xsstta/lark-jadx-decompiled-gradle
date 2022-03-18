package com.ss.android.lark.chat.topnoticemessage.bannerholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/GeneralMsgBannerHolder;", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/MessageBannerViewHolder;", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "layoutId", "", "icon", "", "imageView", "Landroid/widget/ImageView;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.b.a */
public final class GeneralMsgBannerHolder extends MessageBannerViewHolder<ITopNoticeMessage<?>> {
    @Override // com.ss.android.lark.chat.topnoticemessage.bannerholder.MessageBannerViewHolder
    /* renamed from: a */
    public int mo126874a() {
        return R.layout.view_simple_msg_banner;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeneralMsgBannerHolder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.ss.android.lark.chat.topnoticemessage.bannerholder.MessageBannerViewHolder
    /* renamed from: a */
    public void mo126875a(ITopNoticeMessage<?> cVar, ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$icon");
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        int iconResId = cVar.mo126896b().getIconResId();
        int iconTintColorRes = cVar.mo126896b().getIconTintColorRes();
        Drawable drawable = ContextCompat.getDrawable(mo126885d(), iconResId);
        if (iconTintColorRes != 0) {
            int color = ContextCompat.getColor(mo126885d(), iconTintColorRes);
            if (drawable != null) {
                drawable.setTint(color);
            }
        }
        imageView.setImageDrawable(drawable);
    }
}
