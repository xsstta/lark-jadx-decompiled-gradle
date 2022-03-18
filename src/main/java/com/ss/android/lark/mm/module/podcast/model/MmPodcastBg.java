package com.ss.android.lark.mm.module.podcast.model;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class MmPodcastBg implements Serializable {
    private List<String> podcast_bg_imgs;

    public List<String> getPodcast_bg_imgs() {
        return this.podcast_bg_imgs;
    }

    public String randomGetNext() {
        return this.podcast_bg_imgs.get(new Random().nextInt(this.podcast_bg_imgs.size()));
    }

    public void setPodcast_bg_imgs(List<String> list) {
        this.podcast_bg_imgs = list;
    }
}
