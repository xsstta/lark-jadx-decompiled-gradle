package com.ss.android.lark.pin.impl.entity;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.doc.entity.DocResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0000H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0000H\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\r¨\u0006&"}, d2 = {"Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "Lcom/larksuite/framework/utils/diff/Diffable;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "pin", "Lcom/ss/android/lark/pin/impl/entity/Pin;", "senderDisplayName", "", "avatarKey", "entityId", "(Lcom/ss/android/lark/chat/entity/message/Message;Lcom/ss/android/lark/pin/impl/entity/Pin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Lcom/ss/android/lark/chat/entity/message/Message;Lcom/ss/android/lark/pin/impl/entity/Pin;Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "getEntityId", "setEntityId", "fromChatName", "getFromChatName", "setFromChatName", "isPreview", "", "()Z", "setPreview", "(Z)V", "getMessage", "()Lcom/ss/android/lark/chat/entity/message/Message;", "getPin", "()Lcom/ss/android/lark/pin/impl/entity/Pin;", "setPin", "(Lcom/ss/android/lark/pin/impl/entity/Pin;)V", "getSenderDisplayName", "getDocResult", "Lcom/ss/android/lark/doc/entity/DocResult;", "isContentSame", "diffable", "isItemSame", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.entity.b */
public class PinInfo implements AbstractC26248b<PinInfo> {

    /* renamed from: a */
    private boolean f128189a;

    /* renamed from: b */
    private String f128190b;

    /* renamed from: c */
    private String f128191c;

    /* renamed from: d */
    private String f128192d;

    /* renamed from: e */
    private final Message f128193e;

    /* renamed from: f */
    private Pin f128194f;

    /* renamed from: g */
    private final String f128195g;

    /* renamed from: b */
    public final boolean mo177391b() {
        return this.f128189a;
    }

    /* renamed from: c */
    public final String mo177392c() {
        return this.f128190b;
    }

    /* renamed from: d */
    public final String mo177393d() {
        return this.f128191c;
    }

    /* renamed from: e */
    public final String mo177394e() {
        return this.f128192d;
    }

    /* renamed from: g */
    public final Message mo177396g() {
        return this.f128193e;
    }

    /* renamed from: h */
    public final Pin mo177397h() {
        return this.f128194f;
    }

    /* renamed from: i */
    public final String mo177398i() {
        return this.f128195g;
    }

    /* renamed from: f */
    public final DocResult mo177395f() {
        Message.Type type = this.f128193e.getType();
        if (type != null) {
            int i = C51508c.f128196a[type.ordinal()];
            if (i == 1) {
                return ((TextContent) this.f128193e.getContent()).getDocResult();
            }
            if (i == 2) {
                return ((PostContent) this.f128193e.getContent()).getDocResult();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo177388a(Pin pin) {
        this.f128194f = pin;
    }

    /* renamed from: a */
    public final void mo177389a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128192d = str;
    }

    /* renamed from: a */
    public final void mo177390a(boolean z) {
        this.f128189a = z;
    }

    /* renamed from: a */
    public boolean isContentSame(PinInfo bVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "diffable");
        if (!Intrinsics.areEqual(this.f128193e.getId(), bVar.f128193e.getId())) {
            return false;
        }
        Pin pin = this.f128194f;
        if (pin == null && bVar.f128194f == null) {
            return true;
        }
        Pin pin2 = bVar.f128194f;
        if (pin2 != null) {
            z = pin2.isContentSame(pin);
        } else {
            z = false;
        }
        if (!z || !this.f128193e.isContentSame(bVar.f128193e)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean isItemSame(PinInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "diffable");
        if (!Intrinsics.areEqual(this.f128193e.getId(), bVar.f128193e.getId())) {
            return false;
        }
        Pin pin = this.f128194f;
        if (pin == null && bVar.f128194f == null) {
            return true;
        }
        Pin pin2 = bVar.f128194f;
        if (pin2 != null) {
            return pin2.isItemSame(pin);
        }
        return false;
    }

    public PinInfo(Message message, Pin pin, String str) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(str, "senderDisplayName");
        this.f128193e = message;
        this.f128194f = pin;
        this.f128195g = str;
        this.f128190b = "";
        this.f128191c = "";
        this.f128192d = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PinInfo(Message message, Pin pin, String str, String str2, String str3) {
        this(message, pin, str);
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(str, "senderDisplayName");
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str3, "entityId");
        this.f128191c = str2;
        this.f128190b = str3;
    }
}
