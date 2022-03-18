package com.ss.android.vc.meeting.module.sketch;

import android.text.TextUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.response.C60975i;
import com.ss.android.vc.entity.response.ao;
import com.ss.android.vc.entity.sketch.SketchDataUnit;
import com.ss.android.vc.entity.sketch.SketchOperationUnit;
import com.ss.android.vc.meeting.module.sketch.dto.RemoveData;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUserService;
import java.util.ArrayList;
import java.util.List;

public class SketchRustImpl {
    public static void grootCloseChannel(final String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235864f("[Sketch] [SketchRustImpl]", "[grootCloseChannel]", "channelId = " + str);
            return;
        }
        VcBizService.grootCloseChannel(ChannelMeta.GrootChannel.SKETCH, str, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchRustImpl.C630952 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("[Sketch] [SketchRustImpl]", "[grootCloseChannel2]", "channelId = " + str + ", success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("[Sketch] [SketchRustImpl]", "[grootCloseChannel3]", "channelId = " + str + ", error = " + eVar);
            }
        });
    }

    public static void fetchAllSketchData(String str, final AbstractC63598b<C60975i> bVar) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235864f("[Sketch] [SketchRustImpl]", "[fetchAllSketchData]", "shareScreenId = " + str);
            return;
        }
        VcBizService.fetchAllSketchData(str, new AbstractC63598b<C60975i>() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchRustImpl.C630963 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(C60975i iVar) {
                bVar.onSuccess(iVar);
            }
        });
    }

    public static void grootOpenChannel(final String str, int i, final AbstractC63598b<String> bVar) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235864f("[Sketch] [SketchRustImpl]", "[grootOpenChannel]", "channelId = " + str);
            return;
        }
        VcBizService.grootOpenChannel(ChannelMeta.GrootChannel.SKETCH, str, i, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchRustImpl.C630941 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("[Sketch] [SketchRustImpl]", "[grootOpenChannel3]", "channelId = " + str + ", error = " + eVar);
                bVar.onError(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("[Sketch] [SketchRustImpl]", "[grootOpenChannel2]", "channelId = " + str + ", success");
                bVar.onSuccess("");
            }
        });
    }

    public static void sendUndo(final String str, final String str2, RemoveData removeData) {
        if (TextUtils.isEmpty(str2)) {
            C60700b.m235864f("[Sketch] [SketchRustImpl]", "[sendUndo]", "shareScreenId = " + str2);
        } else if (removeData.ids != null && removeData.ids.length != 0) {
            ArrayList arrayList = new ArrayList();
            SketchOperationUnit sketchOperationUnit = new SketchOperationUnit();
            sketchOperationUnit.f152789b = SketchOperationUnit.Command.REMOVE;
            sketchOperationUnit.f152788a = SketchOperationUnit.Action.UNDO;
            sketchOperationUnit.f152791d = SketchOperationUnit.ClearType.SELF;
            sketchOperationUnit.f152793f = System.currentTimeMillis();
            sketchOperationUnit.f152792e = removeData;
            arrayList.add(sketchOperationUnit);
            VcBizService.sendSketchGrootCellRequest(str, str2, arrayList, new AbstractC63598b<ao>() {
                /* class com.ss.android.vc.meeting.module.sketch.SketchRustImpl.C631007 */

                public void onSuccess(ao aoVar) {
                    C60700b.m235843a("[Sketch] [SketchRustImpl]", "[sendUndo2]", "success");
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("[Sketch] [SketchRustImpl]", "[sendUndo3]", "error = " + eVar + ", meetingId = " + str + ", shareScreenId = " + str2);
                }
            });
        }
    }

    public static void sendArrow(final String str, final String str2, final ArrowDrawableData arrowDrawableData) {
        if (TextUtils.isEmpty(str2)) {
            C60700b.m235864f("[Sketch] [SketchRustImpl]", "[sendArrow]", "shareScreenId = " + str2);
        } else if (!C57782ag.m224241a(arrowDrawableData.id)) {
            ByteviewUser byteviewUser = new ByteviewUser();
            byteviewUser.setUserId(VideoChatUserService.getCurrentUser().getId());
            byteviewUser.setParticipantType(ParticipantType.LARK_USER);
            byteviewUser.setDeviceId(VideoChatModuleDependency.m236629b());
            ArrayList arrayList = new ArrayList();
            SketchDataUnit sketchDataUnit = new SketchDataUnit();
            sketchDataUnit.f152755b = arrowDrawableData.id;
            sketchDataUnit.f152761h = arrowDrawableData.extInfo.currentStep;
            sketchDataUnit.f152760g = arrowDrawableData.toArrow();
            sketchDataUnit.f152762i = byteviewUser;
            sketchDataUnit.f152754a = SketchDataUnit.ShapeType.ARROW;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(sketchDataUnit);
            SketchOperationUnit sketchOperationUnit = new SketchOperationUnit();
            sketchOperationUnit.f152789b = SketchOperationUnit.Command.ADD;
            sketchOperationUnit.f152788a = SketchOperationUnit.Action.DRAW;
            sketchOperationUnit.f152790c = arrayList2;
            sketchOperationUnit.f152793f = System.currentTimeMillis();
            arrayList.add(sketchOperationUnit);
            VcBizService.sendSketchGrootCellRequest(str, str2, arrayList, new AbstractC63598b<ao>() {
                /* class com.ss.android.vc.meeting.module.sketch.SketchRustImpl.C630996 */

                public void onSuccess(ao aoVar) {
                    C60700b.m235843a("[Sketch] [SketchRustImpl]", "[sendArrow2]", "success");
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("[Sketch] [SketchRustImpl]", "[sendArrow3]", "error = " + eVar + ", meetingId = " + str + ", shareScreenId = " + str2 + ", shapeId = " + arrowDrawableData.id);
                }
            });
        }
    }

    public static void sendPencil(final String str, final String str2, final PencilDrawableData pencilDrawableData) {
        if (TextUtils.isEmpty(str2)) {
            C60700b.m235864f("[Sketch] [SketchRustImpl]", "[sendPencil5]", "shareScreenId = " + str2);
        } else if (!C57782ag.m224241a(pencilDrawableData.id) && pencilDrawableData.points != null && pencilDrawableData.points.length != 0) {
            C60700b.m235843a("[Sketch] [SketchRustImpl]", "[sendPencil6]", "data = " + pencilDrawableData);
            ByteviewUser byteviewUser = new ByteviewUser();
            byteviewUser.setUserId(VideoChatUserService.getCurrentUser().getId());
            byteviewUser.setParticipantType(ParticipantType.LARK_USER);
            byteviewUser.setDeviceId(VideoChatModuleDependency.m236629b());
            ArrayList arrayList = new ArrayList();
            SketchDataUnit sketchDataUnit = new SketchDataUnit();
            sketchDataUnit.f152755b = pencilDrawableData.id;
            sketchDataUnit.f152761h = pencilDrawableData.extInfo.currentStep;
            sketchDataUnit.f152756c = pencilDrawableData.toPencil();
            sketchDataUnit.f152762i = byteviewUser;
            sketchDataUnit.f152754a = SketchDataUnit.ShapeType.PENCIL;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(sketchDataUnit);
            SketchOperationUnit sketchOperationUnit = new SketchOperationUnit();
            sketchOperationUnit.f152789b = SketchOperationUnit.Command.ADD;
            sketchOperationUnit.f152788a = SketchOperationUnit.Action.DRAW;
            sketchOperationUnit.f152790c = arrayList2;
            sketchOperationUnit.f152793f = System.currentTimeMillis();
            arrayList.add(sketchOperationUnit);
            VcBizService.sendSketchGrootCellRequest(str, str2, arrayList, new AbstractC63598b<ao>() {
                /* class com.ss.android.vc.meeting.module.sketch.SketchRustImpl.C630985 */

                public void onSuccess(ao aoVar) {
                    C60700b.m235843a("[Sketch] [SketchRustImpl]", "[sendPencil7]", "success");
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("[Sketch] [SketchRustImpl]", "[sendPencil8]", "error = " + eVar + ", meetingId = " + str + ", shareScreenId = " + str2 + ", shapeId = " + pencilDrawableData.id);
                }
            });
        }
    }

    public static void sendPencil(final String str, final String str2, List<PencilDrawableData> list) {
        if (TextUtils.isEmpty(str2)) {
            C60700b.m235864f("[Sketch] [SketchRustImpl]", "[sendPencil]", "shareScreenId = " + str2);
        } else if (list != null && list.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (PencilDrawableData pencilDrawableData : list) {
                sb.append(pencilDrawableData);
            }
            C60700b.m235843a("[Sketch] [SketchRustImpl]", "[sendPencils2]", "datas = " + sb.toString());
            ByteviewUser byteviewUser = new ByteviewUser();
            byteviewUser.setUserId(VideoChatUserService.getCurrentUser().getId());
            byteviewUser.setParticipantType(ParticipantType.LARK_USER);
            byteviewUser.setDeviceId(VideoChatModuleDependency.m236629b());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (PencilDrawableData pencilDrawableData2 : list) {
                if (!C57782ag.m224241a(pencilDrawableData2.id)) {
                    SketchDataUnit sketchDataUnit = new SketchDataUnit();
                    sketchDataUnit.f152755b = pencilDrawableData2.id;
                    sketchDataUnit.f152761h = pencilDrawableData2.extInfo.currentStep;
                    sketchDataUnit.f152756c = pencilDrawableData2.toPencil();
                    sketchDataUnit.f152762i = byteviewUser;
                    sketchDataUnit.f152754a = SketchDataUnit.ShapeType.PENCIL;
                    arrayList2.add(sketchDataUnit);
                }
            }
            SketchOperationUnit sketchOperationUnit = new SketchOperationUnit();
            sketchOperationUnit.f152789b = SketchOperationUnit.Command.ADD;
            sketchOperationUnit.f152788a = SketchOperationUnit.Action.DRAW;
            sketchOperationUnit.f152790c = arrayList2;
            sketchOperationUnit.f152793f = System.currentTimeMillis();
            arrayList.add(sketchOperationUnit);
            VcBizService.sendSketchGrootCellRequest(str, str2, arrayList, new AbstractC63598b<ao>() {
                /* class com.ss.android.vc.meeting.module.sketch.SketchRustImpl.C630974 */

                public void onSuccess(ao aoVar) {
                    C60700b.m235843a("[Sketch] [SketchRustImpl]", "[sendPencils3]", "success");
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("[Sketch] [SketchRustImpl]", "[sendPencils4]", "error = " + eVar + ", meetingId = " + str + ", shareScreenId = " + str2);
                }
            });
        }
    }
}
