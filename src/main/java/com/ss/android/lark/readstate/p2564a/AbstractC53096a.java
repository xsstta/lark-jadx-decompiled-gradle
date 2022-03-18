package com.ss.android.lark.readstate.p2564a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.readstate.dto.MessageReadStateResponseDTO;
import com.ss.android.lark.readstate.p2565b.C53097b;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.readstate.a.a */
public interface AbstractC53096a {
    /* renamed from: a */
    Drawable mo144087a(ChatterDescription.Type type);

    /* renamed from: a */
    DingStatus mo144088a(String str);

    /* renamed from: a */
    MessageReadStateResponseDTO mo144089a(String str, int i, String str2);

    /* renamed from: a */
    C53097b mo144090a(String str, String str2);

    /* renamed from: a */
    String mo144091a(Chatter chatter);

    /* renamed from: a */
    Map<String, ChatChatter> mo144092a(String str, List<String> list);

    /* renamed from: a */
    void mo144093a(Context context, Chatter chatter, String str);

    /* renamed from: a */
    void mo144094a(Context context, String str, String str2, ImageView imageView, int i, int i2);

    /* renamed from: a */
    void mo144095a(String str, String str2, int i, List<String> list);

    /* renamed from: a */
    boolean mo144096a(String str, String str2, int i);
}
