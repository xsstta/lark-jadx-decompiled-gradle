package com.ss.android.lark.profile.func.share_profile.mvp;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.profile.func.share_profile.mvp.AbstractC52488a;
import com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView;

/* renamed from: com.ss.android.lark.profile.func.share_profile.mvp.c */
public class C52492c extends BasePresenter<AbstractC52488a.AbstractC52489a, AbstractC52488a.AbstractC52490b, IView.IViewDelegate> {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.mvp.BasePresenter
    public IView.IViewDelegate createViewDelegate() {
        return null;
    }

    public C52492c(Context context, ShareProfileView.AbstractC52487a aVar, FragmentManager fragmentManager) {
        m203325a(context, aVar, fragmentManager);
    }

    /* renamed from: a */
    private void m203325a(Context context, ShareProfileView.AbstractC52487a aVar, FragmentManager fragmentManager) {
        setModel(new C52491b());
        setView(new ShareProfileView(aVar, fragmentManager, ((AbstractC52488a.AbstractC52489a) getModel()).mo179503a(context)));
    }
}
