package com.ss.android.lark.feed.app.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.banner.base.AbstractC37318c;
import com.ss.android.lark.feed.app.banner.base.C37316a;
import com.ss.android.lark.feed.app.banner.statistics.BannerHitPoint;
import com.ss.android.lark.feed.service.impl.C38123a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NotificationTipBannerView extends FrameLayout implements AbstractC37318c<C37316a> {

    /* renamed from: a */
    public Map<String, AbstractC37318c.AbstractC37319a> f95806a = new ConcurrentHashMap();
    @BindView(6257)
    ImageView mCloseBT;
    @BindView(6740)
    View mOpenSettingBT;

    @Override // com.ss.android.lark.feed.app.banner.base.AbstractC37318c
    public View getView() {
        return this;
    }

    /* renamed from: a */
    private void m146960a() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.banner_notification_tip, this));
        this.mOpenSettingBT.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.banner.NotificationTipBannerView.View$OnClickListenerC373101 */

            public void onClick(View view) {
                if (DesktopUtil.m144301a(NotificationTipBannerView.this.getContext())) {
                    C26323w.m95329b(NotificationTipBannerView.this.getContext(), 268435456);
                } else {
                    C26323w.m95328b(NotificationTipBannerView.this.getContext());
                }
                for (AbstractC37318c.AbstractC37319a aVar : NotificationTipBannerView.this.f95806a.values()) {
                    aVar.mo137169a();
                }
                BannerHitPoint.f95814a.mo137159a();
            }
        });
        ak.m95026a(this.mCloseBT, UIUtils.dp2px(getContext(), 8.0f));
        this.mCloseBT.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.banner.NotificationTipBannerView.View$OnClickListenerC373112 */

            public void onClick(View view) {
                C38123a.m149931a().mo139459b();
                for (AbstractC37318c.AbstractC37319a aVar : NotificationTipBannerView.this.f95806a.values()) {
                    aVar.mo137170b();
                }
            }
        });
    }

    public NotificationTipBannerView(Context context) {
        super(context);
        m146960a();
    }

    @Override // com.ss.android.lark.feed.app.banner.base.AbstractC37318c
    /* renamed from: a */
    public void mo137145a(String str, AbstractC37318c.AbstractC37319a aVar) {
        this.f95806a.put(str, aVar);
    }

    public NotificationTipBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m146960a();
    }

    public NotificationTipBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m146960a();
    }
}
