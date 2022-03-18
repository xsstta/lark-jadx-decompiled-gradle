package com.ss.android.lark.chatwindow.view.viewholder;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

public class AudioMessageContentNewHolder extends RecyclerView.ViewHolder {
    @BindView(7232)
    public View mAudioView;
    @BindView(7634)
    public TextView mEditedTv;
    @BindView(8418)
    public PlayControlBar mPlayControlBar;
    @BindView(8506)
    public TextView mRecognizedFlag;
    @BindView(8507)
    public TextView mRecognizedTv;
    @BindView(8963)
    public ViewStub mTranslateStub;
    @BindView(9214)
    public ImageView mUnreadTipsIv;
}
