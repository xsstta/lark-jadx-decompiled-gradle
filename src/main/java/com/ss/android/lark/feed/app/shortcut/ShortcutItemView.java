package com.ss.android.lark.feed.app.shortcut;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.view.AdvanceAvatarView;
import com.ss.android.lark.feed.app.view.C37967b;
import com.ss.android.lark.feed.app.view.C38004j;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.AbstractC58347e;

public class ShortcutItemView extends ConstraintLayout {

    /* renamed from: a */
    public TextView f96981a;

    /* renamed from: b */
    public ImageView f96982b;

    /* renamed from: c */
    public LKUIBadgeView f96983c;

    /* renamed from: d */
    public LarkAvatarView f96984d;

    /* renamed from: e */
    private final int f96985e;

    /* renamed from: f */
    private final int f96986f;

    /* renamed from: g */
    private final int f96987g;

    /* renamed from: h */
    private final int f96988h;

    /* renamed from: i */
    private final int f96989i;

    /* renamed from: j */
    private AbstractC58347e f96990j;

    public boolean showContextMenu() {
        m148812a(this, -1.0f, -1.0f);
        return true;
    }

    /* renamed from: a */
    private void mo138584a() {
        setLayoutParams(new RecyclerView.LayoutParams(-2, this.f96985e));
        setId(R.id.shortcut_item_container);
        AdvanceAvatarView advanceAvatarView = new AdvanceAvatarView(getContext());
        this.f96984d = advanceAvatarView;
        advanceAvatarView.setId(R.id.avatar);
        this.f96984d.setOval(true);
        this.f96984d.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int i = this.f96988h;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(i, i);
        layoutParams.f2816h = R.id.shortcut_item_container;
        layoutParams.f2812d = R.id.shortcut_item_container;
        layoutParams.f2815g = R.id.shortcut_item_container;
        layoutParams.topMargin = this.f96987g;
        addView(this.f96984d, layoutParams);
        View view = new View(getContext());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(this.f96986f, 1);
        layoutParams2.f2813e = R.id.avatar;
        layoutParams2.f2816h = R.id.avatar;
        addView(view, layoutParams2);
        LKUIBadgeView lKUIBadgeView = new LKUIBadgeView(getContext());
        this.f96983c = lKUIBadgeView;
        lKUIBadgeView.setId(R.id.badge);
        this.f96983c.mo89316a(C38004j.f97581i);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(UIHelper.dp2px(C37967b.f97463h), UIHelper.dp2px(C37967b.f97463h));
        layoutParams3.f2821m = R.id.avatar;
        layoutParams3.f2823o = 45.0f;
        layoutParams3.f2822n = this.f96988h / 2;
        addView(this.f96983c, layoutParams3);
        this.f96982b = new ImageView(getContext());
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f));
        layoutParams4.f2821m = R.id.avatar;
        layoutParams4.f2823o = 135.0f;
        layoutParams4.f2822n = this.f96988h / 2;
        addView(this.f96982b, layoutParams4);
        TextView textView = new TextView(getContext());
        this.f96981a = textView;
        textView.setTextSize(11.0f);
        this.f96981a.setTextColor(C38004j.f97580h);
        this.f96981a.setSingleLine(true);
        this.f96981a.setEllipsize(TextUtils.TruncateAt.END);
        this.f96981a.setGravity(17);
        this.f96981a.setMaxWidth(this.f96989i);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = UIUtils.dp2px(getContext(), (float) C38004j.f97576d);
        layoutParams5.f2815g = R.id.shortcut_item_container;
        layoutParams5.f2812d = R.id.shortcut_item_container;
        layoutParams5.f2817i = R.id.avatar;
        addView(this.f96981a, layoutParams5);
    }

    public void setOnShowMenuListener(AbstractC58347e eVar) {
        this.f96990j = eVar;
    }

    public ShortcutItemView(Context context) {
        this(context, null);
    }

    public boolean showContextMenuForChild(View view) {
        m148812a(view, -1.0f, -1.0f);
        return true;
    }

    public ShortcutItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean showContextMenu(float f, float f2) {
        m148812a(this, f, f2);
        return true;
    }

    /* renamed from: a */
    private void m148812a(View view, float f, float f2) {
        AbstractC58347e eVar = this.f96990j;
        if (eVar != null) {
            eVar.mo137287a(view, f, f2);
        }
    }

    public boolean showContextMenuForChild(View view, float f, float f2) {
        m148812a(view, f, f2);
        return true;
    }

    public ShortcutItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f96985e = UIUtils.dp2px(context, C38004j.f97573a);
        this.f96986f = UIUtils.dp2px(context, 10.0f);
        this.f96987g = UIUtils.dp2px(context, C38004j.f97577e);
        this.f96989i = UIUtils.dp2px(context, (float) C38004j.f97578f);
        this.f96988h = UIUtils.dp2px(context, 40.0f);
        mo138584a();
    }
}
