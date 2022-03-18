package com.ss.android.lark.contact.impl.statistics;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/statistics/PrivacyHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.g.c */
public final class PrivacyHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f92909a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u001aJ\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010#\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/contact/impl/statistics/PrivacyHitPoint$Companion;", "", "()V", "ADD_BY_QRCODE_LINK", "", "ADD_BY_USER_CARD", "ADD_IN_CHAT", "ADD_IN_DOCS", "ADD_IN_EMAIL", "ADD_IN_EVENT", "ADD_IN_VC", "ALL", "ALL_BUT_DOC", "CLICK_KEY", "CLICK_VALUE", "CONTACTS", "FIND_UNKNOWN", "FIND_WITH_EMAIL", "FIND_WITH_MOBILE", "IS_ON_KEY", "KEY_ENABLE", "KEY_TYPE", "TAG", "TARGET_KEY", "TARGET_VALUE", "sendAddMeEvent", "", ShareHitPoint.f121869d, "enable", "", "sendClickChatEvent", "sendClickPhoneCheck", "isChecked", "sendDeleteBlockUser", "sendFindMeEvent", "sendPrivacyViewDifferenceClick", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.g.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo132206a() {
            try {
                Statistics.sendEvent("privacy_view_difference_click");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: b */
        public final void mo132210b() {
            try {
                Statistics.sendEvent("setting_privacy_block_delete");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo132207a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            try {
                Statistics.sendEvent("setting_privacy_chat", new JSONObject().put(ShareHitPoint.f121869d, str));
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo132209a(boolean z) {
            String str;
            try {
                JSONObject put = new JSONObject().put("click", "notify_me_when_checking_my_tel_number").put("target", "none");
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                Statistics.sendEvent("setting_detail_click", put.put("is_on", str));
            } catch (Exception e) {
                Log.m165383e("PrivacyHitPoint", e.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo132208a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            try {
                Statistics.sendEvent("setting_addme", new JSONObject().put(ShareHitPoint.f121869d, str).put("enable", z));
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }
    }
}
