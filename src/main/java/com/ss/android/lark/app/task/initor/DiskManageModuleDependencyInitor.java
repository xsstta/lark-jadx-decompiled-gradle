package com.ss.android.lark.app.task.initor;

import android.app.Activity;
import android.util.Pair;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.security.v1.FileSecurityDecryptRequest;
import com.bytedance.lark.pb.security.v1.FileSecurityDecryptResponse;
import com.bytedance.lark.pb.security.v1.FileSecurityEncryptRequest;
import com.bytedance.lark.pb.security.v1.FileSecurityEncryptResponse;
import com.bytedance.lark.pb.security.v1.FileSecurityQueryStatusRequest;
import com.bytedance.lark.pb.security.v1.FileSecurityQueryStatusResponse;
import com.bytedance.lark.pb.security.v1.FileSecurityWriteBackRequest;
import com.bytedance.lark.pb.security.v1.FileSecurityWriteBackResponse;
import com.bytedance.lark.pb.security.v1.SecuritySdkSetupRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.monitor.C36830d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.C57744a;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

public class DiskManageModuleDependencyInitor {
    /* renamed from: a */
    public static void m106375a() {
        C36808a.m145202a(new C36808a.AbstractC36812c() {
            /* class com.ss.android.lark.app.task.initor.DiskManageModuleDependencyInitor.C289901 */

            /* access modifiers changed from: private */
            /* renamed from: e */
            public static /* synthetic */ Object m106381e(byte[] bArr) throws IOException {
                return "";
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36812c
            /* renamed from: c */
            public C36808a.AbstractC36811b mo102808c() {
                return new C36808a.AbstractC36811b() {
                    /* class com.ss.android.lark.app.task.initor.DiskManageModuleDependencyInitor.C289901.C289922 */

                    @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36811b
                    /* renamed from: b */
                    public void mo102813b(String str, float f) {
                        C57744a.m224104a().putFloat(str, f);
                    }

                    @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36811b
                    /* renamed from: a */
                    public float mo102809a(String str, float f) {
                        return C57744a.m224104a().getFloat(str, f);
                    }

                    @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36811b
                    /* renamed from: b */
                    public void mo102814b(String str, long j) {
                        C57744a.m224104a().putLong(str, j);
                    }

                    @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36811b
                    /* renamed from: a */
                    public long mo102810a(String str, long j) {
                        return C57744a.m224104a().getLong(str, j);
                    }

                    @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36811b
                    /* renamed from: b */
                    public void mo102815b(String str, boolean z) {
                        C57744a.m224104a().putBoolean(str, z);
                    }

                    @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36811b
                    /* renamed from: a */
                    public String mo102811a(String str, String str2) {
                        return C57744a.m224104a().getString(str, str2);
                    }

                    @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36811b
                    /* renamed from: a */
                    public boolean mo102812a(String str, boolean z) {
                        return C57744a.m224104a().getBoolean(str, z);
                    }
                };
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36812c
            /* renamed from: a */
            public Activity mo102802a() {
                return AppLifecycle.m200904a().mo177978h();
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36812c
            /* renamed from: b */
            public int mo102806b() {
                SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.SECURITY_FILE_QUERY_STATUS, new FileSecurityQueryStatusRequest.C19121a(), $$Lambda$DiskManageModuleDependencyInitor$1$YpoUx11vqITZ4d259gaJImuiUU.INSTANCE);
                if (syncSendMayError.f131573b != null) {
                    Log.m165383e("DiskManageModuleDependencyInitor", "getCipherStatus failed: " + syncSendMayError.f131573b.toString());
                }
                Log.m165389i("DiskManageModuleDependencyInitor", "getCipherStatus, sdk result: " + ((Object) syncSendMayError.f131572a));
                return syncSendMayError.f131572a.intValue();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ Integer m106377a(byte[] bArr) throws IOException {
                return FileSecurityQueryStatusResponse.ADAPTER.decode(bArr).mode;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static /* synthetic */ Integer m106380d(byte[] bArr) throws IOException {
                return FileSecurityEncryptResponse.ADAPTER.decode(bArr).error;
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ Pair m106378b(byte[] bArr) throws IOException {
                FileSecurityWriteBackResponse decode = FileSecurityWriteBackResponse.ADAPTER.decode(bArr);
                return new Pair(decode.error, decode.encrypted_path);
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static /* synthetic */ Pair m106379c(byte[] bArr) throws IOException {
                FileSecurityDecryptResponse decode = FileSecurityDecryptResponse.ADAPTER.decode(bArr);
                Log.m165379d("DiskManageModuleDependencyInitor", "decyptFile decrypted_file_path = " + decode.decrypted_file_path);
                return new Pair(decode.error, decode.decrypted_file_path);
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36812c
            /* renamed from: a */
            public int mo102801a(File file) {
                FileSecurityEncryptRequest.C19117a aVar = new FileSecurityEncryptRequest.C19117a();
                aVar.mo65373a(file.getPath());
                SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.SECURITY_FILE_ENCRYPT, aVar, $$Lambda$DiskManageModuleDependencyInitor$1$qweRcDdmMQUQ1nqmUVWN9TKFuCU.INSTANCE);
                if (syncSendMayError.f131573b != null) {
                    Log.m165383e("DiskManageModuleDependencyInitor", "encyptFile file = " + file + ", failed: " + syncSendMayError.f131573b.toString());
                }
                int intValue = syncSendMayError.f131572a.intValue();
                Log.m165389i("DiskManageModuleDependencyInitor", "encyptFileByRust, sdk result: " + ((Object) syncSendMayError.f131572a));
                if (intValue == 0) {
                    return 0;
                }
                Log.m165383e("DiskManageModuleDependencyInitor", "encyptFile error = " + intValue);
                return intValue;
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36812c
            /* renamed from: a */
            public Pair<Integer, String> mo102803a(String str) {
                FileSecurityWriteBackRequest.C19125a aVar = new FileSecurityWriteBackRequest.C19125a();
                aVar.mo65390a(str);
                SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.SECURITY_FILE_WRITE_BACK, aVar, $$Lambda$DiskManageModuleDependencyInitor$1$wS94zFknYkh1T4JkF8V6m5ok9c8.INSTANCE);
                if (syncSendMayError.f131573b != null) {
                    Log.m165383e("DiskManageModuleDependencyInitor", "getEncryptedFile decrypted_path = " + str + ", failed: " + syncSendMayError.f131573b.toString());
                }
                int intValue = ((Integer) ((Pair) syncSendMayError.f131572a).first).intValue();
                if (intValue != 0) {
                    Log.m165383e("DiskManageModuleDependencyInitor", "getEncryptedFile error = " + intValue);
                }
                Log.m165389i("DiskManageModuleDependencyInitor", "getEncryptedFile, sdk result: " + ((Object) syncSendMayError.f131572a));
                return syncSendMayError.f131572a;
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36812c
            /* renamed from: b */
            public Pair<Integer, String> mo102807b(File file) {
                FileSecurityDecryptRequest.C19113a aVar = new FileSecurityDecryptRequest.C19113a();
                aVar.mo65364a(file.getPath());
                SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.SECURITY_FILE_DECRYPT, aVar, $$Lambda$DiskManageModuleDependencyInitor$1$i5ZZ9OGg5KV6oxlcTA0sGuvJ7HI.INSTANCE);
                if (syncSendMayError.f131573b != null) {
                    Log.m165383e("DiskManageModuleDependencyInitor", "decyptFile file = " + file + ", failed: " + syncSendMayError.f131573b.toString());
                }
                int intValue = ((Integer) ((Pair) syncSendMayError.f131572a).first).intValue();
                if (intValue != 0) {
                    Log.m165383e("DiskManageModuleDependencyInitor", "decyptFile error = " + intValue);
                }
                Log.m165389i("DiskManageModuleDependencyInitor", "decyptFileByRust, sdk result: " + ((Object) syncSendMayError.f131572a));
                return syncSendMayError.f131572a;
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36812c
            /* renamed from: a */
            public void mo102805a(JSONObject jSONObject) {
                try {
                    Log.m165389i("DiskManageModuleDependencyInitor", "reportCipherError json = " + jSONObject);
                    Statistics.sendEvent("disk_file_cipher_error", jSONObject);
                } catch (Exception e) {
                    Log.m165383e("DiskManageModuleDependencyInitor", e.getMessage());
                }
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36812c
            /* renamed from: a */
            public void mo102804a(String str, long j, String str2, final C36808a.AbstractC36813d dVar) {
                SecuritySdkSetupRequest.C19129a aVar = new SecuritySdkSetupRequest.C19129a();
                aVar.mo65400a("");
                aVar.mo65402b(str);
                aVar.mo65399a(Long.valueOf(j));
                aVar.mo65403c(str2);
                SdkSender.asynSendRequestNonWrap(Command.SECURITY_MODE_SETUP, aVar, new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.app.task.initor.DiskManageModuleDependencyInitor.C289901.C289911 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                        Log.m165389i("DiskManageModuleDependencyInitor", "initCipher success");
                        C36808a.AbstractC36813d dVar = dVar;
                        if (dVar != null) {
                            dVar.mo48840a();
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("DiskManageModuleDependencyInitor", "initCipher failed: " + errorResult);
                        C36808a.AbstractC36813d dVar = dVar;
                        if (dVar != null && errorResult != null) {
                            dVar.mo48841a(errorResult.toString());
                        }
                    }
                }, $$Lambda$DiskManageModuleDependencyInitor$1$n0eqZyGXoHe9KNBmYUwVPufAEk.INSTANCE);
            }
        });
        C36830d.m145307a($$Lambda$DiskManageModuleDependencyInitor$kuA3tHfxMg9DpyYUE8emPjCihAY.INSTANCE);
    }
}
