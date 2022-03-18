package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u001cR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rRH\u0010\u000e\u001a<\u0012*\u0012( \u0014*\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u00130\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00150\u00150\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/UserInfoBubbleView;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/ViewCompanion;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avatarView", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "getAvatarView$im_chatsetting_release", "()Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "filterChatterName", "Lkotlin/reflect/KFunction1;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "Lkotlin/ParameterName;", "name", "chatter", "kotlin.jvm.PlatformType", "", "nameView", "Landroid/widget/TextView;", "getNameView$im_chatsetting_release", "()Landroid/widget/TextView;", "bindUerInfo", "", "bindUerInfo$im_chatsetting_release", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserInfoBubbleView extends LinearLayout implements ViewCompanion {

    /* renamed from: a */
    private final KFunction<String> f89790a;

    /* renamed from: b */
    private final LarkAvatarView f89791b;

    /* renamed from: c */
    private final TextView f89792c;

    public final LarkAvatarView getAvatarView$im_chatsetting_release() {
        return this.f89791b;
    }

    public final TextView getNameView$im_chatsetting_release() {
        return this.f89792c;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion
    public Context ay_() {
        return ViewCompanion.C34764a.m135160a(this);
    }

    /* renamed from: a */
    public int mo128333a(int i) {
        return ViewCompanion.C34764a.m135159a(this, i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion
    /* renamed from: b */
    public float mo128336b(int i) {
        return ViewCompanion.C34764a.m135161b(this, i);
    }

    /* renamed from: c */
    public int mo128337c(int i) {
        return ViewCompanion.C34764a.m135163c(this, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012,\u0010\u0003\u001a( \u0002*\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00070\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "p1", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "Lkotlin/ParameterName;", "name", "chatter", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.UserInfoBubbleView$a */
    static final /* synthetic */ class C34762a extends FunctionReference implements Function1<Chatter, String> {
        C34762a(AbstractC34461c.AbstractC34466e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "getChatterDisplayName";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(AbstractC34461c.AbstractC34466e.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "getChatterDisplayName(Lcom/ss/android/lark/chat/entity/chatter/Chatter;)Ljava/lang/String;";
        }

        public final String invoke(Chatter chatter) {
            return ((AbstractC34461c.AbstractC34466e) this.receiver).mo127364c(chatter);
        }
    }

    /* renamed from: a */
    public final void mo128334a(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        this.f89791b.mo89076a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88962a(chatter.getAvatarKey())).mo88967b(chatter.getId())).mo89081c(chatter.getId()).mo88963a(true)).mo88960a(Biz.Messenger)).mo88961a(Scene.Chat)).mo88976k());
        this.f89792c.setText((CharSequence) ((Function1) this.f89790a).invoke(chatter));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserInfoBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        this.f89790a = new C34762a(a.mo127274d());
        LarkAvatarView larkAvatarView = new LarkAvatarView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(mo128333a(20), mo128333a(20));
        larkAvatarView.setRadius(mo128336b(50));
        larkAvatarView.setLayoutParams(layoutParams);
        addView(larkAvatarView);
        this.f89791b = larkAvatarView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = mo128333a(4);
        layoutParams2.rightMargin = mo128333a(6);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(14.0f);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(mo128337c(R.color.text_title));
        addView(textView);
        this.f89792c = textView;
        setGravity(16);
        setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(mo128336b(50));
        gradientDrawable.setColor(ColorStateList.valueOf(mo128337c(R.color.ud_N900_10)));
        setBackground(gradientDrawable);
        int a2 = mo128333a(2);
        setPadding(a2, a2, a2, a2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserInfoBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
