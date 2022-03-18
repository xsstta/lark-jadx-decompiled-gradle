package com.bytedance.ee.bear.middleground.permission.apply;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.larksuite.suite.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001-B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\b\u0010,\u001a\u00020\u0003H\u0016R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001c¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "Ljava/io/Serializable;", "token", "", "documentType", "isFolder", "", "tipText", "ownerName", "title", "canApply", "containerId", "", "backVisible", "subType", "fromVc", "isWiki", "module", "userPerm", "publicPerm", "isShareFolderV2", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBackVisible", "()Z", "getCanApply", "getContainerId", "()I", "getDocumentType", "()Ljava/lang/String;", "getFromVc", "getModule", "getOwnerName", "getPublicPerm", "getSubType", "getTipText", "getTitle", "getToken", "getUserPerm", "checkContainerId", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showView", "toString", "Builder", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class NoPermission implements Serializable {
    private final boolean backVisible;
    private final boolean canApply;
    private final int containerId;
    private final String documentType;
    private final boolean fromVc;
    private final boolean isFolder;
    private final boolean isShareFolderV2;
    private final boolean isWiki;
    private final String module;
    private final String ownerName;
    private final String publicPerm;
    private final String subType;
    private final String tipText;
    private final String title;
    private final String token;
    private final String userPerm;

    private final int checkContainerId(int i) {
        if (i != -1) {
            return i;
        }
        return 16908290;
    }

    public final boolean getBackVisible() {
        return this.backVisible;
    }

    public final boolean getCanApply() {
        return this.canApply;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final boolean getFromVc() {
        return this.fromVc;
    }

    public final String getModule() {
        return this.module;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPublicPerm() {
        return this.publicPerm;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final String getTipText() {
        return this.tipText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserPerm() {
        return this.userPerm;
    }

    public final boolean isFolder() {
        return this.isFolder;
    }

    public final boolean isShareFolderV2() {
        return this.isShareFolderV2;
    }

    public final boolean isWiki() {
        return this.isWiki;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\tJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission$Builder;", "", "()V", "backButtonVisible", "", "canApply", "containerId", "", "documentType", "", "fromVc", "isFolder", "isShareFolderV2", "isWiki", "module", "ownerName", "publicPerm", "subType", "tipText", "title", "token", "userPerm", "build", "Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "setBackButtonVisible", "visible", "setCanApply", "setContainerId", "setDocumentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "setFromVC", "fromVC", "setIsFolder", "setIsWiki", "setModule", "setOwnerName", "setPublicPerm", "setShareFolderV2", "setSubType", "setTipText", "setTitle", "setToken", "setUserPerm", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.NoPermission$a */
    public static final class Builder {

        /* renamed from: a */
        private String f25622a = "";

        /* renamed from: b */
        private String f25623b = "";

        /* renamed from: c */
        private boolean f25624c;

        /* renamed from: d */
        private boolean f25625d;

        /* renamed from: e */
        private String f25626e = "";

        /* renamed from: f */
        private String f25627f = "";

        /* renamed from: g */
        private String f25628g = "";

        /* renamed from: h */
        private int f25629h = -1;

        /* renamed from: i */
        private boolean f25630i = true;

        /* renamed from: j */
        private boolean f25631j;

        /* renamed from: k */
        private String f25632k = "";

        /* renamed from: l */
        private boolean f25633l;

        /* renamed from: m */
        private boolean f25634m;

        /* renamed from: n */
        private String f25635n = "";

        /* renamed from: o */
        private String f25636o = "";

        /* renamed from: p */
        private String f25637p = "";

        /* renamed from: a */
        public final NoPermission mo36583a() {
            return new NoPermission(this.f25622a, this.f25623b, this.f25625d, this.f25626e, this.f25627f, this.f25628g, this.f25624c, this.f25629h, this.f25630i, this.f25632k, this.f25633l, this.f25634m, this.f25635n, this.f25636o, this.f25637p, this.f25631j);
        }

        /* renamed from: a */
        public final Builder mo36579a(int i) {
            this.f25629h = i;
            return this;
        }

        /* renamed from: b */
        public final Builder mo36585b(boolean z) {
            this.f25625d = z;
            return this;
        }

        /* renamed from: c */
        public final Builder mo36587c(boolean z) {
            this.f25630i = z;
            return this;
        }

        /* renamed from: d */
        public final Builder mo36589d(boolean z) {
            this.f25633l = z;
            return this;
        }

        /* renamed from: e */
        public final Builder mo36591e(boolean z) {
            this.f25634m = z;
            return this;
        }

        /* renamed from: f */
        public final Builder mo36593f(boolean z) {
            this.f25631j = z;
            return this;
        }

        /* renamed from: a */
        public final Builder mo36581a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "ownerName");
            this.f25627f = str;
            return this;
        }

        /* renamed from: b */
        public final Builder mo36584b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tipText");
            this.f25626e = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo36586c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            this.f25622a = str;
            return this;
        }

        /* renamed from: d */
        public final Builder mo36588d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            this.f25628g = str;
            return this;
        }

        /* renamed from: e */
        public final Builder mo36590e(String str) {
            if (str == null) {
                str = "";
            }
            this.f25632k = str;
            return this;
        }

        /* renamed from: f */
        public final Builder mo36592f(String str) {
            if (str == null) {
                str = "";
            }
            this.f25635n = str;
            return this;
        }

        /* renamed from: g */
        public final Builder mo36594g(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userPerm");
            this.f25636o = str;
            return this;
        }

        /* renamed from: h */
        public final Builder mo36595h(String str) {
            Intrinsics.checkParameterIsNotNull(str, "publicPerm");
            this.f25637p = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo36580a(C8275a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "documentType");
            this.f25623b = String.valueOf(aVar.mo32555b());
            return this;
        }

        /* renamed from: a */
        public final Builder mo36582a(boolean z) {
            this.f25624c = z;
            return this;
        }
    }

    public String toString() {
        return "NoPermission(token='" + this.token + "', documentType='" + this.documentType + "', isFolder=" + this.isFolder + ", tipText='" + this.tipText + "', ownerName='" + this.ownerName + "', title='" + this.title + "', canApply=" + this.canApply + ", containerId=" + this.containerId + ", backVisible=" + this.backVisible + ')';
    }

    public final void show(FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        C9562d a = C9562d.m39498a(this.token, this.documentType, this.ownerName, this.isFolder, this.tipText, this.title, this.canApply, this.backVisible, this.subType, this.fromVc, this.isWiki, this.module, this.userPerm, this.publicPerm, this.isShareFolderV2);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fragmentManager.beginTransaction()");
        int i = this.containerId;
        if (i == -1) {
            i = 16908290;
        }
        beginTransaction.replace(i, a, "NoPermissionFragment").commitAllowingStateLoss();
    }

    public final void showView(FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        if (this.canApply) {
            fragmentManager.beginTransaction().replace(checkContainerId(this.containerId), PermApplyFragment.f25690d.mo36624a(this)).commitAllowingStateLoss();
            return;
        }
        PermForbidFragment.f25710i.mo36634a(fragmentManager, this.containerId, true, R.string.Doc_Permission_AdminNotAuthorizeCross, true, this.backVisible, this.token, C8275a.m34051b(this.documentType), this.subType, this.fromVc, this.isWiki, this.module, this.userPerm, this.publicPerm);
    }

    public NoPermission(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, int i, boolean z3, String str6, boolean z4, boolean z5, String str7, String str8, String str9, boolean z6) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "documentType");
        Intrinsics.checkParameterIsNotNull(str3, "tipText");
        Intrinsics.checkParameterIsNotNull(str4, "ownerName");
        Intrinsics.checkParameterIsNotNull(str5, "title");
        Intrinsics.checkParameterIsNotNull(str6, "subType");
        Intrinsics.checkParameterIsNotNull(str7, "module");
        Intrinsics.checkParameterIsNotNull(str8, "userPerm");
        Intrinsics.checkParameterIsNotNull(str9, "publicPerm");
        this.token = str;
        this.documentType = str2;
        this.isFolder = z;
        this.tipText = str3;
        this.ownerName = str4;
        this.title = str5;
        this.canApply = z2;
        this.containerId = i;
        this.backVisible = z3;
        this.subType = str6;
        this.fromVc = z4;
        this.isWiki = z5;
        this.module = str7;
        this.userPerm = str8;
        this.publicPerm = str9;
        this.isShareFolderV2 = z6;
    }
}
