package com.ss.android.lark.setting.page.content.common.impl.font.chat;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.setting.page.content.common.impl.font.chat.IChatFontSettingContract;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/ChatFontSettingView;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "mCurrentZoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "mDelegate", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView$Delegate;", "getMDelegate", "()Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView$Delegate;", "setMDelegate", "(Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView$Delegate;)V", "create", "", "destroy", "initChatterAvatar", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "initDefaultAvatar", "setViewDelegate", "viewDelegate", "updateView", "zoomLevel", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.d */
public final class ChatFontSettingView implements IChatFontSettingContract.IView {

    /* renamed from: b */
    public static final Companion f134136b = new Companion(null);

    /* renamed from: a */
    public IChatFontSettingContract.IView.Delegate f134137a;

    /* renamed from: c */
    private final ZoomLevel f134138c = LKUIDisplayManager.m91870a();

    /* renamed from: d */
    private final Context f134139d;

    /* renamed from: e */
    private final View f134140e;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/ChatFontSettingView$Companion;", "", "()V", "TAG", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        mo185450a(this.f134138c);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.font.chat.IChatFontSettingContract.IView
    /* renamed from: a */
    public void mo185449a() {
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) this.f134140e.findViewById(R.id.user_avatar);
        if (lKUIRoundedImageView2 != null) {
            lKUIRoundedImageView2.setImageResource(R.drawable.example_icon);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IChatFontSettingContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f134137a = aVar;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.font.chat.IChatFontSettingContract.IView
    /* renamed from: a */
    public void mo185451a(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) this.f134140e.findViewById(R.id.user_avatar);
        if (lKUIRoundedImageView2 != null) {
            int dp2px = UIHelper.dp2px(38.64f);
            ImageLoader.with(this.f134139d).load(AvatarImage.Builder.obtain(chatter.getAvatarKey(), chatter.getId(), dp2px, dp2px).build()).into(lKUIRoundedImageView2);
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.font.chat.IChatFontSettingContract.IView
    /* renamed from: a */
    public void mo185450a(ZoomLevel zoomLevel) {
        Intrinsics.checkParameterIsNotNull(zoomLevel, "zoomLevel");
        TextView textView = (TextView) this.f134140e.findViewById(R.id.chat_text_1);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.chat_text_1");
        C25649b.m91858a(textView, LarkFont.TITLE3, zoomLevel);
        TextView textView2 = (TextView) this.f134140e.findViewById(R.id.chat_text_2);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.chat_text_2");
        C25649b.m91858a(textView2, LarkFont.TITLE3, zoomLevel);
        TextView textView3 = (TextView) this.f134140e.findViewById(R.id.chat_text_3);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "mRootView.chat_text_3");
        C25649b.m91858a(textView3, LarkFont.TITLE3, zoomLevel);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) this.f134140e.findViewById(R.id.user_avatar);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "mRootView.user_avatar");
        C25649b.m91855a(lKUIRoundedImageView2, 28, zoomLevel);
        LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) this.f134140e.findViewById(R.id.image_2);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "mRootView.image_2");
        C25649b.m91855a(lKUIRoundedImageView22, 28, zoomLevel);
        ImageView imageView = (ImageView) this.f134140e.findViewById(R.id.image_3);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.image_3");
        C25649b.m91855a(imageView, 28, zoomLevel);
    }

    public ChatFontSettingView(Context context, View view) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        this.f134139d = context;
        this.f134140e = view;
    }
}
