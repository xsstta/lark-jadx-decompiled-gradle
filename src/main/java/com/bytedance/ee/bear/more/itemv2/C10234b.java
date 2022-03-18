package com.bytedance.ee.bear.more.itemv2;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.bytedance.ee.bear.more.itemv2.b */
public class C10234b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.more.itemv2.b$1 */
    public static /* synthetic */ class C102351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27620a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 169
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.itemv2.C10234b.C102351.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static IBaseMoreItem m42700a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId) {
        switch (C102351.f27620a[commonMoreItemId.ordinal()]) {
            case 1:
                return new RenameItemV2(fragmentActivity);
            case 2:
                return new ShortcutItemV2(fragmentActivity);
            case 3:
                return new StarItemV2();
            case 4:
                return new PinItemV2();
            case 5:
                return new ManualCacheItemV2(fragmentActivity);
            case 6:
                return new AddItemV2();
            case 7:
                return new AddShortCutItemV2();
            case 8:
                return new DeleteItemV2(fragmentActivity);
            case 9:
                return new PermissionItemV2();
            case 10:
                return new MakeCopyItemV2(fragmentActivity);
            case 11:
                return new ContactServiceItemV2();
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return new ReportItemV2();
            case 13:
                return new SubscribeItemV2();
            case 14:
                return new ApplyPermMoreItemV2(fragmentActivity);
            default:
                throw new IllegalArgumentException("more item is not exists: id = " + commonMoreItemId.getId());
        }
    }
}
