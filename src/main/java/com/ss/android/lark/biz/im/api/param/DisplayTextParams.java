package com.ss.android.lark.biz.im.api.param;

import android.content.Context;
import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"Lcom/ss/android/lark/biz/im/api/param/DisplayTextParams;", "", "context", "Landroid/content/Context;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/message/Message;)V", "color", "", "getColor", "()I", "setColor", "(I)V", "getContext", "()Landroid/content/Context;", "getMessage", "()Lcom/ss/android/lark/chat/entity/message/Message;", "processDocData", "", "getProcessDocData", "()Z", "setProcessDocData", "(Z)V", "showDocName", "getShowDocName", "setShowDocName", "showDocTitle", "getShowDocTitle", "setShowDocTitle", "showEmotionDigest", "getShowEmotionDigest", "setShowEmotionDigest", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.api.param.b */
public final class DisplayTextParams {

    /* renamed from: a */
    private boolean f74255a;

    /* renamed from: b */
    private boolean f74256b;

    /* renamed from: c */
    private boolean f74257c = true;

    /* renamed from: d */
    private boolean f74258d;

    /* renamed from: e */
    private int f74259e;

    /* renamed from: f */
    private final Context f74260f;

    /* renamed from: g */
    private final Message f74261g;

    /* renamed from: d */
    public final boolean mo106743d() {
        return this.f74258d;
    }

    /* renamed from: e */
    public final int mo106744e() {
        return this.f74259e;
    }

    /* renamed from: f */
    public final Context mo106745f() {
        return this.f74260f;
    }

    /* renamed from: g */
    public final Message mo106746g() {
        return this.f74261g;
    }

    /* renamed from: a */
    public final boolean mo106738a() {
        return this.f74255a;
    }

    /* renamed from: b */
    public final boolean mo106740b() {
        return this.f74256b;
    }

    /* renamed from: c */
    public final boolean mo106742c() {
        return this.f74257c;
    }

    /* renamed from: a */
    public final void mo106737a(boolean z) {
        this.f74255a = z;
    }

    /* renamed from: b */
    public final void mo106739b(boolean z) {
        this.f74256b = z;
    }

    /* renamed from: c */
    public final void mo106741c(boolean z) {
        this.f74257c = z;
    }

    public DisplayTextParams(Context context, Message message) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(message, "message");
        this.f74260f = context;
        this.f74261g = message;
    }
}
