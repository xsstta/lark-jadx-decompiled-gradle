package com.ss.android.vc.meeting.module.follow.common;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.C60657a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.FollowStrategy;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.common.b */
public class C61806b {
    /* renamed from: a */
    private static int m241468a() {
        int i = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            i = Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        C60700b.m235851b("FollowLog_", "[getTotalMemory2]", "totalMem = " + i);
        return i;
    }

    /* renamed from: a */
    public static boolean m241471a(FollowInfo followInfo) {
        if (followInfo == null || TextUtils.isEmpty(followInfo.getDeviceId())) {
            return false;
        }
        return ParticipantUtil.m248722a(followInfo.getUserId(), followInfo.getUserType(), followInfo.getDeviceId());
    }

    /* renamed from: b */
    public static boolean m241475b(FollowInfo followInfo) {
        if (followInfo == null || TextUtils.isEmpty(followInfo.getDeviceId())) {
            return false;
        }
        return !TextUtils.isEmpty(followInfo.getShareId());
    }

    /* renamed from: a */
    public static int m241469a(Context context) {
        if (context == null) {
            C60700b.m235851b("FollowLog_", "[getTotalMemory]", "context = null");
            return -1;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        int i = (int) (memoryInfo.totalMem / 1024);
        C60700b.m235851b("FollowLog_", "[getTotalMemory]", "totalMem = " + i);
        if (i < 1048576) {
            return m241468a();
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m241476b(List<Participant> list) {
        for (Participant participant : list) {
            if (C60657a.m235732a().mo208741a(participant)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<VcDoc> m241470a(List<VcDoc> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (VcDoc vcDoc : list) {
            String docToken = vcDoc.getDocToken();
            if (hashMap.get(docToken) == null) {
                arrayList.add(vcDoc);
                hashMap.put(docToken, 1);
            } else {
                hashMap.put(docToken, Integer.valueOf(((Integer) hashMap.get(docToken)).intValue() + 1));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m241472a(FollowInfo followInfo, Participant participant) {
        if (followInfo == null || participant == null || CollectionUtils.isEmpty(followInfo.getStrategies())) {
            return false;
        }
        List<String> followProduceStrategyIds = participant.getCapabilities().getFollowProduceStrategyIds();
        if (CollectionUtils.isEmpty(followProduceStrategyIds) && followInfo.getShareSubType() != FollowInfo.ShareSubType.CCM_DOC) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowStrategy followStrategy : followInfo.getStrategies()) {
            if (!TextUtils.isEmpty(followStrategy.getId())) {
                arrayList.add(followStrategy.getId());
            }
        }
        C60700b.m235851b("FollowLog_", "[hasTakeControlCapability]", "produceStrategyIds = " + followProduceStrategyIds + ", followStrategyIds = " + arrayList);
        if (!participant.getCapabilities().isFollowPresenter()) {
            return false;
        }
        if (followInfo.getShareSubType() == FollowInfo.ShareSubType.CCM_DOC || followProduceStrategyIds.containsAll(arrayList)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m241473a(FollowInfo followInfo, FollowInfo followInfo2) {
        if (followInfo == null || followInfo2 == null) {
            return false;
        }
        return m241474a(followInfo.getRawUrl(), followInfo2.getRawUrl());
    }

    /* renamed from: a */
    public static boolean m241474a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (!TextUtils.isEmpty(parse.getLastPathSegment()) && !TextUtils.isEmpty(parse2.getLastPathSegment())) {
                return parse.getLastPathSegment().equals(parse2.getLastPathSegment());
            }
        }
        return false;
    }
}
