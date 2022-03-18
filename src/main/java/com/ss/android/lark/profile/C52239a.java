package com.ss.android.lark.profile;

import android.os.Bundle;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.C52261a;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileActivityV3;
import com.ss.android.lark.profile.func.v3.userprofile.service.UserProfileService;
import com.ss.android.lark.profile.message.C52886b;
import com.ss.android.lark.profile.message.C52888c;
import com.ss.android.lark.profile.service.AbstractC52890a;
import com.ss.android.lark.profile.service.C52893d;
import com.ss.android.lark.profile.service.C52904e;
import com.ss.android.lark.profile.service.IProfileManisService;
import ee.android.framework.manis.C68183b;
import java.util.Map;

/* renamed from: com.ss.android.lark.profile.a */
public class C52239a {

    /* renamed from: a */
    private IProfileModuleDependency f129587a;

    /* renamed from: e */
    public IProfileModuleDependency mo178823e() {
        return this.f129587a;
    }

    /* renamed from: d */
    public static IProfileModuleDependency m202617d() {
        return C52242b.m202631b();
    }

    /* renamed from: f */
    public static Map<String, Boolean> m202618f() {
        return C52261a.m202786a();
    }

    /* renamed from: b */
    public AbstractC29542ad mo178821b() {
        return C52904e.m204638a();
    }

    /* renamed from: g */
    public IOpenMessageCellFactory mo178824g() {
        return new C52888c();
    }

    /* renamed from: h */
    public boolean mo178825h() {
        return m202617d().mo133561a("messenger.profile.badge");
    }

    /* renamed from: a */
    public AbstractC52890a mo178819a() {
        return C52893d.m204612b();
    }

    /* renamed from: c */
    public IProfileManisService mo178822c() {
        return (IProfileManisService) C68183b.m264839a().mo237086a(m202617d().mo133562b(), IProfileManisService.class);
    }

    public C52239a(IProfileModuleDependency iProfileModuleDependency) {
        this.f129587a = iProfileModuleDependency;
    }

    /* renamed from: a */
    public Bundle mo178817a(UserCustomStatus userCustomStatus) {
        return UserProfileActivityV3.m204078a(userCustomStatus);
    }

    /* renamed from: a */
    public IPlusItem mo178818a(Chat chat) {
        return new C52886b(chat);
    }

    /* renamed from: a */
    public void mo178820a(String str, IGetDataCallback<String> iGetDataCallback) {
        UserProfileService.f130437a.mo180108a(str, iGetDataCallback);
    }
}
