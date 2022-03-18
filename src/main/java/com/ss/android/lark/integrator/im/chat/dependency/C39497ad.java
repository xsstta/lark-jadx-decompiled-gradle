package com.ss.android.lark.integrator.im.chat.dependency;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.integrator.im.p2040r.C39766a;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerListener;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerSetListener;
import com.ss.android.lark.sticker.api.custom.PushCustomizedStickersRequest;
import com.ss.android.lark.sticker.dto.AbstractC55075a;
import com.ss.android.lark.sticker.dto.C55078d;
import com.ss.android.lark.sticker.dto.PushStickerSetsResponse;
import com.ss.android.lark.sticker.dto.StickerFileInfo;
import com.ss.android.lark.sticker.dto.StickerSetInfo;
import com.ss.android.lark.sticker.p2714a.C55020j;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.ad */
public class C39497ad implements IStickerDependency {

    /* renamed from: a */
    private AbstractC39502b f100921a = new AbstractC39502b<IPushStickerSetListener>() {
        /* class com.ss.android.lark.integrator.im.chat.dependency.C39497ad.C394992 */

        /* renamed from: b */
        private WeakReference<IPushStickerSetListener> f100926b;

        /* renamed from: a */
        public void mo143357a(IPushStickerSetListener iVar) {
            this.f100926b = new WeakReference<>(iVar);
        }

        @Override // com.ss.android.lark.sticker.dto.AbstractC55075a
        /* renamed from: a */
        public void mo143356a(PushStickerSetsResponse pushStickerSetsResponse) {
            IPushStickerSetListener iVar;
            WeakReference<IPushStickerSetListener> weakReference = this.f100926b;
            if (weakReference != null && (iVar = weakReference.get()) != null) {
                iVar.mo147533a();
            }
        }
    };

    /* renamed from: b */
    private AbstractC39501a f100922b = new AbstractC39501a<IPushStickerListener>() {
        /* class com.ss.android.lark.integrator.im.chat.dependency.C39497ad.C395003 */

        /* renamed from: b */
        private WeakReference<IPushStickerListener> f100928b;

        /* renamed from: a */
        public void mo143360a(IPushStickerListener hVar) {
            this.f100928b = new WeakReference<>(hVar);
        }

        @Override // com.ss.android.lark.sticker.p2714a.C55020j.AbstractC55025a
        /* renamed from: a */
        public void mo143359a(PushCustomizedStickersRequest pushCustomizedStickersRequest, boolean z, boolean z2) {
            IPushStickerListener hVar;
            WeakReference<IPushStickerListener> weakReference = this.f100928b;
            if (weakReference != null && (hVar = weakReference.get()) != null) {
                hVar.mo147577a();
            }
        }
    };

    /* renamed from: com.ss.android.lark.integrator.im.chat.dependency.ad$a */
    interface AbstractC39501a<T> extends C55020j.AbstractC55025a {
        /* renamed from: a */
        void mo143360a(T t);
    }

    /* renamed from: com.ss.android.lark.integrator.im.chat.dependency.ad$b */
    interface AbstractC39502b<T> extends AbstractC55075a {
        /* renamed from: a */
        void mo143357a(T t);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134385a(List<Sticker> list, IGetDataCallback<Boolean> iGetDataCallback) {
        C39766a.m157868a().mo187810b().mo187850a(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134384a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        C39766a.m157868a().mo187810b().mo187849a(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134386a(List<String> list, boolean z, final IGetDataCallback<IStickerDependency.C36449a> iGetDataCallback) {
        C39766a.m157868a().mo187810b().mo187851a(list, z, new IGetDataCallback<C55078d>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39497ad.C394981 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(C55078d dVar) {
                iGetDataCallback.onSuccess(new IStickerDependency.C36449a(dVar.mo187957a(), dVar.mo187958b()));
            }
        });
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: c */
    public void mo134392c() {
        C39766a.m157868a().mo187815c().mo187880b();
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public List<Sticker> mo134375a() {
        return C39766a.m157868a().mo187810b().mo187853b();
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: b */
    public List<Sticker> mo134388b() {
        return C39766a.m157868a().mo187810b().mo187846a(0, 0).mo187953a();
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134376a(Activity activity) {
        C39766a.m157868a().mo187804a(activity);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: b */
    public void mo134389b(Activity activity) {
        C39766a.m157868a().mo187811b(activity);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public Sticker mo134374a(String str) {
        return C39766a.m157868a().mo187810b().mo187845a(str);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: b */
    public void mo134390b(IPushStickerListener hVar) {
        this.f100922b.mo143360a(hVar);
        C39766a.m157868a().mo187813b(this.f100922b);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: b */
    public IStickerDependency.StickerFileInfo mo134387b(String str) {
        StickerFileInfo b = C39766a.m157868a().mo187810b().mo187852b(str);
        return new IStickerDependency.StickerFileInfo(b.getKey(), b.getUrl(), b.getFilePath(), b.getWidth(), b.getHeight(), "", "");
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: b */
    public void mo134391b(IPushStickerSetListener iVar) {
        this.f100921a.mo143357a(iVar);
        C39766a.m157868a().mo187814b(this.f100921a);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134381a(IGetDataCallback<List<StickerSet>> iGetDataCallback) {
        C39766a.m157868a().mo187815c().mo187871a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134382a(IPushStickerListener hVar) {
        this.f100922b.mo143360a(hVar);
        C39766a.m157868a().mo187808a(this.f100922b);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134383a(IPushStickerSetListener iVar) {
        this.f100921a.mo143357a(iVar);
        C39766a.m157868a().mo187809a(this.f100921a);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134377a(Context context, Message message) {
        StickerSetInfo stickerSetInfo = new StickerSetInfo();
        stickerSetInfo.setMessage(message);
        C39766a.m157868a().mo187805a(context, stickerSetInfo);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134378a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
        C39766a.m157868a().mo187816d().mo187829a(context, z, i, i2, str, imageView, i3, i4);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134379a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
        C39766a.m157868a().mo187816d().mo187830a(context, z, i, i2, str, imageView, i3, i4, str2);
    }

    @Override // com.ss.android.lark.dependency.IStickerDependency
    /* renamed from: a */
    public void mo134380a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h hVar) {
        C39766a.m157868a().mo187816d().mo187831a(context, z, i, i2, str, imageView, i3, i4, str2, hVar);
    }
}
