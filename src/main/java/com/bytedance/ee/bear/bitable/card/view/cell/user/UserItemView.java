package com.bytedance.ee.bear.bitable.card.view.cell.user;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p705h.C13666a;
import com.larksuite.suite.R;
import java.util.Locale;

public class UserItemView extends LinearLayout {

    /* renamed from: a */
    public AbstractC4697a f13858a;

    /* renamed from: b */
    private ImageView f13859b;

    /* renamed from: c */
    private TextView f13860c;

    /* renamed from: a */
    private void m19458a() {
        LayoutInflater.from(getContext()).inflate(R.layout.bitable_card_user_cell_item, (ViewGroup) this, true);
        setBackground(getResources().getDrawable(R.drawable.bitable_card_user_item_bg));
        this.f13859b = (ImageView) findViewById(R.id.user_avatar);
        this.f13860c = (TextView) findViewById(R.id.user_name);
    }

    public void setDelegate(AbstractC4697a aVar) {
        this.f13858a = aVar;
    }

    public UserItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m19459a(String str) {
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(getContext()).mo10414a(new C13664a(str)).mo11129a(AbstractC2354j.f7813c)).mo11123a(R.drawable.facade_common_avatar_place_holder)).mo10399a(this.f13859b);
    }

    /* renamed from: a */
    public void mo18374a(final UserEntity userEntity) {
        m19460a(userEntity.getName(), userEntity.getEnName());
        m19459a(userEntity.getAvatarUrl());
        setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.user.UserItemView.C46961 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (UserItemView.this.f13858a != null) {
                    UserItemView.this.f13858a.mo18130a(userEntity.getUserId());
                }
            }
        });
    }

    public UserItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m19460a(String str, String str2) {
        String language = Locale.getDefault().getLanguage();
        AbstractC4697a aVar = this.f13858a;
        if (aVar != null) {
            language = aVar.mo18017l();
        }
        this.f13860c.setText(C13666a.m55443a(language, str, str2));
    }

    public UserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19458a();
    }
}
