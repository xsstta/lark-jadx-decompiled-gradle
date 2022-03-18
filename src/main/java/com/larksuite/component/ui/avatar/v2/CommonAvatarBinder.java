package com.larksuite.component.ui.avatar.v2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.larksuite.component.ui.C25622a;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.ChatterAvatarBinder;
import com.larksuite.component.ui.dependence.IAvatarLoader;
import com.larksuite.component.ui.list.IComponentBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0000*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/CommonAvatarBinder;", "V", "Landroid/widget/ImageView;", "M", "Lcom/larksuite/component/ui/avatar/AvatarModel;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "()V", "bind", "", "view", "model", "(Landroid/widget/ImageView;Lcom/larksuite/component/ui/avatar/AvatarModel;)V", "unbind", "(Landroid/widget/ImageView;)V", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.v2.d */
public class CommonAvatarBinder<V extends ImageView, M extends AvatarModel> implements IComponentBinder<V, M> {
    /* renamed from: a */
    public void mo88913a(V v) {
        Intrinsics.checkParameterIsNotNull(v, "view");
    }

    /* renamed from: a */
    public void mo88915a(V v, M m) {
        Intrinsics.checkParameterIsNotNull(v, "view");
        Intrinsics.checkParameterIsNotNull(m, "model");
        ChatterAvatarBinder.ChatterAvatarLoader a = ChatterAvatarBinder.ChatterAvatarLoader.f62490a.mo89091a(v);
        if (a != null) {
            a.mo89090b();
        }
        Context context = v.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        Drawable a2 = m.mo88944a(context);
        if (a2 != null) {
            v.setImageDrawable(a2);
        } else if (m.mo88951f()) {
            IAvatarLoader a3 = C25622a.m91437a();
            Context context2 = v.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
            a3.mo89175b(context2, v, m);
        } else {
            IAvatarLoader a4 = C25622a.m91437a();
            Context context3 = v.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
            a4.mo89174a(context3, v, m);
        }
    }
}
