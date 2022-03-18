package com.ss.android.vc.common.widget.avatarlist;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.avatarlist.C60835a;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;
import io.reactivex.ObservableEmitter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public class VCAvatarRequestUtil$1 extends XIGetDataCallback<Map<String, OpenChatter>> {

    /* renamed from: a */
    final /* synthetic */ C60835a.C60838a f152204a;

    /* renamed from: b */
    final /* synthetic */ C60835a.C60839b f152205b;

    /* renamed from: c */
    final /* synthetic */ ObservableEmitter f152206c;

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        C60700b.m235864f("VCAvatarRequestUtil", "[getChattersByIds]", "of lark user onErrored: " + errorResult.toString());
        this.f152206c.onNext(this.f152205b);
        this.f152206c.onComplete();
    }

    @XMethod
    public void onSuccess(Map<String, OpenChatter> map) {
        String str;
        if (!(this.f152204a.f152254a == null || map == null)) {
            Iterator<String> it = this.f152204a.f152254a.iterator();
            while (it.hasNext()) {
                String next = it.next();
                OpenChatter openChatter = map.get(next);
                HashMap<String, C60835a.C60840c> hashMap = this.f152205b.f152260a.f152259f;
                C60835a.C60840c a = new C60835a.C60840c().mo208630a(next);
                String str2 = null;
                if (openChatter != null) {
                    str = openChatter.getAvatarKey();
                } else {
                    str = null;
                }
                C60835a.C60840c b = a.mo208631b(str);
                if (openChatter != null) {
                    str2 = openChatter.getLocalizedName();
                }
                hashMap.put(next, b.mo208632c(str2).mo208629a(ParticipantType.LARK_USER));
            }
        }
        this.f152206c.onNext(this.f152205b);
        this.f152206c.onComplete();
    }

    VCAvatarRequestUtil$1(C60835a.C60838a aVar, C60835a.C60839b bVar, ObservableEmitter observableEmitter) {
        this.f152204a = aVar;
        this.f152205b = bVar;
        this.f152206c = observableEmitter;
    }
}
