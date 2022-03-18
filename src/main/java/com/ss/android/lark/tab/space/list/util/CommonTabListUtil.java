package com.ss.android.lark.tab.space.list.util;

import android.content.Context;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J2\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/tab/space/list/util/CommonTabListUtil;", "", "()V", "getSearchResultTime", "", "context", "Landroid/content/Context;", "timeSec", "", "is24HourTime", "", "removeRepeatViewData", "", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "oriOldTotalData", "oriData", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.a.a */
public final class CommonTabListUtil {

    /* renamed from: a */
    public static final CommonTabListUtil f136450a = new CommonTabListUtil();

    private CommonTabListUtil() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends T extends com.ss.android.lark.tab.space.list.entity.BaseListViewData> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends BaseListViewData> List<T> mo188437a(List<? extends T> list, List<? extends T> list2) {
        Intrinsics.checkParameterIsNotNull(list, "oriOldTotalData");
        Intrinsics.checkParameterIsNotNull(list2, "oriData");
        List<? extends T> list3 = list;
        if (CollectionUtils.isEmpty(list3)) {
            if (CollectionUtils.isEmpty(list2)) {
                return new ArrayList();
            }
            return list2;
        } else if (CollectionUtils.isEmpty(list2)) {
            return new ArrayList();
        } else {
            HashSet hashSet = new HashSet(list3);
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                BaseListViewData baseListViewData = (BaseListViewData) it.next();
                if (!hashSet.contains(baseListViewData)) {
                    arrayList.add(baseListViewData);
                }
            }
            return arrayList;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m214424a(Context context, long j, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191593a(LengthType.SHORT);
        aVar.mo191599b(!z);
        aVar.mo191594a(TimePreciseness.MINUTE);
        return TimeFormatUtils.m219292g(context, new Date(((long) 1000) * j), aVar);
    }
}
