package com.ss.android.lark.ding.service.impl.reminder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.dto.UrgentType;
import com.ss.android.lark.ding.service.impl.C36678a;
import com.ss.android.lark.ding.service.impl.C36690c;
import com.ss.android.lark.utils.C57851l;
import com.ss.android.lark.utils.UIHelper;

public class UrgentReminderView extends LinearLayout {

    /* renamed from: a */
    IDingModuleDependency.AbstractC36630g f94488a;

    /* renamed from: b */
    IDingModuleDependency.AbstractC36625c f94489b;

    /* renamed from: c */
    IDingModuleDependency.ISettingDependency f94490c;

    /* renamed from: d */
    public UrgentReminderData f94491d;

    /* renamed from: e */
    public AbstractC36779a f94492e;
    @BindView(5961)
    UDButton mButtonDetail;
    @BindView(5962)
    UDButton mButtonLater;
    @BindView(5973)
    ImageView mBuzzTagIv;
    @BindView(6224)
    View mDisplayLayout;
    @BindView(6173)
    ImageView mIvDingAvatar;
    @BindView(6632)
    TextView mTvDingSender;
    @BindView(6630)
    TextView mTvDingText;
    @BindView(6631)
    TextView mTvDingTime;

    /* renamed from: com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView$a */
    public interface AbstractC36779a {
        /* renamed from: a */
        void mo135371a(String str, String str2);

        /* renamed from: b */
        void mo135372b(String str, String str2);
    }

    /* renamed from: b */
    private void m145079b() {
        this.mButtonDetail.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView.View$OnClickListenerC367751 */

            public void onClick(View view) {
                C36618a.m144492a().mo135113r();
                if (UrgentReminderView.this.f94491d != null && UrgentReminderView.this.f94491d.getMessage() != null) {
                    final String id = UrgentReminderView.this.f94491d.getMessage().getId();
                    if (UrgentReminderView.this.f94491d.getUrgentType() == UrgentType.PHONE.getNumber()) {
                        C36678a.m144755b().mo135286c();
                    }
                    UrgentReminderView.this.f94492e.mo135371a(id, UrgentReminderView.this.f94491d.getAckId());
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView.View$OnClickListenerC367751.RunnableC367761 */

                        public void run() {
                            C36690c.m144778a().mo135299a(id, UrgentReminderView.this.f94491d.getAckId(), null);
                            UrgentReminderView.this.f94489b.mo135134a(UrgentReminderView.this.getContext(), UrgentReminderView.this.f94491d.getMessage().getChatId(), 335544320, UrgentReminderView.this.f94491d.getMessage().getPosition());
                        }
                    }, 300);
                }
            }
        });
        this.mDisplayLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView.View$OnClickListenerC367772 */

            public void onClick(View view) {
                UrgentReminderView.this.mButtonDetail.performClick();
            }
        });
        this.mButtonLater.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView.View$OnClickListenerC367783 */

            public void onClick(View view) {
                UrgentReminderView.this.f94492e.mo135372b(UrgentReminderView.this.f94491d.getMessage().getId(), UrgentReminderView.this.f94491d.getAckId());
            }
        });
    }

    /* renamed from: a */
    private void m145078a() {
        Drawable findDrawableByLayerId;
        ButterKnife.bind(LayoutInflater.from(getContext()).inflate(R.layout.dialog_ding_layout, this), this);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_urgent_tag_icon);
        if ((drawable instanceof LayerDrawable) && (findDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(R.id.buzz_icon_layer)) != null) {
            findDrawableByLayerId.mutate();
            findDrawableByLayerId.setTint(UIHelper.getColor(R.color.static_white));
        }
        this.mBuzzTagIv.setImageDrawable(drawable);
    }

    public void setClickListener(AbstractC36779a aVar) {
        this.f94492e = aVar;
    }

    public UrgentReminderView(Context context) {
        this(context, null);
    }

    public void setData(UrgentReminderData urgentReminderData) {
        this.f94491d = urgentReminderData;
        String string = getContext().getString(R.string.Lark_Legacy_DingSomeone);
        String string2 = getContext().getString(R.string.Lark_Legacy_DingViewDetailTip);
        UrgentReminderData urgentReminderData2 = this.f94491d;
        if (urgentReminderData2 != null) {
            if (urgentReminderData2.getFromChatter() != null) {
                string = C36618a.m144492a().mo135104i().mo135131a(this.f94491d.getFromChatter());
                int dp2px = UIHelper.dp2px(20.0f);
                C36618a.m144492a().mo135103h().mo135152a(getContext(), this.f94491d.getFromChatter().getAvatarKey(), this.f94491d.getFromChatter().getId(), this.mIvDingAvatar, dp2px, dp2px);
            }
            if (this.f94491d.getMessage() != null) {
                if (this.f94491d.getChat().isSecret()) {
                    String string3 = getContext().getString(R.string.Lark_Buzz_BuzzSecretChatPush);
                    this.mTvDingSender.setText(string);
                    this.mTvDingText.setText(string3.toString());
                    return;
                }
                boolean z = false;
                CharSequence a = C36618a.m144492a().mo135104i().mo135128a(getContext(), this.f94491d.getMessage(), 0);
                TextView textView = this.mTvDingTime;
                Context context = getContext();
                long createTime = this.f94491d.getMessage().getCreateTime() * 1000;
                if (this.f94490c.mo135114a() == 2) {
                    z = true;
                }
                textView.setText(C57851l.m224543a(context, createTime, z, this.f94488a.mo135153a()));
                this.mTvDingSender.setText(string);
                this.mTvDingText.setText(a.toString());
                return;
            }
        }
        this.mTvDingSender.setText(string);
        this.mTvDingText.setText(string2.toString());
    }

    public UrgentReminderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94488a = C36618a.m144492a().mo135100e();
        this.f94489b = C36618a.m144492a().mo135104i();
        this.f94490c = C36618a.m144492a().mo135101f();
        m145078a();
        m145079b();
    }
}
