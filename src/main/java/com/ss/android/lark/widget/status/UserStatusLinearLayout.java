package com.ss.android.lark.widget.status;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.span.C59170l;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import java.lang.ref.WeakReference;
import java.util.Map;

public class UserStatusLinearLayout extends LinearLayout {

    /* renamed from: a */
    private ImageView f146915a;

    /* renamed from: b */
    private UserStatusTextView f146916b;

    /* renamed from: c */
    private String f146917c;

    public String getUserStatus() {
        return this.f146917c;
    }

    public int getMaxLines() {
        return this.f146916b.getMaxLines();
    }

    /* renamed from: b */
    public void mo201157b() {
        int maxLines = getMaxLines();
        this.f146916b.setSingleLine(false);
        this.f146916b.setMaxLines(maxLines);
    }

    public int getMinimumWidth() {
        return Math.max(super.getMinimumWidth(), this.f146915a.getMeasuredWidth());
    }

    /* renamed from: a */
    public void mo201151a() {
        C25649b.m91857a(this.f146916b, LarkFont.CAPTION0);
        C25649b.m91853a(this.f146915a, 16);
        this.f146916b.setEmojiconSize(LKUIDisplayManager.m91881c(getContext(), 14));
    }

    /* renamed from: c */
    private void m229882c() {
        m229883d();
        this.f146915a = (ImageView) findViewById(R.id.iv_icon);
        UserStatusTextView userStatusTextView = (UserStatusTextView) findViewById(R.id.tv_desc);
        this.f146916b = userStatusTextView;
        userStatusTextView.setUrlTextColor(getResources().getColor(R.color.text_link_normal));
        this.f146916b.setPhoneTextColor(getResources().getColor(R.color.text_link_normal));
        this.f146917c = "";
        setTextSize(12);
    }

    /* renamed from: d */
    private void m229883d() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        addView(linearLayout, layoutParams);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R.id.iv_icon);
        imageView.setImageTintList(getContext().getResources().getColorStateList(R.color.icon_n3));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(UIUtils.dp2px(getContext(), 14.0f), UIUtils.dp2px(getContext(), 14.0f));
        layoutParams2.rightMargin = UIUtils.dp2px(getContext(), 4.0f);
        layoutParams2.topMargin = UIUtils.dp2px(getContext(), 1.0f);
        linearLayout.addView(imageView, layoutParams2);
        UserStatusTextView userStatusTextView = new UserStatusTextView(getContext());
        userStatusTextView.setId(R.id.tv_desc);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        userStatusTextView.setEllipsize(TextUtils.TruncateAt.END);
        userStatusTextView.setMaxLines(1);
        userStatusTextView.setSingleLine(true);
        userStatusTextView.setTextColor(UIUtils.getColor(getContext(), R.color.text_placeholder));
        linearLayout.addView(userStatusTextView, layoutParams3);
    }

    public UserStatusLinearLayout(Context context) {
        super(context);
        m229882c();
    }

    public void setIconVisibility(int i) {
        this.f146915a.setVisibility(i);
    }

    public void setMaxLines(int i) {
        this.f146916b.setMaxLines(i);
    }

    public void setNeedToRecognize(boolean z) {
        this.f146916b.setNeedToRecognize(z);
    }

    public void setOnPhoneClickListener(LinkEmojiTextView.AbstractC58524i iVar) {
        this.f146916b.setPhoneStringClickListener(iVar);
    }

    public void setOnURLClickListener(LinkEmojiTextView.AbstractC58525j jVar) {
        this.f146916b.setUrlStringClickListner(jVar);
    }

    public void setShowArrow(boolean z) {
        this.f146916b.setShowArrow(z);
    }

    public void setTextColor(int i) {
        this.f146916b.setTextColor(i);
    }

    public void setTextMaxWidth(int i) {
        this.f146916b.setMaxWidth(i);
    }

    public void setWidth(int i) {
        this.f146916b.setWidth(i);
    }

    public void setIconGravity(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f146915a.getLayoutParams();
        layoutParams.gravity = i;
        this.f146915a.setLayoutParams(layoutParams);
    }

    public void setRecognizeTextColor(int i) {
        this.f146916b.setPhoneTextColor(i);
        this.f146916b.setUrlTextColor(i);
    }

    public void setUrlOrPhoneColor(int i) {
        this.f146916b.setUrlTextColor(i);
        this.f146916b.setPhoneTextColor(i);
    }

    public void setTextSize(int i) {
        float f = (float) i;
        this.f146916b.setTextSize(f);
        this.f146916b.setEmojiconSize(UIHelper.dp2px(f));
        this.f146916b.setMinHeight(UIHelper.dp2px((float) (i + 2)));
    }

    /* renamed from: a */
    public void mo201153a(Drawable drawable) {
        this.f146915a.setImageDrawable(drawable);
        this.f146916b.mo198363a((RecogniseSpansResult) null, getContext().getString(R.string.Lark_Profile_EnterYourSignature), false);
        this.f146917c = "";
    }

    public UserStatusLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m229882c();
    }

    /* renamed from: a */
    public void mo201154a(String str, Drawable drawable) {
        this.f146915a.setImageDrawable(drawable);
        this.f146916b.mo198366a(str, (RecogniseSpansResult) null, false);
        this.f146917c = str;
    }

    /* renamed from: a */
    public void mo201155a(String str, String str2, Drawable drawable) {
        mo201156a(str, str2, drawable, true);
    }

    public UserStatusLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m229882c();
    }

    /* renamed from: b */
    public void mo201158b(int i, int i2, int i3, int i4) {
        mo201152a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public void mo201159c(int i, int i2, int i3, int i4) {
        ((LinearLayout.LayoutParams) this.f146916b.getLayoutParams()).setMargins(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo201152a(int i, int i2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f146915a.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        this.f146915a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo201156a(final String str, final String str2, Drawable drawable, final boolean z) {
        final WeakReference weakReference = new WeakReference(this.f146916b);
        C59170l a = C59170l.m229843a();
        RecogniseSpansResult a2 = a.mo201118a(str2 + str);
        if (TextUtils.isEmpty(str)) {
            this.f146916b.mo198367a(str, null, false, z, str2);
        } else if (a2 == null) {
            this.f146916b.mo198367a(str, null, false, z, str2);
            C37030f.m146093a().mo103025a(str, str2, false, new C37030f.AbstractC37031a() {
                /* class com.ss.android.lark.widget.status.UserStatusLinearLayout.C591891 */

                @Override // com.ss.android.lark.C37030f.AbstractC37031a
                /* renamed from: a */
                public void mo136555a(Map<String, RecogniseSpansResult> map) {
                    if (map != null && map.get(str2) != null) {
                        ((UserStatusTextView) weakReference.get()).mo198367a(str, map.get(str2), false, z, str2);
                    }
                }
            });
        } else {
            this.f146916b.mo198367a(str, a2, false, z, str2);
        }
        this.f146915a.setImageDrawable(drawable);
        this.f146917c = str;
    }
}
