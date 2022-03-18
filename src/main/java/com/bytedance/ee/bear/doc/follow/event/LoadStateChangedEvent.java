package com.bytedance.ee.bear.doc.follow.event;

public class LoadStateChangedEvent implements ContentEvent {
    public final LoadState loadState;

    public enum LoadState {
        Loading,
        LoadSuccess,
        LoadFail,
        LoadFailAndReplaceDocFragment,
        LoadWikiToReplaceDoc
    }

    public LoadState getLoadState() {
        return this.loadState;
    }

    public String toString() {
        return "LoadStateChangedEvent{loadState=" + this.loadState + '}';
    }

    public LoadStateChangedEvent(LoadState loadState2) {
        this.loadState = loadState2;
    }
}
