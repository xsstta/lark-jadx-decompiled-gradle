package com.ss.android.lark.profile.func.user_profile.header;

import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.user_profile.header.cta.BaseCtaViewData;
import com.ss.android.lark.profile.func.user_profile.header.cta.ChatCtaViewData;
import com.ss.android.lark.profile.func.user_profile.header.cta.LinkCtaViewData;
import com.ss.android.lark.profile.func.user_profile.header.cta.PredefineCtaViewData;
import com.ss.android.lark.profile.v2.entity.Profile;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewDataParser;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.header.b */
public final class HeaderViewDataParser {

    /* renamed from: a */
    public static final Companion f130195a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewDataParser$Companion;", "", "()V", "parseProfile2HeaderViewData", "Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "profile", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final HeaderViewData mo179818a(Profile profile) {
            boolean z;
            String str;
            int i;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Intrinsics.checkParameterIsNotNull(profile, "profile");
            ArrayList arrayList = new ArrayList();
            for (T t : profile.getCtas()) {
                int ctaType = t.getCtaType();
                BaseCtaViewData baseCtaViewData = null;
                if (ctaType != 1) {
                    switch (ctaType) {
                        case 10:
                            if (profile.getUserInfo().isResigned()) {
                                i = R.drawable.profile_start_demission_chat_btn_bg;
                            } else {
                                i = R.drawable.profile_send_msg_btn_bg;
                            }
                            boolean enable = t.getEnable();
                            String name = t.getName();
                            int denyReason = t.getDenyReason();
                            String denyReasonDescription = t.getDenyReasonDescription();
                            if (denyReasonDescription != null) {
                                str2 = denyReasonDescription;
                            } else {
                                str2 = "";
                            }
                            baseCtaViewData = new ChatCtaViewData(enable, name, 10, i, denyReason, str2, C52239a.m202617d().mo133570d("all_profile_nonfriend_chatcta"));
                            break;
                        case 11:
                            if (C52239a.m202617d().mo133578h("secretChat")) {
                                IProfileModuleDependency d = C52239a.m202617d();
                                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                                if (d.mo133580j()) {
                                    IProfileModuleDependency d2 = C52239a.m202617d();
                                    Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
                                    if (d2.mo133581k()) {
                                        boolean enable2 = t.getEnable();
                                        String name2 = t.getName();
                                        int denyReason2 = t.getDenyReason();
                                        String denyReasonDescription2 = t.getDenyReasonDescription();
                                        if (denyReasonDescription2 != null) {
                                            str4 = denyReasonDescription2;
                                        } else {
                                            str4 = "";
                                        }
                                        baseCtaViewData = new PredefineCtaViewData(enable2, name2, 11, R.drawable.profile_start_secret_chat_btn_bg, denyReason2, str4);
                                    }
                                } else if (C52239a.m202617d().mo133561a("secretchat.main")) {
                                    boolean enable3 = t.getEnable();
                                    String name3 = t.getName();
                                    int denyReason3 = t.getDenyReason();
                                    String denyReasonDescription3 = t.getDenyReasonDescription();
                                    if (denyReasonDescription3 != null) {
                                        str3 = denyReasonDescription3;
                                    } else {
                                        str3 = "";
                                    }
                                    baseCtaViewData = new PredefineCtaViewData(enable3, name3, 11, R.drawable.profile_start_secret_chat_btn_bg, denyReason3, str3);
                                }
                            }
                            baseCtaViewData = baseCtaViewData;
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            boolean enable4 = t.getEnable();
                            String name4 = t.getName();
                            int denyReason4 = t.getDenyReason();
                            String denyReasonDescription4 = t.getDenyReasonDescription();
                            if (denyReasonDescription4 != null) {
                                str5 = denyReasonDescription4;
                            } else {
                                str5 = "";
                            }
                            baseCtaViewData = new PredefineCtaViewData(enable4, name4, 12, R.drawable.profile_start_phone_call_btn_bg, denyReason4, str5);
                            break;
                        case 13:
                            boolean enable5 = t.getEnable();
                            String name5 = t.getName();
                            int denyReason5 = t.getDenyReason();
                            String denyReasonDescription5 = t.getDenyReasonDescription();
                            if (denyReasonDescription5 != null) {
                                str6 = denyReasonDescription5;
                            } else {
                                str6 = "";
                            }
                            baseCtaViewData = new PredefineCtaViewData(enable5, name5, 13, R.drawable.profile_start_video_chat_btn_bg, denyReason5, str6);
                            break;
                        case 14:
                            if (C52239a.m202617d().mo133561a("lark.client.contact.opt")) {
                                boolean enable6 = t.getEnable();
                                String name6 = t.getName();
                                int denyReason6 = t.getDenyReason();
                                String denyReasonDescription6 = t.getDenyReasonDescription();
                                if (denyReasonDescription6 != null) {
                                    str7 = denyReasonDescription6;
                                } else {
                                    str7 = "";
                                }
                                baseCtaViewData = new PredefineCtaViewData(enable6, name6, 14, R.drawable.profile_share_user_card_btn_bg, denyReason6, str7);
                            }
                            baseCtaViewData = baseCtaViewData;
                            break;
                    }
                } else {
                    boolean enable7 = t.getEnable();
                    String name7 = t.getName();
                    String url = t.getUrl();
                    String iconKey = t.getIconKey();
                    int denyReason7 = t.getDenyReason();
                    String denyReasonDescription7 = t.getDenyReasonDescription();
                    if (denyReasonDescription7 != null) {
                        str = denyReasonDescription7;
                    } else {
                        str = "";
                    }
                    baseCtaViewData = new LinkCtaViewData(enable7, name7, url, iconKey, denyReason7, str);
                }
                if (baseCtaViewData != null) {
                    arrayList.add(baseCtaViewData);
                }
            }
            String tenantName = profile.getUserInfo().getTenantName();
            if (profile.getUserInfo().getUserTag() == 1) {
                tenantName = UIHelper.getString(R.string.Lark_Education_Student);
            }
            String userName = profile.getUserInfo().getUserName();
            String avatarKey = profile.getUserInfo().getAvatarKey();
            String userId = profile.getUserInfo().getUserId();
            ArrayList arrayList2 = arrayList;
            int gender = profile.getUserInfo().getGender();
            if (profile.getUserInfo().getDoNotDisturbEndTime() != null) {
                IProfileModuleDependency d3 = C52239a.m202617d();
                Long doNotDisturbEndTime = profile.getUserInfo().getDoNotDisturbEndTime();
                if (doNotDisturbEndTime == null) {
                    Intrinsics.throwNpe();
                }
                z = d3.mo133560a(doNotDisturbEndTime.longValue());
            } else {
                z = false;
            }
            return new HeaderViewData(userName, avatarKey, userId, tenantName, arrayList2, gender, z, profile.getUserInfo().getFrozen(), profile.getUserInfo().getWorkStatus(), profile.getUserInfo().isResigned(), profile.getUserInfo().isBlocked(), profile.getUserInfo().isTenantCertification(), profile.getUserInfo().getTenantCertificationUrl(), profile.getUserInfo().isHasTenantCertification(), profile.getUserInfo().getCustomTagFields());
        }
    }
}
