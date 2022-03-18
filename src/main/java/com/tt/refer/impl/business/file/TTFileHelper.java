package com.tt.refer.impl.business.file;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12743a;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.config.mina.v2.ConfigModel;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1176b.C25910e;
import com.larksuite.framework.apiplugin.p1179e.C25938a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileHelper;", "", "()V", "Companion", "TTFileCryptoConfigHandler", "TTFileCryptoConfigModel", "TTFileSettingsHandler", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TTFileHelper {

    /* renamed from: a */
    public static final Companion f171065a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final TTFileCryptoConfigModel m264257a() {
        return f171065a.mo235591a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m264258a(C25921b bVar, TTFileException tTFileException, ILogger aVar) {
        f171065a.mo235592a(bVar, tTFileException, aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m264259a(String str, IAppContext iAppContext) {
        return f171065a.mo235593a(str, iAppContext);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001e\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileHelper$TTFileCryptoConfigModel;", "Lcom/bytedance/ee/lark/infra/config/mina/v2/ConfigModel;", "()V", "isCryptoToastDisable", "", "()Z", "setCryptoToastDisable", "(Z)V", "isDecryptDisable", "setDecryptDisable", "isEnableFileLog", "setEnableFileLog", "isEncryptDisable", "setEncryptDisable", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class TTFileCryptoConfigModel extends ConfigModel {
        @JSONField(name = "crypto_toast_disable")
        private boolean isCryptoToastDisable = true;
        @JSONField(name = "decrypt_disable")
        private boolean isDecryptDisable = true;
        @JSONField(name = "enable_file_log")
        private boolean isEnableFileLog = true;
        @JSONField(name = "encrypt_disable")
        private boolean isEncryptDisable = true;

        public final boolean isCryptoToastDisable() {
            return this.isCryptoToastDisable;
        }

        public final boolean isDecryptDisable() {
            return this.isDecryptDisable;
        }

        public final boolean isEnableFileLog() {
            return this.isEnableFileLog;
        }

        public final boolean isEncryptDisable() {
            return this.isEncryptDisable;
        }

        public final void setCryptoToastDisable(boolean z) {
            this.isCryptoToastDisable = z;
        }

        public final void setDecryptDisable(boolean z) {
            this.isDecryptDisable = z;
        }

        public final void setEnableFileLog(boolean z) {
            this.isEnableFileLog = z;
        }

        public final void setEncryptDisable(boolean z) {
            this.isEncryptDisable = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileHelper$Companion;", "", "()V", "FG_KEY", "", "TAG", "fillResponse", "", "response", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "e", "Lcom/tt/refer/impl/business/file/TTFileException;", "logger", "Lcom/ss/android/lark/optrace/api/ILogger;", "getCryptoConfig", "Lcom/tt/refer/impl/business/file/TTFileHelper$TTFileCryptoConfigModel;", "isEnableStandardFeature", "", "feature", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.TTFileHelper$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final TTFileCryptoConfigModel mo235591a() {
            TTFileCryptoConfigModel tTFileCryptoConfigModel = (TTFileCryptoConfigModel) TTFileCryptoConfigHandler.f171066a.mo48247a();
            if (tTFileCryptoConfigModel != null) {
                return tTFileCryptoConfigModel;
            }
            AppBrandLogger.m52830i("TTFileHelper", "getConfigModel return null");
            return new TTFileCryptoConfigModel();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo235593a(String str, IAppContext iAppContext) {
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(str, "feature");
            boolean z = true;
            if (iAppContext == null) {
                AppBrandLogger.m52830i("TTFileHelper", "appContext is null");
                return false;
            }
            AbstractC67724a aVar = (AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class);
            if (aVar == null || !aVar.mo50456b("ecosystem.sandbox.standardize.enable")) {
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("hostService null: ");
                if (aVar != null) {
                    z = false;
                }
                sb.append(z);
                sb.append(' ');
                sb.append("or fg closed: ");
                if (aVar != null) {
                    bool = Boolean.valueOf(aVar.mo50456b("ecosystem.sandbox.standardize.enable"));
                } else {
                    bool = null;
                }
                sb.append(bool);
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("TTFileHelper", objArr);
                return false;
            } else if (TTFileSettingsHandler.f171067a.mo235594a()) {
                return true;
            } else {
                return TTFileSettingsHandler.f171067a.mo235595b().contains(str);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo235592a(C25921b bVar, TTFileException tTFileException, ILogger aVar) {
            TTFile b;
            Intrinsics.checkParameterIsNotNull(bVar, "response");
            Intrinsics.checkParameterIsNotNull(tTFileException, "e");
            Intrinsics.checkParameterIsNotNull(aVar, "logger");
            aVar.mo92224i("TTFileHelper", "ttfile exception, ttfile:" + tTFileException.getTtFile(), tTFileException);
            TTFileError ttFileError = tTFileException.getTtFileError();
            if (ttFileError == TTBizError.f171093b) {
                aVar.mo92224i("TTFileHelper", "path is empty, path:" + tTFileException.getTtFile());
                C25938a.m93910a(bVar, C25906a.f64072b, "file is empty, path:" + tTFileException.getTtFile());
            } else if (ttFileError == TTParamError.f171125b) {
                aVar.mo92224i("TTFileHelper", "postion invalid, path:" + tTFileException.getTtFile());
                C25938a.m93910a(bVar, C25906a.f64072b, "position invalid, path:" + tTFileException.getTtFile());
            } else if (ttFileError == TTParamError.f171124a) {
                aVar.mo92224i("TTFileHelper", "length invalid, path:" + tTFileException.getTtFile());
                C25938a.m93910a(bVar, C25906a.f64072b, "length invalid, path:" + tTFileException.getTtFile());
            } else if (ttFileError == TTFileError.f171118t) {
                aVar.mo92224i("TTFileHelper", "length over threshold, path:" + tTFileException.getTtFile());
                C25938a.m93910a(bVar, C25910e.f64134l, "length over threshold, path:" + tTFileException.getTtFile());
            } else {
                String str = null;
                if (ttFileError == TTFileError.f171108j) {
                    aVar.mo92224i("TTFileHelper", "file cannot read:" + tTFileException.getTtFile());
                    C25910e eVar = C25910e.f64125c;
                    Object[] objArr = new Object[1];
                    TTFile ttFile = tTFileException.getTtFile();
                    if (ttFile != null) {
                        str = ttFile.mo235647a();
                    }
                    objArr[0] = str;
                    C25908c a = C25910e.m93820a(eVar, objArr);
                    C25938a.m93910a(bVar, a, "cannot read, file:" + tTFileException.getTtFile());
                } else if (ttFileError == TTFileError.f171109k) {
                    aVar.mo92224i("TTFileHelper", "file cannot write:" + tTFileException.getTtFile());
                    C25910e eVar2 = C25910e.f64126d;
                    Object[] objArr2 = new Object[1];
                    TTFile ttFile2 = tTFileException.getTtFile();
                    if (ttFile2 != null) {
                        str = ttFile2.mo235647a();
                    }
                    objArr2[0] = str;
                    C25908c a2 = C25910e.m93820a(eVar2, objArr2);
                    C25938a.m93910a(bVar, a2, "cannot write, file:" + tTFileException.getTtFile());
                } else if (ttFileError == TTFileError.f171110l) {
                    aVar.mo92224i("TTFileHelper", "src not exists:" + tTFileException.getTtFile());
                    C25910e eVar3 = C25910e.f64127e;
                    Object[] objArr3 = new Object[1];
                    TTFile ttFile3 = tTFileException.getTtFile();
                    if (ttFile3 != null) {
                        str = ttFile3.mo235647a();
                    }
                    objArr3[0] = str;
                    C25908c a3 = C25910e.m93820a(eVar3, objArr3);
                    C25938a.m93910a(bVar, a3, "parent not exists, dest:" + tTFileException.getTtFile());
                } else if (ttFileError == TTFileError.f171111m) {
                    aVar.mo92224i("TTFileHelper", "file exists:" + tTFileException.getTtFile());
                    C25910e eVar4 = C25910e.f64128f;
                    Object[] objArr4 = new Object[1];
                    TTFile ttFile4 = tTFileException.getTtFile();
                    if (ttFile4 != null) {
                        str = ttFile4.mo235647a();
                    }
                    objArr4[0] = str;
                    C25908c a4 = C25910e.m93820a(eVar4, objArr4);
                    C25938a.m93910a(bVar, a4, "file already exists, file:" + tTFileException.getTtFile());
                } else if (ttFileError == TTFileError.f171112n) {
                    aVar.mo92224i("TTFileHelper", "destFile parent not exists:" + tTFileException.getTtFile());
                    C25910e eVar5 = C25910e.f64127e;
                    Object[] objArr5 = new Object[1];
                    TTFile ttFile5 = tTFileException.getTtFile();
                    if (!(ttFile5 == null || (b = ttFile5.mo235648b()) == null)) {
                        str = b.mo235647a();
                    }
                    objArr5[0] = str;
                    C25908c a5 = C25910e.m93820a(eVar5, objArr5);
                    C25938a.m93910a(bVar, a5, "parent not exists, dest:" + tTFileException.getTtFile());
                } else if (ttFileError == TTFileError.f171113o) {
                    aVar.mo92224i("TTFileHelper", "directory is not empty:" + tTFileException.getTtFile());
                    C25910e eVar6 = C25910e.f64129g;
                    Object[] objArr6 = new Object[1];
                    TTFile ttFile6 = tTFileException.getTtFile();
                    if (ttFile6 != null) {
                        str = ttFile6.mo235647a();
                    }
                    objArr6[0] = str;
                    C25908c a6 = C25910e.m93820a(eVar6, objArr6);
                    C25938a.m93910a(bVar, a6, "directory is not empty:" + tTFileException.getTtFile());
                } else if (ttFileError == TTFileError.f171114p) {
                    aVar.mo92224i("TTFileHelper", "file is not directory" + tTFileException.getTtFile());
                    C25910e eVar7 = C25910e.f64130h;
                    Object[] objArr7 = new Object[1];
                    TTFile ttFile7 = tTFileException.getTtFile();
                    if (ttFile7 != null) {
                        str = ttFile7.mo235647a();
                    }
                    objArr7[0] = str;
                    C25908c a7 = C25910e.m93820a(eVar7, objArr7);
                    C25938a.m93910a(bVar, a7, "file is not directory, file:" + tTFileException.getTtFile());
                } else if (ttFileError == TTFileError.f171115q) {
                    aVar.mo92224i("TTFileHelper", "not file:" + tTFileException.getTtFile());
                    C25910e eVar8 = C25910e.f64131i;
                    Object[] objArr8 = new Object[1];
                    TTFile ttFile8 = tTFileException.getTtFile();
                    if (ttFile8 != null) {
                        str = ttFile8.mo235647a();
                    }
                    objArr8[0] = str;
                    C25908c a8 = C25910e.m93820a(eVar8, objArr8);
                    C25938a.m93910a(bVar, a8, "not regular file, file:" + tTFileException.getTtFile());
                } else if (ttFileError == TTFileError.f171116r) {
                    aVar.mo92224i("TTFileHelper", "is subpath, src: dest:");
                    C25938a.m93910a(bVar, C25910e.f64133k, C25910e.f64133k.f64117J);
                } else if (ttFileError == TTFileError.f171117s) {
                    aVar.mo92224i("TTFileHelper", "user dir over limit");
                    C25938a.m93910a(bVar, C25910e.f64132j, C25910e.f64132j.f64117J);
                } else if (ttFileError == TTSystemError.f171128a) {
                    aVar.mo92223e("TTFileHelper", "io exception", tTFileException);
                    C25938a.m93910a(bVar, C25906a.f64080j, C25906a.f64080j.f64117J);
                } else if (ttFileError == TTSystemError.f171129b) {
                    aVar.mo92223e("TTFileHelper", "cannot delete", tTFileException);
                    C25938a.m93910a(bVar, C25906a.f64080j, C25906a.f64080j.f64117J);
                } else if (ttFileError == TTBizError.f171092a) {
                    aVar.mo92223e("TTFileHelper", "data is null", tTFileException);
                    C25938a.m93910a(bVar, C25906a.f64072b, "data is null");
                } else if (ttFileError == TTBizError.f171094c) {
                    aVar.mo92223e("TTFileHelper", "dir empty", tTFileException);
                    C25938a.m93910a(bVar, C25906a.f64080j, "dir is empty, path:" + tTFileException.getTtFile());
                } else if (ttFileError == TTBizError.f171095d) {
                    aVar.mo92223e("TTFileHelper", "logic error", tTFileException);
                    C25938a.m93910a(bVar, C25906a.f64080j, "logic error, path:" + tTFileException.getTtFile());
                } else if (ttFileError == TTBizError.f171096e) {
                    aVar.mo92223e("TTFileHelper", "zip exception", tTFileException);
                    C25938a.m93910a(bVar, C25906a.f64080j, "zip exception, path:" + tTFileException.getTtFile());
                } else {
                    aVar.mo92223e("TTFileHelper", "dir empty", tTFileException);
                    C25938a.m93910a(bVar, C25906a.f64080j, C25906a.f64080j.f64117J);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileHelper$TTFileCryptoConfigHandler;", "Lcom/bytedance/ee/lark/infra/config/mina/v2/AbsSettingGenericHandler;", "Lcom/tt/refer/impl/business/file/TTFileHelper$TTFileCryptoConfigModel;", "()V", "getSettingKey", "", "loadConfig", "key", "defValue", "saveSettingFromRemote", "", "jsonStr", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.TTFileHelper$b */
    public static final class TTFileCryptoConfigHandler extends AbstractC12743a<TTFileCryptoConfigModel> {

        /* renamed from: a */
        public static final TTFileCryptoConfigHandler f171066a = new TTFileCryptoConfigHandler();

        @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
        public String getSettingKey() {
            return "ttfile_crypto_config";
        }

        private TTFileCryptoConfigHandler() {
        }

        @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
        public void saveSettingFromRemote(String str) {
            Intrinsics.checkParameterIsNotNull(str, "jsonStr");
            AppBrandLogger.m52830i("TTFileHelper", "saveSettingFromRemote:" + str);
            C12782a.m52834a(getSettingKey(), str);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
        public String loadConfig(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            AppBrandLogger.m52830i("TTFileHelper", "loadConfig: key:" + str + ", defValue:" + str2);
            String b = C12782a.m52838b(str, str2);
            Intrinsics.checkExpressionValueIsNotNull(b, "AcrossProcessSPHelper.getString(key, defValue)");
            return b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileHelper$TTFileSettingsHandler;", "Lcom/bytedance/ee/lark/infra/config/mina/v2/AbsSettingHandler;", "()V", "getFeatureList", "", "", "getSettingKey", "isApplyAll", "", "loadConfig", "key", "defValue", "saveSettingFromRemote", "", "jsonStr", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.TTFileHelper$c */
    public static final class TTFileSettingsHandler extends AbstractC12744b {

        /* renamed from: a */
        public static final TTFileSettingsHandler f171067a = new TTFileSettingsHandler();

        @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
        public String getSettingKey() {
            return "ecosystem_sandbox_standard_config";
        }

        private TTFileSettingsHandler() {
        }

        /* renamed from: a */
        public final boolean mo235594a() {
            boolean z;
            boolean z2;
            Boolean bool;
            String settingFromLocal = getSettingFromLocal(getSettingKey(), "");
            String str = settingFromLocal;
            boolean z3 = true;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("settings is null or empty.");
                sb.append(" null:");
                if (settingFromLocal == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sb.append(z2);
                sb.append(", empty:");
                if (settingFromLocal != null) {
                    if (str.length() != 0) {
                        z3 = false;
                    }
                    bool = Boolean.valueOf(z3);
                } else {
                    bool = null;
                }
                sb.append(bool);
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("TTFileHelper", objArr);
                return false;
            }
            try {
                return new JSONObject(settingFromLocal).optBoolean("apply_all", false);
            } catch (Exception e) {
                AppBrandLogger.m52829e("TTFileHelper", "json exception", e);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x0093 A[Catch:{ Exception -> 0x00f1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1 A[Catch:{ Exception -> 0x00f1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9 A[Catch:{ Exception -> 0x00f1 }, LOOP:0: B:30:0x007e->B:45:0x00b9, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00bc A[EDGE_INSN: B:61:0x00bc->B:46:0x00bc ?: BREAK  , SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<java.lang.String> mo235595b() {
            /*
            // Method dump skipped, instructions count: 259
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.impl.business.file.TTFileHelper.TTFileSettingsHandler.mo235595b():java.util.List");
        }

        @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
        public void saveSettingFromRemote(String str) {
            Intrinsics.checkParameterIsNotNull(str, "jsonStr");
            AppBrandLogger.m52830i("TTFileHelper", "saveSettingFromRemote:" + str);
            C12782a.m52834a(getSettingKey(), str);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
        public String loadConfig(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            AppBrandLogger.m52830i("TTFileHelper", "loadConfig: key:" + str + ", defValue:" + str2);
            String b = C12782a.m52838b(str, str2);
            Intrinsics.checkExpressionValueIsNotNull(b, "AcrossProcessSPHelper.getString(key, defValue)");
            return b;
        }
    }
}
