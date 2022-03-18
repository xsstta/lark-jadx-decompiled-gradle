package com.bytedance.ee.bear.list.mine;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.FolderDetailItemDiffCallback;
import com.bytedance.ee.bear.list.homepage.banner.BannerAdapter;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerView;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.mine.c */
public class C8614c extends BaseBannerView<BannerAdapter, IBannerContract.IView.Delegate> {
    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: e */
    public String mo33128e() {
        return mo33129f().getString(R.string.Doc_List_My_Folder);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView
    /* renamed from: a */
    public void mo33122a(ArrayList<Document> arrayList) {
        C1374g.m6297a(new FolderDetailItemDiffCallback(this.f22879c.mo70673b(), arrayList)).mo7412a(this.f22879c);
        this.f22879c.mo33079a((List<? extends Document>) arrayList);
    }

    C8614c(Context context, View view, C10917c cVar) {
        super(context, view, cVar);
    }
}
