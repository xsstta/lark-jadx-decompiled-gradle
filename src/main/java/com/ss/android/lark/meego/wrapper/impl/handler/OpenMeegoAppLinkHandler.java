package com.ss.android.lark.meego.wrapper.impl.handler;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/impl/handler/OpenMeegoAppLinkHandler;", "Lcom/ss/android/lark/applink/AppLinkHandler;", "()V", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "handle", "needBackToLark", "Companion", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.meego.wrapper.impl.a.a */
public final class OpenMeegoAppLinkHandler extends AbstractC29186b {

    /* renamed from: a */
    public static final Companion f113656a = new Companion(null);

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/impl/handler/OpenMeegoAppLinkHandler$Companion;", "", "()V", "TAG", "", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.meego.wrapper.impl.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        Log.m165389i("OpenMeegoAppLinkHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        Log.m165383e("OpenMeegoAppLinkHandler", "canOpen invalid parameter");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo103483c(android.content.Context r12, com.ss.android.lark.applink.AppLink r13) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.meego.wrapper.impl.handler.OpenMeegoAppLinkHandler.mo103483c(android.content.Context, com.ss.android.lark.applink.AppLink):boolean");
    }
}
