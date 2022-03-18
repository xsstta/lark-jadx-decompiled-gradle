package com.ss.android.lark.calendar.impl.features.meetingroom.form.helper;

import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.data.ResourceFormUIData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u000b\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\f\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/helper/ResourceDataHelper;", "", "()V", "addInputOptionData", "", "formUIList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;", "Lkotlin/collections/ArrayList;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$CustomizationData$Builder;", "addMultipleOptionData", "addSingleOptionData", "convertToResourceFormUIData", "", "currentShowFormList", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b.c */
public final class ResourceDataHelper {

    /* renamed from: a */
    public static final ResourceDataHelper f82035a = new ResourceDataHelper();

    private ResourceDataHelper() {
    }

    /* renamed from: a */
    public final List<ResourceFormUIData> mo117091a(List<SchemaExtraData.CustomizationData.C16002a> list) {
        Intrinsics.checkParameterIsNotNull(list, "currentShowFormList");
        ArrayList<ResourceFormUIData> arrayList = new ArrayList<>();
        for (T t : list) {
            SchemaExtraData.CustomizationType customizationType = t.f42027a;
            if (customizationType != null) {
                int i = C32094d.f82036a[customizationType.ordinal()];
                if (i == 1) {
                    f82035a.m122040a(arrayList, t);
                } else if (i == 2) {
                    f82035a.m122041b(arrayList, t);
                } else if (i == 3) {
                    f82035a.m122042c(arrayList, t);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m122042c(ArrayList<ResourceFormUIData> arrayList, SchemaExtraData.CustomizationData.C16002a aVar) {
        SchemaExtraData.CustomizationData a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "customizationData");
        arrayList.add(new ResourceFormUIData(a, ResourceFormUIData.FormType.INPUT, null, 4, null));
    }

    /* renamed from: a */
    private final void m122040a(ArrayList<ResourceFormUIData> arrayList, SchemaExtraData.CustomizationData.C16002a aVar) {
        SchemaExtraData.CustomizationData a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "customizationData");
        arrayList.add(new ResourceFormUIData(a, ResourceFormUIData.FormType.OptionLabel, null, 4, null));
        List<SchemaExtraData.CustomizationOption> list = aVar.f42031e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ResourceFormUIData(a, ResourceFormUIData.FormType.SingleOption, it.next()));
            }
        }
    }

    /* renamed from: b */
    private final void m122041b(ArrayList<ResourceFormUIData> arrayList, SchemaExtraData.CustomizationData.C16002a aVar) {
        SchemaExtraData.CustomizationData a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "customizationData");
        arrayList.add(new ResourceFormUIData(a, ResourceFormUIData.FormType.OptionLabel, null, 4, null));
        List<SchemaExtraData.CustomizationOption> list = aVar.f42031e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ResourceFormUIData(a, ResourceFormUIData.FormType.MultipleOption, it.next()));
            }
        }
    }
}
