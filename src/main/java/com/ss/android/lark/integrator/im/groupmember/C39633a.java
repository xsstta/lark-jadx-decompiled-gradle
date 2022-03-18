package com.ss.android.lark.integrator.im.groupmember;

import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dto.SelectedData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.groupmember.a */
public class C39633a {
    /* renamed from: a */
    public static GroupMemberManageModule m157280a() {
        return new GroupMemberManageModule();
    }

    /* renamed from: a */
    static SelectedData m157279a(com.ss.android.lark.member_manage.dto.SelectedData selectedData) {
        SelectedData.DataType dataType = null;
        if (selectedData == null) {
            return null;
        }
        SelectedData selectedData2 = new SelectedData();
        selectedData2.avatarKey = selectedData.avatarKey;
        if (selectedData.dataType != null) {
            dataType = SelectedData.DataType.valueOf(selectedData.dataType.getNumber());
        }
        selectedData2.dataType = dataType;
        selectedData2.description = selectedData.description;
        selectedData2.descriptionDrawable = selectedData.descriptionDrawable;
        selectedData2.id = selectedData.id;
        selectedData2.isRegistered = selectedData.isRegistered;
        selectedData2.isShowDescription = selectedData.isShowDescription;
        selectedData2.name = selectedData.name;
        return selectedData2;
    }

    /* renamed from: b */
    static List<com.ss.android.lark.member_manage.dto.SelectedData> m157283b(List<SelectedData> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SelectedData selectedData : list) {
            arrayList.add(m157281a(selectedData));
        }
        return arrayList;
    }

    /* renamed from: a */
    static com.ss.android.lark.member_manage.dto.SelectedData m157281a(SelectedData selectedData) {
        SelectedData.DataType dataType = null;
        if (selectedData == null) {
            return null;
        }
        com.ss.android.lark.member_manage.dto.SelectedData selectedData2 = new com.ss.android.lark.member_manage.dto.SelectedData();
        selectedData2.avatarKey = selectedData.avatarKey;
        if (selectedData.dataType != null) {
            dataType = SelectedData.DataType.valueOf(selectedData.dataType.getNumber());
        }
        selectedData2.dataType = dataType;
        selectedData2.description = selectedData.description;
        selectedData2.descriptionDrawable = selectedData.descriptionDrawable;
        selectedData2.id = selectedData.id;
        selectedData2.isRegistered = selectedData.isRegistered;
        selectedData2.isShowDescription = selectedData.isShowDescription;
        selectedData2.name = selectedData.name;
        return selectedData2;
    }

    /* renamed from: a */
    static List<com.ss.android.lark.contact.entity.SelectedData> m157282a(List<com.ss.android.lark.member_manage.dto.SelectedData> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.member_manage.dto.SelectedData selectedData : list) {
            arrayList.add(m157279a(selectedData));
        }
        return arrayList;
    }
}
