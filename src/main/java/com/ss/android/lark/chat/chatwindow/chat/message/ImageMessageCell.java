package com.ss.android.lark.chat.chatwindow.chat.message;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bumptech.glide.load.resource.p093d.C2468c;
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
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.view.ChatImageGroup;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class ImageMessageCell extends AbstractC33290a<ImageContentVO, ImageMessageViewHolder> {

    /* renamed from: a */
    private final int f85642a;

    /* renamed from: b */
    private final int f85643b;

    /* renamed from: c */
    private final int f85644c;

    /* renamed from: e */
    private final int f85645e;

    /* renamed from: g */
    private final float f85646g;

    /* renamed from: h */
    private final float f85647h;

    /* renamed from: i */
    private final boolean f85648i;

    /* renamed from: j */
    private final AbstractC33301k f85649j;

    /* renamed from: k */
    private final boolean f85650k;

    /* renamed from: l */
    private Drawable f85651l;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.image_content_item;
    }

    /* renamed from: i */
    private int m128704i() {
        return this.f85642a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return ImageContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<ImageMessageViewHolder> mo122650b() {
        return ImageMessageViewHolder.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo122702e() {
        return this.f85643b;
    }

    /* renamed from: j */
    private int m128705j() {
        return m128704i();
    }

    public class ImageMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ImageMessageViewHolder f85661a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ImageMessageViewHolder imageMessageViewHolder = this.f85661a;
            if (imageMessageViewHolder != null) {
                this.f85661a = null;
                imageMessageViewHolder.mRoundLayout = null;
                imageMessageViewHolder.mImageGroup = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ImageMessageViewHolder_ViewBinding(ImageMessageViewHolder imageMessageViewHolder, View view) {
            this.f85661a = imageMessageViewHolder;
            imageMessageViewHolder.mRoundLayout = (LKUIRoundableLayout) Utils.findRequiredViewAsType(view, R.id.round_container, "field 'mRoundLayout'", LKUIRoundableLayout.class);
            imageMessageViewHolder.mImageGroup = (ChatImageGroup) Utils.findRequiredViewAsType(view, R.id.image, "field 'mImageGroup'", ChatImageGroup.class);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo122703f() {
        if (DesktopUtil.m144307b()) {
            return UIHelper.dp2px(160.0f);
        }
        if (this.f85789d.mo122559w()) {
            return (int) (((double) DeviceUtils.getScreenHeight(this.f85789d.mo122543g())) * 0.6d);
        }
        return (int) (((double) UIHelper.getWindowWidth(mo122719d())) * 0.6d);
    }

    public static class ImageMessageViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public ImageView f85660a;
        @BindView(7839)
        public ChatImageGroup mImageGroup;
        @BindView(8605)
        public LKUIRoundableLayout mRoundLayout;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.f85660a = this.mImageGroup.f88922a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122700a(ImageMessageViewHolder imageMessageViewHolder) {
        super.mo122700a((AbstractC59010e) imageMessageViewHolder);
        if (this.f85650k && imageMessageViewHolder.f85660a != null) {
            imageMessageViewHolder.f85660a.setImageDrawable(this.f85651l);
        }
    }

    public ImageMessageCell(AbstractC33342d dVar, AbstractC33301k kVar) {
        this(dVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, kVar);
    }

    /* renamed from: c */
    private void m128702c(final ImageMessageViewHolder imageMessageViewHolder, final AbsMessageVO<ImageContentVO> aVar) {
        imageMessageViewHolder.mRoundLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell.C332661 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ImageMessageCell.this.mo122683c(imageMessageViewHolder, aVar);
            }
        });
        imageMessageViewHolder.mRoundLayout.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell.View$OnLongClickListenerC332672 */

            public boolean onLongClick(View view) {
                return ImageMessageCell.this.mo122755b((AbstractC59010e) imageMessageViewHolder, (Object) aVar);
            }
        });
        imageMessageViewHolder.mRoundLayout.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell.View$OnGenericMotionListenerC332683 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() != 2) {
                    return false;
                }
                ImageContentVO fVar = (ImageContentVO) aVar.mo121699g();
                if (aVar.mo121656B() != SendStatus.SUCCESS || fVar.mo121844b() == null) {
                    return false;
                }
                return C33143g.m128109a(ImageMessageCell.this.mo122719d(), view, motionEvent.getRawX(), motionEvent.getRawY(), new C38824b(fVar.mo121844b().getKey()));
            }
        });
    }

    /* renamed from: d */
    private void m128703d(ImageMessageViewHolder imageMessageViewHolder, AbsMessageVO<ImageContentVO> aVar) {
        if (this.f85648i) {
            imageMessageViewHolder.mRoundLayout.setRadius(this.f85646g);
            imageMessageViewHolder.mRoundLayout.setBorderWidth(this.f85647h);
        } else if ((this.f85789d.mo122559w() || TextUtils.isEmpty(aVar.mo121700h())) && !aVar.ah()) {
            float[] a = MessageCellUtils.m133195a(aVar);
            imageMessageViewHolder.mRoundLayout.mo89662a(a[0], a[1], a[2], a[3]);
            imageMessageViewHolder.mRoundLayout.setBorderWidth(0.5f);
        } else {
            imageMessageViewHolder.mRoundLayout.setRadius(4.0f);
            imageMessageViewHolder.mRoundLayout.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(ImageMessageViewHolder imageMessageViewHolder, AbsMessageVO<ImageContentVO> aVar) {
        if (this.f85649j != null) {
            ImageContentVO g = aVar.mo121699g();
            boolean i = g.mo121814i();
            if (i && g.mo121930y() != null) {
                g = (ImageContentVO) g.mo121930y();
            }
            if (g != null && g.mo121850h() == null) {
                g.mo121843a(new MessageIdentity(aVar.mo121681a(), aVar.mo121692b()));
            }
            if (g == null) {
                LKUIToast.show(this.f85789d.mo122543g(), UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return;
            }
            PhotoItem a = C34353s.m133240a(g, aVar.mo121681a());
            if (a != null) {
                a.getTranslateProperty().setTranslated(i);
                this.f85649j.mo122772a(imageMessageViewHolder.f85660a, null, a, false, i, 1);
            }
        }
        if (this.f85789d.mo122560x() && (this.f85789d instanceof C55934b)) {
            C55934b bVar = (C55934b) this.f85789d;
            ThreadTopicHitPointNew.f135908b.mo187753a(bVar.mo122550n(), bVar.mo190684a(), "msg", "none", ThreadTopicHitPointNew.f135908b.mo187748a(aVar, "image", (String) null, (String) null));
        } else if (!this.f85789d.mo122559w()) {
            ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "image", ChatHitPointNew.f135660c.mo187391b("image"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ImageMessageViewHolder imageMessageViewHolder, AbsMessageVO<ImageContentVO> aVar) {
        int i;
        int i2;
        Scene scene;
        String str;
        DiskCacheStrategy diskCacheStrategy;
        super.mo122648a((AbstractC59010e) imageMessageViewHolder, (AbsMessageVO) aVar);
        ImageContentVO g = aVar.mo121699g();
        if (g != null) {
            if (g.mo121814i() && g.mo121930y() != null) {
                g = (ImageContentVO) g.mo121930y();
            }
            ImageSet imageSet = new ImageSet(g.mo121842a(), g.mo121844b(), g.mo121846d(), g.mo121847e(), g.mo121848f(), g.mo121850h());
            Image a = C34336c.m133123a(imageSet);
            if (a != null) {
                Image b = g.mo121844b();
                int width = b.getWidth();
                int height = b.getHeight();
                float screenDensity = DeviceUtils.getScreenDensity(mo122719d());
                int intValue = Float.valueOf(((float) width) * screenDensity).intValue();
                int intValue2 = Float.valueOf(((float) height) * screenDensity).intValue();
                if (m128704i() > mo122702e()) {
                    i = this.f85644c;
                } else {
                    i = m128704i();
                }
                if (m128705j() > mo122703f()) {
                    i2 = this.f85645e;
                } else {
                    i2 = m128705j();
                }
                int[] a2 = ImageUtils.m224135a(intValue, intValue2, mo122702e(), mo122703f(), i, i2);
                int i3 = a2[0];
                boolean z = true;
                int i4 = a2[1];
                imageMessageViewHolder.mImageGroup.setLayoutParams(new FrameLayout.LayoutParams(i3, i4));
                imageMessageViewHolder.mImageGroup.mo127158b();
                if (!aVar.mo121696d().equals(imageMessageViewHolder.f85660a.getTag(R.id.chat_window_image_cid)) || imageMessageViewHolder.f85660a.getDrawable() == null || (imageMessageViewHolder.f85660a.getDrawable() instanceof C2468c)) {
                    z = false;
                }
                Drawable drawable = UIHelper.getDrawable(R.drawable.common_failed_chat_picture);
                Drawable drawable2 = null;
                if (z) {
                    drawable2 = imageMessageViewHolder.f85660a.getDrawable();
                }
                if (this.f85651l == null) {
                    this.f85651l = C34336c.m133131b(mo122719d(), i3, i4, 0);
                }
                if (drawable2 == null) {
                    drawable2 = this.f85651l;
                }
                boolean j = this.f85789d.mo122546j();
                if (j) {
                    scene = Scene.SecretChat;
                } else if (this.f85789d.mo122558v() || this.f85789d.mo122560x()) {
                    scene = Scene.Thread;
                } else {
                    scene = Scene.Chat;
                }
                if (g.mo121850h() != null) {
                    str = g.mo121850h().getMessageId();
                } else {
                    str = "";
                }
                LoadParams b2 = new LoadParams().mo105413a(i3).mo105422b(i4).mo105414a(drawable2).mo105423b(drawable);
                if (j) {
                    diskCacheStrategy = DiskCacheStrategy.NONE;
                } else {
                    diskCacheStrategy = DiskCacheStrategy.ALL;
                }
                C34336c.m133128a(mo122719d(), imageMessageViewHolder.f85660a, a, b2.mo105417a(diskCacheStrategy).mo105429d(j).mo105431e(false).mo105425b(this.f85650k).mo105416a(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(scene).mo105398a(ListenerParams.FromType.IMAGE).mo105401a(false).mo105405b(false).mo105395a(i3).mo105403b(i4).mo105400a(str).mo105404b(a.getKey()).mo105406c(TextUtils.equals(a.getKey(), b.getKey())).mo105402a()), imageSet.getInlinePreview());
                imageMessageViewHolder.f85660a.setTag(R.id.chat_window_image_cid, aVar.mo121696d());
            } else {
                C34336c.m133126a(mo122719d(), imageMessageViewHolder.f85660a);
            }
            m128702c(imageMessageViewHolder, aVar);
            m128703d(imageMessageViewHolder, aVar);
        }
    }

    public ImageMessageCell(AbstractC33342d dVar, float f, float f2, boolean z, AbstractC33301k kVar) {
        super(dVar);
        int i;
        int i2;
        this.f85649j = kVar;
        int intValue = MagicWindowUtil.m224688f(mo122719d()).intValue();
        this.f85642a = UIUtils.dp2px(dVar.mo122543g(), 50.0f);
        if (DesktopUtil.m144301a(mo122719d())) {
            i = UIUtils.dp2px(mo122719d(), 160.0f);
        } else {
            i = (int) (((double) intValue) * 0.6d);
        }
        this.f85643b = i;
        if (DesktopUtil.m144301a(mo122719d())) {
            i2 = UIUtils.dp2px(mo122719d(), 120.0f);
        } else {
            i2 = (int) (((double) intValue) * 0.2d);
        }
        this.f85644c = i2;
        this.f85645e = i2;
        this.f85646g = f;
        this.f85647h = f2;
        this.f85648i = z;
        this.f85650k = C29990c.m110930b().mo134586n().mo134685a("lark.chat.load_image.async");
    }
}
