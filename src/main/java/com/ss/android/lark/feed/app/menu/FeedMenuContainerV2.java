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
import com.ss.android.lark.feed.app.menu.AbstractC37660d;
import com.ss.android.lark.feed.app.menu.FeedMenuViewV2;
import com.ss.android.lark.feed.app.menu.entity.MenuItem;
import com.ss.android.lark.feed.app.menu.statistics.Conf;
import com.ss.android.lark.feed.app.menu.statistics.DrawerHitPoint;
import com.ss.android.lark.utils.UIHelper;

public class FeedMenuContainerV2 extends FrameLayout implements AbstractC37660d {

    /* renamed from: a */
    public AbstractC37660d.AbstractC37661a f96490a;

    /* renamed from: b */
    public AbstractC37660d.AbstractC37662b f96491b;

    /* renamed from: c */
    public FeedMenuViewV2.AbstractC37646a f96492c;

    /* renamed from: d */
    private C37651b f96493d;

    public View getContentView() {
        return this;
    }

    /* renamed from: a */
    private void m148032a() {
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        m148033b();
        LayoutInflater.from(getContext()).inflate(R.layout.feed_layout_title_menu, this);
    }

    /* renamed from: c */
    private void m148034c() {
        C37651b bVar = new C37651b(new C37647a(), new FeedMenuViewV2(this.f96492c, getContext()));
        this.f96493d = bVar;
        bVar.create();
    }

    /* renamed from: b */
    private void m148033b() {
        View view = new View(getContext());
        view.setId(R.id.gray_layer);
        view.setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.lkui_N900), 0.3f));
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        addView(view);
    }

    public void setMenuChangeListener(AbstractC37660d.AbstractC37661a aVar) {
        this.f96490a = aVar;
    }

    public void setMenuVisListener(AbstractC37660d.AbstractC37662b bVar) {
        this.f96491b = bVar;
    }

    public FeedMenuContainerV2(Context context) {
        this(context, null);
    }

    public FeedMenuContainerV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedMenuContainerV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f96492c = new FeedMenuViewV2.AbstractC37646a() {
            /* class com.ss.android.lark.feed.app.menu.FeedMenuContainerV2.C376361 */

            @Override // com.ss.android.lark.feed.app.menu.FeedMenuViewV2.AbstractC37646a
            /* renamed from: a */
            public void mo138061a() {
                FeedMenuContainerV2.this.f96491b.mo138095a();
            }

            @Override // com.ss.android.lark.feed.app.menu.FeedMenuViewV2.AbstractC37646a
            /* renamed from: a */
            public void mo138062a(FeedMenuViewV2 feedMenuViewV2) {
                ButterKnife.bind(feedMenuViewV2, FeedMenuContainerV2.this);
            }

            @Override // com.ss.android.lark.feed.app.menu.FeedMenuViewV2.AbstractC37646a
            /* renamed from: a */
            public void mo138063a(MenuItem.MenuType menuType, MenuItem.MenuType menuType2) {
                if (FeedMenuContainerV2.this.f96490a != null) {
                    FeedMenuContainerV2.this.f96490a.mo138094a(menuType);
                    FeedMenuContainerV2.this.f96490a.mo138094a(menuType2);
                }
            }

            @Override // com.ss.android.lark.feed.app.menu.FeedMenuViewV2.AbstractC37646a
            /* renamed from: b */
            public void mo138064b(MenuItem.MenuType menuType, MenuItem.MenuType menuType2) {
                if (menuType != null && menuType2 != null) {
                    DrawerHitPoint.f96543a.mo138082a(Conf.f96542b.mo138081a(menuType.toString()), Conf.f96542b.mo138081a(menuType2.toString()));
                }
            }
        };
        m148032a();
        m148034c();
    }
}
