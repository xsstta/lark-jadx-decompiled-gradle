package com.ss.android.lark.notification.offline.parser;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.C26253ae;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0017*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/notification/offline/parser/ThreadOfflineExtraParser;", "Lcom/ss/android/lark/notification/offline/parser/IOfflineExtraParser;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/notification/dto/OfflineNotice;", "(Lcom/ss/android/lark/notification/dto/OfflineNotice;)V", "getData", "()Lcom/ss/android/lark/notification/dto/OfflineNotice;", "mChatDependency", "Lcom/ss/android/lark/notification/dependency/INotificationModuleDependency$IChatDependency;", "mChatId", "", "mContext", "Landroid/content/Context;", "mExtraJson", "Lcom/alibaba/fastjson/JSONObject;", "mFeedDependency", "Lcom/ss/android/lark/notification/dependency/INotificationModuleDependency$IFeedDependency;", "mMainDependency", "Lcom/ss/android/lark/notification/dependency/INotificationModuleDependency$IMainDependency;", "mMessageId", "mMessageThreadPosition", "", "mSid", "kotlin.jvm.PlatformType", "mThreadId", "getNotificationId", "getParserType", "getTargetIntent", "Landroid/content/Intent;", "Companion", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.notification.offline.parser.f */
public final class ThreadOfflineExtraParser implements IOfflineExtraParser {

    /* renamed from: d */
    public static final Companion f122179d = new Companion(null);

    /* renamed from: a */
    public final String f122180a;

    /* renamed from: b */
    public final int f122181b;

    /* renamed from: c */
    public final AbstractC48407a.AbstractC48414f f122182c;

    /* renamed from: e */
    private final JSONObject f122183e;

    /* renamed from: f */
    private final String f122184f;

    /* renamed from: g */
    private final String f122185g;

    /* renamed from: h */
    private final String f122186h;

    /* renamed from: i */
    private final AbstractC48407a.AbstractC48421j f122187i;

    /* renamed from: j */
    private final AbstractC48407a.AbstractC48425m f122188j;

    /* renamed from: k */
    private final Context f122189k;

    /* renamed from: l */
    private final OfflineNotice f122190l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/notification/offline/parser/ThreadOfflineExtraParser$Companion;", "", "()V", "MOD_OFFLINE_THREAD", "", "TAG", "", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.offline.parser.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: a */
    public int mo169635a() {
        try {
            if (!TextUtils.isEmpty(this.f122180a)) {
                long j = (long) 30002;
                return (int) ((Long.parseLong(this.f122180a) * j) % j);
            } else if (TextUtils.isEmpty(this.f122184f)) {
                return C26253ae.m94997a();
            } else {
                String str = this.f122184f;
                Intrinsics.checkExpressionValueIsNotNull(str, "mSid");
                return Integer.parseInt(str);
            }
        } catch (Exception unused) {
            return C26253ae.m94997a();
        }
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: b */
    public Intent mo169636b() {
        if (this.f122183e == null) {
            Bundle a = this.f122187i.mo169387a(new Bundle());
            Intrinsics.checkExpressionValueIsNotNull(a, "mFeedDependency.prepareLaunchFeedBundle(Bundle())");
            Log.m165389i("OfflineNotice", "receive offline notice parse Thread: go to Main");
            Intent a2 = this.f122188j.mo169396a(this.f122189k, this.f122187i.mo169389b(), a);
            Intrinsics.checkExpressionValueIsNotNull(a2, "mMainDependency.getLaunc…ency.tabPageName, bundle)");
            return a2;
        }
        Bundle a3 = this.f122182c.mo169369a(this.f122186h, true, this.f122185g, "Notification", new C48556b(this));
        Intrinsics.checkExpressionValueIsNotNull(a3, "mChatDependency.prepareC…adPosition)\n            }");
        Log.m165389i("OfflineNotice", "receive offline notice parse Thread messageId: " + this.f122185g + " threadId: " + this.f122180a);
        Intent a4 = this.f122188j.mo169396a(this.f122189k, this.f122187i.mo169389b(), a3);
        Intrinsics.checkExpressionValueIsNotNull(a4, "mMainDependency.getLaunc…ency.tabPageName, bundle)");
        return a4;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "createdBundle", "Landroid/os/Bundle;", "inject"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.offline.parser.f$b */
    static final class C48556b implements AbstractC48407a.AbstractC48412d {

        /* renamed from: a */
        final /* synthetic */ ThreadOfflineExtraParser f122191a;

        C48556b(ThreadOfflineExtraParser fVar) {
            this.f122191a = fVar;
        }

        @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48412d
        public final void inject(Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(bundle, "createdBundle");
            this.f122191a.f122182c.mo169371a(bundle, this.f122191a.f122180a, this.f122191a.f122181b);
        }
    }

    public ThreadOfflineExtraParser(OfflineNotice offlineNotice) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(offlineNotice, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f122190l = offlineNotice;
        JSONObject businessInfo = offlineNotice.getBusinessInfo();
        this.f122183e = businessInfo;
        this.f122184f = offlineNotice.getMsgSid();
        AbstractC48407a a = C48398a.m190922a();
        Intrinsics.checkExpressionValueIsNotNull(a, "NotificationModule.getDependency()");
        Context a2 = a.mo169335a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "NotificationModule.getDependency().context");
        this.f122189k = a2;
        String str3 = "";
        if (businessInfo == null) {
            this.f122185g = str3;
            this.f122180a = str3;
            this.f122181b = -1;
            this.f122186h = str3;
        } else {
            long longValue = businessInfo.getLongValue("message_id");
            long longValue2 = businessInfo.getLongValue("thread_id");
            long longValue3 = businessInfo.getLongValue("chat_id");
            if (longValue == 0) {
                str = str3;
            } else {
                str = String.valueOf(longValue);
            }
            this.f122185g = str;
            if (longValue2 == 0) {
                str2 = str3;
            } else {
                str2 = String.valueOf(longValue2);
            }
            this.f122180a = str2;
            this.f122186h = longValue3 != 0 ? String.valueOf(longValue3) : str3;
            this.f122181b = businessInfo.getIntValue("position");
        }
        AbstractC48407a a3 = C48398a.m190922a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "NotificationModule.getDependency()");
        AbstractC48407a.AbstractC48421j g = a3.mo169344g();
        Intrinsics.checkExpressionValueIsNotNull(g, "NotificationModule.getDependency().feedDependency");
        this.f122187i = g;
        AbstractC48407a a4 = C48398a.m190922a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "NotificationModule.getDependency()");
        AbstractC48407a.AbstractC48414f f = a4.mo169343f();
        Intrinsics.checkExpressionValueIsNotNull(f, "NotificationModule.getDependency().chatDependency");
        this.f122182c = f;
        AbstractC48407a a5 = C48398a.m190922a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "NotificationModule.getDependency()");
        AbstractC48407a.AbstractC48425m c = a5.mo169340c();
        Intrinsics.checkExpressionValueIsNotNull(c, "NotificationModule.getDependency().mainDependency");
        this.f122188j = c;
    }
}
