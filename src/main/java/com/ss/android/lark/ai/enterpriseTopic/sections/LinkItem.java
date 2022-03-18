package com.ss.android.lark.ai.enterpriseTopic.sections;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.enterpriseTopic.sections.GeneralAvatar;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/sections/LinkItem;", "Lcom/ss/android/lark/ai/enterpriseTopic/sections/ElementItem;", "title", "", "url", ShareHitPoint.f121869d, "showDivider", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getType", "getUrl", "bind", "", "holder", "Lcom/ss/android/lark/widget/recyclerview/item/ItemViewHolder;", "position", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.enterpriseTopic.b.e */
public final class LinkItem extends ElementItem {

    /* renamed from: a */
    private final String f71788a;

    /* renamed from: b */
    private final String f71789b;

    /* renamed from: f */
    private final String f71790f;

    /* renamed from: g */
    private final boolean f71791g;

    /* renamed from: a */
    public final String mo101674a() {
        return this.f71789b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.b.e$a */
    static final class View$OnClickListenerC28555a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkItem f71792a;

        View$OnClickListenerC28555a(LinkItem eVar) {
            this.f71792a = eVar;
        }

        public final void onClick(View view) {
            AbstractC28534a b = this.f71792a.mo101673b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                b.mo101560b(view.getContext(), this.f71792a.mo101674a());
            }
        }
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        cVar.itemView.setOnClickListener(new View$OnClickListenerC28555a(this));
        AvatarItemView avatarItemView = (AvatarItemView) cVar.mo200081a(R.id.avatar_item_view);
        avatarItemView.mo184670a(new TitleModel(this.f71788a, false, null, 0, 14, null));
        avatarItemView.mo184662a(((GeneralAvatar.Builder) new GeneralAvatar.Builder().mo88957a(R.drawable.ic_link)).mo88976k());
        avatarItemView.mo184680b(this.f71791g);
        avatarItemView.setBackgroundResource(R.drawable.section_item_selector_bg);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkItem(String str, String str2, String str3, boolean z) {
        super(R.layout.link_layout);
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121869d);
        this.f71788a = str;
        this.f71789b = str2;
        this.f71790f = str3;
        this.f71791g = z;
    }
}
