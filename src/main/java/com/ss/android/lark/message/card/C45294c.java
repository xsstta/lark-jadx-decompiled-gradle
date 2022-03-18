package com.ss.android.lark.message.card;

import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.Content;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.message.card.p2261a.AbstractC45287a;
import com.ss.android.lark.message.card.p2265e.C45306a;
import com.ss.android.lark.message.card.p2267g.C45312b;
import com.ss.android.lark.message.card.view.C45334d;
import com.ss.android.lark.message.card.view.C45335e;
import com.ss.android.lark.message.card.view.C45341j;
import com.ss.android.lark.message.service.AbstractC45376a;
import com.ss.android.lark.message.service.impl.CardPreload;
import com.ss.android.lark.message.vote.C45387b;
import com.ss.android.lark.message.vote.message.C45397b;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.message.card.c */
public class C45294c {

    /* renamed from: a */
    private static volatile AbstractC45287a f114671a;

    /* renamed from: b */
    private static volatile C45312b f114672b;

    /* renamed from: a */
    public static AbstractC45287a m179871a() {
        return f114671a;
    }

    /* renamed from: d */
    public void mo160040d() {
        CardPreload.f114933a.mo160211b();
    }

    /* renamed from: f */
    public static C45312b m179873f() {
        if (f114672b == null) {
            m179872e();
        }
        return f114672b;
    }

    /* renamed from: c */
    public List<IOpenMessageCellFactory> mo160039c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C45341j());
        return arrayList;
    }

    /* renamed from: e */
    public static void m179872e() {
        if (f114672b == null) {
            synchronized (C45294c.class) {
                if (f114672b == null) {
                    f114672b = new C45312b();
                    f114672b.mo160057b();
                }
            }
        }
    }

    /* renamed from: b */
    public List<IOpenMessageCellFactory> mo160038b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C45397b());
        arrayList.add(new C45334d());
        return arrayList;
    }

    public C45294c(AbstractC45287a aVar) {
        f114671a = aVar;
    }

    /* renamed from: a */
    public CardContent mo160031a(com.ss.android.lark.chat.entity.message.content.CardContent cardContent) {
        return C45306a.m179911a(cardContent);
    }

    /* renamed from: a */
    public com.ss.android.lark.chat.entity.message.content.CardContent mo160032a(CardContent cardContent) {
        return C45306a.m179921a(cardContent);
    }

    /* renamed from: a */
    public void mo160037a(Function1<? super String, Unit> function1) {
        CardMessageUtils.f114651a.mo159996a(function1);
    }

    /* renamed from: a */
    public View mo160030a(Context context, com.ss.android.lark.chat.entity.message.content.CardContent cardContent) {
        return new C45335e(context, cardContent).mo160112a();
    }

    /* renamed from: a */
    public com.ss.android.lark.chat.entity.message.content.CardContent mo160033a(C14928Entity entity, Content content) {
        return C45306a.m179922a(entity, content);
    }

    /* renamed from: a */
    public String mo160035a(String str, String str2) {
        return CardMessageUtils.f114651a.mo159995a(str, str2);
    }

    /* renamed from: a */
    public void mo160036a(RichText richText, AbstractC45376a aVar) {
        new C45387b(richText, aVar).mo160245a();
    }

    /* renamed from: a */
    public BubbleStyle mo160034a(Context context, View view, com.ss.android.lark.chat.entity.message.content.CardContent cardContent) {
        return new C45335e(context, cardContent, view).mo160113b();
    }
}
