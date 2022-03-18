package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.dependence.IDocIconProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/ui/avatar/DocAvatarModelHandler;", "Lcom/larksuite/component/ui/avatar/AvatarModelHandler;", "Lcom/larksuite/component/ui/avatar/DocAvatarModel;", "docIconProvider", "Lcom/larksuite/component/ui/dependence/IDocIconProvider;", "(Lcom/larksuite/component/ui/dependence/IDocIconProvider;)V", "handle", "", "context", "Landroid/content/Context;", "model", "avatarVO", "Lcom/larksuite/component/ui/avatar/AvatarIconViewData;", "badgeVO", "Lcom/larksuite/component/ui/avatar/BadgeViewData;", "miniIconVO", "Lcom/larksuite/component/ui/avatar/MiniIconViewData;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.e */
public class DocAvatarModelHandler implements AvatarModelHandler<DocAvatarModel> {

    /* renamed from: a */
    private final IDocIconProvider f62428a;

    public DocAvatarModelHandler(IDocIconProvider dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "docIconProvider");
        this.f62428a = dVar;
    }

    /* renamed from: a */
    public void mo88998a(Context context, DocAvatarModel dVar, AvatarIconViewData aVar, BadgeViewData cVar, MiniIconViewData vVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(dVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar, "avatarVO");
        Intrinsics.checkParameterIsNotNull(cVar, "badgeVO");
        Intrinsics.checkParameterIsNotNull(vVar, "miniIconVO");
        Drawable drawable = ContextCompat.getDrawable(context, this.f62428a.mo89183a(dVar.mo89001a(), dVar.mo89004b()));
        if (LarkAvatar.f62479e.mo89061b()) {
            aVar.mo88992c(dVar.mo89017i());
            aVar.mo88985a(dVar.mo89009c());
            aVar.mo88989b(dVar.mo89012d());
            aVar.mo88983a(dVar.mo89015g());
            aVar.mo88987b(dVar.mo89016h());
            Drawable f = dVar.mo89014f();
            if (f != null) {
                drawable = f;
            }
            aVar.mo88988b(drawable);
        } else {
            aVar.mo88984a(drawable);
        }
        if (LarkAvatar.f62479e.mo89061b()) {
            int a = this.f62428a.mo89182a(dVar.mo89001a());
            if (a > 0) {
                vVar.mo89071a(ContextCompat.getDrawable(context, a));
            } else {
                vVar.mo89071a((Drawable) null);
            }
        } else {
            vVar.mo89071a((Drawable) null);
        }
    }
}
