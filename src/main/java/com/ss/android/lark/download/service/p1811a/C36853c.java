package com.ss.android.lark.download.service.p1811a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.media.v1.DownloadFileRequest;
import com.bytedance.lark.pb.media.v1.DownloadFileResponse;
import com.bytedance.lark.pb.media.v1.DownloadFileScene;
import com.bytedance.lark.pb.media.v1.GetFileMetaRequest;
import com.bytedance.lark.pb.media.v1.GetFileMetaResponse;
import com.bytedance.lark.pb.media.v1.GetFileStateRequest;
import com.bytedance.lark.pb.media.v1.GetFileStateResponse;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29575r;
import com.ss.android.lark.biz.core.api.FileState;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.EncryptException;
import com.ss.android.lark.download.C36840a;
import com.ss.android.lark.download.service.DownloadFileMeta;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.lark.download.service.a.c */
public class C36853c implements AbstractC29575r {

    /* renamed from: a */
    private C36847b f94713a = C36847b.m145432a();

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105834a(String str, String str2, String str3, int i) {
        m145438a(new DownloadFileRequest.C18208a().mo63118a(DownloadFileRequest.Action.CANCEL).mo63121a(str).mo63125d(str3).mo63117a(Message.SourceType.fromValue(i)).mo63124c(str2).mo63116a(File.EntityType.MESSAGE), (IGetDataCallback<Boolean>) null);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105835a(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback) {
        m145438a(new DownloadFileRequest.C18208a().mo63118a(DownloadFileRequest.Action.CANCEL).mo63121a(str).mo63125d(str3).mo63117a(Message.SourceType.fromValue(i)).mo63124c(str2).mo63116a(File.EntityType.MESSAGE), iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105832a(String str, String str2, int i, IGetDataCallback<FileState> iGetDataCallback) {
        mo105831a(str, str2, i, -99, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105831a(String str, String str2, int i, int i2, IGetDataCallback<FileState> iGetDataCallback) {
        GetFileStateRequest.C18238a a = new GetFileStateRequest.C18238a().mo63204a(str);
        if (!TextUtils.isEmpty(str2)) {
            a.mo63206b(str2);
        }
        Message.SourceType fromValue = Message.SourceType.fromValue(i);
        if (fromValue != null) {
            a.mo63202a(fromValue);
        }
        if (i2 != -99) {
            a.mo63203a(DownloadFileScene.fromValue(i2));
        }
        Log.m165389i("DownloadFile", "downloadFileScene:" + i2);
        SdkSender.asynSendRequestNonWrap(Command.GET_FILE_STATE, a, iGetDataCallback, new SdkSender.IParser<FileState>() {
            /* class com.ss.android.lark.download.service.p1811a.C36853c.C368607 */

            /* renamed from: a */
            public FileState parse(byte[] bArr) throws IOException {
                return FileState.forNumber(GetFileStateResponse.ADAPTER.decode(bArr).state.getValue());
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105830a(String str, String str2) {
        m145438a(new DownloadFileRequest.C18208a().mo63118a(DownloadFileRequest.Action.CANCEL).mo63121a(str).mo63124c(str2).mo63116a(File.EntityType.MESSAGE), (IGetDataCallback<Boolean>) null);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105833a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        m145438a(new DownloadFileRequest.C18208a().mo63118a(DownloadFileRequest.Action.CANCEL).mo63121a(str).mo63124c(str2).mo63116a(File.EntityType.MESSAGE), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo136010a(String str, String str2, String str3, int i, int i2, String str4, String str5, IGetDataCallback<AbstractC29575r.C29577b> iGetDataCallback, AbstractC25974h hVar) {
        DownloadFileRequest.C18208a a = new DownloadFileRequest.C18208a().mo63118a(DownloadFileRequest.Action.DOWNLOAD).mo63121a(str).mo63125d(str2).mo63123b(str4).mo63126e(str3).mo63120a(Boolean.valueOf(str4 == null)).mo63124c(str5).mo63116a(File.EntityType.MESSAGE);
        Message.SourceType fromValue = Message.SourceType.fromValue(i);
        if (fromValue != null) {
            a.mo63117a(fromValue);
        }
        a.mo63117a(fromValue);
        String b = m145441b(str, str5, str2, i);
        Log.m165389i("DownloadFile", "downloadMessageFile:" + b);
        if (i2 != -99) {
            a.mo63119a(DownloadFileScene.fromValue(i2));
        }
        Log.m165389i("DownloadFile", "downloadFileScene:" + i2);
        m145439a(b, str4, hVar, a, iGetDataCallback);
    }

    /* renamed from: d */
    private DownloadFileMeta m145444d(String str) {
        return (DownloadFileMeta) SdkSender.sendRequest(Command.GET_FILE_META, new GetFileMetaRequest.C18234a().mo63193a(str), new SdkSender.IParser<DownloadFileMeta>() {
            /* class com.ss.android.lark.download.service.p1811a.C36853c.C368618 */

            /* renamed from: a */
            public DownloadFileMeta parse(byte[] bArr) throws IOException {
                String str;
                int i;
                GetFileMetaResponse decode = GetFileMetaResponse.ADAPTER.decode(bArr);
                DownloadFileMeta downloadFileMeta = new DownloadFileMeta();
                if (decode != null) {
                    str = decode.file_path;
                } else {
                    str = "";
                }
                downloadFileMeta.setFilePath(str);
                if (decode != null) {
                    i = decode.progress.intValue();
                } else {
                    i = 0;
                }
                downloadFileMeta.setProgress(i);
                return downloadFileMeta;
            }
        });
    }

    /* renamed from: c */
    public static void m145443c(String str) {
        if (!new java.io.File(str).exists()) {
            Log.m165383e("DownloadFile", "file not exists");
        }
        try {
            C36808a.m145203a(new java.io.File(str));
            Log.m165389i("DownloadFile", "[cipher] file encrypt success, path = " + str);
        } catch (EncryptException unused) {
            Log.m165383e("DownloadFile", "[cipher] file encrypt failed, path = " + str);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: b */
    public String mo105836b(String str) {
        return (String) SdkSender.sendRequest(Command.GET_FILE_META, new GetFileMetaRequest.C18234a().mo63193a(str), new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.download.service.p1811a.C36853c.C368629 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetFileMetaResponse.ADAPTER.decode(bArr).file_path;
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public int mo105826a(String str) {
        DownloadFileMeta d = m145444d(str);
        if (d == null || TextUtils.isEmpty(d.getFilePath())) {
            return 0;
        }
        return d.getProgress();
    }

    /* renamed from: a */
    private static void m145438a(DownloadFileRequest.C18208a aVar, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DOWNLOAD_FILE, aVar, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.download.service.p1811a.C36853c.C368541 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    /* renamed from: a */
    public static final void m145437a(Context context, String str) {
        Log.m165389i("DownloadFile", "notifySystemScanFile, filePath = " + str);
        C26311p.m95268a(context, str);
        C26311p.m95269a(context, str, (C26311p.AbstractC26313a) null);
    }

    /* renamed from: b */
    private boolean m145442b(Context context, String str) {
        boolean z = true;
        if (!TextUtils.isEmpty(str) && !(z = C36840a.m145413c().mo135985a(str, true))) {
            C36840a.m145413c().mo135984a(context, R.string.Lark_Legacy_DownloadVideo, null);
        }
        return z;
    }

    /* renamed from: b */
    private static String m145441b(String str, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        if (i != 0) {
            sb.append(i);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m145439a(final String str, String str2, final AbstractC25974h hVar, DownloadFileRequest.C18208a aVar, final IGetDataCallback<AbstractC29575r.C29577b> iGetDataCallback) {
        final Map<String, AbstractC29575r.C29576a<AbstractC29575r.C29577b>> b = this.f94713a.mo136008b();
        Log.m165378d("messageId2CallbackItemMap length = " + b.size());
        SdkSender.asynSendRequestNonWrap(Command.DOWNLOAD_FILE, aVar, new IGetDataCallback<AbstractC29575r.C29577b>() {
            /* class com.ss.android.lark.download.service.p1811a.C36853c.C368552 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(AbstractC29575r.C29577b bVar) {
                if (bVar.f74013a != null) {
                    b.put(str, new AbstractC29575r.C29576a(hVar, iGetDataCallback, bVar.f74013a));
                } else {
                    Log.m165383e("DownloadFile", "download file return file path is null");
                }
            }
        }, new SdkSender.IParser<AbstractC29575r.C29577b>() {
            /* class com.ss.android.lark.download.service.p1811a.C36853c.C368563 */

            /* renamed from: a */
            public AbstractC29575r.C29577b parse(byte[] bArr) throws IOException {
                String str;
                DownloadFileResponse decode = DownloadFileResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    str = "";
                } else {
                    str = decode.path;
                }
                return new AbstractC29575r.C29577b(str);
            }
        });
    }

    /* renamed from: a */
    private void m145440a(String str, String str2, String str3, IGetDataCallback<AbstractC29575r.C29577b> iGetDataCallback, AbstractC25974h hVar) {
        DownloadFileRequest.C18208a a = new DownloadFileRequest.C18208a().mo63118a(DownloadFileRequest.Action.DOWNLOAD).mo63121a(str).mo63123b(str2).mo63124c(str3).mo63116a(File.EntityType.EMAIL);
        m145439a(str + str3, str2, hVar, a, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105829a(final Context context, String str, String str2, String str3, final IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        m145440a(str, str3, str2, new IGetDataCallback<AbstractC29575r.C29577b>() {
            /* class com.ss.android.lark.download.service.p1811a.C36853c.C368596 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(AbstractC29575r.C29577b bVar) {
                String str = bVar.f74013a;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(str);
                }
                C36853c.m145437a(context, str);
            }
        }, hVar);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: b */
    public void mo105838b(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        mo105837b(context, str, str2, str3, i, -99, str4, str5, iGetDataCallback, hVar);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105828a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        mo105827a(context, str, str2, str3, i, -99, str4, str5, iGetDataCallback, hVar);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: b */
    public void mo105837b(final Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, final IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        if (m145442b(context, str4)) {
            mo136010a(str, str2, str3, i, i2, str5, str4, new IGetDataCallback<AbstractC29575r.C29577b>() {
                /* class com.ss.android.lark.download.service.p1811a.C36853c.C368585 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(AbstractC29575r.C29577b bVar) {
                    String str = bVar.f74013a;
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(str);
                    }
                    C36853c.m145437a(context, str);
                }
            }, hVar);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("no authorization"));
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29575r
    /* renamed from: a */
    public void mo105827a(final Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, final IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        mo136010a(str, str2, str3, i, i2, str5, str4, new IGetDataCallback<AbstractC29575r.C29577b>() {
            /* class com.ss.android.lark.download.service.p1811a.C36853c.C368574 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(AbstractC29575r.C29577b bVar) {
                String str = bVar.f74013a;
                C36853c.m145443c(str);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(str);
                }
                C36853c.m145437a(context, str);
            }
        }, hVar);
    }
}
