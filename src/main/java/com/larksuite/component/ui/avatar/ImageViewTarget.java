package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.component.ui.avatar.IconLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0004\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/ui/avatar/ImageViewTarget;", "T", "Landroid/widget/ImageView;", "Lcom/larksuite/component/ui/avatar/SimpleTarget;", "imageView", "(Landroid/widget/ImageView;)V", "Landroid/widget/ImageView;", "setAvatarIcon", "", "iconViewData", "Lcom/larksuite/component/ui/avatar/AvatarIconViewData;", "setBadge", "badgeViewData", "Lcom/larksuite/component/ui/avatar/BadgeViewData;", "setMiniIcon", "miniIconViewData", "Lcom/larksuite/component/ui/avatar/MiniIconViewData;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.r */
public class ImageViewTarget<T extends ImageView> extends SimpleTarget {

    /* renamed from: a */
    private final T f62474a;

    @Override // com.larksuite.component.ui.avatar.IAvatarTarget, com.larksuite.component.ui.avatar.SimpleTarget
    /* renamed from: a */
    public void mo89025a(BadgeViewData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "badgeViewData");
    }

    public ImageViewTarget(T t) {
        Intrinsics.checkParameterIsNotNull(t, "imageView");
        this.f62474a = t;
    }

    @Override // com.larksuite.component.ui.avatar.IAvatarTarget, com.larksuite.component.ui.avatar.SimpleTarget
    /* renamed from: a */
    public void mo89024a(AvatarIconViewData aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "iconViewData");
        if (aVar.mo88982a() != null) {
            this.f62474a.setImageDrawable(aVar.mo88982a());
            return;
        }
        String b = aVar.mo88986b();
        if (b == null || b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IconLoader.Companion aVar2 = IconLoader.f62473a;
            Context context = this.f62474a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "imageView.context");
            aVar2.mo89055a(context).mo89048a(aVar.mo88995f(), aVar.mo88996g()).mo89050a(aVar.mo88986b()).mo89053b(aVar.mo88990c()).mo89054c(aVar.mo88993d()).mo89049a(aVar.mo88994e()).mo89051a(this.f62474a);
            return;
        }
        this.f62474a.setImageDrawable(aVar.mo88994e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // com.larksuite.component.ui.avatar.IAvatarTarget, com.larksuite.component.ui.avatar.SimpleTarget
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89026a(com.larksuite.component.ui.avatar.MiniIconViewData r12) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.ui.avatar.ImageViewTarget.mo89026a(com.larksuite.component.ui.avatar.v):void");
    }
}
