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
public class VCAvatarRequestUtil$3 extends XIGetDataCallback<Map<String, OpenChatter>> {

    /* renamed from: a */
    final /* synthetic */ C60835a.C60838a f152207a;

    /* renamed from: b */
    final /* synthetic */ C60835a.C60839b f152208b;

    /* renamed from: c */
    final /* synthetic */ ObservableEmitter f152209c;

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        C60700b.m235851b("VCAvatarRequestUtil", "[getChattersByIds2]", "of neo user onErrored: " + errorResult.toString());
        this.f152209c.onNext(this.f152208b);
        this.f152209c.onComplete();
    }

    @XMethod
    public void onSuccess(Map<String, OpenChatter> map) {
        String str;
        if (!(this.f152207a.f152256c == null || map == null)) {
            Iterator<String> it = this.f152207a.f152256c.iterator();
            while (it.hasNext()) {
                String next = it.next();
                OpenChatter openChatter = map.get(next);
                HashMap<String, C60835a.C60840c> hashMap = this.f152208b.f152260a.f152259f;
                C60835a.C60840c a = new C60835a.C60840c().mo208630a(next);
                if (openChatter != null) {
                    str = openChatter.getAvatarKey();
                } else {
                    str = null;
                }
                hashMap.put(next, a.mo208631b(str).mo208629a(ParticipantType.NEO_USER));
            }
        }
        this.f152209c.onNext(this.f152208b);
        this.f152209c.onComplete();
    }

    VCAvatarRequestUtil$3(C60835a.C60838a aVar, C60835a.C60839b bVar, ObservableEmitter observableEmitter) {
        this.f152207a = aVar;
        this.f152208b = bVar;
        this.f152209c = observableEmitter;
    }
}
