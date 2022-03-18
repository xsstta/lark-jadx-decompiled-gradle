package com.larksuite.component.ui.avatar.v2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.badge.BadgeBinder;
import com.larksuite.component.ui.badge.BadgeModel;
import com.larksuite.component.ui.badge.miniicon.DocMiniIcon;
import com.larksuite.component.ui.badge.miniicon.DocMiniIconBinder;
import com.larksuite.component.ui.badge.miniicon.MiniIconBinder;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.list.C25676a;
import com.larksuite.component.ui.list.IComponentBinder;
import com.larksuite.suite.R;

public class LarkAvatarView extends LKUIRoundedImageView2 {

    /* renamed from: a */
    private C25676a f62487a;

    /* renamed from: a */
    private void m91624a() {
        mo89078a(DocAvatar.class, ImageView.class, new DocAvatarBinder());
        mo89078a(AvatarModel.class, ImageView.class, new CommonAvatarBinder());
        mo89078a(BadgeModel.class, View.class, new BadgeBinder());
        mo89078a(DocMiniIcon.class, View.class, new DocMiniIconBinder());
        mo89078a(MiniIconModel.class, View.class, new MiniIconBinder());
    }

    /* renamed from: a */
    public void mo89073a(Drawable drawable) {
        setBorderDrawable(drawable);
    }

    public LarkAvatarView(Context context) {
        this(context, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo89075a(BadgeModel cVar) {
        this.f62487a.mo89817a((Class<? extends Object>) getClass(), (View) this, (Object) cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo89074a(MiniIconModel eVar) {
        if (eVar != null) {
            this.f62487a.mo89817a((Class<? extends Object>) getClass(), (View) this, (Object) eVar);
        } else {
            mo89077a(MiniIconModel.class);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo89076a(AvatarModel avatarModel) {
        this.f62487a.mo89817a((Class<? extends Object>) getClass(), (View) this, (Object) avatarModel);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo89077a(Class<?> cls) {
        this.f62487a.mo89816a((Class<? extends Object>) getClass(), (View) this, cls);
    }

    public LarkAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public <M, V extends View> void mo89078a(Class<M> cls, Class<V> cls2, IComponentBinder<? super V, ? super M> bVar) {
        this.f62487a.mo89818a(cls, cls2, bVar);
    }

    public LarkAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62487a = new C25676a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.civ_badge_background, R.attr.civ_badge_icon, R.attr.civ_badge_min_size, R.attr.civ_badge_padding, R.attr.civ_badge_position_angle, R.attr.civ_badge_text, R.attr.civ_badge_text_color, R.attr.civ_badge_text_size, R.attr.civ_border_color, R.attr.civ_border_drawable, R.attr.civ_border_padding, R.attr.civ_border_width, R.attr.civ_oval, R.attr.civ_radius, R.attr.civ_radius_left_bottom, R.attr.civ_radius_left_top, R.attr.civ_radius_right_bottom, R.attr.civ_radius_right_top, R.attr.civ_selected_board_color, R.attr.civ_selected_mask_color, R.attr.civ_touch_select_enable}, i, 0);
        setOval(obtainStyledAttributes.getBoolean(12, true));
        obtainStyledAttributes.recycle();
        m91624a();
    }
}
