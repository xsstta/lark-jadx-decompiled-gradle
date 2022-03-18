package com.ss.android.lark.feed.app.team.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;

public class TeamItemView extends FrameLayout {

    /* renamed from: a */
    public ImageView f97183a;

    /* renamed from: b */
    public LarkAvatarView f97184b;

    /* renamed from: c */
    public View f97185c;

    /* renamed from: d */
    public TextView f97186d;

    /* renamed from: e */
    public LKUIBadgeView f97187e;

    public TeamItemView(Context context) {
        this(context, null);
    }

    public TeamItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_team_feed_group_item, this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        this.f97183a = (ImageView) findViewById(R.id.indicator);
        this.f97184b = (LarkAvatarView) findViewById(R.id.team_avatar);
        this.f97185c = findViewById(R.id.expand_more_click_area);
        this.f97186d = (TextView) findViewById(R.id.team_name);
        this.f97187e = (LKUIBadgeView) findViewById(R.id.chat_badge);
    }

    /* renamed from: a */
    public void mo138816a(int i, String str, int i2, int i3) {
        if (i == 0) {
            this.f97187e.setVisibility(0);
            this.f97187e.mo89317a(i2).mo89319a(str).mo89322b(i3).mo89320a();
            return;
        }
        LKUIBadgeView lKUIBadgeView = this.f97187e;
        if (lKUIBadgeView != null) {
            lKUIBadgeView.setVisibility(8);
        }
    }
}
