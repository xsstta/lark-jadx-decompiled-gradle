package com.ss.android.lark.inv.export.api;

import com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoResponse;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse;
import com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse;
import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.bytedance.lark.pb.im.v2.GetContactTokenResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface InvitationServiceApi {

    public enum InviteErrorType {
        FORMAT_MOBILE,
        FORMAT_EMAIL,
        FORMAT_NAME,
        OTHERS
    }

    /* renamed from: com.ss.android.lark.inv.export.api.InvitationServiceApi$a */
    public static class C40082a {

        /* renamed from: a */
        public InviteErrorType f101871a;

        /* renamed from: b */
        public String f101872b;

        /* renamed from: c */
        public int f101873c;
    }

    /* renamed from: com.ss.android.lark.inv.export.api.InvitationServiceApi$c */
    public static class C40084c {

        /* renamed from: a */
        public boolean f101876a;

        /* renamed from: b */
        public Map<String, C40082a> f101877b = new LinkedHashMap();

        /* renamed from: c */
        public boolean f101878c;
    }

    void agreeFriendRequest(String str, IGetDataCallback<Boolean> iGetDataCallback);

    void checkContactUsingApp(List<String> list, List<String> list2, IGetDataCallback<Map<String, Boolean>> iGetDataCallback);

    void checkInviteMemberPermission(C57865c.AbstractC57871b<Boolean> bVar);

    void getCollaborationInviteQrcode(boolean z, IGetDataCallback<PullCollaborationInviteQrCodeResponse> iGetDataCallback);

    void getContactTokenV2(IGetDataCallback<GetContactTokenResponse> iGetDataCallback);

    void getDepartmentInactiveInfo(GetDepartmentInactiveInfoRequest.C16228a aVar, IGetDataCallback<GetDepartmentInactiveInfoResponse> iGetDataCallback);

    void getDepartmentInvitationInfo(GetDepartmentInvitationUrlRequest.C16232a aVar, IGetDataCallback<GetDepartmentInvitationUrlResponse> iGetDataCallback);

    void getInviteNewMemberUrl(String str, IGetDataCallback<GetInvitationLinkResponse> iGetDataCallback);

    void getInviteNewMemberUrl(boolean z, String str, IGetDataCallback<GetInvitationLinkResponse> iGetDataCallback);

    boolean hasInviteMemberPermission();

    SdkSender.C53233d<C40084c> invite(C40083b bVar, boolean z, String str);

    void invite(C40083b bVar, boolean z, String str, IGetDataCallback<C40084c> iGetDataCallback);

    void isAdmin(IGetDataCallback<Boolean> iGetDataCallback);

    boolean isAdmin();

    void pullInviteActivityBanner(IGetDataCallback<InviteActivityBannerResult> iGetDataCallback);

    void pullInvitePermission4Banner(IGetDataCallback<InvitePermissionResult> iGetDataCallback);

    void search(String str, IGetDataCallback<SearchUserByContactPointResponse> iGetDataCallback);

    void sendContent(String str, boolean z, IGetDataCallback<SendUserInvitationResponse> iGetDataCallback);

    void shouldGuideExternal(IGetDataCallback<Boolean> iGetDataCallback);

    public static class InviteActivityBannerResult implements Serializable {
        private static final long serialVersionUID = -4298542468121618400L;
        public String summardUrl;
        public boolean summary;

        public InviteActivityBannerResult() {
        }

        public String toString() {
            return "InviteActivityBannerResult{summary=" + this.summary + ", summardUrl=" + this.summardUrl;
        }

        public InviteActivityBannerResult(boolean z, String str) {
            this.summardUrl = str;
            this.summary = z;
        }
    }

    public static class InvitePermissionResult implements Serializable {
        private static final long serialVersionUID = -4298542468121618400L;
        public boolean enableShow;
        public boolean isDirectHide;
        public boolean isShowClose;

        public InvitePermissionResult() {
        }

        public String toString() {
            return "InvitePermissionResult{enableShow=" + this.enableShow + ", isDirectHide=" + this.isDirectHide + ", isShowClose=" + this.isShowClose + '}';
        }

        public InvitePermissionResult(boolean z, boolean z2, boolean z3) {
            this.enableShow = z;
            this.isDirectHide = z2;
            this.isShowClose = z3;
        }
    }

    /* renamed from: com.ss.android.lark.inv.export.api.InvitationServiceApi$b */
    public static class C40083b {

        /* renamed from: a */
        public List<String> f101874a;

        /* renamed from: b */
        public List<String> f101875b;

        public C40083b(List<String> list, List<String> list2) {
            this.f101874a = list;
            this.f101875b = list2;
        }
    }
}
