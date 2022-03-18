package com.ss.android.lark.chat.p1605c.p1606a;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33113b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33116e;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33117f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33121j;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33123l;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33124m;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33126o;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33127p;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33129r;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.message_menu.provider.ChatMutePlayActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatReplyActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatTranslateActionProvider;
import com.ss.android.lark.chat.message_menu.provider.HidePreviewActionProvider;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;

/* renamed from: com.ss.android.lark.chat.c.a.a */
public abstract class AbstractC33010a extends ActionContext implements ChatMutePlayActionProvider.MutePlayContext, ChatReplyActionProvider.ReplyContext, ChatTranslateActionProvider.TranslateContext, HidePreviewActionProvider.HidePreviewContext, AbstractC33113b, AbstractC33116e, AbstractC33117f, AbstractC33121j, AbstractC33123l, AbstractC33124m, AbstractC33126o, AbstractC33127p, AbstractC33129r, AbstractC33132u, IEditImageMenuHandler {

    /* renamed from: a */
    private ActionContext.PageType f84897a;

    /* renamed from: b */
    private AbstractC33342d f84898b;

    /* renamed from: c */
    private AbstractC33120i f84899c;

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: d */
    public ActionContext.PageType mo106784d() {
        return this.f84897a;
    }

    @Override // com.ss.android.lark.chat.message_menu.provider.HidePreviewActionProvider.HidePreviewContext
    /* renamed from: q */
    public AbstractC33342d mo121947q() {
        return this.f84898b;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: b */
    public Context mo106782b() {
        return this.f84898b.mo122543g();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: c */
    public FragmentActivity mo106783c() {
        return this.f84898b.mo122543g();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: e */
    public Chat mo106785e() {
        return this.f84898b.mo122550n();
    }

    @Override // com.ss.android.lark.chat.message_menu.provider.ChatReplyActionProvider.ReplyContext
    /* renamed from: r */
    public OpenApp mo121948r() {
        return this.f84898b.mo122556t();
    }

    /* renamed from: s */
    public Boolean mo121949s() {
        return Boolean.valueOf(this.f84898b.mo122554r());
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33121j
    /* renamed from: a */
    public void mo121935a(int i) {
        this.f84899c.mo121935a(i);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33124m
    /* renamed from: d */
    public void mo121943d(String str) {
        this.f84899c.mo121943d(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33113b
    public void e_(String str) {
        this.f84899c.e_(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33129r
    /* renamed from: f */
    public void mo121946f(String str) {
        this.f84899c.mo121946f(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33116e
    /* renamed from: b */
    public void mo121940b(String str) {
        this.f84899c.mo121940b(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33117f
    /* renamed from: c */
    public void mo121942c(String str) {
        this.f84899c.mo121942c(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33127p
    /* renamed from: e */
    public void mo121944e(String str) {
        this.f84899c.mo121944e(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
    /* renamed from: a */
    public void mo121937a(PhotoItem photoItem, boolean z) {
        this.f84899c.mo121937a(photoItem, z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u
    /* renamed from: b */
    public void mo121941b(String str, boolean z) {
        this.f84899c.mo121941b(str, z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33126o
    /* renamed from: a */
    public void mo121938a(String str, int i) {
        this.f84899c.mo121938a(str, i);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33123l
    /* renamed from: a */
    public void mo121939a(String str, boolean z) {
        this.f84899c.mo121939a(str, z);
    }

    @Override // com.ss.android.lark.chat.message_menu.provider.ChatTranslateActionProvider.TranslateContext
    /* renamed from: a */
    public void mo121936a(View view, AbstractC59010e eVar, AbsMessageVO aVar) {
        this.f84899c.mo122321a(view, eVar, aVar);
    }

    public AbstractC33010a(AbstractView$OnClickListenerC59005c cVar, C59008d dVar, ActionContext.PageType pageType, AbstractC33342d dVar2, AbstractC33120i iVar) {
        super(cVar, dVar);
        this.f84897a = pageType;
        this.f84898b = dVar2;
        this.f84899c = iVar;
    }
}
