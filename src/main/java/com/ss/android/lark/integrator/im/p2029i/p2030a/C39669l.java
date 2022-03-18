package com.ss.android.lark.integrator.im.p2029i.p2030a;

import android.content.Context;
import android.widget.ImageView;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.integrator.im.i.a.l */
public class C39669l implements AbstractC38037a.AbstractC38054n {
    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38054n
    /* renamed from: a */
    public void mo139262a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
        C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(UIHelper.dp2px((float) i)).mo105422b(UIHelper.dp2px((float) i2)).mo105416a(new ListenerParams.Builder().mo105397a(Scene.Feed).mo105398a(ListenerParams.FromType.AVATAR).mo105402a()));
    }
}
