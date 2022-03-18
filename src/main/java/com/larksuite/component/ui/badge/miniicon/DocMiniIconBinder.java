package com.larksuite.component.ui.badge.miniicon;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.C25622a;
import com.larksuite.component.ui.avatar.LarkAvatar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/larksuite/component/ui/badge/miniicon/DocMiniIconBinder;", "Lcom/larksuite/component/ui/badge/miniicon/MiniIconBinder;", "Lcom/larksuite/component/ui/badge/miniicon/DocMiniIcon;", "()V", "getIconDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "model", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.a.a.b */
public final class DocMiniIconBinder extends MiniIconBinder<DocMiniIcon> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo88912a(Context context, DocMiniIcon aVar) {
        int a;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Drawable drawable = null;
        if (!LarkAvatar.f62479e.mo89061b() || aVar == null || (a = C25622a.m91439b().mo89182a(aVar.mo88910a())) <= 0) {
            return drawable;
        }
        return ContextCompat.getDrawable(context, a);
    }
}
