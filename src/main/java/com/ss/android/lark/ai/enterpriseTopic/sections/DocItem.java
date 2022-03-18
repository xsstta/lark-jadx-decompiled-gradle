package com.ss.android.lark.ai.enterpriseTopic.sections;

import android.view.View;
import com.larksuite.component.ui.avatar.v2.DocAvatar;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.pb.entities.DocType;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/sections/DocItem;", "Lcom/ss/android/lark/ai/enterpriseTopic/sections/ElementItem;", "title", "", "url", "showDivider", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getUrl", "bind", "", "holder", "Lcom/ss/android/lark/widget/recyclerview/item/ItemViewHolder;", "position", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.enterpriseTopic.b.a */
public final class DocItem extends ElementItem {

    /* renamed from: a */
    private final String f71782a;

    /* renamed from: b */
    private final String f71783b;

    /* renamed from: f */
    private final boolean f71784f;

    /* renamed from: a */
    public final String mo101670a() {
        return this.f71783b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.b.a$a */
    static final class View$OnClickListenerC28554a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocItem f71785a;

        View$OnClickListenerC28554a(DocItem aVar) {
            this.f71785a = aVar;
        }

        public final void onClick(View view) {
            AbstractC28534a b = this.f71785a.mo101673b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                b.mo101560b(view.getContext(), this.f71785a.mo101670a());
            }
        }
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        cVar.itemView.setOnClickListener(new View$OnClickListenerC28554a(this));
        AvatarItemView avatarItemView = (AvatarItemView) cVar.mo200081a(R.id.avatar_item_view);
        avatarItemView.mo184670a(new TitleModel(this.f71782a, false, null, 0, 14, null));
        avatarItemView.mo184662a(new DocAvatar.Builder().mo89097c(DocType.DOC.getValue()).mo89098c(this.f71782a).mo88976k());
        avatarItemView.mo184680b(this.f71784f);
        avatarItemView.setBackgroundResource(R.drawable.section_item_selector_bg);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocItem(String str, String str2, boolean z) {
        super(R.layout.link_layout);
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        this.f71782a = str;
        this.f71783b = str2;
        this.f71784f = z;
    }
}
