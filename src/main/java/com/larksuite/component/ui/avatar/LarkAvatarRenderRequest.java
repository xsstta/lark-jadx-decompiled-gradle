package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/larksuite/component/ui/avatar/LarkAvatarRenderRequest;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarModel", "Lcom/larksuite/component/ui/avatar/FeedAvatarModel;", "getContext", "()Landroid/content/Context;", "feedBadgeModel", "Lcom/larksuite/component/ui/avatar/FeedBadgeModel;", "miniIcon", "Lcom/larksuite/component/ui/badge/miniicon/MiniIconModel;", "applyTo", "", "imageView", "Landroid/widget/ImageView;", "avatarTarget", "Lcom/larksuite/component/ui/avatar/IAvatarTarget;", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "avatar", "feedAvatarModel", "badge", "miniIconModel", "supportMiniIcon", "", ShareHitPoint.f121869d, "Lcom/larksuite/component/ui/avatar/AvatarType;", "typeToMiniIcon", "", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.t */
public final class LarkAvatarRenderRequest {

    /* renamed from: a */
    private FeedAvatarModel f62480a;

    /* renamed from: b */
    private FeedBadgeModel f62481b;

    /* renamed from: c */
    private MiniIconModel f62482c;

    /* renamed from: d */
    private final Context f62483d;

    /* renamed from: a */
    public final LarkAvatarRenderRequest mo89064a(MiniIconModel eVar) {
        this.f62482c = eVar;
        return this;
    }

    /* renamed from: a */
    public final LarkAvatarRenderRequest mo89065a(FeedAvatarModel gVar) {
        this.f62480a = gVar;
        return this;
    }

    public LarkAvatarRenderRequest(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62483d = context;
    }

    /* renamed from: a */
    public final void mo89066a(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        mo89067a(new ImageViewTarget(imageView));
    }

    /* renamed from: a */
    private final boolean m91613a(AvatarType avatarType) {
        if (LarkAvatar.f62479e.mo89061b() || avatarType == AvatarType.TOPIC || avatarType == AvatarType.THRED) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final int m91614b(AvatarType avatarType) {
        int i = C25627u.f62484a[avatarType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return -1;
                }
                return R.drawable.icon_feed_mini_app;
            } else if (LarkAvatar.f62479e.mo89063d()) {
                return R.drawable.icon_feed_topic;
            } else {
                return -1;
            }
        } else if (LarkAvatar.f62479e.mo89063d()) {
            return R.drawable.icon_feed_thread;
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo89068a(LKUIRoundedImageView lKUIRoundedImageView) {
        Intrinsics.checkParameterIsNotNull(lKUIRoundedImageView, "imageView");
        mo89067a(new RoundedImageViewTarget(lKUIRoundedImageView));
    }

    /* renamed from: a */
    public final void mo89067a(IAvatarTarget kVar) {
        int i;
        AvatarModel.Size c;
        Intrinsics.checkParameterIsNotNull(kVar, "avatarTarget");
        BadgeViewData cVar = new BadgeViewData();
        FeedBadgeModel iVar = this.f62481b;
        if (iVar != null) {
            new FeedBadgeHandler(this.f62483d).mo89019a(this.f62483d, iVar, cVar);
        }
        AvatarIconViewData aVar = new AvatarIconViewData();
        MiniIconViewData vVar = new MiniIconViewData();
        FeedAvatarModel gVar = this.f62480a;
        if (gVar != null) {
            FeedAvatarHandler a = LarkAvatar.f62479e.mo89056a(gVar.getClass());
            if (a == null) {
                a = new FeedAvatarHandler(this.f62483d);
            }
            a.mo88998a(this.f62483d, gVar, aVar, cVar, vVar);
        }
        MiniIconModel eVar = this.f62482c;
        if (eVar != null) {
            if (eVar.mo88919d() != null) {
                int b = m91614b(eVar.mo88919d());
                if (m91613a(eVar.mo88919d()) && b > 0) {
                    vVar.mo89071a(ContextCompat.getDrawable(this.f62483d, b));
                }
            } else if (!TextUtils.isEmpty(eVar.mo88917b()) || eVar.mo88920e() != null) {
                IconKeyDrawable oVar = new IconKeyDrawable(this.f62483d);
                oVar.mo89032a(eVar.mo88917b(), eVar.mo88920e());
                vVar.mo89071a(oVar);
            }
        }
        MiniIconModel eVar2 = this.f62482c;
        if (eVar2 == null || (c = eVar2.mo88918c()) == null) {
            i = 0;
        } else {
            i = c.getPxValue(this.f62483d);
        }
        vVar.mo89070a(i);
        kVar.mo89025a(cVar);
        kVar.mo89024a(aVar);
        kVar.mo89026a(vVar);
    }
}
