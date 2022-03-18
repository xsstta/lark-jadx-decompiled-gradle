package com.ss.android.lark.auditsdk.wrapper;

import com.ss.android.lark.audit.C29282a;
import com.ss.android.lark.audit.model.ObjectDetail;
import com.ss.android.lark.audit.model.ObjectEntity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/auditsdk/wrapper/AuditEventCreator;", "", "()V", "Companion", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.auditsdk.b.a */
public final class AuditEventCreator {

    /* renamed from: a */
    public static final Companion f73482a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0007J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/auditsdk/wrapper/AuditEventCreator$Companion;", "", "()V", "createFileDownloadAuditEvent", "Lcom/ss/android/lark/audit/AuditEventBuilder;", "originKey", "", "createFileOpenBy3rdAppAuditEvent", "createImageDownloadAuditEvent", "createLinkAuditEvent", "url", "createMediaDownloadAuditEvent", "createOpenMiniAppEvent", "appId", "createScreenRecordingEvent", "currentPage", "createScreenShotEvent", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C29282a mo104107a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            ObjectEntity objectEntity = new ObjectEntity(15, str, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objectEntity);
            C29282a a = new C29282a().mo103797a(System.currentTimeMillis()).mo103796a(9).mo103804b(2).mo103802a(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuditEventBuilder().time…     .objectEntitys(list)");
            return a;
        }

        @JvmStatic
        /* renamed from: b */
        public final C29282a mo104108b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            ObjectEntity objectEntity = new ObjectEntity(17, str, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objectEntity);
            C29282a a = new C29282a().mo103797a(System.currentTimeMillis()).mo103796a(10).mo103804b(7).mo103802a(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuditEventBuilder().time…     .objectEntitys(list)");
            return a;
        }

        @JvmStatic
        /* renamed from: c */
        public final C29282a mo104109c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            ObjectEntity objectEntity = new ObjectEntity(18, str, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objectEntity);
            C29282a a = new C29282a().mo103797a(System.currentTimeMillis()).mo103796a(10).mo103804b(7).mo103802a(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuditEventBuilder().time…     .objectEntitys(list)");
            return a;
        }

        @JvmStatic
        /* renamed from: d */
        public final C29282a mo104110d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            ObjectEntity objectEntity = new ObjectEntity(19, str, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objectEntity);
            C29282a a = new C29282a().mo103797a(System.currentTimeMillis()).mo103796a(12).mo103804b(13).mo103802a(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuditEventBuilder().time…     .objectEntitys(list)");
            return a;
        }

        @JvmStatic
        /* renamed from: e */
        public final C29282a mo104111e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            ObjectEntity objectEntity = new ObjectEntity(19, str, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objectEntity);
            C29282a a = new C29282a().mo103797a(System.currentTimeMillis()).mo103796a(12).mo103804b(7).mo103802a(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuditEventBuilder().time…     .objectEntitys(list)");
            return a;
        }

        @JvmStatic
        /* renamed from: f */
        public final C29282a mo104112f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "appId");
            ObjectEntity objectEntity = new ObjectEntity(20, str, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objectEntity);
            C29282a a = new C29282a().mo103797a(System.currentTimeMillis()).mo103796a(16).mo103804b(2).mo103802a(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuditEventBuilder().time…     .objectEntitys(list)");
            return a;
        }

        /* renamed from: g */
        public final C29282a mo104113g(String str) {
            Intrinsics.checkParameterIsNotNull(str, "currentPage");
            ObjectDetail objectDetail = new ObjectDetail();
            objectDetail.currentPage = str;
            ObjectEntity objectEntity = new ObjectEntity(45, "", objectDetail);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objectEntity);
            C29282a a = new C29282a().mo103797a(System.currentTimeMillis()).mo103796a(21).mo103804b(63).mo103802a(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuditEventBuilder().time…     .objectEntitys(list)");
            return a;
        }

        /* renamed from: h */
        public final C29282a mo104114h(String str) {
            Intrinsics.checkParameterIsNotNull(str, "currentPage");
            ObjectDetail objectDetail = new ObjectDetail();
            objectDetail.currentPage = str;
            ObjectEntity objectEntity = new ObjectEntity(45, "", objectDetail);
            ArrayList arrayList = new ArrayList();
            arrayList.add(objectEntity);
            C29282a a = new C29282a().mo103797a(System.currentTimeMillis()).mo103796a(21).mo103804b(90).mo103802a(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuditEventBuilder().time…     .objectEntitys(list)");
            return a;
        }
    }
}
