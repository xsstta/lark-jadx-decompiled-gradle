package com.ss.android.lark.message.card.p2261a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.message.card.a.a */
public interface AbstractC45287a {

    /* renamed from: com.ss.android.lark.message.card.a.a$a */
    public interface AbstractC45288a {
        /* renamed from: a */
        void mo143907a(List<String> list);
    }

    /* renamed from: a */
    Context mo143887a();

    /* renamed from: a */
    RichText mo143888a(com.ss.android.lark.widget.richtext.RichText richText);

    /* renamed from: a */
    com.ss.android.lark.widget.richtext.RichText mo143889a(RichText richText);

    /* renamed from: a */
    com.ss.android.lark.widget.richtext.RichText mo143890a(RichText richText, HashMap hashMap);

    /* renamed from: a */
    String mo143891a(DomainSettings.Alias alias);

    /* renamed from: a */
    void mo143892a(Activity activity, String str, IGetDataCallback<List<ChatChatter>> iGetDataCallback);

    /* renamed from: a */
    void mo143893a(Activity activity, List<String> list, IGetDataCallback<List<ChatChatter>> iGetDataCallback);

    /* renamed from: a */
    void mo143894a(Context context);

    /* renamed from: a */
    void mo143895a(Context context, String str, String str2);

    /* renamed from: a */
    void mo143896a(Context context, String str, boolean z, boolean z2, Boolean bool);

    /* renamed from: a */
    void mo143897a(View view, View view2, int[] iArr);

    /* renamed from: a */
    void mo143898a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    boolean mo143899a(String str);

    /* renamed from: a */
    boolean mo143900a(String str, boolean z);

    /* renamed from: b */
    String mo143901b();

    /* renamed from: c */
    String mo143902c();

    /* renamed from: d */
    String mo143903d();

    /* renamed from: e */
    Locale mo143904e();

    /* renamed from: f */
    int mo143905f();

    /* renamed from: g */
    AbstractC45288a mo143906g();
}
