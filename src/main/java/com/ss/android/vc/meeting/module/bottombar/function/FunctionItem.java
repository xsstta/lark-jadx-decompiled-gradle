package com.ss.android.vc.meeting.module.bottombar.function;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/module/bottombar/function/FunctionItem;", "Ljava/io/Serializable;", "funcNameRes", "", "funcIconRes", "funcType", "Lcom/ss/android/vc/meeting/module/bottombar/function/FunctionItem$FunctionType;", "(IILcom/ss/android/vc/meeting/module/bottombar/function/FunctionItem$FunctionType;)V", "getFuncIconRes", "()I", "setFuncIconRes", "(I)V", "getFuncNameRes", "setFuncNameRes", "getFuncType", "()Lcom/ss/android/vc/meeting/module/bottombar/function/FunctionItem$FunctionType;", "setFuncType", "(Lcom/ss/android/vc/meeting/module/bottombar/function/FunctionItem$FunctionType;)V", "FunctionType", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FunctionItem implements Serializable {
    private int funcIconRes;
    private int funcNameRes;
    private FunctionType funcType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/bottombar/function/FunctionItem$FunctionType;", "", "(Ljava/lang/String;I)V", "Chat", "Record", "BreakoutRoom", "Subtitle", "Live", "Effect", "PSTN", "Interpretation", "SIP", "Settings", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum FunctionType {
        Chat,
        Record,
        BreakoutRoom,
        Subtitle,
        Live,
        Effect,
        PSTN,
        Interpretation,
        SIP,
        Settings
    }

    public final int getFuncIconRes() {
        return this.funcIconRes;
    }

    public final int getFuncNameRes() {
        return this.funcNameRes;
    }

    public final FunctionType getFuncType() {
        return this.funcType;
    }

    public final void setFuncIconRes(int i) {
        this.funcIconRes = i;
    }

    public final void setFuncNameRes(int i) {
        this.funcNameRes = i;
    }

    public final void setFuncType(FunctionType functionType) {
        Intrinsics.checkParameterIsNotNull(functionType, "<set-?>");
        this.funcType = functionType;
    }

    public FunctionItem(int i, int i2, FunctionType functionType) {
        Intrinsics.checkParameterIsNotNull(functionType, "funcType");
        this.funcNameRes = i;
        this.funcIconRes = i2;
        this.funcType = functionType;
    }
}
