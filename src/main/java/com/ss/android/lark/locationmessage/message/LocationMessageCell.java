package com.ss.android.lark.locationmessage.message;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.chat.p1593a.C32807a;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.locationmessage.C41589b;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency;
import com.ss.android.lark.locationmessage.p2149b.C41593d;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class LocationMessageCell implements IOpenMessageCell<LocationContentVO>, IOpenBubbleStyleProvider<LocationContentVO> {

    /* renamed from: c */
    private static final int f105690c = UIHelper.dp2px(12.0f);

    /* renamed from: d */
    private static final int f105691d = UIHelper.dp2px(8.0f);

    /* renamed from: a */
    public final IMessageContext f105692a;

    /* renamed from: b */
    public final IOpenCellCallback<LocationContentVO> f105693b;

    /* renamed from: e */
    private final int f105694e;

    /* renamed from: f */
    private final int f105695f;

    /* renamed from: g */
    private final int f105696g;

    /* renamed from: h */
    private final int f105697h;

    /* renamed from: i */
    private final IMessageLocationDependency.AbstractC41604c f105698i = C41597c.m165069a().mo143913f();

    /* renamed from: a */
    private void m165105a(LocationMessageViewHolder locationMessageViewHolder) {
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo149725a(List<C34029b> list, OpenMenuDataHolder<LocationContentVO> cVar) {
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<LocationContentVO> cVar) {
        return true;
    }

    /* renamed from: b */
    private int m165107b() {
        return this.f105695f;
    }

    /* renamed from: d */
    private int m165111d() {
        return this.f105694e;
    }

    /* renamed from: e */
    private int m165112e() {
        return m165111d();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<LocationContentVO> mo120409a() {
        return LocationContentVO.class;
    }

    /* access modifiers changed from: package-private */
    public static class LocationMessageViewHolder {

        /* renamed from: a */
        public final View f105710a;
        @BindView(7099)
        public ImageView mImageView;
        @BindView(7107)
        public View mLoadingProgress;
        @BindView(7385)
        public LKUIRoundableLayout mRoundLayout;
        @BindView(7556)
        public TextView mSubTitleTv;
        @BindView(7643)
        public TextView mTitleTv;

        /* renamed from: a */
        private void m165126a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91857a(this.mTitleTv, LarkFont.HEADLINE);
                C25649b.m91857a(this.mSubTitleTv, LarkFont.CAPTION0);
            }
        }

        public LocationMessageViewHolder(View view) {
            this.f105710a = view;
            ButterKnife.bind(this, view);
            m165126a();
        }
    }

    public class LocationMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private LocationMessageViewHolder f105711a;

        @Override // butterknife.Unbinder
        public void unbind() {
            LocationMessageViewHolder locationMessageViewHolder = this.f105711a;
            if (locationMessageViewHolder != null) {
                this.f105711a = null;
                locationMessageViewHolder.mRoundLayout = null;
                locationMessageViewHolder.mTitleTv = null;
                locationMessageViewHolder.mSubTitleTv = null;
                locationMessageViewHolder.mImageView = null;
                locationMessageViewHolder.mLoadingProgress = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public LocationMessageViewHolder_ViewBinding(LocationMessageViewHolder locationMessageViewHolder, View view) {
            this.f105711a = locationMessageViewHolder;
            locationMessageViewHolder.mRoundLayout = (LKUIRoundableLayout) Utils.findRequiredViewAsType(view, R.id.round_container, "field 'mRoundLayout'", LKUIRoundableLayout.class);
            locationMessageViewHolder.mTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.title_tv, "field 'mTitleTv'", TextView.class);
            locationMessageViewHolder.mSubTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.sub_title_tv, "field 'mSubTitleTv'", TextView.class);
            locationMessageViewHolder.mImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.location_iv, "field 'mImageView'", ImageView.class);
            locationMessageViewHolder.mLoadingProgress = Utils.findRequiredView(view, R.id.location_message_image_loading, "field 'mLoadingProgress'");
        }
    }

    /* renamed from: c */
    private int m165109c() {
        if (DesktopUtil.m144301a((Context) this.f105692a.mo122543g())) {
            return UIHelper.dp2px(280.0f);
        }
        return m165107b();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<LocationContentVO> cVar) {
        return C34034b.m131983a(f105690c, 0, 0, f105691d, false, 2);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<LocationContentVO> cVar) {
        int y = C32807a.m125901y(cVar.mo121695c());
        int y2 = C32807a.m125901y(cVar.mo121695c());
        Drawable x = C32807a.m125900x(cVar.mo121695c());
        int i = f105690c;
        return C34035c.m131992a(y, y2, x, new int[]{i, f105691d, i, 0});
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.location_content_item, viewGroup, false);
    }

    /* renamed from: b */
    private void m165108b(LocationMessageViewHolder locationMessageViewHolder, OpenMessageVO<LocationContentVO> cVar) {
        int i;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) locationMessageViewHolder.mTitleTv.getLayoutParams();
        if (TextUtils.isEmpty(cVar.mo121701i())) {
            i = UIUtils.dp2px(this.f105692a.mo122543g(), 10.0f);
        } else {
            i = 0;
        }
        int i2 = f105690c;
        layoutParams.setMargins(i2, i, i2, 0);
    }

    /* renamed from: c */
    private boolean m165110c(LocationMessageViewHolder locationMessageViewHolder, OpenMessageVO<LocationContentVO> cVar) {
        if (!cVar.mo121696d().equals(locationMessageViewHolder.mImageView.getTag(R.id.chat_window_image_cid)) || locationMessageViewHolder.mImageView.getDrawable() == null) {
            return false;
        }
        return true;
    }

    public LocationMessageCell(IMessageContext aVar, IOpenCellCallback<LocationContentVO> bVar) {
        int i;
        int i2;
        this.f105692a = aVar;
        this.f105693b = bVar;
        int windowWidth = UIHelper.getWindowWidth(aVar.mo122543g());
        this.f105694e = UIUtils.dp2px(aVar.mo122543g(), 50.0f);
        if (DesktopUtil.m144301a((Context) aVar.mo122543g())) {
            i = UIUtils.dp2px(aVar.mo122543g(), 280.0f);
        } else {
            i = (int) (((double) windowWidth) * 0.52d);
        }
        this.f105695f = i;
        if (DesktopUtil.m144301a((Context) aVar.mo122543g())) {
            i2 = UIUtils.dp2px(aVar.mo122543g(), 120.0f);
        } else {
            i2 = (int) (((double) windowWidth) * 0.2d);
        }
        this.f105696g = i2;
        this.f105697h = i2;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<LocationContentVO> cVar, View view) {
        int i = 0;
        if (!TextUtils.isEmpty(cVar.mo121701i())) {
            int[] iArr = new int[4];
            iArr[0] = 0;
            iArr[1] = f105691d;
            iArr[2] = 0;
            if (cVar.ah()) {
                i = f105690c;
            }
            iArr[3] = i;
            return BubbleStyle.m131964a(12, (View) null, iArr);
        } else if (cVar.mo121698f() || !cVar.ah()) {
            return BubbleStyle.m131963a(12, (View) null, 0);
        } else {
            return BubbleStyle.m131964a(12, (View) null, new int[]{0, 0, 0, 0});
        }
    }

    /* renamed from: a */
    private void m165106a(final LocationMessageViewHolder locationMessageViewHolder, final OpenMessageVO<LocationContentVO> cVar) {
        String str;
        final String str2;
        final String str3;
        String str4;
        int i;
        int i2;
        Drawable drawable;
        Drawable drawable2;
        int i3;
        Scene scene;
        DiskCacheStrategy diskCacheStrategy;
        final LocationContent locationContent = (LocationContent) cVar.mo121699g().mo126168z();
        if (locationContent != null) {
            final FragmentActivity g = this.f105692a.mo122543g();
            if (TextUtils.isEmpty(locationContent.getName())) {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", "");
            } else {
                str = locationContent.getName();
            }
            String description = locationContent.getDescription();
            locationMessageViewHolder.mTitleTv.setText(str);
            if (TextUtils.isEmpty(description)) {
                locationMessageViewHolder.mSubTitleTv.setVisibility(8);
            } else {
                locationMessageViewHolder.mSubTitleTv.setVisibility(0);
                locationMessageViewHolder.mSubTitleTv.setText(description);
            }
            Image a = C41593d.m165057a(locationContent.getImage());
            if (a != null) {
                if (CollectionUtils.isNotEmpty(a.getUrls())) {
                    str4 = a.getUrls().get(0);
                } else {
                    str4 = null;
                }
                Image origin = locationContent.getImage().getOrigin();
                int width = origin.getWidth();
                int height = origin.getHeight();
                if (m165111d() > m165107b()) {
                    i = this.f105696g;
                } else {
                    i = m165111d();
                }
                if (m165112e() > m165109c()) {
                    i2 = this.f105697h;
                } else {
                    i2 = m165112e();
                }
                int[] a2 = ImageUtils.m224135a(width, height, m165107b(), m165109c(), i, i2);
                int i4 = a2[0];
                int i5 = a2[1];
                if (DesktopUtil.m144301a((Context) g)) {
                    locationMessageViewHolder.f105710a.getLayoutParams().width = i4;
                }
                boolean c = m165110c(locationMessageViewHolder, cVar);
                if (c) {
                    drawable = locationMessageViewHolder.mImageView.getDrawable();
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    drawable2 = drawable;
                } else {
                    drawable2 = new ColorDrawable(ContextCompat.getColor(this.f105692a.mo122543g(), R.color.bg_body_overlay));
                }
                if (drawable == null) {
                    drawable = new ColorDrawable(ContextCompat.getColor(this.f105692a.mo122543g(), R.color.bg_filler));
                }
                View view = locationMessageViewHolder.mLoadingProgress;
                if (!c) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                view.setVisibility(i3);
                boolean j = this.f105692a.mo122546j();
                if (j) {
                    scene = Scene.SecretChat;
                } else if (this.f105692a.mo122558v() || this.f105692a.mo122560x()) {
                    scene = Scene.Thread;
                } else {
                    scene = Scene.Chat;
                }
                IMessageLocationDependency.AbstractC41604c cVar2 = this.f105698i;
                str3 = description;
                ImageView imageView = locationMessageViewHolder.mImageView;
                str2 = str;
                LoadParams b = new LoadParams().mo105413a(i4).mo105422b(i5).mo105419a(str4).mo105414a(drawable2).mo105423b(drawable);
                if (j) {
                    diskCacheStrategy = DiskCacheStrategy.NONE;
                } else {
                    diskCacheStrategy = DiskCacheStrategy.ALL;
                }
                cVar2.mo143922a(g, imageView, a, b.mo105417a(diskCacheStrategy).mo105429d(j).mo105416a(new ListenerParams.Builder().mo105405b(true).mo105401a(true).mo105399a(new ListenerParams.RequestListener() {
                    /* class com.ss.android.lark.locationmessage.message.LocationMessageCell.C416061 */

                    @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
                    /* renamed from: a */
                    public void mo105410a(Exception exc) {
                        locationMessageViewHolder.mLoadingProgress.setVisibility(8);
                    }

                    @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
                    /* renamed from: a */
                    public void mo105411a(Object obj, Object obj2, Object obj3, DataSource dataSource, boolean z) {
                        locationMessageViewHolder.mLoadingProgress.setVisibility(8);
                    }
                }).mo105404b(a.getKey()).mo105406c(TextUtils.equals(a.getKey(), origin.getKey())).mo105397a(scene).mo105402a()));
                locationMessageViewHolder.mImageView.setTag(R.id.chat_window_image_cid, cVar.mo121696d());
            } else {
                str2 = str;
                str3 = description;
                C41593d.m165058a(g, locationMessageViewHolder.mImageView);
            }
            if (!TextUtils.isEmpty(cVar.mo121701i()) || (cVar.ah() && !this.f105692a.mo122559w())) {
                locationMessageViewHolder.mRoundLayout.setRadius(BitmapDescriptorFactory.HUE_RED);
                locationMessageViewHolder.mRoundLayout.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
                locationMessageViewHolder.mRoundLayout.setBackground(null);
            } else {
                float[] a3 = MessageCellUtils.m133195a(cVar);
                locationMessageViewHolder.mRoundLayout.mo89662a(a3[0], a3[1], a3[2], a3[3]);
                locationMessageViewHolder.mRoundLayout.setBorderWidth(1.0f);
                locationMessageViewHolder.mRoundLayout.setBorderColor(UIUtils.getColor(this.f105692a.mo122543g(), R.color.imtoken_message_card_border));
                locationMessageViewHolder.mRoundLayout.setBackgroundColor(UIUtils.getColor(this.f105692a.mo122543g(), R.color.bg_float));
            }
            locationMessageViewHolder.f105710a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.locationmessage.message.LocationMessageCell.View$OnClickListenerC416072 */

                public void onClick(View view) {
                    if (!TextUtils.equals(cVar.mo121681a(), cVar.mo121696d())) {
                        String latitude = locationContent.getLatitude();
                        String longitude = locationContent.getLongitude();
                        C41589b.m165051a(g, new LocationInfo.C29595a(latitude, longitude).mo106512a(((LocationContentVO) cVar.mo121699g()).mo149732a()).mo106513a(str2).mo106516b(str3).mo106511a(locationContent.getZoomLevel()).mo106514a(LocationMessageCell.this.f105692a.mo122546j()).mo106517b(locationContent.isInternal()).mo106518c(true).mo106515a());
                    }
                }
            });
            locationMessageViewHolder.f105710a.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.locationmessage.message.LocationMessageCell.View$OnLongClickListenerC416083 */

                public boolean onLongClick(View view) {
                    if (LocationMessageCell.this.f105693b == null) {
                        return false;
                    }
                    return LocationMessageCell.this.f105693b.mo122833b(locationMessageViewHolder.f105710a, cVar);
                }
            });
            m165108b(locationMessageViewHolder, cVar);
            if (!DesktopUtil.m144307b()) {
                m165105a(locationMessageViewHolder);
            }
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo149725a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<LocationContentVO> cVar) {
        LocationMessageViewHolder locationMessageViewHolder = (LocationMessageViewHolder) view.getTag();
        if (locationMessageViewHolder == null) {
            locationMessageViewHolder = new LocationMessageViewHolder(view);
            view.setTag(locationMessageViewHolder);
        }
        m165106a(locationMessageViewHolder, cVar);
    }
}
