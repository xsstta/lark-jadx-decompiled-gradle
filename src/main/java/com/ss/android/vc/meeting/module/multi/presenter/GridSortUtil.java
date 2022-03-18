package com.ss.android.vc.meeting.module.multi.presenter;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jx\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0007Jh\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J&\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J^\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\u001e\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0001\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0-2\u001e\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u001cH\u0002¢\u0006\u0002\u00100JT\u00101\u001a\u00020\b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\u001e\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\u0006\u00102\u001a\u0002032\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002JK\u00104\u001a\u0004\u0018\u00010\f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0-2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0002\u00105Jx\u00106\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u001e\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\u001e\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001cH\u0002J¢\u0001\u00107\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u00102\u001a\u0002032\u0006\u0010!\u001a\u00020\"2\u001e\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\u001e\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0002Jf\u00108\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\u001e\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0006H\u0002JZ\u00109\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150(0\u001c2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u00102\u001a\u0002032\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/presenter/GridSortUtil;", "", "()V", "TAG", "", "printLog", "", "adjustCurrPageParticipants", "", "fromGridOrGallery", "oldParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "newParticipants", "", "asModel", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingGridModel;", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "isFirstPage", "pageSize", "", "firstVisiblePos", "lastVisiblePos", "selfUniqueId", "newEnterParticipants", "Ljava/util/HashSet;", "buildFindFirstPageScopeMap", "", "localP", "newAS", "tmpNewList", "newOpenCameraList", "firstPageMayChange", "", "newParticipantMap", "dumpPageSortInfos", "finalParticipants", "fillNewCurrPage", "oldCurrPageDevices", "Lkotlin/Pair;", "fillNewFirstPage", "valNewAS", "findFirstPageScopeMap", "newFirstPageDevices", "", "oldFirstPageDevices", "newCurrPageDevices", "(ZLcom/ss/android/vc/entity/Participant;Ljava/util/List;Ljava/util/List;Ljava/util/Map;[Lcom/ss/android/vc/entity/Participant;Ljava/util/Map;Ljava/util/Map;)V", "findCloseCameraFromFirstPage", "score", "", "findLocalP", "(Ljava/util/Map;Ljava/lang/String;[Lcom/ss/android/vc/entity/Participant;Ljava/util/List;)Lcom/ss/android/vc/entity/Participant;", "findNewAS", "findOpenCameraNotFromFirstAndCurr", "recordOldCurrPage", "recordOldFirstPage", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.presenter.a */
public final class GridSortUtil {

    /* renamed from: a */
    public static final GridSortUtil f157345a = new GridSortUtil();

    /* renamed from: a */
    private final void m244530a(boolean z, List<Participant> list, TriggerType triggerType) {
    }

    private GridSortUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m244531a(boolean z, List<Participant> list, List<? extends Participant> list2, C62526c cVar, TriggerType triggerType, boolean z2, int i, int i2, int i3, String str, HashSet<String> hashSet) {
        Intrinsics.checkParameterIsNotNull(list, "oldParticipants");
        Intrinsics.checkParameterIsNotNull(list2, "newParticipants");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
        boolean[] zArr = {false};
        float[] fArr = {FloatCompanionObject.f173206a.mo239331a(), -FloatCompanionObject.f173206a.mo239331a()};
        LinkedList linkedList = new LinkedList();
        List<? extends Participant> list3 = list2;
        if (true ^ list3.isEmpty()) {
            linkedList.addAll(list3);
        }
        Map<String, Participant> a = ParticipantUtil.m248707a(linkedList);
        Participant[] participantArr = new Participant[i];
        GridSortUtil aVar = f157345a;
        Intrinsics.checkExpressionValueIsNotNull(a, "newParticipantMap");
        Map<String, Pair<Participant, Integer>> a2 = aVar.m244524a(i, list, a, fArr, zArr);
        Map<String, Pair<Participant, Integer>> a3 = aVar.m244527a(a2, list, i2, i3, z2);
        Participant a4 = aVar.m244522a(a, str, participantArr, linkedList);
        List<Participant> a5 = aVar.m244523a(list, a, fArr, zArr, a2, a3, a4, triggerType, hashSet);
        aVar.m244528a(a, a2, fArr, zArr, triggerType);
        Map<Integer, Participant> a6 = aVar.m244526a(linkedList, a, a3, z2);
        Participant a7 = aVar.m244521a(cVar, a, z2, zArr, a2, a3);
        aVar.m244529a(z, a7, linkedList, a5, aVar.m244525a(a4, a7, linkedList, a5, zArr, a, i), participantArr, a2, a6);
        list.clear();
        list.addAll(linkedList);
        aVar.m244530a(z, list, triggerType);
    }

    /* renamed from: a */
    private final void m244528a(Map<String, Participant> map, Map<String, Pair<Participant, Integer>> map2, float[] fArr, boolean[] zArr, TriggerType triggerType) {
        Participant participant;
        if (triggerType == TriggerType.PUSH) {
            Iterator<Map.Entry<String, Pair<Participant, Integer>>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Participant first = it.next().getValue().getFirst();
                if (!ParticipantUtil.m248732c(first)) {
                    ParticipantSettings participantSettings = first.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings, "oldP.participantSettings");
                    if (!participantSettings.isCameraMuted() && (participant = map.get(ParticipantUtil.m248706a(first))) != null) {
                        ParticipantSettings participantSettings2 = participant.getParticipantSettings();
                        Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "newP.participantSettings");
                        if (participantSettings2.isCameraMuted() && participant.getGridSortScore().floatValue() < fArr[1]) {
                            it.remove();
                            zArr[0] = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m244529a(boolean z, Participant participant, List<Participant> list, List<Participant> list2, Map<String, Participant> map, Participant[] participantArr, Map<String, Pair<Participant, Integer>> map2, Map<Integer, Participant> map3) {
        for (Map.Entry<String, Pair<Participant, Integer>> entry : map2.entrySet()) {
            int intValue = entry.getValue().getSecond().intValue();
            Participant participant2 = map.get(entry.getKey());
            if (participant2 != null) {
                if (!z) {
                    participantArr[intValue] = participant2;
                } else if (participantArr[intValue] == null) {
                    participantArr[intValue] = participant2;
                } else {
                    participantArr[intValue + 1] = participant2;
                }
                list.remove(participant2);
                list2.remove(participant2);
                if (Intrinsics.areEqual(participant2, participant)) {
                    participant = null;
                }
            }
        }
        if (participant != null) {
            int length = participantArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (participantArr[i] == null) {
                    participantArr[i] = participant;
                    list2.remove(participant);
                    list.remove(participant);
                    break;
                } else {
                    i++;
                }
            }
        }
        int length2 = participantArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            if (participantArr[i2] == null && list2.size() > 0) {
                participantArr[i2] = list2.get(0);
                list.remove(list2.get(0));
                list2.remove(0);
            }
        }
        int length3 = participantArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            if (participantArr[i3] == null && list.size() > 0) {
                participantArr[i3] = list.get(0);
                list.remove(0);
            }
        }
        for (int length4 = participantArr.length - 1; length4 >= 0; length4--) {
            Participant participant3 = participantArr[length4];
            if (participant3 != null) {
                list.add(0, participant3);
            }
        }
        if (!map3.isEmpty()) {
            for (Integer num : map3.keySet()) {
                int intValue2 = num.intValue();
                Participant participant4 = map3.get(Integer.valueOf(intValue2));
                if (participant4 != null) {
                    list.remove(participant4);
                    if (intValue2 < list.size()) {
                        list.add(intValue2, participant4);
                    } else {
                        list.add(participant4);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final Participant m244522a(Map<String, Participant> map, String str, Participant[] participantArr, List<Participant> list) {
        Participant participant = map.get(str);
        if (participant != null) {
            participantArr[0] = participant;
            list.remove(participant);
            if (map != null) {
                C69121n.m265993j(map).remove(str);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
        } else {
            C60700b.m235851b("GridSortUtil", "[adjustCurrPageParticipants]", "can't find self.");
        }
        return participant;
    }

    /* renamed from: a */
    private final Map<Integer, Participant> m244526a(List<Participant> list, Map<String, Participant> map, Map<String, Pair<Participant, Integer>> map2, boolean z) {
        int intValue;
        HashMap hashMap = new HashMap();
        if (!z) {
            for (Map.Entry<String, Pair<Participant, Integer>> entry : map2.entrySet()) {
                Participant participant = map.get(entry.getKey());
                if (!(participant == null || (intValue = entry.getValue().getSecond().intValue()) == -1)) {
                    hashMap.put(Integer.valueOf(intValue), participant);
                    list.remove(participant);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private final Map<String, Pair<Participant, Integer>> m244524a(int i, List<? extends Participant> list, Map<String, Participant> map, float[] fArr, boolean[] zArr) {
        HashMap hashMap = new HashMap();
        int i2 = 0;
        for (T t : list) {
            if (i2 >= i) {
                break;
            }
            if (!ParticipantUtil.m248732c((Participant) t)) {
                String a = ParticipantUtil.m248706a((Participant) t);
                Intrinsics.checkExpressionValueIsNotNull(a, "uniqueKey");
                hashMap.put(a, TuplesKt.to(t, Integer.valueOf(i2)));
                if (map.containsKey(a)) {
                    Participant participant = map.get(a);
                    if (participant != null) {
                        float f = fArr[0];
                        Float gridSortScore = participant.getGridSortScore();
                        Intrinsics.checkExpressionValueIsNotNull(gridSortScore, "it.gridSortScore");
                        fArr[0] = Math.min(f, gridSortScore.floatValue());
                    }
                } else {
                    zArr[0] = true;
                    C60700b.m235851b("GridSortUtil", "[recordOldFirstPage]", "firstPageMayChange, someone left meeting.");
                }
            }
            i2++;
        }
        return hashMap;
    }

    /* renamed from: a */
    private final Map<String, Pair<Participant, Integer>> m244527a(Map<String, Pair<Participant, Integer>> map, List<? extends Participant> list, int i, int i2, boolean z) {
        HashMap hashMap = new HashMap();
        if (!z) {
            int i3 = 0;
            for (T t : list) {
                if (i <= i3 && i2 >= i3) {
                    String a = ParticipantUtil.m248706a((Participant) t);
                    if (!map.containsKey(a)) {
                        Intrinsics.checkExpressionValueIsNotNull(a, "key");
                        hashMap.put(a, TuplesKt.to(t, Integer.valueOf(i3)));
                    }
                }
                i3++;
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private final Participant m244521a(C62526c cVar, Map<String, Participant> map, boolean z, boolean[] zArr, Map<String, Pair<Participant, Integer>> map2, Map<String, Pair<Participant, Integer>> map3) {
        Participant participant;
        Participant participant2 = null;
        if (cVar != null) {
            participant = map.get(ParticipantUtil.m248706a(cVar.mo216208m()));
        } else {
            participant = participant2;
        }
        if (z) {
            if (participant != null && !map2.containsKey(ParticipantUtil.m248706a(participant))) {
                zArr[0] = true;
                C60700b.m235851b("GridSortUtil", "[adjustFirstPageParticipants]", "mayBeChange, new AS is from other page.");
            }
        } else if (participant != null) {
            if (map3.containsKey(ParticipantUtil.m248706a(participant))) {
                return participant2;
            }
            if (!map2.containsKey(ParticipantUtil.m248706a(participant))) {
                zArr[0] = true;
                C60700b.m235851b("GridSortUtil", "[adjustFirstPageParticipants2]", "mayBeChange, new AS is from other page.");
            }
        }
        return participant;
    }

    /* renamed from: a */
    private final Map<String, Participant> m244525a(Participant participant, Participant participant2, List<Participant> list, List<Participant> list2, boolean[] zArr, Map<String, Participant> map, int i) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append("firstPageMayChange:");
        int i2 = 0;
        sb.append(zArr[0]);
        C60700b.m235851b("GridSortUtil", "[buildFindFirstPageScopeMap]", sb.toString());
        if (!zArr[0]) {
            return map;
        }
        if (participant != null) {
            String a = ParticipantUtil.m248706a(participant);
            Intrinsics.checkExpressionValueIsNotNull(a, "ParticipantUtil.getKeyForParticipant(localP)");
            hashMap.put(a, participant);
        }
        if (participant2 != null) {
            String a2 = ParticipantUtil.m248706a(participant2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "ParticipantUtil.getKeyForParticipant(newAS)");
            hashMap.put(a2, participant2);
        }
        int i3 = 0;
        while (hashMap.size() < i && list2.size() > i3) {
            Participant participant3 = list2.get(i3);
            if (!hashMap.containsKey(ParticipantUtil.m248706a(participant3))) {
                String a3 = ParticipantUtil.m248706a(participant3);
                Intrinsics.checkExpressionValueIsNotNull(a3, "ParticipantUtil.getKeyForParticipant(p)");
                hashMap.put(a3, participant3);
            }
            i3++;
        }
        while (hashMap.size() < i && list.size() > i2) {
            Participant participant4 = list.get(i2);
            if (!hashMap.containsKey(ParticipantUtil.m248706a(participant4))) {
                String a4 = ParticipantUtil.m248706a(participant4);
                Intrinsics.checkExpressionValueIsNotNull(a4, "ParticipantUtil.getKeyForParticipant(p)");
                hashMap.put(a4, participant4);
            }
            i2++;
        }
        return hashMap;
    }

    /* renamed from: a */
    private final List<Participant> m244523a(List<? extends Participant> list, Map<String, Participant> map, float[] fArr, boolean[] zArr, Map<String, Pair<Participant, Integer>> map2, Map<String, Pair<Participant, Integer>> map3, Participant participant, TriggerType triggerType, HashSet<String> hashSet) {
        LinkedList linkedList = new LinkedList();
        if (triggerType != TriggerType.PUSH) {
            return linkedList;
        }
        for (T t : list) {
            String a = ParticipantUtil.m248706a((Participant) t);
            Participant participant2 = map.get(a);
            if (participant2 != null) {
                if (!Intrinsics.areEqual(participant2, participant)) {
                    if (!map2.containsKey(a)) {
                        if (!map3.containsKey(a)) {
                            float f = fArr[1];
                            Float gridSortScore = participant2.getGridSortScore();
                            Intrinsics.checkExpressionValueIsNotNull(gridSortScore, "newP.gridSortScore");
                            fArr[1] = Math.max(f, gridSortScore.floatValue());
                            ParticipantSettings participantSettings = t.getParticipantSettings();
                            Intrinsics.checkExpressionValueIsNotNull(participantSettings, "oldP.participantSettings");
                            if (participantSettings.isCameraMuted()) {
                                ParticipantSettings participantSettings2 = participant2.getParticipantSettings();
                                Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "newP.participantSettings");
                                if (!participantSettings2.isCameraMuted() && participant2.getGridSortScore().floatValue() > fArr[0]) {
                                    linkedList.add(participant2);
                                    zArr[0] = true;
                                    C60700b.m235851b("GridSortUtil", "[findOpenCameraNotFromFirstAndCurr]", "firstPageMayChange, someone from other page open camera.");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (hashSet != null && !hashSet.isEmpty()) {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                Participant participant3 = map.get(it.next());
                if (participant3 != null) {
                    ParticipantSettings participantSettings3 = participant3.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings3, "newP.participantSettings");
                    if (!participantSettings3.isCameraMuted() && participant3.getGridSortScore().floatValue() > fArr[0]) {
                        linkedList.add(participant3);
                        zArr[0] = true;
                    }
                }
            }
        }
        return linkedList;
    }
}
