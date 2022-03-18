package com.ss.android.vc.meeting.module.sketch;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.sketch.SketchDataUnit;
import com.ss.android.vc.entity.sketch.SketchOperationUnit;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.MarkerDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.RemoveData;
import com.ss.android.vc.meeting.module.sketch.dto.StoreDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.comet.CometDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.oval.OvalDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.rect.RectangleDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender;
import com.ss.android.vc.meeting.module.sketch.render.ICometRender;
import com.ss.android.vc.meeting.module.sketch.render.IMarkRender;
import com.ss.android.vc.meeting.module.sketch.render.gl.util.GLUtils;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bJ\u001c\u0010\u0013\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0014\u001a\u00020\u000fJ\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/SketchRemoteReceiver;", "", "model", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "(Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;)V", "getModel", "()Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "setModel", "add", "", "dataUnits", "", "Lcom/ss/android/vc/entity/sketch/SketchDataUnit;", "applyAllDrawableData", "recordSelfShape", "", "operate", "operations", "Lcom/ss/android/vc/entity/sketch/SketchOperationUnit;", "receiveFetchAllData", "sketchInVideo", "remove", "action", "Lcom/ss/android/vc/entity/sketch/SketchOperationUnit$Action;", "removeData", "Lcom/ss/android/vc/meeting/module/sketch/dto/RemoveData;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SketchRemoteReceiver {
    public static final Companion Companion = new Companion(null);
    private SketchRenderModel model;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SketchOperationUnit.Command.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[SketchOperationUnit.Command.ADD.ordinal()] = 1;
            iArr[SketchOperationUnit.Command.REMOVE.ordinal()] = 2;
            int[] iArr2 = new int[SketchDataUnit.ShapeType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[SketchDataUnit.ShapeType.PENCIL.ordinal()] = 1;
            iArr2[SketchDataUnit.ShapeType.COMET.ordinal()] = 2;
            iArr2[SketchDataUnit.ShapeType.ARROW.ordinal()] = 3;
            iArr2[SketchDataUnit.ShapeType.OVAL.ordinal()] = 4;
            iArr2[SketchDataUnit.ShapeType.RECTANGLE.ordinal()] = 5;
            int[] iArr3 = new int[SketchDataUnit.ShapeType.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[SketchDataUnit.ShapeType.PENCIL.ordinal()] = 1;
            iArr3[SketchDataUnit.ShapeType.ARROW.ordinal()] = 2;
            iArr3[SketchDataUnit.ShapeType.OVAL.ordinal()] = 3;
            iArr3[SketchDataUnit.ShapeType.RECTANGLE.ordinal()] = 4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/SketchRemoteReceiver$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final SketchRenderModel getModel() {
        return this.model;
    }

    public final void setModel(SketchRenderModel sketchRenderModel) {
        Intrinsics.checkParameterIsNotNull(sketchRenderModel, "<set-?>");
        this.model = sketchRenderModel;
    }

    public SketchRemoteReceiver(SketchRenderModel sketchRenderModel) {
        Intrinsics.checkParameterIsNotNull(sketchRenderModel, "model");
        this.model = sketchRenderModel;
    }

    public final void operate(List<? extends SketchOperationUnit> list) {
        Intrinsics.checkParameterIsNotNull(list, "operations");
        for (SketchOperationUnit sketchOperationUnit : list) {
            SketchOperationUnit.Command command = sketchOperationUnit.f152789b;
            if (command != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[command.ordinal()];
                if (i == 1) {
                    List<SketchDataUnit> list2 = sketchOperationUnit.f152790c;
                    Intrinsics.checkExpressionValueIsNotNull(list2, "operation.mSketchUnits");
                    add(list2);
                } else if (i == 2) {
                    SketchOperationUnit.Action action = sketchOperationUnit.f152788a;
                    Intrinsics.checkExpressionValueIsNotNull(action, "operation.mAction");
                    remove(action, sketchOperationUnit.f152792e);
                }
            }
        }
    }

    public final void applyAllDrawableData(boolean z) {
        boolean z2;
        StoreDrawableData allDrawableData = Sketch.getAllDrawableData(this.model.getSketchControl().getSketchInstanceId());
        PencilDrawableData[] pencilDrawableDataArr = allDrawableData.pencils;
        if (pencilDrawableDataArr != null) {
            for (PencilDrawableData pencilDrawableData : pencilDrawableDataArr) {
                SketchRenderModel sketchRenderModel = this.model;
                String str = pencilDrawableData.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.id");
                SketchRenderModel sketchRenderModel2 = this.model;
                PencilDrawableData clone = pencilDrawableData.clone();
                Intrinsics.checkExpressionValueIsNotNull(clone, "it.clone()");
                AbstractShapeRender createPencilRender = sketchRenderModel2.createPencilRender(clone);
                if (!z || !ParticipantUtil.m248722a(pencilDrawableData.extInfo.userId, ParticipantType.forNumber(pencilDrawableData.extInfo.userType), pencilDrawableData.extInfo.deviceId)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                sketchRenderModel.updateStatic(str, createPencilRender, z2);
            }
        }
        RectangleDrawableData[] rectangleDrawableDataArr = allDrawableData.rectangle;
        if (rectangleDrawableDataArr != null) {
            for (RectangleDrawableData rectangleDrawableData : rectangleDrawableDataArr) {
                SketchRenderModel sketchRenderModel3 = this.model;
                String str2 = rectangleDrawableData.id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.id");
                SketchRenderModel sketchRenderModel4 = this.model;
                RectangleDrawableData clone2 = rectangleDrawableData.clone();
                Intrinsics.checkExpressionValueIsNotNull(clone2, "it.clone()");
                SketchRenderModel.updateStatic$default(sketchRenderModel3, str2, sketchRenderModel4.createRectRender(clone2), false, 4, null);
            }
        }
        OvalDrawableData[] ovalDrawableDataArr = allDrawableData.oval;
        if (ovalDrawableDataArr != null) {
            for (OvalDrawableData ovalDrawableData : ovalDrawableDataArr) {
                SketchRenderModel sketchRenderModel5 = this.model;
                String str3 = ovalDrawableData.id;
                Intrinsics.checkExpressionValueIsNotNull(str3, "it.id");
                SketchRenderModel sketchRenderModel6 = this.model;
                OvalDrawableData clone3 = ovalDrawableData.clone();
                Intrinsics.checkExpressionValueIsNotNull(clone3, "it.clone()");
                SketchRenderModel.updateStatic$default(sketchRenderModel5, str3, sketchRenderModel6.createOvalRender(clone3), false, 4, null);
            }
        }
        ArrowDrawableData[] arrowDrawableDataArr = allDrawableData.arrow;
        if (arrowDrawableDataArr != null) {
            for (ArrowDrawableData arrowDrawableData : arrowDrawableDataArr) {
                SketchRenderModel sketchRenderModel7 = this.model;
                String str4 = arrowDrawableData.id;
                Intrinsics.checkExpressionValueIsNotNull(str4, "it.id");
                SketchRenderModel sketchRenderModel8 = this.model;
                ArrowDrawableData clone4 = arrowDrawableData.clone();
                Intrinsics.checkExpressionValueIsNotNull(clone4, "it.clone()");
                sketchRenderModel7.updateStatic(str4, sketchRenderModel8.createArrowRender(clone4), ParticipantUtil.m248722a(arrowDrawableData.extInfo.userId, ParticipantType.forNumber(arrowDrawableData.extInfo.userType), arrowDrawableData.extInfo.deviceId));
            }
        }
    }

    private final void add(List<? extends SketchDataUnit> list) {
        boolean z;
        SketchDataUnit.ShapeType shapeType;
        for (SketchDataUnit sketchDataUnit : list) {
            String str = sketchDataUnit.f152755b;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && ((sketchDataUnit.f152762i == null || !ParticipantUtil.m248710a(sketchDataUnit.f152762i)) && (shapeType = sketchDataUnit.f152754a) != null)) {
                int i = WhenMappings.$EnumSwitchMapping$1[shapeType.ordinal()];
                if (i == 1) {
                    PencilDrawableData pencilDrawableData = new PencilDrawableData(sketchDataUnit);
                    if (!TextUtils.isEmpty(this.model.getSketchControl().getSketchInstanceId())) {
                        boolean pencilReceiveRemoteData = Sketch.pencilReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), pencilDrawableData);
                        if (pencilReceiveRemoteData && !this.model.getSketchControl().getTransferInVideo()) {
                            this.model.addRemotePencilsProxyRender();
                        } else if (!pencilReceiveRemoteData) {
                            C60700b.m235864f("[Sketch] [BaseRemoteReceiver]", "[add]", "receive remote PENCIL = " + pencilDrawableData.id + ", Cannot Add, Error!!!");
                        }
                    }
                } else if (i == 2) {
                    CometDrawableData parse = CometDrawableData.parse(sketchDataUnit);
                    if (!Sketch.cometReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), parse) || this.model.getSketchControl().getTransferInVideo()) {
                        synchronized (this.model) {
                            AbstractShapeRender abstractShapeRender = this.model.getVariateData().get(parse.id);
                            if (abstractShapeRender != null) {
                                if ((abstractShapeRender instanceof ICometRender) && parse.exit) {
                                    ((ICometRender) abstractShapeRender).finish();
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    } else {
                        synchronized (this.model) {
                            if (!this.model.getVariateData().containsKey(parse.id)) {
                                SketchRenderModel sketchRenderModel = this.model;
                                String str2 = parse.id;
                                Intrinsics.checkExpressionValueIsNotNull(str2, "drawableData.id");
                                SketchRenderModel sketchRenderModel2 = this.model;
                                Intrinsics.checkExpressionValueIsNotNull(parse, "drawableData");
                                sketchRenderModel.updateVariate(str2, sketchRenderModel2.createCometRender(parse));
                            }
                            AbstractShapeRender abstractShapeRender2 = this.model.getVariateData().get(parse.id);
                            if (abstractShapeRender2 != null) {
                                if (abstractShapeRender2 instanceof ICometRender) {
                                    if (((ICometRender) abstractShapeRender2).paused() && !parse.exit) {
                                        ((ICometRender) abstractShapeRender2).resume();
                                    } else if (parse.exit) {
                                        ((ICometRender) abstractShapeRender2).finish();
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                    }
                } else if (i == 3) {
                    ArrowDrawableData arrowDrawableData = new ArrowDrawableData(sketchDataUnit);
                    if (Sketch.arrowReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), arrowDrawableData) && !this.model.getSketchControl().getTransferInVideo()) {
                        SketchRenderModel sketchRenderModel3 = this.model;
                        String str3 = arrowDrawableData.id;
                        Intrinsics.checkExpressionValueIsNotNull(str3, "drawableData.id");
                        SketchRenderModel.updateStatic$default(sketchRenderModel3, str3, this.model.createArrowRender(arrowDrawableData), false, 4, null);
                        String generateMarkId = GLUtils.generateMarkId(arrowDrawableData.id);
                        SketchRenderModel sketchRenderModel4 = this.model;
                        Intrinsics.checkExpressionValueIsNotNull(generateMarkId, "markId");
                        SketchRenderModel sketchRenderModel5 = this.model;
                        float[] fArr = arrowDrawableData.end;
                        Intrinsics.checkExpressionValueIsNotNull(fArr, "drawableData.end");
                        Coord unflatCoord = SketchUtilKt.unflatCoord(fArr);
                        SketchRenderModel sketchRenderModel6 = this.model;
                        String str4 = arrowDrawableData.extInfo.userId;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "drawableData.extInfo.userId");
                        IMarkRender expiresAfter = sketchRenderModel5.createMarkRender(new MarkerDrawableData(generateMarkId, unflatCoord, sketchRenderModel6.getUserNameById(str4, arrowDrawableData.extInfo.userType))).expiresAfter(3000);
                        Intrinsics.checkExpressionValueIsNotNull(expiresAfter, "model.createMarkRender(\n…sAfter(MARK_REMOVE_DELAY)");
                        sketchRenderModel4.addMark(generateMarkId, expiresAfter);
                    }
                } else if (i == 4) {
                    OvalDrawableData ovalDrawableData = new OvalDrawableData(sketchDataUnit);
                    if (Sketch.ovalReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), ovalDrawableData) && !this.model.getSketchControl().getTransferInVideo()) {
                        SketchRenderModel sketchRenderModel7 = this.model;
                        String str5 = ovalDrawableData.id;
                        Intrinsics.checkExpressionValueIsNotNull(str5, "drawableData.id");
                        SketchRenderModel.updateStatic$default(sketchRenderModel7, str5, this.model.createOvalRender(ovalDrawableData), false, 4, null);
                        Coord coord = new Coord(ovalDrawableData.origin[0] + (ovalDrawableData.longAxis / ((float) 2)), ovalDrawableData.origin[1]);
                        String generateMarkId2 = GLUtils.generateMarkId(ovalDrawableData.id);
                        SketchRenderModel sketchRenderModel8 = this.model;
                        Intrinsics.checkExpressionValueIsNotNull(generateMarkId2, "markId");
                        SketchRenderModel sketchRenderModel9 = this.model;
                        String str6 = ovalDrawableData.extInfo.userId;
                        Intrinsics.checkExpressionValueIsNotNull(str6, "drawableData.extInfo.userId");
                        IMarkRender expiresAfter2 = sketchRenderModel9.createMarkRender(new MarkerDrawableData(generateMarkId2, coord, sketchRenderModel9.getUserNameById(str6, ovalDrawableData.extInfo.userType))).expiresAfter(3000);
                        Intrinsics.checkExpressionValueIsNotNull(expiresAfter2, "model.createMarkRender(\n…sAfter(MARK_REMOVE_DELAY)");
                        sketchRenderModel8.addMark(generateMarkId2, expiresAfter2);
                    }
                } else if (i == 5) {
                    RectangleDrawableData rectangleDrawableData = new RectangleDrawableData(sketchDataUnit);
                    if (Sketch.rectangleReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), rectangleDrawableData) && !this.model.getSketchControl().getTransferInVideo()) {
                        SketchRenderModel sketchRenderModel10 = this.model;
                        String str7 = rectangleDrawableData.id;
                        Intrinsics.checkExpressionValueIsNotNull(str7, "drawableData.id");
                        SketchRenderModel.updateStatic$default(sketchRenderModel10, str7, this.model.createRectRender(rectangleDrawableData), false, 4, null);
                        Coord coord2 = new Coord(rectangleDrawableData.rightBottom[0], (rectangleDrawableData.rightBottom[1] + rectangleDrawableData.leftTop[1]) / ((float) 2));
                        String generateMarkId3 = GLUtils.generateMarkId(rectangleDrawableData.id);
                        SketchRenderModel sketchRenderModel11 = this.model;
                        Intrinsics.checkExpressionValueIsNotNull(generateMarkId3, "markId");
                        SketchRenderModel sketchRenderModel12 = this.model;
                        String str8 = rectangleDrawableData.extInfo.userId;
                        Intrinsics.checkExpressionValueIsNotNull(str8, "drawableData.extInfo.userId");
                        IMarkRender expiresAfter3 = sketchRenderModel12.createMarkRender(new MarkerDrawableData(generateMarkId3, coord2, sketchRenderModel12.getUserNameById(str8, rectangleDrawableData.extInfo.userType))).expiresAfter(3000);
                        Intrinsics.checkExpressionValueIsNotNull(expiresAfter3, "model.createMarkRender(\n…sAfter(MARK_REMOVE_DELAY)");
                        sketchRenderModel11.addMark(generateMarkId3, expiresAfter3);
                    }
                }
            }
        }
    }

    private final void remove(SketchOperationUnit.Action action, RemoveData removeData) {
        if (removeData != null) {
            this.model.reset(removeData);
            if (action != SketchOperationUnit.Action.CLEAR) {
                return;
            }
            if (removeData.removeType == 2 || removeData.removeType == 1) {
                this.model.clearCurrentAction();
            }
        }
    }

    public final void receiveFetchAllData(List<? extends SketchDataUnit> list, boolean z) {
        boolean z2;
        SketchDataUnit.ShapeType shapeType;
        Intrinsics.checkParameterIsNotNull(list, "dataUnits");
        if (!list.isEmpty()) {
            for (SketchDataUnit sketchDataUnit : CollectionsKt.sortedWith(list, new SketchRemoteReceiver$receiveFetchAllData$$inlined$sortedBy$1())) {
                String str = sketchDataUnit.f152755b;
                if (str == null || StringsKt.isBlank(str)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (shapeType = sketchDataUnit.f152754a) != null) {
                    int i = WhenMappings.$EnumSwitchMapping$2[shapeType.ordinal()];
                    if (i == 1) {
                        PencilDrawableData pencilDrawableData = new PencilDrawableData(sketchDataUnit);
                        if (!TextUtils.isEmpty(this.model.getSketchControl().getSketchInstanceId())) {
                            Sketch.pencilReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), pencilDrawableData);
                        }
                    } else if (i == 2) {
                        ArrowDrawableData arrowDrawableData = new ArrowDrawableData(sketchDataUnit);
                        if (!TextUtils.isEmpty(this.model.getSketchControl().getSketchInstanceId())) {
                            Sketch.arrowReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), arrowDrawableData);
                        }
                    } else if (i == 3) {
                        OvalDrawableData ovalDrawableData = new OvalDrawableData(sketchDataUnit);
                        if (!TextUtils.isEmpty(this.model.getSketchControl().getSketchInstanceId())) {
                            Sketch.ovalReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), ovalDrawableData);
                        }
                    } else if (i == 4) {
                        RectangleDrawableData rectangleDrawableData = new RectangleDrawableData(sketchDataUnit);
                        if (!TextUtils.isEmpty(this.model.getSketchControl().getSketchInstanceId())) {
                            Sketch.rectangleReceiveRemoteData(this.model.getSketchControl().getSketchInstanceId(), rectangleDrawableData);
                        }
                    }
                }
            }
            this.model.reset();
            if (!z) {
                applyAllDrawableData(true);
            }
        }
    }
}
