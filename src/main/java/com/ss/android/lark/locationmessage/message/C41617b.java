package com.ss.android.lark.locationmessage.message;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.AbstractC29622o;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.chat.entity.location.LocationDescription;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPluginHitPoint;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.p2149b.C41596g;
import com.ss.android.lark.locationmessage.statistics.NavigateHitPoint;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.locationmessage.message.b */
public class C41617b implements IPlusItem {

    /* renamed from: a */
    private ISupportForItem f105730a;

    /* renamed from: b */
    private final Chat f105731b;

    /* renamed from: c */
    private boolean f105732c;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.location_ic_keyboard_location;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        return false;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public IPlusItem.IconUrlInfo mo31053b() {
        return null;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: d */
    public boolean mo31056d() {
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return 60;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        return UIHelper.getString(R.string.Lark_Chat_InputwindowExpansionLocation);
    }

    /* renamed from: f */
    private void m165144f() {
        KeyboardHitPointExtraParams.IsFullScreen isFullScreen;
        IKeyBoardPlugin.IKeyBoardContext a = C40673a.m160697a(this.f105730a);
        if (a != null) {
            String d = C40683h.m160854d(a.mo147372b());
            if (a.mo147381z().mo146903h()) {
                isFullScreen = KeyboardHitPointExtraParams.IsFullScreen.TRUE;
            } else {
                isFullScreen = KeyboardHitPointExtraParams.IsFullScreen.FALSE;
            }
            KeyboardHitPointNew.m160872a(d, KeyboardHitPointExtraParams.Click.LOCATION.plus(KeyboardHitPointExtraParams.Target.MESSAGE_LOCATION_VIEW).plus(isFullScreen));
        }
    }

    public C41617b(Chat chat) {
        this.f105731b = chat;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        this.f105730a = cVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31051a(boolean z) {
        ISupportForItem cVar;
        if (!(this.f105732c == z || (cVar = this.f105730a) == null)) {
            cVar.mo124327a(this);
        }
        this.f105732c = z;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        new PlusKBPluginHitPoint("location").mo147285c();
        NavigateHitPoint.m165173a("message_location_enter");
        m165144f();
        POIConfig pOIConfig = new POIConfig();
        pOIConfig.setActionText(view.getContext().getString(R.string.Lark_Legacy_Send));
        pOIConfig.setSnapshot(true);
        pOIConfig.setSelfDefine(false);
        pOIConfig.setNeedWGSLatLng(true);
        C41597c.m165069a().mo143911d().mo149712a(this.f105730a.mo124328b(), (Integer) null, pOIConfig, new AbstractC29622o() {
            /* class com.ss.android.lark.locationmessage.message.$$Lambda$b$7TmhcyWztXDk_U9DSRF3Gx6xLTM */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29622o
            public final void handleResult(Activity activity, POIInfo pOIInfo) {
                C41617b.this.m165143a((C41617b) activity, (Activity) pOIInfo);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m165143a(Activity activity, POIInfo pOIInfo) {
        if (pOIInfo != null) {
            LocationDescription locationDescription = new LocationDescription();
            locationDescription.setName(C41596g.m165067a(pOIInfo.getLocationName()));
            locationDescription.setDescription(pOIInfo.getLocationAddress());
            LocationContent locationContent = new LocationContent();
            locationContent.setLongitude(String.valueOf(pOIInfo.getLongitude()));
            locationContent.setLatitude(String.valueOf(pOIInfo.getLatitude()));
            locationContent.setZoomLevel(pOIInfo.getZoomLevel());
            locationContent.setVendor(pOIInfo.getVendor());
            locationContent.setInternal(pOIInfo.isInternal());
            locationContent.setLocationDescription(locationDescription);
            C41597c.m165069a().mo143912e().mo143917a(this.f105731b.getId(), this.f105730a.mo124331e(), this.f105730a.mo124330d(), locationContent, pOIInfo.getLocationImageData().getImagePath(), pOIInfo.getLocationImageData().getWidth(), pOIInfo.getLocationImageData().getHeight());
            this.f105730a.mo124332f();
        }
    }
}
