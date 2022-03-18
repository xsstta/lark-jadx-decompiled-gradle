package com.bytedance.ee.bear.drive.biz.extra_info;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.util.ui.ColorUtils;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.larksuite.suite.R;

public class CommentInfoView extends FrameLayout {

    /* renamed from: a */
    private TextView f17767a;

    /* renamed from: b */
    private ImageView f17768b;

    /* renamed from: c */
    private int f17769c;

    public CommentInfoView(Context context) {
        super(context);
    }

    public void setContentAlpha(int i) {
        this.f17768b.setImageAlpha(i);
        this.f17767a.setTextColor(ColorUtils.m55696a(i, this.f17769c));
    }

    private void setNormalTextViewAttribute(TextView textView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(getResources().getDimensionPixelOffset(R.dimen.drive_comment_card_left_margin), getResources().getDimensionPixelOffset(R.dimen.drive_comment_card_normal_top_margin), getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero), getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero));
        textView.setLayoutParams(layoutParams);
        textView.setPadding(getResources().getDimensionPixelOffset(R.dimen.drive_comment_card_left_padding), getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero), getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero), getResources().getDimensionPixelOffset(R.dimen.drive_comment_card_bottom_padding));
    }

    private void setUnnormalTextViewAttribute(TextView textView) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 5;
        layoutParams.setMargins(getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero), getResources().getDimensionPixelOffset(R.dimen.drive_comment_card_unnormal_top_margin), getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero), getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero));
        textView.setLayoutParams(layoutParams);
        textView.setPadding(getResources().getDimensionPixelOffset(R.dimen.drive_comment_card_left_padding), getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero), getResources().getDimensionPixelOffset(R.dimen.drive_comment_textview_zero), getResources().getDimensionPixelOffset(R.dimen.drive_comment_card_bottom_padding));
    }

    public void setTvCommentCardText(int i) {
        if (i == m25820a(getResources(), (int) R.integer.drive_no_comment)) {
            this.f17768b.setImageResource(R.drawable.ud_icon_add_comment_outlined);
            this.f17767a.setVisibility(8);
            return;
        }
        this.f17768b.setImageResource(R.drawable.ud_icon_comment_number_a_outlined);
        this.f17767a.setVisibility(0);
        if (i <= m25820a(getResources(), (int) R.integer.drive_comment_max_count)) {
            setNormalTextViewAttribute(this.f17767a);
            this.f17767a.setText(String.format("%d", Integer.valueOf(i)));
            return;
        }
        setUnnormalTextViewAttribute(this.f17767a);
        this.f17767a.setText("99+");
    }

    public CommentInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25821a(context, attributeSet);
    }

    /* renamed from: a */
    private void m25821a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.drive_comment_card_view, this);
        this.f17767a = (TextView) findViewById(R.id.tv_comment_card);
        this.f17768b = (ImageView) findViewById(R.id.iv_comment_card);
        this.f17769c = getResources().getColor(R.color.text_title);
    }

    /* renamed from: a */
    public static int m25820a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    public CommentInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25821a(context, attributeSet);
    }
}
