package com.ss.android.lark.app.task.initor;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.ImageFormat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.photoeditor.LarkPhotoEditorModule;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.vc.api.IVCApi;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.FileState;
import java.io.File;
import java.util.HashMap;
import okio.ByteString;
import org.json.JSONObject;

public class PhotoPickerModuleDependencyInitor {
    /* renamed from: a */
    public static void m106412a(final Context context) {
        C58612c.m227291a(new C58612c.AbstractC58615c() {
            /* class com.ss.android.lark.app.task.initor.PhotoPickerModuleDependencyInitor.C289981 */

            /* renamed from: b */
            private final HashMap<C58612c.AbstractC58616d, AbstractC29579a> f72672b = new HashMap<>();

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: g */
            public boolean mo102864g() {
                return false;
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public Context mo102826a() {
                return context;
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102848a(String str, JSONObject jSONObject) {
                Statistics.sendEvent(str, jSONObject);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102847a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).saveImage2Stickers(str, str2, iGetDataCallback);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102842a(MessageIdentity messageIdentity, final IGetDataCallback<FileState> iGetDataCallback) {
                String messageId = messageIdentity.getMessageId();
                String sourceId = messageIdentity.getSourceId();
                Message.SourceType sourceType = messageIdentity.getSourceType() != null ? messageIdentity.getSourceType() : Message.SourceType.TYPE_FROM_MESSAGE;
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkFileState(messageId, sourceId, sourceType.getNumber(), m106413a(sourceType), new IGetDataCallback<com.ss.android.lark.biz.core.api.FileState>() {
                    /* class com.ss.android.lark.app.task.initor.PhotoPickerModuleDependencyInitor.C289981.C289991 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(com.ss.android.lark.biz.core.api.FileState fileState) {
                        iGetDataCallback.onSuccess(FileState.forNumber(fileState.getNumber()));
                    }
                });
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102844a(MessageIdentity messageIdentity, String str, String str2, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
                String messageId = messageIdentity.getMessageId();
                String sourceId = messageIdentity.getSourceId();
                String chatId = messageIdentity.getChatId();
                Message.SourceType sourceType = messageIdentity.getSourceType();
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).downLoadMessageVideo(context, messageId, sourceId, chatId, sourceType.getNumber(), m106413a(sourceType), str, str2, iGetDataCallback, hVar);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102843a(MessageIdentity messageIdentity, String str, IGetDataCallback<String> iGetDataCallback) {
                ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).saveToNutStore(str, messageIdentity.getMessageId(), messageIdentity.getSourceId(), messageIdentity.getSourceType().getNumber(), iGetDataCallback);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102837a(Context context, Fragment fragment, int i, String str, String str2, boolean z, boolean z2, String str3) {
                mo102836a(context, fragment, i, str, str2, "from_preview", z, z2, str3);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102835a(Context context, Fragment fragment, int i, String str, String str2) {
                mo102836a(context, fragment, i, str, str2, "from_picker", false, false, "");
            }

            /* renamed from: a */
            public void mo102836a(Context context, Fragment fragment, int i, String str, String str2, String str3, boolean z, boolean z2, String str4) {
                LarkPhotoEditorModule.m199350a(context, fragment, str, str2, i, str3, z, z2, str4);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102838a(Context context, ImageContent imageContent) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goImageForwardSelectPage(context, imageContent);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102840a(Context context, String str, StickerContent stickerContent) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goStickerForwardSelectPage(context, str, stickerContent);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102841a(Context context, boolean z, DialogInterface.OnDismissListener onDismissListener) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).showResourceDeletedByAdminDialog(context, Boolean.valueOf(z), onDismissListener);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public boolean mo102849a(String str, boolean z) {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).checkImageDownloadAuthorization(str, z);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102834a(Context context, int i, DialogInterface.OnDismissListener onDismissListener) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).onCheckedAuthorizationFailed(context, i, onDismissListener);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102839a(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).onCheckedAuthorizationFailed(context, str, onDismissListener);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102845a(C58612c.AbstractC58616d dVar) {
                dVar.getClass();
                $$Lambda$2ZeS58o0qKJuvx8MO5ZveCS_AXM r0 = new AbstractC29579a() {
                    /* class com.ss.android.lark.app.task.initor.$$Lambda$2ZeS58o0qKJuvx8MO5ZveCS_AXM */

                    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29579a
                    public final void onPushDownloadProgress(String str, int i, long j, long j2) {
                        C58612c.AbstractC58616d.this.mo198632a(str, i, j, j2);
                    }
                };
                this.f72672b.put(dVar, r0);
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addPushResourceDownloadProgressListener(r0);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: l */
            public C58612c.AbstractC58614b mo102869l() {
                return new C58612c.AbstractC58614b() {
                    /* class com.ss.android.lark.app.task.initor.PhotoPickerModuleDependencyInitor.C289981.C290002 */

                    @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58614b
                    /* renamed from: a */
                    public boolean mo102873a() {
                        if (C36808a.m145211c() == 1) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58614b
                    /* renamed from: a */
                    public File mo102871a(File file, boolean z) throws Exception {
                        try {
                            return C36808a.m145199a(file, z);
                        } catch (DecryptException e) {
                            throw new Exception("file decrypt failed, path = " + file.getAbsolutePath() + ", errorCode = " + e.getErrorCode());
                        }
                    }

                    @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58614b
                    /* renamed from: a */
                    public void mo102872a(final File file, boolean z, final C58612c.AbstractC58613a aVar) {
                        C36808a.m145205a(file, z, new C36808a.AbstractC36810a() {
                            /* class com.ss.android.lark.app.task.initor.PhotoPickerModuleDependencyInitor.C289981.C290002.C290012 */

                            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36810a
                            /* renamed from: a */
                            public void mo102875a(File file) {
                                C58612c.AbstractC58613a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo198630a(file);
                                }
                            }

                            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36810a
                            /* renamed from: a */
                            public void mo102874a(DecryptException decryptException) {
                                C58612c.AbstractC58613a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo198631a(new Exception("file decrypt failed, path = " + file.getAbsolutePath() + ", errorCode = " + decryptException.getErrorCode()));
                                }
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: c */
            public boolean mo102857c() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isPrimaryHost();
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: h */
            public void mo102865h() {
                ((IVCApi) ApiUtils.getApi(IVCApi.class)).otherOpenCamera();
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: i */
            public boolean mo102866i() {
                return C37239a.m146648b().mo136951a("suite_video_download");
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: j */
            public boolean mo102867j() {
                if (C36808a.m145211c() == 1) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: k */
            public int mo102868k() {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getFileUploadAuthorizatedDenyCode();
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: b */
            public String mo102851b() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession();
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: d */
            public boolean mo102859d() {
                return C37239a.m146648b().mo136951a("lark.video.ve.enable");
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: e */
            public boolean mo102861e() {
                return C37239a.m146648b().mo136951a("lark.ve.enable.blacklist");
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: f */
            public boolean mo102863f() {
                return C37239a.m146648b().mo136951a("lark.android.camera.close.async");
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102846a(String str) {
                Statistics.sendEvent(str);
            }

            /* renamed from: a */
            private int m106413a(Message.SourceType sourceType) {
                if (sourceType == Message.SourceType.TYPE_FROM_FAVORITE) {
                    return 2;
                }
                return -99;
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: d */
            public String mo102858d(String str) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).decodeQRCode(str);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: e */
            public void mo102860e(String str) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).auditImageDownload(str);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: f */
            public void mo102862f(String str) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).auditMediaDownload(str);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: c */
            public Message mo102856c(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getLocalMessage(str);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: b */
            public void mo102853b(C58612c.AbstractC58616d dVar) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).removePushResourceDownloadProgressListener(this.f72672b.remove(dVar));
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: b */
            public boolean mo102854b(String str) {
                return C37239a.m146648b().mo136952a(str, false);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public String mo102830a(int i) {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getAuditDisplayMsg(i);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public String mo102831a(Bitmap bitmap) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).decodeQRCode(bitmap);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public ByteString mo102832a(ImageSet imageSet) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getInlinePreviewFromPb(imageSet);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: b */
            public boolean mo102855b(String str, boolean z) {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).checkFileSavedToDriveAuthorization(str, Boolean.valueOf(z)).booleanValue();
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public void mo102833a(Context context, int i) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).onCheckedAuthorizationFailedToast(context, i);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: b */
            public File mo102850b(IRequestCreator iRequestCreator, String str, String str2, String str3, boolean z, int i) {
                return m106414a(str, str2, str3, z, i, false, true);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public File mo102827a(IRequestCreator iRequestCreator, String str, String str2, String str3, boolean z, int i) {
                return m106414a(str, str2, str3, z, i, false, false);
            }

            /* renamed from: a */
            private File m106414a(String str, String str2, String str3, boolean z, int i, boolean z2, boolean z3) {
                Object obj;
                boolean z4;
                Object obj2;
                if (z) {
                    if (i == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        obj2 = AvatarImage.Builder.obtain(str2, str3, 640, 640).build();
                    } else {
                        obj2 = new C38824b(str2);
                    }
                    Log.m165389i("PhotoPickDownload", "resourceImage , isAvatar = " + z4 + " , imageKey = " + str2);
                    obj = obj2;
                } else {
                    Log.m165389i("PhotoPickDownload", "url image , url" + str);
                    obj = str;
                }
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).downloadImage(context, null, obj, 0, 0, z2, z3);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: b */
            public void mo102852b(Context context, Fragment fragment, int i, String str, String str2, boolean z, boolean z2, String str3) {
                mo102836a(context, fragment, i, str, str2, "from_picker", z, z2, str3);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public File mo102829a(IRequestCreator iRequestCreator, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, boolean z4) {
                return m106414a(str, str2, str3, z, i, z4, false);
            }

            @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58615c
            /* renamed from: a */
            public File mo102828a(IRequestCreator iRequestCreator, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, int i2, ImageFormat imageFormat, int i3, boolean z4) {
                return m106414a(str, str2, str3, z, i3, z4, false);
            }
        });
    }
}
