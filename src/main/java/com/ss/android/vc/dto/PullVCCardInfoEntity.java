package com.ss.android.vc.dto;

import java.io.Serializable;

public class PullVCCardInfoEntity implements Serializable {
    public VideoChatContent content;
    public boolean isMore;
    public String nextRequestToken;
}
