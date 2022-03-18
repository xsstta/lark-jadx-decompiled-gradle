package com.ss.android.lark.chatsetting.impl.chat_info_view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0002;<B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\u001a\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\u0012\u0010&\u001a\u00060'R\u00020\u00002\u0006\u0010!\u001a\u00020\"J\u001c\u0010(\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010)\u001a\u00060*R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0018\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0010H\u0002J8\u0010.\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001eH\u0002J(\u0010.\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u000e\u00105\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u001eJ\u000e\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001eJ\u000e\u00108\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u001eJ\u000e\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u001eR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_info_view/ChatInfoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avatarIv", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "avatarOnClickListener", "Landroid/view/View$OnClickListener;", "departmentTv", "Landroid/widget/TextView;", "describeTv", "editAvatarOnClickListener", "editBtn", "emailTv", "enableEditBtn", "", "titleTv", "disableView", "", "view", "Landroid/view/View;", "initAvatar", "avatarKey", "", "entityId", "initChatTag", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "initEditBtn", "initGroupChatInfo", "Lcom/ss/android/lark/chatsetting/impl/chat_info_view/ChatInfoView$GroupChatInfoIniter;", "initListeners", "initP2PChatInfo", "Lcom/ss/android/lark/chatsetting/impl/chat_info_view/ChatInfoView$P2PChatInfoIniter;", "initTv", "text", "textView", "initView", "userName", "department", "email", "chatName", "setAvatar", "key", "setDepartment", "setDescribe", "describe", "setEmail", "setTitle", "title", "GroupChatInfoIniter", "P2PChatInfoIniter", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatInfoView extends FrameLayout {

    /* renamed from: a */
    private final LKUIRoundedImageView2 f89113a;

    /* renamed from: b */
    private final LKUIRoundedImageView2 f89114b;

    /* renamed from: c */
    private final TextView f89115c;

    /* renamed from: d */
    private final TextView f89116d;

    /* renamed from: e */
    private final TextView f89117e;

    /* renamed from: f */
    private final TextView f89118f;

    /* renamed from: g */
    private HashMap f89119g;

    /* renamed from: a */
    public View mo127598a(int i) {
        if (this.f89119g == null) {
            this.f89119g = new HashMap();
        }
        View view = (View) this.f89119g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f89119g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setDepartment(String str) {
        Intrinsics.checkParameterIsNotNull(str, "department");
        m134092a(str, this.f89117e);
    }

    public final void setDescribe(String str) {
        Intrinsics.checkParameterIsNotNull(str, "describe");
        m134092a(str, this.f89117e);
    }

    public final void setEmail(String str) {
        Intrinsics.checkParameterIsNotNull(str, "email");
        m134092a(str, this.f89118f);
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        m134092a(str, this.f89115c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatInfoView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.view_chat_info, (ViewGroup) this, true);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo127598a(R.id.chat_avatar_iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "this.chat_avatar_iv");
        this.f89113a = lKUIRoundedImageView2;
        LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) mo127598a(R.id.edit_avatar_iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "this.edit_avatar_iv");
        this.f89114b = lKUIRoundedImageView22;
        TextView textView = (TextView) mo127598a(R.id.chat_title_iv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "this.chat_title_iv");
        this.f89115c = textView;
        TextView textView2 = (TextView) mo127598a(R.id.chat_describe_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "this.chat_describe_tv");
        this.f89116d = textView2;
        TextView textView3 = (TextView) mo127598a(R.id.chatter_department_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "this.chatter_department_tv");
        this.f89117e = textView3;
        TextView textView4 = (TextView) mo127598a(R.id.chatter_email_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "this.chatter_email_tv");
        this.f89118f = textView4;
        if (DesktopUtil.m144307b()) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* renamed from: a */
    private final void m134092a(String str, TextView textView) {
        String str2 = str;
        textView.setText(str2);
        if (StringsKt.isBlank(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(R.layout.view_chat_info, (ViewGroup) this, true);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo127598a(R.id.chat_avatar_iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "this.chat_avatar_iv");
        this.f89113a = lKUIRoundedImageView2;
        LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) mo127598a(R.id.edit_avatar_iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "this.edit_avatar_iv");
        this.f89114b = lKUIRoundedImageView22;
        TextView textView = (TextView) mo127598a(R.id.chat_title_iv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "this.chat_title_iv");
        this.f89115c = textView;
        TextView textView2 = (TextView) mo127598a(R.id.chat_describe_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "this.chat_describe_tv");
        this.f89116d = textView2;
        TextView textView3 = (TextView) mo127598a(R.id.chatter_department_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "this.chatter_department_tv");
        this.f89117e = textView3;
        TextView textView4 = (TextView) mo127598a(R.id.chatter_email_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "this.chatter_email_tv");
        this.f89118f = textView4;
        if (DesktopUtil.m144307b()) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(R.layout.view_chat_info, (ViewGroup) this, true);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo127598a(R.id.chat_avatar_iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "this.chat_avatar_iv");
        this.f89113a = lKUIRoundedImageView2;
        LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) mo127598a(R.id.edit_avatar_iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "this.edit_avatar_iv");
        this.f89114b = lKUIRoundedImageView22;
        TextView textView = (TextView) mo127598a(R.id.chat_title_iv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "this.chat_title_iv");
        this.f89115c = textView;
        TextView textView2 = (TextView) mo127598a(R.id.chat_describe_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "this.chat_describe_tv");
        this.f89116d = textView2;
        TextView textView3 = (TextView) mo127598a(R.id.chatter_department_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "this.chatter_department_tv");
        this.f89117e = textView3;
        TextView textView4 = (TextView) mo127598a(R.id.chatter_email_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "this.chatter_email_tv");
        this.f89118f = textView4;
        if (DesktopUtil.m144307b()) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }
}
