package com.ss.android.lark.chatwindow.view;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.eetroublecapture.AbstractC36988h;
import com.ss.android.lark.eetroublecapture.C36997n;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatwindow.view.b */
public class C35259b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatwindow.view.b$a */
    public static final class C35260a extends AbstractC36988h<AbsMessageVO> {

        /* renamed from: d */
        private int f91056d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Map<String, String> mo129761a(AbsMessageVO aVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("position", String.valueOf(this.f91056d));
            if (aVar != null) {
                linkedHashMap.put("id", aVar.mo121681a());
                linkedHashMap.put("cId", aVar.mo121696d());
                linkedHashMap.put(ShareHitPoint.f121869d, aVar.mo121710r().name());
                linkedHashMap.put("position", String.valueOf(aVar.mo121717y()));
                linkedHashMap.put("create_time", String.valueOf(aVar.mo121716x()));
                if (aVar instanceof ChatMessageVO) {
                    linkedHashMap.put("read_count", String.valueOf(((ChatMessageVO) aVar).ab()));
                }
                ContentVO g = aVar.mo121699g();
                if (g instanceof BaseTextContentVO) {
                    linkedHashMap.put("message_length", String.valueOf(((BaseTextContentVO) g).mo121781b().length()));
                }
            }
            return linkedHashMap;
        }

        public C35260a(AbsMessageVO aVar, int i) {
            super(aVar);
            this.f91056d = i;
        }
    }

    /* renamed from: a */
    public static void m137683a(View view, AbsMessageVO aVar, int i) {
        C35260a aVar2;
        if (view != null && aVar != null) {
            Object tag = view.getTag(R.id.tag_troublecapture_view);
            if (tag instanceof C35260a) {
                aVar2 = (C35260a) tag;
            } else {
                aVar2 = new C35260a(aVar, i);
            }
            aVar2.mo136501b(aVar);
            aVar2.mo136515a(true);
            aVar2.mo136516b(false);
            C36997n.m146013a(view, aVar2);
        }
    }
}
