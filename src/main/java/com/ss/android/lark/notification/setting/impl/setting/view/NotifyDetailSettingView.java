package com.ss.android.lark.notification.setting.impl.setting.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.setting.impl.setting.view.SwitchButtonWithLoading;

public class NotifyDetailSettingView extends ConstraintLayout {

    /* renamed from: a */
    AbstractC48649a f122332a;

    /* renamed from: b */
    private final SwitchButtonWithLoading.AbstractC48656b f122333b = new SwitchButtonWithLoading.AbstractC48656b() {
        /* class com.ss.android.lark.notification.setting.impl.setting.view.NotifyDetailSettingView.C486481 */

        @Override // com.ss.android.lark.notification.setting.impl.setting.view.SwitchButtonWithLoading.AbstractC48656b
        /* renamed from: a */
        public void mo169818a(boolean z) {
            if (NotifyDetailSettingView.this.f122332a != null) {
                NotifyDetailSettingView.this.f122332a.mo169760a(z);
            }
            NotifyDetailSettingView.this.mo169829a(z);
        }
    };
    @BindView(7288)
    ConstraintLayout mNotifyDetailContainer;
    @BindView(7286)
    TextView mNotifyDetailLabel;
    @BindView(7287)
    SwitchButtonWithLoading mSwitcher;
    @BindView(7290)
    ImageView mTipImage;
    @BindView(7289)
    TextView mTipText;

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.NotifyDetailSettingView$a */
    public interface AbstractC48649a {
        /* renamed from: a */
        void mo169760a(boolean z);
    }

    /* renamed from: a */
    private void m191773a() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_notification_setting_notify_detail, this));
        this.mSwitcher.mo169838a(false);
        this.mSwitcher.setOnSwitchListener(this.f122333b);
        if (DesktopUtil.m144301a(getContext())) {
            findViewById(R.id.top_divider).setVisibility(8);
            findViewById(R.id.bottom_divider).setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mNotifyDetailContainer.getLayoutParams();
            marginLayoutParams.leftMargin = UIUtils.dp2px(getContext(), 16.0f);
            marginLayoutParams.rightMargin = UIUtils.dp2px(getContext(), 16.0f);
            marginLayoutParams.height = getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height_desktop);
            this.mNotifyDetailContainer.setLayoutParams(marginLayoutParams);
            this.mNotifyDetailContainer.setBackgroundResource(R.drawable.settings_item_bg_desktop_selector);
            this.mNotifyDetailLabel.setTextSize(14.0f);
            this.mTipText.setTextSize(12.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mTipText.getLayoutParams();
            marginLayoutParams2.setMarginStart(UIUtils.dp2px(getContext(), 32.0f));
            marginLayoutParams2.topMargin = UIUtils.dp2px(getContext(), 4.0f);
            this.mTipText.setLayoutParams(marginLayoutParams2);
        }
    }

    public void setOnNotifyDetailSwitchListener(AbstractC48649a aVar) {
        this.f122332a = aVar;
    }

    public NotifyDetailSettingView(Context context) {
        super(context);
        m191773a();
    }

    /* renamed from: a */
    private Bitmap m191772a(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.mNotifyDetailContainer, false);
        int dimens = UIUtils.getDimens(getContext(), R.dimen.whether_show_detail_width);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(dimens, 1073741824), View.MeasureSpec.makeMeasureSpec(UIUtils.getDimens(getContext(), R.dimen.whether_show_detail_height), 0));
        inflate.layout(0, 0, dimens, inflate.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(dimens, inflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        inflate.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: a */
    public void mo169829a(boolean z) {
        this.mSwitcher.setOnSwitchListener(null);
        this.mSwitcher.mo169839b(z);
        this.mSwitcher.setOnSwitchListener(this.f122333b);
        if (z) {
            this.mTipText.setText(getContext().getResources().getString(R.string.Lark_NewSettings_BannerNotificationPreviewOnDescriptionMobile));
            this.mTipImage.setImageBitmap(m191772a(R.layout.notification_view_show_detail_tip));
            return;
        }
        this.mTipText.setText(getContext().getResources().getString(R.string.Lark_NewSettings_BannerNotificationPreviewOffDescriptionMobile));
        this.mTipImage.setImageBitmap(m191772a(R.layout.notification_view_not_show_detail_tip));
    }

    public NotifyDetailSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m191773a();
    }

    public NotifyDetailSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m191773a();
    }
}
