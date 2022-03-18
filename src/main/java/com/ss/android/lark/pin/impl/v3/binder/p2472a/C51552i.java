package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.location.LocationDescription;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.utils.ImageUtil;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51615e;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.i */
public class C51552i extends AbstractC51540b<C51615e> {

    /* renamed from: a */
    private final AbstractC51472a.AbstractC51480g f128330a = PinModule.m199585b().mo144032f();

    /* renamed from: a */
    private void m200079a(C51615e eVar) {
        C25649b.m91857a(eVar.f128434n, LarkFont.BODY1);
        C25649b.m91857a(eVar.f128435o, LarkFont.CAPTION0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C51615e mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51615e.C51616a.m200246a(layoutInflater, viewGroup);
    }

    public C51552i(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(final C51615e eVar, PinInfo bVar) {
        String str;
        super.mo177530a((AbstractC51540b.C51541a) eVar, bVar);
        LocationContent locationContent = (LocationContent) bVar.mo177396g().getContent();
        LocationDescription locationDescription = locationContent.getLocationDescription();
        if (TextUtils.isEmpty(locationDescription.getName())) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", "");
        } else {
            str = locationDescription.getName();
        }
        eVar.f128434n.setText(str);
        String description = locationDescription.getDescription();
        if (TextUtils.isEmpty(description)) {
            eVar.f128435o.setVisibility(8);
        } else {
            eVar.f128435o.setVisibility(0);
            eVar.f128435o.setText(description);
        }
        Image image = null;
        if (!(locationContent.getImage() == null || locationContent.getImage().getOrigin() == null)) {
            image = locationContent.getImage().getOrigin();
        }
        if (image != null) {
            eVar.f128437q.setVisibility(0);
            ImageLoader.with(this.f146181d).load(new C38824b(image.getKey())).placeholder(R.drawable.common_chat_window_image_item_holder).error(UIUtils.getDrawable(this.f146181d, R.color.bg_filler)).asBitmap().centerCrop().listener(new AbstractC38817h() {
                /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51552i.C515531 */

                @Override // com.ss.android.lark.image.api.AbstractC38817h
                /* renamed from: a */
                public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
                    eVar.f128437q.setVisibility(8);
                    eVar.f128436p.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    return false;
                }

                @Override // com.ss.android.lark.image.api.AbstractC38817h
                /* renamed from: a */
                public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
                    eVar.f128437q.setVisibility(8);
                    eVar.f128436p.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    return false;
                }
            }).into(eVar.f128436p);
        } else {
            eVar.f128437q.setVisibility(8);
            ImageUtil.f128174a.mo177356a(this.f146181d, eVar.f128436p);
        }
        eVar.f128433m.setOnClickListener(new View.OnClickListener(bVar, locationContent) {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.$$Lambda$i$AYc6vkbXIJkQXOfg8zVTY1m6Vxg */
            public final /* synthetic */ PinInfo f$1;
            public final /* synthetic */ LocationContent f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C51552i.lambda$AYc6vkbXIJkQXOfg8zVTY1m6Vxg(C51552i.this, this.f$1, this.f$2, view);
            }
        });
        eVar.f128433m.setOnLongClickListener(mo177529a(bVar));
        if (bVar.mo177391b()) {
            eVar.f128433m.setBorderColor(UIUtils.getColor(this.f146181d, R.color.bg_body));
            eVar.f128435o.setPaddingRelative(0, 0, UIHelper.dp2px(12.0f), 0);
            eVar.f128434n.setPaddingRelative(0, 0, UIHelper.dp2px(12.0f), 0);
        }
        if (!DesktopUtil.m144307b()) {
            m200079a(eVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m200078a(PinInfo bVar, LocationContent locationContent, View view) {
        PinModule.m199585b().mo144018a(this.f146181d, bVar.mo177396g(), locationContent);
    }
}
