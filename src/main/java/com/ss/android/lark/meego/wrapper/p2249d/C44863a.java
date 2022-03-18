package com.ss.android.lark.meego.wrapper.p2249d;

import android.content.Intent;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.wrapper.p2246a.C44859a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.meego.wrapper.d.a */
public class C44863a implements IPlusItem {

    /* renamed from: a */
    private ISupportForItem f113636a;

    /* renamed from: b */
    private final Chat f113637b;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.meego_ic_svg_kb_plus_icon;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31051a(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        return false;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public IPlusItem.IconUrlInfo mo31053b() {
        return null;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: d */
    public boolean mo31056d() {
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return 81;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        return UIHelper.getString(R.string.Lark_Project_Projects);
    }

    public C44863a(Chat chat) {
        this.f113637b = chat;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        this.f113636a = cVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        Chat chat = this.f113637b;
        if (chat == null) {
            Log.m165383e("ProjectKbPlusItem", "chat is null");
            return;
        }
        C44859a.m177835a("keyboard_menu", C44859a.m177834a("keyboard_menu", chat, null));
        ISupportForItem cVar = this.f113636a;
        if (cVar != null) {
            cVar.mo124326a();
        }
    }
}
