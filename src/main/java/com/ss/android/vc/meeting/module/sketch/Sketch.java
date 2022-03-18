package com.ss.android.vc.meeting.module.sketch;

import com.C1711a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sketch.dto.ClearData;
import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;
import com.ss.android.vc.meeting.module.sketch.dto.GlobalShapeConfig;
import com.ss.android.vc.meeting.module.sketch.dto.RemoveData;
import com.ss.android.vc.meeting.module.sketch.dto.StoreDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.UndoRedoData;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowStyle;
import com.ss.android.vc.meeting.module.sketch.dto.comet.CometDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.oval.OvalDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.CombinedAllPencilData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilStyle;
import com.ss.android.vc.meeting.module.sketch.dto.rect.RectangleDrawableData;

public class Sketch {
    public static native ArrowDrawableData arrowFinish(String str, float[] fArr, float[] fArr2, ArrowStyle arrowStyle);

    public static native boolean arrowReceiveRemoteData(String str, ArrowDrawableData arrowDrawableData);

    public static native ClearData clear(String str, int i);

    public static native CometDrawableData cometGetRemoteSnippet(String str);

    public static native boolean cometReceiveRemoteData(String str, CometDrawableData cometDrawableData);

    public static native StoreDrawableData getAllDrawableData(String str);

    public static native long getSketchDefaultColor(String str);

    public static native boolean ovalReceiveRemoteData(String str, OvalDrawableData ovalDrawableData);

    public static native PencilDrawableData pencilAppend(String str, float[] fArr);

    public static native CombinedAllPencilData pencilFinish(String str);

    public static native PencilDrawableData pencilFitting(String str);

    public static native PencilDrawableData pencilGetDrawableDataById(String str, String str2);

    public static native PencilDrawableData[] pencilGetRemoteSnippet(String str);

    public static native boolean pencilReceiveRemoteData(String str, PencilDrawableData pencilDrawableData);

    public static native void pencilStart(String str, PencilStyle pencilStyle);

    public static native boolean rectangleReceiveRemoteData(String str, RectangleDrawableData rectangleDrawableData);

    public static native void setCurrentStep(String str, int i);

    public static native void setShapeVisible(String str, String str2, boolean z);

    public static native String sketchCreateInstance();

    public static native void sketchDestroy(String str);

    public static native void sketchInit(String str, ExtInfo extInfo, GlobalShapeConfig globalShapeConfig);

    public static native StoreDrawableData sketchRemove(String str, RemoveData removeData);

    public static native int sketchSwitchInstance(String str);

    public static native UndoRedoData undo(String str);

    static {
        C1711a.m7628a("sketch");
    }

    public static void error(String str) {
        C60700b.m235864f("Sketch", "[error]", "[SketchJNI]" + str);
    }

    public static void info(String str) {
        C60700b.m235843a("Sketch", "[info]", "[SketchJNI]" + str);
    }

    public static void log(String str) {
        C60700b.m235843a("Sketch", "[log]", "[SketchJNI]" + str);
    }

    public static void warn(String str) {
        C60700b.m235861e("Sketch", "[warn]", "[SketchJNI]" + str);
    }

    public static void monitor(String str, String str2) {
        C60700b.m235861e("Sketch", "[monitor]", "[SketchJNI] Monitor Event: " + str + ", Message: " + str2);
    }
}
