package com.ss.android.lark.chat.chatwindow.chat.message.block;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.block.C33325c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.open.message.AbstractC34072a;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatthread.C35121d;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.c */
public class C33325c extends AbstractC59004b<ChatMessageVO, C33327a> {

    /* renamed from: a */
    private final al f85851a = C29990c.m110930b().mo134596x();

    /* renamed from: b */
    private final AbstractC33342d f85852b;

    /* renamed from: c */
    private final AbstractC34072a<? extends ContentVO> f85853c;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.chat_window_reply_stub_layout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.c$a */
    public static class C33327a extends AbstractC59010e {

        /* renamed from: a */
        public View f85857a;

        /* renamed from: b */
        public TextView f85858b;

        /* renamed from: c */
        public EllipsizedEmojiconTextView f85859c;

        /* renamed from: d */
        public EllipsizedEmojiconTextView f85860d;

        /* renamed from: e */
        public ImageView f85861e;

        /* renamed from: f */
        public LKUIRoundableLayout f85862f;

        C33327a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo122817a() {
            if (this.f146209n instanceof ViewStub) {
                mo200147g(C36443k.m143598a(this.f146209n.getContext()).mo134315a((ViewStub) this.f146209n));
                mo122818a((ViewGroup) this.f146209n);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            if (!(view instanceof ViewStub)) {
                mo122818a((ViewGroup) view);
            }
        }

        /* renamed from: a */
        private void m129030a(Context context) {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91857a(this.f85858b, LarkFont.BODY1);
                C25649b.m91857a(this.f85859c, LarkFont.BODY1);
                this.f85859c.setEmojiconSize(LKUIDisplayManager.m91881c(context, 16));
                this.f85859c.setEmojiconTextSize((int) LKUIDisplayManager.m91865a(context, LarkFont.BODY1));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo122818a(ViewGroup viewGroup) {
            this.f85857a = viewGroup.findViewById(R.id.reply_bubble);
            this.f85858b = (TextView) viewGroup.findViewById(R.id.reply_name);
            this.f85859c = (EllipsizedEmojiconTextView) viewGroup.findViewById(R.id.reply_content_text);
            this.f85860d = (EllipsizedEmojiconTextView) viewGroup.findViewById(R.id.reply_content_thread);
            this.f85861e = (ImageView) viewGroup.findViewById(R.id.reply_content_image);
            LKUIRoundableLayout lKUIRoundableLayout = (LKUIRoundableLayout) viewGroup.findViewById(R.id.reply_image_container);
            this.f85862f = lKUIRoundableLayout;
            lKUIRoundableLayout.setRadius(4.0f);
            this.f85862f.setBorderWidth(1.0f);
            m129030a(viewGroup.getContext());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<C33327a> mo122650b() {
        return C33327a.class;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Context mo122719d() {
        return this.f85852b.mo122543g();
    }

    public C33325c(AbstractC33342d dVar, AbstractC34072a<? extends ContentVO> aVar) {
        this.f85852b = dVar;
        this.f85853c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(C33327a aVar, ChatMessageVO cVar) {
        if (!this.f85852b.mo122549m()) {
            C35121d.m137109a(this.f85852b.mo122543g(), cVar.mo121692b(), cVar.mo121700h());
            ChatHitPoint.f135648a.mo187355a("parentMessage", this.f85852b.mo122546j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final C33327a aVar, final ChatMessageVO cVar) {
        boolean z;
        boolean z2;
        String str;
        int i;
        if (TextUtils.isEmpty(cVar.mo121700h())) {
            if (aVar.f146209n != null) {
                aVar.f146209n.setVisibility(8);
            }
            if (aVar.f85857a != null) {
                aVar.f85857a.setVisibility(8);
                return;
            }
            return;
        }
        aVar.mo122817a();
        DesktopUtil.m144299a(aVar.f85858b);
        DesktopUtil.m144299a(aVar.f85859c);
        ChatMessageVO aj = cVar.aj();
        AbstractC33342d dVar = this.f85852b;
        if (dVar == null || dVar.mo122550n() == null || cVar.mo121717y() >= this.f85852b.mo122550n().getFirstMessagePosition() + 1) {
            z = false;
        } else {
            z = true;
        }
        if (aj == null || !aj.mo121714v() || z) {
            aVar.f146209n.setVisibility(8);
            if (cVar.mo121701i() != null) {
                Log.m165397w("MessageReplyBlock", "parent is empty when bind msg, msgId is:" + cVar.mo121681a() + ", parent id is:" + cVar.mo121701i());
            }
            if (!(aj == null || aj.mo121714v())) {
                Log.m165397w("MessageReplyBlock", "reply message is invisible, id is" + aj.mo121681a() + ", skip bind");
                return;
            }
            return;
        }
        C34035c b = this.f85853c.mo122837b(cVar);
        aVar.f146209n.setVisibility(0);
        int[] d = b.mo126167d();
        aVar.f146209n.setPadding(d[0], d[1], d[2], d[3]);
        aVar.f85857a.setVisibility(0);
        aVar.f85857a.setBackground(b.mo126165c());
        aVar.f85858b.setVisibility(0);
        aVar.f85859c.setVisibility(0);
        aVar.f85858b.setTextColor(b.mo126159a());
        aVar.f85859c.setTextColor(b.mo126163b());
        aVar.f85860d.setTextColor(b.mo126163b());
        if (aj.mo121657C() != null) {
            aVar.f85858b.setText(String.format("%s: ", aj.mo121657C().mo124214g()));
            aVar.f85858b.setVisibility(0);
        } else {
            aVar.f85858b.setVisibility(8);
        }
        if (!aj.mo121706n() || !aj.mo121683a(this.f85851a.mo134462a())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (aj.mo121698f() || aj.mo121713u() || z2) {
            if (aj.mo121698f()) {
                str = UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled);
            } else if (aj.mo121713u()) {
                str = UIHelper.getString(R.string.Lark_Legacy_MessageRemove);
            } else {
                str = UIHelper.getString(R.string.Lark_Legacy_MessageBurned);
            }
            aVar.f85859c.setVisibility(0);
            aVar.f85859c.setText(str);
            aVar.f85861e.setVisibility(8);
            aVar.f85862f.setVisibility(8);
            aVar.f85860d.setVisibility(8);
            return;
        }
        aVar.f85859c.setTranslateEmojiCode(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(aj.aa());
        C58508e[] eVarArr = (C58508e[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C58508e.class);
        for (C58508e eVar : eVarArr) {
            if (eVar.mo198328e() != null) {
                Drawable e = eVar.mo198328e();
                e.mutate();
                e.setTint(b.mo126163b());
            }
            if (eVar.mo198330f() != null) {
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(b.mo126163b(), PorterDuff.Mode.SRC_IN));
                Bitmap createBitmap = Bitmap.createBitmap(eVar.mo198330f().getWidth(), eVar.mo198330f().getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(eVar.mo198330f(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                eVar.mo198321a(createBitmap);
            }
        }
        aVar.f85859c.setText(spannableStringBuilder);
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = aVar.f85859c;
        if (aj.mo121710r() == Message.Type.POST) {
            i = 1;
        } else {
            i = 0;
        }
        ellipsizedEmojiconTextView.setTypeface(Typeface.defaultFromStyle(i));
        if (aj.mo121710r() == Message.Type.IMAGE) {
            aVar.f85859c.setVisibility(8);
            aVar.f85861e.setVisibility(0);
            aVar.f85862f.setVisibility(0);
            aVar.f85862f.setBorderColor(C33360a.m129163g(cVar.mo121695c()));
            ViewGroup.LayoutParams layoutParams = aVar.f85861e.getLayoutParams();
            int dp2px = UIHelper.dp2px(40.0f);
            if (!(layoutParams.width == dp2px && layoutParams.height == dp2px)) {
                layoutParams.width = dp2px;
                layoutParams.height = dp2px;
                aVar.f85861e.setLayoutParams(layoutParams);
            }
            aVar.f85861e.setOnClickListener(new View.OnClickListener(aj, cVar, aVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$c$3dW7aIsBaxFWKLf9vgbbpmizK9o */
                public final /* synthetic */ ChatMessageVO f$1;
                public final /* synthetic */ ChatMessageVO f$2;
                public final /* synthetic */ C33325c.C33327a f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    C33325c.this.m129021a(this.f$1, this.f$2, this.f$3, view);
                }
            });
            aVar.f85861e.setOnLongClickListener(new View.OnLongClickListener(aVar, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$c$ofjgQxvW3gzrZy5O8XnIr_qmw7w */
                public final /* synthetic */ C33325c.C33327a f$1;
                public final /* synthetic */ ChatMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return C33325c.this.m129022a(this.f$1, this.f$2, view);
                }
            });
            C35212a.m137526a(mo122719d(), aVar.f85861e, (ImageContentVO) aj.mo121699g(), true);
        } else if (aj.mo121710r() == Message.Type.RED_PACKET) {
            aVar.f85859c.setVisibility(8);
            aVar.f85861e.setVisibility(0);
            aVar.f85862f.setVisibility(0);
            aVar.f85862f.setBorderColor(UDColorUtils.getColor(mo122719d(), R.color.transparent));
            aVar.f85862f.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
            aVar.f85862f.setRadius(3.0f);
            ViewGroup.LayoutParams layoutParams2 = aVar.f85861e.getLayoutParams();
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            aVar.f85861e.setLayoutParams(layoutParams2);
            aVar.f85861e.setImageResource(R.drawable.icon_red_packet_reply_holder);
            aVar.f85861e.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.C33325c.C333261 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C33325c.this.mo122683c(aVar, cVar);
                }
            });
        } else {
            aVar.f85861e.setVisibility(8);
            aVar.f85862f.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m129022a(C33327a aVar, ChatMessageVO cVar, View view) {
        return mo122755b((AbstractC59010e) aVar, (Object) cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129021a(ChatMessageVO cVar, ChatMessageVO cVar2, C33327a aVar, View view) {
        PhotoItem a = C34353s.m133240a((ImageContentVO) cVar.mo121699g(), cVar2.mo121681a());
        if (a != null) {
            boolean a2 = C29990c.m110930b().mo134586n().mo134685a("translate.message.image.viewer.enable");
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            C58630d.m227376b(mo122719d(), arrayList, 0, aVar.f85861e, a2);
        }
    }
}
