package com.ss.android.lark.contact.feat.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0016H\u0002J\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010#\u001a\u00020\u00162\b\b\u0001\u0010$\u001a\u00020\tJ\u000e\u0010#\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001cJ\u0010\u0010&\u001a\u00020\u00162\b\b\u0001\u0010'\u001a\u00020\tJ\u000e\u0010&\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001cJ\u000e\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/contact/feat/common/ContactSimpleItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionBtn", "Lcom/larksuite/component/ui/button/LKUIButton;", "actionBtnStatus", "Landroid/widget/TextView;", "avatarView", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "descView", "nameView", "splitLine", "Landroid/view/View;", "avatar", "", "avatarModel", "Lcom/larksuite/component/ui/avatar/AvatarModel;", "disableActionBtn", "disableResId", "disableBtnStr", "", "initViews", "setActionBtn", "btnResId", "clickListener", "Landroid/view/View$OnClickListener;", "btnStr", "setDesc", "descResId", "descStr", "setName", "nameResId", "name", "setSplitLine", "enable", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ContactSimpleItemView extends FrameLayout {

    /* renamed from: a */
    private LarkAvatarView f91569a;

    /* renamed from: b */
    private TextView f91570b;

    /* renamed from: c */
    private TextView f91571c;

    /* renamed from: d */
    private LKUIButton f91572d;

    /* renamed from: e */
    private TextView f91573e;

    /* renamed from: f */
    private View f91574f;

    /* renamed from: g */
    private HashMap f91575g;

    /* renamed from: b */
    public View mo130733b(int i) {
        if (this.f91575g == null) {
            this.f91575g = new HashMap();
        }
        View view = (View) this.f91575g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f91575g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m138547a() {
        LayoutInflater.from(getContext()).inflate(R.layout.contact_item_simple, (ViewGroup) this, true);
        LarkAvatarView larkAvatarView = (LarkAvatarView) mo130733b(R.id.avatar);
        Intrinsics.checkExpressionValueIsNotNull(larkAvatarView, "avatar");
        this.f91569a = larkAvatarView;
        TextView textView = (TextView) mo130733b(R.id.name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "name");
        this.f91570b = textView;
        TextView textView2 = (TextView) mo130733b(R.id.desc);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "desc");
        this.f91571c = textView2;
        LKUIButton lKUIButton = (LKUIButton) mo130733b(R.id.action_btn);
        Intrinsics.checkExpressionValueIsNotNull(lKUIButton, "action_btn");
        this.f91572d = lKUIButton;
        TextView textView3 = (TextView) mo130733b(R.id.action_btn_status);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "action_btn_status");
        this.f91573e = textView3;
        View b = mo130733b(R.id.split_line);
        Intrinsics.checkExpressionValueIsNotNull(b, "split_line");
        this.f91574f = b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactSimpleItemView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m138547a();
    }

    public final void setDesc(int i) {
        TextView textView = this.f91571c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descView");
        }
        textView.setText(i);
    }

    public final void setName(int i) {
        TextView textView = this.f91570b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameView");
        }
        textView.setText(i);
    }

    /* renamed from: a */
    public final void mo130730a(int i) {
        LKUIButton lKUIButton = this.f91572d;
        if (lKUIButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionBtn");
        }
        lKUIButton.setVisibility(8);
        TextView textView = this.f91573e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionBtnStatus");
        }
        textView.setVisibility(0);
        textView.setText(i);
    }

    public final void setDesc(String str) {
        Intrinsics.checkParameterIsNotNull(str, "descStr");
        TextView textView = this.f91571c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descView");
        }
        textView.setText(str);
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        TextView textView = this.f91570b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameView");
        }
        textView.setText(str);
    }

    public final void setSplitLine(boolean z) {
        int i;
        View view = this.f91574f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitLine");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo130732a(AvatarModel avatarModel) {
        Intrinsics.checkParameterIsNotNull(avatarModel, "avatarModel");
        LarkAvatarView larkAvatarView = this.f91569a;
        if (larkAvatarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        larkAvatarView.mo89076a(avatarModel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactSimpleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m138547a();
    }

    /* renamed from: a */
    public final void mo130731a(int i, View.OnClickListener onClickListener) {
        LKUIButton lKUIButton = this.f91572d;
        if (lKUIButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionBtn");
        }
        lKUIButton.setVisibility(0);
        lKUIButton.setText(i);
        lKUIButton.setOnClickListener(onClickListener);
        TextView textView = this.f91573e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionBtnStatus");
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactSimpleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m138547a();
    }
}
