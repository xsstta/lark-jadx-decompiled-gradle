package com.ss.android.lark.feed.interfaces;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.biz.im.api.AbstractC29617j;
import com.ss.android.lark.biz.im.api.AbstractC29618k;
import com.ss.android.lark.biz.im.api.AbstractC29619l;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;

/* renamed from: com.ss.android.lark.feed.interfaces.i */
public interface AbstractC38098i {

    /* renamed from: com.ss.android.lark.feed.interfaces.i$a */
    public interface AbstractC38099a {
        /* renamed from: a */
        void mo139422a();
    }

    /* renamed from: com.ss.android.lark.feed.interfaces.i$b */
    public interface AbstractC38100b {
        void onBadgeChange(int i);
    }

    /* renamed from: a */
    AbstractC29619l mo137442a(FeedCard.FeedType feedType, FeedCard.Type type);

    /* renamed from: a */
    AbstractC44552i mo137443a(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    /* renamed from: a */
    void mo137444a(Context context);

    /* renamed from: a */
    void mo137445a(AbstractC29617j jVar);

    /* renamed from: a */
    void mo137446a(AbstractC29618k kVar);

    /* renamed from: a */
    void mo137447a(AbstractC38100b bVar);

    /* renamed from: a */
    boolean mo137448a(Fragment fragment);

    /* renamed from: a */
    boolean mo137449a(FeedCard.FeedType feedType);

    /* renamed from: b */
    void mo137450b();

    /* renamed from: b */
    void mo137451b(AbstractC29617j jVar);

    /* renamed from: b */
    void mo137452b(AbstractC29618k kVar);

    /* renamed from: b */
    void mo137453b(AbstractC38100b bVar);

    /* renamed from: c */
    void mo137454c();

    /* renamed from: f */
    void mo137457f();

    /* renamed from: g */
    boolean mo137458g();

    /* renamed from: h */
    String mo137459h();

    /* renamed from: i */
    int mo137460i();

    /* renamed from: j */
    int mo137461j();

    /* renamed from: l */
    String mo137463l();
}
