package com.ss.android.lark.member_manage.impl.add_member;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.member_manage.dto.SelectedData;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.add_member.f */
public class C44959f {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.f$1 */
    public static /* synthetic */ class C449601 {

        /* renamed from: a */
        static final /* synthetic */ int[] f113845a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type[] r0 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.member_manage.impl.add_member.C44959f.C449601.f113845a = r0
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type r1 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.LEAVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.member_manage.impl.add_member.C44959f.C449601.f113845a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type r1 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.MEETING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.member_manage.impl.add_member.C44959f.C449601.f113845a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type r1 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.BUSINESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.member_manage.impl.add_member.C44959f.C449601.f113845a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type r1 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.member_manage.impl.add_member.C44959f.C449601.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static int m178299a(ChatterDescription.Type type) {
        int i = C449601.f113845a[type.ordinal()];
        if (i == 1) {
            return R.drawable.ud_icon_status_vacation_outlined;
        }
        if (i == 2) {
            return R.drawable.ud_icon_status_meeting_outlined;
        }
        if (i != 3) {
            return R.drawable.ud_icon_chat_news_outlined;
        }
        return R.drawable.ud_icon_status_trip_outlined;
    }

    /* renamed from: a */
    public static SelectedData m178300a(SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo == null) {
            return null;
        }
        SelectedData selectedData = new SelectedData();
        selectedData.id = searchBaseInfo.getId();
        selectedData.dataType = SelectedData.DataType.CHATTER;
        selectedData.name = searchBaseInfo.getTitle();
        selectedData.avatarKey = searchBaseInfo.getAvatarKey();
        if (searchBaseInfo instanceof SearchChatterInfo) {
            m178303a(selectedData, (SearchChatterInfo) searchBaseInfo);
        }
        return selectedData;
    }

    /* renamed from: a */
    public static List<SelectedData> m178301a(List<SearchBaseInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (SearchBaseInfo searchBaseInfo : list) {
            arrayList.add(m178300a(searchBaseInfo));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<SearchBaseInfo> m178302a(List<SelectedData> list, Map<String, SearchBaseInfo> map) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list) && !CollectionUtils.isEmpty(map)) {
            for (SelectedData selectedData : list) {
                SearchBaseInfo searchBaseInfo = map.get(selectedData.id);
                if (searchBaseInfo != null) {
                    arrayList.add(searchBaseInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m178303a(SelectedData selectedData, SearchChatterInfo searchChatterInfo) {
        boolean z;
        selectedData.isRegistered = searchChatterInfo.isRegistered();
        if (!TextUtils.isEmpty(searchChatterInfo.getChatterDescription().description) || searchChatterInfo.getChatterDescription().type != ChatterDescription.Type.DEFAULT) {
            z = true;
        } else {
            z = false;
        }
        selectedData.isShowDescription = z;
        selectedData.description = searchChatterInfo.getChatterDescription().description;
        selectedData.descriptionDrawable = m178299a(searchChatterInfo.getChatterDescription().type);
    }
}
