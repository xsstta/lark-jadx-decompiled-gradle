package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;
import com.ss.android.lark.feed.app.shortcut.AbstractC37803a;
import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.utils.UIHelper;

public class ShortcutFeedItemView extends FrameLayout implements AbstractC37803a {

    /* renamed from: g */
    public static boolean f97419g;

    /* renamed from: h */
    public static boolean f97420h;

    /* renamed from: a */
    public final int f97421a;

    /* renamed from: b */
    public final int f97422b;

    /* renamed from: c */
    public final int f97423c;

    /* renamed from: d */
    public final int f97424d;

    /* renamed from: e */
    public final int f97425e;

    /* renamed from: f */
    public final int f97426f;

    /* renamed from: i */
    public ShortCutRecyclerView f97427i;

    /* renamed from: j */
    private boolean f97428j;

    /* renamed from: k */
    private ShortCutCoverView f97429k;

    /* renamed from: l */
    private View f97430l;

    /* renamed from: m */
    private C37997i f97431m;

    @Override // com.ss.android.lark.feed.app.shortcut.AbstractC37803a
    /* renamed from: a */
    public boolean mo138584a() {
        if (getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo139013b() {
        int i;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(UDColorUtils.getColor(getContext(), R.color.bg_body));
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        C379591 r0 = new ShortCutRecyclerView(getContext()) {
            /* class com.ss.android.lark.feed.app.view.ShortcutFeedItemView.C379591 */

            /* access modifiers changed from: protected */
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (!ShortcutFeedItemView.f97420h) {
                    ShortcutFeedItemView.f97420h = true;
                    C37268c.m146766b().mo139195n().mo139358d("first_shortcut_render", "first_shortcut_render");
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.view.ShortCutRecyclerView, androidx.recyclerview.widget.RecyclerView
            public void onMeasure(int i, int i2) {
                if (!ShortcutFeedItemView.f97419g) {
                    ShortcutFeedItemView.f97419g = true;
                    C37268c.m146766b().mo139195n().mo139357c("first_shortcut_render", "first_shortcut_render");
                }
                super.onMeasure(i, i2);
            }
        };
        this.f97427i = r0;
        r0.setId(R.id.feed_shortcut_rv);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, this.f97421a);
        layoutParams2.leftMargin = this.f97423c;
        layoutParams2.topMargin = this.f97425e;
        layoutParams2.rightMargin = this.f97424d;
        if (DesktopUtil.m144301a(getContext())) {
            i = 0;
        } else {
            i = this.f97425e;
        }
        layoutParams2.bottomMargin = i;
        linearLayout.addView(this.f97427i, layoutParams2);
        addView(linearLayout);
        this.f97430l = new View(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = this.f97421a;
        layoutParams3.height = 0;
        layoutParams3.gravity = 80;
        this.f97430l.setBackgroundColor(UDColorUtils.getColor(getContext(), R.color.bg_body));
        this.f97430l.setAlpha(1.0f);
        this.f97430l.setLayoutParams(layoutParams3);
        addView(this.f97430l);
        this.f97429k = new ShortCutCoverView(getContext());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f97421a;
        layoutParams4.height = layoutParams2.height - this.f97421a;
        layoutParams4.gravity = 80;
        this.f97429k.setLayoutParams(layoutParams4);
        this.f97429k.setBackgroundColor(UDColorUtils.getColor(getContext(), R.color.bg_body));
        addView(this.f97429k);
        this.f97431m = new C37997i(this.f97427i, this.f97429k, this.f97430l);
        ShortCutStausManager.m148791a().mo138568a(ShortCutStausManager.ShortCutStatus.CLOSE);
    }

    public ShortcutFeedItemView(Context context) {
        this(context, null);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getMessageEvent(ShortcutAnimationEvent shortcutAnimationEvent) {
        if (shortcutAnimationEvent.mo138461c() == ShortcutAnimationEvent.AnimationStatus.GET_FEED_ITEM) {
            shortcutAnimationEvent.mo138459a(this);
        } else {
            mo138583a(shortcutAnimationEvent);
        }
    }

    @Override // com.ss.android.lark.feed.app.shortcut.AbstractC37803a
    /* renamed from: a */
    public void mo138583a(ShortcutAnimationEvent shortcutAnimationEvent) {
        if (getParent() != null && this.f97431m != null) {
            if (shortcutAnimationEvent.mo138461c() == ShortcutAnimationEvent.AnimationStatus.CLOSE_SILENT) {
                this.f97431m.mo139059a();
            } else {
                this.f97431m.mo139060a(shortcutAnimationEvent);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (!this.f97428j) {
                EventBus.getDefault().register(this);
                this.f97428j = true;
            }
            int itemCount = ((this.f97427i.getAdapter().getItemCount() + ShortCutStausManager.m148791a().mo138579f()) - 1) / ShortCutStausManager.m148791a().mo138579f();
            int i2 = (this.f97421a * itemCount) + this.f97426f;
            ShortCutStausManager.m148791a().mo138574c(itemCount);
            ShortCutStausManager.m148791a().mo138576d(i2);
            return;
        }
        if (getWindowVisibility() == 0) {
            this.f97431m.mo139059a();
        }
        EventBus.getDefault().unregister(this);
        this.f97428j = false;
    }

    public ShortcutFeedItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShortcutFeedItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f97421a = UIHelper.dp2px(C38004j.f97573a);
        this.f97422b = UIHelper.dp2px(C38004j.f97574b);
        this.f97423c = UIHelper.dp2px(7.0f);
        this.f97424d = UIHelper.dp2px(8.0f);
        this.f97425e = UIHelper.dp2px((float) C38004j.f97579g);
        this.f97426f = UIHelper.dp2px(C38004j.f97575c);
        mo139013b();
    }
}
