package com.larksuite.component.blockit.entity;

public enum TagScene {
    Default(0),
    Teamwork(1),
    TeamKnowledge(2),
    PrivateCollection(3),
    PublicTopic(4);
    
    int value;

    public int value() {
        return this.value;
    }

    private TagScene(int i) {
        this.value = i;
    }
}
