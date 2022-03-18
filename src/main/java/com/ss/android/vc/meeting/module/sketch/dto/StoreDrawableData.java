package com.ss.android.vc.meeting.module.sketch.dto;

import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.line.LineDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.oval.OvalDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.rect.RectangleDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.text.TextDrawableData;

public class StoreDrawableData {
    public ArrowDrawableData[] arrow;
    public LineDrawableData[] line;
    private int[] orderList;
    public OvalDrawableData[] oval;
    public PencilDrawableData[] pencils;
    public RectangleDrawableData[] rectangle;
    public TextDrawableData[] text;

    public String toString() {
        String str = "";
        String str2 = str;
        for (PencilDrawableData pencilDrawableData : this.pencils) {
            str2 = (str2 + pencilDrawableData) + " ";
        }
        String str3 = str;
        for (RectangleDrawableData rectangleDrawableData : this.rectangle) {
            str3 = (str3 + rectangleDrawableData) + " ";
        }
        String str4 = str;
        for (OvalDrawableData ovalDrawableData : this.oval) {
            str4 = (str4 + ovalDrawableData) + " ";
        }
        for (ArrowDrawableData arrowDrawableData : this.arrow) {
            str = (str + arrowDrawableData) + " ";
        }
        return "StoreDrawableData { pencils: " + str2 + ", rectangle: " + str3 + ", oval: " + str4 + ", arrow: " + str + ", }";
    }

    public StoreDrawableData(PencilDrawableData[] pencilDrawableDataArr, RectangleDrawableData[] rectangleDrawableDataArr, OvalDrawableData[] ovalDrawableDataArr, ArrowDrawableData[] arrowDrawableDataArr, LineDrawableData[] lineDrawableDataArr, TextDrawableData[] textDrawableDataArr, int[] iArr) {
        this.pencils = pencilDrawableDataArr;
        this.rectangle = rectangleDrawableDataArr;
        this.oval = ovalDrawableDataArr;
        this.arrow = arrowDrawableDataArr;
        this.line = lineDrawableDataArr;
        this.text = textDrawableDataArr;
        this.orderList = iArr;
    }
}
