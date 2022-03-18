package com.bytedance.ee.bear.drive.biz.permission.push;

import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.rn.AbstractC10636d;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/push/DriveSpaceFilePermissionPush;", "", "fileId", "", "permissionVM", "Lcom/bytedance/ee/bear/drive/biz/permission/DriveMGPermissionVM;", "(Ljava/lang/String;Lcom/bytedance/ee/bear/drive/biz/permission/DriveMGPermissionVM;)V", "mDetached", "", "mPushObserver", "Lcom/bytedance/ee/bear/rn/RnCommonPushProtocol$PushObserver;", "mReliablePermissionPushSDK", "Lcom/bytedance/ee/bear/rn/RnPushProtocol;", "mRnCommonPushProtocol", "Lcom/bytedance/ee/bear/rn/RnCommonPushProtocol;", "attach", "", "detach", "initReliablePermission", "objToken", "initRoomPush", "token", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.permission.push.a */
public class DriveSpaceFilePermissionPush {

    /* renamed from: d */
    public static final Companion f17968d = new Companion(null);

    /* renamed from: a */
    public boolean f17969a;

    /* renamed from: b */
    public final String f17970b;

    /* renamed from: c */
    public final DriveMGPermissionVM f17971c;

    /* renamed from: e */
    private RnPushProtocol f17972e;

    /* renamed from: f */
    private AbstractC10636d.AbstractC10637a f17973f;

    /* renamed from: g */
    private AbstractC10636d f17974g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/push/DriveSpaceFilePermissionPush$Companion;", "", "()V", "OPERATION_GROUP_CHANGE", "", "RELIABLE_PERMISSION_TAG_PREFIX", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.push.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo26068a() {
        m26174b(this.f17970b);
        m26173a(this.f17970b);
        this.f17969a = false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.push.a$b */
    public static final class C6523b extends Lambda implements Function0<DefinitionParameters> {
        final /* synthetic */ String $objToken;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6523b(String str) {
            super(0);
            this.$objToken = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefinitionParameters invoke() {
            return C70039b.m268661a("PERMISSION_CHANGE_", this.$objToken);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.push.a$d */
    public static final class C6525d extends Lambda implements Function0<DefinitionParameters> {
        final /* synthetic */ String $token;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6525d(String str) {
            super(0);
            this.$token = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefinitionParameters invoke() {
            return C70039b.m268661a(this.$token, C8275a.f22375h, "groupChange");
        }
    }

    /* renamed from: b */
    public final void mo26069b() {
        RnPushProtocol rnPushProtocol = this.f17972e;
        if (rnPushProtocol != null) {
            rnPushProtocol.mo40241a();
        }
        if (this.f17973f != null) {
            AbstractC10636d dVar = this.f17974g;
            if (dVar != null) {
                dVar.mo40332a();
            }
            this.f17973f = null;
        }
        this.f17969a = true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "json", "", "kotlin.jvm.PlatformType", "didReceivePush"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.push.a$c */
    public static final class C6524c implements RnPushProtocol.AbstractC10622a {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFilePermissionPush f17975a;

        C6524c(DriveSpaceFilePermissionPush aVar) {
            this.f17975a = aVar;
        }

        @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
        public final void didReceivePush(String str) {
            C13479a.m54764b("DriveComponent", "initReliablePermission() received push");
            if (!this.f17975a.f17969a) {
                this.f17975a.f17971c.fetchPermission(this.f17975a.f17970b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "json", "", "didReceivePush"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.push.a$e */
    public static final class C6526e implements AbstractC10636d.AbstractC10637a {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFilePermissionPush f17976a;

        C6526e(DriveSpaceFilePermissionPush aVar) {
            this.f17976a = aVar;
        }

        @Override // com.bytedance.ee.bear.rn.AbstractC10636d.AbstractC10637a
        public final void didReceivePush(String str) {
            Intrinsics.checkParameterIsNotNull(str, "json");
            C13479a.m54764b("DriveComponent", "initRoomPush() received push");
            if (!this.f17976a.f17969a) {
                this.f17976a.f17971c.fetchPermission(this.f17976a.f17970b);
            }
        }
    }

    /* renamed from: a */
    private final void m26173a(String str) {
        AbstractC10636d dVar = (AbstractC10636d) KoinJavaComponent.m268612a(AbstractC10636d.class, null, new C6525d(str));
        this.f17974g = dVar;
        if (this.f17973f != null) {
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            dVar.mo40332a();
            this.f17973f = null;
        }
        AbstractC10636d dVar2 = this.f17974g;
        if (dVar2 == null) {
            Intrinsics.throwNpe();
        }
        C6526e eVar = new C6526e(this);
        this.f17973f = eVar;
        dVar2.mo40333a(eVar);
    }

    /* renamed from: b */
    private final void m26174b(String str) {
        RnPushProtocol rnPushProtocol = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new C6523b(str));
        this.f17972e = rnPushProtocol;
        if (rnPushProtocol != null) {
            rnPushProtocol.mo40242a(new C6524c(this));
        }
    }

    public DriveSpaceFilePermissionPush(String str, DriveMGPermissionVM aVar) {
        Intrinsics.checkParameterIsNotNull(str, "fileId");
        Intrinsics.checkParameterIsNotNull(aVar, "permissionVM");
        this.f17970b = str;
        this.f17971c = aVar;
    }
}
