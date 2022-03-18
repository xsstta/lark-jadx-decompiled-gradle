package com.ss.android.lark.chat.chatwindow.chat.message;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class AudioDraftMessageCell extends AbstractC33290a<AudioContentVO, AudioMessageViewHolder> {
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.audio_draft_content_item_new;
    }

    static class AudioMessageViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public AnimationDrawable f85591a;
        @BindView(8521)
        public ImageView mRecordIV;

        AudioMessageViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.f85591a = (AnimationDrawable) this.mRecordIV.getDrawable();
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.AudioDraftMessageCell.AudioMessageViewHolder.View$OnAttachStateChangeListenerC332571 */

                public void onViewAttachedToWindow(View view) {
                    AudioMessageViewHolder.this.f85591a.start();
                }

                public void onViewDetachedFromWindow(View view) {
                    AudioMessageViewHolder.this.f85591a.stop();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return AudioContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<AudioMessageViewHolder> mo122650b() {
        return AudioMessageViewHolder.class;
    }

    public class AudioMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private AudioMessageViewHolder f85593a;

        @Override // butterknife.Unbinder
        public void unbind() {
            AudioMessageViewHolder audioMessageViewHolder = this.f85593a;
            if (audioMessageViewHolder != null) {
                this.f85593a = null;
                audioMessageViewHolder.mRecordIV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public AudioMessageViewHolder_ViewBinding(AudioMessageViewHolder audioMessageViewHolder, View view) {
            this.f85593a = audioMessageViewHolder;
            audioMessageViewHolder.mRecordIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.recording_label, "field 'mRecordIV'", ImageView.class);
        }
    }

    public AudioDraftMessageCell(AbstractC33342d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(AudioMessageViewHolder audioMessageViewHolder, AbsMessageVO<AudioContentVO> aVar) {
        super.mo122648a((AbstractC59010e) audioMessageViewHolder, (AbsMessageVO) aVar);
    }
}
