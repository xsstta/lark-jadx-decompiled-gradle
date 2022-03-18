package com.ss.android.lark.search.widget.params;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bJ\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "Lcom/ss/android/lark/search/widget/params/BasePickerParams;", "builder", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams$Builder;", "(Lcom/ss/android/lark/search/widget/params/ChatterPickerParams$Builder;)V", "enableEmailContact", "", "enableExternalGroup", "enableMeetingGroup", "enablePublicGroup", "enableSecretGroup", "excludeResignedUser", "excludeWithoutChatUser", "mChatIds", "", "", "mIgnoreSelf", "mIncludeBot", "mIncludeMailContact", "mIncludeSecretP2pChat", "mIsCheckCrossTenantAdminPermission", "mIsCheckOUPermission", "mIsCheckSecretPermission", "mIsNeedSearchOuterUser", "mUseChatterSearcher", "needEnterpriseEmail", "chatIds", "", "checkCrossTenantAdminPermission", "checkOUPermission", "checkSecretPermission", "ignoreSelf", "includeBot", "includeMailContact", "includeSecretP2pChat", "needSearchOuterUser", "useChatterSearcher", "Builder", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.widget.c.d */
public class ChatterPickerParams extends BasePickerParams {

    /* renamed from: a */
    private List<String> f133045a;

    /* renamed from: b */
    private boolean f133046b;

    /* renamed from: c */
    private boolean f133047c;

    /* renamed from: d */
    private boolean f133048d;

    /* renamed from: e */
    private boolean f133049e;

    /* renamed from: f */
    private boolean f133050f;

    /* renamed from: g */
    private boolean f133051g;

    /* renamed from: h */
    private boolean f133052h;

    /* renamed from: i */
    private boolean f133053i;

    /* renamed from: j */
    private boolean f133054j = true;

    /* renamed from: k */
    private boolean f133055k = true;

    /* renamed from: l */
    private boolean f133056l;

    /* renamed from: m */
    private boolean f133057m = true;

    /* renamed from: n */
    private boolean f133058n = true;

    /* renamed from: o */
    private boolean f133059o = true;

    /* renamed from: p */
    private boolean f133060p;

    /* renamed from: q */
    private boolean f133061q;

    /* renamed from: r */
    private boolean f133062r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010C\u001a\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010E\u001a\u00020\u00002\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010GH\u0016J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0004J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0004H\u0016J\u0010\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0004H\u0016J\u0010\u0010N\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010O\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010Q\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010S\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0004H\u0016J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0004H\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u0004H\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\u0004H\u0016J\u0010\u0010\\\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u0004H\u0016J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010_\u001a\u00020\u0004H\u0016J\u0018\u0010`\u001a\u00020\u00002\u000e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010GH\u0016J\u0010\u0010b\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u0004H\u0016J\b\u0010d\u001a\u00020eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001a\u0010(\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001a\u0010.\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001a\u00104\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR \u0010:\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\u001a\u0010=\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001a\u0010@\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\b¨\u0006f"}, d2 = {"Lcom/ss/android/lark/search/widget/params/ChatterPickerParams$Builder;", "", "()V", "enableEmailContact", "", "getEnableEmailContact", "()Z", "setEnableEmailContact", "(Z)V", "enableExternalGroup", "getEnableExternalGroup", "setEnableExternalGroup", "enableMeetingGroup", "getEnableMeetingGroup", "setEnableMeetingGroup", "enablePublicGroup", "getEnablePublicGroup", "setEnablePublicGroup", "enableSecretGroup", "getEnableSecretGroup", "setEnableSecretGroup", "excludeResignedUser", "getExcludeResignedUser", "setExcludeResignedUser", "excludeWithoutChatUser", "getExcludeWithoutChatUser", "setExcludeWithoutChatUser", "mChatIds", "", "", "getMChatIds", "()Ljava/util/List;", "setMChatIds", "(Ljava/util/List;)V", "mIgnoreSelf", "getMIgnoreSelf", "setMIgnoreSelf", "mIncludeBot", "getMIncludeBot", "setMIncludeBot", "mIncludeMailContact", "getMIncludeMailContact", "setMIncludeMailContact", "mIncludeSecretP2pChat", "getMIncludeSecretP2pChat", "setMIncludeSecretP2pChat", "mIsCheckCrossTenantAdminPermission", "getMIsCheckCrossTenantAdminPermission", "setMIsCheckCrossTenantAdminPermission", "mIsCheckOUPermission", "getMIsCheckOUPermission", "setMIsCheckOUPermission", "mIsCheckSecretPermission", "getMIsCheckSecretPermission", "setMIsCheckSecretPermission", "mIsNeedSearchOuterUser", "getMIsNeedSearchOuterUser", "setMIsNeedSearchOuterUser", "mRequiredList", "getMRequiredList", "setMRequiredList", "mUseChatterSearcher", "getMUseChatterSearcher", "setMUseChatterSearcher", "needEnterpriseEmail", "getNeedEnterpriseEmail", "setNeedEnterpriseEmail", "attachChatId", "chatId", "attachChatIds", "chatIds", "", "attachCheckCrossTenantAdminPermission", "isCheckAdminPermission", "attachCheckOUPermission", "isCheckOUPermission", "attachCheckSecretPermission", "isCheckSecretPermission", "attachEmailContact", "attachEnableExternalGroup", "attachEnableMeetingGroup", "attachEnablePublicGroup", "attachEnableSecretGroup", "attachEnterpriseEmail", "attachExcludeResignedUser", "attachExcludeWithoutChatUser", "attachIgnoreSelf", "ignoreSelf", "attachIncludeBot", "includeBot", "attachIncludeMailContact", "includeMailContact", "attachIncludeSecretP2pChat", "includeSecretP2pChat", "attachNeedSearchOuterUser", "needSearchOuterUser", "attachRequiredList", "requiredList", "attachUseChatterSearcher", "useChatterSearcher", "build", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.c.d$a */
    public static class Builder {

        /* renamed from: a */
        private List<String> f133063a = new ArrayList();

        /* renamed from: b */
        private boolean f133064b;

        /* renamed from: c */
        private boolean f133065c;

        /* renamed from: d */
        private boolean f133066d;

        /* renamed from: e */
        private boolean f133067e;

        /* renamed from: f */
        private List<String> f133068f = new ArrayList();

        /* renamed from: g */
        private boolean f133069g;

        /* renamed from: h */
        private boolean f133070h;

        /* renamed from: i */
        private boolean f133071i;

        /* renamed from: j */
        private boolean f133072j;

        /* renamed from: k */
        private boolean f133073k = true;

        /* renamed from: l */
        private boolean f133074l = true;

        /* renamed from: m */
        private boolean f133075m;

        /* renamed from: n */
        private boolean f133076n = true;

        /* renamed from: o */
        private boolean f133077o = true;

        /* renamed from: p */
        private boolean f133078p = true;

        /* renamed from: q */
        private boolean f133079q;

        /* renamed from: r */
        private boolean f133080r;

        /* renamed from: s */
        private boolean f133081s;

        /* renamed from: i */
        public final boolean mo183710i() {
            return this.f133064b;
        }

        /* renamed from: w */
        public final boolean mo183736w() {
            return this.f133078p;
        }

        /* renamed from: x */
        public final boolean mo183737x() {
            return this.f133079q;
        }

        /* renamed from: y */
        public final boolean mo183738y() {
            return this.f133080r;
        }

        /* renamed from: z */
        public final boolean mo183739z() {
            return this.f133081s;
        }

        /* renamed from: g */
        public ChatterPickerParams mo183675g() {
            return new ChatterPickerParams(this);
        }

        /* renamed from: h */
        public final List<String> mo183709h() {
            return this.f133063a;
        }

        /* renamed from: j */
        public final boolean mo183711j() {
            return this.f133065c;
        }

        /* renamed from: k */
        public final boolean mo183713k() {
            return this.f133066d;
        }

        /* renamed from: l */
        public final boolean mo183715l() {
            return this.f133067e;
        }

        /* renamed from: m */
        public final List<String> mo183717m() {
            return this.f133068f;
        }

        /* renamed from: n */
        public final boolean mo183719n() {
            return this.f133069g;
        }

        /* renamed from: o */
        public final boolean mo183721o() {
            return this.f133070h;
        }

        /* renamed from: p */
        public final boolean mo183723p() {
            return this.f133071i;
        }

        /* renamed from: q */
        public final boolean mo183725q() {
            return this.f133072j;
        }

        /* renamed from: r */
        public final boolean mo183727r() {
            return this.f133073k;
        }

        /* renamed from: s */
        public final boolean mo183729s() {
            return this.f133074l;
        }

        /* renamed from: t */
        public final boolean mo183731t() {
            return this.f133075m;
        }

        /* renamed from: u */
        public final boolean mo183733u() {
            return this.f133076n;
        }

        /* renamed from: v */
        public final boolean mo183735v() {
            return this.f133077o;
        }

        /* renamed from: d */
        public Builder mo183668d(boolean z) {
            this.f133064b = z;
            return this;
        }

        /* renamed from: f */
        public Builder mo183673f(boolean z) {
            this.f133065c = z;
            return this;
        }

        /* renamed from: h */
        public Builder mo183676h(boolean z) {
            this.f133067e = z;
            return this;
        }

        /* renamed from: j */
        public Builder mo183678j(boolean z) {
            this.f133069g = z;
            return this;
        }

        /* renamed from: k */
        public final Builder mo183712k(boolean z) {
            this.f133066d = z;
            return this;
        }

        /* renamed from: l */
        public Builder mo183714l(boolean z) {
            this.f133070h = z;
            return this;
        }

        /* renamed from: m */
        public Builder mo183716m(boolean z) {
            this.f133071i = z;
            return this;
        }

        /* renamed from: n */
        public Builder mo183718n(boolean z) {
            this.f133072j = z;
            return this;
        }

        /* renamed from: o */
        public Builder mo183720o(boolean z) {
            this.f133073k = z;
            return this;
        }

        /* renamed from: p */
        public Builder mo183722p(boolean z) {
            this.f133074l = z;
            return this;
        }

        /* renamed from: q */
        public Builder mo183724q(boolean z) {
            this.f133081s = z;
            return this;
        }

        /* renamed from: r */
        public Builder mo183726r(boolean z) {
            this.f133076n = z;
            return this;
        }

        /* renamed from: s */
        public Builder mo183728s(boolean z) {
            this.f133077o = z;
            return this;
        }

        /* renamed from: t */
        public Builder mo183730t(boolean z) {
            this.f133078p = z;
            return this;
        }

        /* renamed from: u */
        public Builder mo183732u(boolean z) {
            this.f133079q = z;
            return this;
        }

        /* renamed from: v */
        public Builder mo183734v(boolean z) {
            this.f133075m = z;
            return this;
        }

        /* renamed from: b */
        public Builder mo183663b(String str) {
            if (str != null) {
                this.f133063a.clear();
                this.f133063a.add(str);
            }
            return this;
        }

        /* renamed from: b */
        public Builder mo183664b(List<String> list) {
            if (list != null) {
                this.f133068f.clear();
                this.f133068f.addAll(list);
            }
            return this;
        }
    }

    /* renamed from: e */
    public final List<String> mo183691e() {
        return this.f133045a;
    }

    /* renamed from: f */
    public final boolean mo183692f() {
        return this.f133046b;
    }

    /* renamed from: g */
    public final boolean mo183693g() {
        return this.f133047c;
    }

    /* renamed from: h */
    public final boolean mo183694h() {
        return this.f133049e;
    }

    /* renamed from: i */
    public final boolean mo183695i() {
        return this.f133048d;
    }

    /* renamed from: j */
    public final boolean mo183696j() {
        return this.f133050f;
    }

    /* renamed from: k */
    public final boolean mo183697k() {
        return this.f133051g;
    }

    /* renamed from: l */
    public final boolean mo183698l() {
        return this.f133052h;
    }

    /* renamed from: m */
    public final boolean mo183699m() {
        return this.f133053i;
    }

    /* renamed from: n */
    public final boolean mo183700n() {
        return this.f133054j;
    }

    /* renamed from: o */
    public final boolean mo183701o() {
        return this.f133055k;
    }

    /* renamed from: p */
    public final boolean mo183702p() {
        return this.f133056l;
    }

    /* renamed from: q */
    public final boolean mo183703q() {
        return this.f133057m;
    }

    /* renamed from: r */
    public final boolean mo183704r() {
        return this.f133058n;
    }

    /* renamed from: s */
    public final boolean mo183705s() {
        return this.f133059o;
    }

    /* renamed from: t */
    public final boolean mo183706t() {
        return this.f133060p;
    }

    /* renamed from: u */
    public final boolean mo183707u() {
        return this.f133061q;
    }

    /* renamed from: v */
    public final boolean mo183708v() {
        return this.f133062r;
    }

    public ChatterPickerParams(Builder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        ArrayList arrayList = new ArrayList();
        this.f133045a = arrayList;
        arrayList.clear();
        this.f133045a.addAll(aVar.mo183709h());
        this.f133046b = aVar.mo183710i();
        this.f133047c = aVar.mo183711j();
        this.f133048d = aVar.mo183713k();
        this.f133049e = aVar.mo183715l();
        mo183654a().clear();
        mo183654a().addAll(aVar.mo183717m());
        this.f133050f = aVar.mo183719n();
        this.f133051g = aVar.mo183721o();
        this.f133052h = aVar.mo183723p();
        this.f133053i = aVar.mo183725q();
        this.f133054j = aVar.mo183727r();
        this.f133055k = aVar.mo183729s();
        this.f133056l = aVar.mo183731t();
        this.f133057m = aVar.mo183733u();
        this.f133059o = aVar.mo183736w();
        this.f133058n = aVar.mo183735v();
        this.f133060p = aVar.mo183737x();
        this.f133061q = aVar.mo183738y();
        this.f133062r = aVar.mo183739z();
    }
}
