package com.ss.android.lark.ai.enterpriseTopic.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.enterpriseTopic.p1337a.AbstractC28552a;
import com.ss.android.lark.ai.p1330d.p1332b.C28540a;
import com.ss.android.lark.pb.ai.EntityCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/view/NewEntityWordComponent;", "Lcom/ss/android/lark/ai/enterpriseTopic/view/EntityWordComponent;", "context", "Landroid/content/Context;", "api", "Lcom/ss/android/lark/ai/enterpriseTopic/api/IEnterpriseTopicAPI;", "hitAPI", "Lcom/ss/android/lark/ai/statistics/enterpriseTopic/EnterpriseTopicHitPoint;", "cards", "", "Lcom/ss/android/lark/pb/ai/EntityCard;", "layoutId", "", "ratingUI", "Landroid/view/View;", "(Landroid/content/Context;Lcom/ss/android/lark/ai/enterpriseTopic/api/IEnterpriseTopicAPI;Lcom/ss/android/lark/ai/statistics/enterpriseTopic/EnterpriseTopicHitPoint;Ljava/util/List;ILandroid/view/View;)V", "bindUI", "", "initialize", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.e */
public final class NewEntityWordComponent extends EntityWordComponent {

    /* renamed from: g */
    private final View f71907g;

    @Override // com.ss.android.lark.ai.enterpriseTopic.view.EntityWordComponent
    /* renamed from: b */
    public void mo101717b() {
        int i;
        super.mo101717b();
        View a = mo101711a();
        if (a != null) {
            if (mo101725h().size() > 1) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
        }
    }

    @Override // com.ss.android.lark.ai.enterpriseTopic.view.EntityWordComponent
    /* renamed from: c */
    public void mo101720c() {
        super.mo101720c();
        mo101715a((TextView) this.f71907g.findViewById(R.id.tv_upCount));
        mo101714a((ImageView) this.f71907g.findViewById(R.id.iv_thumbUp));
        mo101718b((ImageView) this.f71907g.findViewById(R.id.iv_thumbDown));
        mo101713a(this.f71907g.findViewById(R.id.ll_like));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewEntityWordComponent(Context context, AbstractC28552a aVar, C28540a aVar2, List<EntityCard> list, int i, View view) {
        super(context, aVar, aVar2, list, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "api");
        Intrinsics.checkParameterIsNotNull(aVar2, "hitAPI");
        Intrinsics.checkParameterIsNotNull(list, "cards");
        Intrinsics.checkParameterIsNotNull(view, "ratingUI");
        this.f71907g = view;
    }
}
