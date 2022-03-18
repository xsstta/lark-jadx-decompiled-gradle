package com.larksuite.component.ui.badge.miniicon;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.ui.imageview.LKUIBadgeDrawable2;
import com.larksuite.component.ui.list.IComponentBinder;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/ui/badge/miniicon/MiniIconBinder;", "T", "Lcom/larksuite/component/ui/badge/miniicon/MiniIconModel;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Landroid/view/View;", "()V", "bind", "", "view", "model", "(Landroid/view/View;Lcom/larksuite/component/ui/badge/miniicon/MiniIconModel;)V", "getIconDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/larksuite/component/ui/badge/miniicon/MiniIconModel;)Landroid/graphics/drawable/Drawable;", "typeToMiniIcon", "", ShareHitPoint.f121869d, "Lcom/larksuite/component/ui/avatar/AvatarType;", "unbind", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.a.a.c */
public class MiniIconBinder<T extends MiniIconModel> implements IComponentBinder<View, T> {
    @Override // com.larksuite.component.ui.list.IComponentBinder
    /* renamed from: a */
    public void mo88913a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        LKUIBadgeDrawable2.f62638a.mo89365a(view, 1).setVisible(false, false);
    }

    /* renamed from: a */
    private final int m91450a(AvatarType avatarType) {
        if (!LarkAvatar.f62479e.mo89061b() || avatarType == null) {
            return -1;
        }
        int i = C25623d.f62365a[avatarType.ordinal()];
        if (i == 1) {
            return R.drawable.icon_feed_thread;
        }
        if (i == 2) {
            return R.drawable.icon_feed_topic;
        }
        if (i != 3) {
            return -1;
        }
        return R.drawable.icon_feed_mini_app;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo88912a(Context context, T t) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        IconKeyDrawable oVar = null;
        if (t == null) {
            return null;
        }
        int a = m91450a(t.mo88919d());
        if (a > 0) {
            return ContextCompat.getDrawable(context, a);
        }
        if (!TextUtils.isEmpty(t.mo88917b()) || t.mo88920e() != null) {
            int pxValue = t.mo88918c().getPxValue(context);
            oVar = new IconKeyDrawable(context);
            oVar.mo89038a(true);
            oVar.mo89033a(t.mo88917b(), null, pxValue, pxValue, t.mo88920e());
        }
        return oVar;
    }

    /* renamed from: a */
    public void mo88915a(View view, T t) {
        GradientDrawable gradientDrawable;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(t, "model");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Drawable a = mo88912a(context, t);
        if (a != null) {
            int pxValue = t.mo88918c().getPxValue(context);
            int a2 = (int) C25653b.m91892a(context, 1.5f);
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            if (pxValue > 0) {
                int i = a2 * 2;
                if (Math.max(a.getIntrinsicWidth(), a.getIntrinsicHeight()) + i > pxValue) {
                    int i2 = pxValue - i;
                    a.setBounds(0, 0, i2, i2);
                    gradientDrawable.setSize(pxValue, pxValue);
                    gradientDrawable.setColor(ContextCompat.getColor(context, R.color.lkui_N50));
                }
            }
            int i3 = a2 * 2;
            gradientDrawable.setSize(a.getIntrinsicWidth() + i3, a.getIntrinsicWidth() + i3);
            gradientDrawable.setColor(ContextCompat.getColor(context, R.color.lkui_N50));
        } else {
            gradientDrawable = null;
        }
        if (a == null || gradientDrawable == null) {
            LKUIBadgeDrawable2.f62638a.mo89365a(view, 1).mo89355a().mo89370a(false).mo89371a();
        } else {
            LKUIBadgeDrawable2.f62638a.mo89365a(view, 1).mo89355a().mo89373b(2).mo89374b(gradientDrawable).mo89368a(a).mo89370a(true).mo89371a();
        }
    }
}
