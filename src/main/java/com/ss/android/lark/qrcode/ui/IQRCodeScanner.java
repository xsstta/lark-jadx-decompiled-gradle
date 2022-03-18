package com.ss.android.lark.qrcode.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.zxing.BarcodeFormat;
import com.ss.android.medialib.qr.PicScanner;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0002\u0016\u0017J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J5\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner;", "", "createQRCodeScanView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onCreate", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "id", "", "formats", "", "Lcom/google/zxing/BarcodeFormat;", "listener", "Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;", "(Landroidx/fragment/app/FragmentActivity;I[Lcom/google/zxing/BarcodeFormat;Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;)V", "onDestroy", "onRestart", "onStart", "onStop", "IQRCodeScanListener", "IScanHandler", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.qrcode.ui.a */
public interface IQRCodeScanner {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;", "", "onScanResult", "", "result", "", "", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.a$a */
    public interface IQRCodeScanListener {
        /* renamed from: a */
        void mo180888a(List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IScanHandler;", "", "doScan", "", "scanner", "Lcom/ss/android/medialib/qr/PicScanner;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.a$b */
    public interface IScanHandler {
        /* renamed from: a */
        int mo180905a(PicScanner picScanner);
    }

    /* renamed from: a */
    View mo180899a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo180900a();

    /* renamed from: a */
    void mo180901a(FragmentActivity fragmentActivity, int i, BarcodeFormat[] barcodeFormatArr, IQRCodeScanListener aVar);

    /* renamed from: b */
    void mo180902b();

    /* renamed from: c */
    void mo180903c();

    /* renamed from: d */
    void mo180904d();
}
