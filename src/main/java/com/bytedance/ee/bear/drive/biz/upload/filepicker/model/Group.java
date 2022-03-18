package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

public class Group extends AID {
    private static final long serialVersionUID = -6087834824505714560L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.AID
    public String toString() {
        return "Group [" + super.toString() + "]";
    }

    public Group(int i, String str) {
        super(i, str);
    }
}
