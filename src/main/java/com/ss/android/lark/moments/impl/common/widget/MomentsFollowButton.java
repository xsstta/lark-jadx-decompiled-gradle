package com.ss.android.lark.moments.impl.common.widget;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\u000f\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/MomentsFollowButton;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mode", "Lcom/ss/android/lark/moments/impl/common/widget/MomentsFollowButton$ButtonMode;", "getFollowButtonMaxWidth", "updateInfo", "", "isFollowed", "", "isOngoing", "updateMode", "ButtonMode", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsFollowButton extends LinearLayout {

    /* renamed from: a */
    private ButtonMode f119265a;

    /* renamed from: b */
    private HashMap f119266b;

    /* renamed from: a */
    public View mo166232a(int i) {
        if (this.f119266b == null) {
            this.f119266b = new HashMap();
        }
        View view = (View) this.f119266b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119266b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/MomentsFollowButton$ButtonMode;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;II)V", "getType", "()I", "UNFOLLOW", "FOLLOWING", "FOLLOWED", "UNFOLLOWING", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ButtonMode {
        UNFOLLOW(0),
        FOLLOWING(1),
        FOLLOWED(2),
        UNFOLLOWING(3);
        
        private final int type;

        public final int getType() {
            return this.type;
        }

        private ButtonMode(int i) {
            this.type = i;
        }
    }

    public final int getFollowButtonMaxWidth() {
        int dp2px = UIHelper.dp2px(70.0f);
        TextView textView = (TextView) mo166232a(R.id.follow_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "follow_text");
        TextPaint paint = textView.getPaint();
        String string = UIHelper.getString(R.string.Lark_Community_Attention);
        String string2 = UIHelper.getString(R.string.Lark_Community_Followed);
        if (string.length() <= string2.length()) {
            string = string2;
        }
        return Math.max(((int) paint.measureText(string)) + UIHelper.dp2px(32.0f), dp2px);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MomentsFollowButton(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m187264a(ButtonMode buttonMode) {
        int i = C47303d.f119310a[buttonMode.ordinal()];
        if (i == 1) {
            setBackgroundResource(R.drawable.moments_widget_bg_button_unfollow);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((ImageView) mo166232a(R.id.follow_plus_icon)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_add_outlined, UIHelper.getColor(R.color.primary_pri_500)));
            ImageView imageView = (ImageView) mo166232a(R.id.follow_plus_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "follow_plus_icon");
            imageView.setVisibility(0);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) mo166232a(R.id.follow_loading);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "follow_loading");
            lottieAnimationView.setVisibility(8);
            TextView textView = (TextView) mo166232a(R.id.follow_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "follow_text");
            ((TextView) mo166232a(R.id.follow_text)).setTextColor(textView.getResources().getColor(R.color.primary_pri_500));
            TextView textView2 = (TextView) mo166232a(R.id.follow_text);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "follow_text");
            textView2.setText(UIHelper.getString(R.string.Lark_Community_Attention));
            setClickable(true);
        } else if (i == 2) {
            setBackgroundResource(R.drawable.moments_widget_bg_button_unfollow);
            ImageView imageView2 = (ImageView) mo166232a(R.id.follow_plus_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "follow_plus_icon");
            imageView2.setVisibility(8);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo166232a(R.id.follow_loading);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView2, "follow_loading");
            lottieAnimationView2.setVisibility(0);
            TextView textView3 = (TextView) mo166232a(R.id.follow_text);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "follow_text");
            ((TextView) mo166232a(R.id.follow_text)).setTextColor(textView3.getResources().getColor(R.color.primary_pri_500));
            TextView textView4 = (TextView) mo166232a(R.id.follow_text);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "follow_text");
            textView4.setText(UIHelper.getString(R.string.Lark_Community_Attention));
            setClickable(false);
        } else if (i == 3) {
            setBackgroundResource(R.drawable.moments_widget_bg_button_followed);
            ImageView imageView3 = (ImageView) mo166232a(R.id.follow_plus_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "follow_plus_icon");
            imageView3.setVisibility(8);
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo166232a(R.id.follow_loading);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView3, "follow_loading");
            lottieAnimationView3.setVisibility(8);
            TextView textView5 = (TextView) mo166232a(R.id.follow_text);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "follow_text");
            ((TextView) mo166232a(R.id.follow_text)).setTextColor(textView5.getResources().getColor(R.color.text_title));
            TextView textView6 = (TextView) mo166232a(R.id.follow_text);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "follow_text");
            textView6.setText(UIHelper.getString(R.string.Lark_Community_Followed));
            setClickable(true);
        } else if (i == 4) {
            setBackgroundResource(R.drawable.moments_widget_bg_button_followed);
            ImageView imageView4 = (ImageView) mo166232a(R.id.follow_plus_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "follow_plus_icon");
            imageView4.setVisibility(8);
            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo166232a(R.id.follow_loading);
            Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView4, "follow_loading");
            lottieAnimationView4.setVisibility(0);
            TextView textView7 = (TextView) mo166232a(R.id.follow_text);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "follow_text");
            ((TextView) mo166232a(R.id.follow_text)).setTextColor(textView7.getResources().getColor(R.color.text_title));
            TextView textView8 = (TextView) mo166232a(R.id.follow_text);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "follow_text");
            textView8.setText(UIHelper.getString(R.string.Lark_Community_Followed));
            setClickable(false);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MomentsFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo166233a(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                m187264a(ButtonMode.UNFOLLOWING);
            } else {
                m187264a(ButtonMode.FOLLOWED);
            }
        } else if (z2) {
            m187264a(ButtonMode.FOLLOWING);
        } else {
            m187264a(ButtonMode.UNFOLLOW);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MomentsFollowButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsFollowButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f119265a = ButtonMode.UNFOLLOW;
        LayoutInflater.from(context).inflate(R.layout.moments_follow_button_item_view, (ViewGroup) this, true);
    }
}
