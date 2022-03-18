package com.bytedance.ee.larkwebview.quality.safe;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.larkwebview.p671d.p673b.p674a.AbstractC13430c;
import com.bytedance.ee.larkwebview.p671d.p673b.p674a.C13429b;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.C51320a;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.p2951f.C58652c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 72\u00020\u0001:\u00017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0002J)\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0012\"\u00020\u0016H\u0002¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\"\u001a\u00020\u0003H\u0002J\"\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0016JW\u0010)\u001a\u00020\u00142\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0018\u0010+\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0012\u0018\u00010\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\bH\u0002¢\u0006\u0002\u00100J,\u0010)\u001a\u00020\u00142\u0018\u00101\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0012\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J!\u00102\u001a\u00020\u00142\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012\"\u00020\u0010H\u0002¢\u0006\u0002\u00104J\u0018\u00105\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u00106\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0003R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0012\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/bytedance/ee/larkwebview/quality/safe/FileChooseHandlerV2;", "Lcom/bytedance/ee/larkwebview/quality/safe/IFileChooseHandler;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "mActivityNotFound", "", "mContextCallback", "Lcom/bytedance/ee/larkwebview/quality/safe/permission/IActivityProxy$IActivityResultCallback;", "mContextNotFound", "mMediaCaptureManager", "Lcom/ss/android/lark/widget/photo_picker/utils/MediaCaptureManager;", "mUploadCallback", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "mUploadCallback4Android5", "", "cancel", "", "createCamcorderIntent", "Landroid/content/Intent;", "multiple", "createCameraIntent", "createChooserIntent", "intents", "(Z[Landroid/content/Intent;)Landroid/content/Intent;", "createDefaultOpenableIntent", "createOpenableIntent", ShareHitPoint.f121869d, "", "createSoundRecorderIntent", "findActivity", "context", "onActivityResult", "requestCode", "", "resultCode", "intent", "onResult", "openFileChooser", "uploadMsg", "uploadMsg2", "acceptTypes", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fromOldSession", "(Landroid/webkit/ValueCallback;Landroid/webkit/ValueCallback;[Ljava/lang/String;Landroid/webkit/WebChromeClient$FileChooserParams;Z)V", "callback", "setResult", "result", "([Landroid/net/Uri;)V", "startActivity", "updateContext", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.d.b.a */
public final class FileChooseHandlerV2 {

    /* renamed from: b */
    public static final Companion f35387b = new Companion(null);

    /* renamed from: a */
    public FragmentActivity f35388a;

    /* renamed from: c */
    private ValueCallback<Uri> f35389c;

    /* renamed from: d */
    private ValueCallback<Uri[]> f35390d;

    /* renamed from: e */
    private boolean f35391e;

    /* renamed from: f */
    private boolean f35392f;

    /* renamed from: g */
    private final C58652c f35393g;

    /* renamed from: h */
    private final AbstractC13430c.AbstractC13431a f35394h = new C13425b(this);

    /* renamed from: i */
    private Context f35395i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/larkwebview/quality/safe/FileChooseHandlerV2$Companion;", "", "()V", "TAG", "", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.d.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/larkwebview/quality/safe/FileChooseHandlerV2$onResult$1", "Lcom/ss/android/lark/permission/IGetPermissionCallback;", "onError", "", "onSuccess", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.d.b.a$c */
    public static final class C13426c implements AbstractC51324c {

        /* renamed from: a */
        final /* synthetic */ FileChooseHandlerV2 f35397a;

        /* renamed from: b */
        final /* synthetic */ Uri[] f35398b;

        @Override // com.ss.android.lark.permission.AbstractC51324c
        /* renamed from: a */
        public void mo49823a() {
            FileChooseHandlerV2 aVar = this.f35397a;
            Uri[] uriArr = this.f35398b;
            aVar.mo49821a((Uri[]) Arrays.copyOf(uriArr, uriArr.length));
        }

        @Override // com.ss.android.lark.permission.AbstractC51324c
        /* renamed from: b */
        public void mo49824b() {
            this.f35397a.mo49821a(new Uri[0]);
            if (this.f35397a.f35388a != null) {
                FragmentActivity fragmentActivity = this.f35397a.f35388a;
                if (fragmentActivity == null || !fragmentActivity.isDestroyed()) {
                    FragmentActivity fragmentActivity2 = this.f35397a.f35388a;
                    if (fragmentActivity2 == null) {
                        Intrinsics.throwNpe();
                    }
                    new C51320a.C51322a(fragmentActivity2, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PermissionRequiredAsk)).mo176898a(UIUtils.getString(this.f35397a.f35388a, R.string.Lark_Legacy_PermissionTitle)).mo176901b(UIUtils.getString(this.f35397a.f35388a, R.string.Lark_Legacy_Setting)).mo176899a(UIUtils.getString(this.f35397a.f35388a, R.string.Lark_Legacy_CancelTip), null).mo176897a(19991).mo176900a().mo176894a();
                }
            }
        }

        C13426c(FileChooseHandlerV2 aVar, Uri[] uriArr) {
            this.f35397a = aVar;
            this.f35398b = uriArr;
        }
    }

    /* renamed from: a */
    public final void mo49818a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f35395i = context;
    }

    /* renamed from: a */
    private final Intent m54567a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    /* renamed from: d */
    private final Intent m54574d(boolean z) {
        Intent intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
        C13435b.m54600a(intent, z);
        return intent;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.d.b.a$d */
    public static final class C13427d implements C57805b.AbstractC57809a {

        /* renamed from: a */
        final /* synthetic */ FileChooseHandlerV2 f35399a;

        /* renamed from: b */
        final /* synthetic */ ValueCallback f35400b;

        /* renamed from: c */
        final /* synthetic */ ValueCallback f35401c;

        /* renamed from: d */
        final /* synthetic */ String[] f35402d;

        /* renamed from: e */
        final /* synthetic */ WebChromeClient.FileChooserParams f35403e;

        /* renamed from: f */
        final /* synthetic */ int f35404f;

        C13427d(FileChooseHandlerV2 aVar, ValueCallback valueCallback, ValueCallback valueCallback2, String[] strArr, WebChromeClient.FileChooserParams fileChooserParams, int i) {
            this.f35399a = aVar;
            this.f35400b = valueCallback;
            this.f35401c = valueCallback2;
            this.f35402d = strArr;
            this.f35403e = fileChooserParams;
            this.f35404f = i;
        }

        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
        public final void permissionGranted(boolean z) {
            if (z) {
                this.f35399a.mo49819a(this.f35400b, this.f35401c, this.f35402d, this.f35403e, true);
            } else {
                this.f35399a.mo49817a(this.f35404f, (Intent) null);
            }
        }
    }

    public FileChooseHandlerV2(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f35395i = context;
        this.f35393g = new C58652c(context);
    }

    /* renamed from: a */
    private final Intent m54568a(boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        C13435b.m54600a(intent, z);
        Intent a = m54569a(z, m54571b(z), m54574d(z));
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    /* renamed from: b */
    private final Intent m54571b(boolean z) {
        Intent intent;
        try {
            intent = this.f35393g.mo198850a(false);
        } catch (IOException e) {
            this.f35393g.mo198851a();
            Log.m165384e("FileChooseHandlerV2", "createCameraIntent", e);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        }
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        C13435b.m54600a(intent, z);
        return intent;
    }

    /* renamed from: c */
    private final Intent m54573c(boolean z) {
        Intent intent;
        try {
            intent = this.f35393g.mo198852b(false);
        } catch (IOException e) {
            this.f35393g.mo198851a();
            Log.m165384e("FileChooseHandlerV2", "createCamcorderIntent", e);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        }
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        C13435b.m54600a(intent, z);
        return intent;
    }

    /* renamed from: b */
    private final FragmentActivity m54572b(Context context) {
        Log.m165389i("FileChooseHandlerV2", "findActivity context = " + context);
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkExpressionValueIsNotNull(baseContext, "context.baseContext");
        return m54572b(baseContext);
    }

    /* renamed from: a */
    public final void mo49821a(Uri... uriArr) {
        ValueCallback<Uri> valueCallback = this.f35389c;
        if (!(valueCallback == null || uriArr == null || uriArr.length <= 0)) {
            if (valueCallback == null) {
                Intrinsics.throwNpe();
            }
            valueCallback.onReceiveValue(uriArr[0]);
        }
        ValueCallback<Uri[]> valueCallback2 = this.f35390d;
        if (valueCallback2 != null) {
            if (uriArr != null) {
                if (valueCallback2 == null) {
                    Intrinsics.throwNpe();
                }
                valueCallback2.onReceiveValue(uriArr);
            } else {
                if (valueCallback2 == null) {
                    Intrinsics.throwNpe();
                }
                valueCallback2.onReceiveValue(new Uri[0]);
            }
        }
        ValueCallback valueCallback3 = null;
        this.f35390d = valueCallback3;
        this.f35389c = valueCallback3;
        this.f35391e = false;
    }

    /* renamed from: a */
    private final Intent m54569a(boolean z, Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        C13435b.m54600a(intent, z);
        intent.putExtra("android.intent.extra.TITLE", UIHelper.getString(R.string.Lark_Legacy_SelectToUpload));
        return intent;
    }

    /* renamed from: a */
    private final void m54570a(Intent intent, int i) {
        try {
            FragmentActivity b = m54572b(this.f35395i);
            Log.m165389i("FileChooseHandlerV2", "mContext type = " + this.f35395i.getClass() + " , context = " + b);
            if (b instanceof FragmentActivity) {
                C13429b.m54587a(b).mo49830a(intent, i, this.f35394h);
            } else {
                Log.m165389i("FileChooseHandlerV2", "is not FragmentActivity so return");
            }
        } catch (ActivityNotFoundException e) {
            try {
                FragmentActivity b2 = m54572b(this.f35395i);
                if (b2 instanceof FragmentActivity) {
                    this.f35392f = true;
                    C13429b.m54587a(b2).mo49830a(m54568a(false), i, this.f35394h);
                    return;
                }
                Log.m165389i("FileChooseHandlerV2", "second is not FragmentActivity so return");
            } catch (ActivityNotFoundException unused) {
                Log.m165384e("FileChooseHandlerV2", "ActivityNotFoundException", e);
            }
        }
    }

    /* renamed from: a */
    public void mo49820a(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (fileChooserParams == null) {
            Intrinsics.throwNpe();
        }
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        Intrinsics.checkExpressionValueIsNotNull(acceptTypes, "fileChooserParams!!.acceptTypes");
        mo49819a(null, valueCallback, acceptTypes, fileChooserParams, false);
    }

    /* renamed from: a */
    public final void mo49817a(int i, Intent intent) {
        Uri uri;
        Log.m165389i("FileChooseHandlerV2", "onResult " + i);
        if (i != 0 || !this.f35391e) {
            ArrayList arrayList = new ArrayList();
            if (intent == null || i != -1) {
                uri = null;
            } else {
                uri = intent.getData();
            }
            if (intent == null || uri != null) {
                if (uri == null && i == -1 && !TextUtils.isEmpty(this.f35393g.mo198854c())) {
                    File file = new File(this.f35393g.mo198854c());
                    if (file.exists()) {
                        Log.m165389i("FileChooseHandlerV2", "broadcast scan_file");
                        uri = Uri.fromFile(file);
                        this.f35395i.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                    }
                }
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                if (clipData == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(clipData, "intent.clipData!!");
                int itemCount = clipData.getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    ClipData clipData2 = intent.getClipData();
                    if (clipData2 == null) {
                        Intrinsics.throwNpe();
                    }
                    ClipData.Item itemAt = clipData2.getItemAt(i2);
                    Intrinsics.checkExpressionValueIsNotNull(itemAt, "intent.clipData!!.getItemAt(i)");
                    Uri uri2 = itemAt.getUri();
                    Intrinsics.checkExpressionValueIsNotNull(uri2, "intent.clipData!!.getItemAt(i).uri");
                    arrayList.add(uri2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("multiple clipData not null ");
                ClipData clipData3 = intent.getClipData();
                if (clipData3 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(clipData3, "intent.clipData!!");
                sb.append(clipData3.getItemCount());
                Log.m165389i("FileChooseHandlerV2", sb.toString());
            } else {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTOS");
                if (CollectionUtils.isEmpty(stringArrayListExtra)) {
                    mo49821a(new Uri[0]);
                    return;
                }
                if (stringArrayListExtra == null) {
                    Intrinsics.throwNpe();
                }
                for (String str : stringArrayListExtra) {
                    if (!TextUtils.isEmpty(str)) {
                        File file2 = new File(str);
                        if (file2.exists()) {
                            Uri fromFile = Uri.fromFile(file2);
                            Intrinsics.checkExpressionValueIsNotNull(fromFile, "Uri.fromFile(mediaFile)");
                            arrayList.add(fromFile);
                        }
                    }
                }
            }
            if (uri != null) {
                arrayList.add(uri);
            }
            if (arrayList.isEmpty() || C51327f.m199080a(this.f35388a)) {
                Object[] array = arrayList.toArray(new Uri[0]);
                if (array != null) {
                    Uri[] uriArr = (Uri[]) array;
                    mo49821a((Uri[]) Arrays.copyOf(uriArr, uriArr.length));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Object[] array2 = arrayList.toArray(new Uri[0]);
            if (array2 != null) {
                C51327f.m199083b(this.f35388a, new C13426c(this, (Uri[]) array2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Log.m165389i("FileChooseHandlerV2", "error step 1");
        this.f35391e = false;
        mo49821a(new Uri[0]);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "requestCode", "", "resultCode", "intent", "Landroid/content/Intent;", "onResult"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.d.b.a$b */
    static final class C13425b implements AbstractC13430c.AbstractC13431a {

        /* renamed from: a */
        final /* synthetic */ FileChooseHandlerV2 f35396a;

        C13425b(FileChooseHandlerV2 aVar) {
            this.f35396a = aVar;
        }

        @Override // com.bytedance.ee.larkwebview.p671d.p673b.p674a.AbstractC13430c.AbstractC13431a
        /* renamed from: a */
        public final void mo49822a(int i, int i2, Intent intent) {
            if (i == 11) {
                this.f35396a.mo49817a(i2, intent);
            } else if (i == 12) {
                this.f35396a.mo49817a(i2, intent);
            }
        }
    }

    /* renamed from: a */
    public final void mo49819a(ValueCallback<Uri> valueCallback, ValueCallback<Uri[]> valueCallback2, String[] strArr, WebChromeClient.FileChooserParams fileChooserParams, boolean z) {
        boolean z2;
        String str;
        this.f35388a = m54572b(this.f35395i);
        if (fileChooserParams == null || fileChooserParams.getMode() != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        Log.m165389i("FileChooseHandlerV2", "multiple selected = " + z2);
        if (!(this.f35389c == null && this.f35390d == null) && !z) {
            Log.m165389i("FileChooseHandlerV2", "file picker operation in progress");
            return;
        }
        this.f35389c = valueCallback;
        this.f35390d = valueCallback2;
        int i = 11;
        if (valueCallback2 != null) {
            i = 12;
        }
        String str2 = strArr[0];
        if (!(!Intrinsics.areEqual(str2, "audio/*")) || C51327f.m199084b(this.f35388a) || z) {
            String str3 = "";
            if (fileChooserParams != null && fileChooserParams.isCaptureEnabled()) {
                if (Intrinsics.areEqual(str2, "image/*") || Intrinsics.areEqual(str2, "image/")) {
                    str3 = "camera";
                } else if (Intrinsics.areEqual(str2, "video/*")) {
                    str3 = "camcorder";
                } else if (Intrinsics.areEqual(str2, "audio/*")) {
                    str3 = "microphone";
                }
            }
            if (str3.length() > 0) {
                str = str3;
            } else {
                str = "filesystem";
            }
            Log.m165389i("FileChooseHandlerV2", "capture = " + str3 + " , mediaSource = " + str);
            if (Intrinsics.areEqual(str3, "filesystem")) {
                int i2 = 0;
                for (int length = strArr.length; i2 < length; length = length) {
                    Object[] array = new Regex(ContainerUtils.KEY_VALUE_DELIMITER).split(strArr[i2], 0).toArray(new String[0]);
                    if (array != null) {
                        String[] strArr2 = (String[]) array;
                        if (strArr2.length != 2 || !Intrinsics.areEqual("capture", strArr2[0])) {
                            str = str;
                        } else {
                            str = strArr2[1];
                        }
                        i2++;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            }
            this.f35393g.mo198851a();
            if (Intrinsics.areEqual(str2, "image/*") || StringsKt.contains$default((CharSequence) str2, (CharSequence) "image/", false, 2, (Object) null)) {
                Log.m165389i("FileChooseHandlerV2", "mActivity = " + this.f35388a);
                if (Intrinsics.areEqual(str, "camera")) {
                    C58557a.m227127a().mo198520e(1).mo198525h(false).mo198532o(false).mo198526i(true).mo198512a(this.f35395i, C13429b.m54587a(this.f35388a).mo49829a(this.f35394h), i);
                    return;
                }
                C58557a.C58559a i3 = C58557a.m227127a().mo198525h(false).mo198532o(false).mo198526i(true);
                if (!z2) {
                    i3.mo198506a(1);
                }
                i3.mo198512a(this.f35395i, C13429b.m54587a(this.f35388a).mo49829a(this.f35394h), i);
            } else if (Intrinsics.areEqual(str2, "video/*")) {
                if (Intrinsics.areEqual(str, "camcorder")) {
                    m54570a(m54573c(z2), i);
                    return;
                }
                Intent a = m54569a(z2, m54573c(z2));
                a.putExtra("android.intent.extra.INTENT", m54567a("video/*"));
                m54570a(a, i);
            } else if (!Intrinsics.areEqual(str2, "audio/*")) {
                m54570a(m54568a(z2), i);
            } else if (Intrinsics.areEqual(str, "microphone")) {
                m54570a(m54574d(z2), i);
            } else {
                Intent a2 = m54569a(z2, m54574d(z2));
                a2.putExtra("android.intent.extra.INTENT", m54567a("audio/*"));
                m54570a(a2, i);
            }
        } else {
            C57805b.m224331b(this.f35388a, new C13427d(this, valueCallback, valueCallback2, strArr, fileChooserParams, i));
        }
    }
}
