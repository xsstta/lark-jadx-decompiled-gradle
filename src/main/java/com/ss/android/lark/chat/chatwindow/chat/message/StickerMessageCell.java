package com.ss.android.lark.chat.chatwindow.chat.message;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.StickerMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33306p;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.view.ChatImageGroup;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.impl.PerfLoadPicMonitor;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;
import java.util.Collections;

public class StickerMessageCell extends AbstractC33290a<StickerContentVO, StickerMessageViewHolder> {

    /* renamed from: a */
    public final AbstractC33306p f85748a;

    /* renamed from: b */
    private final int f85749b;

    /* renamed from: c */
    private final int f85750c;

    /* renamed from: e */
    private final IStickerDependency f85751e;

    /* renamed from: g */
    private final float f85752g;

    /* renamed from: h */
    private final float f85753h;

    /* renamed from: i */
    private final boolean f85754i;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.image_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return StickerContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<StickerMessageViewHolder> mo122650b() {
        return StickerMessageViewHolder.class;
    }

    public class StickerMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private StickerMessageViewHolder f85761a;

        @Override // butterknife.Unbinder
        public void unbind() {
            StickerMessageViewHolder stickerMessageViewHolder = this.f85761a;
            if (stickerMessageViewHolder != null) {
                this.f85761a = null;
                stickerMessageViewHolder.mRoundLayout = null;
                stickerMessageViewHolder.mStickerGroup = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public StickerMessageViewHolder_ViewBinding(StickerMessageViewHolder stickerMessageViewHolder, View view) {
            this.f85761a = stickerMessageViewHolder;
            stickerMessageViewHolder.mRoundLayout = (LKUIRoundableLayout) Utils.findRequiredViewAsType(view, R.id.round_container, "field 'mRoundLayout'", LKUIRoundableLayout.class);
            stickerMessageViewHolder.mStickerGroup = (ChatImageGroup) Utils.findRequiredViewAsType(view, R.id.image, "field 'mStickerGroup'", ChatImageGroup.class);
        }
    }

    public static class StickerMessageViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public ImageView f85760a;
        @BindView(8605)
        public LKUIRoundableLayout mRoundLayout;
        @BindView(7839)
        public ChatImageGroup mStickerGroup;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.f85760a = this.mStickerGroup.f88922a;
            this.mStickerGroup.mo127156a();
        }
    }

    public StickerMessageCell(AbstractC33342d dVar, AbstractC33306p pVar) {
        this(dVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, pVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(StickerMessageViewHolder stickerMessageViewHolder, final AbsMessageVO<StickerContentVO> aVar) {
        int[] iArr;
        Scene scene;
        super.mo122648a((AbstractC59010e) stickerMessageViewHolder, (AbsMessageVO) aVar);
        StickerContentVO g = aVar.mo121699g();
        if (g != null) {
            String a = g.mo121891a();
            int b = g.mo121893b();
            int c = g.mo121894c();
            float screenDensity = DeviceUtils.getScreenDensity(mo122719d());
            int intValue = Float.valueOf(((float) b) * screenDensity).intValue();
            int intValue2 = Float.valueOf(((float) c) * screenDensity).intValue();
            if (DesktopUtil.m144301a(mo122719d())) {
                int i = this.f85750c;
                int i2 = this.f85749b;
                iArr = ImageUtils.m224135a(intValue, intValue2, i, i, i2, i2);
                iArr[0] = C57582a.m223610b(mo122719d(), (float) iArr[0]);
                iArr[1] = C57582a.m223610b(mo122719d(), (float) iArr[1]);
            } else {
                iArr = ImageUtils.m224136a(mo122719d(), intValue, intValue2, this.f85750c, this.f85749b);
            }
            int i3 = iArr[0];
            int i4 = iArr[1];
            C34336c.m133133b(mo122719d(), i3, i4, stickerMessageViewHolder.f85760a);
            if (this.f85789d.mo122546j()) {
                scene = Scene.SecretChat;
            } else if (this.f85789d.mo122558v() || this.f85789d.mo122560x()) {
                scene = Scene.Thread;
            } else {
                scene = Scene.Chat;
            }
            this.f85751e.mo134380a(mo122719d(), false, UIUtils.dp2px(this.f85789d.mo122543g(), (float) i3), UIUtils.dp2px(this.f85789d.mo122543g(), (float) i4), a, stickerMessageViewHolder.f85760a, R.drawable.common_chat_window_image_item_holder, R.drawable.common_failed_chat_picture, g.mo121896e(), new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(scene).mo105398a(ListenerParams.FromType.STICKER).mo105401a(true).mo105405b(false).mo105395a(i3).mo105403b(i4).mo105402a()));
        } else {
            C34336c.m133126a(mo122719d(), stickerMessageViewHolder.f85760a);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) stickerMessageViewHolder.mRoundLayout.getLayoutParams();
        if (this.f85754i) {
            stickerMessageViewHolder.mRoundLayout.setRadius(this.f85752g);
            marginLayoutParams.topMargin = 0;
            stickerMessageViewHolder.mRoundLayout.setBorderWidth(this.f85753h);
        } else {
            boolean w = this.f85789d.mo122559w();
            float f = BitmapDescriptorFactory.HUE_RED;
            if (w || (TextUtils.isEmpty(aVar.mo121700h()) && !aVar.ah())) {
                float[] a2 = MessageCellUtils.m133196a(aVar, 8.0f);
                stickerMessageViewHolder.mRoundLayout.mo89662a(a2[0], a2[1], a2[2], a2[3]);
                LKUIRoundableLayout lKUIRoundableLayout = stickerMessageViewHolder.mRoundLayout;
                if (aVar.mo121699g().mo121897f().isDing()) {
                    f = 1.0f;
                }
                lKUIRoundableLayout.setBorderWidth(f);
                marginLayoutParams.topMargin = 0;
            } else {
                stickerMessageViewHolder.mRoundLayout.setRadius(4.0f);
                marginLayoutParams.topMargin = 0;
                stickerMessageViewHolder.mRoundLayout.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
            }
        }
        stickerMessageViewHolder.mStickerGroup.setOnClickListener(new View.OnClickListener(stickerMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$StickerMessageCell$8_NLxPWirrw2LmQ3YILknfIjxKY */
            public final /* synthetic */ StickerMessageCell.StickerMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                StickerMessageCell.lambda$8_NLxPWirrw2LmQ3YILknfIjxKY(StickerMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        stickerMessageViewHolder.mStickerGroup.setOnLongClickListener(new View.OnLongClickListener(stickerMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$StickerMessageCell$PhOnMkPKHE2k7OSJcyTqh6coKLA */
            public final /* synthetic */ StickerMessageCell.StickerMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return StickerMessageCell.lambda$PhOnMkPKHE2k7OSJcyTqh6coKLA(StickerMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        stickerMessageViewHolder.mStickerGroup.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.StickerMessageCell.View$OnGenericMotionListenerC332821 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() != 2) {
                    return false;
                }
                StickerMessageCell.this.mo122739a(view, motionEvent, aVar);
                return false;
            }
        });
        stickerMessageViewHolder.mRoundLayout.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(StickerMessageViewHolder stickerMessageViewHolder, AbsMessageVO<StickerContentVO> aVar) {
        StickerContentVO kVar;
        Scene scene;
        if (aVar != null) {
            kVar = aVar.mo121699g();
        } else {
            kVar = null;
        }
        if (kVar != null && !aVar.ai()) {
            if (C57782ag.m224241a(kVar.mo121891a())) {
                LKUIToast.show(mo122719d(), UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return;
            }
            if (this.f85789d.mo122560x() && (this.f85789d instanceof C55934b)) {
                C55934b bVar = (C55934b) this.f85789d;
                ThreadTopicHitPointNew.f135908b.mo187753a(bVar.mo122550n(), bVar.mo190684a(), "msg", "none", ThreadTopicHitPointNew.f135908b.mo187748a(aVar, "sticker", (String) null, (String) null));
            } else if (!this.f85789d.mo122559w()) {
                ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "sticker", ChatHitPointNew.f135660c.mo187391b("sticker"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
            }
            if (!TextUtils.isEmpty(kVar.mo121896e())) {
                C29990c.m110930b().mo134502A().mo134377a(mo122719d(), kVar.mo121897f());
                return;
            }
            PhotoItem messageId = new PhotoItem().setImageKey(kVar.mo121891a()).setPaths(Collections.singletonList(kVar.mo121891a())).setMessageId(aVar.mo121681a());
            ArrayList arrayList = new ArrayList();
            arrayList.add(messageId);
            if (this.f85789d.mo122560x() || this.f85789d.mo122558v()) {
                scene = Scene.Thread;
            } else if (this.f85789d.mo122546j()) {
                scene = Scene.SecretChat;
            } else {
                scene = Scene.Chat;
            }
            C58630d.m227372a(mo122719d(), arrayList, 0, stickerMessageViewHolder.f85760a, BaseData.AnimationType.TRANSLATE_ANIMATION, !this.f85789d.mo122546j(), true, true, false, true, false, false, null, null, "", null, Biz.Messenger, scene, 3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m128845b(StickerMessageViewHolder stickerMessageViewHolder, AbsMessageVO aVar, View view) {
        mo122683c(stickerMessageViewHolder, (AbsMessageVO<StickerContentVO>) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m128844a(StickerMessageViewHolder stickerMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) stickerMessageViewHolder, (Object) aVar);
    }

    /* renamed from: a */
    public boolean mo122739a(View view, MotionEvent motionEvent, final AbsMessageVO<StickerContentVO> aVar) {
        final StickerContentVO kVar;
        if (aVar != null) {
            kVar = aVar.mo121699g();
        } else {
            kVar = null;
        }
        if (kVar == null || aVar.ai()) {
            return false;
        }
        if (C57782ag.m224241a(kVar.mo121891a())) {
            LKUIToast.show(mo122719d(), UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
            return false;
        }
        View$OnClickListenerC332832 r7 = new View.OnClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.StickerMessageCell.View$OnClickListenerC332832 */

            public void onClick(View view) {
                if (kVar.mo121895d()) {
                    LKUIToast.show(StickerMessageCell.this.mo122719d(), (int) R.string.Lark_Legacy_TheStickerAlreadyExists);
                } else if (StickerMessageCell.this.f85748a != null) {
                    StickerMessageCell.this.f85748a.mo122777f(aVar.mo121681a());
                }
            }
        };
        if (!TextUtils.isEmpty(kVar.mo121896e())) {
            return C33143g.m128110a(mo122719d(), view, motionEvent.getRawX(), motionEvent.getRawY(), null, r7, true);
        }
        return C33143g.m128110a(mo122719d(), view, motionEvent.getRawX(), motionEvent.getRawY(), new C38824b(kVar.mo121891a()), r7, false);
    }

    public StickerMessageCell(AbstractC33342d dVar, float f, float f2, boolean z, AbstractC33306p pVar) {
        super(dVar);
        int i;
        this.f85751e = C29990c.m110930b().mo134502A();
        this.f85748a = pVar;
        this.f85749b = UIUtils.dp2px(mo122719d(), 30.0f);
        if (DesktopUtil.m144301a(mo122719d())) {
            i = UIUtils.dp2px(mo122719d(), 160.0f);
        } else {
            i = UIUtils.dp2px(mo122719d(), 150.0f);
        }
        this.f85750c = i;
        this.f85752g = f;
        this.f85753h = f2;
        this.f85754i = z;
    }
}
