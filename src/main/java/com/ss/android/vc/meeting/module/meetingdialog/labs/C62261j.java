package com.ss.android.vc.meeting.module.meetingdialog.labs;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.entity.background.C60936b;
import com.ss.android.vc.entity.background.FileStatus;
import com.ss.android.vc.entity.background.PushVirtualBackgroundType;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.j */
public final class C62261j {

    /* renamed from: a */
    public static C62260i f156429a;

    /* renamed from: b */
    private static List<LabsView> f156430b = new ArrayList();

    /* renamed from: a */
    public static void m243150a(LabsView labsView) {
        if (!f156430b.contains(labsView)) {
            f156430b.add(labsView);
        }
        C60700b.m235851b("LabsDataUtils", "[addPushListener]", labsView.hashCode() + ", listSize = " + f156430b.size());
    }

    /* renamed from: b */
    public static void m243153b(LabsView labsView) {
        f156430b.remove(labsView);
        C60700b.m235851b("LabsDataUtils", "[removeListener]", labsView.hashCode() + ", listSize = " + f156430b.size());
    }

    /* renamed from: a */
    public static void m243148a(C60936b bVar) {
        if (bVar == null) {
            C60700b.m235851b("LabsDataUtils", "[onPushVirtualBackgroundEntity]", "invalid entity");
            return;
        }
        C60700b.m235851b("LabsDataUtils", "[onPushVirtualBackgroundEntity2]", "entity = " + bVar);
        if (bVar.f152485a == PushVirtualBackgroundType.All || bVar.f152485a == PushVirtualBackgroundType.Add || bVar.f152485a == PushVirtualBackgroundType.Update) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (VirtualBackgroundInfo virtualBackgroundInfo : bVar.f152486b) {
                if (virtualBackgroundInfo.fileStatus == FileStatus.OK) {
                    arrayList2.add(virtualBackgroundInfo);
                } else {
                    arrayList.add(virtualBackgroundInfo);
                }
            }
            if (C60742af.m236059a(arrayList2)) {
                m243147a(bVar.f152485a, arrayList);
                return;
            }
            arrayList.addAll(arrayList2);
            C60735ab.m236001a(new Runnable(arrayList) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$j$mwiw2UIg3UGKtsXa0IBkTCJzXw */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C62261j.m243149a(C60936b.this, this.f$1);
                }
            });
            return;
        }
        m243147a(bVar.f152485a, bVar.f152486b);
    }

    /* renamed from: a */
    private static void m243151a(List<VirtualBackgroundInfo> list) {
        if (!C60742af.m236059a(list)) {
            C62260i iVar = f156429a;
            if (iVar == null || iVar.f156427a == null) {
                C60700b.m235851b("LabsDataUtils", "[onPushAllVirtualBackground]", "not init, return");
                return;
            }
            f156429a.f156427a.clear();
            f156429a.f156427a.addAll(0, LabsUtils.m242909c());
            f156429a.f156427a.addAll(list);
            for (LabsView labsView : f156430b) {
                labsView.mo215205a(f156429a.f156427a, PushVirtualBackgroundType.All);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m243149a(C60936b bVar, List list) {
        m243147a(bVar.f152485a, list);
    }

    /* renamed from: a */
    private static void m243147a(PushVirtualBackgroundType pushVirtualBackgroundType, List<VirtualBackgroundInfo> list) {
        if (pushVirtualBackgroundType != PushVirtualBackgroundType.All) {
            m243152a(list, pushVirtualBackgroundType);
        } else if (!C60742af.m236059a(list)) {
            m243151a(list);
        }
    }

    /* renamed from: a */
    private static void m243152a(List<VirtualBackgroundInfo> list, PushVirtualBackgroundType pushVirtualBackgroundType) {
        int indexOf;
        C61303k kVar;
        if (!C60742af.m236059a(list)) {
            C62260i iVar = f156429a;
            if (iVar == null || iVar.f156427a == null) {
                C60700b.m235851b("LabsDataUtils", "[onPushVirtualBackground]", "not init, return");
                return;
            }
            for (VirtualBackgroundInfo virtualBackgroundInfo : list) {
                if (virtualBackgroundInfo != null) {
                    if (pushVirtualBackgroundType == PushVirtualBackgroundType.Add && virtualBackgroundInfo.fileStatus == FileStatus.OK) {
                        C60700b.m235851b("LabsDataUtils", "[onPushVirtualBackground2]", "add");
                        f156429a.f156427a.add(virtualBackgroundInfo);
                    } else if (pushVirtualBackgroundType == PushVirtualBackgroundType.Delete) {
                        C60700b.m235851b("LabsDataUtils", "[onPushVirtualBackground3]", "delete");
                        if (f156429a.f156427a.indexOf(virtualBackgroundInfo) >= 0 && f156430b.isEmpty() && C62269o.f156438b.equals(virtualBackgroundInfo) && (kVar = (C61303k) MeetingManager.m238341a().mo211908l()) != null) {
                            VirtualBackgroundInfo newDisabled = VirtualBackgroundInfo.newDisabled();
                            kVar.mo212165y().mo212023g(false);
                            kVar.mo212165y().mo211998a("");
                            C62269o.m243180b(newDisabled);
                            C62269o.m243177a(C62269o.m243179b().toString(), newDisabled.isBlur, newDisabled.key);
                        }
                        f156429a.f156427a.remove(virtualBackgroundInfo);
                    } else if (pushVirtualBackgroundType == PushVirtualBackgroundType.Update && (indexOf = f156429a.f156427a.indexOf(virtualBackgroundInfo)) >= 0) {
                        f156429a.f156427a.remove(indexOf);
                        if (virtualBackgroundInfo.fileStatus == FileStatus.OK) {
                            C60700b.m235851b("LabsDataUtils", "[onPushVirtualBackground4]", "update with add");
                            f156429a.f156427a.add(indexOf, virtualBackgroundInfo);
                        } else {
                            C60700b.m235851b("LabsDataUtils", "[onPushVirtualBackground5]", "update without add");
                        }
                    }
                }
            }
            for (LabsView labsView : f156430b) {
                labsView.mo215205a(list, pushVirtualBackgroundType);
            }
        }
    }
}
