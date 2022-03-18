package com.bytedance.ee.bear.middleground.permission.util;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9716f;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteData;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.InviteMemberSendLinkData;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.InviteMemberSendLinkErrorParser;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p705h.C13666a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0007J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\u00132\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0007J6\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u00132\b\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0007J\\\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010-\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00132\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020*0/j\b\u0012\u0004\u0012\u00020*`0H\u0007J\\\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u00101\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010-\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00132\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020*0/j\b\u0012\u0004\u0012\u00020*`0H\u0007J4\u00102\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u00103\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0007J,\u00104\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0007J \u00105\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0007JD\u00106\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010\u00132\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020*0/j\b\u0012\u0004\u0012\u00020*`0H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013XT¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/util/NotNotifyOperator;", "", "()V", "APPLY_PERMISSION_MAX_COUNT", "", "CODE_ADD_FAILED", "CODE_BLOCK", "CODE_BLOCKED", "CODE_EXTERNAL_ACCESS_CLOSE", "CODE_NOT_SUPPORT_EXTERNAL", "CODE_OWNER_NOT_IN_GROUP", "CODE_PHONE_REACH_LIMIT", "CODE_PRIVACY_BLOCKED", "CODE_REACH_LIMIT", "CODE_UP_TO_LIMIT", "INVITE_FAIL_ADMINISTRATOR_CLOSE_SHARE", "INVITE_FAIL_OWNER_CLOSE_SHARE", "NOT_APPLY_PERMISSION", "TAG", "", "handleNotNotifyTipIfNeed", "", "activity", "Landroid/app/Activity;", "json", "isOwnerCloseSharePerm", "", "throwable", "", "joinUsersFromNotNotifyEntities", "notNotifyUsers", "", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserEntity;", "showApplyFailToast", "context", "Landroid/content/Context;", "e", "userName", "token", "module", "showAskOwnerToast", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "locale", "Ljava/util/Locale;", ShareHitPoint.f121869d, "selectedUser", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ownerName", "showInviteBlockToast", "userInfo", "showInviteFailToast", "showNotNotifyTip", "showSendLinkToast", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.g.a */
public final class NotNotifyOperator {

    /* renamed from: a */
    public static final NotNotifyOperator f26826a = new NotNotifyOperator();

    private NotNotifyOperator() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41299a(Context context, Throwable th, String str, String str2, ArrayList<UserInfo> arrayList) {
        String str3;
        String str4;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUser");
        String str5 = "others";
        if (th instanceof NetService.ServerErrorException) {
            InviteMemberSendLinkErrorParser.Companion aVar = InviteMemberSendLinkErrorParser.f26209a;
            String data = ((NetService.ServerErrorException) th).getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "throwable.data");
            InviteMemberSendLinkData a = aVar.mo37119a(data, arrayList);
            List<NotNotifyUserEntity> blockUsers = a.getBlockUsers();
            if (blockUsers == null || !(!blockUsers.isEmpty())) {
                List<NotNotifyUserEntity> blockedUsers = a.getBlockedUsers();
                if (blockedUsers == null || !(!blockedUsers.isEmpty())) {
                    List<NotNotifyUserEntity> privacyUsers = a.getPrivacyUsers();
                    if (privacyUsers == null || !(!privacyUsers.isEmpty())) {
                        List<NotNotifyUserEntity> limitUsers = a.getLimitUsers();
                        if (limitUsers == null || !(!limitUsers.isEmpty())) {
                            List<NotNotifyUserEntity> notNotifyUsers = a.getNotNotifyUsers();
                            if (notNotifyUsers == null || !(!notNotifyUsers.isEmpty())) {
                                List<NotNotifyUserEntity> inviteFailedUsers = a.getInviteFailedUsers();
                                if (inviteFailedUsers == null || !(!inviteFailedUsers.isEmpty())) {
                                    str3 = context.getString(R.string.Doc_Permission_SendFailed);
                                } else {
                                    str3 = context.getString(R.string.Doc_Permission_SendPartFailed);
                                }
                                Intrinsics.checkExpressionValueIsNotNull(str3, "when {\n                /…          }\n            }");
                            } else {
                                str3 = C10539a.m43639a(context, R.string.Doc_Permission_AskOwnerSendLinkAdminBlocked, "name", m41291a(a.getNotNotifyUsers()));
                                str4 = "admin_setting";
                            }
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("name", m41291a(a.getLimitUsers()));
                            hashMap.put("count", String.valueOf(a.getSendLinkLimitNum()));
                            str3 = C10539a.m43640a(context, R.string.Doc_Permission_AskOwnerSendLinkMaxLimit, hashMap);
                            str4 = "more_then_limited";
                        }
                    } else {
                        str3 = C10539a.m43639a(context, R.string.Doc_Permission_SettingInviteCollaboratorShareToast, "userName", m41291a(a.getPrivacyUsers()));
                        str4 = "privacy_setting";
                    }
                } else {
                    str3 = C10539a.m43639a(context, R.string.Doc_Permission_AskOwnerSendLinkBlocked, "name", m41291a(a.getBlockedUsers()));
                    str4 = "blocked";
                }
            } else {
                str3 = C10539a.m43639a(context, R.string.Doc_Permission_AskOwnerSendLinkBlock, "name", m41291a(a.getBlockUsers()));
                str4 = "block";
            }
            str5 = str4;
            Intrinsics.checkExpressionValueIsNotNull(str3, "when {\n                /…          }\n            }");
        } else {
            str3 = context.getString(R.string.Doc_Permission_SendFailed);
            Intrinsics.checkExpressionValueIsNotNull(str3, "context.getString(R.stri…oc_Permission_SendFailed)");
        }
        Toast.showFailureText(context, str3);
        PermissionAnalytic.m39413a(str5, str, str2, "send_link");
    }

    /* renamed from: a */
    public final boolean mo37758a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return C5203d.m21235a(th, 10005);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m41291a(List<? extends NotNotifyUserEntity> list) {
        String str;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ao b = C4484g.m18494b();
        if (b == null || (str = b.mo17252c()) == null) {
            Locale locale = Locale.CHINA;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINA");
            str = locale.getLanguage();
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            sb.append(C13666a.m55443a(str, t2.getName(), t2.getEn_name()));
            if (i != list.size() - 1) {
                Locale locale2 = Locale.ENGLISH;
                Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.ENGLISH");
                if (Intrinsics.areEqual(locale2.getLanguage(), str)) {
                    sb.append(",");
                } else {
                    sb.append("、");
                }
            }
            i = i2;
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        return sb2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41292a(Activity activity, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "json");
        try {
            List parseArray = JSON.parseArray(str, NotNotifyUserEntity.class);
            if (parseArray != null) {
                m41293a(activity, parseArray);
            }
        } catch (Exception e) {
            C13479a.m54761a("NotNotifyOperator", e);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41293a(Activity activity, List<? extends NotNotifyUserEntity> list) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        String a = m41291a(list);
        if (!TextUtils.isEmpty(a)) {
            Activity activity2 = activity;
            String a2 = C10539a.m43639a(activity2, R.string.Doc_Permission_NotNotifyUser, "users", a);
            Intrinsics.checkExpressionValueIsNotNull(a2, "UIHelper.mustacheFormat(…NotifyUser, \"users\", msg)");
            Toast.showSuccessText(activity2, a2);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41297a(Context context, Throwable th, String str, String str2) {
        String str3;
        NetService.ServerErrorException serverErrorException;
        String json;
        boolean z;
        List<NotNotifyUserEntity> list;
        List<NotNotifyUserEntity> list2;
        List<NotNotifyUserEntity> list3;
        int i;
        List<NotNotifyUserEntity> list4;
        List<NotNotifyUserEntity> list5;
        List<NotNotifyUserEntity> list6;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        String str4 = "others";
        if (C5203d.m21235a(th, 4114)) {
            str3 = C10539a.m43639a(context, R.string.Doc_Share_ShareForbidden, "folderName", ((NetService.ServerErrorException) th).getMsg());
        } else if (C5203d.m21235a(th, 870601)) {
            AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
            if (f == null || !f.mo19681c()) {
                str3 = context.getString(R.string.Doc_Share_NotSupportExternalUser);
            } else {
                str3 = context.getString(R.string.Doc_Share_NotSupportEnterpriseUser);
            }
        } else if (C5203d.m21235a(th, 10004)) {
            str3 = context.getString(R.string.Doc_Share_AdministratorCloseShare);
        } else if (C5203d.m21235a(th, 10005)) {
            str3 = context.getString(R.string.Doc_Share_OwnerCloseShare);
        } else if (C5203d.m21235a(th, 10014)) {
            str3 = context.getString(R.string.CreationMobile_ECM_MaxCollaboratorsToast);
        } else if (C5203d.m21235a(th, 10040)) {
            str3 = context.getString(R.string.CreationMobile_DataUpgrade_Locked_toast);
        } else {
            if ((th instanceof NetService.ServerErrorException) && (json = (serverErrorException = (NetService.ServerErrorException) th).getJson()) != null) {
                if (json.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    InviteResult a = new C9716f().parse(serverErrorException.getJson());
                    Intrinsics.checkExpressionValueIsNotNull(a, "parse.parse(json)");
                    InviteData data = a.getData();
                    if (data == null || (list6 = data.blockUsers) == null || !(!list6.isEmpty())) {
                        InviteData data2 = a.getData();
                        if (data2 == null || (list5 = data2.blockedUsers) == null || !(!list5.isEmpty())) {
                            InviteData data3 = a.getData();
                            if (data3 == null || (list4 = data3.privacyUsers) == null || !(!list4.isEmpty())) {
                                InviteData data4 = a.getData();
                                if (data4 == null || (list3 = data4.limitUsers) == null || !(!list3.isEmpty())) {
                                    InviteData data5 = a.getData();
                                    if (data5 == null || (list2 = data5.phoneLimitUsers) == null || !(!list2.isEmpty())) {
                                        InviteData data6 = a.getData();
                                        if (data6 == null || (list = data6.notNotifyUsers) == null || !(!list.isEmpty())) {
                                            str3 = context.getString(R.string.Doc_Share_AddCollaboratorFailed);
                                        } else {
                                            str3 = C10539a.m43639a(context, R.string.Doc_Permission_NotNotifyUser, "users", m41291a(a.getData().notNotifyUsers));
                                            str4 = "admin_setting";
                                        }
                                    } else {
                                        str3 = C10539a.m43639a(context, R.string.Doc_Permission_MaxSharePhonenumberInvitationToast, "userName", m41291a(a.getData().phoneLimitUsers));
                                        str4 = "phone_invite_limited";
                                    }
                                } else {
                                    String a2 = m41291a(a.getData().limitUsers);
                                    if (a.getData().limitNum <= 0) {
                                        i = 20;
                                    } else {
                                        i = a.getData().limitNum;
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("userName", a2);
                                    hashMap.put("count", String.valueOf(i));
                                    str3 = C10539a.m43640a(context, R.string.Doc_Permission_MaxShareInvitationContactsToast, hashMap);
                                    str4 = "more_then_limited";
                                }
                            } else {
                                str3 = C10539a.m43639a(context, R.string.Doc_Permission_SettingInviteCollaboratorShareToast, "userName", m41291a(a.getData().privacyUsers));
                                str4 = "privacy_setting";
                            }
                        } else {
                            str3 = C10539a.m43639a(context, R.string.Doc_Permission_BlockedUnableInviteCollaboratorToast, "userName", m41291a(a.getData().blockedUsers));
                            str4 = "blocked";
                        }
                    } else {
                        str3 = C10539a.m43639a(context, R.string.Doc_Permission_BlockUnableInviteCollaboratorToast, "userName", m41291a(a.getData().blockUsers));
                        str4 = "block";
                    }
                }
            }
            str3 = context.getString(R.string.Doc_Share_AddCollaboratorFailed);
        }
        Toast.showFailureText(context, str3);
        PermissionAnalytic.m39413a(str4, str, str2, "invited_collaborate");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41294a(Context context, UserInfo userInfo, Locale locale, String str, String str2) {
        String str3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        int blockStatus = userInfo.getBlockStatus();
        if (blockStatus == 1) {
            Toast.showFailureText(context, C10539a.m43639a(context, R.string.Doc_Permission_BlockedUnableInviteCollaboratorToast, "userName", userInfo.getDisplayName(locale)));
            str3 = "blocked";
        } else if (blockStatus == 2) {
            Toast.showFailureText(context, C10539a.m43639a(context, R.string.Doc_Permission_BlockUnableInviteCollaboratorToast, "userName", userInfo.getDisplayName(locale)));
            str3 = "block";
        } else if (blockStatus != 3) {
            str3 = "others";
        } else {
            Toast.showFailureText(context, C10539a.m43639a(context, R.string.Doc_Permission_SettingInviteCollaboratorShareToast, "userName", userInfo.getDisplayName(locale)));
            str3 = "privacy_setting";
        }
        PermissionAnalytic.m39413a(str3, str, str2, "invited_collaborate");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41298a(Context context, Throwable th, String str, String str2, String str3) {
        String str4;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(th, "e");
        String str5 = "others";
        if ((th instanceof NetService.HttpErrorException) && ((NetService.HttpErrorException) th).getCode() == 429) {
            str4 = context.getString(R.string.Doc_Permission_SendRequestMaxCount);
            Intrinsics.checkExpressionValueIsNotNull(str4, "context.getString(R.stri…sion_SendRequestMaxCount)");
        } else if (C5203d.m21235a(th, 10021)) {
            if (str == null) {
                str = "";
            }
            str4 = C10539a.m43639a(context, R.string.Doc_Permission_BlockRequestPermissionToast, "userName", str);
            Intrinsics.checkExpressionValueIsNotNull(str4, "UIHelper.mustacheFormat(…serName\", userName ?: \"\")");
            str5 = "block";
        } else if (C5203d.m21235a(th, 10022)) {
            if (str == null) {
                str = "";
            }
            str4 = C10539a.m43639a(context, R.string.Doc_Permission_BlockedRequestPermissionToast, "userName", str);
            Intrinsics.checkExpressionValueIsNotNull(str4, "UIHelper.mustacheFormat(…serName\", userName ?: \"\")");
            str5 = "blocked";
        } else if (C5203d.m21235a(th, 10023)) {
            if (str == null) {
                str = "";
            }
            str4 = C10539a.m43639a(context, R.string.Doc_Permission_SettingInviteCollaboratoreRequestToast, "userName", str);
            Intrinsics.checkExpressionValueIsNotNull(str4, "UIHelper.mustacheFormat(…serName\", userName ?: \"\")");
            str5 = "privacy_setting";
        } else if (C5203d.m21235a(th, 10015)) {
            str4 = context.getString(R.string.Doc_Permission_NotApplyPermission);
            Intrinsics.checkExpressionValueIsNotNull(str4, "context.getString(R.stri…ssion_NotApplyPermission)");
            str5 = "admin_setting";
        } else if (C5203d.m21235a(th, 10040)) {
            str4 = context.getString(R.string.CreationMobile_DataUpgrade_Locked_toast);
            Intrinsics.checkExpressionValueIsNotNull(str4, "context.getString(R.stri…DataUpgrade_Locked_toast)");
        } else {
            str4 = context.getString(R.string.Doc_Facade_SendRequestFailed);
            Intrinsics.checkExpressionValueIsNotNull(str4, "context.getString(R.stri…Facade_SendRequestFailed)");
        }
        Toast.showFailureText(context, str4);
        PermissionAnalytic.m39413a(str5, str2, str3, "apply_permission");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41296a(Context context, String str, Locale locale, Throwable th, String str2, int i, String str3, ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "ownerName");
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUser");
        UserInfo userInfo = new UserInfo();
        userInfo.setName(str);
        userInfo.setCnName(str);
        userInfo.setEnName(str);
        m41295a(context, userInfo, locale, th, str2, i, str3, arrayList);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41295a(Context context, UserInfo userInfo, Locale locale, Throwable th, String str, int i, String str2, ArrayList<UserInfo> arrayList) {
        String str3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(userInfo, "ownerInfo");
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUser");
        String str4 = "admin_setting";
        if (th instanceof NetService.ServerErrorException) {
            InviteMemberSendLinkErrorParser.Companion aVar = InviteMemberSendLinkErrorParser.f26209a;
            NetService.ServerErrorException serverErrorException = (NetService.ServerErrorException) th;
            String data = serverErrorException.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "throwable.data");
            InviteMemberSendLinkData a = aVar.mo37119a(data, arrayList);
            List<NotNotifyUserEntity> ownerNotInGroups = a.getOwnerNotInGroups();
            if (ownerNotInGroups != null && (!ownerNotInGroups.isEmpty())) {
                HashMap hashMap = new HashMap();
                hashMap.put("group_name", m41291a(a.getOwnerNotInGroups()));
                String b = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31510b(context, i);
                Intrinsics.checkExpressionValueIsNotNull(b, "typeName");
                hashMap.put("doc_type", b);
                Toast.showText(context, C10539a.m43640a(context, R.string.CreatinoMobile_Minutes_request_unable, hashMap));
                return;
            } else if (serverErrorException.getCode() == 10040) {
                str3 = context.getString(R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                if (serverErrorException.getCode() == 10021) {
                    str3 = C10539a.m43639a(context, R.string.Doc_Permission_AskOwnerApplyBlock, "name", userInfo.getDisplayName(locale));
                } else {
                    if (serverErrorException.getCode() == 10022) {
                        str3 = C10539a.m43639a(context, R.string.Doc_Permission_AskOwnerApplyBlocked, "name", userInfo.getDisplayName(locale));
                    } else {
                        if (serverErrorException.getCode() == 10023) {
                            str3 = C10539a.m43639a(context, R.string.Doc_Permission_AskOwnerPrivacySettingBlocked, "name", userInfo.getDisplayName(locale));
                        } else {
                            if (serverErrorException.getCode() == 10025) {
                                HashMap hashMap2 = new HashMap();
                                String displayName = userInfo.getDisplayName(locale);
                                Intrinsics.checkExpressionValueIsNotNull(displayName, "ownerInfo.getDisplayName(locale)");
                                hashMap2.put("name", displayName);
                                hashMap2.put("count", String.valueOf(a.getAskOwnerLimitNum()));
                                str3 = C10539a.m43640a(context, R.string.Doc_Permission_AskOwnerApplyMaxLimit, hashMap2);
                            } else {
                                if (serverErrorException.getCode() == 10015) {
                                    str3 = C10539a.m43639a(context, R.string.Doc_Permission_SendApplyFailedForAdmin, "owner_name", userInfo.getDisplayName(locale));
                                } else {
                                    List<NotNotifyUserEntity> blockUsers = a.getBlockUsers();
                                    if (blockUsers == null || !(!blockUsers.isEmpty())) {
                                        List<NotNotifyUserEntity> blockedUsers = a.getBlockedUsers();
                                        if (blockedUsers == null || !(!blockedUsers.isEmpty())) {
                                            List<NotNotifyUserEntity> privacyUsers = a.getPrivacyUsers();
                                            if (privacyUsers == null || !(!privacyUsers.isEmpty())) {
                                                List<NotNotifyUserEntity> limitUsers = a.getLimitUsers();
                                                if (limitUsers == null || !(!limitUsers.isEmpty())) {
                                                    List<NotNotifyUserEntity> notNotifyUsers = a.getNotNotifyUsers();
                                                    if (notNotifyUsers == null || !(!notNotifyUsers.isEmpty())) {
                                                        List<NotNotifyUserEntity> inviteFailedUsers = a.getInviteFailedUsers();
                                                        if (inviteFailedUsers == null || !(!inviteFailedUsers.isEmpty())) {
                                                            str3 = context.getString(R.string.Doc_Permission_SendApplyFailed);
                                                        } else {
                                                            str3 = context.getString(R.string.Doc_Permission_SendApplyPartFailed);
                                                        }
                                                    } else {
                                                        str3 = C10539a.m43639a(context, R.string.Doc_Permission_AskOwnerApplyOwnerAdminBlocked, "name", m41291a(a.getNotNotifyUsers()));
                                                    }
                                                } else {
                                                    HashMap hashMap3 = new HashMap();
                                                    String displayName2 = userInfo.getDisplayName(locale);
                                                    Intrinsics.checkExpressionValueIsNotNull(displayName2, "ownerInfo.getDisplayName(locale)");
                                                    hashMap3.put("owner_name", displayName2);
                                                    hashMap3.put("name", m41291a(a.getLimitUsers()));
                                                    hashMap3.put("count", String.valueOf(a.getAskOwnerLimitNum()));
                                                    str3 = C10539a.m43640a(context, R.string.Doc_Permission_AskOwnerApplyOwnerMaxLimit, hashMap3);
                                                }
                                            } else {
                                                str3 = C10539a.m43639a(context, R.string.Doc_Permission_AskOwnerApplyOwnerPrivacySettingBlocked, "name", m41291a(a.getPrivacyUsers()));
                                            }
                                        } else {
                                            HashMap hashMap4 = new HashMap();
                                            String displayName3 = userInfo.getDisplayName(locale);
                                            Intrinsics.checkExpressionValueIsNotNull(displayName3, "ownerInfo.getDisplayName(locale)");
                                            hashMap4.put("owner_name", displayName3);
                                            hashMap4.put("name", m41291a(a.getBlockedUsers()));
                                            str3 = C10539a.m43640a(context, R.string.Doc_Permission_AskOwnerApplyOwnerBlocked, hashMap4);
                                        }
                                    } else {
                                        HashMap hashMap5 = new HashMap();
                                        String displayName4 = userInfo.getDisplayName(locale);
                                        Intrinsics.checkExpressionValueIsNotNull(displayName4, "ownerInfo.getDisplayName(locale)");
                                        hashMap5.put("owner_name", displayName4);
                                        hashMap5.put("name", m41291a(a.getBlockUsers()));
                                        str3 = C10539a.m43640a(context, R.string.Doc_Permission_AskOwnerApplyOwnerBlock, hashMap5);
                                    }
                                }
                                Toast.showFailureText(context, str3);
                                PermissionAnalytic.m39413a(str4, str, str2, "ask_owner");
                            }
                            str4 = "more_then_limited";
                            Toast.showFailureText(context, str3);
                            PermissionAnalytic.m39413a(str4, str, str2, "ask_owner");
                        }
                        str4 = "privacy_setting";
                        Toast.showFailureText(context, str3);
                        PermissionAnalytic.m39413a(str4, str, str2, "ask_owner");
                    }
                    str4 = "blocked";
                    Toast.showFailureText(context, str3);
                    PermissionAnalytic.m39413a(str4, str, str2, "ask_owner");
                }
                str4 = "block";
                Toast.showFailureText(context, str3);
                PermissionAnalytic.m39413a(str4, str, str2, "ask_owner");
            }
        } else if (!(th instanceof NetService.HttpErrorException) || ((NetService.HttpErrorException) th).getCode() != 429) {
            str3 = context.getString(R.string.Doc_Permission_SendApplyFailed);
        } else {
            str3 = context.getString(R.string.Doc_Permission_SendRequestMaxCount);
        }
        str4 = "others";
        Toast.showFailureText(context, str3);
        PermissionAnalytic.m39413a(str4, str, str2, "ask_owner");
    }
}
