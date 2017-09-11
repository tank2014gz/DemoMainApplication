package com.example.yuliyan.demomainapplication.model;

/**
 * Created by yuliyan on 2017/9/11.
 */

public class ConfigFile {
    private String apkFile;
    private int mainApkNumber;//主apk版本号
    private boolean isUpdate;
    private long updateTime;//定时发布时间

    public String getApkFile() {
        return apkFile;
    }

    public void setApkFile(String apkFile) {
        this.apkFile = apkFile;
    }

    public int getMainApkNumber() {
        return mainApkNumber;
    }

    public void setMainApkNumber(int mainApkNumber) {
        this.mainApkNumber = mainApkNumber;
    }

    public boolean isUpdate() {
        return isUpdate;
    }

    public void setUpdate(boolean update) {
        isUpdate = update;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
