package com.ss.android.lark.locationmessage.message;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.locationmessage.C41589b;
import com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency;
import com.ss.android.lark.locationmessage.p2149b.C41593d;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;

public class LocationMessageHolderView extends AbstractC58992f<MessageInfo, LocationViewHolder> {

    /* renamed from: a */
    private final boolean f105712a;

    /* renamed from: b */
    private int f105713b;

    /* renamed from: c */
    private int f105714c;

    /* renamed from: h */
    private int f105715h;

    /* renamed from: i */
    private int f105716i;

    /* renamed from: j */
    private boolean f105717j;

    /* renamed from: k */
    private IMessageLocationDependency.AbstractC41604c f105718k;

    /* renamed from: a */
    private int m165127a() {
        return this.f105714c;
    }

    /* renamed from: c */
    private int m165132c() {
        return this.f105713b;
    }

    /* renamed from: b */
    private int m165131b() {
        return m165127a();
    }

    /* renamed from: d */
    private int m165133d() {
        return m165132c();
    }

    public class LocationViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private LocationViewHolder f105721a;

        @Override // butterknife.Unbinder
        public void unbind() {
            LocationViewHolder locationViewHolder = this.f105721a;
            if (locationViewHolder != null) {
                this.f105721a = null;
                locationViewHolder.mRoundLayout = null;
                locationViewHolder.mTitleTv = null;
                locationViewHolder.mSubTitleTv = null;
                locationViewHolder.mImageView = null;
                locationViewHolder.mLoadingProgress = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public LocationViewHolder_ViewBinding(LocationViewHolder locationViewHolder, View view) {
            this.f105721a = locationViewHolder;
            locationViewHolder.mRoundLayout = (LKUIRoundableLayout) Utils.findRequiredViewAsType(view, R.id.round_container, "field 'mRoundLayout'", LKUIRoundableLayout.class);
            locationViewHolder.mTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.title_tv, "field 'mTitleTv'", TextView.class);
            locationViewHolder.mSubTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.sub_title_tv, "field 'mSubTitleTv'", TextView.class);
            locationViewHolder.mImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.location_iv, "field 'mImageView'", ImageView.class);
            locationViewHolder.mLoadingProgress = Utils.findRequiredView(view, R.id.location_message_image_loading, "field 'mLoadingProgress'");
        }
    }

    public static class LocationViewHolder extends RecyclerView.ViewHolder {
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

        public LocationViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        /* renamed from: a */
        public static LocationViewHolder m165141a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new LocationViewHolder(layoutInflater.inflate(R.layout.location_content_item, viewGroup, false));
        }
    }

    /* renamed from: a */
    private void m165129a(LocationViewHolder locationViewHolder) {
        C25649b.m91857a(locationViewHolder.mTitleTv, LarkFont.HEADLINE);
        C25649b.m91857a(locationViewHolder.mSubTitleTv, LarkFont.CAPTION0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LocationViewHolder mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return LocationViewHolder.m165141a(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public boolean mo149731a(LocationViewHolder locationViewHolder, Message message) {
        if (!message.getcId().equals(locationViewHolder.mImageView.getTag(R.id.chat_window_image_cid)) || locationViewHolder.mImageView.getDrawable() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m165130a(int i, MessageInfo messageInfo, View view) {
        return mo200116a(view, i, messageInfo);
    }

    /* renamed from: a */
    public void mo31174a(final LocationViewHolder locationViewHolder, int i, MessageInfo messageInfo) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        Drawable drawable;
        int i4;
        DiskCacheStrategy diskCacheStrategy;
        Scene scene;
        Message message = messageInfo.getMessage();
        LocationContent locationContent = (LocationContent) message.getContent();
        if (locationContent != null) {
            if (TextUtils.isEmpty(locationContent.getName())) {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", "");
            } else {
                str = locationContent.getName();
            }
            String description = locationContent.getDescription();
            locationViewHolder.mTitleTv.setText(str);
            if (TextUtils.isEmpty(description)) {
                locationViewHolder.mSubTitleTv.setVisibility(8);
            } else {
                locationViewHolder.mSubTitleTv.setVisibility(0);
                locationViewHolder.mSubTitleTv.setText(description);
            }
            Image a = C41593d.m165057a(locationContent.getImage());
            if (a != null) {
                Drawable drawable2 = null;
                if (CollectionUtils.isNotEmpty(a.getUrls())) {
                    str3 = a.getUrls().get(0);
                } else {
                    str3 = null;
                }
                Image origin = locationContent.getImage().getOrigin();
                int width = origin.getWidth();
                int height = origin.getHeight();
                if (m165132c() > m165127a()) {
                    i2 = this.f105715h;
                } else {
                    i2 = m165132c();
                }
                if (m165133d() > m165131b()) {
                    i3 = this.f105716i;
                } else {
                    i3 = m165133d();
                }
                int[] a2 = ImageUtils.m224135a(width, height, m165127a(), m165131b(), i2, i3);
                int i5 = a2[0];
                int i6 = a2[1];
                boolean a3 = mo149731a(locationViewHolder, message);
                if (a3) {
                    drawable2 = locationViewHolder.mImageView.getDrawable();
                }
                if (drawable2 != null) {
                    drawable = drawable2;
                } else {
                    drawable = new ColorDrawable(ContextCompat.getColor(this.f146181d, R.color.bg_body_overlay));
                }
                if (drawable2 == null) {
                    drawable2 = new ColorDrawable(ContextCompat.getColor(this.f146181d, R.color.bg_filler));
                }
                View view = locationViewHolder.mLoadingProgress;
                if (!a3) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                view.setVisibility(i4);
                IMessageLocationDependency.AbstractC41604c cVar = this.f105718k;
                Context context = this.f146181d;
                ImageView imageView = locationViewHolder.mImageView;
                str2 = description;
                LoadParams b = new LoadParams().mo105413a(i5).mo105422b(i6).mo105419a(str3).mo105414a(drawable).mo105423b(drawable2);
                if (this.f105717j) {
                    diskCacheStrategy = DiskCacheStrategy.NONE;
                } else {
                    diskCacheStrategy = DiskCacheStrategy.ALL;
                }
                LoadParams d = b.mo105417a(diskCacheStrategy).mo105429d(this.f105717j);
                ListenerParams.Builder c = new ListenerParams.Builder().mo105405b(true).mo105401a(true).mo105399a(new ListenerParams.RequestListener() {
                    /* class com.ss.android.lark.locationmessage.message.LocationMessageHolderView.C416091 */

                    @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
                    /* renamed from: a */
                    public void mo105410a(Exception exc) {
                        locationViewHolder.mLoadingProgress.setVisibility(8);
                    }

                    @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
                    /* renamed from: a */
                    public void mo105411a(Object obj, Object obj2, Object obj3, DataSource dataSource, boolean z) {
                        locationViewHolder.mLoadingProgress.setVisibility(8);
                    }
                }).mo105404b(a.getKey()).mo105406c(TextUtils.equals(a.getKey(), origin.getKey()));
                if (this.f105717j) {
                    scene = Scene.SecretChat;
                } else {
                    scene = Scene.Chat;
                }
                cVar.mo143922a(context, imageView, a, d.mo105416a(c.mo105397a(scene).mo105402a()));
                locationViewHolder.mImageView.setTag(R.id.chat_window_image_cid, message.getcId());
            } else {
                str2 = description;
                C41593d.m165058a(this.f146181d, locationViewHolder.mImageView);
            }
            if (this.f105712a) {
                locationViewHolder.mRoundLayout.getLayoutParams().width = -2;
            }
            if (this.f105712a || (TextUtils.isEmpty(message.getRootId()) && !messageInfo.hasReaction())) {
                locationViewHolder.mRoundLayout.setRadius(10.0f);
                locationViewHolder.mRoundLayout.setBorderWidth(1.0f);
            } else {
                locationViewHolder.mRoundLayout.setRadius(BitmapDescriptorFactory.HUE_RED);
                locationViewHolder.mRoundLayout.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
            }
            locationViewHolder.itemView.setOnClickListener(new View.OnClickListener(locationContent, message, str, str2) {
                /* class com.ss.android.lark.locationmessage.message.$$Lambda$LocationMessageHolderView$F9gic0EgYPxw_xtU21jnGaglbd4 */
                public final /* synthetic */ LocationContent f$1;
                public final /* synthetic */ Message f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ String f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void onClick(View view) {
                    LocationMessageHolderView.lambda$F9gic0EgYPxw_xtU21jnGaglbd4(LocationMessageHolderView.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
                }
            });
            locationViewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener(i, messageInfo) {
                /* class com.ss.android.lark.locationmessage.message.$$Lambda$LocationMessageHolderView$GG4TaNOVCRBgqcMEJ15fwjXi0k */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ MessageInfo f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return LocationMessageHolderView.m270716lambda$GG4TaNOVCRBgqcMEJ15fwjXi0k(LocationMessageHolderView.this, this.f$1, this.f$2, view);
                }
            });
            if (!DesktopUtil.m144307b()) {
                m165129a(locationViewHolder);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m165128a(LocationContent locationContent, Message message, String str, String str2, View view) {
        String latitude = locationContent.getLatitude();
        String longitude = locationContent.getLongitude();
        C41589b.m165051a(this.f146181d, new LocationInfo.C29595a(latitude, longitude).mo106512a(message).mo106513a(str).mo106516b(str2).mo106511a(locationContent.getZoomLevel()).mo106514a(this.f105717j).mo106517b(locationContent.isInternal()).mo106518c(true).mo106515a());
    }
}
