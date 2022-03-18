package com.ss.android.lark.ai.enterpriseTopic.sections;

import android.text.TextUtils;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.enterpriseTopic.sections.GeneralAvatar;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.pb.ai.RichLink;
import com.ss.android.lark.pb.entities.Image;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/sections/RichLinkItem;", "Lcom/ss/android/lark/ai/enterpriseTopic/sections/ElementItem;", "richLink", "Lcom/ss/android/lark/pb/ai/RichLink;", "showDivider", "", "(Lcom/ss/android/lark/pb/ai/RichLink;Z)V", "bind", "", "holder", "Lcom/ss/android/lark/widget/recyclerview/item/ItemViewHolder;", "position", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.enterpriseTopic.b.f */
public final class RichLinkItem extends ElementItem {

    /* renamed from: a */
    private final RichLink f71793a;

    /* renamed from: b */
    private final boolean f71794b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/ai/enterpriseTopic/sections/RichLinkItem$bind$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.b.f$a */
    static final class View$OnClickListenerC28556a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f71795a;

        /* renamed from: b */
        final /* synthetic */ RichLinkItem f71796b;

        /* renamed from: c */
        final /* synthetic */ C58974c f71797c;

        View$OnClickListenerC28556a(String str, RichLinkItem fVar, C58974c cVar) {
            this.f71795a = str;
            this.f71796b = fVar;
            this.f71797c = cVar;
        }

        public final void onClick(View view) {
            AbstractC28534a b = this.f71796b.mo101673b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                b.mo101562c(view.getContext(), this.f71795a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichLinkItem(RichLink richLink, boolean z) {
        super(R.layout.link_layout);
        Intrinsics.checkParameterIsNotNull(richLink, "richLink");
        this.f71793a = richLink;
        this.f71794b = z;
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        if (!TextUtils.isEmpty(this.f71793a.mchat_applink)) {
            str = this.f71793a.mchat_applink;
        } else {
            str = this.f71793a.murl;
        }
        if (str != null) {
            cVar.itemView.setOnClickListener(new View$OnClickListenerC28556a(str, this, cVar));
        }
        AvatarItemView avatarItemView = (AvatarItemView) cVar.mo200081a(R.id.avatar_item_view);
        avatarItemView.mo184670a(new TitleModel(this.f71793a.mtitle, false, null, 0, 14, null));
        GeneralAvatar.Builder aVar = new GeneralAvatar.Builder();
        Image image = this.f71793a.mavatar;
        if (image != null) {
            str2 = image.mkey;
        } else {
            str2 = null;
        }
        avatarItemView.mo184662a(((GeneralAvatar.Builder) ((GeneralAvatar.Builder) aVar.mo88962a(str2)).mo88967b("")).mo88976k());
        avatarItemView.mo184680b(this.f71794b);
        avatarItemView.setBackgroundResource(R.drawable.section_item_selector_bg);
    }
}
