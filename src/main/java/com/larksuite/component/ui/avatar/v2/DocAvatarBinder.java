package com.larksuite.component.ui.avatar.v2;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.component.ui.C25622a;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.avatar.v2.ChatterAvatarBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/DocAvatarBinder;", "Lcom/larksuite/component/ui/avatar/v2/CommonAvatarBinder;", "Landroid/widget/ImageView;", "Lcom/larksuite/component/ui/avatar/v2/DocAvatar;", "()V", "bind", "", "view", "model", "unbind", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.v2.f */
public final class DocAvatarBinder extends CommonAvatarBinder<ImageView, DocAvatar> {
    @Override // com.larksuite.component.ui.avatar.v2.CommonAvatarBinder
    /* renamed from: a */
    public void mo88913a(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "view");
    }

    /* renamed from: a */
    public void mo89085a(ImageView imageView, DocAvatar eVar) {
        String a;
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        Intrinsics.checkParameterIsNotNull(eVar, "model");
        ChatterAvatarBinder.ChatterAvatarLoader a2 = ChatterAvatarBinder.ChatterAvatarLoader.f62490a.mo89091a(imageView);
        if (a2 != null) {
            a2.mo89090b();
        }
        Context context = imageView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        if (eVar.mo88944a(context) != null || (LarkAvatar.f62479e.mo89061b() && (a = eVar.mo88945a()) != null && !StringsKt.isBlank(a))) {
            super.mo88915a(imageView, (AvatarModel) eVar);
        } else {
            imageView.setImageResource(C25622a.m91439b().mo89183a(eVar.mo89095i(), eVar.mo89096j()));
        }
    }
}
