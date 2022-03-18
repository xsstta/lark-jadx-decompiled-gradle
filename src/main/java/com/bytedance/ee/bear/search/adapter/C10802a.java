package com.bytedance.ee.bear.search.adapter;

import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.component.universe_design.image.UDAvatarList;
import com.larksuite.suite.R;
import com.ss.android.lark.image.entity.AvatarImage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.search.adapter.a */
public class C10802a extends UDAvatarList.AvatarAdapter<C10803a> {
    public C10802a() {
        super(-3, new ArrayList());
    }

    /* renamed from: b */
    public void mo40893b(List<OwnerInfo> list) {
        List a = mo91010a();
        if (a != null) {
            a.clear();
            for (OwnerInfo ownerInfo : list) {
                a.add(new C10803a(ownerInfo.getOwnerId(), ownerInfo.getAvatarKey()));
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo40892a(List<ChatInfo> list) {
        String str;
        List a = mo91010a();
        if (a != null) {
            a.clear();
            for (ChatInfo chatInfo : list) {
                if (chatInfo.getChatType() == ChatInfo.ChatType.SINGLE_CHAT.getValue()) {
                    str = chatInfo.getP2pChatterId();
                } else {
                    str = chatInfo.getChatId();
                }
                a.add(new C10803a(str, chatInfo.getAvatarKey()));
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.ee.bear.search.adapter.a$a */
    public static class C10803a {

        /* renamed from: a */
        String f28961a;

        /* renamed from: b */
        String f28962b;

        C10803a(String str, String str2) {
            this.f28961a = str == null ? "" : str;
            this.f28962b = str2 == null ? "" : str2;
        }
    }

    @Override // com.larksuite.component.universe_design.image.UDAvatarList.AvatarAdapter
    /* renamed from: a */
    public void mo18933a(UDAvatar uDAvatar, int i) {
        C10803a aVar = (C10803a) getItem(i);
        if (aVar != null) {
            ((C2124f) ComponentCallbacks2C2115c.m9151c(uDAvatar.getContext()).mo10414a(AvatarImage.Builder.obtain(aVar.f28962b, aVar.f28961a, 240, 240).build()).mo11123a((int) R.drawable.search_owner_place_holder)).mo10399a((ImageView) uDAvatar);
        }
    }
}
