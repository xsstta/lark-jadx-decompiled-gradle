package com.ss.android.lark.reaction.widget.detailwindow;

import android.os.Bundle;
import com.ss.android.lark.reaction.widget.detailwindow.C52991a;
import com.ss.android.lark.reaction.widget.detailwindow.bean.C53006a;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52996b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.c */
public class C53007c implements C52991a.AbstractC52992a {

    /* renamed from: a */
    private List<ReactionDetailViewModel> f130945a;

    /* renamed from: b */
    private String f130946b;

    /* renamed from: c */
    private boolean f130947c;

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52992a
    /* renamed from: a */
    public void mo181018a() {
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52992a
    /* renamed from: b */
    public void mo181020b() {
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52992a
    /* renamed from: d */
    public String mo181022d() {
        return this.f130946b;
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52992a
    /* renamed from: c */
    public List<C53006a> mo181021c() {
        ArrayList arrayList = new ArrayList();
        for (ReactionDetailViewModel reactionDetailViewModel : this.f130945a) {
            arrayList.add(new C53006a(C52996b.m205254a(reactionDetailViewModel, this.f130947c), reactionDetailViewModel.getReactionKey(), reactionDetailViewModel.getTotalCount()));
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52992a
    /* renamed from: a */
    public void mo181019a(List<ReactionDetailViewModel> list) {
        if (list != null) {
            this.f130945a = new ArrayList(list);
        }
    }

    public C53007c(Bundle bundle) {
        if (bundle != null) {
            this.f130945a = (List) bundle.getSerializable("reaction_info_list");
            this.f130946b = bundle.getString("reaction_opened_type");
            this.f130947c = bundle.getBoolean("key_need_loading");
        }
    }
}
