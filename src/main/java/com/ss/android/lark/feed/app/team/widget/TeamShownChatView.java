package com.ss.android.lark.feed.app.team.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;

public class TeamShownChatView extends FrameLayout {

    /* renamed from: a */
    public View f97191a;

    /* renamed from: b */
    public TextView f97192b;

    /* renamed from: c */
    public final ImageView f97193c;

    /* renamed from: d */
    public LarkAvatarView f97194d;

    /* renamed from: e */
    public LKUIBadgeView f97195e;

    /* renamed from: f */
    public ConstraintLayout f97196f;

    /* renamed from: g */
    public LinearLayout f97197g;

    /* renamed from: h */
    public LinearLayout f97198h;

    /* renamed from: i */
    public View f97199i;

    /* renamed from: j */
    public TextView f97200j;

    /* renamed from: k */
    public ImageView f97201k;

    public TeamShownChatView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo138821a(float f) {
        if (f <= 1.0f && f >= BitmapDescriptorFactory.HUE_RED) {
            this.f97199i.setTranslationX(((float) this.f97199i.getMeasuredWidth()) * (1.0f - f));
        }
    }

    public TeamShownChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_team_feed_child_item, this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        this.f97191a = findViewById(R.id.chat_info_container);
        this.f97192b = (TextView) findViewById(R.id.chat_name);
        this.f97193c = (ImageView) findViewById(R.id.secret_icon);
        this.f97194d = (LarkAvatarView) findViewById(R.id.at_avatar);
        this.f97195e = (LKUIBadgeView) findViewById(R.id.chat_badge);
        this.f97196f = (ConstraintLayout) findViewById(R.id.slide_action_container);
        this.f97197g = (LinearLayout) findViewById(R.id.hide_chat_container);
        this.f97198h = (LinearLayout) findViewById(R.id.show_chat_container);
        this.f97201k = (ImageView) findViewById(R.id.pin_to_top_icon);
        this.f97200j = (TextView) findViewById(R.id.pin_to_top_text);
    }

    /* renamed from: a */
    public void mo138822a(int i, String str, int i2, int i3) {
        if (i == 0) {
            this.f97195e.setVisibility(0);
            this.f97195e.mo89317a(i2).mo89319a(str).mo89322b(i3).mo89320a();
            return;
        }
        LKUIBadgeView lKUIBadgeView = this.f97195e;
        if (lKUIBadgeView != null) {
            lKUIBadgeView.setVisibility(8);
        }
    }
}
