package com.ss.android.lark.appcenter.scancode;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.google.zxing.BarcodeFormat;
import com.larksuite.suite.R;
import com.ss.android.lark.fastqrcode.p1832b.C37054a;
import com.ss.android.lark.fastqrcode.p1834d.C37059b;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.appcenter.scancode.c */
public class C29121c extends C1150b {
    private BarcodeFormat[] barcodeFormats;
    public C1177w<Object> mFinishTask = new C1177w<>();
    public C1177w<Object> mInitTask = new C1177w<>();
    public C1177w<Object> mParseQRCodeErrorTask = new C1177w<>();
    public C1177w<Boolean> mShowBarCodeInput = new C1177w<>();
    public C1177w<String> mToastText = new C1177w<>();

    public LiveData<Object> getFinishTask() {
        return this.mFinishTask;
    }

    public BarcodeFormat[] getFormats() {
        return this.barcodeFormats;
    }

    public LiveData<Object> getInitTask() {
        return this.mInitTask;
    }

    public LiveData<Object> getParseQRCodeErrorTask() {
        return this.mParseQRCodeErrorTask;
    }

    public LiveData<Boolean> getShowBarCodeInput() {
        return this.mShowBarCodeInput;
    }

    public LiveData<String> getToastText() {
        return this.mToastText;
    }

    public void finish() {
        this.mFinishTask.mo5929b((Object) null);
    }

    public void showParseQRCodeErrorDialog() {
        this.mParseQRCodeErrorTask.mo5929b((Object) null);
    }

    public void showToast(String str) {
        this.mToastText.mo5929b(str);
    }

    public C29121c(Application application) {
        super(application);
    }

    public void scanQRCodeInPhoto(String str) {
        if (!TextUtils.isEmpty(str)) {
            C37054a a = C37059b.m146191a(str, -1, -1);
            if (a == null || a.f95197b != BarcodeFormat.QR_CODE) {
                showParseQRCodeErrorDialog();
            } else if (!TextUtils.isEmpty(a.f95196a)) {
                handleQRCodeResultInfo(a.f95196a, 3);
            } else {
                showToast(C57582a.m223604a((Context) getApplication(), (int) R.string.Lark_Legacy_QrCodeNotFound));
            }
        }
    }

    private void handleFormats(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        if (iArr == null) {
            arrayList.add(BarcodeFormat.QR_CODE);
        } else {
            for (int i = 0; i < iArr.length; i++) {
                if (iArr[i] == 0) {
                    arrayList.add(BarcodeFormat.QR_CODE);
                } else if (iArr[i] == 1) {
                    arrayList.add(BarcodeFormat.EAN_8);
                    arrayList.add(BarcodeFormat.EAN_13);
                    arrayList.add(BarcodeFormat.UPC_EAN_EXTENSION);
                    arrayList.add(BarcodeFormat.CODE_39);
                    arrayList.add(BarcodeFormat.CODE_93);
                    arrayList.add(BarcodeFormat.CODE_128);
                    arrayList.add(BarcodeFormat.CODABAR);
                }
            }
        }
        this.barcodeFormats = (BarcodeFormat[]) arrayList.toArray(new BarcodeFormat[0]);
    }

    public void handleQRCodeResultInfo(String str, int i) {
        if (!C29118b.m107036a().mo103280a(str, i)) {
            showParseQRCodeErrorDialog();
        } else {
            finish();
        }
    }

    public void onCreate(int[] iArr, boolean z) {
        handleFormats(iArr);
        this.mInitTask.mo5929b((Object) null);
        this.mShowBarCodeInput.mo5929b(Boolean.valueOf(z));
    }
}
