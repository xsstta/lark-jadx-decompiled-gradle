package com.ss.android.lark.maincore;

import android.view.View;

public interface IFunctionButtonV2 extends AbstractC44545b {
    /* renamed from: a */
    C44541a mo33238a();

    public enum TipStyle {
        RedDot(0),
        Custom(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static TipStyle valueOf(int i) {
            return forNumber(i);
        }

        public static TipStyle forNumber(int i) {
            if (i == 0) {
                return RedDot;
            }
            if (i != 1) {
                return RedDot;
            }
            return Custom;
        }

        private TipStyle(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.maincore.IFunctionButtonV2$a */
    public static class C44541a {

        /* renamed from: a */
        boolean f112933a;

        /* renamed from: b */
        TipStyle f112934b;

        /* renamed from: c */
        View f112935c;

        /* renamed from: a */
        public View mo158040a() {
            return this.f112935c;
        }

        /* renamed from: b */
        public TipStyle mo158041b() {
            return this.f112934b;
        }

        /* renamed from: c */
        public boolean mo158042c() {
            return this.f112933a;
        }

        /* renamed from: a */
        public static boolean m176738a(C44541a aVar, C44541a aVar2) {
            if (aVar == null) {
                if (aVar2 == null) {
                    return true;
                }
                return false;
            } else if (aVar2 == null) {
                if (aVar == null) {
                    return true;
                }
                return false;
            } else if (aVar.mo158041b() == aVar2.mo158041b() && aVar.mo158040a() == aVar.mo158040a() && aVar.mo158042c() == aVar2.mo158042c()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
