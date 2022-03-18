package com.ss.android.lark.album.image;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.utils.UIHelper;

public class ChatImageGroup extends ConstraintLayout {

    /* renamed from: a */
    public AbstractC28665a f72120a;

    /* renamed from: b */
    private int f72121b;

    /* renamed from: c */
    private ChatImageViewData f72122c;
    @BindView(7419)
    AppCompatCheckBox mCheckBox;
    @BindView(7839)
    ImageView mContentIV;
    @BindView(8133)
    View mMarkView;
    @BindView(9266)
    TextView mVideoDuration;

    /* renamed from: com.ss.android.lark.album.image.ChatImageGroup$a */
    public interface AbstractC28665a {
        /* renamed from: a */
        void mo101964a(View view, ImageSet imageSet);

        /* renamed from: a */
        void mo101965a(ChatImageViewData chatImageViewData);

        /* renamed from: b */
        boolean mo101966b(ChatImageViewData chatImageViewData);

        /* renamed from: c */
        boolean mo101967c(ChatImageViewData chatImageViewData);
    }

    public ImageView getContentIV() {
        return this.mContentIV;
    }

    /* renamed from: a */
    private void m105089a() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.layout_chat_image, this));
    }

    public void setOperationCallback(AbstractC28665a aVar) {
        this.f72120a = aVar;
    }

    public ChatImageGroup(Context context) {
        super(context);
        m105089a();
    }

    /* renamed from: c */
    private void m105093c(final ChatImageViewData chatImageViewData) {
        this.mContentIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.album.image.ChatImageGroup.View$OnClickListenerC286642 */

            public void onClick(View view) {
                if (ChatImageGroup.this.f72120a != null) {
                    ChatImageGroup.this.f72120a.mo101964a(view, chatImageViewData.getImageSet());
                }
            }
        });
    }

    /* renamed from: a */
    private void m105090a(ImageSet imageSet) {
        if (imageSet instanceof MediaImageSet) {
            this.mVideoDuration.setVisibility(0);
            this.mVideoDuration.setText(C26279i.m95149a((int) ((MediaImageSet) imageSet).getMediaExtra().getDuration()));
            return;
        }
        this.mVideoDuration.setVisibility(8);
    }

    /* renamed from: b */
    private void m105091b(final ChatImageViewData chatImageViewData) {
        if (chatImageViewData.isSelectStatus()) {
            this.mCheckBox.setVisibility(0);
            this.mCheckBox.setChecked(this.f72120a.mo101966b(chatImageViewData));
            this.mCheckBox.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.album.image.ChatImageGroup.View$OnClickListenerC286631 */

                public void onClick(View view) {
                    ChatImageGroup.this.f72120a.mo101965a(chatImageViewData);
                }
            });
            if (chatImageViewData.isFromPostMessage() || !this.f72120a.mo101967c(chatImageViewData)) {
                this.mMarkView.setVisibility(0);
            } else {
                this.mMarkView.setVisibility(8);
            }
        } else {
            this.mCheckBox.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo101969a(ChatImageViewData chatImageViewData) {
        if (DesktopUtil.m144301a(getContext())) {
            this.f72121b = 68;
        } else {
            this.f72121b = 90;
        }
        this.f72122c = chatImageViewData;
        m105092b(chatImageViewData.getImageSet());
        m105090a(chatImageViewData.getImageSet());
        m105093c(chatImageViewData);
        m105091b(chatImageViewData);
    }

    /* renamed from: b */
    private void m105092b(ImageSet imageSet) {
        Image thumbnail = imageSet.getThumbnail();
        if (thumbnail == null) {
            ImageLoader.with(getContext()).load(Integer.valueOf((int) R.drawable.common_failed_chat_picture)).into(this.mContentIV);
        } else if (!thumbnail.getKey().contains("http") || !CollectionUtils.isNotEmpty(thumbnail.getUrls())) {
            C29990c.m110930b().mo134597y().mo134735a(getContext(), this.mContentIV, thumbnail, UIHelper.getDrawable(R.drawable.common_chat_window_image_item_holder), UIHelper.getDrawable(R.drawable.common_failed_chat_picture), UIHelper.dp2px((float) this.f72121b), UIHelper.dp2px((float) this.f72121b), true, ImageView.ScaleType.CENTER_CROP, true, true, ListenerParams.FromType.CHAT_ALBUM);
        } else {
            ImageLoader.with(getContext()).load(thumbnail.getUrls().get(0)).override(UIHelper.dp2px((float) this.f72121b), UIHelper.dp2px((float) this.f72121b)).placeholder(R.drawable.common_chat_window_image_item_holder).error(R.drawable.common_failed_chat_picture).centerCrop().into(this.mContentIV);
        }
    }

    public ChatImageGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m105089a();
    }

    public ChatImageGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m105089a();
    }
}
