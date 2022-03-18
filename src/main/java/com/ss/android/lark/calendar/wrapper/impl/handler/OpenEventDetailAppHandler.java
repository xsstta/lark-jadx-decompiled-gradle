package com.ss.android.lark.calendar.wrapper.impl.handler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.calendar.wrapper.C32674a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u001c\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/handler/OpenEventDetailAppHandler;", "Lcom/ss/android/lark/applink/AppLinkHandler;", "wrapper", "Lcom/ss/android/lark/calendar/wrapper/CalendarModuleWrapper;", "(Lcom/ss/android/lark/calendar/wrapper/CalendarModuleWrapper;)V", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "getLongFromStr", "", "longStr", "", "defaultValue", "handle", "needBackToLark", "Companion", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.a.j */
public final class OpenEventDetailAppHandler extends AbstractC29186b {

    /* renamed from: a */
    public static final Companion f83839a = new Companion(null);

    /* renamed from: b */
    private final C32674a f83840b;

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/handler/OpenEventDetailAppHandler$Companion;", "", "()V", "TAG", "", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.a.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OpenEventDetailAppHandler(C32674a aVar) {
        this.f83840b = aVar;
    }

    /* renamed from: a */
    private final long m125454a(String str, long j) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            Log.m165383e("OpenEventDetailAppHandler", "invalid longStr");
            return j;
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        Log.m165389i("OpenEventDetailAppHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        Log.m165383e("OpenEventDetailAppHandler", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        String str;
        String str2;
        String str3;
        String str4;
        Log.m165389i("OpenEventDetailAppHandler", "handle");
        if (context == null || appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            Log.m165383e("OpenEventDetailAppHandler", "handle invalid parameter");
            return false;
        }
        Uri parse = Uri.parse(appLink.mo103435a());
        String queryParameter = parse.getQueryParameter("calendarId");
        if (queryParameter != null) {
            str = queryParameter;
        } else {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "uri.getQueryParameter(\"calendarId\") ?: \"\"");
        String queryParameter2 = parse.getQueryParameter("key");
        if (queryParameter2 != null) {
            str2 = queryParameter2;
        } else {
            str2 = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "uri.getQueryParameter(\"key\") ?: \"\"");
        String queryParameter3 = parse.getQueryParameter("originalTime");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        long a = m125454a(queryParameter3, 0);
        String queryParameter4 = parse.getQueryParameter("startTime");
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        long a2 = m125454a(queryParameter4, -1);
        String queryParameter5 = parse.getQueryParameter("token");
        if (queryParameter5 != null) {
            str3 = queryParameter5;
        } else {
            str3 = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str3, "uri.getQueryParameter(\"token\") ?: \"\"");
        String queryParameter6 = parse.getQueryParameter(ShareHitPoint.f121868c);
        if (queryParameter6 != null) {
            str4 = queryParameter6;
        } else {
            str4 = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str4, "uri.getQueryParameter(\"source\") ?: \"\"");
        C32674a aVar = this.f83840b;
        if (aVar == null) {
            return true;
        }
        aVar.mo108117a(context, str, str2, a, a2, str3, str4);
        return true;
    }
}
