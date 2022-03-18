package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.util.C67586c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated(message = "use plugin")
@ApiSupportType(apiName = {"filePicker"}, support = {AppType.WebAPP, AppType.GadgetAPP})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0002J;\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00042\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\"\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0018\u0010/\u001a\u00020\u00192\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000101H\u0002J\u0010\u00102\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u00103\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u00104\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020\u0019H\u0002J\b\u00107\u001a\u00020\u000fH\u0016J\u0018\u00108\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/FilePickerAsyncHandler;", "Lcom/tt/miniapp/business/api/base/AbsAsyncAPIHandler;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "EXTRA_FILE_PATH_LIST", "KEY_IS_SYSTEM", "KEY_MAX_NUM", "KEY_PICKER_CONFIRM", "KEY_PICKER_TITLE", "TAG", "isSystem", "", "apiNames", "", "buildFileJSONObject", "Lorg/json/JSONObject;", "schemaFilePath", "fileName", "fileSize", "", "buildResult", "Lorg/json/JSONArray;", "pathString", "getDataColumn", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getPath", "handleAPI", "", "apiInvokeData", "Lcom/tt/refer/abs/api/entity/APIInvokeData;", "handleActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "handlePathList", "list", "Ljava/util/ArrayList;", "isDownloadsDocument", "isExternalStorageDocument", "isMediaDocument", "makeMsg", "args", "shouldHandleActivityResult", "uriToFileApiQ", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.l */
public final class FilePickerAsyncHandler extends AbstractC65797c {

    /* renamed from: a */
    public final String f61455a = "FilePickerAsyncHandler";

    /* renamed from: b */
    public boolean f61456b;

    /* renamed from: c */
    private final String f61457c = "extra.file.path.list";

    /* renamed from: d */
    private final String f61458d = "maxNum";

    /* renamed from: e */
    private final String f61459e = "pickerTitle";

    /* renamed from: f */
    private final String f61460f = "pickerConfirm";

    /* renamed from: g */
    private final String f61461g = "isSystem";

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "apiInvokeData");
        String str = this.f61455a;
        AppBrandLogger.m52830i(str, "invoke api" + bVar.mo234988d());
        Object a = bVar.mo234985a(this.f61458d, Integer.MAX_VALUE);
        Intrinsics.checkExpressionValueIsNotNull(a, "apiInvokeData.getParam(KEY_MAX_NUM, Int.MAX_VALUE)");
        int intValue = ((Number) a).intValue();
        String str2 = this.f61459e;
        IAppContext f = mo230473f();
        Intrinsics.checkExpressionValueIsNotNull(f, "appContext");
        Object a2 = bVar.mo234985a(str2, f.getApplicationContext().getString(R.string.LittleApp_GadgetAndriod_PickerTitle));
        Intrinsics.checkExpressionValueIsNotNull(a2, "apiInvokeData.getParam(K…dgetAndriod_PickerTitle))");
        String str3 = (String) a2;
        String str4 = this.f61460f;
        IAppContext f2 = mo230473f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "appContext");
        Object a3 = bVar.mo234985a(str4, f2.getApplicationContext().getString(R.string.LittleApp_GadgetAndriod_PickerConfirm));
        Intrinsics.checkExpressionValueIsNotNull(a3, "apiInvokeData.getParam(K…etAndriod_PickerConfirm))");
        String str5 = (String) a3;
        Object a4 = bVar.mo234985a(this.f61461g, false);
        Intrinsics.checkExpressionValueIsNotNull(a4, "apiInvokeData.getParam(K…YSTEM,\n            false)");
        this.f61456b = ((Boolean) a4).booleanValue();
        AbstractC67709b.AbstractC67710a h = mo230475h();
        Intrinsics.checkExpressionValueIsNotNull(h, "apiDependency");
        Activity f3 = h.mo235051f();
        if (intValue < 0) {
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "maxNumber < 0");
        } else if (f3 == null) {
            AppBrandLogger.m52830i(this.f61455a, "curActivity is null");
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "activity is null");
        } else {
            HashSet hashSet = new HashSet();
            hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
            hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
            mo230475h().mo235022a(f3, mo230472e(), hashSet, new C25166a(this, f3, intValue, str3, str5));
        }
    }

    public FilePickerAsyncHandler() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/larksuite/component/openplatform/core/plugin/messenger/FilePickerAsyncHandler$handleAPI$1", "Lcom/tt/refer/abs/api/IAPIService$IPermissionsResultAction;", "onDenied", "", "permission", "", "onGranted", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.l$a */
    public static final class C25166a implements AbstractC67709b.AbstractC67711b {

        /* renamed from: a */
        final /* synthetic */ FilePickerAsyncHandler f61462a;

        /* renamed from: b */
        final /* synthetic */ Activity f61463b;

        /* renamed from: c */
        final /* synthetic */ int f61464c;

        /* renamed from: d */
        final /* synthetic */ String f61465d;

        /* renamed from: e */
        final /* synthetic */ String f61466e;

        @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
        /* renamed from: a */
        public void mo87574a() {
            if (this.f61462a.f61456b) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                try {
                    AppBrandLogger.m52830i(this.f61462a.f61455a, "打开系统文件选择器");
                    this.f61463b.startActivityForResult(intent, 30001);
                } catch (ActivityNotFoundException unused) {
                    AppBrandLogger.m52829e(this.f61462a.f61455a, "no file manager");
                    this.f61462a.mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "open picker fail");
                }
            } else {
                AppBrandLogger.m52830i(this.f61462a.f61455a, "invoke startFilePickerActivity");
                this.f61462a.mo230475h().mo235019a(this.f61463b, 30001, this.f61464c, this.f61465d, this.f61466e);
            }
        }

        @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
        /* renamed from: a */
        public void mo87575a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "permission");
            AppBrandLogger.m52830i(this.f61462a.f61455a, "拒绝授权");
            this.f61462a.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
        }

        C25166a(FilePickerAsyncHandler lVar, Activity activity, int i, String str, String str2) {
            this.f61462a = lVar;
            this.f61463b = activity;
            this.f61464c = i;
            this.f61465d = str;
            this.f61466e = str2;
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        List<String> singletonList = Collections.singletonList("filePicker");
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…t.AppApi.API_FILE_PICKER)");
        return singletonList;
    }

    /* renamed from: a */
    private final boolean m90531a(Uri uri) {
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    /* renamed from: b */
    private final boolean m90533b(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    /* renamed from: c */
    private final boolean m90534c(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }

    /* renamed from: a */
    private final void m90530a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        if (jSONArray.length() != 0) {
            jSONObject.put("list", jSONArray);
            mo230492b(jSONObject);
            return;
        }
        mo230482a(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("list"));
    }

    /* renamed from: a */
    private final JSONArray m90527a(String str) {
        JSONArray jSONArray = new JSONArray();
        if (str != null) {
            int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null) + 1;
            if (str != null) {
                String substring = str.substring(lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                StringBuilder sb = new StringBuilder();
                AbstractC67709b.AbstractC67710a h = mo230475h();
                Intrinsics.checkExpressionValueIsNotNull(h, "apiDependency");
                sb.append(h.mo235047d());
                sb.append('/');
                sb.append(System.currentTimeMillis());
                sb.append('_');
                sb.append(substring);
                String sb2 = sb.toString();
                File file = new File(sb2);
                C67586c.m263045a(new File(str), file, false);
                String d = mo230475h().mo235048d(sb2);
                Intrinsics.checkExpressionValueIsNotNull(d, "apiDependency.getSchemaFilePath(tempFilePath)");
                jSONArray.put(m90529a(d, substring, file.length()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final JSONArray m90528a(ArrayList<String> arrayList) {
        JSONArray jSONArray = new JSONArray();
        if (arrayList == null) {
            return jSONArray;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = arrayList.get(i);
            Intrinsics.checkExpressionValueIsNotNull(str, "list[i]");
            String str2 = str;
            int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, "/", 0, false, 6, (Object) null) + 1;
            if (str2 != null) {
                String substring = str2.substring(lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                StringBuilder sb = new StringBuilder();
                AbstractC67709b.AbstractC67710a h = mo230475h();
                Intrinsics.checkExpressionValueIsNotNull(h, "apiDependency");
                sb.append(h.mo235047d());
                sb.append('/');
                sb.append(System.currentTimeMillis());
                sb.append('_');
                sb.append(i);
                sb.append('_');
                sb.append(substring);
                String sb2 = sb.toString();
                File file = new File(sb2);
                C67586c.m263045a(new File(str2), file, false);
                String d = mo230475h().mo235048d(sb2);
                Intrinsics.checkExpressionValueIsNotNull(d, "apiDependency.getSchemaFilePath(tempFilePath)");
                jSONArray.put(m90529a(d, substring, file.length()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return jSONArray;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilePickerAsyncHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }

    /* renamed from: a */
    private final JSONArray m90526a(Context context, Uri uri) {
        String str;
        AppBrandLogger.m52830i(this.f61455a, "getPath>>>");
        String str2 = null;
        if (Build.VERSION.SDK_INT >= 29) {
            return m90532b(context, uri);
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (m90531a(uri)) {
                AppBrandLogger.m52830i(this.f61455a, "getPath>>> isExternalStorageDocument");
                String documentId = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkExpressionValueIsNotNull(documentId, "DocumentsContract.getDocumentId(uri)");
                List split$default = StringsKt.split$default((CharSequence) documentId, new String[]{":"}, false, 0, 6, (Object) null);
                if (split$default.size() > 1 && StringsKt.equals("primary", (String) split$default.get(0), true)) {
                    str2 = Environment.getExternalStorageDirectory() + '/' + ((String) split$default.get(1));
                    AppBrandLogger.m52830i(this.f61455a, "is external storage document primary", str2);
                }
            } else if (m90533b(uri)) {
                AppBrandLogger.m52830i(this.f61455a, "getPath>>> isDownloadsDocument");
                String documentId2 = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkExpressionValueIsNotNull(documentId2, "id");
                if (StringsKt.startsWith$default(documentId2, "raw:", false, 2, (Object) null)) {
                    str = StringsKt.substringAfter$default(documentId2, "raw:", (String) null, 2, (Object) null);
                } else {
                    str = m90525a(context, Uri.parse("content://downloads/public_downloads/" + documentId2), null, null);
                }
                str2 = str;
                AppBrandLogger.m52830i(this.f61455a, "is download document", str2);
            } else if (m90534c(uri)) {
                AppBrandLogger.m52830i(this.f61455a, "getPath>>> isMediaDocument");
                String documentId3 = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkExpressionValueIsNotNull(documentId3, "DocumentsContract.getDocumentId(uri)");
                List split$default2 = StringsKt.split$default((CharSequence) documentId3, new String[]{":"}, false, 0, 6, (Object) null);
                if (split$default2.size() > 1) {
                    Uri uri2 = null;
                    if (Intrinsics.areEqual("image", (String) split$default2.get(0))) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (Intrinsics.areEqual("video", (String) split$default2.get(0))) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (Intrinsics.areEqual("audio", (String) split$default2.get(0))) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    String a = m90525a(context, uri2, "_id=?", new String[]{(String) split$default2.get(1)});
                    AppBrandLogger.m52830i(this.f61455a, "is media document", a);
                    str2 = a;
                }
            }
        } else if (StringsKt.equals("content", uri.getScheme(), true)) {
            str2 = m90525a(context, uri, null, null);
            AppBrandLogger.m52830i(this.f61455a, "is content", str2);
        } else if (StringsKt.equals("file", uri.getScheme(), true)) {
            str2 = uri.getPath();
            AppBrandLogger.m52830i(this.f61455a, "is file", str2);
        }
        return m90527a(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONArray m90532b(android.content.Context r16, android.net.Uri r17) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.FilePickerAsyncHandler.m90532b(android.content.Context, android.net.Uri):org.json.JSONArray");
    }

    /* renamed from: a */
    private final JSONObject m90529a(String str, String str2, long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", str);
        jSONObject.put("name", str2);
        jSONObject.put("size", j);
        return jSONObject;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2 = this.f61455a;
        AppBrandLogger.m52830i(str2, "handleActivityResult, reqCode" + i + ", resultCode" + i2);
        if (i != 30001) {
            return false;
        }
        if (i2 != -1 || intent == null) {
            mo230481a(ApiCode.GENERAL_CANCEL);
            return true;
        }
        if (this.f61456b) {
            Uri data = intent.getData();
            IAppContext f = mo230473f();
            Intrinsics.checkExpressionValueIsNotNull(f, "appContext");
            Context applicationContext = f.getApplicationContext();
            String str3 = this.f61455a;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("handleActivityResult>>> isSystem");
            if (data != null) {
                str = data.toString();
            } else {
                str = null;
            }
            sb.append(str);
            objArr[0] = sb.toString();
            AppBrandLogger.m52830i(str3, objArr);
            if (data == null || applicationContext == null) {
                AppBrandLogger.m52829e(this.f61455a, "file picker uri is null");
                mo230482a(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("file picker uri"));
            } else {
                JSONArray a = m90526a(applicationContext, data);
                AppBrandLogger.m52830i(this.f61455a, a.toString());
                m90530a(a);
            }
        } else {
            AppBrandLogger.m52830i(this.f61455a, String.valueOf(intent.getStringArrayListExtra(this.f61457c)));
            m90530a(m90528a(intent.getStringArrayListExtra(this.f61457c)));
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r1 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m90525a(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1
            java.lang.String r2 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            if (r11 != 0) goto L_0x000d
            return r0
        L_0x000d:
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x0035 }
            r8 = 0
            r4 = r11
            r6 = r12
            r7 = r13
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0035 }
            if (r1 == 0) goto L_0x002d
            boolean r10 = r1.moveToFirst()     // Catch:{ Exception -> 0x0035 }
            if (r10 == 0) goto L_0x002d
            int r10 = r1.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r10 = r1.getString(r10)     // Catch:{ Exception -> 0x0035 }
            r1.close()
            return r10
        L_0x002d:
            if (r1 == 0) goto L_0x0049
        L_0x002f:
            r1.close()
            goto L_0x0049
        L_0x0033:
            r10 = move-exception
            goto L_0x004a
        L_0x0035:
            r10 = move-exception
            java.lang.String r11 = r9.f61455a     // Catch:{ all -> 0x0033 }
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0033 }
            r13 = 0
            java.lang.String r2 = "getDataColumn fail"
            r12[r13] = r2     // Catch:{ all -> 0x0033 }
            r13 = 1
            r12[r13] = r10     // Catch:{ all -> 0x0033 }
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r11, r12)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0049
            goto L_0x002f
        L_0x0049:
            return r0
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()
        L_0x004f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.FilePickerAsyncHandler.m90525a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
