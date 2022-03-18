package com.ss.android.lark.oncall.util;

import android.content.Context;
import android.widget.ImageView;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/oncall/util/OnCallShowAvatarUtils;", "", "()V", "Companion", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.oncall.c.a */
public final class OnCallShowAvatarUtils {

    /* renamed from: a */
    public static final Companion f122439a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/oncall/util/OnCallShowAvatarUtils$Companion;", "", "()V", "showOnCallAvatarInImageView", "", "context", "Landroid/content/Context;", "onCallId", "", "avatarKey", "entityId", "imageView", "Landroid/widget/ImageView;", "imageWidth", "", "imageHeight", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.oncall.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo169928a(Context context, String str, String str2, String str3, ImageView imageView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "onCallId");
            Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
            Intrinsics.checkParameterIsNotNull(imageView, "imageView");
            float f = (float) i;
            float f2 = (float) i2;
            ImageLoader.with(context).load(AvatarImage.Builder.obtain(str2, str3, UIHelper.dp2px(f), UIHelper.dp2px(f2)).build()).override(UIHelper.dp2px(f), UIHelper.dp2px(f2)).into(imageView);
        }
    }
}
