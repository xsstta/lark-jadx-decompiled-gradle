package com.bytedance.ies.bullet.service.base.web;

import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0001\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0001\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0001\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0001¨\u0006\u000b"}, d2 = {"transform", "Lcom/bytedance/ies/bullet/service/base/web/IPermissionRequest;", "Landroid/webkit/PermissionRequest;", "Lcom/bytedance/ies/bullet/service/base/web/IRenderProcessGoneDetail;", "Landroid/webkit/RenderProcessGoneDetail;", "Lcom/bytedance/ies/bullet/service/base/web/IFileChooserParams;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "Lcom/bytedance/ies/bullet/service/base/web/IWebResourceError;", "Landroid/webkit/WebResourceError;", "Lcom/bytedance/ies/bullet/service/base/web/IWebResourceRequest;", "Landroid/webkit/WebResourceRequest;", "x-servicecenter_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.web.d */
public final class C14421d {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001b\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"com/bytedance/ies/bullet/service/base/web/WebCompatDelegateKt$transform$4", "Lcom/bytedance/ies/bullet/service/base/web/IPermissionRequest;", "origin", "Landroid/net/Uri;", "getOrigin", "()Landroid/net/Uri;", "resources", "", "", "getResources", "()[Ljava/lang/String;", "deny", "", "grant", "([Ljava/lang/String;)V", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.web.d$a */
    public static final class C14422a implements IPermissionRequest {

        /* renamed from: a */
        final /* synthetic */ PermissionRequest f37957a;

        C14422a(PermissionRequest permissionRequest) {
            this.f37957a = permissionRequest;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\n¨\u0006\u0016"}, d2 = {"com/bytedance/ies/bullet/service/base/web/WebCompatDelegateKt$transform$5", "Lcom/bytedance/ies/bullet/service/base/web/IFileChooserParams;", "acceptTypes", "", "", "getAcceptTypes", "()[Ljava/lang/String;", "filenameHint", "", "getFilenameHint", "()Ljava/lang/CharSequence;", "isCaptureEnabled", "", "()Z", "mode", "", "getMode", "()I", "title", "getTitle", "createIntent", "Landroid/content/Intent;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.web.d$b */
    public static final class C14423b implements IFileChooserParams {

        /* renamed from: a */
        final /* synthetic */ WebChromeClient.FileChooserParams f37958a;

        C14423b(WebChromeClient.FileChooserParams fileChooserParams) {
            this.f37958a = fileChooserParams;
        }
    }

    /* renamed from: a */
    public static final IFileChooserParams m58170a(WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkParameterIsNotNull(fileChooserParams, "$this$transform");
        return new C14423b(fileChooserParams);
    }

    /* renamed from: a */
    public static final IPermissionRequest m58171a(PermissionRequest permissionRequest) {
        Intrinsics.checkParameterIsNotNull(permissionRequest, "$this$transform");
        return new C14422a(permissionRequest);
    }
}
