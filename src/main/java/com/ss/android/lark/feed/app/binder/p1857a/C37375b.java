package com.ss.android.lark.feed.app.binder.p1857a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.feed.app.binder.p1857a.p1858a.C37371a;
import com.ss.android.lark.feed.app.binder.p1857a.p1858a.C37372b;
import com.ss.android.lark.feed.app.binder.p1857a.p1858a.C37373c;
import com.ss.android.lark.feed.app.binder.p1857a.p1858a.C37374d;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58348f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.binder.a.b */
public class C37375b<T extends FeedPreview> {

    /* renamed from: a */
    public List<AbstractC37370a<T>> f95903a = new ArrayList();

    /* renamed from: b */
    private AbstractC37378c<T> f95904b;

    /* renamed from: c */
    private Context f95905c;

    /* renamed from: com.ss.android.lark.feed.app.binder.a.b$a */
    public interface AbstractC37377a<T extends FeedPreview> {
        /* renamed from: a */
        void mo137235a(int i, T t);
    }

    public C37375b(Context context, AbstractC37378c<T> cVar) {
        this.f95904b = cVar;
        this.f95905c = context;
    }

    /* renamed from: a */
    public PopupWindow mo137233a(final T t, final AbstractC37377a<T> aVar) {
        this.f95903a.clear();
        this.f95903a.add(new C37373c(this.f95905c, t, this.f95904b));
        this.f95903a.add(new C37371a(this.f95905c, t, this.f95904b));
        this.f95903a.add(new C37374d(this.f95905c, t, this.f95904b));
        this.f95903a.add(new C37372b(this.f95905c, t, this.f95904b));
        ArrayList arrayList = new ArrayList();
        for (AbstractC37370a<T> aVar2 : this.f95903a) {
            if (aVar2.mo137227a()) {
                arrayList.add(aVar2.mo137232f());
            }
        }
        return new C58348f.C58350a(this.f95905c).mo197588a(arrayList).mo197582a(14.0f).mo197583a(UIHelper.dp2px(10.0f)).mo197586a(this.f95905c.getDrawable(R.drawable.desktop_menu_bg)).mo197587a(new C58348f.AbstractC58353d() {
            /* class com.ss.android.lark.feed.app.binder.p1857a.C37375b.C373761 */

            /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.ss.android.lark.feed.app.binder.a.b$a */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.lark.widget.p2932c.C58348f.AbstractC58353d
            public void onMenuItemClick(int i, View view) {
                AbstractC37377a aVar = aVar;
                if (aVar != 0) {
                    aVar.mo137235a(C37375b.this.f95903a.get(i).mo137228b(), t);
                }
            }
        }).mo197581a();
    }

    /* renamed from: a */
    public void mo137234a(PopupWindow popupWindow, View view, float f, float f2) {
        if (f == -1.0f || f2 == -1.0f) {
            Rect a = C36512a.m144041a().mo134753a(ContainerType.Left);
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            popupWindow.showAtLocation(view, 51, a.right - UIHelper.dp2px(15.0f), rect.top - ((UIHelper.dp2px(144.0f) - view.getHeight()) / 2));
            return;
        }
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        try {
            popupWindow.showAtLocation(view, 51, rect2.left + ((int) f), rect2.top + ((int) f2));
        } catch (Exception unused) {
        }
    }
}
