package com.ss.android.lark.feed.app.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.menu.AbstractC37660d;
import com.ss.android.lark.feed.app.menu.FeedMenuView;
import com.ss.android.lark.feed.app.menu.entity.MenuItem;
import com.ss.android.lark.feed.app.menu.statistics.Conf;
import com.ss.android.lark.feed.app.menu.statistics.DrawerHitPoint;
import com.ss.android.lark.utils.UIHelper;

public class FeedMenuContainer extends FrameLayout implements AbstractC37660d {

    /* renamed from: a */
    public AbstractC37660d.AbstractC37661a f96485a;

    /* renamed from: b */
    public AbstractC37660d.AbstractC37662b f96486b;

    /* renamed from: c */
    public FeedMenuView.AbstractC37641a f96487c;

    /* renamed from: d */
    private C37651b f96488d;

    public View getContentView() {
        return this;
    }

    /* renamed from: a */
    private void m148025a() {
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        m148026b();
        LayoutInflater.from(getContext()).inflate(R.layout.activity_feed_type_view, this);
    }

    /* renamed from: c */
    private void m148027c() {
        C37651b bVar = new C37651b(new C37647a(), new FeedMenuView(this.f96487c, getContext()));
        this.f96488d = bVar;
        bVar.create();
    }

    /* renamed from: b */
    private void m148026b() {
        if (!DesktopUtil.m144301a(getContext())) {
            View view = new View(getContext());
            view.setId(R.id.gray_layer);
            view.setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.lkui_N900), 0.3f));
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            addView(view);
        }
    }

    public void setMenuChangeListener(AbstractC37660d.AbstractC37661a aVar) {
        this.f96485a = aVar;
    }

    public void setMenuVisListener(AbstractC37660d.AbstractC37662b bVar) {
        this.f96486b = bVar;
    }

    public FeedMenuContainer(Context context) {
        this(context, null);
    }

    public FeedMenuContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedMenuContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f96487c = new FeedMenuView.AbstractC37641a() {
            /* class com.ss.android.lark.feed.app.menu.FeedMenuContainer.C376351 */

            @Override // com.ss.android.lark.feed.app.menu.FeedMenuView.AbstractC37641a
            /* renamed from: a */
            public void mo138054a() {
                FeedMenuContainer.this.f96486b.mo138095a();
            }

            @Override // com.ss.android.lark.feed.app.menu.FeedMenuView.AbstractC37641a
            /* renamed from: a */
            public void mo138055a(FeedMenuView feedMenuView) {
                ButterKnife.bind(feedMenuView, FeedMenuContainer.this);
            }

            @Override // com.ss.android.lark.feed.app.menu.FeedMenuView.AbstractC37641a
            /* renamed from: a */
            public void mo138056a(MenuItem.MenuType menuType) {
                if (FeedMenuContainer.this.f96485a != null) {
                    FeedMenuContainer.this.f96485a.mo138094a(menuType);
                }
            }

            @Override // com.ss.android.lark.feed.app.menu.FeedMenuView.AbstractC37641a
            /* renamed from: a */
            public void mo138057a(MenuItem.MenuType menuType, MenuItem.MenuType menuType2) {
                if (menuType != null && menuType2 != null) {
                    DrawerHitPoint.f96543a.mo138082a(Conf.f96542b.mo138081a(menuType.toString()), Conf.f96542b.mo138081a(menuType2.toString()));
                }
            }
        };
        m148025a();
        m148027c();
    }
}
