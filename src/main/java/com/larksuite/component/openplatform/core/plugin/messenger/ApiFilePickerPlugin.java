package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapphost.util.C67586c;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 <2\u00020\u0001:\u0004:;<=B\u0005¢\u0006\u0002\u0010\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002J.\u0010\u0019\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0007J;\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010#H\u0002¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020'0)2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J$\u0010(\u001a\b\u0012\u0004\u0012\u00020'0)2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020 0)H\u0002J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020 0)2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\"\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u00102\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u00103\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u00104\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u0014H\u0002J\b\u00107\u001a\u00020\u0007H\u0016J\u0018\u00108\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u00109\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "invokeCallback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Lcom/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin$ApiFilePickerResponse;", "isSystem", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "logger", "Lcom/ss/android/lark/optrace/api/ILogger;", "buildFileJSONObject", "Lcom/alibaba/fastjson/JSONObject;", "schemaFilePath", "", "fileName", "fileSize", "", "buildResult", "Lcom/alibaba/fastjson/JSONArray;", "pathString", "callbackOk", "", "list", "filePickerAsync", "apiRequest", "Lcom/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin$ApiFilePickerRequest;", "getDataColumn", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getPath", "getPathItem", "Lcom/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin$FileItemResponse;", "getPathList", "", "uriList", "getUriListFromIntent", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "handleActivityResult", "requestCode", "", "resultCode", "isDownloadsDocument", "isExternalStorageDocument", "isMediaDocument", "makeMsg", "args", "shouldHandleActivityResult", "standardGetPath", "uriToFileApiQ", "ApiFilePickerRequest", "ApiFilePickerResponse", "Companion", "FileItemResponse", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ApiFilePickerPlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_FILE_PATH_LIST = EXTRA_FILE_PATH_LIST;
    public static final String TAG = TAG;
    private AbstractC25897h<ApiFilePickerResponse> invokeCallback;
    public boolean isSystem;
    private LKEvent lkEvent;
    public ILogger logger;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin$ApiFilePickerRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "()V", "isSystem", "", "()Z", "setSystem", "(Z)V", "maxNum", "", "getMaxNum", "()Ljava/lang/Integer;", "setMaxNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pickerConfirm", "", "getPickerConfirm", "()Ljava/lang/String;", "setPickerConfirm", "(Ljava/lang/String;)V", "pickerTitle", "getPickerTitle", "setPickerTitle", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ApiFilePickerRequest extends C25920a {
        @JSONField(name = "isSystem")
        private boolean isSystem;
        @JSONField(name = "maxNum")
        private Integer maxNum;
        @JSONField(name = "pickerConfirm")
        private String pickerConfirm;
        @JSONField(name = "pickerTitle")
        private String pickerTitle;

        public final Integer getMaxNum() {
            return this.maxNum;
        }

        public final String getPickerConfirm() {
            return this.pickerConfirm;
        }

        public final String getPickerTitle() {
            return this.pickerTitle;
        }

        public final boolean isSystem() {
            return this.isSystem;
        }

        public final void setMaxNum(Integer num) {
            this.maxNum = num;
        }

        public final void setPickerConfirm(String str) {
            this.pickerConfirm = str;
        }

        public final void setPickerTitle(String str) {
            this.pickerTitle = str;
        }

        public final void setSystem(boolean z) {
            this.isSystem = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin$ApiFilePickerResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "list", "Lcom/alibaba/fastjson/JSONArray;", "getList", "()Lcom/alibaba/fastjson/JSONArray;", "setList", "(Lcom/alibaba/fastjson/JSONArray;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ApiFilePickerResponse extends C25921b {
        @JSONField(name = "list")
        private JSONArray list;

        public final JSONArray getList() {
            return this.list;
        }

        public final void setList(JSONArray jSONArray) {
            this.list = jSONArray;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin$FileItemResponse;", "Ljava/io/Serializable;", "path", "", "name", "size", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getPath", "getSize", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class FileItemResponse implements Serializable {
        private final String name;
        private final String path;
        private final long size;

        public static /* synthetic */ FileItemResponse copy$default(FileItemResponse fileItemResponse, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileItemResponse.path;
            }
            if ((i & 2) != 0) {
                str2 = fileItemResponse.name;
            }
            if ((i & 4) != 0) {
                j = fileItemResponse.size;
            }
            return fileItemResponse.copy(str, str2, j);
        }

        public final String component1() {
            return this.path;
        }

        public final String component2() {
            return this.name;
        }

        public final long component3() {
            return this.size;
        }

        public final FileItemResponse copy(@JSONField(name = "path") String str, @JSONField(name = "name") String str2, @JSONField(name = "size") long j) {
            Intrinsics.checkParameterIsNotNull(str, "path");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            return new FileItemResponse(str, str2, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileItemResponse)) {
                return false;
            }
            FileItemResponse fileItemResponse = (FileItemResponse) obj;
            return Intrinsics.areEqual(this.path, fileItemResponse.path) && Intrinsics.areEqual(this.name, fileItemResponse.name) && this.size == fileItemResponse.size;
        }

        public int hashCode() {
            String str = this.path;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.size;
            return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "FileItemResponse(path=" + this.path + ", name=" + this.name + ", size=" + this.size + ")";
        }

        public final String getName() {
            return this.name;
        }

        public final String getPath() {
            return this.path;
        }

        public final long getSize() {
            return this.size;
        }

        public FileItemResponse(@JSONField(name = "path") String str, @JSONField(name = "name") String str2, @JSONField(name = "size") long j) {
            Intrinsics.checkParameterIsNotNull(str, "path");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            this.path = str;
            this.name = str2;
            this.size = j;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin$Companion;", "", "()V", "EXTRA_FILE_PATH_LIST", "", "TAG", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/larksuite/component/openplatform/core/plugin/messenger/ApiFilePickerPlugin$filePickerAsync$1", "Lcom/tt/refer/abs/api/IAPIService$IPermissionsResultAction;", "onDenied", "", "permission", "", "onGranted", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin$b */
    public static final class C25056b implements AbstractC67709b.AbstractC67711b {

        /* renamed from: a */
        final /* synthetic */ ApiFilePickerPlugin f61205a;

        /* renamed from: b */
        final /* synthetic */ Activity f61206b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f61207c;

        /* renamed from: d */
        final /* synthetic */ AbstractC25897h f61208d;

        /* renamed from: e */
        final /* synthetic */ int f61209e;

        /* renamed from: f */
        final /* synthetic */ String f61210f;

        /* renamed from: g */
        final /* synthetic */ String f61211g;

        @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
        /* renamed from: a */
        public void mo87574a() {
            if (this.f61205a.isSystem) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                try {
                    ILogger aVar = this.f61205a.logger;
                    if (aVar != null) {
                        aVar.mo92224i(ApiFilePickerPlugin.TAG, "open system file picker");
                    }
                    AbstractC12888c i = C25529d.m91168i(this.f61205a.getAppContext());
                    if (i != null) {
                        i.startActivityForResult(intent, 30001);
                    } else {
                        this.f61206b.startActivityForResult(intent, 30001);
                    }
                } catch (ActivityNotFoundException e) {
                    ILogger aVar2 = this.f61205a.logger;
                    if (aVar2 != null) {
                        aVar2.mo92223e(ApiFilePickerPlugin.TAG, "no file manager");
                    }
                    this.f61205a.fillFailedResponse(this.f61207c.element, C25906a.f64080j, e.getMessage());
                    AbstractC25897h hVar = this.f61208d;
                    if (hVar != null) {
                        hVar.callback(this.f61207c.element);
                    }
                }
            } else {
                ILogger aVar3 = this.f61205a.logger;
                if (aVar3 != null) {
                    aVar3.mo92224i(ApiFilePickerPlugin.TAG, "invoke startFilePickerActivity");
                }
                this.f61205a.getApiDependency().mo235019a(this.f61206b, 30001, this.f61209e, this.f61210f, this.f61211g);
            }
        }

        @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
        /* renamed from: a */
        public void mo87575a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "permission");
            ILogger aVar = this.f61205a.logger;
            if (aVar != null) {
                aVar.mo92224i(ApiFilePickerPlugin.TAG, "permission denied");
            }
            this.f61205a.fillFailedResponse(this.f61207c.element, C25906a.f64075e, "permission denied");
            AbstractC25897h hVar = this.f61208d;
            if (hVar != null) {
                hVar.callback(this.f61207c.element);
            }
        }

        C25056b(ApiFilePickerPlugin apiFilePickerPlugin, Activity activity, Ref.ObjectRef objectRef, AbstractC25897h hVar, int i, String str, String str2) {
            this.f61205a = apiFilePickerPlugin;
            this.f61206b = activity;
            this.f61207c = objectRef;
            this.f61208d = hVar;
            this.f61209e = i;
            this.f61210f = str;
            this.f61211g = str2;
        }
    }

    private final void callbackOk(JSONArray jSONArray) {
        ApiFilePickerResponse apiFilePickerResponse = new ApiFilePickerResponse();
        apiFilePickerResponse.setList(jSONArray);
        AbstractC25897h<ApiFilePickerResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiFilePickerResponse);
        }
    }

    private final boolean isDownloadsDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    private final boolean isExternalStorageDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    private final boolean isMediaDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }

    private final void makeMsg(JSONArray jSONArray) {
        if (jSONArray.size() != 0) {
            callbackOk(jSONArray);
            return;
        }
        ApiFilePickerResponse apiFilePickerResponse = new ApiFilePickerResponse();
        fillFailedResponse(apiFilePickerResponse, C25906a.f64080j, "list is null");
        AbstractC25897h<ApiFilePickerResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiFilePickerResponse);
        }
    }

    private final JSONArray buildResult(String str) {
        JSONArray jSONArray = new JSONArray();
        if (str != null) {
            int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null) + 1;
            if (str != null) {
                String substring = str.substring(lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                StringBuilder sb = new StringBuilder();
                AbstractC67709b.AbstractC67710a apiDependency = getApiDependency();
                Intrinsics.checkExpressionValueIsNotNull(apiDependency, "apiDependency");
                sb.append(apiDependency.mo235047d());
                sb.append('/');
                sb.append(System.currentTimeMillis());
                sb.append('_');
                sb.append(substring);
                String sb2 = sb.toString();
                File file = new File(sb2);
                C67586c.m263045a(new File(str), file, false);
                String d = getApiDependency().mo235048d(sb2);
                Intrinsics.checkExpressionValueIsNotNull(d, "apiDependency.getSchemaFilePath(tempFilePath)");
                jSONArray.add(buildFileJSONObject(d, substring, file.length()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return jSONArray;
    }

    private final List<Uri> getUriListFromIntent(Intent intent) {
        Uri uri;
        if (intent != null) {
            ClipData clipData = intent.getClipData();
            if (clipData == null) {
                ILogger aVar = this.logger;
                if (aVar != null) {
                    aVar.mo92224i(TAG, "clipData of Intent is null");
                }
                return CollectionsKt.emptyList();
            } else if (clipData.getItemCount() < 1) {
                ILogger aVar2 = this.logger;
                if (aVar2 != null) {
                    aVar2.mo92224i(TAG, "clipData of Intent is empty");
                }
                return CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(clipData.getItemCount());
                int itemCount = clipData.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    ClipData.Item itemAt = clipData.getItemAt(i);
                    if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                        arrayList.add(uri);
                    }
                }
                return arrayList;
            }
        } else {
            ILogger aVar3 = this.logger;
            if (aVar3 != null) {
                aVar3.mo92224i(TAG, "data is null");
            }
            return CollectionsKt.emptyList();
        }
    }

    private final JSONArray standardGetPath(Context context, Uri uri) {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92224i(TAG, "standard standardGetPath>>>");
        }
        Object json = JSON.toJSON(getPathList(context, uri));
        if (json != null) {
            return (JSONArray) json;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
    }

    private final List<FileItemResponse> getPathList(Context context, Uri uri) {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92224i(TAG, "standardGetPathList>>>");
        }
        ArrayList arrayList = new ArrayList();
        FileItemResponse pathItem = getPathItem(context, uri);
        if (pathItem != null) {
            arrayList.add(pathItem);
        }
        ILogger aVar2 = this.logger;
        if (aVar2 != null) {
            String str = TAG;
            aVar2.mo92224i(str, "standardGetPathList>>> result:" + arrayList);
        }
        return arrayList;
    }

    private final List<FileItemResponse> getPathList(Context context, List<? extends Uri> list) {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92224i(TAG, "getPathList from uriList>>>");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            FileItemResponse pathItem = getPathItem(context, it.next());
            if (pathItem != null) {
                arrayList.add(pathItem);
            }
        }
        List<FileItemResponse> list2 = CollectionsKt.toList(arrayList);
        ILogger aVar2 = this.logger;
        if (aVar2 != null) {
            String str = TAG;
            aVar2.mo92224i(str, "getPathList from uriList result>>> " + list2);
        }
        return list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        if (r7 != null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
        if (r7 != null) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.alibaba.fastjson.JSONArray uriToFileApiQ(android.content.Context r17, android.net.Uri r18) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin.uriToFileApiQ(android.content.Context, android.net.Uri):com.alibaba.fastjson.JSONArray");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
        if (r2 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (r2 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x029c, code lost:
        if (r2 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b6, code lost:
        if (r2 != null) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.alibaba.fastjson.JSONArray getPath(android.content.Context r20, android.net.Uri r21) {
        /*
        // Method dump skipped, instructions count: 740
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin.getPath(android.content.Context, android.net.Uri):com.alibaba.fastjson.JSONArray");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f1, code lost:
        if (r12 != null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019f, code lost:
        kotlin.io.C69101b.m265907a(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a4, code lost:
        if (r12 != null) goto L_0x01a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin.FileItemResponse getPathItem(android.content.Context r22, android.net.Uri r23) {
        /*
        // Method dump skipped, instructions count: 539
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin.getPathItem(android.content.Context, android.net.Uri):com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin$FileItemResponse");
    }

    private final JSONObject buildFileJSONObject(String str, String str2, long j) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "path", (Object) str);
        jSONObject2.put((Object) "name", (Object) str2);
        jSONObject2.put((Object) "size", (Object) Long.valueOf(j));
        return jSONObject;
    }

    @LKPluginFunction(async = true, eventName = {"filePicker"})
    public final void filePickerAsync(LKEvent lKEvent, ApiFilePickerRequest apiFilePickerRequest, AbstractC25897h<ApiFilePickerResponse> hVar) {
        ILogger aVar;
        int i;
        String str;
        String str2;
        boolean z;
        String pickerConfirm;
        Integer maxNum;
        AbstractC25895f c;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) new ApiFilePickerResponse();
        this.invokeCallback = hVar;
        if (lKEvent == null || (c = lKEvent.mo92134c()) == null) {
            aVar = null;
        } else {
            aVar = c.mo92190b();
        }
        this.logger = aVar;
        this.lkEvent = lKEvent;
        if (aVar != null) {
            String str3 = TAG;
            aVar.mo92224i(str3, "invoke api" + JSON.toJSONString(apiFilePickerRequest));
        }
        if (apiFilePickerRequest == null || (maxNum = apiFilePickerRequest.getMaxNum()) == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = maxNum.intValue();
        }
        if (apiFilePickerRequest == null || (str = apiFilePickerRequest.getPickerTitle()) == null) {
            IAppContext appContext = getAppContext();
            Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
            str = appContext.getApplicationContext().getString(R.string.LittleApp_GadgetAndriod_PickerTitle);
            Intrinsics.checkExpressionValueIsNotNull(str, "appContext.applicationCo…adgetAndriod_PickerTitle)");
        }
        if (apiFilePickerRequest == null || (pickerConfirm = apiFilePickerRequest.getPickerConfirm()) == null) {
            IAppContext appContext2 = getAppContext();
            Intrinsics.checkExpressionValueIsNotNull(appContext2, "appContext");
            String string = appContext2.getApplicationContext().getString(R.string.LittleApp_GadgetAndriod_PickerConfirm);
            Intrinsics.checkExpressionValueIsNotNull(string, "appContext.applicationCo…getAndriod_PickerConfirm)");
            str2 = string;
        } else {
            str2 = pickerConfirm;
        }
        if (apiFilePickerRequest != null) {
            z = apiFilePickerRequest.isSystem();
        } else {
            z = false;
        }
        this.isSystem = z;
        AbstractC67709b.AbstractC67710a apiDependency = getApiDependency();
        Intrinsics.checkExpressionValueIsNotNull(apiDependency, "apiDependency");
        Activity f = apiDependency.mo235051f();
        if (f == null) {
            ILogger aVar2 = this.logger;
            if (aVar2 != null) {
                aVar2.mo92224i(TAG, "curActivity is null");
            }
            fillFailedResponse(objectRef.element, C25906a.f64080j, "curActivity is null");
            if (hVar != null) {
                hVar.callback(objectRef.element);
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
        hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
        getApiDependency().mo235022a(f, "filePicker", hashSet, new C25056b(this, f, objectRef, hVar, i, str, str2));
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        String str;
        ILogger aVar = this.logger;
        if (aVar != null) {
            String str2 = TAG;
            aVar.mo92224i(str2, "handleActivityResult, reqCode" + i + ", resultCode" + i2);
        }
        ApiFilePickerResponse apiFilePickerResponse = new ApiFilePickerResponse();
        if (i != 30001) {
            return false;
        }
        if (i2 == 0) {
            fillFailedResponse(apiFilePickerResponse, C25906a.f64073c, "user cancel");
            AbstractC25897h<ApiFilePickerResponse> hVar = this.invokeCallback;
            if (hVar != null) {
                hVar.callback(apiFilePickerResponse);
            }
            return true;
        } else if (i2 != -1 || intent == null) {
            fillFailedResponse(apiFilePickerResponse, C25906a.f64080j, "data = null, resultCode:" + i2);
            AbstractC25897h<ApiFilePickerResponse> hVar2 = this.invokeCallback;
            if (hVar2 != null) {
                hVar2.callback(apiFilePickerResponse);
            }
            return true;
        } else {
            if (this.isSystem) {
                Uri data = intent.getData();
                IAppContext appContext = getAppContext();
                Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
                Context applicationContext = appContext.getApplicationContext();
                ILogger aVar2 = this.logger;
                if (aVar2 != null) {
                    String str3 = TAG;
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
                    aVar2.mo92224i(str3, objArr);
                }
                if (data == null || applicationContext == null) {
                    ILogger aVar3 = this.logger;
                    if (aVar3 != null) {
                        aVar3.mo92223e(TAG, "file picker uri is null");
                    }
                    fillFailedResponse(apiFilePickerResponse, C25906a.f64080j, "file picker uri is null");
                    AbstractC25897h<ApiFilePickerResponse> hVar3 = this.invokeCallback;
                    if (hVar3 != null) {
                        hVar3.callback(apiFilePickerResponse);
                    }
                } else {
                    JSONArray path = getPath(applicationContext, data);
                    ILogger aVar4 = this.logger;
                    if (aVar4 != null) {
                        String str4 = TAG;
                        String jSONArray = path.toString();
                        Intrinsics.checkExpressionValueIsNotNull(jSONArray, "response.toString()");
                        aVar4.mo92224i(str4, jSONArray);
                    }
                    makeMsg(path);
                }
            } else {
                ILogger aVar5 = this.logger;
                if (aVar5 != null) {
                    aVar5.mo92224i(TAG, String.valueOf(intent.getClipData()));
                }
                IAppContext appContext2 = getAppContext();
                Intrinsics.checkExpressionValueIsNotNull(appContext2, "appContext");
                Context applicationContext2 = appContext2.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext2, "appContext.applicationContext");
                Object json = JSON.toJSON(getPathList(applicationContext2, getUriListFromIntent(intent)));
                if (json != null) {
                    makeMsg((JSONArray) json);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getDataColumn(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
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
            if (r1 == 0) goto L_0x004d
        L_0x002f:
            r1.close()
            goto L_0x004d
        L_0x0033:
            r10 = move-exception
            goto L_0x004e
        L_0x0035:
            r10 = move-exception
            com.ss.android.lark.optrace.api.a r11 = r9.logger     // Catch:{ all -> 0x0033 }
            if (r11 == 0) goto L_0x004a
            java.lang.String r12 = com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin.TAG     // Catch:{ all -> 0x0033 }
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0033 }
            r2 = 0
            java.lang.String r3 = "getDataColumn fail"
            r13[r2] = r3     // Catch:{ all -> 0x0033 }
            r2 = 1
            r13[r2] = r10     // Catch:{ all -> 0x0033 }
            r11.mo92223e(r12, r13)     // Catch:{ all -> 0x0033 }
        L_0x004a:
            if (r1 == 0) goto L_0x004d
            goto L_0x002f
        L_0x004d:
            return r0
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()
        L_0x0053:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.ApiFilePickerPlugin.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
