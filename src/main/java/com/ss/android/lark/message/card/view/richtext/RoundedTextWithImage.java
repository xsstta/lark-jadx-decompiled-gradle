package com.ss.android.lark.message.card.view.richtext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class RoundedTextWithImage extends MsgCardRoundedYogaLayout {

    /* renamed from: c */
    private final Context f114822c;

    /* renamed from: d */
    private LinkEmojiTextView f114823d;

    /* renamed from: e */
    private YogaNode f114824e;

    /* renamed from: f */
    private C45347c f114825f;

    /* renamed from: g */
    private Drawable f114826g;

    /* renamed from: h */
    private Drawable f114827h;

    /* renamed from: i */
    private YogaNode f114828i;

    /* renamed from: j */
    private C45375h f114829j;

    /* renamed from: k */
    private int f114830k;

    /* renamed from: l */
    private boolean f114831l;

    /* renamed from: b */
    public void mo160143b() {
        LinkEmojiTextView linkEmojiTextView = this.f114823d;
        if (linkEmojiTextView != null) {
            removeView(linkEmojiTextView);
            this.f114823d = null;
            this.f114824e = null;
        }
    }

    public String getText() {
        return this.f114823d.getText().toString();
    }

    @Override // com.ss.android.lark.message.card.view.richtext.MsgCardRoundedYogaLayout
    /* renamed from: a */
    public void mo160124a() {
        this.f114825f.setImageDrawable(this.f114826g);
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 0, this.f114828i.getWidth().value / 2.0f, 0, this.f114828i.getHeight().value / 2.0f);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        this.f114825f.setAnimation(rotateAnimation);
    }

    public RoundedTextWithImage(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f114827h = drawable;
        this.f114825f.setImageDrawable(drawable);
    }

    public void setImgHeight(int i) {
        this.f114828i.setHeight((float) i);
    }

    public void setImgWidth(int i) {
        this.f114828i.setWidth((float) i);
    }

    public void setTextHeight(int i) {
        this.f114824e.setHeight((float) i);
    }

    public void setTextWidth(int i) {
        this.f114824e.setWidth((float) i);
    }

    /* renamed from: a */
    private void m180053a(Context context) {
        this.f114826g = UDIconUtils.getIconDrawable(this.f114822c, (int) R.drawable.ud_icon_loading_outlined, UDColorUtils.getColor(this.f114822c, R.color.primary_pri_500));
    }

    /* renamed from: b */
    private void m180054b(Context context) {
        m180055c(context);
        m180056d(context);
        m180053a(context);
        YogaNode yogaNode = getYogaNode();
        yogaNode.setFlexDirection(YogaFlexDirection.ROW);
        yogaNode.setAlignItems(YogaAlign.CENTER);
        yogaNode.setJustifyContent(YogaJustify.CENTER);
    }

    public void setZoomRule(C45375h hVar) {
        this.f114829j = hVar;
        if (hVar != null) {
            C25649b.m91860b(this.f114823d, 14);
        } else {
            this.f114823d.setTextSize(0, (float) UIUtils.dp2px(getContext(), 14.0f));
        }
    }

    /* renamed from: d */
    private void m180056d(Context context) {
        C45347c cVar = new C45347c(context);
        this.f114825f = cVar;
        addView(cVar);
        YogaNode yogaNodeForView = getYogaNodeForView(this.f114825f);
        this.f114828i = yogaNodeForView;
        yogaNodeForView.setWidth((float) this.f114791b);
        this.f114828i.setHeight((float) this.f114791b);
    }

    /* renamed from: c */
    private void m180055c(Context context) {
        MsgCardLinkEmojiTextView msgCardLinkEmojiTextView = new MsgCardLinkEmojiTextView(context);
        this.f114823d = msgCardLinkEmojiTextView;
        addView(msgCardLinkEmojiTextView);
        YogaNode yogaNodeForView = getYogaNodeForView(this.f114823d);
        this.f114824e = yogaNodeForView;
        yogaNodeForView.setWidth(BitmapDescriptorFactory.HUE_RED);
        this.f114824e.setFlexGrow(1.0f);
        this.f114824e.setMargin(YogaEdge.RIGHT, (float) UIUtils.dp2px(context, 12.0f));
        int d = C57582a.m223616d(context, R.color.text_placeholder);
        this.f114830k = d;
        this.f114823d.setTextColor(d);
        this.f114823d.setEllipsize(TextUtils.TruncateAt.END);
        this.f114823d.setSingleLine();
        this.f114823d.setTextSize(0, (float) UIUtils.dp2px(getContext(), 14.0f));
    }

    public RoundedTextWithImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedTextWithImage(Context context, boolean z) {
        this(context, (AttributeSet) null);
        this.f114831l = z;
    }

    /* renamed from: a */
    public void mo160142a(String str, Boolean bool) {
        this.f114823d.setText(str);
        int d = C57582a.m223616d(getContext(), R.color.text_disable);
        int d2 = C57582a.m223616d(getContext(), R.color.text_placeholder);
        if (bool.booleanValue()) {
            if (this.f114830k != d) {
                this.f114830k = d;
                this.f114823d.setTextColor(d);
            }
        } else if (this.f114830k != d2) {
            this.f114830k = d2;
            this.f114823d.setTextColor(d2);
        }
    }

    /* renamed from: b */
    public void mo160144b(String str, Boolean bool) {
        this.f114823d.setText(str);
        int d = C57582a.m223616d(getContext(), R.color.text_disable);
        int d2 = C57582a.m223616d(getContext(), R.color.text_title);
        if (bool.booleanValue()) {
            if (this.f114830k != d) {
                this.f114830k = d;
                this.f114823d.setTextColor(d);
            }
        } else if (this.f114830k != d2) {
            this.f114830k = d2;
            this.f114823d.setTextColor(d2);
        }
    }

    public RoundedTextWithImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114831l = true;
        this.f114822c = context;
        m180054b(context);
    }
}
