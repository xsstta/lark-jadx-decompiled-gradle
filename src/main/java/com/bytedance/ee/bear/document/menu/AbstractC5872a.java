package com.bytedance.ee.bear.document.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.util.C0844e;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.menu.MenuData;
import com.bytedance.ee.bear.document.titlebar.badge.DocsAppMoreBadgeStrategy;
import com.bytedance.ee.bear.document.titlebar.badge.DocsAppShareBadgeStrategy;
import com.bytedance.ee.bear.document.titlebar.badge.TitleBarBadgeStrategyManger;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.widgets.BadgeStyle;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.document.menu.a */
public abstract class AbstractC5872a<T extends MenuData> implements AbstractC7945d<T> {

    /* renamed from: a */
    private Context f16434a;

    /* renamed from: b */
    protected AbstractC7947h f16435b;

    /* renamed from: c */
    private List<MenuItem> f16436c;

    /* renamed from: d */
    private Set<MenuItem> f16437d = new HashSet();

    /* renamed from: e */
    private T f16438e;

    /* renamed from: f */
    private DocumentMetadata f16439f;

    /* renamed from: g */
    private final TitleBarBadgeStrategyManger f16440g = new TitleBarBadgeStrategyManger();

    /* renamed from: b */
    public List<MenuItem> mo23589b() {
        return this.f16436c;
    }

    /* renamed from: c */
    public MenuData mo23590c() {
        return this.f16438e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22213b(List<MenuItem> list) {
        m23617c(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo23588b(String str) {
        int intValue = C5874b.m23630b(str).intValue();
        if (intValue == 0) {
            return null;
        }
        return this.f16434a.getResources().getString(intValue);
    }

    /* renamed from: a */
    private void m23615a(MenuItem menuItem) {
        if ("MORE_OPERATE".equals(menuItem.getId())) {
            this.f16440g.mo25035b();
        }
        if ("SHARE".equals(menuItem.getId())) {
            this.f16440g.mo25039d();
        }
    }

    /* renamed from: c */
    private void m23617c(List<MenuItem> list) {
        if (list != null && list.size() > 0) {
            this.f16440g.mo25033a(new DocsAppMoreBadgeStrategy(this.f16439f));
            if (this.f16440g.mo25034a()) {
                C13479a.m54764b("BaseMenuHandler", "set show more badge");
                Iterator<MenuItem> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MenuItem next = it.next();
                    if ("MORE_OPERATE".equals(next.getId()) && next.isEnable()) {
                        next.setBadgeStyle(BadgeStyle.point);
                        next.setBadgeNum(1);
                        break;
                    }
                }
            }
            boolean isOwner = this.f16439f.isOwner();
            this.f16440g.mo25036b(new DocsAppShareBadgeStrategy(this.f16439f.getDocumentTypeValue(), isOwner));
            if (this.f16440g.mo25038c()) {
                C13479a.m54764b("BaseMenuHandler", "set show share badge");
                for (MenuItem menuItem : list) {
                    if ("SHARE".equals(menuItem.getId()) && menuItem.isEnable()) {
                        menuItem.setBadgeStyle(BadgeStyle.point);
                        menuItem.setBadgeNum(1);
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo23585a(String str) {
        C0844e<Integer, Integer> a = C5874b.m23627a(str);
        if (a == null) {
            return null;
        }
        if (a.f3318b.intValue() == 0) {
            return C0215a.m655b(this.f16434a, a.f3317a.intValue());
        }
        return C13747j.m55724a(this.f16434a, a.f3317a.intValue(), a.f3318b.intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<MenuItem> mo22211a(List<MenuItem> list) {
        if (list == null) {
            this.f16437d.clear();
            return null;
        }
        Iterator<MenuItem> it = this.f16437d.iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next())) {
                it.remove();
            }
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            MenuItem menuItem = list.get(size);
            if (menuItem != null) {
                Drawable a = mo23585a(menuItem.getId());
                String b = mo23588b(menuItem.getId());
                if (a == null && b == null) {
                    C13479a.m54775e("BaseMenuHandler", "Found unsupported menu:" + menuItem);
                    list.remove(size);
                } else {
                    if (a != null) {
                        menuItem.setIcon(a);
                    }
                    menuItem.setClickListener(new MenuItem.AbstractC4937a() {
                        /* class com.bytedance.ee.bear.document.menu.$$Lambda$tj6hyhKl12zaCqYZdrrzZW2URQ */

                        @Override // com.bytedance.ee.bear.browser.plugin.MenuItem.AbstractC4937a
                        public final void onMenuItemClick(MenuItem menuItem, View view) {
                            AbstractC5872a.this.mo23584a(menuItem, view);
                        }
                    });
                }
            }
        }
        return list;
    }

    public AbstractC5872a(Context context, DocumentMetadata qVar) {
        this.f16434a = context;
        this.f16439f = qVar;
    }

    /* renamed from: a */
    private void m23614a(ImageView imageView, C0844e<Integer, Integer> eVar) {
        if (eVar.f3318b.intValue() != 0) {
            imageView.setImageDrawable(C0215a.m655b(this.f16434a, eVar.f3317a.intValue()));
        } else {
            imageView.setImageDrawable(C13747j.m55724a(this.f16434a, eVar.f3317a.intValue(), eVar.f3318b.intValue()));
        }
    }

    /* renamed from: b */
    private void m23616b(MenuItem menuItem, final View view) {
        String c = C5874b.m23631c(menuItem.getId());
        if (!TextUtils.isEmpty(c)) {
            this.f16437d.add(menuItem);
            final C0844e<Integer, Integer> a = C5874b.m23627a(c);
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(200L);
            final ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleX", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L);
            duration.setInterpolator(new DecelerateInterpolator());
            duration2.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.document.menu.AbstractC5872a.C58731 */

                public void onAnimationEnd(Animator animator) {
                    AbstractC5872a.this.mo23586a(view, a);
                    duration2.start();
                }
            });
            duration.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23586a(View view, C0844e<Integer, Integer> eVar) {
        if (view instanceof ImageView) {
            m23614a((ImageView) view, eVar);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ImageView) {
                    m23614a((ImageView) childAt, eVar);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23584a(MenuItem menuItem, View view) {
        m23615a(menuItem);
        if (this.f16437d.contains(menuItem)) {
            C13479a.m54775e("BaseMenuHandler", "Ignore click until menu update:" + menuItem);
            return;
        }
        m23616b(menuItem, view);
        if (this.f16435b != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) String.valueOf(menuItem.getId()));
            this.f16435b.mo17188a(jSONObject);
        }
    }

    /* renamed from: a */
    public void handle(T t, AbstractC7947h hVar) {
        C13479a.m54764b("BaseMenuHandler", "update menu:" + t);
        this.f16435b = hVar;
        this.f16438e = t;
        List<MenuItem> a = mo22211a(t.getItems());
        this.f16436c = a;
        mo22213b(a);
    }
}
