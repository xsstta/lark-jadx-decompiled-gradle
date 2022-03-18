package com.ss.android.lark.calendar.impl.features.events.detail.share.util;

import android.util.SparseArray;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareItemViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/util/ShareItemFactory;", "", "()V", "mHandlerShareItemArray", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareItemViewData;", "getShareItemViewData", "shareType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "getShareViewDataList", "", "shareTypeList", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b.e */
public final class ShareItemFactory {

    /* renamed from: a */
    public static final ShareItemFactory f79503a = new ShareItemFactory();

    /* renamed from: b */
    private static final SparseArray<ShareItemViewData> f79504b;

    private ShareItemFactory() {
    }

    static {
        SparseArray<ShareItemViewData> sparseArray = new SparseArray<>();
        f79504b = sparseArray;
        int value = ShareType.LARK.getValue();
        ShareType shareType = ShareType.LARK;
        String string = UIHelper.getString(R.string.Calendar_Share_Lark);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(string.Calendar_Share_Lark)");
        Integer valueOf = Integer.valueOf((int) R.color.text_title);
        sparseArray.put(value, new ShareItemViewData(shareType, string, R.drawable.ud_icon_forward_outlined, valueOf));
        int value2 = ShareType.COPY.getValue();
        ShareType shareType2 = ShareType.COPY;
        String string2 = UIHelper.getString(R.string.Calendar_Share_CopyLink);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(string.Calendar_Share_CopyLink)");
        sparseArray.put(value2, new ShareItemViewData(shareType2, string2, R.drawable.ud_icon_link_copy_outlined, valueOf));
        int value3 = ShareType.CREATE_IMAGE.getValue();
        ShareType shareType3 = ShareType.CREATE_IMAGE;
        String string3 = UIHelper.getString(R.string.Calendar_Share_Image);
        Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(string.Calendar_Share_Image)");
        sparseArray.put(value3, new ShareItemViewData(shareType3, string3, R.drawable.ud_icon_image_outlined, valueOf));
        int value4 = ShareType.WX.getValue();
        ShareType shareType4 = ShareType.WX;
        String string4 = UIHelper.getString(R.string.Calendar_Share_Wechat);
        Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(string.Calendar_Share_Wechat)");
        sparseArray.put(value4, new ShareItemViewData(shareType4, string4, R.drawable.ts_icon_wx, null, 8, null));
        int value5 = ShareType.WX_TIMELINE.getValue();
        ShareType shareType5 = ShareType.WX_TIMELINE;
        String string5 = UIHelper.getString(R.string.Calendar_Share_Moments);
        Intrinsics.checkExpressionValueIsNotNull(string5, "UIHelper.getString(string.Calendar_Share_Moments)");
        sparseArray.put(value5, new ShareItemViewData(shareType5, string5, R.drawable.ts_icon_wx_timeline, null, 8, null));
        int value6 = ShareType.WEIBO.getValue();
        ShareType shareType6 = ShareType.WEIBO;
        String string6 = UIHelper.getString(R.string.Calendar_Share_Weibo);
        Intrinsics.checkExpressionValueIsNotNull(string6, "UIHelper.getString(string.Calendar_Share_Weibo)");
        sparseArray.put(value6, new ShareItemViewData(shareType6, string6, R.drawable.ts_icon_wb, null, 8, null));
        int value7 = ShareType.QQ.getValue();
        ShareType shareType7 = ShareType.QQ;
        String string7 = UIHelper.getString(R.string.Calendar_Share_QQ);
        Intrinsics.checkExpressionValueIsNotNull(string7, "UIHelper.getString(string.Calendar_Share_QQ)");
        sparseArray.put(value7, new ShareItemViewData(shareType7, string7, R.drawable.ts_icon_qq, null, 8, null));
        int value8 = ShareType.SAVE_IMAGE.getValue();
        ShareType shareType8 = ShareType.SAVE_IMAGE;
        String string8 = UIHelper.getString(R.string.Calendar_Share_Album);
        Intrinsics.checkExpressionValueIsNotNull(string8, "UIHelper.getString(string.Calendar_Share_Album)");
        sparseArray.put(value8, new ShareItemViewData(shareType8, string8, R.drawable.ud_icon_download_outlined, valueOf));
        int value9 = ShareType.SYS.getValue();
        ShareType shareType9 = ShareType.SYS;
        String string9 = UIHelper.getString(R.string.Calendar_Share_System);
        Intrinsics.checkExpressionValueIsNotNull(string9, "UIHelper.getString(string.Calendar_Share_System)");
        sparseArray.put(value9, new ShareItemViewData(shareType9, string9, R.drawable.ud_icon_more_outlined, valueOf));
    }

    /* renamed from: a */
    public final ShareItemViewData mo113953a(ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        return f79504b.get(shareType.getValue());
    }

    /* renamed from: a */
    public final List<ShareItemViewData> mo113954a(List<? extends ShareType> list) {
        Intrinsics.checkParameterIsNotNull(list, "shareTypeList");
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (ShareType shareType : list) {
            ShareItemViewData a = mo113953a(shareType);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
