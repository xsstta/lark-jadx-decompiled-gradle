package com.bytedance.common.utility;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class LooperPrinterUtils {
    private static boolean isInit = false;
    public static int mMaxCount = 5;
    public static PrinterListener sListener;
    private static Printer sOriginPrinter;
    private static PrinterWrapper sPrinterWrapper;

    public interface PrinterListener {
        void onDuration(long j);
    }

    /* access modifiers changed from: package-private */
    public static class PrinterWrapper implements Printer {
        boolean haveAdd = false;
        boolean haveRemove = false;
        List<Printer> mAddPrinters = new ArrayList();
        List<Printer> mPrinters = new ArrayList();
        List<Printer> mRemovePrinters = new ArrayList();

        PrinterWrapper() {
        }

        public void println(String str) {
            if (!TextUtils.isEmpty(str)) {
                long currentTimeMillis = LooperPrinterUtils.sListener != null ? System.currentTimeMillis() : 0;
                if (str.charAt(0) == '>' && this.haveAdd) {
                    for (Printer printer : this.mAddPrinters) {
                        if (!this.mPrinters.contains(printer)) {
                            this.mPrinters.add(printer);
                        }
                    }
                    this.mAddPrinters.clear();
                    this.haveAdd = false;
                }
                if (this.mPrinters.size() > LooperPrinterUtils.mMaxCount) {
                    Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
                }
                for (Printer printer2 : this.mPrinters) {
                    if (printer2 != null) {
                        printer2.println(str);
                    }
                }
                if (str.charAt(0) == '<' && this.haveRemove) {
                    for (Printer printer3 : this.mRemovePrinters) {
                        this.mPrinters.remove(printer3);
                        this.mAddPrinters.remove(printer3);
                    }
                    this.mRemovePrinters.clear();
                    this.haveRemove = false;
                }
                if (LooperPrinterUtils.sListener != null && currentTimeMillis > 0) {
                    LooperPrinterUtils.sListener.onDuration(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }

    private static Printer getCurrentPrinter() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void init() {
        if (!isInit) {
            isInit = true;
            sPrinterWrapper = new PrinterWrapper();
            Printer currentPrinter = getCurrentPrinter();
            sOriginPrinter = currentPrinter;
            if (currentPrinter != null) {
                sPrinterWrapper.mPrinters.add(sOriginPrinter);
            }
            Looper.getMainLooper().setMessageLogging(sPrinterWrapper);
        }
    }

    public static void addMessageLogging(Printer printer) {
        if (printer != null && !sPrinterWrapper.mAddPrinters.contains(printer)) {
            sPrinterWrapper.mAddPrinters.add(printer);
            sPrinterWrapper.haveAdd = true;
        }
    }
}
