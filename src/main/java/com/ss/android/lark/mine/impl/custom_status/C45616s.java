package com.ss.android.lark.mine.impl.custom_status;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusResponse;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.custom_status.UserCustomStatusService;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.ttm.player.MediaPlayer;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0006\u0010\u0012\u001a\u00020\u000f\u001a\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0012\u0010\u0017\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"TAG", "", "getCurrentNtpTime", "", "getOpenedUserStatus", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "userStatusList", "", "getUpdateSyncSettingResponse", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusResponse;", "id", "map", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "", "service", "Lcom/ss/android/lark/mine/impl/custom_status/UserCustomStatusService;", "isOpenUserStatus", "vibrate", "", "context", "Landroid/content/Context;", "toDisplayTime", "core_mine_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.s */
public final class C45616s {
    /* renamed from: a */
    public static final boolean m180944a() {
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        return a.mo133451j().mo133481a("lark.core.status.5.0");
    }

    /* renamed from: b */
    public static final long m180945b() {
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        AbstractC45399a.AbstractC45417r o = a.mo133456o();
        Intrinsics.checkExpressionValueIsNotNull(o, "MineModule.getDependency().settingDependency");
        Long c = o.mo133489c();
        Intrinsics.checkExpressionValueIsNotNull(c, "MineModule.getDependency…settingDependency.ntpTime");
        return c.longValue();
    }

    /* renamed from: a */
    public static final void m180943a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            Object systemService = context.getSystemService("vibrator");
            if (!(systemService instanceof Vibrator)) {
                systemService = null;
            }
            Vibrator vibrator = (Vibrator) systemService;
            if (Build.VERSION.SDK_INT > 26) {
                if (vibrator != null) {
                    vibrator.vibrate(VibrationEffect.createOneShot(80, -1));
                }
            } else if (vibrator != null) {
                vibrator.vibrate(80);
            }
        } catch (Exception e) {
            Log.m165383e("UserCustomStatusUtil", e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.bytedance.lark.pb.basic.v1.Chatter.ChatterCustomStatus m180940a(java.util.List<com.bytedance.lark.pb.basic.v1.Chatter.ChatterCustomStatus> r8) {
        /*
            long r0 = m180945b()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 0
            if (r8 == 0) goto L_0x0047
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0010:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r8.next()
            r4 = r3
            com.bytedance.lark.pb.basic.v1.Chatter$ChatterCustomStatus r4 = (com.bytedance.lark.pb.basic.v1.Chatter.ChatterCustomStatus) r4
            com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval r4 = r4.effective_interval
            if (r4 == 0) goto L_0x0041
            java.lang.Long r5 = r4.end_time
            java.lang.String r6 = "interval.end_time"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            long r5 = r5.longValue()
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0041
            java.lang.Long r4 = r4.start_time
            java.lang.String r5 = "interval.start_time"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            long r4 = r4.longValue()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            if (r4 == 0) goto L_0x0010
            r2 = r3
        L_0x0045:
            com.bytedance.lark.pb.basic.v1.Chatter$ChatterCustomStatus r2 = (com.bytedance.lark.pb.basic.v1.Chatter.ChatterCustomStatus) r2
        L_0x0047:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mine.impl.custom_status.C45616s.m180940a(java.util.List):com.bytedance.lark.pb.basic.v1.Chatter$ChatterCustomStatus");
    }

    /* renamed from: a */
    public static final String m180942a(long j, Context context) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Date date = new Date(j * 1000);
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191594a(TimePreciseness.MINUTE);
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        TimeFormatSetting localTimeFormat = ((ICoreApi) api).getLocalTimeFormat();
        Intrinsics.checkExpressionValueIsNotNull(localTimeFormat, "ApiUtils.getApi(ICoreApi…ass.java).localTimeFormat");
        if (localTimeFormat.mo105510a() == TimeFormatSetting.TimeFormat.TWELVE_HOUR) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo191599b(z);
        aVar.mo191603d(true);
        return TimeFormatUtils.m219292g(context, date, aVar);
    }

    /* renamed from: a */
    public static final RucketJob<UpdateUserCustomStatusResponse> m180941a(long j, Map<CustomStatusSyncField, Boolean> map, UserCustomStatusService rVar) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        Intrinsics.checkParameterIsNotNull(rVar, "service");
        UpdateUserCustomStatusMeta.C16414a a = new UpdateUserCustomStatusMeta.C16414a().mo58588a(Long.valueOf(j)).mo58590a(CollectionsKt.listOf(UpdateUserCustomStatusMeta.UserCustomStatusField.SYN_SETTINGS));
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (T t : map.entrySet()) {
            linkedHashMap.put(Long.valueOf((long) ((CustomStatusSyncField) t.getKey()).getValue()), t.getValue());
        }
        UpdateUserCustomStatusRequest a2 = new UpdateUserCustomStatusRequest.C16416a().mo58598a(CollectionsKt.listOf(a.mo58591a(linkedHashMap).build())).build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "request");
        return UserCustomStatusService.C45609a.m180938a(rVar, a2, (Function1) null, 2, (Object) null);
    }
}
